        return configuration;
 *

 */
        this.dataSourceContainer = dataSourceContainer;
            }
    public DashboardConfigurationList(@NotNull DBPProject project, @NotNull IFile dashboardFile) {
    private void loadConfiguration(Document dbDocument) {
        StringWriter buffer = new StringWriter();
import java.util.List;
    private final DBPDataSourceContainer dataSourceContainer;
        return viewConfigFolder.resolve("view-" + project.getName() +
            } catch (CoreException e) {
            throw new IOException("Dashboard configuration is not connected with datasource");
            throw new IOException("Unsupported dashboard configuration format");
            dataSourceContainer.setExtension(DashboardConstants.DS_PROP_DASHBOARDS, buffer.toString());
        if (dataSourceContainer == null) {
    }
                }


    private IFile dashboardFile;
    public DBPDataSourceContainer getDataSourceContainer() {
            }
            (dataSourceContainer == null ? "" : "_" + dataSourceContainer.getId().replace("/", "_")) + ".xml");
    }
                        dashboards.put(configuration.getDashboardId(), configuration);
    }
            // Add fake default dashboard
                throw new IOException(e.getMessage(), e);
        if (!Files.exists(viewConfigFolder)) {
            dataSourceContainer.setExtension(DashboardConstants.DS_PROP_DASHBOARDS, null);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private void loadFromFile(IFile file) {
        Path pluginFolder = RuntimeUtils.getPluginStateLocation(UIDashboardActivator.getDefault());
    }
    }
    public IFile getDashboardFile() {
            loadConfiguration(dbDocument);
            }
                    dashboardFile.create(contents, true, new NullProgressMonitor());
                    Files.createDirectories(viewConfigFolder);
import org.jkiss.utils.xml.XMLException;
        }
        if (dashboards.isEmpty()) {
        DashboardConfiguration configuration = new DashboardConfiguration(project, dataSourceContainer, id);
                        project,


import org.jkiss.dbeaver.DBException;
                dbDocument = XMLUtils.parseDocument(is);
 * you may not use this file except in compliance with the License.
        loadFromDataSource();
 * DBeaver - Universal Database Manager

    public void saveConfiguration() throws IOException {
        if (this.dashboards.remove(dashboard.getDashboardId()) != null) {
                Element rootElement = dbDocument.getDocumentElement();
        serializeConfig(xml);

                if (!dashboardFile.exists()) {
        } else {
                }
    }

import org.jkiss.dbeaver.utils.RuntimeUtils;

        if (file.exists()) {
            if (!CommonUtils.isEmpty(dbSerialized)) {
    public DashboardConfigurationList(DBPDataSourceContainer dataSourceContainer) {
                if (rootElement.getTagName().equals("dashboardList")) {
    @Nullable
                if (Files.exists(configFile)) {
import org.jkiss.dbeaver.model.dashboard.DashboardConstants;
    public DashboardConfiguration createDashboard(String id, String name) {
 *
        loadFromFile(dashboardFile);
                } else if (rootElement.getTagName().equals("dashboards")) {
    public static final String DEFAULT_DASHBOARD_ID = "default";
import org.jkiss.utils.xml.XMLUtils;

import org.w3c.dom.Document;
 *     http://www.apache.org/licenses/LICENSE-2.0
                    configuration.loadConfiguration(rootElement);
    }
import java.nio.file.Files;
                    dbDocument = XMLUtils.parseDocument(configFile.toFile());
                        null
        }
import java.io.*;
    }
                        configuration.loadConfiguration(dashboardElement);
    private Path getConfigFile(boolean forceCreate) {
 *
import java.util.ArrayList;
import org.eclipse.core.resources.IFile;

                        DashboardConfiguration configuration = new DashboardConfiguration(
                    dashboards.put(configuration.getDashboardId(), configuration);
    }

            }
            }
        return dataSourceContainer;
        this.dashboards.put(id, configuration);
        xml.setBeautify(true);
                    throw new DBException("Unsupported dashboards format: " + rootElement.getTagName());
        loadConfiguration(dbDocument);
        Path viewConfigFolder = pluginFolder.resolve("views");
            StringWriter buffer = new StringWriter();
 * You may obtain a copy of the License at
                log.error("Error parsing dashboards", e);
    }
            if (forceCreate) {
        } else if (dataSourceContainer != null) {
            xml.flush();
        if (dashboardFile != null) {
            } catch (Exception e) {
    }
    @NotNull
        Document dbDocument = null;
                }
            xml.setBeautify(false);

    public void checkDefaultDashboardExistence() {
                    }
                }
        this.dataSourceContainer = null;
import org.jkiss.code.Nullable;
    public List<DashboardConfiguration> getDashboards() {

 */
    private void saveToDataSource() throws IOException {
import org.jkiss.code.NotNull;
                dashboard.serializeConfig(xml);
/*
        }
            try {
    }
            } else {
                } catch (IOException e) {
import org.jkiss.dbeaver.model.app.DBPProject;
        this.project = dataSourceContainer.getProject();

            try {
import org.jkiss.utils.xml.XMLBuilder;
                        dataSourceContainer,
                try {
    private final Map<String, DashboardConfiguration> dashboards = new LinkedHashMap<>();

                throw new RuntimeException(e);
import org.w3c.dom.Element;
                    DashboardConfiguration configuration = new DashboardConfiguration(
    }
/**
    }
    @NotNull
        Document dbDocument = null;
            try {
        configuration.setDashboardName(name);
import java.nio.file.Path;
    @Nullable
            }
                saveConfiguration();
    private void serializeConfig(XMLBuilder xml) throws IOException {
package org.jkiss.dbeaver.ui.dashboard.model;
    public DBPProject getProject() {
            try (InputStream is = file.getContents()) {
import java.util.LinkedHashMap;
        }
import org.jkiss.dbeaver.ui.dashboard.internal.UIDashboardActivator;
        } else {
        try (var ignored = xml.startElement("dashboardList")) {
 * DashboardConfigurationList
        }
            } catch (Exception e) {
import org.eclipse.core.runtime.NullProgressMonitor;
            for (DashboardConfiguration dashboard : dashboards.values()) {
                Path configFile = getConfigFile(false);
                            project,
            this.createDashboard(

                DashboardConfigurationList.DEFAULT_DASHBOARD_NAME);
                        );

        this.dashboardFile = dashboardFile;
import org.jkiss.utils.CommonUtils;
    public static final String DEFAULT_DASHBOARD_NAME = "Default";
            }
                DashboardConfigurationList.DEFAULT_DASHBOARD_ID,
import org.jkiss.dbeaver.utils.GeneralUtils;
                            null
        }

        return project;
 * Licensed under the Apache License, Version 2.0 (the "License");
        } catch (XMLException e) {
                    dashboardFile.setContents(contents, true, false, new NullProgressMonitor());

                } else {
        return buffer.toString();
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
        }
                dbDocument = XMLUtils.parseDocument(new StringReader(dbSerialized));
import org.eclipse.core.runtime.CoreException;
    public void deleteDashBoard(DashboardConfiguration dashboard) {
        return dashboards.get(id);
    public DashboardConfiguration getDashboard(String id) {
                    for (Element dashboardElement : XMLUtils.getChildElementList(rootElement, "dashboards")) {
 * distributed under the License is distributed on an "AS IS" BASIS,
            log.error("Error parsing dashboards", e);
import org.jkiss.dbeaver.Log;

    }
import java.nio.charset.StandardCharsets;
            XMLBuilder xml = new XMLBuilder(buffer, GeneralUtils.UTF8_ENCODING, false);
        if (dashboards.isEmpty()) {
import java.util.Map;

        XMLBuilder xml = new XMLBuilder(buffer, GeneralUtils.UTF8_ENCODING, true);
    @Nullable
            String dbSerialized = dataSourceContainer.getExtension(DashboardConstants.DS_PROP_DASHBOARDS);
                ByteArrayInputStream contents = new ByteArrayInputStream(saveToString().getBytes(StandardCharsets.UTF_8));
        this.project = project;
    private String saveToString() throws IOException {
    private final DBPProject project;
}
 * See the License for the specific language governing permissions and
                } else {

        if (dbDocument != null) {
    private void loadFromDataSource() {
            } catch (IOException e) {
        dataSourceContainer.persistConfiguration();

    }
            saveToDataSource();

        try {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                // Backward compatibility - read from file
                            dataSourceContainer,
            serializeConfig(xml);
                log.error("Error loading dashboard view configuration", e);
    }
    @Nullable


    private static final Log log = Log.getLog(DashboardConfigurationList.class);
                    );
        }
 * limitations under the License.
                    log.error("Can't create view config folder " + viewConfigFolder, e);
        }
public class DashboardConfigurationList {

        return new ArrayList<>(dashboards.values());

        }

        xml.flush();

        return dashboardFile;
    }
