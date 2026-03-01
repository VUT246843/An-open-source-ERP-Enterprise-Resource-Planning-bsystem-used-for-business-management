/*

	public final static String XML_COMMENT = "__xml_comment"; //$NON-NLS-1$
 *
		IPredicateRule[] rules = new IPredicateRule[2];
public class XMLPartitionScanner extends RuleBasedPartitionScanner {
		rules[0] = new MultiLineRule("<!--", "-->", xmlComment);  //$NON-NLS-1$//$NON-NLS-2$
}
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 * DBeaver - Universal Database Manager

	public final static String XML_TAG = "__xml_tag"; //$NON-NLS-1$
package org.jkiss.dbeaver.ui.editors.xml;
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
	public static final String XML_PARTITIONING= "__xml_partitioning"; //$NON-NLS-1$
	public XMLPartitionScanner() {
import org.eclipse.jface.text.rules.*;
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
		rules[1] = new XMLTagRule(tag);

 * See the License for the specific language governing permissions and
 * limitations under the License.
		setPredicateRules(rules);

	}

 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others
	public final static String XML_DEFAULT = "__xml_default"; //$NON-NLS-1$

		IToken tag = new Token(XMLPartitionScanner.XML_TAG);


		IToken xmlComment = new Token(XMLPartitionScanner.XML_COMMENT);

