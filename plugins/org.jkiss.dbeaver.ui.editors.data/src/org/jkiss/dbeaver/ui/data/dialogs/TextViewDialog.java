
    public boolean isDirty() {
import org.jkiss.dbeaver.utils.GeneralUtils;

            }
        if (hexEditorService != null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                rawValue = textEdit.getText();
                public void widgetSelected(SelectionEvent event)
                item.setText("Text");
import org.eclipse.swt.events.SelectionEvent;
            long maxSize = getValueController().getValueType().getMaxLength();
        }
                session,
            }
        }
            item.setImage(DBeaverIcons.getImage(DBIcon.TYPE_BINARY));
    @Override
import org.jkiss.dbeaver.model.exec.DBCSession;
            textEdit.setLayoutData(gd);
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
        if (minSize != null) {
    }
    {
            editorContainer = new CTabFolder(dialogGroup, SWT.FLAT | SWT.TOP);
        if (hexEditorService != null && stringValue != null) {
    }
            try {
            String charset = getDefaultCharset();
            lengthLabel = new Label(dialogGroup, SWT.RIGHT);
                CTabItem item = new CTabItem(editorContainer, SWT.NO_FOCUS);
        if (getValueController().getValueType().getDataKind() == DBPDataKind.STRING) {
        if (isForeignKey) {
                rawValue = getBinaryString();
 *
            editorContainer.addSelectionListener(new SelectionAdapter() {
    public void primeEditorValue(@Nullable Object value)
        if (lengthLabel != null) {
                //textEdit.setBackground(getShell().getDisplay().getSystemColor(SWT.COLOR_LIST_BACKGROUND));
 * Licensed under the Apache License, Version 2.0 (the "License");
        {

    protected void buttonPressed(int buttonId) {
        Object prevValue = getValueController().getValue();
            Button button = createButton(parent, IDialogConstants.PROCEED_ID, ResultSetMessages.dialog_text_view_open_editor, false);
            StyledTextUtils.fillDefaultStyledTextContextMenu(textEdit);
            }
    private Label lengthLabel;
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.ui.data.dialogs;
        return dialogGroup;
            // Binary
            return;
        }
                gd.heightHint = 200;
        }
import org.jkiss.dbeaver.runtime.DBWorkbench;
            });
    }
        if (hexEditorService != null) {
    private boolean isTextEditorActive()
import java.io.UnsupportedEncodingException;
                rawValue = isTextEditorActive() ? GeneralUtils.convertToBytes(textEdit.getText()) : getBinaryContent();
import org.jkiss.dbeaver.ui.data.IValueController;
                item.setImage(DBeaverIcons.getImage(DBIcon.TYPE_TEXT));
        byte[] bytes = getBinaryContent();
        Point minSize = null;
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
    private boolean dirty;

            return hexEditControl;
        return editorContainer == null || editorContainer.getSelectionIndex() == 0;
            textEdit.setFocus();
                {
                rawValue = isTextEditorActive() ? textEdit.getText() : getBinaryString();
    public Control getControl() {


import org.eclipse.swt.custom.StyledText;
    protected Composite createDialogArea(Composite parent)
            textEdit.setText(strValue);
            });
import org.jkiss.dbeaver.ui.DBeaverIcons;
    @Override
    public void setDirty(boolean dirty) {
}
            }
            //editorContainer.setTopRight(lengthLabel, SWT.FILL);
            if (hexEditorService != null) {

            return null;
                dirty = true;
            // Set default size as minimum
    protected void createButtonsForButtonBar(Composite parent) {
        }
            }
                gd.grabExcessVerticalSpace = true;
                false, false);
            minSize.x += 50;
        }
        boolean readOnly = getValueController().isReadOnly();
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.widgets.Label;
        return stringValue;
    }
            final String strValue = valueController.getValueHandler().getValueDisplayString(valueController.getValueType(), value, DBDDisplayFormat.EDIT);
        super.buttonPressed(buttonId);
            } catch (Exception e) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
            primeEditorValue(getValueController().getValue());
            minSize.y += 50;
        super(valueController);
    private CTabFolder editorContainer;
import org.jkiss.code.Nullable;
            } else {

            }

 */
import org.jkiss.dbeaver.ui.data.editors.ReferenceValueEditor;
    {
        }

import org.eclipse.swt.events.SelectionAdapter;
    }
        }
            gd.widthHint = 300;
    @Override
        int selectedType = 0;
import org.eclipse.swt.SWT;
        Composite dialogGroup = super.createDialogArea(parent);
            editorContainer.setSelection(selectedType);
import org.jkiss.dbeaver.model.DBIcon;
                editorContainer.setSelection(item);
import org.eclipse.swt.graphics.Point;
            if (readOnly) {
            } else {
        if (isTextEditorActive()) {
    private static final String VALUE_TYPE_SELECTOR = "string.value.type";
 * limitations under the License.
            textEdit = new StyledText(hexEditorService != null ? editorContainer : dialogGroup, style);
    {
    @Override
            stringValue = new String(bytes);
            item.setText("Hex");
            item.setControl(hexEditControl);
        if (getDialogSettings().get(VALUE_TYPE_SELECTOR) != null) {
                    getDialogSettings().put(VALUE_TYPE_SELECTOR, editorContainer.getSelectionIndex());
            }
                hexEditorService.setHexContent(hexEditControl, bytes, getDefaultCharset());
    private StyledText textEdit;

            } else {
    private void setBinaryContent(String stringValue)
            selectedType = getDialogSettings().getInt(VALUE_TYPE_SELECTOR);
            if (readOnly) {
            lengthLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                selectedType = 0;
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
                }
            updateValueLength();
        if (buttonId == IDialogConstants.PROCEED_ID) {

import org.jkiss.dbeaver.model.DBPDataKind;
    private void updateValueLength()
 * Unless required by applicable law or agreed to in writing, software
    }
        }
    {
            hexEditControl = hexEditorService.createHexControl(editorContainer, readOnly);
        UIUtils.asyncExec(() -> {
        if (getShell() == null || getShell().isDisposed()) {
 *
        }

            if (!isForeignKey) {
                getValueController().getValueType(),
            lengthLabel.setText("Length: " + length + (maxSize > 0 ? " [" + maxSize + "]" : ""));
        }
            return hexEditorService.getHexContent(hexEditControl);
import org.jkiss.dbeaver.model.data.DBDContentCached;
            if (ContentUtils.isTextContent((DBDContent) prevValue)) {
import org.eclipse.swt.layout.GridData;
        label.setText(ResultSetMessages.dialog_data_label_value);
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
import org.jkiss.dbeaver.utils.ContentUtils;
/**
            long length = textEdit.getText().length();

        final DBSTypedObject valueType = getValueController().getValueType();
                getDefaultCharset());
    {
            }

        }

    //private static final int DEFAULT_MAX_SIZE = 100000;
            if (isTextEditorActive()) {
import org.jkiss.dbeaver.model.DBValueFormatting;
            textEdit.setFont(UIUtils.getMonospaceFont());
            }
                item.setControl(textEdit);
            getShell().setMinimumSize(minSize);

            DBWorkbench.getPlatformUI().showError("Extract editor value", "Can't extract editor value", e);
                bytes = stringValue.getBytes(charset);
                updateValueLength();
import org.jkiss.dbeaver.ui.UIUtils;
        ReferenceValueEditor referenceValueEditor = new ReferenceValueEditor(null, getValueController(), this);
            return null;
import java.nio.charset.Charset;
        } catch (UnsupportedEncodingException e) {
            }
        }
        });
            hexEditorService = DBWorkbench.getService(IHexEditorService.class);
            return null;
            editorContainer.setLayoutData(new GridData(GridData.FILL_BOTH));
            log.error(e);
    {
                textEdit.setTextLimit((int) maxSize);

        if (!isForeignKey) {
                hexEditorService.setHexContent(hexEditControl, bytes, charset);
 * TextViewDialog

        boolean isForeignKey = referenceValueEditor.isReferenceValue();
import org.eclipse.jface.dialogs.IDialogConstants;
        String stringValue;

import org.jkiss.dbeaver.ui.controls.StyledTextUtils;
            if (hexEditorService != null) {
    }
                style |= SWT.BORDER;
    }
            CTabItem item = new CTabItem(editorContainer, SWT.NO_FOCUS);
            } catch (UnsupportedEncodingException e) {
        if (value instanceof byte[]) {


    }
            try {

import org.eclipse.swt.widgets.Composite;
                rawValue,
    public Object extractEditorValue()
        }
    private static final Log log = Log.getLog(TextViewDialog.class);
        }
        hexEditorService = null;
public class TextViewDialog extends ValueViewDialog {
        try (DBCSession session = getValueController().getExecutionContext().openSession(new VoidProgressMonitor(), DBCExecutionPurpose.UTIL, "Make text value from editor")) {
            textEdit.setText(GeneralUtils.convertToString(bytes, 0, bytes.length));
            textEdit.setEditable(!readOnly);
                setBinaryContent(strValue);
    }
                bytes, 0, length,
            value = ((DBDContentCached) value).getCachedValue();
 */
            textEdit.addModifyListener(e -> {
            byte[] bytes = (byte[]) value;
            if (selectedType >= editorContainer.getItemCount()) {

            return getValueController().getValueHandler().getValueFromObject(
    {
        if (prevValue instanceof DBDContent) {
import org.jkiss.dbeaver.ui.data.IHexEditorService;
            button.setToolTipText(ResultSetMessages.dialog_text_view_open_editor_tip);
        if (hexEditorService != null) {
        } else {
            // Should be string
            hexEditControl.addListener(SWT.Modify, event -> dirty = true);
        }
            if (hexEditorService != null) {
 * See the License for the specific language governing permissions and
                bytes = stringValue.getBytes(Charset.defaultCharset());
            if (hexEditControl != null) {
    }
            cancelPressed();
    private Control hexEditControl;
            minSize = hexEditControl.computeSize(SWT.DEFAULT, SWT.DEFAULT);
        } catch (Exception e) {
        }
            }
            if (maxSize > 0 && valueType.getDataKind() == DBPDataKind.STRING) {
        Object rawValue;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.custom.CTabFolder;

import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
            int style = SWT.NONE;
 * you may not use this file except in compliance with the License.
        return DBValueFormatting.getDefaultBinaryFileEncoding(getValueController().getExecutionContext().getDataSource());
                log.error(e);
    }
        Label label = new Label(dialogGroup, SWT.NONE);
        this.dirty = dirty;
        if (value instanceof DBDContentCached) {
    private IHexEditorService hexEditorService;
                style |= SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.WRAP;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.data.DBDContent;
    private String getDefaultCharset() {


    }
/*

 *
        try {

        } else {
    @Override
            ContentEditor editor = ContentEditor.openEditor(getValueController());
            byte[] bytes;

        long maxSize = valueType.getMaxLength();
            referenceValueEditor.createEditorSelector(dialogGroup);
        int length = bytes.length;
            stringValue = new String(
        super.createButtonsForButtonBar(parent);
                @Override
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
        }
            }
    }
            return textEdit;

            }

    private String getBinaryString()
            GridData gd = new GridData(isForeignKey ? GridData.FILL_HORIZONTAL : GridData.FILL_BOTH);
                // Use border only for plain text editor, otherwise tab folder's border will be used

        } else {
                log.error(e);
        } else {
    public TextViewDialog(IValueController valueController) {
                style |= SWT.READ_ONLY;
import org.jkiss.dbeaver.Log;
            final IValueController valueController = getValueController();
        return dirty;
    {
import org.jkiss.dbeaver.ui.editors.content.ContentEditor;
            textEdit.setMargins(3, 3, 3, 3);
    }
        }
 * DBeaver - Universal Database Manager
    private byte[] getBinaryContent()
    @Override
import org.eclipse.swt.widgets.Control;
