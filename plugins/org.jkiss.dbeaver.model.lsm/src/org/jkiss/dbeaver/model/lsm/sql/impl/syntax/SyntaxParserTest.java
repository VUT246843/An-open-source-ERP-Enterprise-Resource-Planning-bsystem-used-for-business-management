                case Transition.PRECEDENCE:
        int pos = 36;
                            q.addLast(t);
        
import org.antlr.v4.runtime.tree.Tree;
    private static final Log log = Log.getLog(SyntaxParserTest.class);
import org.jkiss.dbeaver.model.stm.STMErrorListener;
            collect(ctx, pp, sb, "");
//                IntervalSet tokens = getTransitionTokens(tt);
            + "as x\r\n"

                case Transition.RANGE:
                var mySimulator = new ParserATNSimulator(recognizer.getATN(), recognizer.getInterpreter().decisionToDFA, recognizer.getInterpreter().getSharedContextCache()) {
                                e.printStackTrace();
            Map.of("\"", "\""),
    
import java.util.List;
    
            + ".c -- ololo\r\n"
    public static void main(String[] args) throws IOException, XMLStreamException, FactoryConfigurationError, TransformerException {
                case Transition.SET:
        }
            @Override
 *
                if (!sourceName.isEmpty()) {
                case Transition.ACTION:
            @Override
                case Transition.WILDCARD:
            ctx = ctx.getChildNode(0);
            switch (transition.getSerializationType()) {
                case Transition.ACTION:
                    // matches "anything" so don't consider them
            List.of(Map.entry(1, Set.of(":"))),
import org.jkiss.dbeaver.model.stm.LSMInspections;

            for (STMTreeNode t : ctx.getChildren()) {
            '?',
            sb.append(".").append(Trees.getNodeText(ctx, pp));
            @Override
        { // print simple parse tree view
                            } catch (Throwable ex) {
//                Collection<Transition> tt = expandToTerms(s);
        var ll = new SQLStandardLexer(input, params);
                case Transition.WILDCARD: 
            + "ORDER BY Product.ModifiedDate DESC";
                                break;
 */
            Map.of("\"", "\""),
import javax.xml.transform.TransformerException;
//        System.out.println(LSMInspections.prepareAbstractSyntaxInspection(tree, pos).getReachabilityByName());
import javax.xml.stream.FactoryConfigurationError;
    static IntervalSet getTransitionTokens(Collection<Transition> transitions) {
            + ".t -- ololo\r\n"
            + "USING(ProductCategoryID)\r\n"
        );
    }
            + "INNER JOIN (SELECT column_name FROM sch.table_name INNER JOIN T2 as A22 WHERE id > 3) as A3\r\n"
        }
        }
public class SyntaxParserTest {
/*    
                {
                {
        LinkedList<Transition> q = new LinkedList<>();
            + "GROUP BY ProductName\r\n"
            + "UNION JOIN Cat.Production.ProductCategory\r\n"
            }
        HashSet<Transition> visited = new HashSet<>();
                            Collection<Transition> tt = expandToTerms(state);
                case Transition.ATOM: 
import org.antlr.v4.runtime.*;
                    throw new RuntimeException();
                case Transition.PREDICATE:
        } else {
        var pp = new SQLStandardParser(tokens, params);
                System.out.println("offending token: " + recognizer.getCurrentToken().getText());
 *
        sb.append(" [").append(ctx.getRealInterval()).append("]\n");
    static void setErrorHandler(Parser pp) {
 * you may not use this file except in compliance with the License.
            public void reportAmbiguity(Parser arg0, DFA arg1, int arg2, int arg3, boolean arg4, BitSet arg5, ATNConfigSet arg6) {
            }
//                    tokens.consume(); 
//                System.out.println("reportContextSensitivity");
                        ATNConfigSet currState = this.computeStartState(s, recognizer.getContext(), true);
        return tokens;
                        for (ATNState state: currState.getStates()) {
                case Transition.NOT_SET: 
            }
        var params = new LSMAnalyzerParameters(
    }
                    break;

        for (Transition transition: transitions) {
                if (true) {
        //System.out.println("err: " + tree.getRuleContexts(TableExpressionContext.class).get(0).err.getText());
                case Transition.RANGE:
//                }
                case Transition.NOT_SET: 
                {
                            }
import org.jkiss.dbeaver.Log;
        
            + "    Product.ProductNumber,\r\n"
*/
 *
                        }
                case Transition.SET:
    static Collection<Transition> expandToTerms(ATNState state) {                        
                    RangeTransition t = (RangeTransition)transition;

                    break;
                    // doesn't describe matching in terms of tokens, so ignore them
                System.out.println(sourceName + " line " + line + ":" + charPositionInLine + " " + msg);
                case Transition.PRECEDENCE:
                // just illustration of listeners possibility
                    sourceName = String.format("%s:%d:%d: ", sourceName, line, charPositionInLine);
                int charPositionInLine, 
            }
/*
//                System.out.println("reportAttemptingFullContext");
        var tokens = new CommonTokenStream(ll);
            sb.append("\n");
 * limitations under the License.
            + "s -- ololo\r\n"
    }

            sb.append("\n");

                System.out.println("offending token: " + e.getOffendingToken().getText());
//                
                    break;
                        ATNConfigSet nextState = null;
                
        System.out.println(str);
        });

import java.util.Set;
            false,
                    tokens.add(((AtomTransition)transition).label);
 *     http://www.apache.org/licenses/LICENSE-2.0
                case Transition.ATOM:
        var ll = new SQLStandardLexer(input, params);
        tokens.fill();
    private static void collect(STMTreeNode ctx, Parser pp, StringBuilder sb, String indent) {
                String sourceName = recognizer.getInputStream().getSourceName();
        String str = tree.getTextContent();
            true
        return results;
//                if (tokens.LA(1) != recognizer.EOF) {
                }
                    tokens.add(t.from, t.to);
                default:
            System.out.println(sb.toString());
            + "ON ProductSubCategory.ProductSubcategoryID = Product.ProductSubcategoryID\r\n"
                // just illustration of listeners possibility
                }
}            var sb = new StringBuilder();

                };
 * DBeaver - Universal Database Manager
            }
                System.out.println("expected one of " + e.getExpectedTokens().toString(recognizer.getVocabulary()));
            + "    Product.ProductID AS id,\r\n"
                case Transition.EPSILON:
                    }
 * Unless required by applicable law or agreed to in writing, software
            public void reportAttemptingFullContext(Parser arg0, DFA arg1, int arg2, int arg3, BitSet arg4, ATNConfigSet arg5) {

        { // print simple parse tree view
                        for (int i = from.getTokenIndex(); i < to.getTokenIndex(); i++, currState = nextState) {
 * Licensed under the Apache License, Version 2.0 (the "License");
            var sb = new StringBuilder();
                        }
        String inputText = "SELECT ALL Product.*, \r\n"
                case Transition.PREDICATE:
import org.jkiss.dbeaver.model.stm.STMTreeNode;
//                System.out.println("reportAmbiguity");
        var params = new LSMAnalyzerParameters(
        var pp = new SQLStandardParser(tokens, params);
            q.addLast(t);
            Transition transition = q.removeFirst();
                ATNState s = recognizer.getInterpreter().atn.states.get(recognizer.getState());

        }
            sb.append(indent).append("    ").append(pp.getVocabulary().getDisplayName(t.getType())).append(" \"").append(Trees.getNodeText(ctx.getChild(0), pp)).append("\" [").append(ctx.getChildNode(0).getRealInterval()).append("]\n");
            + "    ProductSubCategory.Name AS ProductSubCategory,\r\n"
        }
                    throw new UnsupportedOperationException("Unrecognized ATN transition type.");
                }
                String msg, 

                    }
        for (Transition t: state.getTransitions()) {
                Object offendingSymbol, 
                int line, 
        while (ctx.getChildCount() == 1 && !(ctx.getChild(0).getPayload() instanceof Token)) {
            false,
                    public void doMyFancyWork(Token from, Token to) {
import org.antlr.v4.runtime.dfa.DFA;
                RecognitionException re)  {
            }

            collect(tree, pp, sb, "");

            public void reportContextSensitivity(Parser arg0, DFA arg1, int arg2, int arg3, int arg4, ATNConfigSet arg5) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
                            Token t = recognizer.getTokenStream().get(i);
                            IntervalSet tokens = getTransitionTokens(tt);
import org.antlr.v4.runtime.tree.Trees;
import javax.xml.stream.XMLStreamException;
                }
                case Transition.EPSILON:
                    throw new UnsupportedOperationException("Unrecognized ATN transition type.");
        sb.append(indent).append(Trees.getNodeText(ctx, pp));
            + "    ProductCategory.Name AS ProductCategory,\r\n"
            return sb.toString();
import org.jkiss.dbeaver.model.lsm.LSMAnalyzerParameters;

 * distributed under the License is distributed on an "AS IS" BASIS,
            + "    Product.ProductModelID\r\n"
    }
                            System.out.println("expected one of " + tokens.toString(recognizer.getVocabulary()));
    public static String collect(STMTreeNode ctx) {
                    break;
        );
            List.of(Map.entry(1, Set.of(":"))),
        var input = CharStreams.fromString(inputText);
        
            }
        var tokens = new CommonTokenStream(ll);
import java.util.Map;
package org.jkiss.dbeaver.model.lsm.sql.impl.syntax;
//        System.out.println(inputText.substring(0, pos) + "|" + inputText.substring(pos));
            @Override
            + "    Product.Name AS ProductName,\r\n"
            true,
        SqlQueriesContext tree = pp.sqlQueries();
                case Transition.RULE: 
                        }
 
                                nextState = computeReachSet(currState, t.getType(), true);
                            try {
                    // is not responsible for matching, so ignore them
                case Transition.RULE: 

                
                collect(t, pp, sb, indent + "    ");
                    break;
            true,
        pp.addErrorListener(new STMErrorListener() {
            switch (transition.getSerializationType()) {
//                CommonTokenStream tokens = (CommonTokenStream) recognizer.getTokenStream(); 
    }
                mySimulator.doMyFancyWork(recognizer.getCurrentToken(), e.getOffendingToken());
            @Override
                    results.add(transition);
//                super.recover(recognizer, e); 
        while (q.size() > 0) {
import org.jkiss.dbeaver.model.lsm.sql.impl.syntax.SQLStandardParser.SqlQueriesContext;
                }
                    break;
                    Interval trange = Interval.of(t.from, t.to);
            }
                        if (visited.add(t)) {
        }
        System.out.println(LSMInspections.prepareTerms(tree));
            public void recover(Parser recognizer, RecognitionException e) {
                    for (Transition t: transition.target.getTransitions()) {
        HashSet<Transition> results = new HashSet<>();
                            System.out.println(i + ": " + currState);
        });
        if (ctx.getChildCount() == 1 && ctx.getChild(0).getPayload() instanceof Token t) {
            + "INNER JOIN Production.ProductSubCategory as A2\r\n"
                default:
                // just illustration of listeners possibility
        var input = CharStreams.fromString("");
import org.antlr.v4.runtime.atn.ATNConfigSet;
        }
//                System.out.println("expected one of " + tokens.toString(recognizer.getVocabulary()));
    
import java.io.IOException;
import java.util.BitSet;
        IntervalSet tokens = new IntervalSet();
            '?',
                                nextState = null;
            true
            + "FROM Production.Product AS Prod(ProductID, Name, ProductNumber), T as A, \r\n"
                    tokens.addAll(((SetTransition)transition).set);
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at

        pp.setErrorHandler(new DefaultErrorStrategy( ) {

            public void syntaxError(Recognizer<?, ?> recognizer, 
    }
//                // verify current token is not EOF 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
