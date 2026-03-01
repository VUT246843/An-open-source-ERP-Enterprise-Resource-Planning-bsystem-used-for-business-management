 *     http://www.apache.org/licenses/LICENSE-2.0

 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
     * @param types   requested hint types
/**
     *
    /**
 *
 * You may obtain a copy of the License at
import org.jkiss.code.Nullable;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * @param options flags combined from HINT_ constants
import org.jkiss.code.NotNull;
        @NotNull EnumSet<DBDValueHint.HintType> types,
     */

package org.jkiss.dbeaver.model.data.hints;
 */
 * Row hint provider
     * @param model
 *
import org.jkiss.dbeaver.model.data.DBDResultSetModel;
     * Get all hints available for specified row.
 * Licensed under the Apache License, Version 2.0 (the "License");
 */

 * you may not use this file except in compliance with the License.
/*
        int options);
    DBDValueHint[] getRowHints(
}
 * Copyright (C) 2010-2024 DBeaver Corp and others
public interface DBDRowHintProvider extends DBDValueHintProvider {

 * DBeaver - Universal Database Manager
        @NotNull DBDValueRow row,
    @Nullable
        @NotNull DBDResultSetModel model,
 * limitations under the License.
import java.util.EnumSet;
import org.jkiss.dbeaver.model.data.DBDValueRow;
