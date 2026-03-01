            return dataType;
            EntityEditPage editPage = new EntityEditPage(dataType.getDataSource(), DBSEntityType.TYPE);
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ext.oracle.ui.config;
import org.jkiss.dbeaver.ext.oracle.model.OracleDataType;
        return UITask.run(() -> {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    @Override
 * See the License for the specific language governing permissions and
 */
 *
import org.jkiss.code.NotNull;

            dataType.setObjectDefinitionText("TYPE " + dataType.getName() + " AS OBJECT\n" + //$NON-NLS-1$ //$NON-NLS-2$
 */

 * Copyright (C) 2010-2024 DBeaver Corp and others
/**
public class OracleDataTypeConfigurator implements DBEObjectConfigurator<OracleDataType> {
 * You may obtain a copy of the License at

            dataType.setName(editPage.getEntityName());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.Map;
import org.jkiss.code.Nullable;
            }
 * Unless required by applicable law or agreed to in writing, software
                "(\n" + //$NON-NLS-1$
 * DBeaver - Universal Database Manager
 * OracleDataTypeConfigurator
}

            if (!editPage.edit()) {
 *
                ")"); //$NON-NLS-1$
        });
import org.jkiss.dbeaver.ui.editors.object.struct.EntityEditPage;
    }
import org.jkiss.dbeaver.ui.UITask;
                return null;

import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.struct.DBSEntityType;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public OracleDataType configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object parent, @NotNull OracleDataType dataType, @NotNull Map<String, Object> options) {
 * limitations under the License.
/*
