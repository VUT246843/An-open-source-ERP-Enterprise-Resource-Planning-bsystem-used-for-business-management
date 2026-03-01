 * you may not use this file except in compliance with the License.
	@Override
	public String getName() {
	}
	@Override
	@Property(viewable = false)
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ext.exasol.model;

	
import org.jkiss.dbeaver.DBException;
	private int ordinalPosition;
	public ExasolTableColumn getTableColumn() {
		return this.table;
import org.jkiss.dbeaver.model.meta.Property;
				return new Object[0];
		if (tableColumn == null) {
		this.ordinalPosition = ordinalPosition;

	
		}
 * limitations under the License.
    @Property(viewable = true, editable = true, order = 1, listProvider = TableColumListProvider.class)
				return object.getTable().getAvailableColumns(new VoidProgressMonitor()).toArray();
	}
    @Property(viewable = false)
	}
}
	public int getOrdinalPosition() {
		}
 * DBeaver - Universal Database Manager
public class ExasolTablePartitionColumn extends AbstractTableIndexColumn {
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
		return table;
		this.table = table;
	public boolean isAscending() {
	public DBSTableIndex getIndex() {
			} catch (DBException e) {
		public boolean allowCustomValue() {

    @Property(viewable = false)
	public ExasolTable getTable() {
	@Override

	public void setTableColumn(ExasolTableColumn tableColumn) {
	}
		@Nullable
	
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndex;
 * Unless required by applicable law or agreed to in writing, software
	public ExasolDataSource getDataSource() {
import org.jkiss.dbeaver.model.impl.struct.AbstractTableIndexColumn;
	@Override
	@Override

	}
	}
	
	private ExasolTableColumn tableColumn;
        @Override
		public Object[] getPossibleValues(ExasolTablePartitionColumn object) {
	}
	}
	}
import org.jkiss.dbeaver.Log;
	
		this.tableColumn = tableColumn;
import org.jkiss.code.Nullable;

		return null;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
	public void setOrdinalPosition(int ordinalPosition) {
		this.tableColumn = tableColumn;
 * See the License for the specific language governing permissions and

	}
	@Override
/*
 *
	private static final Log log = Log.getLog(ExasolTablePartitionColumn.class);
		return tableColumn.getName();
    @Property(viewable = true, updatable=true, editable=true, order = 2)
	}

				log.error("Failed to get list of available columns",e);
	}
 * You may obtain a copy of the License at
			return true;
		return tableColumn.getDescription();
		return false;
		this.table = table;
	public ExasolTablePartitionColumn(ExasolTable table, ExasolTableColumn tableColumn, int ordinalPosition)
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Property(viewable = false)
		return tableColumn;

import org.jkiss.code.NotNull;
	
 *

	
 * distributed under the License is distributed on an "AS IS" BASIS,
	

 *
		return table.getDataSource();
	public ExasolTablePartitionColumn(ExasolTable table) {
	public String getDescription() {
			throw new IllegalArgumentException();
	public ExasolTable getParentObject() {
 */
	}
	private ExasolTable table;
			}
	}

 * Copyright (C) 2010-2025 DBeaver Corp and others
		this.ordinalPosition = ordinalPosition;
	{
	
	@NotNull
	public static class TableColumListProvider implements IPropertyValueListProvider<ExasolTablePartitionColumn> {
		return ordinalPosition;
	
		
			try {
	@Override
		@Override
		}
