
    @Nullable
            this.value = value;
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
                Object newValue = openDialogBox(cell);
        public CustomTimeEditorDialog(
    @Override
import java.time.ZoneId;
 * limitations under the License.
    protected void doSetFocus() {

        }


            : LocalDateTime.now().plusDays(30);
                    fireApplyEditorValue();
        });
 *
import org.jkiss.dbeaver.model.exec.DBCException;
    @Nullable
        var initialValue = currentValue != null
            GridData layoutData = new GridData(SWT.FILL, SWT.CENTER, true, false);

            }
            );

        });
        }
            }
    @Override
        super(parent);
                        setErrorMessage(MessageFormat.format(getErrorMessage(), newValue.toString()));
        textEditor.selectAll();
    @Override
        ) {
    protected Button createButton(@NotNull Composite parent) {
                    }
        try {
            if (e.detail == SWT.TRAVERSE_RETURN) {
    }
    }
import org.jkiss.dbeaver.ui.UIIcon;
    }
        Object currentValue = doGetValue();

import org.eclipse.swt.events.MouseListener;
        return truncateToSeconds((LocalDateTime) super.doGetValue());
import org.jkiss.dbeaver.Log;
import org.eclipse.swt.events.SelectionEvent;
    protected Object openDialogBox(Control cellEditorWindow) {
                "Failed to parse timestamp",
        ));
                Status.warning("Invalid timestamp format", ex)
 * DBeaver - Universal Database Manager
            // Default to 30 days from now
    protected Control createContents(@NotNull Composite cell) {
import org.eclipse.jface.viewers.DialogCellEditor;
        return result;

package org.jkiss.dbeaver.ui.controls;
import java.sql.JDBCType;
            ? (LocalDateTime) currentValue
                    } else {
import org.eclipse.jface.dialogs.ErrorDialog;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
                        doSetValue(newValue);
        textEditor.removeFocusListener(textFocusListener);
            applyEditorValueFromText(textEditor.getText(), new Shell(cell.getShell()));
            try {

    @Override
        textFocusListener = FocusListener.focusLostAdapter(e -> {
import java.text.MessageFormat;
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
                        .map(v -> v.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime())
            return value;

        textEditor.clearSelection();
        };
            customTimeEditor.setEditable(true);

        textEditor.setBackground(cell.getBackground());
import org.eclipse.core.runtime.Status;
        textEditor.addFocusListener(textFocusListener);


        textEditor = new Text(cell, SWT.LEFT);
            setValue(null);


        }
    }
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        }
import java.util.Optional;
                shell,
        } catch (Exception ex) {
        public LocalDateTime result() {


 */
import org.eclipse.swt.layout.GridData;



            CustomTimeEditor customTimeEditor = new CustomTimeEditor(parent, SWT.NONE, false, false);
import org.eclipse.swt.SWT;
 * You may obtain a copy of the License at
    @Override
                }
            UIUtils.asyncExec(() -> {

            });
            setValue(timestamp);
                log.error("Error setting initial value", e);
        if (CommonUtils.isEmpty(text)) {
        }
                focusLost();
import java.time.temporal.ChronoUnit;
import org.eclipse.swt.events.SelectionAdapter;

            return null;
 *     http://www.apache.org/licenses/LICENSE-2.0
    private FocusListener textFocusListener;
import org.jkiss.utils.CommonUtils;
            initialValue
            return customTimeEditor.getControl();
            default -> null;
import org.jkiss.dbeaver.ui.DBeaverIcons;
            cellEditorWindow.getShell(),

        textEditor.setFocus();
            textEditor.setText("");
    private Text textEditor;
                if (newValue != null) {
import org.jkiss.code.NotNull;
        }
                        .orElse(null);
                    if (newValidState) {
import org.eclipse.swt.widgets.*;
                        markDirty();
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
    @Override
    }
                e.detail = SWT.TRAVERSE_NONE;
import org.jkiss.code.Nullable;
            return;
                }
    private LocalDateTime truncateToSeconds(@Nullable LocalDateTime value) {
            @Nullable LocalDateTime value
        );
        @Nullable
            });

        @Override
import org.eclipse.swt.events.FocusListener;
    protected void updateContents(@Nullable Object value) {
 *
            customTimeEditor.addSelectionAdapter(new SelectionAdapter() {
    @Nullable
                if (!UIUtils.hasFocus(cell)) {
        return result;

            customTimeEditor.getControl().setLayoutData(layoutData);

                public void widgetSelected(SelectionEvent e) {
public class CustomLocalDateTimeCellEditor extends DialogCellEditor {
                }
                    boolean newValidState = isCorrect(newValue);
        textEditor.addMouseListener(MouseListener.mouseDoubleClickAdapter(e -> {
        textEditor.setFont(cell.getFont());
        if (value == null) {
import java.time.LocalDateTime;

    }
 *
    }
            @NotNull Shell parent,
            LocalDateTime timestamp = LocalDateTime.parse(text);
    @Override
                    value = Optional.ofNullable(customTimeEditor.getValueAsDate())

            } catch (DBCException e) {
                @Override
    }
    private void applyEditorValueFromText(@Nullable String text, @NotNull Shell shell) {
/*

}
    protected void doSetValue(@Nullable Object value) {

            ErrorDialog.openError(
        protected Composite createDialogArea(@NotNull Composite parent) {
        private static final Log log = Log.getLog(CustomTimeEditorDialog.class);
        @Nullable
        super.doSetValue(truncateToSeconds((LocalDateTime) value));
        if (value == null) {
            return;
        CustomTimeEditorDialog customTimeEditorDialog = new CustomTimeEditorDialog(
        Object result = switch (returnCode) {
    @Nullable
        int returnCode = customTimeEditorDialog.open();
        private LocalDateTime value;
        textEditor.setText(value.toString());
                    CustomLocalDateTimeCellEditor.this.fireApplyEditorValue();
            case Window.CANCEL -> currentValue;
    public CustomLocalDateTimeCellEditor(@NotNull Composite parent) {
        return textEditor;
        }
        result.setImage(DBeaverIcons.getImage(UIIcon.DOTS_BUTTON)); //$NON-NLS-1$
                customTimeEditor.setValue(value);

                e.doit = false;
                        // try to insert the current value into the error message.
            case Window.OK -> customTimeEditorDialog.result();
        textEditor.addFocusListener(textFocusListener);
 * you may not use this file except in compliance with the License.
        textEditor.addTraverseListener(e -> {
    protected Object doGetValue() {
            super(parent, "Select Date and Time", null);

    private static class CustomTimeEditorDialog extends BaseDialog {
    }
import org.eclipse.jface.window.Window;

import org.jkiss.dbeaver.ui.UIUtils;

        Button result = new Button(parent, SWT.DOWN | SWT.NO_FOCUS);
        return value.truncatedTo(ChronoUnit.SECONDS);
            customTimeEditor.createDateFormat(JDBCType.TIMESTAMP);
                null,
