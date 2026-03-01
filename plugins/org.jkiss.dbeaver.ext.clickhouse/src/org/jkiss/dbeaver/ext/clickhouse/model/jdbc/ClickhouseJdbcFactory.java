import java.sql.SQLException;
 * you may not use this file except in compliance with the License.
 * limitations under the License.
    public JDBCResultSetMetaData createResultSetMetaData(@NotNull JDBCResultSet resultSet) throws SQLException {
        return new ClickhouseResultSetMetaDataImpl(resultSet);
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSetMetaData;
    }
 *
 */
}
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
public class ClickhouseJdbcFactory extends JDBCFactoryDefault {
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.NotNull;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.model.impl.jdbc.exec.JDBCFactoryDefault;
package org.jkiss.dbeaver.ext.clickhouse.model.jdbc;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 * See the License for the specific language governing permissions and


/*

