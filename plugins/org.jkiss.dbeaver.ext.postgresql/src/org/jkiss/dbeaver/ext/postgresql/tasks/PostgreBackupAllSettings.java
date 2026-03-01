    }
        } catch (InvocationTargetException e) {
        exportOnlyGlobals = store.getBoolean(PROP_EXPORT_ALL_ONLY_GLOBALS);
        }
                if (!CommonUtils.isEmpty(object.getDatabases())) {
        encoding = store.getString(PROP_EXPORT_ALL_ENCODING);
 * DBeaver - Universal Database Manager

                    } else if (object instanceof DBPDataSourceContainer) {
            ((DBPPreferenceMap) store).getPropertyMap().put(PROP_EXPORT_OBJECTS_ALL, objectList);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (iterator != null && iterator.hasNext()) {
    

            return iterator.next();
import org.jkiss.dbeaver.tasks.nativetool.ExportSettingsExtension;
        store.setValue(PROP_EXPORT_ALL_NO_PRIVILEGES, noPrivileges);
        this.noPrivileges = noPrivileges;
 *

    public void setEncoding(String encoding) {

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        store.setValue(PROP_EXPORT_ALL_ONLY_GLOBALS, exportOnlyGlobals);
        noOwner = store.getBoolean(PROP_EXPORT_ALL_NO_OWNER);
 * Copyright (C) 2010-2024 DBeaver Corp and others
        exportOnlyTablespaces = store.getBoolean(PROP_EXPORT_ALL_ONLY_TABLESPACES);
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    {
        String outputFileName = resolveVars(
    private boolean exportOnlyGlobals;
                        if (exportInfo != null) {
            List<Map<String, Object>> objectList = new ArrayList<>();
    }
        return addRolesPasswords;
        store.setValue(PROP_EXPORT_ALL_ONLY_TABLESPACES, exportOnlyTablespaces);

    public boolean isExportOnlyGlobals() {
        if (dataSource != null) {


 *
    public boolean isExportOnlyRoles() {
        this.noOwner = noOwner;
    }
                objectList.add(objInfo);
}
    public void setNoOwner(boolean noOwner) {
                    for (String databaseName : CommonUtils.safeCollection(databaseNames)) {
public class PostgreBackupAllSettings extends AbstractImportExportSettings<DBSObject>
    private final List<PostgreDatabaseBackupAllInfo> exportObjects = new ArrayList<>();
    private boolean noPrivileges;
    public final List<PostgreDatabaseBackupAllInfo> getExportObjects() {
                        }
    }
        super.loadSettings(runnableContext, store);
    }
            List<Map<String, Object>> objectList = ((DBPPreferenceMap) store).getObject(PROP_EXPORT_OBJECTS_ALL);
 * you may not use this file except in compliance with the License.
                }
            runnableContext.run(true, true, monitor -> {
        return null;
            for (PostgreDatabaseBackupAllInfo object : exportObjects) {
            });
    }
    public String getOutputFile(@NotNull PostgreDatabaseBackupAllInfo info) {
        this.exportOnlyGlobals = exportOnlyGlobals;

    }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
                        }
import org.jkiss.utils.CommonUtils;
        this.encoding = encoding;
    }
                    if (dataSource == null) {
        return makeOutFilePath(outputFolder, outputFileName);
        this.exportOnlyTablespaces = exportOnlyTablespaces;
        this.addRolesPasswords = addRolesPasswords;
    private static final String PROP_EXPORT_ALL_EXPORT_ONLY_METADATA = "pg.export.all.exportOnlyMetadata";
                    List<String> tableList = new ArrayList<>();

    public void setExportOnlyGlobals(boolean exportOnlyGlobals) {
            }
                for (Map<String, Object> object : objectList) {

import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
        super(project);
 * limitations under the License.
        this.exportOnlyMetadata = exportOnlyMetadata;
    @Nullable
        this.exportOnlyRoles = exportOnlyRoles;

        }
 */
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
    }
    }
        @Nullable List<String> databaseNames)
    private static final String PROP_DATABASES = "databases";
            // Save input objects to task properties
    private static final String PROP_EXPORT_ALL_NO_PRIVILEGES = "pg.export.all.noPrivileges";
import org.jkiss.dbeaver.tasks.nativetool.AbstractImportExportSettings;
    @Override
import org.jkiss.dbeaver.model.app.DBPProject;
    private static final String PROP_EXPORT_ALL_NO_OWNER = "pg.export.all.noOwner";
    private String encoding;
            log.error("Error loading objects configuration", e);
import org.jkiss.code.NotNull;
    public boolean isNoPrivileges() {
                dataSource = database.getDataSource();
                        } else {
        }
    @Override
                    if (!CommonUtils.isEmpty(catalogId)) {
                        PostgreDatabase database = dataSource.getDatabase(databaseName);
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
                        tableList.add(database.getName());
 * You may obtain a copy of the License at
        return exportOnlyGlobals;
    public boolean isExportOnlyTablespaces() {
    private boolean exportOnlyTablespaces;
    public boolean isAddRolesPasswords() {
    private static final String PROP_EXPORT_ALL_ONLY_GLOBALS = "pg.export.all.exportOnlyGlobals";
                }
    public void loadSettings(DBRRunnableContext runnableContext, DBPPreferenceStore store) throws DBException {
                    throw new InvocationTargetException(e);
import java.lang.reflect.InvocationTargetException;
            // Ignore

    }
                        if (database != null) {
        store.setValue(PROP_EXPORT_ALL_ENCODING, encoding);
                    }
    }
        return exportOnlyTablespaces;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void setNoPrivileges(boolean noPrivileges) {
    }
 * Unless required by applicable law or agreed to in writing, software
        super.saveSettings(runnableContext, store);
                    if (object instanceof PostgreDataSource) {
                            log.debug("Database '" + databaseName + "' not found in dataSource '" + dataSource.getName() + "'");
import org.jkiss.dbeaver.DBException;

        }
    private PostgreDatabaseBackupAllInfo loadDatabaseExportInfo(
    }
        @NotNull String catalogId,
                try {
import org.jkiss.dbeaver.model.DBUtils;

    public PostgreBackupAllSettings() {





    public void setAddRolesPasswords(boolean addRolesPasswords) {
 *
    private boolean addRolesPasswords;
        if (store instanceof DBPPreferenceMap) {
                    }
        String outputFolder = getOutputFolder(info);
            null,
            container != null ? container : info.getDataSource(),
    @NotNull
    @Override
    }
        PostgreDatabaseBackupAllInfo[] exportInfo = new PostgreDatabaseBackupAllInfo[1];
    public String getOutputFolder(@NotNull PostgreDatabaseBackupAllInfo info) {
    }
                } catch (Throwable e) {
            }
        return noOwner;
    implements ExportSettingsExtension<PostgreDatabaseBackupAllInfo> {
            exportObjects.add(new PostgreDatabaseBackupAllInfo(dataSource, databases));
    private static final String PROP_EXPORT_ALL_ONLY_ROLES = "pg.export.all.exportOnlyRoles";

        return resolveVars(
        store.setValue(PROP_EXPORT_ALL_ADD_ROLES_PASSWORDS, addRolesPasswords);
    private static final String PROP_EXPORT_ALL_ENCODING = "pg.export.all.encoding";
        return exportInfo[0];
    private boolean exportOnlyRoles;
            if (!CommonUtils.isEmpty(objectList)) {
            getOutputFilePattern());

    public boolean isExportOnlyMetadata() {
        List<PostgreDatabase> databases = new ArrayList<>();
        PostgreDataSource dataSource = null;
                        dataSource = (PostgreDataSource) object;
                    exportInfo[0] = new PostgreDatabaseBackupAllInfo(dataSource, databases);

    public PostgreBackupAllSettings(@NotNull DBPProject project) {

    }
        store.setValue(PROP_EXPORT_ALL_EXPORT_ONLY_METADATA, exportOnlyMetadata);
    private boolean noOwner;
                        PostgreDatabaseBackupAllInfo exportInfo = loadDatabaseExportInfo(runnableContext, catalogId, databaseNames);

                    String catalogId = CommonUtils.toString(object.get(PROP_DATASOURCE));
                            databases.add(database);
                        List<String> databaseNames = (List<String>) object.get(PROP_DATABASES);

                    for (PostgreDatabase database : object.getDatabases()) {
    private DBSObjectContainer getContainerObject(@Nullable List<PostgreDatabase> databases) {
        return exportOnlyRoles;
    }
        return exportOnlyMetadata;
 * See the License for the specific language governing permissions and
                PostgreDatabase database = (PostgreDatabase) object;
            // Save input objects to task properties
        addRolesPasswords = store.getBoolean(PROP_EXPORT_ALL_ADD_ROLES_PASSWORDS);
        if (store instanceof DBPPreferenceMap && !CommonUtils.isEmpty(exportObjects)) {
package org.jkiss.dbeaver.ext.postgresql.tasks;
    }
                        dataSource = (PostgreDataSource) object.getDataSource();
        return encoding;
    private static final String PROP_EXPORT_ALL_ONLY_TABLESPACES = "pg.export.all.exportOnlyTablespaces";
        DBSObjectContainer container = getContainerObject(info.getDatabases());
        DBSObjectContainer container = getContainerObject(info.getDatabases());

                }

    }
                    PostgreDataSource dataSource = null;
        }
        for (DBSObject object : getDatabaseObjects()) {
        store.setValue(PROP_EXPORT_ALL_NO_OWNER, noOwner);
                    }
    public void fillExportObjectsFromInput() {
    private boolean exportOnlyMetadata;

    @Override
import java.util.*;
import org.jkiss.code.Nullable;

    }
        } catch (InterruptedException e) {
        store.setValue(PROP_EXPORT_ALL_ONLY_ROLES, exportOnlyRoles);
    public void setExportOnlyRoles(boolean exportOnlyRoles) {
                objInfo.put(PROP_DATASOURCE, DBUtils.getObjectFullId(object.getDataSource()));
                    DBSObject object = DBUtils.findObjectById(monitor, getProject(), catalogId);
                        throw new DBException("Datasource " + catalogId + " not found");
    public void setExportOnlyMetadata(boolean exportOnlyMetadata) {
        noPrivileges = store.getBoolean(PROP_EXPORT_ALL_NO_PRIVILEGES);
    }
        try {
    }

                    }
import org.jkiss.dbeaver.model.preferences.DBPPreferenceMap;
            null,
        exportOnlyRoles = store.getBoolean(PROP_EXPORT_ALL_ONLY_ROLES);
        exportOnlyMetadata = store.getBoolean(PROP_EXPORT_ALL_EXPORT_ONLY_METADATA);
    private static final String PROP_EXPORT_OBJECTS_ALL = "exportObjects.all";
    @Override
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
                    List<PostgreDatabase> databases = new ArrayList<>();
    private static final Log log = Log.getLog(PostgreBackupAllSettings.class);
        return exportObjects;
                databases.add(database);
            updateDataSourceContainer();
        @NotNull DBRRunnableContext runnableContext,
            if (object instanceof PostgreDatabase) {
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
            }
    @NotNull
        return noPrivileges;
import org.jkiss.dbeaver.Log;

        final Iterator<? extends PostgreDatabase> iterator = databases == null ? null : databases.iterator();
        }

    @Override
    private static final String PROP_DATASOURCE = "datasource";
    public void saveSettings(DBRRunnableContext runnableContext, DBPPreferenceStore store) {
    public boolean isNoOwner() {
                            exportObjects.add(exportInfo);
    private static final String PROP_EXPORT_ALL_ADD_ROLES_PASSWORDS = "pg.export.all.addRolesPasswords";
                    objInfo.put(PROP_DATABASES, tableList);
    }
            container != null ? container : info.getDataSource(), null, null, getOutputFolderPattern());
    public void setExportOnlyTablespaces(boolean exportOnlyTablespaces) {
    public String getEncoding() {
    }
    @NotNull
                Map<String, Object> objInfo = new LinkedHashMap<>();
 * distributed under the License is distributed on an "AS IS" BASIS,
                    }
