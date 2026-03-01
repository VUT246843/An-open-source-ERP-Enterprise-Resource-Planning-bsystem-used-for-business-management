
    DBDValueHintContext getHintContext();

    Object getCellValue(@NotNull DBDAttributeBinding attribute, @NotNull DBDValueRow row) throws DBException;

     * for queries then is will null.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
 *
    @NotNull

        @NotNull DBDValueRow row,
     * single source is null. If driver doesn't support meta information
}     *
     * Returns single source of this result set. Usually it is a table.
/*
 *
    @Nullable
        @Nullable int[] rowIndexes,
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * Keeps information about entire resultset
    @Nullable
import org.jkiss.dbeaver.DBException;
     * @return single source entity
 * limitations under the License.
    @Nullable
    DBDRowIdentifier getDefaultRowIdentifier();
import org.jkiss.dbeaver.model.data.hints.DBDValueHintContext;
 */

    /**
     */
    Object getCellValue(
package org.jkiss.dbeaver.model.data;

    @Nullable
public interface DBDResultSetModel {
    @Nullable
    @Nullable
        boolean retrieveDeepestCollectionElement
    List<DBDAttributeBinding> getVisibleAttributes() throws DBException;
import org.jkiss.code.Nullable;

    List<? extends DBDValueRow> getAllRows();

 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    @NotNull
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

     * If result set is a result of joins or contains synthetic attributes then
import org.jkiss.dbeaver.model.struct.DBSEntity;
    ) throws DBException;
        @NotNull DBDAttributeBinding attribute,
 * Unless required by applicable law or agreed to in writing, software
    DBDAttributeBinding[] getAttributes() throws DBException;
    DBSEntity getSingleSource() throws DBException;
    String getReadOnlyStatus(@Nullable DBPDataSourceContainer dataSourceContainer);
 */
    @NotNull
import java.util.List;

/**
 * distributed under the License is distributed on an "AS IS" BASIS,


 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;
