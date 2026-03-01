    @Override
/**
public class PostgreServerPostgreSQL extends PostgreServerExtensionBase {
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSetting;
    public boolean supportsKeyAndIndexRename() {
    @Override
    @Override
    public boolean supportsDatabaseSize() {
 * You may obtain a copy of the License at
    @Override
        return true;
 */
 * limitations under the License.
    }
    }
    public boolean supportsCopyFromStdIn() {


    public PostgreServerPostgreSQL(PostgreDataSource dataSource) {

    public boolean supportsHasOidsColumn() {
    public boolean supportsDisablingAllTriggers() {
    }
        return "PostgreSQL";
        return true;
    @Override
    public boolean supportsStorageModifier() {

    }
        final PostgreSetting setting = dataSource.getSetting(PostgreConstants.OPTION_STANDARD_CONFORMING_STRINGS);
    }
    @Override
    }
        return dataSource.isServerVersionAtLeast(9, 3);
    public boolean supportsPGConstraintExpressionColumn() {
        return true;
        return dataSource.isServerVersionAtLeast(16, 0);
    public String getServerTypeName() {
    @Override

 */
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
 * PostgreServerPostgreSQL
 * you may not use this file except in compliance with the License.
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
 *
    }
    }
    public boolean supportsAlterUserChangePassword() {
        return true;

 *
/*
    @Override

    @Override
}

 *
    public boolean supportsBackslashStringEscape() {

    }

    }
    public boolean supportsAlterStorageStrategy() {
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ext.postgresql.model.impls;
        return true;
    }
    public boolean supportsRowLevelSecurity() {
        return dataSource.isServerVersionAtLeast(8, 0);
    public boolean supportsEventTriggers() {
        return true;
 * Unless required by applicable law or agreed to in writing, software
    @Override
        return true;
    public boolean supportsGeneratedColumns() {



import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
    public static final String TYPE_ID = "postgresql";
    }
        return dataSource.isServerVersionAtLeast(10, 0);
        super(dataSource);
    @Override
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
        return setting != null && "off".equals(setting.getValue());
    public boolean supportsEntityMetadataInResults() {
    }
    @Override
    }


    }

    @Override
    @Override
        return dataSource.isServerVersionAtLeast(12, 0);
    }

 * distributed under the License is distributed on an "AS IS" BASIS,

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public boolean supportsJobs() {
    @Override

        return dataSource.isServerVersionAtLeast(9, 2);
        return !dataSource.isServerVersionAtLeast(12, 0);
