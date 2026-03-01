 *

 * you may not use this file except in compliance with the License.
 *

 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
public class MultiLineRule extends PatternRule {

	public MultiLineRule(String startSequence, String endSequence, TPToken token, char escapeCharacter) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
	}
}
	}
		this(startSequence, endSequence, token, (char) 0);
	public MultiLineRule(String startSequence, String endSequence, TPToken token, char escapeCharacter, boolean breaksOnEOF) {
		this(startSequence, endSequence, token, escapeCharacter, false);
 * multiple lines.
 * A rule for detecting patterns which begin with a given
 * Copyright (C) 2010-2024 DBeaver Corp and others

/**
 *
	}
 * Licensed under the Apache License, Version 2.0 (the "License");
	public MultiLineRule(String startSequence, String endSequence, TPToken token) {
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
 * sequence and may end with a given sequence thereby spanning
package org.jkiss.dbeaver.model.text.parser.rules;
 * You may obtain a copy of the License at


import org.jkiss.dbeaver.model.text.parser.TPToken;
		super(startSequence, endSequence, token, escapeCharacter, false, breaksOnEOF);
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
 */
