            || tok.getData() == SQLTokenType.T_KEYWORD
 *     http://www.apache.org/licenses/LICENSE-2.0
    Map<String, String> getTableAliasesFromQuery();
import java.util.Map;
 */
import org.jkiss.code.NotNull;
    public static boolean isNamePartToken(TPToken tok) {
     */
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLTokenType;
 */
package org.jkiss.dbeaver.model.sql.analyzer;

 * limitations under the License.
     * The method return table references filtered by condition
     */
}
     * Checks if token is the name part token
 *
    @NotNull
    /**
/**
import org.jkiss.dbeaver.model.text.parser.TPToken;

 *
 * DBeaver - Universal Database Manager
            || tok.getData() == SQLTokenType.T_OTHER;
    @NotNull
     * The method returns map of table by alias base on query expression

/*
 * See the License for the specific language governing permissions and
    Map<String, String> getFilteredTableReferences(@NotNull String tableAlias, boolean allowPartialMatch);
 * Unless required by applicable law or agreed to in writing, software
 * SQL expressions
    }
        return tok.getData() == SQLTokenType.T_QUOTED
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");

    /**
    /**
 *
 * Interface designed in order to provide reference implementation of analyzing
public interface TableReferencesAnalyzer {
     */


 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
