                        databaseEditor.refreshPart(
        LOAD
        } else {
import org.jkiss.dbeaver.model.navigator.*;
    private DBNNode getEditorNode() {
            } else if (databaseEditorInput.getNavigatorNode() != null) {

                dataSourceContainer.acquire(databaseEditor);
 */
    }
        // Acquire datasource
                    if (workbenchPage != null) {
                if (strategy == Strategy.LOAD) {
                    DBWorkbench.getPlatform().getPreferenceStore().getBoolean(DatabaseEditorPreferences.PROP_KEEP_EDITORS_ON_DISCONNECT) &&
    public void nodeChanged(final DBNEvent event) {
/**
        if (isValuableNode(event.getNode())) {
                    IWorkbenchPage workbenchPage = workbenchWindow.getActivePage();
        } else if (input instanceof IDatabaseEditorInput databaseEditorInput) {
        }
                }
            return lazyEditorInput.getNodePath();
        if (input instanceof DatabaseLazyEditorInput lazyEditorInput) {
                } else if (event.getNodeChange() == DBNEvent.NodeChange.UNLOAD) {
                    dispose();
 * Copyright (C) 2010-2024 DBeaver Corp and others
                if (workbenchWindow != null) {
 * See the License for the specific language governing permissions and
        CLOSE,
            return path != null && path.equals(other.getNodeUri());
        DBWorkbench.getPlatform().getNavigatorModel().addListener(this);
                            event,
                    strategy = Strategy.UNLOAD;
                if (DBWorkbench.getPlatform().isShuttingDown()) {
            final String path = getEditorNodePath();
    private boolean isSameNode(@NotNull DBNNode other) {
    private final IDatabaseEditor databaseEditor;
 * limitations under the License.
 *
            if (dataSourceContainer != null) {
        this.databaseEditor = databaseEditor;
        if (editorNode != null) {
        }
                if (event.getNodeChange() == DBNEvent.NodeChange.REFRESH ||
import org.jkiss.dbeaver.runtime.DBWorkbench;
            dataSourceContainer = null;
                        strategy = Strategy.LOAD;
        }
                IWorkbenchWindow workbenchWindow = databaseEditor.getSite().getWorkbenchWindow();
 *
        }
}            return editorNode == other;
                    }


import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        }

        if (editorNode != null) {
    DatabaseEditorListener(IDatabaseEditor databaseEditor) {
        // Remove node listener
    @Nullable
        if (dataSourceContainer != null) {
                strategy = Strategy.CLOSE;

                    // Do not update editors during shutdown, just remove listeners
    private enum Strategy {
            dataSourceContainer.release(databaseEditor);
            Strategy strategy = Strategy.DO_NOTHING;
public class DatabaseEditorListener implements INavigatorListener {
        } else {
                if (strategy == Strategy.UNLOAD &&
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.ui.IWorkbenchPage;
            if (event.getAction() == DBNEvent.Action.REMOVE) {
 * DBeaver - Universal Database Manager
    public void dispose() {
            if (databaseEditorInput.getDatabaseObject() instanceof DBPDataSourceContainer container) {
                }
    @Override
    }
                    } else if (event.getNodeChange() == DBNEvent.NodeChange.LOAD && event.getNode() instanceof DBNDataSource) {
    @Nullable
            }
 * You may obtain a copy of the License at

            return null;
    private String getEditorNodePath() {
                            event.getNodeChange() == DBNEvent.NodeChange.REFRESH &&
        IEditorInput editorInput = databaseEditor.getEditorInput();
        }


                dataSourceContainer = container;
                    return;
                    return;
            return navigatorEditorInput.getNavigatorNode();
        DO_NOTHING,
import org.jkiss.code.Nullable;

        final DBNNode editorNode = getEditorNode();
            }
                    if (isSameNode(event.getNode())) {
                dataSourceContainer = databaseEditorInput.getNavigatorNode().getDataSourceContainer();
    }
            return null;

        DBWorkbench.getPlatform().getNavigatorModel().removeListener(this);
import org.eclipse.ui.IWorkbenchWindow;
        }
            } else if (event.getAction() == DBNEvent.Action.UPDATE) {
        // Register node listener
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
        if (editorInput instanceof IDatabaseEditorInput databaseEditorInput) {
        final DBNNode editorNode = getEditorNode();
package org.jkiss.dbeaver.ui.editors;
    }
                }
            DBNDatabaseNode navigatorNode = databaseEditorInput.getNavigatorNode();
                            event.getSource() == DBNEvent.FORCE_REFRESH);
        // Release datasource
                    return;
 * distributed under the License is distributed on an "AS IS" BASIS,
        final IEditorInput input = databaseEditor.getEditorInput();
            }
 * DatabaseEditorListener
            return navigatorNode == null ? null : navigatorNode.getNodeUri();
        final IEditorInput input = databaseEditor.getEditorInput();
        UNLOAD,
                    event.getNodeChange() == DBNEvent.NodeChange.LOAD) {

            return editorNode == node || editorNode.isChildOf(node);
 * you may not use this file except in compliance with the License.
        } else {
import org.jkiss.code.NotNull;
                    if (databaseEditor instanceof ILazyEditor) {
 */
                ) {
            final String path = getEditorNodePath();
 * Unless required by applicable law or agreed to in writing, software
    }
                    }
            if (strategy != Strategy.DO_NOTHING) {
                        workbenchPage.closeEditor(databaseEditor, false);
                }
                    }
    }
/*
                }

                    databaseEditor instanceof ILazyEditor && ((ILazyEditor) databaseEditor).unloadEditorInput()
        if (input instanceof INavigatorEditorInput navigatorEditorInput) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
            return path != null && path.startsWith(node.getNodeUri());
        } else {

                        ((ILazyEditor) databaseEditor).loadEditorInput();

import org.eclipse.ui.IEditorInput;
    }
    private boolean isValuableNode(@NotNull DBNNode node) {
 *

    private DBPDataSourceContainer dataSourceContainer;
