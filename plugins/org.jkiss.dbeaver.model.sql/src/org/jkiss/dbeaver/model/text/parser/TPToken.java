 * limitations under the License.
     * @return <code>true</code>if this token is not undefined, not a whitespace, and not EOF
    boolean isNewline();
 *
package org.jkiss.dbeaver.model.text.parser;
     *
}
 * A token to be returned by a rule.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     */
public interface TPToken {

     *
    /**
     *
 * you may not use this file except in compliance with the License.
     */

     * Return whether this token is neither undefined, nor whitespace, nor EOF.
    boolean isEOF();

     * @return <code>true</code>if this token is undefined

 * See the License for the specific language governing permissions and
    boolean isOther();
     *
 * DBeaver - Universal Database Manager
     * Return whether this token represents End Of File.
 *
     */

     * @return the data attached to this token.
    /**
     * Return whether this token represents a whitespace.
/**

    boolean isWhitespace();
    /**
     */
     * @return <code>true</code>if this token represents a whitespace
     * Return whether this token represents a newline separator.
 * Copyright (C) 2010-2025 DBeaver Corp and others
 */
     * Return whether this token is undefined.
 * Licensed under the Apache License, Version 2.0 (the "License");
     *
    boolean isUndefined();
    /**

     */
 *     http://www.apache.org/licenses/LICENSE-2.0
    /**
     */
     * @return <code>true</code>if this token represents EOF
    Object getData();
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
    /**
/*

     *
 *
     * Return a data attached to this token. The semantics of this data kept undefined by this interface.

     * @return <code>true</code>if this token represents a newline separator
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
