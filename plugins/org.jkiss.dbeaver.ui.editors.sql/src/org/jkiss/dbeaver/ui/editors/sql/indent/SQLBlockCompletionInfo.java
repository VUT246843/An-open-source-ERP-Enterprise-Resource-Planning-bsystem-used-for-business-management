 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
    /**
    private final Integer headCancelTokenId;

package org.jkiss.dbeaver.ui.editors.sql.indent;
import org.jkiss.utils.CommonUtils;
    public Integer getHeadCancelTokenId() {
        this.tailEndTokenId = tailEndTokenId;
        return tailEndTokenId;
    @NotNull

        return tokenId == null ? "<UNBOUND>" : CommonUtils.notNull(owner.findTokenString((int)tokenId), "<UNKNOWN TOKEN ID #" + tokenId + ">");
    private final SQLBlockCompletionsCollection owner;
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return headTokenId;

    private String getTokenString(Integer tokenId) {
    private final String[] completionParts;
     * @param completionParts - array of strings which should be inserted on autoedit
}
 * DBeaver - Universal Database Manager
    }
            getTokenString(headTokenId) + " ... " + getTokenString(tailTokenId) + " " + getTokenString(tailEndTokenId);
        this.headCancelTokenId = prevCancelTokenId;
        this.completionParts = completionParts;
        return headCancelTokenId;
    @Nullable
        return completionParts;
    }

    }
    public SQLBlockCompletionInfo(@NotNull SQLBlockCompletionsCollection owner, int headTokenId, @Nullable String[] completionParts,
 *
        return (headCancelTokenId == null ? "" : ("[! " + getTokenString(headCancelTokenId) + "]")) +
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
     * @param tailTokenId - id of the first token of the block end
    public int getTailTokenId() {
    private final Integer tailEndTokenId;

    @Nullable
    private final int tailTokenId;

    @Nullable
    }
     * @param prevCancelTokenId - token that shouldn't precede the block begin token
import org.jkiss.code.NotNull;

    public Integer getTailEndTokenId() {
        this.tailTokenId = tailTokenId;
 * limitations under the License.
     * @param headTokenId - id of the beginning token of the block.
    public String toString() {
    }
 */
    }
        this.headTokenId = headTokenId;
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.owner = owner;
     * Completion part can be a String, SQLBlockCompletions.ONE_INDENT_COMPLETION_PART - indentation, SQLBlockCompletions.NEW_LINE_COMPLETION_PART - new line.
    }
    @NotNull
    }
        return tailTokenId;
     * @param tailEndTokenId - id of the last token of the block end
                                  int tailTokenId, @Nullable Integer tailEndTokenId, @Nullable Integer prevCancelTokenId) {
    public int getHeadTokenId() {
     * @param owner - SQLBlockCompletionsCollection where SQLBlockCompletionInfo is registered
 * Unless required by applicable law or agreed to in writing, software

 *     http://www.apache.org/licenses/LICENSE-2.0

    public String[] getCompletionParts() {

    @Override
import org.jkiss.code.Nullable;
     */
public class SQLBlockCompletionInfo {


 * See the License for the specific language governing permissions and
    private final int headTokenId;
/*
