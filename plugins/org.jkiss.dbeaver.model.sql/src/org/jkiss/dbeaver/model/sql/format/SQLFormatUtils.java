        @Nullable DBPDataSource dataSource,
        @NotNull SQLSyntaxManager syntaxManager,
 * you may not use this file except in compliance with the License.
 *
        }

import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;
        SQLSyntaxManager syntaxManager = new SQLSyntaxManager();
        @Nullable String indent
        return formatSQL(dataSource, syntaxManager, query, null);
/*


 */
    }
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public static String formatSQL(DBPDataSource dataSource, String query, @Nullable String indent) {

        return formatSQL(dataSource, syntaxManager, query, indent);
import org.jkiss.dbeaver.model.DBPDataSource;
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.dbeaver.model.sql.registry.SQLFormatterConfigurationRegistry;
        if (formatter == null) {
            return query;
 * See the License for the specific language governing permissions and
        SQLFormatter formatter = SQLFormatterConfigurationRegistry.getInstance().createFormatter(configuration);
        if (indent != null) {
public class SQLFormatUtils {
 *
}
package org.jkiss.dbeaver.model.sql.format;
 */
 * Unless required by applicable law or agreed to in writing, software
    ) {
    public static String formatSQL(DBPDataSource dataSource, String query) {
 * SQL Formatter

    }
    }
import org.jkiss.code.NotNull;
        return formatSQL(dataSource, query, null);
        }
/**
 *     http://www.apache.org/licenses/LICENSE-2.0
        syntaxManager.init(dataSource.getSQLDialect(), dataSource.getContainer().getPreferenceStore());
 *
        SQLFormatterConfiguration configuration = new SQLFormatterConfiguration(dataSource, syntaxManager);
 * Copyright (C) 2010-2024 DBeaver Corp and others
            configuration.setIndentString(indent);
 * Licensed under the Apache License, Version 2.0 (the "License");
    public static String formatSQL(
import org.jkiss.code.Nullable;
    public static String formatSQL(@Nullable DBPDataSource dataSource, @NotNull SQLSyntaxManager syntaxManager, String query) {
        @NotNull String query,
        return formatter.format(query, configuration);

 * limitations under the License.
 * DBeaver - Universal Database Manager
    }
