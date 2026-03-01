                        StreamDataImporterColumnInfo columnInfo = columnsInfo.get(i);
                                    columnIsByteLength ? line[i].getBytes(encoding).length : line[i].length());
                            default:
                                    continue;

                                /* fall-through */
    private static final String PROP_NULL_STRING = "nullString";
import org.jkiss.dbeaver.tools.transfer.database.DatabaseTransferUtils;
        }
                        columnInfo.updateType(DBPDataKind.STRING, "VARCHAR");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
                for (int i = 0; i < header.length; i++) {
        try {
                    } else {
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
 * you may not use this file except in compliance with the License.
                                        }
        HeaderPosition headerPosition = getHeaderPosition(processorProperties);
                    }
                            int maxRows = site.getSettings().getMaxRows();
    private static final String PROP_HEADER = "header";
 * Unless required by applicable law or agreed to in writing, software
/**

                            break;
                                }
        HeaderPosition headerPosition = getHeaderPosition(properties);
        } catch (IllegalArgumentException ignored) {
                        log.debug("Cannot guess data type for column '" + columnInfo.getName() + "', defaulting to VARCHAR");

                                    }
                        i,
        boolean strictQuotes = CommonUtils.toBoolean(processorProperties.get(PROP_STRICT_QUOTES));
public class DataImporterCSV extends StreamImporterAbstract {
        DBCExecutionContext context = streamDataSource.getDefaultInstance().getDefaultContext(monitor, false);
                            for (long lineNum = 0; ; ) {
    }
/*
                                if (!CommonUtils.isEmpty(nullValueMark)) {
                    DBDDataReceiver.startFetchWorkflow(consumer, producerSession, resultSet, -1, -1);
                        }
                if (header == null) {
                                }
                                        newLine[i] = null;
import org.jkiss.dbeaver.model.data.DBDDataReceiver;
                        DBPDataKind.UNKNOWN);
                                    for (int i = 0; i < line.length; i++) {
    private HeaderPosition getHeaderPosition(Map<String, Object> processorProperties) {
                for (StreamDataImporterColumnInfo columnInfo : columnsInfo) {
        none,
                        entityMapping,

import org.jkiss.dbeaver.DBException;
                        column = DBUtils.getUnQuotedIdentifier(entityMapping.getDataSource(), header[i]);
                                    }
                                if (line.length < targetAttrSize) {
                    String[] line;
                        columnMinimalLength,
                                if (headerPosition != HeaderPosition.none && !headerRead) {
                        }
                                break;
import org.jkiss.utils.csv.CSVReader;
                                    for (int i = 0; i < line.length; i++) {
    private Reader openStreamReader(InputStream inputStream, Map<String, Object> processorProperties, boolean useBufferedStream) throws UnsupportedEncodingException {
    @Override
                        line = header;
        @NotNull DBRProgressMonitor monitor,
    public DataImporterCSV() {
            // This charset does not have BOM, suppress and continue
            quoteChar = String.valueOf(CSVParser.NULL_CHARACTER);
        @NotNull InputStream inputStream,
        final boolean columnIsByteLength = CommonUtils.getBoolean(processorProperties.get(PROP_COLUMN_IS_BYTE_LENGTH), false);
            }
        }
                        switch (dataType.getFirst()) {

            return line;
import org.jkiss.utils.csv.CSVParser;
                                    }
                                consumer.fetchRow(producerSession, resultSet);
        }
 * CSV importer
                            case BOOLEAN:
import org.jkiss.utils.CommonUtils;

package org.jkiss.dbeaver.tools.transfer.stream.importer;
        return CommonUtils.valueOf(HeaderPosition.class, CommonUtils.toString(processorProperties.get(PROP_HEADER)), HeaderPosition.top);
                continue;
}
                                    for (int i = line.length; i < targetAttrSize; i++) {
        while (true) {
                        throw new DBException("IO error reading CSV", e);
                                lineNum++;
            if (line == null) {
 * See the License for the specific language governing permissions and
                                if (monitor.isCanceled()) {
                                        throw new IOException("Un-terminated quote sequence was detected");
    private static final String PROP_ESCAPE_CHAR = "escapeChar";
            inputStream = new BufferedInputStream(inputStream, READ_BUFFER_SIZE);
                    if (sample == 0 && headerPosition == HeaderPosition.none) {
                            case NUMERIC:
import java.io.*;
                    if (headerPosition == HeaderPosition.top) {
        @NotNull DBPDataSource streamDataSource,
                    }
    }
    private static final Log log = Log.getLog(DataImporterCSV.class);
        }
        List<StreamDataImporterColumnInfo> columnsInfo = new ArrayList<>();
                    applyTransformHints(resultSet, consumer, properties, PROP_TIMESTAMP_FORMAT, PROP_TIMESTAMP_ZONE);
    private static final String PROP_TRIM_WHITESPACES = "trimWhitespaces";

                                resultSet.setStreamRow(line);
                }
            }

                    return columnsInfo;
        StreamEntityMapping entityMapping = site.getSourceObject();
                                    for (int i = 0; i < line.length; i++) {
            }
        final String encoding = CommonUtils.toString(processorProperties.get(PROP_ENCODING), GeneralUtils.UTF8_ENCODING);
                                    headerRead = true;
                    }
                                    break;
                try (StreamTransferResultSet resultSet = new StreamTransferResultSet(producerSession, localStatement, entityMapping)) {
import org.jkiss.dbeaver.model.exec.DBCSession;
 *
                }
                                if (DBFetchProgress.monitorFetchProgress(lineNum)) {
    public static final int READ_BUFFER_SIZE = 255 * 1024;
import org.jkiss.dbeaver.model.DBPDataSource;


 *
                                String[] line = csvReader.readNext();
import java.nio.charset.Charset;
                                    break;
                            case STRING:
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                                if (trimWhitespaces) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                                break;
 * You may obtain a copy of the License at
                                columnInfo.updateType(dataType.getFirst(), dataType.getSecond());
        if (CommonUtils.isEmpty(quoteChar)) {
            escapeChar = String.valueOf(CSVParser.NULL_CHARACTER);
 */
        return columnsInfo;
                    try (Reader reader = openStreamReader(inputStream, properties, true)) {
        @NotNull IDataTransferConsumer<?, ?> consumer
    public enum HeaderPosition {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private static final String PROP_ENCODING = "encoding";
                                    entityMapping.getDataSource(),

                            boolean headerRead = false;
                                if (maxRows > 0 && lineNum >= maxRows) {
    private String[] getNextLine(CSVReader csvReader) throws IOException {
                                    }
        if (useBufferedStream) {

        return new CSVReader(reader, delimiter.charAt(0), quoteChar.charAt(0), escapeChar.charAt(0), 0, strictQuotes);
                        column,
                String[] header = getNextLine(csvReader);
                                if (line == null) {
import java.util.Map;
                                }
import org.jkiss.code.NotNull;
                                        }
        } catch (IOException e) {
                        }
                                if (emptyStringNull) {
                                    }
                    if (columnInfo.getDataKind() == DBPDataKind.UNKNOWN) {

        if (CommonUtils.isEmpty(escapeChar)) {
    }
    @NotNull



        Map<String, Object> properties = site.getProcessorProperties();
                    String column = null;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

                                }
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
                                if (line.length == 0) {
            throw new DBException("IO error reading CSV", e);
                        Pair<DBPDataKind, String> dataType = DatabaseTransferUtils.getDataType(line[i]);
    }
import org.jkiss.utils.io.BOMInputStream;
                    } catch (IOException e) {

                }
            inputStream = new BOMInputStream(inputStream, charset);
    private static final String PROP_QUOTE_CHAR = "quoteChar";
                                        line[i] = line[i].trim();
import org.jkiss.dbeaver.model.DBUtils;
                            int targetAttrSize = entityMapping.getStreamColumns().size();
        String nullValueMark = CommonUtils.toString(properties.get(PROP_NULL_STRING));
 */


import org.jkiss.dbeaver.model.DBFetchProgress;
            String[] line = csvReader.readNext();
                                }
                                    monitor.subTask(Long.toUnsignedString(lineNum) + " rows processed");

 * distributed under the License is distributed on an "AS IS" BASIS,
                }
            if (line.length == 0) {
                    }
                                    // Stream row may be shorter than header

                return null;
                                            line[i] = null;
        }
    private static final String PROP_DELIMITER = "delimiter";
                                    if (csvReader.getParser().isPending()) {

                                }
                                }
    private static final String PROP_STRICT_QUOTES = "strictQuotes";
                                    System.arraycopy(line, 0, newLine, 0, line.length);
                    }
        return new InputStreamReader(inputStream, charset);
        boolean emptyStringNull = CommonUtils.getBoolean(properties.get(PROP_EMPTY_STRING_NULL), false);
                    for (int i = 0; i < Math.min(line.length, header.length); i++) {
                    if (CommonUtils.isEmptyTrimmed(column)) {
                    columnsInfo.add(columnInfo);
import org.jkiss.utils.Pair;
import org.jkiss.dbeaver.model.impl.local.LocalStatement;
        String quoteChar = CommonUtils.toString(processorProperties.get(PROP_QUOTE_CHAR));
                                    String[] newLine = new String[targetAttrSize];
                        line = getNextLine(csvReader);
                                columnInfo.updateMaxLength(
        }
                    columnInfo.setMappingMetadataPresent(headerPosition != HeaderPosition.none);
                        // Include first line (header that does not exist) for sampling
        final int columnMinimalLength = Math.max(CommonUtils.toInt(processorProperties.get(PROP_COLUMN_TYPE_LENGTH), 1), 1);
import org.jkiss.dbeaver.model.DBPDataKind;
                }
    }
    private CSVReader openCSVReader(Reader reader, Map<String, Object> processorProperties) {

    public List<StreamDataImporterColumnInfo> readColumnsInfo(StreamEntityMapping entityMapping, @NotNull InputStream inputStream) throws DBException {
                                }
        Map<String, Object> processorProperties = getSite().getProcessorProperties();
                                            line[i] = null;
        IStreamDataImporterSite site = getSite();
    private static final String PROP_EMPTY_STRING_NULL = "emptyStringNull";
                                    // First line is a header
                        if (line == null) {
                for (int sample = 0; sample < columnSamplesCount; sample++) {
import org.jkiss.dbeaver.Log;
        }
        final Charset charset = Charset.forName(encoding);
 * DBeaver - Universal Database Manager
                        column = "Column" + (i + 1);

            }
                            }

                                }
    public void runImport(
        try (DBCSession producerSession = context.openSession(monitor, DBCExecutionPurpose.UTIL, "Transfer stream data")) {
import java.util.List;
import org.jkiss.dbeaver.tools.transfer.stream.*;
                        try (CSVReader csvReader = openCSVReader(reader, properties)) {
    }
            try (LocalStatement localStatement = new LocalStatement(producerSession, "SELECT * FROM Stream")) {
                                }
        try (Reader reader = openStreamReader(inputStream, processorProperties, true)) {
        String escapeChar = CommonUtils.toString(processorProperties.get(PROP_ESCAPE_CHAR));

                                        if ("".equals(line[i])) {
            try (CSVReader csvReader = openCSVReader(reader, processorProperties)) {
                    StreamDataImporterColumnInfo columnInfo = new StreamDataImporterColumnInfo(
                                    continue;
        boolean trimWhitespaces = CommonUtils.getBoolean(properties.get(PROP_TRIM_WHITESPACES), false);
import java.util.ArrayList;
    }
    ) throws DBException {
                                    line = newLine;

                                        if (nullValueMark.equals(line[i])) {
        final String encoding = CommonUtils.toString(processorProperties.get(PROP_ENCODING), GeneralUtils.UTF8_ENCODING);
                    }

import org.jkiss.dbeaver.tools.transfer.IDataTransferConsumer;
 *
                        STRING_DATA_TYPE,
import org.jkiss.dbeaver.utils.GeneralUtils;
        final int columnSamplesCount = Math.max(CommonUtils.toInt(processorProperties.get(PROP_COLUMN_TYPE_SAMPLES), 100), 0);

        String delimiter = StreamTransferUtils.getDelimiterString(processorProperties, PROP_DELIMITER);
        top,
                                    break;
    }
