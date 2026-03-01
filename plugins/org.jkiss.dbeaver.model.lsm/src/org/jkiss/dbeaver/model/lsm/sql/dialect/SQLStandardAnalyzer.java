        for (int i = tokens.index(); i < tokens.size() && tokens.get(i).getType() != SQLStandardLexer.EOF; i++) {
        return root;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
package org.jkiss.dbeaver.model.lsm.sql.dialect;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
    public static SQLStandardLexer createLexer(@NotNull STMSource source, @NotNull LSMAnalyzerParameters parameters) {
 * You may obtain a copy of the License at
    @NotNull
    }
import org.antlr.v4.runtime.tree.TerminalNode;

import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.stm.*;
import org.jkiss.dbeaver.model.lsm.LSMAnalyzerParameters;
public class SQLStandardAnalyzer extends LSMAnalyzerImpl<SQLStandardLexer, SQLStandardParser> {
import org.jkiss.utils.Pair;
        SQLStandardParser parser =  new SQLStandardParser(new CommonTokenStream(lexer), parameters);
    }
 * distributed under the License is distributed on an "AS IS" BASIS,

        super(parameters);
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.lsm.sql.impl.syntax.SQLStandardParser;
        STMTreeRuleNode root = parser.sqlQuery();
        SQLStandardLexer lexer = createLexer(source, parameters);
 * See the License for the specific language governing permissions and
 *
        TokenStream tokens = parser.getInputStream();
import org.jkiss.dbeaver.model.lsm.sql.impl.syntax.SQLStandardLexer;
 */
import org.jkiss.dbeaver.model.lsm.LSMAnalyzerImpl;

    
 *
 * Unless required by applicable law or agreed to in writing, software
    @Override
        return lexer;
    }
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        SQLStandardLexer lexer = new SQLStandardLexer(source.getStream(), parameters);
import org.antlr.v4.runtime.CommonTokenStream;
        return new Pair<>(lexer, parser);
    public SQLStandardAnalyzer(LSMAnalyzerParameters parameters) {
}
            root.addErrorNode(new STMTreeTermErrorNode(tokens.get(i)));

import org.antlr.v4.runtime.TokenStream;
/*
import org.antlr.v4.runtime.Token;
    protected STMTreeRuleNode parseSqlQueryImpl(@NotNull SQLStandardParser parser) {
    @NotNull
        }

 * you may not use this file except in compliance with the License.
    protected Pair<SQLStandardLexer, SQLStandardParser> createParser(@NotNull STMSource source, @NotNull LSMAnalyzerParameters parameters) {
import org.antlr.v4.runtime.TokenSource;

 * limitations under the License.
