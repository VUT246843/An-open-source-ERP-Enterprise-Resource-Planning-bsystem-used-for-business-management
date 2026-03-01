        includeNullValues = CommonUtils.getBoolean(site.getProperties().get(PROP_INCLUDE_NULL_VALUES), true);
    public void init(IStreamDataExporterSite site) throws DBException
            } else if (columnValue instanceof Timestamp) {
        result = CommonUtils.escapeIdentifier(result);
                writeTextCell(super.getValueDisplayString(column, columnValue));
        PrintWriter out = getWriter();
        String outputEncoding = getSite().getOutputEncoding();
        tableName = getTableName();
 * Unless required by applicable law or agreed to in writing, software
            out.write(" " + columnName + "=\"");
                try {
            } else if (columnValue instanceof Date) {
import org.jkiss.dbeaver.model.data.DBDContent;
                // Content
 *
import java.io.*;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private String getTableName()
                DBDContent content = (DBDContent) columnValue;
            String columnName = escapeXmlElementName(column.getName());
    public void exportFooter(DBRProgressMonitor monitor) {
        }
                    out.write(columnValue.toString());
        if (value != null) {
                } else if (buffer[i] == '"') {

                    }
        super.init(site);
    }
import org.jkiss.dbeaver.model.exec.DBCResultSet;
    {
        }
import org.jkiss.utils.Base64;
    }
    {
import org.jkiss.dbeaver.tools.transfer.DTUtils;
        PrintWriter out = getWriter();
                            try (Reader reader = cs.getContentReader()) {
    private static final String PROP_NULL_VALUE_STRING = "nullValueString";
    }
                out.write(columnValue.toString());
                }
import java.sql.Time;
            } else if (columnValue instanceof Time) {
 */
                    int nanoseconds = ((Timestamp) columnValue).getNanos();
    }
        return result;
        char buffer[] = new char[2000];
        String result = sourceObject.getName();
import org.jkiss.dbeaver.model.exec.DBCSession;
            }

        PrintWriter out = getWriter();
    @Override
                if (buffer[i] == '<') {

        for (;;) {
    public void exportRow(DBCSession session, DBCResultSet resultSet, Object[] row) throws DBException, IOException

    private void writeCellValue(Reader reader) throws IOException
            writeCellValue(new StringReader(value));
            }
}
            DBDAttributeBinding column = columns[i];
import org.jkiss.dbeaver.model.data.DBDContentStorage;

                            }
    @Override
                }
        return name.replaceAll("[^\\p{Alpha}\\p{Digit}]+","_");
        out.append("<?xml version=\"1.0\" encoding=\"").append(outputEncoding).append("\"?>").append(CommonUtils.getLineSeparator());
                } catch (Exception e) {
                int scale = column.getMetaAttribute().getScale() != null && column.getMetaAttribute().getScale() > 0 ? column.getMetaAttribute().getScale() : 1;
import org.jkiss.dbeaver.model.DBPNamedObject;
            if (DBUtils.isNullValue(row[i]) && !includeNullValues) {
                        } else {
 * DbUnit is a framework for populating a database with test data before
 * you may not use this file except in compliance with the License.
            if (DBUtils.isNullValue(columnValue)) {
    private void writeTextCell(@Nullable String value) throws IOException {
        getWriter().write("</dataset>\n");
 * 
                else if (buffer[i] == '>') {
                try {
    {
import org.jkiss.dbeaver.DBException;
                                writeCellValue(reader);
                try {
        out.write("/>" + CommonUtils.getLineSeparator());
                    out.write("&lt;");
                    if (cs != null) {

            out.write("\"");
    {
                    out.write("&amp;");
        DBPNamedObject sourceObject = getSite().getSource();
        upperCaseTableName = CommonUtils.getBoolean(site.getProperties().get(PROP_UPPER_CASE_TABLE_NAME), true);
                    out.write(columnValue.toString());
                } else if (buffer[i] == '&') {
                    out.write(String.format(Locale.ROOT, "%1$tH:%1$tM:%1$tS", columnValue));
                    out.write(String.format(Locale.ROOT, "%1$tY-%1$tm-%1$td", columnValue));
    private boolean upperCaseTableName;
    private static final String PROP_UPPER_CASE_COLUMN_NAMES = "upperCaseColumnNames";

import java.math.BigDecimal;
 * You may obtain a copy of the License at
                            }
        for (int i = 0; i < row.length; i++) {
                    out.write(buffer[i]);
        out.append("<dataset>").append(CommonUtils.getLineSeparator());
                try {

    }

            }
                }
    }
 */
                continue;
    @Override
            }
                        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            for (int i = 0; i < count; i++) {
                                Base64.encode(stream, cs.getContentLength(), getSite().getWriter());

                    out.write(String.format(Locale.ROOT, "%." + scale + "f", columnValue));
    {
            if (count <= 0) {
    private boolean upperCaseColumnNames;
                }
        if (upperCaseTableName) {
    private String tableName;
        out.write("    <" + tableName);
                writeTextCell("" + getSite().getProperties().get(PROP_NULL_VALUE_STRING));
 * running an integration test. This export uses the format used by FlatXmlDataSet/ReplacementDataSet
 *
                    out.write(columnValue.toString());
/*

                } catch (Exception e) {
        upperCaseColumnNames = CommonUtils.getBoolean(site.getProperties().get(PROP_UPPER_CASE_COLUMN_NAMES), true);
                    out.write("&quot;");
                            try (final InputStream stream = cs.getContentStream()) {
    private DBDAttributeBinding[] columns;
package org.jkiss.dbeaver.tools.transfer.stream.exporter;
                } catch (Exception e) {
            } else if (columnValue instanceof Float || columnValue instanceof Double || columnValue instanceof BigDecimal) {
    {
import java.util.Locale;
            } else if (columnValue instanceof Number) {
                } else {
public class DataExporterDbUnit extends StreamExporterAbstract {
import org.jkiss.dbeaver.model.DBUtils;
 * DBeaver - Universal Database Manager
        columns = getSite().getAttributes();
 * limitations under the License.
                } catch (Exception e) {
                columnName = columnName.toUpperCase();
            } else if (columnValue instanceof Boolean) {
    @Override
    }
                    out.write(String.format(Locale.ROOT, "%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS.%2$d", columnValue, nanoseconds));
    private static final String PROP_INCLUDE_NULL_VALUES = "includeNullValues";
            int count = reader.read(buffer);
                }
        }
        super.dispose();
                try {
    @Override
                finally {
    public void exportHeader(DBCSession session) throws DBException, IOException
        columns = null;
 * distributed under the License is distributed on an "AS IS" BASIS,
                    DBDContentStorage cs = content.getContents(session.getProgressMonitor());
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
                    out.write("&gt;");
                    DTUtils.closeContents(resultSet, content);
                }
    private boolean includeNullValues;
import java.sql.Date;
 *     http://www.apache.org/licenses/LICENSE-2.0
                        if (ContentUtils.isTextContent(content)) {
        // Copy reader
                out.write(columnValue.toString());
/**
 * described at http://dbunit.sourceforge.net/components.html
            } else if (columnValue instanceof DBDContent) {
            }
    }
                    out.write(columnValue.toString());
                }
    private String escapeXmlElementName(String name) {
 * DbUnit Dataset Exporter

            if (columnName != null && upperCaseColumnNames) {

import java.sql.Timestamp;
                }
import org.jkiss.code.Nullable;
        tableName = null;

                break;
    private static final String PROP_UPPER_CASE_TABLE_NAME = "upperCaseTableName";
 *
                // Inline textual content and handle binaries in some special way
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.tools.transfer.stream.IStreamDataExporterSite;
    }
            result = result.toUpperCase();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            } else {
import org.jkiss.utils.CommonUtils;
            Object columnValue = row[i];
        }
import org.jkiss.dbeaver.utils.ContentUtils;
    public void dispose()
 * See the License for the specific language governing permissions and
