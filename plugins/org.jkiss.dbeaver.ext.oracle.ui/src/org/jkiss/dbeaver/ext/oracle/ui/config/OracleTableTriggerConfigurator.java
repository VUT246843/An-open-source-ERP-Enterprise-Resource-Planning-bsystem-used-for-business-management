 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.dbeaver.ui.editors.object.struct.EntityEditPage;
}
                "END;"); //$NON-NLS-1$
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
/*
 * You may obtain a copy of the License at
/**
            }
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * OracleTableTriggerConfigurator
    public OracleTableTrigger configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull OracleTableTrigger newTrigger, @NotNull Map<String, Object> options) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
import org.jkiss.dbeaver.ui.UITask;
 * distributed under the License is distributed on an "AS IS" BASIS,
        });
 */

 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
    }
import org.jkiss.code.Nullable;
import org.jkiss.code.NotNull;
            newTrigger.setObjectDefinitionText("TRIGGER " + editPage.getEntityName() + "\n" + //$NON-NLS-1$ //$NON-NLS-2$
            EntityEditPage editPage = new EntityEditPage(newTrigger.getDataSource(), DBSEntityType.TRIGGER);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.ext.oracle.model.OracleTableTrigger;
    @Override
            newTrigger.setName(editPage.getEntityName());
 *


 *     http://www.apache.org/licenses/LICENSE-2.0
            return newTrigger;
        return UITask.run(() -> {
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.model.struct.DBSEntityType;
 * you may not use this file except in compliance with the License.
 * limitations under the License.
                "BEGIN\n" + //$NON-NLS-1$
 *
public class OracleTableTriggerConfigurator implements DBEObjectConfigurator<OracleTableTrigger> {
package org.jkiss.dbeaver.ext.oracle.ui.config;
 * See the License for the specific language governing permissions and
            if (!editPage.edit()) {

 * DBeaver - Universal Database Manager
                return null;
import java.util.Map;
