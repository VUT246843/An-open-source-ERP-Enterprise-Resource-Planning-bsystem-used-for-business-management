        return new UITask<PostgreIndex>() {
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
                            false));
                            colIndex++,
                StringBuilder idxName = new StringBuilder(64);
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
                        idxName.append("_").append(CommonUtils.escapeIdentifier(tableColumn.getName())); //$NON-NLS-1$

import org.jkiss.dbeaver.ui.editors.object.struct.EditIndexPage;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Postgre index configurator
import org.jkiss.code.Nullable;
            @Override
                idxName.append("_IDX"); //$NON-NLS-1$
                    index.addColumn(
 * limitations under the License.
                    Arrays.asList(DBSIndexType.OTHER, DBSIndexType.HASHED));
}
            protected PostgreIndex runTask() {
 * you may not use this file except in compliance with the License.

        }.execute();
import org.jkiss.dbeaver.model.edit.DBECommandContext;
import java.util.Map;
                    }
import org.jkiss.utils.CommonUtils;
                            -1,
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
 */
                            !Boolean.TRUE.equals(editPage.getAttributeProperty(tableColumn, EditIndexPage.PROP_DESC)),
                EditIndexPage editPage = new EditIndexPage(
                int colIndex = 1;
                index.setName(idxName.toString());
 * You may obtain a copy of the License at
 *
                }
 */
                index.setIndexType(editPage.getIndexType());
                idxName.append(CommonUtils.escapeIdentifier(((DBSTable)parent).getName()));
                            index,
 *
                index.setName(DBObjectNameCaseTransformer.transformObjectName(index, idxName.toString()));
                    return null;
    public PostgreIndex configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object parent, @NotNull PostgreIndex index, @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreIndexColumn;
 *
                            null,
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
/**
    @Override
    }
import java.util.Arrays;
                }

import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
                    "Edit index",
                return index;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        new PostgreIndexColumn(
            }



 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ext.postgresql.model.PostgreAttribute;
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
                if (!editPage.edit()) {

                    if (colIndex == 1) {
public class PostgreIndexConfigurator implements DBEObjectConfigurator<PostgreIndex> {
import org.jkiss.dbeaver.ui.UITask;
/*
import org.jkiss.code.NotNull;
                index.setUnique(editPage.isUnique());
                    index,
                            (PostgreAttribute) tableColumn,
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ext.postgresql.model.PostgreIndex;
import java.util.Collections;
package org.jkiss.dbeaver.ext.postgresql.ui.config;
                for (DBSEntityAttribute tableColumn : editPage.getSelectedAttributes()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others

