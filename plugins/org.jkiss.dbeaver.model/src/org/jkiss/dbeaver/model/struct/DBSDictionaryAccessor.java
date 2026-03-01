        boolean caseInsensitive,
    @NotNull
        long offset,
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
    ) throws DBException;

 * See the License for the specific language governing permissions and
    @NotNull
package org.jkiss.dbeaver.model.struct;
 */
        @NotNull Object pattern,
    DBRProgressMonitor getProgressMonitor();
    boolean isKeyComparable();

 * Unless required by applicable law or agreed to in writing, software
/*
import org.jkiss.dbeaver.DBException;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        long maxResults
 * You may obtain a copy of the License at


        @NotNull Object value,
    ) throws DBException;
 * you may not use this file except in compliance with the License.
 *

 * Copyright (C) 2010-2024 DBeaver Corp and others

    List<DBDLabelValuePair> getValuesNear(
        long maxResults
    @NotNull
    List<DBDLabelValuePair> getSimilarValuesNear(
    List<DBDLabelValuePair> getSimilarValues(
import java.util.List;
        long maxResults
        boolean isPreceeding,
    @NotNull
        Object value, boolean isPreceeding,
 *
    List<DBDLabelValuePair> getValues(long offset, int pageSize) throws DBException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        boolean byDesc,
    
 *
 * DBeaver - Universal Database Manager
}
    @NotNull
        boolean caseInsensitive,

 * Licensed under the Apache License, Version 2.0 (the "License");
        long offset,
import org.jkiss.code.NotNull;
        @NotNull Object pattern,
public interface DBSDictionaryAccessor extends AutoCloseable {
    List<DBDLabelValuePair> getValueEntry(@NotNull Object keyValue) throws DBException;
 * limitations under the License.

        long offset,
    ) throws DBException;
        boolean byDesc,

import org.jkiss.dbeaver.model.data.DBDLabelValuePair;

    @NotNull
