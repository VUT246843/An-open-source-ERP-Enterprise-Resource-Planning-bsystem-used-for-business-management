                return null;
import org.eclipse.ui.*;
                return extractProject(activeEditor);
            if (activeEditor != null) {
import org.jkiss.dbeaver.model.navigator.DBNResource;

    public static IProject extractActiveProject(IWorkbenchWindow window) {
                return resource == null ? null : resource.getProject();
        return null;

import org.eclipse.core.resources.IProject;
        if (activePage != null) {
import org.eclipse.ui.handlers.HandlerUtil;
                }
 *

                    }
}
            IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
            if (input != null) {
import org.eclipse.core.commands.ExecutionEvent;
 * you may not use this file except in compliance with the License.
    }
            if (e instanceof DBNResource resNode) {

        IWorkbenchWindow workbenchWindow = serviceLocator == null ? null : serviceLocator.getService(IWorkbenchWindow.class);
 *
 * DBeaver - Universal Database Manager
            if (activePart != null) {
 *
                        return rcpProject.getEclipseProject();
                for (DBNNode n = node; n != null; n = n.getParentNode()) {
            IWorkbenchPart activePart = activePage.getActivePart();
        }
            }
        IProject project = GitUIUtils.extractProject(HandlerUtil.getCurrentSelection(event));
                    if (project != null) {
            IEditorPart activeEditor = activePage.getActiveEditor();
            DBNDatabaseNode node = dei.getNavigatorNode();
            } else {
                return null;
 * You may obtain a copy of the License at
    }
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.editors.EditorUtils;
import org.jkiss.code.NotNull;
            }
            }
            Object e = ss.getFirstElement();
                    }
    }
            IFile input = EditorUtils.getFileFromInput(editorInput);
        }
import org.jkiss.dbeaver.model.navigator.DBNNode;
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return project;
        }
    }
    public static IProject extractProject(ISelection selection) {
import org.jkiss.code.Nullable;
                }
        } else {
import org.eclipse.jface.viewers.ISelectionProvider;
package org.jkiss.dbeaver.team.git.ui.utils;
import org.jkiss.dbeaver.model.navigator.DBNProject;
        if (project == null) {
 * Copyright (C) 2019 Andrew Khitrin (ahitrin@gmail.com)
        IEditorInput editorInput = activeEditor.getEditorInput();
 */
            }
import org.jkiss.dbeaver.ui.editors.IDatabaseEditorInput;
    }
    @Nullable
            } else if (e instanceof DBNNode node) {
        }
                IResource resource = resNode.getResource();
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
                return rcpProject.getEclipseProject();
import org.eclipse.core.resources.IResource;
                        return project;
                return extractProject(activeEditor);

                if (selectionProvider != null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                    IProject project = extractProject(selectionProvider.getSelection());
            if (activeEditor != null) {

        return null;
                ISelectionProvider selectionProvider = activePart.getSite().getSelectionProvider();
                    if (n instanceof DBNProject projectNode && projectNode.getProject() instanceof RCPProject rcpProject) {
        }
import org.eclipse.core.resources.IFile;
                return input.getProject();
import org.eclipse.jface.viewers.ISelection;

        return GitUIUtils.extractActiveProject(workbenchWindow);
public class GitUIUtils {
 * Unless required by applicable law or agreed to in writing, software

            }
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (editorInput instanceof IDatabaseEditorInput dei) {
            }

 * distributed under the License is distributed on an "AS IS" BASIS,
    public static IProject extractProject(@NotNull IEditorPart activeEditor) {
        IWorkbenchPage activePage = window.getActivePage();
            return null;
import org.jkiss.dbeaver.model.rcp.RCPProject;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (selection != null && !selection.isEmpty() && selection instanceof IStructuredSelection ss) {
    public static IProject extractActiveProject(ExecutionEvent event) {
import org.eclipse.jface.viewers.IStructuredSelection;
            return null;
        } else {
            if (node != null && node.getOwnerProject() instanceof RCPProject rcpProject) {
        if (workbenchWindow == null || workbenchWindow.getActivePage() == null) {
/*
import org.eclipse.ui.services.IServiceLocator;
    public static IProject extractActiveProject(IServiceLocator serviceLocator) {
