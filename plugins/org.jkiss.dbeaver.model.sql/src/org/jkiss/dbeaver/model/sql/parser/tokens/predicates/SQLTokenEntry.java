    public StringBuilder format(@NotNull StringBuilder sb) {

 * DBeaver - Universal Database Manager


    }
    @Override
        boolean stringEquals = (this.getString() == null && other.getString() == null) || (this.getString() != null && other.getString() != null && this.getString().equals(other.getString()));
        return this == o || (o instanceof TokenEntry && this.equals((TokenEntry)o));
 * Implements representation of information about the SQL token in the text.
    private final boolean isInverted;
    protected <T, R> R applyImpl(@NotNull TokenPredicateNodeVisitor<T, R> visitor, @NotNull T arg) {
    }
 * See the License for the specific language governing permissions and
    public boolean isInverted() {
    @Override
        return this.type;
    private final String string;
        return this.isInverted;

        if (this.isInverted) {

/**
        boolean result = stringMatches && typeMatches;

    @NotNull
 */
            sb.append("!");
    public String getString() {
    @Override
import java.util.Objects;
    public boolean equals(@NotNull TokenEntry other) {
        this.type = type;
        return stringEquals && typeEquals && invertedEquals;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Nullable
 *
 *
import org.jkiss.code.NotNull;
        if (this.isInverted) {
    }

        return result; 
}
/*
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    public boolean matches(@NotNull TokenEntry other) {


    }
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLTokenType;
 * limitations under the License.
    private final SQLTokenType type;
 * you may not use this file except in compliance with the License.
 */
    public int hashCode() {
    @Nullable
import org.jkiss.dbeaver.model.sql.parser.TokenEntry;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public boolean equals(Object o) {
    public SQLTokenType getTokenType() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Any member can be null if represents partial information in case of placeholder in the predicate.

    @Override
    @Override
 *

        return Objects.hash(this.getString(), this.getTokenType(), this.isInverted());
        boolean typeEquals = (this.getTokenType() == null && other.getTokenType() == null) || (this.getTokenType() != null && other.getTokenType() != null && this.getTokenType().equals(other.getTokenType()));
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
        return this.string;
        }
    @Override
        return visitor.visitTokenEntry(this, arg);
    }

        boolean typeMatches = this.getTokenType() == null || other.getTokenType() == null || this.type.equals(other.getTokenType());
package org.jkiss.dbeaver.model.sql.parser.tokens.predicates;
        this.isInverted = isInverted;
    }
    @NotNull
 * Unless required by applicable law or agreed to in writing, software

        boolean stringMatches = this.getString() == null || other.getString() == null || this.string.equalsIgnoreCase(other.getString());
    }
    }
            result = !result;
        boolean invertedEquals = this.isInverted() == other.isInverted();
                .append(this.string != null ? "'" + this.string + "'" : "any");
        this.string = string;
 * You may obtain a copy of the License at
import org.jkiss.code.Nullable;
public class SQLTokenEntry extends TokenPredicateNode implements TokenEntry {
    
        return sb.append("<").append(type != null ? type.name() : "?").append(">")
    public SQLTokenEntry(@Nullable String string, @Nullable SQLTokenType type, boolean isInverted) {
