        if (confluenceFormat) writeDelimiter();
                writeCellValue(super.getValueDisplayString(column, row[i]));

import org.jkiss.dbeaver.tools.transfer.DTUtils;
                }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Markdown Table Exporter

 * you may not use this file except in compliance with the License.
        columns = getSite().getAttributes();
    public void init(IStreamDataExporterSite site) throws DBException
 * See the License for the specific language governing permissions and
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
        confluenceFormat = CommonUtils.getBoolean(site.getProperties().get(PROP_CONFLUENCE_FORMAT), false);
        writeRowLimit();
    private boolean showHeaderSeparator;
            char buffer[] = new char[2000];
                if (count <= 0) {
    private DBDAttributeBinding[] columns;
import org.jkiss.dbeaver.model.exec.DBCResultSet;
                    if (buffer[i] == '|') {
    {
    }
    @Override

        printHeader(false);
                for (int k = 0; k < colName.length(); k++) {
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
        writeDelimiter();
        for (int i = 0, columnsSize = columns.length; i < columnsSize; i++) {


        getWriter().write('|');
                    DTUtils.closeContents(resultSet, content);
            if (DBUtils.isNullValue(row[i])) {
    @Override
        if (showHeaderSeparator && !confluenceFormat) {

        writeRowLimit();
            }
        } finally {
                    DBDContentStorage cs = content.getContents(session.getProgressMonitor());
    }
    {
    }
package org.jkiss.dbeaver.tools.transfer.stream.exporter;
            if (!separator) {
    private void printHeader(boolean separator)
                DBDContent content = (DBDContent)row[i];
    private void writeRowLimit()

    private static final String PROP_NULL_STRING = "nullString";
    {
            String colName = column.getLabel();
            if (c == '|') {

    public void exportHeader(DBCSession session) throws DBException, IOException
                        getWriter().write(PIPE_ESCAPE);
                try {
    private String nullString;
    }
            // Copy reader
        if (column.getDataKind() == DBPDataKind.NUMERIC && !Boolean.TRUE.equals(getSite().getProperties().get(PROP_FORMAT_NUMBERS))) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
                    if (cs == null) {
        }
            printHeader(true);
    {
                        writeCellValue(DBConstants.NULL_VALUE_LABEL);
    private static final String PROP_CONFLUENCE_FORMAT = "confluenceFormat";
        Object nullStringProp = site.getProperties().get(PROP_NULL_STRING);

        getWriter().write(value);
                writeCellValue(colName);
        value = buffer.toString();
                buffer.append(PIPE_ESCAPE);
    private void writeCellValue(String value)
    public void exportFooter(DBRProgressMonitor monitor) throws DBException, IOException
                finally {
                    break;
        for (int i = 0; i < value.length(); i++) {
    private boolean confluenceFormat;
 */
        super.init(site);
        rowDelimiter = GeneralUtils.getDefaultLineSeparator();
    private String rowDelimiter;
    {
    @Override
    }
import org.jkiss.dbeaver.model.DBPDataKind;
    }
                    } else {
            DBDAttributeBinding column = columns[i];
            }
            } else {
 *
            }
    {
    @Override
 * You may obtain a copy of the License at
}
        }
            char c = value.charAt(i);
import org.jkiss.utils.CommonUtils;
    {
    {
                }
import java.io.IOException;
            writeDelimiter();
import org.jkiss.dbeaver.tools.transfer.stream.IStreamDataExporterSite;
            ContentUtils.close(reader);

    }

            }
            } else {
                        getSite().writeBinaryData(cs);
        // escape quotes with double quotes
    public void exportRow(DBCSession session, DBCResultSet resultSet, Object[] row) throws DBException, IOException
            writeDelimiter();
            if (confluenceFormat) writeDelimiter();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        writeCellValue(cs.getContentReader());
            DBDAttributeBinding column = columns[i];
import org.jkiss.dbeaver.model.data.DBDContent;
import org.jkiss.dbeaver.model.exec.DBCSession;
            }
import java.io.Reader;
    protected DBDDisplayFormat getValueExportFormat(DBDAttributeBinding column) {
            if (CommonUtils.isEmpty(colName)) {
                    }
                    getWriter().write(nullString);
    private void writeDelimiter()
            } else if (row[i] instanceof DBDContent) {
import org.jkiss.dbeaver.model.DBConstants;
    private void writeCellValue(Reader reader) throws IOException
            } else {

import org.jkiss.dbeaver.DBException;
 * Licensed under the Apache License, Version 2.0 (the "License");

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.data.DBDContentStorage;
                    } else {
                // Content
    private static final String PROP_FORMAT_NUMBERS = "formatNumbers";
                    getWriter().write('-');

    }
        buffer.setLength(0);
    private static final String PIPE_ESCAPE = "&#124;";
import org.jkiss.dbeaver.utils.GeneralUtils;

        // Print separator line
            for (;;) {
                        getWriter().write(buffer[i]);
        showHeaderSeparator = CommonUtils.getBoolean(site.getProperties().get(PROP_SHOW_HEADER_SEPARATOR), true);
/*
                colName = column.getName();
                    } else if (ContentUtils.isTextContent(content)) {
        return super.getValueExportFormat(column);

    private final StringBuilder buffer = new StringBuilder();
        nullString = nullStringProp == null ? null : nullStringProp.toString();

        }
                }
    }
                buffer.append(c);
                // Inline textual content and handle binaries in some special way
    @Override
                }
        }
                }
        writeDelimiter();
/**
    }

        getWriter().write(rowDelimiter);
import org.jkiss.dbeaver.model.DBUtils;
    private static final String PROP_SHOW_HEADER_SEPARATOR = "showHeaderSeparator";
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.utils.ContentUtils;

 *
        try {
            return DBDDisplayFormat.NATIVE;
 *     http://www.apache.org/licenses/LICENSE-2.0
                    }
                if (!CommonUtils.isEmpty(nullString)) {
                for (int i = 0; i < count; i++) {
 * limitations under the License.
        for (int i = 0; i < row.length && i < columns.length; i++) {
    public void dispose()
    {
                int count = reader.read(buffer);
                }
    @Override


        }
public class DataExporterMarkdownTable extends StreamExporterAbstract {
    {
 *
    }
        super.dispose();
