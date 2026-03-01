 */
    @NotNull
import org.jkiss.dbeaver.model.struct.DBSStructureAssistant;
import org.jkiss.code.NotNull;

    @NotNull
    }
 * limitations under the License.
                                  @NotNull ObjectsSearchParams params, @NotNull List<DBSObjectReference> references) throws DBException, SQLException;
/*
            for (DBSObjectType type : params.getObjectTypes()) {
package org.jkiss.dbeaver.model.impl.jdbc;
import java.util.ArrayList;

 * JDBCStructureAssistant
    public DBSObjectType[] getSupportedObjectTypes()

 */
                    break;

    @Override

 * Copyright (C) 2010-2024 DBeaver Corp and others
        return new DBSObjectType[] { RelationalObjectType.TYPE_TABLE };
    }
                } catch (Exception e) {
    }
    public DBSObjectType[] getSearchObjectTypes() {
    @NotNull
 * See the License for the specific language governing permissions and
    }
    public List<DBSObjectReference> findObjectsByMask(@NotNull DBRProgressMonitor monitor, @NotNull CONTEXT executionContext,
    @Override
 *
    protected abstract JDBCDataSource getDataSource();
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
        return new DBSObjectType[] { RelationalObjectType.TYPE_TABLE };
}
        return getSupportedObjectTypes();
    @Override
import org.jkiss.dbeaver.model.struct.DBSObjectReference;
                }
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;

    {


    {
    {
    public DBSObjectType[] getAutoCompleteObjectTypes()
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
        try (JDBCSession session = executionContext.openSession(monitor, DBCExecutionPurpose.META, ModelMessages.model_jdbc_find_objects_by_name)) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            }
 *
import java.sql.SQLException;
        }
                try {
import org.jkiss.dbeaver.DBException;
    }
        return new DBSObjectType[] { RelationalObjectType.TYPE_TABLE };
                }
        return references;
import java.util.List;
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.dbeaver.model.struct.DBSObjectType;

    @NotNull
    @Override
    protected static final Log log = Log.getLog(JDBCStructureAssistant.class);
                    log.debug("Error searching objects (" + type.getTypeName() + ")", e);
    @Override
    public DBSObjectType[] getHyperlinkObjectTypes()
import org.jkiss.dbeaver.model.messages.ModelMessages;
 * you may not use this file except in compliance with the License.
/**
    protected abstract void findObjectsByMask(@NotNull CONTEXT executionContext, @NotNull JDBCSession session, @NotNull DBSObjectType objectType,
                    findObjectsByMask(executionContext, session, type, params, references);
 * Unless required by applicable law or agreed to in writing, software
                                                      @NotNull ObjectsSearchParams params) throws DBException {
    @NotNull
        List<DBSObjectReference> references = new ArrayList<>();
public abstract class JDBCStructureAssistant<CONTEXT extends JDBCExecutionContext> implements DBSStructureAssistant<CONTEXT> {
import org.jkiss.dbeaver.model.impl.struct.RelationalObjectType;
                if (references.size() >= params.getMaxResults()) {
