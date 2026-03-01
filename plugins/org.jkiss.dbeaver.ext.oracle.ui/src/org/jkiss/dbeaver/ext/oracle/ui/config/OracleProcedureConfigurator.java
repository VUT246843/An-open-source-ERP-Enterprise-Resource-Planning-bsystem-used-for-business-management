
    }

                    (procedureType == DBSProcedureType.FUNCTION ? "() RETURN NUMBER" : "") + GeneralUtils.getDefaultLineSeparator() +
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
                        (procedureType == DBSProcedureType.FUNCTION ? "\tRETURN 1;" + GeneralUtils.getDefaultLineSeparator() : "") +
 * limitations under the License.
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * Unless required by applicable law or agreed to in writing, software
 * OracleProcedureConfigurator
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 */

 * DBeaver - Universal Database Manager
 */
 *

                        "IS" + GeneralUtils.getDefaultLineSeparator() +
 * you may not use this file except in compliance with the License.
/**
import org.jkiss.dbeaver.ext.oracle.model.OracleProcedureStandalone;
public class OracleProcedureConfigurator implements DBEObjectConfigurator<OracleProcedureStandalone> {
 * distributed under the License is distributed on an "AS IS" BASIS,

 * Copyright (C) 2010-2024 DBeaver Corp and others
                String procedureName = editPage.getProcedureName();
import java.util.Map;
                CreateProcedurePage editPage = new CreateProcedurePage(procedure);
                DBSProcedureType procedureType = editPage.getProcedureType();
                        "END " + procedureName + ";" + GeneralUtils.getDefaultLineSeparator());
import org.jkiss.code.NotNull;
            }
                if (!editPage.edit()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                }
                return procedure;
                        "BEGIN" + GeneralUtils.getDefaultLineSeparator() +

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
        return new UITask<OracleProcedureStandalone>() {
import org.jkiss.dbeaver.ui.UITask;
 *
import org.jkiss.code.Nullable;
                procedure.setProcedureType(procedureType);
        }.execute();
                    return null;
            @Override

 *
import org.jkiss.dbeaver.ui.editors.object.struct.CreateProcedurePage;


import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
                procedure.setObjectDefinitionText(
                procedure.setName(procedureName);
    @Override
                    "CREATE OR REPLACE " + procedureType.name() + " " + procedureName +
}
import org.jkiss.dbeaver.utils.GeneralUtils;
    public OracleProcedureStandalone configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull OracleProcedureStandalone procedure, @NotNull Map<String, Object> options) {
package org.jkiss.dbeaver.ext.oracle.ui.config;
            protected OracleProcedureStandalone runTask() {
