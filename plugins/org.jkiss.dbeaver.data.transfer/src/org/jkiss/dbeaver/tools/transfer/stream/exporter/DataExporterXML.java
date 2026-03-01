import org.jkiss.code.Nullable;
    }
        PrintWriter out = getWriter();
        }
        }
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.utils.CommonUtils;
            String columnName = escapeXmlElementName(column.getName());
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
                    getWriter().write("&amp;");
 */
                    DTUtils.closeContents(resultSet, content);
        char buffer[] = new char[2000];
                }
            }
 * You may obtain a copy of the License at
    }
            if (DBUtils.isNullValue(row[i])) {
                    colName = columns[i].getName();
                out.write(escapeXmlElementName(colName) + "?");


            out.write("]>\n");
                String colName = columns[i].getLabel();
        }
                // Inline textual content and handle binaries in some special way
    }
        if (value != null) {
    }
import org.jkiss.dbeaver.model.DBUtils;
            for (int i = 0; i < columnsSize; i++) {
        super.init(site);
    @Override

                if (buffer[i] == '<') {
 * DBeaver - Universal Database Manager
                    getWriter().write("&lt;");
import java.io.Reader;
        // Copy reader
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
    private void printHeader()
    @Override
    private String tableName;
        super.dispose();
            return escapedName;
            } else if (row[i] instanceof DBDContent) {
import org.jkiss.dbeaver.tools.transfer.DTUtils;


    {
        tableName = escapeXmlElementName(getSite().getSource().getName());
    }
import org.jkiss.dbeaver.model.exec.DBCSession;
import org.jkiss.dbeaver.model.exec.DBCResultSet;
        getWriter().write("</" + tableName + ">\n");
        for (int i = 0; i < row.length; i++) {
 * limitations under the License.
        }
 * Unless required by applicable law or agreed to in writing, software
        return "_" + escapedName;
                } else {
                out.write("  <!ELEMENT " + escapeXmlElementName(columns[i].getName()) + " (#PCDATA)>\n");
    }

import org.jkiss.dbeaver.model.data.DBDContent;
            out.write(")+>\n");
                break;


                writeTextCell(null);
    {
        }
        out.write("<?xml version=\"1.0\" encoding=\"" + getSite().getOutputEncoding() + "\"?>\n");

import org.jkiss.dbeaver.utils.ContentUtils;
        if (Character.isAlphabetic(firstCharacter) || firstCharacter == '_') {
        out.write("  </DATA_RECORD>\n");
                }
    @Override
                finally {
            }
                } else if (buffer[i] == '&') {
    private boolean includeDoctype;
import org.jkiss.dbeaver.tools.transfer.stream.IStreamDataExporterSite;
                DBDContent content = (DBDContent)row[i];
    {
            out.write("<!DOCTYPE " + tableName + " [\n");
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0

                    out.write(",");
import org.jkiss.dbeaver.DBException;
                }
public class DataExporterXML extends StreamExporterAbstract {
 *
 * See the License for the specific language governing permissions and
    }
                else if (buffer[i] == '>') {
    private void writeCellValue(Reader reader) throws IOException
                // Content
/**
            DBDAttributeBinding column = columns[i];
        out.write("  <DATA_RECORD>\n");
            out.write("</" + columnName + ">\n");
            out.write("  <!ELEMENT " + tableName + " (DATA_RECORD*)>\n");
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
    private DBDAttributeBinding[] columns;
                        }
    private void writeTextCell(@Nullable String value)
            out.write("    <" + columnName + ">");
                try {
                    DBDContentStorage cs = content.getContents(session.getProgressMonitor());
                        if (ContentUtils.isTextContent(content)) {
                writeTextCell(super.getValueDisplayString(column, row[i]));
package org.jkiss.dbeaver.tools.transfer.stream.exporter;
        out.write("<" + tableName + ">\n");
                }
                    if (cs != null) {
                                writeCellValue(reader);
                }
            }
                    }
        char firstCharacter = escapedName.charAt(0);

    private String escapeXmlElementName(String name) {
    {
            value = value.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;");
        for (;;) {
    public void exportRow(DBCSession session, DBCResultSet resultSet, Object[] row) throws DBException, IOException
    }
}
/*
                    getWriter().write(buffer[i]);
            }
 *
            } else {
 * Copyright (C) 2010-2026 DBeaver Corp and others
        includeDoctype = CommonUtils.getBoolean(site.getProperties().get(PROP_INCLUDE_DOCTYPE_DECLARATION), false);
                if (CommonUtils.isEmpty(colName)) {
    {
            for (int i = 0; i < count; i++) {
    public void exportHeader(DBCSession session) throws DBException, IOException
                            getSite().writeBinaryData(cs);
    public void init(IStreamDataExporterSite site) throws DBException
import java.io.PrintWriter;
                            try (Reader reader = cs.getContentReader()) {

        columns = getSite().getAttributes();
            out.write("  <!ELEMENT DATA_RECORD (");
    @Override
            getWriter().write(value);
 * XML Exporter

            }
    public void dispose()
import org.jkiss.dbeaver.model.data.DBDContentStorage;
        printHeader();
                    getWriter().write("&gt;");
                if (i < columnsSize - 1) {

    public void exportFooter(DBRProgressMonitor monitor) {
            int columnsSize = columns.length;
    {
                }

 *
            if (count <= 0) {
 */
        PrintWriter out = getWriter();
            for (int i = 0; i < columnsSize; i++) {
            int count = reader.read(buffer);
        if (includeDoctype) {
    private static final String PROP_INCLUDE_DOCTYPE_DECLARATION = "includeDoctype";
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        } else {
                            }
        String escapedName = name.replaceAll("[^\\p{Alpha}\\p{Digit}]+", "_");
import java.io.IOException;
