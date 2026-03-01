                optionsGroup2,
                2);
                    return false;
                UISearchMessages.dialog_data_search_checkbox_search_in_lob,
                GridData.FILL_BOTH,
                    DBSObject object = ((DBNDatabaseNode) node).getObject();
            final Spinner maxResultsSpinner = UIUtils.createLabelSpinner(
                public void widgetSelected(SelectionEvent e) {
            });
                public boolean select(Viewer viewer, Object parentElement, Object element) {
                                && (DBSObjectContainer.class.isAssignableFrom(folderItemsClass)
        return objects;

    private static final String PROP_SHOW_CONNECTED = "search.data.show-connected-only"; //$NON-NLS-1$
            navigatorTree = new DatabaseNavigatorTree(databasesGroup, rootNode, SWT.MULTI);
        store.setValue(PROP_SEARCH_FOREIGN, params.searchForeignObjects);
            navigatorTree.setLayoutData(gd);
    private static final String PROP_SOURCES = "search.data.object-source"; //$NON-NLS-1$

import org.jkiss.dbeaver.utils.RuntimeUtils;
        });
import java.util.Set;
        searchText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                DBSObject object = ((DBNDatabaseNode) node).getObject();

                store.setValue(PROP_HISTORY + "." + historyIndex, history); //$NON-NLS-1$
                        loadTreeState(new DefaultProgressMonitor(monitor)));
                2);
            GridData gd = new GridData(GridData.FILL_BOTH);

                }
            searchHistory.add(params.searchString);
    }
        UIUtils.asyncExec(this::restoreCheckedNodes);
    @Override
    public SearchDataQuery createQuery() throws DBException {
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
        Composite searchGroup = new Composite(parent, SWT.NONE);
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                UISearchMessages.dialog_data_search_checkbox_fast_search_tip, params.fastSearch,
        params.sources = getCheckedSources();

        }


                        return true;
        }
                public void widgetSelected(SelectionEvent e) {
    @Override
            Composite optionsGroup2 = UIUtils.createTitledComposite(
 */
                    treeViewer.refresh();
        store.setValue(PROP_SAMPLE_ROWS, params.maxResults);
                UISearchMessages.dialog_data_search_control_group_settings,
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * You may obtain a copy of the License at
            container.getRunnableContext().run(false, true, monitor -> {
    private DatabaseNavigatorTree navigatorTree;
                }
        store.setValue(PROP_CASE_SENSITIVE, params.caseSensitive);
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.DBException;
            for (String history : searchHistory) {
                        if (element instanceof DBNDataSource ds && ds.getDataSource() == null ||
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private List<DBSDataContainer> getCheckedSources() {
                                return false;
            monitor,
            DBNNode rootNode = projectNode == null ? platform.getNavigatorModel().getRoot() : projectNode.getDatabases();
        }
                        throw new InvocationTargetException(e);
            }
                public void widgetSelected(SelectionEvent e) {
            caseCheckbox.addSelectionListener(new SelectionAdapter() {
import org.jkiss.utils.ArrayUtils;
                            || element instanceof DBNLocalFolder
 * limitations under the License.

        final List<DBNNode> checkedNodes = new ArrayList<>();
                2);
            int historyIndex = 0;
                Integer.MAX_VALUE);
import org.jkiss.dbeaver.ui.search.internal.UISearchMessages;
        params.searchForeignObjects = store.getBoolean(PROP_SEARCH_FOREIGN);

                    showConnected = showConnectedCheck.getSelection();
        optionsGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
            Control infoLabel = UIUtils.createInfoLabel(

        searchGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
                        }
            gridData.horizontalSpan = 2;
    }
                    if (element instanceof DBNNode) {
    }

                break;

        if (!checkedNodes.isEmpty()) {
                    monitor.done();
            Composite databasesGroup = UIUtils.createTitledComposite(
                GridData.FILL_HORIZONTAL);
                UISearchMessages.dialog_data_search_spinner_max_results_tip, params.maxResults,
        }
                        }
        params.searchLOBs = store.getBoolean(PROP_SEARCH_LOBS);
            params.searchString = searchText.getText();
        return loadTreeState(
            // Ignore
                            result.addAll(containers);

                UISearchMessages.dialog_search_objects_case_sensitive,
    }


        return SearchDataQuery.createQuery(params);
        saveTreeState(store);
    private static final String PROP_MASK = "search.data.mask"; //$NON-NLS-1$
import java.util.LinkedHashSet;
    }
            });
 *


import java.lang.reflect.InvocationTargetException;
            });
                | GridData.VERTICAL_ALIGN_BEGINNING));
                optionsGroup2,
        return result;
import org.eclipse.jface.viewers.*;
        super.createControl(parent);
import org.jkiss.dbeaver.model.app.DBPProject;
import org.jkiss.dbeaver.model.app.DBPPlatform;
                @Override
                optionsGroup,
public class SearchDataPage extends AbstractSearchPage {

            if (element instanceof DBNNode) {
                        if (element instanceof DBSWrapper) {
            if (CommonUtils.isEmpty(history)) {
            treeViewer.addDoubleClickListener(event -> {
import org.jkiss.dbeaver.ui.UIUtils;
                }
                        }
    public void saveState(@NotNull DBPPreferenceStore store) {
            }
import org.eclipse.swt.SWT;
            searchText.add(history);
            updateEnablement();
            navigatorTree.getViewer().setSelection(new StructuredSelection(params.selectedNodes));
                optionsGroup2,
        searchText.addModifyListener(e -> {
        List<DBSDataContainer> result = new ArrayList<>();
    }
            gd.heightHint = 300;
    private static final String PROP_SEARCH_NUMBERS = "search.data.search-numbers"; //$NON-NLS-1$
    private final Set<String> searchHistory = new LinkedHashSet<>();
        searchText = new Combo(searchGroup, SWT.DROP_DOWN);
                    if (element instanceof TreeNodeSpecial) {

                UISearchMessages.dialog_data_search_checkbox_fast_search,
    private static final String PROP_SEARCH_LOBS = "search.data.search-lobs"; //$NON-NLS-1$
                }
                UISearchMessages.dialog_data_search_checkbox_case_sensitive_tip, params.caseSensitive,
            maxResultsSpinner.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
            final Button caseCheckbox = UIUtils.createCheckbox(
            treeViewer.addFilter(new ViewerFilter() {

        store.setValue(PROP_FAST_SEARCH, params.fastSearch);
                    params.fastSearch = fastSearchCheckbox.getSelection();
import org.jkiss.dbeaver.ui.navigator.database.load.TreeNodeSpecial;
    public void loadState(DBPPreferenceStore store) {
                UISearchMessages.dialog_data_search_spinner_max_results,
    private static final String PROP_SEARCH_FOREIGN = "search.data.search-foreign"; //$NON-NLS-1$
                }


                    params.searchNumbers = searchNumbersCheckbox.getSelection();
            DBNDataSource node = DBNDataSource.getDataSourceNode(checkedNodes.getFirst());
                try {
                }
        } catch (InterruptedException e) {
                                && !((DBSDataContainer) object).isFeatureSupported(DBSDataContainer.FEATURE_DATA_SEARCH)) {
            showConnectedCheck.setSelection(showConnected);
        return false;
            if (node instanceof DBNDatabaseNode) {
        super("Database objects search");
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTree;
                            Class<? extends DBSObject> folderItemsClass = folder.getChildrenClass();

                UISearchMessages.dialog_data_search_checkbox_search_in_foreign_objects_tip,
                public void widgetSelected(SelectionEvent e) {
        }
                navigatorTree.getViewer().reveal(node);
                            }
            // Search history
        for (Object element : getCheckedElements()) {
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
        }
                @Override
        params.maxResults = store.getInt(PROP_SAMPLE_ROWS);
        searchGroup.setLayout(new GridLayout(1, false));

        store.setValue(PROP_SEARCH_LOBS, params.searchLOBs);
                UISearchMessages.dialog_data_search_control_group_databases,
        store.setValue(PROP_MASK, params.searchString);
                UISearchMessages.dialog_data_search_checkbox_search_in_numbers,
                        }

                    }
import org.jkiss.dbeaver.model.struct.*;
                    params.searchForeignObjects = searchForeignCheckbox.getSelection();
 *     http://www.apache.org/licenses/LICENSE-2.0

                historyIndex++;
 * DBeaver - Universal Database Manager
        if (ArrayUtils.isEmpty(objects)) {
            });
                    if (!sourcesString.isEmpty()) {
            searchLOBCheckbox.addSelectionListener(new SelectionAdapter() {

            if (node != null) {
            }
                            return false;
            maxResultsSpinner.addModifyListener(e -> params.maxResults = maxResultsSpinner.getSelection());
                    if (node instanceof TreeNodeSpecial) {
    private Combo searchText;
                if (historyIndex >= 20) {
                }
                monitor.beginTask("Load database nodes", 1);
        if (!searchHistory.contains(params.searchString)) {
                @Override
        SashForm optionsGroup = new SashForm(searchGroup, SWT.NONE);
        Object[] elements = getCheckedElements();
        if (!params.selectedNodes.isEmpty()) {
                            if (object instanceof DBSDataContainer && object instanceof DBSEntity
                    checkedNodes.addAll(
                        if (!CommonUtils.isEmpty(containers)) {
    private final DBPProject currentProject;
        store.setValue(PROP_SEARCH_NUMBERS, params.searchNumbers);
            }
            String history = store.getString(PROP_HISTORY + "." + i); //$NON-NLS-1$

            final Button fastSearchCheckbox = UIUtils.createCheckbox(
import org.eclipse.swt.events.SelectionEvent;
                1,
import org.eclipse.swt.widgets.*;
            for (Object node : elements) {
                2);
                    params.caseSensitive = caseCheckbox.getSelection();

            searchNumbersCheckbox.addSelectionListener(new SelectionAdapter() {
                1,
        initializeDialogUnits(parent);
            searchText.add(params.searchString);

import org.jkiss.dbeaver.model.runtime.DefaultProgressMonitor;
        showConnected = DBWorkbench.getPlatform().getPreferenceStore().getBoolean(PROP_SHOW_CONNECTED);
                        List<DBSDataContainer> containers = DBUtils.getAllDataContainersFromParentContainer(monitor, object);
 *
            infoLabel.setLayoutData(gridData);
        {
        UIUtils.addEmptyTextHint(searchText, combo -> UISearchMessages.dialog_data_search_hint_text_string_to_search);
        }

            updateEnablement();
                    }

import org.jkiss.utils.CommonUtils;
import java.util.ArrayList;
            });
    public SearchDataPage() {
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;


                @Override
                public void widgetSelected(SelectionEvent e) {
            TreeViewer treeViewer = navigatorTree.getViewer();
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                            DBSObject object = ((DBSWrapper) element).getObject();
            fastSearchCheckbox.addSelectionListener(new SelectionAdapter() {

        RuntimeUtils.runTask(monitor -> {
        params.searchNumbers = store.getString(PROP_SEARCH_NUMBERS) == null || store.getBoolean(PROP_SEARCH_NUMBERS);
                    try {
import org.eclipse.swt.events.SelectionAdapter;

    private static final String PROP_FAST_SEARCH = "search.data.fast-search"; //$NON-NLS-1$
                        if (element instanceof DBNDatabaseFolder folder) {
        if (selection instanceof IStructuredSelection) {
                @Override
                if (object instanceof DBSDataContainer || object instanceof DBSObjectContainer) {
                optionsGroup2,
                @Override
    private void restoreCheckedNodes() {
        params.caseSensitive = store.getBoolean(PROP_CASE_SENSITIVE);
        navigatorTree.setEnabled(true);
}
    private static final String PROP_SAMPLE_ROWS = "search.data.sample-rows"; //$NON-NLS-1$
    private void saveTreeState(@NotNull DBPPreferenceStore store) {
                            element instanceof DBNLocalFolder lf && !lf.hasConnected()) {
    public void createControl(Composite parent) {

    private boolean showConnected;
                2);

        setControl(searchGroup);
            });
            final Button searchForeignCheckbox = UIUtils.createCheckbox(
                    sourcesString.append(((DBNDatabaseNode) node).getNodeUri());
                                    || DBSEntity.class.isAssignableFrom(folderItemsClass));

                @Override
                        if (element instanceof DBNProjectDatabases
                        }
        }
            showConnectedCheck.setText(UINavigatorMessages.label_show_connected);
                public void widgetSelected(SelectionEvent e) {

    private Object[] getCheckedElements() {

                    } catch (DBException e) {
                | GridData.HORIZONTAL_ALIGN_BEGINNING
            DBWorkbench.getPlatform().getPreferenceStore().getString(PROP_SOURCES));
            if (params.maxResults <= 0) {
            databasesGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
                params.searchForeignObjects,
                        sourcesString.append("|"); //$NON-NLS-1$
        }
    }
                                || (object instanceof DBSDataContainer && object instanceof DBSEntity);
        currentProject = NavigatorUtils.getSelectedProject();
            final DBNProject projectNode = platform.getNavigatorModel().getRoot().getProjectNode(currentProject);

    private final SearchDataParams params = new SearchDataParams();
        // Object sources
                                || object instanceof DBSObjectContainer
                    }
        try {
        params.fastSearch = store.getBoolean(PROP_FAST_SEARCH);
                    monitor.subTask("Load tree state");
                }
                params.maxResults = 10;
    private static final String PROP_CASE_SENSITIVE = "search.data.case-sensitive"; //$NON-NLS-1$
import org.jkiss.dbeaver.runtime.DBWorkbench;
                    params.selectedNodes.add((DBNNode) selItem);
                    params.searchLOBs = searchNumbersCheckbox.getSelection();
package org.jkiss.dbeaver.ui.search.data;
    private static final String PROP_HISTORY = "search.data.history"; //$NON-NLS-1$
        }
        ISelection selection = container.getSelection();
 * See the License for the specific language governing permissions and
                        ((TreeNodeSpecial) node).handleDefaultAction(navigatorTree);

        }, "Loading all objects for search", 5000);
                }

            }
        {
            final Button showConnectedCheck = new Button(databasesGroup, SWT.CHECK);
                            return true;
                    if (showConnected) {
            });
        {
                if (selItem instanceof DBNNode) {
        StringBuilder sourcesString = new StringBuilder();
                }
                    }
                }

                optionsGroup2,
    private List<DBNNode> loadTreeState(DBRProgressMonitor monitor) {
    }
            }
                }
            final Button searchLOBCheckbox = UIUtils.createCheckbox(
                optionsGroup2,

 *
                if (node instanceof DBNDatabaseNode) {
    }
                for (Object node : selection.toArray()) {
                GridData.FILL_BOTH);
        for (int i = 0; ; i++) {
import java.util.List;
            });
        }
                return true;
    }
        } catch (InvocationTargetException e) {
        params.selectedNodes.clear();
            DBWorkbench.getPlatformUI().showError("Data sources load", "Error loading settings", e.getTargetException());
            showConnectedCheck.addSelectionListener(new SelectionAdapter() {
            searchText.setText(params.searchString);
                2,
        }
            for (Object selItem : ((IStructuredSelection) selection).toArray()) {
        }

            treeViewer.addSelectionChangedListener(event -> updateEnablement());
/*
        store.setValue(PROP_SOURCES, sourcesString.toString());
                    break;
import org.eclipse.swt.custom.SashForm;

            }
                optionsGroup,

import org.eclipse.swt.layout.GridData;
                UISearchMessages.dialog_data_search_checkbox_search_in_numbers_tip, params.searchNumbers,
        container.setPerformActionEnabled(hasCheckedNodes());
import org.jkiss.dbeaver.model.navigator.*;
            NavigatorUtils.getSelectedProject(),
        for (String history : searchHistory) {
        if (params.searchString != null) {
 * Unless required by applicable law or agreed to in writing, software
            navigatorTree.getViewer().setSelection(new StructuredSelection(checkedNodes));
        Object[] objects = ((IStructuredSelection) navigatorTree.getViewer().getSelection()).toArray();
                }
            searchHistory.add(history);
import org.jkiss.dbeaver.ui.search.AbstractSearchPage;
            DBPPlatform platform = DBWorkbench.getPlatform();
    @Override
                IStructuredSelection selection = (IStructuredSelection) treeViewer.getSelection();
        for (Object node : nodes) {
                    }

        Object[] nodes = getCheckedElements();
                UISearchMessages.dialog_data_search_checkbox_search_in_foreign_objects,
            final Button searchNumbersCheckbox = UIUtils.createCheckbox(
 * you may not use this file except in compliance with the License.
                            return folderItemsClass != null
                    DBWorkbench.getPlatform().getPreferenceStore().setValue(PROP_SHOW_CONNECTED, showConnected);
            optionsGroup2.setLayoutData(new GridData(GridData.FILL_HORIZONTAL
import org.eclipse.swt.layout.GridLayout;
        // Save search query
                    }

            }
            searchForeignCheckbox.addSelectionListener(new SelectionAdapter() {

    }
                2);
                UISearchMessages.dialog_data_search_info_label_use_ctrl,
    protected void updateEnablement() {

                optionsGroup2,
                UISearchMessages.dialog_data_search_checkbox_search_in_lob_tip, params.searchLOBs,
    private boolean hasCheckedNodes() {
                } finally {
    @Override
            });
            return new Object[0];

            GridData gridData = new GridData(SWT.FILL, SWT.END, true, true);
                            || element instanceof DBNDataSource) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        params.searchString = store.getString(PROP_MASK);
                            return object instanceof DBSInstance
