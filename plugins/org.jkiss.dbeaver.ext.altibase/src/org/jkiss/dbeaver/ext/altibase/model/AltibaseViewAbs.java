    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.ext.altibase.AltibaseUtils;

            }

 *
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    private static final Log log = Log.getLog(AltibaseViewAbs.class);
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.DBPStatefulObject;
        return isValid ? DBSObjectState.NORMAL : DBSObjectState.INVALID;
    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) throws DBCException {
    public String getSchemaName() {


}
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
 * You may obtain a copy of the License at
        // Create a new view
/*
            } catch (DBCException e) {
 * DBeaver - Universal Database Manager
            try {
 * limitations under the License.
    }
        schemaName = container.getName();
    @Override
    @Override
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, 
        super(container, tableName, tableType, dbResult);
                "Refresh state of view '" + this.getName() + "'")) {
import org.jkiss.code.NotNull;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.struct.DBSObjectState;
    public DBSObjectState getObjectState() {
    @NotNull

                isValid = AltibaseUtils.getViewStatus(session, tableType, getSchemaName(), getName());
        return schemaName;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
                log.warn("Can't update view status.", e);
 *

        // Fetch from a database
import org.jkiss.dbeaver.model.DBUtils;
            isValid = AltibaseUtils.getViewStatus(session, getTableType(), getSchemaName(), getName());
    @Override
package org.jkiss.dbeaver.ext.altibase.model;
    protected String schemaName = null;

 */
    }
 * See the License for the specific language governing permissions and
public abstract class AltibaseViewAbs extends GenericView implements DBPStatefulObject {
        if (session == null) {
        }
import org.jkiss.dbeaver.ext.generic.model.GenericView;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 *
    
        }
            isValid = true;
    }
import org.jkiss.dbeaver.model.exec.DBCException;
    protected boolean isValid = false;
    public AltibaseViewAbs(JDBCSession session, GenericStructContainer container, String tableName, String tableType, JDBCResultSet dbResult) {
        } else {

 *     http://www.apache.org/licenses/LICENSE-2.0
