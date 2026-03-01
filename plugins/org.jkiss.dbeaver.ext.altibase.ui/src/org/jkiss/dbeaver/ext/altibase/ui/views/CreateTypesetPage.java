import org.jkiss.utils.CommonUtils;

        return DBObjectNameCaseTransformer.transformName(procedure.getDataSource(), name);
    }
import org.eclipse.swt.widgets.Control;


public class CreateTypesetPage extends BaseObjectEditPage {
    }
package org.jkiss.dbeaver.ext.altibase.ui.views;
    public DBSProcedureType getPredefinedProcedureType() {
    protected Control createPageContents(Composite parent) {
    public boolean isPageComplete() {
        return procedure;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    private DBSProcedure procedure;
import org.jkiss.dbeaver.ext.altibase.ui.internal.AltibaseUIMessages;
                AltibaseUIMessages.edit_altibase_typeset_manager_container, 

import org.jkiss.dbeaver.ui.UIUtils;
    public DBSProcedureType getDefaultProcedureType() {
 */
        });
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


import org.eclipse.swt.layout.GridLayout;
        propsGroup.setLayoutData(gd);
        final Text containerText = UIUtils.createLabelText(propsGroup, 
 *
    }
        propsGroup.setTabList(ArrayUtils.remove(Control.class, propsGroup.getTabList(), containerText));

        containerText.setEditable(false);
    }
 * You may obtain a copy of the License at
    public String getProcedureName() {
        Composite propsGroup = new Composite(parent, SWT.NONE);
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.utils.ArrayUtils;
 * Unless required by applicable law or agreed to in writing, software
                DBUtils.getObjectFullName(this.procedure.getParentObject(), DBPEvaluationContext.UI));
 * limitations under the License.
}
    public DBSProcedureType getProcedureType() {
        propsGroup.setLayout(new GridLayout(2, false));
            name = nameText.getText().trim();
import org.eclipse.swt.widgets.Composite;
                AltibaseUIMessages.edit_altibase_typeset_manager_name, null);
    @Override

        return propsGroup;

import org.jkiss.dbeaver.model.DBUtils;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ext.altibase.model.AltibaseTypeset;
    @Override
        final Text nameText = UIUtils.createLabelText(propsGroup, 
import org.eclipse.swt.SWT;
 * DBeaver - Universal Database Manager
        return DBSProcedureType.UNKNOWN;
        return getDefaultProcedureType();
import org.eclipse.swt.widgets.Text;

    }
    }
    @Override
        super(AltibaseUIMessages.edit_altibase_typeset_manager_dialog_title);
 *     http://www.apache.org/licenses/LICENSE-2.0
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
        nameText.addModifyListener(e -> {
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
            updatePageState();
import org.jkiss.dbeaver.ui.editors.object.struct.BaseObjectEditPage;


import org.jkiss.dbeaver.model.struct.DBSObject;
        this.procedure = procedure;
        return getDefaultProcedureType();
 *
    public DBSObject getObject() {
    private String name;
 * you may not use this file except in compliance with the License.
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;

        return !CommonUtils.isEmpty(name);
    public CreateTypesetPage(AltibaseTypeset procedure) {

import org.eclipse.swt.layout.GridData;
    }
 *
    }
