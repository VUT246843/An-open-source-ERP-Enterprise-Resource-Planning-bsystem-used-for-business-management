
                    List<PostgreSchema> schemas = null;
            List<Map<String, Object>> objectList = ((DBPPreferenceMap) store).getObject("exportObjects");
                }
    public String getCompression() {
        return compression;
    }
        }

    }
        updateDataSourceContainer();
                    PostgreDatabase database = (PostgreDatabase) DBUtils.findObjectById(monitor, getProject(), catalogId);

            }
            ((DBPPreferenceMap) store).getPropertyMap().put("exportObjects", objectList);
        showViews = store.getBoolean("pg.export.showViews");
import org.jkiss.dbeaver.tasks.nativetool.ExportSettingsExtension;
import org.jkiss.code.NotNull;
            if (database == null) {
 */

import org.jkiss.dbeaver.DBException;
        store.setValue("pg.export.noOwner", noOwner);
    public void setNoOwner(boolean noOwner) {
    }
            }
public class PostgreDatabaseBackupSettings extends PostgreBackupRestoreSettings implements ExportSettingsExtension<PostgreDatabaseBackupInfo> {
 * limitations under the License.
            }
        noPrivileges = store.getBoolean("pg.export.noPrivileges");
                List<PostgreTableBase> tables = info.getTables();
import java.util.LinkedHashMap;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;

                        }
        this.noOwner = noOwner;
        this.showViews = showViews;

                    schemas = new ArrayList<>();
import org.jkiss.utils.CommonUtils;
                continue;
        return resolveVars(info.getDatabase(), info.getSchemas(), info.getTables(), getOutputFolderPattern());
                    }
                } catch (Throwable e) {
    }


        return createDatabase;
        store.setValue("pg.export.dropObjects", dropObjects);
            } else if (object instanceof PostgreTableBase) {

        this.dropObjects = dropObjects;
    public boolean isNoOwner() {


    private List<PostgreDatabaseBackupInfo> exportObjects = new ArrayList<>();
 * Unless required by applicable law or agreed to in writing, software
                }
        } catch (InvocationTargetException e) {


import java.util.Map;
                    schemas.add(schema);
 * DBeaver - Universal Database Manager
                    for (PostgreSchema schema : object.getSchemas()) {
                        for (String tableName : tableNames) {
                        schemas = new ArrayList<>();
    public boolean isUseInserts() {
                        List<String> tableNames = (List<String>) object.get("tables");
    private String compression;
    }
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override

}
                    info.setSchemas(schemas);
            });
    public String getOutputFolder(@NotNull PostgreDatabaseBackupInfo info) {
    }

                        PostgreSchema schema = schemas.get(0);
                    info.setTables(tables);
import org.jkiss.dbeaver.model.struct.DBSObject;
    public boolean isFullSchemaBackup() {
            if (!CommonUtils.isEmpty(objectList)) {
import org.jkiss.dbeaver.Log;
    private static final Log log = Log.getLog(PostgreDatabaseBackupSettings.class);
        super.loadSettings(runnableContext, store);
            }
                schema = (PostgreSchema) object;
                List<PostgreSchema> schemas = info.getSchemas();
                    for (PostgreTableBase table : object.getTables()) {
    }
    }

        store.setValue("pg.export.useInserts", useInserts);
 * you may not use this file except in compliance with the License.
            if (object instanceof PostgreDatabase) {

import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
    }
    public void setUseInserts(boolean useInserts) {
                database = ((PostgreTableBase) object).getDatabase();
                    List<String> tableList = new ArrayList<>();
        encoding = store.getString("pg.export.encoding");
            // Save input objects to task properties
    public boolean isDropObjects() {
    }
 *
                        }
    public boolean isShowViews() {
    }
                        }
                            } else {
        this.useInserts = useInserts;
        super.saveSettings(runnableContext, store);
    }
    }
    private String encoding;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceMap;
                    if (!CommonUtils.isEmpty(tableNames) && !CommonUtils.isEmpty(schemas)) {
    private boolean noOwner;
                    }
                    }
        this.fullSchemaBackup = fullSchemaBackup;
        store.setValue("pg.export.noPrivileges", noPrivileges);
                }
        return dropObjects;
                            if (table != null) {
    public void setDropObjects(boolean dropObjects) {
    }
    public void setShowViews(boolean showViews) {
        store.setValue("pg.export.compression", compression);
                            PostgreTableBase table = schema.getTableCache().getObject(monitor, schema, tableName);
                    exportInfo[0] = new PostgreDatabaseBackupInfo(database, schemas, tables);
                try {
            log.error("Error loading objects configuration", e);
    public void setNoPrivileges(boolean noPrivileges) {

import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
    }
                    tables = new ArrayList<>();

        return exportInfo[0];
                Map<String, Object> objInfo = new LinkedHashMap<>();
                        throw new DBException("Database " + catalogId + " not found");

    @NotNull
import java.util.ArrayList;
                    }
        } catch (InterruptedException e) {

                            if (schema != null) {
        return showViews;
                                log.debug("Schema '" + schemaName + "' not found in database '" + database.getName() + "'");
                }

        useInserts = store.getBoolean("pg.export.useInserts");
            PostgreSchema schema = null;
            runnableContext.run(true, true, monitor -> {

    public void setEncoding(String encoding) {
    }
                }
        return useInserts;
    @NotNull
        store.setValue("pg.export.encoding", encoding);
        store.setValue("pg.export.fullSchemaBackup", fullSchemaBackup);
                    if (!CommonUtils.isEmpty(catalogId)) {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                objInfo.put("database", DBUtils.getObjectFullId(object.getDatabase()));

        createDatabase = store.getBoolean("pg.export.createDatabase");

        PostgreDatabaseBackupInfo[] exportInfo = new PostgreDatabaseBackupInfo[1];
                    if (database == null) {
    }
                        for (String schemaName : schemaNames) {
        super(project);
        this.exportObjects = exportObjects;
                if (!schemas.contains(schema)) {
package org.jkiss.dbeaver.ext.postgresql.tasks;
        }
            // Ignore
import java.lang.reflect.InvocationTargetException;
            }
        this.noPrivileges = noPrivileges;

                                log.debug("Table '" + tableName + "' not found in schema '" + schema.getName() + "'");
                    }

    }
                if (!CommonUtils.isEmpty(object.getSchemas())) {
        if (store instanceof DBPPreferenceMap) {
        try {
 *
                }
                    objInfo.put("schemas", tableList);
        return fullSchemaBackup;

                if (schemas == null) {
            if (schema != null) {
import org.jkiss.dbeaver.model.app.DBPProject;
            PostgreDatabase database = null;
    public void loadSettings(DBRRunnableContext runnableContext, DBPPreferenceStore store) throws DBException {
        fullSchemaBackup = store.getBoolean("pg.export.fullSchemaBackup");
                    throw new InvocationTargetException(e);

        store.setValue("pg.export.createDatabase", createDatabase);
    }
    public void setCompression(String compression) {

    }
    }
    private PostgreDatabaseBackupInfo loadDatabaseExportInfo(DBRRunnableContext runnableContext, String catalogId, List<String> schemaNames, List<String> tableNames) {
    private boolean useInserts;
        getExportObjects().addAll(objMap.values());
            if (object instanceof PostgreTableBase) {
    }
                            }

                objectList.add(objInfo);
                            }
                        tableList.add(table.getName());
                database = (PostgreDatabase) object;
                        if (exportInfo != null) {
        Map<PostgreDatabase, PostgreDatabaseBackupInfo> objMap = new LinkedHashMap<>();
        }
    private boolean createDatabase;
        return exportObjects;
                                schemas.add(schema);
            }
                tables.add((PostgreTableBase) object);
        this.createDatabase = createDatabase;
                        tableList.add(schema.getName());
            for (PostgreDatabaseBackupInfo object : exportObjects) {
    public void saveSettings(DBRRunnableContext runnableContext, DBPPreferenceStore store) {

        }
    public void setCreateDatabase(boolean createDatabase) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                if (!CommonUtils.isEmpty(object.getTables())) {
        compression = store.getString("pg.export.compression");
        dropObjects = store.getBoolean("pg.export.dropObjects");
                            exportObjects.add(exportInfo);
 * Licensed under the Apache License, Version 2.0 (the "License");
    public List<PostgreDatabaseBackupInfo> getExportObjects() {
    public void setExportObjects(List<PostgreDatabaseBackupInfo> exportObjects) {
    }


                schema = ((PostgreTableBase) object).getSchema();
 * You may obtain a copy of the License at
                    List<String> tableList = new ArrayList<>();
 * See the License for the specific language governing permissions and
                    }
            // Save input objects to task properties
        for (DBSObject object : getDatabaseObjects()) {
import org.jkiss.dbeaver.model.DBUtils;
    public void setFullSchemaBackup(boolean fullSchemaBackup) {
    public boolean isNoPrivileges() {
    public String getOutputFile(@NotNull PostgreDatabaseBackupInfo info) {
        store.setValue("pg.export.showViews", showViews);
                    if (!CommonUtils.isEmpty(schemaNames)) {
        return encoding;
        noOwner = store.getBoolean("pg.export.noOwner");
        return noPrivileges;
    }
    }

                    objInfo.put("tables", tableList);
                for (Map<String, Object> object : objectList) {
        String outputFileName = resolveVars(info.getDatabase(), info.getSchemas(), info.getTables(), getOutputFilePattern());
    public PostgreDatabaseBackupSettings() {
                    String catalogId = CommonUtils.toString(object.get("database"));

        this.compression = compression;
    }
                    List<PostgreTableBase> tables = null;
        return noOwner;
    }
        this.encoding = encoding;
                                tables.add(table);
        String outputFolder = getOutputFolder(info);
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
                        List<String> schemaNames = (List<String>) object.get("schemas");
                            PostgreSchema schema = database.getSchema(monitor, schemaName);
    private boolean dropObjects;

                        PostgreDatabaseBackupInfo exportInfo = loadDatabaseExportInfo(runnableContext, catalogId, schemaNames, tableNames);
    private boolean showViews;
                        tables = new ArrayList<>();
            List<Map<String, Object>> objectList = new ArrayList<>();
    }
                            } else {
    public PostgreDatabaseBackupSettings(@NotNull DBPProject project) {
/*
import java.util.List;

import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableBase;
        return makeOutFilePath(outputFolder, outputFileName);
    private boolean noPrivileges;

 *
            } else if (object instanceof PostgreSchema) {
                if (tables == null) {
    @Override
        if (store instanceof DBPPreferenceMap && !CommonUtils.isEmpty(exportObjects)) {
 * distributed under the License is distributed on an "AS IS" BASIS,
            PostgreDatabaseBackupInfo info = objMap.computeIfAbsent(database, db -> new PostgreDatabaseBackupInfo(db, null, null));
                }
    public void fillExportObjectsFromInput() {
                database = ((PostgreSchema) object).getDatabase();

    public boolean isCreateDatabase() {
    private boolean fullSchemaBackup;
    public String getEncoding() {
