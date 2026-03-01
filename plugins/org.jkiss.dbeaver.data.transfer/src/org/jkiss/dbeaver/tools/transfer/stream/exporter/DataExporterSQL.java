    
    private DBDAttributeBinding[] columns;
                    out.write(dialect.escapeString(String.valueOf(buffer, 0, count)));
    private InsertKeyword insertKeyword;
        }
    public static final String PROP_DATA_NATIVE_FORMAT = "nativeFormat";
            firstRow = true;

                    DTUtils.closeContents(resultSet, content);
    private final static String KEYWORD_REPLACE_INTO = "REPLACE INTO";
                    .map(name -> transformIdentifierCase(dataSource, name))
    }
    private final static String KEYWORD_ON_CONFLICT = "ON CONFLICT";
                        sqlBuffer.append("\t").append(identifierCase.transform(KEYWORD_INTO));
                if (dialect != null) {
        if (!CommonUtils.isEmpty(onConflictExpression) && oneLineEntry) {
 *
            DBDAttributeBinding column = columns[i];
import org.jkiss.dbeaver.model.sql.SQLDialect;
    private final static String KEYWORD_UPSERT_INTO = "UPSERT INTO";
                    if (insertKeyword == InsertKeyword.INSERT_ALL) {
                rowsInStatement = 1;
    private final String KEYWORD_INSERT_INTO = "INSERT INTO";

            sqlBuffer.append(" ").append(transformTableNameCase(session.getDataSource(), tableName)).append(" (");
        if (!oneLineEntry && insertKeyword != InsertKeyword.INSERT_ALL) {
        if (insertKeyword == InsertKeyword.ON_CONFLICT) {
            }
        }
        }
            boolean hasColumn = false;
import java.io.Reader;
            String[] mayBeQualifiedNameParts = Arrays.stream(identifierDetector.splitIdentifier(tableIdentifier))
 * distributed under the License is distributed on an "AS IS" BASIS,
                sqlBuffer.append(" (");
            } else if (!oneLineEntry) {
            insertMode = dialect.getDefaultMultiValueInsertMode();
            hasValue = true;
        }
                                getSite().writeBinaryData(cs);
            // We will use custom table name in this case. As is.
    
    public static final String CASE_AS_IS = "as is";
                if (count <= 0) {
            out.write(",");

                    addOnConflictExpression(out);
            for (; ; ) {
    public void init(IStreamDataExporterSite site) throws DBException {
                case UPSERT:
    @Override
                    return s;
        if (properties.containsKey(PROP_INCLUDE_AUTO_GENERATED)) {
    public void exportFooter(DBRProgressMonitor monitor) {
    private SQLDialect.MultiValueInsertMode getDefaultMultiValueInsertMode() {
    public boolean shouldTruncateOutputFileBeforeExport() {
                }
import org.jkiss.dbeaver.model.sql.SQLUtils;
                DBDContent content = (DBDContent) row[i];
                    sqlBuffer.append(identifierCase.transform(KEYWORD_UPSERT_INTO));
        }
                continue;
import java.io.PrintWriter;
    public static final String PROP_LINE_BEFORE_ROWS = "lineBeforeRows";

    private void writeStringValue(Reader reader) throws IOException {
            out.write(")");
    @Override
            }
            return tableIdentifier;
    public static final String PROP_KEYWORD_CASE = "keywordCase";
                    sqlBuffer.append(identifierCase.transform(KEYWORD_REPLACE_INTO));
public class DataExporterSQL extends StreamExporterAbstract implements IAppendableDataExporter {
                case REPLACE:

                hasColumn = true;
                    } else {
            if (CommonUtils.isEmpty(tableName)) {
            out.write(dialect.escapeString(value));
                out.write(rowDelimiter);

import org.jkiss.dbeaver.utils.ContentUtils;
                out.write(value.toString());
            out.write(" (");
    public void exportHeader(DBCSession session) {
                    row[i],
        if (oneLineEntry || insertKeyword == InsertKeyword.INSERT_ALL || rowCount % rowsInStatement == 0) {
        } else {
            out.write(value);
        onConflictExpression = CommonUtils.toString(properties.get(PROP_ON_CONFLICT));
        UPSERT(KEYWORD_UPSERT_INTO),
            out.write(" " + identifierCase.transform(KEYWORD_DUPLICATE_KEY) + " " + onConflictExpression);
                DBDDisplayFormat displayFormat = DBDDisplayFormat.NATIVE;
    @Override
            char buffer[] = new char[2000];

            sqlBuffer.append(identifierCase.transform(KEYWORD_INSERT_ALL));
    private boolean omitSchema;
            if (oneLineEntry || insertKeyword == InsertKeyword.INSERT_ALL) {
        if (dialect != null && rowsInStatement != 1) {
        if (dialect != null) {
        InsertKeyword(String v) {

 */
            if (lineBeforeRows) {
            for (InsertKeyword s : InsertKeyword.values()) {
        INSERT_ALL(KEYWORD_INSERT_ALL),
    private boolean isSkipColumn(DBDAttributeBinding attr) {
            return DBUtils.getFullyQualifiedName(dataSource, mayBeQualifiedNameParts);
                    session.getDataSource(),
                    displayFormat = DBDDisplayFormat.UI;
        PrintWriter out = getWriter();
            tableName = DTUtils.getTableNameFromQueryContainer(session.getDataSource(), (SQLQueryContainer) source);
                    column.getValueHandler(),
            SQLIdentifierDetector identifierDetector = new SQLIdentifierDetector(SQLUtils.getDialectFromDataSource(dataSource));
    }
                if (!useNativeDataFormat && column.getDataKind() == DBPDataKind.DATETIME) {

                boolean needQuotes = false;
        Map<String, Object> properties = site.getProperties();
        }
            out.write(" " + onConflictExpression);
        if (insertKeyword == InsertKeyword.INSERT_ALL) {
                sqlBuffer.append(rowDelimiter);
            tableName = DTConstants.DEFAULT_TABLE_NAME_EXPORT;
                case UPDATE:
                    displayFormat,
                    false);

        } else if (insertKeyword == InsertKeyword.INSERT) {
        if (!columnsAndTableNamesCase.equals(DBPIdentifierCase.MIXED)) {
    public static final String PROP_ON_CONFLICT = "insertOnConflict";
                            if (ContentUtils.isTextContent(content)) {
                        ((DBDContentValueHandler) column.getValueHandler()).writeStreamValue(session.getProgressMonitor(), session.getDataSource(), column, content, out);
import org.jkiss.dbeaver.model.data.*;
            }

    private boolean oneLineEntry;
            }
        if (useNativeDataFormat) {
        //}
            return value;
                    .toArray(String[]::new);
        }
        }
import java.nio.file.Path;
                        addOnConflictExpression(out);
        DBPNamedObject source = getSite().getSource();

            out.write(sqlBuffer.toString());
            this.value = v;
        public static InsertKeyword fromValue(String v) {
        }
        insertKeyword = InsertKeyword.fromValue(CommonUtils.toString(properties.get(PROP_UPSERT)));
        if (keywordCase.equals(CASE_LOWER)) {
            attr instanceof DBDAttributeBindingCustom;
    }
import org.jkiss.dbeaver.model.exec.DBCSession;
            return INSERT;
    }
    public void importData(@NotNull IStreamDataExporterSite site) {
}

            } else if (value instanceof File) {
    	// No pre-initialization process is needed.
            columnsAndTableNamesCase = DBPIdentifierCase.LOWER;
    private final static String KEYWORD_INSERT_ALL = "INSERT ALL";
        }
        PrintWriter out = getWriter();
                }
    private String transformIdentifierCase(DBPDataSource dataSource, String identifier) {
    }
            }
    public static final String PROP_ROWS_IN_STATEMENT = "rowsInStatement";

            switch (insertKeyword) {
    public static final char STRING_QUOTE = '\'';
 * Unless required by applicable law or agreed to in writing, software
import java.util.Map;
        } else {
                    }
        if (oneLineEntry) {
        out.write(STRING_QUOTE);
        }
            includeAutoGenerated = CommonUtils.toBoolean(properties.get(PROP_INCLUDE_AUTO_GENERATED));
                }
                    out.write(buffer, 0, count);
                        // Inline textual content and handle binaries in some special way
                if (s.value.equals(v)) {
        super.init(site);
    @Override
        UPDATE(KEYWORD_UPDATE_OR),
                if (CommonUtils.isNotEmpty(onConflictExpression)) {
    	// This method is called before this.init().
            // Option for people who want to write this expression entirely on their own
    private boolean includeAutoGenerated;
            sqlBuffer.setLength(0);
                }
            identifierCase = DBPIdentifierCase.UPPER;
                    log.warn(e);
                    needQuotes = true;
    @Override
        try {
        return false;
        }
                        if (rowCount % rowsInStatement == 0) {
        public String value() {
        rowCount = 0;
                }
    private void writeStringValue(String value) {
 * You may obtain a copy of the License at
            }
                // If we have disabled "Native Date/Time format" option then we
 */
                        // Content

    private int rowsInStatement;
            Object value = row[i];
            PrintWriter out = getWriter();
            if (rowCount > 0) {
        userTableName = CommonUtils.toString(properties.get(PROP_USER_TABLE_NAME));
                }
            boolean useDBDefaultValueMode = CommonUtils.toBoolean(properties.get(DBSDataManipulator.OPTION_USE_CURRENT_DIALECT_SETTINGS));
                    sqlBuffer.append(rowDelimiter);
        PrintWriter out = getWriter();
        }
            out.write(" " + identifierCase.transform(KEYWORD_ON_CONFLICT) + " " + onConflictExpression);
import org.jkiss.dbeaver.Log;
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (session instanceof DBDFormatSettingsExt) {
                out.write("\t");
    public static final String PROP_OMIT_SCHEMA = "omitSchema";
                out.write(rowDelimiter);
    public static final String PROP_IDENTIFIER_CASE = "identifierCase";
                out.write("@");
        //if (insertMode != SQLDialect.MultiValueInsertMode.PLAIN) {
            tableName = DTUtils.getTableName(session.getDataSource(), source, omitSchema);
    
    public static final String PROP_USER_TABLE_NAME = "userTableName";

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        columns = getSite().getAttributes();
            out.write(STRING_QUOTE);
                                }
import java.util.Arrays;
        }
    private transient long rowCount;
                } else {
            for (DBDAttributeBinding column : columns) {
    }
 * See the License for the specific language governing permissions and
        super.dispose();
import org.jkiss.dbeaver.tools.transfer.DTConstants;
        if (CommonUtils.isNotEmpty(userTableName)) {
        } else if (insertKeyword == InsertKeyword.ON_DUPLICATE) {
                //    sqlBuffer.append(");");
                        if (cs != null) {


            } else {
    private final static String KEYWORD_UPDATE_OR = "UPDATE OR";

                String sqlValue = SQLUtils.convertValueToSQL(
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.tools.transfer.DTUtils;
import org.jkiss.dbeaver.model.*;
    }
            }
                    sqlBuffer.append(";");
                    }
    public void dispose() {
    private final String KEYWORD_INTO = "INTO";
                    }
    private String tableName;
 * Licensed under the Apache License, Version 2.0 (the "License");
            ContentUtils.close(reader);
    enum InsertKeyword {
                if (lineBeforeRows) {

            } else if (value instanceof Path) {
        dialect = SQLUtils.getDialectFromObject(site.getSource());

                // use UI format + enquote value
            identifierCase = DBPIdentifierCase.LOWER;
        if (properties.containsKey(PROP_OMIT_SCHEMA)) {
 * you may not use this file except in compliance with the License.

                    if (column.getValueHandler() instanceof DBDContentValueHandler) {
        for (int i = 0; i < columnsSize; i++) {
import org.jkiss.utils.CommonUtils;
        return attr.isPseudoAttribute() || (!includeAutoGenerated && attr.isAutoGenerated()) ||
                } finally {
    private static String onConflictExpression;
                            sqlBuffer.append(identifierCase.transform(KEYWORD_INSERT_ALL)).append("\n");
        String identifierCaseProp = CommonUtils.toString(properties.get(PROP_IDENTIFIER_CASE));
            } else {
            if (hasValue) {
        }
        oneLineEntry = rowsInStatement == 1;
                out.write(sqlValue);
    private DBPIdentifierCase columnsAndTableNamesCase;
import org.jkiss.code.NotNull;
                } catch (Exception e) {
                tableName = DTUtils.getTargetContainersNameFromQuery((SQLQueryContainer) source);
        }
/**
                    sqlBuffer.append(rowDelimiter).append(identifierCase.transform(KEYWORD_SELECT_FROM_DUAL)).append(";");
        ON_CONFLICT(KEYWORD_ON_CONFLICT);
            sqlBuffer.append(") ");
            sqlBuffer.append(identifierCase.transform(KEYWORD_VALUES));
                //if (insertMode == SQLDialect.MultiValueInsertMode.PLAIN) {
                if (needQuotes) out.write('\'');
        String keywordCase = CommonUtils.toString(properties.get(PROP_KEYWORD_CASE));

            }
                if (isSkipColumn(column)) {
            out.write(STRING_QUOTE);
            out.write(";");
            if (rowsInStatement > 1 && lineBeforeRows && insertKeyword != InsertKeyword.INSERT_ALL) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
                }
            }
        boolean firstRow = false;
                        DBDContentStorage cs = content.getContents(session.getProgressMonitor());
        rowsInStatement = Math.max(1, CommonUtils.toInt(properties.get(PROP_ROWS_IN_STATEMENT)));
            columnsAndTableNamesCase = DBPIdentifierCase.MIXED;
    }
        REPLACE(KEYWORD_REPLACE_INTO),
            }
import org.jkiss.dbeaver.model.exec.DBCResultSet;
            columnsAndTableNamesCase = DBPIdentifierCase.UPPER;
                    column,
        }
 * SQL Exporter
        useNativeDataFormat = CommonUtils.toBoolean(properties.get(PROP_DATA_NATIVE_FORMAT));
        SQLDialect.MultiValueInsertMode insertMode = SQLDialect.MultiValueInsertMode.NOT_SUPPORTED;
                // just skip it
        }
        }
    private DBPIdentifierCase identifierCase;
        boolean hasValue = false;
    @Override
import java.io.IOException;
    private void addOnConflictExpression(PrintWriter out) {
                    if (!CommonUtils.isEmpty(onConflictExpression)) {
import org.jkiss.dbeaver.model.sql.SQLConstants;
                    } else {
                        }
        }
                                    writeStringValue(contentReader);
                default:
            addOnConflictExpression(out);
            } else if (row[i] instanceof DBDContent) {
                out.write(((File) value).getAbsolutePath());
            }

    }
            }
                out.write(SQLConstants.NULL_VALUE);
    private final String KEYWORD_SELECT_FROM_DUAL = "SELECT 1 FROM DUAL";
import org.jkiss.dbeaver.utils.GeneralUtils;
import org.jkiss.dbeaver.tools.transfer.stream.IAppendableDataExporter;
        rowCount++;
        rowDelimiter = GeneralUtils.getDefaultLineSeparator();
                sqlBuffer.append(transformIdentifierCase(session.getDataSource(), DBUtils.getQuotedIdentifier(column)));
        private String value;
                    break;
    }
                try {
        if (properties.containsKey(DBSDataManipulator.OPTION_USE_CURRENT_DIALECT_SETTINGS)) {
        }
                }
                out.write(rowDelimiter + identifierCase.transform(KEYWORD_SELECT_FROM_DUAL) + ";");


    private final String KEYWORD_VALUES = "VALUES";

    }
        } else {
        if (!oneLineEntry && !firstRow) {
                            } else {
            }
    private SQLDialect dialect;
 * limitations under the License.
        out.write(STRING_QUOTE);
import java.io.File;
/*
        } else if (identifierCaseProp.equals(CASE_LOWER)) {
                ((DBDFormatSettingsExt) session).setUseNativeDateTimeFormat(true);
            omitSchema = CommonUtils.toBoolean(properties.get(PROP_OMIT_SCHEMA));
        	if (insertKeyword == InsertKeyword.INSERT_ALL) {
    private final static String KEYWORD_DUPLICATE_KEY = "ON DUPLICATE KEY UPDATE";
                out.write(rowDelimiter);
            // Copy reader
        } else if (source instanceof SQLQueryContainer) {
                }
        } else {
                if (needQuotes) out.write('\'');
                    sqlBuffer.append(',');
        lineBeforeRows = CommonUtils.toBoolean(properties.get(PROP_LINE_BEFORE_ROWS));
        if (CommonUtils.isEmpty(tableName)) {
import org.jkiss.dbeaver.tools.transfer.stream.IStreamDataExporterSite;
import org.jkiss.dbeaver.model.sql.SQLQueryContainer;
 *
    private static final Log log = Log.getLog(DataExporterSQL.class);
        }
                int count = reader.read(buffer);
            }
                out.write(";");
        int columnsSize = columns.length;

                            }
    private boolean lineBeforeRows = true;
                if (!oneLineEntry && insertKeyword != InsertKeyword.INSERT_ALL) {
    }
                    break;
                                try (Reader contentReader = cs.getContentReader()) {
                    break;
package org.jkiss.dbeaver.tools.transfer.stream.exporter;
    private boolean useNativeDataFormat = true;
    public static final String PROP_UPSERT = "upsertKeyword";
    private String userTableName;
import org.jkiss.dbeaver.model.struct.DBSDataManipulator;
            }
 *
    @Override
import org.jkiss.dbeaver.DBException;
                    sqlBuffer.append(identifierCase.transform(KEYWORD_UPDATE_OR)).append(" ").append(identifierCase.transform(KEYWORD_INSERT_INTO));
    }
    }
                }
                out.write(',');

            tableName = userTableName;
    private transient StringBuilder sqlBuffer = new StringBuilder(100);
                } else if (insertKeyword == InsertKeyword.INSERT_ALL && rowCount % rowsInStatement == 0) {

 * DBeaver - Universal Database Manager
    public void exportRow(DBCSession session, DBCResultSet resultSet, Object[] row) throws DBException, IOException {
    public static final String PROP_INCLUDE_AUTO_GENERATED = "includeAutoGenerated";
    }
            if (lineBeforeRows) {
            if (DBUtils.isNullValue(value)) {
                if (hasColumn) {
        } else {
        }

                        }
        if (identifierCaseProp.equals(CASE_AS_IS)) {
        if (rowCount > 0) {

                        sqlBuffer.append(identifierCase.transform(KEYWORD_INSERT_INTO));
        return insertMode;
        } finally {
                out.write("@");
                    break;
                    continue;
            }
        return DBUtils.isQuotedIdentifier(dataSource, identifier) ? identifier : columnsAndTableNamesCase.transform(identifier);
        }
    private String transformTableNameCase(DBPDataSource dataSource, String tableIdentifier) {
        INSERT("INSERT"),
        ON_DUPLICATE(KEYWORD_DUPLICATE_KEY),
    public static final String CASE_LOWER = "lower";
import org.jkiss.dbeaver.model.sql.parser.SQLIdentifierDetector;
    private String rowDelimiter;
            if (useDBDefaultValueMode && getDefaultMultiValueInsertMode() != SQLDialect.MultiValueInsertMode.GROUP_ROWS) {
            if (isSkipColumn(column)) {
