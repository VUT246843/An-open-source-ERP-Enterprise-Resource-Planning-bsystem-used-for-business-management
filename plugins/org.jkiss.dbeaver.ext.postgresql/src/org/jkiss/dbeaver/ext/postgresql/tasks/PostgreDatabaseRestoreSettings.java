        }
 * Licensed under the Apache License, Version 2.0 (the "License");

        store.setValue("pg.restore.database", DBUtils.getObjectFullId(restoreInfo.getDatabase()));
        }
        store.setValue("pg.restore.noOwner", noOwner);
        inputFile = store.getString("pg.restore.inputFile");
                runnableContext.run(true, true, monitor -> {
    private boolean cleanFirst;
        }
        return noOwner;
            try {
        }
        store.setValue("pg.restore.inputFile", inputFile);



        super.saveSettings(runnableContext, store);
    }
    }
import java.lang.reflect.InvocationTargetException;
        if (restoreInfo == null) {
 *
    public boolean isNoOwner() {
        return inputFile;
public class PostgreDatabaseRestoreSettings extends PostgreBackupRestoreSettings {
 * You may obtain a copy of the License at
}
        createDatabase = store.getBoolean("pg.restore.createDatabase");
    }
            }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
        } else {
    @Override
        if (store instanceof DBPPreferenceMap) {

                        }
import org.jkiss.dbeaver.model.app.DBPProject;

 * DBeaver - Universal Database Manager
            } catch (InvocationTargetException e) {
                });
                // Ignore

                break;
                        throw new InvocationTargetException(e);

                        PostgreDatabase database = (PostgreDatabase) DBUtils.findObjectById(monitor, getProject(), finalCatalogId);
                        restoreInfo = new PostgreDatabaseRestoreInfo(database);
        this.createDatabase = createDatabase;

    public String getInputFile() {
            if (object instanceof PostgreSchema) {
    private boolean noOwner;
                    }
    private boolean createDatabase;
        store.setValue("pg.restore.createDatabase", createDatabase);

        noOwner = store.getBoolean("pg.restore.noOwner");

        this.inputFile = inputFile;
    public boolean isCleanFirst() {
    public void saveSettings(DBRRunnableContext runnableContext, DBPPreferenceStore store) {
        this.restoreInfo = restoreInfo;
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        super(project);
            catalogId = store.getString("pg.restore.database");


 * Copyright (C) 2010-2025 DBeaver Corp and others

/*
        for (DBSObject object : getDatabaseObjects()) {
    }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
        this.cleanFirst = cleanFirst;
            findRestoreInfo();
        return restoreInfo;
import org.jkiss.dbeaver.DBException;
    public PostgreDatabaseRestoreSettings(@NotNull DBPProject project) {
import org.jkiss.utils.CommonUtils;
    public boolean isCreateDatabase() {
    }
import org.jkiss.dbeaver.model.DBUtils;
    private static final Log log = Log.getLog(PostgreDatabaseRestoreSettings.class);
import org.jkiss.dbeaver.model.preferences.DBPPreferenceMap;
    public void setCreateDatabase(boolean createDatabase) {
    public void setNoOwner(boolean noOwner) {
    private void findRestoreInfo() {

 * Unless required by applicable law or agreed to in writing, software
                            throw new DBException("Database " + finalCatalogId + " not found");
                    try {
 *
    public void setInputFile(String inputFile) {
                restoreInfo = new PostgreDatabaseRestoreInfo((PostgreDatabase) object);
    }
        return createDatabase;
        super.loadSettings(runnableContext, store);
 * See the License for the specific language governing permissions and
    public PostgreDatabaseRestoreInfo getRestoreInfo() {
 * you may not use this file except in compliance with the License.
    }
        cleanFirst = store.getBoolean("pg.restore.cleanFirst");
    public void loadSettings(DBRRunnableContext runnableContext, DBPPreferenceStore store) throws DBException {
            }
 */

    public void setRestoreInfo(PostgreDatabaseRestoreInfo restoreInfo) {


    public PostgreDatabaseRestoreSettings() {
        }
import org.jkiss.dbeaver.Log;

            }

    }
package org.jkiss.dbeaver.ext.postgresql.tasks;
        if (restoreInfo == null) {
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
                    } catch (Throwable e) {
            if (object instanceof PostgreDatabase) {
    }
 *
    public void setCleanFirst(boolean cleanFirst) {
    }
import org.jkiss.code.NotNull;
    }

    }

        this.noOwner = noOwner;
                object = ((PostgreSchema) object).getDatabase();
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;

        if (!CommonUtils.isEmpty(catalogId)) {
                String finalCatalogId = catalogId;
    }
    @Override
                        if (database == null) {

            findRestoreInfo();
    }
        String catalogId = null;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
            } catch (InterruptedException e) {
    private String inputFile;
        store.setValue("pg.restore.cleanFirst", cleanFirst);
                log.error("Error loading objects configuration", e);
            throw new DBException("Cannot find database for restoring");
        return cleanFirst;
    private PostgreDatabaseRestoreInfo restoreInfo;
