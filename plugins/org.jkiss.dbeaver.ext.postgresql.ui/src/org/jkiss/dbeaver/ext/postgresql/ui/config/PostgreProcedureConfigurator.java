import org.jkiss.dbeaver.ui.editors.object.struct.CreateProcedurePage;
            {
            returnTypeCombo.setEnabled(type.hasReturnValue());
import java.util.List;
 *
        private Combo returnTypeCombo;
                dataTypes.sort(Comparator.comparing(PostgreDataType::getName));
 */
                if (!editPage.edit()) {
        public DBSProcedureType getDefaultProcedureType() {
        @Override
        }

                    log.error(e);
        private PostgreLanguage language;
                    (language == null ? "" : "\n\tLANGUAGE " + language.getName()) +
                });
import org.jkiss.dbeaver.ext.postgresql.model.PostgreProcedureKind;
                    language = languages.get(languageCombo.getSelectionIndex());

                try {
                languageCombo.setText("sql");
import org.eclipse.swt.widgets.Composite;
        private PostgreDataType returnType;
                    if (!CommonUtils.isEmpty(dtName)) {
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    newProcedure.setReturnType(editPage.getReturnType());
                    languages.addAll(parent.getDatabase().getLanguages(monitor));
/**

import org.eclipse.swt.SWT;
}
        @Override

        }
import org.jkiss.dbeaver.ui.UIUtils;
                    "\nAS $" + editPage.getProcedureType().name().toLowerCase() + "$" +
                        returnType = null;
                returnTypeCombo = UIUtils.createLabelCombo(group, "Return type", SWT.DROP_DOWN);
                );
        }

 * Postgre procedure configurator
            protected PostgreProcedure runTask() {

            return DBSProcedureType.FUNCTION;
import org.jkiss.code.NotNull;
                    newProcedure.setKind(PostgreProcedureKind.f);
import org.jkiss.dbeaver.ext.postgresql.model.PostgreLanguage;
                    } else {
        public PostgreLanguage getLanguage() {
                }
 *
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
                }
            if (parent.getDataSource().isServerVersionAtLeast(11, 0)) {
            }
                    "\n\tBEGIN\n" +
                List<PostgreLanguage> languages = new ArrayList<>();
                    newProcedure.setLanguage(language);
                }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    private static class CreateFunctionPage extends CreateProcedurePage {
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.Map;
 *     http://www.apache.org/licenses/LICENSE-2.0
            @Override
        }.execute();
                return null;
            return language;
        }
package org.jkiss.dbeaver.ext.postgresql.ui.config;
                returnTypeCombo.addModifyListener(e -> {
/*
 * DBeaver - Universal Database Manager
        @Override
                return newProcedure;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreProcedure;
            return returnType;
        @Override
import org.jkiss.code.Nullable;
        }
 * Copyright (C) 2010-2024 DBeaver Corp and others
                CreateFunctionPage editPage = new CreateFunctionPage(monitor, newProcedure);
            }
    }
        private final DBRProgressMonitor monitor;
        }
            }

                returnTypeCombo.setText("int4");
import java.util.Comparator;
                    (newProcedure.getReturnType() == null ? "" : "\n\tRETURNS " + newProcedure.getReturnType().getFullyQualifiedName(DBPEvaluationContext.DDL)) +
            {
                newProcedure.setName(editPage.getProcedureName());
import org.jkiss.dbeaver.Log;


import org.jkiss.utils.CommonUtils;
 * You may obtain a copy of the License at
                for (PostgreDataType dt : dataTypes) {
    protected static final Log log = Log.getLog(PostgreProcedureConfigurator.class);

                    languageCombo.add(lang.getName());
        public CreateFunctionPage(DBRProgressMonitor monitor, PostgreProcedure parent) {
                    }

                    return null;
                if (language != null) {
            super(parent);
import org.jkiss.dbeaver.model.edit.DBECommandContext;
    }

        protected void updateProcedureType(DBSProcedureType type) {
                for (PostgreLanguage lang : languages) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                final Combo languageCombo = UIUtils.createLabelCombo(group, "Language", SWT.DROP_DOWN | SWT.READ_ONLY);
        public PostgreDataType getReturnType() {
        return new UITask<PostgreProcedure>() {
                    returnTypeCombo.add(dt.getName());
                    String dtName = returnTypeCombo.getText();
                }
 * you may not use this file except in compliance with the License.
                    "CREATE OR REPLACE " + editPage.getProcedureType() + " " + newProcedure.getFullQualifiedSignature() +
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataType;
            this.monitor = monitor;
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;

            return DBSProcedureType.FUNCTION;
        private final PostgreProcedure parent;
                PostgreLanguage language = editPage.getLanguage();
                } else {
                } catch (DBException e) {

                }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
                }
                });
import org.eclipse.swt.widgets.Combo;

 */
                    newProcedure.setKind(PostgreProcedureKind.p);
    public PostgreProcedure configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object parent, @NotNull PostgreProcedure newProcedure, @NotNull Map<String, Object> options) {
            }
 *
                newProcedure.setObjectDefinitionText(
import java.util.ArrayList;
        public DBSProcedureType getPredefinedProcedureType() {
import org.jkiss.dbeaver.DBException;
public class PostgreProcedureConfigurator implements DBEObjectConfigurator<PostgreProcedure> {
                languageCombo.addModifyListener(e -> {
        protected void createExtraControls(Composite group) {
                List<PostgreDataType> dataTypes = new ArrayList<>(parent.getDatabase().getLocalDataTypes());
        }

            this.parent = parent;
                    "\n$" + editPage.getProcedureType().name().toLowerCase() + "$\n"
                        returnType = parent.getDatabase().getLocalDataType(dtName);

    @Override
import org.jkiss.dbeaver.ui.UITask;
                    "\n\tEND;" +
 * See the License for the specific language governing permissions and

                if (editPage.getProcedureType() == DBSProcedureType.FUNCTION) {
