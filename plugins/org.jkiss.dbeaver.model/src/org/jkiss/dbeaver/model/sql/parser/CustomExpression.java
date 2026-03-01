

    }
        this.expression = expression;
 * CustomExpression
    @Override
 *
    public <T, S> T accept(ExpressionVisitor<T> expressionVisitor, S context) {
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
    }
    public SimpleNode getASTNode() {
    private SimpleNode simpleNode;
/**
    }
    @Override

import net.sf.jsqlparser.expression.ExpressionVisitor;
import net.sf.jsqlparser.expression.StringValue;
 *
    }
    public void accept(ExpressionVisitor expressionVisitor) {
 */
    public String toString() {
        return simpleNode;


 */
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    private final String expression;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return expression;

package org.jkiss.dbeaver.model.sql.parser;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
    }
        this.simpleNode = simpleNode;
 * DBeaver - Universal Database Manager

}
    public void setASTNode(SimpleNode simpleNode) {
    }
public class CustomExpression implements Expression {
 * You may obtain a copy of the License at
        return expressionVisitor.visit(new StringValue(), context);
 *     http://www.apache.org/licenses/LICENSE-2.0


    @Override
        expressionVisitor.visit(new StringValue(expression));
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.parser.SimpleNode;
 * See the License for the specific language governing permissions and
 *
    public CustomExpression(String expression) {
