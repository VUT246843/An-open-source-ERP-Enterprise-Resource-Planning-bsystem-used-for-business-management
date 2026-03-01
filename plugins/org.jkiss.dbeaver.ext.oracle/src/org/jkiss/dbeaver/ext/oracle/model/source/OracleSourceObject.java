 * Stored code interface
    OracleSourceType getSourceType();
import org.jkiss.dbeaver.model.exec.DBCException;

 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
/**


 *

import org.jkiss.dbeaver.model.struct.DBSObjectWithScript;
 * DBeaver - Universal Database Manager
 * limitations under the License.
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ext.oracle.model.source;
    DBEPersistAction[] getCompileActions(DBRProgressMonitor monitor) throws DBCException;
 */
 */
import org.jkiss.dbeaver.ext.oracle.model.OracleSourceType;
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
    default boolean supportsCompile() {
public interface OracleSourceObject extends DBSObjectWithScript, OracleStatefulObject {
    }
 * you may not use this file except in compliance with the License.
        return true;



 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * See the License for the specific language governing permissions and
    void setName(String name);
 * You may obtain a copy of the License at
}
