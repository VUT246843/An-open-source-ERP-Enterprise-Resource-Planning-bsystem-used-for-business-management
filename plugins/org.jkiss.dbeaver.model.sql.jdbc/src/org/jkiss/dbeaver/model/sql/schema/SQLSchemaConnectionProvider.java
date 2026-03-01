/*
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager

 * limitations under the License.
import org.jkiss.code.NotNull;
import java.sql.Connection;
 *     http://www.apache.org/licenses/LICENSE-2.0
 *

 * You may obtain a copy of the License at
import java.sql.SQLException;
import org.jkiss.dbeaver.DBException;

public interface SQLSchemaConnectionProvider {
 * See the License for the specific language governing permissions and

 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
 */
}
 */

/**
package org.jkiss.dbeaver.model.sql.schema;
 *
    Connection getDatabaseConnection(DBRProgressMonitor monitor) throws SQLException, DBException;

 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * SQL schema connection provider.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *
