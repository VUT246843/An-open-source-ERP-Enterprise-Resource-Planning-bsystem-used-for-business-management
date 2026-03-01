        for (int i = 0; i < row.length && i < columns.length; i++) {
import org.jkiss.dbeaver.tools.transfer.stream.IStreamDataExporterSite;

import org.jkiss.dbeaver.utils.ContentUtils;
                try {
        boolean insideQuotes = false;

            value = buffer.toString();
        }
 * DBeaver - Universal Database Manager
    private String delimiter;
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
        // check for needed quote
                    colName = column.getParentObject() == null ? column.getName() : DBUtils.getObjectFullName(column, DBPEvaluationContext.UI);
            String colName = column.getName();
import org.jkiss.dbeaver.model.struct.DBSEntity;
        if (!CommonUtils.isEmpty(quoteStr)) {
                    }
    private char quoteChar = '"';
        headerCase = switch (CommonUtils.toString(properties.get(PROP_HEADER_CASE))) {
            default -> DBPIdentifierCase.UPPER;
                        writeCellValue("", true);
    @Override
import java.nio.file.Path;
        }
 * CSV Exporter
            arrFormatProp = DEFAULT_ARRAY_BRACKETS;
        }
            ) {
 * You may obtain a copy of the License at
            modifiedBuilder.append(c);
import org.jkiss.dbeaver.tools.transfer.DTUtils;
 *
import org.jkiss.dbeaver.model.data.DBDContent;
                        // Quote string values which starts from number
            }
    private static final String PROP_FORMAT_ARRAY = "formatArray";
                String colLabel = column.getLabel();
                if (colName == null) {
    private boolean useQuotes = true;
                boolean quote = false;
                    continue;
import org.jkiss.dbeaver.utils.GeneralUtils;
                    }
    enum HeaderFormat {
                        getSite().writeBinaryData(cs);

    private static final String ROW_DELIMITER_DEFAULT = "default";
            if (useQuotes) out.write(quoteChar);
                    if (!stringValue.isEmpty() && !(row[i] instanceof Number) && !(row[i] instanceof Date) && Character.isDigit(stringValue.charAt(0))) {
    private static final String PROP_QUOTE_ALWAYS = "quoteAlways";
    public void exportFooter(DBRProgressMonitor monitor) {
            if (i < columnsSize - 1) {
    }
        if (quoteStrategy == QuoteStrategy.ALL ||
                    }
    {
    }
            ContentUtils.close(reader);
                value.indexOf('\n') != -1 ||

    private static final String PROP_HEADER_FORMAT = "headerFormat";
        writeRowLimit();
            }
    }
                buffer.append(c);
                    modifiedBuilder.append(modifiedFormat.getSuffix());
                    DTUtils.closeContents(resultSet, content);

                    if (cs == null) {
            // Copy reader
            char[] buffer = new char[2000];
    @Override
                    } else {
    }

                    buffer.append(quoteChar);
        this.delimiter = StreamTransferUtils.getDelimiterString(properties, PROP_DELIMITER);
            .replace("\\r", "\r");
        if ((column.getDataKind() == DBPDataKind.NUMERIC && !formatNumbers) || column.getDataKind() == DBPDataKind.ARRAY) {
                char c = value.charAt(i);
                }
    public void exportRow(DBCSession session, DBCResultSet resultSet, Object[] row) throws DBException, IOException
        for (int i = 0, columnsSize = columns.length; i < columnsSize; i++) {
            }
        };

                finally {
            headerPosition = CommonUtils.valueOf(HeaderPosition.class, CommonUtils.toString(properties.get(PROP_HEADER)), HeaderPosition.top);

    private static final String PROP_LINE_FEED_ESCAPE_STRING = "lineFeedEscapeString";
                    }
        String arrFormatProp = CommonUtils.toString(
                // Inline textual content and handle binaries in some special way
        if (headerPosition == HeaderPosition.top || headerPosition == HeaderPosition.both) {
            properties.get(PROP_FORMAT_ARRAY),
        description,
        StringBuilder modifiedBuilder = new StringBuilder();
                        writeCellValue(cs.getContentReader());
        }
                }
    protected DBDDisplayFormat getValueExportFormat(DBDAttributeBinding column) {
        if (headerPosition == null) {
import org.jkiss.dbeaver.DBException;
    private static final Pattern LINE_BREAK_REGEX = Pattern.compile("\\r\\n|\\n");
            quoteChar = ' ';
        columns = getSite().getAttributes();

        top,
            if (i < row.length - 1) {
    private static final String DEFAULT_ARRAY_BRACKETS = "{ }";
    {
            } else {
                    if (CommonUtils.isNotEmpty(nullString)) {
                    if (!CommonUtils.isEmpty(description)) {
                } else if (c == currentArrayFormat.getSuffix()) {

            for (int i = 0; i < value.length(); i++) {

                        quote = true;
                if (headerFormat == HeaderFormat.both) {
    private void writeCellValue(String value, boolean quote)
        formatNumbers = CommonUtils.toBoolean(getSite().getProperties().get(PROP_FORMAT_NUMBERS));
    private String lineFeedEscapeString;
        final boolean hasQuotes = useQuotes && value.indexOf(quoteChar) != -1;
            }
    public void importData(@NotNull IStreamDataExporterSite site) {
            this.rowDelimiter = GeneralUtils.getDefaultLineSeparator();
import org.jkiss.dbeaver.model.exec.DBCResultSet;
        out.write(value);
    }
                        out.write(quoteChar);
                String stringValue = super.getValueDisplayString(column, row[i]);
                    DBDContentStorage cs = content.getContents(session.getProgressMonitor());
                }
                    if (!stringValue.isEmpty() && !(row[i] instanceof Number) && !(row[i] instanceof Date)) {
                if (column.getDataKind() == DBPDataKind.ARRAY) {
    {
                if (count <= 0) {
                int count = reader.read(buffer);
        stringValue = stringValue.trim();
            PrintWriter out = getWriter();
//                        out.write(quoteChar);
        both
            if (headerFormat != HeaderFormat.label) {
                value = LINE_BREAK_REGEX.matcher(value).replaceAll(lineFeedEscapeString);
                    stringValue = editArrayPrefixAndSuffix(dataExporterArrayFormat, stringValue);

    @Override
        }
        if (CommonUtils.isNotEmpty(lineFeedEscapeString)) {
import org.jkiss.dbeaver.model.exec.DBExecUtils;
        }
 *

            }
        }
            } else {
            if (row[i] instanceof DBDContent) {
        super.init(site);
        String quoteStr = quoteProp == null ? DEF_QUOTE_CHAR : quoteProp.toString();
    public void dispose()
        writeRowLimit();
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (quote && useQuotes) out.write(quoteChar);
                if (c == quoteChar) {
                value.contains(delimiter) ||
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    // Label has higher priority
                    modifiedBuilder.append(modifiedFormat.getPrefix());
                // Content
    private HeaderFormat headerFormat;
        }
                DBSEntity srcEntity = DBUtils.getAdapter(DBSEntity.class, getSite().getSource());
                DBExecUtils.bindAttributes(session, srcEntity, null, columns, null);
    @Override
                } else if (quoteStrategy == QuoteStrategy.STRINGS) {
    }
        headerPosition = HeaderPosition.none;
        if (stringValue == null || stringValue.isEmpty()) {
//                        out.write(quoteChar);
        none,
    public boolean shouldTruncateOutputFileBeforeExport() {
    @Override

        ).trim();
    private void writeDelimiter()
                    colName = colLabel;

    private void writeCellValue(Reader reader) throws IOException
    private DBPIdentifierCase headerCase;
        this.lineFeedEscapeString = CommonUtils.toString(properties.get(PROP_LINE_FEED_ESCAPE_STRING), "")
            if (headerFormat == HeaderFormat.description) {
    {
        Object nullStringProp = properties.get(PROP_NULL_STRING);
        PrintWriter out = getWriter();
                }
    @Override
        getWriter().write(delimiter);
        final Path file = site.getOutputFile();
        return false;
 * distributed under the License is distributed on an "AS IS" BASIS,
        bottom,

        if (ROW_DELIMITER_DEFAULT.equalsIgnoreCase(this.rowDelimiter.trim())) {
    private String editArrayPrefixAndSuffix(DataExporterArrayFormat modifiedFormat, String stringValue) {
                } else if (quoteStrategy == QuoteStrategy.ALL_BUT_NUMBERS) {
    {

            printHeader();
    }
public class DataExporterCSV extends StreamExporterAbstract implements IAppendableDataExporter {
                    }
import org.jkiss.dbeaver.model.data.DBDContentStorage;
import org.jkiss.dbeaver.tools.transfer.stream.IAppendableDataExporter;
import java.util.Date;
                }
    public static final String PROCESSOR_ID = "stream.csv";
    private DataExporterArrayFormat dataExporterArrayFormat;
        }

 * See the License for the specific language governing permissions and

            quote = true;
                for (int i = 0; i < count; i++) {
                        writeCellValue(nullString, quote);
                    out.write(buffer[i]);
            quoteStrategy == QuoteStrategy.ALL_INCLUDING_NULLS ||
                if (CommonUtils.equalObjects(colLabel, colName)) {
        }
    }
            // escape quotes with double quotes
            case "lower" -> DBPIdentifierCase.LOWER;
                    String description = column.getDescription();
            for (;;) {
                    }
    {
    }
                }

import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
    private static final String PROP_HEADER = "header";
import org.jkiss.dbeaver.tools.transfer.stream.StreamTransferUtils;

        nullString = nullStringProp == null ? null : nullStringProp.toString();
import java.io.IOException;
                    } else if (ContentUtils.isTextContent(content)) {
 */
        if (currentArrayFormat.equals(modifiedFormat)) {
            if (value.indexOf('\n') != -1) {
import java.io.PrintWriter;
                } else {
    private static final String PROP_NULL_STRING = "nullString";
        return modifiedBuilder.toString();
        } else if (!quote) {
        both
            return DBDDisplayFormat.NATIVE;
        label,
                }
                }
    {
                        colName += ":" + description;
        this.rowDelimiter = StreamTransferUtils.getDelimiterString(properties, PROP_ROW_DELIMITER);
                    if (useQuotes && buffer[i] == quoteChar) {
                    break;
import org.jkiss.dbeaver.model.*;
        getWriter().write(rowDelimiter);
import org.jkiss.utils.CommonUtils;
            quoteChar = quoteStr.charAt(0);
 * you may not use this file except in compliance with the License.

            (useQuotes && value.isEmpty())
 * limitations under the License.
import org.jkiss.dbeaver.model.exec.DBCSession;
    }
            if (hasQuotes ||
            case "as is" -> DBPIdentifierCase.MIXED;
    private static final String PROP_QUOTE_NEVER = "quoteNever";
                DBDContent content = (DBDContent)row[i];
                if (c == currentArrayFormat.getPrefix()) {
        }

                if (DBUtils.isNullValue(row[i])) {
    private String rowDelimiter;
            DBDAttributeBinding column = columns[i];
            return stringValue;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                }

                value.contains(rowDelimiter)
        }
                writeDelimiter();
        if (quote && useQuotes) out.write(quoteChar);

        }
        useQuotes = quoteChar != ' ';
                value.indexOf('\r') != -1 ||
            DBDAttributeBinding column = columns[i];
    public void exportHeader(DBCSession session) throws DBException, IOException
    @Override
import java.io.Reader;
                        quote = true;
            buffer.setLength(0);

    {
package org.jkiss.dbeaver.tools.transfer.stream.exporter;
                    colName = column.getLabel();
        Map<String, Object> properties = site.getProperties();

        }

        return super.getValueExportFormat(column);
            return stringValue;
                if (quoteStrategy == QuoteStrategy.DISABLED) {
                colName = column.getDescription();


    @Override
            if (c == '"') {
                    if (!(row[i] instanceof Number)) {
        dataExporterArrayFormat = DataExporterArrayFormat.getArrayFormat(arrFormatProp);
    private HeaderPosition headerPosition;
        Object quoteProp = properties.get(PROP_QUOTE_CHAR);
        }
        for (char c : stringValue.toCharArray()) {
        DataExporterArrayFormat currentArrayFormat = DataExporterArrayFormat.getArrayFormatOnPrefix(stringValue.charAt(0));
    }
    private DBDAttributeBinding[] columns;
                    } else if (quoteStrategy == QuoteStrategy.ALL_INCLUDING_NULLS) {
            printHeader();
    public void init(IStreamDataExporterSite site) throws DBException
        headerFormat = CommonUtils.valueOf(HeaderFormat.class, CommonUtils.toString(properties.get(PROP_HEADER_FORMAT)), HeaderFormat.label);
        if (arrFormatProp.isEmpty()) {
        } finally {
            DEFAULT_ARRAY_BRACKETS
                }
    private void writeRowLimit()
    private boolean formatNumbers;
        try {
                } else if (!CommonUtils.isEmpty(colLabel)) {
    enum HeaderPosition {
import java.util.regex.Pattern;
/*
    }
    }
    private final StringBuilder buffer = new StringBuilder();
    {
            }
                    writeCellValue(stringValue, quote);
            }
                    }
            .replace("\\n", "\n")
        }
/**
            }

    }
    private static final String PROP_QUOTE_CHAR = "quoteChar";
                }
    private static final String DEF_QUOTE_CHAR = "\"";
            if (useQuotes) out.write(quoteChar);
    private static final String PROP_FORMAT_NUMBERS = "formatNumbers";

            return;
    private static final String PROP_HEADER_CASE = "headerCase";
                writeDelimiter();
                insideQuotes = !insideQuotes;
    }
    private void printHeader()
import java.nio.file.Files;
            }
                    continue;
 * Unless required by applicable law or agreed to in writing, software
    private static final String PROP_ROW_DELIMITER = "rowDelimiter";
import org.jkiss.code.NotNull;
}
        if (quote && hasQuotes) {
                        quote = true;
    }
                }
            }


                quote = true;
        }
            }

    private QuoteStrategy quoteStrategy = QuoteStrategy.DISABLED;

        // FIXME: Sources may be different and thus may have a different set of attributes
            .replace("\\t", "\t")
        }
 * Copyright (C) 2010-2026 DBeaver Corp and others
        quoteStrategy = QuoteStrategy.fromValue(CommonUtils.toString(properties.get(PROP_QUOTE_ALWAYS)));
        }
        if (CommonUtils.toBoolean(properties.get(PROP_QUOTE_NEVER))) {
    private String nullString;
        ) {
        if (file == null || !Files.exists(file)) {
            writeCellValue(headerCase.transform(colName), true);
            quote = false;
        if (headerPosition == HeaderPosition.bottom || headerPosition == HeaderPosition.both) {
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
    private static final String PROP_DELIMITER = "delimiter";
            if (!insideQuotes) {

        if (!useQuotes) {
 *
                        writeCellValue(DBConstants.NULL_VALUE_LABEL, false);
        super.dispose();
import java.util.Map;
