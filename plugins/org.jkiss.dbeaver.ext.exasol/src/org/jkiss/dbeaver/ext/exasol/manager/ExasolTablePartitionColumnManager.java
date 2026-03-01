import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;

 *
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
	}
 * You may obtain a copy of the License at
	
	protected void addObjectDeleteActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
		}
import org.jkiss.dbeaver.Log;
		} 
	{
		ExasolTable table = command.getObject().getTable();
		return null;
		try {
			if (! table.getAdditionalInfo(monitor).getHasPartitionKey(monitor))
 * Copyright (C) 2010-2024 DBeaver Corp and others
		return new ExasolTablePartitionColumn((ExasolTable) container);
	protected ExasolTablePartitionColumn createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context,
		{
	@Override

import java.util.Map;
			return ExasolUtils.getPartitionDdl(table, monitor);
import org.jkiss.dbeaver.model.edit.DBECommandContext;
import org.jkiss.dbeaver.model.DBPDataSource;
	}
										  @NotNull ObjectCreateCommand command,
 * limitations under the License.


		{
	@Override
	}
}
		ExasolTable table = command.getObject().getTable();
		return object.getTable().getPartitionCache();
		try {
	public ExasolTablePartitionColumnCache getObjectsCache(
		} catch (DBException e) {
 * distributed under the License is distributed on an "AS IS" BASIS,

	}
import org.jkiss.dbeaver.ext.exasol.model.cache.ExasolTablePartitionColumnCache;
import org.jkiss.dbeaver.model.edit.DBEObjectEditor;
	@Override
			actionList.add(new SQLDatabasePersistAction(generateAction(monitor, table)));
		return FEATURE_EDITOR_ON_CREATE;
			return "ALTER TABLE " + table.getFullyQualifiedName(DBPEvaluationContext.DDL) + " DROP PARTITION KEYS";

/*
										  @NotNull Map<String, Object> options) throws DBException {

import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
		ExasolTablePartitionColumnCache cache = getObjectsCache(col);

 * Unless required by applicable law or agreed to in writing, software
			LOG.error("Failed to create Partition Action", e);
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.code.NotNull;
															  Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException {
		if (table.getAdditionalInfo(monitor).getHasPartitionKey(monitor) & table.getPartitions(monitor).size() == 0)
import org.jkiss.dbeaver.ext.exasol.model.ExasolTable;

 *
package org.jkiss.dbeaver.ext.exasol.manager;
			LOG.error("Failed to create Partition Action", e);
			actions.add(new SQLDatabasePersistAction(generateAction(monitor, table)));
	
		return false;
 * Licensed under the Apache License, Version 2.0 (the "License");
	}
	private String generateAction(DBRProgressMonitor monitor, ExasolTable table) throws DBException

import java.util.List;
	}
		cache.removeObject(col, false);

 */
			LOG.error("Failed to create Partition Action", e);
										  @NotNull Map<String, Object> options) {
										  @NotNull ObjectChangeCommand command,
										  @NotNull Map<String, Object> options) {
	}
		}
 * See the License for the specific language governing permissions and
	public long getMakerOptions(@NotNull DBPDataSource dataSource) {
	@Override
	@Override

		try {
import org.jkiss.dbeaver.ext.exasol.model.ExasolTablePartitionColumn;
public class ExasolTablePartitionColumnManager extends SQLObjectEditor<ExasolTablePartitionColumn, ExasolTable> implements DBEObjectEditor<ExasolTablePartitionColumn>, DBEObjectMaker<ExasolTablePartitionColumn, ExasolTable>  {
	protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList,
		}
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
					table.setHasPartitionKey(true, true);
			ExasolTablePartitionColumn object) {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.ext.exasol.tools.ExasolUtils;
			
			actions.add(new SQLDatabasePersistAction(generateAction(monitor, table)));
		ExasolTable table = command.getObject().getTable();
import org.jkiss.dbeaver.model.edit.DBEObjectMaker;
    private static final Log LOG = Log.getLog(ExasolTablePartitionColumnManager.class);
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
	protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
	}
	@Override
		} catch (DBException e) {
										  @NotNull ObjectDeleteCommand command,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
	@Override
		}
	public boolean canCreateObject(@NotNull Object container) {
		if (table.getPartitions(monitor).size() > 0)
		ExasolTablePartitionColumn col = command.getObject();
		} catch (DBException e) {

