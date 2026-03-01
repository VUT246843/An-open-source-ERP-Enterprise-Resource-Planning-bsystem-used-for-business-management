
        int options);
import java.util.EnumSet;
     * @param options flags combined from HINT_ constants
    DBDValueHint[] getAttributeHints(
public interface DBDAttributeHintProvider extends DBDValueHintProvider {
     * @param types   requested hint types
 */
import org.jkiss.dbeaver.model.data.DBDResultSetModel;
 */
    /**
 * See the License for the specific language governing permissions and
        @NotNull DBDAttributeBinding attribute,
 * Value hint provider
 * You may obtain a copy of the License at
/**
 *
     * @param model
import org.jkiss.code.NotNull;

 *
}
import org.jkiss.code.Nullable;
/*
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;

 *     http://www.apache.org/licenses/LICENSE-2.0
     * Get all hints available for specified attribute.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
     *
 *
package org.jkiss.dbeaver.model.data.hints;
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
        @NotNull EnumSet<DBDValueHint.HintType> types,
 * limitations under the License.
     */
    @Nullable
        @NotNull DBDResultSetModel model,
 * Unless required by applicable law or agreed to in writing, software
