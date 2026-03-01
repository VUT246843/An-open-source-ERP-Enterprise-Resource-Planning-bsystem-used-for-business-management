        }
     * @param append             appends data
    boolean isDirty();
    enum PresentationType {

package org.jkiss.dbeaver.ui.controls.resultset;
}
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Composite;
        }
    Point getCursorLocation();

    /**

 * May additionally implement IResultSetEditor, ISelectionProvider, IStatefulControl
    @Nullable

     *
        DOCUMENT(true),
import org.eclipse.swt.dnd.Transfer;
/*
     *

    void printResultSet();
 */
    enum RowPosition {
     */
        public boolean isPersistent() {
 * Unless required by applicable law or agreed to in writing, software
         * Persistent presentation will be reused next time user will show the same resultset.




     * Copies selected cells in supported Transfer formats.
    void rejectChanges();
        /**
 *
import org.eclipse.swt.graphics.Point;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");

    void formatData(boolean refreshData);
 *
            this.persistent = persistent;
    }
    @Nullable
            return persistent;
     * A predicate that decides whether the presentation can be shown or not.
        CURRENT
    DBDAttributeBinding getCurrentAttribute();
     */
    void createPresentation(@NotNull IResultSetController controller, @NotNull Composite parent);
/**
 * DBeaver - Universal Database Manager
public interface IResultSetPresentation {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        PresentationType(boolean persistent) {

    /**
     * @return {@code true} if the presentation can be shown, or {@code false} if not
    IResultSetController getController();
import org.eclipse.jface.action.IMenuManager;

     * Called by controller to fill context menu.
     * <p>
        return true;
    void fillMenu(@NotNull IMenuManager menu);
    /**
    void updateValueView();
     * @param controller associated result set controller
     * @return identifier of the font


        LAST,
    @NotNull
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
     */
 * Result set renderer.

import org.jkiss.code.Nullable;
        COLUMNS(true),
    default boolean canShowPresentation(@NotNull IResultSetController controller) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Nullable


 * See the License for the specific language governing permissions and
    void applyChanges();
     * @param keepState          commands to keep current presentation state even if refreshMetadata is true (usually this means data refresh/reorder).
        CUSTOM(true),
    int[] getCurrentRowIndexes();
    /**
     * @param refreshData data was refreshed
    Control getControl();
 *     http://www.apache.org/licenses/LICENSE-2.0
     * Refreshes data

    /**


 * You may obtain a copy of the License at
     * call this function.
     * An implementation may opt not to be opened. This can be useful if
    }
        FIRST,

import org.jkiss.code.NotNull;

    /**
    void showAttribute(@NotNull DBDAttributeBinding attribute);
    /**
        private final boolean persistent;
     * Called after results refresh
     */
     * Note: context menu invocation must be initiated by presentation, then it should call controller's
    void refreshData(boolean refreshMetadata, boolean append, boolean keepState);
     * {@link org.jkiss.dbeaver.ui.controls.resultset.IResultSetController#fillContextMenu} which then will
 * Copyright (C) 2010-2025 DBeaver Corp and others
     * an interactive confirmation is shown with an option to cancel the operation.
     */
    void changeMode(boolean recordMode);
    Map<Transfer, Object> copySelection(ResultSetCopySettings settings);
    }
 * Visualizes result set viewer/editor.
     * Retrieves font identifier to increase or decrease its size as the user zooms in/out on the presentation.

import java.util.Map;
 *
 * you may not use this file except in compliance with the License.
     *  Changes in the presentation will be canceled, the presentation will return in the initial state.
 * limitations under the License.

    void clearMetaData();
     */

     */

    void setCurrentAttribute(@NotNull DBDAttributeBinding attribute);

     * @param menu    menu

     * @param refreshMetadata    true if contents structure should be reloaded


         */
     * @see org.eclipse.jface.resource.FontRegistry
    void dispose();

        PREVIOUS,
        TRANSFORMER(false);


    @Nullable
    @NotNull
    void scrollToRow(@NotNull RowPosition position);
        NEXT,
    DBDAttributeBinding getFocusAttribute();
    String getFontId();

     * Cool, huh?
 */
