 * Licensed under the Apache License, Version 2.0 (the "License");
        }
        return binariesInHex;
        overrideCredentials = CommonUtils.getBoolean(store.getString(MySQLNativeCredentialsSettings.PREFERENCE_NAME), false);
                    }
        for (DBSObject object : getDatabaseObjects()) {
        store.setValue("MySQL.export.method", method.name());

    }
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (object instanceof MySQLTableBase) {
        for (Map.Entry<MySQLCatalog, List<MySQLTableBase>> entry : objMap.entrySet()) {
                try {
        this.showViews = showViews;
        try {

    private boolean binariesInHex;
    }
public class MySQLExportSettings extends AbstractImportExportSettings<DBSObject>
    @Override
        return dumpEvents;
 * Unless required by applicable law or agreed to in writing, software
            List<MySQLTableBase> tables = objMap.computeIfAbsent(catalog, mySQLCatalog -> new ArrayList<>());
        return removeDefiner;
        store.setValue("MySQL.export.noCreateStatements", noCreateStatements);
        }

        this.noData = noData;
    private boolean removeDefiner;
        @NotNull
        super(project);

    }
    }
        if (store instanceof DBPPreferenceMap) {
                    for (MySQLTableBase table : object.getTables()) {
                    }
    }
    @NotNull
    public void setExportObjects(List<MySQLDatabaseExportInfo> exportObjects) {
                            exportObjects.add(exportInfo);
                catalog = (MySQLCatalog) object;
}
    }
            setExtraCommandArgs(store.getString("MySQL.export.extraArgs"));
    public void setAddDropStatements(boolean addDropStatements) {
            }
        this.dumpEvents = dumpEvents;
    public void setComments(boolean comments) {
    public boolean isBinariesInHex() {

                        for (String tableName : tableNames) {
    }
    @NotNull
        store.setValue("MySQL.export.noData", noData);
    private boolean addDropStatements = true;
        this.comments = comments;
        binariesInHex = CommonUtils.getBoolean(store.getString("MySQL.export.binariesInHex"), false);
    public boolean isNoRoutines() {
import java.lang.reflect.InvocationTargetException;
        Map<MySQLCatalog, List<MySQLTableBase>> objMap = new LinkedHashMap<>();
    public void setDumpEvents(boolean dumpEvents) {
        return extendedInserts;
        store.setValue("MySQL.export.comments", comments);
        private final String cliOption;

    private boolean dumpEvents;


            }
        dumpEvents = CommonUtils.getBoolean(store.getString("MySQL.export.dumpEvents"), false);
        return noRoutines;
    }
    }
import org.jkiss.dbeaver.ext.mysql.MySQLDataSourceProvider;
        return showViews;
    public void setNoData(boolean noData) {
    private MySQLDatabaseExportInfo loadDatabaseExportInfo(DBRRunnableContext runnableContext, String catalogId, List<String> tableNames) {
import java.util.Map;
    private boolean showViews;
    }
    @Override


    }
import org.jkiss.dbeaver.ext.mysql.model.MySQLCatalog;
        super();
    }
import org.jkiss.code.NotNull;
    public void setRemoveDefiner(boolean removeDefiner) {
                            if (table != null) {
    }
    public void setNoRoutines(boolean noRoutines) {
    }
                Map<String, Object> objInfo = new LinkedHashMap<>();
            if (object instanceof MySQLCatalog) {
        }

import org.jkiss.dbeaver.model.app.DBPProject;
    }
            runnableContext.run(false, true, monitor -> {
 * limitations under the License.
    public boolean isOverrideCredentials() {
    private boolean disableKeys = true;
                    List<String> tableList = new ArrayList<>();
        this.method = method;
        DumpMethod(@NotNull String cliOption) {
import org.jkiss.dbeaver.Log;
import java.util.ArrayList;

        this.removeDefiner = removeDefiner;
    }
        return method;
    }
    public void setCompressed(boolean compressed) {
            if (catalog == null) {
            this.cliOption = cliOption;

                    throw new InvocationTargetException(e);
 * You may obtain a copy of the License at

                    }



    }
                            MySQLTableBase table = catalog.getTableCache().getObject(monitor, catalog, tableName);

    public void setBinariesInHex(boolean binariesInHex) {
    }
                }
    @Override
 *
    @Override
        this.addDropStatements = addDropStatements;
                tables.add((MySQLTableBase) object);
    @NotNull
    }
    public boolean isDumpEvents() {
    public void setShowViews(boolean showViews) {
    private boolean comments;
                    objInfo.put("tables", tableList);
    public boolean isRemoveDefiner() {
import java.util.List;
    private boolean overrideCredentials;
        return exportObjects;
            for (MySQLDatabaseExportInfo object : exportObjects) {

            getExportObjects().add(new MySQLDatabaseExportInfo(entry.getKey(), entry.getValue()));
    }

import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
        this.extendedInserts = extendedInserts;
    public MySQLExportSettings(@NotNull DBPProject project) {
package org.jkiss.dbeaver.ext.mysql.tasks;
        return noData;
                for (Map<String, Object> object : objectList) {
        return noCreateStatements;
        return disableKeys;
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.exportObjects = exportObjects;
    public void setOverrideCredentials(boolean value) {
            log.error("Error loading objects configuration", e);

        this.disableKeys = disableKeys;
        if (store instanceof DBPPreferenceMap && !CommonUtils.isEmpty(exportObjects)) {
                        tableList.add(table.getName());
import org.jkiss.dbeaver.tasks.nativetool.ExportSettingsExtension;

import org.jkiss.utils.CommonUtils;
    }

        store.setValue("MySQL.export.dumpEvents", dumpEvents);
    }
    }
        removeDefiner = CommonUtils.getBoolean(store.getString("MySQL.export.removeDefiner"), false);
        store.setValue("MySQL.export.showViews", showViews);
        this.binariesInHex = binariesInHex;
                continue;
        ONLINE("--single-transaction"),
                    }
    @Override
        }
        store.setValue("MySQL.export.disableKeys", disableKeys);
            }
        noData = CommonUtils.getBoolean(store.getString("MySQL.export.noData"), false);

    public boolean isNoCreateStatements() {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    public boolean isComments() {
                        }
        super.saveSettings(runnableContext, store);
        }
                    List<MySQLTableBase> tables = null;
        showViews = CommonUtils.getBoolean(store.getString("MySQL.export.showViews"), false);
        noCreateStatements = CommonUtils.getBoolean(store.getString("MySQL.export.noCreateStatements"), false);
 * DBeaver - Universal Database Manager

    }

    }

        this.compressed = compressed;
    }
        this.noRoutines = noRoutines;
        comments = CommonUtils.getBoolean(store.getString("MySQL.export.comments"), false);
            }
    @Override
            // Save input objects to task properties
    private boolean noData;
        store.setValue("MySQL.export.extendedInserts", extendedInserts);
    }

        return exportInfo[0];
                objInfo.put("catalog", DBUtils.getObjectFullId(object.getDatabase()));
        super.loadSettings(runnableContext, store);
 *
    public boolean isShowViews() {
    }
        }
    public void saveSettings(DBRRunnableContext runnableContext, DBPPreferenceStore store) {
        extendedInserts = CommonUtils.getBoolean(store.getString("MySQL.export.extendedInserts"), true);
    private boolean noRoutines;
    public void setNoCreateStatements(boolean noCreateStatements) {
            // Save input objects to task properties
/*

    }

 *
        store.setValue("MySQL.export.removeDefiner", removeDefiner);
import org.jkiss.dbeaver.DBException;
    public DBPNativeClientLocation findNativeClientHome(String clientHomeId) {
        return comments;
 * you may not use this file except in compliance with the License.
            List<Map<String, Object>> objectList = new ArrayList<>();
    public DumpMethod getMethod() {
    public boolean isNoData() {
    public boolean isExtendedInserts() {
            }
            ((DBPPreferenceMap) store).getPropertyMap().put("exportObjects", objectList);
        return resolveVars(info.getDatabase(), null, info.getTables(), getOutputFolderPattern());

        disableKeys = CommonUtils.getBoolean(store.getString("MySQL.export.disableKeys"), true);
 * See the License for the specific language governing permissions and
                        throw new DBException("Catalog " + catalogId + " not found");
                    if (!CommonUtils.isEmpty(catalogId)) {
    }
        }
        updateDataSourceContainer();
    public boolean isCompressed() {
            // Ignore
    implements MySQLNativeCredentialsSettings, ExportSettingsExtension<MySQLDatabaseExportInfo> {
        LOCK_ALL_TABLES("--lock-all-tables"),
        this.overrideCredentials = value;
    private boolean extendedInserts = true;
            return cliOption;
        store.setValue("MySQL.export.noRoutines", noRoutines);
        String outFileName = resolveVars(info.getDatabase(), null, info.getTables(), getOutputFilePattern());

import org.jkiss.dbeaver.model.struct.DBSObject;

                objectList.add(objInfo);

                }

        } catch (InvocationTargetException e) {
    public void setExtendedInserts(boolean extendedInserts) {
                } catch (Throwable e) {
        method = CommonUtils.valueOf(DumpMethod.class, store.getString("MySQL.export.method"), DumpMethod.NORMAL);

    public void loadSettings(DBRRunnableContext runnableContext, DBPPreferenceStore store) throws DBException {
        noRoutines = CommonUtils.getBoolean(store.getString("MySQL.export.noRoutines"), false);
        store.setValue("MySQL.export.addDropStatements", addDropStatements);
import org.jkiss.dbeaver.model.connection.DBPNativeClientLocation;
        } catch (InterruptedException e) {
import java.util.LinkedHashMap;
            MySQLCatalog catalog = null;
                            }
import org.jkiss.dbeaver.tasks.nativetool.AbstractImportExportSettings;
            } else if (object instanceof MySQLTableBase) {
        return MySQLDataSourceProvider.getServerHome(clientHomeId);
                }


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

        compressed = CommonUtils.getBoolean(store.getString("MySQL.export.compressed"), false);
                    if (catalog == null) {
import org.jkiss.dbeaver.ext.mysql.model.MySQLTableBase;
                        List<String> tableNames = (List<String>) object.get("tables");
        MySQLDatabaseExportInfo[] exportInfo = new MySQLDatabaseExportInfo[1];
        return compressed;
    public void setDisableKeys(boolean disableKeys) {

                catalog = ((MySQLTableBase) object).getContainer();
            if (!CommonUtils.isEmpty(objectList)) {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceMap;

                        if (exportInfo != null && !exportObjects.contains(exportInfo)) {
                    if (!CommonUtils.isEmpty(tableNames)) {
                if (!CommonUtils.isEmpty(object.getTables())) {
                                tables.add(table);
        public String getCliOption() {

            // Backward compatibility

        addDropStatements = CommonUtils.getBoolean(store.getString("MySQL.export.addDropStatements"), true);
            });
        this.noCreateStatements = noCreateStatements;
    public String getOutputFolder(@NotNull MySQLDatabaseExportInfo info) {
    private DumpMethod method = DumpMethod.NORMAL;
    }
    public MySQLExportSettings() {

    public List<MySQLDatabaseExportInfo> exportObjects = new ArrayList<>();
    }
    public boolean isAddDropStatements() {
                    exportInfo[0] = new MySQLDatabaseExportInfo(catalog, tables);
        return makeOutFilePath(getOutputFolder(info), outFileName);
                        MySQLDatabaseExportInfo exportInfo = loadDatabaseExportInfo(runnableContext, catalogId, tableNames);
    @NotNull

            List<Map<String, Object>> objectList = ((DBPPreferenceMap) store).getObject("exportObjects");

                    MySQLCatalog catalog = (MySQLCatalog) DBUtils.findObjectById(monitor, getProject(), catalogId);
    public void setMethod(DumpMethod method) {
    }
                log.error("Can't determine export catalog");
        return overrideCredentials;
        if (CommonUtils.isEmpty(getExtraCommandArgs())) {

    private static final Log log = Log.getLog(MySQLExportSettings.class);
    public String getOutputFile(@NotNull MySQLDatabaseExportInfo info) {
        NORMAL("--skip-lock-tables");
    public List<MySQLDatabaseExportInfo> getExportObjects() {


    }
        store.setValue(MySQLNativeCredentialsSettings.PREFERENCE_NAME, overrideCredentials);
                        tables = new ArrayList<>();
 * Copyright (C) 2010-2025 DBeaver Corp and others

                        }
    private boolean compressed;
        }
    }
        return addDropStatements;
    }
    public enum DumpMethod {
        store.setValue("MySQL.export.binariesInHex", binariesInHex);
                    String catalogId = CommonUtils.toString(object.get("catalog"));

        store.setValue("MySQL.export.compressed", compressed);
    public void fillExportObjectsFromInput() {
    }
    public boolean isDisableKeys() {
    }


 */
    private boolean noCreateStatements;
import org.jkiss.dbeaver.model.DBUtils;
