import java.util.Arrays;

 * distributed under the License is distributed on an "AS IS" BASIS,
        }
 *
import org.jkiss.utils.CommonUtils;
    }
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.ArrayList;


import java.util.List;
import org.eclipse.core.runtime.IConfigurationElement;
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.registry.settings;

 */
 *
 * limitations under the License.
    public List<String> getScopes() {
public class ProductSettingDescriptor extends LocalizedPropertyDescriptor {
}
 * you may not use this file except in compliance with the License.
            scopes.addAll(Arrays.stream(excludeAttr.split(",")).toList());
    private final List<String> scopes = new ArrayList<>();
import org.jkiss.dbeaver.model.impl.LocalizedPropertyDescriptor;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return scopes;
        super(category, cfg);
 *     http://www.apache.org/licenses/LICENSE-2.0
        String excludeAttr = cfg.getAttribute("scopes");
    @NotNull
/*
 *
import org.jkiss.code.NotNull;
        if (CommonUtils.isNotEmpty(excludeAttr)) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
    }
    public ProductSettingDescriptor(String category, IConfigurationElement cfg) {
