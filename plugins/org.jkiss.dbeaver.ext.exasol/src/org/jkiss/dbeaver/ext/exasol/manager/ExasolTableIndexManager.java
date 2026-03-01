	@Override
 */
import org.jkiss.dbeaver.ext.exasol.model.ExasolTable;
	}
						"Create Index",
	
	}
	@Nullable
public class ExasolTableIndexManager extends SQLIndexManager<ExasolTableIndex, ExasolTable>  {
	
	protected ExasolTableIndex createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context,
				"ENFORCE %s INDEX ON %s %s",
		return "DROP " + index.getType().getName() + " INDEX ON " + index.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL) + " " + index.getColumnString();
										  @NotNull List<DBEPersistAction> actions, @NotNull SQLObjectEditor<ExasolTableIndex, ExasolTable>.ObjectCreateCommand command,
	
	}
				new SQLDatabasePersistAction(
	
 * distributed under the License is distributed on an "AS IS" BASIS,
	@Override
	public DBSObjectCache<ExasolSchema, ExasolTableIndex> getObjectsCache(ExasolTableIndex object) {
				index.getType().getName(),
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
}
				);
import java.util.List;
 * DBeaver - Universal Database Manager
	public boolean canEditObject(@NotNull ExasolTableIndex object) {
										  @NotNull Map<String, Object> options) {

 *
	@Override
	}
import org.jkiss.dbeaver.ext.exasol.model.ExasolTableIndex;
	
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.Map;
 *


	public long getMakerOptions(@NotNull DBPDataSource dataSource) {
import org.jkiss.dbeaver.model.impl.sql.edit.struct.SQLIndexManager;
	protected String getDropIndexPattern(ExasolTableIndex index) {
		ExasolTableIndex index = command.getObject();

	
	@Override
	
import org.jkiss.dbeaver.model.edit.DBECommandContext;
	@Override
	}
						SQL
		return object.getTable().getContainer().getIndexCache();
													Object container, Object from, @NotNull Map<String, Object> options) throws DBException {
import org.jkiss.dbeaver.DBException;
				); 
	}
import org.jkiss.dbeaver.ext.exasol.model.ExasolSchema;
		return false;
package org.jkiss.dbeaver.ext.exasol.manager;
	protected void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext,
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
	@Override
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
 * limitations under the License.
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;

 *
						)
		actions.add(
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.code.NotNull;
		String SQL = String.format(
		return new ExasolTableIndex((ExasolTable) container, null,  DBSIndexType.OTHER, false );
				index.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL),
		
	
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
		
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
/*
 * you may not use this file except in compliance with the License.
	
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
 *     http://www.apache.org/licenses/LICENSE-2.0
				index.getColumnString()
 * Unless required by applicable law or agreed to in writing, software
		return FEATURE_EDITOR_ON_CREATE;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
