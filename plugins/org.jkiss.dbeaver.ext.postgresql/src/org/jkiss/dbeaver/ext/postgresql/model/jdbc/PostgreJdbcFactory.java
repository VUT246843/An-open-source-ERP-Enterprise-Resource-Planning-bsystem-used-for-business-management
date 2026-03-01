{
import org.jkiss.dbeaver.model.impl.jdbc.exec.JDBCFactoryDefault;
 * you may not use this file except in compliance with the License.
            return new JDBCResultSetMetaDataImpl(resultSet);
}
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * See the License for the specific language governing permissions and
        if (resultSet.getSession().getDataSource().isDriverVersionAtLeast(9, 0)) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    public JDBCResultSetMetaData createResultSetMetaData(@NotNull JDBCResultSet resultSet) throws SQLException {

public class PostgreJdbcFactory extends JDBCFactoryDefault
        }
 */
package org.jkiss.dbeaver.ext.postgresql.model.jdbc;
    @Override
/**
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
 */
 * PostgreJdbcFactory
import java.sql.SQLException;
            return new PostgreResultSetMetaDataImpl(resultSet);
        } else {

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSetMetaData;
    }

 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.code.NotNull;
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
 *
 *
import org.jkiss.dbeaver.model.impl.jdbc.exec.JDBCResultSetMetaDataImpl;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            // Only for real PG driver
