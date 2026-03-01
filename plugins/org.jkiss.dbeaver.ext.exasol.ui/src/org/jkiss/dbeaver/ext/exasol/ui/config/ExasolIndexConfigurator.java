public class ExasolIndexConfigurator implements DBEObjectConfigurator<ExasolTableIndex> {
import org.jkiss.code.NotNull;
						"create index",
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
import org.jkiss.dbeaver.ext.exasol.model.ExasolTableIndex;
					);
						Arrays.asList(new DBSIndexType("LOCAL","LOCAL"), new DBSIndexType("GLOBAL","GLOBAL")),


					return null;
		}
		return UITask.run(() -> {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

			});
import java.util.Map;
 * distributed under the License is distributed on an "AS IS" BASIS,
				index.setName(index.getIndexType().getName() + " INDEX " + index.getSimpleColumnString());
 *
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.ext.exasol.ui.config;
	public ExasolTableIndex configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull ExasolTableIndex index, @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.ext.exasol.model.ExasolTableIndexColumn;
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
				int colIndex = 1;
				
	@Override
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;

 *     http://www.apache.org/licenses/LICENSE-2.0
				for (DBSEntityAttribute tableColumn : editPage.getSelectedAttributes()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
				if (!editPage.edit()) {
 */
import org.jkiss.dbeaver.model.edit.DBECommandContext;
						false
 * limitations under the License.

				index.setIndexType(editPage.getIndexType());
 *
import org.jkiss.dbeaver.ui.UITask;
				}
				}
				EditIndexPage editPage = new EditIndexPage(
				return index;
							);
 *
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.ui.editors.object.struct.EditIndexPage;
						index,

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

}
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
/*
import java.util.Arrays;
								new ExasolTableIndexColumn(index, (ExasolTableColumn) tableColumn, colIndex++)
					index.addColumn(
import org.jkiss.dbeaver.ext.exasol.model.ExasolTableColumn;

