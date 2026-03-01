     * @param model
        @NotNull DBDResultSetModel model,
     */
     * @param options flags combined from HINT_ constants
    /**
     */
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.data.DBDResultSetModel;
import org.jkiss.dbeaver.model.data.DBDValueRow;
        @NotNull Collection<? extends DBDValueRow> rows,
     *
    ) throws DBException {
 */
import java.util.Collection;
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
import org.jkiss.code.Nullable;
}
        @NotNull DBRProgressMonitor monitor,
 *
     * Read all necessary data which is needed to render hints.
import org.jkiss.code.NotNull;
     * @param types   requested hint types
    @Nullable
        @NotNull DBDAttributeBinding attribute,
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Value hint provider
 * Copyright (C) 2010-2024 DBeaver Corp and others

        @NotNull Collection<DBDAttributeBinding> attributes,
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.EnumSet;
/**
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
 *

        boolean cleanupCache
     * Calculates approximate length (in characters) of hint text
package org.jkiss.dbeaver.model.data.hints;


    DBDValueHint[] getCellHints(
    /**
        @NotNull EnumSet<DBDValueHint.HintType> types,
        @NotNull DBDValueHintContext context,

        @NotNull DBDValueRow row,
 * See the License for the specific language governing permissions and
        @NotNull DBDValueHintContext context,
    }
     */
    default void cacheRequiredData(
        return 0;
    default int getAttributeHintSize(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @NotNull DBDAttributeBinding attribute
        @Nullable Object value,
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
    /**
 * DBeaver - Universal Database Manager
public interface DBDCellHintProvider extends DBDValueHintProvider {


 *
 * You may obtain a copy of the License at
 * limitations under the License.

     * Get all hints available for specified cell.
        int options);
    ) {

