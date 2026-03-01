 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.editors.object.struct.BaseObjectEditPage;
import org.eclipse.swt.widgets.Text;
    private DBPDataSource dataSource;
        this.dataSource = dataSource;
 * Unless required by applicable law or agreed to in writing, software
    }

        nameText.addModifyListener(new ModifyListener() {
}
import org.jkiss.dbeaver.model.struct.DBSObject;
 */
 *
        // TODO Auto-generated method stub
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.UIUtils;
    }

        super("Create new " + entityType.getName());
            @Override
    private String name;
    }
        return CommonUtils.isNotEmpty(name);
            public void modifyText(ModifyEvent e) {
    }
import org.jkiss.dbeaver.model.struct.DBSEntityType;
        return dataSource;
/*

 * Licensed under the Apache License, Version 2.0 (the "License");
        propsGroup.setLayoutData(gd);
        });
    public boolean isPageComplete() {

    public DBPDataSource getDataSource() {
import org.eclipse.swt.events.ModifyListener;
        propsGroup.setLayout(new GridLayout(2, false));
 * you may not use this file except in compliance with the License.
import org.eclipse.swt.layout.GridLayout;
        return null;
    }
    }
import org.eclipse.swt.events.ModifyEvent;
 * You may obtain a copy of the License at

    public DBSObject getObject() {
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);

        return DBObjectNameCaseTransformer.transformName(dataSource, name);
    @Override
 * limitations under the License.
 *
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
    public EntityEditPage(DBPDataSource dataSource, DBSEntityType entityType) {

        return propsGroup;
    protected Control createPageContents(Composite parent) {
 * Copyright (C) 2010-2024 DBeaver Corp and others


import org.eclipse.swt.layout.GridData;
            }
package org.jkiss.dbeaver.ext.kingbase.ui.editors.object.struct;
import org.eclipse.swt.SWT;
        final Text nameText = UIUtils.createLabelText(propsGroup, "Name", null); // $NON-NLS-2$

    public String getEntityName() {
import org.eclipse.swt.widgets.Control;
        Composite propsGroup = new Composite(parent, SWT.NONE);
import org.jkiss.utils.CommonUtils;
    @Override
 *
    @Override
                name = nameText.getText().trim();
import org.eclipse.swt.widgets.Composite;
public class EntityEditPage extends BaseObjectEditPage {

                updatePageState();
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.DBPDataSource;

 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
