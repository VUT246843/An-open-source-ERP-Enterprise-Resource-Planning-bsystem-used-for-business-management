    private static final int T_NEWLINE   = 3;
     */
 *
    public boolean isUndefined() {
    public static final TPToken WHITESPACE = new TPTokenAbstract(T_WHITESPACE);
 *

 *

    @Override
 */
    }
     * The type of this token
        return type == T_WHITESPACE || type == T_NEWLINE;

    public static final TPToken UNDEFINED = new TPTokenAbstract(T_UNDEFINED);
    }
        return (type == T_UNDEFINED);
 * Copyright (C) 2010-2025 DBeaver Corp and others
     * Creates a new token according to the given specification which does not

    public static final TPToken NEWLINE = new TPTokenAbstract(T_NEWLINE);

        this.type = type;
        return (type == T_EOF);
        this.data = data;
    private static final int T_UNDEFINED    = 0;
    public boolean isWhitespace() {
    @Override
    }
    public DATA getData() {

    protected TPTokenAbstract(int type, DATA data) {
    /**
    @Override

    /**
    @Override
 * Unless required by applicable law or agreed to in writing, software
    private DATA data;
    static final int T_OTHER        = 4;
    private int type;
    }

    public static final TPToken EOF = new TPTokenAbstract(T_EOF);
    public boolean isNewline() {
 * Licensed under the Apache License, Version 2.0 (the "License");
    public boolean isOther() {
 * you may not use this file except in compliance with the License.
    }
    private static final int T_WHITESPACE   = 2;
        return type == T_NEWLINE;
 * See the License for the specific language governing permissions and
    @Override
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
/*
    private static final int T_EOF          = 1;
     */
    public boolean isEOF() {
    }
 */

    }
    private TPTokenAbstract(int type) {
    }
/**
package org.jkiss.dbeaver.model.text.parser;

 * distributed under the License is distributed on an "AS IS" BASIS,
}
     * have any data attached to it.
    @Override
        this.type = type;
 * Standard implementation of <code>TPToken</code>.


public class TPTokenAbstract<DATA> implements TPToken {
 * limitations under the License.
        return (type == T_OTHER);

        return data;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
