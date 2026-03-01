

 */
/*
 *
        return visitor.visitCapture(this, arg);
 * limitations under the License.

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2025 DBeaver Corp and others
        sb.append("$");
        super(string, type, false);
    }
public class CaptureTokenPredicateNode extends SQLTokenEntry {
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.key = key;
    @NotNull
    protected <T, R> R applyImpl(@NotNull TokenPredicateNodeVisitor<T, R> visitor, @NotNull T arg) {
 */
        return super.format(sb);
 *
 * DBeaver - Universal Database Manager



}
    }
    public final String key;
    @Override
 * Unless required by applicable law or agreed to in writing, software
/**
 *
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.model.sql.parser.tokens.predicates;
import org.jkiss.code.Nullable;
    public StringBuilder format(@NotNull StringBuilder sb) {
    @Override
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLTokenType;
    public CaptureTokenPredicateNode(@Nullable String string, @Nullable SQLTokenType type, @NotNull String key) {
 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Represents node of token predicate capable of capturing matching text parts
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    @NotNull
 * You may obtain a copy of the License at
    @NotNull
