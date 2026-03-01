        } catch (Throwable e) {

            identifierQuoteString = new String[][]{{singleQuoteStr, singleQuoteStr}};
        }
 * Unless required by applicable law or agreed to in writing, software
            allFunctions.removeIf(s -> getKeywordType(s) == DBPKeywordType.KEYWORD);
            } else {
        }
        return super.getDataTypes(dataSource);
            identifierQuoteString = new String[0][];
        } catch (Throwable e) {
        return result;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
            if (validCharacters == null) {
            this.quotedIdentCase = DBPIdentifierCase.MIXED;
                if (SQLConstants.DATA_TYPE_VARCHAR.equals(externalTypeName)) {
import org.jkiss.dbeaver.model.sql.SQLDataTypeConverter;

    private static final Log log = Log.getLog(JDBCSQLDialect.class);
    }
        if (this.searchStringEscape == null) {
        try {

    public boolean supportsQuotedMixedCase() {
    public int getCatalogUsage() {
            }
            if (!CommonUtils.isEmpty(sqlKeywords)) {
        return Character.isLetter(c) || Character.isDigit(c) || c == '_' || (quoted && validCharacters.indexOf(c) != -1);
    }
 * limitations under the License.
                    }
            log.debug("Error getting supportsUnquotedMixedCase:" + e.getMessage());
        Collection<? extends DBSDataType> supportedDataTypes = dataSource.getLocalDataTypes();
                        // But other databases are more strict in this case
    @NotNull
    }
import org.jkiss.code.NotNull;
            log.debug("Error getting searchStringEscape:" + e.getMessage());
                    break;
                this.unquotedIdentCase = DBPIdentifierCase.LOWER;
            }
        } catch (Throwable e) {
        List<String> result = new ArrayList<>();
    @Override
                        }

                metaData.supportsSubqueriesInQuantifieds();

import org.jkiss.dbeaver.model.struct.DBSDataType;
        return supportsQuotedMixedCase;
    public DBPIdentifierCase storesQuotedCase() {
            singleQuoteStr = singleQuoteStr.trim();
                metaData.supportsSubqueriesInComparisons() ||
    }
 * you may not use this file except in compliance with the License.

                this.catalogSeparator = String.valueOf(SQLConstants.STRUCT_SEPARATOR);
    public int getSchemaUsage() {
        } catch (Throwable e) {
            switch (metaData.getSQLStateType()) {
import org.jkiss.dbeaver.model.DBPIdentifierCase;
        try {

    @Override
    protected void setSupportsQuotedMixedCase(boolean supportsQuotedMixedCase) {
    }
    @Override
    private SQLStateType sqlStateType;
            typesLoaded = true;
                    (metaData.supportsCatalogsInProcedureCalls() ? SQLDialect.USAGE_PROC : 0) |
        }
        } catch (Throwable e) {

                result.add(st.nextToken().trim());
    @Override
    }
    @NotNull

    protected void loadDataTypesFromDatabase(JDBCDataSource dataSource) {
        } catch (Throwable e) {
 * You may obtain a copy of the License at
            this.isCatalogAtStart = metaData.isCatalogAtStart();
        return catalogSeparator;
    public char getStructSeparator() {
        }
            }
                    (metaData.supportsSchemasInProcedureCalls() ? SQLDialect.USAGE_PROC : 0) |
            }

        return unquotedIdentCase;
        } catch (Throwable e) {
        } catch (Throwable e) {
    @Override
                    this.sqlStateType = SQLStateType.XOPEN;
    }
import java.sql.SQLException;
        }
    public void initDriverSettings(JDBCSession session, JDBCDataSource dataSource, JDBCDatabaseMetaData metaData) {
                        for (String textType : LONG_TEXT_TYPES) {
        }
    private String catalogSeparator = String.valueOf(SQLConstants.STRUCT_SEPARATOR);
            validCharacters = metaData.getExtraNameCharacters();
        return null;
        addDataTypes(dataTypes);
                    long maxLength = sourceTypedObject.getMaxLength();
    public JDBCSQLDialect(String name, String id) {
 * DBeaver - Universal Database Manager
    }

                }
    public Collection<String> getDataTypes(@Nullable DBPDataSource dataSource) {
/**
            log.debug("Error getting catalogSeparator:" + e.getMessage());
        }
            if (singleQuoteStr.isEmpty()) {
            log.debug("Error getting schemaUsage:" + e.getMessage());
        }

            log.debug("Error getting catalogUsage:" + e.getMessage());
            loadFunctions(session, metaData, allFunctions);
        this.supportsQuotedMixedCase = supportsQuotedMixedCase;
    }
    public String convertExternalDataType(@NotNull SQLDialect sourceDialect, @NotNull DBSTypedObject sourceTypedObject, @Nullable DBPDataTypeProvider targetTypeProvider) {
    protected void setIdentifierQuoteString(String[][] identifierQuoteString) {
    }
package org.jkiss.dbeaver.model.impl.jdbc;
    @NotNull
    }
        }
import org.jkiss.code.Nullable;
    private static final String[] LONG_TEXT_TYPES = {
            log.debug("Error getting unquotedIdentCase:" + e.getMessage());

    private boolean isCatalogAtStart;
    @Override
        }
import org.jkiss.dbeaver.model.DBPKeywordType;
    }
            }
 *
    @NotNull
    @Override
            log.debug("Error getting supportsQuotedMixedCase: " + e.getMessage());
            log.debug("Error getting validCharacters:" + e.getMessage());
        if (dataTypes.isEmpty() && needsDefaultDataTypes()) {
            if (CommonUtils.isEmpty(this.catalogSeparator)) {
    @Override
        allFunctions.addAll(makeStringList(metaData.getStringFunctions()));
            this.unquotedIdentCase = DBPIdentifierCase.MIXED;
        this.unquotedIdentCase = unquotedIdentCase;
    }
    private transient boolean typesLoaded = false;
import org.jkiss.dbeaver.model.sql.SQLConstants;
        allFunctions.addAll(makeStringList(metaData.getSystemFunctions()));
/*
            // Add default types

    public SQLStateType getSQLStateType() {
            log.debug("Error getting supportsSubqueries: " + e.getMessage());
                    break;
        "string",
    private DBPIdentifierCase quotedIdentCase = getDefaultIdentifiersCase();
        return false;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect;
        "text",
        try {
            } else if (metaData.storesLowerCaseIdentifiers()) {
        this.id = id;
import org.jkiss.dbeaver.model.DBPDataSource;
    }
                    break;
            log.debug("Error getting identifierQuoteString: " + e.getMessage());
            Set<String> allFunctions = new HashSet<>();
            catalogUsage = SQLDialect.USAGE_NONE;
                        // Some databases can not have varchar data type without modifiers.
import org.jkiss.dbeaver.model.sql.SQLDialect;
    private String searchStringEscape;
                (metaData.supportsCatalogsInDataManipulation() ? SQLDialect.USAGE_DML : 0) |
    private final String id;
        if (supportedDataTypes != null) {
        }
    }
            validCharacters = ""; //$NON-NLS-1$
        } catch (Throwable e) {
        }
                default:
        }
                if (!dataType.getDataKind().isComplex()) {
 *
    }
        }
                this.quotedIdentCase = DBPIdentifierCase.UPPER;
        return name;
                validCharacters = validCharacters.trim();
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
            }
            if (metaData.storesUpperCaseIdentifiers()) {
                String externalTypeName = typeName.toLowerCase(Locale.ENGLISH);
        try {
        } else {
    private String[][] identifierQuoteString = new String[][]{{SQLConstants.DEFAULT_IDENTIFIER_QUOTE, SQLConstants.DEFAULT_IDENTIFIER_QUOTE}};
    protected String validCharacters = "";


            this.supportsQuotedMixedCase = metaData.supportsMixedCaseQuotedIdentifiers();
public class JDBCSQLDialect extends BasicSQLDialect implements SQLDataTypeConverter {
                validCharacters = "";
            singleQuoteStr = SQLConstants.DEFAULT_IDENTIFIER_QUOTE;
    @NotNull
            // Remove functions which clashes with keywords
    }
    protected DBPIdentifierCase getDefaultIdentifiersCase() {
        "longtext",
        } catch (Throwable e) {
                            DBSDataType textDataType = targetTypeProvider.getLocalDataType(textType);
import org.jkiss.dbeaver.Log;
        if (singleQuoteStr != null) {
    private void loadDriverKeywords(JDBCSession session, JDBCDataSource dataSource, JDBCDatabaseMetaData metaData) {
    private boolean supportsSubqueries = false;
            this.supportsUnquotedMixedCase = false;
    @NotNull
        return supportsUnquotedMixedCase;
                        // Let's use another text data type instead
        this.supportsUnquotedMixedCase = supportsUnquotedMixedCase;
                    this.sqlStateType = SQLStateType.SQL99;
                case DatabaseMetaData.sqlStateXOpen:
        }
        this.name = name;
        return id;
    @Override

    }
    public boolean validIdentifierPart(char c, boolean quoted) {
        List<String> dataTypes = new ArrayList<>();

        try {


        } catch (Throwable e) {

        allFunctions.addAll(makeStringList(metaData.getNumericFunctions()));
        try {
    @Override
            this.searchStringEscape = metaData.getSearchStringEscape();
                            if (textDataType != null) {
    @Override
        loadDriverKeywords(session, dataSource, metaData);

        try {
                                return textDataType.getName();
    }
        try {
 * distributed under the License is distributed on an "AS IS" BASIS,
        } catch (Throwable e) {
                this.unquotedIdentCase = DBPIdentifierCase.MIXED;
import org.jkiss.utils.CommonUtils;
            } else {
        String singleQuoteStr;
    public void setSupportsSubqueries(boolean supportsSubqueries) {
import org.jkiss.dbeaver.DBException;
        return new String[0];

        return sqlStateType;
                    (metaData.supportsCatalogsInPrivilegeDefinitions() ? SQLDialect.USAGE_PRIV : 0);
            log.debug("Error getting sqlStateType: " + e.getMessage());
    @Override
    }
    protected void setUnquotedIdentCase(@NotNull DBPIdentifierCase unquotedIdentCase) {

    @NotNull

    @Override
    @Override
    @Override
            this.searchStringEscape = ""; //$NON-NLS-1$
            supportsSubqueries = metaData.supportsCorrelatedSubqueries() ||
    public String getCatalogSeparator() {
        if (targetTypeProvider != null) {
        return DBPIdentifierCase.MIXED;
    @Override
                metaData.supportsSubqueriesInIns() ||
    public boolean supportsSubqueries() {
        return searchStringEscape;
                (metaData.supportsSchemasInDataManipulation() ? SQLDialect.USAGE_DML : 0) |
    @NotNull
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        } catch (SQLException e) {
    }
    public String getDialectId() {
                for (String keyword : sqlKeywords) {
            schemaUsage = SQLDialect.USAGE_DDL | SQLDialect.USAGE_DML;
        try {
    }
    }
        // Some driver return extra characters which must be quoted. We can't know this here.
    @Nullable
 * SQL Dialect JDBC API implementation

        try {
    @Override
                    (metaData.supportsSchemasInIndexDefinitions() ? SQLDialect.USAGE_INDEX : 0) |
    private boolean supportsUnquotedMixedCase;

            log.debug("Error getting quotedIdentCase:" + e.getMessage());
 */
import org.jkiss.dbeaver.model.sql.SQLStateType;
            }
    @NotNull
                    if (maxLength <= 0) {

    @NotNull
            Collections.addAll(dataTypes, SQLConstants.DEFAULT_TYPES);
            singleQuoteStr = metaData.getIdentifierQuoteString();
        if (source != null && source.length() > 0) {


        return schemaUsage;
            loadDataTypesFromDatabase((JDBCDataSource) dataSource);
            this.supportsUnquotedMixedCase = metaData.supportsMixedCaseIdentifiers();

        allFunctions.addAll(makeStringList(metaData.getTimeDateFunctions()));

        }
        if (singleQuoteStr == null) {
    private final String name;
                this.quotedIdentCase = DBPIdentifierCase.LOWER;
            } else if (metaData.storesLowerCaseQuotedIdentifiers()) {
            } else {
 * Licensed under the Apache License, Version 2.0 (the "License");
                singleQuoteStr = null;
        clearDataTypes();
 */
    public String getSearchStringEscape() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.supportsSubqueries = supportsSubqueries;
        }
    private boolean supportsQuotedMixedCase;
        try {
            StringTokenizer st = new StringTokenizer(source, ";,"); //$NON-NLS-1$
            catalogUsage =
    }
            // Keywords
    private DBPIdentifierCase unquotedIdentCase = getDefaultIdentifiersCase();
    @NotNull
            log.debug("Error reading SQL keywords: " + e.getMessage());
            this.catalogSeparator = String.valueOf(SQLConstants.STRUCT_SEPARATOR);
    }
            for (DBSDataType dataType : supportedDataTypes) {
    public void setSupportsUnquotedMixedCase(boolean supportsUnquotedMixedCase) {
                            }
    public String[] getExecuteKeywords() {
        "clob",
                        // Like PostgreSQL where varchar without modifiers == text.
                    (metaData.supportsSchemasInTableDefinitions() ? SQLDialect.USAGE_DDL : 0) |

    };
    public String getDialectName() {
            this.sqlStateType = SQLStateType.UNKNOWN;
    }
        try {
                    dataTypes.add(dataType.getName().toUpperCase(Locale.ENGLISH));
import org.jkiss.dbeaver.model.DBPDataTypeProvider;


            while (st.hasMoreTokens()) {
    }
            addFunctions(allFunctions);
 * See the License for the specific language governing permissions and
        return quotedIdentCase;

                }

        } catch (Throwable e) {
        try {
    }
                this.unquotedIdentCase = DBPIdentifierCase.UPPER;
                metaData.supportsSubqueriesInExists() ||
        }
            // Functions

                    addSQLKeyword(keyword.toUpperCase());
    private int catalogUsage = SQLDialect.USAGE_ALL;
}
                    (metaData.supportsCatalogsInTableDefinitions() ? SQLDialect.USAGE_DDL : 0) |
        return isCatalogAtStart;

    @Override
            if (metaData.storesUpperCaseQuotedIdentifiers()) {
            }
        }
                    (metaData.supportsSchemasInPrivilegeDefinitions() ? SQLDialect.USAGE_PRIV : 0);
    }
                    (metaData.supportsCatalogsInIndexDefinitions() ? SQLDialect.USAGE_INDEX : 0) |
    public boolean supportsUnquotedMixedCase() {

    }
        }
        this.identifierQuoteString = identifierQuoteString;
            schemaUsage =
                this.quotedIdentCase = DBPIdentifierCase.MIXED;
    protected int schemaUsage = SQLDialect.USAGE_ALL;
 *
    public String[][] getIdentifierQuoteStrings() {
            log.debug("Error getting isCatalogAtStart:" + e.getMessage());

 *     http://www.apache.org/licenses/LICENSE-2.0

    public boolean supportsUpsertStatement() {
                    this.sqlStateType = SQLStateType.UNKNOWN;

    public boolean isCatalogAtStart() {
import java.util.*;
            String typeName = sourceTypedObject.getTypeName();
        if (!typesLoaded && dataSource instanceof JDBCDataSource) {
        }
    protected void loadFunctions(JDBCSession session, JDBCDatabaseMetaData metaData, Set<String> allFunctions) throws DBException, SQLException {
            }
                }
            this.catalogSeparator = metaData.getCatalogSeparator();
        }
    }
        try {
        } catch (Throwable e) {
            Collection<String> sqlKeywords = makeStringList(metaData.getSQLKeywords());
        try {
import java.sql.DatabaseMetaData;

        return catalogUsage;
        }
        return supportsSubqueries;
    private static List<String> makeStringList(String source) {
        return identifierQuoteString;
            }
            this.supportsQuotedMixedCase = false;
            log.debug("Error reading SQL functions: " + e.getMessage());
                case DatabaseMetaData.sqlStateSQL99:

    @Override

    public DBPIdentifierCase storesUnquotedCase() {
    }
            this.isCatalogAtStart = true;
            if (CommonUtils.isNotEmpty(typeName)) {
        "nclob"

    @NotNull
        return SQLConstants.STRUCT_SEPARATOR;
