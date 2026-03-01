    }
    }

        this.id = id;

        return id;
    private String id;

        this.icon = rtd.getIcon().getLocation();
    public void setDisplayName(String displayName) {
package org.jkiss.dbeaver.model.rm;
    public void setIcon(String icon) {
    }
 */
    }
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.fileExtensions = rtd.getFileExtensions();
    public String getFolderIcon() {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software


    }


    private String displayName;
        return rootFolder;
    public RMResourceType() {
import org.jkiss.dbeaver.model.app.DBPResourceTypeDescriptor;

 * Copyright (C) 2010-2024 DBeaver Corp and others
    }

    private String rootFolder;
    }
 * You may obtain a copy of the License at
    public String getIcon() {
        this.folderIcon = rtd.getFolderIcon() == null ? null : rtd.getFolderIcon().getLocation();
    public String getDisplayName() {
    public String getId() {
    }
    public void setRootFolder(String rootFolder) {
 *
        this.displayName = displayName;
        this.fileExtensions = fileExtensions;
 * DBeaver - Universal Database Manager
        this.icon = icon;

/*
    public String getRootFolder() {
 * distributed under the License is distributed on an "AS IS" BASIS,

        this.id = rtd.getId();
        return fileExtensions;
    private String[] fileExtensions;
    public RMResourceType(DBPResourceTypeDescriptor rtd) {

        return icon;

        this.displayName = rtd.getName();
}
    public void setFolderIcon(String folderIcon) {
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return id;
    }



    }
        this.rootFolder = rtd.getDefaultRoot(null);
    public String[] getFileExtensions() {
    public String toString() {
 *
    public void setFileExtensions(String[] fileExtensions) {
public class RMResourceType {
        return folderIcon;
    }
    }
 * you may not use this file except in compliance with the License.
    private String icon;
    }
        return displayName;
        this.rootFolder = rootFolder;
    public void setId(String id) {
    }
    private String folderIcon;

 * limitations under the License.
    }
    @Override

        this.folderIcon = folderIcon;
