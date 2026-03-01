 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ext.gaussdb.model.GaussDBFunction;
 */
                PostgreLanguage language = editPage.getLanguage();
    public static boolean isFunction = true;
                    + " ([ parameter [IN|OUT|INOUT] datatype[,parameter [IN|OUT|INOUT] datatype] ])\r\n" + " RETURNS "
                CreateFunctionOrProcedurePage editPage = new CreateFunctionOrProcedurePage(monitor, newProcedure, isFunction);
                }
                    return null;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * DBeaver - Universal Database Manager
            protected GaussDBFunction runTask() {
                if (!editPage.edit()) {
 *

 *
                newProcedure.setReturnType(editPage.getReturnType());

public class GaussDBFunctionConfigurator implements DBEObjectConfigurator<GaussDBFunction> {
 * GaussDB Function configurator
 *
                    newProcedure.setLanguage(language);
package org.jkiss.dbeaver.ext.gaussdb.ui.config;
}
        GaussDBFunction newProcedure, Map<String, Object> options) {
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    public GaussDBFunction configureObject(DBRProgressMonitor monitor, DBECommandContext commandContext, Object container,
                newProcedure.setKind(PostgreProcedureKind.f);
    }
                newProcedure.setName(editPage.getProcedureName());
        return new UITask<GaussDBFunction>() {
 * you may not use this file except in compliance with the License.
            @Override
                newProcedure.setObjectDefinitionText(function);

            }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreLanguage;
 * Copyright (C) 2010-2024 DBeaver Corp and others
                }

import org.jkiss.dbeaver.Log;
        }.execute();
    protected static final Log log = Log.getLog(GaussDBFunctionConfigurator.class);
 * limitations under the License.
                    + newProcedure.getReturnType().getDefaultValue() + "\r\n" + " LANGUAGE " + language.getName() + "\r\n" + "\r\n"
import java.util.Map;
 * distributed under the License is distributed on an "AS IS" BASIS,

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                if (language != null) {
                return newProcedure;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.dbeaver.ext.gaussdb.ui.views.CreateFunctionOrProcedurePage;
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
                String function = "CREATE [OR REPLACE] FUNCTION " + newProcedure.getFullQualifiedSignature()

    @Override
import org.jkiss.dbeaver.ui.UITask;
/**
 */
/*
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.ext.postgresql.model.PostgreProcedureKind;
                    + "AS\r\n" + "\r\n" + " '/*iso file path and name*/',$$/*function name*/$$";
 * Unless required by applicable law or agreed to in writing, software
