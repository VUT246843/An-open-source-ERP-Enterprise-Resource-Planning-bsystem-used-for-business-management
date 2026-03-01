
    public EntityEditPage(DBPDataSource dataSource, DBSEntityType entityType) {
    @Override
import org.eclipse.swt.SWT;
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
 *
 *

    private String name;
        return CommonUtils.isNotEmpty(name);
 * you may not use this file except in compliance with the License.
    @Override
        Composite propsGroup = new Composite(parent, SWT.NONE);
        });
        return propsGroup;
        return null;

 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.swt.events.ModifyListener;
    @Override
    public DBSObject getObject() {
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.ui.editors.object.struct.BaseObjectEditPage;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);

 * Unless required by applicable law or agreed to in writing, software
    public DBPDataSource getDataSource() {

        // TODO Auto-generated method stub
import org.jkiss.dbeaver.model.DBPDataSource;
            public void modifyText(ModifyEvent e) {
        nameText.addModifyListener(new ModifyListener() {
import org.eclipse.swt.layout.GridData;
    }

        propsGroup.setLayoutData(gd);
import org.eclipse.swt.widgets.Control;


 * DBeaver - Universal Database Manager
                name = nameText.getText().trim();
        propsGroup.setLayout(new GridLayout(2, false));
 *
    public boolean isPageComplete() {
 * See the License for the specific language governing permissions and
}
 * limitations under the License.
        final Text nameText = UIUtils.createLabelText(propsGroup, "Name", null); // $NON-NLS-2$
package org.jkiss.dbeaver.ext.gaussdb.ui.editors.object.struct;
 */
        super("Create new " + entityType.getName());
import org.jkiss.dbeaver.model.struct.DBSEntityType;
    protected Control createPageContents(Composite parent) {
    private DBPDataSource dataSource;
import org.eclipse.swt.widgets.Text;
        return DBObjectNameCaseTransformer.transformName(dataSource, name);
    }

import org.jkiss.utils.CommonUtils;
    public String getEntityName() {
    }
import org.eclipse.swt.layout.GridLayout;
/*
            @Override
import org.jkiss.dbeaver.model.struct.DBSObject;

import org.eclipse.swt.events.ModifyEvent;
 * You may obtain a copy of the License at


 * Licensed under the Apache License, Version 2.0 (the "License");
        this.dataSource = dataSource;
                updatePageState();
import org.eclipse.swt.widgets.Composite;
    }
        return dataSource;
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
public class EntityEditPage extends BaseObjectEditPage {
