        if (selectedSRID != 0) {
public class SelectSRIDDialog extends BaseDialog {
            int newSRID = CommonUtils.toInt(sridCombo.getText());

    }
        allSupportedCodes = GisTransformUtils.getSortedEPSGCodes();
            if (dialog.open() == IDialogConstants.OK_ID) {

                crsNameText.setText(CommonUtils.notEmpty(crs.getName()) +  " (" + crs.getCoordinateSystem() + ")");
        String[] items = new String[allSupportedCodes.size()];

                showSRIDDialog.open();
import org.eclipse.swt.events.SelectionAdapter;
    @Override

            selectedSRID = 0;
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
    @Override
import org.cts.crs.CoordinateReferenceSystem;
            super.buttonPressed(buttonId);
    protected Composite createDialogArea(@NotNull Composite parent) {
            }


        super(shell, GISMessages.panel_select_srid_dialog_title, null);
 *
import java.util.List;
import org.jkiss.code.NotNull;

    }
/*
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
            sridCombo.setText(String.valueOf(selectedSRID));
    protected Control createContents(@NotNull Composite parent) {
                int newSRID = dialog.getSelectedSRID();
        crsGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Database select dialog
 */
        Control contents = super.createContents(parent);

                CoordinateReferenceSystem crs = GisTransformUtils.getCRSFactory().getCRS(GisConstants.GIS_REG_EPSG + ":" + selectedSRID);
                    sridCombo.setText(String.valueOf(newSRID));
            crsNameText.setText("N/A");
        }

    private static final int MANAGE_BUTTON_ID = 1000;
        crsNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                }
        sridCombo.setItems();
            } catch (Throwable e) {
    public SelectSRIDDialog(Shell shell, int defCRS) {
    protected IDialogSettings getDialogBoundsSettings() {
import org.eclipse.swt.layout.GridData;
    private Text crsNameText;
            @Override
        return selectedSRID;
 * DBeaver - Universal Database Manager
        selectedSRID = defCRS;
        detailsButton = UIUtils.createPushButton(crsGroup, GISMessages.panel_select_srid_dialog_button_label_details, null);
            try {
        }

        createButton(parent, MANAGE_BUTTON_ID, GISMessages.panel_select_srid_dialog_button_label_manage, false);
        detailsButton.addSelectionListener(new SelectionAdapter() {
        sridCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        return dialogArea;
            public void widgetSelected(SelectionEvent e) {
        });
        sridCombo.setItems(items);
    public int getSelectedSRID() {

        return null;//UIUtils.getSettingsSection(UIActivator.getDefault().getDialogSettings(), DIALOG_ID);
                if (newSRID != 0) {
    private void setSelectedSRID(int newSRID) {
    }
import org.jkiss.dbeaver.ui.gis.internal.GISMessages;
        sridCombo = UIUtils.createLabelCombo(crsGroup, GISMessages.panel_select_srid_dialog_label_combo_source_srid, GISMessages.panel_select_srid_dialog_label_combo_tooltip_source_crs, SWT.BORDER | SWT.DROP_DOWN);
            String strCode = String.valueOf(code);
    @NotNull
 *
    }
        setSelectedSRID(selectedSRID);
import org.eclipse.swt.events.SelectionEvent;
    private void updateButtons() {
        } else {
    }
    protected void createButtonsForButtonBar(@NotNull Composite parent) {
            ManageCRSDialog dialog = new ManageCRSDialog(getShell(), selectedSRID);

import org.eclipse.jface.dialogs.IDialogConstants;
 * See the License for the specific language governing permissions and
    private Button detailsButton;
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (buttonId == MANAGE_BUTTON_ID) {
        return contents;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    private List<Integer> allSupportedCodes;
 */
        UIUtils.createEmptyLabel(crsGroup, 1, 1);
    protected void buttonPressed(int buttonId) {
    @Override
    @Override
            setSelectedSRID(newSRID);
                    setSelectedSRID(newSRID);
        enableButton(IDialogConstants.OK_ID, selectedSRID != 0);
    }

/**
        Composite dialogArea = super.createDialogArea(parent);
import org.jkiss.utils.CommonUtils;
        Composite crsGroup = UIUtils.createTitledComposite(dialogArea, "CRS", 2, GridData.FILL_HORIZONTAL);
    private Combo sridCombo;
        });
 * you may not use this file except in compliance with the License.
        sridCombo.addModifyListener(e -> {
            selectedSRID = newSRID;
        updateButtons();
            updateButtons();
    private int selectedSRID;
            detailsButton.setEnabled(false);
 * limitations under the License.
        } else {

            items[i] = strCode;
        for (int i = 0; i < allSupportedCodes.size(); i++) {
        detailsButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
                detailsButton.setEnabled(true);
                ShowSRIDDialog showSRIDDialog = new ShowSRIDDialog(getShell(), getSelectedSRID());
    @Override
        if (allSupportedCodes.contains(newSRID)) {
        }

                DBWorkbench.getPlatformUI().showError("Bad CRS", "Error reading CRS info", e);
}        }
            }

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
import org.jkiss.dbeaver.model.gis.GisTransformUtils;
        super.createButtonsForButtonBar(parent);
import org.jkiss.dbeaver.model.gis.GisConstants;
import org.eclipse.swt.SWT;

        crsNameText = UIUtils.createLabelText(crsGroup, GISMessages.panel_select_srid_dialog_title_label_text_name, "", SWT.BORDER | SWT.READ_ONLY);
import org.jkiss.dbeaver.ui.UIUtils;
            Integer code = allSupportedCodes.get(i);
import org.eclipse.jface.dialogs.IDialogSettings;
            }

    }
package org.jkiss.dbeaver.ui.gis.panel;
import org.eclipse.swt.widgets.*;
 *

    private static final String DIALOG_ID = "DBeaver.SelectSRIDDialog";//$NON-NLS-1$
    }
