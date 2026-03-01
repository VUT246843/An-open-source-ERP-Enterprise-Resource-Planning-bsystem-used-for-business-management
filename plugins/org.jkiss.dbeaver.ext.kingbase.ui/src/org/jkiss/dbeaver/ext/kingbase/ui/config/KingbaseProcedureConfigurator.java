            protected KingbaseProcedure runTask() {
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                newProcedure.setName(editPage.getProcedureName());
                String procedure = "CREATE [OR REPLACE] PROCEDURE " + newProcedure.getFullQualifiedSignature()
}
import org.jkiss.dbeaver.ui.UITask;
            Map<String, Object> options) {

                    + " ([ parameter [IN|OUT|INOUT] datatype[,parameter [IN|OUT|INOUT] datatype] ])\r\n" + "\r\n" + "AS\r\n" + "\r\n"
                newProcedure.setObjectDefinitionText(procedure);
                    + "DECLARE\r\n" + "\r\n" + " /*declaration_section*/\r\n" + "\r\n" + "BEGIN\r\n" + "\r\n"
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    return null;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.Log;
public class KingbaseProcedureConfigurator implements DBEObjectConfigurator<KingbaseProcedure> {
    protected static final Log log = Log.getLog(KingbaseProcedureConfigurator.class);
import java.util.Map;
import org.jkiss.dbeaver.ext.kingbase.ui.views.CreateFunctionOrProcedurePage;
 * Kingbase procedure configurator
 * Copyright (C) 2010-2024 DBeaver Corp and others

/*
 *

 *
                newProcedure.setKind(PostgreProcedureKind.p);
    public static boolean isFunction = false;
            }
            KingbaseProcedure newProcedure, 
    @Override
        return new UITask<KingbaseProcedure>() {
 * limitations under the License.

    }
        }.execute();
import org.jkiss.dbeaver.ext.postgresql.model.PostgreProcedureKind;
 */
 *
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
/**
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ext.kingbase.model.KingbaseProcedure;
                    + " /*executable_section*/\r\n" + "\r\n" + "END;";
                return newProcedure;
    public KingbaseProcedure configureObject(DBRProgressMonitor monitor, 
package org.jkiss.dbeaver.ext.kingbase.ui.config;
            DBECommandContext commandContext, 
 * Unless required by applicable law or agreed to in writing, software
            @Override
                }

                CreateFunctionOrProcedurePage editPage = new CreateFunctionOrProcedurePage(monitor, newProcedure, isFunction);
import org.jkiss.dbeaver.model.edit.DBECommandContext;

 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
                if (!editPage.edit()) {
            Object container,
