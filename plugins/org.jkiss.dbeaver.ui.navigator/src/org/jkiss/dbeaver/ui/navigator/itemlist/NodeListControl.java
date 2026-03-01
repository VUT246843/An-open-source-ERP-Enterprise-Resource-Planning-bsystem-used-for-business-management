            this.original.removeSelectionChangedListener(this);
import org.jkiss.dbeaver.ui.editors.EditorUtils;
            }
        }

        public DBNNode getRootNode() {
import java.util.Collection;
            if (editorInput instanceof IDatabaseEditorInput dei) {
            return cellValue instanceof DBSObject && cellValue != ownerObject;
            for (DBXTreeNode child : metaChildren) {
    IWorkbenchSite getWorkbenchSite() {
    protected void openNodeEditor(DBNNode node) {

        return !objectValue.isPersisted();
                                    return null;
        this.workbenchSite = workbenchSite;

 * You may obtain a copy of the License at

    protected NodeListControl(
        int style,
        return new ListContentProvider();
        });
 *     http://www.apache.org/licenses/LICENSE-2.0

    @Nullable
import org.eclipse.ui.services.IServiceLocator;
        // Collect base types for root node
    }
        return inlineMetas;
        public void setSelection(ISelection selection) {
        public void setPropertyValue(
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeNode;
        return super.createListPropertySource();
            IEditorInput editorInput = de.getEditorInput();
    protected DBXTreeNode getNodeMeta() {

        @Override
        this.selectionProvider = createSelectionProvider(super.getSelectionProvider());

import org.jkiss.dbeaver.runtime.properties.PropertySourceEditable;
            synchronized (listeners) {
            selectionChanged(new SelectionChangedEvent(this, selection));
    }
    protected ObjectViewerRenderer createRenderer() {
        final List<DBXTreeNode> metaChildren = meta.getChildren(null);

        // Add context menu
    }
    NodeListControl(


        if (eventNode == rootNode || eventNode.isChildOf(rootNode)) {
                if (child.isInline()) {
        @NotNull IWorkbenchSite workbenchSite,
    private final IWorkbenchSite workbenchSite;
                        // Root node was updated
 * NodeListControl
import org.jkiss.dbeaver.model.edit.DBEObjectEditor;
            DBEObjectEditor objectEditor = DBWorkbench.getPlatform().getEditorsRegistry().getObjectManager(curClass, DBEObjectEditor.class);
        for (Class<?> theClass : classList) {
            if (metaNode == null) {
        this(parent, style, workbenchSite, rootNode, createContentProvider(rootNode, nodeMeta));
            synchronized (listeners) {
            @NotNull ObjectPropertyDescriptor prop,
            }
                    return new Class[] {childrenClass};
                listeners.remove(listener);

import org.jkiss.dbeaver.ui.editors.IDatabaseEditor;
        return getItemsViewer();
        return workbenchSite;
        ) throws IllegalArgumentException {
import org.jkiss.dbeaver.ui.navigator.actions.NavigatorHandlerObjectOpen;
    public DBPDataSourceContainer getDataSourceContainer() {
            return null;
    private class NodeListInput extends ArrayList<DBNNode> implements INavigatorNodeContainer {

                    }
 * DBeaver - Universal Database Manager
        @Override
        public NodeListInput(Collection<DBNNode> objectList) {
import org.jkiss.dbeaver.model.DBPObject;
    public NodeSelectionProvider getSelectionProvider() {
                    } else {
                    break;
        @Nullable IWorkbenchSite workbenchSite,
                for (Object obj : ss.toList()) {
                    if (eventNode == rootNode) {
    @Nullable
                    public Object[] getChildren(Object parentElement) {
import org.eclipse.ui.IWorkbenchSite;
        @Override
                        getItemsViewer().update(eventNode, null);
    }
        return item;
        }
                Class<? extends DBSObject> childrenClass = folder.getChildrenClass();
        final List<DBXTreeNode> inlineMetas = new ArrayList<>();
        public Object getEditableValue() {
        }
    @Override
        }
    @Override
                original.setSelection(new StructuredSelection());


        }

        }
    public void nodeChanged(final DBNEvent event) {
            UIUtils.getActiveWorkbenchWindow();
        StringBuilder sb = new StringBuilder("NodeList");
        return object instanceof DBNDatabaseDynamicItem;
            sb.append("/").append(theClass.getSimpleName());
        @Override
            this.original.addSelectionChangedListener(this);
        }
    implements DBPDataSourceContainerProvider, INavigatorModelView, INavigatorListener {
    public class NodeSelectionProvider implements ISelectionProvider, ISelectionChangedListener {
import org.jkiss.dbeaver.ui.controls.ObjectViewerRenderer;
            @NotNull Object editableValue,
            }
import java.util.List;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    protected String getListConfigId(List<Class<?>> classList) {
        public void removeSelectionChangedListener(ISelectionChangedListener listener) {
        @NotNull
    @Override
    }
        return container != null && container.isConnectionReadOnly();
                metaNode = dbNode.getMeta();
        //        }


import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
    public void setRootNode(@NotNull DBNNode rootNode) {
        }
        DBPDataSourceContainer container = getDataSourceContainer();
    @Override
            ISelection selection = getItemsViewer().getSelection();
    @Override
            List<Class<?>> baseTypes = dbNode.getChildrenTypes(nodeMeta);
            if (selection instanceof IStructuredSelection ss) {
        @Override
    }

        NavigatorUtils.executeNodeAction(DBXTreeNodeHandler.Action.open, node, serviceLocator);

    @Override

        @Override

        }
        public DBPPropertyDescriptor[] getProperties() {
    }
import org.jkiss.dbeaver.ui.navigator.INavigatorNodeContainer;

        } else {
    }
    @Override
                    @Override
                    listener.selectionChanged(event);
            for (DBXTreeNode metaChild : meta.getChildren(node)) {
import org.jkiss.dbeaver.ui.UIUtils;


import org.jkiss.dbeaver.runtime.properties.PropertySourceAbstract;
                for (ISelectionChangedListener listener : listeners) {
 *
    @Override
                    inlineMetas.add(child);
                return new NodeListPropertySource(dei.getCommandContext());
        public void addSelectionChangedListener(ISelectionChangedListener listener) {
            final Class<?> curClass = editableValue.getClass();
                            }
        @NotNull Composite parent,

        setDoubleClickHandler(event -> {
        @NotNull IContentProvider contentProvider
        }
import org.jkiss.utils.ArrayUtils;
            }
import org.jkiss.dbeaver.DBException;
    }
 * Unless required by applicable law or agreed to in writing, software
            // Collect base types for inline children
            final Object valueObject = databaseNode.getValueObject();
import org.jkiss.code.NotNull;
    public void disposeControl() {
            synchronized (listeners) {
        }
    }
            }
        }
    @Override
                        loadData(false, true);
            // If this is a folder - iterate through all its children
        this.rootNode = rootNode;
            if (selection == defaultSelection) {
            return node.getNodeObject();
        int style,
    }

    @Override
import org.jkiss.dbeaver.ui.controls.ListContentProvider;
        @NotNull DBNNode rootNode,
    ) {
                case REMOVE:
        @Override
        @Nullable DBXTreeNode nodeMeta
 *
        @Override
        void dispose() {
/**
                return selection;
    private DBNNode rootNode;
        IServiceLocator serviceLocator = workbenchSite != null ?
import org.jkiss.dbeaver.model.DBPImage;
        @Override
import org.jkiss.dbeaver.model.edit.DBECommandContext;
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
        private final List<ISelectionChangedListener> listeners = new ArrayList<>();
import org.eclipse.ui.IWorkbenchPartSite;
package org.jkiss.dbeaver.ui.navigator.itemlist;
            return node.getDataSourceContainer();
        return null;
    }
import org.jkiss.dbeaver.ui.editors.IDatabaseEditorInput;
/*
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
            selectionProvider.dispose();


        private StructuredSelection defaultSelection;
    protected NodeSelectionProvider createSelectionProvider(ISelectionProvider selectionProvider) {
        }
            // Run default node action
        return item.getNodeIconDefault();
            }
        }
    protected PropertySourceAbstract createListPropertySource() {
    }
        public DBNNode getReferencedNode() {
        return selectionProvider;
                    loadData(false, true);
        @Override
    protected boolean isReadOnlyList() {
            return getObjectValue(getCurrentListObject());
        return new NodeSelectionProvider(selectionProvider);
        public boolean isEditable(Object editableValue) {
                        return parentElement instanceof DBNDatabaseNode node && node.hasChildren(false);
                }
    private class NodeListPropertySource extends PropertySourceEditable implements DBNNodeReference {
import org.jkiss.dbeaver.model.DBPDataSourceContainerProvider;
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeFolder;
            return getCurrentListObject();

        if (getRootNode() instanceof DBNDatabaseNode dbNode) {
                case ADD:
    }
import org.jkiss.dbeaver.model.rm.RMConstants;

    @NotNull
        }
                                if (ArrayUtils.isEmpty(children)) {

    @Nullable

        @NotNull DBNNode rootNode,
                    break;
    }
            collectInlineChildren(meta, inlineMetas);
        }
    @Override
        }
import org.jkiss.utils.CommonUtils;


        this.nodeMeta = nodeMeta;
    }
        }
    @Override
            return NodeListControl.this.getRootNode();
                                DBNNode[] children = DBNUtils.getNodeChildrenFiltered(new VoidProgressMonitor(), node, false);
        }
    @Override

    }
            return getAllProperties().toArray(new DBPPropertyDescriptor[0]);

        if (item instanceof DBSWrapper wrapper && wrapper.getObject() != null) {
import org.jkiss.dbeaver.Log;
}        }
        }
                ownerObject = node.getValueObject();

    private DBXTreeNode nodeMeta;
                NavigatorHandlerObjectOpen.openEntityEditor(object);
            }
            return;
    @NotNull
                }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import java.util.ArrayList;
        public boolean isHyperlink(Object element, Object cellValue) {

    }
import org.eclipse.swt.widgets.Composite;
        NodeSelectionProvider(ISelectionProvider original) {
            return wrapper.getObject();

import org.jkiss.dbeaver.ui.navigator.INavigatorModelView;
        if (workbenchSite instanceof IWorkbenchPartSite partSite && partSite.getPart() instanceof IDatabaseEditor de) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                }
                && DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_METADATA_EDITOR);

        if (!CommonUtils.isEmpty(metaChildren)) {
        }
        }
                                log.error(e);
    }
            workbenchSite :
        public void selectionChanged(SelectionChangedEvent event) {

            super.setPropertyValue(monitor, editableValue, prop, newValue);
        return nodeMeta;
                                    return children;
            }
                                }
        DBNNode rootNode = getRootNode();
        return sb.toString();
public abstract class NodeListControl extends ObjectListControl<DBNNode>
                return defaultSelection;
        if (selectionProvider != null) {
            // Just check child metas
            }
            if (!inlineMetas.isEmpty() || !(node instanceof DBNDataSource) && dbNode.isDynamicStructObject()) {
    }
        public ISelection getSelection() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        NavigatorUtils.addContextMenu(workbenchSite, getItemsViewer(), this.selectionProvider);

        public void navigateHyperlink(Object cellValue) {
 * limitations under the License.
        NavigatorUtils.addDragAndDropSupport(getItemsViewer());
        super(parent, style, contentProvider);
    private final NodeSelectionProvider selectionProvider;
            this.defaultSelection = new StructuredSelection(rootNode);
    }
 */
            }
        @Override
    }

            super(commandContext, NodeListControl.this, NodeListControl.this);
    }
            if (valueObject == null) {
    protected List<DBNNode> createViewerInput(Collection<DBNNode> objectList) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        DBNNode eventNode = event.getNode();
                event = new SelectionChangedEvent(this, getSelection());

    protected boolean isNewObject(DBNNode objectValue) {

    private class NodeRenderer extends ViewerRenderer {

        if (meta instanceof DBXTreeFolder) {
            super(objectList);
        if (node instanceof DBNDatabaseNode dbNode) {
            final ISelection selection = original.getSelection();
    private static void collectInlineChildren(DBXTreeNode meta, List<DBXTreeNode> inlineMetas) {
            }
 *

        }
            if (!(rootNode instanceof DBNDatabaseNode databaseNode)) {
    }
        }
    protected boolean isDynamicObject(DBNNode object) {
    }
                    if (obj instanceof DBNNode node && node.allowsOpen()) {

        if (workbenchSite != null) {
            } else {
        @Override

    }
            }
            return NodeListControl.this.getRootNode();
                };
                        openNodeEditor(node);
        public void setDefaultSelection(StructuredSelection defaultSelection) {
    @NotNull
        if (isDisposed()) {
            @Nullable Object newValue
                    @Override
import org.eclipse.ui.IEditorInput;

            }
            }
import org.jkiss.code.Nullable;
        return rootNode;
            final List<DBXTreeNode> inlineMetas = collectInlineMetas(dbNode, metaNode);
        return new NodeRenderer();
        return new NodeListInput(objectList);
        }
        }
                            try {

    }
        }
                if (childrenClass != null) {

    private static final Log log = Log.getLog(NodeListControl.class);

                            } catch (DBException e) {



import org.jkiss.dbeaver.runtime.DBWorkbench;
    }

            @Nullable DBRProgressMonitor monitor,
                original.setSelection(selection);
                                // Read children with void progress monitor because inline children SHOULD be already cached
 * you may not use this file except in compliance with the License.
        }
                return new TreeContentProvider() {
            }
        // Add drag and drop support
                listeners.add(listener);
        //        if (workbenchSite != null) {
            }
import org.jkiss.dbeaver.model.navigator.*;
            EditorUtils.trackControlContext(workbenchSite, this.getItemsViewer().getControl(), INavigatorModelView.NAVIGATOR_CONTEXT_ID);

 */
                                } else {
        private final ISelectionProvider original;
import org.jkiss.dbeaver.model.struct.DBSObject;


        if (rootNode instanceof DBNDatabaseNode node) {
            if (selection == null || selection.isEmpty()) {


        //            UIUtils.addFocusTracker(workbenchSite, INavigatorModelView.NAVIGATOR_CONTROL_ID, getItemsViewer().getControl());
    protected Object getObjectValue(@NotNull DBNNode item) {
        } else {
                    }
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeNodeHandler;
import org.jkiss.dbeaver.ui.controls.TreeContentProvider;
            final DBNNode rootNode = getRootNode();
            resetLazyPropertyCache(getCurrentListObject(), prop.getId());
            if (CommonUtils.isEmpty(baseTypes) && dbNode instanceof DBNDatabaseFolder folder) {
            switch (event.getAction()) {
        @Override
    }
            if (cellValue instanceof DBSObject object) {
                return false;
                        }
    protected DBPImage getObjectImage(DBNNode item) {
        this.rootNode = rootNode;
 * See the License for the specific language governing permissions and
    public DBNNode getRootNode() {
                case UPDATE:
import org.jkiss.dbeaver.model.struct.DBSWrapper;
                }
    ) {

    private static IContentProvider createContentProvider(DBNNode node, DBXTreeNode metaNode) {
        public DBNNode getSourceObject() {
                return false;
                        if (parentElement instanceof DBNDatabaseNode node) {
        }
                        return null;
            }
            if (editableValue == null) {
    public Viewer getNavigatorViewer() {
        @NotNull
        DBWorkbench.getPlatform().getNavigatorModel().addListener(this);
        @NotNull Composite parent,
        }
        @Override
            if (rootNode instanceof DBNDatabaseNode node) {
        DBWorkbench.getPlatform().getNavigatorModel().removeListener(this);
    @Override
            } else {
            this.original = original;
                collectInlineChildren(metaChild, inlineMetas);
                    public boolean hasChildren(Object parentElement) {
    @NotNull

            Object ownerObject = null;
    }
        } else if (item instanceof DBNObjectNode node) {
                    }
import org.jkiss.dbeaver.runtime.properties.ObjectPropertyDescriptor;
        private NodeListPropertySource(DBECommandContext commandContext) {
        super.disposeControl();

                return false;
    protected Class<?>[] getListBaseTypes(Collection<DBNNode> items) {
            return objectEditor != null && editableValue instanceof DBPObject object && objectEditor.canEditObject(object)

            return CommonUtils.isEmpty(baseTypes) ? null : baseTypes.toArray(new Class<?>[0]);
                    }
            }
    protected static List<DBXTreeNode> collectInlineMetas(DBNDatabaseNode node, DBXTreeNode meta) {
import org.eclipse.jface.viewers.*;
    @Override
            this.defaultSelection = defaultSelection;
    @Override
