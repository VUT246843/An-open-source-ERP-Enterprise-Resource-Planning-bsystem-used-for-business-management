        } else {
 * you may not use this file except in compliance with the License.
            } else {
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.sql.parser.TokenEntry;
                return 0;
            if (second.getTokenType() == null) {
    protected int compareByStrings(@NotNull TokenEntry first, @NotNull TokenEntry second) {
                return -1;
        } else {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.

            } else {
 *
package org.jkiss.dbeaver.model.sql.parser.tokens.predicates;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            } else {
        }
                return 1;
        if (first.getTokenType() == null) {
/*

                return first.getTokenType().compareTo(second.getTokenType());
}
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
            }
                return 1;
 * Unless required by applicable law or agreed to in writing, software
    protected int compareByTokenTypes(@NotNull TokenEntry first, @NotNull TokenEntry second) {
abstract class TokenEntryComparatorBase {
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (first.getString() == null) {
                return 0;
            if (second.getString() == null) {

            }
 *
            }
        }
                return -1;
            if (second.getString() == null) {
                return first.getString().compareToIgnoreCase(second.getString());
            } else {
    }

 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
 *
 * See the License for the specific language governing permissions and
            if (second.getTokenType() == null) {
