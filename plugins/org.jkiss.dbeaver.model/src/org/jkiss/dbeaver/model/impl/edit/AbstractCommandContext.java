        }
        addCommand(command, reflector, false);

                public DBECommand<DBPObject> next()
                }

            }

            return command.toString() + " [executed=" + executed + ";merged by: " + mergedBy + "]";
                }

                                    cmd.persistActions.add(new PersistInfo(action));
    @Override
                                if (txnManager != null && txnManager.isSupportsTransactions() && !txnManager.isAutoCommit()) {
            return null;
        private List<DBECommandQueue> subQueues;

                CommandInfo lastCommand = queue.commands.get(i);

        boolean oldAutoCommit = false;
                                    if (monitor.isCanceled()) {
    public static class CommandInfo {
            return listeners.toArray(new DBECommandListener[0]);
                    if (!cmdCopy.contains(cmdInfo.command)) {
        }
        }
    private void executeCommands(DBRProgressMonitor monitor, Map<String, Object> options, DBCTransactionManager txnManager) throws DBException {
                            //final CommandInfo thisCommand = queue.commands.get(i);
        @NotNull DBECommand<?> command,
        final DBECommand<?> command;
    public DBECommand<?> getRedoCommand() {
        CommandInfo mergedBy = null;
    @Override

            for (CommandQueue queue : getCommandQueues()) {
                    }
        }
    @Nullable
                    while (cmd.mergedBy != null) {
        try {
        try {
        List<DBPObject> result = new ArrayList<>(queues.size());
                    if (!mergedCommands.contains(mergedBy)) {
            this.command = command;
            while (lastCommand != null) {

        if (!executionContext.isConnected()) {
                } else if (firstCommand != null && result == firstCommand.command) {
                    while (!commands.isEmpty()) {
            final Map<DBECommand, CommandInfo> mergedByMap = new IdentityHashMap<>();
            clearCommandQueues();
                while (cmd.linkedCommand != null) {
 */
            userParams.clear();
                                        continue;
            if (queue == null) {
                result.add(cmd.command);
    @Override
                    cmd.command.validateCommand(monitor, validateOptions);
            }
    }
            }
                }
        }
                clearUndidCommands();
        finally {
                    return index < commands.size() - 1;

            throw new IllegalStateException("Can't undo command");
                                for (DBEPersistAction action : persistActions) {
            throw e;

                (commandInfo == null || undidCommands.getLast().linkedCommand == commandInfo))
            if (!undidCommands.isEmpty()) {
            }
                        executedCommands.add(cmd);
            return null;
        // Undo UI changes (always because undo doesn't make sense in atomic contexts)
    }
                        // Try to find in command stack
        if (commandQueues != null) {
    }
                                        break;
                        }
                }
                        mergedCommands.add(mergedBy);
        // Aggregate commands
import org.jkiss.dbeaver.model.exec.*;

        boolean executed = false;
            // There were no exceptions during save so we assume that everything went well
        void addSubQueue(@NotNull CommandQueue queue) {
        return executionContext;
                    if (!executedCommands.contains(cmd)) {
        boolean useAutoCommit;
            }
    private void fireCommandChange(@NotNull DBECommand<?> command) {
 *
        {
            return object;

            // If everything went well then there should be nothing to do else.
    }
        }
            this.reflector = reflector;
        for (DBECommandListener listener : getListeners()) {
*/
        synchronized (commands) {
    @Override
        {
            listeners.add(listener);
                if (cmd.command == command) {
        for (CommandQueue queue : commandQueues) {
        fireCommandChange(command);
        synchronized (commands) {
        {
    }
                        }
                }
            // Just redo UI changes and put command on the top of stack

     * Creates new context
            if (!lastCommand.command.isUndoable()) {
                    throw new IllegalStateException("Can't find object manager for '" + object.getClass().getName() + "'");
                for (CommandInfo cmd : commands) {
                    }
        synchronized (commands) {
    }
            while (!undidCommands.isEmpty() &&
            } catch (Exception e) {

        undidCommands.clear();
                                            if (disableSessionLogging) {
        }
                    } catch (DBCException e) {
        CommandInfo(DBECommand<?> command, DBECommandReflector<?, DBECommand<?>> reflector) {
                cmd.reflector.redoCommand(cmd.command);
                        cmdInfo = cmdInfo.mergedBy;
                                }
            throw new IllegalStateException("Can't redo command");
    private final List<DBECommandListener> listeners = new ArrayList<>();
            if (!found) {
        }
        CommandInfo linkedCommand = null;
        }
            for (CommandQueue queue : commandQueues) {
            int headIndex = 0;
                log.warn("Error updating model", e);
        }
            }
                for (CommandInfo cmdInfo : queue.commands) {
                    }
        Throwable error;
                    txnManager.rollback(session, null);

            };
                }
        }
                return cmd.command;
            CommandQueue queue = null;

                        if (result == null) {
                    cmd = cmd.linkedCommand;
            // Clear commands. We can't undo after save
                throw new IllegalStateException("Last executed command is not undoable");
                                    try {
                            skipCommand = true;
                        // Just report an error
                    CommandInfo cmd = queue.commands.get(i);
        refreshCommandState();
        public boolean add(@NotNull DBECommand dbeCommand)

    private final List<CommandInfo> commands = new ArrayList<>();
                                                session.enableLogging(false);
                commandInfo = undidCommands.removeLast();

        for (CommandQueue queue : queues) {
                clearUndidCommands();
        synchronized (listeners) {
                        // Persist changes

                mergedCommands.add(lastCommand);
 * distributed under the License is distributed on an "AS IS" BASIS,

    private void clearUndidCommands()
    public void updateCommand(@NotNull DBECommand<?> command, @Nullable DBECommandReflector commandReflector) {
        public Collection<DBECommandQueue> getSubQueues()
            }

                clearCommandQueues();
                            // Remove first and skip last command
                                            if (disableSessionLogging) {
                    return (DBECommand<DBPObject>) commands.get(index).command;
        commandQueues = new ArrayList<>();
            }
            }
                DBEObjectManager<?> objectManager = DBWorkbench.getPlatform().getEditorsRegistry().getObjectManager(object.getClass());
                    }
    {
                    // Remove last command from queue
                                    }
                }
    {

        }
        @Override
        @Override
    }
                        } else if (result != lastCommand.command) {
            }
            List<DBECommand<?>> cmdCopy = new ArrayList<>(commands.size());
        final DBEPersistAction action;
                            commands.remove(cmd);
        }
    }
    }
        if (txnManager != null && txnManager.isSupportsTransactions()) {
                                            queue.objectManager.executePersistAction(session, cmd.command, persistInfo.action);
                {
            clearCommandQueues();
        throws DBException
 * DBECommandContextImpl
                        break;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

            this.object = object;
        List<CommandInfo> processedCommands = new ArrayList<>();
                                    /// and we cannot revert saved changes anyway
            }
    {
                    result = lastCommand.command.merge(null, userParams);
                DBECommand<?> result = lastCommand.command;
        List<PersistInfo> persistActions;
            monitor,
                // Make list of not-executed commands
                    if (cmd.command == linkedCommand) {
                                    if (actionType == DBEPersistAction.ActionType.COMMENT) {
            }
                        }
                    lastCommand.mergedBy = firstCommand;
    @Override
                        firstCommand = mergedCommands.get(k - 1);
                throw new DBException("Context [" + executionContext.getContextName() + "] isn't connected to the database");
        addCommand(command, reflector, execute, null);
            if (txnManager != null && txnManager.isSupportsTransactions()) {
        this.executionContext = executionContext;

    public void addCommand(
    @NotNull
                CommandInfo cmd = commands.get(commands.size() - 1);
                subQueues = new ArrayList<>();
            } finally {
        }
        if (getUndoCommand() == null) {
        List<CommandQueue> commandQueues = getCommandQueues();

    public Collection<? extends DBECommand<?>> getUndoCommands()
    @Nullable
                        break;
            if (commandInfo.command instanceof DBECommandAggregator && !commandInfo.command.ignoreNestedCommands()) {
            return new Iterator<DBECommand<DBPObject>>() {
                }
    }
import org.jkiss.code.NotNull;
    {
        }
            // (e.g. create + delete of the same entity produce 2 commands and zero actions).
        refreshCommandState();
                                    // Commit all processed changes for every command
            queue.commands = mergedCommands;
    private final Map<Object, Object> userParams = new HashMap<>();
                if (objectManager == null) {
    public void resetChanges(boolean undoCommands)
    @Override
                commands.remove(lastCommand);
        // Merge commands
            try {
                    while (cmdInfo.mergedBy != null) {
            final List<CommandInfo> mergedCommands = new ArrayList<>();

        return commandQueues;
                        // should remain - they constructs queue by merging with other commands
            clearCommandQueues();
        // Validate commands
            return parent;

                        cmdCopy.add(cmdInfo.command);
import org.jkiss.dbeaver.model.messages.ModelMessages;
                                    }

                addCommand(command, commandReflector);
                    queue.commands.add(headIndex++, cmd);

                    if (cmd.executed) {
                            }
    }
                    found = true;
        synchronized (commands) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        void addCommand(@NotNull CommandInfo info)
import org.jkiss.dbeaver.model.edit.*;
import org.jkiss.dbeaver.model.DBUtils;
                    boolean skipCommand = false;
                    try {
            CommandInfo newCommand = new CommandInfo(command, reflector);
        }
    public void redoCommand() {
        {
                            if (queue.commands.get(k).command == result) {
    DBECommandListener[] getListeners() {
    /**
            try {
        public String toString() {

                    }
            clearCommandQueues();
        @Override
    }
                    // May be it is some earlier command from queue or some new command (e.g. composite)
    }
            // But some commands may still remain in queue if they merged each other
            if (queue.objectManager instanceof DBECommandFilter) {
                for (CommandInfo cmd : queue.commands) {
            if (!commandQueues.isEmpty()) {
 * limitations under the License.
        // Redo UI changes (always because redo doesn't make sense in atomic contexts)
                while (cmd.linkedCommand != null) {
            getCommandQueues();

            for (CommandQueue queue : commandQueues) {

        }
                    if (!cmd.executed) {
            }
                    if (cmd.command != aggregator.command && cmd.mergedBy == null && ((DBECommandAggregator)aggregator.command).aggregateCommand(cmd.command)) {
        private final DBPObject object;
        for (CommandQueue queue : commandQueues) {
            this.objectManager = objectManager;
    }
        }
                        queue = tmpQueue;
    @Override
            }
        return executionContext.openSession(
            DBCExecutionPurpose.META_DDL,
                        if (!CommonUtils.isEmpty(cmd.persistActions)) {
    @Override
        @Nullable DBECommandReflector reflector)
        }
        }
                    lastCommand.mergedBy = mergedBy;
            if (txnManager != null && txnManager.isSupportsTransactions() && !txnManager.isAutoCommit()) {
            }
            return cmdCopy;
            if (subQueues == null) {
                    break;
                    // No changes

                    }
 * DBeaver - Universal Database Manager
        final List<CommandQueue> queues = getCommandQueues();
                    }
                clearCommandQueues();
    }
                                        persistInfo.error = e;
        }
                    queue.commands.remove(cmd);
import org.jkiss.dbeaver.Log;
import org.jkiss.code.Nullable;
                if (queue.getObject() instanceof DBPStatefulObject) {
                            mergedBy = new CommandInfo(result, null);
                private int index = -1;

        }
                                        persistInfo.executed = false;
        {
                        //if (CommonUtils.isEmpty(cmd.persistActions)) {
                                    if (persistInfo.executed && actionType == DBEPersistAction.ActionType.NORMAL) {
            }
                @Override
                public boolean hasNext()
            clearUndidCommands();
            if (oldAutoCommit != useAutoCommit) {
            result.add(queue.getObject());
                        synchronized (commands) {
        }
    public void undoCommand() {
            clearUndidCommands();
                                            error = e;

        if (aggregator != null) {
                    }
                                    txnManager.commit(session);
                                    throw error;

        }
            useAutoCommit = CommonUtils.getOption(validateOptions, OPTION_AVOID_TRANSACTIONS);
            }
        // Move rename commands in the head (#7512)
            txnManager = null;
        CommandInfo aggregator = null;
            // Let's clear commands
            subQueues.add(queue);

        }
                                        persistInfo.executed = true;
                    }
        for (CommandInfo commandInfo : commands) {

                } else {
        for (CommandQueue queue : commandQueues) {
                                if (error != null) {
            } else {
    }
/*
            {
                        undoCommand();
            List<DBECommand<?>> result = new ArrayList<>();
                    break;
            for (int i = commands.size() - 1; i >= 0; i--) {
    }
            this.parent = parent;
            for (DBECommandListener listener : getListeners()) {
                } else {
    public void removeCommand(@NotNull DBECommand<?> command) {
                }
        final DBECommandReflector<?, DBECommand<?>> reflector;

        }
        synchronized (commands) {
                                            boolean disableSessionLogging = session.isLoggingEnabled() && cmd.command.isDisableSessionLogging();
            commands.clear();
                while (cmd.linkedCommand != null) {
                }
    @Override
                    }
                }

            }
                    break;
import org.jkiss.dbeaver.model.DBPObject;
            }
        }
                CommandInfo firstCommand = null;
                    cmd = cmd.linkedCommand;
            clearCommandQueues();

                            try (DBCSession session = openCommandPersistContext(monitor, cmd.command)) {
            for (CommandQueue queue : commandQueues) {
                    }
            clearCommandQueues();
    {
                    return cmd.command;
            if (cmd.reflector != null) {
        {
            getCommandQueues();
                for (DBECommandListener listener : getListeners()) {
                }
                }
        private final CommandQueue parent;
                            }
                        result = lastCommand.command.merge(firstCommand.command, userParams);
            }
    public void saveChanges(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
            DBPObject object = commandInfo.command.getObject();
            if (!executionContext.isConnected()) {
    }
                    //firstCommand.mergedBy = lastCommand;
                    for (int k = mergedCommands.size(); k > 0; k--) {

            }
                    log.warn("Can't rollback transaction after error", e);

                    commands.remove(cmd);
                CommandInfo cmd = undidCommands.getLast();
                }
        public int size()
package org.jkiss.dbeaver.model.impl.edit;
            if (linkedCommand != null) {
            }

                            if (!ArrayUtils.isEmpty(persistActions)) {
        // Create queues from commands

                    if (tmpQueue.getObject() == object) {
            CommandInfo commandInfo = null;
                    txnManager.setAutoCommit(monitor, useAutoCommit);
                }
            }
                }
                    txnManager.setAutoCommit(monitor, oldAutoCommit);
                                        if (actionType != DBEPersistAction.ActionType.OPTIONAL) {
                                    }
            reflector.redoCommand(command);
    }
        }
            commands.add(info);
                if (!queue.isEmpty()) {
            Map<String, Object> validateOptions = new HashMap<>();
    public Map<Object, Object> getUserParams()
    public AbstractCommandContext(DBCExecutionContext executionContext, boolean atomic)
                commandQueues.add(queue);
                }
                        cmd = cmd.mergedBy;
                for (CommandInfo cmd : queue.commands) {
        public DBPObject getObject()
    protected DBCSession openCommandPersistContext(
                CommandInfo cmd = commands.get(i);
        // Execute commands in transaction
        }
    private static class PersistInfo {
                    if (mergedBy == null) {
                commands.add(commandInfo);
                    // Some other command
            if (cmd.reflector != null && !atomic) {
    }
                try {
        List<CommandInfo> processedCommands = new ArrayList<>();
        public PersistInfo(DBEPersistAction action)
 */
            return commands.add(new CommandInfo(dbeCommand, null));
        DBRProgressMonitor monitor,
                                                session.enableLogging(true);

import org.jkiss.utils.ArrayUtils;
                lastCommand.mergedBy = null;
            return subQueues;
                }
                                    DBEPersistAction.ActionType actionType = persistInfo.action.getType();
                                for (PersistInfo persistInfo : cmd.persistActions) {

     * @param executionContext Execution context
                    }
    private static final Log log = Log.getLog(AbstractCommandContext.class);
                if (cmd.command.isUndoable()) {
                        }
                                        }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
        synchronized (listeners) {
        }
                } catch (DBCException e1) {
 *     http://www.apache.org/licenses/LICENSE-2.0

    public boolean isDirty()
    {

            }
                }
            boolean found = false;
 *
                                    } catch (DBException e) {
    private List<CommandQueue> commandQueues;
    }
        for (CommandInfo cmd : processedCommands) {
                        // Remove only executed commands
        return userParams;
        synchronized (commands) {

    {

        commandQueues = null;
                            }
import org.jkiss.utils.CommonUtils;
            for (CommandInfo cmd : new ArrayList<>(queue.commands)) {
                    return true;
                                            }
    }
                    cmd.command.updateModel();
                // Actually it is a new command
    {

            for (CommandInfo cmd : commands) {
                            cmd.reflector.redoCommand(cmd.command);
                    index++;
                                        if (error == null || actionType == DBEPersistAction.ActionType.FINALIZER) {
                }
        {
                commands.clear();
            queue.addCommand(commandInfo);
            CommandInfo lastCommand = commands.getLast();
            commands.add(newCommand);
        DBCTransactionManager txnManager = DBUtils.getTransactionManager(executionContext);
                                }
    {
                public void remove()
                        }
                for (CommandQueue tmpQueue : commandQueues) {
                                DBException error = null;
        @NotNull
        // Filter commands
        }
    public void addCommandListener(@NotNull DBECommandListener listener) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        } finally {
                                mergedBy = queue.commands.get(k);
        }

                    }

                        ((DBPStatefulObject) queue.getObject()).refreshObjectState(monitor);
                        mergedByMap.put(result, mergedBy);
    @Override
                                            }

                for (int i = 0; i < queue.commands.size(); i++) {
    }
                        if (mergedBy == null) {
            // Rollback changes of last command
        private final DBEObjectManager objectManager;
                {
        public Iterator<DBECommand<DBPObject>> iterator() {
    }

 * You may obtain a copy of the License at
            if (!commands.isEmpty()) {
                // Update UI
    @Override
                }
    @NotNull
    @Override
        }
                                    }
/**
        if (execute && reflector != null && !atomic) {
                    for (CommandInfo cmd : executedCommands) {
}                cmd.reflector.undoCommand(cmd.command);
                @Override
    @Override
            clearUndidCommands();
        synchronized (commands) {
    }
    private final DBCExecutionContext executionContext;
                if (atomic) {
 *
                parent.addSubQueue(this);
        public DBECommandQueue getParentQueue()
                        continue;

        }
            this.action = action;
import org.jkiss.dbeaver.DBException;

    @Override
                        // Commands which do not perform any persist actions
    {
            oldAutoCommit = txnManager.isAutoCommit();

                userParams.clear();
        @Override

    @Override
    public Collection<DBPObject> getEditedObjects()
    }
                listener.onSave();

                if (mergedCommands.isEmpty()) {
    }
                                break;
            return commands.size();
        }
import org.jkiss.dbeaver.runtime.DBWorkbench;

        private List<CommandInfo> commands = new ArrayList<>();
                try (DBCSession session = executionContext.openSession(monitor, DBCExecutionPurpose.UTIL, "Rollback script transaction")) {
                    session.enableLogging(false);
                        }
                    if (skipCommand) {
    @NotNull
            }
    {
                ((DBECommandFilter) queue.objectManager).filterCommands(queue);
        }

                                }
                } catch (DBCException e) {
                lastCommand = lastCommand.linkedCommand;
            }
        fireCommandChange(command);
            for (CommandQueue queue : getCommandQueues()) {

            executionContext.invalidateContext(monitor);
    private static class CommandQueue extends AbstractCollection<DBECommand<DBPObject>> implements DBECommandQueue<DBPObject> {
                }
            // Refresh object states
        synchronized (listeners) {

        return result;
                processedCommands.add(commandInfo);
        @Override
    public void addCommand(@NotNull DBECommand<?> command, @Nullable DBECommandReflector reflector, boolean execute, @Nullable DBECommand<?> linkedCommand) {
            }
        fireCommandChange(command);
        for (CommandInfo cmd : processedCommands) {
                    CommandInfo mergedBy = mergedByMap.get(result);
    }
    {
        }

        }
            }
import java.util.*;

    private void clearCommandQueues()
                            // Create new command info
    }
                    }
        }
            return commandQueues;
            ((DBECommandAggregator)aggregator.command).resetAggregatedCommands();
                                        }
                if (oldAutoCommit != useAutoCommit) {
            }
                        log.error(e);
                }
     *               reflects each command at the moment it executed
        synchronized (commands) {
        @Override
                    i--;
 * Unless required by applicable law or agreed to in writing, software

    private List<CommandQueue> getCommandQueues() {
                aggregator = commandInfo;
        refreshCommandState();
                if (!cmd.command.isUndoable()) {
                            DBEPersistAction[] persistActions = cmd.command.getPersistActions(monitor, executionContext, options);
                        break;
    @Override
        }


                            cmd.executed = true;
    public void removeCommandListener(@NotNull DBECommandListener listener) {
            return result;
        synchronized (commands) {
            }
                        cmd.mergedBy = aggregator;
            if (parent != null) {
                }
                            break;
            // Use transaction mode of the session instead
        // Execute commands
                    listener.onReset();
                }
            // Redo batch
                    }
                    log.warn("Can't switch to transaction mode", e);


                        for (int k = i; k >= 0; k--) {
        }
    public DBCExecutionContext getExecutionContext()
                    }
     * @param atomic atomic context reflect commands in UI only after all commands were executed. Non-atomic
            for (CommandInfo cmd : commands) {
            listener.onCommandChange(command);


                undidCommands.add(lastCommand);
        synchronized (commands) {
            listeners.remove(listener);
                processedCommands.add(lastCommand);
                }
            for (CommandQueue queue : getCommandQueues()) {
 * See the License for the specific language governing permissions and
                                        // Skip pure comments

        }
        {
                                cmd.persistActions = new ArrayList<>(persistActions.length);
        boolean executed = false;
            return false;
        synchronized (commands) {
                if (cmd.mergedBy == null && cmd.command instanceof DBECommandRename) {
                                    // Because most databases do not support transactional DDL
    {
                    if (monitor.isCanceled()) {
            executeCommands(monitor, options, useAutoCommit ? null : txnManager);
                    }
                }
    @Override
                        newCommand.linkedCommand = cmd;
            }
    private final boolean atomic;
            for (int i = 0; i < queue.commands.size(); i++) {
                if (cmd.command == command) {
                {

                    cmd = cmd.linkedCommand;
                for (CommandInfo cmd : executedCommands) {
                queue = new CommandQueue(objectManager, null, object);
        List<CommandInfo> executedCommands = new ArrayList<>();
                        if (cmd.reflector != null) {
                // Update model
 * you may not use this file except in compliance with the License.
                        //}
        }
        @Override

                }
        } catch (Throwable e) {
                            mergedCommands.remove(firstCommand);
/*
    protected void refreshCommandState()
            }
        this.atomic = atomic;
        DBECommand<?> command)
public abstract class AbstractCommandContext implements DBECommandContext {
     */
        if (getRedoCommand() == null) {
        private CommandQueue(DBEObjectManager objectManager, CommandQueue parent, DBPObject object) {
    @Nullable
                if (result == lastCommand.command) {
    public Collection<? extends DBECommand<?>> getFinalCommands()
                                        continue;
            }

            // Notify listeners
            ModelMessages.model_edit_execute_ + command.getTitle());
                                }
                }
    @Override

        if (!executionContext.getDataSource().getInfo().supportsTransactionsForDDL()) {
    @NotNull
                            // Remove original command from stack
                @Override
        }
        }
    public void addCommand(@NotNull DBECommand<?> command, @Nullable DBECommandReflector reflector, boolean execute) {
    }
                if (undoCommands) {
    public DBECommand<?> getUndoCommand() {
    private final List<CommandInfo> undidCommands = new ArrayList<>();
    }
            // Undo command batch

                    commands.remove(index);
    @Override
