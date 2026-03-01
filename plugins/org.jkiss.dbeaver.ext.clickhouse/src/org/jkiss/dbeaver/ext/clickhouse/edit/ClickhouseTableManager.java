        @NotNull List<DBEPersistAction> actions,

 * Clickhouse table manager
    @Override
                    if (!CommonUtils.isEmpty(attributes)) {
                    }
    }
        return "TABLE";
import java.util.Map;
                if (CommonUtils.isNotEmpty(clickhouseTable.getEngineMessage())) {
        }
                ddl.append(" ENGINE = ").append(clickhouseTable.getEngine().getName());
        @NotNull DBRProgressMonitor monitor,
                } catch (DBException e) {
            String delimiter = getDelimiter(options);
/**
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ext.generic.edit.GenericTableManager;
                "ALTER TABLE " + tableBase.getFullyQualifiedName(DBPEvaluationContext.DDL)
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ext.clickhouse.edit;
                }

import org.jkiss.dbeaver.ext.generic.model.GenericTableColumn;
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.DBUtils;
                }
            } else {
        DBRProgressMonitor monitor,
 * Unless required by applicable law or agreed to in writing, software
                    } else {
        @NotNull Map<String, Object> options)
        boolean alter,
            if (clickhouseTable.getEngine() != null) {
        GenericTableBase tableBase = command.getObject();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and

                    List<? extends GenericTableColumn> attributes = table.getAttributes(monitor);
import java.util.List;
/*
    protected String getDropTableType(GenericTableBase table) {

import org.jkiss.utils.CommonUtils;
 */
public class ClickhouseTableManager extends GenericTableManager {
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
}
    private static final Log log = Log.getLog(ClickhouseTableManager.class);
        if (table instanceof ClickhouseTable) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (tableBase.isPersisted() && command.hasProperty(DBConstants.PROP_ID_DESCRIPTION)) {
 * DBeaver - Universal Database Manager

                ddl.append(delimiter).append("COMMENT ").append(SQLUtils.quoteString(table, table.getDescription())); //$NON-NLS-1$
            ClickhouseTable clickhouseTable = (ClickhouseTable) table;
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
                    + " MODIFY COMMENT "
 */
        Map<String, Object> options) {
        NestedObjectCommand tableProps,
                && CommonUtils.isNotEmpty(table.getDescription())) {
 * You may obtain a copy of the License at
        @NotNull NestedObjectCommand<GenericTableBase, PropertyHandler> command,
            if (!table.isPersisted() && tableProps.getProperty(DBConstants.PROP_ID_DESCRIPTION) != null
        }
        GenericTableBase table,
import org.jkiss.dbeaver.model.DBConstants;
                    log.debug("Can't read " + table.getName() + " columns");
 *
                "Comment table",
 *
import org.jkiss.dbeaver.DBException;
                    + SQLUtils.quoteString(tableBase, CommonUtils.notEmpty(tableBase.getDescription()))));
        @NotNull DBCExecutionContext executionContext,
                    ddl.append(delimiter).append(clickhouseTable.getEngineMessage());
                            .append("ORDER BY ").append(DBUtils.getQuotedIdentifier(attributes.get(0)));
            }
    protected void addObjectExtraActions(
                        ddl.append(" ENGINE = MergeTree()")
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    protected void appendTableModifiers(
import org.jkiss.dbeaver.ext.clickhouse.model.ClickhouseTable;
                try {
            }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
                        ddl.append(" ENGINE = Log");
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
            actions.add(new SQLDatabasePersistAction(
import org.jkiss.dbeaver.Log;

import org.jkiss.dbeaver.model.sql.SQLUtils;
    }
                            .append(delimiter)
        StringBuilder ddl,
    }

 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
        // Both tables and views must be deleted with DROP TABLE
    {
