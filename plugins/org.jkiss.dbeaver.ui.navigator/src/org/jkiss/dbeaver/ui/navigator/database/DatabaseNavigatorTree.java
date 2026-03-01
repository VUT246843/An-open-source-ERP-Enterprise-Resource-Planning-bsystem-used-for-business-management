        {
        if (treeFilter != null) {
        if (focusControl == null) {
/*
                curSelection = null;
        private boolean hasPattern = false;
    }
                return false;
    private class TreeSelectionAdapter implements MouseListener {

 * You may obtain a copy of the License at
                            stopNodeLoadingVisualization(event.getNode());
                    canceled = false;
        @Override
                    return false;
        DatabaseNavigatorLabelProvider labelProvider = createLabelProvider(this);
                return rootNode == null ? new TreeSelection() : new TreeSelection(new TreePath(new Object[]{rootNode}));
                        continue;
            if (filterShowConnected && element instanceof DBNDataSource dataSource && !dataSource.getDataSourceContainer().isConnected()) {
    private static final Log log = Log.getLog(DatabaseNavigatorTree.class);
        protected TreeViewer doCreateTreeViewer(Composite parent, int style) {
                IWorkbenchWindow workbenchWindow = UIUtils.findWorkbenchWindow(parent);
                        ((DatabaseNavigatorTree) getParent()).onTreeRefresh();
            filterControl.setText("");
                pattern = "*" + pattern;
                }
            updateFilterMessage();
        }
        synchronized (nodeInLoadingProcess) {
            if (navigatorFilter instanceof DatabaseNavigatorTreeFilter dnf && !dnf.isConnectionsOnly()) {
                    ticksCount++;

                        case REFRESH:


            return DBeaverIcons.getImage(UIIcon.LOADING.get(imgIndex));
                    if (text == null) {
                getTree().setRedraw(false);
                        // the tree
        Control focusControl = display.getFocusControl();
                        getPatternFilter().setPattern(text);
            }
                }
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithResult;
    }

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    }
                            break;

        public void setPattern(String patternString) {
    public void nodeChanged(final DBNEvent event) {
            } else {
                return;

            }

                            updateToolbar(true);
                if (child instanceof DBNLocalFolder lf) {
                        throw new InvocationTargetException(e);

                return Status.OK_STATUS;
                if (rootNode instanceof DatabaseNavigatorContent dnc) {
    static final String TREE_DATA_STAT_MAX_SIZE = "nav.stat.maxSize";
        @Override
            if ((filterShowConnected ||
    }
                    menuService.populateContributionManager(filterManager, FILTER_TOOLBAR_TYPE_CONTRIBUTION_ID);
        checkEnabled = (style & SWT.CHECK) != 0;
 */
                    if (!CommonUtils.isEmpty(newName) && !newName.equals(node.getNodeDisplayName())) {
        void changeSelection(MouseEvent e) {
                super("Rename ");
    private DBNModel model;
                    while (item != null) {

                }
                            }
        public IStatus runInUIThread(IProgressMonitor monitor) {
                getTree().setRedraw(false);
        TreeFilter(INavigatorFilter filter) {
        Text text = new Text(treeViewer.getTree(), SWT.BORDER);
                            } catch (Exception e) {
    private static class TreeBackgroundColorPainter implements Listener {
                }
                return false;
        }
        }
        return treeViewer;
                    } else {
        }

            if (colorBackground != null) {
        }
        private volatile RenameJob renameJob;
                    }
                            if (obj instanceof DBSStructContainer) {

                            treeViewer.refresh(getViewerObject(parentNode));
    }
    private Text filterControl;

        treeEditor.minimumWidth = Math.max(itemBounds.width, 50);
    public Text getFilterControl() {
import org.eclipse.jface.action.Separator;

            synchronized (nodeInLoadingProcess) {
                tree.addListener(SWT.MouseEnter, mouseListener);
        return filterControl;


                } finally {

    void setItemRenderer(INavigatorItemRenderer itemRenderer) {
        return findActiveNode(monitor, node, node);
    private void expandNodeOnLoad(final DBNNode node) {
                gc.drawRoundRectangle(event.x, event.y, event.width, event.height - 1, 3, 3);
                    rootNode = dnc.getRootNode();
                            break;
                        Widget widget = treeViewer.testFindItem(node);
import org.jkiss.dbeaver.ui.*;
            return super.wordMatches(text);
                public IStatus runInUIThread(IProgressMonitor monitor) {
                model.removeListener(DatabaseNavigatorTree.this);
            LinuxKeyboardArrowsListener.installOn(tree);
            return new WorkbenchJob("Refresh Filter") {//$NON-NLS-1$
import org.eclipse.ui.IWorkbenchActionConstants;
            }
        private static final long WAIT_DELAY = 500;
                ISelection selection = super.getSelection();
            }
        }
            treeFilter = (TreeFilter) super.getPatternFilter();
        }

            }
        if (INLINE_RENAME_ENABLED) {
                    this.matcherShort = new TextMatcherExt(patternShort, true, false);
        }
            treeLoadingListener.close();
        Control oldEditor = treeEditor.getEditor();
                    if (!treeViewer.getTree().isDisposed() && treeViewer.getTree().isFocusControl() && curSelection == selection && !canceled) {
        }
        if (item.isDisposed()) {
    public void reloadTree(final DBNNode rootNode) {
        } else {
                            // and the list is currently being filtered
                    patternMatched = wordMatches(labelText);
                (hasPattern && getFilterObjectType() == DatabaseNavigatorTreeFilterObjectType.connection) ||
        }
                    disposeOldEditor();
            return isPatternMatched(labelText, element);

    }


    }
                        // done updating the tree - set redraw back to true
            }
            treeEditor = new TreeEditor(treeControl);
                    treeViewer.getTree().setFocus();
        return treeFilter != null && treeFilter.isActive();
            }
                            UIUtils.getActiveWorkbenchWindow(),
                    if (treeViewer.getControl().isDisposed()) {
            }
        if (checkEnabled) {
                disposeOldEditor();
        return navigatorFilter;

        @Override

                        case LOAD:
import java.util.HashSet;
                        }

            if (text == null) {
                    }
                tree.addListener(SWT.MouseHover, mouseListener);
    protected DatabaseNavigatorContentProvider createContentProvider(boolean showRoot) {
            this.dotPattern = null;
                return doCreateNavigatorTreeViewer(parent, style);

                        redrawFalseControl.setRedraw(true);
            super(
            tree.addListener(SWT.MouseDoubleClick, event -> onItemMouseDown(tree, event, true));
        this.model = DBWorkbench.getPlatform().getNavigatorModel();

    ////////////////////////////////////////////////////////////////////////////
                    treeViewer.expandToLevel(runnable.getResult(), 1, true);


    public boolean isMatchingNeeded(@NotNull Object element) {

    public CheckboxTreeViewer getCheckboxViewer() {
                switch (filterObjectType) {
        public Object[] filter(Viewer viewer, Object parent, Object[] elements) {
                        needToMatch = object instanceof DBSSchema || object instanceof DBSCatalog;

                    patternShort = "*" + patternShort;
    public DatabaseNavigatorTree(Composite parent, DBNNode rootNode, int style, boolean showRoot) {
                if (e.keyCode == SWT.CR) {
                        return matcherShort.match(labelText);
            if (runnable.getResult() != null && !treeViewer.getTree().isDisposed()) {
            nodeInLoadingProcess.remove(node);
            ((GridLayout) getLayout()).verticalSpacing = 0;
        return (DatabaseNavigatorTree) shell.getData(DATA_TREE_CONTROL);
        }

    private DBNNode findActiveNode(@NotNull DBRProgressMonitor monitor, @NotNull DBNNode parent, @NotNull DBNNode node) throws DBException {
import org.eclipse.jface.viewers.*;
    private void stopNodeLoadingVisualization(DBNNode node) {
        public NodeLoadersPainter() {
                    String patternShort = dotPattern[1];
                break;
        @Override
    }
                        dbnProject.getProject().setRuntimeProperty(RuntimeProjectPropertiesConstant.IS_USER_DECLINE_PROJECT_DECRYPTION,
            if ((e.stateMask & SWT.BUTTON1) == 0) {
            this.labelProvider = labelProvider;
            public TreeItem selection;
                        return navigatorFilter.select(element);
            RuntimeUtils.runTask(runnable, "Find active node", 2000);
                                treeViewer.reveal(node);
        // Clean up any previous editor control

        });
                    }
                gc.setForeground(colorBackground);
                try {
    @Override
            }
    private static final boolean INLINE_RENAME_ENABLED = false;
        protected WorkbenchJob doCreateRefreshJob() {

                    getTree().setRedraw(true);
        this(parent, rootNode, style, false);
                filterManager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
    }
import org.eclipse.swt.custom.TreeEditor;
                    this.dotPattern = null;

            if (!checkEnabled) {
                long nextDelay = WAIT_DELAY;
                // May happen in old Eclipse versions
            }
                        patternShort = patternShort + "*";
import org.jkiss.dbeaver.ui.navigator.actions.NavigatorHandlerObjectRename;
            TreeItem item = tree.getItem(new Point(event.x, event.y));
            return Status.OK_STATUS;
            protected void handleTreeCollapse(TreeEvent event) {
                    }
            ArrayList<Object> out = new ArrayList<>(size);

                                }
        }
        }
                    }
    public void setFilterObjectType(@NotNull DatabaseNavigatorTreeFilterObjectType filterObjectType) {
                        } else {
            }
        return content.getRootNode();
        treeViewer.setLabelProvider(labelProvider);
            protected void handleTreeExpand(TreeEvent event) {
    }
    public boolean isFilterActive() {
            @Override
            return null;
 * Licensed under the Apache License, Version 2.0 (the "License");
                activePart == null || !(ActionUtils.isCommandEnabled(IWorkbenchCommandConstants.FILE_RENAME, activePart.getSite()))) {
        return parent;
        final Rectangle treeBounds = treeViewer.getTree().getBounds();
                        treeViewer.refresh(true);
    @NotNull
        @Override
    }
                            treeViewer.collapseToLevel(event.getNode(), -1);
                        if (!text.isEmpty() && !initial) {
                        !(object instanceof DBSSchema) &&
                if (treeViewer != null) {
    }
                        return Status.OK_STATUS;
            disposeOldEditor();
        public synchronized void mouseDoubleClick(MouseEvent e) {
    public DatabaseNavigatorTree(Composite parent, DBNNode rootNode, int style) {
                GC gc = event.gc;
                        final TreeItem itemToRename = selection;

                            treeViewer.update(getViewerObject(event.getNode()), null);
                return matcher.match(text);
        assert this.model != null;
//                                }
        }
                return; /// item not selected

                CustomFilteredTree filteredTree = new CustomFilteredTree(treeStyle) {
                new TreeFilter(DatabaseNavigatorTree.this.navigatorFilter),
                model = null;
            setSystem(true);
            treeLoadingListener = new ProgressPainter(tree);
            if (curSelection != null && curSelection == newSelection && (renameJob == null || renameJob.selection == null)) {
            Tree treeControl = this.treeViewer.getTree();
                // Disable redraw during expand (its blinking)
    @NotNull
    // It is static to share loading nodes between all tree controls
            }
                        if (item instanceof DBNDatabaseFolder df) {
        });
        if (treeLoadingListener != null) {
    }
    }
            }
            UIUtils.addDefaultEditActionsSupport(UIUtils.getActiveWorkbenchWindow(), getFilterControl());
        private Image getCurrentImage() {
                            expandNodeOnLoad(event.getNode());
                }
            if (navigatorFilter != null) {
    public DatabaseNavigatorTreeFilterObjectType getFilterObjectType() {
        treeViewer.setSelection(new StructuredSelection(node));
                    super.handleTreeCollapse(event);
                tree.addListener(SWT.MouseExit, mouseListener);

                }
            if (patternString != null) {
                filterManager.createControl(parent);
                renameJob.canceled = true;
        }
        if (node instanceof DBNDataSource && DBWorkbench.getPlatform().getPreferenceStore().getBoolean(NavigatorPreferences.NAVIGATOR_EXPAND_ON_CONNECT)) {
            if (element instanceof DBNNode node) {
                    for (DBNNode node : nodeInLoadingProcess) {
                @Override
            if (!patternMatched) { // pattern is not matched - so we'll check, maybe format is schema.object
    public boolean isFilterShowConnected() {
        ((DatabaseNavigatorLabelProvider) treeViewer.getLabelProvider()).setLabelDecorator(labelDecorator);
                return;
    private DBNNode findActiveNode(@NotNull DBRProgressMonitor monitor, @NotNull DBNNode node) throws DBException {
                };
                    }
            DBRRunnableWithResult<DBNNode> runnable = new DBRRunnableWithResult<>() {
                        NavigatorHandlerObjectRename.renameNode(
    private class CustomFilteredTree extends FilteredTree {
                    disposeOldEditor();

                if (!patternString.endsWith(" ")) {
 *

            boolean patternMatched = wordMatches(labelText);
 * See the License for the specific language governing permissions and
        public boolean isMatchingNeeded(Object element) {


            treeEditor.minimumWidth = 50;
import org.eclipse.core.runtime.IProgressMonitor;
                }
        this.itemRenderer = itemRenderer;
            // FIXME: this is a weird workaround of paint problems

        treeEditor.minimumHeight = text.computeSize(SWT.DEFAULT, SWT.DEFAULT).y;
                Color oldBackground = gc.getForeground();
                        }
                    pattern = patternString + "*";
                return;
                        } else {
                        Object element = item.getData();


    private class NodeLoadersPainter extends UIJob {
                    public boolean select(Viewer viewer, Object parentElement, Object element) {
            this.hasPattern = !CommonUtils.isEmpty(patternString);
            protected IStatus runInUIThread(@NotNull DBRProgressMonitor monitor) {
            }
            treeFilter.setPattern("");
                    }
                    } catch (DBException e) {
    }
                gc.setForeground(oldBackground);
            }
                    }
//                                    item.setData(TREE_DATA_STAT_MAX_SIZE, null);
                            updateToolbar(false);
        updateFilterMessage();
        }
    private class TreeFilter extends PatternFilter {

    private INavigatorItemRenderer itemRenderer;



    }
        treeEditor.setEditor(text, item, 0);
        treeEditor.minimumWidth = Math.min(treeEditor.minimumWidth, treeBounds.width - (itemBounds.x - treeBounds.x) - item.getImageBounds(0).width - 4);
            Color colorBackground = labelProvider.getBackground(item.getData());
                if (DBNUtils.isDefaultElement(child)) {
        // Create tree
    private static final Set<DBNNode> nodeInLoadingProcess = new HashSet<>();
                                needToMatch = !DBSStructContainer.class.isAssignableFrom(primaryChildType);
                if (!nodeInLoadingProcess.isEmpty()) {
        }
import org.eclipse.ui.menus.IMenuService;
import org.eclipse.swt.layout.GridLayout;
                    if (item != null) {
        super(parent, SWT.NONE);
                    DBSObject obj = item.getObject();
                        UIUtils.asyncExec(() -> renameItem(itemToRename));
        }
        switch (event.getAction()) {
            } else {
                Listener mouseListener = e -> {
    }
                final ToolBarManager filterManager = new ToolBarManager();
            if (!filter.select(element)) {


            parent.getShell().setData(DATA_TREE_CONTROL, DatabaseNavigatorTree.this);
            treeViewer.addFilter(new ViewerFilter() {
import org.jkiss.utils.ArrayUtils;
        } else {
            treeLoadingListener = null;
                        case AFTER_LOAD:
                            break;



                    itemRenderer.performAction(node, tree, event, defaultAction);
            }
                            treeViewer.getControl().getShell(),
                this.matcher = new TextMatcherExt(pattern, true, false);
        this.setItemRenderer(new DefaultNavigatorNodeRenderer());
        private DatabaseNavigatorLabelProvider labelProvider;
                @Override
        private TextMatcherExt matcher;
                }
                }
        }
        if (filterControl != null) {
        private int ticksCount = 0;
            if (!needToMatch && element instanceof DBNDatabaseNode node) {
                    }
        }
                filterControl = filteredTree.getFilterControl();

        });
        Tree tree = treeViewer.getTree();
        treeViewer = doCreateTreeViewer(this, style);

        text.setFocus();
                final IMenuService menuService = workbenchWindow.getService(IMenuService.class);


    }
        synchronized (nodeInLoadingProcess) {
                        if (!parentNode.isDisposed()) {
        if (treeViewer != null) {
                    }
                }
                    if (!patternShort.endsWith(" ")) {
    @Nullable
                            treeViewer.refresh(getViewerObject(event.getNode()));
            return needToMatch;
            RenameJob() {
                if (menuService != null && !CommonUtils.isEmpty(supportedObjectTypes) && supportedObjectTypes.size() > 1) {
            @NotNull
    // Filtered tree
                    if (!supportedObjectTypes.contains(filterObjectType)) {
 * you may not use this file except in compliance with the License.
    public static DatabaseNavigatorTree getFromShell(Shell shell) {

                    if (filterShowConnected && child instanceof DBNDataSource && !((DBNDataSource) child).getDataSourceContainer().isConnected()) {
                // Use only first folder to search

                renameJob.selection = curSelection;
            if (children[0] instanceof DBNContainer) {
    public void setInput(DBNNode rootNode) {
                });
                        }
        this.model.addListener(this);
                    }
    }

                } finally {

            super.createFilterControls(parent);
import org.eclipse.swt.events.*;
                if (renameJob == null) {

    private INavigatorFilter navigatorFilter;

            case REMOVE: {
        if (itemRenderer != null) {
                            newName,
                        !(object instanceof DBSTableColumn);
            if (!isMatchingNeeded(element)) {
        }
                    if (schemaMatched) {
 *
//                                if (item != null) {
    }

        int treeStyle = SWT.H_SCROLL | SWT.V_SCROLL | style;
        new DatabaseNavigatorToolTipSupport(this);

    }
    INavigatorItemRenderer getItemRenderer() {
                    case connection -> needToMatch = (object instanceof DBPDataSourceContainer);
    }
                    return selection;
    }

    public void resetFilter() {
        private final INavigatorFilter filter;
                (hasPattern && filter.filterFolders())) && element instanceof DBNLocalFolder
import org.jkiss.dbeaver.registry.RuntimeProjectPropertiesConstant;
                }
                            Boolean.FALSE.toString());
            setIncludeLeadingWildcard(true);

    private void initEditor() {
    private DatabaseNavigatorTreeFilterObjectType filterObjectType = DatabaseNavigatorTreeFilterObjectType.connection;
                checkboxTreeViewer.addFilter(new ViewerFilter() {
        if (!ArrayUtils.isEmpty(children)) {
                }
package org.jkiss.dbeaver.ui.navigator.database;
            }
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
                    }
        tree.setCursor(getDisplay().getSystemCursor(SWT.CURSOR_ARROW));

        Object input = treeViewer.getInput();
    }
                    }
            curSelection = null;
import org.jkiss.dbeaver.ui.controls.ProgressPainter;
                return false;
            public void focusLost(FocusEvent e) {
        treeViewer.setUseHashlookup(true);
            treeEditor.horizontalAlignment = SWT.LEFT;
                return hasVisibleConnections(viewer, (DBNLocalFolder) element);
            }
        @Override
        }
import org.jkiss.dbeaver.runtime.DBWorkbench;
        }
        TreeBackgroundColorPainter(DatabaseNavigatorLabelProvider labelProvider) {
import org.jkiss.dbeaver.DBException;
                            }
                filterControl = filteredTree.getFilterControl();
            return out.toArray();
                    out.add(element);
    private static final String FILTER_TOOLBAR_CONNECTED_CONTRIBUTION_ID = "toolbar:org.jkiss.dbeaver.navigator.filter.toolbar.connected"; //$NON-NLS-1$
                            break;
                } finally {
 * distributed under the License is distributed on an "AS IS" BASIS,
                        case BEFORE_LOAD:
import org.jkiss.code.Nullable;
*/
            if ((event.detail & SWT.SELECTED) == 0 && (event.detail & SWT.HOT) == 0) {
    @NotNull


                    treeViewer.expandToLevel(runnable.getResult(), 1);
    private boolean checkEnabled;

        }
    public DatabaseNavigatorTree(Composite parent, DBNNode rootNode, int style, boolean showRoot, INavigatorFilter navigatorFilter) {
                        if (widget instanceof TreeItem treeItem) {
import org.eclipse.swt.layout.FillLayout;
                            treeItem.setImage(getCurrentImage());
                        return Status.CANCEL_STATUS;
            }
            filterControl.setMessage(filterObjectType.getDescription());
                }
            }

            if (newSelection == null) {
                    @Override
                    }
                showNode(runnable.getResult());
import org.eclipse.ui.progress.UIJob;

                    labelText = obj == null ? null : obj.getDescription();
        treeViewer.setContentProvider(createContentProvider(showRoot));
import org.jkiss.dbeaver.model.struct.rdb.DBSTableColumn;
                    if (event.item != null && event.item.getData() instanceof DBNProject dbnProject) {
            }
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
    }
                    ticksCount = 0;
                        if (element instanceof DBNNode node) {
                    renameJob = new RenameJob();
            tree.addListener(SWT.MouseDown, event -> onItemMouseDown(tree, event, false));

    protected void onTreeRefresh() {

                return filteredTree.getViewer();
                }
            }
                    }
                // Add rename listener only for non CHECK trees
    public void setLabelDecorator(ILabelDecorator labelDecorator) {
                            treeViewer.refresh(getViewerObject(event.getNode()), true);
            }
        private boolean hasVisibleConnections(Viewer viewer, DBNLocalFolder folder) {
            final TreeItem newSelection = treeViewer.getTree().getItem(new Point(e.x, e.y));
    // Called by filtering job
    }
    private TreeFilter treeFilter;

                } else {
                        return true;

    }
            };
        text.addFocusListener(new FocusAdapter() {
        }

                            treeViewer.refresh(getViewerObject(event.getNode()));
                parent.addDisposeListener(e -> filterManager.dispose());
            if (matcher != null) {
                    } finally {
                return filteredTree.getViewer();
        @Override
            if (item != null) {
    protected DatabaseNavigatorLabelProvider createLabelProvider(DatabaseNavigatorTree tree) {
                } else if (e.keyCode == SWT.ESC) {
                if (dotPattern != null) {
        if (UIUtils.isInDialog(parent)) {
                Object element = item.getData();
import org.eclipse.ui.dialogs.FilteredTree;
            this.filterObjectType = filterObjectType;
            if (labelText == null) {
        private String[] dotPattern;
                    schedule(nextDelay);
                    return navigatorFilter.select(element);
                                treeViewer.setSelection(new StructuredSelection(node));
                if (parentNode != null) {
 *
        protected boolean wordMatches(String text) {
    }
            curSelection = newSelection;
                    try {
                true,
                if (select(viewer, parent, element)) {
            this.filter = filter;
import org.jkiss.dbeaver.ui.navigator.INavigatorFilter;
import org.eclipse.ui.IWorkbenchPart;
import org.jkiss.dbeaver.ui.navigator.NavigatorCommands;
                    try {
            }
            return node;
            changeSelection(e);

                        case UNLOAD:
            }
    private void updateFilterMessage() {
}
        private TextMatcherExt matcherShort;
                final DBNNode parentNode = node.getParentNode();
            };
                                tree.setCursor(cursor);
        this.filterShowConnected = filterShowConnected;
            public ISelection getSelection() {
                            break;
            });
        public boolean isElementVisible(Viewer viewer, Object element) {
                    }
                if (element instanceof DBNNode node) {
                Object rootNode = getInput();
                            break;
                DBSObject object = node.getObject();
                            if (tree.getCursor() != cursor) {
    private void disposeOldEditor() {
                String pattern = patternString;
    private void startNodeLoadingVisualization(DBNNode node) {
import java.util.Set;
            if (children == null) {
        this.navigatorFilter = navigatorFilter;
                        case UNLOCK:
                treeStyle,
    public DatabaseNavigatorTree(Composite parent, DBNNode rootNode, int style, boolean showRoot, INavigatorFilter navigatorFilter, String filterPlaceholderText) {
            int size = elements.length;
                ((GridLayout) parent.getLayout()).numColumns++;

                        ActionUtils.fireCommandRefresh(NavigatorCommands.CMD_FILTER_OBJECT_TYPE);
        return filterShowConnected;
        }
        public void mouseDown(MouseEvent e) {
                    treeViewer.getTree().setFocus();
                public boolean select(Viewer viewer, Object parentElement, Object element) {
            if (navigatorFilter != null) {
    private TreeViewer doCreateNavigatorTreeViewer(Composite parent, int style) {
import org.jkiss.code.NotNull;
//                                Widget item = treeViewer.testFindItem(event.getNode());
    }
                    selection = null;
                }
            tree.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> UIUtils.asyncExec(tree::redraw)));
            int imgIndex = (ticksCount % UIIcon.LOADING.size());
                } else {
                renameJob.schedule(1000);
                    getTree().setRedraw(true);
            public void keyPressed(KeyEvent e) {
            for (Object element : elements) {
            String labelText = ((ILabelProvider) ((ContentViewer) viewer).getLabelProvider()).getText(element);
                } catch (Throwable e) {

            IWorkbenchPart activePart = UIUtils.getActiveWorkbenchWindow().getActivePage().getActivePart();
                            nextDelay = REPAINT_DELAY;
            } catch (Throwable e) {
import java.util.ArrayList;
                if (dotPattern.length == 2) {
import org.eclipse.ui.progress.WorkbenchJob;
        }
import org.jkiss.dbeaver.utils.RuntimeUtils;

        return treeFilter != null && treeFilter.isMatchingNeeded(element);
        return getFromShell(focusControl.getShell());
                        result = findActiveNode(monitor, node);
            }

                        } else if (item instanceof DBNDatabaseItem di) {
        disposeOldEditor();

import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
            }
*/
        this(parent, rootNode, style, showRoot, null, null);
                                log.debug(e);
        this.navigatorFilter = navigatorFilter;
        if (oldEditor != null) oldEditor.dispose();
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.jface.action.ToolBarManager;
    @NotNull
            if (renameJob != null) {

                break;
            @Override
import org.jkiss.dbeaver.model.struct.DBSObject;
                    Object item = null;
                }
            return patternMatched;
            ) {
        final Rectangle itemBounds = item.getBounds(0);
    private static final String DATA_TREE_CONTROL = DatabaseNavigatorTree.class.getSimpleName();

        return filterObjectType;
            } else {
        }

 * Copyright (C) 2010-2026 DBeaver Corp and others
        return new DatabaseNavigatorLabelProvider(tree);
            }
        if (itemRenderer != null && event.button == 1) {


        }
        treeViewer.refresh(true);
        if (rootNode == null) {

                            // and the list is currently not filtered
                final DBNNode node = event.getNode();

    }
                treeViewer.expandToLevel(runnable.getResult(), 1);
                }
            for (DBNNode child : children) {
        return itemRenderer;
        text.selectAll();
                }
                }
    }
            }
                return true;
            {
        treeViewer.setInput(new DatabaseNavigatorContent(rootNode));
    public static DatabaseNavigatorTree getFromShell(Display display) {
            }
                } else if (isLeafMatch(viewer, child)) {
        }
                        }
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            case ADD:
            if (!patternMatched) { // Analyze description too
            return ((DatabaseNavigatorTree) getParent()).doCreateNavigatorTreeViewer(parent, style);
            }
import org.eclipse.swt.SWT;
    public ILabelDecorator getLabelDecorator() {
                            startNodeLoadingVisualization(event.getNode());
                if (workbenchWindow == null) {
    private boolean filterShowConnected = false;
                    }
                treeControl.addMouseListener(new TreeSelectionAdapter());
                    return Status.OK_STATUS;
import org.jkiss.dbeaver.model.navigator.*;
                    Text text = (Text) treeEditor.getEditor();
        private boolean isPatternMatched(String labelText, Object element) {
                return new CheckboxTreeViewer(parent, treeStyle);
import java.lang.reflect.InvocationTargetException;
                if (element instanceof DBNDatabaseItem item) {
                            stopNodeLoadingVisualization(event.getNode());

                    }
            treeEditor.verticalAlignment = SWT.TOP;
    void showNode(DBNNode node) {
    }
        return ((DatabaseNavigatorLabelProvider) treeViewer.getLabelProvider()).getLabelDecorator();
                };
        };
                try {

            @Override
        CustomFilteredTree(int treeStyle) {
        }
        if (filterControl != null) {
                    if (hasVisibleConnections(viewer, lf)) {
                    itemRenderer.paintNodeDetails(node, tree, event.gc, event);
    }
                            item = df.getParentNode();
        DBNNode[] children = node.getChildren(monitor);
    private static final String FILTER_TOOLBAR_TYPE_CONTRIBUTION_ID = "toolbar:org.jkiss.dbeaver.navigator.filter.toolbar.type"; //$NON-NLS-1$
                        !(object instanceof DBNDatabaseFolder) &&
                    menuService.populateContributionManager(filterManager, FILTER_TOOLBAR_CONNECTED_CONTRIBUTION_ID);
        }
                        case LOCK:
                    }
    @NotNull
        if (this.filterObjectType != filterObjectType) {
                    protected TreeViewer doCreateTreeViewer(Composite parent, int style) {
        this.setLayout(new FillLayout());
            super("NavigatorTreeLoadersPainterJob");
            DBNNode[] children = folder.getChildren(new VoidProgressMonitor());
            setInput(rootNode);
        if (input instanceof DatabaseNavigatorContent dnc && dnc.getRootNode() == node) {
                    if (!treeViewer.getControl().isDisposed()) {
        return (CheckboxTreeViewer) treeViewer;
                    return findActiveNode(monitor, node, child);
                        }
        }
        @Override
                        if (needToMatch) {


    public void setFilterShowConnected(boolean filterShowConnected) {
                    String text = getFilterString();




                    }
                    log.debug("Error in node '" + node + "' paint", e);
            return input;
    }
                    final String newName = text.getText();
                            }

        final DBNNode node = (DBNNode) item.getData();
                }

                        getPatternFilter().setPattern(null);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            }
            default:
        addDisposeListener(e -> {
                        case STRUCT_REFRESH:
                            if (event.getNodeChange() == DBNEvent.NodeChange.SELECT) {

            return parent;
            tree.addListener(SWT.PaintItem, event -> onPaintItem(tree, event));
        private volatile TreeItem curSelection;
    @NotNull
            }
            }
        }
/*
    private TreeViewer doCreateTreeViewer(Composite parent, int style) {
                            // enabled toolbar - there is text to clear
                @Override
            }
                }
    }
        private class RenameJob extends AbstractUIJob {
import org.eclipse.core.runtime.IStatus;
        new NodeLoadersPainter().schedule();
    private void onItemMouseDown(Tree tree, Event event, boolean defaultAction) {
            try {
 * limitations under the License.
                    if (initial) {
        protected Composite createFilterControls(Composite parent) {
                } catch (Exception e) {
import org.jkiss.dbeaver.ui.navigator.INavigatorItemRenderer;
                }
                return false;
        @Override
                }
                    boolean schemaMatched = false;
                curSelection = null;

                if (!selection.isEmpty()) {
        }
    }
    private void onPaintItem(Tree tree, Event event) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                    if (element instanceof DBNDatabaseItem di) {
                    workbenchWindow = UIUtils.getActiveWorkbenchWindow();
        public void mouseUp(MouseEvent e) {

                        redrawFalseControl.setRedraw(false);
            TreeItem item = (TreeItem) event.item;
    }
        }
                            // disabled toolbar - there is no text to clear
    public DBNNode getModel() {
                    }
    }

                                String name = obj.getName();
                try {
                    @Override
 * DBeaver - Universal Database Manager

    private final TreeViewer treeViewer;
import org.eclipse.ui.IWorkbenchWindow;
    }
    private void renameItem(final TreeItem item) {
    }
import org.jkiss.dbeaver.ui.navigator.NavigatorPreferences;
                DatabaseNavigatorTree.this,

            if (!(newSelection.getData() instanceof DBNNode) ||

        return new DatabaseNavigatorContentProvider(this, showRoot);


                                    schemaMatched = name.equalsIgnoreCase(dotPattern[0]);
                            treeViewer.collapseToLevel(event.getNode(), -1);
        }
                    final Control redrawFalseControl = treeComposite != null ? treeComposite
                        item = di.getParentNode();
                    TreeItem item = tree.getItem(new Point(e.x, e.y));
            return null;
import org.jkiss.utils.CommonUtils;
            // FIXME: whenever we click on already selected item in the tree paint breaks
        }
    private TreeEditor treeEditor;
                            node,
    private Object getViewerObject(DBNNode node) {
                if (!treeViewer.getTree().isDisposed()) {
                    }
                    return true;
                                Class<? extends DBSObject> primaryChildType = ((DBSStructContainer) object).getPrimaryChildType(null);
    public void setNavigatorFilter(INavigatorFilter navigatorFilter) {
                    renameJob.cancel();
        text.addKeyListener(new KeyAdapter() {
                return findActiveNode(monitor, node, children[0]);
                var supportedObjectTypes = dnf.getSupportedObjectTypes();
    }
                            }

                            break;
            }
                                if (name != null) {
            }
            }
        this(parent, rootNode, style, showRoot, navigatorFilter, null);
                public void run(DBRProgressMonitor monitor) throws InvocationTargetException {

    public INavigatorFilter getNavigatorFilter() {
        text.setText(node.getNodeDisplayName());
/*
                    // Find the deepest default element (either catalog or schema)
            }
                            Cursor cursor = itemRenderer.getCursor(node, tree, e);


                    switch (event.getNodeChange()) {
                CustomFilteredTree filteredTree = new CustomFilteredTree(treeStyle);

                            try {
import org.eclipse.ui.dialogs.PatternFilter;
            }
import org.eclipse.swt.widgets.*;
                        // don't want the user to see updates that will be made to
                }
import org.eclipse.swt.graphics.*;
        return new TreeViewer(parent, style) {
        }
    }
            // FIXME: (only the item is paintedm the rest is whitespace)
                                break;

        public boolean isActive() {
    }


                }
            Object element = event.item.getData();
                if (menuService != null && supportedObjectTypes.contains(DatabaseNavigatorTreeFilterObjectType.connection)) {

                tree.addListener(SWT.MouseMove, mouseListener);
                super.setPattern(null);
            boolean needToMatch = filter.filterObjectByPattern(element);
            }
                // TODO: it is a bug in Eclipse Photon.
            return matcher != null && !matcher.match("");
    }
            for (DBNNode child : children) {
    }

    @NotNull
public class DatabaseNavigatorTree extends Composite implements INavigatorListener {
    }
        setInput(rootNode);
            @Override
                            this);
                    case container -> {
        }
        }

                }
            private volatile boolean canceled = false;
                return false;
                        !(object instanceof DBSCatalog) &&
    public TreeViewer getViewer() {
        treeViewer.reveal(node);

            // Run task with timeout. Don't use UI service to avoid UI interactions (see #10479)
        public void handleEvent(Event event) {
                true);
                }
import org.eclipse.ui.IWorkbenchCommandConstants;

        }
            treeEditor.grabHorizontal = false;
        if (display == null) {
                    super.handleTreeExpand(event);
        }
import org.jkiss.dbeaver.Log;
        DatabaseNavigatorContent content = (DatabaseNavigatorContent) this.treeViewer.getInput();
                        }
    private volatile ProgressPainter treeLoadingListener;
        private static final long REPAINT_DELAY = 100;
import org.eclipse.core.runtime.Status;
                        // we are setting redraw(false) on the composite to avoid
                            DBSObject obj = di.getObject();


        }
        if (rootNode != null) {
                        // dancing scrollbar
                    treeViewer.setUseHashlookup(true);
            return;

    }
                    default -> needToMatch = !(object instanceof DBPDataSourceContainer) &&
            return false;
            nodeInLoadingProcess.add(node);

                try {
                        : treeViewer.getControl();
import org.jkiss.dbeaver.model.struct.DBSStructContainer;
                break;
    }
            if (model != null) {
                }
                if (!treeViewer.getControl().isDisposed() && !treeViewer.isBusy()) {

    }
            case UPDATE:
                        return new CheckboxTreeViewer(parent, treeStyle);
                        //manual opening
                this.dotPattern = patternString.split("\\.");
        }
                } else {
                    boolean initial = initialText != null && initialText.equals(text);
                try {
                }
            }
        initEditor();
