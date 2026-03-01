            colTable.addListener(SWT.Selection, event -> {

        addColumn(name, description, style, defaultVisible, required, false, null, new ColumnBooleanLabelProvider<>(valueProvider), editingSupport);
                }
        private void resetToDefaults() {
    @Nullable
    public void setForceAutoSize(boolean forceAutoSize) {
        if (!control.isDisposed()) {
                    }
                    @Override
        int style,
        }
                    UIUtils.packColumns((Table) control, true);
        final Collection<ViewerColumnRegistry.ColumnState> savedConfig = ViewerColumnRegistry.getInstance().getSavedConfig(configId);
            public void run()
 * limitations under the License.
                return getColumnByIndex(table.indexOf(column));
                        }
        return columnInfo;
        for (ColumnInfo info : getVisibleColumns()) {
import org.eclipse.swt.widgets.*;
        }
                columnInfo.order = i;
            if (columnInfo.visible && columnInfo.width <= 0) {
            public void update(ViewerCell cell) {
            orderedList.sort(new ColumnInfoComparator());
                defaultVisible,
            if (descColumn.getWidth() > 400) {
                return 0;
            colTable.setLayoutData(new GridData(GridData.FILL_BOTH));
    private int selectedColumnNumber;
        control.setData(DATA_KEY, this);
    }
            this.visible = defaultVisible;
                ((TreeViewer)viewer).getTree().setSortDirection(sortDirection);
        }
                    columnInfo.order = savedState.order;
                        columnInfo.width = realWidth;
                    columnInfo.visible = savedState.visible;
    public void repackColumns() {
import org.eclipse.jface.viewers.*;

        }
            super(comparator);
                if (columnInfo.name.equals(savedState.name)) {
                    columnInfo.column = null;
                    column.setWidth(columnInfo.width);
                            }
        return true;
                item.setChecked(ci.defaultVisible);
        for (ViewerColumnRegistry.ColumnState savedState : savedConfig) {
                    } else if (columnInfo.column instanceof TableColumn) {
        this.defaultIcon = defaultIcon;
            }
                    if (columnInfo.labelProvider instanceof ColumnBooleanLabelProvider) {
            final ColumnInfo columnInfo = visibleColumns.get(i);
                if (!CommonUtils.isEmpty(columnInfo.description)) {
            if (column.visible) {
        {
                    sortDirection = SWT.DOWN;
                }
                final TreeViewerColumn item = new TreeViewerColumn((TreeViewer) viewer, columnInfo.style);
            }
                continue;
                    ColumnInfo columnInfo = getVisibleColumns().get(columnIndex);
            super.buttonPressed(buttonId);
        }
    }
        boolean defaultVisible,

                    @Override
    public int getSelectedColumnNumber() {

                } else if (control instanceof Table) {
            {
    {
                        }
                colItem.setData(columnInfo);
        String name,
                    needRefresh = true;
            if (buttonId == IDialogConstants.DETAILS_ID) {
        Object userData,
        final Control control = viewer.getControl();
                }

                        if (!isInitializing && e.getSource() instanceof TableColumn) {
        }

        final EditingSupport editingSupport;
                if (cell.getColumnIndex() == 0) {
                    clickOnHeader = pt.y < 0;
                itemCount = ((TableViewer) viewer).getTable().getItemCount();
        menuManager.add(new Action(UINavigatorMessages.obj_editor_properties_control_action_configure_columns, DBeaverIcons.getImageDescriptor(UIIcon.CONFIGURATION)) {
    public void addBooleanColumn(
                    }
                        cell.setImage(DBeaverIcons.getImage(defaultIcon));
        }
        }
            colTable.setHeaderVisible(true);

                column.setText(columnInfo.name);
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
                if (item.getChecked() != ci.visible) {
        }

                hasVisible = true;
        }
import java.text.Collator;
 * Copyright (C) 2010-2024 DBeaver Corp and others

            saveColumnConfig();
            createVisibleColumns();
                    }
            }
        return visibleList;
                        columnInfo.width = column.getWidth();
import org.eclipse.swt.events.ControlEvent;

            this.required = required;
        }
            colTable.setLinesVisible(true);
            } else {
        IColumnValueProvider<ELEMENT, Boolean> valueProvider,
                        }
                        if (!isInitializing && !isPacking) {
import org.eclipse.jface.dialogs.IDialogConstants;
                            ((TreeColumn) columnInfo.column).setWidth(MIN_COLUMN_AUTO_WIDTH);
        viewer.setComparator(new DefaultComparator(Collator.getInstance()));
        boolean updated = false;
        EditingSupport editingSupport)

        {
        if (control instanceof Tree) {
    private static final Log log = Log.getLog(ViewerColumnController.class);

                columnInfo.sortListener = new SortListener(viewer, columnInfo);
            for (ColumnInfo columnInfo : columns) {
        final Control control = viewer.getControl();
            if (prevColumn == column) {
                            selectedColumnNumber = UIUtils.getColumnAtPos(selectedItem, pt.x, pointYWithHeader);
            if (input instanceof Collection<?> list && !list.contains(e1) && !list.contains(e2)) {
    // Read config from dialog settings
        });
    private final ColumnViewer viewer;

            }
package org.jkiss.dbeaver.ui.controls;
                        clickOnHeader = clientArea.y <= pt.y && pt.y < (clientArea.y + ((Tree) control).getHeaderHeight());
            }
 * DBeaver - Universal Database Manager
                TableItem colItem = new TableItem(colTable, SWT.NONE);
        public int compare(ColumnInfo o1, ColumnInfo o2)

        } finally {
import org.jkiss.code.Nullable;
        boolean required,
        boolean defaultVisible,
            return;
    private void recreateColumns(boolean pack)
        viewer.setComparator(comparator);
                return false;
        {
        if (!hasVisible) {
                control.removeListener(SWT.MenuDetect, menuListener);
            /*if (itemCount == 0) */{

        }
    public void autoSizeColumns() {
        return getColumnByIndex(columnIndex).name;
            public String getText(Object element) {

        }
                        if (realWidth < MIN_COLUMN_AUTO_WIDTH) {
            menuListener = event -> {
            public void run()
                name,
    private ColumnInfo getColumnByIndex(int columnIndex) {
/*
                columns.size()));
            return false;
        }
                        clickOnHeader = clientArea.y <= pt.y && pt.y < (clientArea.y + ((Table) control).getHeaderHeight());
        for (ColumnInfo columnInfo : columns) {
        try {
        return clickOnHeader;
        Item prevColumn = null;
                        if (selectedItem != null) {
                }

    private static class SortListener implements Listener
            this.description = description;
                colItem = column;
                        }
 *
import java.util.Comparator;
                } else {
 *     http://www.apache.org/licenses/LICENSE-2.0
                if (!CommonUtils.isEmpty(columnInfo.description)) {
    }
            return;
            control.addListener(SWT.MenuDetect, menuListener);
                        }
                final TableColumn column = item.getColumn();
    private void clearColumns() {
    }
            }
    {
                }
            }
        return (ViewerColumnController)control.getData(DATA_KEY);

    private transient Listener menuListener;

        private void sortViewer(final Item column, final int sortDirection) {
                    }

                if (columnInfo.width > 0) {
        final Control control = this.viewer.getControl();
            if (CommonUtils.equalObjects(name1, name2)) {
        final Control control = viewer.getControl();
            if (order[i] == columnInfo.order) {
            final Table table = (Table) control;
    }

                break;
                colItem.setChecked(columnInfo.visible);

        @Override
                    if (columnInfo.labelProvider instanceof ILazyLabelProvider &&
                            updateColumnOrder(column, column.getParent().getColumnOrder());
                setDescription(UINavigatorMessages.obj_editor_properties_control_action_columns_fit_width_description);

            return o1.order - o2.order;
            nameColumn.pack();
import java.util.ArrayList;
                        int realWidth = ((TreeColumn) columnInfo.column).getWidth();
                }
        repackColumns(false);
    }
        }
        UIUtils.asyncExec(() -> {
                    } else {
        List<ColumnInfo> visibleList = new ArrayList<>();
                    public void controlResized(ControlEvent e) {
            }
    {
    }
                final TreeColumn column = item.getColumn();
 */
        }
            final Tree tree = (Tree) control;
    }
        addColumn(name, description, style, defaultVisible, required, false, null, new ColumnLabelProvider() {
        saveColumnConfig();
        }
                columnInfo.column = column;
            isPacking = false;
    public void setComparator(@NotNull DefaultComparator comparator) {

import org.jkiss.dbeaver.Log;
        }
                column.setWidth(columnInfo.width);

                    int pointYWithHeader;
            } else {
            if (viewer instanceof TreeViewer) {
            columnInfo = (ColumnInfo) ((Tree) control).getColumn(columnIndex).getData();
        }
            return;
            }
    {
import org.eclipse.jface.action.Action;
        }
            if (viewer instanceof TreeViewer) {
                colItem = column;
import java.util.Collection;
            if (cat1 != cat2) {
            });
                        }
    }
                }

            viewer.getControl().addListener(SWT.PaintItem, event -> {
    public void setDefaultIcon(DBIcon defaultIcon) {
                // Fix too narrow width for empty lists

        }
                    ratios = new float[]{0.6f, 0.4f};
            for (TableItem item : colTable.getItems()) {
        boolean defaultVisible,
        @Override
            } else if (name1 == null) {
                                saveColumnConfig();
        EditingSupport editingSupport)
    {
                    if (control instanceof Tree) {
                            ((TreeItem) event.item).setText(event.index, lazyText);

        private String getLabel(@NotNull Viewer viewer, @Nullable Object element) {
        }
                    } else if (viewer instanceof TreeViewer && control instanceof Tree) {
        return control instanceof Tree ?
                editingSupport,
            for (TableItem item : colTable.getItems()) {
                }
            if (column.labelProvider instanceof ILabelProviderEx) {
        }
                    recreateColumns = true;
                try {
                columnInfo.column = null;
                    public void controlMoved(ControlEvent e) {
        String description,
        if (!forceRepack && isAllSized()) {
        menuManager.add(new Action(UINavigatorMessages.obj_editor_properties_control_action_columns_fit_width) {

        if (configDialog.open() != IDialogConstants.OK_ID) {
        String description,
        //private final Map<ColumnInfo, Button> buttonMap = new HashMap<>();
    }
        return -1;
                    @Override
        SortListener sortListener;
    }
        final CellLabelProvider labelProvider;
            return;

        control.setRedraw(false);

                result = 1;
                ColumnInfo columnInfo;
                return ((ILabelProviderEx) column.labelProvider).getText(element, false);
                    // We can't get column number, if we use click on the header, but we can add header height to the y
            this.order = order;

        return (COLUMN) getColumnByIndex(columnIndex).userData;
            }
                if (((TreeViewer) viewer).getTree().getColumnCount() == 2) {
                columnInfo.column = column;
            descColumn.pack();
            isInitializing = false;
    }
                        if (realWidth < MIN_COLUMN_AUTO_WIDTH) {
            }
            }
                columnInfo.column.addListener(SWT.Selection, columnInfo.sortListener);
            colItem.setData(columnInfo);
        for (ColumnInfo column : columns) {


        CellLabelProvider labelProvider,
        }
                labelProvider,
            }
        return null;
    private DBIcon defaultIcon;
            };
 * See the License for the specific language governing permissions and
                colItem.setText(0, columnInfo.name);
            if (nameColumn.getWidth() > 300) {
            } else if (columnInfo.labelProvider instanceof ILabelProvider) {
        int style,
            {
            super(viewer.getControl().getShell(), UINavigatorMessages.label_configure_columns, UIIcon.CONFIGURATION);
                        }
            }
                }
                hasCustomDraw = true;
    }
            }
                        if (getRowCount() > 0) {
                if (columnInfo.required) {
        final boolean required;
        cellRenderer = new ObjectViewerRenderer(viewer, false) {
                configureColumns();

                    public void controlResized(ControlEvent e) {
    public void createColumns() {
            final TableColumn nameColumn = new TableColumn(colTable, SWT.LEFT);
            }
                ((TableViewer)viewer).getTable().setSortColumn((TableColumn) column);
        final Control control = viewer.getControl();
    public void addColumn(
                result = getComparator().compare(name1, name2);
            nameColumn.setText(UINavigatorMessages.label_name);
        for (ColumnInfo columnInfo : columns) {
                    }
            // Possibly incompatible format from previous version

            }
            final String name1 = getLabel(viewer, e1);
            final ColumnInfo column = getColumnInfo(viewer);
    }
        ColumnInfo columnInfo;
            }
import org.jkiss.dbeaver.ui.internal.UIMessages;
        }
        COLUMN[] newArray = (COLUMN[]) Array.newInstance(type, columns.size());
    }
        final Control control = viewer.getControl();
            }
        }
    }
        isInitializing = true;

                        pointYWithHeader = pt.y + ((Tree) control).getHeaderHeight();
            }
                    column.setToolTipText(columnInfo.description);
            }
    {
                menuListener = null;
        private static ColumnInfo getColumnInfo(@NotNull Viewer viewer) {
        @Override
 * You may obtain a copy of the License at
    }
        String description,
            if (column != null) {
    }
import org.jkiss.code.NotNull;
                        TreeItem selectedItem = ((TreeViewer) viewer).getTree().getItem(new Point(pt.x, pointYWithHeader));
            this.defaultVisible = defaultVisible;

                if (columnExists != columnInfo.visible) {

    public void sortByColumn(int index, int direction) {
            }

        private ColumnInfo(String name, String description, int style, boolean defaultVisible, boolean required, boolean numeric, Object userData, CellLabelProvider labelProvider, EditingSupport editingSupport, int order)


        boolean hasVisible = false;
        @Override
                });
        final Control control = this.viewer.getControl();
        if (control instanceof Tree || control instanceof Table) {
                            repackColumns();
                ColumnInfo ci = (ColumnInfo) item.getData();
    private int getSortDirection() {
        }, editingSupport);
            this.viewer = viewer;
                }
        }
                    public void controlMoved(ControlEvent e) {
                ((TreeViewer)viewer).getTree().setSortColumn((TreeColumn) column);
            if (info.editingSupport != null) {
    }
    public void fillConfigMenu(IContributionManager menuManager) {
        private static boolean isReversed(@NotNull Viewer viewer) {
            this.userData = userData;
        recreateColumns(pack);
                        event.doit = false;
            if (menuListener != null) {
            if (savedState.visible) {
            Composite composite = super.createDialogArea(parent);
                    TreeColumn column = ((TreeViewer) viewer).getTree().getColumn(event.index);

    private boolean clickOnHeader;
            } else if (viewer instanceof TableViewer) {
 * you may not use this file except in compliance with the License.
            @Override
        @Override
    {
                            ((TableColumn) columnInfo.column).setWidth(MIN_COLUMN_AUTO_WIDTH);
        columnInfo.sortListener.sortViewer(columnInfo.column, direction);
                        if (selectedItem != null) {
            createButton(parent, IDialogConstants.DETAILS_ID, UIMessages.button_reset_to_defaults, false); //$NON-NLS-1$
                List<ColumnInfo> visibleColumns = getVisibleColumns();
    private final String configId;
                    result = CommonUtils.compareNumbers(number1, number2);
    private class ConfigDialog extends BaseDialog {
    }
        return selectedColumnNumber;
        final String description;
    public COLUMN getColumnData(int columnIndex) {
        protected void createButtonsForButtonBar(Composite parent) {
                columnInfo.column.dispose();
                if (sortDirection == SWT.NONE) {


        public DefaultComparator(@Nullable Comparator<? super String> comparator) {
                        }
        } else {
            columnInfo = (ColumnInfo) ((Table) control).getColumn(columnIndex).getData();
import org.eclipse.swt.SWT;

            }

        public void handleEvent(Event e) {
                    colItem.setText(1, columnInfo.description);
    public String getColumnName(int columnIndex) {

        final ColumnInfo columnInfo = columns.get(index);
            this.name = name;
            }
    public int getColumnsCount() {

            return isReversed(viewer) ? -result : result;

                updated = true;
                viewer.refresh();
                return null;
        {
                });
                    final NumberFormat numberFormat = NumberFormat.getInstance();
            newArray[i] = type.cast(columns.get(i).userData);
            ViewerColumn viewerColumn;
            }
                    if (((TableItem) event.item).getGrayed()) {
                    }
                }
import org.jkiss.utils.CommonUtils;
        ColumnInfo columnInfo;
        };
            boolean recreateColumns = false;

            if (columnInfo.column != null) {
        try {
    }
                resetToDefaults();

            {
                    }
        private static boolean isNumeric(@NotNull Viewer viewer) {
        boolean hasCustomDraw = false;
        } else {

    public int getEditableColumnIndex(Object element) {
                if (RuntimeUtils.isMacOS()) {

    private ColumnInfo getSortColumn() {
            } else {

            // If both e1 and e2 are not in the input collection, they are children — skip sorting.
                            columnInfo.width = column.getWidth();
                            selectedColumnNumber = UIUtils.getColumnAtPos(selectedItem, pt.x, pointYWithHeader);
    private void repackColumns(boolean forceRepack) {
            viewer.refresh();
                        }
            for (ViewerColumnRegistry.ColumnState savedState : savedConfig) {
            final int cat1 = category(e1);
                            realWidth = MIN_COLUMN_AUTO_WIDTH;
                return info.order;
        }
            final ColumnInfo column = getColumnInfo(viewer);
        });
            if (viewer instanceof TreeViewer) {
        isPacking = true;
        return control instanceof Tree ?
    {
                // Set reverse order
                return labelProvider.getText((ELEMENT) element);
                for (ColumnInfo columnInfo : getVisibleColumns()) {
            @Override
            }
                column.addControlListener(new ControlAdapter() {
                }
                        CommonUtils.isEmpty(((TableItem) event.item).getText(event.index))) {

 */
                    if (defaultIcon != null) {
                ((TableViewer)viewer).getTable().setSortDirection(sortDirection);
        protected void okPressed()
        final boolean defaultVisible;
                        TableItem selectedItem = ((TableViewer) this.viewer).getTable().getItem(new Point(pt.x, pointYWithHeader));
        boolean numeric,
                        control.removeControlListener(this);
            boolean needRefresh = false;
        ColumnInfo columnInfo = (ColumnInfo) column.getData();
            return ((ViewerColumnController<?, ?>) getFromControl(viewer.getControl())).getSortColumn();

                setDescription(UINavigatorMessages.obj_editor_properties_control_action_configure_columns_description);
        protected ConfigDialog()

        }
        columns.clear();
    }
    private void createVisibleColumns()
            int result = 0;
        for (int i = 0; i < order.length; i++) {
    }
                if (viewer instanceof TreeViewer) {
            Control control = this.viewer.getControl();
    }
        } catch (Exception e) {
            ((Tree) control).getColumnCount() : ((Table) control).getColumnCount();
                required,
                cell.setText(labelProvider.getText((ELEMENT) cell.getElement()));
    {
            });
    }
        @Override
        boolean required,


            @Override

                    if (columnInfo.labelProvider instanceof ILazyLabelProvider &&
    }
            return ((Table) control).getSortDirection();
    }
    public ViewerColumnController(String id, ColumnViewer viewer)
        int sortDirection = SWT.UP;
        Item column;
                            realWidth = MIN_COLUMN_AUTO_WIDTH;
                    Object cellValue = ((ColumnBooleanLabelProvider) columnInfo.labelProvider).getValueProvider().getValue(element);
        columns.get(index).visible = visible;
        for (int i = 0; i < columns.size(); i++) {
                    Object element = event.item.getData();


        this.configId = id;
        @Override
 * Unless required by applicable law or agreed to in writing, software
    }
            if (!control.isDisposed()) {
    }
                        int realWidth = ((TableColumn) columnInfo.column).getWidth();
        String name,
                    break;
            }
                            saveColumnConfig();
        } else {
 *
        protected void setShellStyle(int newShellStyle) {
    }
        }
        } finally {
                if (!visibleColumns.isEmpty()) {
                if (columnInfo.labelProvider instanceof ColumnBooleanLabelProvider<?, ?>) {
    }
                    }
        this.createColumns(true);
                    }
        List<ColumnInfo> visibleColumns = getVisibleColumns();
                return 0;
        ViewerColumnRegistry.getInstance().updateConfig(configId, columns);
    }
            }
            if (columnInfo.labelProvider instanceof ILazyLabelProvider || columnInfo.labelProvider instanceof ColumnBooleanLabelProvider) {
        ConfigDialog configDialog = new ConfigDialog();
            if (result == 0 && isNumeric(viewer)) {

import org.eclipse.swt.graphics.Rectangle;
            }
        protected Composite createDialogArea(Composite parent)
    public List<ColumnInfo> getVisibleColumns()
                repackColumns();
            this.editingSupport = editingSupport;
                repackColumns(true);
                    if (columnInfo.column instanceof TreeColumn) {
            if (recreateColumns) {
                final TableViewerColumn item = new TableViewerColumn((TableViewer) viewer, columnInfo.style);
        {
            return ((Tree) control).getSortDirection();
                }
        public int compare(Viewer viewer, Object e1, Object e2) {
            viewerColumn.setLabelProvider(columnInfo.labelProvider);
        });

        protected void buttonPressed(int buttonId) {
                if (control instanceof Tree) {
                        if (getRowCount() > 0) {
    private static final String DATA_KEY = ViewerColumnController.class.getSimpleName();
        }

            return parent;
 * Tree/table viewer column controller
        }
    {
    }
                });
                recreateColumns(true);
                boolean columnExists = (columnInfo.column != null);
                viewerColumn = item;
            public Object getCellValue(Object element, int columnIndex) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                description,
                        final String lazyText = ((ILazyLabelProvider) columnInfo.labelProvider).getLazyText(event.item.getData());
    public boolean isClickOnHeader()
import java.text.NumberFormat;
    }
        ColumnViewer viewer;
                    final Number number1 = numberFormat.parse(name1);
                }

        @Nullable
            this.labelProvider = labelProvider;
    private static class ColumnInfoComparator implements Comparator<ColumnInfo> {
                Point pt = control.getDisplay().map(null, control, new Point(event.x, event.y));
            } else if (viewer instanceof TableViewer) {
        }
                return cat1 - cat2;
            final TableColumn column = table.getSortColumn();
                visibleList.add(column);
    {
                column.setMoveable(true);
                }
                numeric,
            final int cat2 = category(e2);
            }
            this.columnInfo = columnInfo;
                    }
        try {
            colTable = new Table(composite, SWT.BORDER | SWT.CHECK | SWT.H_SCROLL | SWT.V_SCROLL);
                        CommonUtils.isEmpty(((TreeItem) event.item).getText(event.index))) {
import java.lang.reflect.Array;
    private boolean forceAutoSize;
            List<ColumnInfo> orderedList = new ArrayList<>(columns);
                        ((TableItem) event.item).setChecked(true);

            // NOTE: In tree viewers, only parent elements (present in input) should be sorted.
            ((Tree) control).getItemCount() : ((Table) control).getItemCount();
    }
            viewerColumn.setEditingSupport(columnInfo.editingSupport);
        IColumnTextProvider<ELEMENT> labelProvider,
        }
                    @Override
    }

    private boolean isAllSized() {
                break;
            return true;
                    }
            sortViewer(sortDirection == SWT.NONE ? null : column, sortDirection);
    public static ViewerColumnController getFromControl(Control control)
            }
            if (column == null) {
                column.setText(columnInfo.name);
                }
        }

                    public void controlResized(ControlEvent e) {
            final TreeColumn column = tree.getSortColumn();
    }
                    @Override
        }
    public void addColumn(String name, String description, int style, boolean defaultVisible, boolean required, CellLabelProvider labelProvider)
            descColumn.setText(UINavigatorMessages.label_description);
            }
                        final String lazyText = ((ILazyLabelProvider) columnInfo.labelProvider).getLazyText(event.item.getData());
        if (updated) {
    public void addColumn(
                            updateColumnOrder(column, column.getParent().getColumnOrder());
            {
                    ci.visible = item.getChecked();
            super.setShellStyle(newShellStyle & ~SWT.MAX);
            return ((ViewerColumnController<?, ?>) getFromControl(viewer.getControl())).getSortDirection() == SWT.DOWN;
                nameColumn.setWidth(300);
            columnInfo.order = i;
                UIUtils.packColumns(((TreeViewer) viewer).getTree(), forceAutoSize, ratios);
            return column != null && column.numeric;
            final TableColumn descColumn = new TableColumn(colTable, SWT.LEFT);
import org.eclipse.swt.layout.GridData;
        final Control control = viewer.getControl();
    public void dispose() {
    {
            super.okPressed();
import java.util.List;
    public void createColumns(boolean pack)
                }
            }
            }
    private transient ObjectViewerRenderer cellRenderer;
import org.jkiss.dbeaver.utils.RuntimeUtils;
                if (columnInfo.column != null) {
            readColumnsConfiguration();
                        return ((ColumnBooleanLabelProvider) columnInfo.labelProvider).getValueProvider().getValue(element);
            super.createButtonsForButtonBar(parent);
        final boolean numeric;
        protected boolean isResizable() {
                    }
        final int style;
        addColumn(name, description, style, defaultVisible, required, false, null, labelProvider, null);
        this.viewer = viewer;
        for (ColumnInfo columnInfo : columns) {

        if (savedConfig == null || savedConfig.isEmpty()) {
            @Override
        }
                if (clickOnHeader) {



    public int getRowCount() {
            Object input = viewer.getInput();
            }
}

    private static final int MIN_COLUMN_AUTO_WIDTH = 100;
        }
                        columnInfo.width = realWidth;
            if (column != null) {
            final Item colItem;
        @Override
        if (isPacking) {

        columns.add(
    public COLUMN[] getColumnsData(Class<COLUMN> type) {
 *
    private void saveColumnConfig()

    private boolean isPacking, isInitializing;


            Item column = (Item)e.widget;

            for (ColumnInfo columnInfo : orderedList) {
                        pointYWithHeader = pt.y + ((Table) control).getHeaderHeight();
        if (control == null || control.isDisposed()) {
                    TableColumn column = ((TableViewer) viewer).getTable().getColumn(event.index);
                } else {
        }
import org.eclipse.jface.action.IContributionManager;
            prevColumn = column;
        int style,
                }
        EditingSupport editingSupport)
        if (control instanceof Tree) {
        return newArray;
                } else if (sortDirection == SWT.UP) {
                    final Number number2 = numberFormat.parse(name2);
                userData,
        }
    public void setIsColumnVisible(int index, boolean visible) {

                Rectangle clientArea = ((Composite) control).getClientArea();
import org.eclipse.swt.graphics.Point;
            if (result == 0) {
                        if (!CommonUtils.isEmpty(lazyText)) {
            } else if (name2 == null) {
                itemCount = ((TreeViewer) viewer).getTree().getItemCount();

        ViewerColumnRegistry.getInstance().updateConfig(configId, columns);
        boolean required,
        for (int i = 0; i < visibleColumns.size(); i++) {
            }
            }
/**
            @Nullable
            }

                    cellRenderer.paintCell(event, element, cellValue, event.item, Boolean.class, event.index, true, (event.detail & SWT.SELECTED) == SWT.SELECTED);
            final String name2 = getLabel(viewer, e2);
        final Object userData;
            this.style = style;

        public SortListener(ColumnViewer viewer, ColumnInfo columnInfo) {
        // Save settings only if we have at least one rows. Otherwise
                        if (!isInitializing && e.getSource() instanceof TreeColumn) {
                ColumnInfo ci = (ColumnInfo) item.getData();
            if (needRefresh) {
                if (event.detail == SWT.CHECK) {

                UIUtils.packColumns(((TableViewer) viewer).getTable(), forceAutoSize);
import org.eclipse.swt.events.ControlAdapter;
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;

                        }
            }

                style,
                    sortDirection = SWT.UP;
                column.addControlListener(new ControlAdapter() {
    {
            log.warn("Failed to load configuration for '" + this.configId + "'", e); //$NON-NLS-1$ //$NON-NLS-2$
                    columnInfo = (ColumnInfo) column.getData();

 * distributed under the License is distributed on an "AS IS" BASIS,
            }
    }
                    }
        }
                }
            new ColumnInfo(
            }

    }

                }
            int itemCount = 0;
                viewerColumn = item;
        }

        if (hasCustomDraw) {
public class ViewerColumnController<COLUMN, ELEMENT> {
        this.forceAutoSize = forceAutoSize;
        return true;

                    if (viewer instanceof TableViewer && control instanceof Table) {
                if (!CommonUtils.isEmpty(columnInfo.description)) {
    private void updateColumnOrder(Item column, int[] order) {

    }

                    column.setToolTipText(columnInfo.description);
        visibleList.sort(new ColumnInfoComparator());

import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
import org.jkiss.dbeaver.model.DBIcon;
    {
                            ((TableItem) event.item).setText(event.index, lazyText);
    public boolean configureColumns()
            this.numeric = numeric;

        if (control instanceof Tree) {
        }
                descColumn.setWidth(400);
                result = -1;
                    UIUtils.packColumns((Tree) control, true, null);
                column.setMoveable(true);
        String name,
                    colItem.setGrayed(true);
                control.addControlListener(new ControlAdapter() {
            if (pack && !allSized) {
                    columnInfo.width = savedState.width;
        @Nullable
            boolean allSized = isAllSized();
                } catch (Exception ignored) {
                        if (!CommonUtils.isEmpty(lazyText)) {
                float[] ratios = null;
import org.jkiss.dbeaver.ui.*;
            UIUtils.createControlLabel(composite, UINavigatorMessages.label_select_columns);
    }

                return getColumnByIndex(tree.indexOf(column));
                } else {
    }
            control.setRedraw(true);
                    columnInfo = (ColumnInfo) column.getData();
    private final List<ColumnInfo> columns = new ArrayList<>();
        	return;
                return ((ILabelProvider) column.labelProvider).getText(element);
            @Override
                }
                    columnInfo.column.dispose();

                    sortDirection = SWT.NONE;
                        }
    private static class ColumnInfo extends ViewerColumnRegistry.ColumnState {
        private Table colTable;
    private void readColumnsConfiguration()
    {
                return null;
                            if (getRowCount() > 0) {
        clearColumns();
        }
    public static class DefaultComparator extends ViewerComparator {
