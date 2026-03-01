 *
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.connection.DBPDriver;
    // In LibSQL we don't have proper resulset metadata
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
        this.isRemote = !driver.isEmbedded();
    public boolean supportsNullableUniqueConstraints() {
 * DBeaver - Universal Database Manager
        return true;
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,

    public SQLiteDataSourceInfo(DBPDriver driver, JDBCDatabaseMetaData metaData) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
    }
 */

    public boolean needsTableMetaForColumnResolution() {
        super(driver, metaData);
package org.jkiss.dbeaver.ext.sqlite.model;
    }
import org.jkiss.dbeaver.ext.generic.model.GenericDataSourceInfo;

    }
    private final boolean isRemote;
        return !isRemote;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and

 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
 *
public class SQLiteDataSourceInfo extends GenericDataSourceInfo {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

}

 *
    @Override
