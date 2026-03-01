    {
 */
    protected IDialogSettings getDialogSettings()
            });
    private String getDialogSizePrefId()
            return valueController.getValueManager();

        }
    }
            super.buttonPressed(buttonId);
import org.eclipse.jface.action.IContributionManager;
        throws DBException
import org.jkiss.dbeaver.ui.data.*;
    protected void createButtonsForButtonBar(Composite parent) {
            super(valueController, placeholder);
    @Override
    public static final String SETTINGS_SECTION_DI = "ValueViewDialog";
            editedValue = extractEditorValue();
    private void initColumnInfoVisibility(Link columnHideLink)
        @NotNull
                    dialogSettings.put(getInfoVisiblePrefId(), columnInfoVisible);
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
        @NotNull
    {
    }
                    int width = getShell().getSize().x;
        @Override
        }
            return result;

        @Override

            initColumnInfoVisibility(columnHideLink);
    protected void buttonPressed(int buttonId) {


        {
        public DBDValueHandler getValueHandler()

                getValueController().updateValue(editedValue, true);

    }
            columnHideLink.addSelectionListener(new SelectionAdapter() {
        }
            return valueController.getValue();
        } else {
        public boolean isReadOnly()
        }
        }
    }
    @Nullable
        {
        return getClass().getSimpleName() + "-" +
        @Override
 *


            return EditType.PANEL;
    {
        return editor;
        {



            super.cancelPressed();

        }
    private IValueController valueController;
        createButton(parent, IDialogConstants.CANCEL_ID, ResultSetMessages.dialog_value_view_button_cancel, false);
    public boolean isReadOnly() {


        public void refreshEditor() {
        {
import org.eclipse.swt.events.SelectionEvent;
        this.valueController = valueController;
        }
            return valueController.getValueSite();
            int divPos = sizeString.indexOf(':');
        super.configureShell(shell);
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
            if (control != null) {
        dialogCount++;
import org.jkiss.dbeaver.ui.UIUtils;


    private static class ProxyValueController<VC extends IValueController> implements IValueController {
                    columnInfoVisible = !columnInfoVisible;
            valueController instanceof IAttributeController ?
    public void showValueEditor() {
        @Override
            super.okPressed();
        }
        IValueEditor editor = valueController.getValueManager().createEditor(

import org.jkiss.dbeaver.ui.data.managers.BaseValueManager;
            return valueController.getExecutionContext();
    }
        this.setReturnCode(CANCEL);
    }
        } else {
import org.jkiss.dbeaver.model.data.DBDRowIdentifier;
    public final int open()
                public void widgetSelected(SelectionEvent e)
        return valueController;
    }
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.exec.DBCException;
    @Override
        shell.setLocation(x, y);
    }

    public void closeValueEditor() {
        @Nullable



    protected IValueEditor createPanelEditor(final Composite placeholder)
 * distributed under the License is distributed on an "AS IS" BASIS,

    @Override
        }
import org.jkiss.dbeaver.model.DBPMessageType;
    {
        }
        String sizeString = dialogSettings.get(getDialogSizePrefId());
        String sizeString = size.x + ":" + size.y;
            editor.createControl();
        {
    }
        }
        }
    @Override
        ProxyValueController(VC valueController, Composite placeholder) {
        public EditType getEditType()
            if (result == IDialogConstants.OK_ID) {
        catch (Exception e) {
        }
import org.eclipse.swt.SWT;
            return valueController.getColumnId();
        x += dialogCount * 20;
    protected void initializeBounds()
    @Override

                Integer.parseInt(sizeString.substring(0, divPos)),
            open();
        Rectangle bounds = primary.getBounds ();
        y += dialogCount * 20;

        createButton(parent, IDialogConstants.OK_ID, ResultSetMessages.dialog_value_view_button_save, true)
            int result = super.open();
        public Composite getEditPlaceholder()
    {
        @Override
            }
        Shell shell = getShell();
import org.eclipse.jface.dialogs.IDialogSettings;
    {
        @Override
    @Override
        public void updateSelectionValue(Object value) {
                new ProxyAttributeValueController((IAttributeController) valueController, placeholder) :
    private static class ProxyAttributeValueController extends ProxyValueController<IAttributeController> implements IAttributeController {
    @Override
        if (!opened) {

                    getShell().setSize(width, getShell().computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
            shell.layout();
    @Override


            opened = true;
        @Override
        public IDataController getDataController() {
            valueController.updateValue(value, updatePresentation);
    public IValueController getValueController() {
        columnHideLink.setText("Column Info: (<a>" + (columnInfoVisible ? "hide" : "show") + "</a>)");

            CommonUtils.escapeIdentifier(getValueController().getValueType().getTypeName()) +
    private ColumnInfoPanel columnPanel;
        return getClass().getSimpleName() + "-" +

    private boolean columnInfoVisible = true;
        public DBDAttributeBinding getBinding() {
            return valueController.getRowIdentifier();
        this.valueController = null;


                control.setFocus();
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.ui.IWorkbenchPartSite;
            return placeholder;
                    initColumnInfoVisibility(columnHideLink);
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
        @Override
        Monitor primary = shell.getMonitor();
        ((GridData)columnPanel.getLayoutData()).exclude = !columnInfoVisible;
        @Override
        @Override

            valueController.refreshEditor();
    }
                editedValue = BaseValueManager.makeNullValue(valueController);
            columnInfoVisible = dialogSettings.getBoolean(getInfoVisiblePrefId());
    }
            columnPanel.setLayoutData(new GridData(GridData.FILL_BOTH));
        Point size = getShell().getSize();

 *     http://www.apache.org/licenses/LICENSE-2.0
        }
        public void updateValue(Object value, boolean updatePresentation)
    @Override
                    getShell().layout();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.layout.GridData;
        public ProxyAttributeValueController(IAttributeController valueController, Composite placeholder) {
            return valueController.getBinding();

        @Override
        }
            return valueController.getValueHandler();
    }
    protected Composite createDialogArea(Composite parent) {
    private boolean opened;
import org.eclipse.swt.widgets.*;
            return valueController.getValueName();
        super.initializeBounds();
        public DBCExecutionContext getExecutionContext() {
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
 * Copyright (C) 2010-2024 DBeaver Corp and others
                new ProxyValueController<>(valueController, placeholder));

import org.jkiss.dbeaver.runtime.DBWorkbench;

        columnPanel.setVisible(columnInfoVisible);

        public String getValueName()
    public void createControl() {
            shell.setText(meta.getName());
        if (buttonId == IDialogConstants.IGNORE_ID) {
        @Override
    @Override
 * @author Serge Rider
    @Override
        }

            "-columnInfoVisible";
        if (editor != null) {
    private static int dialogCount = 0;
        @Override
import org.jkiss.dbeaver.DBException;
        @Nullable
        return getValueController().isReadOnly();
        try {
    }
        @NotNull
            super.okPressed();
import org.jkiss.utils.CommonUtils;
        }
 * limitations under the License.
            CommonUtils.escapeIdentifier(getValueController().getValueType().getTypeName()) +
        if (valueController instanceof IAttributeController) {
 *
            DBWorkbench.getPlatformUI().showError(ResultSetMessages.dialog_value_view_dialog_error_updating_title, ResultSetMessages.dialog_value_view_dialog_error_updating_message, e);
            this.valueController = null;
        }
import org.eclipse.swt.graphics.Point;

        }

            return valueController.isReadOnly();
            }
 *
        dialogSettings = UIUtils.getDialogSettings(SETTINGS_SECTION_DI);
import org.jkiss.dbeaver.model.DBUtils;
    protected void okPressed()
            valueController.updateSelectionValue(value);
 * See the License for the specific language governing permissions and

/*
                @Override
        }
        setShellStyle(SWT.CLOSE | SWT.TITLE | SWT.MAX | SWT.RESIZE);
 * ValueViewDialog
    private Object editedValue;
        }
    }
        public String getColumnId() {

        return dialogGroup;

    private final IDialogSettings dialogSettings;
            shell.setSize(new Point(
        }

 * You may obtain a copy of the License at
    }
/**
        public DBSTypedObject getValueType()
            this.placeholder = placeholder;
    protected void configureShell(Shell shell) {
        public Object getValue()
        public DBDRowIdentifier getRowIdentifier() {
import org.jkiss.dbeaver.ui.controls.ColumnInfoPanel;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        }
            .setEnabled(!valueController.isReadOnly());
    }
        }
    {
 *
        int y = bounds.y + (bounds.height - rect.height) / 3;
        public IWorkbenchPartSite getValueSite()
    }
        protected final Composite placeholder;
        @Override
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
        }

    }
 * you may not use this file except in compliance with the License.
        }
        @Override

        {
        } finally {
        {
        Rectangle rect = shell.getBounds ();
        if (dialogSettings.get(getInfoVisiblePrefId()) != null) {

            if (!valueController.isReadOnly()) {
        }
        @Override
    private String getInfoVisiblePrefId()
                {
        createButton(parent, IDialogConstants.IGNORE_ID, ResultSetMessages.dialog_value_view_button_sat_null, false)
            "-dialogSize";
    public void contributeActions(@NotNull IContributionManager manager, @NotNull IValueController controller) throws DBCException {
        public IRowController getRowController() {
        dialogSettings.put(getDialogSizePrefId(), sizeString);
        {
            DBSAttributeBase meta = ((IAttributeController)valueController).getBinding();

                }
 * Unless required by applicable law or agreed to in writing, software
public abstract class ValueViewDialog extends BaseDialog implements IValueEditorStandalone {

        protected final VC valueController;
package org.jkiss.dbeaver.ui.data.dialogs;
    }
    protected ValueViewDialog(IValueController valueController) {
        try {
            return valueController.getValueType();


import org.jkiss.dbeaver.model.data.DBDValueHandler;
            this.valueController = valueController;
        {
    {
        super(valueController.getValueSite().getShell(), "Value view", null);
            final Link columnHideLink = new Link(dialogGroup, SWT.NONE);
            dialogCount--;

            columnPanel = new ColumnInfoPanel(dialogGroup, SWT.BORDER, valueController);
            getShell().setFocus();
    public void dispose() {
                Integer.parseInt(sizeString.substring(divPos + 1))));
 */
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        }
        public void showMessage(String message, DBPMessageType messageType)
        @Override

        @NotNull
        boolean required = false;//valueController.getValueType() instanceof DBSAttributeBase && ((DBSAttributeBase) valueController.getValueType()).isRequired();
    }

        @Override
    @Override
import org.jkiss.code.NotNull;

        if (!CommonUtils.isEmpty(sizeString) && sizeString.contains(":")) {
        }
    }
            Control control = editor.getControl();
import org.jkiss.code.Nullable;
import org.eclipse.swt.events.SelectionAdapter;
            }

    }
        @Override
        if (valueController instanceof IAttributeController) {
        public IValueManager getValueManager() {
        // nothing
    @Override
}
import org.eclipse.jface.dialogs.IDialogConstants;
            return valueController.getRowController();
        return dialogSettings;
        this.close();
        {
            return valueController.getDataController();
        // create OK and Cancel buttons by default
        Composite dialogGroup = super.createDialogArea(parent);
            .setEnabled(!valueController.isReadOnly() && !DBUtils.isNullValue(valueController.getValue()) && !required);
        int x = bounds.x + (bounds.width - rect.width) / 2;
        }
