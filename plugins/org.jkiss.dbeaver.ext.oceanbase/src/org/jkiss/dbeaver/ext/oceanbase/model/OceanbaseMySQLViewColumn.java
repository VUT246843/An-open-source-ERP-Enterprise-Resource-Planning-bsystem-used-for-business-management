 */
import org.jkiss.dbeaver.ext.mysql.model.MySQLTableBase;
        setValueType(MySQLUtils.typeNameToValueType(typeName.split("\\(")[0]));
        }
import org.jkiss.dbeaver.model.sql.SQLUtils;
    }
        if (defaultValue != null) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import org.jkiss.dbeaver.model.sql.SQLConstants;
    }


                defaultValue = SQLUtils.quoteString(getDataSource(), defaultValue);
 *

}
        DBSDataType dataType = getDataSource().getLocalDataType(typeName);
        }
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.struct.DBSDataType;
 * Licensed under the Apache License, Version 2.0 (the "License");
        super(table);
        setName(JDBCUtils.safeGetString(dbResult, "Field"));
        } else {

 * DBeaver - Universal Database Manager
public class OceanbaseMySQLViewColumn extends MySQLTableColumn {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
        setExtraInfo(JDBCUtils.safeGetString(dbResult, "Extra"));
import org.jkiss.utils.CommonUtils;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ext.mysql.MySQLConstants;
        setPersisted(true);
            if (dataType != null) {
import org.jkiss.dbeaver.model.DBPDataKind;

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ext.mysql.model.MySQLTableColumn;

                setMaxLength(CommonUtils.toInt(dataType.getPrecision()));
        String typeName = JDBCUtils.safeGetString(dbResult, "Type");
import org.jkiss.dbeaver.ext.mysql.MySQLUtils;
        if (charLength <= 0) {
        setFullTypeName(typeName);
import java.sql.ResultSet;
        loadInfo(dbResult);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        assert typeName != null;
            } else if (dataKind == DBPDataKind.DATETIME && !defaultValue.isEmpty()
 * You may obtain a copy of the License at
        setRequired(!"YES".equals(JDBCUtils.safeGetString(dbResult, "Null")));
 * limitations under the License.
 *
        String defaultValue = JDBCUtils.safeGetString(dbResult, "Default");
 * See the License for the specific language governing permissions and
/*
                    && !SQLUtils.isStringQuoted(getDataSource(), defaultValue)) {
        long charLength = JDBCUtils.safeGetLong(dbResult, MySQLConstants.COL_CHARACTER_MAXIMUM_LENGTH);
    OceanbaseMySQLViewColumn(MySQLTableBase table, ResultSet dbResult) throws DBException {
            if (dataKind == DBPDataKind.STRING && !SQLConstants.NULL_VALUE.equals(defaultValue)
        setTypeName(typeName);
package org.jkiss.dbeaver.ext.oceanbase.model;
            }
            DBPDataKind dataKind = getDataKind();
            setMaxLength(charLength);
import org.jkiss.dbeaver.DBException;

    private void loadInfo(ResultSet dbResult) throws DBException {
                defaultValue = "'" + defaultValue + "'";
                    && Character.isDigit(defaultValue.charAt(0))) {
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
            setDefaultValue(defaultValue);
