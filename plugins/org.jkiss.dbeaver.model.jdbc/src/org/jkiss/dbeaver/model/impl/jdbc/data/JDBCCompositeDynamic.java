 * Copyright (C) 2010-2024 DBeaver Corp and others
                        attributes[i] = attr;
 *
    public DBSDataType getDataType()
                        values[i] = value;
 * Unless required by applicable law or agreed to in writing, software
                values = new Object[attrValues.length];
import org.jkiss.dbeaver.model.DBUtils;
        } catch (DBException e) {
        return type;
 * you may not use this file except in compliance with the License.

 * See the License for the specific language governing permissions and
                        values[i] = value;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            throw new DBCException("Can't obtain attributes meta information", e);
    public JDBCCompositeDynamic(@NotNull JDBCComposite struct, @NotNull DBRProgressMonitor monitor) throws DBCException {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.code.Nullable;
        return new JDBCCompositeDynamic(this, monitor);
        } catch (SQLException e) {
/*
            Object[] attrValues = contents == null ? null : contents.getAttributes();
}
                        StructAttribute attr = new StructAttribute(this.type, i, value);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Licensed under the Apache License, Version 2.0 (the "License");
                    }
    @Override

 * DBeaver - Universal Database Manager
                        attrCount = Math.min(attrCount, attrValues.length);
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
        //public static final int MAX_ITEMS_IN_STRING = 100;

        try {
import org.jkiss.code.NotNull;
            }
public class JDBCCompositeDynamic extends JDBCComposite {
 */
        super(monitor, struct);
    private static final Log log = Log.getLog(JDBCCompositeDynamic.class);
    }
                    int attrCount = metaData.getColumnCount();
                } else {
                this.attributes = EMPTY_ATTRIBUTE;
                    for (int i = 0; i < attrCount; i++) {
            if (attrValues != null) {

    public JDBCCompositeDynamic(@NotNull DBCSession session, @Nullable Struct contents, @Nullable ResultSetMetaData metaData) throws DBCException
    {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
                        Object value = attrValues[i];
                        value = DBUtils.findValueHandler(session, attr).getValueFromObject(session, attr, value, false, modified);
import org.jkiss.dbeaver.model.exec.DBCSession;
    {

import org.jkiss.dbeaver.model.struct.DBSDataType;
                    }
                    }
            throw new DBCException(e, session.getExecutionContext());
import org.jkiss.dbeaver.model.exec.DBCException;
        super(contents);
        }
import java.sql.ResultSetMetaData;
    }
                this.values = EMPTY_VALUES;
package org.jkiss.dbeaver.model.impl.jdbc.data;
                    log.warn("Data type '" + contents.getSQLTypeName() + "' isn't resolved as structured type. Use synthetic attributes.");


                    for (int i = 0, attrValuesLength = attrValues.length; i < attrValuesLength; i++) {

        // Extract structure data
    public JDBCCompositeDynamic cloneValue(DBRProgressMonitor monitor) throws DBCException
                }

                        log.warn("Meta column count (" + attrCount + ") differs from value count (" + attrValues.length + ")");
            } else {

    {
 *

                if (metaData != null) {
import java.sql.Struct;
import org.jkiss.dbeaver.Log;
        this.type = new StructType(session.getDataSource());
 *
                        StructAttribute attr = new StructAttribute(this.type, metaData, i);
                        attributes[i] = attr;
 * limitations under the License.
import java.sql.SQLException;
import org.jkiss.dbeaver.DBException;
                        value = DBUtils.findValueHandler(session, attr).getValueFromObject(session, attr, value, false, modified);
    @Override
 * Dynamic struct. Self contained entity.
                    if (attrCount != attrValues.length) {
 * You may obtain a copy of the License at
                    // Use meta data to read struct information
 */
                attributes = new DBSEntityAttribute[attrValues.length];
                        Object value = attrValues[i];
/**
