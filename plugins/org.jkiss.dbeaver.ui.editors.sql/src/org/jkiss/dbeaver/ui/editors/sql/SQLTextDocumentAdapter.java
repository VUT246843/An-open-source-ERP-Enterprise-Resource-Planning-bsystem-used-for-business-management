            log.debug(e);
    }
        }
        } catch (BadLocationException e) {
        try {
 * You may obtain a copy of the License at


 * distributed under the License is distributed on an "AS IS" BASIS,
    public TPTextRegion getLineInformationOfOffset(int offset) {
    @Override

    @Override
/*
    public void set(@NotNull String text) {
    }
    public char getChar(int offset) {
    public void replace(int offset, int length, @NotNull String text) {
            return new TPTextRegion(region.getOffset(), region.getLength());
 *
        } catch (BadLocationException e) {
    }
        return document.getNumberOfLines();
import org.jkiss.dbeaver.model.text.TPTextDocument;
    @Override
        try {


import org.eclipse.jface.text.IRegion;
public class SQLTextDocumentAdapter implements TPTextDocument {

        }
        }
    @Override
}
    @Override
    @NotNull
    }
            log.debug(e);
 * DBeaver - Universal Database Manager
            log.debug(e);

            return ' ';
        }
    @Override
            return document.getLineOffset(line);
        }
 *
            return document.get(offset, length);
    public String getLineDelimiter(int line) {
    }
            return document.getChar(offset);
    }
    }
            log.debug(e);
 * Unless required by applicable law or agreed to in writing, software
            return new TPTextRegion(0, 0);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        try {
    public int getLineOffset(int line) {
 * limitations under the License.
            document.replace(offset, length, text);

            return document.getLineDelimiter(line);
    }
    @NotNull
    public int getLength() {
        }

    @Override
            return new TPTextRegion(region.getOffset(), region.getLength());
    }
    public String[] getLegalLineDelimiters() {
        }
import org.jkiss.code.NotNull;

 * Script-to-datasource binding type
            IRegion region = document.getLineInformationOfOffset(offset);

        } catch (BadLocationException e) {
        } catch (BadLocationException e) {
        try {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.Log;
            return 0;
        }
/**
    public TPTextRegion getLineInformation(int line) {
            log.debug(e);
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.text.TPTextRegion;
        try {
    public SQLTextDocumentAdapter(IDocument document) {

import org.eclipse.jface.text.IDocument;

            return "";
        } catch (BadLocationException e) {
            return new TPTextRegion(0, 0);
    @NotNull
import org.eclipse.jface.text.BadLocationException;
        this.document = document;
        return document.getLength();
    @Override
    public int getLineOfOffset(int offset) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        return document.getLegalLineDelimiters();
 * See the License for the specific language governing permissions and
    }

 * you may not use this file except in compliance with the License.
            return "\n";
 */
            return 0;
        try {
    @NotNull
        } catch (BadLocationException e) {
    private final static Log log = Log.getLog(SQLTextDocumentAdapter.class);
    public String get(int offset, int length) {
    @Override
    @Override
            log.debug(e);
    @Override
    @NotNull
            IRegion region = document.getLineInformation(line);
    }
        try {
        return document.get();
    @Override
    public int getNumberOfLines() {
        } catch (BadLocationException e) {
    }
    public String get() {
            log.debug(e);

        document.set(text);

        } catch (BadLocationException e) {
        try {
    @NotNull
    }
    @Override
    private final IDocument document;
            return document.getLineOfOffset(offset);
    }
package org.jkiss.dbeaver.ui.editors.sql;
 */
            log.debug(e);

