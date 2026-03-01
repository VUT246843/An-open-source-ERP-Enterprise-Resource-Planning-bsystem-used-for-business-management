
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return false;
import org.jkiss.dbeaver.ext.db2.model.DB2TableBase;
    }
 */
    private String triggerOption;
import org.jkiss.code.Nullable;
    }
 *
        }

        storageOption = JSONUtils.getString(config, "storage_option"); //$NON-NLS-1$

    private final static String[] triggerOptions = new String[] {ignoreDeleteTriggers.getDesc(), restrictWhenDeleteTriggers.getDesc()};
}

            return triggerOptions;
    }
        public boolean allowCustomValue() {
        }
    }
import org.jkiss.dbeaver.model.app.DBPProject;
        @Override


            return false;
        @Override
        if (storageOption == null) {
        config.put("storage_option", storageOption); //$NON-NLS-1$
        public boolean allowCustomValue() {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
    private String storageOption;
    }
/*
        super.saveConfiguration(config);


        @Nullable
 * you may not use this file except in compliance with the License.
            return storageOptions;
    }
public class DB2ToolTableTruncateSettings extends SQLToolExecuteSettings<DB2TableBase> {
    public void setStorageOption(String storageOption) {

import static org.jkiss.dbeaver.ext.db2.tasks.DB2TableTruncateOptions.*;
import java.util.Map;
        triggerOption = JSONUtils.getString(config, "trigger_option"); //$NON-NLS-1$
        return triggerOption;
    public void loadConfiguration(@NotNull DBRRunnableContext runnableContext, @NotNull Map<String, Object> config, @NotNull DBPProject project) {
    public void saveConfiguration(Map<String, Object> config) {
        public Object[] getPossibleValues(DB2ToolTableTruncateSettings object) {
        }
        @Override
    }
    public String getTriggerOption() {
    private final static String[] storageOptions = new String[] {dropStorage.getDesc(), reuseStorage.getDesc()};
        }
        }
        this.storageOption = storageOption;
import org.jkiss.dbeaver.model.meta.Property;
    @Property(viewable = true, editable = true, updatable = true, order = 2, listProvider = CheckTriggersOptionListProvider.class)

        @Override
    @Override
import org.jkiss.dbeaver.model.data.json.JSONUtils;
        if (triggerOption == null) {
package org.jkiss.dbeaver.ext.db2.tasks;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2025 DBeaver Corp and others



        super.loadConfiguration(runnableContext, config, project);
 *
 * Unless required by applicable law or agreed to in writing, software
        config.put("trigger_option", triggerOption); //$NON-NLS-1$
    public String getStorageOption() {

    }
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteSettings;
 * limitations under the License.
    public static class CheckTriggersOptionListProvider implements IPropertyValueListProvider<DB2ToolTableTruncateSettings> {
        }
    public void setTriggerOption(String storageOption) {
        this.triggerOption = storageOption;
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and

        public Object[] getPossibleValues(DB2ToolTableTruncateSettings object) {
    public static class CheckStorageOptionListProvider implements IPropertyValueListProvider<DB2ToolTableTruncateSettings> {
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
            storageOption = DB2TableTruncateOptions.getOption(storageOptions[0]).getDesc();
        return storageOption;
 *
import org.jkiss.code.NotNull;
    @Property(viewable = true, editable = true, updatable = true, order = 1, listProvider = CheckStorageOptionListProvider.class)
        @Nullable
    @Override
            triggerOption = DB2TableTruncateOptions.getOption(triggerOptions[0]).getDesc();
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;

