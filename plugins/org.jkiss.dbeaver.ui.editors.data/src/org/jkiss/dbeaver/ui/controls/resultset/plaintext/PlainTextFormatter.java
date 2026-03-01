            if (i > 0 || startOffset != 0) output.append('+');
            char c = displayString.charAt(i);
    private void loadPrefs(@NotNull DBPPreferenceStore prefs) {
            displayFormat = DBDDisplayFormat.NATIVE;
            output.append("-".repeat(Math.max(0, startOffset - 1)));
                if (extraSpaces) {
    }
        // Print divider between header and data
    public int getStartOffset() {
        List<DBDAttributeBinding> attrs = model.getVisibleAttributes();
                if (delimTrailing) {
            // Print divider before header
        this.printSeparator(grid, colWidths);
                }
                String displayString = this.getCellString(model, attr, row, displayFormat);
        }

        }

                }
    public void printRecord(StringBuilder grid, ResultSetModel model, ResultSetRow currentRow) {

            DBDAttributeBinding attr = attrs.get(i);
                grid.append(indent).append(name).append(indent).append(" ".repeat(Math.max(0, nameWidth - name.length())));
            }
                startOffset = getStringWidth(String.valueOf(allRows.size() + 1)) + extraSpacesNum + 1;
        }
                valueWidth = Math.max(valueWidth, values[i].length());
            if (extraSpaces) {

        if (colWidths == null) {
                case 255:
            for (int i = 0; i < attrs.size(); i++) {
                }
            for (int i = 0; i < attrs.size(); i++) {

                DBPDataKind dataKind = attr.getDataKind();
                    grid.append("|");
            DBUtils.isNullValue(cellValue))
        grid.append(indent).append("|").append(indent).append("Value").append(" ".repeat(valueWidth - 5));
        output.append('\n');
                grid.append(" ");
        if (delimTop) {
    public String getCellString(ResultSetModel model, DBDAttributeBinding attr, ResultSetRow row, DBDDisplayFormat displayFormat) {
 * DBeaver - Universal Database Manager
        if (str != null && str.length() > 0) {
    // returns number of rows
    private boolean delimBottom;
                    // Right justify value
        delimTrailing = prefs.getBoolean(ResultSetPreferences.RESULT_TEXT_DELIMITER_TRAILING);
    private DBDDisplayFormat displayFormat;
                case 0:
import java.util.List;

                for (ResultSetRow row : allRows) {
                if (delimLeading) {
            output.append("-".repeat(Math.max(0, columnWidth[i])));
    private static String getAttributeName(DBDAttributeBinding attr) {
        String displayString = attr.getValueHandler().getValueDisplayString(attr, cellValue, displayFormat);
    private final StringBuilder fixCellStringBuffer = new StringBuilder();
            if (delimTrailing) {
                grid.append("|");
 * Unless required by applicable law or agreed to in writing, software
                }
            grid.append("|");
                }
        if (delimLeading) {
import org.jkiss.dbeaver.model.DBUtils;
                char c = str.charAt(i);
        if (currentRow != null) {
        }

 * you may not use this file except in compliance with the License.
        grid.append(indent).append("Name").append(" ".repeat(nameWidth - 4));
                String displayString = this.getCellString(model, attr, currentRow, displayFormat);
        }

                grid.append("|");
 * limitations under the License.
        for (int i = 0; i < columnWidth.length; i++) {
                grid.append(indent).append(values[i]).append(" ".repeat(Math.max(0, valueWidth - values[i].length())));
        int valueWidth = 5;
            }
    }
                    grid.append(" ");
                }
            displayString = DBConstants.NULL_VALUE_LABEL;
    public void printSeparator(StringBuilder output, int[] columnWidth) {
            // Print divider after record
                default:
                }
                if (colWidths[i] > maxColumnSize) {
        {
    private int maxColumnSize;
                    String displayString = this.getCellString(model, attr, row, displayFormat);
        return width;
        maxColumnSize = prefs.getInt(ResultSetPreferences.RESULT_TEXT_MAX_COLUMN_SIZE);


            for (int k = 0; k < attrs.size(); k++) {
                    colWidths[i] = Math.max(colWidths[i], DBConstants.NULL_VALUE_LABEL.length());
                if (extraSpaces) {

        if (delimTrailing) {
        }
                }
        int extraSpacesNum = extraSpaces ? 2 : 0;
    private boolean extraSpaces;
                    colWidths[i] = maxColumnSize;
        }

            grid.append("\n");
        if (delimTrailing) {
                    width += prefs.getInt(ResultSetPreferences.RESULT_TEXT_TAB_SIZE);
                    c = CommonUtils.PARAGRAPH_CHAR;
    }
            // Calculate column widths
            // Print divider before header

                if (c == '\t') {
                startOffset = 0;
    }
    private int getStringWidth(String str) {
public class PlainTextFormatter {
    private final DBPPreferenceStore prefs;
            DBDAttributeBinding attr = attrs.get(i);
        if (cellValue instanceof Number && prefs.getBoolean(ModelPreferences.RESULT_NATIVE_NUMERIC_FORMAT)) {
                    break;
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
                colWidths[i] = getAttributeName(attr).length() + extraSpacesNum;
 *     http://www.apache.org/licenses/LICENSE-2.0
        extraSpaces = prefs.getBoolean(ResultSetPreferences.RESULT_TEXT_EXTRA_SPACES);
        int width = 0;
 *
    public PlainTextFormatter(@NotNull DBPPreferenceStore prefs) {
        // Print header
/*
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
                    break;
            if (extraSpaces) {
                    break;

package org.jkiss.dbeaver.ui.controls.resultset.plaintext;
                }
        this.prefs = prefs;
            // Values
                values[i] = displayString;
        }
 * See the License for the specific language governing permissions and
            }
        } else {
    }
    private int[] colWidths;
        rightJustifyNumbers = prefs.getBoolean(ResultSetPreferences.RESULT_SET_RIGHT_JUSTIFY_NUMBERS);
            for (int i = 0; i < colWidths.length; i++) {
        List<ResultSetRow> allRows = model.getAllRows();
    }
            }

            switch (c) {
            String attrName = getAttributeName(attr);
            grid.append(" ".repeat(Math.max(0, startOffset - extraSpacesNum - 2)));
 *
            grid.append("|");
                    grid.append("|");
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetRow;
            grid.append("|");
        fixCellStringBuffer.setLength(0);
        if (displayString.isEmpty() &&
        }
            }
            this.printSeparator(grid, colWidths);
                grid.append(" ".repeat(Math.max(0, startOffset - stringWidth - extraSpacesNum - 1)));
        Object cellValue = model.getCellValue(attr, row);
                    grid.append(" ");
            if (!attrs.isEmpty() && lineNumbers) {
        String indent = extraSpaces ? " " : "";
        sb.append("> ").append(name).append("\n");
        showNulls = prefs.getBoolean(ResultSetPreferences.RESULT_TEXT_SHOW_NULLS);
            }

            return ((DBDValueError) cellValue).getErrorTitle();
                grid.append(displayNumber);

            colWidths = new int[attrs.size()];
        delimLeading = prefs.getBoolean(ResultSetPreferences.RESULT_TEXT_DELIMITER_LEADING);
            }
            i++;
        loadPrefs(prefs);
                if (k > 0 || startOffset != 0) {

        }
            for (int i = 0; i < str.length(); i++) {
            }
        grid.append("\n");
        for (int i = 0; i < attrs.size(); i++) {
        if (startOffset != 0) {
                case '\r':
    public void printQueryName(StringBuilder sb, String name) {
            }
        }
            showNulls &&
        extraSpaces = prefs.getBoolean(ResultSetPreferences.RESULT_TEXT_EXTRA_SPACES);

        }
        delimBottom = prefs.getBoolean(ResultSetPreferences.RESULT_TEXT_DELIMITER_BOTTOM);
        final int extraSpacesNum = extraSpaces ? 2 : 0;
            grid.append("|");
        return allRows.size();
            }
        grid.append("\n");
                    grid.append(" ");
                    colWidths[i] = Math.max(colWidths[i], getStringWidth(displayString) + extraSpacesNum);
            grid.append(attrName).append(" ".repeat(Math.max(0, colWidths[i] - attrName.length() - extraSpacesNum)));
                grid.append("\n");
        }
        for (ResultSetRow row : allRows) {

            }

            grid.append("#");
    private boolean rightJustifyNumbers;
        }
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    grid.append("|");

        if (delimBottom) {
        if (lineNumbers && attrs.size() != 0) {
        // Header
            printSeparator(grid, colWidths);
                grid.append(indent);

        if (CommonUtils.isEmpty(attr.getLabel())) {
        for (int i = 0; i < displayString.length(); i++) {
            if (delimLeading) {
                    grid.append(" ");
                    grid.append(" ".repeat(Math.max(0, colWidths[k] - stringWidth - extraSpacesNum))).append(displayString);
        return fixCellStringBuffer.toString();
        // Calculate column widths
        grid.append(indent);
                DBDAttributeBinding attr = attrs.get(k);
    public int[] getColWidths() {
        if (delimTrailing) {
            if (lineNumbers) {
        return colWidths;
        if (delimTop) {
            nameWidth = Math.max(nameWidth, getAttributeName(attr).length());
        lineNumbers = prefs.getBoolean(ResultSetPreferences.RESULT_TEXT_LINE_NUMBER);
            if (extraSpaces) {
            return attr.getName();
        int nameWidth = 4;
                case '\n':

        }
        }
                c = ' ';

        // Print rows
            return attr.getLabel();
        if (delimBottom) {
import org.jkiss.dbeaver.model.DBConstants;
        delimTop = prefs.getBoolean(ResultSetPreferences.RESULT_TEXT_DELIMITER_TOP);
        grid.setLength(grid.length() - 1); // cut last line feed
import org.jkiss.dbeaver.ModelPreferences;
                    continue;
            if (extraSpaces) {
        grid.setLength(grid.length() - 1); // cut last line feed

import org.jkiss.dbeaver.model.impl.data.DBDValueError;
            }
        // Print divider

            }
import org.jkiss.utils.CommonUtils;
    }
            if (c < ' '/* || (c > 127 && c < 255)*/) {
                }
        }
                String name = getAttributeName(attr);
                    width++;
        return startOffset;
                    displayString = CommonUtils.truncateString(displayString, colWidths[k]);
    private boolean delimLeading;
        if (delimLeading) {
                grid.append(" ");

        }
                DBDAttributeBinding attr = attrs.get(i);

        if (delimLeading) {
                    || (dataKind == DBPDataKind.DATETIME && rightJustifyDateTime)) {
        }
                } else {
            output.append('+');
}
        final int[] colWidths = {nameWidth + extraSpacesNum, valueWidth + extraSpacesNum};
                int stringWidth = getStringWidth(displayString);
            }
    private boolean showNulls;
            } else {
            fixCellStringBuffer.append(c);
    private boolean lineNumbers;
            this.printSeparator(grid, colWidths);

                    c = ' ';
                int stringWidth = getStringWidth(displayNumber);
                if (extraSpaces) {
    private boolean rightJustifyDateTime;
        String[] values = new String[attrs.size()];
                if (showNulls && !attr.isRequired()) {
                    // do nothing
                }

 * Licensed under the Apache License, Version 2.0 (the "License");
            if (currentRow != null) {
                DBDAttributeBinding attr = attrs.get(i);
                grid.append("|");
            }
                if ((dataKind == DBPDataKind.NUMERIC && rightJustifyNumbers)
            if (i  > 0 || startOffset != 0) {
            output.append('+');
                }
                grid.append("|");
 */
import org.jkiss.dbeaver.model.DBPDataKind;
 * You may obtain a copy of the License at
                grid.append(" ");
        rightJustifyDateTime = prefs.getBoolean(ResultSetPreferences.RESULT_SET_RIGHT_JUSTIFY_DATETIME);
                case '\t':
 *
            this.printSeparator(grid, colWidths);
    }
    private boolean delimTop;

import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
        }
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                }
    }
        printSeparator(grid, colWidths);
    }
import org.jkiss.code.NotNull;
    }
    private int startOffset;
                grid.append(" ");
                    grid.append(displayString).append(" ".repeat(Math.max(0, colWidths[k] - stringWidth - extraSpacesNum)));
            }
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetPreferences;
        for (int i = 0; i < attrs.size(); i++) {
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetModel;
                } else {
            // Print divider after rows
        }
        }
        List<DBDAttributeBinding> attrs = model.getVisibleAttributes();
        displayFormat = DBDDisplayFormat.safeValueOf(prefs.getString(ResultSetPreferences.RESULT_TEXT_VALUE_FORMAT));

                if (extraSpaces) {
    public int printGrid(StringBuilder grid, ResultSetModel model) {
        }
                String displayNumber = String.valueOf(i);
                if (displayString.length() >= colWidths[k]) {
    private boolean delimTrailing;

        if (cellValue instanceof DBDValueError) {
        int i = 1;
 * Copyright (C) 2010-2024 DBeaver Corp and others
