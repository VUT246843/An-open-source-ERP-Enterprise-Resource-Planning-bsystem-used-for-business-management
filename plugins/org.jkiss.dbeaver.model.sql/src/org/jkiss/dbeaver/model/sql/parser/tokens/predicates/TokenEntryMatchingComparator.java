 * Can be used in case when we cannot judge about the order of some token entries because of the missing but considered meaningful part of data.
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager

 * See the License for the specific language governing permissions and
/*
import org.jkiss.code.NotNull;
 * limitations under the License.
    private TokenEntryMatchingComparator() {
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public int compare(@NotNull TokenEntry first, @NotNull TokenEntry second) {
        return key.matches(term);
    @Override
    }
    @Override
 * Partial comparator implementing relaxed comparison of data carried by two token entries.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *

        return term.getString() != null && term.getTokenType() != null && !term.isInverted();
        return term.getTokenType() != null && !term.isInverted();
    @Override
    @Override
 *
package org.jkiss.dbeaver.model.sql.parser.tokens.predicates;

import org.jkiss.dbeaver.model.sql.parser.TokenEntry;
 * Note that the part of the data under partial comparison should also be the first to look at during strong comparison (implemented by the {@link ExactTokenEntryComparator}).

    public boolean match(@NotNull TokenEntry key, @NotNull TokenEntry term) {
 * Unless required by applicable law or agreed to in writing, software
    public static final TokenEntryMatchingComparator INSTANCE = new TokenEntryMatchingComparator();

 * Also responsible for decision whether two token entries could describe the same token.
 * Establishes partial ordering on the continuity of possible token entries with respect to part of the data.
    }
}
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
class TokenEntryMatchingComparator extends TokenEntryComparatorBase implements TrieLookupComparator<TokenEntry> {
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    }
        return super.compareByTokenTypes(first, second);
/**
    public boolean isPartiallyComparable(@NotNull TokenEntry term) {
    public boolean isStronglyComparable(@NotNull TokenEntry term) {

 * You may obtain a copy of the License at
    }


 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
