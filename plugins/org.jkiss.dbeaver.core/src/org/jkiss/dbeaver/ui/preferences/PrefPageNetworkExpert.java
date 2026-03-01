 * Copyright (C) 2010-2025 DBeaver Corp and others
        debugNetworkConnectionsCheck = UIUtils.createCheckbox(
    private Combo prefIpAddressesCombo;
 * Licensed under the Apache License, Version 2.0 (the "License");
            null,
            CoreMessages.pref_page_network_expert_debug_net_tip,
            composite,
            2
    protected void performDefaults() {
import org.eclipse.swt.SWT;
        );
            SWT.READ_ONLY | SWT.DROP_DOWN
    protected Control createPreferenceContent(@NotNull Composite parent) {
    public boolean performOk() {
            DBeaverIcons.getImage(DBIcon.SMALL_WARNING)
    }

            prefIpStackCombo.add(type.toString());
    @Override
        Composite composite = new Composite(parent, SWT.NONE);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        UIUtils.createInfoLabel(composite, CoreMessages.pref_page_ui_general_label_options_take_effect_after_restart, SWT.NONE, 2);
import org.eclipse.jface.layout.GridLayoutFactory;
                NLS.bind(CoreMessages.pref_page_network_expert_restart_prompt_title, GeneralUtils.getProductName()),

 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
 *

 *
            }
            SWT.NONE,
    @Override
    }
/*
    public void init(IWorkbench workbench) {
    }
        }

        if (preferredIpStack != ModelPreferences.IPType.getPreferredStack() ||
 */
                NLS.bind(CoreMessages.pref_page_network_expert_restart_prompt_message, GeneralUtils.getProductName())

        );

            debugNetwork != ModelPreferences.getPreferences().getBoolean(ModelPreferences.PROP_DEBUG_NETWORK_CONNECTIONS)
            composite,
        }
        }
        prefIpAddressesCombo.setLayoutData(new GridData());
        prefIpStackCombo = UIUtils.createLabelCombo(
        return super.performOk();
            store.setValue(ModelPreferences.PROP_PREFERRED_IP_ADDRESSES, preferredAddresses.name());
}
            ModelPreferences.getPreferences().getBoolean(ModelPreferences.PROP_DEBUG_NETWORK_CONNECTIONS),
 * Unless required by applicable law or agreed to in writing, software


package org.jkiss.dbeaver.ui.preferences;
            prefIpAddressesCombo.add(type.toString());

        prefIpStackCombo.setLayoutData(new GridData());
            )) {

            preferredAddresses != ModelPreferences.IPType.getPreferredAddresses() ||
    @NotNull
            store.setValue(ModelPreferences.PROP_PREFERRED_IP_STACK, preferredIpStack.name());
import org.eclipse.osgi.util.NLS;
        for (ModelPreferences.IPType type : ModelPreferences.IPType.values()) {
 * DBeaver - Universal Database Manager
        prefIpAddressesCombo.select(ModelPreferences.IPType.getPreferredAddresses().ordinal());
        debugNetworkConnectionsCheck.setSelection(false);
            CoreMessages.pref_page_network_expert_label,
            store.setValue(ModelPreferences.PROP_DEBUG_NETWORK_CONNECTIONS, debugNetwork);
import org.eclipse.ui.IWorkbench;
        var preferredIpStack = ModelPreferences.IPType.values()[prefIpStackCombo.getSelectionIndex()];
            2,
            CoreMessages.pref_page_network_expert_preferred_ip_stack_tip,
import org.eclipse.swt.widgets.*;
import org.jkiss.dbeaver.ui.DBeaverIcons;
    @Override
            CoreMessages.pref_page_network_expert_preferred_ip_addresses_label,
        prefIpAddressesCombo.select(ModelPreferences.IPType.AUTO.ordinal());
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.core.CoreMessages;
        var debugNetwork = debugNetworkConnectionsCheck.getSelection();

        prefIpAddressesCombo = UIUtils.createLabelCombo(
            if (UIUtils.confirmAction(
        prefIpStackCombo.select(ModelPreferences.IPType.AUTO.ordinal());

    private Button debugNetworkConnectionsCheck;
        return composite;
        for (ModelPreferences.IPType type : ModelPreferences.IPType.values()) {
import org.jkiss.dbeaver.utils.GeneralUtils;
            SWT.READ_ONLY | SWT.DROP_DOWN
        new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL)
    private Combo prefIpStackCombo;
        composite.setLayoutData(new GridData());
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.DBIcon;
public class PrefPageNetworkExpert extends AbstractPrefPage implements IWorkbenchPreferencePage {

            CoreMessages.pref_page_network_expert_debug_net_label,
import org.jkiss.dbeaver.ModelPreferences;
                restartWorkbenchOnPrefChange();
 *     http://www.apache.org/licenses/LICENSE-2.0
            CoreMessages.pref_page_network_expert_preferred_ip_stack_label,
    }

 *
 * You may obtain a copy of the License at
        // nothing to initialize
        ) {

 * limitations under the License.
        );
    @Override
import org.jkiss.dbeaver.ui.UIUtils;
        super.performDefaults();
        prefIpStackCombo.select(ModelPreferences.IPType.getPreferredStack().ordinal());
            .setLayoutData(GridDataFactory.fillDefaults().grab(true, false).span(2, 1).create());
import org.eclipse.swt.layout.GridData;
        var preferredAddresses = ModelPreferences.IPType.values()[prefIpAddressesCombo.getSelectionIndex()];
            CoreMessages.pref_page_network_expert_preferred_ip_addresses_tip,
import org.eclipse.jface.layout.GridDataFactory;
        DBPPreferenceStore store = ModelPreferences.getPreferences();
        UIUtils.createInfoLabel(

                getShell(),

            composite,
            composite,
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        composite.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
import org.eclipse.ui.IWorkbenchPreferencePage;
        );
