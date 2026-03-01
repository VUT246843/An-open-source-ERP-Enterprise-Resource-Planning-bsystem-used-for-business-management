        this.dataType = dataType;
    private DBDashboardCalcType calcType;
    }
        this.resolveVariables = CommonUtils.getBoolean(config.getAttribute("resolveVariables"), true);

        return url;
package org.jkiss.dbeaver.model.dashboard.registry;
public class DashboardItemConfiguration extends AbstractContextDescriptor implements DBDashboardItem {
        this.fetchType = DashboardConstants.DEF_DASHBOARD_FETCH_TYPE;
        this.tags = tags;
        return resolveVariables;
    }
    private final Set<OSDescriptor> supportedSystems = new HashSet<>();
        this.interval = DashboardConstants.DEF_DASHBOARD_INTERVAL;
        return mapFormulaExpr;
    }
    }
    }
                return false;
        return true;

        if (provider != null) {
    @Nullable
        this.maxItems = source.maxItems;
    private int maxItems;

            }
 */
        this.updatePeriod = DashboardConstants.DEF_DASHBOARD_UPDATE_PERIOD;

        queries.clear();
    void serialize(XMLBuilder xml) throws IOException {
                variableResolver = new DataSourceVariableResolver(dataSourceContainer, dataSourceContainer.getConnectionConfiguration());

    private final DashboardProviderDescriptor provider;
                this.mapQuery = mapQueryProvider.getMapQuery(mapQueryId);
    public List<QueryMapping> getQueries() {
    public long getUpdatePeriod() {
            queries.add(new QueryMapping(qs.trim()));
        }
    public void setCalcType(DBDashboardCalcType calcType) {
    public void setMaxAge(long maxAge) {
            }
        private final String dataSourceProvider;
    public DBDashboardFolder getFolder() {


        return maxAge;
    public String getDisplayName() {
    private long updatePeriod;
                variableResolver = new SystemVariablesResolver();
    @Nullable
    public String evaluateURL(String url, DBPProject project, DBPDataSourceContainer dataSourceContainer) {
        this.valueType = CommonUtils.valueOf(DBDashboardValueType.class, config.getAttribute("value"), DashboardConstants.DEF_DASHBOARD_VALUE_TYPE);
        this.widthRatio = DashboardConstants.DEF_DASHBOARD_WIDTH_RATIO;

        super(config);
        }
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.registry.RegistryConstants;
            xml.addAttribute("resolveVariables", true);
    private DBDashboardFetchType fetchType;
        this.provider = provider;
        return interval;
    public DashboardProviderDescriptor getDashboardProvider() {
    public String getPath() {

        }
        this.folder = folder;

    }

        if (CommonUtils.isEmpty(providerId)) {
        DataSourceMapping(Element config) {
    }
            if (!CommonUtils.isEmpty(mapQueryId)) {
                    .getDataSourceProvider(this.dataSourceProvider);
    public JexlExpression getMapFormulaExpr() {
            this.renderer = DashboardConstants.DEF_DASHBOARD_VIEW_TYPE;
        }

 * distributed under the License is distributed on an "AS IS" BASIS,

        this.calcType = source.calcType;
            this.dataSourceProvider = CommonUtils.nullIfEmpty(config.getAttribute("id"));
    public void setName(@NotNull String name) {
    }

                return false;
        this.provider = registry.getDashboardProvider(providerId);

        this.provider = source.provider;
    }
        boolean matches(String providerId, String checkDriverId, String checkDriverClass) {
                    results.add(provider);

import org.apache.commons.jexl3.JexlExpression;
    private String id;

            }
            return null;

        this.isCustom = true;
    public String getName() {
 *
        }
import java.util.List;
    }
        }
    public void setFetchType(DBDashboardFetchType fetchType) {
        this.description = config.getAttribute("description");
        }
            if (dsm.dataSourceProvider != null) {
            if (dataSourceContainer != null) {
        }

    @NotNull
import org.jkiss.dbeaver.model.DBPNamedObject;
import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;
    DashboardItemConfiguration(
    private String description;
    }

        this.dashboardExternalURL = config.getAttribute("externalUrl");

        return results;

        void serialize(XMLBuilder xml) throws IOException {
        this.id = config.getAttribute("id");
        }
        this.resolveVariables = source.resolveVariables;
        }
        if (!CommonUtils.isEmpty(displayName)) {
                            log.warn(e);
        return getSupportedSources();
    private JexlExpression mapFormulaExpr;
    public void setTags(String[] tags) {

            if (checkDriverClass != null && this.driverClass != null && !this.driverClass.equals(checkDriverClass)) {
        this.name = config.getAttribute("label");
            this.driverClass = CommonUtils.nullIfEmpty(config.getAttribute("driverClass"));
        this.dataSourceMappings.addAll(source.dataSourceMappings);
    }
    private boolean isCustom;

        }
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public DBDashboardFetchType getFetchType() {
        private final String driverClass;
    }
    }
 * you may not use this file except in compliance with the License.
                    .getDataSourceProviderRegistry()

        }
        this.isCustom = true;
        if (!ArrayUtils.isEmpty(tags)) {

import java.util.HashSet;
    }
        this.displayName = displayName;
        this.maxItems = maxItems;
    private String mapFormula;
    @Override
    }
    private String measure;
        this.dashboardURL = source.dashboardURL;
        return mapKeys;
                qm.serialize(xml);
            return GeneralUtils.replaceVariables(url, variableResolver);


        this.id = id;
            xml.addAttribute("mapFormula", mapFormula);
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        this.updatePeriod = CommonUtils.toLong(config.getAttribute("updatePeriod"), DashboardConstants.DEF_DASHBOARD_UPDATE_PERIOD); // Default ratio is 2 to 3
        return renderer;

        if (mapQuery != null) {
        this.queries.addAll(source.queries);

        this.name = name;
    public boolean isResolveVariables() {
                    this.mapKeys = CommonUtils.split(config.getAttribute("mapKeys"), ",");
                dataSourceMappings.add(
    private DBDashboardDataType dataType;
        xml.addAttribute("calc", calcType.name());

        this.name = source.name;
        this.renderer = source.renderer;

                // Try finding a matching child provider
            if (target instanceof DBPDataSourceProviderDescriptor) {
    public DashboardItemConfiguration(DashboardItemConfiguration source) {
    public String getDashboardURL() {

        this.group = source.group;
        this.isCustom = custom;
        this.calcType = CommonUtils.valueOf(DBDashboardCalcType.class, config.getAttribute("calc"), DashboardConstants.DEF_DASHBOARD_CALC_TYPE);

import org.w3c.dom.Element;
        this.measure = measure;
        this.resolveVariables = resolveVariables;

import java.util.ArrayList;
        return id;
            this.driverClass = driverClass;

        this.description = config.getAttribute("description");
        this.showByDefault = CommonUtils.toBoolean(config.getAttribute("showByDefault"));
    }
        return widthRatio;
        }
    }

    @NotNull
    private String[] mapKeys;
    public void setInterval(DBDashboardInterval interval) {
    @NotNull
        this.group = config.getAttribute("group");
        }
 * Copyright (C) 2010-2024 DBeaver Corp and others

        if (resolveVariables) {
        this.interval = source.interval;
    @NotNull
        this.renderer = renderer;
        xml.addAttribute("ratio", widthRatio);
        }
import org.jkiss.code.NotNull;
    public void setMaxItems(int maxItems) {
 * DashboardItemDescriptor

    public boolean isShowByDefault() {

        this.group = group;
        this.maxAge = CommonUtils.toLong(config.getAttribute("maxAge"), DashboardConstants.DEF_DASHBOARD_MAXIMUM_AGE);

        if (!CommonUtils.isEmpty(measure)) {
    }
    ) {

        this.fetchType = fetchType;
    public void setWidthRatio(float widthRatio) {
    public float getWidthRatio() {
    private final List<QueryMapping> queries = new ArrayList<>();
        if (provider == null) {
    }
        }
        this.fetchType = source.fetchType;
    public String getDashboardExternalURL() {
        }
    @Override
        this.updatePeriod = source.updatePeriod;


        this.maxAge = DashboardConstants.DEF_DASHBOARD_MAXIMUM_AGE;
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.DBException;
            IVariableResolver variableResolver;
    @Nullable
        private final String driverId;
        if (CommonUtils.isEmpty(this.renderer)) {
    private DashboardMapQueryDescriptor mapQuery;
        if (!CommonUtils.isEmpty(description)) {
                DBPDataSourceProviderDescriptor provider = platform.getDataSourceProviderRegistry().getDataSourceProvider(dsm.dataSourceProvider);

        this.dataType = CommonUtils.valueOf(DBDashboardDataType.class, config.getAttribute("dataType"), DashboardConstants.DEF_DASHBOARD_DATA_TYPE);
        }

        this.displayName = source.displayName;
    private DBDashboardValueType valueType;
    public String getTitle() {
    public void setDashboardExternalURL(String dashboardExternalURL) {
        if (!CommonUtils.isEmpty(mapFormula)) {
    }


        boolean custom

            supportedSystems.add(new OSDescriptor(
    }

import org.eclipse.core.runtime.IConfigurationElement;
        xml.addAttribute("showByDefault", showByDefault);
            }
    public DBDashboardValueType getValueType() {
        if (folder == null) {
        for (DataSourceMapping dsm : dataSourceMappings) {
    ) {

    }
        this.description = description;
        xml.addAttribute("updatePeriod", updatePeriod);
            if (checkDriverId != null && this.driverId != null && !this.driverId.equals(checkDriverId)) {
        for (IConfigurationElement ds : config.getChildren("query")) {
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    public void setResolveVariables(boolean resolveVariables) {
        this.description = source.description;
    public String getMeasure() {
    }
        xml.addAttribute("interval", interval.name());
        xml.addAttribute("maxItems", maxItems);

    public List<DBPNamedObject> getDataSourceMappings() {
            } else {
                    List<DBPDataSourceProviderDescriptor> childrenProviders = provider.getChildrenProviders();
    public String toString() {
                return true;
import java.util.Set;
            xml.addText(queryText);
    public int getMaxItems() {
        this.maxAge = source.maxAge;
        xml.addAttribute("label", name);
            }
        return measure;
            // Multi-platform
    private String[] mapLabels;
                    new DataSourceMapping(((DBPDataSourceProviderDescriptor) target).getId(), null, null));
import org.jkiss.dbeaver.Log;
        MapQueryProvider mapQueryProvider,


        List<DBPNamedObject> results = new ArrayList<>();
 *
        }
        for (DataSourceMapping dsm : dataSourceMappings) {

        this.dashboardURL = config.getAttribute("url");
import org.jkiss.dbeaver.runtime.DBWorkbench;


    @Override

        this.updatePeriod = updatePeriod;
        this.resolveVariables = CommonUtils.getBoolean(config.getAttribute("resolveVariables"), true);
            this.dataType = DBDashboardDataType.provided;
    @Override
    public void setCustom(boolean custom) {
        this.dashboardURL = config.getAttribute("url");
        return name;

    private float widthRatio;

        return tags;
                if (provider != null) {
    }
    }
    public DBDashboardDataType getDataType() {
        this.displayName = config.getAttribute("displayName");
import org.jkiss.dbeaver.utils.GeneralUtils;
        return mapQuery;
            queries.add(new QueryMapping(ds));
        xml.addAttribute("maxAge", maxAge);
        }
        }
    }
        this.dashboardExternalURL = source.dashboardExternalURL;
    private static class DataSourceMapping {
        this.fetchType = CommonUtils.valueOf(DBDashboardFetchType.class, config.getAttribute("fetch"), DashboardConstants.DEF_DASHBOARD_FETCH_TYPE);
    public String getGroup() {
        this.calcType = DashboardConstants.DEF_DASHBOARD_CALC_TYPE;

        return provider;
    }
            xml.addAttribute("measure", measure);
    private String group;
        }
        for (IConfigurationElement ds : config.getChildren("datasource")) {
    public DBDashboardInterval getInterval() {
        this.description = description;
import org.jkiss.utils.CommonUtils;
        void serialize(XMLBuilder xml) throws IOException {
        for (Element ds : XMLUtils.getChildElementList(config, "datasource")) {
            try (var ignored = xml.startElement("datasource")) {
        this.dataType = CommonUtils.valueOf(DBDashboardDataType.class, config.getAttribute("dataType"), DashboardConstants.DEF_DASHBOARD_DATA_TYPE);
    }

    }
        for (IConfigurationElement os : config.getChildren(RegistryConstants.TAG_OS)) {
    private boolean resolveVariables = true;
import org.jkiss.dbeaver.model.runtime.OSDescriptor;
        {
                    }
    }
        return CommonUtils.isEmpty(displayName) ? name : displayName;
        this.group = config.getAttribute("group");
    }
}

        @Nullable String group,
    public boolean isCustom() {
    DashboardItemConfiguration(DashboardRegistry registry, Element config) {
    @Override
            } else if (dsm.driverId != null) {
        this.widthRatio = (float) CommonUtils.toDouble(config.getAttribute("ratio"), DashboardConstants.DEF_DASHBOARD_WIDTH_RATIO); // Default ratio is 2 to 3
            this.dataSourceProvider = dataSourceProvider;

            xml.addAttribute("mapQuery", mapQuery.getId());
        return dataType;
                    childHasMatch = childrenProviders.stream().map(DBPDataSourceProviderDescriptor::getId).anyMatch(providerId::equals);
        return false;
                DBPDriver driver = platform.getDataSourceProviderRegistry().findDriver(dsm.driverId);


        if (this.renderer.equals("browser") && this.dataType == DBDashboardDataType.timeseries) {
        super(DashboardConstants.DASHBOARDS_PLUGIN_ID);
        @NotNull String name,
        this.tags = CommonUtils.split(config.getAttribute("tags"), ",");
        }
    public boolean matches(String providerId, String driverId, String driverClass) {
        @NotNull DashboardProviderDescriptor provider,
        this.tags = CommonUtils.split(config.getAttribute("tags"), ",");
        this.tags = source.tags;
        if (CommonUtils.isEmpty(this.renderer)) {
    }
        this.dashboardExternalURL = config.getAttribute("externalUrl");
        this.displayName = config.getAttribute("displayName");
            } else if (target instanceof DBPDriver) {
            this.driverClass = CommonUtils.nullIfEmpty(config.getAttribute("driverClass"));
        }
        this.maxItems = CommonUtils.toInt(config.getAttribute("maxItems"), DashboardConstants.DEF_DASHBOARD_MAXIMUM_ITEM_COUNT);
        StringBuilder path = new StringBuilder();
        public DataSourceMapping(String dataSourceProvider, String driverId, String driverClass) {
        return displayName;
/*
        this.measure = config.getAttribute("measure");
    }
            this.renderer = DashboardConstants.DEF_DASHBOARD_VIEW_TYPE;
        }

        @Nullable DBDashboardFolder folder,
        }
                dataSourceMappings.add(new DataSourceMapping(driver.getProviderId(), driver.getId(), null));
        return description;
        this.widthRatio = source.widthRatio;
            xml.addAttribute("group", group);
import org.jkiss.dbeaver.model.connection.DBPDataSourceProviderDescriptor;
    public static class QueryMapping implements DBDashboardQuery {
                return false;
        this.widthRatio = (float) CommonUtils.toDouble(config.getAttribute("ratio"), DashboardConstants.DEF_DASHBOARD_WIDTH_RATIO);
    }


            xml.addAttribute("provider", provider.getId());
        return queries;
        this.valueType = source.valueType;
        if (!ArrayUtils.isEmpty(mapKeys)) {


import org.jkiss.dbeaver.model.connection.DataSourceVariableResolver;
    public void setQueries(String[] queryStrings) {
    }
            this.queryText = XMLUtils.getElementBody(config);
                os.getAttribute(RegistryConstants.ATTR_ARCH)));
        }
    @NotNull
        this.maxItems = CommonUtils.toInt(config.getAttribute("maxItems"), DashboardConstants.DEF_DASHBOARD_MAXIMUM_ITEM_COUNT);
        this.widthRatio = widthRatio;

        return dashboardExternalURL;
        for (QueryMapping qm : queries) {
            if (this.dataSourceProvider != null && !this.dataSourceProvider.equals(providerId)) {

                if (!childHasMatch) {
    private static final Log log = Log.getLog(DashboardItemConfiguration.class);
                        try {
    private String name;


        this.valueType = CommonUtils.valueOf(DBDashboardValueType.class, config.getAttribute("value"), DashboardConstants.DEF_DASHBOARD_VALUE_TYPE);
    }
    public long getMaxAge() {
                    this.mapLabels = CommonUtils.split(config.getAttribute("mapLabels"), ",");
        this.dataType = source.dataType;
    }
        this.id = config.getAttribute("id");
    }
                        } catch (DBException e) {
            xml.addAttribute("tags", String.join(",", tags));
        for (String qs : queryStrings) {
        this.valueType = DashboardConstants.DEF_DASHBOARD_VALUE_TYPE;
            }
        }

import org.jkiss.utils.ArrayUtils;

        DashboardMapQueryDescriptor getMapQuery(String id);
        this.measure = config.getAttribute("measure");
    }
    }


/**
        super(DashboardConstants.DASHBOARDS_PLUGIN_ID);
    public void setDataType(DBDashboardDataType dataType) {
import org.jkiss.dbeaver.model.app.DBPPlatform;
    private final List<DataSourceMapping> dataSourceMappings = new ArrayList<>();
 */
        for (OSDescriptor system : supportedSystems) {
        if (!CommonUtils.isEmpty(dashboardURL)) {

                }
    }
        dataSourceMappings.clear();
    }
        }
    public boolean isSupportedByLocalSystem() {
    }

        return mapLabels;
        QueryMapping(IConfigurationElement config) {
        }
            xml.addAttribute("description", description);
        this.group = group;
        return id;
        if (CommonUtils.isEmpty(this.renderer)) {
    }

        xml.addAttribute("id", id);
        return fetchType;
    public void setId(@NotNull String id) {

    @NotNull

            this.queryText = queryText;

                if (driver != null) {
    public void setValueType(DBDashboardValueType valueType) {
    public interface MapQueryProvider {

    private long maxAge;
        return folder;
        this.name = config.getAttribute("label");
    }
    @Override
        }
            }
                            this.mapFormulaExpr = AbstractDescriptor.parseExpression(this.mapFormula);
            if (!CommonUtils.isEmpty(driverId)) xml.addAttribute("driver", driverId);
    public void setGroup(String group) {
    public void setRenderer(String renderer) {
        return path.toString();
        }
        this.isCustom = source.isCustom;
        return isCustom;

    }
                    results.add(driver);
        this.maxAge = CommonUtils.toLong(config.getAttribute("maxAge"), DashboardConstants.DEF_DASHBOARD_MAXIMUM_AGE);
        this.valueType = valueType;
        }
        return calcType;
        }

                    if (!CommonUtils.isEmpty(this.mapFormula)) {
    }

                }
    }
        this.dataType = DBDashboardDataType.timeseries;
            try (var ignored = xml.startElement("query")) {
                DBPDataSourceProviderDescriptor provider = DBWorkbench.getPlatform()
        private final String queryText;

    private String renderer;
                boolean childHasMatch = false;
        }
        }
    public void setDashboardURL(String dashboardURL) {
            if (!CommonUtils.isEmpty(driverClass)) xml.addAttribute("driverClass", driverClass);
    }
import org.jkiss.utils.xml.XMLBuilder;
import org.jkiss.dbeaver.utils.SystemVariablesResolver;
    public DBDashboardCalcType getCalcType() {
            }
import org.jkiss.dbeaver.model.connection.DBPDriver;
import java.io.IOException;
        this.maxItems = DashboardConstants.DEF_DASHBOARD_MAXIMUM_ITEM_COUNT;
 * You may obtain a copy of the License at
        this.interval = CommonUtils.valueOf(DBDashboardInterval.class, config.getAttribute("interval"), DashboardConstants.DEF_DASHBOARD_INTERVAL);
    }
            queries.add(new QueryMapping(ds));
    @Override
        DBPPlatform platform = DBWorkbench.getPlatform();
            return queryText;
    public String[] getTags() {
        }
                DBPDriver driver = (DBPDriver) target;
        xml.addAttribute("viewType", renderer);
            }
                mapping.serialize(xml);
        this.renderer = config.getAttribute("viewType");
                        }

    private String dashboardURL;
        IConfigurationElement config

    public String[] getMapLabels() {
    }

    }
        this.calcType = calcType;
            xml.addAttribute("mapKeys", String.join(",", mapKeys));
    @Override
        DashboardProviderDescriptor provider,
    public void setDisplayName(String displayName) {
    private String[] tags;


        for (Element ds : XMLUtils.getChildElementList(config, "query")) {
        xml.addAttribute("fetch", fetchType.name());
            path.insert(0, '/' + f.getId());
            return true;
    @Override
    public String getDashboardRenderer() {
        for (DataSourceMapping mapping : dataSourceMappings) {

        this.id = id;
    }
        }
        this.renderer = DashboardConstants.DEF_DASHBOARD_VIEW_TYPE;
    public String getId() {
        public String getQueryText() {
        for (DBDashboardFolder f = folder; f != null; f = f.getParent()) {
    }
        @Nullable String description,
        @Override
        }
            dataSourceMappings.add(new DataSourceMapping(ds));
                os.getAttribute(RegistryConstants.ATTR_NAME),
            dataSourceMappings.add(new DataSourceMapping(ds));
        }
        if (!CommonUtils.isEmpty(dashboardExternalURL)) {


        this.showByDefault = CommonUtils.toBoolean(config.getAttribute("showByDefault"));
    private boolean showByDefault;
        return valueType;

    private DBDashboardFolder folder;
        @NotNull String id,
        xml.addAttribute("value", valueType.name());
        String providerId = config.getAttribute("provider");
        this.dashboardURL = dashboardURL;
                    this.mapFormula = config.getAttribute("mapFormula");
    public void setDescription(String description) {
        this.renderer = config.getAttribute("defaultView");

        }
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.dashboard"; //$NON-NLS-1$
            this.driverId = CommonUtils.nullIfEmpty(config.getAttribute("driver"));
            providerId = DashboardConstants.DEF_DASHBOARD_PROVIDER;
        this.name = name;
            if (!dsm.matches(providerId, driverId, driverClass)) {
    private String displayName;

        return showByDefault;

    }
    }
        }
        if (supportedSystems.isEmpty()) {
    }
        OSDescriptor localSystem = DBWorkbench.getPlatform().getLocalSystem();
    public void setUpdatePeriod(long updatePeriod) {
    }
            if (!CommonUtils.isEmpty(dataSourceProvider)) xml.addAttribute("id", dataSourceProvider);
        if (resolveVariables) {
            }
        for (DBPNamedObject target : targets) {

import org.jkiss.dbeaver.runtime.IVariableResolver;
        DataSourceMapping(IConfigurationElement config) {
    public String[] getMapKeys() {
        this.maxAge = maxAge;
        public QueryMapping(String queryText) {
        }
        this.interval = CommonUtils.valueOf(DBDashboardInterval.class, config.getAttribute("interval"), DashboardConstants.DEF_DASHBOARD_INTERVAL);

        this.fetchType = CommonUtils.valueOf(DBDashboardFetchType.class, config.getAttribute("fetch"), DashboardConstants.DEF_DASHBOARD_FETCH_TYPE);
                }
            this.queryText = config.getValue();
import org.jkiss.utils.xml.XMLUtils;
 * See the License for the specific language governing permissions and

        this.interval = interval;
import org.jkiss.dbeaver.model.app.DBPProject;
                    return false;
        this.isCustom = false;
    }
    public DashboardItemConfiguration(
        }
                if (this.mapQuery != null) {

            this.dataSourceProvider = CommonUtils.nullIfEmpty(config.getAttribute("id"));
            // NOTE: Fix for old dashboards with browser renderer

                }
    }
            this.driverId = driverId;
    private DBDashboardInterval interval;
        if (!CommonUtils.isEmpty(group)) {
        this.measure = source.measure;
        QueryMapping(Element config) {
    public String getDescription() {
 * limitations under the License.
        this.calcType = CommonUtils.valueOf(DBDashboardCalcType.class, config.getAttribute("calc"), DashboardConstants.DEF_DASHBOARD_CALC_TYPE);


        this.updatePeriod = CommonUtils.toLong(config.getAttribute("updatePeriod"), DashboardConstants.DEF_DASHBOARD_UPDATE_PERIOD); // Default ratio is 2 to 3
                if (provider != null) {

    }
        this.provider = provider;

    }
        this.isCustom = custom;
            String mapQueryId = config.getAttribute("mapQuery");
            xml.addAttribute("externalUrl", dashboardExternalURL);
        return maxItems;
            }

        }
    }
    public void setMeasure(String measure) {
        return group;
                }
    private String dashboardExternalURL;
        super(source.getPluginId());
            if (system.matches(localSystem)) {
    @Override
    public List<DBPNamedObject> getSupportedSources() {
            this.driverId = CommonUtils.nullIfEmpty(config.getAttribute("driver"));
    }
            this.renderer = config.getAttribute("defaultView");
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
            return true;
    }

        this.id = source.id;
    }
            log.error("Dashboard provider '" + providerId + "' not found for saved dashboard '" + this.id + "'");

        this.dashboardExternalURL = dashboardExternalURL;

 * Licensed under the Apache License, Version 2.0 (the "License");
        return dashboardURL;
        this.showByDefault = source.showByDefault;
            xml.addAttribute("displayName", displayName);
    public DashboardMapQueryDescriptor getMapQuery() {
            xml.addAttribute("url", dashboardURL);
        return updatePeriod;


 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.dashboard.*;

    public void setDataSourceMappings(List<DBPNamedObject> targets) {
