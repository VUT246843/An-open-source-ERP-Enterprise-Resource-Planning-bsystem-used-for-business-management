/*
 * limitations under the License.
        throws DBException

        this.id = config.getAttribute("id");
        return implClass.createInstance(SQLEditorPresentationPanel.class);
}
 *
    {
 * you may not use this file except in compliance with the License.
    private final DBPImage icon;
    private final boolean isAutoActivate;
package org.jkiss.dbeaver.ui.editors.sql.registry;


import org.eclipse.core.runtime.IConfigurationElement;
import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;
    public String getId() {
    }
    }
    }
        this.isAutoActivate = CommonUtils.getBoolean(config.getAttribute("autoActivate"), true);
        return description;
 *
    public SQLEditorPresentationPanel createPanel()
        return icon;
        this.icon = iconToImage(config.getAttribute("icon"));
 * distributed under the License is distributed on an "AS IS" BASIS,

    public boolean isAutoActivate() {
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.DBPImage;
/**

    public SQLPresentationPanelDescriptor(IConfigurationElement config)
        return isAutoActivate;
 *
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorPresentationPanel;

        super(config);
 * SQLPresentationPanelDescriptor
    }
    private final ObjectType implClass;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        this.description = config.getAttribute("description");
    private final String label;
    public boolean isSingleton() {
    public String getLabel() {
    }
public class SQLPresentationPanelDescriptor extends AbstractContextDescriptor {
 * Unless required by applicable law or agreed to in writing, software


 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
        this.label = config.getAttribute("label");
 * You may obtain a copy of the License at

    }
        return label;
    private final boolean isSingleton;

 * DBeaver - Universal Database Manager
 */
    private final String description;
        this.isSingleton = CommonUtils.getBoolean(config.getAttribute("singleton"), true);
    private final String id;

    public DBPImage getIcon() {
 *     http://www.apache.org/licenses/LICENSE-2.0
        return isSingleton;
import org.jkiss.dbeaver.DBException;
        return id;

 * See the License for the specific language governing permissions and
    {
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getDescription() {
        this.implClass = new ObjectType(config.getAttribute("class"));

    }
