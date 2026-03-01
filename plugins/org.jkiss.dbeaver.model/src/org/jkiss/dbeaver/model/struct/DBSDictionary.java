     * @return statement with result set which contains valid enumeration values.
        boolean sortByValue,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    DBSDictionaryAccessor getDictionaryAccessor(
     * Gets enumeration values
     * @param preceedingKeys        other constrain key values. May be null.
        @NotNull DBRProgressMonitor monitor,

 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
     * @param offset                enumeration values offset in result set
     * Usually it depends on constraint type (enumerations makes sense only for unique constraints).
        @NotNull List<Object[]> keyValues,
        @Nullable List<DBDAttributeValue[]> preceedingKeys,
        @NotNull DBSEntityAttribute keyColumn,
        @Nullable Object keyPattern,
     * @param keyPattern            pattern for enumeration values. If null or empty then returns full enumeration set
import java.util.List;
        @NotNull List<DBSEntityAttribute> keyColumns,
        boolean sortAsc,
     * Checks that this constraint supports key enumerations.
 * you may not use this file except in compliance with the License.
        @NotNull DBRProgressMonitor monitor,
        @Nullable String searchText,
        boolean sortByDesc

} * You may obtain a copy of the License at

import org.jkiss.code.NotNull;
        boolean omitNonDescriptive) throws DBException;
import org.jkiss.dbeaver.model.data.DBDAttributeValue;
     */
    @NotNull
     * @param maxResults            maximum enumeration values in result set
    /**
        @NotNull DBSEntityAttribute keyColumn,
        boolean sortByValue,
        boolean caseInsensitiveSearch,
import org.jkiss.dbeaver.DBException;
 * Dictionary table (entity).
    List<DBDLabelValuePair> getDictionaryValues(
        boolean sortAsc,
/**
    ) throws DBException;
     * @return true or false
        @Nullable List<DBDAttributeValue> preceedingKeys,
import org.jkiss.dbeaver.model.data.DBDLabelValuePair;
     * @param sortByValue           sort results by value
 * May return possible values for a set of attributes.

    @NotNull
import org.jkiss.code.Nullable;
        int maxResults
        @NotNull DBRProgressMonitor monitor,
 *
public interface DBSDictionary {
/*

        boolean sortAsc,
 *
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2025 DBeaver Corp and others
    List<DBDLabelValuePair> getDictionaryEnumeration(
    /**
    boolean supportsDictionaryEnumeration();
     * @param caseInsensitiveSearch use case-insensitive search for {@code keyPattern}
     * @param monitor               session
 * Unless required by applicable law or agreed to in writing, software

     * @param searchText            description text to search
 */
     */
        int offset,
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * limitations under the License.
 * See the License for the specific language governing permissions and
        @Nullable List<DBDAttributeValue> restColumns,
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
     *
     * @param sortAsc               ascending sorting (irrelevant is {@code sortByValue} is false)
    ) throws DBException;
package org.jkiss.dbeaver.model.struct;
     * @param keyColumn             enumeration column.
