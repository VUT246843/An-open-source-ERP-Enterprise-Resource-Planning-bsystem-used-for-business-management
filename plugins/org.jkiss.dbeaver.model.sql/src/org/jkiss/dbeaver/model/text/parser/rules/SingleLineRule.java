	 * line can also be ended with the end of the file.
	 * @param endSequence the pattern's end sequence

 * limitations under the License.

	 * line can also be ended with the end of the file.
	 * will be ignored. In addition, an escape character immediately before an
	 * @param endSequence the pattern's end sequence
	 * @param breaksOnEOF indicates whether the end of the file successfully terminates this rule
	 *
	 * end of line can be set to continue the line.
	 * @param escapeCharacter the escape character
	 * @param token the token to be returned on success
	 *        terminate the line, even if <code>breakOnEOL</code> is true
 * end with a specific sequence, but will not span more
		super(startSequence, endSequence, token, escapeCharacter, true, breaksOnEOF, escapeContinuesLine);
 */
	 * will be ignored.
	 * which, if detected, will return the specified token. Alternatively, the
	 * @param endSequence the pattern's end sequence
	 * @since 2.1
	public SingleLineRule(String startSequence, String endSequence, TPToken token, char escapeCharacter, boolean breaksOnEOF) {
	 */
	 * @param token the token to be returned on success
	 * @param escapeCharacter the escape character
	 * will be ignored.
	/**
	/**
	 * which, if detected, will return the specified token.
 * Copyright (C) 2010-2024 DBeaver Corp and others
	 * Any character which follows the given escape character
	 * @param endSequence the pattern's end sequence
	public SingleLineRule(String startSequence, String endSequence, TPToken token, char escapeCharacter, boolean breaksOnEOF, boolean escapeContinuesLine) {
	 *        continuation, so that an end of line immediately after the escape character does not
import org.jkiss.dbeaver.model.text.parser.TPToken;
	 * will be ignored. In addition, an escape character immediately before an
 * See the License for the specific language governing permissions and
	 * @param breaksOnEOF indicates whether the end of the file successfully terminates this rule
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
	 * @param excludeLineDelimiter  indicates whether the line delimiter should be included into produced token or not
	 * end of line can be set to continue the line.

	/**
	 * @param endSequence the pattern's end sequence
	 * this rule was terminated by reaching line delimiter, then that line
	 * @param breaksOnEOF indicates whether the end of the file successfully terminates this rule
	}
	 */
 *
public class SingleLineRule extends PatternRule {
	/**

 *     http://www.apache.org/licenses/LICENSE-2.0
	 * @param escapeContinuesLine indicates whether the specified escape character is used for line
	 * @param startSequence the pattern's start sequence
	 * @param escapeCharacter the escape character
	 * Creates a rule for the given starting and ending sequence
	 * @param token the token to be returned on success
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	 * Any character which follows the given escape character
	 *
	 *
	 * @param token the token to be returned on success
 * the pattern begins with a specific sequence and may
 */
	 *        continuation, so that an end of line immediately after the escape character does not
	 * delimiter will be included into produced token
 *
	 * @param startSequence the pattern's start sequence
/*
	 *
	 * @since 3.0
 * than a single line.
	 * Creates a rule for the given starting and ending sequence
	/**
	 * which, if detected, will return the specified token.
		this(startSequence, endSequence, token, (char) 0);
	 * If <code>excludeLineDelimiter</code> flag is set to <code>true</code> and
	}
 * you may not use this file except in compliance with the License.
	 * Creates a rule for the given starting and ending sequence
	 * @param startSequence the pattern's start sequence
	 * @param escapeContinuesLine indicates whether the specified escape character is used for line
	 * which, if detected, will return the specified token. Alternatively, the

 * distributed under the License is distributed on an "AS IS" BASIS,
	 *
		this(startSequence, endSequence, token, escapeCharacter, false);
	 * Any character which follows the given escape character
	 * @param token the token to be returned on success
package org.jkiss.dbeaver.model.text.parser.rules;
	}
	 * @param startSequence the pattern's start sequence
	public SingleLineRule(String startSequence, String endSequence, TPToken token) {
	 * which, if detected, will return the specified token. Alternatively, the
	 */
	public SingleLineRule(String startSequence, String endSequence, TPToken token, char escapeCharacter, boolean breaksOnEOF, boolean escapeContinuesLine, boolean excludeLineDelimiter) {

	}
	 *        terminate the line, even if <code>breakOnEOL</code> is true
/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 *

		super(startSequence, endSequence, token, escapeCharacter, true, breaksOnEOF);
 * A specific configuration of pattern rule whereby
		super(startSequence, endSequence, token, escapeCharacter, true, breaksOnEOF, escapeContinuesLine, excludeLineDelimiter);
	 */
	public SingleLineRule(String startSequence, String endSequence, TPToken token, char escapeCharacter) {
	 * @param startSequence the pattern's start sequence
	 * @since 7.2.5
	 * Creates a rule for the given starting and ending sequence
	 * Creates a rule for the given starting and ending sequence
	 * line can also be ended with the end of the file.
	 * @param escapeCharacter the escape character
}
 * You may obtain a copy of the License at

	 */
	}
	 * Any character which follows the given escape character
