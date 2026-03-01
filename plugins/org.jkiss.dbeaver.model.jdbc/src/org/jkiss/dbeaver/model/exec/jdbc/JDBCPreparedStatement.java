 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */

 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and

    @Override
import java.sql.PreparedStatement;
import org.jkiss.dbeaver.model.exec.DBCParameterizedStatement;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * JDBC statement
 *
/*
        throws SQLException;
 */
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.model.exec.jdbc;
import java.sql.SQLException;
    JDBCResultSet executeQuery()
public interface JDBCPreparedStatement extends PreparedStatement, JDBCStatement, DBCParameterizedStatement {

    PreparedStatement getOriginal();
 * You may obtain a copy of the License at
} * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0


 *
 * DBeaver - Universal Database Manager
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
/**

    @Override
    void close();

