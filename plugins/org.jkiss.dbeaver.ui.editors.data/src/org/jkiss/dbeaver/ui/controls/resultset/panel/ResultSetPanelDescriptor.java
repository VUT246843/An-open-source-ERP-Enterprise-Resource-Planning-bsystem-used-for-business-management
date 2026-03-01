        return icon;
            provider = provider.getParentProvider())
import java.util.List;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public ResultSetPanelDescriptor(IConfigurationElement config) {
        return id;
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.utils.CommonUtils;
        for (IConfigurationElement supports : config.getChildren(TAG_SUPPORTS)) {
            }

        if (!supportedDataSources.isEmpty()) {
 *

    public static final String EXTENSION_ID = "org.jkiss.dbeaver.resultset.panel"; //NON-NLS-1 //$NON-NLS-1$
public class ResultSetPanelDescriptor extends AbstractContextDescriptor {
package org.jkiss.dbeaver.ui.controls.resultset.panel;
            provider != null;
        return description;
        return label;
    }
            String expr = supports.getAttribute("if");
    private final DBPImage icon;

        {


                return false;
            return true;
    }
                    return false;
                }
        this.description = config.getAttribute("description");
    }

    @Override
import org.jkiss.dbeaver.Log;

            if (dsId != null) {
/**
            if (!CommonUtils.isEmpty(type)) {
        for (IConfigurationElement dsElement : config.getChildren("datasource")) {
            for (JexlExpression expr : supportedExpressions) {
 * See the License for the specific language governing permissions and
 */

        super(config);


    }
    }
            }
                return true;
                if (!Boolean.TRUE.equals(expr.evaluate(AbstractDescriptor.makeContext(dataSource, context)))) {
            }
    public String toString() {
        this.icon = iconToImage(config.getAttribute("icon"));
            if (!supportsAnyProvider(dataSource)) {
            if (!CommonUtils.isEmpty(id)) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    private boolean supportsAnyProvider(DBPDataSource dataSource) {
        return showByDefault;

        if (!supportedExpressions.isEmpty()) {
import org.jkiss.dbeaver.model.DBPImage;
                supportedDataSources.add(dsId);
                return false;
            }
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.showByDefault = CommonUtils.toBoolean(config.getAttribute("default"));
    public DBPImage getIcon() {
                    log.debug(e);
    public String getLabel() {

        this.implClass = new ObjectType(config.getAttribute("class"));
    private final List<String> supportedPresentations = new ArrayList<>();
    private final List<IResultSetPresentation.PresentationType> supportedPresentationTypes = new ArrayList<>();
    public IResultSetPanel createInstance() throws DBException {
            }
    }
    private final List<String> supportedDataSources = new ArrayList<>();
        }
        return implClass.createInstance(IResultSetPanel.class);

            }
            }
    private final List<JexlExpression> supportedExpressions = new ArrayList<>();
        }
                try {
    private final String description;
                } catch (DBException e) {
import org.jkiss.dbeaver.DBException;
        }
            (presentationType != null && supportedPresentationTypes.contains(presentationType));
            String id = supports.getAttribute("id");
            (presentationId != null && supportedPresentations.contains(presentationId)) ||
            String dsId = dsElement.getAttribute("id");
import java.util.ArrayList;
    private static final Log log = Log.getLog(ResultSetPanelDescriptor.class);
 *
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (supportedPresentations.isEmpty() && supportedPresentationTypes.isEmpty()) {
 * ResultSetPresentationDescriptor


 *
    public boolean isShowByDefault() {
 * You may obtain a copy of the License at
        for (DBPDataSourceProviderDescriptor provider = dataSource.getContainer().getDriver().getProviderDescriptor();
import org.eclipse.core.runtime.IConfigurationElement;
            if (!CommonUtils.isEmpty(expr)) {
import java.util.Locale;
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetPanel;
                supportedPresentationTypes.add(IResultSetPresentation.PresentationType.valueOf(type.toUpperCase(Locale.ENGLISH)));
    public static final String TAG_SUPPORTS = "supports"; //$NON-NLS-1$
                supportedPresentations.add(id);
        return id;
 */
    private final String label;
            if (supportedDataSources.contains(provider.getId())) {
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;

import org.jkiss.dbeaver.ui.controls.resultset.IResultSetContext;
    }
    }
 * DBeaver - Universal Database Manager
}
        this.label = config.getAttribute("label");
        this.id = config.getAttribute("id");
        }
 * limitations under the License.
                }
    private final String id;
        }
import org.jkiss.dbeaver.model.connection.DBPDataSourceProviderDescriptor;
            }
                    supportedExpressions.add(parseExpression(expr));
import org.apache.commons.jexl3.JexlExpression;

    private final boolean showByDefault;
    public String getId() {
            if (dataSource == null) {

import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;
        return false;
    }
        return
    public boolean supportedBy(IResultSetContext context, DBPDataSource dataSource, String presentationId, IResultSetPresentation.PresentationType presentationType) {
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetPresentation;


    private final ObjectType implClass;
    public String getDescription() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
/*
        }
            String type = supports.getAttribute("type");
