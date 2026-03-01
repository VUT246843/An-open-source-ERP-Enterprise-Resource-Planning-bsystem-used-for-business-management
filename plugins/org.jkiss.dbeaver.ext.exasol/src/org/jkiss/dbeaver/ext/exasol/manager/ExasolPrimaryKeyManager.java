 * limitations under the License.
		
					DBUtils.getQuotedIdentifier(key.getDataSource(), command.getNewName())
import java.util.Map;
	@Override
			log.error("Could not generated DDL for PK");
							"ALTER TABLE " + constraint.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL) + 
					+ DBUtils.getQuotedIdentifier(key.getDataSource(),command.getOldName()) + " to " +
	}
	@Override
import org.jkiss.dbeaver.model.DBUtils;
	@Override
	{
	}
		final ExasolTableUniqueKey key = command.getObject();
		);
 * distributed under the License is distributed on an "AS IS" BASIS,
										  @NotNull ObjectCreateCommand command, @NotNull Map<String, Object> options)
		return new ExasolTableUniqueKey(
 * Unless required by applicable law or agreed to in writing, software
							)
					"Rename PK", 
	
		extends SQLConstraintManager<ExasolTableUniqueKey, ExasolTable> 
 *
	@Override
	{
			true,
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.struct.DBSObject;
				new SQLDatabasePersistAction(
 *
							" MODIFY CONSTRAINT " + constraint.getName() + " " +
										  @NotNull ObjectRenameCommand command, @NotNull Map<String, Object> options)
		final ExasolTableUniqueKey constraint = command.getObject();
 * See the License for the specific language governing permissions and

import org.jkiss.dbeaver.DBException;
			actionList.add(
			(ExasolTable) container,
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
}
import org.jkiss.dbeaver.ext.exasol.tools.ExasolUtils;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
	public void renameObject(@NotNull DBECommandContext commandContext,
	@Override
	public DBSObjectCache<? extends DBSObject, ExasolTableUniqueKey> getObjectsCache(
import org.jkiss.dbeaver.model.edit.DBECommandContext;
							 @NotNull ExasolTableUniqueKey object, @NotNull Map<String, Object> options, @NotNull String newName) throws DBException

			ExasolTableUniqueKey object)
	}
 *
 */
import org.jkiss.dbeaver.model.DBConstants;
	
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;
package org.jkiss.dbeaver.ext.exasol.manager;
		return object.getTable().getSchema().getConstraintCache();
	}
 * you may not use this file except in compliance with the License.
					"ALTER TABLE " + DBUtils.getObjectFullName(key.getTable(),DBPEvaluationContext.DDL) + " RENAME CONSTRAINT " 
	{
					new SQLDatabasePersistAction("Alter PK",
	protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
public class ExasolPrimaryKeyManager
	protected void addObjectModifyActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actionList,
		}
		processObjectRename(commandContext, object, options, newName);
	{
		implements DBEObjectRenamer<ExasolTableUniqueKey>{
	{
		Object container, Object copyFrom, @NotNull Map<String, Object> options) throws DBException
		@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context,

import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
	
	}
		}
	{
	
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ext.exasol.ExasolConstants;
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;

		actions.add(
	
import org.jkiss.dbeaver.ext.exasol.model.ExasolTableUniqueKey;


	}
		try {
import org.jkiss.dbeaver.model.DBPEvaluationContext;

				)
	@Override
	protected ExasolTableUniqueKey createDatabaseObject(
							(constraint.getEnabled() ? ExasolConstants.KEYWORD_ENABLE : ExasolConstants.KEYWORD_DISABLE)
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ext.exasol.model.ExasolTable;
	
 * You may obtain a copy of the License at
	protected String getDropConstraintPattern(ExasolTableUniqueKey constraint)
	protected void addObjectRenameActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions,
					);

		ExasolTableUniqueKey obj = (ExasolTableUniqueKey) command.getObject();
			"CONSTRAINT"
	}
		
		if (command.getProperties().containsKey(DBConstants.PROP_ID_ENABLED))
		{
		} catch (DBException e) {
import java.util.List;
	@Override
		);		
	{
		return "ALTER TABLE " + constraint.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL) + " DROP PRIMARY KEY";
			DBSEntityConstraintType.PRIMARY_KEY,
										  @NotNull ObjectChangeCommand command, @NotNull Map<String, Object> options)
 * Copyright (C) 2010-2024 DBeaver Corp and others
/*
			actions.add(new SQLDatabasePersistAction("Create PK", ExasolUtils.getPKDdl(obj, monitor)));
 * Copyright (C) 2017-2017 Karl Griesser (fullref@gmail.com)
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLConstraintManager;
