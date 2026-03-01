import org.jkiss.code.NotNull;
        this.schemaGeneratorType = new ObjectType(contributorConfig, "schemaGenerator");
 *
 *
 */
    private final ObjectType formatterType;
import org.jkiss.dbeaver.DBException;
 * limitations under the License.
import org.jkiss.dbeaver.model.app.DBPWorkspace;
        return formatterType.createInstance(AISqlFormatter.class);
import org.jkiss.utils.CommonUtils;
}        super(contributorConfig);

 * You may obtain a copy of the License at
        this.priority = CommonUtils.toInt(contributorConfig.getAttribute("priority"));
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public AISqlFormatter createSqlFormatter() throws DBException {
 * DBeaver - Universal Database Manager
 *
        return objectType.createInstance(AIAssistant.class, workspace);
    }
    public static final String EXTENSION_ID = "com.dbeaver.ai.assistant";

    }
public class AIAssistantDescriptor extends AbstractDescriptor {

import org.jkiss.dbeaver.model.ai.AISqlFormatter;
    protected AIAssistantDescriptor(IConfigurationElement contributorConfig) {

 * Licensed under the Apache License, Version 2.0 (the "License");
    }
import org.eclipse.core.runtime.IConfigurationElement;
    }
        this.objectType = new ObjectType(contributorConfig, RegistryConstants.ATTR_CLASS);
/*

    private final int priority;
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
    public AISchemaGenerator createSchemaGenerator() throws DBException {
    private final ObjectType objectType;
    private final ObjectType schemaGeneratorType;
    @NotNull
    public int getPriority() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * See the License for the specific language governing permissions and
    @NotNull
import org.jkiss.dbeaver.registry.RegistryConstants;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.ai.AISchemaGenerator;

package org.jkiss.dbeaver.model.ai.registry;
    public AIAssistant createInstance(DBPWorkspace workspace) throws DBException {

        this.formatterType = new ObjectType(contributorConfig, "sqlFormatter");
    @NotNull
    }
import org.jkiss.dbeaver.model.ai.AIAssistant;
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
        return schemaGeneratorType.createInstance(AISchemaGenerator.class);
        return priority;
