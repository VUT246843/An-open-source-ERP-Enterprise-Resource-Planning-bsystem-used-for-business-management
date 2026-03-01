            return false;
 * You may obtain a copy of the License at

    public void loadConfiguration(@NotNull DBRRunnableContext runnableContext, @NotNull Map<String, Object> config, @NotNull DBPProject project) {
        }
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
                "",
import org.jkiss.dbeaver.model.meta.Property;
    public String getOption() {
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
        public boolean allowCustomValue() {
import org.jkiss.dbeaver.model.data.json.JSONUtils;
 * See the License for the specific language governing permissions and
 * limitations under the License.
}
        return option;
import org.jkiss.dbeaver.model.app.DBPProject;
    }
    @Property(viewable = true, editable = true, updatable = true, listProvider = CheckOptionListProvider.class)
 * Licensed under the Apache License, Version 2.0 (the "License");
                "EXTENDED",

    public static class CheckOptionListProvider implements IPropertyValueListProvider<MySQLToolTableCheckSettings> {
 *
        this.option = option;

    @Override
                "FAST",

        option = JSONUtils.getString(config, "option");
        @Override
    }

        public Object[] getPossibleValues(MySQLToolTableCheckSettings object) {
 * Unless required by applicable law or agreed to in writing, software


 *
            return new String[] {
/*
    }
 * DBeaver - Universal Database Manager
                "QUICK",
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ext.mysql.model.MySQLTableBase;
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteSettings;
                "CHANGED"
            };
    public void saveConfiguration(Map<String, Object> config) {
 * you may not use this file except in compliance with the License.
        config.put("option", option);

    }
        }
import java.util.Map;
public class MySQLToolTableCheckSettings extends SQLToolExecuteSettings<MySQLTableBase> {
                "MEDIUM",
    }
package org.jkiss.dbeaver.ext.mysql.tasks;
 */

 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Table check settings
        @Nullable
import org.jkiss.code.Nullable;
    public void setOption(String option) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        super.loadConfiguration(runnableContext, config, project);
        super.saveConfiguration(config);

        @Override
 */
/**

 *
    private String option;
                "FOR UPGRADE",
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
