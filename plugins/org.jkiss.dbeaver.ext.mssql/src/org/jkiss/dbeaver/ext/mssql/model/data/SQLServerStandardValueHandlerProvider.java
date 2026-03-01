 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCStandardValueHandlerProvider;
/*
public class SQLServerStandardValueHandlerProvider extends JDBCStandardValueHandlerProvider {
        if (typeName.equals(SQLServerConstants.TYPE_MONEY) || typeName.equals(SQLServerConstants.TYPE_SMALLMONEY)) {
            return new SQLServerDateTimeOffsetHandler(preferences);
    {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ext.mssql.SQLServerConstants;
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
        String typeName = typedObject.getTypeName();
 * distributed under the License is distributed on an "AS IS" BASIS,
}
package org.jkiss.dbeaver.ext.mssql.model.data;
    public DBDValueHandler getValueHandler(DBPDataSource dataSource, DBDFormatSettings preferences, DBSTypedObject typedObject)
 *
        } else if (typeName.equals(SQLServerConstants.TYPE_DATETIMEOFFSET)) {
import org.jkiss.dbeaver.model.struct.DBSTypedObject;

 *
import org.jkiss.code.Nullable;
 * Copyright (C) 2010-2024 DBeaver Corp and others
            return SQLServerSQLVariantValueHandler.INSTANCE;
import org.jkiss.dbeaver.model.data.DBDValueHandler;
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.DBPDataSource;
    @Override
            return SQLServerMoneyValueHandler.INSTANCE;
 */
 * you may not use this file except in compliance with the License.
        } else {
        }
 *
        } else if (typeName.equals(SQLServerConstants.TYPE_SQL_VARIANT)) {
    }

 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
            return null;

    @Nullable
