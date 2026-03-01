
 * DBeaver - Universal Database Manager
 */
class ViewerColumnRegistry {
import org.jkiss.code.Nullable;
                        col.visible = CommonUtils.getBoolean(attributes.getValue("visible"), true);
                newStates.add(new ColumnState(state));

        public void saxStartElement(@NotNull SAXReader reader, @Nullable String namespaceURI, @NotNull String localName, @NotNull Attributes attributes) {
import org.eclipse.core.runtime.IStatus;
                    }
                                    try (var ignored3 = xml.startElement("column")) {
            if (saver == null) {

            }
                                        xml.addAttribute("name", column.name);
                                        xml.addAttribute("visible", column.visible);
            this.name = source.name;
import org.jkiss.utils.xml.SAXListener;
    }
            synchronized (columnsConfig) {
            return columnsConfig.get(controlId);
 * Licensed under the Apache License, Version 2.0 (the "License");
                    xml.setBeautify(true);
 *     http://www.apache.org/licenses/LICENSE-2.0
            switch (localName) {
/*
    }
import java.nio.file.Files;

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Viewer columns registry
    public static synchronized ViewerColumnRegistry getInstance() {
import org.jkiss.utils.CommonUtils;

 *
/**
        public ColumnState(ColumnState source) {
                                    }
        private List<ColumnState> curColumnState = null;
        private void flushConfig() {
                    break;
                try (OutputStream out = Files.newOutputStream(configFile)) {
                    columnsConfig.put(attributes.getValue("id"), curColumnState);
    }
    }
            this.width = source.width;
 *
                    try (var ignored = xml.startElement("items")) {
            }
        if (instance == null) {
    }
            final ColumnsParser dsp = new ColumnsParser();
 * Unless required by applicable law or agreed to in writing, software
            this.visible = source.visible;
        }
            instance = new ViewerColumnRegistry();
    void updateConfig(String controlId, Collection<? extends ColumnState> columns) {
        columnsConfig.clear();
import org.jkiss.dbeaver.model.runtime.AbstractJob;
        public String toString() {
        @Override
                //log.debug("Save column config " + System.currentTimeMillis());
    private static final Log log = Log.getLog(ViewerColumnRegistry.class);
    }
import org.jkiss.dbeaver.Log;


        }

        }

import java.nio.file.Path;
        private ColumnsParser() {
                        col.order = CommonUtils.toInt(attributes.getValue("order"), 0);
import org.jkiss.dbeaver.runtime.DBWorkbench;
        }
            }
        } catch (Exception e) {
        synchronized (columnsConfig) {
                                xml.addAttribute("id", entry.getKey());
package org.jkiss.dbeaver.ui.controls;
                case "column":
        }

        }
    private class ConfigSaver extends AbstractJob {
import java.io.InputStream;
                        }
 *
                saver.schedule(3000);
                }
import org.jkiss.utils.xml.SAXReader;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * You may obtain a copy of the License at
import org.xml.sax.Attributes;

    public static class ColumnState {
                        ColumnState col = new ColumnState();

        }
            SAXReader parser = new SAXReader(in);

                    Files.createDirectories(configFile.getParent());
            try {
            columnsConfig.put(controlId, newStates);
                            }
    private static ViewerColumnRegistry instance;
        protected IStatus run(@NotNull DBRProgressMonitor monitor) {
 */
        try (InputStream in = Files.newInputStream(configFile)) {

            Path configFile = DBWorkbench.getPlatform().getLocalConfigurationFile(COLUMNS_CONFIG_FILE);
                flushConfig();
    private class ColumnsParser extends SAXListener.BaseListener {
        ConfigSaver() {
import org.jkiss.utils.xml.XMLBuilder;
                        col.width = CommonUtils.toInt(attributes.getValue("width"), 0);
                                }
                    xml.flush();
    Collection<ColumnState> getSavedConfig(String controlId) {
                    }
import org.eclipse.core.runtime.Status;

        }
        Path columnsConfig = DBWorkbench.getPlatform().getLocalConfigurationFile(COLUMNS_CONFIG_FILE);
        }
            parser.parse(dsp);
                    break;
                    XMLBuilder xml = new XMLBuilder(out, GeneralUtils.UTF8_ENCODING);
    private final Map<String, List<ColumnState>> columnsConfig = new TreeMap<>();
            log.error("Error loading columns configuration", e);

                                    }
    public ViewerColumnRegistry() {

                                        continue;
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and

            }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @NotNull
            this.order = source.order;
            for (ColumnState state : columns) {
        boolean visible;
        }
            }
import org.jkiss.code.NotNull;
        @Override
 * limitations under the License.

                saver = new ConfigSaver();
        return instance;
        synchronized (columnsConfig) {
}        }
        int width;
    private volatile ConfigSaver saver = null;
        if (Files.exists(columnsConfig)) {
import org.jkiss.dbeaver.utils.GeneralUtils;
        int order;
                if (Files.notExists(configFile.getParent())) {
                                    if (column.width == 0) {
                                        xml.addAttribute("width", column.width);
            super("Columns configuration save");
                        if (col.width > 0) {

    private static final String COLUMNS_CONFIG_FILE = "column_settings.xml";
        }
                            curColumnState.add(col);

    }
                case "items":
                case "item":
                log.error("Error saving columns configuration", e);
                    if (curColumnState != null) {
                        for (Map.Entry<String, List<ColumnState>> entry : columnsConfig.entrySet()) {
                            try (var ignored2 = xml.startElement("item")) {
                }
                        }
import java.io.OutputStream;
        @Override

                saver = null;
        public ColumnState() {
            return name + ":" + order;
        }
                    break;
import java.util.*;
                                for (ColumnState column : entry.getValue()) {
                        col.name = attributes.getValue("name");
    private void loadConfiguration(Path configFile) {


            loadConfiguration(columnsConfig);
                                        xml.addAttribute("order", column.order);

    }
        String name;
            return Status.OK_STATUS;
                    curColumnState = new ArrayList<>();
            } catch (Exception e) {
            List<ColumnState> newStates = new ArrayList<>(columns.size());
