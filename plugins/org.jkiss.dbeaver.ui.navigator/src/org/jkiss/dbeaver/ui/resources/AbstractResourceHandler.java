            if (program != null && program.getImage() != null) {
import org.jkiss.dbeaver.model.navigator.NavigatorResources;
        return "resource";
import org.eclipse.core.runtime.CoreException;
        return 0;
import org.jkiss.dbeaver.ui.UIUtils;
        }
 * DBeaver - Universal Database Manager
    @NotNull
                UIUtils.getActiveWorkbenchWindow().getActivePage().openEditor(
        return new DBNResource(parentNode, resource, this);
 * You may obtain a copy of the License at
    }
    @Override
        }
        return null;

    @Override

 */
 * distributed under the License is distributed on an "AS IS" BASIS,
}

 * limitations under the License.
public abstract class AbstractResourceHandler implements DBPResourceHandler {
                return FEATURE_DELETE | FEATURE_MOVE_INTO | FEATURE_RENAME | FEATURE_CREATE_FOLDER;
import org.eclipse.core.resources.IResource;
            }
    public int getFeatures(IResource resource) {
import org.jkiss.dbeaver.DBException;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
            DBNResource node = NavigatorResources.getNodeByResource(DBWorkbench.getPlatform().getNavigatorModel(), resource);
import java.util.List;
            return FEATURE_MOVE_INTO | FEATURE_CREATE_FOLDER;
    public List<DBPDataSourceContainer> getAssociatedDataSources(DBNResource resource) {
                    nodeInput,

            ProgramInfo program = ProgramInfo.getProgram(fileExtension);

    public void openResource(@NotNull IResource resource) throws CoreException, DBException {
    @NotNull
        return resource.getName();
import org.jkiss.code.NotNull;
    public DBPImage getResourceIcon(@NotNull IResource resource) {
                return program.getImage();
import org.jkiss.dbeaver.ui.editors.entity.FolderEditor;
 * Unless required by applicable law or agreed to in writing, software
        if (resource instanceof IFolder) {
import org.eclipse.core.resources.IContainer;
                NodeEditorInput nodeInput = new NodeEditorInput(node);
    @NotNull
    }
        }

import org.jkiss.dbeaver.model.DBPImage;
    public DBNResource makeNavigatorNode(@NotNull DBNNode parentNode, @NotNull IResource resource) throws CoreException, DBException {
        }
    @Override

        return null;
import org.jkiss.dbeaver.ui.ProgramInfo;
    public String getTypeName(@NotNull IResource resource) {
            if (resource.getParent() instanceof IFolder) {
        if (resource instanceof IContainer) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    @Override
    public String getResourceDescription(@NotNull IResource resource) {
import org.jkiss.code.Nullable;
/**
    }
            }
    @Nullable
    }
    @Override
 * Abstract resource handler

        if (resource instanceof IFolder) {
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
    @Override
import org.jkiss.dbeaver.model.navigator.DBNNode;
        String fileExtension = resource.getFileExtension();
 *

    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.navigator.DBNResource;
import org.jkiss.dbeaver.runtime.DBWorkbench;
            return null;
        //throw new DBException("Resource open is not implemented");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Nullable
    }
 *
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.app.DBPResourceHandler;
 *
        if (!CommonUtils.isEmpty(fileExtension)) {

    @Override
    @Override
            if (node != null) {
 */
package org.jkiss.dbeaver.ui.resources;
                    FolderEditor.class.getName());

        return resource.getName();
            }
    public String getResourceNodeName(@NotNull IResource resource) {
 * you may not use this file except in compliance with the License.
import org.eclipse.core.resources.IFolder;
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.ui.editors.NodeEditorInput;

    }
