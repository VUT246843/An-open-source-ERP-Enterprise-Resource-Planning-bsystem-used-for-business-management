 * limitations under the License.
    }
        super.close();
    public QMMStatementInfo(long openTime, long closeTime, QMMConnectionInfo session, DBCExecutionPurpose purpose) {
/**
        return "STATEMENT " + getReferenceText();
 * You may obtain a copy of the License at

    @Nullable
 * Licensed under the Apache License, Version 2.0 (the "License");
    public QMMStatementInfo getPrevious() {
    }
        this.connection = connection;
 *




    private final DBCExecutionPurpose purpose;
import org.jkiss.code.Nullable;
        this.previous = previous;
        this.purpose = purpose;
    @Override
        return previous;
    }
    }
    public String getText() {
        this.previous = null;

        if (reference != null) {
 * Copyright (C) 2010-2026 DBeaver Corp and others

    public DBCStatement getReference() {
/*

import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
package org.jkiss.dbeaver.model.qm.meta;
    public String getReferenceText() {
        return reference != null ? reference.getQueryString() : "N/A";
        return reference;
    }
        this.connection = session;
 * DBeaver - Universal Database Manager
    @Override
    }
}
    private final QMMConnectionInfo connection;
    public QMMConnectionInfo getConnection() {
    public QMMStatementInfo(QMMConnectionInfo connection, DBCStatement reference, QMMStatementInfo previous) {
 */



    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,

public class QMMStatementInfo extends QMMObject {
    public String toString() {
        super(QMMetaObjectType.STATEMENT_INFO, openTime, closeTime);
    }
        return connection;
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software

    private transient DBCStatement reference;
            reference = null;
 * See the License for the specific language governing permissions and
    }
    public DBCExecutionPurpose getPurpose() {
        return purpose;
        this.purpose = reference.getSession().getPurpose();

 *
        super(QMMetaObjectType.STATEMENT_INFO);
        return connection.getText();
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
    private final transient QMMStatementInfo previous;
    @Nullable
 * DBCStatement meta info
    @NotNull
    }

 */
        this.reference = reference;
    public void close() {
        }
    @NotNull
import org.jkiss.dbeaver.model.exec.DBCStatement;
 *
    }
