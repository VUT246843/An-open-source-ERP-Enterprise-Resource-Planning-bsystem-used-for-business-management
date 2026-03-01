    }
    }
package org.jkiss.dbeaver.ui.dashboard.model;
    public void setDomainTicksVisible(boolean domainTicksVisible) {
import java.io.IOException;

import org.jkiss.dbeaver.model.dashboard.registry.DashboardRegistry;


    }
        this.widthRatio = dashboardDescriptor.getWidthRatio();
            try {
    public int getMaxItems() {
        xml.addAttribute("id", getFullDashboardId());

        return index;
    public boolean isGridVisible() {
    }
import org.jkiss.utils.CommonUtils;
    public String toString() {
    public void setDescription(String description) {
                DBPDataSourceContainer dataSourceContainer = viewConfiguration.getDataSourceContainer();
    }
    private DashboardItemConfiguration dashboardItem;
            xml.addAttribute("description", description);
        this.widthRatio = (float) CommonUtils.toDouble(element.getAttribute("widthRatio"));
    }
    }
        }
    @Override
    }
 * See the License for the specific language governing permissions and
        this.viewConfiguration = source.viewConfiguration;
    public void setWidthRatio(float widthRatio) {
    public void setUpdatePeriod(long updatePeriod) {
                    log.debug("Configuration item '" + itemId + "' not found in registry");
        this.updatePeriod = source.updatePeriod;
 * Licensed under the Apache License, Version 2.0 (the "License");



                        new DBDashboardContext(dataSourceContainer) :
        }
    }


        this.viewTypeId = source.viewTypeId;
                        new DBDashboardContext(viewConfiguration.getProject()),
    private boolean domainTicksVisible;

 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private int maxItems;
        return updatePeriod;
    public DashboardConfiguration getViewConfiguration() {
        return dashboardItem;
import org.jkiss.dbeaver.model.dashboard.DBDashboardContext;
        this.legendVisible = CommonUtils.getBoolean(element.getAttribute("legendVisible"), true);
        xml.addAttribute("index", index);
            }

        if (!CommonUtils.isEmpty(description)) {
 * DBeaver - Universal Database Manager


                    itemId);
}
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
 *

    }
 * You may obtain a copy of the License at
    }
        this.maxAge = maxAge;

    }
        this.index = index;
 * you may not use this file except in compliance with the License.
        return dashboardItem;
    }
                path += "/";
    void copyFrom(DashboardItemViewSettings source) {
        this.index = source.index;
        if (dashboardItem != null) {
    }
            xml.addAttribute("maxAge", maxAge);
    private static final Log log = Log.getLog(DashboardItemViewSettings.class);
    private String itemId;
        this.gridVisible = gridVisible;
        this.updatePeriod = updatePeriod;
            }
    public String getDescription() {
    }
        this.maxAge = CommonUtils.toLong(element.getAttribute("maxAge"));

        this.gridVisible = CommonUtils.getBoolean(element.getAttribute("gridVisible"), false);

    public long getUpdatePeriod() {
 * distributed under the License is distributed on an "AS IS" BASIS,

                log.debug("Dashboard '" + itemId + "' not found", e);

    private String viewTypeId;
                if (dashboardItem == null) {
                }
    private long maxAge;

    }

 * Copyright (C) 2010-2025 DBeaver Corp and others
        this.updatePeriod = dashboardDescriptor.getUpdatePeriod();
    }
        return maxAge;
        this.viewConfiguration = viewConfiguration;
        return widthRatio;
    }

    private boolean gridVisible;
        this.maxItems = maxItems;
        this.rangeTicksVisible = true;

        return viewConfiguration;
    @Nullable
        return legendVisible;

            vtId = dashboard == null ? DashboardConstants.DEF_DASHBOARD_VIEW_TYPE : dashboard.getDashboardRenderer();
                return null;
/*
                    dataSourceContainer != null ?
            } else {
        this.maxItems = dashboardDescriptor.getMaxItems();
        return description;
    public DashboardItemConfiguration getItemConfiguration() {


        this.viewTypeId = dashboardDescriptor.getDashboardRenderer();
    void serialize(XMLBuilder xml) throws IOException {

import org.jkiss.code.Nullable;
    public void setIndex(int index) {
        xml.addAttribute("viewType", viewTypeId);
import org.jkiss.dbeaver.ui.dashboard.registry.DashboardUIRegistry;
        return dashboardItem == null ? itemId : dashboardItem.getId();


        this.domainTicksVisible = domainTicksVisible;
 *
    public String getItemId() {
        this.description = dashboardDescriptor.getDescription();
    public float getWidthRatio() {
            return dashboardItem.getDashboardProvider().getId() + ":" + path + dashboardItem.getId();

    public int getIndex() {
import org.w3c.dom.Element;
    public void setLegendVisible(boolean legendVisible) {
            DashboardItemConfiguration dashboard = getItemConfiguration();
    }
        this.description = description;
            xml.addAttribute("rangeTicksVisible", rangeTicksVisible);
        this.dashboardItem = dashboardDescriptor;
    }
        return rangeTicksVisible;
    private boolean rangeTicksVisible;
        this.maxItems = CommonUtils.toInt(element.getAttribute("maxItems"));
        this.legendVisible = true;
    public void setViewType(DashboardRendererType viewType) {
 */
    private int index;

        this.legendVisible = legendVisible;
    public String getFullDashboardId() {
    private long updatePeriod;
        //this.gridVisible = true;

        this.viewTypeId = viewType.getId();


            xml.addAttribute("maxItems", maxItems);
        this.legendVisible = source.legendVisible;
        return domainTicksVisible;

    }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        this.description = element.getAttribute("description");
        if (isNativeRenderer) {

    }
        copyFrom(source);
    private boolean legendVisible;
                    new VoidProgressMonitor(),
        return gridVisible;

public class DashboardItemViewSettings {
import org.jkiss.utils.xml.XMLBuilder;
        this.domainTicksVisible = CommonUtils.getBoolean(element.getAttribute("domainTicksVisible"), true);

    private String description;
        }
    }

 * Unless required by applicable law or agreed to in writing, software
        this.updatePeriod = CommonUtils.toLong(element.getAttribute("updatePeriod"));
    }

        if (CommonUtils.isEmpty(vtId)) {

            xml.addAttribute("domainTicksVisible", domainTicksVisible);
import org.jkiss.dbeaver.model.dashboard.DashboardConstants;
        this.domainTicksVisible = true;
        this.gridVisible = source.gridVisible;
    DashboardItemViewSettings(DashboardConfiguration viewConfiguration, DashboardItemConfiguration dashboardDescriptor, int index) throws DBException {
        this.rangeTicksVisible = rangeTicksVisible;
    }

        xml.addAttribute("widthRatio", widthRatio);
    public void setGridVisible(boolean gridVisible) {
            xml.addAttribute("gridVisible", gridVisible);
        this.maxItems = source.maxItems;
    public boolean isDomainTicksVisible() {
import org.jkiss.dbeaver.Log;
        this.widthRatio = source.widthRatio;
import org.jkiss.dbeaver.model.dashboard.registry.DashboardItemConfiguration;

        }
    public DashboardItemConfiguration getDashboardItem() {
        this.itemId = id;
                path = "";
        this.maxAge = dashboardDescriptor.getMaxAge();
    }
    }
        if (dashboardItem == null) {
            } catch (DBException e) {

    public DashboardItemViewSettings(DashboardConfiguration viewConfiguration, String id, Element element) {
    }

        this.domainTicksVisible = source.domainTicksVisible;

    }
        this.viewConfiguration = viewConfiguration;
        xml.addAttribute("updatePeriod", updatePeriod);
    }
        this.dashboardItem = source.dashboardItem;
    public void setMaxAge(long maxAge) {
    public void setMaxItems(int maxItems) {
        this.widthRatio = widthRatio;
 * limitations under the License.
    private float widthRatio;
import org.jkiss.dbeaver.ui.dashboard.registry.DashboardRendererDescriptor;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        String vtId = viewTypeId;
    public void setRangeTicksVisible(boolean rangeTicksVisible) {
    public DashboardItemViewSettings(DashboardItemViewSettings source) {

        return itemId;
        DashboardRendererDescriptor viewType = DashboardUIRegistry.getInstance().getViewType(viewTypeId);
    public boolean isLegendVisible() {
        return maxItems;

        return getItemId() + ":" + index;
            if (path != null) {
    public DashboardRendererType getViewType() {
        this.index = index;
    public long getMaxAge() {
        return DashboardUIRegistry.getInstance().getViewType(vtId);
        this.maxAge = source.maxAge;
    }
    private final DashboardConfiguration viewConfiguration;
            xml.addAttribute("legendVisible", legendVisible);
        boolean isNativeRenderer = viewType != null && viewType.isNativeRenderer();
                dashboardItem = DashboardRegistry.getInstance().findDashboardItem(
        }
    public boolean isRangeTicksVisible() {
        this.rangeTicksVisible = source.rangeTicksVisible;
        this.rangeTicksVisible = CommonUtils.getBoolean(element.getAttribute("rangeTicksVisible"), true);

        this.description = source.description;
        this.index = CommonUtils.toInt(element.getAttribute("index"));
        this.viewTypeId = element.getAttribute("viewType");
            String path = dashboardItem.getPath();
import org.jkiss.dbeaver.DBException;


