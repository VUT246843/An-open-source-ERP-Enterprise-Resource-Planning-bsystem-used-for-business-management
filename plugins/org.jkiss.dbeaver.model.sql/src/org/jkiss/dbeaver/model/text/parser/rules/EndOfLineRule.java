	 * the line.
	 * immediately before an end of line can be set to continue
	 * this rule was terminated by reaching line delimiter, then that line
		this(startSequence, token, (char) 0);
	 * @param excludeLineDelimiter  indicates whether the line delimiter should be included into produced token or not
	 * @param startSequence the pattern's start sequence

	 * @since 3.0
 * whereby the pattern begins with a specific sequence but
	public EndOfLineRule(String startSequence, TPToken token, char escapeCharacter, boolean escapeContinuesLine, boolean excludeLineDelimiter) {
	/**
/*
	 * delimiter will be included into produced token
 */
	 * @param escapeCharacter the escape character

	 * @param escapeContinuesLine indicates whether the specified escape
	 *        terminate the line, even if <code>breakOnEOL</code> is true
	 * which, if detected, will return the specified token.
	 * Any character which follows the given escape character
}
	 * @param startSequence the pattern's start sequence
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
	 * @param escapeCharacter the escape character
/**
 *
 */

	 * Creates a rule for the given starting sequence
	 * immediately before an end of line can be set to continue
	 *        line immediately after the escape character does not
 * Copyright (C) 2010-2024 DBeaver Corp and others
	 * Creates a rule for the given starting sequence
 * you may not use this file except in compliance with the License.
	 * Any character which follows the given escape character
 * distributed under the License is distributed on an "AS IS" BASIS,
	public EndOfLineRule(String startSequence, TPToken token) {
	 * which, if detected, will return the specified token.
import org.jkiss.dbeaver.model.text.parser.TPToken;
	public EndOfLineRule(String startSequence, TPToken token, char escapeCharacter, boolean escapeContinuesLine) {
	/**
	 * the line.
	 * will be ignored. In addition, an escape character
	 *        character is used for line continuation, so that an end of
	 *        character is used for line continuation, so that an end of
	 * @param token the token to be returned on success
	 * @param token the token to be returned on success
 * is only ended by a line delimiter.
	/**
	public EndOfLineRule(String startSequence, TPToken token, char escapeCharacter) {
	 * @param startSequence the pattern's start sequence
	 * @param token the token to be returned on success

 *     http://www.apache.org/licenses/LICENSE-2.0
	 */
	 * @param escapeContinuesLine indicates whether the specified escape
	 * If <code>excludeLineDelimiter</code> flag is set to <code>true</code> and
		super(startSequence, null, token, escapeCharacter, true);
 * Licensed under the Apache License, Version 2.0 (the "License");
	 * Any character which follows the given escape character
	 */
	 * which, if detected, will return the specified token.
		super(startSequence, null, token, escapeCharacter, true, escapeContinuesLine, excludeLineDelimiter);
	 * @param startSequence the pattern's start sequence
	 * Creates a rule for the given starting sequence
		super(startSequence, null, token, escapeCharacter, true, escapeContinuesLine);
	 * will be ignored.
	 *        line immediately after the escape character does not
 * A specific configuration of a single line rule

	 *        terminate the line, even if <code>breakOnEOL</code> is true
 *
	 *
	 * will be ignored. In addition, an escape character
	}
	 * Creates a rule for the given starting sequence
	 */
	 *
 * You may obtain a copy of the License at
	}
	}
	 *
	/**
	 * @param escapeCharacter the escape character
 * DBeaver - Universal Database Manager
	}
	 * @param token the token to be returned on success
package org.jkiss.dbeaver.model.text.parser.rules;
	 * @since 7.2.5

public class EndOfLineRule extends SingleLineRule {
	 *
 * limitations under the License.

 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
	 */
	 * which, if detected, will return the specified token.
