 * Licensed under the Apache License, Version 2.0 (the "License");
    };
        return "Use " + identifierQuoteStrings[0][0] + identifierQuoteStrings[0][1] + " to quote identifiers if needed.";

import java.time.format.DateTimeFormatter;
        if (stringsQuoteRule != null) {

            if (!CommonUtils.isEmpty(currentSchema)) {
    public static int calcSystemPromptLength(@NotNull List<AIMessage> messages) {
        lines.add("Current date and time: " + DateTimeFormatter.ISO_DATE_TIME.format(ZonedDateTime.now()));
 *

        "Place any explanation or comments before the SQL code block.",
                lines.add("Current " + (dsInfo == null ? "Schema" : dsInfo.getSchemaTerm()) + ": " + currentSchema);


        return messages.stream()
import org.jkiss.dbeaver.model.ai.AIMessageType;
        String useLanguage = DBWorkbench.getPlatform().getPreferenceStore().getString(AIConstants.AI_RESPONSE_LANGUAGE);
    @Nullable

            DBPDataSourceInfo dsInfo = ds == null ? null : ds.getInfo();
            }
        if (identifierQuoteStrings == null || identifierQuoteStrings.length == 0) {
import java.util.List;
            instructions.add(stringsQuoteRule);
            }
            .sum();
 * See the License for the specific language governing permissions and
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.DBPDataSource;
 * limitations under the License.
    public static String[] createGeneralRulesInstructions() {
            instructions.add("Use " + useLanguage + " language in your responses.");
        instructions.add("Do not invent columns, tables, or data that aren't explicitly defined.");
        SQLDialect dialect = dataSource == null ? BasicSQLDialect.INSTANCE :

            SQLUtils.getDialectFromDataSource(dataSource.getDataSourceContainer().getDataSource());
 *     http://www.apache.org/licenses/LICENSE-2.0
            instructions.add(quoteRule);
            return null;
    private static String identifiersQuoteRule(SQLDialect dialect) {
                DBPDriver driver = dataSource.getDataSourceContainer().getDriver();
            String currentSchema = dataSource.getCurrentSchema();
import java.util.ArrayList;


        return lines.toArray(String[]::new);
import org.jkiss.dbeaver.model.ai.AIMessage;
    }
 * DBeaver - Universal Database Manager
    public static final String[] SQL_OUTPUT_FORMATS = {
        List<String> lines = new ArrayList<>();
import org.jkiss.dbeaver.model.sql.SQLUtils;
import org.jkiss.dbeaver.runtime.DBWorkbench;
        } else {

        instructions.add("Stick strictly to SQL dialect syntax.");
        }
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect;
        List<String> instructions = new ArrayList<>();
        return instructions.toArray(new String[0]);
import org.jkiss.code.NotNull;
                    lines.add("JDBC driver: " + dsInfo.getDriverName() + " (" + dsInfo.getDriverVersion() + ")");

        String[][] stringQuoteStrings = dialect.getStringQuoteStrings();
    }
        instructions.add("Rely only on the provided schema information.");

            if (dataSource.getDataSourceContainer() instanceof DataSourceDescriptor) {
        String[][] identifierQuoteStrings = dialect.getIdentifierQuoteStrings();
    private static String stringsQuoteRule(SQLDialect dialect) {

        }
        }
import org.jkiss.dbeaver.model.ai.AIConstants;
public class AIPromptUtils {
                lines.add("DBeaver connection name: " + dataSource.getDataSourceContainer().getName());
        if (dataSource != null) {
package org.jkiss.dbeaver.model.ai.impl;
    }
        "Provide the SQL query in a fenced Markdown code block."
import org.jkiss.dbeaver.model.connection.DBPDriver;
import org.jkiss.dbeaver.model.logical.DBSLogicalDataSource;
                }
 */
        if (stringQuoteStrings.length == 0) {
import org.jkiss.dbeaver.model.DBPDataSourceInfo;
                lines.add("Current " + (dsInfo == null ? "Catalog" : dsInfo.getCatalogTerm()) + ": " + currentCatalog);
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
            if (!CommonUtils.isEmpty(currentCatalog)) {
        if (quoteRule != null) {
    }
            return null;
 *
    public static String[] describeDataSourceInfo(@Nullable DBSLogicalDataSource dataSource) {
import java.time.ZonedDateTime;
        return "Use " + stringQuoteStrings[0][0] + stringQuoteStrings[0][1] + " to quote strings.";
import org.jkiss.dbeaver.model.sql.SQLDialect;
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
        instructions.add("Act as a database architect and SQL expert.");
 *
 * You may obtain a copy of the License at
                } else {
/*
            String currentCatalog = dataSource.getCurrentCatalog();
        return instructions.toArray(new String[0]);
import org.jkiss.code.Nullable;

 * Unless required by applicable law or agreed to in writing, software
        if (!CommonUtils.isEmpty(useLanguage)) {
        }
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.dbeaver.registry.DataSourceDescriptor;
        }
            .mapToInt(it -> it.getContent().length())
            }

        instructions.add("You are the DBeaver AI assistant.");
        lines.add("SQL dialect: " + dialect.getDialectName());
        SQLDialect dialect = dataSource == null ? BasicSQLDialect.INSTANCE :
    public static String[] createGenerateQueryInstructions(@Nullable DBSLogicalDataSource dataSource) {
            DBPDataSource ds = dataSource.getDataSourceContainer().getDataSource();
        List<String> instructions = new ArrayList<>();
    }
        String quoteRule = identifiersQuoteRule(dialect);
                if (ds instanceof JDBCDataSource) {
        String stringsQuoteRule = stringsQuoteRule(dialect);
            .filter(it -> it.getRole() == AIMessageType.SYSTEM)
}
                    lines.add("Java driver: " + driver.getFullName());
            instructions.add("Use the same language as the user.");
            SQLUtils.getDialectFromDataSource(dataSource.getDataSourceContainer().getDataSource());
