            this.editor = editor;
    }

            super.run();
                parent.textMode.setChecked(true);
                return;
        private final DateTimeInlineEditor parent;
            this.editor = editor;
            }
import org.eclipse.swt.SWT;
            }
            if (parent.isCalendarMode()) {
import org.jkiss.dbeaver.model.DBIcon;
                    return;
     */
                    editor.adaptToDate(valueController.getValue());

        timeEditor.addSelectionAdapter(new SelectionAdapter() {
            this.valueController = valueController;
/*
            super.setImageDescriptor(DBeaverIcons.getImageDescriptor(DBIcon.SQL_TEXT));
            super.setText("Calendar");
                SWT.MULTI, true, inline);


                return;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        super(controller);
 * You may obtain a copy of the License at
    }
                    .showWarningMessageBox(
                } catch (DBException e) {
            editor.setToTextComposite();
 * DBeaver - Universal Database Manager
    }
        manager.add(ActionUtils.makeActionContribution(dateEditorMode, false));
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;

        CustomTimeEditor editor;
import org.jkiss.dbeaver.DBException;
    }
                } catch (DBException e) {
        });
    }

        dateEditorMode = new DateEditorMode(this, timeEditor);
    }
    protected void addInlineListeners(@NotNull Control inlineControl, @NotNull Listener listener) {
}
import org.jkiss.dbeaver.model.exec.DBCSession;
    /**
    @Override
        super.contributeActions(manager, controller);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            textMode.setChecked(true);
import org.jkiss.dbeaver.ui.controls.CustomTimeEditor;
            }
                Event selectionEvent = new Event();
 * Unless required by applicable law or agreed to in writing, software

            Event modificationEvent = new Event();
                return valueController.getValueHandler().getValueFromObject(session, valueController.getValueType(), dateValue, false, true);
import org.jkiss.dbeaver.ui.data.IValueController;
import org.eclipse.osgi.util.NLS;
                try {
                    editor.setTextValue(valueController.getValueHandler().getValueDisplayString(valueController.getValueType(), value, DBDDisplayFormat.EDIT));
    private CustomTimeEditor timeEditor;
                        ResultSetMessages.dialog_value_view_error_parsing_date_message
import org.eclipse.swt.widgets.Composite;
                        NLS.bind(ResultSetMessages.dialog_value_view_error_parsing_date_message, exception.getMessage())
    @Override
     * Action which sets edit mode to string edit
    private class DateEditorMode extends Action {
    private TextMode textMode;
    public Object extractEditorValue() throws DBCException {
                    return;
        super.addInlineListeners(inlineControl, listener);
import org.jkiss.dbeaver.model.exec.DBCException;
    }

     */
        }
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.widgets.Event;
 */
import org.jkiss.dbeaver.ui.DBeaverIcons;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;

        }
    @Override
                        ResultSetMessages.dialog_value_view_error_parsing_date_title,
                selectionEvent.widget = timeEditor.getControl();

            DBWorkbench.getPlatform().getPreferenceStore().setValue(ModelPreferences.RESULT_SET_USE_DATETIME_EDITOR, false);

        return DBWorkbench.getPlatform().getPreferenceStore().getBoolean(ModelPreferences.RESULT_SET_USE_DATETIME_EDITOR);
        @Override
import org.jkiss.code.Nullable;
                    DBWorkbench.getPlatformUI().showError(ResultSetMessages.dialog_value_view_dialog_error_updating_title, ResultSetMessages.dialog_value_view_dialog_error_updating_message, e);
    private static class TextMode extends Action {
 *
                timeEditor.getControl().notifyListeners(SWT.Selection, selectionEvent);
 *
import org.jkiss.dbeaver.ModelPreferences;
            if (parent.isDirty()) {
            try {

    public void primeEditorValue(@Nullable Object value) {
            this.parent = parent;
            timeEditor = new CustomTimeEditor(
        }
    /**
    }
    public void contributeActions(@NotNull IContributionManager manager, @NotNull IValueController controller) throws DBCException {
        }
                }
        manager.add(ActionUtils.makeActionContribution(textMode, false));
            } else {
        }
    @Override
            timeEditor.selectAllContent();
        Object value = valueController.getValue();
                    Object value = parent.extractEditorValue();
                DBWorkbench.getPlatformUI()
            @Override
            DBWorkbench.getPlatform().getPreferenceStore().setValue(ModelPreferences.RESULT_SET_USE_DATETIME_EDITOR, true);

 * See the License for the specific language governing permissions and
        if (valueController.getEditType() == IValueController.EditType.INLINE) {
        try {
                    );
        try (DBCSession session = valueController.getExecutionContext().openSession(new VoidProgressMonitor(), DBCExecutionPurpose.UTIL, "Make datetime value from editor")) {
            this.parent = parent;
import org.eclipse.jface.action.Action;
                textMode.run();
                return valueController.getValueHandler().getValueFromObject(session, valueController.getValueType(), strValue, false, true);
            }
        } catch (DBCException exception) {
        if (!isCalendarMode()) {
 * DateTimeInlineEditor
            } catch (DBCException exception) {
        public void run() {
            public void widgetSelected(SelectionEvent e) {
        @Override
        primeEditorValue(value);
    @Override
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
            }
                this.setChecked(false);

        valueController.getEditPlaceholder();
        protected final IValueController valueController;
        }
            }
import org.eclipse.swt.events.SelectionEvent;
        boolean inline = valueController.getEditType() == IValueController.EditType.INLINE ||
                    DBWorkbench.getPlatformUI().showError(ResultSetMessages.dialog_value_view_dialog_error_updating_title, ResultSetMessages.dialog_value_view_dialog_error_updating_message, e);
        timeEditor.setEditable(!valueController.isReadOnly());
                final Date dateValue = timeEditor.getValueAsDate();


        TextMode(DateTimeInlineEditor parent, CustomTimeEditor editor, IValueController valueController) {
                try {

    private DateEditorMode dateEditorMode;
        manager.update(true);
            timeEditor.setValue(value);
                editPlaceholder,

        CustomTimeEditor editor;
import org.eclipse.swt.widgets.Control;
            if (!isCalendarMode()) {
    public DateTimeInlineEditor(IValueController controller) {
            super.setText("Text");
        private final DateTimeInlineEditor parent;
import org.eclipse.swt.widgets.Listener;
                    Object value = parent.extractEditorValue();
    private boolean isCalendarMode() {
                    editor.setValue(value);
            textMode.run();
                editor.setToDateComposite();
                DBWorkbench.getPlatform().getPreferenceStore().setValue(ModelPreferences.RESULT_SET_USE_DATETIME_EDITOR, false);
        timeEditor.createDateFormat(valueController.getValueType());
        textMode = new TextMode(this, timeEditor, valueController);
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
            super("Text", Action.AS_RADIO_BUTTON);
                    );

        timeEditor.setTextValue(valueController.getValueHandler().getValueDisplayString(valueController.getValueType(), value, DBDDisplayFormat.EDIT));
            valueController.getEditType() == IValueController.EditType.PANEL;
 */
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
                if (!parent.isDirty()) {
        timeEditor.addModifyListener(e -> {
import org.jkiss.dbeaver.ui.ActionUtils;
        } else dateEditorMode.setChecked(true);
            timeEditor.getControl().notifyListeners(SWT.Modify, modificationEvent);
            if (parent.isDirty()) {
    protected Control createControl(Composite editPlaceholder) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
                final String strValue = timeEditor.getValueAsString();
/**

     * Action which selects datetime mode
            if (isCalendarMode()) {
            super("Calendar", Action.AS_RADIO_BUTTON);

            super.run();
            modificationEvent.widget = timeEditor.getControl();
        DateEditorMode(DateTimeInlineEditor parent, CustomTimeEditor editor) {
package org.jkiss.dbeaver.ui.data.editors;
                        ResultSetMessages.dialog_value_view_error_parsing_date_title,
import org.eclipse.jface.action.IContributionManager;
        return timeEditor.getControl();
        timeEditor.getControl().layout();
                }
 * limitations under the License.
                }
        public void run() {
        });
public class DateTimeInlineEditor extends BaseValueEditor<Control> {
 * Licensed under the Apache License, Version 2.0 (the "License");
                DBWorkbench.getPlatformUI()
import org.jkiss.code.NotNull;
                    .showWarningMessageBox(
            }

            super.setImageDescriptor(DBeaverIcons.getImageDescriptor(DBIcon.TYPE_DATETIME));
        }
import java.util.Date;
 *
