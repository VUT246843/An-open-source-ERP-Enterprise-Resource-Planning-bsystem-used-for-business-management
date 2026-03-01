import org.jkiss.dbeaver.model.navigator.DBNResource;
import org.jkiss.dbeaver.DBException;
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
import org.jkiss.dbeaver.model.navigator.DBNNode;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.core.runtime.CoreException;
package org.jkiss.dbeaver.ui.editors.erd.navigator;
{
 *
 * limitations under the License.
import org.jkiss.dbeaver.model.app.DBPResourceHandler;
            image = DIAGRAM_ICON;
 * See the License for the specific language governing permissions and
public class DBNDiagram extends DBNResource
 */
import org.jkiss.dbeaver.model.DBIcon;
        super(parentNode, resource, handler);
import org.jkiss.code.NotNull;

 * You may obtain a copy of the License at
/**

    private DBPImage image;
 * DBeaver - Universal Database Manager
        }
import org.eclipse.core.resources.IResource;
        if (image == null) {

import org.jkiss.dbeaver.model.DBPImage;

 * Licensed under the Apache License, Version 2.0 (the "License");
    {
 * DBNDiagram
    }

        return image;
    @NotNull
    }
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
/*
 * Copyright (C) 2010-2025 DBeaver Corp and others

}
    private static final DBIcon DIAGRAM_ICON = new DBIcon("platform:/plugin/org.jkiss.dbeaver.model.erd/icons/erd.svg");
    public DBNDiagram(DBNNode parentNode, IResource resource, DBPResourceHandler handler) throws DBException, CoreException
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
    public DBPImage getResourceNodeIcon() {
 *
