    public boolean isOnly() {
/*
        }
        config.put("run_in_separate_transaction", isRunning());
        isRestarting = JSONUtils.getBoolean(config, "restart_identity");
        config.put("restart_identity", isRestarting);
import org.jkiss.utils.CommonUtils;
    private boolean isOnly;
            return isTruncateModeSupported(settings, PostgreServerExtensionBase.TRUNCATE_TOOL_MODE_SUPPORT_IDENTITIES);
        isCascading = cascading;


        return false;

 * limitations under the License.
        public boolean isValidValue(@NotNull PostgreToolTableTruncateSettings settings, @Nullable Object value) throws IllegalArgumentException {
        public boolean isValidValue(@NotNull PostgreToolTableTruncateSettings settings, @Nullable Object value) throws IllegalArgumentException {
        super.loadConfiguration(runnableContext, config, project);
    public void loadConfiguration(@NotNull DBRRunnableContext runnableContext, @NotNull Map<String, Object> config, @NotNull DBPProject project) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
    @Property(viewable = true, editable = true, updatable = true)
    @Property(viewable = true, editable = true, updatable = true, visibleIf = PostgreSupportTruncateOptionCascadeValidator.class)
    }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableBase;
        if (!CommonUtils.isEmpty(tablesList)) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        config.put("cascade", isCascading);
        return isOnly;
        return isCascading;
            return CommonUtils.isBitSet(tableBase.getDataSource().getServerType().getTruncateToolModes(), mode);
    }

    }
        isOnly = JSONUtils.getBoolean(config, "only");
import org.jkiss.dbeaver.model.app.DBPProject;
 * you may not use this file except in compliance with the License.
    }
        }
    private boolean isRestarting;
    }
    private boolean isCascading;
package org.jkiss.dbeaver.ext.postgresql.tasks;
    public boolean isRunning() {

import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        config.put("only", isOnly);
}
        return isRunning;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.meta.Property;

import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
            return isTruncateModeSupported(settings, PostgreServerExtensionBase.TRUNCATE_TOOL_MODE_SUPPORT_CASCADE);
        isRestarting = restarting;
        isOnly = only;
        public boolean isValidValue(@NotNull PostgreToolTableTruncateSettings settings, @Nullable Object value) throws IllegalArgumentException {
import org.jkiss.dbeaver.ext.postgresql.model.impls.PostgreServerExtensionBase;
 *

            return isTruncateModeSupported(settings, PostgreServerExtensionBase.TRUNCATE_TOOL_MODE_SUPPORT_ONLY_ONE_TABLE);
    public static class PostgreSupportTruncateOptionIdentityValidator implements IPropertyValueValidator<PostgreToolTableTruncateSettings, Object> {

public class PostgreToolTableTruncateSettings extends SQLToolExecuteSettings<PostgreTableBase> {
    private static boolean isTruncateModeSupported(PostgreToolTableTruncateSettings settings, int mode) {

    }
    public void setCascading(boolean cascading) {
    @Property(viewable = true, editable = true, updatable = true, visibleIf = PostgreSupportTruncateOptionOnlyValidator.class)

    }
        super.saveConfiguration(config);

        isCascading = JSONUtils.getBoolean(config, "cascade");
    }

 *
import java.util.List;
    public static class PostgreSupportTruncateOptionCascadeValidator implements IPropertyValueValidator<PostgreToolTableTruncateSettings, Object> {
import org.jkiss.code.Nullable;
        @Override

        }
    }
    @Override
    }
import org.jkiss.dbeaver.model.data.json.JSONUtils;

import org.jkiss.dbeaver.model.sql.task.SQLToolExecuteSettings;
        isRunning = running;
    public void setRunning(boolean running) {
    }
    @Override

    }
            PostgreTableBase tableBase = tablesList.get(0);

        isRunning = JSONUtils.getBoolean(config, "run_in_separate_transaction");

    @Property(viewable = true, editable = true, updatable = true, visibleIf = PostgreSupportTruncateOptionIdentityValidator.class)
    private boolean isRunning;
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.model.meta.IPropertyValueValidator;
        List<PostgreTableBase> tablesList = settings.getObjectList();
import java.util.Map;
        @Override
    public static class PostgreSupportTruncateOptionOnlyValidator implements IPropertyValueValidator<PostgreToolTableTruncateSettings, Object> {
        @Override
 *
    public void setOnly(boolean only) {
        return isRestarting;
        }
 * See the License for the specific language governing permissions and
    }
    }
 * You may obtain a copy of the License at
    public boolean isCascading() {
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void saveConfiguration(Map<String, Object> config) {
    public boolean isRestarting() {
    public void setRestarting(boolean restarting) {
