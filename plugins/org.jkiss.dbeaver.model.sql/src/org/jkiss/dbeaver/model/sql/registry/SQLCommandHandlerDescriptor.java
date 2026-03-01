}
    private final Expression enablementExpression;
    @Nullable
package org.jkiss.dbeaver.model.sql.registry;

import org.jkiss.code.Nullable;
    @NotNull
public class SQLCommandHandlerDescriptor extends AbstractContextDescriptor {
    }
import org.eclipse.core.runtime.IConfigurationElement;
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.sqlCommand"; //$NON-NLS-1$
    }
 * See the License for the specific language governing permissions and


    private final String description;
    public SQLControlCommandHandler createHandler() throws DBException {

 *
 * SQLCommandHandlerDescriptor
    @Nullable
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        return isExpressionTrue(enablementExpression, this);
        this.label = config.getAttribute("label");
import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;
    }
    public boolean isInteractive() {
    public SQLCommandHandlerDescriptor(@NotNull IConfigurationElement config) {
 */
        this.implClass = new ObjectType(config.getAttribute("class"));
        return interactive;
        return id;
    private final String label;
 */
    private final ObjectType implClass;
import org.eclipse.core.expressions.Expression;
 * Licensed under the Apache License, Version 2.0 (the "License");

    }
    @NotNull
        return implClass.createInstance(SQLControlCommandHandler.class);
    @NotNull
    }
        this.description = config.getAttribute("description");
    private final boolean interactive;
    public DBPImage getIcon() {
import org.jkiss.utils.CommonUtils;
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public String getId() {

        super(config);
import org.jkiss.dbeaver.DBException;
    }

    public String getLabel() {
import org.jkiss.dbeaver.model.sql.SQLControlCommandHandler;
    private final String id;
        this.icon = iconToImage(config.getAttribute("icon"));
        return icon;
    public boolean isEnabled() {
 *     http://www.apache.org/licenses/LICENSE-2.0
        return label;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.DBPImage;
        this.id = config.getAttribute("id");
/**
        this.enablementExpression = getEnablementExpression(config);

 *




        return description;
 * Unless required by applicable law or agreed to in writing, software
    }
    public String getDescription() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
/*
import org.jkiss.code.NotNull;
        this.interactive = CommonUtils.getBoolean(config.getAttribute("interactive"), false);

 * limitations under the License.
 * You may obtain a copy of the License at

 *
    private final DBPImage icon;
