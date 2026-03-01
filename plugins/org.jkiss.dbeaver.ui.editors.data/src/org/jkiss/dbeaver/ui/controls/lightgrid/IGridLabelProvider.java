    Color getHeaderReadOnlyColor();
     */
    @Nullable
     * @return the {@link String} or <code>null</code> if there is not text to
    Color getHeaderBorder(@Nullable IGridItem item);

 * Licensed under the Apache License, Version 2.0 (the "License");
     * @param element the element
     * @return the background color for the {@code item}
     * @return	the foreground color for the element, or <code>null</code>
 * You may obtain a copy of the License at
     * Get the text displayed in the tool tip for object.
     * Provides a background color for the header of the given {@code item}.
    Color getHintForeground();
     * @param selected whether the selection color should be returned instead or not
     * @return the foreground color for the {@code item}
import org.eclipse.swt.graphics.Font;
    Font getMainFontItalic();
    /**
public interface IGridLabelProvider {

    /**

/*
     *
     * Provides a background color for the given element.
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others

    String getToolTipText(IGridItem element);
     */
    Image getImage(IGridItem element);
 *
     * @param item the item for which the color should be returned
 * Unless required by applicable law or agreed to in writing, software
    @Nullable
     * @return the font for the element, or <code>null</code>
    /**
    /**
     * @return the border color for the {@code item}
    @NotNull
     * @param element
 * you may not use this file except in compliance with the License.

    @NotNull

     */
     *            the element for which the tool tip is shown
     *
     *
     *
     * @param selected whether the selection color should be returned instead or not

     */
 *
    /**

     *   to use the default foreground color
     */
    @NotNull
    /**
    Object getGridOption(String option);
     *
    String getDescription(IGridItem element);
    /**
 * limitations under the License.
import org.jkiss.code.Nullable;
    Color getBackground(IGridItem element);

     *   to use the default background color


     * @param element the element
     */
    Font getFont(IGridItem element);
 * DBeaver - Universal Database Manager
    Color getHeaderBackground(@Nullable IGridItem item, boolean selected);
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull
    Color getHeaderForeground(@Nullable IGridItem item, boolean selected);
    Color getForeground(IGridItem element);
     *
     * Provides a border color for the header of the given {@code item}.
import org.eclipse.swt.graphics.Color;
     * @param element the element
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    Color getErrorForeground();
import org.jkiss.code.NotNull;

     * @param item     the item for which the color should be returned
     *
import org.eclipse.swt.graphics.Image;
     * @param item     the item for which the color should be returned
     */
     * Disabled header color
    String OPTION_EXCLUDE_COLUMN_NAME_FOR_WIDTH_CALC = "OPTION_EXCLUDE_COLUMN_NAME_FOR_WIDTH_CALC";
 *

     * Provides a foreground color for the given element.

     *         display
     */
     *   to use the default font

    /**

     * Provides a font for the given element.
package org.jkiss.dbeaver.ui.controls.lightgrid;
}
     * Provides a foreground color for the header of the given {@code item}.
 * distributed under the License is distributed on an "AS IS" BASIS,
     * @return	the background color for the element, or <code>null</code>
 */
    String getText(@NotNull IGridItem element);


