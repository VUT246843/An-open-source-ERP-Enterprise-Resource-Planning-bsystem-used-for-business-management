import org.jkiss.utils.xml.XMLBuilder;
    }
import java.io.IOException;
                }
            viewId.append(",").append(Parameter.id.name()).append("=").append(id);
    }
    public DBPDataSourceContainer getDataSourceContainer() {
            log.error(e);
 * DBeaver - Universal Database Manager
                }
        this.dashboardId = dashboardId;
    public static final String REF_PREFIX = "ref#";
    private IFile dashboardFile;
        @NotNull DBPProject project,
import org.eclipse.core.resources.IFile;
            items.sort(Comparator.comparingInt(DashboardItemViewSettings::getIndex));
    }

    public void setInitDefaultCharts(boolean initDefaultCharts) {
    DashboardConfiguration(
                }
    };
    public void clearItems() {
    }
        @Nullable DBPDataSourceContainer dataSourceContainer,
        return items.stream().map(DashboardItemViewSettings::getDashboardItem).collect(Collectors.toList());
                    dashboardId = rootElement.getAttribute("id");
                items.remove(i);
            }
import org.jkiss.dbeaver.model.dashboard.DBDashboard;
            return itemViewConfiguration;

                try (var ignored3 = xml.startElement("dashboard")) {
        this.project = project;
                dashboardName = rootElement.getAttribute("name");
    }
        this.dashboardFile = dashboardFile;
                if (CommonUtils.isEmpty(dashboardName)) {

    public List<DashboardItemViewSettings> getDashboardItemConfigs() {
        return useSeparateConnection;
    }
                i++;
    }
import org.jkiss.utils.CommonUtils;
            DashboardItemViewSettings item = items.get(i);
                if (openConnectionOnActivate) {
                for (Element viewElement : XMLUtils.getChildElementList(rootElement, "view")) {
        int decValue = 0;
            if (!CommonUtils.isEmpty(dashboardId)) {
    @NotNull
    }
/*
                }

        try {
        this.openConnectionOnActivate = openConnectionOnActivate;
import org.jkiss.dbeaver.Log;
                if (CommonUtils.isEmpty(dashboardId)) {
        @NotNull DBPProject project,
        return viewId.toString();
                    DashboardItemViewSettings itemConfig = new DashboardItemViewSettings(this, dashboardId, dbElement);
    }
    public String getDashboardId() {
 * distributed under the License is distributed on an "AS IS" BASIS,
                    openConnectionOnActivate = CommonUtils.getBoolean(viewElement.getAttribute("openConnectionOnActivate"), openConnectionOnActivate);
    }
        }
import org.jkiss.dbeaver.DBException;

    private static final Log log = Log.getLog(DashboardConfiguration.class);
    private boolean useSeparateConnection;
public class DashboardConfiguration implements DBDashboard {
            }
        } else {
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.dashboardId = dashboardFile.getFullPath().toString();

    public String getTitle() {

    private String dashboardId;
 * Licensed under the Apache License, Version 2.0 (the "License");
            curConfig.copyFrom(config);
        }

        DashboardItemViewSettings curConfig = getItemConfig(config.getItemId());
    public DashboardItemViewSettings getItemConfig(String itemId) {
        this.dataSourceContainer = null;
            if (item.getItemId().equals(itemId)) {
    private final DBPDataSourceContainer dataSourceContainer;
/**
 * you may not use this file except in compliance with the License.
 *
                xml.addAttribute("id", dashboardId);
            }
                    xml.addAttribute("openConnectionOnActivate", openConnectionOnActivate);
        @NotNull IFile dashboardFile
                }

                }
        return project;
 * DashboardViewConfiguration
    public DashboardItemViewSettings readDashboardItemConfiguration(DashboardItemConfiguration item) {

import org.jkiss.dbeaver.model.dashboard.DBDashboardItem;
    DashboardConfiguration(
        viewId.append(REF_PREFIX).append(Parameter.project.name()).append("=").append(project.getName());
            return itemConfig;
                    initDefaultCharts = CommonUtils.getBoolean(viewElement.getAttribute("initDefaultCharts"), initDefaultCharts);
            if (!CommonUtils.isEmpty(dashboardName)) {
            }
                return item;

            items.add(itemViewConfiguration);
            items.add(config);

        this.useSeparateConnection = useSeparateConnection;

    public enum Parameter {
    @Override
                    xml.addAttribute("initDefaultCharts", initDefaultCharts);
    public List<DBDashboardItem> getDashboardItems() {
                if (CommonUtils.isEmpty(dashboardId)) {
    @NotNull
        project,
        if (dataSourceContainer != null) {
    @Nullable
        this.dataSourceContainer = dataSourceContainer;
import org.jkiss.dbeaver.model.app.DBPProject;
import java.util.ArrayList;
    private boolean openConnectionOnActivate;
        return CommonUtils.isEmpty(dashboardName) ? dashboardId : dashboardName;

        if (id != null) {
    public String getDashboardName() {
    void loadConfiguration(Element rootElement) {
    public boolean removeItemConfiguration(DashboardItemViewSettings item) {

    }
    public void updateItemConfig(DashboardItemViewSettings config) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    }
            }
        for (DashboardItemViewSettings item : items) {

    private boolean initDefaultCharts = true;
    public void removeItem(String itemID) {
 * Copyright (C) 2010-2024 DBeaver Corp and others

    public void setUseSeparateConnection(boolean useSeparateConnection) {

                }
        this.project = project;
    }
        StringBuilder viewId = new StringBuilder();
                    xml.addAttribute("useSeparateConnection", useSeparateConnection);
import org.jkiss.code.NotNull;

        return dashboardName;
    void serializeConfig(XMLBuilder xml) throws IOException {
        if (itemConfig != null) {
        }
    private String dashboardName;
                    itemConfig.serialize(xml);

    public boolean isInitDefaultCharts() {

        id
            }
import org.w3c.dom.Element;

    public DBPProject getProject() {
                    dashboardId = DashboardConfigurationList.DEFAULT_DASHBOARD_ID;
        }
    public boolean isUseSeparateConnection() {
            }
                }
        datasource,
                item.setIndex(item.getIndex() - decValue);
        return null;
        return new ArrayList<>(items);
 *
    public void setDashboardName(String dashboardName) {


            } catch (Exception e) {


    }
                log.error("Error loading dashboard view configuration", e);
    }
                    items.add(itemConfig);
import org.jkiss.code.Nullable;
        return dashboardId;
import java.util.Comparator;
                }
    }
    }

    }
                    useSeparateConnection = CommonUtils.getBoolean(viewElement.getAttribute("useSeparateConnection"), useSeparateConnection);
    }
            if (item.getItemId().equals(itemID)) {
    private final List<DashboardItemViewSettings> items = new ArrayList<>();
import java.util.stream.Collectors;
    @NotNull
            viewId.append(",").append(Parameter.datasource.name()).append("=").append(dataSourceContainer.getId());
            DashboardItemViewSettings itemViewConfiguration = new DashboardItemViewSettings(this, item, items.size());
    public static String getViewId(DBPProject project, DBPDataSourceContainer dataSourceContainer, String id) {

        return initDefaultCharts;
                decValue++;
    @NotNull
        for (int i = 0; i < items.size(); ) {

    }
    ) {
        }
    public void setOpenConnectionOnActivate(boolean openConnectionOnActivate) {
                    String dashboardId = dbElement.getAttribute("id");
package org.jkiss.dbeaver.ui.dashboard.model;
 * You may obtain a copy of the License at
        return items.remove(item);
        try (var ignored = xml.startElement("dashboards")) {

                    dashboardName = DashboardConfigurationList.DEFAULT_DASHBOARD_NAME;


        return openConnectionOnActivate;
            return null;
    }
    @NotNull
                xml.addAttribute("name", dashboardName);
 */
 */
import org.jkiss.dbeaver.model.dashboard.registry.DashboardItemConfiguration;
}
 * Unless required by applicable law or agreed to in writing, software
        DashboardItemViewSettings itemConfig = getItemConfig(item.getId());
import org.jkiss.utils.xml.XMLUtils;
            } else {
                if (useSeparateConnection) {
    }
    public boolean isOpenConnectionOnActivate() {

        }
            try (var ignored2 = xml.startElement("view")) {
            try {

        }

    private final DBPProject project;
        }
        @Nullable String dashboardId
import java.util.List;
                if (!initDefaultCharts) {
        } catch (DBException e) {
    }
        return dataSourceContainer;
        this.dashboardName = dashboardName;
 * limitations under the License.
        if (rootElement != null) {

        if (curConfig == null) {
 *
        this.initDefaultCharts = initDefaultCharts;
    }
                for (Element dbElement : XMLUtils.getChildElementList(rootElement, "dashboard")) {
    ) {
        }
 * See the License for the specific language governing permissions and
        this.items.clear();
            for (DashboardItemViewSettings itemConfig : items) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
