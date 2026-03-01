	public String getDescription() {
				);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
	private ExasolTable table;
	public String getName()

		super(
	public long getSize() {
		return this.table;
		return false;
	public List<ExasolTableIndexColumn> getAttributeReferences(@Nullable DBRProgressMonitor monitor) throws DBException {
		String[] colNames = this.columns.stream().map(c -> c.getName()).toArray(String[]::new);



	}
    @Property(viewable = true, editable = false, order = 15)
 * limitations under the License.
 *
	public void setColumns(List<ExasolTableIndexColumn> columns) {
 * you may not use this file except in compliance with the License.
	public List<ExasolTableIndexColumn> getColumns() {
	
	
 * See the License for the specific language governing permissions and
		return table.getSchema().getDataSource();

	@Override
	{

				indexName,
	@Override
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
	@Override
	@Property(viewable = true, editable=false, order = 30)
	public DBSIndexType getIndexType() {
	public ExasolTable getTable() {
		if (columns == null) {

	
 *
		this.lastCommit = JDBCUtils.safeGetTimestamp(dbResult, "LAST_COMMIT");
	}
		columns.add(column);
	private Boolean isGeometry;
	@Property(viewable = true, editable=false, order = 20, formatter = ByteNumberFormat.class)
	private DBSIndexType type;
		
		return this.columns;	
	private Timestamp createTime;
	}
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.DBPEvaluationContext;

	}
/*
	
		return size;
	{
	}
	}
		this.isGeometry = false;
		this.table = table;
		return null;
		this.size = -1;

		return super.getName();

	
	}
import java.sql.ResultSet;

import org.jkiss.dbeaver.model.DBPNamedObject;
		this.columns = columns;
		this.type = new DBSIndexType("LOCAL","LOCAL");
	}
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.code.NotNull;

	private long size;
		// All indices are non unique in exasol
	public ExasolTableIndexColumn getColumn(String columnName) {
	}
	public ExasolTableIndex(ExasolTable table, String indexName, DBSIndexType indexType, boolean persisted) {
	
import org.jkiss.dbeaver.model.meta.Property;
 * Copyright (C) 2010-2025 DBeaver Corp and others
	public void addColumn(ExasolTableIndexColumn column) {
		return type;

 */
import org.jkiss.dbeaver.DBException;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
	}

 * Licensed under the Apache License, Version 2.0 (the "License");
	public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
	@Override
import java.sql.Timestamp;
	private List<ExasolTableIndexColumn> columns;
		this.type = super.getIndexType();
	}
		return DBSIndexType.STATISTIC;


		return lastCommit;
	}
		this.table = table;
		return columns;
	}

	public ExasolSchema getContainer() {
}
	
				table,

	}
	@Override
import org.jkiss.utils.ByteNumberFormat;
	@Override
				true
		
	@Property(viewable = true, editable=false, order = 17)
	public String getSimpleColumnString( ) {
 *

		return "(" + CommonUtils.joinStrings(",",colNames ) + ")";
package org.jkiss.dbeaver.ext.exasol.model;
				table.getContainer(),
	public ExasolTableIndex(DBRProgressMonitor monitor, ExasolTable table, String indexName, ResultSet dbResult)
		return isGeometry;
	}
import org.jkiss.utils.CommonUtils;
	}
	public Timestamp getCreateTime() {

	public Timestamp getLastCommit() {
		}
		return DBUtils.findObject(columns, columnName);
	}
	private Timestamp lastCommit;
		return "(" + CommonUtils.joinStrings(",", colNames ) + ")";
	public DBSIndexType getType() {
	public boolean isUnique() {
import java.util.ArrayList;
		return createTime;
		// no description possible
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTableIndex;
	public ExasolDataSource getDataSource() {
		this.createTime = JDBCUtils.safeGetTimestamp(dbResult, "CREATED");
		String[] colNames = this.columns.stream().map(c -> DBUtils.getQuotedIdentifier(c)).toArray(String[]::new);
		return this.getTable().getContainer();
		super(table.getContainer(), table, indexName, indexType, persisted);
	@NotNull
public class ExasolTableIndex extends JDBCTableIndex<ExasolSchema, ExasolTable> implements DBPNamedObject {

	@Override
		this.isGeometry = JDBCUtils.safeGetBoolean(dbResult, "IS_GEOMETRY", false);
	
	}
import org.jkiss.code.Nullable;
import java.util.List;
	public Boolean getIsGeometry() {
		this.size = JDBCUtils.safeGetLong(dbResult, "MEM_OBJECT_SIZE");
	
		return type.getName() + " " + this.getColumnString();
	}
	}
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
	@NotNull
    @Override
 * DBeaver - Universal Database Manager

	@Property(viewable = false,  order = 100)	
	public String getColumnString() {
	}
	@Property(viewable = true, editable=false, order = 40)
	}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
				new DBSIndexType(JDBCUtils.safeGetString(dbResult, "INDEX_TYPE"), JDBCUtils.safeGetString(dbResult, "INDEX_TYPE")),
			columns = new ArrayList<ExasolTableIndexColumn>();
