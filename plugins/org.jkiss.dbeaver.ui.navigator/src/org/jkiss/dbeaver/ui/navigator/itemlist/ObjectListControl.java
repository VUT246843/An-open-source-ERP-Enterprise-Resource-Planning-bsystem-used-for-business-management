        }
        synchronized (lazyCache) {
                                if (!CommonUtils.equalObjects(oldObject, newObject) || forceUpdateItems) {
                    if (nameColumn != null) {
    //////////////////////////////////////////////////////
                        }
            final Table table = tableViewer.getTable();
        public Object[] getChildren(Object parentElement) {
        return null;
                            if (formatValue) {
            if (prop.isHidden()) {
                                if (objectValue != null && p.isPropertyVisible(objectValue, objectValue)) {
                }
        @Override

        // Use prop class from top parent
            // We need measure item listener to prevent collapse/expand on double click
            pattern = Pattern.compile(SQLUtils.makeLikePattern(searchString), caseSensitiveSearch ? 0 : Pattern.CASE_INSENSITIVE);
        @NotNull IContentProvider contentProvider)
        }
            if (showTableGrid) {
        String selectedText;
        new DefaultViewerToolTipSupport(itemsViewer);
    @Nullable
                if (object == null) {
                    itemsViewer.setInput(createViewerInput(sampleList));
            return null;
            UINavigatorMessages.obj_editor_properties_control_action_configure_columns,
    @Nullable
            buf.append("\n");
            editorActivationStrategy = new EditorActivationStrategy(tableViewer);
            if (loadingJob != null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    @NotNull
        }
        };
                    for (OBJECT_TYPE newObject : items) {
                // Collect list of items' classes
    public Collection<OBJECT_TYPE> getListData() {

                    }
            }
            IStructuredSelection selection = (IStructuredSelection) event.getSelection();
    }
                }
        }
//            }
    private Job lazyLoadingJob = null;
    private class GroupingTreeProvider extends TreeContentProvider {
        @Override
        @Override
                            }
                    // Uee provided double click
            } else {
                itemsViewer.setInput(objectList);
import org.eclipse.swt.graphics.Rectangle;
    protected boolean isNewObject(OBJECT_TYPE objectValue) {
 *
    }
    protected final Object getCellValue(@NotNull Object element, int columnIndex) {
        @Override
                        createColumn(prop);
    public static class ObjectColumn {
    }
                Object selectedNode = selection.getFirstElement();

        }
        }
            }
        public ObjectPropertyDescriptor getProperty(Object object) {

                                    return false;
        OBJECT_TYPE object = (OBJECT_TYPE) element;
    @Nullable
                        } else {
            public void mouseDoubleClick(MouseEvent e) {
                        @Override
        }

                    if (i > 0) buf.append("\t");
            DBeaverIcons.getImageDescriptor(UIIcon.CONFIGURATION)) {

        private final List<Object> groupedElements;
            itemsViewer = tableViewer;



            }
    @NotNull
            }
                if (!CommonUtils.isEmpty(items)) {
            if (groupingColumn != null) {
/*
                        }
            synchronized (this) {
 * DBeaver - Universal Database Manager
            lazyObjects = new LinkedHashMap<>();
        @Override

        public void completeLoading(Collection<OBJECT_TYPE> items) {
        this.curListObject = curListObject;
    }
            int[] originalColumnOrder = tree.getColumnOrder();
        @Override
            // Add column in controller
                    }
        return null;
    // List sorter
        @Nullable


    }
            } else {
                DBPImage objectImage = getObjectImage(object);
        public void afterEditorActivated(ColumnViewerEditorActivationEvent event) {
            super(viewer);
    public ObjectListControl(
     * Searcher. Filters elements by name and description
                    }
        public ObjectActionVisualizer() {

    }


import org.jkiss.dbeaver.model.navigator.DBNNodeReference;
                for (ObjectColumn column : entry.getValue()) {
        this.focusColumn = objectColumn;
     * @param classList classes of objects in the list
        loadData(lazy, false);
        setListData(items, append, forUpdate, false);
            }
        this.isFitWidth = false;
                                    try {
                            }
                prop.isViewable(),
 * limitations under the License.
    /**
                        } catch (Throwable e) {
                            }
     * Returns object with properties

                            synchronized (lazyCache) {
        setInfo(getItemsLoadMessage(objectList.size()));
    public boolean supportsDataGrouping() {
        return new ArrayList<>(objectList);
                if (this.loadingJob != null) {
                doubleClickHandler.doubleClick(new DoubleClickEvent(itemsViewer, itemsViewer.getSelection()));
        @NotNull Composite parent,

                                itemsViewer.refresh();
                e.gc.drawImage(image,

                lazyLoadCanceled = true;
            columnController.repackColumns();
            return getObjectFont((OBJECT_TYPE) element);
        protected ViewerRenderer() {
        }
        protected ObjectColumnLabelProvider(ObjectColumn objectColumn) {
        public void cancelSearch() {
            // Do not show grid in dark theme. It is awful
            }
            Object object = getObjectValue(element);
                    if (!isDisposed()) {
                                e = ((InvocationTargetException) e).getTargetException();
            }
                clipboardData.addTransfer(TextTransfer.getInstance(), selectedText);
                menuManager.add(new Action(UINavigatorMessages.object_list_control_clear_grouping_label, null) {
        ObjectPropertyDescriptor prop = getPropertyByObject(objectColumn, objectValue);
            if (reload || objectList.isEmpty()) {
                Object object = getObjectValue(element);
        }
                } else {
    }
        }
            return null;

import org.jkiss.dbeaver.ui.controls.ObjectViewerRenderer;
                    if (this.loadingJob == null) {
                    groupElementsSize = elements.size();
        boolean showTableGrid = DBWorkbench.getPlatform().getPreferenceStore().getBoolean(NavigatorPreferences.NAVIGATOR_EDITOR_SHOW_TABLE_GRID);
                        classList.add(objectValue.getClass());
        }
                prop.isNumeric(),
        //return null;

    public void setIsColumnVisibleById(@NotNull String id, boolean visible) {
        if (lazyLoadingJob == null) {
            if (isDisposed()) {
            //itemsEditor = new TableEditor(table);
            }
            super.completeLoading(items);
        final ObjectColumn columnInfo = getColumnByIndex(columnIndex);
                        public void run() {
        private final Object value;
            }
                        int itemIndex = 0;
                    });
                        log.debug(e);
            setInfo(status);
    }

                                    } else {
    /**

            return getCurrentListObject();
            }
                break;
                this.loadingJob = createLoadService(forUpdate);
                            synchronized (lazyCache) {
        return getCellValue(element, columnInfo, true);


     * Creates service for object loading.
                            lazyLoadingJob = null;
    private List<OBJECT_TYPE> objectList = null;
                            }
import java.util.*;
            return tmp;
    }
            if (!isDisposed()) {
            }
                        ObjectColumn column = getColumnByIndex(i);
                            tickCount++;
                                    } catch (Throwable e) {
        }
                        for (OBJECT_TYPE newObject : items) {
                        if (column.isNameColumn(object)) {
    }
     * Returns object's image
        public DBPPropertyDescriptor[] getProperties() {
        protected void afterCompleteLoading(@NotNull Collection<OBJECT_TYPE> items) {
                        final boolean isFocusCell = focusObject == object && focusColumn == objectColumn;
//            String oldTitle = objectColumn.item.getText();
                            if (!lazyLoadCanceled) {
                        if (value == NULL_VALUE) {
                    return elements;
     *
    private String copyGridToText() {
 *
        }
                                continue;
//                    }
        if (columnController != null) {
                return false;
        @Override
    public class ObjectsLoadVisualizer extends ProgressVisualizer<Collection<OBJECT_TYPE>> {
                    group.add(element);
        collectedSet.put(item, Boolean.TRUE);
    }
        if (prop == null) {
                        break;
    public Composite getControl() {
                itemsViewer.refresh();
            return getObjectBackground((OBJECT_TYPE) element);
                status = ObjectViewerRenderer.getCellString(selectedNode, false);
        String displayName;
                }
                    if (objectName == null) {
            if (renderer.isHyperlink(cell.getElement(), getCellValue(cell.getElement(), cell.getColumnIndex())) &&
                case SWT.PaintItem:
                        allProps.removeIf(p -> {
                        if (prop.isOptional()) {
    }
            treeViewer.getControl().addListener(SWT.MeasureItem, event -> {
        if (!itemsViewer.getControl().isDisposed()) {
            this.groupingKey = groupingKey;
        } else {
            }
                sampleItems = true;
            }
    }
                                        classList.remove(i);
        public Image getImage(Object element) {
                // Collect all properties
                for (ObjectPropertyDescriptor prop : allProps) {

                setCurListObject((OBJECT_TYPE) selection.getFirstElement());

        public boolean hasChildren(Object element) {
            this.displayName = displayName;
                    }
                        }
                loadingJob = null;
        return ((TreeViewer) itemsViewer).getTree();
                        });

        if (!contentProvider.hasChildren(item)) {
            if (CommonUtils.equalObjects(col.id, prop.getId()) || CommonUtils.equalObjects(col.displayName, prop.getDisplayName())) {
        int style,
        return false;
                                classList.add(theClass);
                return;
                    }
                Map<String, Object> objectCache;
            if (loadingJob != null) {
    }
        @Override
                    ObjectColumn nameColumn = null;

            return null;
    /**
                        if (ObjectListControl.this.isLoading()) {
        }

        }
        @Override

                return groups.entrySet().stream()
        Object[] children = contentProvider.getChildren(item);

import org.jkiss.utils.ArrayUtils;
                    this.loadingJob.schedule(LAZY_LOAD_DELAY);
            if (isTree && supportsDataGrouping()) {
        } else {
        }
        return null;


    private final static int LAZY_LOAD_DELAY = 100;
                            Object lazyValue = prop.readValue(object, monitor, false);
            this.listPropertySource = createListPropertySource();
    }
    //////////////////////////////////////////////////////
                if (doubleClickHandler != null) {
        ObjectPropertyDescriptor prop = null;
                        @Override
        // Create lazy action here because columnController might be not instantiated yet
                final Object previewValue = getListPropertySource().getPropertyValue(null, objectValue, prop, formatValue);
                        }
                                renderer.paintInvalidCell(e, e.item, e.index);
            IStructuredSelection selection = itemsViewer.getStructuredSelection();
                    ObjectPropertyDescriptor prop = getPropertyByObject(column, object);


     */
    }
                                for (int i = 0; i < classList.size(); i++) {
                return false;
                columnController.createColumns(false);
                        if (object != null) {
    }

     */
    }
        int columnsCount = columnController.getColumnsCount();
                cache.remove(property);
                return;
                isEmpty = ObjectListControl.this.getTable().getItemCount() == 0;
                    clearListData();
            }
                e.doit = false;
        @Override
                                ((TreeViewer) itemsViewer).expandToLevel(2);
        public String getText(Object element) {
            return;
            } else {
                objectColumn = col;

                        }
            {
                    }
                    }
        if (mode == CopyMode.ADVANCED) {
        public void handleEvent(Event e) {
                if (columnPersist) {
            int dataLoadTimes = getDataLoadTimeout() / dataLoadUpdatePeriod;
        @NotNull
        itemsViewer.getControl().addPaintListener(new ListPaintListener());
                // Create columns from classes' annotations
            } else if (items != null) {

                        public boolean isEnabled() {
                return ((ObjectsGroupingWrapper) parentElement).groupedElements.toArray();
    protected Set<DBPPropertyDescriptor> getAllProperties() {
                return;
                prop.isNumeric() ? SWT.RIGHT : (prop.isBoolean() ? SWT.CENTER : SWT.NONE),
import org.jkiss.dbeaver.model.navigator.DBNNode;
    // Overridable functions
            } else if (selection.size() == 1) {
                    String strValue = DBValueFormatting.getDefaultValueDisplayString(cellValue, DBDDisplayFormat.UI);
                return;
/**

            this.objectColumn = objectColumn;
            lazyObjects = null;
                                value = prop.formatValue(object, value);
import org.jkiss.code.NotNull;
                public void done(IJobChangeEvent event) {
        Class<?> propClass = prop.getParent() == null ? prop.getDeclaringClass() : prop.getParent().getDeclaringClass();
                                // Remove all base classes if we have sub class
     */
        Map<Class<?>, ObjectPropertyDescriptor> propMap = new IdentityHashMap<>();
            this.forUpdate = forUpdate;
            }

            if (groupingColumn != null && parentElement instanceof ObjectsGroupingWrapper) {
        }


                columnController.configureColumns();
    }
                        while (objectList.size() > newListSize) {
        setListData(items, true, false);
            for (int i = 0; i < columnsCount; i++) {
                        }

        @Nullable
                }
                if (i > 0) buf.append("\t");
            }
            if (ObjectListControl.this instanceof DBNNodeReference nnc) {
    protected String getItemsLoadMessage(int count) {
        return 10000;
            prop = column.propMap.get(valueClass);
            TreeViewer treeViewer = new TreeViewer(this, viewerStyle);
    }
    }
                    ObjectListControl.this instanceof DBPDataSourceContainerProvider ?
        }
            listPropertySource.clearProperties();
            Map<String, Object> cache = lazyCache.get(object);
        ISelection selection = getSelectionProvider().getSelection();
                    Object cellValue = property == null ? null : property.readValue(object, new VoidProgressMonitor(), true);
            return property != null && property.isNameProperty();
import org.jkiss.dbeaver.model.sql.SQLUtils;

    @Nullable
        if (objectValue == null) {
        public Object getEditableValue() {
            objectColumns.add(column);
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
                }
                PropertySourceAbstract propertySource = getListPropertySource();
    @Nullable
        final Control itemsControl = itemsViewer.getControl();
    protected ViewerColumnController<ObjectColumn, Object> columnController;
            buf.append("\n");
                                moveGroupingColumnInTheBeginning(selectedColumnNumber);
                );
            if (element instanceof ObjectsGroupingWrapper) {
                            Map<OBJECT_TYPE, Boolean> collectedSet = new IdentityHashMap<>();
                return groupingKey + (groupElementsSize > 0 ? " (" + groupElementsSize + ")" : "");
                buf.append(column.displayName);
                (element instanceof DBPObjectWithDescription owd && matches(owd.getDescription()));
        }

                final Map<String, Object> cache = lazyCache.get(object);
        return new ObjectColumnLabelProvider(objectColumn);

    public <T> T getSuitableSelectedElement(@NotNull Class<T> adapterType) {
import org.eclipse.swt.graphics.Image;
                }
            return text;
                            objectList.remove(objectList.size() - 1);

    public void clearListData() {
                        if (!objectList.contains(newObject)) {
                }
        }
                    }
    }
                            }

//                objectColumn.item.setText(CommonUtils.capitalizeWord(objectColumn.id));

            for (Object child : children) {

        }
    // Clipboard

                        if (cellValue instanceof LazyValue) {

                                lazyValue = NULL_VALUE;

        if (count == 0) {
    }
import java.util.regex.PatternSyntaxException;
                } catch (Throwable e) {
                            log.debug(e);
    /**
import org.jkiss.dbeaver.ui.navigator.NavigatorPreferences;
            if (ObjectListControl.this.isLoading()) {
        }
        }
        super(parent, style);
        if (!CommonUtils.isEmpty(selectedText)) {

        return (Composite) itemsViewer.getControl();
    protected List<OBJECT_TYPE> createViewerInput(Collection<OBJECT_TYPE> objectList) {
        Action configColumnsAction = new Action(
        }
            columnController = null;
                    final List<Object> group = groups.computeIfAbsent(key, x -> new ArrayList<>());
        }
            columnController.addColumn(
                                Object objectValue = getObjectValue(item);
    }
    }
        }

            final Object objectValue = getObjectValue(object);
        itemsViewer.getControl().addListener(SWT.PaintItem, new ItemPaintListener());
                    Object value = cache.get(objectColumn.id);
                            if (!CommonUtils.isEmpty(items)) {
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
        return null;
                    sampleItems = false;
        }
                        }
    }
import org.eclipse.swt.widgets.*;


                return true;
    private volatile boolean lazyLoadCanceled;
                            itemIndex++;

                if (entry.getKey().isInstance(objectValue)) {
                            }
        return buf.toString();
                    }
                            }
                    }
    {
            }
            @Override
        });
            }
                }
                return (T) firstElement;
            final ObjectPropertyDescriptor prop = getPropertyByObject(objectColumn, objectValue);
                }
        contributionManager.add(configColumnsAction);
        }
                    }
                prop.getDisplayName(),
            afterCompleteLoading(items);
            }
                selectedText = buf.toString();
            final Tree tree = treeViewer.getTree();
import org.eclipse.core.runtime.jobs.Job;
        return columnController;
                if (groupingKey == null || "".equals(groupingKey)) {
     */
        }
                Object groupingKey = ((ObjectsGroupingWrapper) element).groupingKey;
    }
            });
        }
            return super.isEditorActivationEvent(event);
            }
import org.jkiss.dbeaver.model.*;
        itemsViewer.getColumnViewerEditor().addEditorActivationListener(new EditorActivationListener());
                        }
            columnController.repackColumns();
    }
                        objectCache = new HashMap<>();
            }
        if (!ArrayUtils.isEmpty(children)) {

    private volatile OBJECT_TYPE curListObject;
    public void addClipboardData(CopyMode mode, ClipboardData clipboardData) {
                            objectName = ((DBPNamedObject) object).getName();
        }
    }
                        sampleList = objectList;
                    if (!propertySource.hasProperty(prop)) {
                // Some other objects could also be updated implicitly with our lazy loader


                getItemsViewer().setFilters(new ViewerFilter[]{searchFilter});

        }
    protected boolean isReadOnlyList() {
    protected Font getObjectFont(OBJECT_TYPE item) {
            if (isTree) {
        if (collectedSet.containsKey(item)) {
    protected boolean isDynamicObject(OBJECT_TYPE object) {
    private boolean isFitWidth;
                prop.getDescription(),
        }
            Tree tree = ((TreeViewer) itemsViewer).getTree();
            }
            Object firstElement = ((IStructuredSelection) selection).getFirstElement();
    public ObjectViewerRenderer getRenderer() {
                // Make refresh of whole table


                            log.error("Error reading property '" + prop.getId() + "' from " + object, e); //$NON-NLS-1$ //$NON-NLS-2$
                    break;
    //////////////////////////////////////////////////////
        return null;
        // Both table and tree are composites so its ok
        GroupingViewerColumnController(String id, ColumnViewer viewer) {
        public boolean isNameColumn(Object object) {
            lazyLoadingJob = new LazyLoaderJob();

    protected int getDataLoadTimeout() {
            try {
            lazyLoadingJob.addJobChangeListener(new JobChangeAdapter() {
            TableViewerEditor.create(tableViewer, editorActivationStrategy, ColumnViewerEditor.TABBING_VERTICAL | ColumnViewerEditor.TABBING_HORIZONTAL);
                return null;
            objectColumn.addProperty(propClass, prop);
import org.eclipse.jface.action.IContributionManager;
        if (selection instanceof IStructuredSelection && !selection.isEmpty()) {
     * Used to save/load columns configuration.
                        return Status.OK_STATUS;
    }
            if (itemsControl.isDisposed()) {
    }
                            collectItemClasses(item, classList, collectedSet);
                    final Object key = getCellValue(element, columnIndex);
    }
        synchronized (this) {
    @Override
                                groupingColumn.columnIndex = selectedColumnNumber;
                        if (object instanceof ObjectsGroupingWrapper) {
                            break;
                        try {
    //private ColumnViewerEditor itemsEditor;
                setCurListObject(null);

                if (cache != null) {
                            ObjectPropertyDescriptor nameProperty = nameColumn.getProperty(object);
        private SearchFilter(String searchString, boolean caseSensitiveSearch) {
    }

                String columnName = null;
        @NotNull
    private ColumnViewer itemsViewer;
                        if (objectColumn == null) {
                }
            Map<OBJECT_TYPE, List<ObjectColumn>> tmp = lazyObjects;
                            break;
                return nnc.getReferencedNode();
 */
    protected void addExtraColumns(ViewerColumnController<ObjectColumn, Object> columnController, Collection<OBJECT_TYPE> items) {
    }
                        final Object objectValue = getObjectValue(object);
            final Map<OBJECT_TYPE, List<ObjectColumn>> objectMap = obtainLazyObjects();
        UIUtils.installAndUpdateMainFont(itemsViewer.getControl());
        }

                            if (columnPersist) {
            this.groupedElements = groupedElements;
            }
                return element instanceof ObjectsGroupingWrapper;
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;

            if (prop != null && prop.isNameProperty()) {
            if (selection.isEmpty()) {
    protected int getDefaultListStyle() {
                            if (!propHasValue) {
            monitor.done();
        public LazyLoaderJob() {
                            // do not return error - it causes a lot of error boxes
import java.util.regex.Matcher;
                    if (strValue.contains("\n") || strValue.contains("\t")) {
            return NLS.bind(UINavigatorMessages.controls_object_list_message_items, count);
                        }
        private static final int MAX_TOOLTIP_LENGTH = 250;
                            for (OBJECT_TYPE item : items) {
                            return columnPersist;
            return object == null ? null : getPropertyByObject(this, object);
import org.jkiss.dbeaver.ui.controls.TreeContentProvider;
     * Gets property descriptor by column and object value (NB! not OBJECT_TYPE but real object value).
                return null;
                selectedText = getRenderer().getSelectedText();
                        } catch (Throwable e) {
 * See the License for the specific language governing permissions and
        }
    }
        EditorActivationStrategy editorActivationStrategy;
                final Map<Object, List<Object>> groups = new HashMap<>();
                final List<Class<?>> classList = new ArrayList<>();
                }
        }
    }
    }
        }
    }
            }
            return (groupingKey != null ? "Grouped by: " + groupingKey.toString() + ". " : "") + "Elements amount: " + groupedElements.size();
        public void beforeEditorActivated(ColumnViewerEditorActivationEvent event) {
    @Nullable
                obtainLazyObjects();
        itemsViewer.getControl().setLayoutData(gd);
                tree.setLinesVisible(true);

                    .toArray();

                    element = groupedElements.get(0);
            if (objectValue == null) {

    private class EditorActivationStrategy extends ColumnViewerEditorActivationStrategy {
            if (reload) {
                        }
                return null;
    /**



                        }
        clearLazyCache();

            } else {
    }
            return;

                                        Object propValue = prop.readValue(getObjectValue(item), null, true);
        return loadingJob != null;
                    for (OBJECT_TYPE item : items) {
        return renderer;

        };
    public class SearcherFilter implements ISearchExecutor {
    private void collectItemClasses(OBJECT_TYPE item, List<Class<?>> classList, Map<OBJECT_TYPE, Boolean> collectedSet) {
                                objectCache.put(prop.getId(), lazyValue);
                            Class<?> theClass = ObjectPropertyDescriptor.getObjectClass(object);
                                    }
        }
        return ((TableViewer) itemsViewer).getTable();
        loadData(true, false);
 * Copyright (C) 2010-2026 DBeaver Corp and others

                table.setLinesVisible(true);
        if (this.loadingJob != null) {
            }

            } else {
                    if (objectCache == null) {
            @Override
import java.util.List;
        }
                }
     * @param forUpdate true if it is update/merge operation. I.e. existing object modifications should remain.
            }
import org.eclipse.jface.action.Action;
        if (UIStyles.isDarkTheme()) {
    protected Class<?>[] getListBaseTypes(Collection<OBJECT_TYPE> items) {
        return false;
                                addLazyObject(object, objectColumn);
import org.eclipse.jface.action.Separator;
        } else {
                                    continue;
    }
                return EMPTY_STRING; //$NON-NLS-1$
    @Nullable
                    }
        @Override
        }
            if (objectColumn == groupingColumn) {
            if (loadingJob != null) {
//                        return EMPTY_STRING;
    protected PropertySourceAbstract createListPropertySource() {
                                if (objectCache.containsKey(prop.getId())) {
            this.id = id;

        {
    // Sample flag. True only when initial content is packed. Used to provide actual cell data to Tree/Table pack() methods
 * Unless required by applicable law or agreed to in writing, software
                            if (lazyValue == null) {
    protected Object getObjectValue(@NotNull OBJECT_TYPE item) {
        renderer.dispose();
        return false;
                                }
                if (element != groupingColumnPosition) {

                    }
            if (forUI && !sampleItems && renderer.isHyperlink(element, cellValue)) {
            return getText(element, true);
                // Cancel running job
                ObjectPropertyDescriptor property = getColumnByIndex(i).getProperty(object);
            editorActivationStrategy = new EditorActivationStrategy(treeViewer);
    private final static LazyValue DEF_LAZY_VALUE = new LazyValue("..."); //$NON-NLS-1$
    public class ObjectActionVisualizer extends ProgressVisualizer<Void> {
        public String toString() {
                            final int count = paths[0].getSegmentCount();
    protected CellLabelProvider getColumnLabelProvider(ObjectColumn objectColumn) {
            props.addAll(column.propMap.values());
                UIUtils.drawMessageOverControl(itemsViewer.getControl(), e.gc, "No items", 0);

        for (ObjectColumn col : columnController.getColumnsData(ObjectColumn.class)) {
    //////////////////////////////////////////////////////
                                // Do not paint over active editor
    @Override
                    if (prop != null) {
        }
        //itemsViewer.setLabelProvider(new ItemLabelProvider());
                            //return RuntimeUtils.makeExceptionStatus(e);
                UIUtils.asyncExec(() -> {
                return true;

                            }

                    synchronized (ObjectListControl.this) {
                    this.loadingJob.addJobChangeListener(new JobChangeAdapter() {
                return null;
        ObjectColumn objectColumn = null;
                        strValue = '"' + strValue + '"';

    }
            }
        private void moveGroupingColumnInTheBeginning(int groupingColumnPosition) {
                Rectangle ext = image.getBounds();
                monitor.subTask(NLS.bind(UINavigatorMessages.controls_object_list_monitor_load_props, objectName));
            if (monitor.isCanceled()) {
    // After content is loaded is always false (and all hyperlink cells have empty text)
                    }
        //editorActivationStrategy.setEnableEditorActivationWithKeyboard(true);
        return true;
        public ObjectsLoadVisualizer() {
                }

    private transient boolean sampleItems = false;
                text = text.substring(0, MAX_TOOLTIP_LENGTH) + "...";
     * @return image or null
                        Object object = getObjectValue(item);
                if (append) {
        clearLazyCache();
    }
     */
            }
                                renderer.paintCell(e, object, cellValue, e.item, prop.getDataType(), e.index, prop.isEditable(objectValue), (e.detail & SWT.SELECTED) == SWT.SELECTED);
    private class DefaultListPropertySource extends PropertySourceAbstract implements DBNNodeReference {
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
        public boolean performSearch(String searchString, int options) {
        private LazyValue(Object value) {
                    (options & SEARCH_CASE_SENSITIVE) != 0);
    }
    protected Color getObjectBackground(OBJECT_TYPE item) {
        this.originalContentProvider = contentProvider;
            String status;
            public void run() {
                if (columnsData[i].id.equals(id)) {
        }
                return CommonUtils.toString(cellValue);

                for (Object element : elements) {
                monitor.worked(1);
            if (cellValue instanceof LazyValue) {
            T adapter = DBUtils.getAdapter(adapterType, firstElement);
            }
                        break;
            itemsViewer.setInput(createViewerInput(Collections.emptyList()));
        private int tickCount = 0;
    protected void createColumn(@NotNull ObjectPropertyDescriptor prop) {
    public ISelectionProvider getSelectionProvider() {
                                // Add to tail
        }
        if ((style & SWT.SHEET) == 0) {
                            } else {
        }
    protected abstract LoadingJob<Collection<OBJECT_TYPE>> createLoadService(boolean forUpdate);
                        if (object instanceof DBPNamedObject) {
                    if (isTree) {

            Object cellValue = getCellValue(element, objectColumn, forUI);
        ObjectColumn[] columns = columnController.getColumnsData(ObjectColumn.class);
                }

                Image image = DBeaverIcons.getImage(UIIcon.LOADING.get(tickCount % UIIcon.LOADING.size()));
            }
                            boolean propHasValue = false;
        itemsViewer.getControl().addMouseListener(new MouseAdapter() {
            ObjectColumn[] columnsData = columnController.getColumnsData(ObjectColumn.class);
        renderer = createRenderer();
        public boolean select(Viewer viewer, Object parentElement, Object element) {
                                }

    private static final String EMPTY_GROUPING_LABEL = "<None>";
            }
                                    // Replace old object
            }
                                objectName = CommonUtils.toString(nameProperty.readValue(object, null, true));
        this.focusObject = object;
                List<ObjectPropertyDescriptor> allProps = ObjectAttributeDescriptor.extractAnnotations(propertySource, classList, propertyFilter);
     */
            itemsControl.setRedraw(true);
     * Must depend on object types
                    }
                    if (e.index < columnController.getColumnsCount()) {
    }
                loadService.syncRun();
                        }
import org.eclipse.swt.graphics.Color;
        if (contentProvider instanceof ITreeContentProvider) {
            if (element instanceof ObjectsGroupingWrapper) {
                // Pack columns
            }
        }
            if (ObjectListControl.this.isReadOnlyList()) {
            return;
                    for (int i = 0; i < columnsCount; i++) {
            }
 * You may obtain a copy of the License at
        private boolean matches(@Nullable CharSequence charSequence) {

        final TraverseListener traverseListener = e -> {
                                originalColumnOrder = ((TreeViewer) itemsViewer).getTree().getColumnOrder();
    protected void resetLazyPropertyCache(OBJECT_TYPE object, String property) {
import org.jkiss.dbeaver.ui.*;
                return false;
    }
    private final ObjectViewerRenderer renderer;
    }
        return new DefaultListPropertySource();
        if (contentProvider instanceof ITreeContentProvider) {
                if (ArrayUtils.isEmpty(elements)) {
                }
        if (listPropertySource != null) {
            for (Map.Entry<Class<?>, ObjectPropertyDescriptor> entry : column.propMap.entrySet()) {
import org.eclipse.jface.viewers.*;
            } else {
                if (previewValue != null) {
            // start loading service
    private static class ObjectsGroupingWrapper {
            for (Map.Entry<OBJECT_TYPE, List<ObjectColumn>> entry : objectMap.entrySet()) {

                        groupingColumn = null;
                        int newListSize = items.size();
                // interrupted

    protected void setFocusCell(Object object, ObjectColumn objectColumn) {
    protected void setCurListObject(@Nullable OBJECT_TYPE curListObject) {
import java.lang.reflect.InvocationTargetException;
                        }
                }
                int columnIndex = groupingColumn.columnIndex;
    public void loadData(boolean lazy) {
            }

                }
import org.jkiss.dbeaver.Log;
    protected Object getCellValue(@NotNull Object element, @NotNull ObjectColumn objectColumn, boolean formatValue) {
            }

        private final Pattern pattern;
                    }
                menuManager.add(new Separator());
                    List<OBJECT_TYPE> sampleList;

        }
            super(UINavigatorMessages.controls_object_list_job_props_read);
        return props;
                    @Override
            }
                            for (int i = 1; i < count; i++) {
            this(false);
        }
        synchronized (lazyCache) {
        List<OBJECT_TYPE> elementList = itemsViewer.getStructuredSelection().toList();
                }
    private PropertySourceAbstract listPropertySource;
            this.propMap.put(objectClass, prop);
                DBWorkbench.getPlatformUI().showMessageBox("Load", "Service is busy", true);
                    Object object = getObjectValue((OBJECT_TYPE) o);

                        } else {
    protected boolean cancelProgress() {

     * @param item list item
        }
    }
            table.setHeaderVisible(true);
        }
        synchronized (lazyCache) {
        getListPropertySource();
            super(id, viewer);
                        if (isTree) {
 */
                } finally {
                    doubleClickHandler.doubleClick(new DoubleClickEvent(itemsViewer, itemsViewer.getSelection()));
    }
            final CellLabelProvider labelProvider = getColumnLabelProvider(objectColumn);
                    }
                                    // This property already cached
            for (int element : originalColumnOrder) {
                        final ObjectColumn objectColumn = getColumnByIndex(e.index);
                ObjectColumn column = getColumnByIndex(i);

    public void repackColumns() {
        }
        // Add selection listener
                    public void run() {
                        null);
        return getListPropertySource().getPropertyValue(null, objectValue, prop, formatValue);
        public ObjectsLoadVisualizer(boolean forUpdate) {
                        }
    // Editor activation
                    // Update object list
                    Collections.addAll(classList, baseTypes);
import org.eclipse.swt.dnd.TextTransfer;
            return null;
                                            break;
                    int columnsCount = columnController.getColumnsCount();
        ITreeContentProvider contentProvider = (ITreeContentProvider) itemsViewer.getContentProvider();
            monitor.beginTask(UINavigatorMessages.controls_object_list_monitor_load_lazy_props, objectMap.size());
public abstract class ObjectListControl<OBJECT_TYPE> extends ProgressPageControl implements IClipboardSource {

                for (Object o : selection) {
//                    if (forTip || !booleanStyle.isText()) {
            if (isDisposed()) {
            return value.toString();
                    columnName = columnController.getColumnName(selectedColumnNumber);
                Object[] elements = super.getElements(inputElement);
    // Property source implementation
    }
    }
import org.eclipse.osgi.util.NLS;

        @Override
                        Object cellValue = getCellValue(object, objectColumn, true);
        return itemsViewer;
    }
        @Override
                    @Override
    }
            synchronized (lazyCache) {
                            }

    }
        }
                loadingJob.cancel();
                    }
                            // Check whether at least one item has this property
    }
                String objectName = GeneralUtils.makeDisplayString(getObjectValue(element)).toString();
            }
                        final OBJECT_TYPE object = (OBJECT_TYPE) e.item.getData();
        if (lazy) {
                    return EMPTY_STRING;
    public PropertySourceAbstract getListPropertySource() {
            tree.addTraverseListener(traverseListener);
        private final Object groupingKey;
            }
    @Nullable
            if (element instanceof ObjectsGroupingWrapper) {
                    @NotNull
        @Nullable
            tree.setHeaderVisible(true);
            return (element instanceof DBPNamedObject namedObject && matches(namedObject.getName())) ||

        return null;
                editingSupport);
    public void appendListData(Collection<OBJECT_TYPE> items) {
                                groupingColumn = getColumnByIndex(selectedColumnNumber);
                labelProvider,
        }
                            }
        if (objectValue == null) {
    // Edit

        private final boolean forUpdate;
                IPropertyFilter propertyFilter = new DataSourcePropertyFilter(
        if (itemsControl.isDisposed()) {
            newColumnOrder[0] = groupingColumnPosition;
                    if (!buf.isEmpty()) buf.append("\n");
        if (columnController != null) {
                            if (e instanceof InvocationTargetException) {
                                        // Just ignore this
                }
                if (objectValue != null) {
                        }
                if (reload) {

            }
    public ColumnViewer getItemsViewer() {
                    String objectName = null;
import org.jkiss.utils.CommonUtils;

    }
                if (!CommonUtils.isEmpty(elements)) {
            if (selection.isEmpty()) {

                        @Override
            if (lazyObjects == null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    private IDoubleClickListener doubleClickHandler;
            }
                } else {
     * @param item object
                                    if (!c.isInterface() && c.isAssignableFrom(theClass)) {

            int[] newColumnOrder = new int[originalColumnOrder.length];
        }
        }
        public Color getBackground(Object element) {
                                itemsViewer.setContentProvider(new GroupingTreeProvider());
            viewerStyle |= SWT.BORDER;
        if (columnController != null) {
    private static final class SearchFilter extends ViewerFilter {
            selectedText = copyGridToText();
        }
        void addProperty(Class<?> objectClass, ObjectPropertyDescriptor prop) {
    /**
        if (!isDynamicObject(object) && prop.isLazy(objectValue, true)) {
        GridData gd = new GridData(GridData.FILL_BOTH);
    @Nullable
            super.completeLoading(v);
    private final Map<OBJECT_TYPE, Map<String, Object>> lazyCache = new IdentityHashMap<>();
                    .map(x -> new ObjectsGroupingWrapper(x.getKey(), x.getValue()))
            String text = getText(element, true, true);
                            final ObjectPropertyDescriptor prop = getPropertyByObject(objectColumn, objectValue);
                    searchString,
    protected void addColumnConfigAction(IContributionManager contributionManager) {
                status = EMPTY_STRING; //$NON-NLS-1$
                    return new LazyValue(previewValue);
                return EMPTY_STRING;
import org.eclipse.swt.SWT;
    private boolean isTree;
                }
            tree.setColumnOrder(newColumnOrder);
import org.jkiss.dbeaver.ui.controls.ViewerColumnController;
    }
                    }
            super(itemsViewer);
        itemsViewer.setContentProvider(contentProvider);
                return EMPTY_STRING;
    private volatile LoadingJob<Collection<OBJECT_TYPE>> loadingJob;
                                        i++;
    //////////////////////////////////////////////////////
            // Copy all of them in tsv format
    private ObjectColumn focusColumn;
            columnController.dispose();
                    // ignore
                    break;
        List<ObjectColumn> objectColumns = lazyObjects.computeIfAbsent(object, k -> new ArrayList<>());
package org.jkiss.dbeaver.ui.navigator.itemlist;
                    } else {
        for (ObjectColumn column : columns) {
        @Override
                }
        @Override
            return getObjectForeground((OBJECT_TYPE) element);
            } catch (InterruptedException e) {
        }
                            if (itemsViewer.isCellEditorActive() && isFocusCell) {
        }
    protected abstract String getListConfigId(List<Class<?>> classList);
            ViewerCell cell = (ViewerCell) event.getSource();
                return objectImage == null ? null : DBeaverIcons.getImage(objectImage);
    }
            final ObjectPropertyDescriptor property = getProperty(object);

    }
        super.disposeControl();
                        if (!ArrayUtils.isEmpty(paths)) {
                // Set viewer content
                                OBJECT_TYPE oldObject = objectList.get(itemIndex);
                ((TreeViewer) itemsViewer).getTree().setColumnOrder(originalColumnOrder);
                            lazyLoadingJob.schedule(LAZY_LOAD_DELAY);
        return new ViewerRenderer();

    @NotNull
                    newColumnOrder[originalNumber] = element;
            return false;
        }
            }
        @Override
        }
                @Override

            if (prop.supportsPreview()) {
            if (charSequence == null) {

                                    Class<?> c = classList.get(i);
        }
    public void loadData() {
    private Tree getTree() {
        itemsControl.setRedraw(false);
        }
                                        if (propValue != null) {
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
                int groupElementsSize = 0;
        }

        String id;

        //if (!prop.isReadOnly(objectValue) && isNewObject(object)) {
            objectColumn.addProperty(propClass, prop);

    protected ObjectViewerRenderer createRenderer() {
    }
            super.fillConfigMenu(menuManager);


                // This may happen if list redraw happens during node dispose
                log.error(e.getMessage());
        }
                // Set real content
    private static class LazyValue {
                    return EMPTY_GROUPING_LABEL + (groupElementsSize > 0 ? " (" + groupElementsSize + ")" : "");
    }
            }
                    // Simply append new list to the tail
        return prop;
                        ((TreeViewer) itemsViewer).expandToLevel(4);
    protected void setListData(Collection<OBJECT_TYPE> items, boolean append, boolean forUpdate, boolean forceUpdateItems) {
            addExtraColumns(columnController, items);
                        itemsViewer.refresh();
    private Object focusObject;

                return Status.OK_STATUS;

                            objectList.add(newObject);
                            return value;
                    protected IStatus runInUIThread(@NotNull DBRProgressMonitor monitor) {
                List<Object> elements = ((ObjectsGroupingWrapper) element).groupedElements;
        public void beforeEditorDeactivated(ColumnViewerEditorDeactivationEvent event) {
                    if (!objectList.equals(items) || forceUpdateItems) {
        protected final ObjectColumn objectColumn;
        StringBuilder buf = new StringBuilder();
            final boolean reload = !append && (CommonUtils.isEmpty(objectList)) || (columnController == null);
            try {
                }
        }

            } catch (PatternSyntaxException e) {
                        }
        @Override
                        ((DBPDataSourceContainerProvider) ObjectListControl.this).getDataSourceContainer() :
                            if (!classList.contains(theClass)) {
        if (columnInfo == null) {
    }
            objectColumn = new ObjectColumn(prop.getId(), prop.getDisplayName());
        return null;
            log.warn("Cycled object tree: " + item);
        });

        @Override
                }
            return getObjectValue(getCurrentListObject());
                status = NLS.bind(UINavigatorMessages.controls_object_list_status_objects, selection.size());
                    if (selection instanceof TreeSelection) {
            if (CommonUtils.isEmpty(text)) {
        public void paintControl(PaintEvent e) {

//            if (!oldTitle.contains(prop.getDisplayName())) {
            }
        for (OBJECT_TYPE element : elementList) {
    }
                    Thread.sleep(dataLoadUpdatePeriod);
                            if (nameProperty != null) {
                    originalNumber++;

                    (bounds.height - ext.height) / 2);
        }
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
                            }


        for (Class<?> valueClass = objectValue.getClass(); prop == null && valueClass != Object.class; valueClass = valueClass.getSuperclass()) {
                    try {

            return getText(element, forUI, false);

        if (!objectColumns.contains(column)) {
        @Override
        public String getText(Object element, boolean forUI, boolean forTip) {
        if (element instanceof ObjectsGroupingWrapper) {

                            return true;



            return null;
            return matcher.find();
                }
import org.jkiss.dbeaver.utils.GeneralUtils;
        }
    }
                            }
    protected void loadData(boolean lazy, boolean forUpdate) {
        if (objectColumn == null) {
    private static final String EMPTY_STRING = "";
                }
                if (this.objectColumn == groupingColumn) {
    }

            }
        }
        }
            if (groupingColumn != null) {
        synchronized (this) {
    protected EditingSupport makeEditingSupport(ObjectColumn objectColumn) {
            clipboardData.addTransfer(TextTransfer.getInstance(), selectedText);
                OBJECT_TYPE childItem = (OBJECT_TYPE) child;
            lazyCache.clear();
            int dataLoadUpdatePeriod = 200;
                        propertySource.addProperty(prop);
        if (items == null) {
                isEmpty = ObjectListControl.this.getTree().getItemCount() == 0;
                if (!ArrayUtils.isEmpty(baseTypes)) {
import java.util.regex.Pattern;
            final EditingSupport editingSupport = makeEditingSupport(objectColumn);
            }
        if (lazyObjects == null) {
                return null;
        @Override
        }
        private ObjectsGroupingWrapper(@Nullable Object groupingKey, @NotNull List<Object> groupedElements) {


            for (int i = 0; i < columnsCount; i++) {
                        }
    private class ListPaintListener implements PaintListener {
                                    }
        }
            super(ObjectListControl.this, ObjectListControl.this, true);
            }
                    buf.append(strValue);
            return ObjectListControl.this.getCellValue(element, columnIndex);
            }
    }
        }
        }
                                // and we need to show "Name" instead of particular name props
        itemsViewer.addSelectionChangedListener(event -> {
        public EditorActivationStrategy(ColumnViewer viewer) {
        Set<DBPPropertyDescriptor> props = new LinkedHashSet<>();
    public void setDoubleClickHandler(IDoubleClickListener doubleClickHandler) {
                }
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
            return null;
    public void disposeControl() {
            for (int i = 0; i < columnsData.length; i++) {
            boolean isEmpty;
     * @return object which will be examined for properties
                            getControl().redraw();
            if (showTableGrid) {
            }
    private final static Object NULL_VALUE = new Object();
                                }
                Object objectValue = getObjectValue(childItem);
                            if (itemIndex >= objectList.size()) {
                    } catch (Throwable e) {
        }
        isFitWidth = fitWidth;
                final boolean columnPersist = selectedColumnNumber != -1;
    }
            });
            return;
                    if (reload) {
        @Override
    //////////////////////////////////////////////////////


                        restoreOriginalColumnsOrder();
            }
        }
                new AbstractUIJob("Progress painter") {
     *
                if (prop.isPassword() && cellValue instanceof String) {
        @Override
    }
    }
        }
        public Object getCellValue(Object element, int columnIndex) {
                tableViewer = CheckboxTableViewer.newCheckList(this, viewerStyle);
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
                        itemsViewer.refresh();
            showTableGrid = false;
            }

            if (prop != null) {
    }

import org.eclipse.swt.graphics.Font;
        return false;
            return super.getElements(inputElement);
            }
    @Override
    private Map<OBJECT_TYPE, List<ObjectColumn>> lazyObjects;
                            return;
                tableViewer = new TableViewer(this, viewerStyle);

    @NotNull
                    if (!classList.contains(objectValue.getClass())) {
                        final TreePath[] paths = ((TreeSelection) selection).getPathsFor(o);
                                // But keep interfaces because we may have multiple implementations of e.g. DBPNamedObject
            columnController.repackColumns();
                menuManager.add(
                }.schedule();
    private static final Log log = Log.getLog(ObjectListControl.class);
            if (!CommonUtils.isEmpty(selectedText)) {
            if (loadService != null) {

        protected boolean isEditorActivationEvent(ColumnViewerEditorActivationEvent event) {
        }
        DefaultListPropertySource() {
        } finally {
                    // Remove hidden properties (we need to check them against all items)
                                }
            lazyLoadingJob.schedule(LAZY_LOAD_DELAY);
            }
                    return null;
                    }
        return listPropertySource;
            }
            return;
        this.doubleClickHandler = doubleClickHandler;

                        }

                Rectangle bounds = getControl().getBounds();
            if (selection.size() > 1) {

        }

        }
                        try {
    protected class ViewerRenderer extends ObjectViewerRenderer {
                StringBuilder buf = new StringBuilder();
            // Multiple rows selected
                    }
        @NotNull
                // This may happen if list redraw happens during node dispose
            table.addTraverseListener(traverseListener);
                    }
                        lazyCache.put(element, objectCache);


import org.jkiss.dbeaver.ui.controls.ProgressPageControl;
        } else {
                        } else {
    private Table getTable() {
        }
    private synchronized void addLazyObject(OBJECT_TYPE object, ObjectColumn column) {
            if (objectValue == null) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
                                objectList.add(itemIndex, newObject);
                    if (value != null) {
                getItemsViewer().getControl().getCursor() == getItemsViewer().getControl().getDisplay().getSystemCursor(SWT.CURSOR_HAND)) {
            return Status.OK_STATUS;
        }

    public OBJECT_TYPE getCurrentListObject() {

    }
        } else {
    protected DBPImage getObjectImage(OBJECT_TYPE item) {
                cellValue = ((LazyValue) cellValue).value;
            if (cache != null) {
    private void clearLazyCache() {
            final Object objectValue = getObjectValue((OBJECT_TYPE) element);
            return getAllProperties().toArray(new DBPPropertyDescriptor[0]);

        public String getToolTipText(Object element) {
            }
            getItemsViewer().setFilters(new ViewerFilter[]{});


                    prop = entry.getValue();

        @Override
    //////////////////////////////////////////////////////

            if (element instanceof ObjectsGroupingWrapper) {
                    }
                            objectName = DBValueFormatting.getDefaultValueDisplayString(object, DBDDisplayFormat.UI);
    protected Color getObjectForeground(OBJECT_TYPE item) {
            if (!ArrayUtils.isEmpty(originalColumnOrder)) {
        }
        }
            isTree = true;
        }

import org.eclipse.core.runtime.Status;
    }
    @Nullable
 * ObjectListControl
        public void completeLoading(Void v) {
        this.lazyLoadCanceled = false;

            if ((viewerStyle & SWT.CHECK) == SWT.CHECK) {
            itemsViewer = treeViewer;
                        }
//                    return booleanStyle.getText((Boolean) cellValue);
        @Override
            Matcher matcher = pattern.matcher(charSequence);
                            loadingJob = null;

    }
        if (prop == null) {
            if (adapter != null) {
        }
    }
                            } else if (prop == null) {

                    if (objectList.size() > 200) {
                    List<Object> groupedElements = ((ObjectsGroupingWrapper) element).groupedElements;
            if (isEmpty) {
            final ObjectPropertyDescriptor prop = getPropertyByObject(objectColumn, objectValue);
    protected class ObjectColumnLabelProvider extends ColumnLabelProvider implements ILabelProviderEx {
 *

import org.jkiss.code.Nullable;
                synchronized (lazyCache) {
        public String toString() {
        return columnController.getColumnData(index);
                        public void done(IJobChangeEvent event) {
                    buf.append(objectName);
        if (this.listPropertySource == null) {
            // Looks like a bug in SWT: http://www.eclipse.org/forums/index.php/t/257325/
                final OBJECT_TYPE element = entry.getKey();
    }
        @Override
        private int[] originalColumnOrder;
    }

        //}
            if (text.length() > MAX_TOOLTIP_LENGTH) {
import org.eclipse.swt.layout.GridData;
                            if (cellValue != null && prop != null) {
        public void afterEditorDeactivated(ColumnViewerEditorDeactivationEvent event) {
        }
            }
                                buf.append('\t');
    private ObjectColumn groupingColumn;
                                for (OBJECT_TYPE item : items) {

    private class LazyLoaderJob extends AbstractJob {

        protected IStatus run(@NotNull final DBRProgressMonitor monitor) {
                }
        try {
    // Column descriptor

                            }
        // Non-editable properties are empty for new objects
 * you may not use this file except in compliance with the License.
        //PropertiesContributor.getInstance().addLazyListener(this);
                        if (lazyObjects == null || lazyObjects.isEmpty()) {

                prop.isNameProperty(),
            }

        @Override
                    public boolean isEnabled() {
                    if (monitor.isCanceled() || isDisposed()) {
            if (element instanceof ObjectsGroupingWrapper) {
                }
            }
    }

        int columnIndex;
                        }
                            nameColumn = column;
                    columnController = new GroupingViewerColumnController<>(getListConfigId(classList), getItemsViewer());
    public synchronized boolean isLoading() {
                    }
                    objectCache = lazyCache.get(element);
    @Nullable
                    (bounds.width - ext.width) / 2,

            //UIUtils.applyCustomTolTips(table);
        }

        }
                        columnController.repackColumns();
                    }
                    @Override
        return SWT.MULTI | SWT.FULL_SELECTION;
            int originalNumber = 0;
            switch (e.type) {
        }
            TableViewer tableViewer;
            }
                            }
                collectItemClasses(childItem, classList, collectedSet);
        public Object[] getElements(Object inputElement) {

                    columnController.setIsColumnVisible(i, visible);
                });

                            return null;

                for (int i = 0; i < dataLoadTimes; i++) {
    private static ObjectPropertyDescriptor getPropertyByObject(@NotNull ObjectColumn column, @Nullable Object objectValue) {
}
                if (!CommonUtils.isEmpty(items)) {


        }
            // Header
            return new Object[0];
                        return groupingColumn != null;
        return item;

    private class GroupingViewerColumnController<COLUMN, ELEMENT> extends ViewerColumnController<COLUMN, ELEMENT> {

        private void restoreOriginalColumnsOrder() {

    private synchronized Map<OBJECT_TYPE, List<ObjectColumn>> obtainLazyObjects() {

                loadingJob.cancel();
                                        }
            this.value = value;

        return objectList;
                        sampleList = objectList.subList(0, 100);
            }
            if (e.detail == SWT.TRAVERSE_RETURN && doubleClickHandler != null) {
                        break;
                if (monitor.isCanceled() || isDisposed()) {
                return false;
                objectList = createViewerInput(items);
                SearchFilter searchFilter = new SearchFilter(
     *
        @Override

                return null;
                        } else {

            OBJECT_TYPE object = (OBJECT_TYPE) element;
        public void fillConfigMenu(IContributionManager menuManager) {

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

            // Load data synchronously

    private static class EditorActivationListener extends ColumnViewerEditorActivationListener {
            return null;
import org.jkiss.dbeaver.runtime.properties.*;
        }
                            }
        configColumnsAction.setDescription(UINavigatorMessages.obj_editor_properties_control_action_configure_columns_description);

            }
                int selectedColumnNumber = columnController.getSelectedColumnNumber();
    protected ObjectColumn getColumnByIndex(int index) {
                    }

        @Override


        }
        public Object getSourceObject() {
        }
    public void setFitWidth(boolean fitWidth) {
    }
                // Just do nothing
                                            propHasValue = true;
                    return  CommonUtils.isEmpty((String) cellValue) ? EMPTY_STRING : "************";
        }
                                }
            setListData(items, false, forUpdate);
        @Override
//                    BooleanRenderer.Style booleanStyle = BooleanRenderer.getDefaultStyle();
                }
    @NotNull
                                return;
            TreeViewerEditor.create(treeViewer, editorActivationStrategy, ColumnViewerEditor.TABBING_CYCLE_IN_ROW);
        }
                });
                Class<?>[] baseTypes = getListBaseTypes(items);
    public ViewerColumnController<ObjectColumn, Object> getColumnController() {
    private final IContentProvider originalContentProvider;
            return UINavigatorMessages.controls_object_list_message_no_items;
        public Color getForeground(Object element) {
                        itemsViewer.setContentProvider(originalContentProvider);
                objectColumn,
        public Font getFont(Object element) {
                            }
                if (forUI && cellValue instanceof Boolean) {
            }
    @NotNull
                }
        return itemsViewer;

        public DBNNode getReferencedNode() {
import org.jkiss.dbeaver.model.runtime.AbstractJob;
    class ItemPaintListener implements Listener {
        @Override

        public String getText(Object element, boolean forUI) {
                return ObjectViewerRenderer.getCellString(cellValue, prop.isNameProperty());
                try {
            }
            return DEF_LAZY_VALUE;

            }
                try {
        int viewerStyle = getDefaultListStyle();
        @Override
import org.eclipse.core.runtime.IStatus;
                    continue;
        private ObjectColumn(String id, String displayName) {
        }
        return curListObject;
                                    objectList.set(itemIndex, newObject);
    protected void setListData(Collection<OBJECT_TYPE> items, boolean append, boolean forUpdate) {
        Object objectValue = getObjectValue(object);
                }
                return;
import org.eclipse.swt.events.*;

                    new Action(NLS.bind(UINavigatorMessages.object_list_control_group_by_label, CommonUtils.notEmpty(columnName)), null) {
            final LoadingJob<Collection<OBJECT_TYPE>> loadService = createLoadService(forUpdate);
