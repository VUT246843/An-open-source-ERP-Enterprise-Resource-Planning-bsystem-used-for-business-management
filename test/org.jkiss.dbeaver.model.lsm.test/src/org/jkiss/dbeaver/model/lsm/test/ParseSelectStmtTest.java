            pp.setBuildParseTree(true);
    
//                System.err.println();
                System.err.println(stmtText);
 * distributed under the License is distributed on an "AS IS" BASIS,
    
            
            while (scanner.hasNextLine()) {
//                result.getErrors().printToStderr();
//                System.err.println();
                        sb.append(line).append(" \n");
    }
        }
//            Assert.assertTrue(ierrs.isEmpty());
            var tree = pp.sqlQuery();

import java.util.Scanner;
package org.jkiss.dbeaver.model.lsm.test;
            tokens.fill();
 * See the License for the specific language governing permissions and
            var noErrors = pp.getNumberOfSyntaxErrors() == 0;
 * limitations under the License.
        
 * Copyright (C) 2010-2024 DBeaver Corp and others
public class ParseSelectStmtTest extends DBeaverUnitTest {
                String line = scanner.nextLine();
            }
            
            
import java.util.LinkedList;

                }
    private static List<String> readStatements(InputStream stream) {
        
//                System.err.println(model.stringify(result.getModel()));
 * you may not use this file except in compliance with the License.
import org.jkiss.junit.DBeaverUnitTest;
                } else if (sb.toString().trim().length() > 0) {
    @Test
 *
 */
    private static final String _selectStatementsSqlTextResourceName = "SelectStatements.sql.txt";
//            if (!ierrs.isEmpty()) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
        }
        try (Scanner scanner = new Scanner(stream)) {
        
//
            if (!noErrors) {
//                ierrs.printToStderr();
            var pp = new SQLStandardParser(tokens);
                System.err.println();
                    sb.setLength(0);
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
//            var ierrs = model.introduce(SelectStatement.class);
import org.junit.Assert;
import org.antlr.v4.runtime.CharStreams;
 * Unless required by applicable law or agreed to in writing, software
import java.io.IOException;
        var statementsToParse = readStatements(ParseSelectStmtTest.class.getResourceAsStream(_selectStatementsSqlTextResourceName));
        List<String> result = new LinkedList<>();
//                System.err.println();
        return result;
                    }
 * DBeaver - Universal Database Manager
                tokens.getTokens().forEach(t -> System.err.println(t.toString() + " - " + ll.getVocabulary().getSymbolicName(t.getType())));
    
            var tokens = new CommonTokenStream(ll);
import java.util.List;
        for (String stmtText : statementsToParse) {
                    result.add(sb.toString());
 * You may obtain a copy of the License at
//            }
}
                if (trimmed.length() > 0) {
                String trimmed = line.trim();
import org.jkiss.dbeaver.model.lsm.sql.impl.syntax.SQLStandardParser;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
            var ll = new SQLStandardLexer(input);
            var input = CharStreams.fromString(stmtText);
    public void testModel() throws IOException {
import org.junit.Test;
                
//
//            var result = model.map(tree, SelectStatement.class);
            Assert.assertTrue(noErrors);
            StringBuilder sb = new StringBuilder();
import java.io.InputStream;
                System.err.println();
//            Assert.assertTrue(result.isNoErrors());
import org.antlr.v4.runtime.CommonTokenStream;
//            SyntaxModel model = new SyntaxModel(pp);
//            }
            
                    if (!(trimmed.startsWith("#") || trimmed.startsWith("--"))) {
    }
//            if (!result.isNoErrors()) {
import org.jkiss.dbeaver.model.lsm.sql.impl.syntax.SQLStandardLexer;
            }
