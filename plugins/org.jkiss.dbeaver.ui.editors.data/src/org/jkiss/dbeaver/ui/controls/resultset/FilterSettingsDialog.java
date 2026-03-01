                @Override
        private Control lastEditor;
                    return ""; //$NON-NLS-1$
                public void update(ViewerCell cell) {

                }
            libsTab.setText(ResultSetMessages.controls_resultset_filter_group_columns);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        }
import org.jkiss.dbeaver.ui.UIIcon;
                });
    private class FilterSettingsTreeEditor extends CustomTreeEditor {
    {

        for (DBDAttributeConstraint c : constraints) {
                }
        final int swappingConstraintVisualPosition = swappingConstraint.getVisualPosition();
            });
        if (!resultSetViewer.supportsDataFilter()) {
                }
                    dataFilter.reset();
 *     http://www.apache.org/licenses/LICENSE-2.0
            return getBindingConstraint(((DBDAttributeBinding)element)).isVisible();
        moveBottomButton.setEnabled(newIndex < getItemsCount() - 1);
            if (RuntimeUtils.isMacOS() && lastTreeItem != null && lastEditor != null) {
            columnsController.addColumn("#", null, SWT.LEFT, true, false, new CellLabelProvider() {
            // Only attribute visibility was changed


                    return binding == binding.getTopParent();
import java.util.*;
                    }
        columnsViewer.applyEditorValue();
        } else {
                    final DBDAttributeBinding binding = (DBDAttributeBinding) element;
import org.eclipse.swt.graphics.Image;
     *
        boolean hasVisibleColumns = false;
                if (c.getVisualPosition() > curIndex && c.getVisualPosition() <= newIndex) {
    private ToolItem moveBottomButton;

            dataFilter.setOrder(null);
        private TreeItem lastTreeItem;
                protected Object getValue(Object element) {
            for (int i = selection.length - 1; i >= 0; i--) {
        boolean filtersChanged = true;
        filterGroup.setLayout(new GridLayout(1, false));
            libsTab.setToolTipText(ResultSetMessages.controls_resultset_filter_group_columns_tooltip_text);
        moveTopButton.setEnabled(moveToTopEnabled);
                constraint.setOrderDescending(false);
    }
    private static final String DIALOG_ID = "DBeaver.FilterSettingsDialog";//$NON-NLS-1$
            } else {

    @Override

                    return nestedBindings != null && !nestedBindings.isEmpty();
        }
 * limitations under the License.
                    return new CustomCheckboxCellEditor(((TreeViewer) getViewer()).getTree(), true);
                showNoneButton.setImage(UIUtils.getShardImage(ISharedImages.IMG_ELCL_REMOVEALL));
        return swappingConstraintVisualPosition;
                // Add new ordered column
                    int orderPosition = constraint.getOrderPosition();
                    return res;
                protected void setValue(Object element, Object value) {
                    refreshData();
        int j = 0;
                    cell.setText(String.valueOf(constraint.getOriginalVisualPosition() + 1));
import org.jkiss.dbeaver.utils.RuntimeUtils;
                            cell.setText(" " + constraint.getOrderPosition());
            //item.setText(text);
        gd.minimumWidth = 200;
        });
                    }
    }
            }
                });
                    final DBDAttributeConstraint constraint = getBindingConstraint(binding);
                    }
        ToolItem item = new ToolItem(toolBar, SWT.PUSH);
    }
                }

                });
                columnsController.addColumn(ResultSetMessages.controls_resultset_filter_column_order, null, SWT.LEFT, true, false, new CellLabelProvider() {
        }

            UIUtils.showMessageBox(getShell(), "Bad filter", "You have to set at least one column visible", SWT.ICON_WARNING);
                }

        }
                    Arrays.sort(res, activeSorter);
                }
                moveDownButton.setEnabled(false);
            switch (columnIndex) {
                final DBDAttributeBinding binding = (DBDAttributeBinding) item;
        {
                    moveSelectedItems(true, false);
                    for (DBDAttributeConstraint constraint : constraints) {
        }
    private final Comparator<DBDAttributeBinding> ALPHA_SORTER = Comparator.comparing(DBDAttributeBinding::getName);
                    public void update(ViewerCell cell) {
                    whereText.setText(""); //$NON-NLS-1$
                }
import org.jkiss.dbeaver.ui.dialogs.HelpEnabledDialog;
        final boolean moveToBottomEnabled = selection.length > 0 && tree.indexOf(selection[0]) != tree.getItemCount() - selection.length;
            if (constraint.getOrderPosition() == 0) {
                    return columnsViewer;
import org.eclipse.jface.dialogs.IDialogConstants;

                public void update(ViewerCell cell) {

    private ViewerColumnController<Object, Object> columnsController;
                    columnsViewer = new TreeViewer(parent, style);
                });

    private void updateButtons() {
        moveTopButton.setEnabled(newIndex > 0);
            }
                    moveSelectedItems(false, true);
        TreeItem[] selection = tree.getSelection();
        return super.open();

            });
        resultSetViewer.setDataFilter(
    private void refreshData() {
        swappingConstraint.setVisualPosition(currentVisualPosition);
                public void update(ViewerCell cell) {

    {
                    return constraint.hasOption(DBDAttributeConstraintBase.ATTR_OPTION_PINNED);
        }
                        constraint.setVisible(false);
            UIUtils.resizeShell(getShell());
    /**
                    } else {
        if (!resultSetViewer.supportsDataFilter()) {

import org.eclipse.swt.layout.GridLayout;
        if (dataFilter.getOrder() != null) {
            UIUtils.packColumns(columnsViewer.getTree(), true, new float[] { 0.45f, 0.05f, 0.05f, 0.05f, 0.05f, 0.35f});
                        final DBDAttributeConstraint constraint = getBindingConstraint(binding);
            CTabItem libsTab = new CTabItem(tabFolder, SWT.NONE);

            gd = new GridData(GridData.FILL_BOTH);
                constraint.setOrderPosition(0);
                UIUtils.createToolBarSeparator(toolbar, SWT.VERTICAL);
                    } else {
        curAttr.setVisualPosition(newIndex);
        } else {
        }
                @Override
    {
        private final Tree columnsTree;
                }
                    final DBDAttributeBinding binding = (DBDAttributeBinding) element;

        super.okPressed();
    {
                if (singleStep && tree.indexOf(selection[i]) == tree.getItemCount() - 1 - j) {
                final DBDAttributeConstraint constraint = getBindingConstraint(binding);
                return null;
        @Nullable
                lastEditor = text;
import org.jkiss.dbeaver.ui.DBeaverIcons;
                lastTreeItem = item;
     * See https://github.com/dbeaver/dbeaver/issues/10346
 * you may not use this file except in compliance with the License.
            }
            String criteria = text.getText().trim();
                });
    protected IDialogSettings getDialogBoundsSettings()
        libsTab.setText(ResultSetMessages.controls_resultset_filter_group_custom);
import org.jkiss.dbeaver.model.DBIcon;
        moveDownButton.setEnabled(newIndex < getItemsCount() - 1);
        if (!CommonUtils.isEmpty(whereText.getText())) {
            if (columnIndex == 0) {
    }
            dataFilter.setWhere(null);
            DBDAttributeConstraint constraint = getBindingConstraint((DBDAttributeBinding) item.getData());
                moveBottomButton.setEnabled(false);
        for (DBDAttributeConstraint constraint : constraints) {
                    return ""; //$NON-NLS-1$
    private void moveSelectedItems(boolean reverse, boolean singleStep) {
        Tree tree = columnsViewer.getTree();
        whereText = new Text(filterGroup, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);

        DBDAttributeConstraint end = getBindingConstraint((DBDAttributeBinding) columnsViewer.getTree().getItem(newIndex).getData());
                return text;
    protected void okPressed()
                protected void setValue(Object element, Object value) {
                public Object[] getChildren(Object parentElement) {

        DBDAttributeBinding[] modelAttrs = resultSetViewer.getModel().getAttributes();
                protected CellEditor getCellEditor(Object element) {
 * You may obtain a copy of the License at
        filterGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
        @Override
        {
            return;
                    return DBeaverIcons.getImage(constraint.isOrderDescending() ? UIIcon.SORT_INCREASE : UIIcon.SORT_DECREASE);
                    final List<DBDAttributeBinding> nestedBindings = ((DBDAttributeBinding) parentElement).getNestedBindings();
import org.jkiss.dbeaver.model.data.DBDDataFilter;
                final DBDAttributeBinding binding = (DBDAttributeBinding) item;

        public void okPressed() {
        }
                Text text = new Text(columnsTree, SWT.BORDER);
        CTabFolder tabFolder = new CTabFolder(composite, SWT.NONE);
        throw new IllegalStateException("Can't find constraint for binding " + binding);
                @Override
                    if (executionContext != null) {
        final DBDAttributeConstraint curAttr = getBindingConstraint((DBDAttributeBinding) columnsViewer.getTree().getItem(curIndex).getData());
            }
                return constraint.hasOption(DBDAttributeConstraintBase.ATTR_OPTION_PINNED);
                    columnsController = new ViewerColumnController<>(FilterSettingsDialog.class.getSimpleName(), columnsViewer);


                    }
                constraint.setCriteria(criteria);
        DBDAttributeConstraint start = getBindingConstraint((DBDAttributeBinding) curItem.getData());
        }
        @Override
                return constraint;
        // Fill columns
            {
                action.run();
                    final List<DBDAttributeBinding> nestedBindings = ((DBDAttributeBinding) element).getNestedBindings();
            };
        if (reverse) {
        if (!CommonUtils.isEmpty(orderText.getText())) {
    class ColumnLabelProvider extends LabelProvider implements ITableLabelProvider
        }
            Text text = (Text) control;
        @Override
            columnsTree.setLayoutData(gd);
    private ToolItem moveTopButton;
     */
import org.jkiss.code.NotNull;
    public int open()
                text.selectAll();
        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
        GridData gd = new GridData(GridData.FILL_BOTH);
import org.jkiss.dbeaver.ui.IHelpContextIds;

                protected boolean canEdit(Object element) {
import org.eclipse.ui.ISharedImages;
                    for (DBDAttributeConstraint constraint : constraints) {
            firstTraverseIndex = COLUMN_CRITERIA_INDEX;
        moveBottomButton.setEnabled(moveToBottomEnabled);
            for (int i = startingVisualPosition - 1; i >= endingVisualPosition; i--) {
                constraint.setOrderDescending(false);
                }
            warnLabel.setText(ResultSetMessages.controls_resultset_filter_warning_custom_order_disabled);
                moveColumns(treeItem, !singleStep ? j++ : tree.indexOf(treeItem) - 1, false);

            // Set correct visible position
            columnsTree.setHeaderVisible(true);

                }
            treeEditor = new FilterSettingsTreeEditor(columnsTree);
                    cell.setText(constraint.getAttribute().getName());
                protected boolean canEdit(Object element) {
    }
 *
                toggleColumnOrder(item);
import org.eclipse.jface.viewers.*;
            dataFilter,
                        if (condition != null) {
                    }
            item.setImage(DBeaverIcons.getImage(icon));
        getShell().setText(ResultSetMessages.controls_resultset_filter_title);
                    return constraint.isVisible();
                            return condition;
                moveTopButton = createToolItem(toolbar, ResultSetMessages.dialog_toolbar_move_to_top, UIIcon.ARROW_TOP, () -> {
                    }

            super(columnsTree);
        int currentVisualPosition = startingVisualPosition;
                    cell.setImage(DBeaverIcons.getImage(DBValueFormatting.getObjectImage(binding.getMetaAttribute())));
                    final DBDAttributeBinding binding = (DBDAttributeBinding) element;
        return UIUtils.getDialogSettings(DIALOG_ID);
        if (curIndex == newIndex) {
                    final DBDAttributeBinding binding = (DBDAttributeBinding) element;
class FilterSettingsDialog extends HelpEnabledDialog {
                DBDAttributeConstraint constraint = getBindingConstraint(binding);
        moveUpButton.setEnabled(moveUpEnabled);

    private static ToolItem createToolItem(ToolBar toolBar, String text, DBIcon icon, final Runnable action)
    }
                });
/*
                toolbar.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            this.columnsTree = columnsTree;
                }
                    return new CustomCheckboxCellEditor(((TreeViewer) getViewer()).getTree(), true);
        final DBDAttributeConstraint c1 = getBindingConstraint(o1);
                    final DBDAttributeConstraint constraint = getBindingConstraint(binding);
        }
        final Tree tree = columnsViewer.getTree();
                    continue;

            columnsController.createColumns(false);
            }
                Composite tph = UIUtils.createComposite(columnsGroup, 1);
            filterGroup.setEnabled(false);
        final int startingVisualPosition = start.getVisualPosition();
            if (resultSetViewer.getDataSource() != null && resultSetViewer.getDataSource().getInfo().supportsResultSetOrdering()) {
}
    private java.util.List<DBDAttributeConstraint> constraints;
 * Copyright (C) 2010-2026 DBeaver Corp and others
        }
                    continue;
                UIUtils.createToolBarSeparator(toolbar, SWT.VERTICAL);
        public boolean isGrayed(Object element)
            if (CommonUtils.isEmpty(criteria)) {
                hasVisibleColumns = true;
 * DBeaver - Universal Database Manager

                default: return ""; //$NON-NLS-1$
    // Keep constraints in a copy because we use this list as table viewer model

import org.eclipse.swt.events.SelectionAdapter;
            }

 *
        public FilterSettingsTreeEditor(Tree columnsTree) {
                moveUpButton.setEnabled(false);
                if (singleStep && tree.indexOf(treeItem) == j) {
    @Override
                    final DBDAttributeBinding binding = (DBDAttributeBinding) cell.getElement();
                }
            item.setText(COLUMN_CRITERIA_INDEX, criteria);
                    if (nestedBindings == null || nestedBindings.isEmpty()) {
                            cell.setImage(null);
            whereText.setText(dataFilter.getWhere());
    private final List<DBDAttributeBinding> attributes;
    private void moveColumns(int curIndex, int newIndex)


    }
        getShell().setImage(DBeaverIcons.getImage(UIIcon.FILTER));
            });
    FilterSettingsDialog(ResultSetViewer resultSetViewer)
                currentVisualPosition = swapVisualPositions(currentVisualPosition, i);


        item.addSelectionListener(new SelectionAdapter() {
        {
    private final Comparator<DBDAttributeBinding> POSITION_SORTER = (o1, o2) -> {
            dataFilter.setOrder(orderText.getText());
                    attributes.sort(ALPHA_SORTER);

        this.constraints = new ArrayList<>(dataFilter.getConstraints());
                        cell.setText(SQLUtils.getConstraintCondition(executionContext.getDataSource(), constraint, null, true));

import org.jkiss.dbeaver.ui.controls.resultset.spreadsheet.SpreadsheetPresentation;
        if (icon != null) {
            Label warnLabel = new Label(composite, SWT.NONE);
import org.jkiss.code.Nullable;
            lastTraverseIndex = COLUMN_CRITERIA_INDEX;
            } else {
            columnsTree.setLinesVisible(true);
        final boolean moveToTopEnabled = selection.length > 0 && tree.indexOf(selection[selection.length - 1]) != selection.length - 1;
                currentVisualPosition = swapVisualPositions(currentVisualPosition, i);
            });
    }
     * See org.jkiss.dbeaver.ui.properties.PropertyTreeViewer.saveEditorValues()
            columnsController.addColumn(ResultSetMessages.controls_resultset_filter_column_name, null, SWT.LEFT, true, false, new CellLabelProvider() {
    private final Comparator<DBDAttributeBinding> activeSorter = POSITION_SORTER;
    private int swapVisualPositions(int currentVisualPosition, int i) {
    }
 */
                    if (executionContext != null) {
        });
            }, new EditingSupport(columnsViewer) {
            warnLabel.setForeground(parent.getDisplay().getSystemColor(SWT.COLOR_RED));
                @Override
//            constraint.setVisualPosition(this.constraints.indexOf(constraint));
import org.jkiss.dbeaver.ui.controls.*;
                }
        this.resultSetViewer = resultSetViewer;
 * distributed under the License is distributed on an "AS IS" BASIS,
        columnsViewer.expandAll();

            } else if (!constraint.isOrderDescending()) {
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
        @Override
        }
        whereText.setLayoutData(new GridData(GridData.FILL_BOTH));
                        final DBDAttributeConstraint constraint = getBindingConstraint(attributes.get(i));
        refreshData();
    {
    private DBDDataFilter dataFilter;
        @Override
        }
                protected TreeViewer doCreateTreeViewer(Composite parent, int style) {
                @Override
    @Override
        libsTab.setToolTipText(ResultSetMessages.controls_resultset_filter_group_custom_tooltip_text);
        UIUtils.createControlLabel(filterGroup, ResultSetMessages.controls_resultset_filter_label_orderby);
        public Image getColumnImage(Object element, int columnIndex)
                        final DBDAttributeBinding binding = (DBDAttributeBinding) cell.getElement();
                }
            columnsController.addBooleanColumn(ResultSetMessages.controls_resultset_filter_column_pinned, null, SWT.LEFT, true, false, item -> {
        gd.widthHint = 400;
                        }
            }

        @Override
                protected CellEditor getCellEditor(Object element) {
                    DBCExecutionContext executionContext = resultSetViewer.getExecutionContext();
        public String getColumnText(Object element, int columnIndex) {
        return parent;
            new FilteredTree(columnsGroup, SWT.MULTI | SWT.FULL_SELECTION, new NamedObjectPatternFilter(), true, false) {
        return c1.getVisualPosition() - c2.getVisualPosition();
import org.eclipse.swt.custom.CTabFolder;
    {


        }
                            cell.setText(null);
    private TreeViewer columnsViewer;
 * Licensed under the Apache License, Version 2.0 (the "License");
                    if (orderPosition > 0) {
                case 1: return String.valueOf(constraint.getOriginalVisualPosition() + 1);
        this.dataFilter = new DBDDataFilter(resultSetViewer.getModel().getDataFilter());
            for (int i = startingVisualPosition + 1; i <= endingVisualPosition; i++) {
import org.eclipse.swt.SWT;
            dataFilter.setWhere(whereText.getText());
        orderText = new Text(filterGroup, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
        currentVisualPosition = currentConstraint.getVisualPosition();
        orderText.setLayoutData(new GridData(GridData.FILL_BOTH));
    }
            orderText.setText(dataFilter.getOrder());
                moveDownButton = createToolItem(toolbar, ResultSetMessages.dialog_toolbar_move_down, UIIcon.ARROW_DOWN, () -> {
                    }
import org.jkiss.dbeaver.model.data.DBDAttributeConstraint;
    private ToolItem moveUpButton;
        final boolean moveDownEnabled = selection.length > 0 && tree.indexOf(selection[selection.length - 1]) != tree.getItemCount() - 1;
                public boolean hasChildren(Object element) {
                    moveSelectedItems(false, false);
                        constraint.setOption(DBDAttributeConstraintBase.ATTR_OPTION_PINNED, SpreadsheetPresentation.getNextPinIndex(dataFilter));
                });
                createToolItem(toolbar, ResultSetMessages.dialog_toolbar_sort, UIIcon.SORT, () -> {
        for (DBDAttributeConstraint constraint : dataFilter.getConstraints()) {
        if (!hasVisibleColumns) {
    private DBDAttributeConstraint getBindingConstraint(DBDAttributeBinding binding) {
            columnsViewer.refresh();
        // Update other constraints indexes
                case 3: {
        this.constraints.sort(Comparator.comparingInt(DBDAttributeConstraintBase::getVisualPosition));
            }, new EditingSupport(columnsViewer) {
        }
        moveUpButton.setEnabled(newIndex > 0);
import org.eclipse.swt.custom.CTabItem;

            @Override

            if (columnIndex == 2) {

            });
        Collections.addAll(this.attributes, modelAttrs);
            }

                        constraint.setVisualPosition(i);
                    final DBDAttributeConstraint constraint = getBindingConstraint(binding);
                }
    private final ResultSetViewer resultSetViewer;
                final DBDAttributeConstraint constraint = getBindingConstraint(binding);
            if (newIndex < curIndex) {
        currentConstraint.setVisualPosition(swappingConstraintVisualPosition);
            filtersChanged);
                    c.setVisualPosition(c.getVisualPosition() - 1);
                    refreshData();
    private Text whereText;
                    final DBDAttributeConstraint constraint = getBindingConstraint(binding);
            }
    private Text orderText;
                case 0: return constraint.getAttribute().getName();
                protected Object getValue(Object element) {
    {
        public boolean isChecked(Object element)
package org.jkiss.dbeaver.ui.controls.resultset;
import org.eclipse.swt.widgets.*;
                    constraint.setVisible((Boolean) value);
            final Tree columnsTree = columnsViewer.getTree();
                    moveSelectedItems(true, true);

        final DBDAttributeConstraint c2 = getBindingConstraint(o2);


        }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            columnsViewer.setContentProvider(new TreeContentProvider() {
        }
    };
            if (index == COLUMN_ORDER_INDEX) {
        columnsViewer.refresh();
    {
                }
    private void moveColumns(TreeItem curItem, int newIndex, boolean reverse)
                    refreshData();
        if (dataFilter.getWhere() != null) {
            columnsController.addColumn(ResultSetMessages.controls_resultset_filter_column_criteria, null, SWT.LEFT, true, false, new CellLabelProvider() {
import java.util.List;
                @Override
        attributes.sort(activeSorter);
import org.eclipse.swt.events.SelectionEvent;
        if (!reverse) {
        libsTab.setControl(filterGroup);

        UIUtils.createControlLabel(filterGroup, ResultSetMessages.controls_resultset_filter_label_where);
        super.buttonPressed(buttonId);
                    final DBDAttributeBinding[] res = nestedBindings.toArray(new DBDAttributeBinding[0]);
        }
            } else if (index == COLUMN_CRITERIA_INDEX && resultSetViewer.supportsDataFilter()) {
import org.eclipse.jface.dialogs.ControlEnableState;
                    }
                    final DBDAttributeConstraint constraint = getBindingConstraint(binding);
            DBDAttributeConstraint constraint = getBindingConstraint(binding);
        }
                        }
            return null;
        }
                break;
    {
                @Override
        } else {
                }

                            cell.setImage(DBeaverIcons.getImage(constraint.isOrderDescending() ? UIIcon.SORT_INCREASE : UIIcon.SORT_DECREASE));
import org.jkiss.dbeaver.model.sql.SQLUtils;
                moveBottomButton = createToolItem(toolbar, ResultSetMessages.dialog_toolbar_move_to_bottom, UIIcon.ARROW_BOTTOM, () -> {

        final int endingVisualPosition = end.getVisualPosition();

import org.eclipse.jface.dialogs.IDialogSettings;

    }

            Composite columnsGroup = UIUtils.createComposite(tabFolder, 1);
                        constraint.setVisible(true);

        } else {
                if (c.getVisualPosition() >= newIndex && c.getVisualPosition() < curIndex) {
                    @Override
    @NotNull
            } else {
        columnsViewer.setInput(attributes);
     * This class was introduced exclusively to bypass the issue with
                }

            }
                @Override
                ToolItem showNoneButton = createToolItem(toolbar, ResultSetMessages.dialog_toolbar_show_none, null, () -> {
                constraint.setCriteria(null);
            columnsGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        Composite composite = super.createDialogArea(parent);
                    final DBDAttributeBinding binding = (DBDAttributeBinding) element;
                @Override
            libsTab.setControl(columnsGroup);
        refreshData();
                moveColumns(selection[i], !singleStep ? getItemsCount() - 1 - j++ : tree.indexOf(selection[i]) + 1, true);

import org.jkiss.dbeaver.model.data.DBDAttributeConstraintBase;
        final DBDAttributeConstraint currentConstraint = constraints.get(currentVisualPosition);
    protected Composite createDialogArea(Composite parent)
                });
            return null;

                        constraint.removeOption(DBDAttributeConstraintBase.ATTR_OPTION_PINNED);
    }
import org.eclipse.swt.layout.GridData;

            filtersChanged = false;
            }
            columnsController.addBooleanColumn(ResultSetMessages.controls_resultset_filter_column_visible, null, SWT.LEFT, true, false, item -> {
    private FilterSettingsTreeEditor treeEditor;
        treeEditor.okPressed();
    }
            public void widgetSelected(SelectionEvent e) {

 * Unless required by applicable law or agreed to in writing, software
                        String condition = SQLUtils.getConstraintCondition(executionContext.getDataSource(), constraint, null, true);
        // Pack UI

import org.jkiss.dbeaver.model.DBValueFormatting;
        final boolean moveUpEnabled = selection.length > 0 && tree.indexOf(selection[0]) != 0;
                }
        this.attributes = new ArrayList<>(modelAttrs.length);
        }
                        return null;
    @Override
                }
            DBDAttributeBinding binding = (DBDAttributeBinding) element;
        @Nullable
                case 2: {
            gd.heightHint = 300;
        tabFolder.setLayoutData(gd);
        createCustomFilters(tabFolder);
                showAllButton.setImage(UIUtils.getShardImage(ISharedImages.IMG_ETOOL_DEF_PERSPECTIVE));
            }
                ToolItem showAllButton = createToolItem(toolbar, ResultSetMessages.dialog_toolbar_show_all, null, () -> {
        Collections.swap(constraints, i, currentVisualPosition);
import org.jkiss.utils.CommonUtils;
                    final DBDAttributeConstraint constraint = getBindingConstraint(binding);
import org.jkiss.dbeaver.ui.UIUtils;
                updateButtons();
        private static final int COLUMN_ORDER_INDEX = 4;
            });
                @Override
    protected void buttonPressed(int buttonId)
                    constraints = new ArrayList<>(dataFilter.getConstraints());
        private static final int COLUMN_CRITERIA_INDEX = 5;
        }
                        if (constraint.getOrderPosition() > 0) {
        //UIUtils.packColumns(filterViewer.getTable());

        {
                    if (CommonUtils.getBoolean(value, false)) {
                    DBValueFormatting.getObjectImage(binding.getMetaAttribute()));

                return constraint.isVisible();

        return item;
                    for (int i = 0; i < attributes.size(); i++) {
        final TreeItem[] selection = tree.getSelection();
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
            return false;

        Composite filterGroup = new Composite(tabFolder, SWT.NONE);
    }
    }
                updateButtons();
        return columnsViewer.getTree().getItemCount();


                    refreshData();
    @Override
                    //columnsViewer.refresh();
    {
            }
            }
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
                    c.setVisualPosition(c.getVisualPosition() + 1);
                text.setText(item.getText(index));
                    orderText.setText(""); //$NON-NLS-1$
        private void toggleColumnOrder(TreeItem item) {
 * See the License for the specific language governing permissions and
            item.setToolTipText(text);

            }
                saveEditorValue(lastEditor, COLUMN_CRITERIA_INDEX, lastTreeItem);
                constraint.setOrderDescending(true);
    {
import org.eclipse.ui.dialogs.FilteredTree;
                @Override
        @Nullable
            }
    private ToolItem moveDownButton;
            DBDAttributeBinding binding = (DBDAttributeBinding) element;
    }
                        } else {
 *
        }
        }
                    final DBDAttributeConstraint constraint = getBindingConstraint(binding);
        super(resultSetViewer.getControl().getShell(), IHelpContextIds.CTX_DATA_FILTER);
        if (text != null) {
    }
                @Override
            return;
                }
                @Override
    private void createCustomFilters(CTabFolder tabFolder)
    }
            if (constraint.matches(binding, true)) {
     * macos buttons not getting focus when dialog closes.
        protected void saveEditorValue(Control control, int index, TreeItem item) {

                        cell.setText(null);

                    final DBCExecutionContext executionContext = resultSetViewer.getExecutionContext();
    @Override
        final DBDAttributeConstraint swappingConstraint = constraints.get(i);
                    return true;
        }

            DBDAttributeConstraint constraint = getBindingConstraint((DBDAttributeBinding) item.getData());
    class CheckStateProvider implements ICheckStateProvider {
                moveUpButton = createToolItem(toolbar, ResultSetMessages.dialog_toolbar_move_up, UIIcon.ARROW_UP, () -> {
                createToolItem(toolbar, ResultSetMessages.dialog_toolbar_reset, UIIcon.REFRESH, () -> {
            if (constraint.isVisible()) {
    protected void createButtonsForButtonBar(Composite parent)
                if (constraint.getOrderPosition() > 0) {
            }
            ControlEnableState.disable(filterGroup);

                return DBeaverIcons.getImage(
                @Override
    {

        moveDownButton.setEnabled(moveDownEnabled);
                    final DBDAttributeBinding binding = (DBDAttributeBinding) cell.getElement();
                constraint.setOrderPosition(dataFilter.getMaxOrderingPosition() + 1);
    private int getItemsCount() {
        UIUtils.asyncExec(() -> {
                        return " " + String.valueOf(orderPosition);
            for (TreeItem treeItem : selection) {
                moveTopButton.setEnabled(false);
                columnsViewer.addSelectionChangedListener(event -> updateButtons());
                });

                    }
        CTabItem libsTab = new CTabItem(tabFolder, SWT.NONE);
    }
        if (dataFilter.equalFilters(resultSetViewer.getModel().getDataFilter(), true)) {
        refreshData();
        protected Control createEditor(Tree tree, int index, TreeItem item) {
                    final DBDAttributeBinding binding = (DBDAttributeBinding) cell.getElement();
                ToolBar toolbar = new ToolBar(tph, SWT.HORIZONTAL | SWT.FLAT);
