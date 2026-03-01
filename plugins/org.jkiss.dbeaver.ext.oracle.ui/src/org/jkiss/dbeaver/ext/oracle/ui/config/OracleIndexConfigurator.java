            index.setName(DBObjectNameCaseTransformer.transformName(index.getDataSource(), idxName.toString()));

            index.setUnique(editPage.isUnique());
 * See the License for the specific language governing permissions and
                .append("_IDX"); //$NON-NLS-1$
import org.jkiss.dbeaver.ui.UITask;
                index.addColumn(
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.ext.oracle.model.OracleTableIndexColumn;
 *
 * Oracle index manager
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
import java.util.Collections;
/*
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
import org.jkiss.code.NotNull;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public OracleTableIndex configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull OracleTableIndex index, @NotNull Map<String, Object> options) {
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
 */
            StringBuilder idxName = new StringBuilder(64);
}
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
 */
                        !Boolean.TRUE.equals(editPage.getAttributeProperty(tableColumn, EditIndexPage.PROP_DESC)),
/**
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class OracleIndexConfigurator implements DBEObjectConfigurator<OracleTableIndex> {
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
    }
            idxName.append(CommonUtils.escapeIdentifier(index.getTable().getName())).append("_") //$NON-NLS-1$
            for (DBSEntityAttribute tableColumn : editPage.getSelectedAttributes()) {
 * Copyright (C) 2010-2024 DBeaver Corp and others


                        (OracleTableColumn) tableColumn,
            EditIndexPage editPage = new EditIndexPage(

 * You may obtain a copy of the License at
                .append(CommonUtils.escapeIdentifier(editPage.getSelectedAttributes().iterator().next().getName()))
                index,
                Collections.singletonList(DBSIndexType.OTHER));
                OracleUIMessages.edit_oracle_index_manager_dialog_title,
                        index,
        return UITask.run(() -> {
import java.util.Map;
import org.jkiss.code.Nullable;
package org.jkiss.dbeaver.ext.oracle.ui.config;
                return null;
                        null));


        });
import org.jkiss.dbeaver.ext.oracle.ui.internal.OracleUIMessages;
import org.jkiss.dbeaver.ui.editors.object.struct.EditIndexPage;
            index.setIndexType(editPage.getIndexType());
            }
    @Override
                        colIndex++,
 * DBeaver - Universal Database Manager
                    new OracleTableIndexColumn(
 *
            if (!editPage.edit()) {
            return index;
import org.jkiss.dbeaver.ext.oracle.model.OracleTableIndex;
import org.jkiss.dbeaver.ext.oracle.model.OracleTableColumn;
            int colIndex = 1;
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
