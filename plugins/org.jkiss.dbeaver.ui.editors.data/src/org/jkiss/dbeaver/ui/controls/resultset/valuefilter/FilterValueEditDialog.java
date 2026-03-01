
import org.eclipse.jface.dialogs.IDialogSettings;
        columnController.addColumn("Value", "Value", SWT.LEFT, true, true, new ColumnLabelProvider() {
    }
            }
import org.jkiss.dbeaver.ui.data.IValueController;
        }
import org.jkiss.dbeaver.ui.UIUtils;
        IValueEditor editor = null;
    }
            log.error("Can't create inline value editor", e);
        return parent;
        });
    @Override
 *
	private void createMultiValueSelector(Composite composite) {
        Action[] elements = new Action[] {

import org.jkiss.dbeaver.ui.data.IValueEditor;
	}
        columnController.createColumns(true);
        } catch (Exception e) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
		GridData layoutData = new GridData(GridData.FILL_BOTH);
            @Override
            try {
        return UIUtils.getDialogSettings(DIALOG_ID + "." + handler.getOperator().name());
        }

	            public void run() {
    }
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        try {
import org.jkiss.dbeaver.ui.controls.resultset.*;
import org.jkiss.dbeaver.ui.data.editors.StringInlineEditor;
        } catch (DBException e) {
}
        editorPlaceholder.setLayoutData(new GridData(GridData.FILL_BOTH));
    }
            handler.getViewer(),

import org.eclipse.swt.widgets.Label;
            @Override
                    }
    private Object value;
        super.okPressed();
                    for (TableItem item : handler.getTableViewer().getTable().getItems()) {
    public FilterValueEditDialog(ResultSetViewer viewer, DBDAttributeBinding attr, ResultSetRow[] rows, DBCLogicalOperator operator) {
        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	
	            @Override
		layoutData.heightHint = 300;
        if (handler.getOperator().getArgumentCount() == 1) {
        };
        editor.createControl();
	            }
    protected Composite createDialogArea(Composite parent)
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.dbeaver.Log;
	        new Action("Select &All") {
            editor.primeEditorValue(valueController.getValue());

		super(viewer.getControl().getShell(), "Edit value", null);
	            }
    protected IDialogSettings getDialogBoundsSettings()

	        }
    @Override
import org.jkiss.dbeaver.model.exec.DBCLogicalOperator;
        }
    {
package org.jkiss.dbeaver.ui.controls.resultset.valuefilter;
                    for (TableItem item : handler.getTableViewer().getTable().getItems()) {
 * limitations under the License.
                // Filter value is never read-only


        if (editor == null) {
                return handler.getAttribute().getValueHandler().getValueDisplayString(handler.getAttribute(), ((DBDLabelValuePair)element).getValue(), DBDDisplayFormat.UI);
        }
        final ResultSetValueController valueController = new ResultSetValueController(
import org.eclipse.swt.widgets.Composite;
        } else {
 * DBeaver - Universal Database Manager
	        new Action("Select &None") {
 *
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
        try {
            public String getText(Object element) {
 * Unless required by applicable law or agreed to in writing, software
	private static final String DIALOG_ID = "DBeaver.FilterValueEditDialog";//$NON-NLS-1$
	public Object getValue() {
            createMultiValueSelector(composite);
    }
        } else if (argumentCount < 0) {
import org.eclipse.jface.viewers.ColumnLabelProvider;

    protected void createButtonsForButtonBar(Composite parent)
 * See the License for the specific language governing permissions and
            }
                Object value = ResultSetUtils.getAttributeValueFromClipboard(handler.getAttribute());
        handler.setFilterPattern(null);
 * you may not use this file except in compliance with the License.

        if (buttonId == IDialogConstants.DETAILS_ID) {

import org.jkiss.dbeaver.ui.DBeaverIcons;
            @Override
        editorPlaceholder.setLayout(new FillLayout());
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
import org.eclipse.jface.dialogs.IDialogConstants;
	        },
        handler.addFilterText(composite);
            editor = valueController.getValueManager().createEditor(valueController);

import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    protected void okPressed()
        ResultSetRow singleRow = handler.getRows()[0];
	            public void run() {
		handler = new GenericFilterValueEdit(viewer, attr, rows, operator);
import org.jkiss.dbeaver.ui.controls.ViewerColumnController;
        Composite composite = super.createDialogArea(parent);
	            @Override
            IValueController.EditType.INLINE,

                return ((DBDLabelValuePair)element).getLabel();
            }
        Label label = UIUtils.createControlLabel(composite, handler.getAttribute().getName() + " " + handler.getOperator().getExpression());
            }
import org.jkiss.dbeaver.ui.UIIcon;
        Composite editorPlaceholder = UIUtils.createPlaceholder(composite, 1);
            log.error("Error populating filter value", e);
/*
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
                        item.setChecked(true);
import org.eclipse.jface.action.Action;

        int argumentCount = handler.getOperator().getArgumentCount();
 * You may obtain a copy of the License at
        columnController.createColumns(true);
		handler.setupTable(composite, SWT.BORDER | SWT.MULTI | SWT.CHECK | SWT.FULL_SELECTION, true, true, layoutData);
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.model.data.DBDLabelValuePair;
                handler.getEditor().primeEditorValue(value);
import org.eclipse.swt.widgets.Button;

import org.eclipse.swt.SWT;
            copyButton.setImage(DBeaverIcons.getImage(UIIcon.FILTER_CLIPBOARD));
                DBWorkbench.getPlatformUI().showError("Copy from clipboard", "Can't copy value", e);
        value = handler.getFilterValue();
                return false;
import org.jkiss.dbeaver.DBException;
            } catch (DBException e) {
    }
    private static final Log log = Log.getLog(FilterValueEditDialog.class);
            public String getText(Object element) {
    @Override
    private void createSingleValueEditor(Composite composite) {
		layoutData.widthHint = 400;
	
    }
 *

            public boolean isReadOnly() {

        label.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        handler.setEditor(editor);
        }

	@Override

            new ResultSetCellLocation(handler.getAttribute(), singleRow, null),

    {
    protected void buttonPressed(int buttonId) {
            editorPlaceholder) {

                        item.setChecked(false);
        handler.loadValues(null);

            editor = new StringInlineEditor(valueController);
            Button copyButton = createButton(parent, IDialogConstants.DETAILS_ID, "Clipboard", false);

        if (argumentCount == 1) {

import org.eclipse.swt.layout.GridData;
	@Override
        }
                    }
            super.buttonPressed(buttonId);
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.layout.FillLayout;
        };
        return value;
 */
        columnController.addColumn("Description", "Row description (composed from dictionary columns)", SWT.LEFT, true, true, new ColumnLabelProvider() {
        ViewerColumnController columnController = new ViewerColumnController(getClass().getName(), handler.getTableViewer());
            createSingleValueEditor(composite);
public class FilterValueEditDialog extends BaseDialog{
        handler.addContextMenu(elements);
        });
    {
    {
 * distributed under the License is distributed on an "AS IS" BASIS,
    private GenericFilterValueEdit handler;
