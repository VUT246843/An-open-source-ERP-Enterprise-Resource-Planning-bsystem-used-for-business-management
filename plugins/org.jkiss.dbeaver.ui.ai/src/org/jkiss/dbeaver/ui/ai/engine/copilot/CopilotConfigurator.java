
import org.eclipse.swt.widgets.Composite;
 * Copyright (C) 2010-2026 DBeaver Corp and others
    protected final CachedValue<List<AIModel>> modelsCache = new CachedValue<>(this::fetchCopilotModels);
                .toList();
import org.jkiss.code.NotNull;

 *
        createConnectionParameters(composite);
        return CopilotConstants.BASE_AUTH_URL;
        try (CopilotCompletionEngine engine = createEngine()) {
import org.jkiss.dbeaver.ui.ai.internal.AIUIMessages;
                    );
import org.eclipse.swt.events.SelectionEvent;

    }
        saveSettings((PROPERTIES) copilotPropertiesCopy);
        properties.setTemperature(CommonUtils.toDouble(temperature));
                        future.complete(null);
import org.jkiss.dbeaver.ui.ai.model.ModelSelectorField;
    public boolean isComplete() {

package org.jkiss.dbeaver.ui.ai.engine.copilot;
                accessToken = UIUtils.runWithDialog(monitor -> {
        accessToken = CommonUtils.toString(configuration.getToken(), "");
                SWT.ICON_INFORMATION

        }
        logQueryCheck.addSelectionListener(new SelectionAdapter() {
    @Override
    @NotNull
                CopilotMessages.oauth_auth_success_message,
    public void loadSettings(@NotNull PROPERTIES configuration) {
                    .ifPresentOrElse(
            } catch (DBException ex) {
        CopilotProperties copilotPropertiesCopy = new CopilotProperties();
        properties.setToken(accessToken);
    implements AIIObjectPropertyConfigurator<ENGINE, PROPERTIES> {
    private ModelSelectorField modelSelectorField;
        modelSelectorField.refreshModelListSilently(true);

                CopilotModels.getModelByName(modelSelectorField.getSelectedModel())
            throw new DBException("Authorization was interrupted", e);
        });
            modelSelectorField.refreshModelListSilently(true);
    }
    @Override
        properties.setContextWindowSize(contextWindowSizeField.getValue());
 *     http://www.apache.org/licenses/LICENSE-2.0
    private boolean logQuery = false;
    }
    public void saveSettings(@NotNull PROPERTIES properties) {
            2
import java.util.Locale;
        modelSelectorField = ModelSelectorField.builder()
                DBWorkbench.getPlatformUI().showError(
    }

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            return engine.getModels(monitor);
    @NotNull
 *
        Composite composite = UIUtils.createComposite(parent, 3);
        temperatureText.setLayoutData(gridData);
                            temperatureText.setText("0.0");
            }
        token = CommonUtils.toString(configuration.getToken());
        if (accessToken == null || accessToken.isEmpty()) {
import org.jkiss.dbeaver.DBException;
    ) {
/*
            .withModifyListener(() -> {
            parent,
            monitor.subTask("Awaiting access token");
        gd.widthHint = 150;
import org.jkiss.dbeaver.model.ai.engine.AIModel;
            .withParent(parent)
        };
    }
            "Write AI queries with metadata info in the debug logs",
                return;

            .withGridData(GridDataFactory.fillDefaults().span(2, 1).create())
            @Override
            }
        @NotNull Runnable propertyChangeListener
            throw new DBException("No authentication service available");
            })
    }
    }
    }
        accessTokenText.setText(accessToken);
        }
    protected void createModelParameters(@NotNull Composite parent) {
    }
        logQueryCheck = UIUtils.createCheckbox(
        temperatureText.setText(temperature);
import org.jkiss.utils.CommonUtils;
        temperatureText.setToolTipText("Lower temperatures give more precise results");
            CopilotMessages.copilot_access_token,
    public void resetSettings(@NotNull PROPERTIES copilotPropertiesLegacyAISettings) {
import org.jkiss.dbeaver.ui.ai.model.ContextWindowSizeField;
        properties.setToken(accessToken);
    private void applySettings() {

                CopilotMessages.oauth_auth_title,
import org.eclipse.swt.layout.GridData;
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
                    try {
        CopilotProperties properties = new CopilotProperties();
        properties.setLoggingEnabled(logQuery);
    @Override

        );
        logQueryCheck.setSelection(logQuery);
    protected String token = "";
import org.eclipse.jface.layout.GridDataFactory;
        temperatureText.addVerifyListener(UIUtils.getNumberVerifyListener(Locale.getDefault()));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        return acquireAccessToken(monitor, future);
            if (accessTokenText != null && !accessTokenText.isDisposed()) {
    @NotNull
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
            "",
}
                UIUtils.getActiveShell(),

import org.jkiss.dbeaver.ui.ai.model.CachedValue;
    @Override

    @Override
            monitor.subTask("Requesting device code");
        try (var client = new CopilotClient(getCurrentAuthURL())) {
            "Write AI queries to debug log",
                        }
            .withGridData(new GridData(GridData.FILL_HORIZONTAL))
            service.showCodePopup(URI.create(deviceCodeResponse.verificationUri()), deviceCodeResponse.userCode(), future);
    private Text temperatureText;

    }
import org.eclipse.swt.widgets.Text;
            return client.requestAccessToken(monitor, deviceCodeResponse, future);

                .filter(it -> it.features().contains(AIModelFeature.CHAT))
        logQuery = CommonUtils.toBoolean(configuration.isLoggingEnabled());
        composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

 *
        modelSelectorField.setSelectedModel(configuration.getModel());
        ModelSelectorField.ModelListProvider modelListProvider = (monitor, forceRefresh) -> {
        return new CopilotCompletionEngine(properties);
        if (service == null) {
        GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
public class CopilotConfigurator<ENGINE extends AIEngineDescriptor, PROPERTIES extends CopilotProperties>
import org.eclipse.osgi.util.NLS;
            .withModelListSupplier(modelListProvider)
    @NotNull
                accessTokenText.setText(accessToken);
 * You may obtain a copy of the License at
    private String temperature = "0.0";
        return true;

import org.jkiss.dbeaver.ui.UIUtils;
    @Override
        accessTokenText.setMessage(CopilotMessages.copilot_preference_page_token_info);
                .map(AIModel::name)
        contextWindowSizeField = ContextWindowSizeField.builder()
        var service = DBWorkbench.getService(UIServiceAuth.class);
            return modelsCache.get(monitor, forceRefresh).stream()


            parent,
import org.eclipse.swt.widgets.Button;
                    ex

import org.eclipse.swt.events.SelectionListener;
import org.jkiss.dbeaver.model.ai.engine.copilot.*;
    private List<AIModel> fetchCopilotModels(@NotNull DBRProgressMonitor monitor) throws DBException {
import org.jkiss.dbeaver.runtime.ui.UIServiceAuth;
 */
import org.jkiss.dbeaver.model.ai.engine.AIEngineProperties;

        UIUtils.createDialogButton(parent, CopilotMessages.copilot_access_token_authorize, SelectionListener.widgetSelectedAdapter(e -> {
                            contextWindowSizeField.setValue(model.contextWindowSize());
        createAdditionalSettings(composite);
            var deviceCodeResponse = client.requestDeviceCode(monitor);
        }
        @NotNull Composite parent,
    protected void createConnectionParameters(@NotNull Composite parent) {
        accessTokenText.setLayoutData(gd);
        }
                logQuery = logQueryCheck.getSelection();
            UIUtils.showMessageBox(
                accessTokenText = UIUtils.recreateTextControl(accessTokenText, SWT.BORDER);
 * distributed under the License is distributed on an "AS IS" BASIS,
        } catch (InterruptedException e) {
        temperature = CommonUtils.toString(configuration.getTemperature(), "0.0");

            .build();
                    NLS.bind(CopilotMessages.oauth_auth_error_message, ex.getMessage()),
import org.jkiss.dbeaver.runtime.DBWorkbench;

    private void createAdditionalSettings(@NotNull Composite parent) {
        );
import java.net.URI;
    protected CopilotCompletionEngine createEngine() {

            .withParent(parent)
    }
                            contextWindowSizeField.setValue(null);

    private Text accessTokenText;
            );
                    }
                        model -> {
            .build();
                });
    }
 * See the License for the specific language governing permissions and

            public void widgetSelected(SelectionEvent e) {
        contextWindowSizeField.setValue(configuration.getContextWindowSize());
import org.jkiss.dbeaver.model.ai.engine.AIModelFeature;
        return Optional.of(copilotPropertiesCopy);

        AIEngineDescriptor object,
    protected volatile String accessToken;
            false,
import org.jkiss.dbeaver.ui.ai.preferences.AIIObjectPropertyConfigurator;
        gridData.horizontalSpan = 2;
import org.jkiss.dbeaver.model.ai.registry.AIEngineDescriptor;
        properties.setModel(modelSelectorField.getSelectedModel());
        accessTokenText.addModifyListener((e -> accessToken = accessTokenText.getText()));
    }
 * you may not use this file except in compliance with the License.
        }));

                );
    }
    public Optional<AIEngineProperties> getCurrentProperties() {

                    } finally {
                    CopilotMessages.oauth_auth_title,
        createModelParameters(composite);
import org.eclipse.swt.SWT;
        accessTokenText = UIUtils.createLabelText(
                    var future = new CompletableFuture<Void>();
    protected String getCurrentAuthURL() {

    @NotNull
        UIUtils.syncExec(this::applySettings);
    private ContextWindowSizeField contextWindowSizeField;
            throw new DBException("Access token is not set");
import java.util.Optional;
            SWT.BORDER | SWT.PASSWORD
                        }, () -> {
                            temperatureText.setText(String.valueOf(model.defaultTemperature()));
 * DBeaver - Universal Database Manager
            try {

    private Button logQueryCheck;
        applySettings();
import org.eclipse.swt.events.SelectionAdapter;
    private String acquireAccessToken(@NotNull DBRProgressMonitor monitor, @NotNull CompletableFuture<Void> future) throws DBException {
    public void createControl(

import java.util.List;
 * limitations under the License.
import java.util.concurrent.CompletableFuture;
        temperatureText = UIUtils.createLabelText(parent, AIUIMessages.gpt_preference_page_text_temperature, "0.0");
        temperatureText.addModifyListener((e) -> temperature = temperatureText.getText());

            }
