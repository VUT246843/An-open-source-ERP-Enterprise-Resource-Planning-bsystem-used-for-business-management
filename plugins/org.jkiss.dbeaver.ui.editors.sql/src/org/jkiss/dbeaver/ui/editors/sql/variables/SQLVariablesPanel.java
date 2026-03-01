
import org.jkiss.utils.CommonUtils;
    private boolean saveInProgress;
        if (curVariable != null) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        private Action deleteAction;
            StringEditorInput sqlInput = new StringEditorInput(
    private SQLEditorBase valueEditor;
                    curVariable.name,
/*

                        null : ((IStructuredSelection) varsTable.getSelection()).getFirstElement();

                );
package org.jkiss.dbeaver.ui.editors.sql.variables;
 * Licensed under the Apache License, Version 2.0 (the "License");
            valueEditor.setInput(sqlInput);
import org.jkiss.dbeaver.ui.*;
        valueEditor.reloadSyntaxRules();
                if (context.hasVariable(param.name)) {
            editorPH.setLayout(new FillLayout());
            curVariable = (DBCScriptContext.VariableInfo) ((IStructuredSelection)selection).getFirstElement();
                if (deleteAction != null) {
import java.util.Arrays;
            super.createSearchControls();
                }
            varsTable.addSelectionChangedListener(event -> {
        if (showParameters) {
import org.eclipse.ui.dialogs.PatternFilter;
                @Nullable
            //TableItem item = varsTable.getItem(selectionIndex);
import org.jkiss.dbeaver.utils.GeneralUtils;
    public SQLVariablesPanel(Composite parent, SQLEditor editor)
                }
            });
        mainEditor.getGlobalScriptContext().addListener(this);
                        saveVariableValue(editorControl);
                    try {
                public void run() {
    private void saveVariableValue(StyledText editorControl) {
            ViewerColumnController columnController = new ViewerColumnController("sqlVariablesViewer", varsTable);
            Text textControl = getSearchTextControl();
import java.util.List;
 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.ui.editors.SubEditorSite;
            if (editorControl != null) {

            contributionManager.add(deleteAction);
        protected void createSearchControls() {
        @Override

            super(parent, SWT.SHEET);
                        searchFilter.setPattern(searchString);
            } finally {
 * DBeaver - Universal Database Manager
            });
import org.eclipse.swt.layout.FillLayout;

        ));
            varsTable.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));
                public void run() {
            };
                    parameterValue,
                public void cancelSearch() {
            }
                            }
            showParamsAction.setImageDescriptor(DBeaverIcons.getImageDescriptor(UIIcon.SQL_PARAMETER));

            };
    }

        // Variables table
import org.eclipse.ui.texteditor.ITextEditorActionConstants;
        }
                public String getText(Object element) {
            varsTable.getTable().setHeaderVisible(true);
                saveInProgress = false;
import org.eclipse.swt.events.FocusEvent;

            saveInProgress = true;
    private class VariableListControl extends ProgressPageControl {
                    }
                    if (!varsTable.getSelection().isEmpty()) {
                    action.run();

                    }
                variables.add(new DBCScriptContext.VariableInfo(
        StyledText editorControl = valueEditor.getEditorControl();
            deleteAction = new Action("Delete variable", DBeaverIcons.getImageDescriptor(UIIcon.DELETE)) {
            valueEditor.reloadSyntaxRules();
 * You may obtain a copy of the License at
            deleteAction.setEnabled(false);
                valueEditor.init(new SubEditorSite(mainEditor.getSite()),
        }
            }
                CommonUtils.toString(curVariable.value),

        //UIUtils.packColumns(varsTable.getTable(), true);
                curVariable.value = varValue;
            };
    private final SQLEditor mainEditor;
import org.jkiss.dbeaver.model.sql.SQLScriptContext;
                    }
            varsTable.getTable().setLinesVisible(true);
                @Override

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
                    public void focusLost(FocusEvent e) {
            return;


            columnController.addColumn("Value", "Variable or parameter value", SWT.LEFT, true, true, new ColumnLabelProvider() {
            editorPH.setLayoutData(gd);
            GeneralUtils.DEFAULT_ENCODING
        public void fillCustomActions(IContributionManager contributionManager) {
            showParamsAction.setDescription("Show query parameters");
 */
                        varElement instanceof DBCScriptContext.VariableInfo);
import org.jkiss.dbeaver.ui.controls.ListContentProvider;
        private final ISearchExecutor searcher;
                @Override
}            Composite editorGroup = UIUtils.createPlaceholder(sash, 1);
            Action showParamsAction = new Action("Show parameters", Action.AS_CHECK_BOX) {
                editCurrentVariable();
        ISelection selection = varsTable.getSelection();
        }
        }
        List<DBCScriptContext.VariableInfo> variables = context.getVariables();
            super.fillCustomActions(contributionManager);
            variableListControl.createOrSubstituteProgressPanel(mainEditor.getSite());
            gd.minimumHeight = 100;
            valueEditor.createPartControl(editorPH);
                public void createPartControl(Composite parent) {

                }
            });
                        new RemoveVariablesAction(mainEditor, varsList).run();
                    continue;
                                DBCScriptContext.VariableInfo variable = (DBCScriptContext.VariableInfo) element;
                }

import org.jkiss.dbeaver.model.sql.registry.SQLQueryParameterRegistry;
import org.jkiss.dbeaver.ui.editors.StringEditorInput;
                    return ((DBCScriptContext.VariableInfo) element).type.getTitle();
                @Override
            };
            varsTable = new TableViewer(this, SWT.MULTI | SWT.FULL_SELECTION);
                        PatternFilter searchFilter = new PatternFilter() {
                    return ((DBCScriptContext.VariableInfo) element).name;
 *
                }

            TextEditorUtils.enableHostEditorKeyBindingsSupport(mainEditor.getSite(), editorControl);
import org.eclipse.swt.widgets.Text;
            //valueEditor.getEditorControl().setEnabled(false);
    }
                }
                        final StructuredSelection selection = (StructuredSelection) varsTable.getSelection();
                    } catch (PatternSyntaxException e) {
                    showParameters = !showParameters;
import org.jkiss.dbeaver.ui.controls.ProgressPageControl;

            true,
                    deleteAction.setEnabled(

            varsTable.setContentProvider(new ListContentProvider());

            showParamsAction.setChecked(showParameters);
            valueEditor = new SQLEditorBase() {
    }
                Object parameterValue = context.getParameterDefaultValue(param.name);
                //editorControl.addDisposeListener(e -> saveVariableValue(editorControl));
                    AssignVariableAction action = new AssignVariableAction(mainEditor, "");
                GeneralUtils.DEFAULT_ENCODING
        if (varsTable == null) {
                        return true;
import org.eclipse.swt.widgets.Composite;
            columnController.createColumns(true);
            valueEditor.getEditorControlWrapper().setLayoutData(new GridData(GridData.FILL_BOTH));
        }
import org.jkiss.code.Nullable;

                }
import org.eclipse.swt.layout.GridData;
                    action.setEditable(true);
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
            gd.verticalIndent = 3;
                                return wordMatches(variable.name) || wordMatches(CommonUtils.toString(variable.value));
import org.jkiss.dbeaver.ui.editors.TextEditorUtils;
            NavigatorUtils.createContextMenu(mainEditor.getSite(), varsTable, manager -> {} );
                    return CommonUtils.toString(((DBCScriptContext.VariableInfo) element).value);
                    @Override

            };
            gd.minimumWidth = 100;
        private Action addAction;
public class SQLVariablesPanel extends Composite implements DBCScriptContextListener {

import org.eclipse.swt.custom.StyledText;
        this.mainEditor = editor;
                }
                    performSearch(SearchType.NONE);
                varsTable.refresh();
            columnController.addColumn("Type", "Variable type", SWT.LEFT, true, true, new ColumnLabelProvider() {
        }
            "Variable",
                    updateActions();
                @Override
import org.jkiss.dbeaver.model.exec.DBCScriptContextListener;

                public DBCExecutionContext getExecutionContext() {

                }
import org.jkiss.dbeaver.ui.controls.ViewerColumnController;
import java.util.regex.PatternSyntaxException;
                public String getText(Object element) {
    private boolean showParameters;
            VariableListControl variableListControl = new VariableListControl(sash);
    }
        UIUtils.asyncExec(this::refreshVariables);
    @Override
        public VariableListControl(Composite parent) {
    }

    private void createControls() {
                            protected boolean isLeafMatch(Viewer viewer, Object element) {
        UIUtils.asyncExec(this::refreshVariables);
        if (editorControl == null) {
        }
 *

import org.jkiss.dbeaver.model.exec.DBCScriptContext;
                @Override
                    new StringEditorInput("Variable value", "", true, GeneralUtils.getDefaultFileEncoding()));
                }


import java.util.stream.Collectors;
 * See the License for the specific language governing permissions and
            try {
 *

                mainEditor.getGlobalScriptContext().setVariable(

        }

        //varsTable.removeAll();
            return;
            }
            valueEditor.reloadSyntaxRules();
                @Override
/**

        }

            UIUtils.createControlLabel(editorGroup, "Value");
            return searcher;

                    refreshVariables();
                    varValue);
            "",
        {
                });
                public void run() {
                        log.error(e.getMessage());
    static protected final Log log = Log.getLog(SQLVariablesPanel.class);
            try {
import org.eclipse.jface.viewers.*;
                "Variable " + curVariable.name,
                    return false;
            return;
                }
    private TableViewer varsTable;
            } catch (PartInitException e) {
                }
        addDisposeListener(e -> mainEditor.getGlobalScriptContext().removeListener(this));
                        varsTable.setFilters(new ViewerFilter[]{ searchFilter });


import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;
                public void run() {
            Composite editorPH = new Composite(editorGroup, SWT.NONE);
        if (!selection.isEmpty()) {
            });
    public void variableChanged(ContextAction action, DBCScriptContext.VariableInfo variable) {
                }
        sash.setWeights(new int[] { 600, 400 });
        @Override
                    DBCScriptContext.VariableType.PARAMETER));
            GridData gd = new GridData(GridData.FILL_BOTH);
            searcher = new ISearchExecutor() {
                public boolean performSearch(String searchString, int options) {
        // Editor

                            //(options & SEARCH_CASE_SENSITIVE) != 0);

                @Override
            columnController.addColumn("Variable", "Variable or parameter name", SWT.LEFT, true, true, new ColumnLabelProvider() {
                    super.createPartControl(parent);
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
            if (textControl != null) {
            StyledText editorControl = valueEditor.getEditorControl();
                if (parameterValue == null) {
        }
            createControls();
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
                }
        String varValue = editorControl.getText();
                log.error(e);
    @Override
            for (SQLQueryParameterRegistry.ParameterInfo param : SQLQueryParameterRegistry.getInstance().getAllParameters()) {
                @Override
            contributionManager.add(ActionUtils.makeActionContribution(showParamsAction, true));
        @Override
            contributionManager.add(new Action("Find variable", DBeaverIcons.getImageDescriptor(UIIcon.SEARCH)) {
            contributionManager.add(addAction);

import org.eclipse.ui.PartInitException;
                TextEditorUtils.enableHostEditorKeyBindingsSupport(mainEditor.getSite(), textControl);
        }
                    return mainEditor.getExecutionContext();
    {

    private DBCScriptContext.VariableInfo curVariable;

                    getAction(ITextEditorActionConstants.CONTEXT_PREFERENCES).setEnabled(false);
                @Override
        }
        if (saveInProgress) {

    }
            valueEditor.setWordWrap(true);
                public String getText(Object element) {
    }
        SQLScriptContext context = mainEditor.getGlobalScriptContext();

                        };
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;

        SashForm sash = new SashForm(this, SWT.VERTICAL);
 * Unless required by applicable law or agreed to in writing, software
                editorControl.addFocusListener(new FocusAdapter() {
        }
import org.eclipse.jface.action.Action;
 * SQLVariablesPanel
    public void parameterChanged(ContextAction action, String name, Object value) {
    public void refreshVariables() {
        setLayout(new FillLayout());
            gd.horizontalSpan = 1;
import org.jkiss.dbeaver.Log;
            addAction = new Action("Add variable", DBeaverIcons.getImageDescriptor(UIIcon.ADD)) {
                        List<String> varsList = Arrays.stream(selection.toArray()).map(el -> ((DBCScriptContext.VariableInfo) el).name).collect(Collectors.toList());
        super(parent, SWT.NONE);
import org.eclipse.swt.custom.SashForm;
        varsTable.setInput(variables);
        valueEditor.setInput(new StringEditorInput(
                    Object varElement = event.getSelection().isEmpty() ?
        if (saveInProgress) {

                @Override
                public boolean isFoldingEnabled() {
                }
                @Override
                    param.name,
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            });
        protected ISearchExecutor getSearchRunner() {
        protected void addSearchAction(IContributionManager contributionManager) {
                @Override
                false,

    }

        {
            }
 * limitations under the License.

                    varsTable.setFilters(new ViewerFilter[0]);
                    parameterValue = param.value;
import org.eclipse.jface.action.IContributionManager;
    private void editCurrentVariable() {
                        return false;
