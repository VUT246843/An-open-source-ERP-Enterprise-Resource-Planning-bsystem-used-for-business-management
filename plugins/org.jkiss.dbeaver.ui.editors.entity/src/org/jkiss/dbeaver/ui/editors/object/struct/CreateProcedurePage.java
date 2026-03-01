        return procedure;
            typeCombo.add(DBSProcedureType.FUNCTION.name());
            typeCombo.addModifyListener(e -> {
 * Copyright (C) 2010-2024 DBeaver Corp and others

 *
        DBSProcedureType procedureType = getPredefinedProcedureType();
import org.jkiss.dbeaver.ui.editors.object.internal.ObjectEditorMessages;
    }
    }
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;


import org.jkiss.utils.ArrayUtils;
    }
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
        createExtraControls(propsGroup);
    public CreateProcedurePage(DBSProcedure procedure) {

}
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        Composite propsGroup = new Composite(parent, SWT.NONE);
import org.eclipse.swt.widgets.Composite;
            typeCombo = null;

 * you may not use this file except in compliance with the License.
        return null;
        return procedureType == null ? type : procedureType;
    }
 * Unless required by applicable law or agreed to in writing, software

        }
 *


        propsGroup.setTabList(ArrayUtils.remove(Control.class, propsGroup.getTabList(), containerText));
package org.jkiss.dbeaver.ui.editors.object.struct;

            typeCombo.select(getDefaultProcedureType() == DBSProcedureType.FUNCTION ? 1 : 0);
import org.eclipse.swt.widgets.Control;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public DBSObject getObject() {
        } else {

        nameText.addModifyListener(e -> {
 *
            });
                type = typeCombo.getSelectionIndex() == 0 ? DBSProcedureType.PROCEDURE : DBSProcedureType.FUNCTION;
    protected Control createPageContents(Composite parent) {
    }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        this.procedure = procedure;

        containerText.setEditable(false);
import org.eclipse.swt.layout.GridData;
import org.jkiss.utils.CommonUtils;
                updateProcedureType(type);

            typeCombo.add(DBSProcedureType.PROCEDURE.name());
import org.jkiss.dbeaver.model.DBUtils;

    protected void updateProcedureType(DBSProcedureType type) {
import org.eclipse.swt.widgets.Combo;
        Combo typeCombo;
    @Override
        }
 * You may obtain a copy of the License at
    }
    private DBSProcedureType type;
        propsGroup.setLayout(new GridLayout(2, false));
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
/*
import org.eclipse.swt.layout.GridLayout;
    }
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.ui.UIUtils;

    }
public class CreateProcedurePage extends BaseObjectEditPage {
        return !CommonUtils.isEmpty(name);
 * DBeaver - Universal Database Manager
    }
    public DBSProcedureType getDefaultProcedureType() {
    @Override
        return DBObjectNameCaseTransformer.transformName(procedure.getDataSource(), name);

        final Text nameText = UIUtils.createLabelText(propsGroup, ObjectEditorMessages.dialog_struct_create_procedure_label_name, null);
 */
 * limitations under the License.
        propsGroup.setLayoutData(gd);
        return propsGroup;
    }
    protected void createExtraControls(Composite group) {
            name = nameText.getText().trim();
        });
        super(ObjectEditorMessages.dialog_struct_create_procedure_title);
        return DBSProcedureType.PROCEDURE;
    public boolean isPageComplete() {
            updatePageState();
        if (getPredefinedProcedureType() == null) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public DBSProcedureType getProcedureType() {
 * distributed under the License is distributed on an "AS IS" BASIS,
    private String name;
        if (typeCombo != null) {

    private DBSProcedure procedure;

import org.eclipse.swt.SWT;
            typeCombo = UIUtils.createLabelCombo(propsGroup, ObjectEditorMessages.dialog_struct_create_procedure_combo_type, SWT.DROP_DOWN | SWT.READ_ONLY);
        final Text containerText = UIUtils.createLabelText(propsGroup, ObjectEditorMessages.dialog_struct_create_procedure_container, DBUtils.getObjectFullName(this.procedure.getParentObject(), DBPEvaluationContext.UI));
    public String getProcedureName() {
 * See the License for the specific language governing permissions and
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.widgets.Text;


    public DBSProcedureType getPredefinedProcedureType() {
