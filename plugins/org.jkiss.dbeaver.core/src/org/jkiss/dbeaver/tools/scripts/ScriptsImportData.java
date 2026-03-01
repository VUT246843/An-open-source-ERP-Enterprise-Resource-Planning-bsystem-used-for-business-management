    {
    {
    public File getInputDir()

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        return inputDir;
        return dataSourceContainer;


 *
    public DBNResource getImportDir()
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private final File inputDir;
 * limitations under the License.
    ScriptsImportData(File inputDir, String fileMasks, boolean overwriteFiles, DBNResource importDir, DBPDataSourceContainer dataSourceContainer)
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public DBPDataSourceContainer getDataSourceContainer()
        this.dataSourceContainer = dataSourceContainer;
 */
    }
    {
/*
        this.importDir = importDir;

 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 * You may obtain a copy of the License at
 * Import data
        return fileMasks;
    public String getFileMasks()
    private final DBNResource importDir;
package org.jkiss.dbeaver.tools.scripts;
}
 * Unless required by applicable law or agreed to in writing, software
import java.io.File;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }

/**
 * distributed under the License is distributed on an "AS IS" BASIS,

    }
 * See the License for the specific language governing permissions and
    private final String fileMasks;
        return importDir;
    public boolean isOverwriteFiles()

    {
 *
    }
    {
        this.inputDir = inputDir;

 * DBeaver - Universal Database Manager
 */

 *


        this.overwriteFiles = overwriteFiles;
        this.fileMasks = fileMasks;
 * you may not use this file except in compliance with the License.
    }
import org.jkiss.dbeaver.model.navigator.DBNResource;
        return overwriteFiles;
class ScriptsImportData {
    {
    private final DBPDataSourceContainer dataSourceContainer;
    private final boolean overwriteFiles;
