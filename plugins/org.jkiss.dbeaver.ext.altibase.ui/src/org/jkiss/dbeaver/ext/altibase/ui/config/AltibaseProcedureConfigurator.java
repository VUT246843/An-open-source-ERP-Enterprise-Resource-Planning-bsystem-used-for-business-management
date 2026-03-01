 */
                DBSProcedureType procedureType = editPage.getProcedureType();
                        (procedureType == DBSProcedureType.FUNCTION ? "\tRETURN 1;" : "") +


                String procedureName = editPage.getProcedureName();

 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
import java.util.Map;
                        "END");
}
 * See the License for the specific language governing permissions and

            Object container, AltibaseProcedureStandAlone procedure, Map<String, Object> options) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class AltibaseProcedureConfigurator implements DBEObjectConfigurator<AltibaseProcedureStandAlone> {
 *
 * You may obtain a copy of the License at
                        "BEGIN" + GeneralUtils.getDefaultLineSeparator() +
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ext.altibase.ui.config;
    public AltibaseProcedureStandAlone configureObject(DBRProgressMonitor monitor, DBECommandContext commandContext,
 *
 * AltibaseProcedureConfigurator
                        GeneralUtils.getDefaultLineSeparator() + 
                }
                procedure.setName(procedureName);
                        "CREATE OR REPLACE " + procedureType.name() + " " + procedureName +
import org.jkiss.dbeaver.model.edit.DBECommandContext;
                procedure.setProcedureType(procedureType);
import org.jkiss.dbeaver.ui.editors.object.struct.CreateProcedurePage;
                procedure.setObjectDefinitionText(
                    return null;
    }
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.jkiss.dbeaver.ext.altibase.model.AltibaseProcedureStandAlone;
/**
import org.jkiss.dbeaver.utils.GeneralUtils;
            @Override
                return procedure;
 * you may not use this file except in compliance with the License.
        }.execute();

 *
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ui.UITask;
            protected AltibaseProcedureStandAlone runTask() {
                if (!editPage.edit()) {
                        "IS" + GeneralUtils.getDefaultLineSeparator() +
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
                CreateProcedurePage editPage = new CreateProcedurePage(procedure);
    @Override
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;

            }
 * limitations under the License.
                        (procedureType == DBSProcedureType.FUNCTION ? "() RETURN NUMBER" : "") + GeneralUtils.getDefaultLineSeparator() +
        return new UITask<AltibaseProcedureStandAlone>() {
