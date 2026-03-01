package org.jkiss.dbeaver.ui.editors.xml;
		return super.sequenceDetected(scanner, sequence, eofAllowed);
	}
				// processing instruction - abort
/*
 * See the License for the specific language governing permissions and
			}
	}
}
 */
		} else if (sequence[0] == '>') {
 *

import org.eclipse.jface.text.rules.IToken;
			if (c == '?') {
				return false;
import org.eclipse.jface.text.rules.MultiLineRule;
		if (sequence[0] == '<') {

 * you may not use this file except in compliance with the License.
				// comment - abort
			scanner.unread();
		boolean eofAllowed) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
		}
 * Licensed under the Apache License, Version 2.0 (the "License");
			if (c == '!') {
    protected boolean sequenceDetected(
	@Override
				return false;

		super("<", ">", token);  //$NON-NLS-1$//$NON-NLS-2$
				scanner.unread();
 *
				scanner.unread();
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
		int c = scanner.read();
		ICharacterScanner scanner,
		char[] sequence,
 * You may obtain a copy of the License at
			}
 *     http://www.apache.org/licenses/LICENSE-2.0

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	public XMLTagRule(IToken token) {
 * limitations under the License.
import org.eclipse.jface.text.rules.ICharacterScanner;
public class XMLTagRule extends MultiLineRule {
