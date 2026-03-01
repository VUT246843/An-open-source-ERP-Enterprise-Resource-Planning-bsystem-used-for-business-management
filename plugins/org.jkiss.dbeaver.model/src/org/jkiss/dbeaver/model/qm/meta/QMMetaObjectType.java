
    }
    CONNECTION_ERROR_INFO(QMConstants.EVENT_TYPE_UNKNOWN, QMMDataSourceConnectErrorInfo.class),
 * Unless required by applicable law or agreed to in writing, software
    public Class<? extends QMMObject> getObjectClass() {
    STATEMENT_INFO(QMConstants.EVENT_TYPE_STATEMENT, QMMStatementInfo.class),
 *     http://www.apache.org/licenses/LICENSE-2.0

    STATEMENT_EXECUTE_INFO(QMConstants.EVENT_TYPE_EXECUTE, QMMStatementExecuteInfo.class);
 *
 * distributed under the License is distributed on an "AS IS" BASIS,

 * See the License for the specific language governing permissions and
    }
 * Licensed under the Apache License, Version 2.0 (the "License");

 *
}
public enum QMMetaObjectType {
 * DBeaver - Universal Database Manager
 * limitations under the License.
    CONNECTION_INFO(QMConstants.EVENT_TYPE_SESSION, QMMConnectionInfo.class),
    public int getId() {
    TRANSACTION_INFO(QMConstants.EVENT_TYPE_TXN, QMMTransactionInfo.class),
    private final Class<? extends QMMObject> objectClass;

        this.id = id;
package org.jkiss.dbeaver.model.qm.meta;
        return id;
    }
/*
 * Copyright (C) 2010-2025 DBeaver Corp and others
 */
 *
    QMMetaObjectType(int id, Class<? extends QMMObject> objectClass) {
        return objectClass;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
        this.objectClass = objectClass;
 * You may obtain a copy of the License at
    private final int id;
import org.jkiss.dbeaver.model.qm.QMConstants;
    TRANSACTION_SAVEPOINT_INFO(QMConstants.EVENT_TYPE_SAVEPOINT, QMMTransactionSavepointInfo.class),

