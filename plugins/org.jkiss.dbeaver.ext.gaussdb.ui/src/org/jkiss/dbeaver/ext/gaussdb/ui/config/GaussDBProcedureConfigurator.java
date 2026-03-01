                }
                    + " ([ parameter [IN|OUT|INOUT] datatype[,parameter [IN|OUT|INOUT] datatype] ])\r\n" + "\r\n" + "AS\r\n" + "\r\n"
                newProcedure.setObjectDefinitionText(procedure);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
        return new UITask<GaussDBProcedure>() {

 * DBeaver - Universal Database Manager
/**
 *
    }
public class GaussDBProcedureConfigurator implements DBEObjectConfigurator<GaussDBProcedure> {
    protected static final Log log = Log.getLog(GaussDBProcedureConfigurator.class);
 *
                return newProcedure;
            @Override
 * Licensed under the Apache License, Version 2.0 (the "License");

                    + " /*executable_section*/\r\n" + "\r\n" + "END;";
 * You may obtain a copy of the License at

                CreateFunctionOrProcedurePage editPage = new CreateFunctionOrProcedurePage(monitor, newProcedure, isFunction);

 * limitations under the License.
 *
 * GaussDB procedure configurator
import org.jkiss.dbeaver.ext.postgresql.model.PostgreProcedureKind;
    public GaussDBProcedure configureObject(DBRProgressMonitor monitor, DBECommandContext commandContext, Object container,

 */
            protected GaussDBProcedure runTask() {
package org.jkiss.dbeaver.ext.gaussdb.ui.config;
}
import org.jkiss.dbeaver.ext.gaussdb.ui.views.CreateFunctionOrProcedurePage;
        }.execute();
import java.util.Map;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ui.UITask;
                    + "DECLARE\r\n" + "\r\n" + " /*declaration_section*/\r\n" + "\r\n" + "BEGIN\r\n" + "\r\n"
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
                    return null;
 *     http://www.apache.org/licenses/LICENSE-2.0
                newProcedure.setName(editPage.getProcedureName());
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
        GaussDBProcedure newProcedure, Map<String, Object> options) {
/*
                if (!editPage.edit()) {
import org.jkiss.dbeaver.Log;
                newProcedure.setKind(PostgreProcedureKind.p);

    public static boolean isFunction = false;
 */
 * Unless required by applicable law or agreed to in writing, software
                String procedure = "CREATE [OR REPLACE] PROCEDURE " + newProcedure.getFullQualifiedSignature()
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ext.gaussdb.model.GaussDBProcedure;
            }

 * you may not use this file except in compliance with the License.
