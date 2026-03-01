 *
 * you may not use this file except in compliance with the License.
            monitor,

    @Override
 *
package org.jkiss.dbeaver.ext.oracle.ui.editors;
/**

 * Oracle Scheduler Job Action editor
/*
 * DBeaver - Universal Database Manager
        return OracleConstants.CMD_COMPILE;
//        return ((DBPScriptObjectExt)getSourceObject()).getExtendedDefinitionText(monitor);
    @Override
            OracleConstants.JOB_ACTION_DEFINITION,
 */

 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
    }
    }
import org.jkiss.dbeaver.ext.oracle.model.OracleSchedulerJob;
public class SchedulerJobActionEditor extends SQLSourceViewer<OracleSchedulerJob> {

 * Unless required by applicable law or agreed to in writing, software
    protected boolean isReadOnly() {

    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
}
 * distributed under the License is distributed on an "AS IS" BASIS,
        getInputPropertySource().setPropertyValue(
        OracleSchedulerJob schedulerJob = getSourceObject();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 *
    @Override
import org.jkiss.dbeaver.ui.editors.sql.SQLSourceViewer;
 * Licensed under the Apache License, Version 2.0 (the "License");
    	OracleSchedulerJob schedulerJob = getSourceObject();
import org.jkiss.dbeaver.DBException;
    {
        return schedulerJob == null || !schedulerJob.getDataSource().supportsSchedulerJobEdit();
    protected void setSourceText(DBRProgressMonitor monitor, String sourceText) {
 * You may obtain a copy of the License at
 */
    protected String getCompileCommandId()
    @Override
            sourceText);
    protected String getSourceText(DBRProgressMonitor monitor) throws DBException {

import org.jkiss.dbeaver.ext.oracle.model.OracleConstants;
    	return schedulerJob.getJobAction();
