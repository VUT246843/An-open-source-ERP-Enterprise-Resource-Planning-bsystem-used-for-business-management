        return metaTree;
    public void setImportFile(File importFile)
                ZipEntry metaEntry = zipFile.getEntry(ExportConstants.META_FILENAME);
        if (!importFile.exists()) {
    private boolean importDriverLibraries = true;
            return false;
    {
import java.io.IOException;

import java.io.InputStream;
            try (ZipFile zipFile = new ZipFile(importFile, ZipFile.OPEN_READ)) {
 * Licensed under the Apache License, Version 2.0 (the "License");
            page.setMessage("File '" + importFile.getAbsolutePath() + "' doesn't exist", IMessageProvider.ERROR);
import java.util.zip.ZipEntry;
import java.util.HashMap;
/*
 * DBeaver - Universal Database Manager
                    return false;
                try (InputStream metaStream = zipFile.getInputStream(metaEntry)) {
    {
        projectNameMap.put(sourceName, targetName);
                    metaTree = XMLUtils.parseDocument(metaStream);
    public File getImportFile()
 * you may not use this file except in compliance with the License.
        try {
        }
 *
                    page.setMessage("Cannot find meta file", IMessageProvider.ERROR);
    {
    }
        projectNameMap.clear();
/**
        return true;
        if (importFile == null) {
    private Document metaTree;
                }
    }
    }

    public Document getMetaTree()
    boolean loadArchiveMeta(WizardPage page)
import java.io.File;
 */
    {

            return false;
    }
    boolean isFileSpecified(WizardPage page)
    }
import java.util.Map;


package org.jkiss.dbeaver.tools.project;
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.importDriverLibraries = importDriverLibraries;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
        if (!importFile.isFile()) {

    private File importFile = null;
    public boolean isImportDriverLibraries()
    }
 * limitations under the License.
            page.setMessage("File '" + importFile.getAbsolutePath() + "' is a directory", IMessageProvider.ERROR);
import org.jkiss.utils.xml.XMLException;
        } catch (IOException e) {
                }
        return projectNameMap.get(projectName);

import java.util.zip.ZipFile;

                    page.setMessage("Cannot parse meta file: " + e.getMessage(), IMessageProvider.ERROR);

        }
        return !projectNameMap.isEmpty();
class ProjectImportData {
    }
    public void setImportDriverLibraries(boolean importDriverLibraries)
    }
    }
    }
        return importFile;
        }
    {
                } catch (XMLException e) {
                    return false;
        this.importFile = importFile;
    }
 * You may obtain a copy of the License at
    {

    public void addProjectName(String sourceName, String targetName)
}
import org.jkiss.utils.xml.XMLUtils;
import org.w3c.dom.Document;

    public void clearProjectNameMap()
 * Copyright (C) 2010-2024 DBeaver Corp and others
    {
        this.metaTree = null;
    {
 */
 * Import data
        page.setMessage("Configure project import settings", IMessageProvider.NONE);

                if (metaEntry == null) {
        return importDriverLibraries;
            }
            page.setMessage("Import file not specified", IMessageProvider.ERROR);
 *
    public String getTargetProjectName(String projectName)
 *
 * Unless required by applicable law or agreed to in writing, software
    private Map<String, String> projectNameMap = new HashMap<>();
import org.eclipse.jface.wizard.WizardPage;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.jface.dialogs.IMessageProvider;
    {

    {
                return true;
            page.setMessage("Cannot open archive '" + importFile.getAbsolutePath() + "': " + e.getMessage(), IMessageProvider.ERROR);



            return false;
    public boolean isProjectsSelected(WizardPage page)
            return false;
 * See the License for the specific language governing permissions and
