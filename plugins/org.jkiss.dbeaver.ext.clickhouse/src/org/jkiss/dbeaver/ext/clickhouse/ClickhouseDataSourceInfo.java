
    public boolean supportsReferentialIntegrity() {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
 *     http://www.apache.org/licenses/LICENSE-2.0
        return false;
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
 * You may obtain a copy of the License at
 */
    }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSourceInfo;
/*
} * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ext.clickhouse;
    public ClickhouseDataSourceInfo(JDBCDatabaseMetaData metaData) {


 *
 * See the License for the specific language governing permissions and
    public boolean supportsIndexes() {
    }


 *
public class ClickhouseDataSourceInfo extends JDBCDataSourceInfo {
        // So far we turn off indexes
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
        super(metaData);

 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
        // For now - Clickhouse driver return us empty list as indexInfo and we can't create Clickhouse indexes via DBeaver UI
    }
        return false;
