/*
 *
		IToken jsonStringToken = new Token(JSONPartitionScanner.JSON_STRING);
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
 */

 * You may obtain a copy of the License at
 *

	}
	public static final String JSON_PARTITIONING= "__json_partitioning"; //$NON-NLS-1$

}
package org.jkiss.dbeaver.ui.editors.json;


		IPredicateRule[] rules = new IPredicateRule[1];
 * you may not use this file except in compliance with the License.

 * distributed under the License is distributed on an "AS IS" BASIS,
	public JSONPartitionScanner() {
 * Licensed under the Apache License, Version 2.0 (the "License");

 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
		setPredicateRules(rules);
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.jface.text.rules.*;
		//rules[0] = new MultiLineRule("'", "'", jsonString, '\\'); //$NON-NLS-2$ //$NON-NLS-1$
	public final static String JSON_STRING = "__json_string"; //$NON-NLS-1$
 *     http://www.apache.org/licenses/LICENSE-2.0
public class JSONPartitionScanner extends RuleBasedPartitionScanner {
		rules[0] = new MultiLineRule("\"", "\"", jsonStringToken, '\\'); //$NON-NLS-2$ //$NON-NLS-1$
