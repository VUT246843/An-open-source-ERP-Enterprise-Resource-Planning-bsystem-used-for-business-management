import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.model.DBUtils;
    private DBSSequence sequence;
    }
        return this.sequence;
        final Text nameText = UIUtils.createLabelText(propsGroup, ObjectEditorMessages.dialog_struct_create_sequence_name, null);

        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        super(ObjectEditorMessages.dialog_struct_create_sequence_title);
 * Unless required by applicable law or agreed to in writing, software
        return propsGroup;


public class CreateSequencePage extends BaseObjectEditPage {
    }
 * you may not use this file except in compliance with the License.
    }
 * limitations under the License.
        nameText.setFocus();
    }
    @Override
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.model.struct.rdb.DBSSequence;
}
 * distributed under the License is distributed on an "AS IS" BASIS,
        return DBObjectNameCaseTransformer.transformName(sequence.getDataSource(), name);
import org.eclipse.swt.widgets.Control;
import org.jkiss.dbeaver.ui.editors.object.internal.ObjectEditorMessages;
    public DBSObject getObject() {
import org.eclipse.swt.widgets.Text;
        propsGroup.setLayoutData(gd);
    public CreateSequencePage(DBSSequence sequence) {

 *
        Composite propsGroup = new Composite(parent, SWT.NONE);
 *
 * You may obtain a copy of the License at

    @Override
import org.eclipse.swt.widgets.Composite;
    private String name;
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
        nameText.addModifyListener(e -> name = nameText.getText());
    protected Control createPageContents(Composite parent) {
 * Copyright (C) 2010-2024 DBeaver Corp and others

 */
        UIUtils.createLabelText(propsGroup, ObjectEditorMessages.dialog_struct_create_sequence_container, DBUtils.getObjectFullName(sequence.getParentObject(), DBPEvaluationContext.UI)).setEditable(false);
/*
        propsGroup.setLayout(new GridLayout(2, false));
    public String getSequenceName() {
package org.jkiss.dbeaver.ui.editors.object.struct;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.layout.GridData;
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
        this.sequence = sequence;

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.SWT;

import org.eclipse.swt.layout.GridLayout;
 *
import org.jkiss.dbeaver.model.struct.DBSObject;
