    String MENU_ID_FILTERS = "filters";
    Color getDefaultForeground();
import java.util.Collection;

    DBDDataReceiver getDataReceiver();
    void copyRowValues(boolean copyFromRowAbove, boolean updatePresentation);
    boolean isReadOnly();
     * Enable/disable viewer actions. May be used by editors to "lock" RSV actions like navigation, edit, etc.
            return text;
    /**
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;

    void readAllData();
        AFTER_SELECTION,

        boolean refreshHints) throws DBException;
/**


        @NotNull DBSEntityAssociation association,
    void lockActionsByFocus(Control lockedBy);
        COLUMN_HEADER,
        @NotNull List<? extends DBDValueRow> rows,


import org.jkiss.dbeaver.model.DBPObject;
    void readNextSegment();
        AT_END
    int[] getSelectedRecords();

    void addListener(IResultSetListener listener);

    IResultSetSelection getSelection();
    @NotNull
     * Actions will be locked until lockedBy will be disposed
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
        NONE(ResultSetMessages.controls_resultset_viewer_sorting_order_none);
    boolean applyChanges(@Nullable DBRProgressMonitor monitor, @NotNull ResultSetSaveSettings settings);
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    String MENU_ID_LAYOUT = "layout";
     * Redraws results and updates all toolbars/edit controls
        @NotNull IMenuManager manager,
    void updateStatusMessage();
    DBPPreferenceStore getPreferenceStore();
    void resetCellValue(


    String RESULTS_CONTEXT_ID = "org.jkiss.dbeaver.ui.context.resultset";


    String MENU_ID_VIRTUAL_MODEL = "virtual_model";
        boolean newWindow)
    }
        }
        @NotNull DBRProgressMonitor monitor,
     */
     */
    int getHistorySize();
    void lockActionsByControl(Control lockedBy);
    IResultSetContainer getContainer();
        @Nullable int[] rowIndexes,
        @NotNull ResultSetModel model,


 *     http://www.apache.org/licenses/LICENSE-2.0
    }
     * Fills rows in current selection with values from row above/below it.
    void removeListener(IResultSetListener listener);
    boolean isRefreshInProgress();

}
 * DBeaver - Universal Database Manager

     * Depending on selection, source row may literally be the row before or
    ResultSetModel getModel();
     * Navigates to association. One of @association OR @attr must be specified.

    String MENU_ID_EDIT = "edit";

    /**
    void fillContextMenu(
        @NotNull ResultSetRow row,
    void navigateHistory(int position);


     */
    IResultSetDecorator getDecorator();
 *
    
    Color getDefaultBackground();


    int getHistoryPosition();

        @NotNull
    ////////////////////////////////////////
    DBDDataFilter getDataFilter();
 * You may obtain a copy of the License at
     * Refreshes data. Reverts all changes and clears filters.
        private final String text;

        ASC(ResultSetMessages.controls_resultset_viewer_sorting_order_ascending),
    boolean isPanelsVisible();
import org.eclipse.swt.widgets.Control;
     */


    @NotNull
    @NotNull
    void showColumnMenu(DBDAttributeBinding curAttribute);
 * This interface is not supposed to be implemented by clients.
     * Note: in case of huge resultset this function may eventually throw {@link java.lang.OutOfMemoryError}


    @Nullable
 * limitations under the License.

import org.jkiss.dbeaver.model.struct.DBSEntityAssociation;
    @NotNull

    @NotNull
    @NotNull
     */
 * Copyright (C) 2010-2026 DBeaver Corp and others
    @NotNull
     */
        throws DBException;
    String MENU_GROUP_EDIT = "edit";
     * across several rows, source row is the first or last row inside selected region.
    void navigateReference(

 *


 * See the License for the specific language governing permissions and


        UNKNOWN
     * <p>
 * ResultSet controller.

 */
    enum ContextMenuLocation {

    void toggleSortOrder(@NotNull DBDAttributeBinding columnElement, @Nullable ColumnOrder forceOrder);


        boolean newWindow)
    ////////////////////////////////////////
    );


        BEFORE_SELECTION,
        @Nullable ResultSetRow row,
package org.jkiss.dbeaver.ui.controls.resultset;
    @Nullable

 *
            this.text = text;
import org.jkiss.code.Nullable;
    ResultSetRow addNewRow(@NotNull RowPlacement placement, boolean copyCurrent, boolean updatePresentation);

    void updatePanelsContent(boolean forceRefresh);
    void redrawData(boolean attributesChanged, boolean rowsChanged);
    String MENU_GROUP_EXPORT = "results_export";
/*
    String getReadOnlyStatus();
    enum ColumnOrder {
        @NotNull List<? extends DBDValueRow> rows,
     * Reads all rows from data container.
    void setCurrentRow(@Nullable ResultSetRow row);
    String MENU_GROUP_ADDITIONS = "results_additions";//IWorkbenchActionConstants.MB_ADDITIONS;



    enum RowPlacement {
     */
    void setSelectedRecords(int[] indexes);
    IResultSetPanel getVisiblePanel();
     * after target row if selection covers only a single row. If selection spreads
public interface IResultSetController extends IDataController, DBPContextProvider, DBPObject, DBDResultSetDataProvider {
    void setStatus(String message, DBPMessageType messageType);


    /**
     * @param rowIndexes          applicable only when single row is passed
    IResultSetPresentation getActivePresentation();
    boolean isRecordMode();
    void updateDirtyFlag();
import org.jkiss.dbeaver.DBException;
        ColumnOrder(@NotNull String text) {
    boolean updateCellValue(
    String MENU_ID_ORDER = "orderings";
    boolean checkForChanges();
import org.jkiss.code.NotNull;
     * @param rowsChanged updates contents
import org.eclipse.jface.action.IMenuManager;
     * Reads next segment of data
    /**
import org.jkiss.dbeaver.ui.data.IDataController;
        @Nullable DBDAttributeBinding attr,
import org.eclipse.swt.widgets.Composite;
        Collection<DBDAttributeBinding> attrs,
    boolean activatePanel(String id, boolean setActive, boolean showPanels);
        Collection<DBDValueRow> rows,
     */
 * you may not use this file except in compliance with the License.


    void navigateAssociation(

        @Nullable Object value,


    void refresh();
import org.jkiss.dbeaver.model.DBPMessageType;

    ResultSetSaveReport generateChangesReport();
    /**

 * Unless required by applicable law or agreed to in writing, software
    void setSegmentFetchSize(Integer segmentFetchSize);
    boolean isAllAttributesReadOnly();
        @Nullable int[] rowIndexes);
    @Nullable
    void updateToolbar();

     * @param attributesChanged
    void refreshHintCache(
     * @param lockedBy    locker control
        DATA,
        int[] rowIndexes);
    /**

        @NotNull DBDAttributeBinding attr,
        throws DBException;
        public String getText() {

    void setDataFilter(final DBDDataFilter dataFilter, boolean refreshData);


        DESC(ResultSetMessages.controls_resultset_viewer_sorting_order_descending),
import java.util.List;
        int[] rowIndexes,
    // Navigation & history
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
    void rejectChanges();
    void updateEditControls();


        @NotNull DBRProgressMonitor monitor,
    /**
    // Presentation & panels
    ResultSetRow getCurrentRow();

        ROW_HEADER,

    Composite getControl();
    List<DBEPersistAction> generateChangesScript(@NotNull DBRProgressMonitor monitor, @NotNull ResultSetSaveSettings settings);

    IResultSetPanel[] getActivePanels();
    @NotNull
        @NotNull DBDAttributeBinding attr,
        @NotNull ResultSetModel bindingsModel,

    void showEmptyPresentation();

    /**
import org.jkiss.dbeaver.model.DBPContextProvider;
    String MENU_ID_VIEW = "view";
import org.jkiss.dbeaver.model.data.*;

     */
import org.eclipse.swt.graphics.Color;
     */
        @NotNull ResultSetRow row,
    String getAttributeReadOnlyStatus(@NotNull DBDAttributeBinding attr, boolean checkEntity, boolean checkKey);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @NotNull DBSEntityAssociation association,
    void updatePanelActions();
     * Active presentation

        TOP_LEFT,
    boolean refreshData(@Nullable Runnable onSuccess);


 */
     * Refreshes data. Reads data from underlying data container
    /**

    @NotNull

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;

 * Licensed under the Apache License, Version 2.0 (the "License");
    /**
        @NotNull ContextMenuLocation menuLocation
