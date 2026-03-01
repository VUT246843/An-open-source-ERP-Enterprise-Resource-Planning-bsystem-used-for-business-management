            UIUtils.createLabelText(crsGroup, GISMessages.panel_show_srid_dialog_label_text_name, crs.getName(), SWT.BORDER | SWT.READ_ONLY);
        return dialogArea;
            gd.heightHint = UIUtils.getFontHeight(wktText) * 15;
        }
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
                GridData.FILL_HORIZONTAL
    @NotNull
package org.jkiss.dbeaver.ui.gis.panel;
import org.jkiss.dbeaver.model.gis.GisTransformUtils;
            UIUtils.createLabelText(crsGroup, GISMessages.panel_show_srid_dialog_label_text_projection, crs.getProjection() == null ? "N/A" : crs.getProjection().toString(), SWT.BORDER | SWT.READ_ONLY);
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
            Text wktText = UIUtils.createLabelText(crsGroup, "WKT", crs.toWKT(), SWT.BORDER | SWT.READ_ONLY | SWT.MULTI | SWT.V_SCROLL | SWT.WRAP);
            Composite crsGroup = UIUtils.createTitledComposite(

            UIUtils.createLabelText(crsGroup, GISMessages.panel_show_srid_dialog_label_text_coordinate, crs.getCoordinateSystem().toString(), SWT.BORDER | SWT.READ_ONLY);
    }
    private int selectedSRID;

                dialogArea,
 */
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
/**
    }
    private static final String DIALOG_ID = "DBeaver.ShowSRIDDialog";//$NON-NLS-1$

import org.jkiss.dbeaver.ui.gis.internal.GISMessages;
        selectedSRID = defCRS;

            CoordinateReferenceSystem crs = GisTransformUtils.getCRSFactory().getCRS("EPSG:" + selectedSRID);
 *
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.widgets.Composite;
    @Override
        Composite dialogArea = super.createDialogArea(parent);


            crsGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
                2,

import org.jkiss.dbeaver.runtime.DBWorkbench;

import org.eclipse.swt.layout.GridData;
 *
import org.jkiss.code.NotNull;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.jkiss.dbeaver.ui.UIUtils;
    @Override

    }
import org.eclipse.swt.SWT;
 * limitations under the License.
import org.cts.crs.CRSException;
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
            gd.widthHint = UIUtils.getFontHeight(wktText) * 40;
                GISMessages.panel_show_srid_dialog_control_group_label_details,
            GridData gd = new GridData(GridData.FILL_BOTH);
 *     http://www.apache.org/licenses/LICENSE-2.0

 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
        try {

import org.cts.crs.CoordinateReferenceSystem;
import org.jkiss.dbeaver.Log;
            UIUtils.createLabelText(crsGroup, GISMessages.panel_show_srid_dialog_label_text_type, crs.getType() == null ? "N/A" : crs.getType().toString(), SWT.BORDER | SWT.READ_ONLY);
 * distributed under the License is distributed on an "AS IS" BASIS,
        super(shell, GISMessages.panel_show_srid_dialog_title_select, null);
    public ShowSRIDDialog(Shell shell, int defCRS) {
        } catch (CRSException e) {
    protected IDialogSettings getDialogBoundsSettings() {
            );
    protected Composite createDialogArea(@NotNull Composite parent) {
import org.eclipse.swt.widgets.Text;
            UIUtils.createLabelText(crsGroup, "SRID", String.valueOf(selectedSRID), SWT.BORDER | SWT.READ_ONLY);
 *
        return null;//UIUtils.getSettingsSection(UIActivator.getDefault().getDialogSettings(), DIALOG_ID);
import org.eclipse.swt.widgets.Shell;
 * See the License for the specific language governing permissions and
            DBWorkbench.getPlatformUI().showError("CRS error", "Error reading SRID " + selectedSRID + " details", e);
    private static final Log log = Log.getLog(ShowSRIDDialog.class);
    @Override
}            wktText.setLayoutData(gd);
public class ShowSRIDDialog extends BaseDialog {

    protected void createButtonsForButtonBar(@NotNull Composite parent) {

 * Licensed under the Apache License, Version 2.0 (the "License");
/*
 * SRID details dialog
