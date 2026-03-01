import org.eclipse.swt.layout.GridData;
    }
    public void createControl(Composite parent) {
        return (producerSettingsPage == null || producerSettingsPage.isPageComplete()) &&
        {
import org.eclipse.swt.SWT;
        }
    }

    @Override
            Composite settingPanel = new Composite(consumerGroup, SWT.NONE);
                title.append(", ").append(dtSettings.getProcessor().getName());
    DataTransferPageSettings() {
            title.append(")");
 * You may obtain a copy of the License at
        Composite settingsComposite = composite;
        }
 * you may not use this file except in compliance with the License.

        createSettingsPages(composite);
import org.jkiss.dbeaver.tools.transfer.DataTransferPipe;
    }
            consumerSettingsPage.createControl(settingPanel);
            producerSettingsPage.createControl(settingPanel);
        title.append(DTMessages.data_transfer_wizard_settings_title).append(" (").append(producerName).append(" to ").append(consumerName);
            if (dtSettings.getProcessor() != null) {
 */

            sash.setLayoutData(new GridData(GridData.FILL_BOTH));
            setTitle(title.toString());
        }
package org.jkiss.dbeaver.tools.transfer.ui.wizard;
    @Override
    }
import org.jkiss.dbeaver.tools.transfer.IDataTransferNode;
            Composite producerGroup = UIUtils.createPlaceholder(settingsComposite, 1);
    public void activatePage()
            ((ActiveWizardPage) consumerSettingsPage).deactivatePage();
            title.append(", ").append(dtSettings.getProcessor().getName());
        DataTransferWizard.NodePageSettings producerInfo = getWizard().getNodeInfo(node);
    }
/**
    }
        if (producerSettingsPage != null && consumerSettingsPage != null) {
 *
import org.jkiss.dbeaver.ui.dialogs.ActiveWizardPage;
        }
        if (dtSettings.getProcessor() != null) {
/*

 *
        setControl(composite);
            StringBuilder title = new StringBuilder();
            SashForm sash = new SashForm(composite, SWT.HORIZONTAL);
        }

        if (consumerSettingsPage instanceof ActiveWizardPage) {

            settingPanel.setLayoutData(new GridData(GridData.FILL_BOTH));
 * distributed under the License is distributed on an "AS IS" BASIS,
        setDescription(DTMessages.data_transfer_wizard_settings_description);
 *
            DataTransferPipe dataPipe = dtSettings.getDataPipes().get(0);
            producerSettingsPage = getSettingsPage(dataPipe.getProducer());
import org.eclipse.swt.custom.SashForm;
            String producerName = dtSettings.getProducer() == null ? "null" : dtSettings.getProducer().getName();
    @Override
    private IWizardPage producerSettingsPage;
        if (producerSettingsPage != null) {
        composite.layout(true, true);
            ((ActiveWizardPage) producerSettingsPage).deactivatePage();
        setTitle(DTMessages.data_transfer_wizard_settings_title);

        super(DTMessages.data_transfer_wizard_settings_name);
            }

        if (producerSettingsPage instanceof ActiveWizardPage) {
        String consumerName = dtSettings.getConsumer() == null ? "null" : dtSettings.getConsumer().getName();
        title.append(")");
 *     http://www.apache.org/licenses/LICENSE-2.0
            consumerSettingsPage = getSettingsPage(dataPipe.getConsumer());
    private IWizardPage consumerSettingsPage;
                ((ActiveWizardPage) producerSettingsPage).activatePage();
} * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
    @Override
        StringBuilder title = new StringBuilder();
    {
import org.jkiss.dbeaver.ui.UIUtils;

        Composite composite = (Composite) getControl();
 */
    @Override
import org.jkiss.dbeaver.tools.transfer.DataTransferSettings;
            UIUtils.createInfoLabel(consumerGroup, consumerSettingsPage.getTitle());


import org.eclipse.jface.wizard.IWizardPage;
 * Unless required by applicable law or agreed to in writing, software
        }

 * limitations under the License.

            String consumerName = dtSettings.getConsumer() == null ? "null" : dtSettings.getConsumer().getName();
            UIUtils.createInfoLabel(producerGroup, producerSettingsPage.getTitle());
        String producerName = dtSettings.getProducer() == null ? "null" : dtSettings.getProducer().getName();
            title.append(DTMessages.data_transfer_wizard_settings_title).append(" (").append(producerName).append(" to ").append(consumerName);
            settingPanel.setLayout(new FillLayout());
            Composite settingPanel = new Composite(producerGroup, SWT.NONE);
 * Licensed under the Apache License, Version 2.0 (the "License");
        updatePageCompletion();
                ((ActiveWizardPage) consumerSettingsPage).activatePage();

import org.eclipse.swt.widgets.Composite;
            }
    }
            settingPanel.setLayout(new FillLayout());
    public void deactivatePage() {
    }


            Composite consumerGroup = UIUtils.createPlaceholder(settingsComposite, 1);
 * This page hosts other settings pages.

        }
            settingPanel.setLayoutData(new GridData(GridData.FILL_BOTH));
        Composite composite = UIUtils.createComposite(parent, 1);
            consumerSettingsPage.setWizard(getWizard());
        initializeDialogUnits(parent);


            if (producerSettingsPage instanceof ActiveWizardPage) {
 * Since 21.2.5 we don't use composite page anymore.
        DataTransferSettings dtSettings = getWizard().getSettings();
    private IWizardPage getSettingsPage(IDataTransferNode node) {
            producerSettingsPage.setWizard(getWizard());
class DataTransferPageSettings extends ActiveWizardPage<DataTransferWizard> {
    public String getTitle() {
            (consumerSettingsPage == null || consumerSettingsPage.isPageComplete());
        return producerInfo == null ? null : producerInfo.settingsPage;
import org.eclipse.swt.layout.FillLayout;
            settingsComposite = sash;

        return title.toString();

import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;
        DataTransferSettings dtSettings = getWizard().getSettings();

        UIUtils.disposeChildControls(composite);
            }

 * Copyright (C) 2010-2024 DBeaver Corp and others
            if (consumerSettingsPage instanceof ActiveWizardPage) {
        if (consumerSettingsPage != null) {

@Deprecated
    {
 * See the License for the specific language governing permissions and
    protected boolean determinePageCompletion()
    private void createSettingsPages(Composite composite) {

