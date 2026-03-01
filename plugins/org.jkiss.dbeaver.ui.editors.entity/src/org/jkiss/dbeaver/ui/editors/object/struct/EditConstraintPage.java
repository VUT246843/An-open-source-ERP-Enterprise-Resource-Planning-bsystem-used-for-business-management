        }

    ) throws DBException {
    @Override


    public String getConstraintExpression() {
    private Collection<? extends DBSEntityAttributeRef> attributes;
 *

    private Text expressionText;
 */

            this.constraintTypes = entityConstrainable.getSupportedConstraints()
            if (selectedConstraintType == null || constraintType == selectedConstraintType) {
            useAllColumnsCheck.addSelectionListener(new SelectionAdapter() {
            atc.setConstraintType(this.getConstraintType());
    private DBSEntityReferrer constraint;
                    columnsTable.setEnabled(!useAllColumns);
    }
                typeCombo.select(typeCombo.getItemCount() - 1);
                validateProperties();
            panel,
    }

}
        @NotNull DBRProgressMonitor monitor,
    @Override

 * you may not use this file except in compliance with the License.
    public DBSEntityConstraintType getConstraintType() {
            public void widgetSelected(SelectionEvent e) {
    protected String getEditError() {


        for (DBSEntityConstraintType constraintType : constraintTypes) {

    }
        expressionText.addModifyListener(e -> {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            atc.setName(this.getConstraintName());
 * You may obtain a copy of the License at
        expressionGroup = UIUtils.createTitledComposite(
    @Override
        toggleEditAreas();
        return CommonUtils.safeList(object.getAttributes(monitor));
            this.attributes = constraint.getAttributeReferences(new VoidProgressMonitor());
        UIUtils.createControlLabel(panel, ObjectEditorMessages.dialog_struct_edit_constrain_label_type);
        if (error != null) {
        if (nameText != null) {
            nameGenerator.getConstraintName()) : null;
                .stream()
    private void toggleEditAreas() {
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
 * Unless required by applicable law or agreed to in writing, software

import org.eclipse.swt.events.SelectionAdapter;
    private boolean useAllColumns = false;
    protected List<? extends DBSEntityAttribute> getAttributes(
 *
                public void widgetSelected(SelectionEvent e) {
                toggleEditAreas();
        this.constraintTypes = constraintTypes;
        GridData gd = new GridData(GridData.FILL_BOTH);
import java.util.Collection;
            }
    private boolean isUniqueVirtualKeyEdit() {
        if (!CommonUtils.isEmpty(attributes)) {
        super(title, constraint.getParentObject());

import org.eclipse.swt.widgets.Combo;

            constraint.getParentObject(),
                    updatePageState();

        if (isUniqueVirtualKeyEdit()) {
        return this.enableConstraint;
                }
import java.util.List;
        columnsTable.setEnabled(!useAllColumns);
    }
            }
            GridData.FILL_BOTH
            updatePageState();
        return false;
        });
        }
//        if (CommonUtils.isEmpty(constraint.getName())) {
        });
            return false;

        return super.getEditError();
 * Licensed under the Apache License, Version 2.0 (the "License");
            });
        final boolean custom = selectedConstraintType.isCustom();
        } else {
        }
        if (constraint instanceof DBVEntityConstraint) {
    public EditConstraintPage(String title, DBSEntityReferrer constraint) {
        }
    private DBSEntityConstraintType selectedConstraintType;
    private final ConstraintNameGenerator nameGenerator;
import org.eclipse.swt.widgets.Composite;
        return selectedConstraintType;
            for (DBSEntityAttributeRef ref : attributes) {
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
                .toArray(DBSEntityConstraintType[]::new);
        if (selectedConstraintType == null) {
        }
            DBWorkbench.getPlatformUI().showError(ObjectEditorMessages.edit_constraints_error_title, ObjectEditorMessages.edit_constraints_error_message, e);
    }
        }
        } else {
        columnsGroup.getParent().layout();
import org.jkiss.dbeaver.runtime.DBWorkbench;
                if (ref.getAttribute() == attribute) {

        }

            enableConstraintButton.setVisible(showEnable);

 * limitations under the License.
            typeCombo.select(0);
                    enableConstraint = enableConstraintButton.getSelection();
                    return true;
            this.constraint.isPersisted() ? this.constraint.getName() : null,
import org.eclipse.swt.events.SelectionEvent;
    private Composite expressionGroup;

        gd.heightHint = expressionText.getLineHeight() * 3;
    @Override
        }
    @NotNull
        }
        return !selectedConstraintType.isCustom() && !useAllColumns;
            this.useAllColumns = ((DBVEntityConstraint) constraint).isUseAllColumns();
//            return "Constraint name cannot be empty";
        expressionGroup.setVisible(custom);
import org.jkiss.utils.CommonUtils;
        if (showEnable) {
        final Combo typeCombo = new Combo(panel, SWT.DROP_DOWN | SWT.READ_ONLY);
            return useAllColumns || super.isPageComplete();
                    validateProperties();
import org.eclipse.swt.widgets.Text;
        this.selectedConstraintType = constraint.getConstraintType();

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    }
    }
        // Constraint name may be empty (auto-generated)
//        }
 * @author Serge Rider
import org.jkiss.dbeaver.model.impl.struct.AbstractTableConstraint;
    }
                selectedConstraintType = constraintType;
 */
import org.jkiss.dbeaver.DBException;
        ((GridData) expressionGroup.getLayoutData()).exclude = !custom;
        expressionText.setLayoutData(gd);
                if (nameText != null) {
import org.eclipse.swt.layout.GridData;
            nameText.addModifyListener(e -> {
            nameText.selectAll();
    protected boolean isColumnsRequired() {
                .map(DBSEntityConstraintInfo::getType)
                }

    public String getConstraintName() {
            ObjectEditorMessages.edit_constraints_expression_text,
                selectedConstraintType = constraintTypes[typeCombo.getSelectionIndex()];
    }
        this.constraint = constraint;
    public void performFinish() {
        @NotNull DBSEntity object
            });
            });

    @Override
    }
        return constraintExpression;
                public void widgetSelected(SelectionEvent e) {
    @Override
        return constraint;
            final Button useAllColumnsCheck = UIUtils.createCheckbox(panel, ObjectEditorMessages.edit_constraints_use_all_columns_text, ObjectEditorMessages.edit_constraints_use_all_columns_tip, useAllColumns, 2);
                validateProperties();
            this.constraintTypes = new DBSEntityConstraintType[]{constraint.getConstraintType()};
                    useAllColumns = useAllColumnsCheck.getSelection();
            constraintExpression = expressionText.getText();
 * EditConstraintPage
        columnsGroup.setVisible(!custom);
            enableConstraintButton.addSelectionListener(new SelectionAdapter() {
        if (selectedConstraintType.isCustom()) {
        typeCombo.addSelectionListener(new SelectionAdapter() {
        if (object instanceof DBSEntityConstrainable entityConstrainable) {
/**

            @Override

        typeCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        this.nameGenerator = new ConstraintNameGenerator(
        }

import org.jkiss.dbeaver.model.struct.*;
        if (selectedConstraintType == null) {
        }
    }
    public boolean isUseAllColumns() {
            return !CommonUtils.isEmpty(constraintExpression);
        return pageContents;
/*

    public boolean isPageComplete() {

 *
        final Text nameText = object != null ? UIUtils.createLabelText(
    }
                nameGenerator.setConstraintType(selectedConstraintType);
    }
    protected Composite createPageContents(Composite parent) {

            typeCombo.add(constraintType.getName());
            nameText.setFocus();
    private DBSEntityConstraintType[] constraintTypes;
    protected void createContentsAfterColumns(Composite panel) {
            return error;
import org.jkiss.dbeaver.ui.UIUtils;
    @Override
        return nameGenerator.getConstraintName();
            panel,
    public boolean isEnableConstraint() {
            selectedConstraintType = constraintTypes[0];
    public boolean isColumnSelected(DBSEntityAttribute attribute) {
        final Composite pageContents = super.createPageContents(parent);
                    nameText.setText(nameGenerator.getConstraintName());
                .filter(type -> type != DBSEntityConstraintType.INDEX)
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.editors.object.internal.ObjectEditorMessages;
        ((GridData) columnsGroup.getLayoutData()).exclude = custom;
    private boolean enableConstraint = true;
    }
import org.eclipse.swt.SWT;
    @Override
 * DBeaver - Universal Database Manager
                nameGenerator.setConstraintName(nameText.getText().trim());
                @Override
            }
    protected void createContentsBeforeColumns(Composite panel) {
        );

 * distributed under the License is distributed on an "AS IS" BASIS,
        if (constraint instanceof AbstractTableConstraint<?,?> atc) {
    }
        }
    public void setConstraintTypes(DBSEntityConstraintType[] constraintTypes) {
    private String constraintExpression;
public class EditConstraintPage extends AttributesSelectorPage<DBSEntity, DBSEntityAttribute> {
        try {
        validateProperties();
            final Button enableConstraintButton = UIUtils.createCheckbox(panel, ObjectEditorMessages.edit_constraints_enable_constraint_text, ObjectEditorMessages.edit_constraints_enable_constraint_tip, true, 2);
        String error = nameGenerator.validateAllowedType(selectedConstraintType);

        this.constraint = constraint;
            constraint.getConstraintType());
            1,
import org.jkiss.dbeaver.model.virtual.DBVEntityConstraint;
import org.jkiss.code.NotNull;
        } catch (DBException e) {
package org.jkiss.dbeaver.ui.editors.object.struct;
    }
        return this.useAllColumns;
    private boolean showEnable = false;
        expressionText = new Text(expressionGroup, SWT.BORDER | SWT.MULTI);
                }
    public DBSObject getObject() {
    }
    }
import org.eclipse.swt.widgets.Button;
                }
 *
        return this.constraintTypes.length == 1 && this.constraintTypes[0] == DBSEntityConstraintType.VIRTUAL_KEY;
 * Copyright (C) 2010-2026 DBeaver Corp and others
                @Override


    }
        }
            ObjectEditorMessages.dialog_struct_edit_constrain_label_name,
