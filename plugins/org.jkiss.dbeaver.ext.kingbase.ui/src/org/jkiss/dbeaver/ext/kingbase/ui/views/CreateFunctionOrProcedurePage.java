 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.Log;

import org.jkiss.dbeaver.ui.editors.object.struct.BaseObjectEditPage;
        }
    private final DBRProgressMonitor monitor;
/*

import org.eclipse.swt.widgets.Combo;
 *
            typeCombo.select(getDefaultProcedureType() == DBSProcedureType.FUNCTION ? 1 : 0);
        this.isFunction = isFunction;
            try {
    protected void updateProcedureType(DBSProcedureType type) {
        }
            List<PostgreLanguage> languages = new ArrayList<>();

    }
import org.jkiss.dbeaver.ui.UIUtils;
        containerText.setEditable(false);
            returnTypeCombo.addModifyListener(e -> {
        return returnType;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public CreateFunctionOrProcedurePage(DBRProgressMonitor monitor, KingbaseProcedure parent, boolean isFunction) {
    private Combo returnTypeCombo;
        final Text nameText = UIUtils.createLabelText(propsGroup, KingbaseMessages.dialog_struct_create_procedure_label_name, null);

            typeCombo = null;
    }
            createExtraControls(propsGroup);
 * You may obtain a copy of the License at
import org.jkiss.utils.ArrayUtils;
                languageCombo.add(lang.getName());
        });
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;

import org.jkiss.dbeaver.DBException;
        return language;
        }
import org.jkiss.dbeaver.ext.kingbase.ui.internal.KingbaseMessages;
        nameText.addModifyListener(e -> {

 * See the License for the specific language governing permissions and
            }
    }

import org.eclipse.swt.widgets.Control;
            name = nameText.getText().trim();
     * Get Procedure Type
            for (PostgreDataType dt : dataTypes) {
                String dtName = returnTypeCombo.getText();

            languageCombo.addModifyListener(e -> {
import org.jkiss.utils.CommonUtils;
    public DBSObject getObject() {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        return propsGroup;
                log.error(e);
        {
import org.jkiss.dbeaver.ext.kingbase.model.KingbaseProcedure;
import org.eclipse.swt.widgets.Composite;
    private PostgreDataType returnType;
public class CreateFunctionOrProcedurePage extends BaseObjectEditPage {

    }
    }
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        } else {

            }
}
        return procedureType == null ? type : procedureType;
import java.util.Comparator;
        if (isFunction) {
import org.jkiss.dbeaver.model.DBUtils;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        this.parent = parent;
        Combo typeCombo;
            returnTypeCombo = UIUtils.createLabelCombo(group, "Return type", SWT.DROP_DOWN);
    public DBSProcedureType getProcedureType() {
        this.monitor = monitor;
    private final KingbaseProcedure parent;
     */
            dataTypes.sort(Comparator.comparing(PostgreDataType::getName));
    public DBSProcedureType getDefaultProcedureType() {

    }
            });
    @Override
    public String getProcedureName() {
        return !CommonUtils.isEmpty(name);
        propsGroup.setLayoutData(gd);
    }
            typeCombo.add(DBSProcedureType.FUNCTION.name());
 *

                } else {
    @Override
 * Unless required by applicable law or agreed to in writing, software
                language = languages.get(languageCombo.getSelectionIndex());
    private DBSProcedureType type;
            List<PostgreDataType> dataTypes = new ArrayList<>(parent.getDatabase().getLocalDataTypes());

import java.util.ArrayList;
    private String name;
        Composite propsGroup = new Composite(parent, SWT.NONE);
            typeCombo.add(DBSProcedureType.PROCEDURE.name());
    public PostgreDataType getReturnType() {
        propsGroup.setTabList(ArrayUtils.remove(Control.class, propsGroup.getTabList(), containerText));
     * @return the database procedure type object
     *
    }
        super(isFunction ? KingbaseMessages.dialog_struct_create_function_title : KingbaseMessages.dialog_struct_create_procedure_title);
            updatePageState();
        if (getPredefinedProcedureType() == null) {
    /**
    private PostgreLanguage language;
            typeCombo = UIUtils.createLabelCombo(propsGroup, KingbaseMessages.dialog_struct_create_procedure_combo_type,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            final Combo languageCombo = UIUtils.createLabelCombo(group, "Language", SWT.DROP_DOWN | SWT.READ_ONLY);
        return DBObjectNameCaseTransformer.transformName(parent.getDataSource(), name);
    protected Control createPageContents(Composite parent) {
                    returnType = parent.getDatabase().getLocalDataType(dtName);
import org.jkiss.dbeaver.model.struct.DBSObject;
        final Text containerText = UIUtils.createLabelText(propsGroup, KingbaseMessages.dialog_struct_create_procedure_container,
import org.eclipse.swt.layout.GridLayout;
        {
        return null;

 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
    }

    }
        propsGroup.setLayout(new GridLayout(2, false));
 * you may not use this file except in compliance with the License.


 */

                if (!CommonUtils.isEmpty(dtName)) {
    protected static final Log log = Log.getLog(CreateFunctionOrProcedurePage.class);
    protected void createExtraControls(Composite group) {

        DBSProcedureType procedureType = getPredefinedProcedureType();

            }
                SWT.DROP_DOWN | SWT.READ_ONLY);
    private boolean isFunction;
import org.eclipse.swt.widgets.Text;
            DBUtils.getObjectFullName(this.parent.getParentObject(), DBPEvaluationContext.UI));
package org.jkiss.dbeaver.ext.kingbase.ui.views;


                    returnType = null;
        typeCombo.setEnabled(false);
            returnTypeCombo.setText("int4");
                returnTypeCombo.add(dt.getName());
 * DBeaver - Universal Database Manager
import java.util.List;
    }
            for (PostgreLanguage lang : languages) {
        }
    @Override
        return isFunction ? DBSProcedureType.FUNCTION : DBSProcedureType.PROCEDURE;

            });
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataType;
                }
    }
 *
import org.jkiss.dbeaver.ext.postgresql.model.PostgreLanguage;
        returnTypeCombo.setEnabled(type.hasReturnValue());
                languages.addAll(parent.getDatabase().getLanguages(monitor));
            } catch (DBException e) {
import org.eclipse.swt.layout.GridData;
        }
    public PostgreLanguage getLanguage() {
    public boolean isPageComplete() {

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.eclipse.swt.SWT;
        return null;

import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;

        if (typeCombo != null) {
            languageCombo.setText("sql");

    public DBSProcedureType getPredefinedProcedureType() {
