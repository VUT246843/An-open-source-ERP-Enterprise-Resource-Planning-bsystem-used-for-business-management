    private int obtainTokenId(@NotNull String str) {
 *
    private final List<String> tokenStringById = new ArrayList<>();   
 */
                                       @NotNull String tailToken, @Nullable String tailEndToken) {
        Integer id = tokenIdByString.get(str);
                completionParts, 
    
           .computeIfAbsent(info.getTailEndTokenId(), n -> new HashSet<>())
        return tokenIdByString.get(str);
        if (headToken == null || completionParts == null || tailToken == null) {
     * @param tailToken is a  beginning token of the block end.
                // token that shouldn't precede  the block begin token (example: END for block LOOP .. END LOOP)
 * Copyright (C) 2010-2024 DBeaver Corp and others
    /**

     */
    
        return tokenStringById.get(id - KNOWN_TOKEN_ID_BASE);
     * @param tailEndToken - last token of the block.
     * @param headToken is a beginning token of the block.
     */
    }
        
    }
           .add(info);
            id = tokenStringById.size() + KNOWN_TOKEN_ID_BASE;
        if (id == null) {
    
import org.jkiss.code.NotNull;
    }
    /**
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    /**
     * Completion part can be a String,
    }
    }
    /**
            NEW_LINE_COMPLETION_PART, ONE_INDENT_COMPLETION_PART, NEW_LINE_COMPLETION_PART, tailToken + " " + tailEndToken, NEW_LINE_COMPLETION_PART
            throw new IllegalArgumentException("Illegal block completion info. headToken, completionParts and tailToken are mandatory.");
    
    @Nullable

     */
 * See the License for the specific language governing permissions and
import java.util.function.Predicate;
     * @param completionParts is an array of strings which should be inserted on autoedit.
 * you may not use this file except in compliance with the License.
     */
 */
        }, tailToken, tailEndToken);
 *     http://www.apache.org/licenses/LICENSE-2.0
                                             @NotNull String tailToken, @Nullable String tailEndToken, @Nullable String prevCancelToken) {
    private static final Predicate<String> RECOGNIZABLE_TOKEN_PATTERN = Pattern.compile("^\\w+$").asMatchPredicate();
package org.jkiss.dbeaver.ui.editors.sql.indent;
/**
                this,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    

    public Integer findTokenId(@NotNull String str) {
public class SQLBlockCompletionsCollection implements SQLBlockCompletions {
        return id;
            NEW_LINE_COMPLETION_PART, ONE_INDENT_COMPLETION_PART, NEW_LINE_COMPLETION_PART, tailToken, NEW_LINE_COMPLETION_PART
     * Register block for autoedit containing token at the begin and two tokens at the end (e.g. LOOP .. END LOOP).
        this.registerCompletionInfo(headToken, new String[] {
import org.jkiss.code.Nullable;
     * SQLBlockCompletions.ONE_INDENT_COMPLETION_PART - indentation,

        SQLBlockCompletionInfo info = new SQLBlockCompletionInfo(
import java.util.regex.Pattern;
    public void registerCompletionPair(@NotNull String headToken, @NotNull String tailToken) {

        this.registerBlockCompletionInfo(headToken, completionParts, tailToken, tailEndToken, headToken.equalsIgnoreCase(tailEndToken) ? tailToken : null);

    
    public SQLBlockCompletionInfo findCompletionByHead(int headTokenId) {
        if (!RECOGNIZABLE_TOKEN_PATTERN.test(str)) {
        
                obtainTokenId(headToken), 
/*
    }
            throw new IllegalArgumentException("Illegal block completion part '" + str + "' while expecting keyword-like token.");
    public void registerCompletionInfo(@NotNull String headToken, @NotNull String[] completionParts,
        this.blockCompletionByTailToken.computeIfAbsent(info.getTailTokenId(), n -> new HashMap<>())
 * distributed under the License is distributed on an "AS IS" BASIS,
     * @param tailToken - first token of the block end.
     * Get token id for token string.
            tokenStringById.add(str);
                tailEndToken == null ? null : obtainTokenId(tailEndToken),
 * A set of information about blocks for autoedit strategy.
    private final Map<Integer, SQLBlockCompletionInfo> blockCompletionByHeadToken = new HashMap<>();
        }
 * You may obtain a copy of the License at
        return blockCompletionByHeadToken.get(headTokenId);
        }
     * Register block for autoedit containing token at the begin, middle token and one or two tokens at the end (e.g. IF .. THEN .. END IF).
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
        );
     * Get SQLBlockCompletionInfo by block beginning token id.
 *
        }, tailToken, null, null);
     * Register block for autoedit containing token at the begin and token at the end (e.g. BEGIN .. END).
import java.util.*;
                prevCancelToken == null ? null : obtainTokenId(prevCancelToken) 
     * If token has't been registered yet, id will be generated.
    @Nullable
            tokenIdByString.put(str, id);
        this.registerBlockCompletionInfo(headToken, new String[] {
        }
                obtainTokenId(tailToken),

}
 * DBeaver - Universal Database Manager
     */
     * SQLBlockCompletions.NEW_LINE_COMPLETION_PART - new line.
    
     * @param tailEndToken - last token of the block end.
    public String findTokenString(int id) {
     * @param tailToken is an ending token of the block
    /**
    private final Map<String, Integer> tokenIdByString = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
     * @param headToken is a beginning token of the block
    @Nullable
    private final Map<Integer, Map<Integer, Set<SQLBlockCompletionInfo>>> blockCompletionByTailToken = new HashMap<>();
    
     * @param headToken is a beginning token of the block.
        this.blockCompletionByHeadToken.put(info.getHeadTokenId(), info);

    public void registerCompletionPair(@NotNull String headToken, @NotNull String tailToken, @NotNull String tailEndToken) {
    private void registerBlockCompletionInfo(@NotNull String headToken, @NotNull String[] completionParts,
    }
    }
