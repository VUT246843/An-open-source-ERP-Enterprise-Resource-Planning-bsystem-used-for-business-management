        isForce = JSONUtils.getBoolean(config, "force");
        super.saveConfiguration(config);

        config.put("always", isAlways);
    }
        isComplete = complete;
        return isAlways;

    }

    public void setComplete(boolean complete) {
    public boolean isFast() {
 * you may not use this file except in compliance with the License.
    public void setAlways(boolean always) {

        super.loadConfiguration(runnableContext, config, project);
        config.put("fast", isFast);
import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteSettings;
        isAlways = always;
    private boolean isComplete;
    private boolean isFast;
    }
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.meta.Property;
 *
    }
import org.jkiss.dbeaver.model.app.DBPProject;

    public void setFast(boolean fast) {

 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.data.json.JSONUtils;
    public void loadConfiguration(@NotNull DBRRunnableContext runnableContext, @NotNull Map<String, Object> config, @NotNull DBPProject project) {
 *     http://www.apache.org/licenses/LICENSE-2.0

    public boolean isRecomputed() {
    }
    public boolean isForce() {
        isFast = JSONUtils.getBoolean(config, "fast");
    public void saveConfiguration(Map<String, Object> config) {
        return isComplete;
        return isRecomputed;

        config.put("force", isForce);
 *
        config.put("recompute_partitions", isRecomputed);
        isRecomputed = JSONUtils.getBoolean(config, "recompute_partitions");
    }
 * limitations under the License.
    }
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
public class OracleToolMViewRefreshSettings extends SQLToolExecuteSettings<OracleTableBase> {

        return isForce;
/*

    @Override
        isAlways = JSONUtils.getBoolean(config, "always");
 * Licensed under the Apache License, Version 2.0 (the "License");
        isRecomputed = recomputed;

    private boolean isForce;
    public boolean isAlways() {
}
    }
    }
package org.jkiss.dbeaver.ext.oracle.tasks;
 * DBeaver - Universal Database Manager
import org.jkiss.code.NotNull;
    public void setForce(boolean force) {

import org.jkiss.dbeaver.ext.oracle.model.OracleTableBase;
    }
    @Property(viewable = true, editable = true, updatable = true)
    @Property(viewable = true, editable = true, updatable = true)
    }
    @Property(viewable = true, editable = true, updatable = true)
        isFast = fast;
        config.put("complete", isComplete);
    public void setRecomputed(boolean recomputed) {
    @Property(viewable = true, editable = true, updatable = true)
 */
    private boolean isRecomputed;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        isForce = force;
    public boolean isComplete() {
    private boolean isAlways;
 * You may obtain a copy of the License at
        return isFast;

        isComplete = JSONUtils.getBoolean(config, "complete");
 *
import java.util.Map;
    }
    @Property(viewable = true, editable = true, updatable = true)

