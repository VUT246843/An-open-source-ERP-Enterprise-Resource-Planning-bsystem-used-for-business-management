 * You may obtain a copy of the License at
        super(monitor, dataSource, resultSet, "GRANTEE");
 *
package org.jkiss.dbeaver.ext.db2.model.security;
    // -----------------------
 *
 * DB2 User
 * DBeaver - Universal Database Manager
        return DB2AuthIDType.U;
import java.sql.ResultSet;
    public DB2AuthIDType getType()

import org.jkiss.dbeaver.ext.db2.model.DB2DataSource;
    @Override
    {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * 
}
 * See the License for the specific language governing permissions and
    // -----------------------
 */
 * Unless required by applicable law or agreed to in writing, software
public class DB2User extends DB2Grantee implements DBAUser {
/**
    // Business Contract

    {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    // -----------------------

    public DB2User(DBRProgressMonitor monitor, DB2DataSource dataSource, ResultSet resultSet)
 * you may not use this file except in compliance with the License.
 * limitations under the License.
    }
 *
    }
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)

 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.access.DBAUser;
 */

    // Constructors
 * @author Denis Forveille

 * distributed under the License is distributed on an "AS IS" BASIS,
    // -----------------------
 * Copyright (C) 2010-2024 DBeaver Corp and others

/*
