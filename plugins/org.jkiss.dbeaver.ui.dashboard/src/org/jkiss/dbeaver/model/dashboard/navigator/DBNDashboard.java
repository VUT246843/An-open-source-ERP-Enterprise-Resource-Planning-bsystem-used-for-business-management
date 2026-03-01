    @NotNull
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.

        return image;
    }
            image = DASHBOARD_ICON;
 * See the License for the specific language governing permissions and

        if (image == null) {
    public DBNDashboard(DBNNode parentNode, IResource resource, DBPResourceHandler handler) throws DBException, CoreException {
 */

import org.jkiss.code.NotNull;
 * Licensed under the Apache License, Version 2.0 (the "License");

 *
package org.jkiss.dbeaver.model.dashboard.navigator;

import org.eclipse.core.resources.IResource;
import org.jkiss.dbeaver.model.navigator.DBNNode;
 * DBNDashboard
import org.jkiss.dbeaver.model.app.DBPResourceHandler;
import org.jkiss.dbeaver.model.DBIcon;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
    }
        }
import org.jkiss.dbeaver.model.navigator.DBNResource;
    @Override
import org.eclipse.core.runtime.CoreException;
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
        super(parentNode, resource, handler);
    private static final DBIcon DASHBOARD_ICON = new DBIcon("platform:/plugin/org.jkiss.dbeaver.model.dashboard/icons/dashboard.svg");
public class DBNDashboard extends DBNResource {
 * You may obtain a copy of the License at
 */
import org.jkiss.dbeaver.DBException;

}
 * you may not use this file except in compliance with the License.
/**
/*
    public DBPImage getResourceNodeIcon() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private DBPImage image;
import org.jkiss.dbeaver.model.DBPImage;
