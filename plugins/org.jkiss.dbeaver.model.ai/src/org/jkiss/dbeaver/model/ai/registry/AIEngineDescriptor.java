
        return supportsFunctions;
    @NotNull
    private final IConfigurationElement contributorConfig;
    @NotNull
        this.propertiesType = new ObjectType(contributorConfig, "properties");

import org.jkiss.dbeaver.model.impl.AbstractDescriptor;

    public String getLabel() {
    }
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.ai.engine.AIEngine;
        return providesMetadata;
        return objectType.createInstance(AIEngine.class, properties);
        this.supportsFunctions = CommonUtils.toBoolean(contributorConfig.getAttribute("supportsFunctions"));

     * @return true if the engine provides model metadata, false otherwise
    public AIEngine createEngineInstance(@NotNull AIEngineProperties properties) throws DBException {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
    private final boolean providesMetadata;
    private final ObjectType propertiesType;
/*
    public ObjectType getEngineObjectType() {
import org.jkiss.dbeaver.DBException;
    public <T extends AIEngineProperties> T createPropertiesInstance() throws DBException {
    @NotNull

    }
    @NotNull
        this.providesMetadata = CommonUtils.toBoolean(contributorConfig.getAttribute("providesMetadata"), true);

        return CommonUtils.toBoolean(contributorConfig.getAttribute("default"));
import org.jkiss.dbeaver.model.ai.engine.AIEngineProperties;
import org.jkiss.utils.CommonUtils;
        return contributorConfig.getAttribute("label");
 * limitations under the License.
        this.contributorConfig = contributorConfig;
    }

    public Class<? extends AIEngineProperties> getPropertiesType() {

    }
    private final boolean supportsFunctions;
    }
        return id;
     *
    public String getFallbacks() {
 *
        super(contributorConfig);

    public static final String EXTENSION_ID = "com.dbeaver.ai.engine";
 *
    protected AIEngineDescriptor(@NotNull IConfigurationElement contributorConfig) {
    }
    public boolean isProvidesMetadata() {
 */
    /**
    private final String id;
    @Nullable
    }
    private final ObjectType objectType;

    }


 * Copyright (C) 2010-2026 DBeaver Corp and others


}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public boolean isSupportsFunctions() {
 * you may not use this file except in compliance with the License.
        return objectType;
 * See the License for the specific language governing permissions and
        return createEngineInstance(AISettingsManager.getInstance().getSettings().getEngineConfiguration(getId()));
    }
    @NotNull

    public boolean isDefault() {
        return contributorConfig.getAttribute("replaces");
    @Nullable
    }
     * Indicates whether the engine provides model metadata such as context window size.

        return contributorConfig.getAttribute("fallbacks");
 * You may obtain a copy of the License at
    }
import org.jkiss.dbeaver.registry.RegistryConstants;
import org.jkiss.code.Nullable;
    @NotNull
        this.objectType = new ObjectType(contributorConfig, RegistryConstants.ATTR_CLASS);
    public String getReplaces() {
        this.id = contributorConfig.getAttribute("id");
        return (T) propertiesType.createInstance(AIEngineProperties.class);
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
public class AIEngineDescriptor extends AbstractDescriptor {

    public String getId() {
    public AIEngine createEngineInstance() throws DBException {
    }

 * DBeaver - Universal Database Manager
    }
 *
package org.jkiss.dbeaver.model.ai.registry;
import org.eclipse.core.runtime.IConfigurationElement;
 * Unless required by applicable law or agreed to in writing, software
     */
        return propertiesType.getImplClass(AIEngineProperties.class);
