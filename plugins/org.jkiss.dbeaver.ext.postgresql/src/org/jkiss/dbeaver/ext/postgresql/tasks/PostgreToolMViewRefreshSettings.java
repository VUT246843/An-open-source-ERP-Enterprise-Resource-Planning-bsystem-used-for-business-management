
        isWithData = JSONUtils.getBoolean(config, "with_data");

 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.ext.postgresql.tasks;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreMaterializedView;
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteSettings;
 * DBeaver - Universal Database Manager
    public void setWithData(boolean withData) {

    public void saveConfiguration(Map<String, Object> config) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
 *


        isWithData = withData;
    }
public class PostgreToolMViewRefreshSettings extends SQLToolExecuteSettings<PostgreMaterializedView> {
    @Property(viewable = true, editable = true, updatable = true)
        return isWithData;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.meta.Property;
    @Override
    public void loadConfiguration(@NotNull DBRRunnableContext runnableContext, @NotNull Map<String, Object> config, @NotNull DBPProject project) {
 *
        super.loadConfiguration(runnableContext, config, project);
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.app.DBPProject;

    private boolean isWithData;
    }
        config.put("with_data", isWithData);
import org.jkiss.dbeaver.model.data.json.JSONUtils;
 * limitations under the License.
/*

    }
}
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    public boolean isWithData() {
        super.saveConfiguration(config);
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
 *
 */
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
import java.util.Map;
