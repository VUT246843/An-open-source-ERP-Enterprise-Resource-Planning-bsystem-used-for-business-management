        SQLCommandModel cmdModel = new SQLCommandModel(fakeTree, text);
            );
    }
import org.jkiss.dbeaver.model.stm.STMTreeRuleNode;
        return symbol;
            SQLQuerySymbolEntry symbolEntry = makeSymbol(
    }
            .toList();
            symbolEntries.add(makeSymbol(0, cmdPrefix.length(), cmdPrefix, SQLQuerySymbolClass.DBEAVER_COMMAND));
        }
        @NotNull String cmdText,
 * you may not use this file except in compliance with the License.
import org.antlr.v4.runtime.misc.Pair;
 * Copyright (C) 2010-2025 DBeaver Corp and others

        int end;
        }
        int start,
        int start;
import org.jkiss.dbeaver.model.stm.STMTreeTermNode;
                symbolEntries.add(makeSymbol(end, multilinePrefix.length(), multilinePrefix, SQLQuerySymbolClass.DBEAVER_COMMAND));
            }
 * limitations under the License.

     */
            symbolEntries.add(makeSymbol(prevPos, text.length() - prevPos, text.substring(prevPos), SQLQuerySymbolClass.UNKNOWN));
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryModel;
import org.jkiss.dbeaver.model.stm.STMTreeNode;
            ? null
    }


        @NotNull SQLCommandModel cmdModel
        return new STMTreeTermNode(new CommonToken(new Pair<>(null, null), -1, 0, start, start + length - 1));
    public static SQLQueryModel recognizeCommand(
 */
                end = text.length() - multilinePrefix.length();
import java.util.*;
        registerCommandParameter(text, symbolEntries);
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
            : new ScriptVariablesResolver(scriptContext);
import org.jkiss.dbeaver.model.sql.semantics.model.SQLCommandModel;
        if (prevPos < text.length()) {
        String cmdPrefix = recognitionContext.getSyntaxManager().getControlCommandPrefix();
 *

import org.jkiss.dbeaver.model.sql.eval.ScriptVariablesResolver;
            } else {

                SQLQuerySymbolClass.DBEAVER_COMMAND
    private static SQLQuerySymbolEntry makeSymbol(int start, int length, @NotNull String name, @NotNull SQLQuerySymbolClass symbolClass) {
import org.jkiss.dbeaver.utils.GeneralUtils;
                SQLQuerySymbolClass.DBEAVER_VARIABLE


        if (text.startsWith(multilinePrefix)) {
 * See the License for the specific language governing permissions and
        STMTreeNode fakeTree = new STMTreeRuleNode();
        } else {
            symbolEntries.add(makeSymbol(0, multilinePrefix.length(), multilinePrefix, SQLQuerySymbolClass.DBEAVER_COMMAND));
        String cmdText = text.substring(start, end);
import org.jkiss.code.NotNull;
                cmdText.substring(varEntry.start(), varEntry.end()),
        @NotNull String text,
 *     http://www.apache.org/licenses/LICENSE-2.0
            prevPos = entry.getInterval().b + 1; // because interval here is inclusive
import org.jkiss.code.Nullable;
            end = text.length();
                cmdText.substring(nameInterval.a, nameInterval.b + 1),
    ) {
            symbolEntries.add(symbolEntry);
            int entryPos = entry.getInterval().a;
 * You may obtain a copy of the License at
        for (GeneralUtils.VariableEntryInfo varEntry : vars) {
        int prevPos = 0;
        symbol.getSymbol().setSymbolClass(symbolClass);

            start = multilinePrefix.length();
            if (text.endsWith(multilinePrefix)) {
        @Nullable SQLScriptContext scriptContext,
 *
    private static void registerCommandParameter(@NotNull String text, @NotNull Set<SQLQuerySymbolEntry> symbolEntries) {
     * Makes new SQLQueryModel instance for the control command in the script
    private static STMTreeTermNode makeNode(int start, int length) {
                end = text.length();
            end = text.length();
        @NotNull SQLQueryRecognitionContext recognitionContext,
    }
        String multilinePrefix = cmdPrefix.repeat(2);
            }
 *
 * DBeaver - Universal Database Manager
            start = cmdPrefix.length();
import org.jkiss.dbeaver.model.sql.SQLScriptContext;
public class SQLCommandModelRecognizer {
        if (nameInterval != null) {
/*
        SQLQuerySymbolEntry symbol = new SQLQuerySymbolEntry(makeNode(start, length), name, name, null);
            symbolEntries.add(makeSymbol(
        }
        return new SQLQueryModel(fakeTree, cmdModel, symbolEntries, Collections.emptyList());
    private static void registerVariables(
            .sorted(Comparator.comparingInt(e -> e.getInterval().a))

            cmdModel.addVariable(symbolEntry, variablesResolver == null ? "?" : variablesResolver.get(varEntry.name()));


        @NotNull Set<SQLQuerySymbolEntry> symbolEntries,
                start, nameInterval.length(),
package org.jkiss.dbeaver.model.sql.semantics;
                start + varEntry.start(), varEntry.end() - varEntry.start(),
    /**
}
        List<GeneralUtils.VariableEntryInfo> vars = GeneralUtils.findAllVariableEntries(cmdText);
        for (SQLQuerySymbolEntry entry : alreadyHighlighted) {
 * Unless required by applicable law or agreed to in writing, software
    ) {
import org.jkiss.dbeaver.model.stm.LSMInspections;
        }
        registerVariables(scriptContext, cmdText, start, symbolEntries, cmdModel);
import org.antlr.v4.runtime.CommonToken;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        ScriptVariablesResolver variablesResolver = scriptContext == null || scriptContext.getExecutionContext() == null
        } else if (text.startsWith(cmdPrefix)) {
        Interval nameInterval = LSMInspections.matchAnyWordHead(cmdText);
import org.antlr.v4.runtime.misc.Interval;

        List<SQLQuerySymbolEntry> alreadyHighlighted = symbolEntries.stream()
        Set<SQLQuerySymbolEntry> symbolEntries = new HashSet<>();
            ));
 * distributed under the License is distributed on an "AS IS" BASIS,

                symbolEntries.add(makeSymbol(prevPos, entryPos - prevPos, text.substring(prevPos, entryPos), SQLQuerySymbolClass.UNKNOWN));
            start = 0;
    }
        @Nullable SQLScriptContext scriptContext
            if (prevPos < entryPos) {
