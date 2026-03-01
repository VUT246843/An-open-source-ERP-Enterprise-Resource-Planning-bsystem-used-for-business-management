
    }
    protected void beforeFetch() {
    protected void afterFetch() {
 * Abstract result set
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
    protected final SESSION session;
 * you may not use this file except in compliance with the License.
 */
        return null;
import org.jkiss.dbeaver.model.exec.DBCStatement;
 */



        return null;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * See the License for the specific language governing permissions and
    @Override
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return session;
    }

}
    public SESSION getSession() {
    public DBDValueMeta getAttributeValueMeta(int index) throws DBCException {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
    }
    }
    protected STATEMENT statement;
    }
        this.session = session;


    @NotNull

/**
        this.statement = statement;

 *
 * Unless required by applicable law or agreed to in writing, software
        return statement;
package org.jkiss.dbeaver.model.impl;
    @NotNull
import org.jkiss.dbeaver.model.exec.DBCSession;
    }
import org.jkiss.dbeaver.model.exec.DBCResultSet;
    @Override
    }
    @NotNull
    }

    @NotNull
 *
    @Override
import org.jkiss.dbeaver.model.data.DBDValueMeta;
 * You may obtain a copy of the License at

    public String getResultSetName() throws DBCException {

 * DBeaver - Universal Database Manager

    public Object getFeature(String name) {
import org.jkiss.code.NotNull;
    public DBDValueMeta getRowMeta() throws DBCException {
/*
    @Override
    public STATEMENT getSourceStatement() {
        return null;
public abstract class AbstractResultSet<SESSION extends DBCSession, STATEMENT extends DBCStatement> implements DBCResultSet {
import org.jkiss.dbeaver.model.exec.DBCException;
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
    protected AbstractResultSet(@NotNull SESSION session, @NotNull STATEMENT statement) {
        return null;

