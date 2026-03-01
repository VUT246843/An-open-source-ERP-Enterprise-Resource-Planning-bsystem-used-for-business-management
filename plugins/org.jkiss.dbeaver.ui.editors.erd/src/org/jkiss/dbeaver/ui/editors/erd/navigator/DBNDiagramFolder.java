    }
import org.jkiss.dbeaver.model.DBIcon;
 * See the License for the specific language governing permissions and
    }
import org.jkiss.dbeaver.model.navigator.DBNNode;

    @Override

    private DBPImage image;
 */
 * DBNDiagramFolder
import org.eclipse.core.resources.IResource;
import org.jkiss.dbeaver.model.navigator.DBNResource;
                image = FOLDER_ICON;
import org.jkiss.dbeaver.model.navigator.NavigatorResources;
 * Unless required by applicable law or agreed to in writing, software
        return super.getResourceNodeIcon();
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
    public DBPImage getResourceNodeIcon() {
        if (NavigatorResources.isRootResource(getOwnerProject(), resource)) {


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
}
/**
import org.jkiss.code.Nullable;
            if (image == null) {
    }
import org.jkiss.dbeaver.model.DBPImage;
    @Override
            return image;

        super.dispose(reflect);
/*
        return otherNode instanceof DBNDiagram || super.supportsDrop(otherNode);
    }
import org.jkiss.dbeaver.DBException;
 *
 * you may not use this file except in compliance with the License.


 */
 * You may obtain a copy of the License at
        IResource resource = getResource();
import org.jkiss.code.NotNull;
        }
    @Override
import org.jkiss.dbeaver.model.app.DBPResourceHandler;
import org.eclipse.core.runtime.CoreException;
    private static final DBIcon FOLDER_ICON = new DBIcon("platform:/plugin/org.jkiss.dbeaver.model.erd/icons/erd_folder.svg");
    protected void dispose(boolean reflect) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
 * limitations under the License.
public class DBNDiagramFolder extends DBNResource {
    public boolean supportsDrop(@Nullable DBNNode otherNode) {
package org.jkiss.dbeaver.ui.editors.erd.navigator;
    public DBNDiagramFolder(DBNNode parentNode, IResource resource, DBPResourceHandler handler) throws DBException, CoreException {
 * DBeaver - Universal Database Manager
 *
        super(parentNode, resource, handler);
 * Copyright (C) 2010-2025 DBeaver Corp and others

 *
