
                Map<String, Object> options = new LinkedHashMap<>(command.getOptions());
 * limitations under the License.
            List<DBEPersistAction> actions = new ArrayList<>();
            }
    protected StringBuilder getNestedDeclaration(DBRProgressMonitor monitor, CONTAINER_TYPE owner, DBECommandAbstract<OBJECT_TYPE> command, Map<String, Object> options) {
    ) throws DBException;
            // Update target object position
        public Map<String, Object> getOptions() {
                }
        return getNewChildName(monitor, container, getBaseObjectName());
                    getId().equals(((PropertyHandler) obj).getId());
    public static final String PATTERN_ITEM_TABLE = "%TABLE%"; //$NON-NLS-1$
    public static final String PATTERN_ITEM_INDEX = "%INDEX%"; //$NON-NLS-1$
        final ObjectCreateCommand createCommand = makeCreateCommand(newObject, options);
        public boolean equals(Object obj) {
    public class ReorderObjectReflector implements DBECommandReflector<OBJECT_TYPE, ObjectReorderCommand> {
 * you may not use this file except in compliance with the License.
        public void reflectValueChange(OBJECT_TYPE object, Object oldValue, Object newValue) {
    protected static class EmptyCommand extends DBECommandAbstract<DBPObject> {
            DBSObjectCache<? extends DBSObject, OBJECT_TYPE> cache = getObjectsCache(object);
        @NotNull DBRProgressMonitor monitor,
        @NotNull Map<String, Object> options
            // Otherwise we issue redundant rename commands
            return configurator.configureObject(monitor, commandContext, parent, object, options);

 * DBeaver - Universal Database Manager
        extends AbstractObjectManager<OBJECT_TYPE>
            String createId = "create#" + hashCode;
            // TODO: May be we should make ObjectChangeCommand static
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @Override
    }
                            sibling.setOrdinalPosition(siblingPosition + 1);
                // We need to update order in navigator model
import org.jkiss.utils.CommonUtils;
            ObjectRenameCommand renameCmd = (ObjectRenameCommand) userParams.get(mergeId);
                }
    }
import org.jkiss.code.Nullable;
        Object copyFrom,
    }
    }
    protected void createObjectReferences(DBRProgressMonitor monitor, DBECommandContext commandContext, ObjectCreateCommand createCommand) throws DBException {

    ) {
        @NotNull ObjectReorderCommand command,

        @Override
        public DBECommand<?> merge(@NotNull DBECommand<?> prevCommand, @NotNull Map<Object, Object> userParams) {
        @Override
/*
    }
        }
        public void validate(OBJECT_TYPE object, Object value) throws DBException {
        public ObjectChangeCommand(OBJECT_TYPE object) {
            Object createCmd = userParams.get(createId);
        private String newName;
        @NotNull Map<String, Object> options
    protected abstract void addObjectDeleteActions(
            }
        return new PropertyHandler(property);
        }
    protected String getNewChildName(DBRProgressMonitor monitor, CONTAINER_TYPE container, String baseName) {
            if (parentObject != null) {
            implements DBEPropertyHandler<OBJECT_TYPE>, DBEPropertyReflector<OBJECT_TYPE>, DBEPropertyValidator<OBJECT_TYPE> {
    public boolean canCreateObject(@NotNull Object container) {
        }
                    }
            for (DBPOrderedObject sibling : command.getSiblings()) {
        public String toString() {
        @NotNull NestedObjectCommand<OBJECT_TYPE, PropertyHandler> command,
        }
        if (command.getObject().isPersisted()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
                    cache.renameObject(command.getObject(), command.getOldName(), command.getNewName());
        }

        }
                } catch (InvocationTargetException e) {
            return options;
            return options;
        try {
    ) {
            return newName;
        @Override
    ) throws DBException {
            }
        }
        @NotNull DBECommandContext context,

        try {
            if (command.getObject() instanceof DBPNamedObject2) {
        public abstract String getNestedDeclaration(DBRProgressMonitor monitor, DBSObject owner, Map<String, Object> options);
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            // We need very first and very last rename commands. They produce final rename
    ) throws DBException {


        public DBEPersistAction[] getPersistActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull Map<String, Object> options) {

        protected ObjectCreateCommand(OBJECT_TYPE object, String title, Map<String, Object> options) {
            return actions.toArray(new DBEPersistAction[0]);
        }
        private Map<String, Object> options;
            return "CMD:UpdateObject:" + getObject();
        implements
            }
                new ObjectDeleteCommand(object, ModelMessages.model_jdbc_delete_object),
import org.jkiss.dbeaver.model.impl.edit.AbstractObjectManager;
            return actions.toArray(new DBEPersistAction[0]);
            if (reorderCmd == null) {

            extends ProxyPropertyDescriptor
            if (cache != null) {
    protected class ObjectDeleteCommand extends DBECommandDeleteObject<OBJECT_TYPE> {
                userParams.put(mergeId, reorderCmd);
                DBSObjectCache<? extends DBSObject, OBJECT_TYPE> cache = getObjectsCache(command.getObject());
        commandContext.getUserParams().put(newObject, createCommand);

        }
                    } else {
                    throw new DBException("Error processing additional create action", e.getTargetException());

        ObjectReorderCommand command = new ObjectReorderCommand(object, siblings, ModelMessages.model_jdbc_reorder_object, newPosition);
                reorderCmd.newPosition = newPosition;
    //////////////////////////////////////////////////
                if (CommonUtils.isEmpty(objectName)) {
        if (table instanceof DBPNamedObject2) {
    public class ObjectCreateCommand extends NestedObjectCommand<OBJECT_TYPE, PropertyHandler> implements DBECommandWithOptions {
        @NotNull List<DBEPersistAction> actions,

        }
        public void undoCommand(@NotNull ObjectRenameCommand command) {
    }
        }
    @Override
        @NotNull DBCExecutionContext executionContext,
                break;
        @Override
 * See the License for the specific language governing permissions and
    protected void processObjectReorder(DBECommandContext commandContext, OBJECT_TYPE object, List<? extends DBPOrderedObject> siblings, int newPosition) throws DBException {
        @Override
            List<DBEPersistAction> actions = new ArrayList<>();
        DBRProgressMonitor monitor,
            return "CMD:RenameObject:" + getObject();
            final StringBuilder decl = SQLObjectEditor.this.getNestedDeclaration(monitor, (CONTAINER_TYPE) owner, this, options);
import org.jkiss.dbeaver.model.edit.*;
    protected String getBaseObjectName() {



    protected String getNewChildName(DBRProgressMonitor monitor, CONTAINER_TYPE container) throws DBException {

        }
        @Override

 * You may obtain a copy of the License at
            addObjectRenameActions(monitor, executionContext, actions, this, options);
            // TODO: May be we should make ObjectChangeCommand static
            if (additionalAction instanceof DBRRunnableWithProgress) {
        private Map<String, Object> options;
            validateObjectProperty(object, original, value);
        @NotNull DBRProgressMonitor monitor,
                if (object instanceof DBPSaveableObject) {
        public String toString() {
    @Override
        }
    public void deleteObject(@NotNull DBECommandContext commandContext, @NotNull OBJECT_TYPE object, @NotNull Map<String, Object> options) throws DBException {
        public String toString() {
        if (!CommonUtils.getOption(options, OPTION_SKIP_CONFIGURATION)) {

}
        }
            final DBSObject parentObject = command.getObject().getParentObject();
        DBEObjectEditor<OBJECT_TYPE>,
        public ObjectRenameCommand(OBJECT_TYPE object, String title, Map<String, Object> options, String newName) {
        }
    }
        commandContext.addCommand(

        }
                        }

        @Override


    protected static abstract class NestedObjectCommand<OBJECT_TYPE extends DBSObject, HANDLER_TYPE extends DBEPropertyHandler<OBJECT_TYPE>> extends DBECommandComposite<OBJECT_TYPE, HANDLER_TYPE> {

        }
        public String toString() {
            return new ObjectChangeCommand(object);
            return original.getId().hashCode();
        @NotNull Map<String, Object> options
    public final OBJECT_TYPE createNewObject(
    }
        private int newPosition;
        } catch (DBException e) {
        public DBEPersistAction[] getPersistActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull Map<String, Object> options) {
        @Override


    @Override
                options.put(DBEObjectRenamer.PROP_NEW_NAME, command.getNewName());
    public static final String PATTERN_ITEM_INDEX_SHORT = "%INDEX_SHORT%"; //$NON-NLS-1$
        }
        } catch (ClassCastException e) {
        @Override
                Map<String, Object> options = new LinkedHashMap<>(command.getOptions());
import org.jkiss.dbeaver.model.impl.edit.DBECommandAbstract;
    protected class PropertyHandler
    protected void addObjectReorderActions(
        }

            }
        @NotNull DBRProgressMonitor monitor,

    public boolean canDeleteObject(@NotNull OBJECT_TYPE object) {
                }
                ((DBPNamedObject2) command.getObject()).setName(command.newName);
 * Database object editor
            return oldName;
import org.jkiss.dbeaver.model.edit.prop.*;
            }
        @NotNull DBCExecutionContext executionContext,
                if (cache != null) {
        @NotNull DBRProgressMonitor monitor,
                DBUtils.fireObjectUpdate(command.getObject(), options, DBPEvent.RENAME);
        @NotNull DBRProgressMonitor monitor,

                }
        }
        ObjectReorderCommand(OBJECT_TYPE object, List<? extends DBPOrderedObject> siblings, String title, int newPosition) {
        public DBECommandComposite<OBJECT_TYPE, ? extends DBEPropertyHandler<OBJECT_TYPE>> createCompositeCommand(OBJECT_TYPE object) {
        @NotNull List<DBEPersistAction> actionList,
            String mergeId = "rename#" + hashCode;
                    } else {
    }
    protected class ObjectChangeCommand extends NestedObjectCommand<OBJECT_TYPE, PropertyHandler> {
import java.util.List;
        for (;;) {
                        if (siblingPosition >= command.newPosition && siblingPosition < command.oldPosition) {
        public void redoCommand(@NotNull ObjectRenameCommand command) {
    }

            for (int i = 0; i < MAX_NAME_GEN_ATTEMPTS; i++) {
            }

            try {
    protected void validateObjectProperties(DBRProgressMonitor monitor, ObjectChangeCommand command, Map<String, Object> options) throws DBException {
                return reorderCmd;
        }
            return actions.toArray(new DBEPersistAction[0]);
    }
        @NotNull
            super(object, "Empty"); //$NON-NLS-1$
            return CommonUtils.isEmpty(decl) ? null : decl.toString();

        @Override
        @NotNull Map<String, Object> options) throws DBException;
            log.error("Error generating child object name", e);

            return newPosition;
                    // ignore
                DBUtils.fireObjectUpdate(parentObject, DBPEvent.REORDER);
            return "CMD:DeleteObject:" + getObject();
                        }
        public EmptyCommand(DBPObject object) {
import org.jkiss.dbeaver.model.messages.ModelMessages;

        public int hashCode() {
        @Override
    protected class ObjectRenameCommand extends DBECommandAbstract<OBJECT_TYPE> implements DBECommandRename {
        @Override
    // Properties
        }
        public int getNewPosition() {
                        cachedObjects = objectsCache.getCachedObjects();
import org.jkiss.dbeaver.model.struct.DBSObject;
            throw new DBException("Can't create object here.\nWrong container type: " + container.getClass().getSimpleName());
    //////////////////////////////////////////////////

        @NotNull
        createObjectReferences(monitor, commandContext, createCommand);
        private String oldName;
        @NotNull DBCExecutionContext executionContext,
    }
    ) throws DBException {

/**
            }
    protected abstract void addObjectCreateActions(
        @NotNull DBCExecutionContext executionContext,

        }
                }
                renameCmd.newName = newName;
            newObject = createDatabaseObject(monitor, commandContext, container, copyFrom, options);
        @NotNull List<DBEPersistAction> actions,


    }
                DBSObjectCache<? extends DBSObject, OBJECT_TYPE> objectsCache = getObjectsCache(newObject);
    }
            super(table, title);
            List<DBEPersistAction> actions = new ArrayList<>();
        DBECommandContext commandContext,
    }
            return obj != null &&
        @NotNull ObjectDeleteCommand command,
            // Refresh object AND parent

        OBJECT_TYPE newObject;
        @Override
        @NotNull Map<String, Object> options
                    }
            super(object, title);
    // Actions
    }
    //////////////////////////////////////////////////
            // Any additional action may add another action in options
        @Nullable Object copyFrom,
        @NotNull DBRProgressMonitor monitor,
            OBJECT_TYPE object = command.getObject();
                userParams.put(mergeId, renameCmd);
        return DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_METADATA_EDITOR);
            this.oldName = object.getName();

                    cache.renameObject(command.getObject(), command.getNewName(), command.getOldName());
        }

            this.siblings = siblings;

        }
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
        @NotNull DBRProgressMonitor monitor,
    protected void validateObjectProperty(OBJECT_TYPE object, DBPPropertyDescriptor property, Object value) throws DBException {


            OBJECT_TYPE newObject = getObject();
            if (!newObject.isPersisted()) {

    }
            }

import java.util.LinkedHashMap;

    }
    //////////////////////////////////////////////////
            log.error("Error generating child object name: max attempts reached");
            // Process additional actions

import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
            // We need to dismiss all rename commands if there is a create command in the command queue.
    @Override
                new DeleteObjectReflector<>(this),
        @NotNull DBRProgressMonitor monitor,
        commandContext.addCommand(createCommand, new CreateObjectReflector<>(this), true);
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
        @Override
        @Override

        public void undoCommand(@NotNull DBECommandAbstract<OBJECT_TYPE> command) {

                return null;
        public DBEPersistAction[] getPersistActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull Map<String, Object> options) throws DBException {
        public DBEPersistAction[] getPersistActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull Map<String, Object> options) throws DBException {
                userParams.put(createId, prevCommand);
            // We need very first and very last reorder commands. They produce final rename

                try {
        @NotNull ObjectChangeCommand command,


                String tableName = DBObjectNameCaseTransformer.transformName(container.getDataSource(), i == 0 ? baseName : (baseName + "_" + i));
            throw new IllegalStateException("Object reorder is not supported in " + getClass().getSimpleName()); //$NON-NLS-1$
import java.util.ArrayList;
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
                }
            // Update positions in sibling objects
                            sibling.setOrdinalPosition(siblingPosition - 1);
        public String toString() {


            this.options = options;
        @NotNull
        return DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_METADATA_EDITOR);


            this.newPosition = newPosition;

        @Override
        return object;

        }

import org.jkiss.dbeaver.model.*;
                }
            return siblings;

                return new DBEPersistAction[0];
                } catch (InterruptedException e) {
        @Override
            this.oldPosition = ((DBPOrderedObject) object).getOrdinalPosition();
            addObjectReorderActions(monitor, executionContext, actions, this, options);
        @Override
                    if (cachedObject != null && cachedObject != newObject && cachedObject.isPersisted()) {
            int hashCode = getObject().hashCode();
            } else {
        }
            super(object, title);


        return null;
 *     http://www.apache.org/licenses/LICENSE-2.0
    protected abstract OBJECT_TYPE createDatabaseObject(

    // Command objects
        }
        public void redoCommand(@NotNull ObjectReorderCommand command) {
            super(object, title);
    }
            }

                }
            return "CMD:CreateObject:" + getObject();
    // For example constraint for a columns.

    @Override
            ((DBPOrderedObject) command.getObject()).setOrdinalPosition(command.oldPosition);
            addObjectExtraActions(monitor, executionContext, actions, this, options);
            }
            super.updateModel();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.struct.cache.DBSCompositeCache;
import java.lang.reflect.InvocationTargetException;
        return new ObjectCreateCommand(object, ModelMessages.model_jdbc_create_new_object, options);
    public static final String OPTION_ADDITIONAL_ACTION = "additional.actions";
        // Do nothing. Derived implementations may add extra handling
    protected void addObjectModifyActions(
        @NotNull DBCExecutionContext executionContext,
            if (CommonUtils.equalObjects(oldName, newName)) {

    }

        }
    }
            // Not supported by implementation
    protected OBJECT_TYPE configureObject(
        }
        }
            }
            List<DBEPersistAction> actions = new ArrayList<>();

        }
        @Override
        }
                    obj.getClass() == PropertyHandler.class &&
            OBJECT_TYPE object = getObject();
                if (child == null) {
import java.util.Map;
        public DBECommand<?> merge(@NotNull DBECommand<?> prevCommand, @NotNull Map<Object, Object> userParams) {

        }
                cache.removeObject(object, false);
        return DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_METADATA_EDITOR);
import org.jkiss.dbeaver.model.rm.RMConstants;
    @Override
        @NotNull List<DBEPersistAction> actions,
 */
            ObjectReorderCommand reorderCmd = (ObjectReorderCommand) userParams.get(mergeId);
                ((DBPNamedObject2)table).setName(getNewChildName(monitor, container));

import org.jkiss.dbeaver.model.impl.ProxyPropertyDescriptor;
        @Override

 *
        public void undoCommand(@NotNull ObjectReorderCommand command) {
    ) {
import org.jkiss.code.NotNull;
                log.error("Error settings object name", e);
        public List<? extends DBPOrderedObject> getSiblings() {
            } else {
                    OBJECT_TYPE cachedObject = DBUtils.findObject(cachedObjects, objectName);

            List<DBEPersistAction> actions = new ArrayList<>();
        @Override
        @Override
        }
    protected class ObjectReorderCommand extends DBECommandAbstract<OBJECT_TYPE> {
    }
        public Map<String, Object> getOptions() {
                    int siblingPosition = sibling.getOrdinalPosition();
        }

        }
        }
                    return tableName;
    protected void setNewObjectName(DBRProgressMonitor monitor, CONTAINER_TYPE container, OBJECT_TYPE table) {
    protected void addObjectExtraActions(
import org.jkiss.dbeaver.DBException;

    protected void processObjectRename(DBECommandContext commandContext, OBJECT_TYPE object, Map<String, Object> options, String newName) throws DBException {
                DBUtils.fireObjectUpdate(command.getObject(), options, DBPEvent.RENAME);
            this.newName = newName;
            }
            if (command.getObject() instanceof DBPNamedObject2) {
                    }
            this.options = options;

            super(object, "JDBC Composite"); //$NON-NLS-1$
        private int oldPosition;
        @NotNull List<DBEPersistAction> actions,
        public String getNewName() {
            newObject = configureObject(monitor, commandContext, container, newObject, options);


    }
        protected NestedObjectCommand(OBJECT_TYPE object, String title) {
            if (prevCommand instanceof SQLObjectEditor.ObjectCreateCommand) {
        }
    // Commands
    }
        return "NewObject";
            final DBSObject parentObject = object.getParentObject();
        }

                // Update cache
            DBUtils.fireObjectUpdate(command.getObject(), true);

            addObjectCreateActions(monitor, executionContext, actions, this, options);
        Object container,
            } catch (DBException e) {
        DBEObjectMaker<OBJECT_TYPE, CONTAINER_TYPE> {

            if (!object.isPersisted()) {
        public void updateModel() {
        commandContext.addCommand(command, new RenameObjectReflector(), true);

    }
                    throw new DBException("Empty " + DBUtils.getObjectTypeName(newObject).toLowerCase() + " name");
    public boolean canEditObject(@NotNull OBJECT_TYPE object) {
            addObjectExtraActions(monitor, executionContext, actions, this, options);
            return actions.toArray(new DBEPersistAction[actions.size()]);
                return prevCommand;

    public final DBEPropertyHandler<OBJECT_TYPE> makePropertyHandler(@NotNull OBJECT_TYPE object, @NotNull DBPPropertyDescriptor property) {

        @NotNull DBECommandContext commandContext,
        public String toString() {
            return oldPosition;
        public void updateModel() {
    public static final String PATTERN_ITEM_CONSTRAINT = "%CONSTRAINT%"; //$NON-NLS-1$
import org.jkiss.dbeaver.utils.GeneralUtils;
 *

        @NotNull DBCExecutionContext executionContext,
        @NotNull
        Map<String, Object> options
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
                    //editor == ((PropertyHandler)obj).editor &&
        }
                if (sibling != object) {
        @Override
    // Name generator
        @Override
        // Base SQL syntax do not support object properties change
            return baseName;

            return CommonUtils.isEmpty(decl) ? null : decl.toString();
            OBJECT_TYPE object = getObject();
                DBUtils.fireObjectUpdate(object);
 *
            }
            return DBObjectNameCaseTransformer.transformName(container.getDataSource(), baseName);
                ((DBPNamedObject2) command.getObject()).setName(command.oldName);
            if (newObject == null) {
public abstract class SQLObjectEditor<OBJECT_TYPE extends DBSObject, CONTAINER_TYPE extends DBSObject>

    public static class RefreshObjectReflector<OBJECT_TYPE extends DBSObject> implements DBECommandReflector<OBJECT_TYPE, DBECommandAbstract<OBJECT_TYPE>> {

        Object parent,
        @NotNull List<DBEPersistAction> actions,
            if (renameCmd == null) {
                String objectName = newObject.getName();
                // We need to update order in navigator model
                return renameCmd;
        public void validateCommand(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
                DBSObjectCache<? extends DBSObject, OBJECT_TYPE> cache = getObjectsCache(command.getObject());

            super(object, title);
        @Override
        @NotNull Object container,

            }
            return "CMD:ReorderPosition:" + getObject() + ":" + getOldPosition() + ":" + getNewPosition();

        }

            DBUtils.fireObjectUpdate(command.getObject(), true);

        @NotNull ObjectRenameCommand command,
            if (createCmd != null) {
            return super.merge(prevCommand, userParams);
    }
                        if (siblingPosition <= command.newPosition && siblingPosition > command.oldPosition) {
        DBEObjectConfigurator<OBJECT_TYPE> configurator = GeneralUtils.adapt(object, DBEObjectConfigurator.class);
        public void validateCommand(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
                renameCmd = new ObjectRenameCommand(getObject(), getTitle(), options, newName);

    }
        @NotNull Map<String, Object> options

            } else {
        }
            return super.merge(prevCommand, userParams);
        @Override
    public static final String OPTION_SKIP_CONFIGURATION = "skip.object.configuration";
            Object additionalAction = options.remove(OPTION_ADDITIONAL_ACTION);
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;

        @Override
        if (configurator != null) {
            return original.getDisplayName();
            addObjectModifyActions(monitor, executionContext, actions, this, options);
        OBJECT_TYPE object,
                if (cache != null) {
        ObjectRenameCommand command = new ObjectRenameCommand(object, ModelMessages.model_jdbc_rename_object, options, newName);
            if (parentObject != null) {
            super(property);
    // Value of this property must be instance of DBRRunnableWithProgress
            ((DBPOrderedObject) object).setOrdinalPosition(command.newPosition);

            final StringBuilder decl = SQLObjectEditor.this.getNestedDeclaration(monitor, (CONTAINER_TYPE) owner, this, options);
                DBUtils.fireObjectUpdate(parentObject, DBPEvent.REORDER);
    //////////////////////////////////////////////////

        private PropertyHandler(DBPPropertyDescriptor property) {

    }

            addObjectDeleteActions(monitor, executionContext, actions, this, options);
        @Override
        throw new IllegalStateException("Object rename is not supported in " + getClass().getSimpleName()); //$NON-NLS-1$
        }
    public ObjectCreateCommand makeCreateCommand(OBJECT_TYPE object, Map<String, Object> options) {
                        throw new DBException(DBUtils.getObjectTypeName(cachedObject) + " '" + objectName + "' already exists");
 */
        @Override

        return newObject;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
            final String mergeId = "reorder" + getObject().hashCode();

        commandContext.addCommand(command, new ReorderObjectReflector(), true);
        }


                    if (objectsCache instanceof DBSCompositeCache) {
import org.jkiss.dbeaver.runtime.DBWorkbench;

                    List<OBJECT_TYPE> cachedObjects;
                reorderCmd = new ObjectReorderCommand(getObject(), siblings, getTitle(), newPosition);
    }
    protected void addObjectRenameActions(
            // It is a trick
        public void redoCommand(@NotNull DBECommandAbstract<OBJECT_TYPE> command) {
    }
            // This method may be invoked from another Editor with different OBJECT_TYPE and CONTAINER_TYPE
    // This option may be set by object configurer, e.g. to create other linked objects.
    }
            }
        @Override
        @NotNull Map<String, Object> options) throws DBException;
                    ((DBPSaveableObject) object).setPersisted(true);
        public String getNestedDeclaration(DBRProgressMonitor monitor, DBSObject owner, Map<String, Object> options) {
        }

            // This method may be invoked from another Editor with different OBJECT_TYPE and CONTAINER_TYPE
        @NotNull Map<String, Object> options
        public String getNestedDeclaration(DBRProgressMonitor monitor, DBSObject owner, Map<String, Object> options) {
                options.put(DBEObjectRenamer.PROP_OLD_NAME, command.getOldName());
            validateObjectProperties(monitor, this, options);
                true);

        public ObjectDeleteCommand(OBJECT_TYPE table, String title) {
        public String getOldName() {
        private List<? extends DBPOrderedObject> siblings;

    }
                    if (command.newPosition < command.oldPosition) {
                    ((DBRRunnableWithProgress) additionalAction).run(monitor);
                DBSObject child = container instanceof DBSObjectContainer ? ((DBSObjectContainer)container).getChild(monitor, tableName) : null;
        @NotNull

    public class RenameObjectReflector implements DBECommandReflector<OBJECT_TYPE, ObjectRenameCommand> {

                if (objectsCache != null) {
        }
                return (DBECommand<?>) createCmd;
                // Update cache
    }

                        cachedObjects = ((DBSCompositeCache) objectsCache).getCachedObjects(newObject.getParentObject());
            // See https://github.com/dbeaver/dbeaver/issues/11917
        @NotNull
        }
        }
        @NotNull ObjectCreateCommand command,
        public DBEPersistAction[] getPersistActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull Map<String, Object> options) throws DBException {
        public int getOldPosition() {
            return actions.toArray(new DBEPersistAction[0]);
        }
            // It is a trick
    private static final int MAX_NAME_GEN_ATTEMPTS = 100;
package org.jkiss.dbeaver.model.impl.sql.edit;
        @NotNull
