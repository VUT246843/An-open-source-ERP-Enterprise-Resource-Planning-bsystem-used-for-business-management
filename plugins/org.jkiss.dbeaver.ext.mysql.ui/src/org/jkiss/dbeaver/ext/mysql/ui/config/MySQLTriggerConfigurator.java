public class MySQLTriggerConfigurator implements DBEObjectConfigurator<MySQLTrigger> {
                "CREATE TRIGGER " + DBUtils.getQuotedIdentifier(trigger) + "\n" +
 */
import org.jkiss.dbeaver.ext.mysql.model.MySQLTrigger;
    
    @Override
package org.jkiss.dbeaver.ext.mysql.ui.config;
import org.jkiss.dbeaver.model.struct.DBSEntityType;
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            //trigger.setManipulationType(editPage.getM);
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
            trigger.setName(editPage.getEntityName());
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
 * limitations under the License.
            if (!editPage.edit()) {
        return UITask.run(() -> {
    public MySQLTrigger configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object parent, @NotNull MySQLTrigger trigger, @NotNull Map<String, Object> options) {
 */
            }
                    "ON " + DBUtils.getQuotedIdentifier(trigger.getParentObject()) + " FOR EACH ROW\n");
 * Unless required by applicable law or agreed to in writing, software
            return trigger;
 * you may not use this file except in compliance with the License.
            trigger.setObjectDefinitionText(
import java.util.Map;
        });
 *

 * You may obtain a copy of the License at
 *
 * MySQL sequence configurator
import org.jkiss.dbeaver.ui.UITask;
                return null;
 * See the License for the specific language governing permissions and
/**
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.ui.editors.object.struct.EntityEditPage;
}
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");


            EntityEditPage editPage = new EntityEditPage(trigger.getDataSource(), DBSEntityType.TRIGGER);
 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.jkiss.dbeaver.model.edit.DBECommandContext;
                    trigger.getActionTiming() + " " + trigger.getManipulationType() + "\n" +
 *

