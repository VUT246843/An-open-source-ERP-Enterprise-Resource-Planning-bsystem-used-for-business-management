    private final Map<String, TabbedFolderState> savedStates = new HashMap<>();

                xml.flush();

    private volatile ConfigSaver saver = null;
                    break;
        }
                saver = null;
import org.jkiss.utils.xml.XMLBuilder;

import org.jkiss.utils.xml.SAXReader;
            return folderState;
import org.jkiss.utils.xml.SAXListener;
        if (Files.exists(savedStates)) {
                                try (final XMLBuilder.Element ignored3 = xml.startElement("tab")) {
    TabbedFolderState getFolderState(String objectId) {
/*
                //log.debug("Save column config " + System.currentTimeMillis());
        @Override
                        TabbedFolderState.TabState tabState = new TabbedFolderState.TabState();
                                    xml.addAttribute("id", tab.getKey());
        @NotNull
 * See the License for the specific language governing permissions and
                                    xml.addAttribute("embedded", tab.getValue().embedded);

            if (saver == null) {
            log.error("Error loading columns configuration", e);
    public TabbedFoldersRegistry() {
import java.io.OutputStream;
        savedStates.clear();
import org.jkiss.dbeaver.model.runtime.AbstractJob;

        Path savedStates = DBWorkbench.getPlatform().getLocalConfigurationFile(COLUMNS_CONFIG_FILE);
import org.jkiss.dbeaver.runtime.DBWorkbench;
    public static synchronized TabbedFoldersRegistry getInstance() {
import java.io.InputStream;
    private class ConfigSaver extends AbstractJob {
 */
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                try (var ignored = xml.startElement("folders")) {
                                    xml.addAttribute("height", tab.getValue().height);
            super("Tab folders configuration save");
            }


    }
                    break;
                xml.setBeautify(true);
    }

        ConfigSaver() {

 *
        }
import java.nio.file.Files;
                    for (Map.Entry<String, TabbedFolderState> entry : savedStates.entrySet()) {
                    savedStates.put(attributes.getValue("id"), curTabbedFolderState);

    private static TabbedFoldersRegistry instance;
                XMLBuilder xml = new XMLBuilder(out, GeneralUtils.UTF8_ENCODING);
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.utils.GeneralUtils;
                        }
                saver = new ConfigSaver();
 *
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
            final FolderStateParser dsp = new FolderStateParser();
                    }
import java.util.HashMap;
            if (folderState == null) {
        }

            TabbedFolderState folderState = savedStates.get(objectId);
        }
        try (InputStream in = Files.newInputStream(configFile)) {
        private void flushConfig() {

    }
                case "folder":
                        curTabbedFolderState.setTabState(attributes.getValue("id"), tabState);

                        tabState.embedded = CommonUtils.toBoolean(attributes.getValue("embedded"));
            SAXReader parser = new SAXReader(in);

                    curTabbedFolderState = new TabbedFolderState();
    private void loadConfiguration(Path configFile) {
import org.jkiss.utils.CommonUtils;

/**

        synchronized (savedStates) {
 * Unless required by applicable law or agreed to in writing, software
            return Status.OK_STATUS;
 * Copyright (C) 2010-2025 DBeaver Corp and others
                case "tab":
                log.error("Error saving tabs configuration", e);
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
        @Override
                    if (curTabbedFolderState != null) {

    }
    private static final String COLUMNS_CONFIG_FILE = "tabs_settings.xml";
                saver.schedule(3000);
import org.eclipse.core.runtime.IStatus;
package org.jkiss.dbeaver.ui.controls.folders;
            switch (localName) {
                folderState = new TabbedFolderState();
                                    xml.addAttribute("width", tab.getValue().width);
                            xml.addAttribute("id", entry.getKey());
            setSystem(true);
    }
                            }
}        synchronized (savedStates) {
                savedStates.put(objectId, folderState);
        }
        private FolderStateParser() {
        return instance;
        public void saxStartElement(@NotNull SAXReader reader, @Nullable String namespaceURI, @NotNull String localName, @NotNull Attributes attributes) {
                    }
                        tabState.width = CommonUtils.toInt(attributes.getValue("width"), 0);
            synchronized (savedStates) {
 * Viewer columns registry

            Path configFile = DBWorkbench.getPlatform().getLocalConfigurationFile(COLUMNS_CONFIG_FILE);
import java.nio.file.Path;
        if (instance == null) {

        private TabbedFolderState curTabbedFolderState = null;
                case "folders":
        protected IStatus run(@NotNull DBRProgressMonitor monitor) {
    }
            }
    }
class TabbedFoldersRegistry {
                }
            } catch (Exception e) {
                        try (var ignored2 = xml.startElement("folder")) {

 */
import java.util.Map;
        }
                                }
            loadConfiguration(savedStates);
                flushConfig();
 *
        }
    @NotNull
    private static final Log log = Log.getLog(TabbedFoldersRegistry.class);
                        tabState.height = CommonUtils.toInt(attributes.getValue("height"), 0);
            instance = new TabbedFoldersRegistry();
 * limitations under the License.
        } catch (Exception e) {
            try (OutputStream out = Files.newOutputStream(configFile)) {

import org.jkiss.code.NotNull;
                            for (Map.Entry<String, TabbedFolderState.TabState> tab : entry.getValue().getTabStates().entrySet()) {
 * You may obtain a copy of the License at
    private class FolderStateParser extends SAXListener.BaseListener {
import org.xml.sax.Attributes;
            }
import org.eclipse.core.runtime.Status;
                    break;
        }
import org.jkiss.code.Nullable;
            }
    void saveConfig() {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.Log;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            parser.parse(dsp);
 * Licensed under the Apache License, Version 2.0 (the "License");
