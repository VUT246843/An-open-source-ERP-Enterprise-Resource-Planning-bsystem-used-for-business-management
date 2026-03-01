        setTitle(NLS.bind(

import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
    private Combo keyTypeCombo;
        @NotNull DBSTableColumn object,




import org.jkiss.dbeaver.model.edit.DBECommandContext;
import org.eclipse.swt.widgets.Button;
 *     http://www.apache.org/licenses/LICENSE-2.0

    }
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    private void updateConstraintType() {
 *
            .collect(Collectors.toList());
    protected String getPropertiesGroupTitle() {
import org.jkiss.dbeaver.ui.editors.object.internal.ObjectEditorMessages;
/**
            constraintNameText.setText(constraintNameGenerator.getConstraintName());
            DBUtils.getObjectFullName(object, DBPEvaluationContext.UI)
    private void createKeysGroup(Composite composite, DBSEntityConstrainable attributeConstrainable) {
    ) {
            if (isUnique && keyTypeCombo.getSelectionIndex() < 0) {
 * Unless required by applicable law or agreed to in writing, software
        }
    public void performFinish() throws DBException {
            @Override
        }
package org.jkiss.dbeaver.ui.editors.object.struct;
            });
    @Override
            null,
    private DBSEntityConstraintInfo selectedConstraintType;
        DBEObjectMaker<?,?> objectMaker = (DBEObjectMaker<?,?>) objectManager;
            }
            selectedConstraintType.getImplClass());
        uniqueCheck.addSelectionListener(SelectionListener.widgetSelectedAdapter(selectionEvent -> {
        @Nullable DBECommandContext commandContext,
import java.util.List;
        ));
        keyTypeCombo = UIUtils.createLabelCombo(keysGroup, "Type", "Constraint type", SWT.DROP_DOWN | SWT.READ_ONLY);

        }
    private final Map<String, Object> options;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
import org.jkiss.utils.CommonUtils;
 * you may not use this file except in compliance with the License.
            selectedConstraintType = null;
        constraintNameText.addModifyListener(e -> constraintNameGenerator.setConstraintName(constraintNameText.getText()));
import org.jkiss.dbeaver.model.struct.rdb.DBSTableColumn;
import org.eclipse.swt.widgets.Text;

    protected String getEditError() {
import java.util.LinkedHashMap;
        constrOptions.put(SQLObjectEditor.OPTION_SKIP_CONFIGURATION, true);
    private final ConstraintNameGenerator constraintNameGenerator;
        if (newConstraint instanceof AbstractTableConstraint<?,?> atc) {

import org.eclipse.osgi.util.NLS;
            }
import org.jkiss.dbeaver.model.DBUtils;

            .filter(ct -> AbstractTableConstraint.class.isAssignableFrom(ct.getImplClass()) && ct.getType().isUnique())
    }
        int selectionIndex = keyTypeCombo.getSelectionIndex();

        validateProperties();
            constraintNameGenerator.setConstraintType(selectedConstraintType.getType());
import org.jkiss.dbeaver.runtime.DBWorkbench;
                    createConstrainForColumn(monitor);
        keyTypeCombo.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
        if (getObject().getParentObject() instanceof DBSEntityConstrainable ec) {
        this.options = options;
            selectedConstraintType = constraintTypes.get(selectionIndex);
                return "You must choose constraint type";
                    throw new InvocationTargetException(e);
 * DBeaver - Universal Database Manager
        Button uniqueCheck = UIUtils.createCheckbox(keysGroup, "Unique", "Mark column unique", false, 1);
        Composite keysGroup = UIUtils.createTitledComposite(composite, "Keys", 3, GridData.FILL_HORIZONTAL, SWT.DEFAULT);
public class EditAttributePage extends PropertyObjectEditPage<DBSTableColumn> {
            constraintNameText.setEnabled(isUnique);
    protected void createAdditionalEditControls(Composite composite) {
            keyTypeCombo.setEnabled(isUnique);
 * limitations under the License.
            to2.setRequired(true);
import org.jkiss.dbeaver.model.struct.DBSObject;
            commandContext,
import org.eclipse.swt.events.SelectionAdapter;
        @NotNull Map<String, Object> options
    private boolean isUnique;
        }));

                keyTypeCombo.select(0);
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintInfo;
        // Create constraint

}
        if (isUnique) {
        if (isUnique && selectedConstraintType != null) {
        DBSObject newConstraint = objectMaker.createNewObject(
    private void createConstrainForColumn(DBRProgressMonitor monitor) throws DBException {
import org.jkiss.dbeaver.ui.UIUtils;
    @Override
import java.lang.reflect.InvocationTargetException;
        }
        }
        super.performFinish();
        }
import org.eclipse.swt.widgets.Composite;

            ObjectEditorMessages.dialog_struct_attribute_edit_page_header_edit_attribute,
        constraintTypes = constraintTypes.stream()
                try {
import org.eclipse.swt.layout.GridData;
            constrOptions);
            public void widgetSelected(SelectionEvent e) {
import java.util.stream.Collectors;
        UIUtils.createEmptyLabel(keysGroup, 1, 1);
 * EditAttributePage
            if (selectedConstraintType == null) {
        if (objectManager == null) {

 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.edit.DBEObjectMaker;
        Map<String, Object> constrOptions = new LinkedHashMap<>(options);
        DBECommandContext commandContext = getCommandContext();
        }
    private List<DBSEntityConstraintInfo> constraintTypes;
        if (CommonUtils.isEmpty(constraintTypes)) {
import org.eclipse.swt.widgets.Combo;

import org.eclipse.swt.events.SelectionListener;
    }
            isUnique = uniqueCheck.getSelection();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            keyTypeCombo.add(ct.getType().getLocalizedName());
    }
        }
            }
                } catch (DBException e) {
            atc.setConstraintType(selectedConstraintType.getType());

        return ObjectEditorMessages.dialog_struct_label_text_properties;
import org.jkiss.code.Nullable;
        return super.getEditError();
        });
        this.constraintNameGenerator = new ConstraintNameGenerator(object.getParentObject());

            }
 * Copyright (C) 2010-2026 DBeaver Corp and others
import org.jkiss.dbeaver.model.impl.struct.AbstractTableConstraint;
import org.jkiss.dbeaver.model.DBPEvaluationContext;

            return;

import org.jkiss.dbeaver.DBException;
                updateConstraintType();
    }
    }
        super(commandContext, object);
        }
        GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
            options.put(SQLObjectEditor.OPTION_ADDITIONAL_ACTION, (DBRRunnableWithProgress) monitor -> {
import org.eclipse.swt.events.SelectionEvent;
            throw new DBException("Object manager not found for type '" + selectedConstraintType.getImplClass().getName() + "'");
            return;
            column.getParentObject(),
    @Override
 *
    @Override
            atc.setName(constraintNameGenerator.getConstraintName());
    }
        if (CommonUtils.isEmpty(constraintTypes)) {
        keyTypeCombo.setEnabled(false);
 */
        if (column instanceof DBSTypedObjectExt2 to2) {
        DBEObjectManager<?> objectManager = DBWorkbench.getPlatform().getEditorsRegistry().getObjectManager(
            atc.addAttributeReference(column);
        gd.widthHint = 150;
import org.jkiss.dbeaver.model.struct.DBSTypedObjectExt2;
                return error;
            monitor,
                }

 */
        keyTypeCombo.addSelectionListener(new SelectionAdapter() {
            String error = constraintNameGenerator.validateAllowedType(selectedConstraintType.getType());
import org.jkiss.dbeaver.model.struct.DBSEntityConstrainable;
 * See the License for the specific language governing permissions and
        constraintNameText = UIUtils.createLabelText(keysGroup, "Name", null, SWT.BORDER, gd);
/*
import org.jkiss.dbeaver.model.edit.DBEObjectManager;
 * Licensed under the Apache License, Version 2.0 (the "License");
            if (error != null) {
    public EditAttributePage(
    @NotNull
import java.util.Map;
        }
import org.eclipse.swt.SWT;
            createKeysGroup(composite, ec);
    }
    private Text constraintNameText;
        if (!isUnique || selectionIndex < 0) {
            updateConstraintType();
        for (DBSEntityConstraintInfo ct : constraintTypes) {
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
        DBSTableColumn column = getObject();
        } else {
        constraintTypes = attributeConstrainable.getSupportedConstraints();
