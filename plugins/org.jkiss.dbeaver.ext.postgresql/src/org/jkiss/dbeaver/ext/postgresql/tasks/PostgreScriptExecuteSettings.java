            }
    }
 * limitations under the License.
 * you may not use this file except in compliance with the License.

                    try {
        return database;
                String finalDatabaseId = databaseId;
 * You may obtain a copy of the License at
            } catch (InvocationTargetException e) {
                        }
                            throw new DBException("Database " + finalDatabaseId + " not found");
import org.jkiss.dbeaver.tasks.nativetool.AbstractScriptExecuteSettings;
public class PostgreScriptExecuteSettings extends AbstractScriptExecuteSettings<DBSObject> {
        super(project);
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.utils.CommonUtils;
import org.jkiss.code.NotNull;

        for (DBSObject object : getDatabaseObjects()) {
                break;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
import org.jkiss.dbeaver.model.struct.DBSObject;

    public void setDatabase(PostgreDatabase database) {
            throw new DBException("Cannot find database for script execution");
    public void saveSettings(DBRRunnableContext runnableContext, DBPPreferenceStore store) {
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
}
            findDatabase();
 * DBeaver - Universal Database Manager
                        if (database == null) {

        String databaseId = null;
import org.jkiss.dbeaver.Log;
                        throw new InvocationTargetException(e);
    }
 *
        }
    public PostgreScriptExecuteSettings() {
                    }
            if (object instanceof PostgreDatabase) {
                database = (PostgreDatabase) object;
        }
    private PostgreDatabase database;

        }

 * Licensed under the Apache License, Version 2.0 (the "License");
    }
import org.jkiss.dbeaver.DBException;
    }
 *
import org.jkiss.dbeaver.model.app.DBPProject;
        this.database = database;

 * Copyright (C) 2010-2025 DBeaver Corp and others
                    } catch (Throwable e) {
        super.saveSettings(runnableContext, store);
 * See the License for the specific language governing permissions and
    }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
            databaseId = store.getString("pg.script.database");
    @Override


                runnableContext.run(true, true, monitor -> {
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
        store.setValue("pg.script.database", DBUtils.getObjectFullId(database));
        if (database == null) {
 *
    private void findDatabase() {
            findDatabase();
        if (database == null) {
                // Ignore
    public void loadSettings(DBRRunnableContext runnableContext, DBPPreferenceStore store) throws DBException {


        if (!CommonUtils.isEmpty(databaseId)) {
                });
                        database = (PostgreDatabase) DBUtils.findObjectById(monitor, getProject(), finalDatabaseId);
            }
import org.jkiss.dbeaver.model.preferences.DBPPreferenceMap;
    private static final Log log = Log.getLog(PostgreScriptExecuteSettings.class);
import java.lang.reflect.InvocationTargetException;
        if (store instanceof DBPPreferenceMap) {
/*
        super.loadSettings(runnableContext, store);
package org.jkiss.dbeaver.ext.postgresql.tasks;
        }
 */
    }
        } else {
            try {
import org.jkiss.dbeaver.model.DBUtils;
        }
 * Unless required by applicable law or agreed to in writing, software
    public PostgreDatabase getDatabase() {
                log.error("Error loading objects configuration", e);
            } catch (InterruptedException e) {


 * distributed under the License is distributed on an "AS IS" BASIS,
    public PostgreScriptExecuteSettings(@NotNull DBPProject project) {
