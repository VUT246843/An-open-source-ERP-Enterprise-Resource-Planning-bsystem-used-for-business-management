    public static class CheckStorageOptionListProvider implements IPropertyValueListProvider<DB2ReorgIndexToolSettings> {
    @Property(viewable = true, editable = true, updatable = true, order = 2, listProvider = DB2ReorgIndexToolSettings.CheckTriggersOptionListProvider.class)
 * limitations under the License.

package org.jkiss.dbeaver.ext.db2.tasks;
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
        }
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
    
        @Override
        }

        @Override

        public Object[] getPossibleValues(DB2ReorgIndexToolSettings object) {
        @Nullable
    @Property(viewable = true, editable = true, updatable = true, order = 1, listProvider = DB2ReorgIndexToolSettings.CheckStorageOptionListProvider.class)
    }
            return false;
        }
 * DBeaver - Universal Database Manager
            return false;
        return cleanupOption;
 * See the License for the specific language governing permissions and
        super.loadConfiguration(runnableContext, config, project);
    }

 *     http://www.apache.org/licenses/LICENSE-2.0


    public String getTableAccess() {
        public boolean allowCustomValue() {
 * you may not use this file except in compliance with the License.
        @Override
        }

        this.cleanupOption = storageOption;
import java.util.Map;
            cleanupOption = cleanupOptions[0];
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 */
    }
        if (cleanupOption == null) {
    public void saveConfiguration(Map<String, Object> config) {


    private final static String[] cleanupOptions = new String[] {"", " CLEANUP ALL", " CLEANUP PAGES"}; //$NON-NLS-1$
        @Override
        public Object[] getPossibleValues(DB2ReorgIndexToolSettings object) {
    }

 * Copyright (C) 2010-2025 DBeaver Corp and others
        public boolean allowCustomValue() {
    }
    public void setTableAccess(String tableAccess) {
        config.put("table_access", tableAccess); //$NON-NLS-1$
            return tableAccesses;
    @Override
    public String getCleanupOption() {
}
public class DB2ReorgIndexToolSettings extends SQLToolExecuteSettings<DB2TableBase> {
    }

        this.tableAccess = tableAccess;
import org.jkiss.code.Nullable;
    public void loadConfiguration(@NotNull DBRRunnableContext runnableContext, @NotNull Map<String, Object> config, @NotNull DBPProject project) {
    public static class CheckTriggersOptionListProvider implements IPropertyValueListProvider<DB2ReorgIndexToolSettings> {
import org.jkiss.code.NotNull;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void setCleanupOption(String storageOption) {
 *
import org.jkiss.dbeaver.model.app.DBPProject;
import org.jkiss.dbeaver.model.data.json.JSONUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private String cleanupOption;
    }
            tableAccess = tableAccesses[0];
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteSettings;

import org.jkiss.dbeaver.ext.db2.model.DB2TableBase;
        @Nullable
    private String tableAccess;
    private final static String[] tableAccesses = new String[] {"", " ALLOW NO ACCESS", " ALLOW READ ACCESS", " ALLOW WRITE ACCESS"}; //$NON-NLS-1$
/*
        super.saveConfiguration(config);
        }
 *
        tableAccess = JSONUtils.getString(config, "table_access"); //$NON-NLS-1$
        cleanupOption = JSONUtils.getString(config, "option"); //$NON-NLS-1$

            return cleanupOptions;
    @Override
        return tableAccess;
        config.put("option", cleanupOption); //$NON-NLS-1$
 * You may obtain a copy of the License at
        }
import org.jkiss.dbeaver.model.meta.Property;
        if (tableAccess == null) {


 * Unless required by applicable law or agreed to in writing, software
