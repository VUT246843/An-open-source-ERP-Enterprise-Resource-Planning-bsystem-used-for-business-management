                if (object instanceof DBSEntity && object.getDataSource().getContainer().getNavigatorSettings().isMergeEntities()) {
                // Skip system objects
            if (reflect) model.fireNodeUpdate(source, this, DBNEvent.NodeChange.REFRESH);
                meta = children.getFirst();
    }
                    if (childrenType != null) {
        if (meta instanceof DBXTreeFolder folder) {
import org.jkiss.dbeaver.model.struct.rdb.DBSSequence;
        Object object,
        }
                        break;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            if (mergeEntities && childItem instanceof DBSSchema) {
        return childNodes;

        }
        private final Object valueObject;
            return false;
        if (childrenClass != null) {
            model.removeNode(this, reflect);
     *
            boolean added = false;
    }
        return filtered;
    }
    }
    @Override
    private static boolean isStructDataType(DBSDataType dataType) {
            }
            DBSDataType dataType = DBUtils.getDataType(getDataSource(), typedObject);
        try {
                        .toArray(DBNDatabaseDynamicItem[]::new);
                // No params - just read it
            Object valueObject = getValueObject();
        }
                // Read with progress monitor
        if (propertyName.contains(".")) {
                }
        if (dataType == null) {
        return nodeId;
        // Read property using reflection
    protected abstract boolean reloadObject(DBRProgressMonitor monitor, DBSObject object);
import org.jkiss.dbeaver.model.runtime.DBRProgressListener;
    public boolean allowsChildren() {
    @Nullable
        DBSObject object = getObject();
                    pathName.insert(0, '/');
            }
                continue;
        if (getObject() instanceof DBPQualifiedObject qo) {
        }
                continue;
                for (int i = 0; i < childNodes.length; i++) {
    public abstract Object getValueObject();
        boolean supportsOptionalFolders = false;
     * Refreshes node.
                    return null;

        for (DBNNode p = getParentNode(); p != null; p = p.getParentNode()) {
    }
            for (DBXTreeNode childMeta : childMetas) {
                    synchronized (this) {
                        if (oldChild.hasChildren(false) && !oldChild.needsInitialization()) {
        }
                    toList.add(
        }
            return null;
    protected DBNDatabaseNode(DBNNode parentNode) {
                } else */{
        }
    @NotNull
        Object source,
        }
    private static Object extractPropertyValue(
        }
            }
                    return this;
    @Nullable
    }

            }
 * limitations under the License.
        super(parentNode);
                        }
                    }
        DBXTreeItem meta,
                    return true;
                // Read with progress monitor
        Object source,
     * @param meta    items meta info
                boolean isMatchingFilter;
    }
            for (DBNNode child : childrenCopy) {
        DBXTreeNode meta = getMeta();

    }
                                loadChildren(monitor, optionalItem, oldList, toList, source, reflect);
        }
            }
            if (ex.getTargetException() instanceof DBException dbe) {
                DBNDatabaseItem treeItem = new DBNDatabaseItem(this, meta, object, true);
    private boolean isEntityMeta(DBXTreeNode node) {
                continue;
            }
                if (!isMatchingFilter) {
        Class<?> childrenClass = this.getChildrenClass(childMeta);
                            }
import org.jkiss.dbeaver.DBException;
    public boolean setNodeFilter(DBXTreeItem meta, DBSObjectFilter filter, boolean saveConfiguration) {
        }
                        return null;
    }
            };
import java.lang.reflect.Type;
        if (object1 == object2) {
                        } else {
            return null;
                            log.error("Optional item '" + optionalPath + "' not found in folder " + child.getId());
 * you may not use this file except in compliance with the License.
            } else if (paramTypes.length == 1 && paramTypes[0] == DBRProgressMonitor.class) {
            } else if (child instanceof DBXTreeObject treeObject) {
    public DBNNode refreshNode(@NotNull DBRProgressMonitor monitor, @Nullable Object source) throws DBException {
            return false;
    }

                    // Fall down
            this.meta = meta;
            // check it
        }
        throws DBException {
            Collections.addAll(oldList, oldListCmp);
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
                return null;
                    }
                            this.childNodes = tmpList.toArray(new DBNDatabaseNode[0]);
            } else if (child instanceof DBXTreeFolder treeFolder) {
                    }
    public DBCExecutionContext getExecutionContext() {
    @Nullable
        }
                }
    private static class PropertyValueReader implements DBRRunnableParametrized<DBRProgressMonitor> {
        }
                        // Load new folders only if there are no old ones
                // Not persisted node - nothing to refresh
                return null;
                parentObject = null;
     * @param reflect @return true on success
    }
    }
        } catch (Exception e) {
    @Override
                log.warn("Can't read property '" + propertyName + "' - bad method signature: " + getter);
            } else if (paramTypes.length == 1 && paramTypes[0] == DBRProgressMonitor.class) {
                }

                // Skip hidden objects
    }
                        // Then we try to go on next DBX level
     * @param showDefaults  return some default value if actual name is empty. otherwise returns null
                getParentNode() instanceof DBNDatabaseNode dbNode &&

                    }
                    final DBNDatabaseNode child = childNodes[i];
        }
        }
                        iterator.remove();
                throw new DBCException("Error reading child elements", e.getTargetException());
                if (oldList == null) {
            this.monitor = monitor;
    private static final DBNDatabaseNode[] EMPTY_NODES = new DBNDatabaseNode[0];
                    if (!isLoaded && item.isOptional() && item.getRecursiveLink() == null) {
                                oldFolder.reloadChildren(monitor, source, reflect);
            } else {
}
        }
                }
        }
            if (node instanceof DBNDatabaseNode dbNode) {
    DBNDatabaseNode[] getChildNodes() {


                default -> false;
        this.locked = true;
            if (getter == null) {
        clearChildren(reflect);

    }
                } else {


        return locked || super.isLocked();
 */
                // Skip all DBA objects
        }
                }
    @Override

import org.jkiss.dbeaver.model.struct.rdb.DBSPackage;
    public boolean isFiltered() {
            if (childNodes == null) {
            } else {
                DBXTreeNode meta = dbNode.getMeta();
            return childrenClass != null && DBSTypedObject.class.isAssignableFrom(childrenClass);
        DBNDatabaseNode[] oldChildren;
        }


     * Reorder children nodes
import java.lang.reflect.InvocationTargetException;
                /*if (hideSchemas && isSchemaItem(item)) {
            return "";
            // Extract property recursively
                pathName.insert(0, type);
        }
            } catch (InvocationTargetException e) {
        final DBSObject object = getObject();
            model.addNode(this, false);
            if (cn instanceof DBXTreeItem treeItem) {
        private final DBXTreeItem meta;
            return false;
                getModel().fireNodeUpdate(source, this, DBNEvent.NodeChange.REFRESH);
                if (CommonUtils.isEmpty(type)) {
    ////////////////////////////////////////////////////////////////////////////////////

        String propertyName = meta.getPropertyName();
        // Read property using reflection
 *
    private volatile boolean locked;
                loadChildren(monitor, getMeta(), null, tmpList, this, true);
                    objectName = object.getName();
            return false;
            List<DBXTreeNode> children = folder.getChildren(this);
        } finally {
            } else if (isVirtual() &&
                }
            if (CommonUtils.isEmpty(objectName)) {
                    }
            }
            if (childItem == null) {
            } else {
                    );
        }
        synchronized (this) {
            } else {
        return null;
        DBNModel model = getModel();
                    if (optionalPath != null) {
                    continue;
        {
                        }
                throw new InvocationTargetException(e);
        DBNNode childNode = null;

            List<Class<?>> result = new ArrayList<>();
        }
        DBXTreeItem meta
        } catch (InvocationTargetException ex) {
    }

            }
                    } else {
        }
            return true;

                if (meta.isVirtual()) {
            refreshNodeContent(new VoidProgressMonitor(), getObject(), this, reflect);
    public DBNDatabaseNode[] getChildren(@NotNull DBRProgressMonitor monitor) throws DBException {

    private void clearChildren(boolean reflect) {
                return;
                !DBSDataType.class.isAssignableFrom(nodeChildClass) &&
            return;
            DBNUtils.disposeNode(childNode, true);
        }
        if (getObject() == null) {
        try {
    }
        }
        }
            DBXTreeNode meta = getMeta();
        DBNDatabaseNode[] childrenCopy;

            return dbNode.getDataSource();
            log.debug("Null child meta specified");

                }
    @Override
            nodeChildClass = getChildrenClass(treeItem);
    private void refreshNodeContent(final DBRProgressMonitor monitor, DBSObject newObject, Object source, boolean reflect)
                break;
     * Get name with parameters
            if (!added) {
    public boolean needsInitialization() {
                return null;
     * Extract items using reflect api
    private void loadChildren(
                }
            getModel().fireNodeUpdate(this, this, DBNEvent.NodeChange.REFRESH);
    /**
        if (propertyValue == null) {
        return childNodes;
        List<DBNDatabaseNode> oldList = new LinkedList<>();
        synchronized (this) {
            return null;
                    if (child.getObject() == object) {

        List<DBXTreeNode> metaChildren = getMeta().getChildren(this);
        Class<?> childrenClass = this.getChildrenOrFolderClass(meta);
            (DBSEntity.class.isAssignableFrom(nodeChildClass) &&
            }
            try {
    void clearNode(boolean reflect) {
        final DBXTreeNode meta,
                object = extractDynamicPropertyValue(monitor, object, fieldName);
     * navigation model - each occurrence will be refreshed then.
                    newObject[0] = refreshableObject.refreshObject(monitor));
            }
            log.warn("Attempt to refresh locked node '" + getNodeDisplayName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$
        final List<DBNDatabaseNode> toList,
            throw new DBException("Can't read " + propertyName + ": " + ex.getTargetException().getMessage(), ex.getTargetException());
                        toList.add(


import org.jkiss.dbeaver.runtime.DBInterruptedException;
                parentObject = dbsObject;
    @Nullable
            return false;
                continue;
                    pathName.insert(0, '/');
            }
                return false;
    @Override
    @Override
                dataSource.persistConfiguration();
/*
            }
            }
                }
import java.util.*;
        }
     */
        }
                // skip folders
        if (itemList.isEmpty()) {
            return;
        return meta.getNodeTypeLabel(getObject().getDataSource(), null); //$NON-NLS-1$
     * @param oldListCmp previous child items
                }
                // Nothing to reload
    @Override
        StringBuilder pathName = new StringBuilder(100);
    public DBSObjectFilter getNodeFilter(DBXTreeItem meta, boolean firstMatch) {
        if (valueObject == null) {
                return getter.invoke(object);
            Class<?> childrenClass = getChildrenClass(item);
                continue;
    public boolean hasChildren(@NotNull DBRProgressMonitor monitor, @NotNull DBXTreeNode childType) throws DBException {
                        // This may occur only if no child nodes was read
        Type propType = getter.getGenericReturnType();
        private final DBRProgressMonitor monitor;
                            // Refresh children recursive
    public abstract DBXTreeNode getMeta();
        if (childrenCopy != null) {

        if (childNodes != null) {
     * Do not actually changes navigation tree. If some underlying object is refreshed it must fire DB model
    }
        if (getObject() instanceof DBSTypedObject typedObject) {
            childNodes = newChildren.toArray(new DBNDatabaseNode[0]);
            // disposed?
                monitor.subTask(ModelMessages.model_navigator_load_.trim() + " " + propertyName);
     * @param monitor progress monitor
    public DBXTreeFolder getFolderMeta(Class<?> childType) {
        } else {
    @Override
        boolean showSystem,
                throw dbe;
                if (hideFolders) {
            return false;
                // Simply add new item
    }
    public DBPDataSourceContainer getDataSourceContainer() {
        final boolean showSystem = navSettings.isShowSystemObjects();
                    continue;
                try {
            if (p instanceof DBNDataSource dataSource) {
    }
                    }
        Class<?> nodeChildClass = null;
    }
            }
                continue;
            try {
        DBSObject object = getObject();
            oldChildren = Arrays.copyOf(childNodes, childNodes.length);

            }
            childNodes = null;
            return null;
        }
    }
    public String getNodeItemPath() {
            if (!ArrayUtils.isEmpty(childNodes)) {

        }
        if (object1 == null || object2 == null) {
            } else {
            Object parentObject = getValueObject();
     * @throws DBException on any internal exception
                log.warn("Unsupported meta node type: " + child); //$NON-NLS-1$
    public String getNodeDescription() {
        }
        if (object == null || meta == null) {
        }
                DBSObject[] newObject = new DBSObject[1];
        }
                    }
        if (model != null) {
                        found = true;
        for (Object childItem : itemList) {
     * @return real refreshed node or null if nothing was refreshed
    public boolean initializeNode(@Nullable DBRProgressMonitor monitor, @Nullable DBRProgressListener onFinish) throws DBException {
            return false;
 * You may obtain a copy of the License at
            }
        if (metaChildren == null) {
            final DBNDatabaseItem newChild = new DBNDatabaseItem(this, metaChildren, object, false);
 *
                } else {
        }
                        toList.add(oldChild);
            objectName = object.getName();
            if (DBUtils.isHiddenObject(childItem)) {
 */
        return childrenClass;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        throws DBException {
        }

                            this.childNodes = EMPTY_NODES;
        return DBUtils.getDefaultContext(getObject(), true);
                childrenClass,
                // No params - just read it
    }
        try {

            if (this.initializeNode(monitor, null)) {
        List<DBXTreeNode> childMetas = useMeta == null ? getMeta().getChildren(this) : Collections.singletonList(useMeta);
            DBSDataType dataType = DBUtils.getDataType(getDataSource(), typedObject);
 * Unless required by applicable law or agreed to in writing, software

        return getPlainNodeName(false, true);
            }
        }
            metaChildren = getFolderMeta(object.getClass());
import org.jkiss.utils.ArrayUtils;
        if (image == null) {
import org.jkiss.code.NotNull;

        }
        if (needsLoad && !monitor.isForceCacheUsage()) {
                } catch (DBException e) {
        DBSObject object = getObject();
            if (filter != null) {
                    // Remove old child object
                case STRUCT -> dataType instanceof DBSEntity;
            filter.setCaseSensitive(dataSource.getSQLDialect().hasCaseSensitiveFiltration());
        final Object valueObject = getValueObject();
    }

    ) throws DBException {
            return super.getNodeFullName();
        return false;
            if (saveConfiguration) {
                } else {
            return object.getDataSource();
            getModel().fireNodeEvent(new DBNEvent(this, DBNEvent.Action.ADD, DBNEvent.NodeChange.LOAD, newChild));
            Method getter = meta.getPropertyReadMethod(object.getClass());
            }
                        break;
                return treeItem;
            if (valueObject instanceof DBSObject dbsObject && !(valueObject instanceof DBPDataSource)) {
            }
            this.reloadChildren(monitor, source, reflect);
            image = DBNModel.getStateOverlayImage(image, so.getObjectState());
                objectName = ovrObject.getOverloadedName();
    }
        }
            }

    @Override
                log.warn("Can't find property '" + propertyName + "' read method in '" + object.getClass().getName() + "'");
        if (this.isDisposed()) {
            nodeChildClass = getFolderChildrenClass(treeFolder);
                                toList.add(oldFolder);
                    return true;
            // Get top-most parent node
        return false;
     *
    /**
                if (!monitor.isCanceled()) {
                boolean found = false;
            }
        Method getter = childMeta.getPropertyReadMethod(valueObject.getClass());

                        object.getName(),

            }
        }
                        continue;


                                continue;
                return getter.invoke(object);

                        if (optionalItem == null) {
            if (children.size() == 1) {
                !DBSPackage.class.isAssignableFrom(nodeChildClass)) ||
                for (Object childItem : itemList) {
        }
import org.jkiss.utils.BeanUtils;

            if (newObject != getObject()) {
     */
            throw new DBException("Can't read " + propertyName + ": " + ex.getTargetException().getMessage(), ex.getTargetException());
import org.jkiss.dbeaver.model.struct.*;
    }
                object.getParentObject() != null &&
                }
                    if (attributes == null) {
        this.filtered = filter != null && !filter.isNotApplicable();
        }
                        overloadedObject.getOverloadedName()
            }


        } else {
            if (dataType instanceof DBSEntity dtEntity) {
    }
        if (getObject() instanceof DBPToolTipObject ttObject) {
            }
    public boolean isVirtual() {
    void unregisterNode(boolean reflect) {
        }
    public List<Class<?>> getChildrenTypes(DBXTreeNode useMeta) {

        List<DBXTreeNode> metaChildren = getMeta().getChildren(this);
import org.jkiss.code.Nullable;
            return Collections.emptyList();
    public boolean isDynamicStructObject() {
                            new DBNDatabaseFolder(this, (DBXTreeFolder) child));
        if (!useSimpleName) {
        }
 * DBNDatabaseNode

            }
            DBPDataSource dataSource = object.getDataSource();
        loadChildren(monitor, getMeta(), oldChildren, newChildren, source, reflect);
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
            return super.getNodeBriefInfo();
        if (getObject() instanceof DBPObjectWithLongId longObject) {
                        DBXTreeItem optionalItem = treeFolder.getChildByPath(optionalPath);
        DBPDataSourceContainer dataSource = getDataSourceContainer();
    }
                return;
        return objectName;
        }
            }

        }
                }
                // Skip schemas in merge entities mode
                        childNodes = ArrayUtils.remove(DBNDatabaseNode.class, childNodes, i);
     * @throws DBException on any DB error
    void registerNode() {
                objectName = object.getClass().getName() + "@" + object.hashCode(); //$NON-NLS-1$

import org.jkiss.utils.CommonUtils;
                            toList.add(oldObject);
                // Show system catalog/schema in case when only one object in the itemList
        throws DBException {
        clearChildren(reflect);
            if (!(childItem instanceof DBSObject object)) {
                    for (DBNDatabaseNode oldObject : oldList) {
        for (DBXTreeNode child : childMetas) {
            objectName = object.toString();
    @Override
        }
        }
            }
    @Override
                    List<? extends DBSEntityAttribute> attributes = dtEntity.getAttributes(new VoidProgressMonitor());
                    }
        return true;
    }
            this.valueObject = valueObject;
                    objectName = DBUtils.getObjectFullName(object, DBPEvaluationContext.UI);
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeObject;
    }
            if (dsc == null) {
            }
                    log.error(e);
        DBNModel model = getModel();
        DBNBrowseSettings navSettings = container.getNavigatorSettings();
    }
            if (paramTypes.length == 0) {
            for (DBNDatabaseNode child : childNodes) {
            if (object instanceof DBPOverloadedObject ovrObject) {
    /**
    protected boolean hasDynamicStructChildren() {
                    if (child.isVirtual() || treeFolder.isAdminFolder()) {
        if (reflect && filtered) {

        } else {
            return false;
    private boolean loadTreeItems(
 * DBeaver - Universal Database Manager
        } else {
        }
            log.warn("Error accessing items " + propertyName, ex);
import org.jkiss.dbeaver.model.access.DBAObject;


                        oldChild.reloadObject(monitor, object);
            log.warn("Error accessing items " + propertyName, ex);
        boolean reflect
                return getter.invoke(object, monitor);
            if (child instanceof DBXTreeItem item) {
                    DBNUtils.disposeNode(oldChild, true);
            // There is no item meta. Maybe we are under some folder structure
            return null;
            }
                object.getParentObject() != dbNode.getValueObject())
            image = meta.getIcon(this);
    // Reflection utils
            return false;
        DBSObject object = getObject();
    }
                }
        }
    protected DBNDatabaseDynamicItem[] getDynamicStructChildren() {
        DBPDataSourceContainer dataSource = getDataSourceContainer();
            }
                }
                                // Go on next DBX level
    @Nullable
                            if (optionalValue == null || (optionalValue instanceof Collection<?> col && col.isEmpty())) {
            log.error("Cannot add child item to " + getNodeDisplayName() + ". Conditions doesn't met"); //$NON-NLS-1$ //$NON-NLS-2$
        }
            (DBSObjectContainer.class.isAssignableFrom(nodeChildClass) &&
                continue;
            }
        DBPDataSource dataSource = getDataSource();
        Object valueObject = getValueObject();
                        dbNode.removeChildItem(object);
                continue;
                                break;
                }
        if (model != null) {
        }
                return getter.invoke(object, monitor);
    @Override
                        loadChildren(monitor, item, oldList, toList, source, reflect);
            return result;
            } else if (node instanceof DBNDatabaseFolder dbFolder) {
        } catch (DBException e) {
        String nodeId = super.getNodeId();
        }
            }
            }
        if (isLocked()) {
    public boolean allowsNavigableChildren() {
                !DBSPackage.class.isAssignableFrom(nodeChildClass)) ||
    }
/**
    }
            childrenClass = dbnContainer.getChildrenClass();
                    this.afterChildRead();
                    if (oldChild.getMeta() == meta && equalObjects(oldChild.getObject(), object)) {

        } catch (IllegalAccessException ex) {
        if (meta instanceof DBXTreeItem item) {
                    if (childItem instanceof DBSObject && equalObjects(oldChild.getObject(), (DBSObject) childItem)) {
                log.warn("Bad item type: " + childItem.getClass().getName()); //$NON-NLS-1$
    boolean hasChildItem(@NotNull DBSObject object) {
            for (DBNDatabaseNode child : children) {
        if (!(propertyValue instanceof Collection<?> itemList)) {
            dataSource.setObjectFilter(
        return !isDisposed() && (this.getMeta().hasChildren(this) || hasDynamicStructChildren());
    }

     * @param useSimpleName do not append any qualifiers to the name. Usually sued for functions like rename
        final List<DBNDatabaseNode> toList,
            } else {
    public DBPImage getNodeIcon() {
        } else if (node instanceof DBXTreeFolder treeFolder) {
        }
                return treeFolder;
            if (!isDynamicStructObject()) {
            Class<?>[] paramTypes = getter.getParameterTypes();
                } else {
        }
            return false;
                valueReader.run(monitor);
        boolean needsLoad;
                } else {
        }
                if (childMeta instanceof DBXTreeItem treeItem) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * If refresh cannot be done in this level then refreshes parent node.
            supportsOptionalFolders = swoe.hasOptionalFolders();
            return object;
public abstract class DBNDatabaseNode extends DBNNode implements DBNLazyNode, DBSWrapper, DBPContextProvider, DBPDataSourceContainerProvider {
                        } else {

                }
        Class<?> childrenClass = this.getChildrenOrFolderClass(meta);
            return null;
 * See the License for the specific language governing permissions and
                    continue;
                    isMatchingFilter = filter.matches(object.getName());
                !DBSSequence.class.isAssignableFrom(nodeChildClass) &&
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (getter == null) {
    }
                    if (parentNode instanceof DBNDatabaseNode dbNode) {
        } catch (InvocationTargetException ex) {
    @Nullable
                    type = node.getName();
        super.dispose(reflect);
                        if (tmpList.isEmpty()) {
                            break;
        final Object propertyValue = valueReader.propertyValue;
                if (!found) {
                    boolean isLoaded = loadTreeItems(monitor, item, oldList, toList, source, showSystem, hideFolders, mergeEntities, reflect);
    @Nullable
    @Override
        for (DBNNode node = this; node instanceof DBNDatabaseNode; node = node.getParentNode()) {

        throw new IllegalStateException("No datasource is associated with database node " + this);
        }
                }
                pathName.insert(0, '/');
            return;
            return switch (dataType.getDataKind()) {
            nodeId += "_" + longObject.getObjectId();
            for (String fieldName : propertyName.split("\\.")) {
        synchronized (this) {
        @Override
                this.filtered = false;
            // Now remove all non-existing items
    public String getPlainNodeName(boolean useSimpleName, boolean showDefaults) {
                    }
import org.jkiss.dbeaver.model.exec.DBCException;
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (getter == null) {
            }
        } else {
    @Deprecated
        final PropertyValueReader valueReader = new PropertyValueReader(monitor, meta, valueObject);
        return null;
                }
            DBNDatabaseDynamicItem[] dsc = getDynamicStructChildren();
        }
        if (childrenClass != null) {
        boolean mergeEntities,
 *

            if (ex.getTargetException() instanceof DBException dbe) {
    @Override
    @NotNull
                return this;
        synchronized (this) {
        String objectName;
        } else {
        }
    public boolean isLocked() {
            if (!oldList.isEmpty()) {
            log.error("Error reordering node children", e);
    }
        if (childrenClass == null && this instanceof DBNContainer dbnContainer) {
            onFinish.onTaskFinished(Status.OK_STATUS);
            if (node instanceof DBNDataSource) {
    @Override
                        break;
            if (monitor.isCanceled()) {
    public void updateChildrenOrder(boolean reflect) {
            Class<?>[] paramTypes = getter.getParameterTypes();
    public Class<?> getChildrenClass(DBXTreeItem childMeta) {

                        new DBNDatabaseObject(this, treeObject));
    @Override

            DBExecUtils.tryExecuteRecover(monitor, dataSource, valueReader);
        List<DBXTreeNode> childMetas = meta.getChildren(this);

        }
                    loadChildren(monitor, child, oldList, toList, source, reflect);
                if (newObject[0] == null) {
        boolean mergeEntities = navSettings.isMergeEntities();
    }

            } catch (DBException e) {
            {
            return;
    void addChildItem(@NotNull DBSObject object) {
            }
    private void reloadChildren(DBRProgressMonitor monitor, Object source, boolean reflect)
                }
                if (oldChild.getMeta() != meta) {
            pathName.insert(0, DBNUtils.encodeNodePath(node.getNodeDisplayName()));
                return dataSource.getDataSourceContainer();

        final DBNDatabaseNode[] oldListCmp,
            return true;
    }
                DBNUtils.disposeNode(child, reflect);
                    // Wrong type
     * @param toList  list ot add new items   @return true on success
                            oldChild.reloadChildren(monitor, source, reflect);
        final DBNDatabaseNode[] oldList,
                            Object optionalValue = extractPropertyValue(monitor, getValueObject(), optionalItem);
            Collections.addAll(toList, dsc);
        return true;
                        for (DBNDatabaseNode oldFolder : oldList) {
                }
        }
                throw new DBInterruptedException("Connection was canceled");
        if (object == null) {
        if (isDisposed()) {
            if (!pathName.isEmpty()) {
            return false;
            Method getter = DBXTreeItem.findPropertyReadMethod(object.getClass(), propertyName);
                if (hideFolders || ((mergeEntities || supportsOptionalFolders) && treeFolder.isOptional())) {
        if (oldListCmp != null) {
        return !isDisposed() && this.getMeta().hasChildren(this, true);
    }
        PropertyValueReader(DBRProgressMonitor monitor, DBXTreeItem meta, Object valueObject) {
import org.jkiss.dbeaver.model.exec.DBExecUtils;
    private boolean filtered;
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeFolder;
                    // Load new objects only if there are no old ones

            DBSEntityAttribute.class.isAssignableFrom(nodeChildClass) ||
                if (child.getObject() == object) {
                            }
                    }
            needsLoad = childNodes == null && hasChildren(false);
        return null;
            return ttObject.getObjectToolTip();
    public String getNodeDisplayName() {
        }
            }
            if (!(node instanceof DBNDatabaseItem) && !(node instanceof DBNDatabaseObject)) {
    }
        if (image != null && object instanceof DBPStatefulObject so) {
                DBXTreeFolder folderMeta = dbFolder.getMeta();
                            oldObject.reloadChildren(monitor, source, reflect);
    }
        }
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
        DBXTreeNode metaChildren = getItemsMeta();
        return
        }
    private static Object extractDynamicPropertyValue(DBRProgressMonitor monitor, Object object, String propertyName) throws DBException {
            return null;

     * @param monitor progress monitor
    @NotNull
            return isStructDataType(dataType);
        }
        }
    public Class<?> getChildrenOrFolderClass(DBXTreeItem childMeta) {
            if (paramTypes.length == 0) {
        return false;
            if ((!showSystem && DBUtils.isSystemObject(childItem)) &&
                reloadObject(monitor, newObject);
            // check it
        // Do nothing
        if (nodeChildClass == null) {
import org.jkiss.dbeaver.model.*;
                !CommonUtils.equalObjects(DBUtils.getObjectUniqueName(object1), DBUtils.getObjectUniqueName(object2))) {
        } else {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        if (CommonUtils.isEmpty(childMetas)) {
import java.lang.reflect.Method;
    }

        if (childNode != null) {
                        }
            return null;
     */
        if (getObject() instanceof DBSTypedObject typedObject) {
                    if (oldList == null) {
        if (CommonUtils.isEmpty(childMetas)) {
        synchronized (this) {
        }


            if (parentObject instanceof DBPDataSource) {
        DBPImage image = DBValueFormatting.getObjectImage(object, false);

            }
        for (DBNNode node = this; node != null; node = node.getParentNode()) {
        boolean hideFolders,
                        added = true;
                log.warn("Can't read property '" + propertyName + "' - bad method signature: " + getter);
        }
            if (object.isPersisted() && dataSource != null) {
            if (cn instanceof DBXTreeFolder treeFolder && childType.getName().equals(treeFolder.getType())) {
     * @param showSystem include system objects
        }
                String type = folderMeta.getIdOrType();

                        if (oldObject.getMeta().equals(child)) {
            DBSInstance.class.isAssignableFrom(nodeChildClass);
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeNode;
        if (dataSource instanceof DBPDataSourceWithOptionalElements swoe) {
                objectName = object.getParentObject().getName() + "." + object.getName();
                for (Iterator<DBNDatabaseNode> iterator = oldList.iterator(); iterator.hasNext(); ) {
        boolean reflect)

        }
            return dataSource.getObjectFilter(childrenClass, parentObject, firstMatch);
    public DBPDataSource getDataSource() {
            synchronized (this) {
            log.warn("Bad property '" + meta.getPropertyName() + "' value: " + propertyValue.getClass().getName()); //$NON-NLS-1$ //$NON-NLS-2$
        return false;

        for (DBXTreeNode cn : metaChildren) {
                return null;
        } else {
                }
        DBRProgressMonitor monitor,
            if (object1.getClass() != object2.getClass() ||
                    }
    @NotNull
            if (hideFolders && (childItem instanceof DBAObject || childItem instanceof DBPSystemInfoObject)) {
        final boolean hideFolders = navSettings.isHideFolders();
    public String getNodeId() {
        return getObject() == null ? null : getObject().getDescription();
                if (object == null) {
            // Property reading can take really long time so this node can be disposed at this moment -
            // Property reading can take really long time so this node can be disposed at this moment -
    @NotNull
        if (childMeta == null) {
                // Check that new object is a replacement of old one
                    return attributes.stream().map(o -> new DBNDatabaseDynamicItem(this, o))
    }
                !(itemList.size() == 1 && (childItem instanceof DBSSchema || childItem instanceof DBSCatalog))) {
                        }
    }
                    // Merge
            }
     *

        if (parentNode instanceof DBNDatabaseNode dbNode) {
                    Class<?> childrenType = getChildrenClass(treeItem);
        return false;
        }
                        result.add(childrenType);
import org.eclipse.core.runtime.Status;
            // Let's find a folder with right type
                    return true;
        if (object instanceof DBPRefreshableObject refreshableObject) {
                toList.add(treeItem);
        return BeanUtils.getCollectionType(propType);
            }
        if (object == null) {
        }
    protected void afterChildRead() {
        }
    void removeChildItem(@NotNull DBSObject object) {
            return false;
                    DBNDatabaseNode oldChild = iterator.next();
        {
import org.jkiss.dbeaver.model.runtime.DBRRunnableParametrized;
        } catch (IllegalAccessException ex) {
    }
    }
                return false;

    protected static boolean equalObjects(DBSObject object1, DBSObject object2) {
            DBSObject parentObject = null;
        return childNodes == null && hasChildren(false);

                    return null;
            log.debug(e);

        final boolean showOnlyEntities = navSettings.isShowOnlyEntities();
        // Extra check for DBSDataType, DBSSequence, DBSPackage - in some databases they are entities but we don't wont them (PG, Oracle)
        }
            }
        if (onFinish != null) {
    }
        if (monitor.isCanceled()) {
            }
                    isMatchingFilter = filter.matchesAny(
            if (showOnlyEntities && !isEntityMeta(child)) {
    public String getNodeFullName() {

                        childNode = child;
            }
                case ARRAY -> isStructDataType(dataType.getComponentType(new VoidProgressMonitor()));

        if (metaChildren != null) {
        if (filter != null && dataSource != null) {
    }
                pathName.insert(0, node.getNodeItemPath());
                if (!pathName.isEmpty()) {
        DBPDataSource dataSource = container.getDataSource();
        return image;
                    }
        @NotNull DBRProgressMonitor monitor,
            }
        DBPDataSourceContainer container = getDataSourceContainer();
        DBNModel model = getModel();
        }
                if (!pathName.isEmpty()) {
        if (showDefaults && CommonUtils.isEmpty(objectName)) {
    }
    @Nullable
                return;
                childNodes = ArrayUtils.add(DBNDatabaseNode.class, childNodes, newChild);
     * @param source  source object
                if (child.getMeta() == childType) {
     * event which will cause actual tree nodes refresh. Underlying object could present multiple times in
    protected void dispose(boolean reflect) {
        try {

        public void run(DBRProgressMonitor param) throws InvocationTargetException, InterruptedException {
            }
                log.warn("Can't find dynamic property '" + propertyName + "' read method in '" + object.getClass().getName() + "'");
            return qo.getFullyQualifiedName(DBPEvaluationContext.UI);
        if (node instanceof DBXTreeItem treeItem) {
        if (!getDataSourceContainer().isConnected()) {
        try {
        this.filtered = false;
 * Licensed under the Apache License, Version 2.0 (the "License");
            this.locked = false;
        }
                            if (oldFolder.getMeta() == child) {
        if (valueObject == null) {
    @Override
        return true;
            childrenCopy = childNodes == null ? null : Arrays.copyOf(childNodes, childNodes.length);
        }

        if (object != null) {
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeItem;
                throw dbe;
        if (!ArrayUtils.isEmpty(children)) {
    ) throws DBException {
            }
    public String getNodeType() {
    }
                DBExecUtils.tryExecuteRecover(monitor, dataSource, param ->
                }
                propertyValue = extractPropertyValue(monitor, valueObject, meta);
                        }
                final List<DBNDatabaseNode> tmpList = new ArrayList<>();
                (DBSObject) parentObject,
    }
        if (dataSource != null) {
            }
            }
package org.jkiss.dbeaver.model.navigator;
        DBXTreeNode meta = getMeta();
    @Override
        if (isDisposed()) {

    }
    protected volatile DBNDatabaseNode[] childNodes;
        }
            for (DBNDatabaseNode oldChild : oldList) {
        private Object propertyValue;
        final DBSObjectFilter filter = getNodeFilter(meta, false);
                }
    }
            }

     */

    @NotNull
        }
            object2 = object2.getParentObject();

import org.jkiss.dbeaver.model.messages.ModelMessages;
            return super.refreshNode(monitor, source);
        return pathName.toString();
            log.error("Cannot detect child node type - can't save filter configuration");
    /**
            } catch (InterruptedException e) {
                filter);
    }
        for (DBXTreeNode cn : metaChildren) {
    @NotNull
                    refreshNodeContent(monitor, newObject[0], source, true);
            object1 = object1.getParentObject();
        DBNDatabaseNode[] children = getChildren(monitor);
        if (this.isDisposed())
                    String optionalPath = treeFolder.getOptionalItem();

            }
    public DBXTreeItem getItemsMeta() {
        while (object1 != null && object2 != null) {
    public String getNodeBriefInfo() {
        DBRProgressMonitor monitor,
                if (childItem instanceof DBPOverloadedObject overloadedObject) {
            return showDefaults ? DBConstants.NULL_VALUE_LABEL : null;
        return new DBNDatabaseDynamicItem[0];
        List<DBNDatabaseNode> newChildren = new ArrayList<>();
        throw new IllegalStateException("No parent datasource node");
