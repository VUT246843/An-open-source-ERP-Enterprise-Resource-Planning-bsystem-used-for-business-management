 *
 */
        }
        if (filterKeyStringOrNull == null) {

    public static int matches(String string, SQLQueryWordEntry filterKeyOrNull, boolean searchInside) {

        if (searchInside) {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        return matches(this.filterString, filterKeyStringOrNull, searchInside);
        }

    }
 *
import org.jkiss.dbeaver.model.text.TextUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");
            return TextUtils.fuzzyScore(string, filterKeyStringOrNull);
/*
    public int matches(SQLQueryWordEntry filterKeyOrNull, boolean searchInside) {
 * limitations under the License.
        this.offset = offset;
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
    public static int matches(String string, String filterKeyStringOrNull, boolean searchInside) {
    public SQLQueryWordEntry(int offset, String string) {
    public final int offset;

            return Integer.MAX_VALUE;
}
        return matches(this.filterString, filterKeyOrNull, searchInside);


package org.jkiss.dbeaver.model.sql.semantics.completion;
        return filterKeyOrNull == null ? Integer.MAX_VALUE : matches(string, filterKeyOrNull.filterString, searchInside);

 * Unless required by applicable law or agreed to in writing, software
        } else {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
            return string.startsWith(filterKeyStringOrNull) ? Integer.MAX_VALUE : 0;
    public int matches(String filterKeyStringOrNull, boolean searchInside) {
    public final String string;

 *
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
public class SQLQueryWordEntry {
    }
        this.filterString = string.toLowerCase();
 * See the License for the specific language governing permissions and
    public final String filterString;
        this.string = string;
