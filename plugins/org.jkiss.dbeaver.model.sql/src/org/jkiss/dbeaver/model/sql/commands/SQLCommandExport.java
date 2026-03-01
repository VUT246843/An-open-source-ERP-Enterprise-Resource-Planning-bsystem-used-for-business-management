 *     http://www.apache.org/licenses/LICENSE-2.0

        }
import com.google.gson.Gson;
        return SQLControlResult.success();
 * Control command handler

 */
import java.util.Map;
 * limitations under the License.
}
 * You may obtain a copy of the License at
        final Map<String, Object> params;
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
        scriptContext.setPragma(SQLPragmaHandler.PRAGMA_EXPORT, params);


 *
package org.jkiss.dbeaver.model.sql.commands;
/**
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and
            params = JSONUtils.parseMap(new Gson(), new StringReader(command.getParameter()));

    public SQLControlResult handleCommand(@NotNull DBRProgressMonitor monitor, @NotNull SQLControlCommand command, @NotNull SQLScriptContext scriptContext) throws DBException {
 *
import org.jkiss.dbeaver.model.sql.*;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            throw new DBException("Invalid syntax. Use '@export {\"type\": <type>, \"producer\": {...}}, \"consumer\": {...}}, \"processor\": {...}}'", e);
    }

import org.jkiss.code.NotNull;

import java.io.StringReader;
import org.jkiss.dbeaver.DBException;
 * you may not use this file except in compliance with the License.
 */
        } catch (Exception e) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
import org.jkiss.dbeaver.model.data.json.JSONUtils;
    @Override
 * DBeaver - Universal Database Manager
        try {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
public class SQLCommandExport implements SQLControlCommandHandler {
