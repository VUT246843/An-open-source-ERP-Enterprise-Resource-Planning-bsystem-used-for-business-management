 */
        return dataSource;
    }
        });
    @Override

import org.jkiss.dbeaver.model.struct.DBSEntityType;
 *
    }
/*
        return null;
import org.eclipse.swt.SWT;
    {

package org.jkiss.dbeaver.ui.editors.object.struct;
 *
}
    public DBSObject getObject() {
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;

        return DBObjectNameCaseTransformer.transformName(dataSource, name);
    @Override

 * distributed under the License is distributed on an "AS IS" BASIS,
    private final DBPDataSource dataSource;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getEntityName()
        return CommonUtils.isNotEmpty(name);
        final Text nameText = UIUtils.createLabelText(propsGroup, ObjectEditorMessages.dialog_struct_create_entity_group_name, null); //$NON-NLS-2$
        this.dataSource = dataSource;
        return propsGroup;
public class EntityEditPage extends BaseObjectEditPage {
        propsGroup.setLayout(new GridLayout(2, false));
import org.jkiss.dbeaver.ui.editors.object.internal.ObjectEditorMessages;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
import org.eclipse.swt.widgets.Composite;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public boolean isPageComplete() {
    protected Control createPageContents(Composite parent) {
 * Unless required by applicable law or agreed to in writing, software
        super(ObjectEditorMessages.dialog_struct_create_entity_title + " " + entityType.getName());
import org.jkiss.dbeaver.model.DBPDataSource;
 * DBeaver - Universal Database Manager

import org.eclipse.swt.layout.GridData;
    private String name;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.swt.widgets.Text;

    @Override
            name = nameText.getText().trim();
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        nameText.addModifyListener(e -> {
    public EntityEditPage(DBPDataSource dataSource, DBSEntityType entityType)
 * See the License for the specific language governing permissions and
    {

            updatePageState();
import org.eclipse.swt.widgets.Control;
    }
        Composite propsGroup = new Composite(parent, SWT.NONE);
 *
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.utils.CommonUtils;

    }
 * you may not use this file except in compliance with the License.
import org.eclipse.swt.layout.GridLayout;
    }


        propsGroup.setLayoutData(gd);
    public DBPDataSource getDataSource() {
 * limitations under the License.
