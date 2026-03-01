                "CREATE OR REPLACE PACKAGE BODY " + packName + "\n" +

 *
import java.util.Map;
import org.jkiss.code.NotNull;
    public OraclePackage configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull OraclePackage oraclePackage, @NotNull Map<String, Object> options) {
    }
        return UITask.run(() -> {
 * Licensed under the Apache License, Version 2.0 (the "License");

 *     http://www.apache.org/licenses/LICENSE-2.0
 */
                    "AS\n" +
                "CREATE OR REPLACE PACKAGE " + packName + "\n" +

            oraclePackage.setObjectDefinitionText(
 * DBeaver - Universal Database Manager
/*
                return null;
            String packName = editPage.getEntityName();
                    "-- Package header\n" +
import org.jkiss.dbeaver.ui.editors.object.struct.EntityEditPage;
        });
import org.jkiss.dbeaver.model.struct.DBSEntityType;
 *

}
 *
 * OraclePackageConfigurator
/**
package org.jkiss.dbeaver.ext.oracle.ui.config;
import org.jkiss.dbeaver.ext.oracle.model.OraclePackage;
            if (!editPage.edit()) {
    @Override
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;

 * you may not use this file except in compliance with the License.
            }
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ui.UITask;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    "-- Package body\n" +
import org.jkiss.dbeaver.model.edit.DBECommandContext;
                    "AS\n" +
            return oraclePackage;
            oraclePackage.setExtendedDefinitionText(
 * limitations under the License.
            oraclePackage.setName(packName);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.code.Nullable;
                    "END " + packName + ";");
            EntityEditPage editPage = new EntityEditPage(oraclePackage.getDataSource(), DBSEntityType.PACKAGE);
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
public class OraclePackageConfigurator implements DBEObjectConfigurator<OraclePackage> {
                    "END " + packName + ";");
