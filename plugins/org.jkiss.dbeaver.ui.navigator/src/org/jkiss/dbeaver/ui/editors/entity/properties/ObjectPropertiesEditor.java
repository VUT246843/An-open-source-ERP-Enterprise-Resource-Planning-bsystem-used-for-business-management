    }
        if (sashForm.isDisposed()) {
        return new Point(0, 0);
                    listener.folderSelected(folderId1);
        }
                                            false,
        if (node == null) {
import org.jkiss.dbeaver.ui.controls.ObjectEditorPageControl;
import org.eclipse.swt.graphics.Point;
            } else if (activeFolder instanceof TabbedFolderPageNode) {
            if (folder.getId().equals(curFolderId)) {
            @Override
            return adapter.cast(result);
        // Contribute "Read expensive props" - but only if object has expensive props
        }
import org.eclipse.swt.widgets.Control;
            }
                                log.debug("Can't add child items tab", e); //$NON-NLS-1$
        foldersPlaceholder.setLayoutData(new GridData(GridData.FILL_BOTH));
import org.jkiss.dbeaver.ui.navigator.INavigatorModelView;
                            }
    public void runPostSaveCommands(Map<String, Object> context) {
                    pageContributors.put(page, contributor);
    private void createPropertyBrowser(Composite container)
                }
                if (size.x > 0 && size.y > 0) {
                tabList.add(new TabbedFolderInfo(
        if (store.getBoolean(ScreenReaderPreferences.PREF_SCREEN_READER_ACCESSIBILITY)) {
 * You may obtain a copy of the License at
                                            nodeName,

                        descriptor.getId(),
    {
            int height = propsPlaceholder.computeSize(propsSize.x, SWT.DEFAULT).y;
        //PropertiesContributor.getInstance().removeLazyListener(this);
            collector.setEnableFilters(false);
import org.jkiss.dbeaver.runtime.properties.DataSourcePropertyFilter;
    public boolean isSearchEnabled()
                                    List<DBNNode> itemList = childMap.computeIfAbsent((DBXTreeFolder) meta.getParent(), dbxTreeFolder -> new ArrayList<>());
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            }
                ITabbedFolder selectedPage = folderComposite.getActiveFolder();
            folderListeners.add(listener);
            }
    public <T> T getAdapter(Class<T> adapter)
    @Override
        foldersPlaceholder.setGridLayout(1);
 *
                if (subNodes != null) {

        }


            super(UINavigatorMessages.editors_entity_read_expensive_props_action, AS_CHECK_BOX);

                        descriptor.isEmbeddable(),
    {
        }


        } finally {
    public static Point getParentSize(Control control) {
import org.eclipse.jface.action.Action;
            try {
    {
    {
            RefreshResult result = propertiesPanel.refreshPart(force, afterRefresh);
                    }
            for (DBPPropertyDescriptor prop : collector.getProperties()) {
        try {
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
    }
            return;
import org.jkiss.code.Nullable;
                                DBXTreeNode meta = ((DBNDatabaseNode) child).getMeta();
                    }

            }
        gl.verticalSpacing = 5;

            }
    {
        }
                            DBNDatabaseFolder folder = (DBNDatabaseFolder)child;
            if (mainEditor instanceof IRefreshablePart) {
                        }
            this.databaseObject = databaseObject;
import org.jkiss.dbeaver.ui.css.CSSUtils;

        }
    private Composite propsPlaceholder;
    }
        if (activeFolder instanceof ISearchContextProvider) {
            }
//                            actionBars.getStatusLineManager());
                if (!fi.isEmbeddable()) {
                }
            DBRRunnableWithProgress tabsCollector = monitor ->
                }

    }
    }
            }
        }
    @Override
            if (folders.length == 0) {
    }
    private static void collectNavigatorTabs(DBRProgressMonitor monitor, IDatabaseEditor part, DBNNode node, List<TabbedFolderInfo> tabList)
                for (TabbedFolderInfo folder : folderComposite.getFolders()) {
        pageContributors.clear();
        List<EntityEditorDescriptor> editors = EntityEditorsRegistry.getInstance().getEntityEditors(object, this, null);
        {
    }
                                    false,//folder.getMeta().isInline(),
            // Create props
    {
        final DBNDatabaseNode node = part.getEditorInput() instanceof IDatabaseEditorInput ? ((IDatabaseEditorInput) part.getEditorInput()).getNavigatorNode() : null;

    {
                    DatabaseEditorUtils.contributeStandardEditorActions(getSite(), contributionManager);
    }
            if (composite instanceof CTabFolder) {
                                }

        // Remove contributors
        composite.setLayout(new FillLayout());
        return false;
    @Nullable

                    extraCategories.getFirst() + (extraCategories.size() == 1 ? "" :" / ... "),
        }
            folderComposite.setFolders(objectId, folders);
                }

            }
                            if (child instanceof DBNDatabaseNode) {
    public ITabbedFolder getActiveFolder()
    public void doSave(IProgressMonitor monitor)
            } catch (InvocationTargetException e) {
        Object result = null;

        gl.marginHeight = 0;
    @Nullable
        if (activated) {


        final Object activeFolder = getActiveFolder(false);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                log.error("Error initializing property tabs", e); //$NON-NLS-1$
            }
                                new TabbedFolderInfo(
            actionBars.updateActionBars();
        UIUtils.syncExec(() -> folderComposite.switchFolder(curFolderId));
        }
        if (folderComposite != null) {
        synchronized (folderListeners) {
import org.jkiss.dbeaver.ModelPreferences;
        IEntityEditorContext,
    {
    }
        });
            } else if (pageControl != null) {
    {
        }
    }
                    propertiesPanel = new TabbedFolderPageForm(this, pageControl, getEditorInput());
    {
        GlobalContributorManager contributorManager = GlobalContributorManager.getInstance();
    private Composite mainComposite;
    private ITabbedFolder getActiveFolder(boolean activate)
        if (dataSource != null && !dataSource.getContainer().getPreferenceStore().getBoolean(ModelPreferences.READ_EXPENSIVE_PROPERTIES)) {
import org.eclipse.ui.internal.PartSite;
        // Query for entity editors
    public void init(IEditorSite site, IEditorInput input)
        IRefreshablePart,
import org.jkiss.code.NotNull;
                DBNNode[] children = DBNUtils.getNodeChildrenFiltered(monitor, node, false);

    @Override
            }
                    return size;
                pageControl.setFocus();
                        Map<DBXTreeFolder, List<DBNNode>> childMap = new LinkedHashMap<>();
 *
    }
        if (single) {
                createPropertyRefreshAction(contributionManager);

package org.jkiss.dbeaver.ui.editors.entity.properties;
    @NotNull
        } else {
        return !(getEditorInput().getDatabaseObject() instanceof DBNDatabaseFolder);
    void createPropertyRefreshAction(IContributionManager contributionManager) {
                } else {
            return;
import org.jkiss.dbeaver.ui.*;
    

    private boolean hasPropertiesEditor() {
    private void makeDatabaseEditorTabs(final IDatabaseEditor part, final List<TabbedFolderInfo> tabList)
            }
                    String.join(", ", extraCategories),
    }
        INavigatorModelView,
        DBPDataSource dataSource = object.getDataSource();
            IWorkbenchPartSite mainEditorSite = mainEditor.getSite();

    private final List<ITabbedFolderListener> folderListeners = new ArrayList<>();
                                    folder.getNodeDisplayName(),
                    UIUtils.runInProgressService(tabsCollector);

    }
    {

        }
            IActionBars actionBars = getEditorSite().getActionBars();
                    sashForm.setLayoutData(new GridData(GridData.FILL_BOTH));
                                            node.getNodeIconDefault(),
        @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
        if (sashSize.x <= 0 || sashSize.y <= 0) {
    }

import org.jkiss.dbeaver.ui.controls.ProgressPageControl;
        // Properties
        DBSObject databaseObject = getDatabaseObject();
    public DBNNode getRootNode() {
//                    }
        return null;//super.getAdapter(adapter);
                                    String nodeName = child.getChildrenTypeLabel(databaseNode.getObject().getDataSource(), null);
    @Override
                IEditorActionBarContributor activeFolderContributor = pageContributors.get(activeFolder);
            }
    }
/*

        }
    {
    public boolean isRelationalObject(DBSObject object) {
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (CommonUtils.equalObjects(curFolderId, folderId1)) {
//                    if (activeFolderContributor instanceof EditorActionBarContributor) {
        CSSUtils.markConnectionTypeColor(pageControl);
        if (container.isDisposed()) {
        monitor.done();
        ITabbedFolderContainer,
            Point propsSize = propsPlaceholder.getSize();
        }
    }
            if (hasExpensive) {
        // Extra properties tab (show if we have extra properties only)

        }
    @Override

        if (folderSearch != null) {
 * Unless required by applicable law or agreed to in writing, software
                    for (DBNNode child : children) {
    private SashForm sashForm;
 * DBeaver - Universal Database Manager
import org.eclipse.swt.layout.GridLayout;
    }
                    DBIcon.TREE_INFO,
                // just go further
        boolean validFolder = false;
            boolean hasExpensive = false;
        DBPDataSource dataSource = databaseObject.getDataSource();
                    }
    public void activatePart()

    }
        for (TabbedFolderInfo folder : folders) {
    @Override

    private TabbedFolderComposite folderComposite;
            // Disposed during editor opening
        mainComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
        Object activeFolder = getActiveFolder();
            return;
import org.jkiss.dbeaver.ui.editors.entity.*;
import org.eclipse.jface.action.IContributionManager;
        monitor.beginTask("Collect tabs", 1);
    public boolean isSearchPossible()
    public void setFocus()
                        if (child instanceof DBNDatabaseFolder) {
                                            nodeName,
                UINavigatorMessages.ui_properties_category_information,
                    }
        folderComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
    public Viewer getNavigatorViewer() {
        folderComposite.addFolderListener(folderId1 -> {
                    ((IDatabasePostSaveProcessor) editor).runPostSaveCommands(context);
    }
            } else if (adapter.isAssignableFrom(activeFolder.getClass())) {
    {
        }
/**
        ReadExpensivePropsAction(DBSObject databaseObject) {
            }
                result = ((IAdaptable) activeFolder).getAdapter(adapter);

        }
        if (!DBWorkbench.getPlatform().getPreferenceStore().getBoolean(NavigatorPreferences.ENTITY_EDITOR_DETACH_INFO)) {
        curFolderId = getEditorInput().getDefaultFolderId();
                    tabsCollector.run(new VoidProgressMonitor());
            contributorManager.removeContributor(contributor, this);
        pageControl = new ObjectEditorPageControl(parent, SWT.SHEET, this) {
    public boolean isDirty()
        // Collect section contributors
                Point size = composite.getSize();
            }
        };
import org.eclipse.ui.*;
            return ((INavigatorModelView) activeFolder).getRootNode();
import org.jkiss.dbeaver.ui.controls.folders.*;
            TabbedFolderInfo[] folders = collectFolders(this);
    }
        setSite(site);
import org.jkiss.dbeaver.runtime.properties.PropertyCollector;
        if (activeFolder instanceof ISaveablePart) {
            if (activeFolder instanceof IAdaptable) {

                    PropertiesContributor.TAB_PROPERTIES,
                            tabList.add(

            UIUtils.asyncExec(afterRefresh);
import org.jkiss.dbeaver.ui.screenreaders.ScreenReaderPreferences;
            }
    @Override

    private ISearchContextProvider getFolderSearch()
        if (result != null) {
                return RefreshResult.CANCELED;
                if (hasPropertiesEditor() && DBWorkbench.getPlatform().getPreferenceStore().getBoolean(NavigatorPreferences.ENTITY_EDITOR_DETACH_INFO)) {
                }
    private boolean activated = false;
        }
                sp.doSave(monitor);
    @Override
{
                IEditorActionBarContributor contributor = ((IDatabaseEditorContributorUser) page).getContributor(contributorManager);
                if (contributor != null) {
import org.eclipse.swt.custom.SashForm;
 * limitations under the License.
import org.jkiss.utils.CommonUtils;

        Runnable afterRefresh = () -> {
        private final DBSObject databaseObject;
                            tabList.add(
        ISearchContextProvider provider = getFolderSearch();
            }
            return folderComposite.switchFolder(curFolderId);
        Object activeFolder = getActiveFolder();
        }
                                    itemList.add(child);
            PropertyCollector collector = new PropertyCollector(databaseObject, false);
    @Override
    }
    {
        final DBSObject object = node.getObject();
                UIUtils.asyncExec(this::updateSashWidths);
                        }
                                new TabbedFolderInfo(
                                    new TabbedFolderPageNode(part, node, folder)));

    }
                                    folder.getDescription(),
    public void dispose()
            return;
        activated = true;
                ((IRefreshablePart) mainEditor).refreshPart(this, true);
    private void makeStandardPropertiesTabs(List<TabbedFolderInfo> tabList)
            tabList.add(new TabbedFolderInfo(
import org.jkiss.dbeaver.model.DBIcon;
                                    child.getNodeDescription(),
            if (DBWorkbench.getPlatform().getPreferenceStore().getBoolean(NavigatorPreferences.ENTITY_EDITOR_DETACH_INFO)) {
            if (node instanceof DBNDatabaseNode databaseNode) {
    {
            // we still have to refresh folders in that way

                }
            }
    }
                                    folder.getNodeIconDefault(),
        return provider != null && provider.isSearchEnabled();
            } else {
    {
    @Override
                    false,
                                if (meta.getParent() instanceof DBXTreeFolder) {

        throws PartInitException
                }
                    pageProperties));
        gl.marginWidth = 0;

                }
    }
            } catch (DBException e) {
        {
import org.eclipse.ui.part.MultiPageEditorPart;
    private ObjectEditorPageControl pageControl;

        super.dispose();
                UIUtils.asyncExec(afterRefresh);
            setImageDescriptor(DBeaverIcons.getImageDescriptor(UIIcon.OBJ_REFRESH));
        gl.horizontalSpacing = 0;
import org.jkiss.dbeaver.Log;

        // Create actual editor in async mode. We need to know editor size to make proper layout and avoid blinking
import org.jkiss.dbeaver.model.DBPDataSource;
    private final List<ISaveablePart> nestedSaveable = new ArrayList<>();


                if (activeFolderContributor != null) {
    private Composite createPropertiesPanel(@NotNull Composite parent) {
            if (folderComposite != null && folderComposite.getFolders() != null) {
    @Override
    private final Map<ITabbedFolder, IEditorActionBarContributor> pageContributors = new HashMap<>();

                break;
                //PropertiesContributor.CATEGORY_INFO,
    public ObjectPropertiesEditor()
        return foldersPlaceholder;
    private static final Log log = Log.getLog(ObjectPropertiesEditor.class);
            return false;
            String objectId = "PropertiesEditor." + getDatabaseObject().getClass().getName();
            }
            List<String> extraCategories = pageProperties.getExtraCategories();
            synchronized (folderListeners) {

    @Override
        for (IEditorActionBarContributor contributor : pageContributors.values()) {
        }
    @Nullable
public class ObjectPropertiesEditor extends AbstractDatabaseObjectEditor<DBSObject> implements IEntityStructureEditor,
        }
    @Override
                    tabList.add(new TabbedFolderInfo(
                }
            pageControl.setFocus();
    @Override
    @Nullable
import org.eclipse.core.runtime.IAdaptable;
                return true;
                collectNavigatorTabs(monitor, part, node, tabList);
            // Add itself as tab (if it has child items)
        return null;

            if (sp instanceof TabbedFolderPageEditor) {
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
        ConComposite foldersPlaceholder = new ConComposite(parent);
    }

        return RefreshResult.REFRESHED;
 */
import org.jkiss.dbeaver.ui.navigator.NavigatorPreferences;
        }
                    single = false;

    @Override
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
            } catch (InterruptedException e) {

        return null;
                                            new TabbedFolderPageNode(part, node, child)));
        }


}                }

    @Override
        }
                                    tabList.add(
        return this.curFolderId;
    }
import org.eclipse.swt.layout.FillLayout;
            if (sp.isDirty()) {


                }
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
 */
        for (ISaveablePart sp : nestedSaveable) {
 * See the License for the specific language governing permissions and
import org.eclipse.ui.part.MultiPageEditorSite;
        IDatabasePostSaveProcessor
                super.fillCustomActions(contributionManager);
            if (height < budget) {
    }
            }
            if (sashForm != null) {
        ITabbedFolder activeFolder = folderComposite == null ? null : folderComposite.getActiveFolder();
        return false;
        if (node instanceof DBNDataSource ds && !ds.getDataSourceContainer().isConnected()) {

        // do not force focus in active editor. We can't do it properly because folderComposite detects
        @Override
    private TabbedFolderPageForm propertiesPanel;
                            DBXTreeFolder folder = fe.getKey();
        GridLayout gl = new GridLayout(1, false);
        if (propertiesPanel != null) {
    public void addFolderListener(ITabbedFolderListener listener)
    private String curFolderId;
        if (activeFolder != null) {
            }
                                }
    }
        // Add lazy props listener
    }
            }
                }
                        }

        Point sashSize = sashForm.getParent().getSize();
import org.eclipse.swt.widgets.Composite;
 * distributed under the License is distributed on an "AS IS" BASIS,
                }
        if (part instanceof IDatabaseEditor) {
        List<TabbedFolderInfo> tabList = new ArrayList<>();
        makeStandardPropertiesTabs(tabList);
                    contributorManager.addContributor(contributor, this);
            TabbedFolderPageProperties pageProperties = new TabbedFolderPageProperties(this, getEditorInput());
        
    @Override
    {
                            } catch (DBException e) {
    public boolean isSaveAsAllowed()
        }
                    activeFolderContributor.setActiveEditor(activeEditor);
                                            node.getNodeDescription(),
        // If accessibility is active, set focus to the page control rather the active editor so
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeItem;
//                        ((EditorActionBarContributor) activeFolderContributor).contributeToStatusLine(
    {
        }
        for (ISaveablePart sp : nestedSaveable) {
                int[] newWeights = {height, budget - height};
    private class ReadExpensivePropsAction extends Action {
        }
        return true;
            curFolderId = folders[0].getId();
                                    new TabbedFolderPageNode(part, folder, null)
        for (Composite composite = control.getParent(); composite != null; composite = composite.getParent()) {
    }
 *
                log.error(e.getTargetException());
                UINavigatorMessages.ui_properties_category_information_tip,
        // active folder by focus (which it doesn't have)
            return (ISearchContextProvider)activeFolder;
                if (descriptor.getType() == EntityEditorDescriptor.Type.folder) {
                    // FIXME: do not add extra contributions as they will be there forever (never cleaned up)
                    propsPlaceholder = createPropertiesPanel(sashForm);
        if (activeFolder instanceof INavigatorModelView) {
                ((PartSite) mainEditorSite).deactivateActionBars(true);
        }
                        // Folders are hidden in navigator. But we must show them here for all present child items

            ITabbedFolder page = folder.getContents();
                if (children != null) {
                        }

    {
            // Do not add children tabs
    }
            }
            if (mainEditorSite instanceof PartSite) {
            // Collect tabs from navigator tree model
        };
            if (!extraCategories.isEmpty()) {

import java.lang.reflect.InvocationTargetException;

    @Nullable
                if (selectedPage != null) {
                        if (child instanceof DBXTreeItem) {
    private void updateSashWidths() {
    public RefreshResult refreshPart(Object source, boolean force) {
                            String nodeName = folder.getChildrenTypeLabel(((DBNDatabaseNode) node).getObject().getDataSource(), null);
        this.curFolderId = folderId;
                    propertiesPanel.createControl(propsPlaceholder);
            makeDatabaseEditorTabs((IDatabaseEditor)part, tabList);
            collector.collectProperties();
                    hasExpensive = true;
import org.jkiss.dbeaver.runtime.properties.PropertiesContributor;
        if (activeFolder instanceof INavigatorModelView) {
                result = activeFolder;
            if (sp.isDirty()) {
                        for (DBNNode child : children) {
        return composite;
        if (!node.getMeta().isStandaloneNode()) {
            }
            sashSize = getParentSize(sashForm);
            MultiPageEditorPart mainEditor = ((MultiPageEditorSite) getSite()).getMultiPageEditor();
    {
            }
        }
                propsPlaceholder = createPropertiesPanel(container);
                    sashForm = UIUtils.createPartDivider(getSite().getPart(), container, SWT.VERTICAL);
                        new TabbedFolderPageEditor(this, descriptor)));
            }
            DataSourcePropertyFilter.readExpensivePropertiesFor(this.databaseObject, !isChecked());
    {
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeNode;
            for (EntityEditorDescriptor descriptor : editors) {
        IProgressControlProvider,
                    if (folder.getContents() instanceof IRefreshablePart) {
    @Override
                        for (Map.Entry<DBXTreeFolder, List<DBNNode>> fe : childMap.entrySet()) {
    {
    }
        GlobalContributorManager contributorManager = GlobalContributorManager.getInstance();
            try {
import java.util.*;
            }
    @Override

                    break;
            public void fillCustomActions(IContributionManager contributionManager) {
                            monitor.subTask(UINavigatorMessages.ui_properties_task_add_folder + " '" + child.getNodeDisplayName() + "'"); //$NON-NLS-2$
        public void run() {

            folderListeners.remove(listener);
    public boolean switchFolder(String folderId)
    @Override

        }
            int budget = sashSize.y - sashForm.getSashWidth();
        } else if (node != null) {
        ITabbedFolder activeFolder = folderComposite == null ? null : folderComposite.getActiveFolder();
    public ProgressPageControl getProgressControl()
    @Override
    public TabbedFolderInfo[] collectFolders(IWorkbenchPart part)
        boolean single = folders.length < 4;
        }
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeFolder;
                    for (DBXTreeNode child : subNodes) {
            for (TabbedFolderInfo fi : folders) {
                if (node instanceof DBNDatabaseNode && ((DBNDatabaseNode) node).getDataSourceContainer().getNavigatorSettings().isHideFolders()) {
        setInput(input);
                    // We have object editor and no folders - contribute default actions

    }
                                    monitor.subTask(UINavigatorMessages.ui_properties_task_add_node + " '" + node.getNodeDisplayName() + "'"); //$NON-NLS-2$
    }
import org.eclipse.core.runtime.IProgressMonitor;
        return false;
        // the tab names can be read correctly
import org.eclipse.jface.viewers.Viewer;
        return dataSource != null && dataSource.getInfo().supportsReferentialIntegrity();
                for (ITabbedFolderListener listener : folderListeners) {
                    // Overwrite external contributor actions with EntityEditor actions
        } else {
                                if (!((DBXTreeItem)child).isOptional() || databaseNode.hasChildren(monitor, child)) {

                        ((IRefreshablePart) folder.getContents()).refreshPart(source, force);
                    IEditorPart activeEditor = ((TabbedFolderPageEditor) activeFolder).getEditor();
        mainComposite = new ConComposite(pageControl, SWT.NONE);
    @Override
        }
    {
                createFoldersPanel(foldersParent, folders);
            if (page instanceof IDatabaseEditorContributorUser) {
            return ((INavigatorModelView) activeFolder).getNavigatorViewer();
    }
        pageControl.setShowDivider(true);
                }
    public void createPartControl(Composite parent)
        for (ISaveablePart sp : nestedSaveable) {
        folderComposite = new TabbedFolderComposite(foldersPlaceholder, SWT.LEFT | (single ? SWT.SINGLE : SWT.MULTI));
        }
 * ObjectPropertiesEditor
                }
                                        new TabbedFolderInfo(
                nestedSaveable.add((ISaveablePart) page);
                Composite foldersParent = container;
                        descriptor.getIcon(),
            pageControl.setRedraw(true);
    {
            return DataSourcePropertyFilter.isExpensivePropertiesReadEnabledFor(this.databaseObject);
        final DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
        mainComposite.setLayout(gl);
                List<DBXTreeNode> subNodes = databaseNode.getMeta().getChildren(databaseNode);
                false,
        }
    }
            if (activeFolder instanceof TabbedFolderPageEditor) {
                DBIcon.TREE_INFO,
        }
        if (!validFolder && folders.length > 0) {
    public boolean performSearch(SearchType searchType)
                if (mainEditor instanceof EntityEditor) {
        ISearchContextProvider,
        ISearchContextProvider folderSearch = getFolderSearch();
        return pageControl;

import org.eclipse.swt.custom.CTabFolder;
        }
            if (page instanceof ISaveablePart) {
                }
        for (TabbedFolderInfo folder : folders) {
        UIUtils.asyncExec(() -> createPropertyBrowser(mainComposite));
        }
    {
    public void removeFolderListener(ITabbedFolderListener listener)
    }
        synchronized (folderListeners) {
                }
import org.jkiss.dbeaver.DBException;
                if (prop instanceof ObjectPropertyDescriptor && ((ObjectPropertyDescriptor) prop).isExpensive()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                }
                                    false,
            if (folderComposite != null) {

                if (propertiesPanel != null && folderComposite == null) {
        }
                                    nodeName,
import org.jkiss.dbeaver.model.struct.DBSObject;
        }
            }
import org.eclipse.swt.layout.GridData;
                contributionManager.add(new ReadExpensivePropsAction(databaseObject));
            ITabbedFolder activeFolder = folderComposite.getActiveFolder();
                            }
        return getActiveFolder(true);
            } else if (result == RefreshResult.IGNORED) {
                curFolderId = folderId1;
                    foldersParent = sashForm;
            return folderSearch.performSearch(searchType);
                if (hasPropertiesEditor()) {
        //PropertiesContributor.getInstance().addLazyListener(this);
        pageControl.setRedraw(false);
        // Add all nested folders as tabs

            MultiPageEditorPart mainEditor = ((MultiPageEditorSite) getSite()).getMultiPageEditor();
                    if (children != null) {


    public boolean isEntityContainer(DBSObjectContainer object) {
        return tabList.toArray(new TabbedFolderInfo[0]);
 * you may not use this file except in compliance with the License.
                                    nodeName,
                                    folder.getDefaultIcon(),
import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
            ((ISaveablePart) activeFolder).doSaveAs();
    // This is used by extensions to determine whether this entity is another entity container (e.g. for ERD)
            // This may happen if EntityEditor created with some other active editor (i.e. props editor not visible)


            if (result == RefreshResult.CANCELED) {
            pageControl.layout(true, true);
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                if (node.needsInitialization()) {
        pageControl.createProgressPanel();
    private Composite createFoldersPanel(Composite parent, TabbedFolderInfo[] folders) {

import org.jkiss.dbeaver.model.navigator.*;
    }
    public void doSaveAs()
                            try {
                    selectedPage.setFocus();
                if (!Arrays.equals(newWeights, sashForm.getWeights())) {
                validFolder = true;
                    new EditorSearchActionsContributor().setActiveEditor(((EntityEditor) mainEditor).getActiveEditor());
                IEditorPart editor = ((TabbedFolderPageEditor) sp).getEditor();
        Composite composite = new ConComposite(parent);
                        descriptor.getDescription(),
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
import org.jkiss.dbeaver.runtime.properties.ObjectPropertyDescriptor;

        return folderComposite == null ? null : folderComposite.getActiveFolder(activate);

import org.jkiss.dbeaver.ui.editors.*;
                return;

                                    folder.getNodeDisplayName(),
                        descriptor.getName(),
            }
        return false;
        if (sashSize.x > 0 && sashSize.y > 0) {
                PropertiesContributor.TAB_STANDARD,

                propsPlaceholder.setLayoutData(new GridData(GridData.FILL_BOTH));
        public boolean isChecked() {
                }
        } else {
                                ));
                    sashForm.setWeights(newWeights);
                new TabbedFolderPageForm(this, pageControl, getEditorInput())));
                if (editor instanceof IDatabasePostSaveProcessor) {
        // Load properties
    {
        }
        return null;
        if (!CommonUtils.isEmpty(editors)) {

    }
            }
    public String getActiveFolderId() {
    @Override
import org.eclipse.swt.SWT;
