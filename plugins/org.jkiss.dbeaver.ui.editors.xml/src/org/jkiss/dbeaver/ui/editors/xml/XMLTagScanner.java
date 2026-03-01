import org.eclipse.jface.text.TextAttribute;

 *
/*
import org.eclipse.jface.text.rules.*;

		// Add generic whitespace rule.
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
		setRules(rules);
package org.jkiss.dbeaver.ui.editors.xml;
	}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
		IRule[] rules = new IRule[3];

			new Token(
 */

				new TextAttribute(manager.get(XMLSourceViewerConfiguration.COLOR_XML_STRING)));
 *     http://www.apache.org/licenses/LICENSE-2.0
public class XMLTagScanner extends RuleBasedScanner {

 *
		// Add rule for double quotes
		// Add a rule for single quotes
		rules[2] = new WhitespaceRule(new TextWhiteSpaceDetector());
	XMLTagScanner(ColorRegistry manager) {
 * Copyright (C) 2010-2024 DBeaver Corp and others

		rules[1] = new SingleLineRule("'", "'", string, '\\'); //$NON-NLS-1$ //$NON-NLS-2$
 * limitations under the License.

 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.editors.text.TextWhiteSpaceDetector;
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.jface.resource.ColorRegistry;
		IToken string =
}
 * you may not use this file except in compliance with the License.
		rules[0] = new SingleLineRule("\"", "\"", string, '\\'); //$NON-NLS-1$ //$NON-NLS-2$
