 * distributed under the License is distributed on an "AS IS" BASIS,

    public void setColumnDelimiter(String columnDelimiter) {
        this.rowDelimiter = rowDelimiter;
    private boolean copyHeader;
    private boolean forceQuotes;
    }

    public void setFormat(DBDDisplayFormat format) {
    public ResultSetCopySettings(
 *
        return quoteCells;
 * DBeaver - Universal Database Manager
        return quoteString;
    public boolean isCopyHeader() {

 * limitations under the License.
    }


    }
            boolean quoteCells,
            boolean copyHeader,

 * Licensed under the Apache License, Version 2.0 (the "License");
/*
    private String columnDelimiter;
    private boolean copyHTML;

    public String getColumnDelimiter() {
        this.copyHeader = copyHeader;



    }
        this.cut = cut;
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
    public boolean isQuoteCells() {
        return cut;
    }
 */
        return forceQuotes;
    public void setCut(boolean cut) {
    public boolean isCopyHTML() {

 * Copy settings
    }
    public void setCopyRowNumbers(boolean copyRowNumbers) {

        this.columnDelimiter = columnDelimiter;

        return copyHTML;
 *     http://www.apache.org/licenses/LICENSE-2.0
            boolean forceQuotes,

public class ResultSetCopySettings {
        this.columnDelimiter = columnDelimiter;
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ui.controls.resultset;

    }
        this.forceQuotes = forceQuotes;
}
            String quoteString,
            DBDDisplayFormat format) {
    private String rowDelimiter;
 *

        return rowDelimiter;
    }
    public void setCopyHeader(boolean copyHeader) {
    public void setRowDelimiter(String rowDelimiter) {
    }
        this.quoteCells = quoteCells;
 *

        this.copyRowNumbers = copyRowNumbers;
    private DBDDisplayFormat format;
    }
    public void setCopyHTML(boolean copyHTML) {
        this.quoteCells = quoteCells;
    }
 * you may not use this file except in compliance with the License.
        this.copyRowNumbers = copyRowNumbers;
    }
        this.forceQuotes = forceQuotes;
        return copyHeader;

        return columnDelimiter;


    }
    }
    public boolean isForceQuotes() {
    public boolean isCopyRowNumbers() {
    public DBDDisplayFormat getFormat() {
    private boolean cut;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.rowDelimiter = rowDelimiter;
    }
        this.cut = cut;
    private String quoteString;
        this.quoteString = quoteString == null ? "\"" : quoteString;

 * See the License for the specific language governing permissions and
    private boolean quoteCells;
    }
    }

 */
    public void setForceQuotes(boolean forceQuotes) {
/**
    }
    private boolean copyRowNumbers;
 * You may obtain a copy of the License at
    public void setQuoteString(String quoteString) {
    }
    public ResultSetCopySettings() {
            String rowDelimiter,
        return copyRowNumbers;

        this.copyHTML = copyHTML;
        return format;
    public void setQuoteCells(boolean quoteCells) {
        this.format = format;

            boolean cut,
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
        this.copyHeader = copyHeader;
            String columnDelimiter,
    public String getQuoteString() {
            boolean copyRowNumbers,
    public boolean isCut() {
        this.format = format;
        this.quoteString = quoteString;
    public String getRowDelimiter() {
    }
    }
