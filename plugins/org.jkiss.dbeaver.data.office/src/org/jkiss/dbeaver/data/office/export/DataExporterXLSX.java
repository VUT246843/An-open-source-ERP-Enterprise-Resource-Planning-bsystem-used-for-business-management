            // Read bindings to extract column descriptions

            cell.setCellStyle(style);
    private static final String PROP_HEADER = "header";
            if (exportSql && wb != null) {
                    hasDescription = true;
    private static final int ROW_WINDOW = 100;
    private static final String PROP_TRIM_STRINGS = "trimString";
            if (w.getCurrentRow() >= splitByRowCount) {
        if (hasDescription) {
                // Setting the foreground color sets the background color. Is this a bug/feature of POI?
            exportTableName = DTUtils.getTableName(columns[0].getDataSource(), getSite().getSource(), true,

        if (CommonUtils.isNotEmpty(cellValue) && cellValue.length() > EXCEL_MAX_CELL_CHARACTERS) {
        }

                } catch (Exception e) {
                    bindingsOk = false;
                    // Auto-size failed, use default minimum column width
                    String text = fmt.format(dateVal);


    private boolean trimStrings;
                } else {
        if (trimStrings && CommonUtils.isNotEmpty(cellValue)) {
                    } else {
import org.jkiss.dbeaver.model.data.*;

        splitSqlText = CommonUtils.getBoolean(properties.get(PROP_SPLIT_SQLTEXT), false);
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
        styleHeader.setBorderTop(border);
    private static final String PROP_FALSESTRING = "falseString";
    public void exportRow(DBCSession session, DBCResultSet resultSet, Object[] row)
    private String boolFalse = "false";

            default:
                if (CommonUtils.isEmpty(colName)) {
    private static final String PROP_HEADER_FONT = "headerfont";
    private int splitByCol = 0;
        }

                if (format.value.equals(value)) {

            DBExecUtils.bindAttributes(session, srcEntity, null, columns, null);
                    colName = column.getName();

        if (wb == null) {
                }

    private static final String PROP_SPLIT_BYROWCOUNT = "splitByRowCount";
            case BOLD:
            char buffer[] = new char[2000];
    private int rowCount = 0;
    enum FontStyleProp {NONE, BOLD, ITALIC, STRIKEOUT, UNDERLINE}

    }
        return true;
 * You may obtain a copy of the License at
    }
        final SXSSFSheet sh = (SXSSFSheet) wsh.getSh();
            for (int i = 0; i < columns.length; i++) {

    }
                fontBold.setBold(true);
     * <p>
import java.io.Reader;
        final int r = Integer.parseInt(tokenizer.nextToken().trim());
                    Sheet sh = wb.createSheet();
        } else {
import org.jkiss.dbeaver.model.exec.DBExecUtils;
import java.io.IOException;
        style.setBorderBottom(border);
                } else {
                String stringValue = super.getValueDisplayString(column, row[i]);
                w = createSheet(resultSet, colValue);

import org.jkiss.dbeaver.model.exec.DBCSession;
                        newcell.setCellValue(getSite().getSource().getName());
        if (!hasDescription && !headerFormat.hasLabel()) {
            }
    private static final String PROP_APPEND_STRATEGY = "appendStrategy";
    public void importData(@NotNull IStreamDataExporterSite site) throws DBException {

                }

        private final String value;
            return LABEL;
        }
        nullString = nullStringProp == null ? null : nullStringProp.toString();
        }
    }
            }
        LABEL("label"),
    private XSSFCellStyle style;
    private CellType getCellType(DBDAttributeBinding column) {
            return CREATE_NEW_SHEETS;
                        Cell newcell = row.createCell(0);
            if (bg != null) {
            }





    private XSSFCellStyle styleHeader;
import org.jkiss.dbeaver.utils.ContentUtils;
        decorator = GeneralUtils.adapt(getSite().getSource(), DBDAttributeDecorator.class);
                } else {
        styleHeader.setBorderRight(border);
            case STRIKEOUT:
        properties.put(DataExporterXLSX.PROP_DATE_FORMAT, "");
                    if (cs == null) {
                    return format;
        if (w == null) {
                style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            CommonUtils.toString(properties.get(PROP_BORDER), BorderStyle.THIN.name()),
                sheet = wb.createSheet(WorksheetUtils.makeUniqueSheetName(wb, exportTableName));

            final String bg = decorator.getCellBackground(attribute, row);
                }
        AppendStrategy(@NotNull String value) {
            }
        this.sheetIndex = 0;
            wsh.incRow();
            }
    public void init(IStreamDataExporterSite site) throws DBException {
        styleHeader.setFont(fontBold);
            StringBuilder sb = new StringBuilder();
    private DBDAttributeDecorator decorator;
    private String getPreparedString(@Nullable String cellValue) {
    private void writeCellValue(Cell cell, Reader reader) throws IOException {
    private int sheetIndex = 0;
    public boolean shouldTruncateOutputFileBeforeExport() {
import org.jkiss.dbeaver.tools.transfer.stream.exporter.StreamExporterAbstract;
import java.awt.Color;
import org.jkiss.dbeaver.model.DBUtils;
import java.text.SimpleDateFormat;
            return CellType.STRING;
                new XSSFWorkbook(
            for (;;) {
            FontStyleProp.BOLD);
    private enum AppendStrategy {
        wsh.incRow();
        }
        worksheets = new HashMap<>(1);
    private boolean exportSql = false;
                    } else {
            return;
            sheet.untrackAllColumnsForAutoSizing();
        splitByCol = CommonUtils.toInt(properties.get(PROP_SPLIT_BYCOL), 0);
            CommonUtils.toString(properties.get(PROP_HEADER_FONT), FontStyleProp.BOLD.name()),
        return worksheet;
            for (int i = 0; i < columns.length; i++) {

     * A reimplementation of {@link org.eclipse.jface.resource.StringConverter#asRGB(String)}.
        FontStyleProp fontStyle = CommonUtils.valueOf(
                    sheet.setColumnWidth(i, MINIMUM_LENGTH);
        boolTrue = CommonUtils.toString(properties.get(PROP_TRUESTRING), Boolean.TRUE.toString());

                    log.error("Dispose error", e);
        return properties;
            }
        case STRING:
/**
        exportSql = CommonUtils.getBoolean(properties.get(PROP_EXPORT_SQL), false);
    private static final String PROP_BORDER = "border";
        Row rowX = wsh.getSh().createRow(wsh.getCurrentRow());
    public void exportFooter(DBRProgressMonitor monitor) throws DBException, IOException {
        final Sheet sheet;
                String description = columns[i].getDescription();

    }
                        int sqlRownum = 0;
                        }
    private static final String PROP_TRUESTRING = "trueString";
            }
        CREATE_NEW_SHEETS("create new sheets"),
        properties.put(DataExporterXLSX.PROP_FALSESTRING, "false");
        switch (column.getDataKind()) {

        }


        }
    private static final String PROP_ROWNUMBER = "rownumber";
import org.jkiss.code.Nullable;
    }
    private static final int MINIMUM_LENGTH = 256 * 10;
        try {
            this.value = value;

        splitByRowCount = CommonUtils.toInt(properties.get(PROP_SPLIT_BYROWCOUNT), EXCEL2007MAXROWS);
        }
        properties.put(DataExporterXLSX.PROP_TRIM_STRINGS, "false");
package org.jkiss.dbeaver.data.office.export;
        headerFormat = HeaderFormat.of(CommonUtils.toString(properties.get(PROP_HEADER)));
                    return strategy;
            return this == DESCRIPTION || this == BOTH;
    private static final String PROP_DATE_FORMAT = "dateFormat";

        sh.trackAllColumnsForAutoSizing();

            if (bindingsOk) {
                final DBSEntity sourceEntity = GeneralUtils.adapt(getSite().getSource(), DBSEntity.class);
     */
                            Row row = sh.createRow(sqlRownum);
                if (CommonUtils.isNotEmpty(description)) {
    private SXSSFWorkbook wb;
 *
    private DBDAttributeBinding[] columns;
                worksheets.put(w.getColumnVal(), w);
    private static final int EXCEL_MAX_CELL_CHARACTERS = 32767; // Total number of characters that a cell can contain - 32,767 characters
        }
        }
        rowNumber = CommonUtils.getBoolean(properties.get(PROP_ROWNUMBER), false);


    }
        sh.untrackAllColumnsForAutoSizing();

    @Override
            return CellType.BLANK;
            Cell cell = rowX.createCell(startCol, CellType.NUMERIC);
                        writeCellValue(cell, cs.getContentReader());
                    sh = null;
    private static final int EXCEL2007MAXROWS = 1048575;
    @Override
                if (booleRedefined) {
                        cell.setCellValue(BINARY_FIXED);
                }
        }
            if (DBUtils.isNullValue(row[i])) {
            throw new DBException("Error processing header", e);
            DBDAttributeBinding column = columns[i];
        try {
    public static Map<String, Object> getDefaultProperties() {
    private static final Date EXCEL_MIN_DATE = new GregorianCalendar(1900, Calendar.JANUARY, 1).getTime();
    private static Color asColor(@NotNull String value) {
            for (DBDAttributeBinding column : columns) {
                    if (splitSqlText) {
        HeaderFormat(@NotNull String value) {
                            Cell newcell = row.createCell(0);

            } else {
import org.apache.poi.ss.usermodel.*;


                cell.setCellValue(getPreparedString(stringValue));
                }
public class DataExporterXLSX extends StreamExporterAbstract implements IAppendableDataExporter {
            return this == LABEL || this == BOTH;
    @Override
    private boolean rowNumber = false;
    }
        properties.put(DataExporterXLSX.PROP_SPLIT_BYCOL, 0);
    @Override
    private AppendStrategy appendStrategy = AppendStrategy.CREATE_NEW_SHEETS;
            // We must truncate long strings from our side, otherwise we get the error of the insertion from the apache.poi library
        appendStrategy = AppendStrategy.of(CommonUtils.toString(properties.get(PROP_APPEND_STRATEGY)));

    private boolean booleRedefined;
        }
            Cell cell = rowX.createCell(i + startCol, getCellType(column));
            startCol++;
    private XSSFCellStyle styleDate;


        } catch (Exception e) {
            SXSSFSheet sheet = wb.getSheetAt(sheetIndex);
            for (int i = 0, columnsSize = columns.length; i < columnsSize; i++) {
        Worksheet wsh = getWsh(resultSet, row);
        }
                if (strategy.value.equals(value)) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
            cell.setCellValue(getPreparedString(sb.toString()));
        int startCol = 0;
        return style;
                }
    @NotNull
                }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        public static AppendStrategy of(@NotNull String value) {
                        for (String s : sqlText) {
import org.jkiss.dbeaver.tools.transfer.stream.IStreamDataExporterSite;
            worksheets.put(w.getColumnVal(), w);
                try {

                    cell.setCellValue("");
        columns = getSite().getAttributes();
            log.warn("The string value of the row " + (rowCount + 1) + " was more maximum length, so it was cropped.");
        return new Color(r, g, b);
            this.value = value;
                cell.setCellValue(colName);
    }
                    DBExecUtils.bindAttributes(resultSet.getSession(), sourceEntity, resultSet, bindings, null);
                wb.close();
        int startCol = rowNumber ? 1 : 0;
    }
import org.jkiss.dbeaver.DBException;
        }
        }
                                wb.getSpreadsheetVersion().getMaxRows());
 * Export XLSX with Apache POI
    private enum HeaderFormat {

        } catch (IOException e) {



                fontBold.setUnderline((byte) 3);
                }

                break;
    private int splitByRowCount = EXCEL2007MAXROWS;
            } else {
                wb.dispose();
            // Do it here because we can have a few sheets

        final Path file = site.getOutputFile();
            sheet = wb.getSheetAt(sheetIndex++);
        final Worksheet worksheet;
        Map<String, Object> properties = new HashMap<>();
        public static HeaderFormat of(@NotNull String value) {
    private static final String PROP_EXPORT_SQL = "exportSql";
        throws DBException, IOException {
        }
}
        printHeader(resultSet, worksheet);
        if (headerFormat.hasLabel()) {

        default:
        if (decorator != null) {
                if (sheet.getColumnWidth(i) < MINIMUM_LENGTH) {
                    break;
                    SimpleDateFormat fmt = new SimpleDateFormat(dateFormatString);
        style.setBorderLeft(border);
                wb.write(getSite().getOutputStream());
                if (dateVal.before(EXCEL_MIN_DATE)) {
            HSSFFormulaEvaluator.evaluateAllFormulaCells(wb);
import org.apache.poi.hssf.usermodel.HSSFFormulaEvaluator;
import org.jkiss.dbeaver.model.struct.DBSEntity;
    }
        super.init(site);
    private Worksheet getWsh(DBCResultSet resultSet, Object[] row) throws DBException {
                    sh.autoSizeColumn(i);
        styleDate.setBorderBottom(border);
        properties.put(DataExporterXLSX.PROP_SPLIT_BYROWCOUNT, EXCEL2007MAXROWS);
        rowCount++;
    public void dispose() {

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                }
        styleDate.setBorderLeft(border);
    }
                    bindings[i] = (DBDAttributeBindingMeta) columns[i];
                DBDContent content = (DBDContent) row[i];
        if (appendStrategy == AppendStrategy.USE_EXISTING_SHEETS && sheetIndex < wb.getNumberOfSheets()) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        case BOOLEAN:

                    } else if (ContentUtils.isTextContent(content)) {
            case UNDERLINE:
                descCell.setCellValue(CommonUtils.notEmpty(description));
import org.jkiss.dbeaver.utils.GeneralUtils;
        styleDate.setDataFormat(wb.getCreationHelper().createDataFormat().getFormat(dateFormatString));
        styleDate = (XSSFCellStyle) wb.createCellStyle();
 * See the License for the specific language governing permissions and
        styleHeader.setBorderBottom(border);
        styleHeader = (XSSFCellStyle) wb.createCellStyle();
            }
        super.dispose();
            cellValue = CommonUtils.truncateString(cellValue, EXCEL_MAX_CELL_CHARACTERS);
            sh.flushRows();
            }
        DESCRIPTION("description"),

            Row row = sh.createRow(wsh.getCurrentRow());
                sheet = wb.createSheet();
        properties.put(DataExporterXLSX.PROP_NULL_STRING, null);
import org.jkiss.dbeaver.tools.transfer.stream.IAppendableDataExporter;
        try {
        properties.put(DataExporterXLSX.PROP_SPLIT_SQLTEXT, false);
                } finally {

        style.setBorderRight(border);
import org.jkiss.dbeaver.Log;

                if (count <= 0) {

        return cellValue;
        if (headerFormat.hasDescription()) {
        if (file == null || !Files.exists(file)) {
    private static final Log log = Log.getLog(DataExporterXLSX.class);
        }
    @Override
        }
        }
    private String nullString;
                    cell.setCellStyle(styleDate);

                    cell.setCellValue(text);
                break;
        XSSFFont fontBold = (XSSFFont) wb.createFont();
                    cell.setCellValue(nullString);
            worksheet = new Worksheet(sheet, colValue, 0);
        @NotNull
            return CellType.BOOLEAN;
                DBDAttributeBinding column = columns[i];
                    DBDContentStorage cs = content.getContents(session.getProgressMonitor());
        this.rowCount = 0;

                }
                    break;
    private static final String PROP_SPLIT_SQLTEXT = "splitSqlText";
    private CellStyle getCellStyle(@NotNull DBDAttributeBinding attribute, int row) {


    @Override
            worksheets.clear();
                } else {
                cell.setCellStyle(styleHeader);
                Cell cell = row.createCell(i + startCol, CellType.STRING);

        for (int i = 0; i < row.length; i++) {
            for (HeaderFormat format : values()) {
            DBDAttributeBindingMeta[] bindings = new DBDAttributeBindingMeta[columns.length];

            return CellType.NUMERIC;
                    }
        if (rowCount == 0) {
import org.apache.poi.xssf.streaming.SXSSFSheet;
            sheet.trackAllColumnsForAutoSizing();

                final XSSFCellStyle style = (XSSFCellStyle) this.style.copy();
            wb = new SXSSFWorkbook(
        final int b = Integer.parseInt(tokenizer.nextToken().trim());
            for (AppendStrategy strategy : values()) {
 * limitations under the License.
import org.apache.poi.xssf.usermodel.*;
        properties.put(DataExporterXLSX.PROP_APPEND_STRATEGY, AppendStrategy.CREATE_NEW_SHEETS.value);
    private static final String PROP_NULL_STRING = "nullString";
        }
    private String boolTrue = "true";
        } catch (IOException e) {
            w = createSheet(resultSet, colValue);
        case NUMERIC:
    private static final String PROP_SPLIT_BYCOL = "splitByColNum";

                    break;

        wb = null;
    private static final String DEFAULT_DATE_FORMAT = "MM/dd/yy";
            }

            }
                }
        private final String value;
            return;
            BorderStyle.class,
                        cell.setCellValue(DBConstants.NULL_VALUE_LABEL);
        properties.put(DataExporterXLSX.PROP_ROWNUMBER, false);
import org.jkiss.dbeaver.model.exec.DBCResultSet;
                String colName = column.getLabel();
    @NotNull
        Object nullStringProp = properties.get(PROP_NULL_STRING);
        }
            }
                    content.release();

                }
    /**

        if (!Boolean.TRUE.toString().equals(boolTrue) || !Boolean.FALSE.toString().equals(boolFalse)) {
    }
        final StringTokenizer tokenizer = new StringTokenizer(value, ",");
        }
        properties.put(DataExporterXLSX.PROP_TRUESTRING, "true");
import org.jkiss.dbeaver.tools.transfer.DTUtils;
            for (Worksheet w : worksheets.values()) {
    private Worksheet createSheet(DBCResultSet resultSet, Object colValue) throws DBException {
        if (appendStrategy == AppendStrategy.USE_EXISTING_SHEETS && getPhysicalNumberOfRows(sh) > 0) {
    }
                fontBold.setStrikeout(true);
            } else if (row[i] instanceof Number) {
        @NotNull
            wb = new SXSSFWorkbook(ROW_WINDOW);
            } else if (row[i] instanceof Boolean) {
    @Override
        try {
            } else if (row[i] instanceof DBDContent) {
import java.nio.file.Path;
        if (columns != null && columns.length > 0) {
    }
        properties.put(DataExporterXLSX.PROP_HEADER_FONT, "BOLD");
            booleRedefined = true;
                if (!CommonUtils.isEmpty(nullString)) {
    }
        }
 */
                try {
            }
        return wb.getXSSFWorkbook().getSheetAt(wb.getSheetIndex(sheet)).getPhysicalNumberOfRows();
        properties.put(DataExporterXLSX.PROP_EXPORT_SQL, false);
    private String dateFormatString;

            BorderStyle.THIN);
        BOTH("both"),
            for (int i = 0, columnsSize = columns.length; i < columnsSize; i++) {
                descCell.setCellStyle(styleHeader);
        properties.put(DataExporterXLSX.PROP_BORDER, "THIN");
                        Row row = sh.createRow(0);
    private String exportTableName = WorksheetUtils.DEFAULT_SHEET_NAME;

    private void printHeader(DBCResultSet resultSet, Worksheet wsh) throws DBException {
                if (columns[i] instanceof DBDAttributeBindingMeta) {

                        String[] sqlText = getSite().getSource().getName().split("\n",
        Worksheet w = worksheets.get(colValue);
    private static final String BINARY_FIXED = "[BINARY]";
        Object colValue = ((splitByCol <= 0) || (splitByCol >= columns.length)) ? "" : row[splitByCol];
            return;
                break;


 *
            cell.setCellStyle(getCellStyle(column, rowCount));
                if (!CommonUtils.isEmpty(column.getDescription())) {
    private boolean splitSqlText = false;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
            }
        }

            } else if (row[i] instanceof Date dateVal) {
        BorderStyle border = CommonUtils.valueOf(
    private static final String PROP_USE_DEFAULT_SPREADSHEET_NAMES = "useDefaultSpreadsheetNames";
                if (sourceEntity != null) {
            if (CommonUtils.toBoolean(getSite().getProperties().get(PROP_USE_DEFAULT_SPREADSHEET_NAMES), true)) {
                style.setFillForegroundColor(new XSSFColor(asColor(bg), new DefaultIndexedColorMap()));

        }
                break;


                sb.append(buffer, 0, count);

            cell.setCellValue(String.valueOf(wsh.getCurrentRow()));
            case ITALIC:

import java.util.*;
        }
            Row descRow = sh.createRow(wsh.getCurrentRow());
                }

            DBSEntity srcEntity = DBUtils.getAdapter(DBSEntity.class, getSite().getSource());
import org.jkiss.utils.CommonUtils;
        public boolean hasDescription() {
                    }
            }
        style.setBorderTop(border);
        if (headerFormat.hasDescription()) {
        return w;
            throw new DBException("Error opening workbook", e);
    private int getPhysicalNumberOfRows(@NotNull Sheet sheet) {
            worksheet = new Worksheet(sheet, colValue, getPhysicalNumberOfRows(sheet));
                    Files.newInputStream(file)));
 *
                cell.setCellValue(((Number) row[i]).doubleValue());



import java.nio.file.Files;
        Map<String, Object> properties = site.getProperties();
                }
        public boolean hasLabel() {
                fontBold.setItalic(true);
        if (rowNumber) {
        }
        }


        if (wb != null && sheetIndex > 0) { // if any sheets are present, then sheetIndex > 0
        boolean hasDescription = false;
        if (!CommonUtils.isEmpty(worksheets)) {

                WorksheetUtils.DEFAULT_SHEET_NAME);

    private HeaderFormat headerFormat = HeaderFormat.LABEL;
            exportRow(null, null, new Object[columns.length]);
    public void exportHeader(DBCSession session) throws DBException {
        this.dateFormatString = CommonUtils.toString(properties.get(PROP_DATE_FORMAT), DEFAULT_DATE_FORMAT);


    }
                w.dispose();
                sheet.autoSizeColumn(i);
        styleDate.setBorderTop(border);
        final int g = Integer.parseInt(tokenizer.nextToken().trim());
                            newcell.setCellValue(s);


        switch (fontStyle) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        USE_EXISTING_SHEETS("use existing sheets");
        style = (XSSFCellStyle) wb.createCellStyle();
            }
        boolFalse = CommonUtils.toString(properties.get(PROP_FALSESTRING), Boolean.FALSE.toString());
    }

        NONE("none");


        }
                Cell descCell = descRow.createCell(i + startCol, CellType.STRING);
            if (wb != null) {
                    cell.setCellValue((Boolean) row[i] ? boolTrue : boolFalse);

                break;
import org.jkiss.code.NotNull;
            boolean bindingsOk = true;
 */
                            sqlRownum++;
    private HashMap<Object, Worksheet> worksheets;
            FontStyleProp.class,
        styleHeader.setBorderLeft(border);

                int count = reader.read(buffer);

        }
import org.jkiss.dbeaver.model.DBConstants;
        trimStrings = CommonUtils.getBoolean(properties.get(PROP_TRIM_STRINGS), false);


/*
        } finally {

                return style;
            log.error("Dispose error", e);
        styleDate.setBorderRight(border);
            cellValue = cellValue.trim();
    }
        } else {
 * you may not use this file except in compliance with the License.
                    cell.setCellValue(dateVal);
 * Licensed under the Apache License, Version 2.0 (the "License");

                    cell.setCellValue((Boolean) row[i]);
            ContentUtils.close(reader);
        properties.put(DataExporterXLSX.PROP_HEADER, HeaderFormat.LABEL.value);
     * Let's keep it here until it will be required in other places too

        properties.put(DataExporterXLSX.PROP_USE_DEFAULT_SPREADSHEET_NAMES, true);
            wsh.incRow();
        }
