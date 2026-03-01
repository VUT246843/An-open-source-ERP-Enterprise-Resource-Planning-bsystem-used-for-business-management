 *
        boolean supportUniqueIndexes = tableBase.supportUniqueIndexes();
                for (DBSEntityAttribute tableColumn : editPage.getSelectedAttributes()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                        idxName.append("_").append(CommonUtils.escapeIdentifier(tableColumn.getName()));
                EditIndexPage editPage = new EditIndexPage(
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.code.Nullable;

/*
import java.util.Map;
                    index,
import java.util.Collection;
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
public class GenericTableIndexConfigurator implements DBEObjectConfigurator<GenericTableIndex> {
                idxName.append("_IDX");
}
                return index;
import org.jkiss.dbeaver.ext.generic.model.GenericTableIndex;
    public GenericTableIndex configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object table, @NotNull GenericTableIndex index, @NotNull Map<String, Object> options) {
 *
 * you may not use this file except in compliance with the License.
        }.execute();
        Collection<DBSIndexType> tableIndexTypes = tableBase.getTableIndexTypes();
import org.jkiss.utils.CommonUtils;
 * See the License for the specific language governing permissions and
                index.setUnique(editPage.isUnique());
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                StringBuilder idxName = new StringBuilder(64);
import org.jkiss.dbeaver.ui.editors.object.struct.EditIndexPage;
 *
                }
                            index,
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
                    tableIndexTypes, supportUniqueIndexes);
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
                            colIndex++,
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
 */
        GenericTableBase tableBase = (GenericTableBase) table;
import org.jkiss.dbeaver.ext.generic.model.GenericTableIndexColumn;
/**
import org.jkiss.code.NotNull;
    }
                index.setIndexType(editPage.getIndexType());
package org.jkiss.dbeaver.ext.generic.views;
                    return null;
 * Generic table index configurator
                    "Create index",
import org.jkiss.dbeaver.model.edit.DBECommandContext;
                        new GenericTableIndexColumn(
                            !Boolean.TRUE.equals(editPage.getAttributeProperty(tableColumn, EditIndexPage.PROP_DESC))));
                            (GenericTableColumn) tableColumn,
                index.setName(DBObjectNameCaseTransformer.transformObjectName(index, idxName.toString()));

                if (!editPage.edit()) {
            }
            @Override
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
        return new UITask<GenericTableIndex>() {
                }
import org.jkiss.dbeaver.ui.UITask;
 * DBeaver - Universal Database Manager
                int colIndex = 1;
 *     http://www.apache.org/licenses/LICENSE-2.0
                    }
import org.jkiss.dbeaver.ext.generic.model.GenericTableColumn;
 * You may obtain a copy of the License at
                    index.addColumn(
            protected GenericTableIndex runTask() {

import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
                    if (colIndex == 1) {
                idxName.append(CommonUtils.escapeIdentifier(index.getTable().getName()));
 * Copyright (C) 2010-2024 DBeaver Corp and others

 */
