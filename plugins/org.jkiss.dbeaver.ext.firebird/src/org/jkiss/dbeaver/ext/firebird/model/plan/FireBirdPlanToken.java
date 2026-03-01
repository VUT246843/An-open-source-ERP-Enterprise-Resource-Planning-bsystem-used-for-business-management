    private FireBirdPlanToken(String regex) {
	UNRECOGNIZED("\\G\\b[^\\s]+\\b");
import java.util.regex.Pattern;

    }
 * DBeaver - Universal Database Manager
 */
    public Matcher newMatcher(String text) {
	IDENTIFICATOR("\\G\\b[\\w$]+\\b"),
enum FireBirdPlanToken {

 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
	SORT("\\GSORT\\b"), 
 */
	ORDER("\\GORDER\\b"), 
 * @author tomashorak@post.cz
        pattern = Pattern.compile(regex);
	JOIN("\\GJOIN\\b"), 
 *
	NATURAL("\\GNATURAL\\b"),
 * Copyright (C) 2010-2024 DBeaver Corp and others
	COMMA("\\G,"),
	WHITESPACE("\\G\\s+"),
	SORT_MERGE("\\GSORT\\w+MERGE\\b"),
/*
        return matcher;
	private final Pattern pattern;
	RIGHTPARENTHESE("\\G\\)"),
} *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	PLAN("\\GPLAN\\b"), 
 * you may not use this file except in compliance with the License.
	HASH("\\GHASH\\b"),
	LEFTPARENTHESE("\\G\\("), 
 * Licensed under the Apache License, Version 2.0 (the "License");

    	Matcher matcher = pattern.matcher(text);
	INDEX("\\GINDEX\\b"), 
    }
    
 * limitations under the License.
	MERGE("\\GMERGE\\b"), 
 * Describes each item of firebird plan as regular expression. Items are used
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ext.firebird.model.plan;
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.regex.Matcher;
    
 *
 * for construction of FireBirdPlanTokenMatcher.
/**
