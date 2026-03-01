
}
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
import org.jkiss.code.NotNull;
 */
 * limitations under the License.
            }
 *
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return UITask.run(() -> {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.UITask;
            event.setEventDefinition("SELECT 1");
public class MySQLEventConfigurator implements DBEObjectConfigurator<MySQLEvent> {
    public MySQLEvent configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object parent, @NotNull MySQLEvent event, @NotNull Map<String, Object> options) {
 */
            event.setName(editPage.getEntityName());
/**
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 *
import java.util.Map;
            EntityEditPage editPage = new EntityEditPage(event.getDataSource(), DBSEntityType.EVENT);
    @Override
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.editors.object.struct.EntityEditPage;
/*
import org.jkiss.code.Nullable;
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ext.mysql.model.MySQLEvent;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ext.mysql.ui.config;
import org.jkiss.dbeaver.model.struct.DBSEntityType;

        });
    }
 * MySQLEventConfigurator
                return null;

 * Unless required by applicable law or agreed to in writing, software
            if (!editPage.edit()) {

            return event;


