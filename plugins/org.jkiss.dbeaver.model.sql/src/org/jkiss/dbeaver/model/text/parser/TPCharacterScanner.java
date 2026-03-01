    int read();
     * @return the column of the character scanner
     *
    int getOffset();
    /**
     */
 * Replica of ICharacterScanner but without jface/swt
    int getColumn();


    /**
    /**
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    /**
     * Returns the next character or EOF if end of file has been reached
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.
 *
     */
}
    /**



 */
 *     http://www.apache.org/licenses/LICENSE-2.0

     */
    void unread();
     * @return the next character or EOF
/*
 * See the License for the specific language governing permissions and
     *
package org.jkiss.dbeaver.model.text.parser;
     * The value returned when this scanner has read EOF.
 *
    int EOF = -1;
 *
    char[][] getLegalLineDelimiters();
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
     * Rewinds the scanner before the last read character.

     * object may not be modified by clients.
     */
     * Provides rules access to the legal line delimiters. The returned
     * Returns the column of the character scanner.
     */

 * you may not use this file except in compliance with the License.
     * @return the legal line delimiters
public interface TPCharacterScanner {
 * You may obtain a copy of the License at
     *
 */
/**
 * Licensed under the Apache License, Version 2.0 (the "License");
