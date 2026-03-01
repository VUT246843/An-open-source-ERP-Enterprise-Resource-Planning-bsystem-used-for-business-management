 * Copyright (C) 2010-2024 DBeaver Corp and others
    @NotNull
    public static final String ELEMENT_ID = "notification";
    public String getDescription() {
import org.jkiss.utils.CommonUtils;

import org.jkiss.code.NotNull;
/*

 *     http://www.apache.org/licenses/LICENSE-2.0
}
    }
        super(config);
        this.hidden = CommonUtils.getBoolean(config.getAttribute("hidden"));
 *
        this.soundEnabled = CommonUtils.getBoolean(config.getAttribute("soundEnabled"));
    }
    private final String description;
public class NotificationDescriptor extends AbstractDescriptor {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    NotificationDescriptor(@NotNull IConfigurationElement config) {
 * you may not use this file except in compliance with the License.
 *

 * DBeaver - Universal Database Manager
    @Nullable
    }
    }
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
        return hidden;
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ui.registry;
    public boolean isHidden() {
    public boolean isSoundEnabled() {
        this.name = config.getAttribute("name");
        this.description = config.getAttribute("description");
    private final String id;
    }
    private final String name;
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
    public String getId() {
 * See the License for the specific language governing permissions and

    private final boolean soundEnabled;

 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
        this.id = config.getAttribute("id");
 */

        return description;
        return id;
 * You may obtain a copy of the License at
    private final boolean hidden;

        return soundEnabled;
    public String getName() {
import org.eclipse.core.runtime.IConfigurationElement;
import org.jkiss.code.Nullable;
    }

 *


        return name;
