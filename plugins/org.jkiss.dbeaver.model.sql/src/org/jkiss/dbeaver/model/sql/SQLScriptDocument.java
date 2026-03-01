 *
        throwReadOnlyError();
        throw new IllegalStateException("Document is read-only");
    public String get() {
        return null;
    @Override
    }
    public TPTextRegion getLineInformationOfOffset(int offset) {
    @Override
    @Override
    }

        return 0;
    @Override
    }
 * Licensed under the Apache License, Version 2.0 (the "License");

    public char getChar(int offset) {

 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 * Unless required by applicable law or agreed to in writing, software
        return text.substring(offset, length);
}
    @NotNull
    public int getNumberOfLines() {
    public void replace(int offset, int length, @NotNull String text) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

/**
 *
/*

        return text.length();

package org.jkiss.dbeaver.model.sql;


    @Override
    private static void throwReadOnlyError() {
    public String[] getLegalLineDelimiters() {
        return text;
    public int getLength() {
    public void set(@NotNull String text) {


    }

    }
    public SQLScriptDocument(String text) {
import org.jkiss.code.NotNull;
    }
    @NotNull
    @Override


    @NotNull
 * you may not use this file except in compliance with the License.
    public int getLineOffset(int line) {
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.text.TPTextDocument;
    }
    @Override

    public int getLineOfOffset(int offset) {
    }

    private final String text;
    @Override
        return new String[0];
    }
    @Override
    @Override
    public TPTextRegion getLineInformation(int line) {
        return text.charAt(offset);
        return 0;
    @NotNull
*/

 */
 * See the License for the specific language governing permissions and
    @NotNull
 * limitations under the License.
    }
import org.jkiss.dbeaver.model.text.TPTextRegion;
    @Override
        this.text = text;
        throwReadOnlyError();
    @NotNull
    }
    @Override
        return null;
 * DBeaver - Universal Database Manager
 * SQLScriptDocument
 * Copyright (C) 2010-2025 DBeaver Corp and others

 *
 * distributed under the License is distributed on an "AS IS" BASIS,



    }
    public String getLineDelimiter(int line) {
    }
        return 0;
    @Override
        return null;

    public String get(int offset, int length) {
public class SQLScriptDocument implements TPTextDocument {
