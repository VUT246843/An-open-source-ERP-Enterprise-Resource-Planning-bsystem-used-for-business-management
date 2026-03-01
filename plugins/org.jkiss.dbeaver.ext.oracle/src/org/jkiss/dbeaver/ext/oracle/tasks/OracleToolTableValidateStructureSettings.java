
        this.option = option;
    public void loadConfiguration(@NotNull DBRRunnableContext runnableContext, @NotNull Map<String, Object> config, @NotNull DBPProject project) {
    }
        super.saveConfiguration(config);
import org.jkiss.dbeaver.model.app.DBPProject;
import org.jkiss.dbeaver.model.meta.Property;
 */



import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
                    "",
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
            };
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteSettings;
 * distributed under the License is distributed on an "AS IS" BASIS,

 * limitations under the License.
    public static class CheckOptionListProvider implements IPropertyValueListProvider<OracleToolTableValidateStructureSettings> {
}
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
import org.jkiss.dbeaver.ext.oracle.model.OracleTableBase;
 *


public class OracleToolTableValidateStructureSettings extends SQLToolExecuteSettings<OracleTableBase> {

    @Override
        @Override
    }
                    "CASCADE ONLINE",
package org.jkiss.dbeaver.ext.oracle.tasks;
        }
/*
                    "CASCADE",
            return false;
    private String option;
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
        option = JSONUtils.getString(config, "option");
        public Object[] getPossibleValues(OracleToolTableValidateStructureSettings object) {
    }
        @Override
        config.put("option", option);
    public void saveConfiguration(Map<String, Object> config) {

import org.jkiss.code.Nullable;
    public void setOption(String option) {
        super.loadConfiguration(runnableContext, config, project);
                    "CASCADE FAST",
 * You may obtain a copy of the License at
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getOption() {

            return new String[] {
        @Nullable
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.data.json.JSONUtils;
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
        public boolean allowCustomValue() {
        return option;
    @Property(viewable = true, editable = true, updatable = true, listProvider = CheckOptionListProvider.class)
    }
import java.util.Map;
        }
