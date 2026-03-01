        token = CommonUtils.toString(configuration.getToken());
                    .filter(it -> it.features().contains(AIModelFeature.CHAT))
        baseUrlText.setLayoutData(gd);
    private Button logQueryCheck;
    private ModelSelectorField modelSelectorField;
        legacyApiCheck.addSelectionListener(SelectionListener.widgetSelectedAdapter(e ->
        modelSelectorField = ModelSelectorField.builder()
        );

        tokenText.addModifyListener((e -> token = tokenText.getText()));
                            temperatureText.setText(String.valueOf(model.defaultTemperature()));
        propertiesCopy.setLegacyApi(useLegacyApi);
    }
                        model -> {
        );
import java.util.List;
        OpenAIProperties propertiesCopy = new OpenAIProperties();
 * limitations under the License.
        return Optional.of(propertiesCopy);
    protected void createConnectionParameters(@NotNull Composite parent) {
                        }
            tokenText.setText(token);
    private boolean useLegacyApi;
    protected void createBaseUrlParameter(@NotNull Composite parent) {
        configuration.setModel(modelSelectorField.getSelectedModel());
import org.eclipse.swt.widgets.Button;
        );
        createAdditionalSettings(composite);
        gd.widthHint = 150;

import java.util.Optional;
        propertiesCopy.setTemperature(CommonUtils.toDouble(temperature));
                    .map(AIModel::name)

    private boolean logQuery = false;
import org.jkiss.dbeaver.ui.ai.model.ContextWindowSizeField;

                            contextWindowSizeField.setValue(model.contextWindowSize());

            new SelectionAdapter() {
    protected void applySettings() {
    implements AIIObjectPropertyConfigurator<ENGINE, PROPERTIES> {
        gd.horizontalSpan = 3;

    public void resetSettings(@NotNull PROPERTIES openAIPropertiesLegacyAISettings) {
        baseUrl = CommonUtils.toString(configuration.getBaseUrl());
            .withGridData(new GridData(GridData.FILL_HORIZONTAL))
    public boolean isComplete() {

            2
    protected final CachedValue<List<AIModel>> modelsCache = new CachedValue<>(this::fetchOpenAiModels);
import org.jkiss.dbeaver.ui.UIUtils;
                    .ifPresentOrElse(
 * you may not use this file except in compliance with the License.
public class OpenAiConfigurator<ENGINE extends AIEngineDescriptor, PROPERTIES extends OpenAIProperties>
            false,
    }
            .withGridData(GridDataFactory.fillDefaults().span(2, 1).create())
                    .toList()
    protected String getApiKeyURL() {
        propertiesCopy.setToken(token);
                    ))
        createURLInfoLink(parent);
    }
        }

/*
    @Nullable
    private String temperature = "0.0";
        Link link = UIUtils.createLink(
        useLegacyApi = configuration.isLegacyApi();
                        }, () -> {
                    UIUtils.openWebBrowser(getApiKeyURL());
                (monitor, forceRefresh) -> modelsCache.get(monitor, forceRefresh).stream()
    }
    }
        }
import org.jkiss.dbeaver.model.ai.engine.openai.OpenAIEngine;
    @Override
    private List<AIModel> fetchOpenAiModels(DBRProgressMonitor monitor) throws DBException {
    public Optional<AIEngineProperties> getCurrentProperties() {
import org.eclipse.swt.layout.GridData;
        }
        baseUrlText = UIUtils.createLabelText(
    protected volatile String token = "";
import org.eclipse.swt.widgets.Link;
 * Licensed under the Apache License, Version 2.0 (the "License");
    protected String baseUrl;
 *
import java.util.Locale;
import org.jkiss.dbeaver.model.ai.engine.openai.OpenAIProperties;
import org.jkiss.dbeaver.model.ai.engine.AIModelFeature;

        Composite composite = UIUtils.createComposite(parent, 3);
        temperature = CommonUtils.toString(configuration.getTemperature(), "0.0");
    }
        tokenText = UIUtils.createLabelText(
 *     http://www.apache.org/licenses/LICENSE-2.0
            && !tokenText.getText().isEmpty()
import org.jkiss.dbeaver.ui.ai.model.CachedValue;

 * You may obtain a copy of the License at
            2
}
        );
            throw new DBException("Token is not set");
        tokenText.setMessage("API access token");
    public void loadSettings(@NotNull PROPERTIES configuration) {
        temperatureText.setToolTipText("Lower temperatures give more precise results");
                            temperatureText.setEnabled(OpenAIModels.isTemperatureEditable(model));
        createBaseUrlParameter(composite);
                }
import org.eclipse.swt.events.SelectionAdapter;
        temperatureText.setText(temperature);
            AIUIMessages.gpt_preference_page_selector_token,
import org.eclipse.swt.widgets.Composite;
            )
    }
        configuration.setLegacyApi(useLegacyApi);


package org.jkiss.dbeaver.ui.ai.engine.openai;
        );
        );
            "Use legacy OpenAI API (chat). May be useful if you use OpenAI compatible engine which doesn't support 'responses' API.",
        legacyApiCheck = UIUtils.createCheckbox(
import org.eclipse.swt.events.SelectionListener;
import org.jkiss.dbeaver.model.ai.engine.openai.OpenAIModels;
import org.eclipse.jface.layout.GridDataFactory;
    ) {
    private static final String API_KEY_URL = "https://platform.openai.com/account/api-keys";
            baseUrl = OpenAIClient.OPENAI_ENDPOINT;
        try (OpenAIEngine<OpenAIProperties> engine = new OpenAIEngine<>(properties)) {
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionEvent;
        ));
    }

    @Override
import org.jkiss.dbeaver.model.ai.engine.openai.OpenAIClient;
        link.setLayoutData(gd);
        configuration.setContextWindowSize(contextWindowSizeField.getValue());
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);

        baseUrlText.addModifyListener((e -> baseUrl = baseUrlText.getText()));
        propertiesCopy.setContextWindowSize(contextWindowSizeField.getValue());
            parent,
        applySettings();
            .build();
        return tokenText != null
    private Text baseUrlText;
        propertiesCopy.setLoggingEnabled(logQuery);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

            false,

        temperatureText.setLayoutData(GridDataFactory.fillDefaults().span(2, 1).create());
import org.jkiss.dbeaver.model.ai.engine.AIModel;

        if (baseUrlText != null) {
        gd.widthHint = 150;
        modelSelectorField.setSelectedModel(
    }
        properties.setToken(token);
        createConnectionParameters(composite);
        temperatureText.addVerifyListener(UIUtils.getNumberVerifyListener(Locale.getDefault()));
 */
        if (token == null || token.isEmpty()) {
import org.jkiss.dbeaver.ui.ai.preferences.AIIObjectPropertyConfigurator;

        contextWindowSizeField.setValue(configuration.getContextWindowSize());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        configuration.setTemperature(CommonUtils.toDouble(temperature));

        logQueryCheck.setSelection(logQuery);
            ""
        configuration.setBaseUrl(baseUrl);
            "",
            "Write AI queries to debug log",
            NLS.bind(AIUIMessages.gpt_preference_page_token_info, getApiKeyURL()),
        @NotNull Runnable propertyChangeListener
        AIEngineDescriptor object,

            }
    }
                            temperatureText.setEnabled(true);
                .build();
            .withModelListSupplier(
                @Override
    protected Text tokenText;
import org.eclipse.osgi.util.NLS;

            SWT.BORDER | SWT.PASSWORD
        propertiesCopy.setModel(modelSelectorField.getSelectedModel());
    public void saveSettings(@NotNull PROPERTIES configuration) {
                public void widgetSelected(SelectionEvent e) {
    }

        logQueryCheck.addSelectionListener(SelectionListener.widgetSelectedAdapter(e ->
            .withParent(parent)
    public void createControl(

        composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            "Use legacy API",
            parent,
    @Override
        if (tokenText != null) {
import org.jkiss.code.NotNull;
            CommonUtils.toString(configuration.getModel(), OpenAIModels.DEFAULT_MODEL)
        @NotNull Composite parent,
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
    private Button legacyApiCheck;
    private Text temperatureText;
            parent,

            logQuery = logQueryCheck.getSelection()
        createModelParameters(composite);
import org.jkiss.dbeaver.DBException;
    }
            parent,
    }
    protected void createModelParameters(@NotNull Composite parent) {


        }
                OpenAIModels.getModelByName(modelSelectorField.getSelectedModel())
import org.jkiss.dbeaver.model.ai.registry.AIEngineDescriptor;
 * DBeaver - Universal Database Manager
            .withParent(parent)
            AIUIMessages.gpt_preference_page_selector_base_url,
 * Copyright (C) 2010-2025 DBeaver Corp and others
        tokenText.setLayoutData(gd);
        modelSelectorField.refreshModelListSilently(false);
    protected void createURLInfoLink(@NotNull Composite parent) {
        if (baseUrl.isEmpty()) {
        contextWindowSizeField = ContextWindowSizeField.builder()
            "Write AI queries with metadata info in debug logs",
        configuration.setToken(token);
    private ContextWindowSizeField contextWindowSizeField;
        }
            && contextWindowSizeField.isComplete();
import org.jkiss.dbeaver.model.ai.engine.AIEngineProperties;

 *
        ));
        configuration.setLoggingEnabled(logQuery);
            baseUrlText.setText(baseUrl);
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ui.ai.model.ModelSelectorField;
        logQuery = CommonUtils.toBoolean(configuration.isLoggingEnabled());

        logQueryCheck = UIUtils.createCheckbox(
    }
            return engine.getModels(monitor);
        legacyApiCheck.setSelection(useLegacyApi);
        temperatureText.addModifyListener((e) -> temperature = temperatureText.getText());

import org.jkiss.utils.CommonUtils;
                            contextWindowSizeField.setValue(null);

            .withModifyListener(() ->
import org.jkiss.code.Nullable;
        properties.setBaseUrl(baseUrl);

        return API_KEY_URL;
    @Override
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
    @Override
        temperatureText = UIUtils.createLabelText(parent, AIUIMessages.gpt_preference_page_text_temperature, "0.0");
    @Nullable

            useLegacyApi = legacyApiCheck.getSelection()
                            temperatureText.setText("0.0");
        propertiesCopy.setBaseUrl(baseUrl);
import org.eclipse.swt.SWT;
    @Override
 *
            parent,
        OpenAIProperties properties = new OpenAIProperties();
import org.jkiss.dbeaver.ui.ai.internal.AIUIMessages;
    protected void createAdditionalSettings(@NotNull Composite parent) {
