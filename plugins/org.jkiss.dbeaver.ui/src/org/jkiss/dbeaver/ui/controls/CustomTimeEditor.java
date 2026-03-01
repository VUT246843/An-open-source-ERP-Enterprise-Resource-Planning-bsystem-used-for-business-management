    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    public void updateListeners() {
        }
            }
import org.eclipse.swt.layout.GridLayout;
    /**
        }
            setWithoutListener(textEditor, modifyListener, () -> textEditor.setText(dateAsText));
        }
    private final Calendar calendar = Calendar.getInstance();
import org.eclipse.swt.widgets.*;
                case DATE:
            return;
     * @throws DBCException when it can't be adapted, should be shown as text in presentation
 * limitations under the License.
        if (this.textEditor != null && !this.textEditor.isDisposed()){
import java.time.LocalDateTime;
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void selectAllContent() {
    private String dateAsText = "";

            switch (jdbcType) {
 * Unless required by applicable law or agreed to in writing, software

            basePartLayout.marginWidth = 0;
                    disposeEditor(timeEditor, timeLabel);
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * Sets value to the calendar
        timeEditor = null;
        Date adaptedValue = adaptToDate(value);
        dateEditor.setLayoutData(layoutData);

     * @param value value which should be adapted
                    calendar.get(Calendar.DAY_OF_MONTH));
 * CustomTimeEditor
            if (timeEditor != null && !timeEditor.isDisposed()) {
    public void setToDateComposite() {
            dateLabel = UIUtils.createLabel(basePart, "Date");
            updateWarningLabel(null);
            default:
    private final boolean isInline;
        }

        //fixes calendar issues on inline mode
            try {
    private void disposeEditor(Control editor, Label editorLabel) {
import org.jkiss.dbeaver.model.struct.DBSTypedObject;

            case DATE:
    }
 * DBeaver - Universal Database Manager
                break;
            return;
        basePart.pack();
    public void setToTextComposite() {
        if (dateEditor != null || timeEditor != null) {
                calendar.set(dateEditor.getYear(), dateEditor.getMonth(), dateEditor.getDay());
                case TIME:
        } else if (value instanceof Date) {
            dateEditor.setDate(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
import org.jkiss.dbeaver.model.struct.DBSTypedObjectJDBC;
        } else {
    }
        }
        }
    }
     * Disposes all DateTime editors and their labels and creates text editor
 * you may not use this file except in compliance with the License.
        }
    }
            mainComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        disposeEditor(textEditor, null);
            textEditor.addListener(SWT.Modify, modifyListener);
    }
    public void setEditable(boolean editable) {
import org.jkiss.dbeaver.model.DBIcon;
            } catch (ArrayIndexOutOfBoundsException e) {
        }
            throw new DBCException(value.toString());
                break;
public class CustomTimeEditor {
        setToDateComposite();
        }
            calendar.setTime(adaptedValue);
     *
    private void disposeNotNeededEditors() {

            mainComposite.layout();

                timeEditor.addSelectionListener(selectionListener);
            timeLabel = UIUtils.createLabel(basePart, "Time");
            this.textEditor.setEditable(editable);
        updateListeners();
        if (textEditor != null && !textEditor.isDisposed()) {
        if (millis != -1) {
    public void createDateFormat(JDBCType jdbcType) {
        } else {
            case DATETIME:
        basePart.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

     * Creates listeners for date editors.
        if (CommonUtils.isEmpty(dateAsText)) {
    private JDBCType jdbcType;
    private enum InputMode {
        }
        }
                dateEditor.addSelectionListener(selectionListener);
    private Composite initEditor(@NotNull Composite parent, int style) {
    }
        disposeNotNeededEditors();
        } else {
                warningLabel.dispose();
            } catch (Exception e) {
        basePart.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        if (selectionListener != null) {
        }
    }
    /**
        }
 *

    @Nullable
        DATE,
        }
import java.sql.Time;
        switch (inputMode) {
     *
import org.eclipse.swt.events.SelectionAdapter;
    }
            }
                    break;

    }
        basePart.layout();
        if (isInline) {
    /**
            if (editorLabel != null) {
    }
            mainComposite.layout();
        updateWarningLabel(value);
import org.jkiss.dbeaver.ui.DBeaverIcons;
                millis = -1;
    private int millis = -1;
            if (warningLabel != null) {
        } else {
import java.util.Calendar;
        basePart.layout();
            switch (inputMode) {
    private Composite mainComposite;
            case TIME:
        if (!isInline) {
    private Label timeLabel;
                default:
     * @param listener listener to add to all existing editors
            }

        if (adaptedValue != null) {
                break;
        } else if (value instanceof LocalDateTime) {
import org.eclipse.swt.SWT;
    /**
            warningLabel = new CLabel(mainComposite, style);
     */
    private DateTime timeEditor;
     */

        }
/*

        textEditor = new Text(basePart, isPanel && !isInline ? style : SWT.BORDER);
     * Disposes text editor components and creates DateTime editors
    }
    public void addModifyListener(@NotNull Listener listener) {
        disposeEditor(timeEditor, timeLabel);
        textEditor.setLayoutData(gridData);
                calendar.set(0, Calendar.JANUARY, 0, 0, 0, 0);
        this.isInline = isInline;
        if (timeEditor != null && !timeEditor.isDisposed()) {
        }
        }
            }
    private CLabel warningLabel;
                case DATETIME:
        if (value == null && (textEditor == null || textEditor.isDisposed())) {
        if (mainComposite != null) {
import org.jkiss.dbeaver.ui.css.CSSUtils;
                jdbcType = JDBCType.valueOf(valueType.getTypeID());
    }
                    break;
        }
        if (!isInline) {
        this.jdbcType = jdbcType;
            }
    public void createDateFormat(@NotNull DBSTypedObject valueType) {
            warningLabel.setImage(DBeaverIcons.getImage(DBIcon.SMALL_INFO));
                calendar.set(0, Calendar.JANUARY, 0, timeEditor.getHours(), timeEditor.getMinutes(), timeEditor.getSeconds());
        setDateFromCalendar();
                    break;
        if (warningLabel != null) {
        selectionListener = listener;
 */
            textEditor.selectAll();

            GridLayout layout = new GridLayout(1, false);
        modifyListener = listener;

    private void updateWarningLabel(@Nullable Object value) {
            control.removeListener(SWT.Modify, listener);
     * @throws DBCException if it can't be adapted to Date type
    private final int style;
        NONE,
                        timeEditor.getMinutes(), timeEditor.getSeconds());
        if (isInline) {
                    break;
                    break;
    }

 * See the License for the specific language governing permissions and
                calendar.set(dateEditor.getYear(), dateEditor.getMonth(), dateEditor.getDay(), timeEditor.getHours(),
    private InputMode inputMode = InputMode.NONE;
            editor.dispose();

        allowEdit();
    private Listener modifyListener;
            calendar.set(Calendar.MILLISECOND, millis);

    }
        TIME,
import org.jkiss.dbeaver.model.exec.DBCException;
     */
     * @return adapted value
        if (jdbcType != null) {
import java.time.ZoneId;
package org.jkiss.dbeaver.ui.controls;
        if (value == null) {
        allowEdit();
            warningLabel.setText("Original value was null, using current time");
    private static void setWithoutListener(@NotNull Control control, Listener listener, @NotNull Runnable blockToRun) {
        if (editor != null) {
    public void addSelectionAdapter(@NotNull SelectionAdapter listener) {
    private void setDateFromCalendar() {
        }
import java.sql.Timestamp;
        return null;
        this.style = style;
                    inputMode = InputMode.DATE;
    @NotNull
                    calendar.setTime(new Time(System.currentTimeMillis()));
        dateAsText = value;
        if (modifyListener != null && textEditor != null && !textEditor.isDisposed()) {
        }
                    inputMode = InputMode.TIME;
    public void setValue(@Nullable Object value) throws DBCException {
            blockToRun.run();
import org.jkiss.code.Nullable;

    private Text textEditor;
        allowEdit();
                    calendar.setTime(new Timestamp(System.currentTimeMillis()));
            return Date.from((Instant) value);


            control.addListener(SWT.Modify, listener);
                    disposeEditor(dateEditor, dateLabel);

    @Nullable
                break;
                mainComposite.layout();
    private DateTime dateEditor;
        if (textEditor != null && !textEditor.isDisposed()) {
            basePartLayout.marginHeight = 0;
            layout.marginHeight = 0;
            }
        this.isPanel = isPanel;
        textEditor.setText(dateAsText);
        final GridData layoutData = new GridData(SWT.FILL, SWT.RIGHT, true, false, 1, 1);
            timeEditor.setTime(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), calendar.get(Calendar.SECOND));

        return calendar.getTime();
import org.jkiss.utils.CommonUtils;
                    inputMode = InputMode.DATETIME;
        if (textEditor != null && !textEditor.isDisposed()) {

        basePart = new Composite(isInline ? parent : mainComposite, style);
                    calendar.setTime(new Date(System.currentTimeMillis()));
            if (warningLabel != null && !warningLabel.isDisposed()) {
        } else {
        if (mainComposite != null) {
import java.time.Instant;
                    break;
}
        }
            if (dateEditor != null && !dateEditor.isDisposed()) {
                millis = calendar.get(Calendar.MILLISECOND);
            blockToRun.run();
 * Licensed under the Apache License, Version 2.0 (the "License");
        updateListeners();
    private final boolean isPanel;
import org.jkiss.code.NotNull;
 * Copyright (C) 2010-2025 DBeaver Corp and others
            this.dateEditor.setEnabled(editable);
        disposeEditor(dateEditor, dateLabel);
     * @param value value to which calendar should be set
                //Calendar doesn't have any way to
        CSSUtils.setExcludeFromStyling(textEditor);
    }
        }
    private Label dateLabel;
    public Date getValueAsDate() {
        this.timeEditor.setLayoutData(layoutData);
        return isInline ? basePart : mainComposite;
        }
    public String getValueAsString() {
        basePart.setLayoutData(new GridData(GridData.FILL_BOTH));
        }
    private boolean editable;
        this.timeEditor = new DateTime(basePart, SWT.TIME | SWT.MEDIUM);
import org.jkiss.dbeaver.ui.UIUtils;
        disposeNotNeededEditors();
    }
    public void setTextValue(@Nullable String value) {

        }
        dateEditor = null;
            mainComposite.layout();
    }
 * You may obtain a copy of the License at
        }
    @NotNull
                return;
            return (Date) value;
    public void allowEdit() {
    /**
    }
    }
        }
        basePart.setLayout(basePartLayout);
            mainComposite = new Composite(parent, style);
import org.eclipse.swt.layout.GridData;

 *

        this.editable = editable;
                    break;


        if (valueType instanceof DBSTypedObjectJDBC) {
            jdbcType = JDBCType.TIMESTAMP;
            try {
            return textEditor.getText();
     */
import org.eclipse.swt.custom.CLabel;
        GridLayout basePartLayout = new GridLayout(2, false);
        if (!isInline) {
     * Adapts values to date
                editorLabel.dispose();
            return;
        if (textEditor != null && !textEditor.isDisposed()) {
        return isInline ? basePart : mainComposite;
    public Composite getControl() {
import java.sql.JDBCType;
    public Date adaptToDate(@Nullable Object value) throws DBCException {

    private Composite basePart;
/**
    }
                jdbcType = JDBCType.TIMESTAMP;
        setDateFromCalendar();
            }
                case TIME:
        updateListeners();
     */
                default:
        disposeNotNeededEditors();
    private SelectionAdapter selectionListener;
            this.timeEditor.setEnabled(editable);
        }
        initEditor(parent, style);
        if (this.timeEditor != null && !this.timeEditor.isDisposed()) {
        } else if (value instanceof Instant) {
            return Date.from(((LocalDateTime) value).atZone(ZoneId.systemDefault()).toInstant());
            mainComposite.setLayout(layout);
 *
        this.dateEditor = new DateTime(basePart, SWT.DROP_DOWN);
        final GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
        if (this.dateEditor != null && !this.dateEditor.isDisposed()) {

            }

        DATETIME
            warningLabel = null;
        }
        if (dateEditor != null && !dateEditor.isDisposed()) {
    }
    }
        }
import java.util.Date;
        if (listener != null) {
            return null;
            warningLabel.dispose();
            timeEditor.addTraverseListener(e -> timeEditor.setFocus());

    public CustomTimeEditor(@NotNull Composite parent, int style, boolean isPanel, boolean isInline) {
            }
            layout.marginWidth = 0;
     *
                case DATE:
