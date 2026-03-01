        Interval textRange = this.getRealInterval();
            return Interval.INVALID;
    @NotNull
    public <T extends ParseTree> T addAnyChild(@NotNull T t) {
        return new Interval(start, Math.max(start, end));
import org.antlr.v4.runtime.tree.ParseTree;
 *     http://www.apache.org/licenses/LICENSE-2.0
    

    public TerminalNode addChild(@NotNull TerminalNode t) {

        super();
 * Licensed under the Apache License, Version 2.0 (the "License");
    @NotNull
    public ErrorNode addErrorNode(@NotNull Token badToken) {
            return super.addAnyChild(t);
        return this.hasErrorChildren;


    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
            throw new IllegalStateException();
        if (!(t instanceof STMTreeNode)) {
import org.antlr.v4.runtime.tree.TerminalNode;
        }
 * DBeaver - Universal Database Manager
    }
    public int getNodeKindId() {
}

        } else {
 * you may not use this file except in compliance with the License.
    }
    @Override
    
/*
    public void fixup(@NotNull STMParserOverrides parserCtx) {
    }
    @NotNull
        return nodeName;
     */
        return (STMTreeNode) super.getChild(index);
    @Override
        }
 * Unless required by applicable law or agreed to in writing, software
    @NotNull
    
    @Override
    private String nodeName = null;
    }
 *
    /**
    public STMTreeNode getChildNode(int index) {
 *
    public String getNodeName() {
            ((STMTreeNode) getChild(i)).fixup(parserCtx);
    }

    @Override
    @Override
    }
    public RuleContext addChild(@NotNull RuleContext ruleInvocation) {
    public boolean hasErrorChildren() {
    }
        return this.getStart().getInputStream().getText(textRange);
     * Returns true, if some parsing errors happen, while analysing this node
        return super.addAnyChild(new STMTreeTermErrorNode(badToken));
import org.antlr.v4.runtime.Token;
            return super.addChild(ruleInvocation);
        int start = this.getStart().getStartIndex();
import org.antlr.v4.runtime.ParserRuleContext;
 * See the License for the specific language governing permissions and
            throw new IllegalStateException();
    private boolean hasErrorChildren = false;
    }
        }
    }
        return super.invokingState;
    
        if (this.start == null || this.stop == null) {
    }
        return super.getRuleContext().getRuleIndex();

    
 */
    

        if (!(t instanceof STMTreeNode)) {
        return super.addChild(new STMTreeTermNode(matchedToken));
        } else {
    public Interval getRealInterval() {
    @NotNull
    @NotNull
    public int getAtnState() {
        } else {
        super(parent, invokingStateNumber);
        if (!(errorNode instanceof STMTreeNode)) {

        for (int i = 0; i < getChildCount(); i++) {
import org.antlr.v4.runtime.tree.ErrorNode;

import org.antlr.v4.runtime.RuleContext;
    public STMTreeRuleNode(@NotNull ParserRuleContext parent, int invokingStateNumber) {
public class STMTreeRuleNode extends ParserRuleContext implements STMTreeNode {
            throw new IllegalStateException();
        int end = this.getStop().getStopIndex();
    }
            this.hasErrorChildren |= t instanceof ErrorNode;
    
    @Override
    @Override
    }
import org.antlr.v4.runtime.misc.Interval;
import org.jkiss.code.NotNull;


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
    @NotNull
        nodeName = Trees.getNodeText(this, parserCtx);
    @Override
        if (!(ruleInvocation instanceof STMTreeNode)) {
    @NotNull
        }
            throw new IllegalStateException();
    public TerminalNode addChild(@NotNull Token matchedToken) {
    @Override
 *
    @NotNull
        }
    }
            return super.addErrorNode(errorNode);
import org.antlr.v4.runtime.tree.Trees;
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
            return super.addChild(t);

    @Override
package org.jkiss.dbeaver.model.stm;
    public STMTreeRuleNode() {
    }
 * limitations under the License.
    @Override
        } else {
    public String getTextContent() {
    public ErrorNode addErrorNode(@NotNull ErrorNode errorNode) {
    }

