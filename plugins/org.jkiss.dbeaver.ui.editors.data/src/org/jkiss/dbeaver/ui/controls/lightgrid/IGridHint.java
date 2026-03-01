
    @Nullable
package org.jkiss.dbeaver.ui.controls.lightgrid;
    DBPImage getIcon();

     * Hint text
 * Copyright (C) 2010-2026 DBeaver Corp and others

 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
    String getHintLabel();
import org.eclipse.swt.graphics.Point;
 * DBeaver - Universal Database Manager
    /**
     */
     */
     */
     *
 */
 *
    boolean hasAction();
 * See the License for the specific language governing permissions and
 * Grid cell hint

    boolean isError();
    String getText();
    String getActionToolTip();
import org.jkiss.code.NotNull;
    /**
     * Icon
     */
     * @param grid     grid controller

    @Nullable

    void performAction(@NotNull IGridController grid, @NotNull Point location, long state);
/**
    /**
import org.jkiss.code.Nullable;
 * Unless required by applicable law or agreed to in writing, software
    /**
     * @param location cell location in screen coordinates
     */

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     */
     * @return true if hint is an error notification
    @Nullable
 * Licensed under the Apache License, Version 2.0 (the "License");

    /**
/*
    /**

 *
     * Perform hint action

     */
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
     * Text for action hint tooltip
import org.jkiss.dbeaver.model.DBPImage;
    /**
    /**
     * Hint description label
     */
     * @return true if hint is a disablement
public interface IGridHint {
     * @param state    modifier state
    boolean isReadOnly();
     * @return true if hint has action which can be executed by clicking on the icon

 */
 * you may not use this file except in compliance with the License.
 *

}
