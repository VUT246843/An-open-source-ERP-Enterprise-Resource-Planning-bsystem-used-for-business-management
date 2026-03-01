

/*
import org.jkiss.dbeaver.model.DBUtils;
 */

public class GreenplumExternalTable extends PostgreTable {
        return rejectLimit;
    private boolean tableHasCommand() {
 *     http://www.apache.org/licenses/LICENSE-2.0

                    .map(field -> "\t" + field.getName() + " " + field.getTypeName())
    }
import java.sql.ResultSet;
                .append(this.getName())
    @Property(viewable = true, editable = true, updatable = true, order = 26,
            this.rejectLimitType = rejectLimitTypeString;

    }
        this.formatType = FormatType.fromValue(formatType);
                .orElse(Collections.emptyList())
    private String command;
        }
    }
        t("TEXT"),
                                  ResultSet dbResult) {
}
    }
        }
        c("CSV"),
    public void setFormatOptions(String formatOptions) {

                    .append("SEGMENT REJECT LIMIT ")

    }
        super(catalog);
            this.rejectLimitType = CommonUtils.valueOf(RejectLimitType.class, rejectlimittype, RejectLimitType.r);
        }
        public boolean allowCustomValue() {
            ddlBuilder.append(generateFormatOptions(this.formatType, this.getFormatOptions()));
        return "ON ALL";
                    .collect(Collectors.toList());
    private boolean temporaryTable;

        private String rejectLimitType;
        if (tableColumns.size() == 0) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (this.getExecLocation() != null && this.getExecLocation().equalsIgnoreCase("MASTER_ONLY")) {
        return formatOptions;
            return " ( FORMATTER=" + formatterSpec + " )";
                JDBCUtils.safeGetStringTrimmed(dbResult, "urilocation"), ',');
    private RejectLimitType rejectLimitType;
            tableColumns = tableColumnsStream

        }
        }
        }
        } else {
        }
                new GreenplumExternalTableUriLocationsHandler(lineFeedSeparatedUriLocations, '\n');
        }
        this.loggingErrors = !getDataSource().isServerVersionAtLeast(9, 4)
        }
        return tableColumns;
        public String getValue() {
    }
        List<PostgreTableColumn> tableColumns;
    }
        FormatType(String formatTypeString) {

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        this.formatType = CommonUtils.valueOf(FormatType.class, JDBCUtils.safeGetString(dbResult, "fmttype"), FormatType.b);
import org.jkiss.dbeaver.model.meta.IPropertyValueTransformer;
                .append("TABLE ")
import java.util.stream.Stream;

            @Nullable String commaSeparatedListUriLocations) throws IllegalArgumentException {
        } else if (tableHasCommand()) {
import org.jkiss.code.Nullable;
                    .orElse(b);
    }
        this.formatOptions = formatOptions;
            ddlBuilder.append(tableColumns
    public void setEncoding(String encoding) {
    private String encoding;
        private String formatType;
    public String generateChangeOwnerQuery(@NotNull String owner, @NotNull Map<String, Object> options) {
    private static final String DEFAULT_FORMAT_OPTIONS = "delimiter ',' null '' escape '\"' quote '\"' header";
    public String getExecLocation() {

 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
                .stream();
    public GreenplumExternalTable(PostgreSchema catalog) {
            ddlBuilder.append(this.isLoggingErrors() ? " " : "\n")
import org.jkiss.code.NotNull;
        }


                    .filter(field -> field.getOrdinalPosition() == TEMPORARY_COLUMN_ORDINAL_POSITION)
                    .findFirst()
        this.temporaryTable = JDBCUtils.safeGetBoolean(dbResult, "is_temp_table");
        return this.uriLocationsHandler.getCommaSeparatedList();
        p("PERCENT ");
            return Arrays.stream(GreenplumCharacterSet.values())

        return execLocation;
    }

                && JDBCUtils.safeGetBoolean(dbResult, "is_logging_errors");
            return null;
    }
    }
    private boolean loggingErrors;
        this.execLocation = JDBCUtils.safeGetString(dbResult, "execlocation");
        return this.isTemporaryTable() ? "" : databaseQualifier;
    public String getFormatOptions() {
        StringBuilder databaseQualifier = new StringBuilder().append(this.getDatabase().getName())
        if(this.getFormatOptions() != null) {
        public boolean allowCustomValue() {
                    .map(location -> "\t'" + location + "'")
        this.command = JDBCUtils.safeGetString(dbResult, "command");
        }
        this.writable = JDBCUtils.safeGetBoolean(dbResult, "writable");
    }
    private String execLocation;
        this.rejectLimit = JDBCUtils.safeGetInt(dbResult, "rejectlimit");
                .append(".");
            return false;
    private int rejectLimit;
                    .stream(values())
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            tableColumns = tableColumnsStream
        } else if (tableColumns.size() == 1) {
        return temporaryTable;
        public static FormatType fromValue(String formatTypeString) throws IllegalArgumentException {
    public boolean isTemporaryTable() {
        List<PostgreTableColumn> tableColumns = filterOutNonMetadataColumns(monitor);
                .append(this.isWritable() ? "WRITABLE " : "")
                    .filter(formatType -> formatType.getValue().equalsIgnoreCase(formatTypeString))
                .append(" (\n");

            return rejectLimitType;
package org.jkiss.dbeaver.ext.greenplum.model;
            this.formatType = formatTypeString;
            return Arrays.stream(GreenplumExternalTable.FormatType.values())
    private CharSequence addDatabaseQualifier() {
        return writable;
    public String getUriLocations() {
        @Override


    public static class ExternalTableFormatTypeProvider implements IPropertyValueListProvider<GreenplumExternalTable> {
import java.util.*;
    public enum FormatType {
        if (CommonUtils.isNotEmpty(this.getUriLocations())) {



        b("CUSTOM");
        }
            return "";
                .append(isWebTable() ? "WEB " : "")
    private List<PostgreTableColumn> filterOutNonMetadataColumns(DBRProgressMonitor monitor) throws DBException {
            ddlBuilder.append("\t").append(column.getName()).append(" ").append(column.getTypeName()).append("\n)\n");
        return command;
    }
    }



                    .append(" ")
    }

    }
    }
        super(catalog, dbResult);
import java.util.function.Predicate;
        String rejectlimittype = JDBCUtils.safeGetString(dbResult, "rejectlimittype");
import org.jkiss.dbeaver.DBException;
    public static class ExternalTableUriLocationsRenderer
    private String determineExecutionLocation() {
    public String getCommand() {
            length = PropertyLength.MULTILINE, valueRenderer = ExternalTableUriLocationsRenderer.class)
        } else {
 * limitations under the License.
        if (this.getEncoding() != null && this.getEncoding().length() > 0) {

        if (this.getRejectLimit() > 0 && this.getRejectLimitType() != null) {
        assert CommonUtils.isNotEmpty(owner);
        return (this.uriLocationsHandler.stream().anyMatch(location -> location.startsWith("http"))
                    .filter(excludeCustomTypes)
        Stream<? extends PostgreTableColumn> tableColumnsStream = Optional.ofNullable(this.getAttributes(monitor))

    public RejectLimitType getRejectLimitType() {


        this.encoding = GreenplumCharacterSet.UNICODE_8BIT.getCharacterSetValue();
    }
            final int TEMPORARY_COLUMN_ORDINAL_POSITION = -1;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableColumn;
    private String generateFormatOptions(FormatType formatType, String formatOptions) {


                    .filter(field -> field.getOrdinalPosition() >= 0)

    }
    public static class GreenplumCharacterSetProvider implements IPropertyValueListProvider<GreenplumExternalTable> {

                    .map(GreenplumExternalTable.FormatType::getValue).toArray();
    }
        @Nullable
    public String generateDDL(DBRProgressMonitor monitor) throws DBException {
                    .map(GreenplumCharacterSet::getCharacterSetValue).toArray();

            listProvider = ExternalTableFormatTypeProvider.class)
        r("ROWS"),
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
        this.formatOptions = DEFAULT_FORMAT_OPTIONS;

 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTable;
                .append(".")
        this.uriLocationsHandler =
        @Nullable
        if (rejectlimittype != null && rejectlimittype.length() > 0) {
    }
        }
            ddlBuilder.append("EXECUTE '").append(this.getCommand()).append("' ").append(determineExecutionLocation()).append("\n");
    }
        }
            implements IPropertyValueTransformer<GreenplumExternalTable, String> {
        RejectLimitType(String rejectLimitTypeString) {

        }
                    .collect(Collectors.toList());
    @Override

        this.formatOptions = JDBCUtils.safeGetString(dbResult, "fmtopts");
    public GreenplumExternalTable(PostgreSchema catalog,
        this.formatType = FormatType.t;
        } else {

            String formatterSpec = formatSpecTokens.length >= 2 ? formatSpecTokens[1] : "";
                    .append(this.getRejectLimitType().getValue());
    public void setUriLocations(String lineFeedSeparatedUriLocations) {
 *
        ddlBuilder.append("CREATE ")
import org.jkiss.utils.CommonUtils;
        StringBuilder ddlBuilder = new StringBuilder();
        if (formatType == null || formatOptions.isEmpty()){
        this.uriLocationsHandler = new GreenplumExternalTableUriLocationsHandler("", '\n');
            @NotNull GreenplumExternalTable greenplumExternalTable,
        }
 *
                    .collect(Collectors.joining(",\n")));
                .append("EXTERNAL ")
    public String getFormatType() {
            return Arrays
            ddlBuilder.append("\nLOG ERRORS");
            PostgreTableColumn column = tableColumns.get(0);

        return " ( " + formatOptions + " )";
            String[] formatSpecTokens = formatOptions.split(" ");
        public Object[] getPossibleValues(GreenplumExternalTable object) {
        return loggingErrors;
        if (this.formatType == null) {


    public enum RejectLimitType {


                .append(this.getSchema().getName())
            Predicate<FormatType> excludeCustomTypes = formatType -> !formatType.equals(FormatType.b);
        return ddlBuilder.toString();
            return false;
        return rejectLimitType;
        }
        ddlBuilder.append("FORMAT '").append(this.getFormatType()).append("'");
        }
                    .append(this.getRejectLimit())
    @Property(viewable = true, editable = true, updatable = true, order = 27)
        }
                    .stream()

            ddlBuilder.append("\nENCODING '").append(this.getEncoding()).append("'");
 * See the License for the specific language governing permissions and

        if(this.isPersisted()) {

            return "ON MASTER";

    }
            ddlBuilder.append("\n)\n");

            ddlBuilder.append("\n) ").append(determineExecutionLocation()).append("\n");

        if (this.isLoggingErrors()) {

        @Nullable
    }
                .append(this.isTemporaryTable() ? "TEMPORARY " : "")
        }
            return this.formatType.getValue();
    @Property(viewable = true, editable = true, updatable = true, order = 24,
    private boolean writable;
    public boolean isWritable() {
                    .collect(Collectors.joining(",\n")));
        }
            listProvider = GreenplumCharacterSetProvider.class)
            ddlBuilder.append("LOCATION (\n");

    }

        public Object[] getPossibleValues(GreenplumExternalTable object) {
    }
        return (this.getCommand() != null && !this.getCommand().isEmpty());
    }
            ddlBuilder.append("\n)\n");
                .append(addDatabaseQualifier())
    public int getRejectLimit() {
    private FormatType formatType;
    }
        } else {
        }



        public String transform(
    private String formatOptions;
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
        this.uriLocationsHandler = new GreenplumExternalTableUriLocationsHandler(

    private boolean isWebTable() {
        if (formatType.equals(FormatType.b)) {

 * Unless required by applicable law or agreed to in writing, software
    @Property(viewable = true, editable = true, updatable = true, order = 25,

            this.rejectLimitType = null;
            ddlBuilder.append(this.uriLocationsHandler
    public void setFormatType(String formatType) {
                || tableHasCommand());
 *

        return "ALTER EXTERNAL TABLE " + DBUtils.getEntityScriptName(this, options) + " OWNER TO " + owner;
            return formatType;

        public String getValue() {
    public String getEncoding() {
            return greenplumExternalTable.uriLocationsHandler.getLineFeedSeparatedList();

 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.meta.PropertyLength;
        this.encoding = encoding;
import org.jkiss.dbeaver.model.meta.Property;
    }
    public boolean isLoggingErrors() {
 * you may not use this file except in compliance with the License.
        this.encoding = JDBCUtils.safeGetString(dbResult, "encoding");
    private GreenplumExternalTableUriLocationsHandler uriLocationsHandler;
import java.util.stream.Collectors;

        return encoding;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                    .stream()
