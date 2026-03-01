 *
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.swt.widgets.Control;
            updatePageState();
        propsGroup.setLayoutData(gd);
    }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 *
    public DBSProcedureType getProcedureType() {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.utils.ArrayUtils;

import org.eclipse.swt.widgets.Text;
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
package org.jkiss.dbeaver.ext.cubrid.ui.config;
public class CreateCubridProcedurePage extends CreateProcedurePage {
import org.jkiss.dbeaver.ui.editors.object.struct.CreateProcedurePage;
        return propsGroup;

        Composite propsGroup = new Composite(parent, SWT.NONE);
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
 * You may obtain a copy of the License at
        containerText.setEditable(false);

 *
    }
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
        procType.setEditable(false);

    private String name;
        this.procedure = procedure;
import org.jkiss.utils.CommonUtils;

        final Text containerText = UIUtils.createLabelText(propsGroup, CubridMessages.dialog_struct_create_procedure_container, DBUtils.getObjectFullName(this.procedure.getParentObject(), DBPEvaluationContext.UI));
        nameText.addModifyListener(e -> {
 * you may not use this file except in compliance with the License.

        final Text procType = UIUtils.createLabelText(propsGroup, CubridMessages.dialog_struct_create_procedure_combo_type, this.type.name());
/*
 * DBeaver - Universal Database Manager
    }
        return procedureType == null ? type : procedureType;
import org.eclipse.swt.widgets.Composite;
        final Text nameText = UIUtils.createLabelText(propsGroup, CubridMessages.dialog_struct_create_procedure_label_name, null);
import org.eclipse.swt.layout.GridLayout;
 * limitations under the License.
    }
        propsGroup.setLayout(new GridLayout(2, false));
        super(procedure);
            name = nameText.getText().trim();
    public boolean isPageComplete() {
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
import org.jkiss.dbeaver.ext.cubrid.ui.internal.CubridMessages;

    public Control createPageContents(Composite parent) {
        propsGroup.setTabList(ArrayUtils.remove(Control.class, propsGroup.getTabList(), containerText));
    @Override
}
 * distributed under the License is distributed on an "AS IS" BASIS,
        });
        DBSProcedureType procedureType = getPredefinedProcedureType();
    public CreateCubridProcedurePage(DBSProcedure procedure) {

    private DBSProcedure procedure;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return name;

 *     http://www.apache.org/licenses/LICENSE-2.0
        this.type = procedure.getProcedureType();
    private DBSProcedureType type;

import org.jkiss.dbeaver.model.DBUtils;
    @Override
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;
 */
    public String getProcedureName() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return !CommonUtils.isEmpty(name);
    }
