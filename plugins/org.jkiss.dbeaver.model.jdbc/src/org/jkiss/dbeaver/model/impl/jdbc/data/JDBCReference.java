    @Override
    }

    private static final Log log = Log.getLog(JDBCReference.class);
                value instanceof Ref ? ((Ref) value).getBaseTypeName() : value.toString();
    }
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.data.DBDValueHandler;
import org.jkiss.dbeaver.model.data.DBDReference;
        return refObject;
 *
    }
        }
        this.value = value;
/*
            try {
    }
 * Reference holder
package org.jkiss.dbeaver.model.impl.jdbc.data;
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
        return type;
        return value;

        return value == null;
    }
        if (refObject == null && value instanceof Ref ref) {
    private DBSDataType type;

 * See the License for the specific language governing permissions and
        value = null;
                throw new DBCException("Can't obtain object reference");
/**
    @Override
}
 *
                Object refValue = ref.getObject();
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
    public JDBCReference(DBSDataType type, Object value) throws DBCException {
                refObject = valueHandler.getValueFromObject(session, type, refValue, false, false);

    }
    public DBSDataType getReferencedType() {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.struct.DBSDataType;
    @Override
                monitor.subTask("Read reference '" + type.getName() + "'");
    public Object getRawValue() {
    }
    public Object getValue() throws DBCException {

        return false;
import java.sql.Ref;
            }

import org.jkiss.dbeaver.model.exec.DBCSession;
        }
    public boolean isNull() {
 * you may not use this file except in compliance with the License.
public class JDBCReference implements DBDReference {

import org.jkiss.dbeaver.model.exec.DBCException;
    @Override
    @Override
    }
 *
                DBRProgressMonitor monitor = session.getProgressMonitor();
            return value == null ? DBConstants.NULL_VALUE_LABEL :
    public boolean isModified() {
    public Object getReferencedObject(DBCSession session) throws DBCException {
 */
            } catch (SQLException e) {
import org.jkiss.dbeaver.model.DBConstants;
        type = null;
 * distributed under the License is distributed on an "AS IS" BASIS,
    public String toString() {
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


    private Object refObject;
        this.type = type;
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        } catch (SQLException e) {
        try {
 * Unless required by applicable law or agreed to in writing, software
    public void release() {

 * limitations under the License.

    private Object value;
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
import java.sql.SQLException;

        return value;
            return value.toString();
                DBDValueHandler valueHandler = DBUtils.findValueHandler(session, type);
    @Override


