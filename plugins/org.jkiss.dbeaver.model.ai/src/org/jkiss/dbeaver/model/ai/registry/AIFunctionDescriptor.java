    @Nullable
import java.util.List;
        }
            AIFunctionResult.FunctionType.class,
        for (IConfigurationElement pe : config.getChildren("parameter")) {
        return description;
    private final boolean global;
        try {
 *
    public String getName() {

        public String getName() {

        }

    }
    }


        @Nullable
        super(config);
                    log.error("Error on getting valid values from provider", e);
    public AIFunction createInstance() throws DBException {
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
    @NotNull
import org.eclipse.core.runtime.IConfigurationElement;
            AIFunctionResult.FunctionType.INFORMATION
    public class Parameter {
import org.jkiss.utils.CommonUtils;

            this.config = config;
    @NotNull
        return hidden;
        }
 */
        public String getDefaultValue() {
    }
    }
        return false;
import org.jkiss.dbeaver.model.ai.AIFunctionPurpose;
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
        return categoryId;
                try {
    public boolean isApplicable(@NotNull AIEngineDescriptor engine, @NotNull AIPromptGenerator prompt) {
        }

    }
    }
    public boolean isHidden() {
    private final AIFunctionPurpose purpose;
    public String toString() {
    private final DBPImage icon;

import org.jkiss.dbeaver.Log;
        }
    }
    }
import org.jkiss.dbeaver.model.ai.AIFunction;
    private final boolean hidden;
 * you may not use this file except in compliance with the License.
        private final IConfigurationElement config;
    public String getId() {
     * Global functions are passed in ALL requests
import org.jkiss.code.NotNull;
        }

            return config.getAttribute("description");
    @Nullable
        @NotNull
 * See the License for the specific language governing permissions and
    private final String description;
    @NotNull
        @NotNull
            return CommonUtils.isEmpty(validValues) ? null : validValues.split(",");
        }

        Parameter(@NotNull IConfigurationElement config) {
     */

    public static final String EXTENSION_ID = "com.dbeaver.ai.function";
        return purpose;
    }
        public String getDescription() {
            throw new DBException("Error creating AI function " + getId(), e);
    @NotNull
            config.getAttribute("type"),
        public String getType() {

        List<Parameter> params = new ArrayList<>();
    /**


    private final AIFunctionResult.FunctionType type;
    public AIFunctionResult.FunctionType getType() {
            if (CommonUtils.isEmpty(validValues) && CommonUtils.isNotEmpty(config.getAttribute("validValuesProvider"))) {
    }


/*

        return id;
    public String getDescription() {
public class AIFunctionDescriptor extends AbstractDescriptor {

 * limitations under the License.
        this.purpose = CommonUtils.valueOf(AIFunctionPurpose.class, config.getAttribute("purpose"), AIFunctionPurpose.TOOL);
import org.jkiss.dbeaver.model.ai.AIPromptGenerator;
        private static final Log log = Log.getLog(Parameter.class);
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBPImage;
 *
        return global;
        return name;

        return parameters;
    public String[] getDependsOn() {
    public AIFunctionPurpose getPurpose() {
}
        this.description = config.getAttribute(RegistryConstants.ATTR_DESCRIPTION);
    }
        return dependsOn;
                ObjectType validValuesProvider = new ObjectType(config, "validValuesProvider");
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
    public Parameter[] getParameters() {


import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
            return objectType.createInstance(AIFunction.class);
        }
import org.jkiss.dbeaver.model.ai.AIFunctionResult;
    @NotNull
    private final String[] dependsOn;

        } catch (Exception e) {
package org.jkiss.dbeaver.model.ai.registry;
    public boolean isGlobal() {

        return "AI function: " + getId();
        public String[] getValidValues() {
 * Unless required by applicable law or agreed to in writing, software
    @NotNull
            return config.getAttribute("type");

    @Nullable
 *
                }
    @Override
    private final String categoryId;
        this.dependsOn = CommonUtils.splitString(config.getAttribute("dependsOn"), ',').toArray(new String[0]);
        return icon;
    public AIFunctionDescriptor(@NotNull IConfigurationElement config) {

        this.objectType = new ObjectType(config, RegistryConstants.ATTR_CLASS);
    public String getCategoryId() {
import java.util.ArrayList;
        }
        );
            return config.getAttribute("name");
                    Object[] validObjects = provider.getPossibleValues(this);
        this.global = CommonUtils.toBoolean(config.getAttribute("global"));
        @Nullable

                    return (String[]) validObjects;
                    var provider = validValuesProvider.createInstance(IPropertyValueListProvider.class);
    @NotNull
import org.jkiss.dbeaver.registry.RegistryConstants;
        this.parameters = params.toArray(new Parameter[0]);
        public boolean isRequired() {

        return type;
import org.jkiss.code.Nullable;
        this.icon = iconToImage(config.getAttribute(RegistryConstants.ATTR_ICON));
    }
    }
            return config.getAttribute("defaultValue");
            String validValues = config.getAttribute("validValues");
    private final String name;
 * Copyright (C) 2010-2026 DBeaver Corp and others
    private final Parameter[] parameters;
            return CommonUtils.getBoolean(config.getAttribute("required"));
        this.id = config.getAttribute(RegistryConstants.ATTR_ID);
        this.name = config.getAttribute(RegistryConstants.ATTR_NAME);
    }
    private final ObjectType objectType;
    }
import org.jkiss.dbeaver.DBException;

        this.type = CommonUtils.valueOf(
    }
            params.add(new Parameter(pe));
        this.categoryId = config.getAttribute("categoryId");
    private final String id;
 * distributed under the License is distributed on an "AS IS" BASIS,

    public DBPImage getIcon() {
        this.hidden = CommonUtils.toBoolean(config.getAttribute("hidden"));
                } catch (DBException e) {
