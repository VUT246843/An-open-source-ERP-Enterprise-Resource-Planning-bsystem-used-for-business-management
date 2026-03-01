
    int getSortOrder(@Nullable IGridColumn element);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    boolean isElementExpandable(@NotNull IGridItem item);

import org.eclipse.jface.viewers.IContentProvider;

        public Color foreground;

        public Object value;
import org.jkiss.dbeaver.model.DBPImage;

 * Licensed under the Apache License, Version 2.0 (the "License");

    @NotNull
import org.jkiss.code.NotNull;
    class CellInformation {
     * Called for all cells of columns for which isCollectionElement() returns true.
        public int align;

    int getColumnHintsWidth(IGridColumn colElement);

    Object[] getChildren(@NotNull IGridItem item);
import org.eclipse.swt.graphics.Font;
    void resetColors();
    /**

    @NotNull


    int STATE_NONE = 0;
    int ALIGN_LEFT = 0;
 * Copyright (C) 2010-2025 DBeaver Corp and others

    /**
    void validateDataPresence(IGridColumn colElement, IGridRow rowElement);
    int STATE_DECORATED = 1 << 4;

     */
    Object getCellValue(IGridColumn colElement, IGridRow rowElement, boolean formatString);

 */

    int STATE_TRANSFORMED = 1 << 2;
 * you may not use this file except in compliance with the License.
import org.eclipse.swt.graphics.Color;
        public Color background;

    boolean isElementSupportsSort(@Nullable IGridColumn element);

 * See the License for the specific language governing permissions and
        NONE,
    int ALIGN_RIGHT = 2;


import org.jkiss.code.Nullable;
 *
    enum ElementState {
     */
        public Font font;
     */
     * @param formatString Format string values or return raw values
/*
    List<IGridHint> getCellHints(IGridColumn colElement, IGridRow rowElement, Object cellValue, int options);
    int STATE_LINK = 1;
 * DBeaver - Universal Database Manager
        public Object text;
 * Unless required by applicable law or agreed to in writing, software
    int STATE_BOOLEAN = 1 << 7;
    boolean hasChildren(@NotNull IGridItem item);
    String getCellLinkText(IGridColumn colElement, IGridRow rowElement);

}
     * Returns cell information.

     * TODO: add returnColors parameter for optimization

     *

     */

 * limitations under the License.
    }
public interface IGridContentProvider extends IContentProvider {
    boolean isGridReadOnly();
    @NotNull
    int STATE_EXPANDED = 1 << 5;
    int ALIGN_CENTER = 1;
    int STATE_TOGGLE = 1 << 3;
    boolean isElementSupportsFilter(@Nullable IGridColumn element);
 * distributed under the License is distributed on an "AS IS" BASIS,
     * Checks for additional data read according to the specified cell/row
    List<IGridHint> getColumnHints(IGridItem element, int options);

    /**
    int STATE_COLLAPSED = 1 << 6;
    // Resets all cached colors

    int getCollectionSize(@NotNull IGridColumn colElement, @NotNull IGridRow rowElement);
    int getColumnPinIndex(@NotNull IGridColumn element);
    }
        public DBPImage image;
 *
package org.jkiss.dbeaver.ui.controls.lightgrid;
    ElementState getDefaultState(@NotNull IGridColumn element);

import java.util.List;

    IGridStatusColumn[] getStatusColumns();
    boolean isElementReadOnly(@NotNull IGridColumn element);
    boolean isVoidCell(IGridColumn gridColumn, IGridRow gridRow);

    int STATE_HYPER_LINK = 1 << 1;
 *
    String getCellToolTip(IGridColumn colElement, IGridRow rowElement);



    /**
    Object[] getElements(boolean horizontal);
 *     http://www.apache.org/licenses/LICENSE-2.0
        public int state;
    CellInformation getCellInfo(IGridColumn colElement, IGridRow rowElement, boolean selected);
     * Return for collection cell values returns size of collection.
 * You may obtain a copy of the License at
        COLLAPSED
        EXPANDED,
    @Nullable
