
 * you may not use this file except in compliance with the License.

 * Licensed under the Apache License, Version 2.0 (the "License");
public abstract class TokenPredicateFactory {
     * @return new instance of CaptureTokenPredicateNode
    public TokenPredicateNode not(@NotNull String str) {
    public TokenPredicateNode sequence(@NotNull Object ... objs) {
            return new SQLTokenEntry(null, (SQLTokenType) obj, false);

    }
    @NotNull
    @NotNull
        return new AlternativeTokenPredicateNode(this.makeGroup(objs));
/*
 */
     * Create predicate node able to capture parts of the text by the key
    public TokenPredicateNode alternative(@NotNull Object ... objs) {
        return new CaptureTokenPredicateNode(null, this.classifyToken(exampleString), key);
        return new SQLTokenEntry(str, this.classifyToken(str), true);
        return new SQLTokenPredicateFactory(ruleManager);
    public TokenPredicateNode optional(@NotNull TokenPredicateNode node) {
    private TokenPredicateNode makeNode(@Nullable Object obj) {
    @NotNull
     * @param key - the key in the rule to capture token text
     * @return predicate node carrying information about the token entry


 * The producer of all predicate nodes responsible for exact string token entries classification according to dialect.
    }

     * Create predicate node able to capture parts of the text by the key
 * <ul>
 * <p>
        return new SequenceTokenPredicateNode(this.makeGroup(objs));
    }
 * See the License for the specific language governing permissions and
 */
        } else if (obj instanceof TokenPredicateNode) {
            return (TokenPredicateNode) obj;
 *     <li>{@literal null} - entry corresponding to any token
    @NotNull
     *
 * </p>
    }
     * Materialize token predicate node describing given token string with a dialect-specific token type classification
 *
     * Create predicate node able to capture parts of the text by the key
    public TokenPredicateNode sequence(@NotNull TokenPredicateNode ... nodes) {
    /**
 *     <li>{@link String} - entry corresponding to the exact token
    @NotNull

    private TokenPredicateNode[] makeGroup(@NotNull Object ... objs) {
 *
 * You may obtain a copy of the License at
/**
     */
     * @param tokenString to classify
        return new CaptureTokenPredicateNode(string, this.classifyToken(string), key);
        } else {
import org.jkiss.code.NotNull;
     */
 * </ul>
     */
        return new SequenceTokenPredicateNode(nodes);
import org.jkiss.code.Nullable;
    @NotNull
    protected TokenPredicateFactory() {
    public static TokenPredicateFactory makeDefaultFactory() {
        return new SQLTokenEntry(null, token, true);
    public TokenPredicateNode not(@NotNull SQLTokenType token) {

    /**
     * @param type - the type of the token
 * DBeaver - Universal Database Manager

     *
    public TokenPredicateNode captureTokenClassifiedAs(@NotNull String exampleString, @NotNull String key) {
     * @param key - the key in the rule to capture token text
        }
    }
        return new CaptureTokenPredicateNode(null, type, key);

        return new OptionalTokenPredicateNode(obj.length == 1 ? this.makeNode(obj[0]) : this.sequence(obj));
 *     http://www.apache.org/licenses/LICENSE-2.0
}     *
        return this.makeNode(obj);
    /**
        if (obj == null) {

    /**
    }
    public TokenPredicateNode captureToken(@NotNull SQLTokenType type, String key) {
     */
    @NotNull
     * @param exampleString - the example value of the token for classification
 * Producing methods accept different possible arguments in any combinations:
    @NotNull
    }
    /**
    protected abstract SQLTokenType classifyToken(@NotNull String tokenString);
    /**

 *     <li>{@link SQLTokenType} - entry corresponding to the any token of given token type
        return new OptionalTokenPredicateNode(node);
 *     <li>{@link TokenPredicateNode} - entry corresponding to the given subsequence of tokens
import org.jkiss.dbeaver.model.sql.parser.SQLRuleManager;
    @NotNull
     * Create dialect-specific {@link TokenPredicateFactory}
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLTokenType;
    }
    }

    @NotNull

 * distributed under the License is distributed on an "AS IS" BASIS,
     */
 * Unless required by applicable law or agreed to in writing, software
    }
    }
    }
     *
        } else if (obj instanceof SQLTokenType) {
    }
    @NotNull
    @NotNull
            return new SQLTokenEntry(null, null, false);
     *

    }
        return new AlternativeTokenPredicateNode(nodes);
        return new DefaultTokenPredicateFactory();
    /**
    public static TokenPredicateFactory makeDialectSpecificFactory(@NotNull SQLRuleManager ruleManager) {


     */
     * @return predicate node carrying information about the token entry
        return Arrays.stream(objs).map(this::makeNode).toArray(TokenPredicateNode[]::new);
     */
     * @param key - the key in the rule to capture token text
    public TokenPredicateNode optional(@NotNull Object ... obj) {
 * Copyright (C) 2010-2025 DBeaver Corp and others

     * @return new instance of CaptureTokenPredicateNode
    @NotNull


    @NotNull
     * @param string - the exact value of the token
    public TokenPredicateNode captureToken(@NotNull String string, String key) {
    @NotNull
     * @param obj some information about the token entry (see {@link TokenPredicateFactory} for the details)
            throw new IllegalArgumentException();

            return new SQLTokenEntry(string, this.classifyToken(string), false);
    public TokenPredicateNode token(@NotNull Object obj) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.Arrays;
     * Materialize token predicate node carrying information about token entry described in a certain way.
    public TokenPredicateNode alternative(@NotNull TokenPredicateNode ... nodes) {
        } else if (obj instanceof String string) {
     * Create dialect-agnostinc {@link TokenPredicateFactory}
    @Nullable
     * @return new instance of CaptureTokenPredicateNode
    }
    @NotNull
 *
package org.jkiss.dbeaver.model.sql.parser.tokens.predicates;
    
 * limitations under the License.
    }
    }

