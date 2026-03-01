                try {
            }
        }
        {
        private Map<String, Object> options;
            for (Object object : objects) {

 *
        }
    }
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
        final Object parentObject = container instanceof DBNDatabaseNode ? ((DBNDatabaseNode) container).getValueObject() : null;
import org.jkiss.dbeaver.model.edit.DBECommand;
            UIServiceSQL serviceSQL = DBWorkbench.getService(UIServiceSQL.class);
    }
                } catch (DBException e) {
            try {
        } catch (InvocationTargetException e) {
                    }
        public void run(DBRProgressMonitor monitor) throws InvocationTargetException, InterruptedException
        } catch (InterruptedException e) {
                }
            // No editor found - create new command context
    {
import org.jkiss.dbeaver.ui.UIUtils;
            } catch (InterruptedException e) {
            } catch (InvocationTargetException e) {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    }
        DBNDatabaseNode node = model.findNode(object);
        }
        return false;
import org.jkiss.dbeaver.model.struct.DBSObjectReference;
import org.jkiss.dbeaver.runtime.ui.UIServiceSQL;
import org.jkiss.dbeaver.model.navigator.*;
    protected static class CommandTarget {

            IWorkbenchPage activePage = workbenchWindow.getActivePage();

            UIUtils.runInProgressService(monitor -> {
            }
            this.context = context;
        }
                final IEditorPart editor = editorRef.getEditor(false);
        public void run(DBRProgressMonitor monitor) throws InvocationTargetException
                }
                    continue;
                        if (script.length() == 0) {
        StringBuilder script = new StringBuilder();
            if (!nodeLoader.nodes.isEmpty()) {
                        structObject = ((DBSObjectReference) object).resolveObject(monitor);
        }
                        }
        }
        @Nullable DBNDatabaseNode editorNode,
        @Override
            this.commander = commander;
                DBNDatabaseNode node = model.getNodeByObject(monitor, structObject, true);
        @NotNull IWorkbenchWindow workbenchWindow,
                                SQLUtils.generateComments(commandContext.getExecutionContext().getDataSource(),
        } else {
                commander.saveChanges(monitor, options);
        private CommandTarget(DBECommandContext context)

        Collection<? extends DBECommand> commands = commandContext.getFinalCommands();
                // do nothing
        }
            }
                }
            this.context = ((IDatabaseEditorInput)editor.getEditorInput()).getCommandContext();
            }
    protected static boolean showScript(IWorkbenchWindow workbenchWindow, DBECommandContext commandContext, Map<String, Object> options, String dialogTitle)
        public ObjectSaver(DBECommandContext commander, Map<String, Object> options) {

            this.editor = editor;
import org.jkiss.dbeaver.Log;
                    for (DBECommand command : commands) {

                    switchEditorFolder(container, editor);

        boolean openEditor)
                        return new CommandTarget((IDatabaseEditor) editor);
                            switchEditorFolder(container, editor);

            missingObjects.add(object);
    static final boolean updateUI = true;
            return context;
                        script.append(
            return editor;
        DBNModel model = DBWorkbench.getPlatform().getNavigatorModel();

                        continue;
 *
        }
import org.jkiss.dbeaver.ui.editors.IDatabaseEditorInput;

                node = nodeLoader.nodes.get(0);
        }
                IDatabaseModellerEditor modellerEditor = activeEditor.getAdapter(IDatabaseModellerEditor.class);
                return new CommandTarget(new SimpleCommandContext(DBUtils.getDefaultContext(object, false), !openEditor));
/*
                            // Switch to folder unless we are already in modelling mode
                    return new CommandTarget(editor);
    }
    }

            try {
        if (container instanceof DBNContainer && editor instanceof ITabbedFolderContainer && container instanceof DBNDatabaseFolder) {
        private DBECommandContext context;

        try {

            return UIUtils.confirmAction(workbenchWindow.getShell(), dialogTitle, "No SQL script available.\nAre you sure you want to proceed?");
        List<Object> missingObjects = new ArrayList<>();
        DBSObject objectToSeek = null;
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (parentObject instanceof DBSObject) {
                DBSObject structObject;
package org.jkiss.dbeaver.ui.navigator.actions;
                }
        {
                            script.append(
                    result.add(node);
    public static Collection<DBNDatabaseNode> getNodesByObjects(Collection<Object> objects)
        return result;
import org.jkiss.dbeaver.ui.UIIcon;
            NodeLoader nodeLoader = new NodeLoader(model, missingObjects);
    }
import org.jkiss.code.NotNull;
                }
            NodeLoader nodeLoader = new NodeLoader(model, Collections.singleton(object));
import org.jkiss.dbeaver.model.edit.DBEStructEditor;
        @NotNull Class<?> childType,
        }
        {
                    nodes.add(node);
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * DBeaver - Universal Database Manager
                    throw new InvocationTargetException(e);
        private List<DBNDatabaseNode> nodes;
}                    final IEditorInput editorInput = editor.getEditorInput();
            if (parentStructEditor != null && RuntimeUtils.isTypeSupported(childType, parentStructEditor.getChildTypes())) {
                    }
                        activePage.activate(editor);

                    log.warn("Unsupported object type: " + object);
            this.objects = objects;
            if (serviceSQL != null) {
                    return new CommandTarget((IDatabaseEditor) activeEditor);
import java.util.*;
import org.jkiss.dbeaver.model.sql.SQLUtils;
            }
                UIUtils.runInProgressService(nodeLoader);
 * Copyright (C) 2010-2024 DBeaver Corp and others

                if (editor != null) {
        }
                objectToSeek = editorNode.getObject();
import org.eclipse.core.commands.AbstractHandler;
                    container,
        public NodeLoader(DBNModel model, Collection<? extends Object> objects)
        private final DBNModel model;
            }
                        }
import org.jkiss.dbeaver.utils.RuntimeUtils;
        {
            IEditorPart activeEditor = activePage.getActiveEditor();
                }
                objectToSeek = (DBSObject) parentObject;
            }
            if (object instanceof DBSObject) {
                if (object instanceof DBSObject) {
        return node;
            final DBEStructEditor parentStructEditor = DBWorkbench.getPlatform().getEditorsRegistry().getObjectManager(parentObject.getClass(), DBEStructEditor.class);
            ((ITabbedFolderContainer) editor).switchFolder(((DBNDatabaseFolder) container).getChildrenType());
    static final boolean UPDATE_GLOBAL_ACTION_LABELS = false;
        public CommandTarget(IDatabaseEditor editor)
                        DBEPersistAction[] persistActions = command.getPersistActions(monitor, commandContext.getExecutionContext(), options);
    private static void switchEditorFolder(DBNNode container, IEditorPart editor)
        {
            });
        public DBECommandContext getContext()
    protected static CommandTarget getCommandTarget(
import org.jkiss.dbeaver.model.struct.DBSObject;
            if (object != null) {

 * you may not use this file except in compliance with the License.
        {
        }
        }
import org.jkiss.dbeaver.ui.editors.IDatabaseEditor;

            if (openEditor) {
        if (node == null) {
        private CommandTarget()
    {
        private IDatabaseEditor editor;
                }
                    } catch (DBException e) {
                        log.error("Can't resolve object reference", e);
                    workbenchWindow);
                    null,
                                    persistActions,
                    structObject = (DBSObject) object;
            return false;
        if (!missingObjects.isEmpty()) {
                if (node != null) {

        DBNModel model = DBWorkbench.getPlatform().getNavigatorModel();
            } catch (InvocationTargetException e) {

            DBWorkbench.getPlatformUI().showError("Script generation error", "Error generating alter script", e.getTargetException());
                if (editor instanceof IDatabaseEditor) {
        }
        List<DBNDatabaseNode> result = new ArrayList<>();
                    commandContext.getExecutionContext(), dialogTitle, UIIcon.SQL_PREVIEW, script.toString(), true, false) == IDialogConstants.PROCEED_ID;
import java.lang.reflect.InvocationTargetException;
    }
                            SQLUtils.generateScript(commandContext.getExecutionContext().getDataSource(),
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.editors.IDatabaseModellerEditor;
                    try {
        }
                    if (editorInput instanceof IDatabaseEditorInput && ((IDatabaseEditorInput) editorInput).getDatabaseObject() == objectToSeek) {
import org.jkiss.dbeaver.ui.controls.folders.ITabbedFolderContainer;
    {
            } catch (InterruptedException e) {
    }
 *
 */
        public IDatabaseEditor getEditor()
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (script.length() > 0) {
            this.model = model;
                                    false));
                throw new InvocationTargetException(e);
        @Override
                final IDatabaseEditor editor = (IDatabaseEditor) NavigatorHandlerObjectOpen.openEntityEditor(
                // do nothing
                return serviceSQL.openSQLViewer(
            result.addAll(nodeLoader.nodes);
        for (Object object : objects) {
                    continue;
    {
 * Unless required by applicable law or agreed to in writing, software
                } else {
 * limitations under the License.
                if (modellerEditor != null && modellerEditor.isModelEditEnabled() && modellerEditor.containsModelObject(objectToSeek)) {
                UIUtils.runInProgressService(nodeLoader);
            DBSObject object = ((DBNDatabaseNode) container).getObject();
                } else if (object instanceof DBSObjectReference) {
        private final Collection<? extends Object> objects;
import org.jkiss.dbeaver.DBException;
    private static class NodeLoader implements DBRRunnableWithProgress {
        @NotNull DBNNode container,
                                false));
            if (activeEditor instanceof IDatabaseEditor) {
    private static final Log log = Log.getLog(NavigatorHandlerObjectBase.class);
        }
    public static DBNDatabaseNode getNodeByObject(DBSObject object)
                                persistActions,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                        if (editor.getAdapter(IDatabaseModellerEditor.class) == null) {

        {
            try {
import org.jkiss.dbeaver.ui.editors.SimpleCommandContext;
        if (objectToSeek != null) {
            }
import org.jkiss.dbeaver.model.DBUtils;
            this.nodes = new ArrayList<>(objects.size());
            }
        if (container instanceof DBNDatabaseNode) {

 * You may obtain a copy of the License at
                if (node != null) {
                log.warn("Can't load node for object '" + object.getName() + "'", e.getTargetException());
                DBNDatabaseNode node = model.findNode((DBSObject) object);
            } catch (DBException e) {
            } else if (editorNode != null) {

        {
        private final DBECommandContext commander;
                    }
import org.jkiss.code.Nullable;
import org.eclipse.ui.*;
            for (final IEditorReference editorRef : activePage.getEditorReferences()) {
    protected static class ObjectSaver implements DBRRunnableWithProgress {
import org.eclipse.jface.dialogs.IDialogConstants;
            }
        return new CommandTarget();
        }
            this.options = options;
public abstract class NavigatorHandlerObjectBase extends AbstractHandler {
    {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
        throws DBException
            }
                log.warn("Can't load node for objects " + missingObjects.size(), e.getTargetException());
        }
