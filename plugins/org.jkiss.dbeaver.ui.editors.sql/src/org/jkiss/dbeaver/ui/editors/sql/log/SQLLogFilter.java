            if (object instanceof QMMStatementExecuteInfo) {
        if (object instanceof QMMConnectionInfo) {

}
    @Override
    public SQLEditor getEditor() {
                return belongsToExecutionContext(((QMMTransactionInfo) object).getConnection());
public class SQLLogFilter implements QMEventFilter {
 * SQL log filter
        String contextName = session.getContextName();
        }
        // - statement execution (if statement belongs to specific execution context)
        return executionContext != null &&
    public SQLLogFilter(SQLEditor editor)
            } else if (object instanceof QMMStatementInfo) {

        // - transaction/savepoint changes (if txn belongs to current datasource)
import org.jkiss.dbeaver.model.qm.QMEvent;
/*
    public boolean accept(QMEvent event) {
                Objects.equals(executionContext.getContextName(), contextName);
import java.util.Objects;
    {
 */
package org.jkiss.dbeaver.ui.editors.sql.log;
import org.jkiss.dbeaver.model.qm.meta.*;
 * distributed under the License is distributed on an "AS IS" BASIS,
        return false;
        return editor;
    

        // - session changes (if session belongs to active datasource)

 *
    private SQLEditor editor;
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
                return belongsToExecutionContext(((QMMTransactionSavepointInfo) object).getTransaction().getConnection());
 * DBeaver - Universal Database Manager
        // Accept only following events:
            } else if (object instanceof QMMTransactionInfo) {

 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.qm.QMEventFilter;

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        String containerId = session.getContainerId();
        this.editor = editor;
 *
            } else if (object instanceof QMMTransactionSavepointInfo) {
 * Unless required by applicable law or agreed to in writing, software
    private boolean belongsToExecutionContext(QMMConnectionInfo session) {
 * you may not use this file except in compliance with the License.
        } else {
    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/**
    }
    }
                Objects.equals(executionContext.getDataSource().getContainer().getId(), containerId) &&
    }
                return belongsToExecutionContext(((QMMStatementInfo) object).getConnection());
 */
                return belongsToExecutionContext(((QMMStatementExecuteInfo) object).getStatement().getConnection());
        QMMObject object = event.getObject();
            return editor.getDataSourceContainer() != null && Objects.equals(((QMMConnectionInfo) object).getContainerId(), editor.getDataSourceContainer().getId());
            }
        DBCExecutionContext executionContext = editor.getExecutionContext();
