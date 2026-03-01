        noBeep = CommonUtils.toBoolean(preferenceStore.getString(PREFERENCE_NO_BEEP));
    public MySQLScriptExecuteSettings(@NotNull DBPProject project) {
        preferenceStore.setValue(PREFERENCE_IS_IMPORT, isImport);
 * DBeaver - Universal Database Manager

    public boolean isImport() {
    public void setLogLevel(LogLevel logLevel) {
        this.noBeep = noBeep;
package org.jkiss.dbeaver.ext.mysql.tasks;
    }
    public boolean isVerbose() {
import org.jkiss.dbeaver.model.connection.DBPNativeClientLocation;
        this.overrideCredentials = value;
        return logLevel;

        return overrideCredentials;
    @Override

        this.isForeignKeyCheckDisabled = isForeignKeyCheckDisabled;
    private boolean isImport;

    }
import org.jkiss.dbeaver.ext.mysql.model.MySQLCatalog;
        preferenceStore.setValue(PREFERENCE_NO_BEEP, noBeep);
    }

        Normal,
    private static final String PREFERENCE_LOG_LEVEL = PREFERENCE_PREFIX + "logLevel";
    public boolean isNoBeep() {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
import org.jkiss.utils.CommonUtils;
        super.saveSettings(runnableContext, preferenceStore);
    public MySQLScriptExecuteSettings() {

import org.jkiss.dbeaver.DBException;

    public void setIsForeignKeyCheckDisabled(boolean isForeignKeyCheckDisabled) {
import org.jkiss.dbeaver.model.app.DBPProject;

        preferenceStore.setValue(PREFERENCE_LOG_LEVEL, logLevel.name());
    public DBPNativeClientLocation findNativeClientHome(String clientHomeId) {
    public void saveSettings(DBRRunnableContext runnableContext, DBPPreferenceStore preferenceStore) {
    }
 * You may obtain a copy of the License at
    private static final String PREFERENCE_PREFIX = "MySQL.script.";
    }
    }

}
    public void setOverrideCredentials(boolean value) {
        isForeignKeyCheckDisabled = CommonUtils.toBoolean(preferenceStore.getString(PREFERENCE_DISABLE_FOREIGN_KEY));
    public enum LogLevel {
        return isForeignKeyCheckDisabled;

    private boolean noBeep = true;
 * limitations under the License.
        return noBeep;
    private boolean isForeignKeyCheckDisabled;
        super.loadSettings(runnableContext, preferenceStore);

    }
/*
    private boolean overrideCredentials;
    public boolean isOverrideCredentials() {
 *
import org.jkiss.dbeaver.ext.mysql.MySQLDataSourceProvider;

    @Override

    private LogLevel logLevel = LogLevel.Normal;

        return MySQLDataSourceProvider.getServerHome(clientHomeId);
        Debug
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
        preferenceStore.setValue(MySQLNativeCredentialsSettings.PREFERENCE_NAME, overrideCredentials);
 * you may not use this file except in compliance with the License.


    public void setImport(boolean anImport) {


        logLevel = CommonUtils.valueOf(LogLevel.class, preferenceStore.getString(PREFERENCE_LOG_LEVEL), LogLevel.Normal);
    }
 * See the License for the specific language governing permissions and

 *
    @Override
        overrideCredentials = CommonUtils.toBoolean(preferenceStore.getString(MySQLNativeCredentialsSettings.PREFERENCE_NAME));
        super(project);
        this.logLevel = logLevel;
    }
    public boolean isForeignKeyCheckDisabled() {
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    }
    private static final String PREFERENCE_DISABLE_FOREIGN_KEY = PREFERENCE_PREFIX + "disableForeignKey";
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
        Verbose,
    @Override

    private static final String PREFERENCE_IS_IMPORT = PREFERENCE_PREFIX + ".import";
    }
    public void setNoBeep(boolean noBeep) {
    public LogLevel getLogLevel() {
public class MySQLScriptExecuteSettings extends AbstractScriptExecuteSettings<MySQLCatalog> implements MySQLNativeCredentialsSettings {
 */
    public void loadSettings(DBRRunnableContext runnableContext, DBPPreferenceStore preferenceStore) throws DBException {
        preferenceStore.setValue(PREFERENCE_DISABLE_FOREIGN_KEY, isForeignKeyCheckDisabled);
    }

        isImport = anImport;
    }
        return isImport;

        return logLevel == LogLevel.Verbose || logLevel == LogLevel.Debug;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;


    }
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
import org.jkiss.dbeaver.tasks.nativetool.AbstractScriptExecuteSettings;
        isImport = CommonUtils.getBoolean(preferenceStore.getString(PREFERENCE_IS_IMPORT), isImport);
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.NotNull;
    private static final String PREFERENCE_NO_BEEP = PREFERENCE_PREFIX + "noBeep";
    }
    }
