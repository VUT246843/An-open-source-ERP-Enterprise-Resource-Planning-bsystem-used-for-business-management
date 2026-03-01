    static class CreateJob<OBJECT_TYPE extends DBSObject, CONTAINER_TYPE extends DBPObject> extends AbstractJob {
            @NotNull OBJECT_TYPE newObject
        private final DBEObjectMaker<OBJECT_TYPE, CONTAINER_TYPE> objectMaker;
            this.sourceObject = sourceObject;
                        monitor.worked(2);
 * You may obtain a copy of the License at
                throw new DBException("Can't detect container for '" + element.getNodeDisplayName() + "'");
                openEditor);
                            if (newChild != null) {
                    throw new DBException("Can't determine child element type for container '" + container + "'");

 * you may not use this file except in compliance with the License.
    }


                        // Refresh new object (so it can load some props from database)
            }
import org.eclipse.ui.IEditorPart;
import java.lang.reflect.InvocationTargetException;
            }
import org.jkiss.dbeaver.ui.editors.IDatabaseModellerEditor;
                    }
            this.objectMaker = objectMaker;
import org.jkiss.dbeaver.model.DBPRefreshableObject;
                } catch (InterruptedException e) {
        public void run(DBRProgressMonitor monitor) throws InvocationTargetException {
                    container = parentNode;
            final boolean openEditor = dataSource != null &&
                case DBNProjectDatabases dbs -> container.getOwnerProject();
import org.jkiss.dbeaver.ui.editors.IDatabaseEditor;
import org.jkiss.dbeaver.model.DBPDataSource;
                            if (parentObject instanceof DBSInstanceLazy) {
                case DBNDatabaseNode dbNode -> dbNode.getValueObject();
                            final DBNDatabaseNode newChild = DBWorkbench.getPlatform().getNavigatorModel().findNode(newObject);
                container,
                monitor.done();
                    });
                } catch (InvocationTargetException e) {
                    if (editor != null) {
            @NotNull CommandTarget commandTarget,
                            newChild,
            }
                        }
                            editorInput,

            return;
                    } else if (openEditor) {

                                newObject = (OBJECT_TYPE) newChild.getObject();
                container = element;

                return Status.CANCEL_STATUS;//GeneralUtils.makeErrorStatus("Null object returned");
                case DBNLocalFolder folder -> folder.getFolder();
 * DBeaver - Universal Database Manager
            return;
            return;
                        parentObject instanceof DBSObject dbsObject &&
 */
                });
            }
            DBEObjectMaker objectMaker = (DBEObjectMaker) objectManager;
            monitor.beginTask("Create new database object", 1);
            // Do not check for type - manager must do it. Potentially we can copy anything into anything.
                commandTarget,

        try {
//            if (sourceObject != null && !childType.isAssignableFrom(sourceObject.getClass())) {
                    UIUtils.runInProgressService(monitor -> {
            this.objectMaker = objectMaker;
                    IDatabaseEditor editor = commandTarget.getEditor();
                        // New object editors must open main editor
                case DBNProject project -> project.getProject();
        private OBJECT_TYPE newObject;
                addJobChangeListener(new JobChangeAdapter() {
                    for (int i = 0; i < 50; i++) {
 *
                editorNode = editorInput.getNavigatorNode();
            this.commandTarget = commandTarget;
}            } else {
            }

                try {
        }
        }
                            break;
                throw new DBException("Object manager not found for type '" + newObjectType.getName() + "'");
            setSystem(false);
import org.jkiss.dbeaver.ui.editors.entity.EntityEditorDescriptor;
            //DBWorkbench.getPlatformUI().showError("Null new object", "Internal error during object creation: NULL object returned (see logs).");
            CommandTarget commandTarget = getCommandTarget(

            DBNDatabaseNode editorNode = null;
            try {
                            commandTarget.getContext());
            IEditorPart activeEditor = workbenchWindow.getActivePage().getActiveEditor();
        } catch (InterruptedException e) {
            createDatabaseObject(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                            EntityEditor.class.getName());
                }
        try {
                    @Override
            if (container.hasChildren(false) || parentObject instanceof DBSInstanceLazy) {
import org.jkiss.dbeaver.model.struct.DBSObject;
        @Override
        private OBJECT_TYPE newObject;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
 * Unless required by applicable law or agreed to in writing, software

import org.eclipse.core.resources.IProject;
                            if (finalContainer.hasChildren(false)) {
            @Nullable DBSObject sourceObject,
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
                            monitor.worked(1);

                            monitor.subTask("Load object from server");
        private final CommandTarget commandTarget;
import org.jkiss.code.NotNull;
package org.jkiss.dbeaver.ui.navigator.actions;
                DBNNode parentNode = element.getParentNode();
        @Override
                    // ignore

                        DatabaseNodeEditorInput editorInput = new DatabaseNodeEditorInput(
import org.jkiss.dbeaver.ui.UIUtils;
                    monitor.subTask("Obtain new object node");

                return Status.OK_STATUS;
                        // Just activate existing editor
            Map<String, Object> options = new HashMap<>();
        final CreateJob<OBJECT_TYPE, CONTAINER_TYPE> job = new CreateJob<>(commandTarget, objectMaker, parentObject, sourceObject, objectCreator.newObject);
                        newNode = DBWorkbench.getPlatform().getNavigatorModel().findNode(newObject);
                    public void done(IJobChangeEvent event) {
import org.jkiss.dbeaver.ui.editors.entity.EntityEditor;
                        }
            // Parent is model object - not node

                    }
                            throw new InvocationTargetException(e);
                        (objectMaker.getMakerOptions(dbsObject.getDataSource()) & DBEObjectMaker.FEATURE_EDITOR_ON_CREATE) != 0;
                options
                }
                    }
            monitor.beginTask("Save " + newObject.getClass().getSimpleName(), 3);
            @Nullable CONTAINER_TYPE parentObject,
                        });
                monitor.done();
                    DatabaseNavigatorView view = UIUtils.findView(workbenchWindow, DatabaseNavigatorView.class);
                DBWorkbench.getPlatformUI().showError("Create object", null, e);
            this.parentObject = parentObject;
                        editorInput.setDefaultPageId(EntityEditorDescriptor.DEFAULT_OBJECT_EDITOR_ID);
                        workbenchWindow.getActivePage().activate(editor);
                            break;

                if (childType == null) {
                    throw new DBException("Can't find node corresponding to new object");
            DBWorkbench.getPlatformUI().showError("Create object", null, e);
        ObjectCreator<OBJECT_TYPE, CONTAINER_TYPE> objectCreator = new ObjectCreator<>(objectMaker, commandTarget, parentObject, sourceObject, options);
        @NotNull
            if (workbenchWindow.getActivePage().getActivePart() == activeEditor &&
        @Nullable CONTAINER_TYPE parentObject,
                activeEditor.getAdapter(IDatabaseModellerEditor.class) != null &&
                    if (view != null) {
                        commandTarget.getContext().saveChanges(monitor, DBPScriptObject.EMPTY_OPTIONS);
            } catch (Exception e) {
            } finally {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                        view.showNode(newChild);
            }
            DBPDataSource dataSource = container instanceof DBNDatabaseNode dbNode ? dbNode.getDataSource() : null;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.edit.DBEObjectManager;
    protected boolean createNewObject(final IWorkbenchWindow workbenchWindow, DBNNode element, DBNDatabaseNode copyFrom) {
                                ((DBSInstanceLazy) parentObject).checkInstanceConnection(monitor);
import org.eclipse.core.runtime.Status;
                return GeneralUtils.makeExceptionStatus(e);
        } catch (InvocationTargetException e) {
                        }
        private final DBSObject sourceObject;
                {
            {

import org.jkiss.dbeaver.model.navigator.*;
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * limitations under the License.
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
            } catch (DBException e) {
        private void openNewObject(@Nullable DBNDatabaseNode newChild) {
                            openNewObject(newNode);
        private final Map<String, Object> options;
        return true;
            DBNNode container = null;
                        UIUtils.syncExec(() -> {
            DBEObjectManager<?> objectManager = DBWorkbench.getPlatform().getEditorsRegistry().getObjectManager(newObjectType);

        private DBNDatabaseNode newNode = null;
            if (newObjectType == null) {
                        }
            UIUtils.runInProgressService(objectCreator);

import org.jkiss.dbeaver.runtime.DBWorkbench;
                // Open object in UI thread
            IWorkbenchWindow workbenchWindow = UIUtils.getActiveWorkbenchWindow();
            try {
import org.jkiss.dbeaver.ui.editors.DatabaseNodeEditorInput;
        }
                if (parentNode instanceof DBNContainer) {
                monitor.subTask("Create object instance");
import org.jkiss.dbeaver.model.runtime.AbstractJob;
        }
import org.eclipse.ui.IWorkbenchWindow;
        if (objectCreator.newObject == null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                        if (newObject instanceof DBPRefreshableObject) {
                        // Open new one with existing context
                if (parentObject instanceof DBSObject) {
                        try {

import org.eclipse.core.runtime.IStatus;
        private final DBSObject sourceObject;
            this.newObject = newObject;

        protected IStatus run(@NotNull DBRProgressMonitor monitor) {
    }
            this.parentObject = parentObject;
            this.sourceObject = sourceObject;
import org.jkiss.dbeaver.utils.RuntimeUtils;
                    final boolean openEditor =
            this.commandTarget = commandTarget;
import org.jkiss.dbeaver.DBException;
    ) {
            };
                            }
            options.put(DBEObjectManager.OPTION_ACTIVE_EDITOR, activeEditor);
                            }
import org.jkiss.dbeaver.model.edit.DBEObjectMaker;
        }
            if (container == null) {
            } finally {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBPScriptObject;
    private <OBJECT_TYPE extends DBSObject, CONTAINER_TYPE extends DBPObject> void createDatabaseObject(
public abstract class NavigatorHandlerObjectCreateBase extends NavigatorHandlerObjectBase {
        @Nullable DBSObject sourceObject,
                            }
import java.util.HashMap;
            final Object parentObject = switch (container) {
                        if (newNode != null) {
                default -> null;
                    monitor.worked(1);
                        RuntimeUtils.pause(100);
//                throw new DBException("Can't create '" + childType.getName() + "' from '" + sourceObject.getClass().getName() + "'");
        }
                editorNode,
        @NotNull CommandTarget commandTarget,
        }
                        // Save object manager's content

        private final DBEObjectMaker<OBJECT_TYPE, CONTAINER_TYPE> objectMaker;
                // We are in model editor.
 * See the License for the specific language governing permissions and
                Class<?> childType = container instanceof DBNContainer ? ((DBNContainer) container).getChildrenClass() : null;

                return NavigatorHandlerProjectCreate.createNewProject(workbenchWindow);
            if (newObject == null) {
                                finalContainer.getChildren(monitor);
                parentObject instanceof DBPObject ? (DBPObject) parentObject : null,
            }
            if (isFolder || (element instanceof DBNContainer && !(element instanceof DBNDataSource))) {
import org.jkiss.dbeaver.model.DBPObject;
        private final CommandTarget commandTarget;
 *
        }
                throw new InvocationTargetException(e);
                throw new DBException("Object create not available in simple view mode");
                if (newChild != null) {
            );
                }
                    }
            }
        @NotNull DBEObjectMaker<OBJECT_TYPE, CONTAINER_TYPE> objectMaker,
                (objectMaker.getMakerOptions(dataSource) & DBEObjectMaker.FEATURE_EDITOR_ON_CREATE) != 0;
                newObject = objectMaker.createNewObject(monitor, commandTarget.getContext(), parentObject, sourceObject, options);
//            }
 *
import org.jkiss.dbeaver.ui.editors.IDatabaseEditorInput;
                    DBNNode finalContainer = container;
                activeEditor.getEditorInput() instanceof IDatabaseEditorInput editorInput)
            options.put(DBEObjectManager.OPTION_OBJECT_TYPE, newObjectType);
import java.util.Map;

                    DBWorkbench.getPlatformUI().showError("New object", "Error creating new object", e);
        @NotNull Map<String, Object> options
                }
            // Check that child nodes are read an cached
                objectMaker,
                                newChild.refreshNode(monitor, this);
/*

    }
            if (newObjectType == IProject.class) {
        catch (Throwable e) {

                activeEditor.getAdapter(IDatabaseModellerEditor.class).isModelEditEnabled() &&
    {
        ) {
                newObjectType = childType;
                } else {
            }
            }
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorView;
                        workbenchWindow.getActivePage().openEditor(
                }
            options.put(DBEObjectManager.OPTION_CONTAINER, container);
                        } catch (DBException e) {
            return false;
import org.jkiss.dbeaver.model.struct.DBSInstanceLazy;
                        if (monitor.isCanceled()) {
import org.jkiss.code.Nullable;
            setUser(true);
    protected boolean createNewObject(final IWorkbenchWindow workbenchWindow, DBNNode element, @Nullable Class<?> newObjectType, DBNDatabaseNode copyFrom, boolean isFolder)
        job.schedule();
            DBSObject sourceObject = copyFrom == null ? null : copyFrom.getObject();
        private final CONTAINER_TYPE parentObject;
    }
import org.jkiss.dbeaver.utils.GeneralUtils;
            @NotNull DBEObjectMaker<OBJECT_TYPE, CONTAINER_TYPE> objectMaker,
                    }
                    if ((objectMaker.getMakerOptions(((DBSObject) parentObject).getDataSource()) & DBEObjectMaker.FEATURE_SAVE_IMMEDIATELY) != 0) {
        ObjectCreator(DBEObjectMaker<OBJECT_TYPE, CONTAINER_TYPE> objectMaker, CommandTarget commandTarget, CONTAINER_TYPE parentObject, DBSObject sourceObject, Map<String, Object> options) {
                workbenchWindow,

            }
    private static class ObjectCreator<OBJECT_TYPE extends DBSObject, CONTAINER_TYPE extends DBPObject> implements DBRRunnableWithProgress {
        return createNewObject(workbenchWindow, element, null, copyFrom, false);
        public CreateJob(
                }
            }
            if (objectManager == null) {
        }
            super("Create new database object with " + objectMaker.getClass().getSimpleName());
        private final CONTAINER_TYPE parentObject;
            } catch (Throwable e) {
import org.jkiss.dbeaver.ui.actions.ObjectPropertyTester;
    }
            if (container instanceof DBNDatabaseNode && ObjectPropertyTester.isMetadataChangeDisabled((DBNDatabaseNode) container)) {
                sourceObject,
            this.options = options;
            try {
                        monitor.subTask("Save object");
            DBWorkbench.getPlatformUI().showError("New object", "Error creating new object", e);
                    // Wait for a few seconds to let listeners to add new object's node in navigator node
                newObjectType,
