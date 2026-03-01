{
        {

    {
    public int hashCode()
    {
            int res = pos1.row - pos2.row;
        this.row = copy.row;
    }
        this.col = copy.col;

        this.col = col;
/*

    {
public class GridPos implements DBDCellValue


    }
    }
 *

        return col >= 0 && row >= 0;
        this.row = row;
        }
 * limitations under the License.
    }
 * Unless required by applicable law or agreed to in writing, software


        @Override
            return res != 0 ? res : pos1.col - pos2.col;
        return this.col == pos.col && this.row == pos.row;
 */
/**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at

 *     http://www.apache.org/licenses/LICENSE-2.0
    {
    public GridPos(GridPos copy)
import java.util.Comparator;
import org.jkiss.dbeaver.model.data.DBDCellValue;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return object instanceof GridPos && equalsTo((GridPos) object);
    public String toString()
    {
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
    public boolean equalsTo(GridPos pos)
 * Licensed under the Apache License, Version 2.0 (the "License");
}
 * Grid position. Tuple of x/y coordinates.
    }
    }
        return col + ":" + row;
    }
    public boolean equals(int col, int row)
    }
    {



        return col ^ row;
    public int col;
    public boolean equals(Object object)
 * Pos comparator orders positions in tree in natural order (first ordered by rows then by columns).
        return this.col == col && this.row == row;
    public int row;
package  org.jkiss.dbeaver.ui.controls.lightgrid;
    public boolean isValid()
    public static class PosComparator implements Comparator<GridPos> {
    public GridPos(int col, int row)
    {
 *
 * DBeaver - Universal Database Manager

 * See the License for the specific language governing permissions and
    {
    }
 */
        public int compare(GridPos pos1, GridPos pos2)
