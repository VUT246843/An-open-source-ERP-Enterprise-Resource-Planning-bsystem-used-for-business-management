

            return FEATURE_OPEN | FEATURE_DELETE | FEATURE_RENAME;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * ERD resource handler

import org.eclipse.core.runtime.CoreException;
        }
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorStandalone;
            }
            throw new DBException("Can't detect folder for diagram");
 * Copyright (C) 2010-2025 DBeaver Corp and others
        ResourceUtils.checkFolderExists(folder, monitor);
        }
        final String title,
import org.jkiss.code.NotNull;


import org.eclipse.core.resources.IFile;
 * limitations under the License.
    public static IFile createDiagram(
            DBRRunnableWithProgress runnable = monitor1 -> {
        try {
                if (projectMeta == null) {
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;

                }
        if (folder == null) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    @Override
        } catch (InterruptedException e) {
import org.jkiss.dbeaver.utils.ResourceUtils;
                IResource iResource = resource.getResource();

 * DBeaver - Universal Database Manager
        return super.getAssociatedDataSources(resource);
        } else {
                } catch (Exception e) {
                runnable.run(monitor);
        }
        final IFile file = ResourceUtils.getUniqueFile(folder, CommonUtils.escapeFileName(title), ERD_EXT);
            } else {
}
import java.io.ByteArrayInputStream;
                    try (InputStream is = ((IFile) iResource).getContents()) {
/*

        }
    {
public class ERDResourceHandler extends AbstractResourceHandler {
import java.util.List;

        } catch (InvocationTargetException e) {
import org.jkiss.dbeaver.ui.UIUtils;
        if (resource instanceof IFolder) {
import org.jkiss.dbeaver.model.erd.ERDPersistedState;
        if (resource instanceof IFolder) {
                throw new DBException("Can't obtain folder for diagram", e);
    private static final String ERD_EXT = "erd"; //$NON-NLS-1$
                    String diagramState = DiagramLoader.serializeDiagram(monitor1, null, newDiagram, false, false);
        UIUtils.getActiveWorkbenchWindow().getActivePage().openEditor(
                if (iResource instanceof IFile) {
import org.eclipse.core.resources.IResource;
                    newDiagram.setLayoutManualAllowed(true);

        FileEditorInput erdInput = new FileEditorInput((IFile)resource);
    }
        } else {

 * Licensed under the Apache License, Version 2.0 (the "License");
            } catch (CoreException e) {
            }

import org.jkiss.dbeaver.Log;
                    }
                            copyFrom.copy();
            };
            try {
    }
import org.jkiss.dbeaver.ui.editors.erd.model.ERDDecoratorDefault;
        if (resource instanceof IFile) {
import org.jkiss.dbeaver.model.navigator.DBNNode;
import org.eclipse.ui.part.FileEditorInput;
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
                    iResource.getProject());
    public void openResource(@NotNull final IResource resource) throws CoreException, DBException
                    InputStream data = new ByteArrayInputStream(diagramState.getBytes(StandardCharsets.UTF_8));
 */
    private static final Log log = Log.getLog(ERDResourceHandler.class);
                        return ERDPersistedState.extractContainers(projectMeta, is);
import java.util.Collections;
import org.jkiss.code.Nullable;
                return null;
    @Override

            return "diagram folder";
    }
            // interrupted
                folder = getDiagramsFolder(DBWorkbench.getPlatform().getWorkspace().getActiveProject(), true);
                }
import org.jkiss.dbeaver.ui.resources.AbstractResourceHandler;
                    newDiagram.setLayoutManualDesired(true);
import org.jkiss.dbeaver.ui.editors.erd.model.ERDContentProviderDecorated;
                            new EntityDiagram(null, "<Diagram>", new ERDContentProviderDecorated(), new ERDDecoratorDefault()) :
    public DBNResource makeNavigatorNode(@NotNull DBNNode parentNode, @NotNull IResource resource) throws CoreException, DBException

 *
            return new DBNDiagram(parentNode, resource, this);
    @Override
            return;
            return new DBNDiagramFolder(parentNode, resource, this);
    public String getTypeName(@NotNull IResource resource)

            }
        IFolder folder,
                DBPProject projectMeta = DBPPlatformDesktop.getInstance().getWorkspace().getProject(
                return FEATURE_DELETE | FEATURE_RENAME | FEATURE_CREATE_FOLDER | FEATURE_MOVE_INTO;
                }
    {
    @Nullable
 * you may not use this file except in compliance with the License.
                    newDiagram.setName(title);
        return DBPPlatformDesktop.getInstance().getWorkspace().getResourceDefaultRoot(project, ERDResourceHandler.class, forceCreate);
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public List<DBPDataSourceContainer> getAssociatedDataSources(DBNResource resource) {
    @NotNull
            try {

            }
        if (folder == null) {
        }
import org.jkiss.dbeaver.ui.editors.erd.model.DiagramLoader;
import org.jkiss.dbeaver.model.navigator.DBNResource;
            throw new DBException("Error creating diagram", e.getTargetException());
    @NotNull
                log.error(e);
                    file.create(data, true, RuntimeUtils.getNestedMonitor(monitor1));
        if (resource.getResource() instanceof IFile) {
                    return Collections.emptyList();
package org.jkiss.dbeaver.ui.editors.erd.navigator;
            return "diagram";
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        } else {
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
            super.openResource(resource);
import java.nio.charset.StandardCharsets;
import org.jkiss.dbeaver.utils.RuntimeUtils;
        return file;
 *
    @Override
    @Override
        throws DBException
    {
import org.jkiss.dbeaver.ui.editors.erd.model.EntityDiagram;
    }
import org.jkiss.dbeaver.DBException;
            if (resource.getParent() instanceof IFolder) {
    }
        }
                    EntityDiagram newDiagram = copyFrom == null ?
/**
    {
    }
        }
                    throw new InvocationTargetException(e);
import java.lang.reflect.InvocationTargetException;
            return FEATURE_CREATE_FOLDER | FEATURE_MOVE_INTO;
            ERDEditorStandalone.class.getName());
                UIUtils.runInProgressService(runnable);
        }

        if (!(resource instanceof IFile)) {
import java.io.InputStream;
 *
    {
    {
    public static IFolder getDiagramsFolder(DBPProject project, boolean forceCreate) throws CoreException
                try {
 */
            erdInput,
            if (monitor == null) {
        final EntityDiagram copyFrom,
            } catch (Exception e) {
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.core.resources.IFolder;
        DBRProgressMonitor monitor)
import org.jkiss.dbeaver.model.app.DBPProject;
    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
    public int getFeatures(IResource resource)
