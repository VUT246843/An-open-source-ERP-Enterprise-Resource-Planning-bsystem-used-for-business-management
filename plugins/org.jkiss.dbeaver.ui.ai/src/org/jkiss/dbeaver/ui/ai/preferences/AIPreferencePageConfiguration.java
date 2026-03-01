import org.jkiss.code.NotNull;
        return true;
                formatterConfigurator = cfgDescriptor.createConfigurator();

        formatterConfigurator.loadSettings(this.settings);
import org.jkiss.dbeaver.ui.UIUtils;
        AISettingsManager.getInstance().saveSettings(this.settings);
            ddlGenerator = new AISchemaGeneratorImpl();
    public void init(IWorkbench workbench) {
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.ai.config";
    protected Control createPreferenceContent(@NotNull Composite parent) {
/*
        }


            return;
    @Override
import org.jkiss.dbeaver.model.ai.registry.AIAssistantRegistry;

        }
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
import org.jkiss.dbeaver.model.ai.registry.AISettingsManager;
 * Copyright (C) 2010-2025 DBeaver Corp and others
            try {
        if (!hasAccessToPage()) {
            return false;
import org.jkiss.dbeaver.model.ai.AISettings;
    public void setElement(IAdaptable element) {
 * DBeaver - Universal Database Manager
        }
import org.eclipse.ui.IWorkbenchPropertyPage;



 * Licensed under the Apache License, Version 2.0 (the "License");
        UIPropertyConfiguratorDescriptor cfgDescriptor =

            } catch (DBException e) {

        performDefaults();
import java.io.IOException;
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,

        serviceComposite.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
import org.eclipse.swt.widgets.Control;
            ddlGenerator = AIAssistantRegistry.getInstance().getDescriptor().createSchemaGenerator();
        if (!hasAccessToPage()) {
        Composite serviceComposite = UIUtils.createComposite(composite, 2);
import org.eclipse.ui.IWorkbenchPreferencePage;
 * you may not use this file except in compliance with the License.
    }
        } catch (IOException e) {
 */
        try {

        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
    }

            UIPropertyConfiguratorRegistry.getInstance().getDescriptor(ddlGenerator.getClass().getName());
import org.eclipse.core.runtime.IAdaptable;
    protected boolean hasAccessToPage() {
    }
    @NotNull
import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
import org.jkiss.dbeaver.model.rm.RMConstants;
import org.jkiss.dbeaver.registry.configurator.UIPropertyConfiguratorRegistry;
import org.jkiss.dbeaver.ui.ai.format.DefaultFormattingConfigurator;
public class AIPreferencePageConfiguration extends AbstractPrefPage implements IWorkbenchPreferencePage, IWorkbenchPropertyPage {
import org.jkiss.dbeaver.DBException;
    public AIPreferencePageConfiguration() {
    }
import org.eclipse.swt.layout.GridData;
    }
        if (cfgDescriptor != null) {
        formatterConfigurator.saveSettings(this.settings);
import org.jkiss.dbeaver.model.ai.AISchemaGenerator;

    public boolean performOk() {
    }

            store.save();
    @Override
}
    private AISchemaGenerator ddlGenerator;
            log.error("Formatter not found", e);

        }
        }
        return settings;
import org.jkiss.dbeaver.Log;
 * You may obtain a copy of the License at
import org.eclipse.swt.widgets.Composite;
    @Override
    private static final Log log = Log.getLog(AIPreferencePageConfiguration.class);
    private IObjectPropertyConfigurator<AISchemaGenerator, AISettings> formatterConfigurator;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
        }
    @Override
 *
        this.settings = AISettingsManager.getInstance().getSettings();
        return composite;
                log.error(e);
        } catch (DBException e) {
    }
            formatterConfigurator = new DefaultFormattingConfigurator();
    @Override
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
        try {

        if (formatterConfigurator == null) {
    protected void performDefaults() {

import org.jkiss.dbeaver.ui.IObjectPropertyConfigurator;
    @Override
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.ui.IWorkbench;
 *
        return DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_CONFIGURATION_MANAGER);
import org.jkiss.dbeaver.model.ai.impl.AISchemaGeneratorImpl;
import org.jkiss.dbeaver.registry.configurator.UIPropertyConfiguratorDescriptor;

        formatterConfigurator.createControl(composite, ddlGenerator, () -> {});
package org.jkiss.dbeaver.ui.ai.preferences;
        Composite composite = UIUtils.createComposite(parent, 1);
 *

            log.debug(e);
    public IAdaptable getElement() {
    private final AISettings settings;
            }
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.preferences.AbstractPrefPage;
