            @Override
            dirty = true;

                }


    }
import org.jkiss.dbeaver.ui.editors.ILazyEditorInput;
            @Override
                    return;
            }
        var viewer = new NodeBreadcrumbViewer(parent, SWT.BOTTOM);
import org.jkiss.dbeaver.runtime.DBWorkbench;
                if (part instanceof IEditorPart editorPart) {
import jakarta.annotation.PostConstruct;

    }
        return false;
        if (dirty) {
            public void partActivated(IWorkbenchPart part) {
            public void propertyChanged(Object source, int propId) {
        for (IWorkbenchPage page : window.getPages()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
        var propertyListener = new IPropertyListener() {
        };
            public void pageOpened(IWorkbenchPage page) {
        var breadcrumbsVisible = BreadcrumbLocation.get(store) == BreadcrumbLocation.IN_STATUS_BAR;
    }

                    updateElementVisibility();
        IWorkbenchWindow window = UIUtils.getActiveWorkbenchWindow();
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
    }
import org.jkiss.dbeaver.ui.editors.INavigatorEditorInput;
                    break;
import org.jkiss.dbeaver.ui.editors.DatabaseEditorPreferences.BreadcrumbLocation;
    private static final String BREADCRUMBS_ID = "org.jkiss.dbeaver.core.ui.Breadcrumb"; //$NON-NLS-1$
            DBNModel navigatorModel = project.getNavigatorModel();
                // If activated, then part != lastEditorPart, otherwise part == lastEditorPart
                return true;
            }
    public void createControls(Composite parent) {
import org.jkiss.dbeaver.ui.navigator.breadcrumb.NodeBreadcrumbViewer;
        DBWorkbench.getPlatform().getPreferenceStore().addPropertyChangeListener(event -> {
                    return true;
        var store = DBWorkbench.getPlatform().getPreferenceStore();
import org.jkiss.dbeaver.DBeaverPreferences;
                DBNDatabaseNode node = navigatorModel.findNode(provider.getDataSourceContainer());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                if (shouldSetLastEditor) {
            if (project == null || !project.isOpen() || !project.isRegistryLoaded()) {
                    consumer.accept(node);
            }
        }
/*
    private static void installListeners(@NotNull BreadcrumbViewer viewer) {
import org.eclipse.ui.*;
        }
        var partListener = new AbstractPartListener() {
        }
import org.jkiss.dbeaver.ui.UIUtils;
                }

                    setInput(viewer, editorPart.getEditorInput());
import org.jkiss.code.Nullable;
            IEditorPart lastEditorPart;
                default:
    private static boolean tryExtractNode(@NotNull IEditorInput input, @NotNull Consumer<? super DBNNode> consumer) {
}
            }

 *
                }
    private static void updateElementVisibility(@NotNull WorkbenchWindow window) {
        installListeners(viewer);
                case DBeaverPreferences.UI_STATUS_BAR_SHOW_BREADCRUMBS:
        if (statusLineElement != null && statusLineElement.isToBeRendered() != statusLineVisible) {


            private void setLastEditorPart(@Nullable IEditorPart part, boolean activated) {
            }
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
 * limitations under the License.
        window.addPageListener(pageListener);
import org.eclipse.ui.internal.Workbench;
                    UIExecutionQueue.queueExec(() -> setLastEditorPart(editorPart, false));
 * Licensed under the Apache License, Version 2.0 (the "License");
                    lastEditorPart = null;
        var statusLineElement = modelService.find(WorkbenchWindow.STATUS_LINE_ID, model);
    private static final String BOTTOM_TRIM_ID = "org.eclipse.ui.trim.status"; //$NON-NLS-1$
    private static void setInput(@NotNull BreadcrumbViewer viewer, @NotNull IEditorInput input) {

                if (part instanceof IEditorPart editorPart) {
        }

import org.eclipse.e4.ui.workbench.modeling.EModelService;
            public void partClosed(IWorkbenchPart part) {
                    lastEditorPart = part;
                    viewer.setInput(null);

    @PostConstruct
        for (IWorkbenchWindow window : Workbench.getInstance().getWorkbenchWindows()) {

        };
            @Override
 *
import org.jkiss.dbeaver.model.app.DBPProject;
                    break;
            switch (event.getProperty()) {
            statusLineElement.setToBeRendered(statusLineVisible);
            page.addPartListener(partListener);
        if (breadcrumbsElement != null && breadcrumbsElement.isToBeRendered() != breadcrumbsVisible) {
            @Override
        var modelService = window.getService(EModelService.class);
                case DBeaverPreferences.UI_STATUS_BAR_SHOW_STATUS_LINE:
        UIUtils.asyncExec(BreadcrumbTrim::updateElementVisibility);
        var breadcrumbsElement = modelService.find(BREADCRUMBS_ID, model);

        }
            DBNNode node = navigatorEditorInput.getNavigatorNode();
import org.jkiss.dbeaver.ui.UIExecutionQueue;
        };
import org.jkiss.dbeaver.model.DBPDataSourceContainerProvider;
                boolean shouldSetLastEditor = activated && part != null;
package org.jkiss.dbeaver.ui.controls;
        if (viewer.getControl().isDisposed()) {
    private static void updateElementVisibility() {
                page.removePartListener(partListener);
import org.eclipse.swt.SWT;
 * Copyright (C) 2010-2025 DBeaver Corp and others
            MUIElement element = modelService.find(BOTTOM_TRIM_ID, model);

            return;
import java.util.function.Consumer;
            }
 * Unless required by applicable law or agreed to in writing, software

        }
    }
        var pageListener = new AbstractPageListener() {
                    lastEditorPart.addPropertyListener(propertyListener);
import org.jkiss.dbeaver.model.navigator.DBNModel;
import org.eclipse.swt.widgets.Composite;
        });
public class BreadcrumbTrim {
                if (node != null) {
                page.addPartListener(partListener);
            if (element != null && element.getWidget() instanceof Composite composite) {
 */
            }
            DBPProject project = lazyEditorInput.getProject();
                if (viewer.getControl() == null || viewer.getControl().isDisposed()) {
import org.jkiss.dbeaver.ui.actions.AbstractPageListener;
                composite.layout(true, true);
            dirty = true;
        if (input instanceof ILazyEditorInput lazyEditorInput && input instanceof DBPDataSourceContainerProvider provider) {
            }

                return false;
import org.eclipse.ui.internal.WorkbenchWindow;

                consumer.accept(node);
                }
            }
            viewer.setInput(null);
        var statusLineVisible = store.getBoolean(DBeaverPreferences.UI_STATUS_BAR_SHOW_STATUS_LINE);
 * you may not use this file except in compliance with the License.
            }
        if (input instanceof INavigatorEditorInput navigatorEditorInput) {
        var model = window.getModel();

 *
        }

                }
 * See the License for the specific language governing permissions and
            }
            public void pageClosed(IWorkbenchPage page) {
        }
            if (window instanceof WorkbenchWindow workbenchWindow) {
                    lastEditorPart.removePropertyListener(propertyListener);
                }
                }
                    UIExecutionQueue.queueExec(() -> setLastEditorPart(editorPart, true));

        }
                }
                    return;
    }
                if (propId != IEditorPart.PROP_INPUT && propId != IEditorPart.PROP_DIRTY) {
            breadcrumbsElement.setToBeRendered(breadcrumbsVisible);

            if (navigatorModel != null) {
                if (shouldRemoveLastEditor) {
        if (!tryExtractNode(input, viewer::setInput)) {
                    setInput(viewer, part.getEditorInput());
                if (source instanceof IEditorPart editorPart) {
import org.eclipse.e4.ui.model.application.ui.MUIElement;
        boolean dirty = false;
import org.jkiss.dbeaver.ui.controls.breadcrumb.BreadcrumbViewer;
            @Override
import org.jkiss.dbeaver.ui.AbstractPartListener;
                boolean shouldRemoveLastEditor = activated != (lastEditorPart == part) && lastEditorPart != null;
import org.jkiss.code.NotNull;

import org.jkiss.dbeaver.model.navigator.DBNNode;
            if (node != null) {
                updateElementVisibility(workbenchWindow);
