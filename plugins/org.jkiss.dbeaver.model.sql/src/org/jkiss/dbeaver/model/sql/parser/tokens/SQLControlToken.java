 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
 *
 * You may obtain a copy of the License at

 * you may not use this file except in compliance with the License.

    public SQLControlToken(String commandId) {
    public String getCommandId() {
    private final String commandId;
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
 *
 *
 * Control tokens are used for local SQL script evaluation.

}
     * Command ID or null if command id is in the token itself
 *     http://www.apache.org/licenses/LICENSE-2.0
     */
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * <p>
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.text.parser.TPTokenDefault;
 * SQLControlToken
 */
    }

 * DBeaver - Universal Database Manager
public class SQLControlToken extends TPTokenDefault {
/**
    /**
    }

/*
 * See the License for the specific language governing permissions and
        return commandId;
        super(SQLTokenType.T_CONTROL);
        this(null);

    public SQLControlToken() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        this.commandId = commandId;
package org.jkiss.dbeaver.model.sql.parser.tokens;

