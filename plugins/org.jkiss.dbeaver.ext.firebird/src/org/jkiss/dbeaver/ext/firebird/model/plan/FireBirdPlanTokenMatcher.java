
	}
 * Licensed under the Apache License, Version 2.0 (the "License");
		}
	private String value;
	void raisePlanTokenException(FireBirdPlanToken expected, FireBirdPlanToken actual) throws FireBirdPlanException {
		throw new FireBirdPlanException(token.toString(), 
	}
 * you may not use this file except in compliance with the License.
 * @author tomashorak@post.cz
	FireBirdPlanToken token;
			}

	
 *     http://www.apache.org/licenses/LICENSE-2.0
	}
				position - value.length(), subject);
	}
	
			raisePlanTokenException(expected, this.token);
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.regex.Matcher;
			Matcher matcher = token.newMatcher(subject);
		} while (token == FireBirdPlanToken.WHITESPACE);
/*
	}
 * Unless required by applicable law or agreed to in writing, software
 */
		if (expected != this.token) {
	
import java.util.ArrayList;
			find();
		}
				value = matcher.group();
		value = "???";
		return;
	void raisePlanTokenException() throws FireBirdPlanException {
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
		for (Matcher matcher: matchers) {
 *
	private Map<Matcher,FireBirdPlanToken> matchertokens = new HashMap<>(FireBirdPlanToken.values().length);
				token = matchertokens.get(matcher);
	}			
		token = FireBirdPlanToken.IDENTIFICATOR;
 * Firebird plan token matcher helps to navigate through plan's text.
	void find() {
/**
		}

	
class FireBirdPlanTokenMatcher {
		return token;
	private List<Matcher> matchers = new ArrayList<>(FireBirdPlanToken.values().length);
	

	void checkToken(FireBirdPlanToken expected) throws FireBirdPlanException {
import java.util.HashMap;
 * Copyright (C) 2010-2024 DBeaver Corp and others
	private String subject;
			matchertokens.put(matcher, token);
				return;
		throw new FireBirdPlanException(expected.toString(), actual.toString(),
 */
		this.subject = subject;
 * See the License for the specific language governing permissions and
		return value;
 *
	}
				position = position + matcher.group().length();
 *
		for (FireBirdPlanToken token: FireBirdPlanToken.values()) {
	String getValue() {
	FireBirdPlanToken getToken() {
import java.util.Map;
import java.util.List;
 * You may obtain a copy of the License at
		return;
 * It can work with whatever's tokens, but is initialized with FireBirdPlan

	void jump() {
}		do {
package org.jkiss.dbeaver.ext.firebird.model.plan;
			matchers.add(matcher);
 *
 * limitations under the License.
 * tokens actually.
	private int position = 0;
				position - value.length(), subject);
			if (matcher.find(position)) {
		super();

	public FireBirdPlanTokenMatcher(String subject) {
	}
