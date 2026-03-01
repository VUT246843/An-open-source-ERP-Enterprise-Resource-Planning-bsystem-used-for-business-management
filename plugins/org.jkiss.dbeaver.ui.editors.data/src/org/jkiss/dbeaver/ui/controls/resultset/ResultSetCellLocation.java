    public DBDAttributeBinding getAttribute() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.row = row;
        return rowIndexes;
                leaf = nestedBindings.get(index);
import org.jkiss.code.NotNull;
    }
        this(attribute, row, null);
package org.jkiss.dbeaver.ui.controls.resultset;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        DBDAttributeBinding leaf = attribute;
 *
import org.jkiss.code.Nullable;

        return attribute;
 *
 *
    }
 * limitations under the License.

 * Unless required by applicable law or agreed to in writing, software
 */
        }
/*
 */
    @NotNull
import java.util.List;
    }
            for (int index : indexes) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    public ResultSetCellLocation(@NotNull DBDAttributeBinding attribute, @NotNull ResultSetRow row) {
                final List<DBDAttributeBinding> nestedBindings = leaf.getNestedBindings();

    }
        this.attribute = getLeafAttribute(attribute, rowIndexes);
 * you may not use this file except in compliance with the License.
        return leaf;
    private final int[] rowIndexes;

    @NotNull
 * You may obtain a copy of the License at
                }

    public ResultSetRow getRow() {

public class ResultSetCellLocation {
/**


    public ResultSetCellLocation(@NotNull DBDAttributeBinding attribute, @NotNull ResultSetRow row, @Nullable int[] rowIndexes) {
    }

    public static DBDAttributeBinding getLeafAttribute(@NotNull DBDAttributeBinding attribute, @Nullable int[] indexes) {
    private final ResultSetRow row;
 * Resultset cell location

        this.rowIndexes = rowIndexes;
import org.jkiss.utils.ArrayUtils;
                if (nestedBindings == null || index >= nestedBindings.size()) {
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
        return row;
import org.jkiss.dbeaver.model.DBPDataKind;
}
        if (leaf.getDataKind() == DBPDataKind.STRUCT && !ArrayUtils.isEmpty(indexes)) {
    @NotNull
    public int[] getRowIndexes() {
    private final DBDAttributeBinding attribute;


    @Nullable
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
                    break;
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
