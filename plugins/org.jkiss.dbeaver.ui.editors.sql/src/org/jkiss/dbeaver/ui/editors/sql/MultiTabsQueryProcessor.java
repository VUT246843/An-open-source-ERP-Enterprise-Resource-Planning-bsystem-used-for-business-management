        int resultSetIndex,
    protected QueryResultsContainer createQueryResultsContainer(
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
        return new MultiTabsQueryResultsContainer(this, resultSetNumber, resultSetIndex, singleQuery, makeDefault);
    MultiTabsQueryProcessor(@NotNull SQLEditor owner, boolean singleQuery, boolean makeDefault) {
 *
 * Copyright (C) 2010-2026 DBeaver Corp and others
        int resultSetIndex,
/*
    }
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
        int resultSetNumber,

class MultiTabsQueryProcessor extends QueryProcessor {
import org.jkiss.code.NotNull;

        super(owner, singleQuery, makeDefault);
        @NotNull DBSDataContainer dataContainer,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
 * you may not use this file except in compliance with the License.
    ) {

        boolean makeDefault
package org.jkiss.dbeaver.ui.editors.sql;
}
 * See the License for the specific language governing permissions and

    @NotNull
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
    @NotNull

 * DBeaver - Universal Database Manager
    protected QueryResultsContainer createQueryResultsContainer(
 *
        return new MultiTabsQueryResultsContainer(this, resultSetNumber, resultSetIndex, dataContainer, singleQuery);
        boolean singleQuery,
    }
        int resultSetNumber,
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
        boolean singleQuery
    ) {
    }
 *
