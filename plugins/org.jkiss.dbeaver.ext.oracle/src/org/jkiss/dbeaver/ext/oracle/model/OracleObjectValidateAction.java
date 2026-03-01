 * DBeaver - Universal Database Manager
    }

 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
    }
import org.jkiss.dbeaver.model.exec.DBCSession;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (!log.getErrorStack().isEmpty()) {
import org.jkiss.dbeaver.ext.oracle.model.source.OracleSourceObject;
        OracleTaskHandler.logObjectErrors((JDBCSession) session, log, object, getObjectType());
}

        }

    public void afterExecute(DBCSession session, Throwable error) throws DBCException {

            message.append("Error during ").append(getObjectType().getTypeName()).append(" '").append(object.getName()).append("' validation:");
package org.jkiss.dbeaver.ext.oracle.model;
        if (error != null) {
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
/*
 * See the License for the specific language governing permissions and
            return;
                message.append("\n");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.object = object;
            StringBuilder message = new StringBuilder();
 */
            }
public class OracleObjectValidateAction extends OracleObjectPersistAction {
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
 * Oracle persist action with validation
 * limitations under the License.
    public OracleObjectValidateAction(OracleSourceObject object, OracleObjectType objectType, String title, String script) {

/*
 *
        super(objectType, title, script);
        }
        DBCCompileLog log = new DBCCompileLogBase();
            for (DBCCompileError e : log.getErrorStack()) {
                message.append(e.toString());
            throw new DBCException(message.toString());
import org.jkiss.dbeaver.model.exec.DBCException;
/**
 *
*/
    private final OracleSourceObject object;
 *
