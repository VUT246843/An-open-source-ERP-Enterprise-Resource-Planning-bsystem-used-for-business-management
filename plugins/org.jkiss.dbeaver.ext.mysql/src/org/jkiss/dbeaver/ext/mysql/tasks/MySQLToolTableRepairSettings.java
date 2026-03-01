    private boolean isExtended;
        return isExtended;
    }
    public void setUseFRM(boolean useFRM) {
        isQuick = quick;
 *
    }
        return useFRM;



    }
    }
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    }
    }
 * you may not use this file except in compliance with the License.
        config.put("quick", isQuick);
    @Override
        isExtended = JSONUtils.getBoolean(config, "extended");
        super.loadConfiguration(runnableContext, config, project);

    @Property(viewable = true, editable = true, updatable = true)
    public boolean isUseFRM() {

    public void saveConfiguration(Map<String, Object> config) {
import org.jkiss.dbeaver.model.meta.Property;
        isExtended = extended;
        useFRM = JSONUtils.getBoolean(config, "use_frm");
/*
    public void setExtended(boolean extended) {

    public boolean isExtended() {
    }
 *
 * limitations under the License.
 * You may obtain a copy of the License at
    public void loadConfiguration(@NotNull DBRRunnableContext runnableContext, @NotNull Map<String, Object> config, @NotNull DBPProject project) {

        config.put("extended", isExtended);
    private boolean isQuick;

 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
    @Property(viewable = true, editable = true, updatable = true)
import org.jkiss.dbeaver.model.app.DBPProject;
 */
 * Unless required by applicable law or agreed to in writing, software
    private boolean useFRM;
import org.jkiss.dbeaver.model.data.json.JSONUtils;
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteSettings;
        this.useFRM = useFRM;
import org.jkiss.dbeaver.ext.mysql.model.MySQLTableBase;
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;

import java.util.Map;
        return isQuick;
    @Override

 * Copyright (C) 2010-2024 DBeaver Corp and others
        super.saveConfiguration(config);

    @Property(viewable = true, editable = true, updatable = true)
 *
    public boolean isQuick() {
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void setQuick(boolean quick) {
        isQuick = JSONUtils.getBoolean(config, "quick");
        config.put("use_frm", useFRM);
public class MySQLToolTableRepairSettings extends SQLToolExecuteSettings<MySQLTableBase> {
import org.jkiss.code.NotNull;
package org.jkiss.dbeaver.ext.mysql.tasks;
}
 * distributed under the License is distributed on an "AS IS" BASIS,
