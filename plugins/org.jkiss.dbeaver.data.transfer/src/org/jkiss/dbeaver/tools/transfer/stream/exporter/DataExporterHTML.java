    private boolean outputColumnHeaders = true;
                boolean isImage = row[i] instanceof File && stringValue != null && stringValue.endsWith(".jpg");
        out.write("<body>\n<table>");
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.awt.image.BufferedImage;
        printHeader();
                    }
                }
 * Licensed under the Apache License, Version 2.0 (the "License");
                    DTUtils.closeContents(resultSet, content);
            }
                out.write("&nbsp;");
//              "width: 50%;" +
    private static final String PROP_COLUMN_HEADERS = "columnHeaders";

                }
            "padding: 5px;" +
                String colName = column.getLabel();

            "border: thin solid #6495ed;" +
import org.jkiss.dbeaver.tools.transfer.stream.IStreamDataExporterSite;
            out.write("</tr>");
                try {
    private static final String PROP_HEADER = "tableHeader";
    }
                // Content
        PrintWriter out = getWriter();

            BufferedImage image = null;
        super.init(site);
        out.write("<td>");
                    if (cs != null) {
                writeTextCell(colName, true);
            out.write("<tr>");
        if (outputColumnHeaders) {
    @Override
                image = ImageIO.read(file);
                String stringValue = super.getValueDisplayString(column, row[i]);
    public void exportFooter(DBRProgressMonitor monitor) {

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    if (width > height) {
                throw new DBException("Can't read an exported image " + image, e);
        super.dispose();
 *
            writeTableTitle(name, columns.length);
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.exec.DBCResultSet;
            "border-collapse: collapse;" +
            "width: 100%;} " +
 * distributed under the License is distributed on an "AS IS" BASIS,

    }
//              "width: 50%;" +
            "text-align: center;}" +
                }
import org.jkiss.dbeaver.DBException;
        } else {
            if (image != null) {
                writeTextCell(null, false);
package org.jkiss.dbeaver.tools.transfer.stream.exporter;
            }
 *
        out.write(CommonUtils.escapeHtml(value));


            "table {border: medium solid #6495ed;" +
            out.write("&nbsp;");
 * you may not use this file except in compliance with the License.
    }
        out.write("<head>\n" +
}
            PrintWriter out = getWriter();
                        if (ContentUtils.isTextContent(content)) {
                out.write("<img src=\"" + imagePath + "\" width=\"" + rwidth + "\" height=\"" + rheight + "\" />");
        out.write("</td>");
    private DBDAttributeBinding[] columns;
    public void exportRow(DBCSession session, DBCResultSet resultSet, Object[] row) throws DBException, IOException {
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
    private String name;
    private void writeCellValue(Reader reader) throws IOException {
    public void init(IStreamDataExporterSite site) throws DBException {

                    writeTextCell(stringValue, false);
    private int rowCount = 0;
        if (outputHeader) {
                    rwidth = (int) (rwidth * scale);
    private void writeImageCell(File file) throws DBException {
    }
 * DBeaver - Universal Database Manager
/**
                out.write("<a href=\"" + imagePath + "\">");
    }
                out.write("</a>");
                DBDContent content = (DBDContent) row[i];
import org.jkiss.dbeaver.model.DBUtils;

    @Override
    @Override
                if (width > IMAGE_FRAME_SIZE || height > IMAGE_FRAME_SIZE) {
 * You may obtain a copy of the License at
/*
        }
            out.write("<tr>");
    private static final int IMAGE_FRAME_SIZE = 200;

            while (line != null) {

        }
        out.write(String.format("<th colspan=\"%d\"><pre><code>", columns));
            "th{text-align: left;}" +
                int height = image.getHeight();
                        }
                        scale = IMAGE_FRAME_SIZE / (float) height;
                    rheight = (int) (rheight * scale);
        outputHeader = CommonUtils.getBoolean(properties.get(PROP_HEADER), outputHeader);

import javax.imageio.ImageIO;
                line = bufferedReader.readLine();
                    } else {

        out.write("</tr>\n");
            "</style>\n</head>\n");
import java.io.*;
                // Inline textual content and handle binaries in some special way
                if (CommonUtils.isEmpty(colName)) {
        out.write("<tr" + (rowCount++ % 2 == 0 ? " class=\"odd\"" : "") + ">");
        PrintWriter out = getWriter();
            for (DBDAttributeBinding column : columns) {
 * limitations under the License.
                int rwidth = width;
                }
                out.write(CommonUtils.escapeHtml(line));
        out.write(CommonUtils.escapeHtml(value));
        if (file == null || !file.exists()) {
        PrintWriter out = getWriter();
import java.util.Map;
import org.jkiss.dbeaver.utils.ContentUtils;
        out.write("</code></pre></th>");
            "<style>\n" +
                    out.write("<td>");
    @Override
                        scale = IMAGE_FRAME_SIZE / (float) width;

                String imagePath = file.getAbsolutePath();
 */
            "<meta charset=\"" + getSite().getOutputEncoding() + "\"/>" +
        }
                imagePath = "files/" + imagePath.substring(imagePath.lastIndexOf(File.separator));
                }
 * HTML Exporter
            String line = bufferedReader.readLine();
            if (DBUtils.isNullValue(row[i])) {
            "img{padding:5px; border:solid; border-color: #dddddd #aaaaaa #aaaaaa #dddddd; border-width: 1px 2px 2px 1px; background-color:white;}" +
                    DBDContentStorage cs = content.getContents(session.getProgressMonitor());
    }
        out.write("<!DOCTYPE html>\n<html>\n");
                int rheight = height;
 *
        }
                } else {
            "th{font-family: monospace;" +
                    float scale;
import org.jkiss.dbeaver.model.data.DBDContentStorage;
                int width = image.getWidth();
    }
            try {
            }
            "background-color: #D0E3FA;}" +
    private void writeTextCell(String value, boolean header) {
            out.write("</tr>");
            } else if (row[i] instanceof DBDContent) {

                if (line != null) {
                } finally {
            "td{font-family: sans-serif;" +
 * Copyright (C) 2010-2025 DBeaver Corp and others


            ".odd{background:#e8edff;}" +

                            getSite().writeBinaryData(cs);
public class DataExporterHTML extends StreamExporterAbstract {
    }
                            writeCellValue(cs.getContentReader());
        getWriter().write("</table></body></html>");
            "border: thin solid #6495ed;" +

            } else {
    private boolean outputHeader = true;
    private void writeTableTitle(String value, int columns) {
            } else {
        try (BufferedReader bufferedReader = new BufferedReader(reader)) {
            "padding: 5px;" +

    }
                    out.write("</td>");
            DBDAttributeBinding column = columns[i];
        PrintWriter out = getWriter();
    public void dispose() {
        out.write(header ? "</th>" : "</td>");
            }
        Map<String, Object> properties = site.getProperties();
    @Override
        name = getSite().getSource().getName();
 * Unless required by applicable law or agreed to in writing, software
            } catch (IOException e) {
                    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        for (int i = 0; i < row.length; i++) {
    public void exportHeader(DBCSession session) throws DBException, IOException {
                    out.write("<br>");
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.tools.transfer.DTUtils;
        PrintWriter out = getWriter();
        }
        columns = getSite().getAttributes();
    private void printHeader() {
                    writeImageCell((File) row[i]);
import org.jkiss.dbeaver.model.exec.DBCSession;
        out.write(header ? "<th>" : "<td>");
    }
                if (isImage) {
import org.jkiss.dbeaver.model.data.DBDContent;
                    colName = column.getName();
                        } else {
        outputColumnHeaders = CommonUtils.getBoolean(properties.get(PROP_COLUMN_HEADERS), outputColumnHeaders);
            }
