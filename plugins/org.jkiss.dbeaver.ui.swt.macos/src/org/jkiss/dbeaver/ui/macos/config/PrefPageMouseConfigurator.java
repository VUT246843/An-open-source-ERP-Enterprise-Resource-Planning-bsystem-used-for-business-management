            Composite group = UIUtils.createTitledComposite(parent, "Mouse pointer", 2, GridData.FILL_HORIZONTAL);

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
 * DBeaver - Universal Database Manager
            GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);

    public void resetSettings(@NotNull PrefPageMiscellaneousAbstract prefPageMiscellaneousAbstract) {

        store.setValue(CocoaUIService.PREF_TOOLTIP_DELAY, tooltipDelayText.getText());

            tooltipDelayText.setEnabled(false);
import org.jkiss.dbeaver.ui.IObjectPropertyConfigurator;
        store.setValue(CocoaUIService.PREF_TOOLTIP_DELAY_ENABLED, tooltipDelayCheck.getSelection());
    @Override

    private Button tooltipDelayCheck;
    public void loadSettings(@NotNull PrefPageMiscellaneousAbstract prefPageMiscellaneousAbstract) {
 * Unless required by applicable law or agreed to in writing, software
    }
        DBPPreferenceStore store = ModelPreferences.getPreferences();
            gd.widthHint = UIUtils.getFontHeight(tooltipDelayText) * 5;

 * See the License for the specific language governing permissions and
            tooltipDelayText.setLayoutData(gd);
 * You may obtain a copy of the License at
import org.eclipse.swt.layout.GridData;
    @Override

public class PrefPageMouseConfigurator implements
 *
        tooltipDelayText.setText(store.getString(CocoaUIService.PREF_TOOLTIP_DELAY));
 *
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.jkiss.code.NotNull;
                public void widgetSelected(SelectionEvent e) {
    private Text tooltipDelayText;
        }
import org.eclipse.swt.events.SelectionEvent;
            tooltipDelayCheck = UIUtils.createCheckbox(group, "Set tooltip delay (ms)", false);
 * you may not use this file except in compliance with the License.
/**
        tooltipDelayText.setEnabled(tooltipDelayCheck.getSelection());
 * Copyright (C) 2010-2026 DBeaver Corp and others

import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.ModelPreferences;
import org.jkiss.dbeaver.ui.UIUtils;
package org.jkiss.dbeaver.ui.macos.config;

 */
import org.jkiss.dbeaver.ui.preferences.PrefPageMiscellaneousAbstract;

    }
    }
 *
    public boolean isComplete() {
        {
            });
    public void createControl(@NotNull Composite parent, PrefPageMiscellaneousAbstract object, @NotNull Runnable propertyChangeListener) {
 * limitations under the License.
            tooltipDelayCheck.setSelection(store.getInt(CocoaUIService.PREF_TOOLTIP_DELAY) > 0);
}
        return true;
            tooltipDelayCheck.setLayoutData(new GridData());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.macos.CocoaUIService;
            tooltipDelayCheck.addSelectionListener(new SelectionAdapter() {

/*
        CocoaUIService.updateTooltipDefaults();
        final DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
    }
import org.eclipse.swt.events.SelectionAdapter;
    @Override
        DBPPreferenceStore store = ModelPreferences.getPreferences();
    @Override
    public void saveSettings(@NotNull PrefPageMiscellaneousAbstract prefPageMiscellaneousAbstract) {
    IObjectPropertyConfigurator<PrefPageMiscellaneousAbstract, PrefPageMiscellaneousAbstract> {
            tooltipDelayText.setText(String.valueOf(store.getInt(CocoaUIService.PREF_TOOLTIP_DELAY)));

import org.eclipse.swt.widgets.Text;
 * PrefPageMouseConfigurator
 *     http://www.apache.org/licenses/LICENSE-2.0

    }
                }

                @Override
                    tooltipDelayText.setEnabled(tooltipDelayCheck.getSelection());

        tooltipDelayCheck.setSelection(store.getBoolean(CocoaUIService.PREF_TOOLTIP_DELAY_ENABLED));
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
import org.eclipse.swt.SWT;
            tooltipDelayText = new Text(group, SWT.BORDER);

