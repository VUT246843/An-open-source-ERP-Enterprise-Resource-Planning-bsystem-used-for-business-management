		// Add generic whitespace rule.
		IRule[] rules = new IRule[2];
import org.jkiss.dbeaver.ui.editors.text.TextWhiteSpaceDetector;

 * you may not use this file except in compliance with the License.
	XMLScanner(ColorRegistry manager) {
		rules[0] = new SingleLineRule("<?", "?>", procInstr); //$NON-NLS-1$ //$NON-NLS-2$
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
				new TextAttribute(

 * Unless required by applicable law or agreed to in writing, software
	}
		rules[1] = new WhitespaceRule(new TextWhiteSpaceDetector());
			new Token(
		IToken procInstr =
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
		setRules(rules);
import org.eclipse.jface.resource.ColorRegistry;

 * DBeaver - Universal Database Manager
}
 *
package org.jkiss.dbeaver.ui.editors.xml;

		//Add rule for processing instructions
 * limitations under the License.

 */
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.*;
 * Licensed under the Apache License, Version 2.0 (the "License");

					manager.get(XMLSourceViewerConfiguration.COLOR_XML_STRING)));
 * See the License for the specific language governing permissions and
public class XMLScanner extends RuleBasedScanner {
