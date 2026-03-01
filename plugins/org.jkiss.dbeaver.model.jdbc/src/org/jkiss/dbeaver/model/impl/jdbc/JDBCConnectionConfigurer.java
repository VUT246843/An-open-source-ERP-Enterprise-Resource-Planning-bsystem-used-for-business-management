 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.Properties;
/*
import org.jkiss.dbeaver.model.exec.DBCException;
package org.jkiss.dbeaver.model.impl.jdbc;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
 * See the License for the specific language governing permissions and
/**

 */

 *
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
    void beforeConnection(DBRProgressMonitor monitor, DBPConnectionConfiguration connectionInfo, Properties connectProps) throws DBCException;

 * You may obtain a copy of the License at
import java.sql.Connection;

}
 * DBeaver - Universal Database Manager
 */
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *
 *
    void afterConnection(DBRProgressMonitor monitor, DBPConnectionConfiguration connectionInfo, Properties connectProps, Connection connection, Throwable error);
 * Licensed under the Apache License, Version 2.0 (the "License");
 * JDBCConnectionConfigurer
 * distributed under the License is distributed on an "AS IS" BASIS,
public interface JDBCConnectionConfigurer {
 * limitations under the License.

 * Copyright (C) 2010-2024 DBeaver Corp and others

