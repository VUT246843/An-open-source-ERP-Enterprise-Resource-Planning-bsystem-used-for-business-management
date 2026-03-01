     * @param calcCount             Calculate value count and order by it (desc). Otherwise, just read distinct values in natural order
 * you may not use this file except in compliance with the License.
     * @param session               session
    @Nullable
import org.jkiss.dbeaver.model.exec.DBCSession;
/*
     * @param formatValues          Use value formatting or return raw values
/**

 *
     * @throws DBException on any error
     *

 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

     * @param caseInsensitiveSearch Use case-insensitive search for {@code valuePattern}
 * See the License for the specific language governing permissions and
        @NotNull DBCSession session,
     **/
 */
        boolean calcCount,
     * Gets enumeration values
import org.jkiss.code.NotNull;
 * limitations under the License.
import org.jkiss.dbeaver.DBException;
    /**
     */
package org.jkiss.dbeaver.model.struct;
 * DBSAttributeEnumerable

 *
    @NotNull
        @Nullable Object valuePattern,
 * You may obtain a copy of the License at
        boolean formatValues,
     * @param maxResults            maximum enumeration values in result set
 */
 * DBeaver - Universal Database Manager
public interface DBSAttributeEnumerable extends DBSEntityAttribute
import java.util.List;
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others
{
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.Nullable;
     * @param valuePattern          pattern for enumeration values. If null or empty then returns full enumeration set
import org.jkiss.dbeaver.model.data.DBDLabelValuePair;
     * @return statement with result set which contains valid enumeration values.
 * Licensed under the Apache License, Version 2.0 (the "License");
     * Retrieve count of distinct values of this attribute.
        boolean caseInsensitiveSearch)
     * @return count of distinct values or {@code null} if it can't be determined
}        throws DBException;
        int maxResults,
 *
    Long getDistinctValuesCount(@NotNull DBCSession session) throws DBException;
    List<DBDLabelValuePair> getValueEnumeration(
     * @param session session
    /**
