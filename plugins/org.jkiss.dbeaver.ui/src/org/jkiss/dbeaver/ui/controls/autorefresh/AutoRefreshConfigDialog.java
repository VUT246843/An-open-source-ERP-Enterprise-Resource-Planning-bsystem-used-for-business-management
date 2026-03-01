            Integer.MAX_VALUE
    }
            "Stop on error",

            1,


            @Override
            refreshSettings.isStopOnError(),
            }
    protected Composite createDialogArea(@NotNull Composite parent) {
    AutoRefreshConfigDialog(Shell parentShell, RefreshSettings settings) {
        );
    }
/*
        return refreshSettings;
        final Button stopOnErrorCheck = UIUtils.createCheckbox(
        super(parentShell, "Auto-refresh configuration", UIIcon.CLOCK_START);
            2
package org.jkiss.dbeaver.ui.controls.autorefresh;

 * distributed under the License is distributed on an "AS IS" BASIS,
            settingsGroup,
        stopOnErrorCheck.addSelectionListener(new SelectionAdapter() {
}
            settingsGroup,
            "Auto-refresh interval in seconds",
            public void widgetSelected(SelectionEvent e) {

            "Stop auto-refresh if error happens",
import org.eclipse.swt.widgets.Button;
    private static final String DIALOG_ID = "DBeaver.AutoRefreshConfigDialog";//$NON-NLS-1$
import org.jkiss.dbeaver.ui.UIUtils;
 * Copyright (C) 2010-2026 DBeaver Corp and others
            refreshSettings.getRefreshInterval(),
        final Spinner intervalSpinner = UIUtils.createLabelSpinner(

 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
    public RefreshSettings getRefreshSettings() {
        );
        });
            public void widgetSelected(SelectionEvent e) {
        Composite composite = super.createDialogArea(parent);
import org.jkiss.dbeaver.ui.UIIcon;
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.widgets.Composite;
 * See the License for the specific language governing permissions and

import org.jkiss.code.NotNull;
    @Override
 */
            }
                refreshSettings.setStopOnError(stopOnErrorCheck.getSelection());
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.swt.layout.GridData;
 *     http://www.apache.org/licenses/LICENSE-2.0
        Composite settingsGroup = UIUtils.createTitledComposite(composite, "Settings", 2, GridData.FILL_BOTH);
 *
    @Override
                refreshSettings.setRefreshInterval(intervalSpinner.getSelection());
    {
            @Override
public class AutoRefreshConfigDialog extends BaseDialog {
import org.eclipse.jface.dialogs.IDialogSettings;
        this.refreshSettings = new RefreshSettings(settings);
import org.eclipse.swt.events.SelectionAdapter;


        return UIUtils.getDialogSettings(DIALOG_ID);
import org.eclipse.swt.events.SelectionEvent;

 *
        return composite;
 *
            "Interval (sec)",
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
    private RefreshSettings refreshSettings;
    }
import org.eclipse.swt.widgets.Shell;
        intervalSpinner.addSelectionListener(new SelectionAdapter() {
    }
    protected IDialogSettings getDialogBoundsSettings()
    @NotNull
        });
 * DBeaver - Universal Database Manager

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.widgets.Spinner;
