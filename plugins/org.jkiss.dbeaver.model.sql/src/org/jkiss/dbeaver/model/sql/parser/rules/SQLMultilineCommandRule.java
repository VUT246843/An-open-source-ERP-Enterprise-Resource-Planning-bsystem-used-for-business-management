 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
public class SQLMultilineCommandRule extends MultiLineRule {
 *
        super.fExcludeLineDelimiter = true;

import org.jkiss.dbeaver.model.sql.registry.SQLCommandHandlerDescriptor;
    }
        super(commandPrefix + controlCommand.getId() + ' ', commandPrefix, controlToken);
 *     http://www.apache.org/licenses/LICENSE-2.0

/*
 * See the License for the specific language governing permissions and
}
import org.jkiss.dbeaver.model.text.parser.rules.MultiLineRule;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public SQLMultilineCommandRule(String commandPrefix, SQLCommandHandlerDescriptor controlCommand, SQLControlToken controlToken) {
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
 *
package org.jkiss.dbeaver.model.sql.parser.rules;
 * You may obtain a copy of the License at

 */
import org.jkiss.dbeaver.model.sql.parser.tokens.SQLControlToken;
 * limitations under the License.
 *
 * Unless required by applicable law or agreed to in writing, software
