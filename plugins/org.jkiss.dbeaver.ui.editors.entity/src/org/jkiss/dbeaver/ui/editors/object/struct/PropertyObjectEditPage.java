 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.widgets.Composite;
            if (object instanceof DBPNamedObject2 && object.getDataSource() != null) {
        return propertySource.getCommandContext();
            propertyEditor.createPropertyEditor(composite, prop);

        //propertyViewer.saveEditorValues();
//            .createControlLabel(composite, ObjectEditorMessages.dialog_struct_label_text_properties)

import org.eclipse.swt.layout.GridData;
import org.jkiss.code.Nullable;
import org.jkiss.utils.CommonUtils;
    private final OBJECT object;
//        UIUtils
package org.jkiss.dbeaver.ui.editors.object.struct;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ui.controls.CustomFormEditor;
import org.eclipse.swt.layout.GridLayout;
                if (!obj.isEditPossible(object) || obj.isNameProperty()) {
//        propertyViewer.loadProperties(propertySource);
//        propertyViewer.getControl().setLayoutData(GridDataFactory.fillDefaults().hint(400, SWT.DEFAULT).create());
    @NotNull

        }
    @Override
    public void performFinish() throws DBException {
        if (CommonUtils.isEmpty(groupTitle)) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }

                final String transformed = DBObjectNameCaseTransformer.transformName(object.getDataSource(), objectName);
    protected String getPropertiesGroupTitle() {
 * you may not use this file except in compliance with the License.
            if (prop instanceof ObjectPropertyDescriptor) {
    @Nullable
import org.jkiss.dbeaver.runtime.properties.ObjectPropertyDescriptor;
    }
        final Composite composite;
    }
 *

import org.jkiss.dbeaver.ui.ConComposite;
        propertyEditor = new CustomFormEditor(getObject(), getCommandContext(), propertySource);
        return super.getEditError();
            composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));


/*
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.swt.widgets.Text;
    }
    @Override
import org.jkiss.dbeaver.model.DBPNamedObject2;
            return "Object name cannot be empty";
import org.jkiss.code.NotNull;
        this.propertySource.collectProperties();
    }
        if (CommonUtils.isEmpty(object.getName())) {
    }
    public PropertyObjectEditPage(@Nullable DBECommandContext commandContext, @NotNull OBJECT object) {
            composite.setLayout(new GridLayout(2, false));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private CustomFormEditor propertyEditor;
        }
    protected String getEditError() {
//            .setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
    public DBECommandContext getCommandContext() {

        final Text nameText = UIUtils.createLabelText(composite, ObjectEditorMessages.dialog_struct_label_text_name, object.getName());
                validateProperties();
                ((DBPNamedObject2) object).setName(transformed);
        createDefaultEditControls(composite);
        return object;
        createAdditionalEditControls(parent);
        super("Edit " + object.getName());

        nameText.addModifyListener(e -> {

import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
        for (DBPPropertyDescriptor prop : propertySource.getProperties()) {
 *
import org.jkiss.dbeaver.runtime.properties.PropertySourceEditable;

    protected void createAdditionalEditControls(Composite composite) {
    public OBJECT getObject() {
//        propertyViewer = new PropertyTreeViewer(composite, SWT.BORDER);
        });
        // Save any active editors
 */
                }
import org.jkiss.dbeaver.DBException;
                String objectName = nameText.getText().trim();
 * DBeaver - Universal Database Manager
    //private PropertyTreeViewer propertyViewer;
        String groupTitle = getPropertiesGroupTitle();
import org.jkiss.dbeaver.ui.UIUtils;
        }
import org.jkiss.dbeaver.model.edit.DBECommandContext;

 * limitations under the License.
import org.eclipse.swt.SWT;

        for (DBPPropertyDescriptor prop : propertySource.getProperties()) {
        return null;
            composite = UIUtils.createTitledComposite(parent, groupTitle, 2, GridData.FILL_HORIZONTAL);
            }
        }

                final ObjectPropertyDescriptor obj = (ObjectPropertyDescriptor) prop;

    protected Control createPageContents(Composite parent) {
            composite = new ConComposite(parent, SWT.NONE);
 * You may obtain a copy of the License at
        return composite;
 * See the License for the specific language governing permissions and

            }
        } else {
    }

                    propertySource.removeProperty(prop);
    }
//        propertyViewer.addPropertyChangeListener(event -> validateProperties());

 *
}
    private void createDefaultEditControls(Composite composite) {

public class PropertyObjectEditPage<OBJECT extends DBSObject> extends BaseObjectEditPage {

    private final PropertySourceEditable propertySource;
        this.object = object;
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
import org.eclipse.swt.widgets.Control;
import org.jkiss.dbeaver.ui.editors.object.internal.ObjectEditorMessages;
        this.propertySource = new PropertySourceEditable(commandContext, object, object);
        nameText.selectAll();
    }
import org.jkiss.dbeaver.model.struct.DBSObject;
 * Licensed under the Apache License, Version 2.0 (the "License");
