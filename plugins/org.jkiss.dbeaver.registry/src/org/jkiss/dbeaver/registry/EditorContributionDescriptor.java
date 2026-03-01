    public DBPImage getIcon() {


        return label;
    private final List<String> supportedDataSources = new ArrayList<>();
        String visibleIfCondition = config.getAttribute(RegistryConstants.ATTR_VISIBLE_IF);
 * Unless required by applicable law or agreed to in writing, software
            } catch (DBException e) {

import java.util.ArrayList;
        this.description = config.getAttribute("description");
import org.apache.commons.jexl3.JexlExpression;
                if (supportedDataSources.contains(dspd.getId())) {
    private static final Log log = Log.getLog(EditorContributionDescriptor.class);
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.connection.DBPDataSourceProviderDescriptor;
    @Override
public class EditorContributionDescriptor extends AbstractContextDescriptor implements DBPEditorContribution

            }
        super(config);
 * Copyright (C) 2010-2025 DBeaver Corp and others

    public String getDescription() {
import org.jkiss.dbeaver.Log;
        this.category = config.getAttribute("category");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.List;
 * You may obtain a copy of the License at
            return true;
import org.eclipse.core.runtime.IConfigurationElement;
        if (!CommonUtils.isEmpty(visibleIfCondition)) {
    }
        }


        }
            }
 *
import org.jkiss.dbeaver.model.navigator.DBNUtils;

        try {
    public String getCategory() {
 * you may not use this file except in compliance with the License.
            String supportsDrivers = supportsCfg.getAttribute(RegistryConstants.ATTR_DRIVER);
    }
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
        for (IConfigurationElement supportsCfg : config.getChildren("supports")) {
{
import org.jkiss.utils.CommonUtils;
    @Override
        if (supportedDataSources.isEmpty() && supportedDrivers.isEmpty()) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    }
                    supportsProvider = true;

 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
        return editorId;
            return visibleIf == null || Boolean.TRUE.equals(visibleIf.evaluate(DBNUtils.makeContext(context)));
            return false;
import java.util.Arrays;
            try {
                }
import org.jkiss.dbeaver.model.DBPImage;
                supportedDataSources.addAll(Arrays.asList(supportsDS.split(",")));

    private final DBPImage icon;
/*

        }


import org.apache.commons.jexl3.JexlException;
    private final String description;
            boolean supportsProvider = false;
                this.visibleIf = AbstractDescriptor.parseExpression(visibleIfCondition);
        return editorId + "(" + category + ")";

    }
import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;
                log.debug("Error parsing expression '" + visibleIfCondition + "':" + GeneralUtils.getExpressionParseMessage(e));
            log.debug("Error evaluating editor expression '" + visibleIf.getSourceText() + "' on node '" + context.getName() + "': " + GeneralUtils.getExpressionParseMessage(e));
import org.jkiss.dbeaver.model.navigator.DBNNode;
    @Override
import org.jkiss.dbeaver.model.connection.DBPEditorContribution;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.DBException;
            }
 * EditorContributionDescriptor
    public String getLabel() {
            if (!CommonUtils.isEmpty(supportsDrivers)) {
        return icon;
 *
    public boolean isVisible(DBNNode context) {
    private final String category;
    private final List<String> supportedDrivers = new ArrayList<>();
            return supportsProvider;
 *
                    break;
    }
        this.label = config.getAttribute("label");
        } catch (JexlException e) {
        if (!supportedDataSources.isEmpty()) {
    public EditorContributionDescriptor(IConfigurationElement config)
        return supportedDrivers.contains(dataSource.getDriver().getId());
            String supportsDS = supportsCfg.getAttribute(RegistryConstants.ATTR_DATA_SOURCE);
    }

 */
        return description;
 * limitations under the License.
}
 */
    public String getEditorId() {
/**

                supportedDrivers.addAll(Arrays.asList(supportsDrivers.split(",")));
    @Override
import org.jkiss.dbeaver.utils.GeneralUtils;
    private final String editorId;
    }
        }
    private final String label;
        this.icon = iconToImage(config.getAttribute("icon"));
    public boolean supportsDataSource(DBPDataSourceContainer dataSource) {
    }
    @Override
            if (!CommonUtils.isEmpty(supportsDS)) {
    }
            }
package org.jkiss.dbeaver.registry;
        return category;

    public String toString() {
    {
    @Override
    private JexlExpression visibleIf;
        }

        this.editorId = config.getAttribute("editorId");
            for (DBPDataSourceProviderDescriptor dspd = dataSource.getDriver().getProviderDescriptor(); dspd != null; dspd = dspd.getParentProvider()) {
