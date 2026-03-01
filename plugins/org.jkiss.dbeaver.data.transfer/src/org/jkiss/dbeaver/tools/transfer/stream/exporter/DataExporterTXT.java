    private class CellContentValue implements CellValue {

 *
                if (maxColumnSize > 0) {
                int count = reader.read(buffer, 0, buffer.length);
 *
    }
import org.jkiss.dbeaver.tools.transfer.stream.IAppendableDataExporter;

    private static final String PROP_DELIM_LEADING = "delimLeading";
import org.jkiss.dbeaver.model.exec.DBCResultSet;
import org.jkiss.code.NotNull;
            char[] buffer = new char[2000];

            // Backward compatibility - use space.
    }
         * Appends content to string builder
                            values[index] = new CellTextValue(DBConstants.NULL_VALUE_LABEL);
        }
        }
import java.util.Deque;
import org.jkiss.dbeaver.model.exec.DBCException;
                delimHeader = false;
        public int append(DBDContent content) throws IOException, DBCException {
            }


    private int blobContentMaxLength = 0;
        } else {
 */
                String cell = getCellString(columns[index], row[index]);
    private static final String RAW_BLOB_CLOSE = "]]";

    }
                    break;
            if (actualLength > colWidths[index]) {
 * you may not use this file except in compliance with the License.
            this.monitor = monitor;
        /**
        int exportTo(ExportTextTarget target) throws DBCException, IOException;
        /**
    private final StringBuilder blobContentBuffer = new StringBuilder();
        if (batchQueue.size() == batchSize) {
                colWidths[index] = Math.min(actualLength, maxColumnSize);
        for (int index = 0, length = columns.length; index < length; index++) {
        private final PrintWriter writer;
            if (cs == null) {
    
                                if (blobContentBuffer.length() + QUOTE_BLOB_REPLACEMENT.length() > blobContentMaxLength) {
            }

public class DataExporterTXT extends StreamExporterAbstract implements IAppendableDataExporter {
                }
        this.batchQueue = new ArrayDeque<>(this.batchSize);
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
                            if (buffer[i] == QUOTE_BLOB_CHAR) {

                                } else {
                }
         * Write string builder content to print writer
        this.maxColumnSize = Math.max(CommonUtils.toInt(properties.get(PROP_MAX_COLUMN_LENGTH), 0), 0);
            } finally {
    @Override
    }
        public int exportTo(ExportTextTarget target) throws DBCException, IOException {
            for (int index = 0; index < columns.length; index++) {
        // No pre-initialization process is needed.
                writeRow(target, batchQueue.poll(), ' ');
        @Override
        for (CellValue[] row : batchQueue) {
            DBDContentStorage cs = content.getContents(monitor);
                values[index] = new CellTextValue(cell);
            if (!showHeader) {
         * Return the length of appended characters

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * See the License for the specific language governing permissions and
        }


        public void flush() {
                        } else {
        }
import org.jkiss.dbeaver.model.data.DBDContent;
        this.showHeader = CommonUtils.getBoolean(properties.get(PROP_SHOW_HEADER), true);
        if (this.maxColumnSize > 0) {
        if (DBUtils.isNullValue(value)) {
 */
        if (showHeader) {

    private static final String QUOTE_BLOB_REPLACEMENT = "\\\"";
         */
 * limitations under the License.
                    cell = CommonUtils.truncateString(cell, maxColumnSize);
        public int getTextLength() {
    private static final boolean QUOTE_BLOBS = true;
                }
                return 0;
                    }
        private final StringBuilder stringBuilder = new StringBuilder();
            return text.length();

                    }
                long length = content.getContentLength() + RAW_BLOB_OPEN.length() + RAW_BLOB_CLOSE.length();
        }
        final String displayString = attr.getValueHandler().getValueDisplayString(attr, value, getValueExportFormat(attr));
        ExportTextTarget target = new ExportTextTarget(getWriter(), monitor);
        public int getTextLength() {
import java.util.Arrays;
            this.content = content;

            }
    private int batchSize = 200;
    private static final String RAW_BLOB_OPEN = "[BLOB[";
                target.append(delimBetween);
            stringBuilder.setLength(0);
                } else if (valueLength > colWidths[index]) {
        this.minColumnSize = Math.max(CommonUtils.toInt(properties.get(PROP_MIN_COLUMN_LENGTH), 1), 1);
import org.jkiss.dbeaver.model.data.DBDContentStorage;
        }
    }
         * Append character to string builder
    private class ExportTextTarget {
                }
                rest -= 2;
                            if (buffer[i] == QUOTE_BLOB_CHAR) {
                                blobContentBuffer.append(QUOTE_BLOB_REPLACEMENT);
import org.jkiss.dbeaver.model.DBUtils;
    private boolean delimTrailing;
            this.blobContentMaxLength = Integer.MAX_VALUE - BLOB_OVERFLOW_MARK.length();
                    // flush all the buffered data to the underlying output stream before writing raw data
                if (ContentUtils.isTextContent(content)) {
                    if (QUOTE_BLOB_REPLACEMENT.length() > 1) {

    private String delimBetween;


                        int limit = Math.min(count, rest);
        public CellTextValue(String text) {
        private final DBRProgressMonitor monitor;
        if (delimTrailing) {
    public void exportFooter(DBRProgressMonitor monitor) throws DBException, IOException {
            delimBetween = prop;
import java.io.PrintWriter;
            }
                    break;
            if (row[index] instanceof DBDContent) {
            }
                this.blobContentMaxLength = this.BLOB_CONTENT_MIN_LENGTH;
                            } else {
            }
        while (!batchQueue.isEmpty()) {
        if (delimLeading) {
        this.delimHeader = CommonUtils.getBoolean(properties.get(PROP_DELIM_HEADER), true);
        try {
import java.io.Reader;
            this.blobContentMaxLength = Math.min(this.maxColumnSize, Integer.MAX_VALUE) - BLOB_OVERFLOW_MARK.length();

                                }
        if (CommonUtils.isEmpty(attr.getLabel())) {
            }
                                    rest -= (QUOTE_BLOB_REPLACEMENT.length() - 1);

                writeRow(target, batchQueue.poll(), ' ');
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            try {
import java.util.ArrayDeque;
                return target.append(content);
        if (this.maxColumnSize == 0) {
    private String stringifyContent(Reader reader) throws IOException {
        target.flush();

    private static final String PROP_MAX_COLUMN_LENGTH = "maxColumnLength";
                blobContentBuffer.append(QUOTE_BLOB_CHAR);
                    values[index] = new CellContentValue(content);
                }
        columns = getSite().getAttributes();
         * Returns the length of appended content
    }
            }
            stringBuilder.append(ch);
            target.append('|');
        for (int index = 0; index < columns.length; index++) {
            }
        writeQueue(monitor);
    private boolean delimLeading;
            
    @Override
                    getSite().writeBinaryData(cs);
        public int append(char ch) {
                if (count <= 0) {
            // Copy reader
                    this.flush();
import org.jkiss.dbeaver.DBException;
    private static final String PROP_DELIM_BETWEEN = "delimBetween";
 * DBeaver - Universal Database Manager
    private static final char QUOTE_BLOB_CHAR = '"';

            if (QUOTE_BLOBS) {
    private static final int BLOB_CONTENT_MIN_LENGTH = 20;
         */
    private int minColumnSize = 1;
         * Appends string to string builder
            if (this.blobContentMaxLength < 0) {
                    this.append(RAW_BLOB_CLOSE);
                    try {
        }
            } catch (DBCException ex) {

                } else {
        this.showNulls = CommonUtils.getBoolean(properties.get(PROP_SHOW_NULLS), false);
    private static final String PROP_BATCH_SIZE = "batchSize";
            delimBetween = " ";
        public int exportTo(ExportTextTarget target) {
                final CellValue value = row[index];
            blobContentBuffer.setLength(0);
import org.jkiss.dbeaver.model.DBConstants;
import org.jkiss.dbeaver.model.exec.DBCSession;


        }
        
                for (int width = actualLength; width < colWidths[index]; width++) {
    private interface CellValue {
         * Returns the length of appended string
            return attr.getName();

            }
    private static final String PROP_SHOW_NULLS = "showNulls";
                        }
        @Override

    }
                }

                blobContentBuffer.append(QUOTE_BLOB_CHAR);
        target.append(CommonUtils.getLineSeparator());
import org.jkiss.utils.CommonUtils;
        }
import org.jkiss.dbeaver.tools.transfer.stream.IStreamDataExporterSite;
/*
    private static final String PROP_SHOW_HEADER = "showHeader";
        }
    private static final String PROP_DELIM_HEADER = "delimHeader";


        @Override

        public CellContentValue(DBDContent content) {
                return this.append(DBConstants.NULL_VALUE_LABEL);
            stringBuilder.append(text);
/**
                        }
    private static final String BLOB_OVERFLOW_MARK = " [BLOB is too large]";
        }
    @Override
        }
    private static class CellTextValue implements CellValue {
                int valueLength = value.getTextLength();
    }
                if (rest < count) {
    public boolean shouldTruncateOutputFileBeforeExport() {
            writer.write(stringBuilder.toString());
                    this.append(RAW_BLOB_OPEN);
    @Override

 * TXT Exporter
            } else {
    }
                if (maxColumnSize > 0) {
    }
        this.delimLeading = CommonUtils.getBoolean(properties.get(PROP_DELIM_LEADING), true);
import java.util.Map;
                            }
                            } else {

            this.writer = writer;
    public void exportHeader(DBCSession session) throws DBException, IOException {
    @Override
                String cell = getAttributeName(columns[index]);
                content.release();
            this.text = text;
        }
    
            }
        @Override
    
                                    break;

                return (int) Math.min(Integer.MAX_VALUE, length);
    }
        }
        } else {
                } else {
            if (showHeader) {
                DBDContent content = (DBDContent) row[index];
            this.maxColumnSize = Math.max(this.maxColumnSize, this.minColumnSize);
        Map<String, Object> properties = site.getProperties();
    private int[] colWidths;
                } finally {
            } else {
            final CellValue[] header = new CellValue[columns.length];
        }

        }
    }

                header[index] = new CellTextValue(cell);
                    blobContentBuffer.append(buffer, 0, Math.min(count, rest));
         */
        
            for (int index = 0; index < columns.length; index++) {
import org.jkiss.utils.ArrayUtils;
        appendRow(values, session.getProgressMonitor());
            if (QUOTE_BLOBS) {
        this.delimTrailing = CommonUtils.getBoolean(properties.get(PROP_DELIM_TRAILING), true);
                    rest -= count;
    }
        /**
    }

 * distributed under the License is distributed on an "AS IS" BASIS,
                }
        
        if (Boolean.FALSE.toString().equals(prop)) {

                writeRow(target, null, '-');
            return 1;

        }
            }
                    blobContentBuffer.append(BLOB_OVERFLOW_MARK);

            return target.append(text);
                        if (cs == null) {
        public final DBDContent content;
    public void init(IStreamDataExporterSite site) throws DBException {
        if (batchQueue.isEmpty()) {
            if (index < length - 1 || delimTrailing || fill != ' ') {
            return blobContentBuffer.toString();
import org.jkiss.dbeaver.utils.ContentUtils;
                            }
        final CellValue[] values = new CellValue[columns.length];
    private String getCellString(DBDAttributeBinding attr, Object value) {
        }
        this.batchSize = Math.max(CommonUtils.toInt(properties.get(PROP_BATCH_SIZE), 200), 200);
            appendRow(header, session.getProgressMonitor());
            return;
        batchQueue.add(row);
                if (QUOTE_BLOBS && QUOTE_BLOB_REPLACEMENT != null) {
        
                    colWidths[index] = valueLength;
                }
                                    blobContentBuffer.append(QUOTE_BLOB_REPLACEMENT);
        }
    
            target.append('|');
        } finally {
        } 
                }
                        DBDContentStorage cs = content.getContents(session.getProgressMonitor());
    public void exportRow(DBCSession session, DBCResultSet resultSet, Object[] row) throws DBException, IOException {
    public void importData(@NotNull IStreamDataExporterSite site) {
        }
            }
package org.jkiss.dbeaver.tools.transfer.stream.exporter;
                                blobContentBuffer.append(buffer[i]);
                        for (int i = 0; i < count; i++) {
    private boolean delimHeader;
            return attr.getLabel();
}
                        for (int i = 0; i < limit; i++) {
        public final String text;
import java.io.IOException;
            try {
    private Deque<CellValue[]> batchQueue;
        public ExportTextTarget(PrintWriter writer, DBRProgressMonitor monitor) {
            writeQueue(monitor);
        colWidths = new int[columns.length];
        }
                    target.append(fill);
                try {
    private void appendRow(CellValue[] row, DBRProgressMonitor monitor) throws DBCException, IOException {
                    } else {
                } else {
        super.init(site);
                        content.release();
        Arrays.fill(colWidths, minColumnSize);
    private void writeRow(ExportTextTarget target, CellValue[] values, char fill) throws DBCException, IOException {
            }
        return false;
                    return (int) Math.min(Integer.MAX_VALUE, RAW_BLOB_OPEN.length() + cs.getContentLength() + RAW_BLOB_CLOSE.length());
        /**
                    cell = CommonUtils.truncateString(cell, maxColumnSize);
            if (index < length - 1) {
            return text.length();
    }
        int getTextLength();
        } else {
            ContentUtils.close(reader);
    private static final String PROP_MIN_COLUMN_LENGTH = "minColumnLength";
    private void writeQueue(DBRProgressMonitor monitor) throws DBCException, IOException {
            for (;;) {
                        }               
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
    // The followings may be a setting some time
    private static final String PROP_DELIM_TRAILING = "delimTrailing";
    private boolean showNulls;
            if (delimHeader) {
            }
                                blobContentBuffer.append(buffer[i]);
        String prop = CommonUtils.toString(properties.get(PROP_DELIM_BETWEEN));
            }
    @Override
                    writer.flush();

    }
    private DBDAttributeBinding[] columns;
    
    private static String getAttributeName(DBDAttributeBinding attr) {
        }
        }

    
                            values[index] = new CellTextValue(stringifyContent(cs.getContentReader()));
    private boolean showHeader;

        }
        }
            int actualLength = ArrayUtils.isEmpty(values) ? 0 : values[index].exportTo(target);
        public int append(String text) {
        getWriter().flush();
        return CommonUtils.getSingleLineString(displayString);
 * You may obtain a copy of the License at
         */

            int rest = blobContentMaxLength;
            return showNulls ? DBConstants.NULL_VALUE_LABEL : "";
 *
                    colWidths[index] = maxColumnSize;
                if (maxColumnSize > 0 && valueLength > maxColumnSize) {

 * Copyright (C) 2010-2025 DBeaver Corp and others
                    } finally {
                    cs.release();
    private int maxColumnSize = 0;
