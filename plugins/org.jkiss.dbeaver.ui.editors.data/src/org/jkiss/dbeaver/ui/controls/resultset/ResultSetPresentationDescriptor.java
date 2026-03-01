import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;
    public DBPImage getIcon() {

        this.icon = iconToImage(config.getAttribute("icon"));
        return supportsRecordMode;

        for (ObjectType ot : adaptsTypes) {
    public String getDescription() {
            String type = typeCfg.getAttribute("type");

            Class<?> objectClass = ot.getObjectClass();
        this.supportsRecordMode = CommonUtils.toBoolean(config.getAttribute("supportsRecordMode"), false);
    @Override

        this.label = config.getAttribute("label");
    private final ObjectType implClass;
/**
    }
        return supportsEdit;

 *     http://www.apache.org/licenses/LICENSE-2.0
    }
                log.warn("Invalid adapter type: " + type, e);
                contentTypes.add(contentType);
 * You may obtain a copy of the License at
    public IResultSetPresentation createInstance() throws DBException {
import org.jkiss.utils.CommonUtils;
        return supportsPanels;
        this.description = config.getAttribute("description");

 * limitations under the License.
                }
 * distributed under the License is distributed on an "AS IS" BASIS,
        return icon;
        for (MimeType mimeType : contentTypes) {
import org.jkiss.dbeaver.DBException;
                if (adapter != null) {
        return implClass.createInstance(IResultSetPresentation.class);
            } catch (Throwable e) {

                    return true;

            }
    public boolean supportsPanels() {
        return supportsHints;

        super(config);
        }
        for (IConfigurationElement typeCfg : config.getChildren(CONTENT_TYPE)) {
    private final boolean supportsHints;
 * Unless required by applicable law or agreed to in writing, software
        return false;
                MimeType contentType = new MimeType(type);
        String documentType = context.getDocumentContentType();
    public String getId() {
            try {
import org.jkiss.dbeaver.model.exec.DBCResultSet;
import org.jkiss.dbeaver.model.DBPImage;
    }

 *
        }
            }
    public String toString() {
        return false;
            return false;
    }
    private boolean matchesContentType(IResultSetContext context) {
    }
    private final boolean supportsEdit;
            }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public int getOrder() {

    public boolean supportsNavigation() {
import java.util.Locale;
    public boolean matches(Class<? extends IResultSetPresentation> type) {
import org.jkiss.dbeaver.Log;
import java.util.ArrayList;
    private final boolean supportsRecordMode;
    }
        this.id = config.getAttribute("id");
import org.jkiss.utils.MimeType;
    private final String label;
    }
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
        return supportsNavigation;
    }
    private static final Log log = Log.getLog(ResultSetPresentationDescriptor.class);
    }
    public boolean supportsRecordMode() {

import org.jkiss.dbeaver.model.DBUtils;
    }
    private final String description;
    private final String id;
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.resultset.presentation"; //NON-NLS-1 //$NON-NLS-1$
                log.warn("Bad document content type: " + documentType, e);
    private final int order;
        return presentationType;
                log.warn("Invalid content type: " + type, e);
        return id;
        return order;
    private final DBPImage icon;

    private static final String CONTENT_TYPE = "contentType";
    private final IResultSetPresentation.PresentationType presentationType;
                }
        return description;

            } catch (Throwable e) {
    public boolean supportsHints() {
 * Licensed under the Apache License, Version 2.0 (the "License");
        return appliesTo(resultSet, context) || matchesContentType(context) || adaptsType(resultSet);
        this.implClass = new ObjectType(config.getAttribute("class"));

import org.eclipse.core.runtime.IConfigurationElement;

        this.presentationType = IResultSetPresentation.PresentationType.valueOf(config.getAttribute("type").toUpperCase(Locale.ENGLISH));
                Object adapter = DBUtils.getAdapter(objectClass, resultSet.getSession().getDataSource());
 */
}
    }
            } catch (Throwable e) {


    private final boolean supportsNavigation;
            if (objectClass != null) {
    }
        if (CommonUtils.isEmpty(documentType)) {

                    return true;
    private final List<ObjectType> adaptsTypes = new ArrayList<>();

public class ResultSetPresentationDescriptor extends AbstractContextDescriptor {
            String type = typeCfg.getAttribute("type");
                adaptsTypes.add(new ObjectType(type));
            }
        this.order = CommonUtils.toInt(config.getAttribute("order"));
        }
        for (IConfigurationElement typeCfg : config.getChildren("adapt")) {
 * ResultSetPresentationDescriptor
    protected ResultSetPresentationDescriptor(IConfigurationElement config) {
    }
        }
    public IResultSetPresentation.PresentationType getPresentationType() {
        }
                if (mimeType.match(documentType)) {
 *

    public boolean supportsEdit() {

            try {


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private final List<MimeType> contentTypes = new ArrayList<>();
    }
    private final boolean supportsPanels;
    }
    public boolean supportedBy(DBCResultSet resultSet, IResultSetContext context) {
    }
        if (contentTypes.isEmpty()) {
    private boolean adaptsType(DBCResultSet resultSet) {
    public String getLabel() {
 *
import java.util.List;
        this.supportsNavigation = CommonUtils.getBoolean(config.getAttribute("supportsNavigation"), true);
    }
        this.supportsPanels = CommonUtils.getBoolean(config.getAttribute("supportsPanels"), true);
        this.supportsEdit = CommonUtils.getBoolean(config.getAttribute("supportsEdit"), true);
package org.jkiss.dbeaver.ui.controls.resultset;
 */
            return false;

        return label;
        }
    }
        return id;
        this.supportsHints = CommonUtils.getBoolean(config.getAttribute("supportsHints"), false);
            try {
        return implClass.matchesType(type);


 * DBeaver - Universal Database Manager

/*

