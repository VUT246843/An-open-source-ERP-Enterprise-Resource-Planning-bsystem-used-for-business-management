	public ExasolTablePartitionColumn getObject(@NotNull DBRProgressMonitor monitor, @NotNull ExasolTable owner, @NotNull String name)
	public Collection<ExasolTablePartitionColumn> getAllObjects(@NotNull DBRProgressMonitor monitor, ExasolTable owner)
			{
			super.setCache(tablePartitionColumns);
import java.util.ArrayList;
 * Copyright (C) 2010-2024 DBeaver Corp and others
	public void clearCache() {
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.ext.exasol.model.cache;
			throws DBException {
		super.clearCache();
import org.jkiss.dbeaver.DBException;
	}

				}
import org.jkiss.code.NotNull;
			.filter(o -> o.getName().equals(name)).findFirst().get();
    			.sorted(Comparator.comparing(ExasolTablePartitionColumn::getOrdinalPosition))
			sortPartitionColumns();
		if (tablePartitionColumns.isEmpty() && ! super.fullCache)
 *     http://www.apache.org/licenses/LICENSE-2.0
		}
/*
	
				.filter(c -> tablePartitionColumns.stream()
 *
import java.util.Collection;
		if (tablePartitionColumns.stream()
 * you may not use this file except in compliance with the License.
import java.util.List;
    public ExasolTablePartitionColumnCache() {
}
		return tablePartitionColumns;
 * Unless required by applicable law or agreed to in writing, software
	}
		return owner.getAttributes(monitor).stream()
    private void sortPartitionColumns()
import java.util.Comparator;
	    	for( ExasolTableColumn col: owner.getAttributes(monitor))
				)
	}
			return tablePartitionColumns.stream()
    			.collect(Collectors.toCollection(ArrayList::new));
	@NotNull
    @Override
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
				{
import org.jkiss.dbeaver.model.struct.cache.AbstractObjectCache;
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.stream.Collectors;
				if (col.getPartitionKeyOrdinalPosition() != null)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.ext.exasol.model.ExasolTable;
				.filter(o -> o.getTableColumn().getName().equals(name)).findFirst().isPresent())
 * Copyright (C) 2016-2019 Karl Griesser (fullref@gmail.com)
import org.jkiss.dbeaver.ext.exasol.model.ExasolTablePartitionColumn;

				.collect(Collectors.toList());
    	tablePartitionColumns = tablePartitionColumns.stream()
	public Collection<ExasolTableColumn> getAvailableTableColumns(ExasolTable owner, DBRProgressMonitor monitor) throws DBException {

		if (!super.isFullyCached())
			getAllObjects(monitor, owner);
		{
		return null;
    {
 * limitations under the License.
			throws DBException {
		tablePartitionColumns.clear();
 *

 * DBeaver - Universal Database Manager
					tablePartitionColumns.add(new ExasolTablePartitionColumn(owner, col, col.getPartitionKeyOrdinalPosition().intValue()));
	
				.filter(c -> c.getDataKind() == DBPDataKind.DATETIME || c.getDataKind() == DBPDataKind.NUMERIC )

		}
import org.jkiss.dbeaver.ext.exasol.model.ExasolTableColumn;
    private List<ExasolTablePartitionColumn> tablePartitionColumns;
    
		{
	
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.DBPDataKind;

	}
	@Override
public class ExasolTablePartitionColumnCache extends AbstractObjectCache<ExasolTable, ExasolTablePartitionColumn> {
    	tablePartitionColumns = new ArrayList<ExasolTablePartitionColumn>();

 *
			}

						.noneMatch(pc -> pc.getTableColumn() != null && pc.getName().equals(c.getName()))
	}
	@Override
		}
 */
		{

