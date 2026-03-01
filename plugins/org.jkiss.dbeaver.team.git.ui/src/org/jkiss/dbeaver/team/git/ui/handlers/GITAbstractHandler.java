
import org.eclipse.core.resources.IProject;
            // cancels the scope operation
    }
                return SelectionUtils.getRepositoryOrWarn(new StructuredSelection(editorFile), shell);
            INavigatorModelView navigatorModelView = GeneralUtils.adapt(activePart, INavigatorModelView.class);
import org.eclipse.ui.IEditorPart;
                    return GitScopeUtil.getRelatedChanges(part, selectedResources);
import org.jkiss.dbeaver.model.app.DBPProject;
    }

 * See the License for the specific language governing permissions and
            ret.add(repositoryMapping.getRepository());
                }
            }

            }
            } else {
                DBNNode rootNode = navigatorModelView.getRootNode();
}
                return new Repository[0];

        return SelectionUtils.getSelectedResources(selection);
    protected IResource[] getResourcesInScope(ExecutionEvent event)
        if (selectedProjects.length > 0)
                if (selectedResources.length > 0) {
import org.eclipse.core.runtime.Adapters;
            } else {

    }
                // Some mappings (WorkingSetResourceMapping) return the projects

        }
            ResourceMapping.class)) {
        throws ExecutionException {
 *
 *
                return SelectionUtils.getRepositoryOrWarn(selection, shell);
        }
    private static <T> List<T> getSelectedAdaptables(ISelection selection,

        }
        IStructuredSelection selection = HandlerUtil.getCurrentStructuredSelection(event);
                    if (ownerProject instanceof RCPProject rcpProject) {
                    return new Repository[]{repository};
            }
                    IWorkbenchPart part = HandlerUtil.getActivePart(event);
                } else {
import org.eclipse.core.commands.AbstractHandler;
        } catch (Exception e) {
            Repository repo = Adapters.adapt(o, Repository.class);
                return SelectionUtils.getRepository(selection);
import org.eclipse.core.commands.ExecutionEvent;
        }
            return new Repository[0];
            RepositoryMapping repositoryMapping = RepositoryMapping
        return ret.toArray(new Repository[0]);

                // no repository found for one of the objects!
 *
        } else {
 * DBeaver - Universal Database Manager
                        return getRepositories(new StructuredSelection(rcpProject.getEclipseProject()));
    }
    }
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
                if (!(rootNode instanceof DBNRoot) && rootNode != null) {
                IResource[] selectedResources = getSelectedResources(event);
            IWorkbenchPart activePart = HandlerUtil.getActivePart(event);

                    result.add(adapter);
            if (mapping != null && (mapping.getContainer() instanceof IProject))
import org.eclipse.core.resources.IResource;
                ret.add((IProject) mapping.getContainer());
        if (selection.isEmpty()) {
                    return new IResource[0];
                List<IProject> projects = new ArrayList<>(Arrays.asList(mappedProjects));
 * limitations under the License.
        ret.addAll(extractProjectsFromMappings(selection));
    private static IProject[] getSelectedProjects(
import org.eclipse.swt.widgets.Shell;
            Iterator elements = ((IStructuredSelection) selection).iterator();
import org.jkiss.dbeaver.utils.GeneralUtils;
    protected Repository[] getRepositories(ExecutionEvent event) {
        }
    protected Repository getRepository(boolean warn, ExecutionEvent event) {
                // correspond to the order the user usually sees.
            return getRepositoriesFor(selectedProjects);
            IStructuredSelection selection = HandlerUtil.getCurrentStructuredSelection(event);
import org.jkiss.dbeaver.model.rcp.RCPProject;
                T adapter = Adapters.adapt(elements.next(), c);
        IProject[] selectedProjects = getSelectedProjects(selection);
import java.util.*;
            while (elements.hasNext()) {

            if (warn) {
import org.eclipse.jgit.lib.Repository;
        Set<IProject> ret = new LinkedHashSet<>();
        return ret.toArray(new IProject[0]);
            }
        IStructuredSelection selection) {
        for (IProject project : projects) {
        IStructuredSelection selection) {
            if (repositoryMapping == null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        }
                }
        if (activePart instanceof IEditorPart) {
            else
    private static Repository[] getRepositories(IStructuredSelection selection) {
    }
        }

                    return new IResource[]{editorFile};
                repos.add(repo);
            // ignore, we will not show the commit dialog in case the user

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            if (mappedProjects != null && mappedProjects.length != 0) {

        return getRepositories(selection);
import org.eclipse.ui.IWorkbenchPart;
                    DBPProject ownerProject = rootNode.getOwnerProject();

        for (ResourceMapping mapping : getSelectedAdaptables(selection,
            if (navigatorModelView != null) {
import org.eclipse.core.commands.ExecutionException;
        try {
    }
                // in unpredictable order. Sort them like the navigator to
import org.eclipse.jface.viewers.ISelection;
        Set<Repository> repos = new LinkedHashSet<>();
                    return new IResource[0];
        List<T> result;
            if (editorFile != null) {
public abstract class GITAbstractHandler extends AbstractHandler {
                    }
import org.eclipse.egit.core.project.RepositoryMapping;
            RepositoryMapping mapping = RepositoryMapping.getMapping(resource);

            if (editorFile != null) {
                                                     Class<T> c) {
import org.jkiss.dbeaver.ui.editors.EditorUtils;
        return result;
            IFile editorFile = EditorUtils.getFileFromInput(((IEditorPart) activePart).getEditorInput());

    private static Repository[] getRepositoriesFor(final IProject[] projects) {
                } else {
import org.jkiss.dbeaver.ui.navigator.INavigatorModelView;
import org.eclipse.egit.ui.internal.operations.GitScopeUtil;
        IStructuredSelection selection = HandlerUtil.getCurrentStructuredSelection(event);
        } else {
        if (activePart instanceof IEditorPart) {
            } else {
    protected IResource[] getSelectedResources(ExecutionEvent event) {
/*

import org.eclipse.core.resources.mapping.ResourceMapping;
                if (editorFile != null) {

        return repos.toArray(new Repository[0]);
        Shell shell = HandlerUtil.getActiveShell(event);
                }

            return null;
import org.eclipse.core.resources.IFile;
        if (selection != null && !selection.isEmpty()) {
            } else {
package org.jkiss.dbeaver.team.git.ui.handlers;
        Set<Repository> ret = new LinkedHashSet<>();
                projects.sort(CommonUtils.RESOURCE_NAME_COMPARATOR);
import org.jkiss.dbeaver.Log;
 */
            result = Collections.emptyList();
import org.eclipse.egit.ui.internal.selection.SelectionUtils;
        return ret;
            log.error(e);
            IFile editorFile = EditorUtils.getFileFromInput(((IEditorPart) activePart).getEditorInput());
    private static Set<IProject> extractProjectsFromMappings(
            }
                IFile editorFile = EditorUtils.getFileFromInput(((IEditorPart) activePart).getEditorInput());
        }
        for (IResource resource : getSelectedAdaptables(selection, IResource.class)) {
import org.jkiss.dbeaver.model.navigator.DBNNode;
import org.eclipse.egit.ui.internal.CommonUtils;
                Repository repository = SelectionUtils.getRepository(new StructuredSelection(editorFile));
                }
                return null;
        {

            }
            if (repo != null) {
    }
                if (repository != null) {
import org.eclipse.ui.handlers.HandlerUtil;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.jface.viewers.StructuredSelection;
        IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
                return new Repository[0];
        }
                }
        Set<IProject> ret = new LinkedHashSet<>();
 * you may not use this file except in compliance with the License.
            }
            result = new ArrayList<>();
    }
                if (adapter != null) {
            IProject[] mappedProjects = mapping.getProjects();
                .getMapping(project);
        for (Object o : selection.toArray()) {
            if (activePart instanceof IEditorPart) {
    // copied from EGist source to provide backward compatibility with older versions
        IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
import org.jkiss.dbeaver.model.navigator.DBNRoot;
    /////////////////////////////////////////////////////////////
import org.eclipse.jface.viewers.IStructuredSelection;
 *     http://www.apache.org/licenses/LICENSE-2.0
                ret.addAll(projects);
    private static final Log log = Log.getLog(GITAbstractHandler.class);
                return new IProject[0];
            }
        }
