            final List<String> lines = new ArrayList<>();
        	protected void createStatusColumns(Tree objectTree)
        
                }
                        }


import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                                            }
	@Override

            Exception objectProcessingError;

            switch (name) {
 *
                        UIUtils.asyncExec(() -> scriptListener.beginObjectProcessing(object, objectNumber));
 *
                case VARIABLE_SCHEMA:
        for (ExasolTableBase object : objects) {
                        }
                                i++;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.runtime.jobs.DataSourceJob;
 * You may obtain a copy of the License at
                                }
import java.sql.Statement;
        	}
import org.jkiss.dbeaver.model.impl.jdbc.exec.JDBCStatementImpl;
import org.jkiss.code.Nullable;
            objectsSQL.put(object, lines);

import org.jkiss.utils.CommonUtils;
package org.jkiss.dbeaver.ext.exasol.ui.tools;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
 * See the License for the specific language governing permissions and
                case VARIABLE_TABLE:
                        treeItem.setExpanded(true);
import org.jkiss.dbeaver.utils.GeneralUtils;
                    Font f = UIUtils.makeBoldFont(treeItem.getFont());
                        // Display the data for each row
 * distributed under the License is distributed on an "AS IS" BASIS,
	{
    protected void executeSQL() {
                            }
    private static final String VARIABLE_DATE = "date";
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.eclipse.core.runtime.IStatus;
    
import java.text.SimpleDateFormat;
                TreeColumn msgColumn = new TreeColumn(objectTree, SWT.NONE);
                        subItem.setFont(f);
                try (DBCSession session = getExecutionContext().openSession(monitor, DBCExecutionPurpose.UTIL, jobName)) {
                    return table.getContainer().getName();
                        TreeItem subItem = null;
        final SQLScriptProgressListener<ExasolTableBase> scriptListener = getScriptListener();
	
        final String jobName = getShell().getText();
                 default:
                }
            @SuppressWarnings("rawtypes")
import org.eclipse.core.runtime.Status;
                        subItem = new TreeItem(treeItem, SWT.NONE);
 */
                                        (JDBCSession) session, () -> statement, null, true);
        	
                    UIUtils.asyncExec(scriptListener::endScriptProcessing);
                        } finally {
                                    if (objectProcessingError != null) {
                final DataSourceJob curJob = this;

                            break;
        	{
                                    UIUtils.syncExec(() -> {
                                                objectProcessingError = e;
                            final List<String> lines = objectsSQL.get(object);

    private static final String VARIABLE_SCHEMA = "schema";
            @NotNull
                                                scriptListener.processObjectResults(object, null, resultSet);
                } finally {
                                	resultSet.addRow((Object[]) resultSetData );
                                    JDBCStatementImpl<Statement> stmt = new JDBCStatementImpl<Statement>(
        final DataSourceJob job = new DataSourceJob(jobName, getExecutionContext()) {
                        if (monitor.isCanceled()) {
}
	
import org.jkiss.dbeaver.ui.editors.sql.dialogs.GenerateMultiSQLDialog;
                                        break;
                    new TreeColumn(objectTree, SWT.NONE);
                        }
    }
                for (int i = 0; i < nbExtraColumns; i++) {
                        for (DBCAttributeMetaData column: rsMetaData.getAttributes()) {
                                            } catch (DBCException e) {
                        final int objectNumber = i;
            // DF: This method is for tools that return resultsets
            @Override
                                            try {
		super(partSite, title, objects, true);
                                	resultSet.addColumn("ROWS_AFFECTED", DBPDataKind.NUMERIC);
import org.jkiss.dbeaver.model.DBUtils;
                            subItem.setText(column.getOrdinalPosition(), column.getName());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    
                            subItem = new TreeItem(treeItem, SWT.NONE);
            }
                                    });
import org.jkiss.dbeaver.ext.exasol.ui.internal.ExasolMessages;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

                        }
                case VARIABLE_DATE:
                                try (final Statement statement = ((JDBCSession) session).getOriginal().createStatement()) {
 * limitations under the License.
import org.eclipse.swt.graphics.Font;

import org.eclipse.swt.SWT;
                    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            @Override
    }
                    return dateFormat.format(cal.getTime());
                    monitor.done();
    protected String replaceVars(String input, final ExasolTableBase table)
            {
                return Status.OK_STATUS;
                    TreeItem treeItem = getTreeItem(exasolTable);
            protected IStatus run(@NotNull final DBRProgressMonitor monitor)

                    return;
        final List<ExasolTableBase> objects = getCheckedObjects();
        job.addJobChangeListener(new JobChangeAdapter() {
        final int nbExtraColumns = getNumberExtraResultingColumns();
    private static final Log log = Log.getLog(ExasolBaseTableToolDialog.class);
    {
                                subItem.setText(i, CommonUtils.toString(resultSet.getAttributeValue(i)));
	ExasolBaseTableToolDialog(IWorkbenchPartSite partSite, String title,

                }
                                	int affectedRows = statement.executeUpdate(line);
                                	
import java.util.*;
	
        });
                    if (treeItem != null) {
        return GeneralUtils.replaceVariables(input, name -> {
        });
import org.eclipse.swt.widgets.Tree;
            }
            {
            public void done(IJobChangeEvent event) {
            }
                        while (resultSet.nextRow()) {
 *
                // Retrieve column names
	}
                try {
    {
import org.jkiss.dbeaver.model.DBPDataKind;
                                    // Run in sync because we need result set
        return new SQLScriptStatusDialog<ExasolTableBase>(getTitle() + " " + ExasolMessages.dialog_table_tools_progress,null) {
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
                    }
                } catch (Exception e) {
                        // Display the column names
                monitor.beginTask(jobName, objects.size());
	}
                    Calendar cal = Calendar.getInstance();
                msgColumn.setText(ExasolMessages.dialog_table_tools_result);

                UIUtils.asyncExec(() -> scriptListener.beginScriptProcessing(curJob, objects));
            generateObjectCommand(lines, object);
            return null;
                                    }
import java.text.DateFormat;

                        try {
            	DBCResultSetMetaData rsMetaData = resultSet.getMeta();
                            }
                        } catch (Exception e) {
import org.jkiss.dbeaver.model.impl.local.LocalResultSet;
            public void processObjectResults(@NotNull ExasolTableBase exasolTable, @Nullable DBCStatement statement, @Nullable DBCResultSet resultSet) throws DBCException
                        objectProcessingError = null;
                    System.getProperty(name);
        };
                            UIUtils.asyncExec(() -> scriptListener.endObjectProcessing(object, objectProcessingError));
import org.eclipse.swt.widgets.TreeItem;
                }
        job.setUser(false);
                    }
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
                                	

    private static final String VARIABLE_TABLE = "table";
import org.eclipse.swt.widgets.TreeColumn;
	
        };
        final Map<ExasolTableBase, List<String>> objectsSQL = new LinkedHashMap<>();
                            for (int i = 0; i < rsMetaData.getAttributes().size(); i++) {
        return 0;
    @Override
    private int getNumberExtraResultingColumns()
                if (resultSet == null) {

	{
                        monitor.worked(1);
                    for (int i = 0; i < objects.size(); i++) {
                        monitor.subTask("Process " + DBUtils.getObjectFullName(object, DBPEvaluationContext.UI));
                            log.warn("Exception caught when executing SQL", e);
                                	Integer[] resultSetData = new Integer[] { affectedRows };
                            objectProcessingError = e;
                    throw new DBCException(e.getMessage());
import org.jkiss.dbeaver.ext.exasol.model.ExasolTableBase;
                        final ExasolTableBase object = objects.get(i);
 * Unless required by applicable law or agreed to in writing, software
    }

import org.jkiss.dbeaver.Log;
                            for (String line : lines) {
import org.eclipse.ui.IWorkbenchPartSite;
                            subItem.setGrayed(true);
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.exec.*;
            }
        	@Override
	protected SQLScriptProgressListener<ExasolTableBase> getScriptListener()
        job.schedule();
/*
import org.jkiss.dbeaver.ui.editors.sql.dialogs.SQLScriptProgressListener;
			@Override
                    return table.getName();
        	
                              Collection<ExasolTableBase> objects)
import org.jkiss.dbeaver.ui.UIUtils;
public abstract class ExasolBaseTableToolDialog extends GenerateMultiSQLDialog<ExasolTableBase> {
 * Licensed under the Apache License, Version 2.0 (the "License");
                                    final LocalResultSet resultSet = new LocalResultSet<>(session, stmt);
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.ui.editors.sql.dialogs.SQLScriptStatusDialog;
