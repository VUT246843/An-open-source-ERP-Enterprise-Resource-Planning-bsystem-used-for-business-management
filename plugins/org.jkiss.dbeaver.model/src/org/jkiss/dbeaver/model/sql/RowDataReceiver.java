    @Override
    }
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
        // Compare attributes with existing model attributes
    }
    protected Object[] rowValues;
import org.jkiss.utils.CommonUtils;

    protected void fetchRowValues(DBCSession session, DBCResultSet resultSet) throws DBCException {



 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.code.NotNull;
    }
    public void fetchEnd(@NotNull DBCSession session, @NotNull DBCResultSet resultSet) {
import java.util.List;
    private static final Log log = Log.getLog(RowDataReceiver.class);
 *
        if (attributes.size() != curAttributes.length) {
 * you may not use this file except in compliance with the License.
        this.curAttributes = curAttributes;
 * See the License for the specific language governing permissions and
public class RowDataReceiver implements DBDDataReceiver {
    }
    public void close() {
 * Unless required by applicable law or agreed to in writing, software
            }
        }
            DBDValueHandler valueHandler = attr.getValueHandler();
            rowValues[i] = attrValue;
            return;

/*
 */
}
        rowValues = new Object[curAttributes.length];
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.exec.*;
    }
        fetchRowValues(session, resultSet);
        for (int i = 0; i < curAttributes.length; i++) {



    protected final DBDAttributeBinding[] curAttributes;
package org.jkiss.dbeaver.model.sql;

    public Object[] getRowValues() {
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
    public RowDataReceiver(DBDAttributeBinding[] curAttributes) {
    @Override
    }
    @Override
            DBCAttributeMetaData metaAttribute = curAttributes[i].getMetaAttribute();
            log.debug("Wrong meta attributes count (" + attributes.size() + " <> " + curAttributes.length + ") - can't refresh");
import org.jkiss.dbeaver.Log;
    @Override
                log.debug("Attribute '" + metaAttribute + "' doesn't match '" + attributes.get(i).getName() + "'");

 * Licensed under the Apache License, Version 2.0 (the "License");
        for (int i = 0; i < curAttributes.length; i++) {
        }
 *
    public void fetchRow(@NotNull DBCSession session, @NotNull DBCResultSet resultSet)
            if (metaAttribute == null ||
    public void fetchStart(@NotNull DBCSession session, @NotNull DBCResultSet resultSet, long offset, long maxRows) {
            final DBDAttributeBinding attr = curAttributes[i];
 * Copyright (C) 2010-2024 DBeaver Corp and others
        List<? extends DBCAttributeMetaData> attributes = rsMeta.getAttributes();

        throws DBCException {
                !CommonUtils.equalObjects(metaAttribute.getName(), attributes.get(i).getName())) {
                return;
        }
 *

 * limitations under the License.
 * You may obtain a copy of the License at
            Object attrValue = valueHandler.fetchValueObject(session, resultSet, attr, i);
        DBCResultSetMetaData rsMeta = resultSet.getMeta();

import org.jkiss.dbeaver.model.data.DBDValueHandler;
import org.jkiss.dbeaver.model.data.DBDDataReceiver;
        return rowValues;
