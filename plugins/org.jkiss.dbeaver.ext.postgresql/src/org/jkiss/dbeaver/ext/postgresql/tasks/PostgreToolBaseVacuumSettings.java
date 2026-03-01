
        isFreeze = JSONUtils.getBoolean(config, "freeze");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    }
        isAnalyzed = JSONUtils.getBoolean(config, "analyze");
    @Override
    public boolean isAnalyzed() {
        config.put("index_cleanup", isIndexCleaning);
    @Property(viewable = true, editable = true, updatable = true)
    public void setFreeze(boolean freeze) {

    public boolean isFull() {
        return isTruncated;
        config.put("analyze", isAnalyzed);
    private boolean isTruncated;
    }
 *
    private boolean isIndexCleaning;
    private boolean isSkipLocked;
 * Unless required by applicable law or agreed to in writing, software
    }
 */
 * See the License for the specific language governing permissions and
        isSkipLocked = JSONUtils.getBoolean(config, "skip_locked");
 * limitations under the License.

        config.put("freeze", isFreeze);
    private boolean isFreeze;
    @Override
    }
    public void setSkipLocked(boolean skipLocked) {
        config.put("truncate", isTruncated);
    }
 * you may not use this file except in compliance with the License.

 * You may obtain a copy of the License at
    private boolean isAnalyzed;
        return isSkipLocked;

    }
    public void setIndexCleaning(boolean indexCleaning) {

}
        return isFreeze;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    public boolean isTruncated() {
 *
        return isFull;
    }
        return isIndexCleaning;


        config.put("full", isFull);
    }
        isTruncated = truncated;
    public void setDisableSkipping(boolean disableSkipping) {
    public void setTruncated(boolean truncated) {

import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteSettings;
    public void saveConfiguration(Map<String, Object> config) {
package org.jkiss.dbeaver.ext.postgresql.tasks;
    @Property(viewable = true, editable = true, updatable = true, visibleIf = PostgreVersionValidator12.class)
        super.saveConfiguration(config);
        isTruncated = JSONUtils.getBoolean(config, "truncate");

    }
    }
    public void setAnalyzed(boolean analyzed) {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;

    @Property(viewable = true, editable = true, updatable = true)
        isFreeze = freeze;
        config.put("disable_page_skipping", isDisableSkipping);
    public void setFull(boolean full) {


 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.app.DBPProject;
public class PostgreToolBaseVacuumSettings extends SQLToolExecuteSettings<DBSObject> {

    @Property(viewable = true, editable = true, updatable = true, visibleIf = PostgreVersionValidator12.class)
/*
        isSkipLocked = skipLocked;
    public void loadConfiguration(@NotNull DBRRunnableContext runnableContext, @NotNull Map<String, Object> config, @NotNull DBPProject project) {
        isIndexCleaning = indexCleaning;
    public boolean isSkipLocked() {
        super.loadConfiguration(runnableContext, config, project);
    public boolean isDisableSkipping() {
    public boolean isIndexCleaning() {


    private boolean isDisableSkipping;
import java.util.Map;
import org.jkiss.code.NotNull;
        isFull = full;
    @Property(viewable = true, editable = true, updatable = true, visibleIf = PostgreVersionValidator12.class)
    }
import org.jkiss.dbeaver.model.data.json.JSONUtils;
        isFull = JSONUtils.getBoolean(config, "full");
        isDisableSkipping = JSONUtils.getBoolean(config, "disable_page_skipping");
    public boolean isFreeze() {
        return isDisableSkipping;
import org.jkiss.dbeaver.model.meta.Property;
    @Property(viewable = true, editable = true, updatable = true)
        return isAnalyzed;
    private boolean isFull;

    }
        isAnalyzed = analyzed;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        isIndexCleaning = JSONUtils.getBoolean(config, "index_cleanup");
 *

    @Property(viewable = true, editable = true, updatable = true, visibleIf = PostgreVersionValidator9and6.class)
    }
        config.put("skip_locked", isSkipLocked);

import org.jkiss.dbeaver.model.struct.DBSObject;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        isDisableSkipping = disableSkipping;
