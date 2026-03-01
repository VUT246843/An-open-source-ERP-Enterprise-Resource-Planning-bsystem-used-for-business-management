    }
 */
        this.enabledWhen = getEnablementExpression(config);
    public DBPImage getIcon() {
    }
        }
    }
    }
    }
    private final String prefLabel;
        /** The presentation can work with multiple statements (script) */
    }

import java.util.ArrayList;
        return label;

 */
    {
/*
    {
public class SQLPresentationDescriptor extends AbstractContextDescriptor {
        SINGLE,
import org.eclipse.ui.IWorkbenchSite;

        this.id = config.getAttribute("id");
        return prefLabel;
    public Expression getEnabledWhen() {
 * SQLPresentationDescriptor
 *     http://www.apache.org/licenses/LICENSE-2.0
        return order;

        this.prefLabel = config.getAttribute("prefLabel");
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");

 * DBeaver - Universal Database Manager
    public enum QueryMode {
    }
 *
    private final String prefTip;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.registry.RegistryConstants;

        return enabledWhen;
        this.order = CommonUtils.toInt(config.getAttribute(RegistryConstants.ATTR_ORDER));
        this.prefTip = config.getAttribute("prefTooltip");
import org.eclipse.core.expressions.Expression;
        return id;


    }
 *
    }
        this.queryMode = CommonUtils.valueOf(QueryMode.class, config.getAttribute("queryMode"), QueryMode.MULTIPLE);

    public QueryMode getQueryMode() {
 * distributed under the License is distributed on an "AS IS" BASIS,


import org.jkiss.code.Nullable;
        return settingKey;
        return isExpressionTrue(enabledWhen, site);

        this.label = config.getAttribute("label");


        return panels;
import org.eclipse.core.runtime.IConfigurationElement;
        NONE
    }
    public int getOrder() {
        super(config);
/**
    public SQLPresentationDescriptor(IConfigurationElement config)
    public String getPrefTip() {

    }
        /** The presentation doesn't support queries */
        this.description = config.getAttribute("description");
    public String getSettingKey() {
import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;
    private final String settingKey;
        return queryMode;
        return implClass.createInstance(SQLEditorPresentation.class);
    }
    public String getId() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private final QueryMode queryMode;
    public String getDescription() {

import org.jkiss.utils.CommonUtils;
    }
        for (IConfigurationElement panelConfig : config.getChildren("panel")) {
    private final DBPImage icon;
        return prefTip;
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.sqlPresentation"; //$NON-NLS-1$
        this.settingKey = config.getAttribute("settingKey");
    private final String id;
 *

        this.icon = iconToImage(config.getAttribute("icon"));

            this.panels.add(new SQLPresentationPanelDescriptor(panelConfig));
    @NotNull
        /** The presentation can work with a single statement */

    }
        this.implClass = new ObjectType(config.getAttribute("class"));
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorPresentation;
    private final Expression enabledWhen;
}

        throws DBException
    public String getPrefLabel() {
import java.util.List;
    private final int order;
        return description;
    public boolean isEnabled(@NotNull IWorkbenchSite site) {

    public SQLEditorPresentation createPresentation()
 * limitations under the License.
 * you may not use this file except in compliance with the License.
    private final String description;

import org.jkiss.dbeaver.DBException;
    private final String label;
import org.jkiss.code.NotNull;

package org.jkiss.dbeaver.ui.editors.sql.registry;
    public List<SQLPresentationPanelDescriptor> getPanels() {
    private final ObjectType implClass;
import org.jkiss.dbeaver.model.DBPImage;
    }
    public String getLabel() {
 * You may obtain a copy of the License at
        return icon;
        MULTIPLE,
    private final List<SQLPresentationPanelDescriptor> panels = new ArrayList<>();
    @Nullable
