     * Value name (name of attribute or other metadata object)
     */
package org.jkiss.dbeaver.ui.data;
 */
 *
    DBCExecutionContext getExecutionContext();
     * Updates value
     * Show error/warning message in grid control.
     */
    /**
    IDataController getDataController();
    /**
    @NotNull

     */

/**
 *
     */
        PANEL,  // "Preview" editor, appears on a special grid panel.
 *     http://www.apache.org/licenses/LICENSE-2.0
        EDITOR  // Separate editor, dialog or standalone editor window
    /**
     * Active execution context. Context lifetime is longer than value handler lifetime.
                // May be reused to edit different cells of the same type.
     * Associated value handler
    /**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     */
    @Nullable
 * you may not use this file except in compliance with the License.
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
     */
    /**

import org.jkiss.dbeaver.model.data.DBDValueHandler;

 * DBD Value Controller
     */
        INLINE, // Inline editor, appears right in grid's cell
     * Updates value in all selected cells
     * @return placeholder control or null
     * @return execution context
     * @param value value

{

}
     * Column value
     * @return meta data
     * Value editor type
    /**
    /**
import org.eclipse.ui.IWorkbenchPartSite;
     */
     * @param messageType status message type
    String getValueName();
    /**
     * True if current cell is read-only.

import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    IValueManager getValueManager();
    /**

    void updateValue(@Nullable Object value, boolean updatePresentation);
 * Unless required by applicable law or agreed to in writing, software
     * @return value name
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.eclipse.swt.widgets.Composite;
 * distributed under the License is distributed on an "AS IS" BASIS,
    boolean isReadOnly();
 * See the License for the specific language governing permissions and
import org.jkiss.code.Nullable;

     * Associated value manager

     * Controller's host site
 * limitations under the License.
     * @param updatePresentation    refresh UI
    DBSTypedObject getValueType();
     * In case of separated editor it is null.
import org.jkiss.dbeaver.model.DBPMessageType;

import org.jkiss.code.NotNull;
     * @return value manager

     */
    Composite getEditPlaceholder();
    }
    void showMessage(String message, DBPMessageType messageType);
    /**
     */
 * You may obtain a copy of the License at
     * @return site
     */
     */

     * @return read only flag
    void updateSelectionValue(@Nullable Object value);
     * Value type
public interface IValueController

     */
    enum EditType {
/*
    void refreshEditor();
    /**
    IWorkbenchPartSite getValueSite();
        NONE,   // Void editor, should be ignored by users
    /**
     * @return value handler

     * @param value value
    Object getValue();
     * @return value
     */
     * @param message error message


     * Refreshes (recreates) editor.
 *
    @Nullable
    DBDValueHandler getValueHandler();
     * Inline or panel placeholder. Editor controls should be created inside of this placeholder.
    /**
    EditType getEditType();
    /**
 * DBeaver - Universal Database Manager

