import org.jkiss.dbeaver.model.struct.DBSDataContainer;
        }
            return null;
 */
            OracleTableColumn jobNameAttr = logView.getAttribute(monitor, "JOB_NAME");
    }
 * See the License for the specific language governing permissions and
        return getJobLogView();

    }
            }
 */

import org.jkiss.code.Nullable;
 * DBeaver - Universal Database Manager
            if (jobNameAttr != null) {
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
            }
import java.util.List;
            log.error("Can't find log table", e);
                constraints.add(ac);
    protected boolean isSuspendDataQuery() {
                ac.setOperator(DBCLogicalOperator.EQUALS);
    @Override
    @Override
        return false;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
    private static final String LOG_VIEW_NAME = "SCHEDULER_JOB_RUN_DETAILS";
import org.jkiss.dbeaver.Log;
 *
import org.jkiss.dbeaver.model.data.DBDDataFilter;
            OracleSchema systemSchema = dataSource.getSchema(monitor, OracleConstants.SCHEMA_SYS);


    }

    @Override
 *
            return null;
            DBRProgressMonitor monitor = new VoidProgressMonitor();
                ac.setVisible(false);
                constraints.add(ac);
            return null;
 * limitations under the License.

 * Unless required by applicable law or agreed to in writing, software
        try {
        OracleTableBase logView = getJobLogView();
            log.error(e);
 *
{

    }
import org.jkiss.dbeaver.ext.oracle.model.*;
                ac.setValue(job.getName());
    private OracleTableBase getJobLogView() {
                return systemSchema.getView(monitor, OracleUtils.getSysUserViewName(monitor, dataSource, LOG_VIEW_NAME));
        return getJobLogView() != null;
                ac.setOrderDescending(true);
/**
        List<DBDAttributeConstraint> constraints = new ArrayList<>();
        OracleSchedulerJob job = getDatabaseObject();
import java.util.ArrayList;
    {
            OracleTableColumn logDateAttr = logView.getAttribute(monitor, "LOG_DATE");
                ac.setOperator(DBCLogicalOperator.EQUALS);
    public DBSDataContainer getDataContainer()
 * SchedulerJobLogEditor
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Nullable
import org.jkiss.dbeaver.ui.editors.data.AbstractDataEditor;
    @Override
        DBRProgressMonitor monitor = new VoidProgressMonitor();
/*
                ac.setValue(job.getOwner());
                constraints.add(ac);
        return "Query job logs...";
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                DBDAttributeConstraint ac = new DBDAttributeConstraint(logDateAttr, logDateAttr.getOrdinalPosition());
            }
            if (systemSchema != null) {

            OracleTableColumn ownerAttr = logView.getAttribute(monitor, "OWNER");
        } catch (DBException e) {
                DBDAttributeConstraint ac = new DBDAttributeConstraint(jobNameAttr, jobNameAttr.getOrdinalPosition());
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0

        }
            if (ownerAttr != null) {

 * you may not use this file except in compliance with the License.
    }
        try {
import org.jkiss.dbeaver.model.exec.DBCLogicalOperator;
        return new DBDDataFilter(constraints);
            OracleDataSource dataSource = getDatabaseObject().getDataSource();
                ac.setVisible(true);
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        } catch (DBException e) {
    protected String getDataQueryMessage() {
    private static final Log log = Log.getLog(SchedulerJobLogEditor.class);
                ac.setOrderPosition(1);

        if (logView == null) {
            }
    public boolean isReadyToRun() {
public class SchedulerJobLogEditor extends AbstractDataEditor<OracleSchedulerJob>

import org.jkiss.dbeaver.model.data.DBDAttributeConstraint;
                ac.setVisible(false);
    protected DBDDataFilter getEditorDataFilter() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                DBDAttributeConstraint ac = new DBDAttributeConstraint(ownerAttr, ownerAttr.getOrdinalPosition());
            if (logDateAttr != null) {
import org.jkiss.dbeaver.DBException;
package org.jkiss.dbeaver.ext.oracle.ui.editors;
        }
}
