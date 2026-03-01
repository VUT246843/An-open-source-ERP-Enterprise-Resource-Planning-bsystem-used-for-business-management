}
import org.jkiss.dbeaver.ui.UITask;

/**
        }.execute();
import org.jkiss.dbeaver.ext.altibase.ui.views.CreateTypesetPage;
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
/*
                DBSProcedureType procedureType = editPage.getProcedureType();
 *
import org.jkiss.dbeaver.utils.GeneralUtils;
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
                        "END");
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
 * AltibaseProcedureConfigurator
import org.jkiss.dbeaver.ext.altibase.model.AltibaseTypeset;
 * Copyright (C) 2010-2024 DBeaver Corp and others
                        "\t" + GeneralUtils.getDefaultLineSeparator() + 
 *
 */
                String procedureName = editPage.getProcedureName();

            @Override
    }
                    return null;
                        (procedureType == DBSProcedureType.FUNCTION ? "() RETURN NUMBER" : "") + GeneralUtils.getDefaultLineSeparator() +
 * DBeaver - Universal Database Manager
                CreateTypesetPage editPage = new CreateTypesetPage(procedure);
                        "AS" + GeneralUtils.getDefaultLineSeparator() +
 * You may obtain a copy of the License at
                procedure.setObjectDefinitionText(
public class AltibaseTypesetConfigurator implements DBEObjectConfigurator<AltibaseTypeset> {
 * Unless required by applicable law or agreed to in writing, software
                        "CREATE OR REPLACE TYPESET " + procedureName +
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                procedure.setName(procedureName);
        return new UITask<AltibaseTypeset>() {
            Object container, AltibaseTypeset procedure, Map<String, Object> options) {


import java.util.Map;
 * you may not use this file except in compliance with the License.
            protected AltibaseTypeset runTask() {
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
import org.jkiss.dbeaver.model.edit.DBECommandContext;
                procedure.setProcedureType(procedureType);

package org.jkiss.dbeaver.ext.altibase.ui.config;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                if (!editPage.edit()) {

 * limitations under the License.
    public AltibaseTypeset configureObject(DBRProgressMonitor monitor, DBECommandContext commandContext,
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;

                return procedure;
                }
            }
