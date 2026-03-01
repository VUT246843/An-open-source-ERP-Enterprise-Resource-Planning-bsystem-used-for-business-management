        this.archiveFileName = archiveFileName;
    }

    ZipOutputStream archiveStream;
        return exportDrivers;
        this.projects = projects;

    {
    {
        this.workspace = workspace;
import java.util.HashSet;
 * You may obtain a copy of the License at
    private final String archiveFileName;
import java.io.File;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public List<RCPProject> getProjectsToExport()

    Set<DBPDriver> usedDrivers = new HashSet<>();
 * See the License for the specific language governing permissions and

    private final List<RCPProject> projects;

import org.jkiss.dbeaver.model.connection.DBPDriver;
    DBPWorkspaceEclipse workspace;

        return archiveFileName;
    public ProjectExportData(List<RCPProject> projects, File outputFolder, boolean exportDrivers, String archiveFileName)
    {

    }
    {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return outputFolder;
    {
 *
    public boolean isExportDrivers()
 *     http://www.apache.org/licenses/LICENSE-2.0

    }
    public String getArchiveFileName()
class ProjectExportData {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.zip.ZipOutputStream;
    }

    }
        return projects;
 * limitations under the License.

    private final boolean exportDrivers;
import org.jkiss.utils.xml.XMLBuilder;

 *

/*
        this.archiveStream = archiveStream;
        this.exportDrivers = exportDrivers;
}
    }
 *
        this.meta = meta;
    XMLBuilder meta;


 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.app.DBPWorkspaceEclipse;
package org.jkiss.dbeaver.tools.project;
        this.outputFolder = outputFolder;
 * DBeaver - Universal Database Manager
import java.util.Set;
 */
    void initExport(DBPWorkspaceEclipse workspace, XMLBuilder meta, ZipOutputStream archiveStream)
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.rcp.RCPProject;
 * distributed under the License is distributed on an "AS IS" BASIS,
    public File getOutputFolder()
import java.util.List;
    {
    private final File outputFolder;
