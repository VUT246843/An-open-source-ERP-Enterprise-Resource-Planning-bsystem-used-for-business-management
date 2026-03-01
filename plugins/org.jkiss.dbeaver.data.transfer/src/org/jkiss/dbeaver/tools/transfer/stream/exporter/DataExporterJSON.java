            getWriter().write("\"" + JSONUtils.escapeJsonString(value) + "\"");
import org.jkiss.dbeaver.model.exec.DBCAttributeMetaData;

import org.jkiss.dbeaver.model.DBUtils;
        }
        while (true) {

    }
    public static final String PROP_PRINT_TABLE_NAME = "printTableName";
import org.jkiss.dbeaver.tools.transfer.stream.IDocumentDataExporter;
        }
        columns = getSite().getAttributes();
        DBDContent content,
        rowNum++;
        out.write("[\n");
/**
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
    public void init(IStreamDataExporterSite site) throws DBException {
        PrintWriter out = getWriter();
 * JSON Exporter
        getWriter().write("\"");
    private boolean printTableName = true;
        char[] buffer = new char[2000];
        exportJsonAs = (String) site.getProperties().getOrDefault(PROP_EXPORT_JSON_VALUES, PROP_EXPORT_JSON_VALUES_AS_STRING);
                    writeClob(content, cs);
            );
            out.write("}");
        DBDContentStorage cs
 *
    public static final String PROP_EXPORT_JSON_VALUES_AS_STRING = "string";
            out.write("\t}");
    @Override
        DBDContent content
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
            if (columns.length == 1 &&
    private boolean hasJsonDataType(@NotNull DBDAttributeBinding column) {

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.data.DBDContentStorage;
                }
    public void exportFooter(DBRProgressMonitor monitor) throws IOException {
                writeCellValue(in, false);
        // Content
        out.write("\n]");
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.Nullable;
    }
                    out.write(",");
        PrintWriter out = getWriter();
                    writeTextCell(null, true);
        super.dispose();

                    writeBlob(cs);
import org.jkiss.dbeaver.model.exec.DBCSession;
                break;
    private void writeCellValue(Reader reader, boolean escape) throws IOException {
        if (!ArrayUtils.isEmpty(columns)) {
                getWriter().write("\"");
    @Override

            }

        return metaAttribute.getTypeName().toLowerCase(Locale.ROOT).contains("json");
            out.write("{\n");
    @Override
    }
        getSite().writeBinaryData(cs);
            }
    }
            DBPDataKind dataKind = columns[0].getDataKind();

                }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

            getWriter().write("null");

                if (i < columns.length - 1) {
    public static final String PROP_EXPORT_JSON_VALUES_AS_JSON = "json";
    private int rowNum = 0;
        }
 *

    public void dispose() {
            out.write(",\n");
        document.serializeDocument(session.getProgressMonitor(), getWriter());
    private boolean formatDateISO = true;
        printTableName = CommonUtils.getBoolean(site.getProperties().get(PROP_PRINT_TABLE_NAME), true);
import org.jkiss.dbeaver.model.DBPDataKind;
    private void writeBlob(DBDContentStorage cs) throws IOException {
import org.jkiss.dbeaver.model.data.json.JSONUtils;
        super.init(site);

                }
            out.write("\t{\n");
    ) throws IOException {
import java.util.Date;
    private void writeClob(
        }
import org.jkiss.dbeaver.tools.transfer.DTUtils;
    }
import org.jkiss.dbeaver.DBException;
                } else {
                out.write("\n");
    }
    private void writeTextCell(@Nullable String value, boolean escape) {
 * DBeaver - Universal Database Manager
    }
import org.jkiss.utils.CommonUtils;
import org.jkiss.utils.ArrayUtils;
                    return MimeTypes.TEXT_JSON.equalsIgnoreCase(document.getDocumentContentType());
import java.io.Reader;
        PrintWriter out = getWriter();

    private String tableName;
    public static final String PROP_EXPORT_JSON_VALUES = "exportJsonValues";
        }
        if (value == null) {
 * distributed under the License is distributed on an "AS IS" BASIS,

 *
                Object cellValue = row[i];
            getWriter().write(
            } else {
    public static final String PROP_FORMAT_DATE_ISO = "formatDateISO";
    private String exportJsonAs = PROP_EXPORT_JSON_VALUES_AS_STRING;
    @Override
        formatDateISO = CommonUtils.getBoolean(site.getProperties().get(PROP_FORMAT_DATE_ISO), true);
                }
                // STRUCT Kind - this is the case from Couchbase, it can contains JSON document also
 */

    @Override
 */

        }
    public void exportHeader(DBCSession session) throws DBException, IOException {

                if (DBUtils.isNullValue(cellValue)) {
            for (int i = 0; i < columns.length; i++) {
        DBCAttributeMetaData metaAttribute = column.getMetaAttribute();
import org.jkiss.dbeaver.utils.ContentUtils;

    ) throws DBCException, IOException {

        // Inline textual content and handle binaries in some special way
        return false;
import java.util.Locale;
                } else {


        }
        printHeader();
                String columnName = CommonUtils.isEmpty(column.getLabel()) ? column.getName() : column.getLabel();
import org.jkiss.dbeaver.model.data.DBDContent;
                } else if (cellValue instanceof Number || cellValue instanceof Boolean) {
                writeCellValue(in, true);
    public void exportRow(DBCSession session, DBCResultSet resultSet, Object[] row) throws DBException, IOException {
                    out.write(cellValue.toString());

    private void writeContentValue(
        }
            getWriter().write(value);

                    writeTextCell(JSONUtils.formatDate((Date) cellValue), true);

    private DBDAttributeBinding[] columns;
 * Unless required by applicable law or agreed to in writing, software
                    writeContentValue(session, resultSet, content);
        getWriter().write("\"");
            DTUtils.closeContents(resultSet, content);
import org.jkiss.dbeaver.utils.MimeTypes;
        if (printTableName) {
            writeDocument(session, (DBDDocument) row[0]);
 * limitations under the License.
    }
}
        } else {
    private void writeDocument(DBCSession session, DBDDocument document) throws DBException, IOException {
            if (PROP_EXPORT_JSON_VALUES_AS_JSON.equalsIgnoreCase(exportJsonAs) && ContentUtils.isJSON(content)) {
        DBCSession session,
            return false;
        if (metaAttribute == null) {
            out.write("\"" + JSONUtils.escapeJsonString(tableName) + "\": ");

 * See the License for the specific language governing permissions and
                escape ? JSONUtils.escapeJsonString(chunk) : chunk
                } else if (PROP_EXPORT_JSON_VALUES_AS_JSON.equalsIgnoreCase(exportJsonAs) && hasJsonDataType(column)) {
        if (rowNum > 0) {
        tableName = getSite().getSource().getName();
import org.jkiss.dbeaver.model.exec.DBCException;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import java.io.PrintWriter;
        }
        try {
        } finally {
                } else if (cellValue instanceof DBDContent content) {
                if (row.length > 0 && !DBUtils.isNullValue(row[0]) && row[0] instanceof DBDDocument document) {
        DBCResultSet resultSet,
public class DataExporterJSON extends StreamExporterAbstract implements IDocumentDataExporter {
    }
        if (isJsonDocumentResults(row)) {
        try (Reader in = cs.getContentReader()) {
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.tools.transfer.stream.IStreamDataExporterSite;
    private void printHeader() {
    private boolean isJsonDocumentResults(@NotNull Object[] row) {

    }
                    writeTextCell(super.getValueDisplayString(column, cellValue), true);
            if (count <= 0) {
            String chunk = new String(buffer, 0, count);
import org.jkiss.dbeaver.model.exec.DBCResultSet;
            if (cs != null) {
    }
                (dataKind == DBPDataKind.DOCUMENT || dataKind == DBPDataKind.STRUCT)) {
            int count = reader.read(buffer);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
    }
import java.io.IOException;
                } else if (cellValue instanceof Date && formatDateISO) {
            DBDContentStorage cs = content.getContents(session.getProgressMonitor());
    }
    }
            }
        rowNum = 0;
import org.jkiss.dbeaver.model.data.DBDDocument;
                out.write("\t\t\"" + JSONUtils.escapeJsonString(columnName) + "\" : ");

        }
        } else if (escape) {
        // Copy reader
            }
/*
package org.jkiss.dbeaver.tools.transfer.stream.exporter;
                DBDAttributeBinding column = columns[i];

                    writeTextCell(super.getValueDisplayString(column, cellValue), false);
        out.write("\n");
                if (ContentUtils.isTextContent(content)) {
        } else {
                getWriter().write("\"");

        if (printTableName) {
