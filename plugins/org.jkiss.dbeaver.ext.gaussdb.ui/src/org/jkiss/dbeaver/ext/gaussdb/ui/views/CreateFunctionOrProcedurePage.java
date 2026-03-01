                }
    public PostgreDataType getReturnType() {
public class CreateFunctionOrProcedurePage extends BaseObjectEditPage {
 * distributed under the License is distributed on an "AS IS" BASIS,
            try {
 * Unless required by applicable law or agreed to in writing, software
    }
import org.eclipse.swt.widgets.Combo;
 * limitations under the License.

 * Licensed under the Apache License, Version 2.0 (the "License");
        return isFunction ? DBSProcedureType.FUNCTION : DBSProcedureType.PROCEDURE;
        typeCombo.setEnabled(false);
            }
import java.util.Comparator;
            for (PostgreDataType dt : dataTypes) {
        return !CommonUtils.isEmpty(name);
        }
    public CreateFunctionOrProcedurePage(DBRProgressMonitor monitor, GaussDBProcedure parent, boolean isFunction) {
            typeCombo.select(getDefaultProcedureType() == DBSProcedureType.FUNCTION ? 1 : 0);
            typeCombo = UIUtils.createLabelCombo(propsGroup, GaussDBMessages.dialog_struct_create_procedure_combo_type,
        {
import org.jkiss.dbeaver.ext.gaussdb.model.GaussDBProcedure;
        if (typeCombo != null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.parent = parent;
        // TODO Auto-generated method stub
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
            languageCombo.setText("sql");
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataType;


import java.util.List;
                language = languages.get(languageCombo.getSelectionIndex());
import org.eclipse.swt.layout.GridLayout;

            returnTypeCombo = UIUtils.createLabelCombo(group, "Return type", SWT.DROP_DOWN);
    public DBSObject getObject() {
    private String name;
                } else {
        if (getPredefinedProcedureType() == null) {
    }
        return propsGroup;
        DBSProcedureType procedureType = getPredefinedProcedureType();
            }

        if (isFunction) {
import org.jkiss.dbeaver.ui.UIUtils;

    @Override
                languageCombo.add(lang.getName());

 * You may obtain a copy of the License at
    @Override
            returnTypeCombo.addModifyListener(e -> {
        return null;
import org.eclipse.swt.SWT;
    protected static final Log log = Log.getLog(CreateFunctionOrProcedurePage.class);
import org.jkiss.dbeaver.ext.postgresql.model.PostgreLanguage;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        propsGroup.setLayout(new GridLayout(2, false));
 *

    }
        containerText.setEditable(false);
    public boolean isPageComplete() {
        nameText.addModifyListener(e -> {
    public PostgreLanguage getLanguage() {
 *
                if (!CommonUtils.isEmpty(dtName)) {
        return language;
        }
                    returnType = parent.getDatabase().getLocalDataType(dtName);
        propsGroup.setLayoutData(gd);
    protected Control createPageContents(Composite parent) {

        return returnType;
    private PostgreLanguage language;

import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
            returnTypeCombo.setText("int4");
/*
}
            final Combo languageCombo = UIUtils.createLabelCombo(group, "Language", SWT.DROP_DOWN | SWT.READ_ONLY);

            createExtraControls(propsGroup);
            dataTypes.sort(Comparator.comparing(PostgreDataType::getName));
import org.jkiss.utils.ArrayUtils;

    }
    }

            });
            });
                returnTypeCombo.add(dt.getName());
            DBUtils.getObjectFullName(this.parent.getParentObject(), DBPEvaluationContext.UI));
            languageCombo.addModifyListener(e -> {
 * you may not use this file except in compliance with the License.
        return procedureType == null ? type : procedureType;
                    returnType = null;
    }
        return DBObjectNameCaseTransformer.transformName(parent.getDataSource(), name);
    }
import org.jkiss.utils.CommonUtils;


    private final GaussDBProcedure parent;
import org.eclipse.swt.widgets.Control;
    private boolean isFunction;
            updatePageState();
import org.jkiss.dbeaver.model.struct.DBSObject;
            List<PostgreDataType> dataTypes = new ArrayList<>(parent.getDatabase().getLocalDataTypes());
            for (PostgreLanguage lang : languages) {
package org.jkiss.dbeaver.ext.gaussdb.ui.views;
                String dtName = returnTypeCombo.getText();
        final Text containerText = UIUtils.createLabelText(propsGroup, GaussDBMessages.dialog_struct_create_procedure_container,

    }

        this.monitor = monitor;
import org.jkiss.dbeaver.ext.gaussdb.ui.internal.GaussDBMessages;
import org.jkiss.dbeaver.model.DBUtils;
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
    private final DBRProgressMonitor monitor;
        {

                languages.addAll(parent.getDatabase().getLanguages(monitor));

    public String getProcedureName() {
            name = nameText.getText().trim();
    }
 */
        propsGroup.setTabList(ArrayUtils.remove(Control.class, propsGroup.getTabList(), containerText));
        Composite propsGroup = new Composite(parent, SWT.NONE);

            typeCombo.add(DBSProcedureType.FUNCTION.name());
import org.eclipse.swt.widgets.Text;
        } else {
        }
    protected void updateProcedureType(DBSProcedureType type) {
                log.error(e);
        return null;
    private DBSProcedureType type;
                SWT.DROP_DOWN | SWT.READ_ONLY);

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        Combo typeCombo;
        returnTypeCombo.setEnabled(type.hasReturnValue());
import org.eclipse.swt.widgets.Composite;
import java.util.ArrayList;
        this.isFunction = isFunction;
        });

        }
    public DBSProcedureType getDefaultProcedureType() {
    private Combo returnTypeCombo;
import org.jkiss.dbeaver.Log;
import org.eclipse.swt.layout.GridData;

        final Text nameText = UIUtils.createLabelText(propsGroup, GaussDBMessages.dialog_struct_create_procedure_label_name, null);
            }
import org.jkiss.dbeaver.ui.editors.object.struct.BaseObjectEditPage;
    private PostgreDataType returnType;
    public DBSProcedureType getProcedureType() {

            typeCombo = null;
            List<PostgreLanguage> languages = new ArrayList<>();
 *
    protected void createExtraControls(Composite group) {
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
            typeCombo.add(DBSProcedureType.PROCEDURE.name());

 * See the License for the specific language governing permissions and

            } catch (DBException e) {
        super(isFunction ? GaussDBMessages.dialog_struct_create_function_title : GaussDBMessages.dialog_struct_create_procedure_title);
 * DBeaver - Universal Database Manager
        }
    public DBSProcedureType getPredefinedProcedureType() {
    @Override
    }
