 * See the License for the specific language governing permissions and
import org.antlr.v4.runtime.atn.ATNConfigSet;
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {
import org.antlr.v4.runtime.Parser;
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {


}

 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.

    }
 *
/*
    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
import org.antlr.v4.runtime.RecognitionException;


    @Override
    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {
    public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
import org.antlr.v4.runtime.Recognizer;


 *     http://www.apache.org/licenses/LICENSE-2.0
 */
 * you may not use this file except in compliance with the License.
    }

    }
package org.jkiss.dbeaver.model.stm;
import org.antlr.v4.runtime.dfa.DFA;
 *
import java.util.BitSet;
    @Override

 *
    @Override
public class STMSkippingErrorListener implements STMErrorListener {
 * DBeaver - Universal Database Manager
