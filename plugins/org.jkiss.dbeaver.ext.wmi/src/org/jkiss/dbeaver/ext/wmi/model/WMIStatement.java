import org.jkiss.wmi.service.WMIConstants;

 * DBeaver - Universal Database Manager
    }
        // not supported
    @Override
    }
import org.jkiss.code.NotNull;
        if (queryResult == null) {
import org.jkiss.wmi.service.WMIService;
 *
    }
    public Throwable[] getStatementWarnings() throws DBCException {
    public boolean nextResults() throws DBCException {
        }
    }
    }

    @Nullable
    public void cancelBlock(@NotNull DBRProgressMonitor monitor, @Nullable Thread blockThread) throws DBException {
                firstRow,
    public void setLimit(long offset, long limit) throws DBCException {
import org.jkiss.dbeaver.model.exec.DBCExecutionSource;

        this.source = source;
 */
        return source;
    @Override

 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
    @Override
    public DBCExecutionSource getStatementSource()
        return null;
        return query;

        super(session);
 * you may not use this file except in compliance with the License.
        return -1;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
    {

    }
    private List<WMIObject> queryResult;
            throw new DBCException(e, getSession().getExecutionContext());

    }
    }

    @Nullable
    @Override
    }
    @Override
    }
    public DBCResultSet openResultSet() throws DBCException {
import org.jkiss.wmi.service.WMIObject;
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
/*
import org.jkiss.wmi.service.WMIException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private final String query;

            getService().executeQuery(query, sink, WMIConstants.WBEM_FLAG_SEND_STATUS);
        }

            return new WMIResultSet(getSession(), null, queryResult);
}

    @Override
import java.util.List;
    private long firstRow;
        }
            queryResult = sink.getObjectList();
        } catch (WMIException e) {
    @Nullable
    public void setStatementSource(DBCExecutionSource source)
/**



        this.query = query;
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
package org.jkiss.dbeaver.ext.wmi.model;
    @Override
    WMIService getService()
    {
            throw new DBCException(e, getSession().getExecutionContext());
    public WMIStatement(WMISession session, DBCStatementType type, String query) {
import org.jkiss.code.Nullable;

 * Unless required by applicable law or agreed to in writing, software
 */
    @Nullable
import org.jkiss.dbeaver.DBException;
    public void setResultsFetchSize(int fetchSize) throws DBCException {
import org.jkiss.dbeaver.model.exec.DBCResultSet;
    }
        return getSession().getDataSource().getService();
import org.jkiss.dbeaver.model.impl.AbstractStatement;
    public String getQueryString()
 * Licensed under the Apache License, Version 2.0 (the "License");
        } catch (WMIException e) {
 * WMI statement
    private DBCExecutionSource source;
public class WMIStatement extends AbstractStatement<WMISession> {

                getService(),
import org.jkiss.dbeaver.model.exec.DBCStatementType;
            sink.waitForFinish();
            return true;
    {
    {
    @Override

        return false;
 * You may obtain a copy of the License at
    private long maxRows;
 *
            return null;
 *

    @Override
                maxRows);
import org.jkiss.dbeaver.model.exec.DBCException;
    public long getUpdateRowCount() throws DBCException {
        this.type = type;
        this.firstRow = offset;
                getSession().getProgressMonitor(),
    public boolean executeStatement() throws DBCException {
    }
        this.maxRows = limit;
    @Override

        try {
        try {
    }
            WMIObjectCollectorSink sink = new WMIObjectCollectorSink(
    private DBCStatementType type;
    public void setStatementTimeout(int timeout) throws DBCException {
 * limitations under the License.
