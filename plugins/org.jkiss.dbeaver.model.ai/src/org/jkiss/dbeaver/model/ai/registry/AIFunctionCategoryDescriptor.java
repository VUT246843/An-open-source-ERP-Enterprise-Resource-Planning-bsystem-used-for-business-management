    private final String name;
import org.jkiss.utils.CommonUtils;
        return name;
    }
    }
import org.jkiss.code.NotNull;
    private final String id;
public class AIFunctionCategoryDescriptor extends AbstractDescriptor {
    public AIFunctionCategoryDescriptor(@NotNull IConfigurationElement cfg) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
import org.eclipse.core.runtime.IConfigurationElement;
 *
 */
 * Unless required by applicable law or agreed to in writing, software
        this.name = cfg.getAttribute("name");
    private final boolean enabledByDefault;
    }
        return id;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Nullable
}
        super(cfg);
 *

        return enabledByDefault;
        this.enabledByDefault = CommonUtils.toBoolean(cfg.getAttribute("enabledByDefault"));
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.Nullable;

 * Copyright (C) 2010-2025 DBeaver Corp and others
    public String getName() {
 * you may not use this file except in compliance with the License.
 *
    public String getId() {
        this.id = cfg.getAttribute("id");
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
package org.jkiss.dbeaver.model.ai.registry;


        this.description = cfg.getAttribute("description");

    }
/*

    public boolean isEnabledByDefault() {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
 * limitations under the License.

 * DBeaver - Universal Database Manager
    @NotNull
    @NotNull

    public String getDescription() {
        return description;
    private final String description;
