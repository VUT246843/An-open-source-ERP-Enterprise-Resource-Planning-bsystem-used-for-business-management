        return pattern;
    private final String name;
        this.variableSet = variableSet;
    }

        return tokenOffset;

        if (pattern.startsWith("${") && pattern.endsWith("}")) {

        } else {
 * You may obtain a copy of the License at
/**
    private static final Pattern VARIABLE_PATTERN_SIMPLE = Pattern.compile("\\$\\{(?<pn>[a-z0-9_.\"]+)\\}", Pattern.CASE_INSENSITIVE);
    public int getTokenLength() {

        }
        return value;
        }
            return VARIABLE_PATTERN_FULL;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    }
        if (supportsJasperSyntax()) {
        this.tokenOffset = tokenOffset;
    public boolean isNamed() {
    private boolean variableSet;
        }
    public String getVarName() {


    public SQLQueryParameter(SQLSyntaxManager syntaxManager, int ordinalPosition, String name, String originalName, int tokenOffset, int tokenLength) {
    }
            }
    public String getName() {

        }
 * DBeaver - Universal Database Manager
    }
        return name;
    private final int tokenOffset;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return true;
    public boolean isVariableSet() {



        return !String.valueOf(syntaxManager.getAnonymousParameterMark()).equals(name);

        this.ordinalPosition = ordinalPosition;
 *
        return name;
    public String getOriginalName() {
        this.value = value;
    public int getOrdinalPosition() {
 * SQL statement parameter info

    @NotNull
        this.previous = previous;
        if (supportsJasperSyntax()) {
        this.originalName = originalName;
    public static Pattern getVariablePattern() {
 * See the License for the specific language governing permissions and
    }
package org.jkiss.dbeaver.model.sql;
}

        if (tokenOffset < 0) {

        this.name = name.trim();
    public void setValue(String value) {
    }
    }

    }
    }
        return getVarName() + "=" + value;
 *

        return variableSet;
    private final int tokenLength;
        return previous;
 * limitations under the License.

        this.syntaxManager = syntaxManager;

import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0

        }
    public int getTokenOffset() {
 * Unless required by applicable law or agreed to in writing, software

        return tokenLength;
    //private static final Pattern VARIABLE_PATTERN_QUOTED = Pattern.compile("\\$\\{(?<pn>\"[a-z0-9_.]+)\"\\}}", Pattern.CASE_INSENSITIVE);
    }
        if (tokenLength < 0) {
    public static final String VARIABLE_NAME_GROUP_NAME = "pn";
    }
    private final int ordinalPosition;
    public void setPrevious(SQLQueryParameter previous) {
    }
    }
/*
    public String getValue() {
            return VARIABLE_PATTERN_SIMPLE;
    }
            } else if (pattern.startsWith("$P!{") && pattern.endsWith("}")) {

    }
        this(syntaxManager, ordinalPosition, name, originalName, 0, 0);
 * Licensed under the Apache License, Version 2.0 (the "License");
    public static boolean supportsJasperSyntax() {
    private SQLQueryParameter previous;
 *
    private static final Pattern VARIABLE_PATTERN_FULL = Pattern.compile("\\$P?!?\\{(?<pn>[a-z0-9_.\"]+)\\}", Pattern.CASE_INSENSITIVE);
 */
        this.tokenLength = tokenLength;

    private final String originalName;
    @Override
    }
    }
        return ordinalPosition;

                return pattern.substring(3, pattern.length() - 1);
    public SQLQueryParameter(SQLSyntaxManager syntaxManager, int ordinalPosition, String name, String originalName) {
 * distributed under the License is distributed on an "AS IS" BASIS,


            if (pattern.startsWith("$P{") && pattern.endsWith("}")) {

 */

public class SQLQueryParameter {
    public void setVariableSet(boolean variableSet) {

    public static String stripVariablePattern(String pattern) {
    public SQLQueryParameter getPrevious() {
            throw new IndexOutOfBoundsException("Bad parameter offset: " + tokenOffset);
    private final SQLSyntaxManager syntaxManager;
            return pattern.substring(2, pattern.length() - 1);
            throw new IndexOutOfBoundsException("Bad parameter length: " + tokenLength);
                return pattern.substring(4, pattern.length() - 1);
        return originalName;
 * you may not use this file except in compliance with the License.
    private String value;
import java.util.regex.Pattern;
    public String toString() {
