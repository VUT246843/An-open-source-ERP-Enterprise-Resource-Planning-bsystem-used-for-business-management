                        }
}
import org.jkiss.dbeaver.model.rcp.RCPProject;
 * Unless required by applicable law or agreed to in writing, software
            return;
                    //String[] pathSegments = getPathSegments(resource);

                            return;
import org.jkiss.utils.CommonUtils;
package org.jkiss.dbeaver.model.navigator;
    private final DBNFileSystems fileSystems;
                    for (int i = 1; i < pathSegments.length - 1; i++) {
        if (fileSystems.getCachedChildren() == null) {
 *
                        default -> {
 * distributed under the License is distributed on an "AS IS" BASIS,
                        if (childNode == null) {
    public DBFResourceListener(DBNFileSystems fileSystems) {
                    // NIO path format /[config-id]/root-id/folder1/file1
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.navigator.fs.DBNFileSystems;
 * See the License for the specific language governing permissions and
public class DBFResourceListener implements EFSNIOListener {
                    String[] pathSegments = fs.getFileSystem().getURISegments(resource.getFileStore().getPath().toUri());
                }
            !CommonUtils.equalObjects(rcpProject.getEclipseProject(), resource.getProject())) {
                        case CREATE -> parentNode.addChildResource(resource.getNioPath());
 * Licensed under the Apache License, Version 2.0 (the "License");
            return;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                break;
import org.jkiss.dbeaver.model.fs.nio.EFSNIOListener;
import org.jkiss.dbeaver.model.navigator.fs.DBNPathBase;
import org.jkiss.dbeaver.Log;

import org.jkiss.dbeaver.model.fs.nio.EFSNIOResource;
                if (rootNode != null) {
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.navigator.fs.DBNFileSystemRoot;

 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    private static final Log log = Log.getLog(DBFResourceListener.class);
 *

 */
/*
        }
                        String itemName = pathSegments[i];

    }
 * DBeaver - Universal Database Manager
                    }
        this.fileSystems = fileSystems;
import org.jkiss.dbeaver.model.fs.DBFVirtualFileSystemRoot;
    @Override
            if (CommonUtils.equalObjects(fs.getFileSystem(), dbfRoot.getFileSystem())) {
 * limitations under the License.
                        case DELETE -> parentNode.removeChildResource(resource.getNioPath());
        if (!(fileSystems.getOwnerProject() instanceof RCPProject rcpProject) ||
import org.jkiss.dbeaver.model.navigator.fs.DBNFileSystem;
                    switch (action) {

    public void resourceChanged(EFSNIOResource resource, Action action) {

                        parentNode = childNode;
        }
                        }

                    }
        DBFVirtualFileSystemRoot dbfRoot = resource.getRoot().getRoot();

        for (DBNFileSystem fs : fileSystems.getCachedChildren()) {
                            log.debug("Cannot find child node '" + itemName + "' in '" + parentNode.getNodeUri() + "'");
        }
                    DBNPathBase parentNode = rootNode;
                DBNFileSystemRoot rootNode = fs.getRoot(dbfRoot);
                        DBNPathBase childNode = parentNode.getChild(itemName);
            }
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others

