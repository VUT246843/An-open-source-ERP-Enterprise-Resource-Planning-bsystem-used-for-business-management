    public DBPImage getResourceNodeIcon() {
            if (image == null) {
    @Override
 *
/**
    public DBNDashboardFolder(DBNNode parentNode, IResource resource, DBPResourceHandler handler) throws DBException, CoreException {
        if (NavigatorResources.isRootResource(getOwnerProject(), resource)) {
import org.jkiss.dbeaver.DBException;
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        super(parentNode, resource, handler);
    }
                image = FOLDER_ICON;
    @Override
import org.eclipse.core.runtime.CoreException;

 * DBNDashboardFolder
}
import org.jkiss.dbeaver.model.DBPImage;
/*
import org.eclipse.core.resources.IResource;
    @NotNull
import org.jkiss.dbeaver.model.DBIcon;
 * You may obtain a copy of the License at

 *

public class DBNDashboardFolder extends DBNResource {
            }
 * See the License for the specific language governing permissions and
        return otherNode instanceof DBNDashboard || super.supportsDrop(otherNode);
            return image;
    public boolean supportsDrop(@Nullable DBNNode otherNode) {
 * limitations under the License.
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
    }

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.navigator.NavigatorResources;
 */
        }
    private DBPImage image;
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
import org.jkiss.dbeaver.model.app.DBPResourceHandler;
 * DBeaver - Universal Database Manager
        IResource resource = getResource();
    private static final DBIcon FOLDER_ICON = new DBIcon("platform:/plugin/org.jkiss.dbeaver.model.dashboard/icons/dashboard_folder.svg");

        return super.getResourceNodeIcon();
        super.dispose(reflect);
import org.jkiss.dbeaver.model.navigator.DBNNode;
    protected void dispose(boolean reflect) {
import org.jkiss.code.NotNull;


package org.jkiss.dbeaver.model.dashboard.navigator;
import org.jkiss.dbeaver.model.navigator.DBNResource;

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.Nullable;
