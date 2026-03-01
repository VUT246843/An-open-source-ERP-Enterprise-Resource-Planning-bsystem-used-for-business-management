        if (!quoteProp.equals(DEF_QUOTE_CHAR)) {
                    return s;
import org.jkiss.dbeaver.model.exec.DBCResultSet;
 * DBeaver - Universal Database Manager
                    DTUtils.closeContents(resultSet, content);
        rowNum++;
                if (cellValue instanceof Number || cellValue instanceof Boolean) {

    private static final String DEF_QUOTE_CHAR = "\"";
                        } else {

 *
            if (count <= 0) {
import org.jkiss.dbeaver.tools.transfer.stream.StreamTransferUtils;
    @Override
            this.rowDelimiter = GeneralUtils.getDefaultLineSeparator();
            if (i < columns.length - 1) {
    private ProgramLanguages language;
import org.jkiss.utils.CommonUtils;
    private DBDAttributeBinding[] columns;
import java.util.Date;
import java.util.Map;
import org.jkiss.dbeaver.tools.transfer.DTUtils;
            out.write(rowDelimiter + "];");
/*

 * You may obtain a copy of the License at
        } else {
    }
    }
import org.jkiss.dbeaver.tools.transfer.stream.IDocumentDataExporter;
        if(language == ProgramLanguages.PHP_VERSION_LESS_5_and_4) {
    public void exportRow(DBCSession session, DBCResultSet resultSet, Object[] row) throws DBException, IOException {
        PrintWriter out = getWriter();
public class DataExporterSourceCode extends StreamExporterAbstract implements IDocumentDataExporter {
    public void exportFooter(DBRProgressMonitor monitor) throws DBException, IOException {
        } else {
        }
        }
        }
    public void exportHeader(DBCSession session) throws DBException, IOException {
            out.write("\tarray(" + rowDelimiter);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        out.write(rowDelimiter + "?>");
        }
import org.jkiss.dbeaver.model.data.DBDContent;


import org.jkiss.dbeaver.model.data.json.JSONUtils;
 * distributed under the License is distributed on an "AS IS" BASIS,
                try {
            return value;
 * you may not use this file except in compliance with the License.
            }
        public String value() {
        } else {

            if (CommonUtils.isEmpty(columnName)) {
                // Inline textual content and handle binaries in some special way
        }
        } else {
        public static ProgramLanguages fromValue(String v) {
        for (;;) {
        }
            for (ProgramLanguages s : ProgramLanguages.values()) {
            } else if (cellValue instanceof DBDContent) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
    private static final String PROP_LANGUAGE = "language";
        }
        PHP_VERSION_LESS_5_and_4 ("PHP < 5.4"), PHP_VERSION_AT_LEAST_5_AND_4("PHP 5.4+");
    {
            getWriter().write(JSONUtils.escapeJsonString(new String(buffer, 0, count)));
                    }
        this.rowDelimiter = StreamTransferUtils.getDelimiterString(properties, PROP_ROW_DELIMITER);
        }
        if(language == ProgramLanguages.PHP_VERSION_LESS_5_and_4) {
                    writeTextCell(JSONUtils.formatDate((Date) cellValue));
 * limitations under the License.
        super.init(site);
        ProgramLanguages(String v) {
                            getSite().writeBinaryData(cs);
import org.jkiss.dbeaver.model.data.DBDContentStorage;
    private void writeTextCell(@Nullable String value)
    {
            }
import org.jkiss.code.Nullable;
        if(language == ProgramLanguages.PHP_VERSION_LESS_5_and_4) {
    {
        }
    private String rowDelimiter;
import org.jkiss.dbeaver.model.exec.DBCSession;
                }
    enum ProgramLanguages {
 */
                } finally {
    }
                            try (Reader in = cs.getContentReader()) {
            if (DBUtils.isNullValue(cellValue)) {
        if (ROW_DELIMITER_DEFAULT.equalsIgnoreCase(this.rowDelimiter.trim())) {
                out.write(",");
                } else if (cellValue instanceof Date && formatDateISO) {
                                out.write(quoteChar);
        }
            out.write("[" + rowDelimiter);
                break;
    @Override
import org.jkiss.dbeaver.DBException;
                writeTextCell(null);
        out.write("<?php" + rowDelimiter);
        PrintWriter out = getWriter();
    public void init(IStreamDataExporterSite site) throws DBException
        columns = getSite().getAttributes();

            getWriter().write(quoteChar + JSONUtils.escapeJsonString(value) + quoteChar);

        if (value != null) {
            } else {
            return PHP_VERSION_LESS_5_and_4;
 * Licensed under the Apache License, Version 2.0 (the "License");
        language = ProgramLanguages.fromValue(CommonUtils.toString(properties.get(PROP_LANGUAGE)));
            out.write(rowDelimiter + ");");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.DBUtils;
    }
                    writeTextCell(super.getValueDisplayString(column, cellValue));
            getWriter().write("null");
import org.jkiss.dbeaver.tools.transfer.stream.IStreamDataExporterSite;
            out.write("\t]");
    @Override
                                writeCellValue(in);
                columnName = column.getName();
    private static final String PROP_QUOTE_CHAR = "quoteChar";
        String tableName = getSite().getSource().getName();
        PrintWriter out = getWriter();
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
        Object quoteProp = properties.get(PROP_QUOTE_CHAR);
            }
            int count = reader.read(buffer);
            out.write("array(" + rowDelimiter);
 * See the License for the specific language governing permissions and

        private final String value;

        }
    private int rowNum = 0;

            out.write("\t[" + rowDelimiter);
import java.io.IOException;
 * Unless required by applicable law or agreed to in writing, software
        } else {

    private boolean formatDateISO = true;
        Map<String, Object> properties = site.getProperties();
        out.write("$" + tableName + " = ");
    private static final String PROP_ROW_DELIMITER = "rowDelimiter";
            }
                }
        if(language == ProgramLanguages.PHP_VERSION_LESS_5_and_4) {
                DBDContent content = (DBDContent) cellValue;
            out.write("\t\t" + quoteChar + JSONUtils.escapeJsonString(columnName) + quoteChar + " => ");
                // Content
import org.jkiss.dbeaver.utils.ContentUtils;
        }
}
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        rowNum = 0;
                    out.write(cellValue.toString());
                }
            String columnName = column.getLabel();
package org.jkiss.dbeaver.tools.transfer.stream.exporter;
            DBDAttributeBinding column = columns[i];
            quoteChar = '\'';
        // Copy reader
                            }
                } else {
                    DBDContentStorage cs = content.getContents(session.getProgressMonitor());

    private static final String ROW_DELIMITER_DEFAULT = "default";
import java.io.Reader;
                    if (cs != null) {
        formatDateISO = CommonUtils.getBoolean(site.getProperties().get(PROP_FORMAT_DATE_ISO), true);
    private static final String PROP_FORMAT_DATE_ISO = "formatDateISOPHP";
    private void writeCellValue(Reader reader) throws IOException
            out.write("," + rowDelimiter);
                if (s.value.equals(v)) {
    }
    private char quoteChar = '"';

            }
 *
            value = v;
import org.jkiss.dbeaver.utils.GeneralUtils;
                                out.write(quoteChar);
            Object cellValue = row[i];
        for (int i = 0; i < columns.length; i++) {
    @Override
        char buffer[] = new char[2000];
                        if (ContentUtils.isTextContent(content)) {
 *

    }
            out.write(rowDelimiter);
        if (rowNum > 0) {
                        }
import java.io.PrintWriter;
            out.write("\t)");
