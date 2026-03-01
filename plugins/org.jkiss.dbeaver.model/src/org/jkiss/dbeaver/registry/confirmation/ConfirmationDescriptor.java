            return RuntimeUtils.getBundleLocalization(getContributorBundle(), locale)
        }
 * You may obtain a copy of the License at
    private final String toggleMessage;

    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");


    @NotNull
    public String getGroup() {
        super(config);
 *
    protected ConfirmationDescriptor(@NotNull IConfigurationElement config) {
 * DBeaver - Universal Database Manager
                .getString(GROUP_ID + "." + getId() + ".title");
    @Nullable
    public String getLocalizedMessage(@NotNull String locale) {
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        this.message = config.getAttribute("message");
        return id;
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.description = config.getAttribute("description");
    }
import org.jkiss.dbeaver.utils.RuntimeUtils;
        this.title = config.getAttribute("title");
    @NotNull

        return group;

    public String getMessage() {
            return this.getTitle();
    public String getDescription() {

}    private final String id;
    }
    @Nullable

    }
            return this.getMessage();
        try {
    private final String group;
        } catch (Exception e) {
import org.eclipse.core.runtime.IConfigurationElement;
                .getString(GROUP_ID + "." + getId() + ".message");
    public String getToggleMessage() {
        }
    @NotNull
    private final String description;
import org.jkiss.code.Nullable;
    private final String message;


 *
    @NotNull
        return message;

        try {
    public String getLocalizedTitle(@NotNull String locale) {
 * See the License for the specific language governing permissions and
    public String getTitle() {
        } catch (Exception e) {
 * you may not use this file except in compliance with the License.
        this.id = config.getAttribute("id");

 * limitations under the License.
import org.jkiss.code.NotNull;
        this.toggleMessage = config.getAttribute("toggleMessage");
package org.jkiss.dbeaver.registry.confirmation;
    @NotNull
        return title;
 * Unless required by applicable law or agreed to in writing, software
    }
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return toggleMessage;
    private static final String GROUP_ID = "confirm";
/*
        return description;
public class ConfirmationDescriptor extends AbstractDescriptor {

    public String getId() {
    }

            return RuntimeUtils.getBundleLocalization(getContributorBundle(), locale)
 */
        this.group = config.getAttribute("group");

import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    private final String title;
 *
