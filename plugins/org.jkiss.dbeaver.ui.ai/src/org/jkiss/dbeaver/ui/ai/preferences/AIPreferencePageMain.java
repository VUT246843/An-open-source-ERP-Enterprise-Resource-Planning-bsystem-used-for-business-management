

    private EngineConfiguratorPage activeEngineConfiguratorPage;
            AIUIMessages.gpt_preference_page_ai_connection_test_connection_error_title,

    }
        if (serviceCombo.getSelectionIndex() == -1 && defaultEngineSelection != -1) {

    protected boolean hasAccessToPage() {
import org.eclipse.swt.events.SelectionEvent;
            drawConfiguratorComposite(this.settings.activeEngine(), engineGroup);
                configurator.loadSettings(settings);
        AISettingsManager.getInstance().saveSettings(this.settings);
            composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                String engineId = serviceCombo.getText();
    private void createTestConnectionButton(@NotNull Composite parent) {
    private void showConnectionErrorMessage(Throwable ex, String engineId) {
import org.jkiss.dbeaver.model.ai.AISettings;
import org.jkiss.dbeaver.DBException;
                e
        );
    private final Map<String, EngineConfiguratorPage> engineConfiguratorMapping = new HashMap<>();
            log.error("Error saving engine settings", e);
            return;
                        false
 * You may obtain a copy of the License at
        }
 *
                log.error(e);
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Button;
                String id = serviceNameMappings.get(serviceCombo.getText());
 * See the License for the specific language governing permissions and
    }

        return this.settings;
        return true;
        try {
    protected void performDefaults() {
        Composite engineGroup = UIUtils.createTitledComposite(
            if (engineConfigurator == null) {
package org.jkiss.dbeaver.ui.ai.preferences;
        }
                "Error saving engine settings for " + activeEngineId,
        try (
            2);
import org.eclipse.ui.IWorkbenchPreferencePage;
    public AIPreferencePageMain() {
        private void loadSettings(AIEngineProperties settings) {
import org.eclipse.swt.SWT;
            activeEngineConfiguratorPage.loadSettings(this.settings.getEngineConfiguration(id));
            ex
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
            engineConfiguratorMapping.put(id, activeEngineConfiguratorPage);
                UIUtils.resizeShell(parent.getShell());
    private static final Log log = Log.getLog(AIPreferencePageMain.class);


            return Optional
import org.jkiss.dbeaver.model.ai.engine.AIEngine;
    private final AISettings settings;
        List<AIEngineDescriptor> completionEngines = AIEngineRegistry.getInstance()
            UIPropertyConfiguratorRegistry.getInstance().getDescriptor(completionEngine.getEngineObjectType().getImplName());
    }

                drawConfiguratorComposite(id, engineGroup);


import org.eclipse.osgi.util.NLS;
            GridData.FILL_HORIZONTAL
            return false;
                }
            AIUIMessages.gpt_preference_page_checkbox_enable_ai_tip,
                return engineDescriptor.createConfigurator();
            AIIObjectPropertyConfigurator<AIEngineDescriptor, AIEngineProperties> engineConfigurator
            activeEngineConfiguratorPage = new EngineConfiguratorPage(engineConfigurator);
                    );
        ) {
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                engineGroup.getShell().layout(true, true);
        if (completionEngine != null) {
import org.jkiss.dbeaver.ui.ai.internal.AIUIMessages;
import java.lang.reflect.InvocationTargetException;
}

        return null;
    @NotNull
    private AIIObjectPropertyConfigurator<AIEngineDescriptor, AIEngineProperties> createEngineConfigurator() {

        Composite composite = UIUtils.createComposite(parent, 1);
import org.jkiss.dbeaver.ui.preferences.AbstractPrefPage;
            }
    }
            activeEngineConfiguratorPage.createControl(engineGroup, completionEngine);
            }
        private void disposeControl() {
        private void createControl(Composite parent, AIEngineDescriptor engine) {

            }
            if (configurator != null) {
            DBWorkbench.getPlatformUI().showError(
            "Engine Settings",
    private Button enableAICheck;
            if (completionEngines.get(i).getId().equals(this.settings.activeEngine())) {
                log.error("Engine configurator not found for " + completionEngine.getId());
import org.jkiss.dbeaver.ui.UIUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");
        );
        Composite serviceComposite = UIUtils.createComposite(composite, 2);
            }

        }
    @Override


                configurator.createControl(composite, engine, () -> {});
 */
        }
import org.jkiss.dbeaver.model.ai.registry.AIEngineDescriptor;
        int defaultEngineSelection = -1;
        }
import org.eclipse.ui.IWorkbenchPropertyPage;
 * DBeaver - Universal Database Manager
            } catch (DBException e) {

    @Override

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.core.runtime.IAdaptable;
        });
            connectionTestButton.setEnabled(activeEngineConfiguratorPage.getCurrentProperties().isPresent());
                completionEngine = AIEngineRegistry.getInstance().getEngineDescriptor(id);
        private Optional<AIEngineProperties> getCurrentProperties() {
import org.jkiss.dbeaver.registry.configurator.UIPropertyConfiguratorDescriptor;
            );
                    DBWorkbench.getPlatformUI().showMessageBox(
            composite.dispose();
    public void init(IWorkbench workbench) {
            .getCompletionEngines();
        }
 * Copyright (C) 2010-2026 DBeaver Corp and others
    public boolean performOk() {

        completionEngine = AIEngineRegistry.getInstance().getEngineDescriptor(activeEngine);

                    testConnection();
            if (completionEngines.get(i).isDefault()) {
import org.eclipse.ui.IWorkbench;
        } catch (DBException e) {
            if (configurator != null) {
    }
    protected Control createPreferenceContent(@NotNull Composite parent) {
    private void testConnection() throws DBException, InterruptedException, InvocationTargetException {
        }
            false,
                defaultEngineSelection = i;
    private final Map<String, String> serviceNameMappings = new HashMap<>();
                "Error loading AI settings",
                } catch (DBException e) {
/*
import org.jkiss.dbeaver.model.rm.RMConstants;
    private void drawConfiguratorComposite(@NotNull String id, @NotNull Composite engineGroup) {
    }
        } catch (IOException e) {
            store.save();
import org.jkiss.dbeaver.runtime.DBWorkbench;
        performDefaults();
            activeEngineConfiguratorPage.saveSettings(engineConfiguration);
    private Button connectionTestButton;
    @Override

        serviceCombo.addSelectionListener(new SelectionAdapter() {
            })
        if (!hasAccessToPage()) {
    }
                try {

    }


    @Override
        return composite;
            this.configurator = configurator;
        }
        for (int i = 0; i < completionEngines.size(); i++) {
        private final AIIObjectPropertyConfigurator<AIEngineDescriptor, AIEngineProperties> configurator;

import org.eclipse.swt.widgets.Composite;
            NLS.bind(AIUIMessages.gpt_preference_page_ai_connection_test_connection_error_message, engineId),
public class AIPreferencePageMain extends AbstractPrefPage implements IWorkbenchPreferencePage, IWorkbenchPropertyPage {

        completionEngines.sort(Comparator.comparing(AIEngineDescriptor::getLabel));
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
    }
    @Override

        try {
        if (!hasAccessToPage()) {
            AIEngine selectedEngine = currentProperties.isPresent()
        private Composite composite;
            if (configurator != null) {

import org.eclipse.swt.events.SelectionListener;
    }
        if (engineDescriptor != null) {
                serviceCombo.select(i);
                try {
    }

        this.settings.setActiveEngine(activeEngineId);
        activeEngineConfiguratorPage = engineConfiguratorMapping.get(id);
 *
import org.jkiss.dbeaver.model.ai.registry.AISettingsManager;


    @Override
            }
                    activeEngineConfiguratorPage.disposeControl();
 * you may not use this file except in compliance with the License.
                .ofNullable(configurator)
            SelectionListener.widgetSelectedAdapter(e -> {
import org.jkiss.dbeaver.Log;
        String activeEngineId = serviceNameMappings.get(serviceCombo.getText());
                        AIUIMessages.gpt_preference_page_ai_connection_test_connection_success_title,
 * Unless required by applicable law or agreed to in writing, software
        } catch (DBException e) {
import org.eclipse.swt.events.SelectionAdapter;
                "Error saving AI settings",
        enableAICheck.setSelection(!this.settings.isAiDisabled());
 *
 * limitations under the License.
        return DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_CONFIGURATION_MANAGER);
            log.debug(e);
        }
            serviceCombo.add(completionEngines.get(i).getLabel());
                } catch (InvocationTargetException ex) {
        } else {

            UIUtils.getDialogRunnableContext().run(true, true, monitor -> {
    private Combo serviceCombo;
            });
                e
        UIPropertyConfiguratorDescriptor engineDescriptor =

        this.settings.setAiDisabled(!enableAICheck.getSelection());


import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
            AIEngineProperties engineConfiguration = this.settings.getEngineConfiguration(activeEngineId);
        );
            activeEngineConfiguratorPage.createControl(engineGroup, completionEngine);
    @Override
            AIUIMessages.gpt_preference_page_checkbox_enable_ai_label,
import org.jkiss.dbeaver.registry.configurator.UIPropertyConfiguratorRegistry;
        connectionTestButton = UIUtils.createPushButton(
        this.settings = AISettingsManager.getInstance().getSettings();

    public void setElement(IAdaptable element) {

                if (activeEngineConfiguratorPage != null) {
            }
                            engineId
        try {
        serviceComposite.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
                    showConnectionErrorMessage(ex, engineId);
                    selectedEngine.getModels(monitor);
                }
            AIUIMessages.gpt_preference_page_ai_connection_test_label,
            }
        }
        }
                        ),
            serviceNameMappings.put(completionEngines.get(i).getLabel(), completionEngines.get(i).getId());
                : completionEngine.createEngineInstance()
            composite,
                ? completionEngine.createEngineInstance(currentProperties.get())
        }
        EngineConfiguratorPage(@Nullable AIIObjectPropertyConfigurator<AIEngineDescriptor, AIEngineProperties> configurator) {
                configurator.saveSettings(settings);
        enableAICheck = UIUtils.createCheckbox(
            try {
                } catch (DBException | InterruptedException ex) {
            this.settings.setEngineConfiguration(activeEngineId, engineConfiguration);
                        NLS.bind(
                            AIUIMessages.gpt_preference_page_ai_connection_test_connection_success_message,

            null,
        connectionTestButton.setEnabled(activeEngineConfiguratorPage.getCurrentProperties().isPresent());
        if (Objects.nonNull(connectionTestButton)) {
import java.util.*;
    }
            2,
        }
            public void widgetSelected(SelectionEvent e) {
                .flatMap(AIIObjectPropertyConfigurator::getCurrentProperties);
        }
                = createEngineConfigurator();
        }
    }
            composite,
import java.io.IOException;
    @Nullable
                    throw new InvocationTargetException(e);
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
            }

    public IAdaptable getElement() {
        private void saveSettings(AIEngineProperties settings) {
import org.eclipse.swt.widgets.Combo;
    private static class EngineConfiguratorPage {
        }
        serviceCombo = UIUtils.createLabelCombo(serviceComposite, "Engine", SWT.DROP_DOWN | SWT.READ_ONLY);
            @Override
        DBWorkbench.getPlatformUI().showError(
                }
    }
            serviceCombo.select(defaultEngineSelection);
            );
            DBWorkbench.getPlatformUI().showError(
    private AIEngineDescriptor completionEngine;
import org.jkiss.dbeaver.model.ai.engine.AIEngineProperties;
        String activeEngine = this.settings.activeEngine();
                    showConnectionErrorMessage(ex.getCause(), engineId);
        }
        Optional<AIEngineProperties> currentProperties = activeEngineConfiguratorPage.getCurrentProperties();
            composite = UIUtils.createComposite(parent, 1);
                "Error loading engine settings for " + id,
        createTestConnectionButton(composite);
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.ai";
        if (activeEngineConfiguratorPage == null) {

import org.eclipse.swt.layout.GridData;
import org.jkiss.dbeaver.model.ai.registry.AIEngineRegistry;
            parent,
