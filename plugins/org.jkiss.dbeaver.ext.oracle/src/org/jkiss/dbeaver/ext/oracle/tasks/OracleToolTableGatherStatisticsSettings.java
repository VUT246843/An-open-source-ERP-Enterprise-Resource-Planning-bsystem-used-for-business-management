 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
    public int getSamplePercent() {
 *
    public static class OracleStatisticPercentLimiter implements IPropertyValueValidator<OracleToolTableGatherStatisticsSettings, Object> {
}
import org.jkiss.code.Nullable;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
        super.loadConfiguration(runnableContext, config, project);
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteSettings;
        super.saveConfiguration(config);

package org.jkiss.dbeaver.ext.oracle.tasks;
import org.jkiss.dbeaver.model.meta.Property;
    }
 * Unless required by applicable law or agreed to in writing, software

 *
 * you may not use this file except in compliance with the License.

    }
    public void setSamplePercent(int samplePercent) {
        return samplePercent;
 * See the License for the specific language governing permissions and
import java.util.Map;
 */
            int valueInt = CommonUtils.toInt(value);
import org.jkiss.dbeaver.model.meta.IPropertyValueValidator;


 *

        @Override
    private int samplePercent;
        }
    public void loadConfiguration(@NotNull DBRRunnableContext runnableContext, @NotNull Map<String, Object> config, @NotNull DBPProject project) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        this.samplePercent = samplePercent;
 * You may obtain a copy of the License at
    public void saveConfiguration(Map<String, Object> config) {
    }
            return 0 <= valueInt && valueInt <= 100;
import org.jkiss.dbeaver.model.data.json.JSONUtils;
        samplePercent = JSONUtils.getInteger(config, "sample_percent");

    @Property(viewable = true, editable = true, updatable = true, valueValidator = OracleStatisticPercentLimiter.class)
import org.jkiss.dbeaver.model.app.DBPProject;
        config.put("sample_percent", samplePercent);
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        public boolean isValidValue(@NotNull OracleToolTableGatherStatisticsSettings object, @Nullable Object value) throws IllegalArgumentException {
    @Override
public class OracleToolTableGatherStatisticsSettings extends SQLToolExecuteSettings<DBSObject> {
import org.jkiss.utils.CommonUtils;
    }
import org.jkiss.dbeaver.model.struct.DBSObject;
 * DBeaver - Universal Database Manager
 * limitations under the License.
/*

    @Override
