        int options
 *     http://www.apache.org/licenses/LICENSE-2.0



 * Unless required by applicable law or agreed to in writing, software
        @NotNull EnumSet<DBDValueHint.HintType> types,
    @Nullable
        @Nullable Object value,
public class VoidHintProvider implements DBDCellHintProvider {
        @NotNull DBDResultSetModel model,
/*
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.model.data.hints.DBDCellHintProvider;

 * See the License for the specific language governing permissions and
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.data.DBDResultSetModel;
    }
import org.jkiss.dbeaver.model.data.hints.DBDValueHint;
 *
import org.jkiss.dbeaver.model.data.DBDValueRow;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
        @NotNull DBDAttributeBinding attribute,
 *
package org.jkiss.dbeaver.model.data.hints.standard;
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.EnumSet;
 */
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
    @Override
        @NotNull DBDValueRow row,
/**
 * you may not use this file except in compliance with the License.
    public static final VoidHintProvider INSTANCE = new VoidHintProvider();

    public DBDValueHint[] getCellHints(
    ) {
}
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
import org.jkiss.code.NotNull;
        return null;
 * Void hint provider. Stub for no hints
