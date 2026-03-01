        config.put("force", isForce);
    public void saveConfiguration(Map<String, Object> config) {
import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
 *
        super.loadConfiguration(runnableContext, config, project);
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    public void setForce(boolean force) {

public class MySQLToolTableTruncateSettings extends SQLToolExecuteSettings<MySQLTableBase> {
 *     http://www.apache.org/licenses/LICENSE-2.0
}
    @Override
    }
import java.util.Map;
import org.jkiss.dbeaver.model.data.json.JSONUtils;
    @Override
 * DBeaver - Universal Database Manager
    @Property(viewable = true, editable = true, updatable = true)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteSettings;
        isForce = force;


import org.jkiss.dbeaver.model.app.DBPProject;
 *
 * You may obtain a copy of the License at
        super.saveConfiguration(config);
import org.jkiss.dbeaver.model.meta.Property;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
    private boolean isForce;
    public boolean isForce() {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ext.mysql.model.MySQLTableBase;
        return isForce;

    }
 * limitations under the License.
 */

    }

    public void loadConfiguration(@NotNull DBRRunnableContext runnableContext, @NotNull Map<String, Object> config, @NotNull DBPProject project) {

        isForce = JSONUtils.getBoolean(config, "force");
 *
 * See the License for the specific language governing permissions and
/*
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ext.mysql.tasks;
