            treeViewer.addFilter(new ViewerFilter() {
                        caseSensitive = caseCheckbox.getSelection();
    private DBPDataSource getSelectedDataSource()
    private int matchTypeIndex;
            searchInCommentsCheckbox.setSelection(false);

                }
                }

            }
            int historyIndex = 0;


            if (node != null) {
                    if (element instanceof DBNNode) {
    public void saveState(DBPPreferenceStore store)
                    if (node instanceof TreeNodeSpecial) {
                optionsGroup,

import org.jkiss.dbeaver.model.app.DBPProject;
            searchText.setText(nameMask);
                        return true;
import org.jkiss.dbeaver.ui.search.internal.UISearchMessages;
                });
        params.setCaseSensitive(caseSensitive);
            }
                searchInDefinitionsCheckbox.setEnabled(false);
            });
                item.setText(objectType.getTypeName());
                    }
                sourcesString.append("|"); //$NON-NLS-1$
            searchText.add(history);
        return null;
                searchInDefinitionsCheckbox = UIUtils.createCheckbox(
            for (DBSObjectType objectType : assistant.getSupportedObjectTypes()) {
                                            });
import org.jkiss.dbeaver.model.runtime.DefaultProgressMonitor;

        }
            }
                return object.getDataSource();

        }
                    searchInDefinitions,
                } finally {
    }
                    @Override
        }
        }
            searchHistory.add(objectNameMask);
public class SearchMetadataPage extends AbstractSearchPage {
import org.eclipse.swt.events.SelectionAdapter;
        setControl(searchGroup);
            }
import org.jkiss.dbeaver.ui.UIUtils;
        DBNNode node = getSelectedNode();
                }
    private final Set<String> searchHistory = new LinkedHashSet<>();

                //new Label(searchGroup, SWT.NONE);
 * You may obtain a copy of the License at

        } catch (InterruptedException e) {
    }
                        }
                StringTokenizer st = new StringTokenizer(type, "|"); //$NON-NLS-1$
            UIUtils.createTableColumn(typesTable, SWT.LEFT, UISearchMessages.dialog_search_objects_column_description);
        }
    private boolean searchInDefinitions;
        {
                    monitor.done();
    }
                if (matchTypeIndex >= 0) {
    @Override

        if (node instanceof DBSWrapper) {
            otLabel.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
            typesTable.addMouseListener(new MouseAdapter() {
        searchText = new Combo(searchGroup, SWT.DROP_DOWN);

            String history = store.getString(PROP_HISTORY + "." + i); //$NON-NLS-1$
}
                        }
    }
    }
        super("Database objects search");
    protected void updateEnablement()
                Button caseCheckbox = UIUtils.createCheckbox(settingsGroup, UISearchMessages.dialog_search_objects_case_sensitive, null, caseSensitive, 2);
        params.setLikeCondition(matchTypeIndex == SearchMetadataConstants.MATCH_INDEX_LIKE);
        searchInDefinitionsCheckbox.setEnabled(enableSearchInDefinitionsCheckbox);
            }
        }
        DBSStructureAssistant.ObjectsSearchParams params = new DBSStructureAssistant.ObjectsSearchParams(
import org.jkiss.dbeaver.DBException;
import org.eclipse.swt.widgets.*;
            DBNDataSource node = DBNDataSource.getDataSourceNode(sourceNodes.getFirst());
                if (historyIndex >= 20) {
                    public void widgetSelected(SelectionEvent e)
                    if (selection.length > 0) {

import org.eclipse.swt.layout.GridLayout;
                    public void widgetSelected(SelectionEvent e)
    private boolean showConnected;
            );
                GridData.FILL_BOTH);
    private static final String PROP_MASK = "search.metadata.mask"; //$NON-NLS-1$
        }
        searchInCommentsCheckbox.setEnabled(enableSearchInCommentsCheckbox);
    private final DBPProject currentProject;
            if (!sourcesString.isEmpty()) {

            // ignore
        }
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTree;
                item.setData(objectType);
        if (getSelectedDataSource() != null) {

            }
        for (TableItem item : typesTable.getItems()) {
        params.setGlobalSearch(true);
    private boolean caseSensitive;
                    showConnected = showConnectedCheck.getSelection();
                TableItem item = new TableItem(typesTable, SWT.NONE);
                        DBWorkbench.getPlatform().getPreferenceStore().getString(PROP_SOURCES));
import org.eclipse.jface.viewers.*;
    {
        {
    {

                                try {
                            }
            }
    public SearchMetadataPage() {

                matchCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                    break;
    }
    private static final String PROP_SOURCES = "search.metadata.object-source"; //$NON-NLS-1$

                    Object object = structSel.isEmpty() ? null : structSel.getFirstElement();
        initializeDialogUnits(parent);
                objectNameMask = objectNameMask + "%"; //$NON-NLS-1$
import org.eclipse.swt.events.MouseEvent;
                if (maxResults <= 0) {
        currentProject = NavigatorUtils.getSelectedProject();
            final Object firstElement = selection.getFirstElement();

        searchText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        params.setParentObject(parentObject);
            showConnectedCheck.addSelectionListener(new SelectionAdapter() {
                    }
                UISearchMessages.dialog_search_objects_group_objects_source,
    @Override
import org.eclipse.swt.events.MouseAdapter;
    @Nullable
            }
                                }
            if (CommonUtils.isEmpty(history)) {
                    matchCombo.select(matchTypeIndex);
            final Button showConnectedCheck = new Button(sourceGroup, SWT.CHECK);
            DBNNode rootNode = projectNode == null ? platform.getNavigatorModel().getRoot() : projectNode.getDatabases();
                    savedTypeNames.add(st.nextToken());
        } else {
                    DBWorkbench.getPlatform().getPreferenceStore().setValue(PROP_SHOW_CONNECTED, showConnected);
                        } else {
            typesTable.setLayoutData(new GridData(GridData.FILL_BOTH));

        for (Object obj : nodes) {
            DBNNode node = (DBNNode) obj;
        for (DBSObjectType objectType: checkedTypes) {
                public void widgetSelected(SelectionEvent e)
        {
                    }
                                            UIUtils.asyncExec(() -> {
                1,
            );
                    null,
                    }
        showConnected = DBWorkbench.getPlatform().getPreferenceStore().getBoolean(PROP_SHOW_CONNECTED);
            throw new IllegalStateException("No active datasource");

        store.setValue(PROP_CASE_SENSITIVE, caseSensitive);
                    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 *
    private static final String PROP_HISTORY = "search.metadata.history"; //$NON-NLS-1$
                    item.setText(1, objectType.getDescription());
                final Spinner maxResultsSpinner = UIUtils.createLabelSpinner(settingsGroup, UISearchMessages.dialog_search_objects_spinner_max_results, maxResults, 1, 10000);
            store.setValue(PROP_OBJECT_TYPE, typesString.toString());
            dataSourceTree.getViewer().setSelection(
        if (nameMask != null) {
            Label otLabel = UIUtils.createControlLabel(settingsGroup, UISearchMessages.dialog_search_objects_group_object_types);
        for (DBNNode node = getSelectedNode(); node != null; node = node.getParentNode()) {

            for (DBSObjectType type : checkedTypes) {
import org.jkiss.utils.CommonUtils;
    private final Set<DBSObjectType> checkedTypes = new HashSet<>();
        } catch (InvocationTargetException e) {
        updateEnablement();
                    item.setChecked(true);
                break;
        Object[] nodes = ((IStructuredSelection)tree.getViewer().getSelection()).toArray();
            TreeViewer treeViewer = dataSourceTree.getViewer();
                matchCombo.add(UISearchMessages.dialog_search_objects_combo_like, SearchMetadataConstants.MATCH_INDEX_LIKE);
                        searchInComments = searchInCommentsCheckbox.getSelection();
            if (node instanceof DBSWrapper) {
        store.setValue(PROP_MAX_RESULT, maxResults);
    public void createControl(Composite parent) {
    private Combo searchText;
            }
import org.eclipse.swt.layout.GridData;
                }
    private DatabaseNavigatorTree dataSourceTree;
                break;

                            if (node instanceof DBNDataSource dsNode && CONNECT_ON_CLICK) {
    {

                enableSearchInCommentsCheckbox = true;
                                    log.error(e);
        }
        }

                objectTypes.add((DBSObjectType) item.getData());
                                                    fillObjectTypes();
                }
            typesTable = new Table(settingsGroup, SWT.CHECK | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION);
    private Button searchInCommentsCheckbox;
                        if (element instanceof DBNDataSource ds && ds.getDataSource() == null ||
        }
                historyIndex++;
    {
                            element instanceof DBNDataSource ||
                                    });
            });
        if (assistant == null) {
        if (!enableSearchInDefinitionsCheckbox) {
                }
                    break;
                    }
        }
                matchCombo.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        try {
            searchHistory.add(history);
                    parentObject = object;
import org.jkiss.dbeaver.model.DBUtils;
            treeViewer.addDoubleClickListener(event -> {
        }
                            Class<? extends DBSObject> folderItemsClass = folder.getChildrenClass();
        searchInDefinitions = store.getBoolean(PROP_SEARCH_IN_DEFINITIONS);
                        ((TreeNodeSpecial) node).handleDefaultAction(dataSourceTree);
                                    dsNode.initializeNode(null, status -> {
        searchGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
            UIUtils.createTableColumn(typesTable, SWT.LEFT, UISearchMessages.dialog_search_objects_column_type);

                while (st.hasMoreTokens()) {
                searchInCommentsCheckbox = UIUtils.createCheckbox(settingsGroup, UISearchMessages.dialog_search_objects_search_in_comments, null, searchInComments, 2);
            // No structure assistant - no object types
            if (!objectNameMask.endsWith("%")) { //$NON-NLS-1$
            // Object types
    private void updateSearchOptionsCheckboxes() {
    private static final String PROP_SEARCH_IN_DEFINITIONS = "search.metadata.search-in-definitions"; //$NON-NLS-1$
                    TableItem[] selection = typesTable.getSelection();
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
            String type = store.getString(PROP_OBJECT_TYPE);
                public void widgetSelected(SelectionEvent e) {
        }
                    updateEnablement();

                try {
        UIUtils.addEmptyTextHint(searchText, combo -> UISearchMessages.dialog_search_objects_label_object_name);
                });
            if (object != null && object.getDataSource() != null) {
    {
                IStructuredSelection selection = (IStructuredSelection) treeViewer.getSelection();
                event -> {
            }
    private String nameMask;
                    }
    {
 * Unless required by applicable law or agreed to in writing, software
    private static final String PROP_SHOW_CONNECTED = "search.metadata.show-connected-only"; //$NON-NLS-1$

        typesTable.removeAll();
            DBSObject object = ((DBSWrapper)node).getObject();
    private List<DBNNode> sourceNodes = new ArrayList<>();
    private static final String PROP_OBJECT_TYPE = "search.metadata.object-type"; //$NON-NLS-1$
            if (!objectNameMask.endsWith("%")) { //$NON-NLS-1$
        for (String history : searchHistory) {
        DBSStructureAssistant structureAssistant = getSelectedStructureAssistant();
        DBPDataSource dataSource = getSelectedDataSource();
            enabled = false;
                maxResultsSpinner.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

                        DBSObjectType objectType = (DBSObjectType) item.getData();
 * DBeaver - Universal Database Manager
        store.setValue(propName, sourcesString.toString());
                    savedTypeNames.remove(objectType.getTypeName());
            // Search history
                                    // shouldn't be here
                    @Override
                    @Override

        boolean enableSearchInCommentsCheckbox = false;
                }
                maxResultsSpinner.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
        searchText.addModifyListener(e -> {
                if (checkedTypes.contains(objectType)) {
                if (!typesString.isEmpty()) {
        if (!searchHistory.contains(objectNameMask)) {
                searchInDefinitionsCheckbox.addSelectionListener(new SelectionAdapter() {
                enableSearchInDefinitionsCheckbox = true;
                }
            DBPPlatform platform = DBWorkbench.getPlatform();
        }
                    if (element instanceof TreeNodeSpecial) {
                }
import org.jkiss.dbeaver.model.DBPDataSource;
        return new SearchMetadataQuery(dataSource, assistant, params);
                monitor.beginTask("Load database nodes", 1);
            DBWorkbench.getPlatformUI().showError("Data sources load", "Error loading settings", e.getTargetException());
            if (enableSearchInCommentsCheckbox && enableSearchInDefinitionsCheckbox) {

            for (String history : searchHistory) {
        params.setSearchInDefinitions(searchInDefinitions);
                objectNameMask = "%" + objectNameMask; //$NON-NLS-1$
    }
                        if (element instanceof DBNDatabaseFolder folder) {
            {
        if (!selection.isEmpty()) {
                    }
            nameMask = searchText.getText();
import org.jkiss.dbeaver.model.app.DBPPlatform;
        store.setValue(PROP_MATCH_INDEX, matchTypeIndex);
        if (!enableSearchInCommentsCheckbox) {

    }
                @Override
                    //checkedTypes.clear();
import org.jkiss.dbeaver.ui.navigator.database.load.TreeNodeSpecial;
        }
            }
                }
        if (dataSource == null || assistant == null) {
            showConnectedCheck.setText(UINavigatorMessages.label_show_connected);
                            return false;
                    }
        DBSStructureAssistant<?> assistant = getSelectedStructureAssistant();
                            (element instanceof DBSWrapper && ((DBSWrapper)element).getObject() instanceof DBSObjectContainer))
                        new DefaultProgressMonitor(monitor),
        java.util.List<DBSObjectType> objectTypes = new ArrayList<>();
            });
                optionsGroup,
            });
    private static final String PROP_SEARCH_IN_COMMENTS = "search.metadata.search-in-comments"; //$NON-NLS-1$
            Composite settingsGroup = UIUtils.createTitledComposite(
    private DBSStructureAssistant<?> getSelectedStructureAssistant()
        matchTypeIndex = store.getInt(PROP_MATCH_INDEX);
                    {
                                        if (status.isOK()) {
                UISearchMessages.dialog_search_objects_group_settings,
        searchGroup.setLayout(new GridLayout(1, false));
        }
            }
                }
            column.pack();
        return null;
        {
            if (!CommonUtils.isEmpty(type)) {
                    sourceNodes = loadTreeState(
                maxResultsSpinner.addModifyListener(e -> maxResults = maxResultsSpinner.getSelection());
                        }
                }
                    checkedTypes.add(objectType);
    private int maxResults;
    private static final String PROP_MAX_RESULT = "search.metadata.max-results"; //$NON-NLS-1$
    }
            });
        UIUtils.asyncExec(this::loadState);
    {
        store.setValue(PROP_MASK, nameMask);
                        currentProject,
        boolean enabled = false;
                    @Override
        }
        params.setSearchInComments(searchInComments);

            dataSourceTree.setLayoutData(gd);
                                        }
            });
                @Override

        );
/*
                if (object instanceof DBSStructContainer) {
            searchInComments = false;
                                break;
            }
        nameMask = store.getString(PROP_MASK);
    {
import java.lang.reflect.InvocationTargetException;
    private void loadState() {
                    if (showConnected) {
            if (!enableSearchInDefinitionsCheckbox && structureAssistant.supportsSearchInDefinitionsFor(objectType)) {
                        if (element instanceof DBNLocalFolder ||
                        }
                @Override
                    item.setChecked(true);

        params.setMaxResults(maxResults);
            final DBNProject projectNode = platform.getNavigatorModel().getRoot().getProjectNode(currentProject);
            searchText.add(objectNameMask);
            StringBuilder typesString = new StringBuilder();
                            return folderItemsClass != null && DBSObjectContainer.class.isAssignableFrom(folderItemsClass);
import org.eclipse.swt.custom.SashForm;
                DBSObject object = ((DBSWrapper) node).getObject();
                if (!CommonUtils.isEmpty(objectType.getDescription())) {
import org.jkiss.dbeaver.model.navigator.*;

                if (objectType.getImage() != null) {
                    monitor.subTask("Load tree state");
        }
                matchCombo.add(UISearchMessages.dialog_search_objects_combo_contains, SearchMetadataConstants.MATCH_INDEX_CONTAINS);

 * See the License for the specific language governing permissions and
        Composite optionsGroup = new SashForm(searchGroup, SWT.HORIZONTAL);
    }
                }
                new StructuredSelection(sourceNodes));
                                                if (!dataSourceTree.isDisposed()) {
    }
        }
import org.jkiss.dbeaver.ui.DBeaverIcons;
        if (matchTypeIndex == SearchMetadataConstants.MATCH_INDEX_STARTS_WITH) {
            searchInDefinitionsCheckbox.setSelection(false);
        }
                {
                    treeViewer.refresh();
    private static final boolean CONNECT_ON_CLICK = true;

    private final Set<String> savedTypeNames = new HashSet<>();
                final Combo matchCombo = new Combo(settingsGroup, SWT.DROP_DOWN | SWT.READ_ONLY);
                    IStructuredSelection structSel = (IStructuredSelection) event.getSelection();
            sourcesString.append(node.getNodeItemPath());

        super.createControl(parent);
 * you may not use this file except in compliance with the License.
        if (CommonUtils.isEmpty(nameMask)) {
import org.jkiss.code.Nullable;
import org.eclipse.swt.SWT;
                public void mouseDoubleClick(MouseEvent e) {
        updateEnablement();
                @Override
                matchCombo.addSelectionListener(new SelectionAdapter() {
                        }
                    public void widgetSelected(SelectionEvent e) {
            if (firstElement instanceof DBNNode) {
                        if (item.getChecked()) {
                {
import org.jkiss.dbeaver.model.struct.*;
 *
package org.jkiss.dbeaver.ui.search.metadata;
                store.setValue(PROP_HISTORY + "." + historyIndex, history); //$NON-NLS-1$
                            return true;
                GridData.FILL_BOTH
                dataSourceTree.getViewer().reveal(node);
        saveTreeState(store, PROP_SOURCES, dataSourceTree);
                    }
                        {
                    {
                }
        DBSStructureAssistant<?> assistant = getSelectedStructureAssistant();
            if (!enableSearchInCommentsCheckbox && structureAssistant.supportsSearchInCommentsFor(objectType)) {
            }
    private boolean searchInComments;
        }
 * Copyright (C) 2010-2026 DBeaver Corp and others
                            checkedTypes.add(objectType);
    public void loadState(DBPPreferenceStore store)
                    }
            gd.heightHint = 300;
import org.eclipse.swt.events.SelectionEvent;

        DBSObject parentObject = null;
                            element instanceof DBNProjectDatabases ||
                    settingsGroup,
    public SearchMetadataQuery createQuery() {

            GridData gd = new GridData(GridData.FILL_BOTH);
            treeViewer.addSelectionChangedListener(
                            element instanceof DBNLocalFolder lf && !lf.hasConnected()) {
                } else if (savedTypeNames.contains(objectType.getTypeName())) {
                });
                    updateEnablement();
                    return false;
    private Table typesTable;
                    public void widgetSelected(SelectionEvent e) {
    @Override
        caseSensitive = store.getBoolean(PROP_CASE_SENSITIVE);
                }
        {

                        searchInDefinitions = searchInDefinitionsCheckbox.getSelection();
        for (int i = 0; ;i++) {
                objectTypes.toArray(new DBSObjectType[0]),
        IStructuredSelection selection = (IStructuredSelection) dataSourceTree.getViewer().getSelection();
    private DBNNode getSelectedNode()
        String objectNameMask = nameMask;
                2,
        boolean enableSearchInDefinitionsCheckbox = false;
                return (DBNNode) firstElement;
 *
            container.getRunnableContext().run(true, true, monitor -> {
        optionsGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
    private static final String PROP_MATCH_INDEX = "search.metadata.match-index"; //$NON-NLS-1$
            if (!objectNameMask.startsWith("%")) { //$NON-NLS-1$
            updateSearchOptionsCheckboxes();
    private void fillObjectTypes()
            Composite sourceGroup = UIUtils.createTitledComposite(
        searchInComments = store.getBoolean(PROP_SEARCH_IN_COMMENTS);
                        matchTypeIndex = matchCombo.getSelectionIndex();

                objectNameMask
                public boolean select(Viewer viewer, Object parentElement, Object element)
import org.jkiss.dbeaver.ui.search.AbstractSearchPage;
                        TableItem tableItem = selection[0];
    }
                    fillObjectTypes();
                    2
                }

                matchCombo.add(UISearchMessages.dialog_search_objects_combo_starts_with, SearchMetadataConstants.MATCH_INDEX_STARTS_WITH);
        for (TableColumn column : typesTable.getColumns()) {
                    for (TableItem item : typesTable.getItems()) {
                            checkedTypes.remove(objectType);
                    item.setImage(0, DBeaverIcons.getImage(objectType.getImage()));
                searchInCommentsCheckbox.addSelectionListener(new SelectionAdapter() {
                searchInCommentsCheckbox.setEnabled(false);
    private Button searchInDefinitionsCheckbox;
import java.util.*;
                for (Object node : selection.toArray()) {
                        for (DBNNode node = (DBNNode)object; node != null; node = node.getParentNode()) {
import java.util.List;
            }
                    updateSearchOptionsCheckboxes();
                    if (object instanceof DBNNode) {
                    maxResults = 100;
        container.setPerformActionEnabled(enabled);
                );
        }
                matchCombo.select(0);


    @Override
            showConnectedCheck.setSelection(showConnected);
 *     http://www.apache.org/licenses/LICENSE-2.0
        Composite searchGroup = new Composite(parent, SWT.NONE);
            typesTable.addSelectionListener(new SelectionAdapter() {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;

        }

        store.setValue(PROP_SEARCH_IN_DEFINITIONS, searchInDefinitions);
        // Object sources
    protected static void saveTreeState(DBPPreferenceStore store, String propName, DatabaseNavigatorTree tree)
        StringBuilder sourcesString = new StringBuilder();
                });
 * limitations under the License.
            }
        } else if (matchTypeIndex == SearchMetadataConstants.MATCH_INDEX_CONTAINS) {
            updateEnablement();
import org.jkiss.dbeaver.runtime.DBWorkbench;

            dataSourceTree = new DatabaseNavigatorTree(sourceGroup, rootNode, SWT.SINGLE);
                        tableItem.setChecked(!tableItem.getChecked());
        });
            enabled = !checkedTypes.isEmpty();
            }
                caseCheckbox.addSelectionListener(new SelectionAdapter() {
        store.setValue(PROP_SEARCH_IN_COMMENTS, searchInComments);
            searchInDefinitions = false;
                                } catch (DBException e) {
                                                }
            }
                objectNameMask = objectNameMask + "%"; //$NON-NLS-1$
 */
        maxResults = store.getInt(PROP_MAX_RESULT);
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
                UIUtils.createControlLabel(settingsGroup, UISearchMessages.dialog_search_objects_label_match_type);
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
        // Save search query

                    UISearchMessages.dialog_search_objects_search_in_definitions,
            if (item.getChecked()) {
    private static final String PROP_CASE_SENSITIVE = "search.metadata.case-sensitive"; //$NON-NLS-1$
                    typesString.append("|"); //$NON-NLS-1$
                typesString.append(type.getTypeName());
        return DBUtils.getAdapter(DBSStructureAssistant.class, getSelectedDataSource());
        if (!sourceNodes.isEmpty()) {
