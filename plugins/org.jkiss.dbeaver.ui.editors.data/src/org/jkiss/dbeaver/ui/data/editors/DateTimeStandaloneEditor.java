        timeEditor = new CustomTimeEditor(panel, style, false, false);
        return null;
/**
    private IValueController valueController;

 * Unless required by applicable law or agreed to in writing, software

 *
import org.eclipse.swt.events.SelectionAdapter;
                .showWarningMessageBox(


 *
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
import org.eclipse.swt.events.SelectionEvent;
    }
        Button button = UIUtils.createPushButton(panel, "Set Current", null);

        int style = SWT.NONE;
        timeEditor.setTextValue(valueController.getValueHandler().getValueDisplayString(valueController.getValueType(), value, DBDDisplayFormat.EDIT));
    public DateTimeStandaloneEditor(IValueController valueController) {
 * DBeaver - Universal Database Manager
    public Object extractEditorValue() throws DBException {
                return valueController.getValueHandler().getValueFromObject(session, valueController.getValueType(), dateValue, false, true);


    private CustomTimeEditor timeEditor;
import org.eclipse.swt.widgets.Composite;
    public boolean isDirty() {
            }
        return dialogGroup;

        Composite panel = UIUtils.createComposite(dialogGroup, 3);
        timeEditor.getControl().addListener(SWT.Modify, event -> dirty = true);

    }
/*
public class DateTimeStandaloneEditor extends ValueViewDialog {
        Object value = valueController.getValue();
        return dirty;
    }
                    ResultSetMessages.dialog_value_view_error_parsing_date_message
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
    @Override
        panel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
import org.eclipse.swt.widgets.Button;
        gd.grabExcessHorizontalSpace = true;
        super(valueController);
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
    private boolean dirty;
import org.jkiss.dbeaver.model.exec.DBCException;
        try {
        valueController = getValueController();
    {
 */
import org.jkiss.dbeaver.runtime.DBWorkbench;
            style |= SWT.READ_ONLY;
                );
    }
    public Control getControl()
        }
        return DBWorkbench.getPlatform().getPreferenceStore().getBoolean(ModelPreferences.RESULT_SET_USE_DATETIME_EDITOR);

    private boolean isCalendarMode() {
import org.jkiss.dbeaver.ui.data.IValueController;
            timeEditor.setValue(value);
            } else {
            }
import org.eclipse.swt.SWT;

    }
    public void primeEditorValue(@Nullable Object value) {
        } catch (DBCException e) {
        });
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        timeEditor.getControl().setLayoutData(gd);
import org.eclipse.swt.layout.GridData;
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
            @Override
import org.jkiss.dbeaver.ui.controls.CustomTimeEditor;
import org.jkiss.dbeaver.ModelPreferences;

}    public void setDirty(boolean dirty) {
import org.jkiss.dbeaver.DBException;
                primeEditorValue(new Date());
        primeEditorValue(value);
 * DateTimeStandaloneEditor
        }
 * Licensed under the Apache License, Version 2.0 (the "License");

 * You may obtain a copy of the License at
        button.addSelectionListener(new SelectionAdapter() {
    }
import org.eclipse.swt.widgets.Control;
    @Override
        timeEditor.setEditable(!valueController.isReadOnly());

        }
        if (valueController.isReadOnly()) {
 *
        try (DBCSession session = getValueController().getExecutionContext().openSession(new VoidProgressMonitor(), DBCExecutionPurpose.UTIL, "Make datetime value from editor")) {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.UIUtils;
 * limitations under the License.
        Composite dialogGroup = super.createDialogArea(parent);

import org.jkiss.dbeaver.ui.data.dialogs.ValueViewDialog;
            public void widgetSelected(SelectionEvent e) {
    protected Composite createDialogArea(Composite parent) {
                final Date dateValue = timeEditor.getValueAsDate();
        if (!DBWorkbench.getPlatform().getPreferenceStore().getBoolean(ModelPreferences.RESULT_SET_USE_DATETIME_EDITOR)){
package org.jkiss.dbeaver.ui.data.editors;
            timeEditor.setToTextComposite();
    @Override
            if (!isCalendarMode()) {

    @Override
import org.jkiss.code.Nullable;
                final String strValue = timeEditor.getValueAsString();
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);

            DBWorkbench.getPlatformUI()

import org.jkiss.dbeaver.model.exec.DBCSession;
                    ResultSetMessages.dialog_value_view_error_parsing_date_title,
 *     http://www.apache.org/licenses/LICENSE-2.0
        button.setEnabled(!valueController.isReadOnly());
        this.dirty = dirty;
        }

    @Override
        timeEditor.createDateFormat(valueController.getValueType());
import java.util.Date;
    }
                return valueController.getValueHandler().getValueFromObject(session, valueController.getValueType(), strValue, false, true);
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
    @Override
