package org.jkiss.dbeaver.ext.athena.model;
/**
 * you may not use this file except in compliance with the License.
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
        return SQLUtils.isLatinLetter(c);
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
 *
public class AthenaSQLDialect extends GenericSQLDialect {
 * limitations under the License.
        return SQLUtils.isLatinLetter(c) || Character.isDigit(c) || c == '_' || (quoted && validCharacters.indexOf(c) != -1);
        super("Athena", "aws_athena");
    }
import org.jkiss.dbeaver.ext.generic.model.GenericSQLDialect;
/*

    public boolean validIdentifierPart(char c, boolean quoted) {
    public boolean validIdentifierStart(char c) {
 * DBeaver - Universal Database Manager
    }

    @Override
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.sql.SQLUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
 * Athena SQL dialect

 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,

}
 */
    // https://docs.aws.amazon.com/athena/latest/ug/tables-databases-columns-names.html#tables-databases-columns-names-complex-types
    public AthenaSQLDialect() {
