        TParser parser = pair.getSecond();
    
    private static final Log log = Log.getLog(LSMAnalyzerImpl.class);
import org.jkiss.utils.Pair;
 *
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
            parser.removeErrorListener(ConsoleErrorListener.INSTANCE);
    }
import org.antlr.v4.runtime.ConsoleErrorListener;
        Pair<TLexer, TParser> pair = this.createParser(source, this.parameters);
    protected abstract STMTreeRuleNode parseSqlQueryImpl(@NotNull TParser parser);
/*
import org.jkiss.dbeaver.model.stm.STMSource;
 *
 * DBeaver - Universal Database Manager
            TParser parser = prepareParser(source, errorListener);
    @Nullable
    public LSMAnalyzerImpl(@NotNull LSMAnalyzerParameters parameters) {
            STMTreeRuleNode result = parseSqlQueryImpl(parser);
        } catch (RecognitionException e) {
            lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);
        parser.getInterpreter().setPredictionMode(PredictionMode.LL);
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private final LSMAnalyzerParameters parameters;
 * Unless required by applicable law or agreed to in writing, software

            parser.addErrorListener(errorListener);
        }
 *

 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override

            return null;
import org.antlr.v4.runtime.RecognitionException;
    }
            log.debug("Recognition exception occurred while trying to parse the query", e);
        }
    @NotNull
        this.parameters = parameters;
            lexer.addErrorListener(errorListener);

 */
    }
import org.jkiss.code.Nullable;

        
    
    protected abstract Pair<TLexer, TParser> createParser(@NotNull STMSource source, @NotNull LSMAnalyzerParameters parameters);
            result.fixup(parser);
        return parser;

import org.jkiss.dbeaver.model.stm.STMParserOverrides;
 * Licensed under the Apache License, Version 2.0 (the "License");
}
import org.jkiss.dbeaver.model.sql.SQLDialect;
        
import org.jkiss.dbeaver.Log;
        
            return result;
    @NotNull
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.atn.PredictionMode;
 * limitations under the License.
import org.jkiss.dbeaver.model.stm.STMTreeRuleNode;
public abstract class LSMAnalyzerImpl<TLexer extends Lexer, TParser extends STMParserOverrides> implements LSMAnalyzer {
package org.jkiss.dbeaver.model.lsm;
        try {

    protected TParser prepareParser(@NotNull STMSource source, @Nullable STMErrorListener errorListener) {
import org.jkiss.dbeaver.model.stm.STMErrorListener;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
    public STMTreeRuleNode parseSqlQueryTree(@NotNull STMSource source, @Nullable STMErrorListener errorListener) {

        TLexer lexer = pair.getFirst();
        if (errorListener != null) {
    @NotNull
