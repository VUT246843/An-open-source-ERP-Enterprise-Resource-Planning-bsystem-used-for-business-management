package org.jkiss.dbeaver.ui.controls.resultset;
        return false;
    ResultSetContextImpl(ResultSetViewer viewer, DBCResultSet resultSet) {
    }

                if (objectType != null && objectType.getName().equals(typeName)) {
        for (DBDAttributeBinding attr : viewer.getModel().getAttributes()) {
        return attrs.length > 0/* &&
    }

import org.jkiss.dbeaver.model.exec.trace.DBCTrace;
    private Pair<DBDAttributeBinding, String> getUniqueContentAttribute() {
        final DBPDataSource dataSource = viewer.getDataSource();

    }
                            result = new Pair<>(attr, contentType);

import org.jkiss.dbeaver.model.sql.SQLDialectRelational;
        return viewer.getModel().getDocumentAttribute() != null;
    private final DBCResultSet resultSet;
 *
    public boolean hasAttributeOfType(String typeName) {
                            break;
    public boolean supportsTrace() {

/*
    public String getDocumentContentType() {
            }
            final DBDAttributeContentTypeProvider provider = GeneralUtils.adapt(dataSource, DBDAttributeContentTypeProvider.class);
 * DBeaver - Universal Database Manager
    @Override
            }
 * limitations under the License.
    }
    }
    public DBDAttributeBinding getDocumentAttribute() {
        if (docAttr != null) {
    @Override
    @Override
            if (valueHandler != null) {
        }
                        } else {
        if (dataSource != null) {
                Pair<DBDAttributeBinding, String> result = null;
        return null;
                return result;

 *
                        }
        return null;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (dataSource != null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        }

    @Nullable
    }
}


            return dataSource.getInfo().supportsReferentialIntegrity();
        if (documentAttribute != null) {
    }
 * you may not use this file except in compliance with the License.

import org.jkiss.code.Nullable;
    }
                Class<?> objectType = valueHandler.getValueObjectType(attr.getAttribute());

                    if (CommonUtils.isNotEmpty(contentType)) {
    public boolean supportsDocument() {
                        if (result == null) {
    }
            return documentAttribute;
class ResultSetContextImpl implements IResultSetContext {

                }

        DBCTrace trace = viewer.getModel().getTrace();
        DBPDataSource dataSource = viewer.getDataSource();
        return false;
                    return true;
        if (dataSource != null) {
 * Unless required by applicable law or agreed to in writing, software
    }
                    final String contentType = provider.getContentType(attr);
import org.jkiss.dbeaver.model.data.DBDAttributeContentTypeProvider;
    public boolean supportsAttributes() {
import org.jkiss.utils.CommonUtils;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public boolean supportsReferences() {

                for (DBDAttributeBinding attr : viewer.getModel().getAttributes()) {
        this.resultSet = resultSet;
            return docAttr.getValueHandler().getValueContentType(docAttr);
                            // We want to retrieve a "unique" attribute that should be the only one in the result set
        if (contentAttribute != null) {
        }
        }
        this.viewer = viewer;
                    }
            DBDValueHandler valueHandler = attr.getValueHandler();
            return contentAttribute.getSecond();
        final Pair<DBDAttributeBinding, String> contentAttribute = getUniqueContentAttribute();
    @Override

 * You may obtain a copy of the License at
        final Pair<DBDAttributeBinding, String> contentAttribute = getUniqueContentAttribute();
            (attrs[0].getDataKind() != DBPDataKind.DOCUMENT || !CommonUtils.isEmpty(attrs[0].getNestedBindings()))*/;
 * Licensed under the Apache License, Version 2.0 (the "License");
            return sqlDialect instanceof SQLDialectRelational && ((SQLDialectRelational) sqlDialect).supportsGroupBy();
        }
 * See the License for the specific language governing permissions and
    @Override
        DBPDataSource dataSource = viewer.getDataSource();


            return contentAttribute.getFirst();
        return trace instanceof DBCTraceDynamic td && td.hasDynamicProperties();
    @Override
                }


import org.jkiss.dbeaver.model.exec.trace.DBCTraceDynamic;
        final DBDAttributeBinding documentAttribute = viewer.getModel().getDocumentAttribute();
        if (contentAttribute != null) {
            if (provider != null) {
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
    public boolean supportsGrouping() {
 */
import org.jkiss.utils.Pair;

    @Override
import org.jkiss.dbeaver.model.exec.DBCResultSet;
        DBDAttributeBinding docAttr = viewer.getModel().getDocumentAttribute();
            SQLDialect sqlDialect = dataSource.getSQLDialect();
        return null;
        }
    private final ResultSetViewer viewer;
        }

        return false;
import org.jkiss.dbeaver.model.sql.SQLDialect;
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
    }
        DBDAttributeBinding[] attrs = viewer.getModel().getAttributes();
        return resultSet;
 *
    @Override
import org.jkiss.dbeaver.model.data.DBDValueHandler;
    @Nullable
import org.jkiss.dbeaver.utils.GeneralUtils;


        }
    public DBCResultSet getResultSet() {
import org.jkiss.dbeaver.model.DBPDataSource;
