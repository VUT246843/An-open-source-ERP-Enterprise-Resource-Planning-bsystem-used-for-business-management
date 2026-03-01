import org.eclipse.core.runtime.IConfigurationElement;
    public String getLabel() {
    private final ObjectType action;
import java.util.Objects;
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
    private final DBPImage icon;
        this.label = config.getAttribute(RegistryConstants.ATTR_LABEL);
    @NotNull
import org.jkiss.dbeaver.DBException;
 *
    @NotNull
    private final String description;
    @NotNull
    }
    public String getDescription() {
    private final int order;
    }
        this.description = config.getAttribute(RegistryConstants.ATTR_DESCRIPTION);

 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
        this.action = new ObjectType(config.getAttribute(RegistryConstants.ATTR_CLASS));
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.resultset.error"; //$NON-NLS-1$
        return order;
 */
        return description;
public final class ResultSetErrorActionDescriptor extends AbstractDescriptor {
 * Licensed under the Apache License, Version 2.0 (the "License");
    private final String label;

/*
}
    }
import org.jkiss.dbeaver.registry.RegistryConstants;
    }
        super(config);
        return action.createInstance(IResultSetErrorAction.class);
 *     http://www.apache.org/licenses/LICENSE-2.0

 * limitations under the License.
package org.jkiss.dbeaver.ui.controls.resultset;
        return icon;

 * You may obtain a copy of the License at

import org.jkiss.utils.CommonUtils;
    public IResultSetErrorAction createInstance() throws DBException {
    }
    ResultSetErrorActionDescriptor(@NotNull IConfigurationElement config) {
        return label;
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
    public int getOrder() {
 * distributed under the License is distributed on an "AS IS" BASIS,

 *
    }



import org.jkiss.dbeaver.model.DBPImage;

 * DBeaver - Universal Database Manager
        this.icon = Objects.requireNonNull(iconToImage(config.getAttribute(RegistryConstants.ATTR_ICON)));
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public DBPImage getIcon() {

 *
        this.order = CommonUtils.toInt(config.getAttribute(RegistryConstants.ATTR_ORDER));
