                }
            pageListener.pageOpened(page);
                }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                updateToolbar();
                //DBPDataSourceContainer newContainer = EditorUtils.getFileDataSource(activeFile);
        activePart = part;
    }
    }
 * you may not use this file except in compliance with the License.
        handledRegistries.clear();
                //DBPDataSourceContainer visibleContainer = DataSourceToolbarUtils.getCurrentDataSource(workbenchWindow);
        pageListener = new AbstractPageListener() {
            return;
                    setActivePart(null);
import org.jkiss.dbeaver.ui.editors.EditorUtils;
            }

            registry.removeDataSourceListener(this);
        this.workbenchWindow = workbenchWindow;
        registry.removeDataSourceListener(this);

            ) {
import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;
                page.removeSelectionListener(selectionListener);
}        partListener = new AbstractPartListener() {
 *
            @Override
    }
                        ((WorkbenchWindow) workbenchWindow).updateActionBars();
                    if (RuntimeUtils.getObjectAdapter(element, DBSObject.class) != null) {
    public void handleDataSourceEvent(@NotNull final DBPEvent event) {

            public void partActivated(IWorkbenchPart part) {
            );
        }
            UIUtils.asyncExec(
            }
    private IWorkbenchPart activePart;
                    }
    private void updateToolbar() {
            DataSourceToolbarUtils.triggerRefreshReadonlyElement();
 * Copyright (C) 2010-2025 DBeaver Corp and others
            IEditorInput editorInput = activeEditor.getEditorInput();
                handleRegistryLoad(registry);
    @Override
            }
                }
                && event.getData() == currentDataSource.getRegistry()) ||
import org.jkiss.dbeaver.utils.RuntimeUtils;
                page.addSelectionListener(selectionListener);
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ui.AbstractPartListener;
            }
            // We'll miss a lot of DBP events because  we'll be activated only after UI will be instantiated
                () -> {
            return;
 * limitations under the License.
                page.addPartListener(partListener);
    private IPartListener partListener;
            @Override
        final DBNNode node = event.getNode();
    @Override
                page.removePartListener(partListener);
        IEditorPart activeEditor = activePage.getActiveEditor();
 * Licensed under the Apache License, Version 2.0 (the "License");
            // Register as datasource listener in all datasources
        if (this.pageListener != null) {
            }
            DataSourceProviderRegistry.getInstance().addDataSourceRegistryListener(this);

        });

 * You may obtain a copy of the License at


        DBPDataSourceContainer currentDataSource = DataSourceToolbarUtils.getCurrentDataSource(workbenchWindow);
                        updateToolbar();
        DataSourceToolbarUtils.refreshSelectorToolbar(workbenchWindow);
            (event.getAction() == DBPEvent.Action.OBJECT_SELECT && Boolean.TRUE.equals(event.getEnabled()) &&
 */
                    if (workbenchWindow instanceof WorkbenchWindow) {
import org.jkiss.dbeaver.ui.UIExecutionQueue;
import org.jkiss.dbeaver.model.struct.DBSObject;
        IWorkbenchPage activePage = workbenchWindow.getActivePage();
import org.jkiss.dbeaver.ui.UIUtils;
public class DataSourceToolbarHandler implements DBPRegistryListener, DBPEventListener, INavigatorListener {
    }
        }
                if (navigatorNode != null && navigatorNode.isChildOf(node)) {
            }
        {
    private final IWorkbenchWindow workbenchWindow;
        if ((event.getAction() == DBPEvent.Action.OBJECT_UPDATE && event.getObject() == currentDataSource) ||
import org.jkiss.dbeaver.model.DBUtils;
                DBUtils.getContainer(event.getObject()) == currentDataSource)
        }
import org.jkiss.dbeaver.model.app.DBPRegistryListener;

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.runtime.DBWorkbench;
                setActivePart(part);
                final Object element = ((IStructuredSelection) selection).getFirstElement();
            updateToolbar();

        };


        final ISelectionListener selectionListener = (part, selection) -> {
 * DBeaver - Universal Database Manager
            DataSourceToolbarUtils.triggerRefreshReadonlyElement();
        }
        handledRegistries.remove(registry);
            for (DBPDataSourceRegistry registry : DBUtils.getAllRegistries(false)) {
        DBWorkbench.getPlatform().getNavigatorModel().addListener(this);
    }
    private IPageListener pageListener;
                this::updateToolbar
        };
        if (workbenchWindow.getWorkbench().isClosing()) {
            (event.getAction() == DBPEvent.Action.OBJECT_UPDATE && currentDataSource != null
            }
package org.jkiss.dbeaver.ui.actions.datasource;
import org.jkiss.code.Nullable;
            UIUtils.asyncExec(
    public void handleRegistryUnload(@NotNull DBPDataSourceRegistry registry) {
import org.jkiss.dbeaver.ui.actions.AbstractPageListener;
import org.jkiss.code.NotNull;
        }
    @Override
                DBNNode navigatorNode = ((INavigatorEditorInput) editorInput).getNavigatorNode();
        // TODO: replace with something smarter
            }

        workbenchWindow.addPageListener(pageListener);
    private final List<DBPDataSourceRegistry> handledRegistries = new ArrayList<>();
import org.jkiss.dbeaver.ui.editors.INavigatorEditorInput;
        for (DBPDataSourceRegistry registry : this.handledRegistries) {
 *
        }
            this.pageListener = null;
    public void nodeChanged(DBNEvent event) {
                    }
            }

 *
        // but in fact it doesn't. I don't know better way than trigger update explicitly.
import org.jkiss.dbeaver.model.navigator.DBNNode;
        UIUtils.asyncExec(DataSourceToolbarUtils::triggerRefreshReadonlyElement);
            this.workbenchWindow.removePageListener(this.pageListener);
        DataSourceToolbarUtils.triggerRefreshReadonlyElement();


            );
                }
                if (element != null) {
        if (activeEditor == null) {
    public void dispose() {
    public DataSourceToolbarHandler(IWorkbenchWindow workbenchWindow) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.model.navigator.DBNEvent;
            if (editorInput instanceof INavigatorEditorInput) {
        UIExecutionQueue.queueExec(() -> {
import org.jkiss.dbeaver.model.DBPEvent;
        }
            if (activeFile.equals(((DBNResource) node).getResource())) {
            //DataSourcePropertyTester.firePropertyChange(DataSourcePropertyTester.PROP_TRANSACTIONAL);
            public void partClosed(IWorkbenchPart part) {
            @Override
            // We need it because at this moment there could be come already loaded registries (on startup)
        if (node instanceof DBNResource) {
            @Override



                    updateToolbar();
                return;
import org.jkiss.dbeaver.model.DBPEventListener;

            //DataSourcePropertyTester.firePropertyChange(DataSourcePropertyTester.PROP_CONNECTED);

            public void pageClosed(IWorkbenchPage page) {
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
import java.util.ArrayList;
import org.jkiss.dbeaver.model.navigator.DBNResource;
        }
            return;
            DataSourceToolbarUtils.triggerRefreshReadonlyElement();
            updateToolbar();
        handledRegistries.add(registry);
            if (activeFile == null) {
    public void setActivePart(@Nullable IWorkbenchPart part) {
            public void pageOpened(IWorkbenchPage page) {
        if (event.getAction() == DBPEvent.Action.OBJECT_UPDATE && event.getEnabled() != null) {
        registry.addDataSourceListener(this);
                if (part == activePart) {
    }
    }

import org.eclipse.jface.viewers.IStructuredSelection;
        } else {
import java.util.List;
            if (part == activePart && part instanceof IEditorPart && selection instanceof IStructuredSelection) {
        };

import org.jkiss.dbeaver.model.navigator.INavigatorListener;
import org.eclipse.core.resources.IFile;
 *     http://www.apache.org/licenses/LICENSE-2.0
        for (IWorkbenchPage page : workbenchWindow.getPages()) {
        // This is a hack. We need to update main toolbar. By design toolbar should be updated along with command state
    public void handleRegistryLoad(@NotNull DBPDataSourceRegistry registry) {
        }
 * See the License for the specific language governing permissions and
import org.eclipse.ui.*;

    @Override
    }
/*
            // So we need to update toolbar explicitly right after UI will initialize
import org.eclipse.ui.internal.WorkbenchWindow;
        DBWorkbench.getPlatform().getNavigatorModel().removeListener(this);
        }
        if (activePage == null) {
        DataSourceProviderRegistry.getInstance().removeDataSourceRegistryListener(this);
            IFile activeFile = EditorUtils.getFileFromInput(activeEditor.getEditorInput());
