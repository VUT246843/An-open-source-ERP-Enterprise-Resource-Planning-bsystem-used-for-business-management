 */
import org.jkiss.dbeaver.model.sql.parser.TokenEntry;

 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * DBeaver - Universal Database Manager
    private ExactTokenEntryComparator() {


        }
    public int compare(@NotNull TokenEntry first, @NotNull TokenEntry second) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.Comparator;
 * See the License for the specific language governing permissions and
 * Strong comparator implementing foll comparison of data carried by two token entries.
 * You may obtain a copy of the License at
    @Override
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
    public static final ExactTokenEntryComparator INSTANCE = new ExactTokenEntryComparator();
 *
package org.jkiss.dbeaver.model.sql.parser.tokens.predicates;
 * Establishes strong ordering on the continuity of possible token entries.
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
        if (result != 0) {
    }

import org.jkiss.code.NotNull;
    }
}

        int result = compareByTokenTypes(first, second);
        // keep in sync with TokenEntryMatchingComparator implementation: look at the partially comparable part of the data at first!
/**
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
/*
class ExactTokenEntryComparator extends TokenEntryComparatorBase implements Comparator<TokenEntry> {

        return compareByStrings(first, second);
 *
            return result;
