    
import java.util.BitSet;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
 *
        // do nothing
    }

    @Override
    }
    }
 */
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {

import org.antlr.v4.runtime.dfa.DFA;

 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 * limitations under the License.
public class STMLoggingErrorListener implements STMErrorListener {
/*
}
import org.antlr.v4.runtime.atn.ATNConfigSet;
    @Override

        // do nothing
 * you may not use this file except in compliance with the License.

 * Unless required by applicable law or agreed to in writing, software
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {
 * See the License for the specific language governing permissions and
 *
package org.jkiss.dbeaver.model.stm;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
        log.debug("Recognition error", e);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    @Override

 *
import org.jkiss.dbeaver.Log;
import org.antlr.v4.runtime.Parser;

 * DBeaver - Universal Database Manager
    private static final Log log = Log.getLog(STMLoggingErrorListener.class);

 * Copyright (C) 2010-2024 DBeaver Corp and others
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {
    public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
        // do nothing
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

