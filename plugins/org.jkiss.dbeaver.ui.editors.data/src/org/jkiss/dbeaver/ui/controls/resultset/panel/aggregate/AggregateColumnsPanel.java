                    Object cellValue = model.getCellValue(attr, row);
            IDialogSettings funcSection = UIUtils.getSettingsSection(functionsSection, func.getId());
import org.jkiss.dbeaver.ui.controls.resultset.panel.ResultSetPanelBase;
        aggregateAsStrings = panelSettings.getBoolean(PARAM_GROUP_AS_STRINGS);
    public static final String PARAM_GROUP_BY_COLUMNS = "groupByColumns";

import org.eclipse.swt.events.SelectionEvent;
        aggregateTable.removeAll();
        return false;
            for (int i = 0; i < funcs.length; i++) {
    private static final DecimalFormat INTEGER_FORMAT = new DecimalFormat("###,###,###,###,###,##0");
        public void run() {
                    funcIndexes.put(func, funcSection.getInt("index"));
        } finally {
 * you may not use this file except in compliance with the License.
                TreeItem attrItem = new TreeItem(aggregateTable, SWT.NONE);
        }
        loadSettings();

    private final List<AggregateFunctionDescriptor> enabledFunctions = new ArrayList<>();

    private class AddFunctionItemAction extends Action {

            } else {
        }
                if (item.getData() instanceof AggregateFunctionDescriptor) {
import org.eclipse.swt.graphics.Point;
import org.jkiss.dbeaver.ui.internal.UIMessages;
                    }
        }
            refresh(false);
            }
            }
    private static final Log log = Log.getLog(AggregateColumnsPanel.class);
                    strValue = DOUBLE_FORMAT.format(result);



        public boolean isEnabled() {
                ResultSetRow row = selection.getElementRow(element);
                TreeItem treeItem = funcMap.get(func);
        enabledFunctions.sort(Comparator.comparing(AggregateFunctionDescriptor::getLabel));

            super(ResultSetMessages.aggregate_columns_copy_all_text);
        panelSettings.put(PARAM_GROUP_BY_COLUMNS, groupByColumns);
}
 * Copyright (C) 2010-2025 DBeaver Corp and others
        public void run() {
        public AddFunctionAction() {
    @Override
    }
            }
        for (AggregateFunctionDescriptor func : FunctionsRegistry.getInstance().getAggregateFunctions()) {
            UIUtils.setClipboardContents(aggregateTable.getDisplay(), TextTransfer.getInstance(), result.toString());
import java.util.List;
import org.jkiss.dbeaver.DBException;
        this.aggregateTable = new Tree(parent, SWT.SINGLE | SWT.FULL_SELECTION);
        int[] funcCount = new int[funcs.length];
            manager.add(new Separator());
    }
            aggregateValues(null, allValues);

    private void fillToolBar(IContributionManager contributionManager) {
                    continue;
 * Licensed under the Apache License, Version 2.0 (the "License");
                } else if (result instanceof Integer || result instanceof Long || result instanceof Short) {
import org.jkiss.dbeaver.model.DBPImage;
            if (funcCount[i] <= 0) {
            }
    }
import org.jkiss.dbeaver.ui.controls.resultset.*;
    //private boolean runServerQueries;
    public void setFocus() {
        }
                Point location = aggregateTable.getDisplay().getCursorLocation();


        List<AggregateFunctionDescriptor> functions = enabledFunctions;

                }
            setImageDescriptor(DBeaverIcons.getImageDescriptor(
        public RemoveFunctionAction() {
            setChecked(groupByColumns);
            }
                if (result instanceof Double || result instanceof Float || result instanceof BigDecimal) {
    private void loadDefaultFunctions() {
                    result.append(item.getText(1));
    }
                aggregateValues(attrItem, entry.getValue());
                if (!result.isEmpty()) result.append("\n");
            return menuManager;
        public void run() {
        //aggregateTable.setFocus();
                        result.append("\n\t");
        public void run() {
            if (!menuManager.isEmpty()) {
                    .map(AggregateFunctionDescriptor::getId)
            return aggregateTable != null && !aggregateTable.isDisposed() && aggregateTable.getSelectionCount() > 0;
            }

    private void aggregateSelection(@NotNull IResultSetSelection selection) {
        @Override
    private class ResetFunctionsAction extends Action {
    }
                for (final AggregateFunctionDescriptor func : missingFunctions) {
            for (IDialogSettings funcSection : functionsSection.getSections()) {
    private static final DecimalFormat DOUBLE_FORMAT = new DecimalFormat("###,###,###,###,###,##0.###");
                final Menu contextMenu = menuManager.createContextMenu(aggregateTable);
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
    public boolean isDirty() {
            fillToolBar(manager);
        return this.aggregateTable;

        contributionManager.add(new ValueTypeToggleAction());
import org.jkiss.dbeaver.model.DBIcon;
                aggregateAsStrings ? DBIcon.TYPE_STRING : DBIcon.TYPE_NUMBER));
import org.jkiss.dbeaver.registry.functions.AggregateFunctionDescriptor;
                if (!enabledFunctions.contains(func)) {
        public ResetFunctionsAction() {

    public Control createContents(final IResultSetPresentation presentation, Composite parent) {
            presentation.getController().updatePanelActions();
            loadDefaultFunctions();
        }
import java.math.BigDecimal;
import org.jkiss.dbeaver.Log;
        @Override
            final Map<AggregateFunctionDescriptor, Integer> funcIndexes = new HashMap<>();

        refresh(false);
            for (Map.Entry<DBDAttributeBinding, List<Object>> entry : attrValues.entrySet()) {
        @Override
            }
                    treeItem.setText(1, strValue);
                }
                    aggregateSelection((IResultSetSelection)selection);
            aggregateAsStrings = !aggregateAsStrings;
        if (this.presentation instanceof ISelectionProvider) {
                AggregateFunctionDescriptor func = (AggregateFunctionDescriptor) item.getData();
        }
                AggregateFunctionDescriptor func = FunctionsRegistry.getInstance().getFunction(funcId);
    public static final String PARAM_GROUP_AS_STRINGS = "groupAsStrings";
                }
        }
        }
 */
        panelSettings.put(PARAM_GROUP_AS_STRINGS, aggregateAsStrings);
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.SWT;
    private class CopyAllAction extends Action {
            if (!missingFunctions.isEmpty()) {
        IDialogSettings functionsSection = panelSettings.getSection("functions");
            } catch (DBException e) {
import org.jkiss.dbeaver.ui.*;
        }
        ActionContributionItem item = new ActionContributionItem(new AddFunctionAction());
            }
import org.eclipse.jface.action.*;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


    private IResultSetPresentation presentation;
        this.aggregateTable.addDisposeListener(e -> menuMgr.dispose());
                    strValue = result.toString();
        });
                new TreeItem(aggregateTable, SWT.NONE) :
                }
        for (AggregateFunctionDescriptor funcDesc : functions) {
                    result.append(item.getText(0));
            if (func.isDefault()) {
                funcSection.put("index", enabledFunctions.indexOf(func));
                ISelection selection = ((ISelectionProvider) presentation).getSelection();

        menuMgr.setRemoveAllWhenShown(true);
                enabledFunctions.remove(func);
        }
        }
            for (Object element : selection.toList()) {
            }

    private class CopyAction extends Action {
        if (!featureTracked) {
        }
        @Override
    }
            }
    @Override

import org.jkiss.dbeaver.ui.controls.ToolbarSeparatorContribution;
            }
        MenuManager menuMgr = new MenuManager();
            for (TreeItem item : aggregateTable.getSelection()) {
    }
            super(ResultSetMessages.aggreagate_columns_group_by_column_text, IAction.AS_CHECK_BOX);
    }

        @Override
        new TreeColumn(this.aggregateTable, SWT.LEFT).setText(ResultSetMessages.aggregate_columns_value_text);

            setChecked(groupByColumns);
        IDialogSettings functionsSection = UIUtils.getSettingsSection(panelSettings, "functions");
                "functions", enabledFunctions.stream()
                }
    @Override
/**
        item.setMode(ActionContributionItem.MODE_FORCE_TEXT);
            try {
 *
        this.aggregateTable.setMenu(menuMgr.createContextMenu(this.aggregateTable));
            }
                    result.append(item.getText(0)).append("=").append(item.getText(1));
        aggregateTable.addSelectionListener(new SelectionAdapter() {
        public ValueTypeToggleAction() {
            setChecked(aggregateAsStrings);
                    if (!result.isEmpty()) result.append("\n");
            funcItem.setData(funcDesc);
        this.panelSettings = ResultSetUtils.getViewerSettings(SETTINGS_SECTION_AGGREGATE);
                contextMenu.setVisible(true);
            StringBuilder result = new StringBuilder();
                }
            DataEditorFeatures.RESULT_SET_PANEL_CALC.use(Map.of(
            enabledFunctions.sort(Comparator.comparingInt(funcIndexes::get));
                    enabledFunctions.add(func);
                String strValue;
            for (Object element : selection.toList()) {

                if (row != null) {

        contributionManager.add(new ToolbarSeparatorContribution(true));
                funcItem.setImage(0, DBeaverIcons.getImage(icon));

        public void run() {
        Map<IAggregateFunction, TreeItem> funcMap = new IdentityHashMap<>();
                DBDAttributeBinding attr = selection.getElementAttribute(element);
 */
 * You may obtain a copy of the License at
            refresh(false);
                aggregateTable.addDisposeListener(e -> menuManager.dispose());
            setMenuCreator(new MenuCreator(widget -> createMenuManager()));
        public CopyAction() {
            }
            }
                    allValues.add(cellValue);
    private Tree aggregateTable;
            manager.add(new CopyAction());
        menuMgr.addMenuListener(manager -> {


            List<Object> allValues = new ArrayList<>(selection.size());
            this.func = func;
            manager.add(new CopyAllAction());
        }
                }
            refresh(false);
                } else {
    public void activatePanel() {
    }
        for (Object element : values) {
import java.util.stream.Collectors;
    private class AddFunctionAction extends Action {
        aggregateTable.setRedraw(false);
        }
        }
        }
        }
    }
    private class ValueTypeToggleAction extends Action {
        }
    private boolean featureTracked;
                    Object cellValue = model.getCellValue(attr, row);
        new TreeColumn(this.aggregateTable, SWT.LEFT).setText(ResultSetMessages.aggregate_columns_function_text);
                for (TreeItem item : aggregateTable.getItems()) {
            loadDefaultFunctions();
                log.error(e);
    public AggregateColumnsPanel() {
    private void aggregateValues(TreeItem parentItem, Collection<Object> values) {

        contributionManager.add(new ResetFunctionsAction());
 * DBeaver - Universal Database Manager
        this.aggregateTable.setLinesVisible(true);

                funcMap.put(func, funcItem);
        }
                for (TreeItem item : aggregateTable.getItems()) {
            setImageDescriptor(DBeaverIcons.getImageDescriptor(UIIcon.GROUP_BY_ATTR));
            MenuManager menuManager = createMenuManager();
            refresh(false);
        ResultSetModel model = presentation.getController().getModel();
                attrItem.setImage(DBeaverIcons.getImage(DBValueFormatting.getObjectImage(entry.getKey())));
            StringBuilder result = new StringBuilder();
        this.aggregateTable.setHeaderVisible(true);
                    log.debug("Function '" + funcId + "' not found");
            funcSection.put("enabled", enabled);
    }
        }
        public void run() {
                        result.append(funcItem.getText(0)).append("=").append(funcItem.getText(1));
            IAggregateFunction func = funcs[i];
            refresh(false);
    }
            aggregateTable.setRedraw(true);
        }
            if (!groupByColumns) {

        public AddFunctionItemAction(AggregateFunctionDescriptor func) {
    @Override
                    refresh(false);
package org.jkiss.dbeaver.ui.controls.resultset.panel.aggregate;
    @Override
            enabledFunctions.clear();
                String funcId = funcSection.getName();
            featureTracked = true;
        @Override
            public void widgetSelected(SelectionEvent e) {
import org.jkiss.dbeaver.model.DBValueFormatting;
            super(func.getLabel(), func.getIcon() == null ? null : DBeaverIcons.getImageDescriptor(func.getIcon()));

            setChecked(aggregateAsStrings);
    }

        }
                    if (!result.isEmpty()) result.append("\n");
import java.util.*;
    public void clearValue()
    {
        IAggregateFunction[] funcs = funcMap.keySet().toArray(new IAggregateFunction[0]);




        if (groupByColumns) {
        @Override
                attrItem.setText(entry.getKey().getName());
                attrItem.setExpanded(true);
        public CopyAllAction() {
                presentation.getController().updatePanelActions();
 * See the License for the specific language governing permissions and
            super(ResultSetMessages.aggreagate_columns_toggle_aggregation_text, IAction.AS_CHECK_BOX);
            aggregateTable.removeAll();
import org.jkiss.code.NotNull;
                if (presentation.getController().getVisiblePanel() == AggregateColumnsPanel.this) {
    private class RemoveFunctionAction extends Action {
            enabledFunctions.add(func);
        contributionManager.add(new RemoveFunctionAction());
        }
    }

                DBDAttributeBinding attr = selection.getElementAttribute(element);
import java.text.DecimalFormat;
    public static final String SETTINGS_SECTION_AGGREGATE = "panel-" + PANEL_ID;
        groupByColumns = panelSettings.getBoolean(PARAM_GROUP_BY_COLUMNS);

                ResultSetRow row = selection.getElementRow(element);
                    List<Object> values = attrValues.computeIfAbsent(attr, k -> new ArrayList<>());
        try {
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
                new TreeItem(parentItem, SWT.NONE);
                }
 * limitations under the License.

            ));
                }
            if (this.presentation instanceof ISelectionProvider) {


            }
                if (row != null) {
            } else {
            funcItem.setText(0, funcDesc.getLabel());
                }
        if (functionsSection != null) {
                }
                if (func == null) {
 *
                if (!funcSection.getBoolean("enabled")) {

            MenuManager menuManager = new MenuManager();
            UIUtils.packColumns(aggregateTable, false, null);
    }

            super(ResultSetMessages.aggregate_columns_copy_value_text);
    private IDialogSettings panelSettings;
        });

                } else {
        }
    }
import org.eclipse.swt.widgets.*;
        }
    public void refresh(boolean force) {
            if (result != null) {
        contributionManager.add(item);

        }
        @Override
    }
 * RSV value view panel


            for (TreeItem item : aggregateTable.getSelection()) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                    for (TreeItem funcItem : item.getItems()) {
    }

    public void contributeActions(IContributionManager manager) {
                contextMenu.setLocation(location);
            super(UIMessages.button_add, DBeaverIcons.getImageDescriptor(UIIcon.ADD));
                    menuManager.add(new AddFunctionItemAction(func));
    private boolean aggregateAsStrings;
        } else {
            }
            }

        if (enabledFunctions.isEmpty()) {

            if (icon != null) {
            Object result = func.getResult(funcCount[i]);
import org.eclipse.jface.viewers.ISelection;
        fillToolBar(manager);
        this.presentation = presentation;
import org.eclipse.jface.viewers.ISelectionProvider;
            TreeItem funcItem = (parentItem == null) ?
            if (enabled) {


            ((ISelectionProvider) this.presentation).addSelectionChangedListener(event -> {
                enabledFunctions.add(func);
        for (int i = 0; i < funcs.length; i++) {
            });
    @Override
                if (selection instanceof IResultSetSelection) {
        public void run() {
                    result.append(item.getText(0));
import org.jkiss.dbeaver.model.data.aggregate.IAggregateFunction;
                    funcCount[i]++;
    public void deactivatePanel() {
            groupByColumns = !groupByColumns;
 * Unless required by applicable law or agreed to in writing, software
    private void loadSettings() {
    }
    }
                IAggregateFunction func = funcDesc.createFunction();

        saveSettings();
                if (funcs[i].accumulate(element, aggregateAsStrings)) {
            super(ResultSetMessages.aggregate_columns_remove_function_text, DBeaverIcons.getImageDescriptor(UIIcon.DELETE));
public class AggregateColumnsPanel extends ResultSetPanelBase {
            super(ResultSetMessages.aggregate_columns_reset_text, DBeaverIcons.getImageDescriptor(UIIcon.CANCEL));
 *
            List<AggregateFunctionDescriptor> missingFunctions = new ArrayList<>();
                continue;

        }

        }
        private final AggregateFunctionDescriptor func;
        public GroupByColumnsAction() {
import org.eclipse.jface.dialogs.IDialogSettings;
            for (AggregateFunctionDescriptor func : FunctionsRegistry.getInstance().getAggregateFunctions()) {
    private boolean groupByColumns;
    public static final String PANEL_ID = "column-aggregate";
                }


            }
        public void run() {
                }
                } else {

    }
        private MenuManager createMenuManager() {
                    strValue = INTEGER_FORMAT.format(result);
/*
        for (AggregateFunctionDescriptor func : FunctionsRegistry.getInstance().getAggregateFunctions()) {

    @Override
                if (strValue != null) {
                    missingFunctions.add(func);
import org.eclipse.swt.events.SelectionAdapter;

import org.jkiss.dbeaver.registry.functions.FunctionsRegistry;
            DBPImage icon = funcDesc.getIcon();
                    .collect(Collectors.joining(","))
                funcSection.put("index", -1);
    private class GroupByColumnsAction extends Action {
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
                }
        @Override
            Map<DBDAttributeBinding, List<Object>> attrValues = new LinkedHashMap<>();
            boolean enabled = enabledFunctions.contains(func);
        contributionManager.add(new GroupByColumnsAction());
                    values.add(cellValue);
        }
    }
            @Override

            UIUtils.setClipboardContents(aggregateTable.getDisplay(), TextTransfer.getInstance(), result.toString());
    private void saveSettings() {
