        IWorkbench workbench = PlatformUI.getWorkbench();
            }
import org.jkiss.dbeaver.model.runtime.features.DBRFeature;
                    partActivated(activePart);
    @Override
                "view", ((IViewPart) part).getViewSite().getId()
    }
    }
        }
            if (activePage != null) {

    }

        }
 * distributed under the License is distributed on an "AS IS" BASIS,
            .forEach(page -> closePageProjectEditors(page, project));
    public void windowDeactivated(IWorkbenchWindow window) {
            .flatMap(window -> Arrays.stream(window.getPages()))

    @Override
    @Override

                return true;
    @Override
import org.jkiss.dbeaver.ui.UIUtils;
}

import org.eclipse.core.commands.ExecutionEvent;
    public void windowClosed(IWorkbenchWindow window) {
        IWorkbenchWindow activeWindow = workbench.getActiveWorkbenchWindow();
    public WorkbenchContextListener() {
    public static final String PERSPECTIVE_CONTEXT_ID = "org.jkiss.dbeaver.ui.perspective";
    // IPageListener
    }

        if (activeWindow != null) {
            windowActivated(activeWindow);
    }
    private void closeRemovedProjectsEditors(DBPProject project) {
        workbench.addWindowListener(this);

            public void postShutdown(IWorkbench workbench) {
    }
    @Override
 */
 * You may obtain a copy of the License at
    public void pageActivated(IWorkbenchPage page) {
        if (part instanceof IViewPart) {

import org.eclipse.ui.commands.ICommandService;
            }

        DBPPlatformDesktop.getInstance().getWorkspace().removeProjectListener(projectListener);
        public void notHandled(String commandId, NotHandledException exception) {
                if (contextService == null) {
                    contextService.deactivateContext(perspectiveActivation);


    @Override
    }
            if (commandService != null) {
            ));
 *
    static WorkbenchContextListener registerInWorkbench() {
                } else if (perspectiveActivation != null) {
                }
        }
        return new WorkbenchContextListener();
        }
    // IPartListener
 * See the License for the specific language governing permissions and


import org.jkiss.dbeaver.model.navigator.DBNNode;
                    perspectiveActivation = contextService.activateContext(PERSPECTIVE_CONTEXT_ID);
                    editor.dispose();
            ));
    }
        @Override
    /////////////////////////////////////////////////
 * TODO: add multipage editor listener and folder listener. Maybe use focus listener on control
                if (node != null && Objects.equals(project, node.getOwnerProject())) {
                }
 * Listens workbench parts activations/deactivation and activates contexts for navigator and SQL editors.
        // Register in already created windows and pages
            }
                pageActivated(activePage);

    @Override
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
                if (perspective.getId().equals(DBeaverPerspective.PERSPECTIVE_ID)) {
            @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
        for (IWorkbenchPage page : window.getPages()) {

                DBNNode node = nodeEditorInput.getNavigatorNode();
            } catch (PartInitException e) {
 * limitations under the License.
        DBPPlatformDesktop.getInstance().getWorkspace().addProjectListener(projectListener);
                input = editorReference.getEditorInput();
    @Override

            if (input instanceof NodeEditorInput nodeEditorInput) {
            // Register ds toolbar handler
            page.addPartListener(this);
    private void closePageProjectEditors(IWorkbenchPage page, DBPProject project) {
            @Override
public class WorkbenchContextListener implements IWindowListener, IPageListener, IPartListener {
            }
            public boolean preShutdown(IWorkbench workbench, boolean forced) {
        }
                commandService.addExecutionListener(commandExecutionListener);
    public void windowActivated(IWorkbenchWindow window) {
                if (activePart != null) {
        projectListener = new DBPProjectListener() {
import org.eclipse.core.commands.NotHandledException;

        });
 * WorkbenchContextListener.
 *

            public void perspectiveChanged(IWorkbenchPage page, IPerspectiveDescriptor perspective, String changeId) {
            public void perspectiveActivated(IWorkbenchPage page, IPerspectiveDescriptor perspective) {
    public void dispose() {
        }

import org.eclipse.ui.contexts.IContextService;
        window.addPerspectiveListener(perspectiveListener);
        IPerspectiveListener perspectiveListener = new IPerspectiveListener() {
    private final DBPProjectListener projectListener;
            IEditorInput input;
    public void partDeactivated(IWorkbenchPart part) {
            }
import org.jkiss.dbeaver.ui.editors.NodeEditorInput;
import org.eclipse.ui.*;

    public void partClosed(IWorkbenchPart part) {
        workbench.addWindowListener(this);
    public void partActivated(IWorkbenchPart part) {
        window.removePageListener(this);
 * Licensed under the Apache License, Version 2.0 (the "License");
        @Override
import org.jkiss.dbeaver.model.app.DBPProjectListener;
            }
                if (vr.getView(false) != null) {

    public void pageClosed(IWorkbenchPage page) {
 * DBeaver - Universal Database Manager
        listenWindowEvents(window);

        public void postExecuteFailure(String commandId, ExecutionException exception) {

            if (commandFeature != null) {
                UIUtils.asyncExec(() -> closeRemovedProjectsEditors(project));
            }
    }
import org.eclipse.core.commands.IExecutionListener;
    @Override
            IWorkbenchPage activePage = activeWindow.getActivePage();
import org.jkiss.code.NotNull;
        Arrays.stream(PlatformUI.getWorkbench().getWorkbenchWindows())
        page.removePartListener(this);

        EditorUtils.deactivatePartContexts(part);
            }
            listenWindowEvents(window);

/**
    public void partOpened(IWorkbenchPart part) {
        @Override
            @Override

            @Override
//        log.info(part.getClass().getSimpleName() + " DEACTIVATED: " + contextService.getActiveContextIds());
                commandFeature.use(event.getParameters());
                IContextService contextService = PlatformUI.getWorkbench().getService(IContextService.class);



    }

 *
    }
        };
            }

            @Override
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        {
        for (IWorkbenchWindow window : workbench.getWorkbenchWindows()) {

    }
        }
 *
        }
        if (part instanceof IViewPart) {
            }

    public void windowOpened(IWorkbenchWindow window) {

    @Override
            for (IViewReference vr : page.getViewReferences()) {
            perspectiveListener.perspectiveActivated(activePage, activePage.getPerspective());

 */
                    IEditorPart editor = editorReference.getEditor(false);
                }
        public void preExecute(String commandId, ExecutionEvent event) {
            private IContextActivation perspectiveActivation;
 * Copyright (C) 2010-2025 DBeaver Corp and others
                return;
    }
//        log.info(part.getClass().getSimpleName() + " ACTIVATED: " + contextService.getActiveContextIds());
        for (IEditorReference editorReference : page.getEditorReferences()) {

            final ICommandService commandService = workbench.getService(ICommandService.class);
        }
        };

    private void listenWindowEvents(IWorkbenchWindow window) {
    private static class CommandExecutionListener implements IExecutionListener {

import org.eclipse.core.commands.ExecutionException;
            window.getShell().addDisposeListener(e -> toolbarHandler.dispose());
    /////////////////////////////////////////////////
    /////////////////////////////////////////////////
            CoreFeatures.GENERAL_VIEW_CLOSE.use(Map.of(
import org.eclipse.ui.contexts.IContextActivation;

import org.jkiss.dbeaver.model.runtime.features.DBRFeatureRegistry;
        }

    }
import org.jkiss.dbeaver.ui.actions.datasource.DataSourceToolbarHandler;
    public void partBroughtToTop(IWorkbenchPart part) {
        window.addPageListener(this);
        }
import java.util.*;
        @Override

                    perspectiveActivation = null;
        }


    }
                CommandExecutionListener commandExecutionListener = new CommandExecutionListener();

import org.jkiss.dbeaver.ui.editors.EditorUtils;

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.perspective.DBeaverPerspective;
                    page.closeEditor(editor, false);
        workbench.addWorkbenchListener(new IWorkbenchListener() {
    }
    public void pageOpened(IWorkbenchPage page) {
    }
            CoreFeatures.GENERAL_VIEW_OPEN.use(Map.of(
        if (!registeredWindows.contains(window)) {
package org.jkiss.dbeaver.core;
    }
                    CoreFeatures.GENERAL_VIEW_OPEN.use(Map.of("view", vr.getId()));
    }
        page.addPartListener(this);
                }
                }
 * Unless required by applicable law or agreed to in writing, software
            public void handleProjectRemove(@NotNull DBPProject project) {
        EditorUtils.activatePartContexts(part);

                    return;
    @Override
        IWorkbenchPage activePage = window.getActivePage();
            }

                "view", ((IViewPart) part).getViewSite().getId()
    private final Set<IWorkbenchWindow> registeredWindows = new HashSet<>();
                CoreFeatures.GENERAL_SHOW_PERSPECTIVE.use(Map.of("perspective", perspective.getId()));
/*
        }
            registeredWindows.add(window);
        public void postExecuteSuccess(String commandId, Object returnValue) {
                IWorkbenchPart activePart = activePage.getActivePart();
                DesktopPlatform.setClosing(true);
            try {
            final DBRFeature commandFeature = DBRFeatureRegistry.getInstance().findCommandFeature(commandId);
            DataSourceToolbarHandler toolbarHandler = new DataSourceToolbarHandler(window);
import org.jkiss.dbeaver.model.app.DBPProject;

    // IWindowListener
        if (activePage != null) {
