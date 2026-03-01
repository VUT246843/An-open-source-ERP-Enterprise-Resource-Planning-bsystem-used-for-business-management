    
 * Licensed under the Apache License, Version 2.0 (the "License");

        return -1;
 *
 * Unless required by applicable law or agreed to in writing, software
    }
 *
    public void fixup(@NotNull STMParserOverrides parserCtx) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    public Interval getRealInterval() {
    @NotNull
    public String getNodeName() {

    public STMTreeTermErrorNode(@NotNull Token symbol) {
    
    }

    
    }
import org.antlr.v4.runtime.misc.Interval;
 *
public class STMTreeTermErrorNode extends ErrorNodeImpl implements STMTreeNode {
 * limitations under the License.
    public String getTextContent() {
        return new Interval(this.getSymbol().getStartIndex(), this.getSymbol().getStopIndex());
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
/*
package org.jkiss.dbeaver.model.stm;
    }
import org.jkiss.code.NotNull;
    @Override

    }
        return nodeName;
    }

 * you may not use this file except in compliance with the License.
        return false;
 * See the License for the specific language governing permissions and
    @NotNull
 */
    public boolean hasErrorChildren() {
    @Override
   
    
    @Override
    public int getAtnState() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
        Interval textRange = this.getRealInterval();
    @NotNull
import org.antlr.v4.runtime.Token;
    
    }
    private static final String nodeName = "error";
 * DBeaver - Universal Database Manager
}
import org.antlr.v4.runtime.tree.ErrorNodeImpl;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        super(symbol);
        return this.getSymbol().getInputStream().getText(textRange);
 * You may obtain a copy of the License at
