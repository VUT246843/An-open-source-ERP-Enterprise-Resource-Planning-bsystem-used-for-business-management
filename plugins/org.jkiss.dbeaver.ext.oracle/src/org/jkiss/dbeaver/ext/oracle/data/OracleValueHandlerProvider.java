 * distributed under the License is distributed on an "AS IS" BASIS,

        }
}                } else {
 *
 * DBeaver - Universal Database Manager
 * limitations under the License.

                return OracleObjectValueHandler.INSTANCE;
            case Types.TIME_WITH_TIMEZONE:
/**
                if (((OracleDataSource)dataSource).isDriverVersionAtLeast(12, 2)) {
 * Oracle data types provider
 *
                }
 * Licensed under the Apache License, Version 2.0 (the "License");
            case Types.NCLOB:
    @Override
        switch (typeName) {
    public DBDValueHandler getValueHandler(@NotNull DBPDataSource dataSource, DBDFormatSettings preferences, DBSTypedObject typedObject)
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCContentValueHandler;

            return new OracleTimestampValueHandler(preferences, dataSource);
 *
        }
        if (typeName.contains(OracleConstants.TYPE_NAME_TIMESTAMP) || typedObject.getDataKind() == DBPDataKind.DATETIME) {
            case OracleConstants.DATA_TYPE_TIMESTAMP_WITH_TIMEZONE:
        final String typeName = typedObject.getTypeName();
                return OracleXMLValueHandler.INSTANCE;
            case OracleConstants.TYPE_NAME_JSON:
 * you may not use this file except in compliance with the License.
public class OracleValueHandlerProvider implements DBDValueHandlerProvider {
 */
            case Types.BLOB:
package org.jkiss.dbeaver.ext.oracle.data;
        } else {
 * Unless required by applicable law or agreed to in writing, software
                return OracleBLOBValueHandler.INSTANCE;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
            case Types.TIMESTAMP_WITH_TIMEZONE:
import org.jkiss.dbeaver.ext.oracle.model.OracleConstants;
 *     http://www.apache.org/licenses/LICENSE-2.0

            case Types.CLOB:
                return OracleCLOBValueHandler.INSTANCE;
import org.jkiss.dbeaver.model.DBPDataSource;
    {
            return null;
                    return new OracleTimestampValueHandler(preferences, dataSource);
                return JDBCContentValueHandler.INSTANCE;
            case OracleConstants.TYPE_FQ_XML:
/*
        }
            case OracleConstants.TYPE_NAME_XML:
            case OracleConstants.TYPE_NAME_BFILE:
import org.jkiss.dbeaver.model.data.DBDValueHandler;


 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.DBPDataKind;
                    return new OracleTemporalAccessorValueHandler(preferences);
 */
                return OracleBFILEValueHandler.INSTANCE;
import org.jkiss.dbeaver.model.data.DBDValueHandlerProvider;
 * See the License for the specific language governing permissions and
                return OracleRefCursorValueHandler.INSTANCE;
import java.sql.Types;
            case Types.STRUCT:
            case OracleConstants.TYPE_NAME_REFCURSOR:
        switch (typedObject.getTypeID()) {
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
                return OracleRefCursorValueHandler.INSTANCE;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others

            case OracleConstants.DATA_TYPE_REFCURSOR:
import org.jkiss.dbeaver.ext.oracle.model.OracleDataSource;
