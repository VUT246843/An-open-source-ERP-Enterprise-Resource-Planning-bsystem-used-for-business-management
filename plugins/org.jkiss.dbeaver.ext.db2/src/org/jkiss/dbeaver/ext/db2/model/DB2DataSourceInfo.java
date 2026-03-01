import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSourceInfo;
    public DB2DataSourceInfo(JDBCDatabaseMetaData metaData) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.ext.db2.model;
    @Override
 */
    @Override
        return DB2ObjectType.values();
 */

 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
 * Licensed under the Apache License, Version 2.0 (the "License");

}
 *
    }


 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
        super(metaData);

        return true;
    }
    public DBSObjectType[] getSupportedObjectTypes() {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
/*
import org.jkiss.dbeaver.ext.db2.editors.DB2ObjectType;
 * DB2 data source info
import org.jkiss.dbeaver.model.struct.DBSObjectType;
 * DBeaver - Universal Database Manager
/**
 *
 * limitations under the License.

    }
    public boolean supportsMultipleResults() {
class DB2DataSourceInfo extends JDBCDataSourceInfo {
 * You may obtain a copy of the License at
