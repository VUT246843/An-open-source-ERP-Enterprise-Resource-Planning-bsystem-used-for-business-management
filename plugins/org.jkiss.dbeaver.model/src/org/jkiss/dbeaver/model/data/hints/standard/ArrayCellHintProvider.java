        @NotNull DBDAttributeBinding attribute,
 * limitations under the License.
    public DBDValueHint[] getCellHints(
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBUtils;
                };
        @NotNull DBDResultSetModel model,
 *
            !CommonUtils.isBitSet(options, OPTION_ROW_EXPANDED) &&
        int options
                return new DBDValueHint[] {
        }
import org.jkiss.dbeaver.model.data.DBDCollection;
 * See the License for the specific language governing permissions and
        if (!DBUtils.isNullValue(value) &&

 *
    @Nullable
 * Arrays hint provider
    @Override
import org.jkiss.code.Nullable;
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
/**
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.model.data.hints.standard;
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
 *
        @NotNull EnumSet<DBDValueHint.HintType> types,
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.data.hints.ValueHintText;

    }
        @Nullable Object value,
import org.jkiss.dbeaver.model.data.hints.DBDCellHintProvider;

        return null;
            }
import org.jkiss.dbeaver.model.data.DBDValueRow;
    ) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.utils.CommonUtils;
}
import java.util.EnumSet;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        ) {
                    new ValueHintText(
        @NotNull DBDValueRow row,
                        !CommonUtils.isBitSet(options, OPTION_TOOLTIP) ? "[+" + (collection.size() - 1) + "]" : String.valueOf(collection.size()),
import org.jkiss.dbeaver.model.data.hints.DBDValueHint;
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;

/*

                        "Size", null)
import org.jkiss.dbeaver.model.data.DBDResultSetModel;
            if (collection.size() > 1) {
            value instanceof DBDCollection collection
public class ArrayCellHintProvider implements DBDCellHintProvider {
