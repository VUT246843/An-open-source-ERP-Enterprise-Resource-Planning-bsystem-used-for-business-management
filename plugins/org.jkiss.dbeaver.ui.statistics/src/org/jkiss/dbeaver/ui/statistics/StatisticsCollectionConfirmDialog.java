        UIStatisticsActivator.setSkipDataShareConfirmation(true);
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
        return composite;
            doNotShareDataButton.setEnabled(false);
        Label label = UIUtils.createLabel(composite, "Data share");
    @Override
                StatisticCollectionMessages.statistic_collection_pref_link,
        Composite dialogArea = super.createDialogArea(parent);
            // SEND
        createButton(parent, IDialogConstants.YES_ID, StatisticCollectionMessages.statistic_collection_confirm_lbl, true);
    }
    private Button doNotShareDataButton;

        super.buttonPressed(buttonId);
import org.jkiss.code.NotNull;

        PrefPageUsageStatistics.createDataShareComposite(composite);

            UIUtils.createEmptyLabel(composite, 1, 1);
            UIStatisticsActivator.setTrackingEnabled(buttonId == IDialogConstants.NO_ID);
            UIStatisticsActivator.setTrackingEnabled(buttonId == IDialogConstants.YES_ID);
    }
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.widgets.Label;
            // DO NOT SEND
 * DBeaver - Universal Database Manager
        UIUtils.createEmptyLabel(composite, 1, 1);
        doNotShareDataButton = UIUtils.createCheckbox(composite, StatisticCollectionMessages.statistic_collection_dont_share_lbl, false);
 * Copyright (C) 2010-2024 DBeaver Corp and others
    protected Composite createDialogArea(@NotNull Composite parent) {
                composite,


/*
 * you may not use this file except in compliance with the License.
        if (DBWorkbench.getPlatform().getApplication().isStatisticsCollectionRequired()) {
                })

 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        }
            );
import org.jkiss.dbeaver.ui.UIUtils;

 *
                    close();
import org.eclipse.jface.dialogs.IDialogConstants;
                    UIUtils.showPreferencesFor(parentShell, null, PrefPageUsageStatistics.PAGE_ID);
    @Override

 * See the License for the specific language governing permissions and
    protected void createButtonsForButtonBar(@NotNull Composite parent) {
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ui.statistics;

 *
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
/**
import org.eclipse.swt.widgets.Shell;
 * StatisticsCollectionConfirmDialog

        close();


import org.eclipse.swt.events.SelectionListener;
 */

public class StatisticsCollectionConfirmDialog extends BaseDialog {
 */
import org.eclipse.swt.widgets.Button;
    protected void buttonPressed(int buttonId) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        } else {
        }
        label.setFont(JFaceResources.getFont(JFaceResources.HEADER_FONT));
        if (!DBWorkbench.getPlatform().getApplication().isStatisticsCollectionRequired()) {
                SelectionListener.widgetSelectedAdapter(selectionEvent -> {
        if (doNotShareDataButton.getSelection()) {
 * You may obtain a copy of the License at
        Composite composite = UIUtils.createComposite(dialogArea, 1);
 *
import org.eclipse.swt.widgets.Composite;
        super(parentShell, StatisticCollectionMessages.statistic_collection_dialog_title, DBIcon.STATUS_INFO);
            UIUtils.createLink(

import org.jkiss.dbeaver.runtime.DBWorkbench;
}
    public StatisticsCollectionConfirmDialog(Shell parentShell) {

                    Shell parentShell = getParentShell();
        UIUtils.createHorizontalLine(composite);
 * limitations under the License.
import org.jkiss.dbeaver.model.DBIcon;
import org.jkiss.dbeaver.ui.internal.statistics.StatisticCollectionMessages;
        }
            UIUtils.createInfoLabel(composite, "You cannot opt-out from data sharing in this version of DBeaver.");
 * Unless required by applicable law or agreed to in writing, software
