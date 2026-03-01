    boolean showCheckboxes();
import org.eclipse.gef.EditPartFactory;
    @Nullable
package org.jkiss.dbeaver.ui.editors.erd.model;
    Dimension getEntitySnapSize();
 *
    boolean supportsStructureEdit();
import org.eclipse.draw2d.geometry.Dimension;
    /**
    /**
/**
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDViewStyle;
     */
public interface ERDDecorator {
 * ERD object adapter
    boolean supportsAttributeVisibility();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
     */
 */


    EditPartFactory createPartFactory();

 *     http://www.apache.org/licenses/LICENSE-2.0
     * Snap size for entity figures. Rounds entity position to this snap size.
    boolean supportsAttributeStyle(@NotNull ERDViewStyle style);

     */

 * See the License for the specific language governing permissions and
     * Margin around entity figure. This affects diagram connections layout
/*
 * DBeaver - Universal Database Manager

    Insets getDefaultEntityInsets();
 *
 * limitations under the License.

import org.eclipse.draw2d.geometry.Insets;
import org.jkiss.code.NotNull;
 *
import org.jkiss.code.Nullable;

    @NotNull
 * Copyright (C) 2010-2025 DBeaver Corp and others

 * distributed under the License is distributed on an "AS IS" BASIS,
 */
     * Checks whether the given {@code style} is supported by the decorator.
import org.eclipse.gef.palette.PaletteRoot;
}
 * you may not use this file except in compliance with the License.
    default boolean isHideUnusedColumns() {return false;}

    default void setHideUnusedColumns(boolean b) {}
 * Licensed under the Apache License, Version 2.0 (the "License");


 * You may obtain a copy of the License at
    /**
 * Unless required by applicable law or agreed to in writing, software
    void fillPalette(@NotNull PaletteRoot paletteRoot, boolean readOnly);

