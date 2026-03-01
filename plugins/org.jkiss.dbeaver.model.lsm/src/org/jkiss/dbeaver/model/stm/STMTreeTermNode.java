/*
        return false;
    private final int atnState;

    public boolean hasErrorChildren() {
        return this.getSymbol().getInputStream().getText(textRange);
    @Override
    @NotNull
 *
    }
        super(symbol);
 * Copyright (C) 2010-2024 DBeaver Corp and others
}
    @Override

    }
    public STMTreeTermNode(@NotNull Token symbol) {
 * You may obtain a copy of the License at
 *
import org.antlr.v4.runtime.misc.Interval;
    
    public String getTextContent() {

 * limitations under the License.
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
 *
import org.jkiss.code.NotNull;
    public int getAtnState() {
    @NotNull
    private String nodeName = null;
public class STMTreeTermNode extends TerminalNodeImpl implements STMTreeNode {
    public STMTreeTermNode(@NotNull Token symbol, int atnState) {

package org.jkiss.dbeaver.model.stm;
    public void fixup(@NotNull STMParserOverrides parserCtx) {
    }
        this.atnState = atnState;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public Interval getRealInterval() {
 */
    }
        return this.atnState;
    }
    @Override
    }
    }
        return new Interval(this.getSymbol().getStartIndex(), this.getSymbol().getStopIndex());
 *     http://www.apache.org/licenses/LICENSE-2.0

    public String getNodeName() {
 * DBeaver - Universal Database Manager
        super(symbol);
    @Override
    
        return this.nodeName;
    

 * Licensed under the Apache License, Version 2.0 (the "License");
        this.atnState = -1;
 * you may not use this file except in compliance with the License.
    
 * Unless required by applicable law or agreed to in writing, software
    @NotNull
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.antlr.v4.runtime.Token;
        Interval textRange = this.getRealInterval();
        this.nodeName = parserCtx.getVocabulary().getSymbolicName(this.getSymbol().getType());
    }


