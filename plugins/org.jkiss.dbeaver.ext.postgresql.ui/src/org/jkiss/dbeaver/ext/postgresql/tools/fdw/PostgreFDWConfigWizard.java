        return selectedDataSource;
    public List<DBSEntity> getProposedEntities() {
    }
                DBPDataSourceContainer dataSource = fk.getAssociatedDataSource();
        this.fdwPropertySource = new PropertySourceCustom();

    public String getFdwServerId() {
                }
                for (DBSEntityAttribute attr : CommonUtils.safeCollection(entity.getAttributes(monitor))) {
        {
    private PropertySourceCustom fdwPropertySource;
    private List<DBSEntity> proposedEntities = null;
            Map<String, Object> options = new HashMap<>();
                    continue;
import org.jkiss.dbeaver.model.virtual.DBVEntity;



                        catalogSchema.getDataTypes(monitor);
    private List<DBPDataSourceContainer> availableDataSources = null;
 *
package org.jkiss.dbeaver.ext.postgresql.tools.fdw;
    @Nullable
        return selectedFDW;

                    // Cache data types
            for (DBNDatabaseNode tableNode : getSelectedEntities()) {


import org.jkiss.dbeaver.model.virtual.DBVEntityForeignKey;
    }
import org.jkiss.dbeaver.runtime.properties.PropertySourceCustom;
        return selectedSchema;
        Map<String, List<DBVEntityForeignKey>> grCache = DBVModel.getGlobalReferenceCache();
 * Unless required by applicable law or agreed to in writing, software
                    newColumn.setName(attr.getName());
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
        }

        String serverId = getFdwServerId();
                grEntry.getKey());
                pgTable.setForeignServerName(serverId);
import java.lang.reflect.InvocationTargetException;

            script.append("CREATE SERVER ").append(serverId)
 *     http://www.apache.org/licenses/LICENSE-2.0
                    log.debug("Error getting referenced entity", e);

                    assert newColumn != null;
import org.jkiss.dbeaver.ui.editors.SimpleCommandContext;
import org.jkiss.dbeaver.model.edit.DBECommandContext;

    }
    }
        DBCExecutionContext context = DBUtils.getDefaultContext(getDatabase(), false);
import org.jkiss.dbeaver.model.virtual.DBVModel;
                    newColumn.setDataType(dataType);
    public void setSelectedFDW(FDWInfo selectedFDW) {
import org.jkiss.dbeaver.model.DBUtils;

        proposedEntities = new ArrayList<>(entities);
    private FDWInfo selectedFDW;
        Set<DBPDataSourceContainer> dataSources = new LinkedHashSet<>();
        monitor.beginTask("Check external references", grCache.size());
        this.selectedSchema = selectedSchema;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.Log;
                }
import org.jkiss.dbeaver.model.struct.DBStructUtils;
    public void removeAvailableDataSource(DBPDataSourceContainer dataSource) {
    }
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
                        if (refEntity != null) {

        availableDataSources.remove(dataSource);
    public void setFdwServerId(String fdwServerId) {

                    PostgreTableColumn newColumn = columnManager.createNewObject(monitor, commandContext, pgTable, null, options);
        collectAvailableDataSources(monitor, vModel, dataSources, entities);
                }
                    dataSources.add(dataSource);
            getRunnableContext().run(true, true, monitor -> {
    }
                    }
                String propName = CommonUtils.toString(pe.getKey());

    }
        }
            PostgreForeignTableManager tableManager = new PostgreForeignTableManager();
        // Done
        PropertySourceCustom propertySource = getFdwPropertySource();
                    try {
                pgTable.setForeignOptions(new String[0]);
            DBWorkbench.getPlatformUI().showError("Error generating FDW", "Error during FDW script execution", e.getTargetException());
        }
                PostgreTableForeign pgTable = (PostgreTableForeign) tableManager.createNewObject(monitor, commandContext, getSelectedSchema(), null, options);
import org.jkiss.dbeaver.model.navigator.DBNModel;

        DBPDataSourceContainer curDataSource = database.getDataSource().getContainer();
            for (DBVEntityForeignKey fk : vEntity.getForeignKeys()) {
                    installFDW(monitor);
import org.jkiss.dbeaver.model.virtual.DBVContainer;
                        continue;
        this.selectedDataSource = entities.isEmpty() ? null : entities.get(0).getDataSourceContainer();
    }
    }
        actions.add(new SQLDatabasePersistActionComment(curDataSource, "CREATE EXTENSION " + selectedFDW.getId()));


    public DBCExecutionContext getExecutionContext() {
    public PropertySourceCustom getFdwPropertySource() {
            }
                }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    }
                pgTable.setName(entity.getName());
        PostgreFDWConfigWizard.FDWInfo selectedFDW = getSelectedFDW();
                    if (dataType == null) {
                } catch (DBException e) {
        FDWConfigDescriptor fdwDescriptor;
    private void collectAvailableDataSources(DBRProgressMonitor monitor, DBVContainer vContainer, Set<DBPDataSourceContainer> dataSources, Set<DBSEntity> entities) {
                    }
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
                    PostgreSchema catalogSchema = database.getCatalogSchema(monitor);
 * Copyright (C) 2010-2024 DBeaver Corp and others
            actions.add(new SQLDatabasePersistAction("Create extension", script.toString()));




        addPage(inputPage);
        monitor.subTask("Read actions");
        }
                if (!firstProp) script.append(", ");
    public void addPages() {
        }
                        monitor.subTask("Check " + rfk.getEntity().getFullyQualifiedName(DBPEvaluationContext.UI));
                    if (catalogSchema != null) {
import org.jkiss.dbeaver.ui.dialogs.BaseWizard;
                    }
        availableDataSources = new ArrayList<>(dataSources);
        monitor.done();


    }
                if (CommonUtils.isEmpty(propName) || CommonUtils.isEmpty(propValue)) {

        }
    public boolean performFinish() {
import org.jkiss.dbeaver.ext.postgresql.edit.PostgreForeignTableManager;
        this.selectedEntities = entities;
        return true;
            PostgreFDWConfigWizard.FDWInfo fdwInfo = getSelectedFDW();
            }
    }

 */
        monitor.subTask("Execute script");
    public void addAvailableDataSource(DBPDataSourceContainer dataSource) {

                    log.error("Internal error while creating new table");

                }
        String getDescription() {
        monitor.beginTask("Check virtual foreign keys", 1);
                        }
        monitor.beginTask("Generate FDW script", 2);
                    String plainTargetTypeName = SQLUtils.stripColumnTypeModifiers(defTypeName);
        setNeedsProgressMonitor(true);
    private static final Log log = Log.getLog(PostgreFDWConfigWizard.class);
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
                return false;
            }
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    }

            return installedFDW != null ? installedFDW.getDescription() : fdwDescriptor.getDescription();
        return DBUtils.getDefaultContext(database, true);
            if (refDataSource != null && refDataSource.getDataSourceContainer() == curDataSource) {
    @Override
        inputPage = new PostgreFDWConfigWizardPageInput(this);
    public PostgreSchema getSelectedSchema() {

import org.jkiss.dbeaver.ext.postgresql.model.fdw.FDWConfigDescriptor;
 *
        // Check already configured FDW
        configPage = new PostgreFDWConfigWizardPageConfig(this);
        addPage(new PostgreFDWConfigWizardPageFinal(this));
            PostgreTableColumnManager columnManager = new PostgreTableColumnManager();
    private void installFDW(DBRProgressMonitor monitor) throws DBException {
                    } catch (DBException e) {
            return false;
 * limitations under the License.

    public List<DBNDatabaseNode> getSelectedEntities() {
    }

        return fdwServerId;

 * You may obtain a copy of the License at
    }
    void collectAvailableDataSources(DBRProgressMonitor monitor) {
                            dataSources.add(refEntity.getDataSource().getContainer());
        Set<DBSEntity> entities = new LinkedHashSet<>();
            boolean firstProp = true;
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;

import org.jkiss.dbeaver.model.navigator.DBNDataSource;
        Map<String, Object> propValues = propertySource.getPropertiesWithDefaults();
        for (DBVContainer childContainer : vContainer.getContainers()) {
    public DBPDataSourceContainer getSelectedDataSource() {
                script.append(propName).append(" '").append(propValue).append("'");
        this.selectedFDW = selectedFDW;
        return proposedEntities == null ? Collections.emptyList() : proposedEntities;
import org.jkiss.dbeaver.runtime.DBWorkbench;
                            entities.add(refEntity);
        PostgreDatabase database = getDatabase();
        return database;
            return;
            });

}
    static class FDWInfo {
            collectAvailableDataSources(monitor, childContainer, dataSources, entities);
    private PostgreFDWConfigWizardPageConfig configPage;
                }
                .append("\n\tFOREIGN DATA WRAPPER ").append(selectedFDW.getId())
import org.jkiss.dbeaver.model.struct.DBSEntity;
            options.put(SQLObjectEditor.OPTION_SKIP_CONFIGURATION, true);
                .append("\n\tOPTIONS(");
        this.database = database;
        } catch (InterruptedException e) {
        try {
    }
        for (DBVEntity vEntity : vContainer.getEntities()) {
            }
        try {
    public void setSelectedEntities(List<DBNDatabaseNode> entities) {
import org.jkiss.utils.CommonUtils;
        actions.add(new SQLDatabasePersistAction("CREATE USER MAPPING FOR CURRENT_USER SERVER " + serverId));
    public FDWInfo getSelectedFDW() {
                firstProp = false;
        addPage(configPage);
 * distributed under the License is distributed on an "AS IS" BASIS,
            script
    public PostgreDatabase getDatabase() {
    }
            for (Map.Entry<String, Object> pe : propValues.entrySet()) {
                if (dataSource != database.getDataSource().getContainer()) {
    @Override
        return selectedEntities == null ? Collections.emptyList() : selectedEntities;
/*
    }
    @Override

    public List<DBPDataSourceContainer> getAvailableDataSources() {
    List<DBEPersistAction> generateScript(DBRProgressMonitor monitor) throws DBException {
        String getId() {

    }
 * See the License for the specific language governing permissions and
                    throw new InvocationTargetException(e);

import java.util.*;

                DBSEntity entity = (DBSEntity) tableNode.getObject();
    private List<DBNDatabaseNode> selectedEntities;
    }
                Collections.addAll(actions, tableDDL);
                DBEPersistAction[] tableDDL = tableManager.getTableDDL(monitor, pgTable, options);

                        log.error("Data type '" + plainTargetTypeName + "' not found. Skip column mapping.");
    private DBPDataSourceContainer selectedDataSource;
        DBNModel navModel = DBWorkbench.getPlatform().getNavigatorModel();
    }
        //CREATE SERVER clickhouse_svr FOREIGN DATA WRAPPER clickhousedb_fdw OPTIONS(dbname 'default', driver '/usr/local/lib/odbc/libclickhouseodbc.so', host '46.101.202.143');
                if (pgTable == null) {
        PostgreForeignDataWrapper installedFDW;
import org.jkiss.dbeaver.ext.postgresql.model.*;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistActionComment;
        DBVModel vModel = curDataSource.getVirtualModel();
            return installedFDW != null ? installedFDW.getName() : fdwDescriptor.getFdwId();
        } finally {
import org.jkiss.dbeaver.model.sql.SQLUtils;
                        entities.add(fk.getAssociatedEntity(monitor));
        } catch (InvocationTargetException e) {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.DBPContextProvider;
        List<DBEPersistAction> actions = new ArrayList<>();
                    }
 *

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.postgresql.edit.PostgreTableColumnManager;
                try {

        // Now tables
        PostgreDataSource curDataSource = database.getDataSource();
            StringBuilder script = new StringBuilder();
        DBExecUtils.executeScript(monitor, context, "Install FDW", actions);
        }

class PostgreFDWConfigWizard extends BaseWizard implements DBPContextProvider {

        for (Map.Entry<String, List<DBVEntityForeignKey>> grEntry : grCache.entrySet()) {
                try {

            DBNDataSource refDataSource = navModel.getDataSourceByPath(
        availableDataSources.add(dataSource);
                    PostgreDataType dataType = database.getDataType(monitor, plainTargetTypeName);
                    String defTypeName = DBStructUtils.mapTargetDataType(database, attr, true);
        DBECommandContext commandContext = new SimpleCommandContext(getExecutionContext(), false);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                .append(")");
        setWindowTitle("Foreign Data Wrappers configurator");
                        DBSEntity refEntity = rfk.getEntity().getRealEntity(monitor);

    }
    PostgreFDWConfigWizard(PostgreDatabase database) {




    }

    private String fdwServerId;

    public void setSelectedSchema(PostgreSchema selectedSchema) {
        monitor.done();
    private PostgreSchema selectedSchema;
                String propValue = CommonUtils.toString(pe.getValue());
            monitor.worked(1);
                database.getDataSource().getContainer().getProject(),
        return actions;
        // Check global FK references cache
        if (availableDataSources != null) {
        super.addPages();
                    for (DBVEntityForeignKey rfk : grEntry.getValue()) {
                        log.debug("Error getting referenced entity", e);
                    continue;
        List<DBEPersistAction> actions = generateScript(monitor);
import org.jkiss.dbeaver.model.exec.DBExecUtils;
import org.jkiss.dbeaver.DBException;
    }
        this.fdwServerId = fdwServerId;
        return availableDataSources == null ? Collections.emptyList() : availableDataSources;
                } catch (Exception e) {
        return fdwPropertySource;
        }
    private PostgreDatabase database;
        // Find all virtual connections
        }
            commandContext.resetChanges(true);
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    private PostgreFDWConfigWizardPageInput inputPage;
