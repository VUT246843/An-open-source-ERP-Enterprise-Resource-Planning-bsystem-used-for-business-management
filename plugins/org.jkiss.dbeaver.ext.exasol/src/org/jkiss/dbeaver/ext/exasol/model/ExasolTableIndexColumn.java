	public String getDescription() {
		return this.ordinalPosition;
	}

		return this.index;
    public ExasolTableColumn getTableColumn()
	public DBPDataSource getDataSource() {
 * you may not use this file except in compliance with the License.
		return index;
		this.tableColumn = tableColumn;
	}
import org.jkiss.code.NotNull;
	}
	public ExasolTableIndex getParentObject() {
	@Override
        return tableColumn;
	@Override
 * limitations under the License.
	}
import org.jkiss.dbeaver.model.impl.struct.AbstractTableIndexColumn;
	public boolean isAscending() {
	@Override
	}
		return index.getDataSource();
    @Override
	}
	@Override
			ExasolTableColumn tableColumn,
 * Unless required by applicable law or agreed to in writing, software
			) 
		// Index has no description in Exasol
	
    @Property(id = "name", viewable = true, order = 1)
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.Nullable;

 * Licensed under the Apache License, Version 2.0 (the "License");
	{
	public String getName() {
 * See the License for the specific language governing permissions and
		this.index = index;
    @Override

 * distributed under the License is distributed on an "AS IS" BASIS,
	public int getOrdinalPosition() {
	
	}

			int ordinalPosition

}
	
public class ExasolTableIndexColumn extends AbstractTableIndexColumn {
import org.jkiss.dbeaver.model.meta.Property;
	private int ordinalPosition;
	private ExasolTableColumn tableColumn;
	
import org.jkiss.dbeaver.model.DBPDataSource;

	
	@Override
 *
/*

		return true;
 * You may obtain a copy of the License at
	}
		this.ordinalPosition = ordinalPosition;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Nullable
 * Copyright (C) 2010-2025 DBeaver Corp and others

		return "";
 * DBeaver - Universal Database Manager
    {
		return tableColumn.getName();
			ExasolTableIndex index,
package org.jkiss.dbeaver.ext.exasol.model;
    }
	@Override
	public ExasolTableIndex getIndex() {
	public ExasolTableIndexColumn(

    @Property(viewable = false, order = 2)
	@NotNull
 */
	private ExasolTableIndex index;
 *
