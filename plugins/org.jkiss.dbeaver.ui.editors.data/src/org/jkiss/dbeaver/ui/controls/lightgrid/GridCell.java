    @Override
        return col + ":" + row;

    public IGridRow getRow() {
 */
}
    }
 * limitations under the License.
    public final IGridColumn col;
    @Override
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.ui.controls.lightgrid;
        return Objects.hash(col, row);
        GridCell gridCell = (GridCell) o;
 *
        this.row = row;
        return row;
 * GridCell
 * You may obtain a copy of the License at

    }

 *
        if (o == null || getClass() != o.getClass()) return false;

 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public GridCell(@NotNull IGridColumn col, @NotNull IGridRow row) {


 * Licensed under the Apache License, Version 2.0 (the "License");
    public IGridColumn getColumn() {

    public int hashCode() {
        this.col = col;
 * DBeaver - Universal Database Manager
    }
    @Override
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
/*


    public String toString() {
    @Override
import java.util.Objects;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        return col.equals(gridCell.col) && row.equals(gridCell.row);
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.NotNull;
public class GridCell implements IGridCell {
        return col;

    public boolean equals(Object o) {
 */
    public final IGridRow row;
/**
        if (this == o) return true;
    }
    }
 *
