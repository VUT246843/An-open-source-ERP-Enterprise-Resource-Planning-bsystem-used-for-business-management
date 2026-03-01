                seq -> seq.stream().map(t -> t.getString()).collect(Collectors.toList())

        TokenPredicateNode predicate = tt.sequence(
/*
    private Set<List<String>> makeTestPredicateSequences() {
import org.jkiss.dbeaver.model.sql.parser.tokens.predicates.TokenPredicateFactory;
import org.junit.Test;
public class TokenPredicatesConditionTest extends DBeaverUnitTest {
 * DBeaver - Universal Database Manager


                List.of("CREATE", "PACKAGE", "BODY"),
                List.of("CREATE", "OR", "REPLACE", "NONEDITIONABLE", "PACKAGE", "BODY")
import java.util.stream.Collectors;

            tt.optional(tt.alternative("EDITIONABLE", "NONEDITIONABLE")),

        ).collect(Collectors.toSet());
        // build a predicate tree describing some sequence of tokens
        // expand the tree into a set of plain token sequences and map token entries to strings
        Assert.assertEquals(expectedSequences, computedSequences);
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and
import java.util.List;
 * Unless required by applicable law or agreed to in writing, software

 * Licensed under the Apache License, Version 2.0 (the "License");

 *
 */

        Set<List<String>> computedSequences = tree.expand().stream().map(
 *

    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Test
    public void expandExpression() {
 * limitations under the License.
                List.of("CREATE", "NONEDITIONABLE", "PACKAGE", "BODY"),
}
        // expected path sequences to be described by given predicate
 * distributed under the License is distributed on an "AS IS" BASIS,
        );
 *
import org.junit.Assert;
    }

            "CREATE",
        TokenPredicateNode tree = this.makeTestPredicateTree();
                List.of("CREATE", "OR", "REPLACE", "PACKAGE", "BODY"),
import org.jkiss.junit.DBeaverUnitTest;
package org.jkiss.dbeaver.model.sql.parser;
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
            tt.optional("OR", "REPLACE"),
        return predicate;
            "PACKAGE", "BODY"
    }
        return Set.of(

                List.of("CREATE", "EDITIONABLE", "PACKAGE", "BODY"),
        TokenPredicateFactory tt = TokenPredicateFactory.makeDefaultFactory();
import java.util.Set;
        );
        Set<List<String>> expectedSequences = this.makeTestPredicateSequences();
import org.jkiss.dbeaver.model.sql.parser.tokens.predicates.TokenPredicateNode;
 * You may obtain a copy of the License at
    private TokenPredicateNode makeTestPredicateTree() {
                List.of("CREATE", "OR", "REPLACE", "EDITIONABLE", "PACKAGE", "BODY"),
