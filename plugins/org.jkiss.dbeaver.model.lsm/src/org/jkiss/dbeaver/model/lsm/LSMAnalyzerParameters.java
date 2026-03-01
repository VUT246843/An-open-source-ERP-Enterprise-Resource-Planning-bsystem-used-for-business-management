
 * See the License for the specific language governing permissions and
        boolean isSqlParametersEnabled,
 * Unless required by applicable law or agreed to in writing, software
 *
            syntaxManager.isVariablesEnabled()

import org.jkiss.dbeaver.model.sql.SQLDialect;
    }
 *
import java.util.stream.Collectors;
        return new LSMAnalyzerParameters(

import org.jkiss.dbeaver.model.sql.SQLSyntaxManager;
            .collect(Collectors.toList());
import java.util.*;
            .collect(Collectors.toUnmodifiableMap(q -> q[0], q -> q[1]));
        List<Map.Entry<Integer, Set<String>>> namedParameterPrefixes = Stream.of(Objects.requireNonNull(syntaxManager.getNamedParameterPrefixes()))
 * Licensed under the Apache License, Version 2.0 (the "License");
public record LSMAnalyzerParameters (

 */
 * You may obtain a copy of the License at
        boolean variablesEnabled
import org.jkiss.code.NotNull;
        Map<String, String> identifierQuotPairs = Stream.of(Objects.requireNonNull(dialect.getIdentifierQuoteStrings()))
import java.util.stream.Stream;
            .collect(Collectors.groupingBy(String::length, Collectors.toSet())).entrySet().stream()

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public static LSMAnalyzerParameters forDialect(SQLDialect dialect, SQLSyntaxManager syntaxManager) {
        );
 * Copyright (C) 2010-2024 DBeaver Corp and others
            syntaxManager.isParametersEnabled(),
            .sorted(Comparator.comparingInt(Map.Entry::getKey))

        char anonymousParameterMark,
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
 * limitations under the License.
            identifierQuotPairs,
 * DBeaver - Universal Database Manager
            syntaxManager.getAnonymousParameterMark(),
 * distributed under the License is distributed on an "AS IS" BASIS,
        @NotNull Map<String, String> knownIdentifierQuotes,
/*
}
package org.jkiss.dbeaver.model.lsm;
        boolean isAnonymousSqlParametersEnabled,
            namedParameterPrefixes,
            syntaxManager.isAnonymousParametersEnabled(),
) {
        @NotNull List<Map.Entry<Integer, Set<String>>> namedParameterPrefixes,
