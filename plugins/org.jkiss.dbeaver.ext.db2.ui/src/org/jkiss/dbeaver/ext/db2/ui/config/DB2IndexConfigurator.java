import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
import org.jkiss.dbeaver.ui.UITask;

                }
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                index.setUniqueRule(editPage.isUnique() ? DB2UniqueRule.U : DB2UniqueRule.D);
                    return null;
                        (DB2TableColumn) tableColumn,
            if (db2IndexType.isValidForCreation()) {

                String tableName = CommonUtils.escapeIdentifier(table.getName());
import org.jkiss.code.Nullable;
import org.jkiss.utils.CommonUtils;

import org.jkiss.dbeaver.ui.editors.object.struct.EditIndexPage;

 * Unless required by applicable law or agreed to in writing, software
    }
                    index.addColumn(new DB2IndexColumn(
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * limitations under the License.
    }
        }
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
        	EditIndexPage editPage = new EditIndexPage(
 * See the License for the specific language governing permissions and
        IX_TYPES = new ArrayList<>(DB2IndexType.values().length);
        });
    @Override
        	DB2TableBase table = (DB2TableBase) container;

 * DBeaver - Universal Database Manager
        for (DB2IndexType db2IndexType : DB2IndexType.values()) {
                return index;

                String indexBaseName = String.format(CONS_IX_NAME, tableName, colName);
    private static final List<DBSIndexType> IX_TYPES;
        return UITask.run(() -> {
 *
                String indexName = DBObjectNameCaseTransformer.transformName(table.getDataSource(), indexBaseName);

}
 */

 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.List;
import org.jkiss.dbeaver.ext.db2.model.DB2TableColumn;
 * DB2 index configurator
import org.jkiss.dbeaver.ext.db2.model.dict.DB2UniqueRule;
import org.jkiss.code.NotNull;

                IX_TYPES.add(db2IndexType.getDBSIndexType());
                for (DBSEntityAttribute tableColumn : editPage.getSelectedAttributes()) {
            }
import org.jkiss.dbeaver.ext.db2.ui.internal.DB2Messages;
                        !Boolean.TRUE.equals(editPage.getAttributeProperty(tableColumn, EditIndexPage.PROP_DESC))));
                int colIndex = 1;
public class DB2IndexConfigurator implements DBEObjectConfigurator<DB2Index> {
                if (!editPage.edit()) {
                }
import java.util.ArrayList;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 */

import java.util.Map;
import org.jkiss.dbeaver.ext.db2.model.DB2IndexColumn;
/**
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.ext.db2.model.DB2TableBase;
                        index,
                        colIndex++,
package org.jkiss.dbeaver.ext.db2.ui.config;
                String colName = CommonUtils.escapeIdentifier(editPage.getSelectedAttributes().iterator().next().getName());
 *
                    DB2Messages.edit_db2_index_manager_dialog_title, index, IX_TYPES);
 * You may obtain a copy of the License at

 *
 * distributed under the License is distributed on an "AS IS" BASIS,
                index.setIndexType(editPage.getIndexType());
    static {
    public DB2Index configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull DB2Index index, @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
import org.jkiss.dbeaver.ext.db2.model.dict.DB2IndexType;
 * you may not use this file except in compliance with the License.
                index.setName(indexName);
import org.jkiss.dbeaver.ext.db2.model.DB2Index;
    private static final String CONS_IX_NAME = "%s_%s_IDX";
/*
