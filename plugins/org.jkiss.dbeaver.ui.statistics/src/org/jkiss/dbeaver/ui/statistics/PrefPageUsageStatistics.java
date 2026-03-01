            StatisticCollectionMessages.statistic_collection_pref_send_btn_label,
            SelectionListener.widgetSelectedAdapter(selectionEvent -> ShellUtils.launchProgram(LINK_STATISTIC_DETAILS)));
    @Override
    private Button checkSendUsageStatistics;
import org.jkiss.code.NotNull;
    @Override
import org.jkiss.dbeaver.runtime.DBWorkbench;

import org.eclipse.swt.widgets.Button;
import org.jkiss.dbeaver.ui.internal.statistics.StatisticCollectionMessages;
            group,
    public boolean performOk() {

public class PrefPageUsageStatistics extends AbstractPrefPage implements IWorkbenchPreferencePage, IWorkbenchPropertyPage {
}    // Disabled for now. It is too annoying UIX
import org.eclipse.ui.IWorkbenchPropertyPage;
        if (DBWorkbench.getPlatform().getApplication().isStatisticsCollectionRequired()) {
            GridData.FILL_HORIZONTAL,
import org.eclipse.osgi.util.NLS;
 * Unless required by applicable law or agreed to in writing, software
    }
import org.jkiss.dbeaver.ui.ShellUtils;
        UIUtils.createLink(group, StatisticCollectionMessages.statistic_collection_pref_content_datashare_msg,
            composite,
    public static final String LINK_STATISTIC_DETAILS = "https://dbeaver.com/privacy/";
 */
        checkSendUsageStatistics.setSelection(UIStatisticsActivator.isTrackingEnabled());
    public void init(IWorkbench workbench) {
 */
import org.eclipse.swt.layout.GridData;
        return composite;
    }
import org.eclipse.core.runtime.IAdaptable;
package org.jkiss.dbeaver.ui.statistics;
        super.performDefaults();
import org.eclipse.ui.IWorkbenchPreferencePage;
    }

        checkSendUsageStatistics = UIUtils.createCheckbox(
        UIUtils.createEmptyLabel(group, 1, 1);
        UIStatisticsActivator.setTrackingEnabled(checkSendUsageStatistics.getSelection());
    }
        performDefaults();

        createDataShareComposite(group);
import org.eclipse.swt.events.SelectionListener;


    @Override
 * See the License for the specific language governing permissions and
            NLS.bind(StatisticCollectionMessages.statistic_collection_pref_content_opensource_link, LINK_GIHUB_REPO),
            checkSendUsageStatistics.setEnabled(false);
 * you may not use this file except in compliance with the License.
    //private Button checkShowStatisticsDetails;
    public IAdaptable getElement() {

 *     http://www.apache.org/licenses/LICENSE-2.0
    public static void createDataShareComposite(Composite group) {
    public static final String LINK_GIHUB_REPO = "https://github.com/dbeaver/dbeaver";
            SWT.DEFAULT);
    @Override
 * You may obtain a copy of the License at
    }

 *
 *
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
    @Override
 * Copyright (C) 2010-2026 DBeaver Corp and others
        return null;
            false);
    protected Control createPreferenceContent(@NotNull Composite parent) {
        Composite composite = UIUtils.createPlaceholder(parent, 1);
        UIUtils.createLink(group,
        return super.performOk();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    protected void performDefaults() {

            StatisticCollectionMessages.statistic_collection_pref_group_label,

 * DBeaver - Universal Database Manager
    @Override

/**
import org.eclipse.ui.IWorkbench;

import org.eclipse.swt.widgets.Control;
import org.jkiss.dbeaver.ui.UIUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * PrefPageUsageStatistics
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.main.usageStatistics"; //$NON-NLS-1$
        UIUtils.createLink(group, StatisticCollectionMessages.statistic_collection_pref_content_documentation_link,
        UIUtils.createLabel(group, StatisticCollectionMessages.statistic_collection_pref_content_main_msg);
    }
            SelectionListener.widgetSelectedAdapter(selectionEvent -> ShellUtils.launchProgram(LINK_PRIVACY_INFO)));
        }

 *

import org.eclipse.swt.SWT;
    public static final String LINK_PRIVACY_INFO = "https://dbeaver.com/privacy/";
import org.jkiss.dbeaver.ui.preferences.AbstractPrefPage;
        Composite group = UIUtils.createTitledComposite(
            SelectionListener.widgetSelectedAdapter(selectionEvent -> ShellUtils.launchProgram(LINK_GIHUB_REPO)));
    public void setElement(IAdaptable element) {
import org.eclipse.swt.widgets.Composite;
            UIUtils.createInfoLabel(composite, "You cannot opt-out from data sharing in this version of DBeaver.");
            UIUtils.createEmptyLabel(composite, 1, 1);
 * limitations under the License.
        UIUtils.createEmptyLabel(group, 1, 1);

            1,
