        super.saveConfiguration(config);
 * See the License for the specific language governing permissions and

 * Licensed under the Apache License, Version 2.0 (the "License");
    @Property(viewable = true, editable = true, updatable = true)
        config.put("reuse_storage", isReusable);
 *
package org.jkiss.dbeaver.ext.oracle.tasks;



import org.jkiss.dbeaver.model.app.DBPProject;
 *
import org.jkiss.code.NotNull;


 */
    }
    @Override
import java.util.Map;
import org.jkiss.dbeaver.model.meta.Property;
/*
import org.jkiss.dbeaver.ext.oracle.model.OracleTableBase;
        super.loadConfiguration(runnableContext, config, project);
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteSettings;
    }
        isReusable = reusable;
}
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at

 * you may not use this file except in compliance with the License.
    public void loadConfiguration(@NotNull DBRRunnableContext runnableContext, @NotNull Map<String, Object> config, @NotNull DBPProject project) {
public class OracleToolTableTruncateSettings extends SQLToolExecuteSettings<OracleTableBase> {
    }
    private boolean isReusable;
 * limitations under the License.
    public void saveConfiguration(Map<String, Object> config) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
        return isReusable;
    public void setReusable(boolean reusable) {
    public boolean isReusable() {
        isReusable = JSONUtils.getBoolean(config, "reuse_storage");
    @Override
import org.jkiss.dbeaver.model.data.json.JSONUtils;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
