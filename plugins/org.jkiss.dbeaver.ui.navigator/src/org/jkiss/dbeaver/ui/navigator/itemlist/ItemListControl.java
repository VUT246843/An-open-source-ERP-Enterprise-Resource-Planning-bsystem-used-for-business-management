        return new NodeSelectionProvider(selectionProvider) {
                                filteredChildrenList.add(child);
import org.jkiss.utils.ArrayUtils;
            final ObjectPropertyDescriptor property = objectColumn.getProperty(objectValue);

            }
        // Save/revert
                            propMap.remove(property.getId());
                    }
        @Override

                return null;


        }
    public ItemListControl(

                // If we in folder-less mode then filter children by meta
 * You may obtain a copy of the License at
            super(getItemsViewer());
                                List<IContributionItem> items = NavigatorHandlerObjectCreateNew.fillCreateMenuItems((IWorkbenchPartSite) workbenchSite, rootNode);


                    contributionManager.add(createObjectCommand);
            changedProperties.clear();


                }
                            if (!((DBPObjectStatisticsCollector) parentObject).isStatisticsCollected()) {
            s -> super.getItemsViewer().refresh(),
                super.selectionChanged(event);
                        workbenchSite,
                if (!isNewObject(getRootNode())) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            Object objectValue = getObjectValue(object);
                        if (!(item instanceof DBNDatabaseNode dbNode)) {
        // Reorder
                    DBSObject parentObject = DBUtils.getPublicObject(((DBNDatabaseNode) parentNode).getObject());
                        Map<String, Object> propMap = changedProperties.computeIfAbsent(object, dbnNode -> new HashMap<>());
            public void selectionChanged(SelectionChangedEvent event) {
import org.jkiss.dbeaver.model.DBUtils;
            final MultiPageEditorPart editor = mes.getMultiPageEditor();
        super(parent, style, workbenchSite, node, metaNode);
                return PropertyEditorUtils.createPropertyEditor(getWorkbenchSite(), getControl(), property.getSource(), property, SWT.NONE);
                    }
                        @Override
        return new ItemColorProvider(objectColumn);
            }
        super.disposeControl();
        this.searchHighlightColor = new Color(parent.getDisplay(), 170, 255, 170);
{

import java.util.*;
                        try {

                            DBXTreeNode meta = ((DBNDatabaseNode) child).getMeta();
                if (propMap != null) {
                    return items;
                    if (prop != null && propMap.containsKey(prop.getId())) {
            }
        }
                    List<DBNNode> filteredChildrenList = new ArrayList<>();
                            propMap.put(property.getId(), oldValue);
                                return menuManager;

            final List<DBXTreeNode> inlineMetas = collectInlineMetas((DBNDatabaseNode) rootNode, ((DBNDatabaseNode) rootNode).getMeta());
import org.eclipse.ui.part.MultiPageEditorPart;
                NavigatorCommands.CMD_OBJECT_OPEN));

            UIFonts.Eclipse.TREE_AND_TABLE_FONT_FOR_VIEWS,
            DBNNode object = (DBNNode) element;
    }
                    ActionUtils.makeCommandContribution(workbenchSite, IWorkbenchCommandConstants.NAVIGATE_COLLAPSE_ALL, null, UIIcon.TREE_COLLAPSE_ALL));
    {
        final DBNNode rootNode = getRootNode();
import org.jkiss.dbeaver.Log;
            if (DBNUtils.isReadOnly(object)) {
                if (ObjectPropertyTester.canCreateObject(rootNode, true)) {
        public Color getBackground(Object element) {
                        // Redraw control to let it repaint checkbox
                            log.debug("Error reading statistics of '" + parentObject.getName() + "'", e);
            new ItemLoadService(getNodeMeta()),
 * DBeaver - Universal Database Manager
/**
        @Override
    @Override
 * limitations under the License.
            DBNNode object = (DBNNode) element;
                }

            @Override
        public CellEditingSupport(ObjectColumn objectColumn) {
            DBNNode object = (DBNNode) element;
                            continue;
    @Override
import org.jkiss.dbeaver.ui.properties.PropertyEditorUtils;
            List<Class<?>> childrenTypes = ((DBNDatabaseNode) rootNode).getChildrenTypes(null);
                        } else if (!propMap.containsKey(property.getId())) {
                    break;
/*
            final ObjectPropertyDescriptor property = objectColumn.getProperty(getObjectValue(object));
            // Set cur list object to let property see it in createPropertyEditor
        }
 *
import org.jkiss.dbeaver.ui.*;
import org.jkiss.dbeaver.ui.navigator.NavigatorCommands;
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
            DBNNode object = (DBNNode) element;
        }
import org.jkiss.dbeaver.model.struct.DBSObject;
    public void fillCustomActions(IContributionManager contributionManager) {
            if (hasReorder) {
 *
            contributionManager.add(ActionUtils.makeCommandContribution(
        {

                        }
                return false;
                        public IMenuCreator getMenuCreator() {
    private class CellEditingSupport extends EditingSupport {
        }
        IWorkbenchSite workbenchSite = getWorkbenchSite();
    }
                }
                        }
import org.jkiss.utils.CommonUtils;
                    });
                List<DBNNode> items = new ArrayList<>();
                        } catch (Exception e) {
                BaseThemeSettings.instance.treeAndTableFontBold : BaseThemeSettings.instance.treeAndTableFont;
                        Object savedValue = propMap.get(property.getId());
                workbenchSite,
    @Override
            this.metaNode = metaNode;
                        IContributionManager toolbarManager = createObjectCommand.getParent();
                        }

import org.jkiss.dbeaver.model.navigator.DBNDatabaseFolder;
        @NotNull IWorkbenchSite workbenchSite,
                // Filter children
                DBNNode[] children = DBNUtils.getNodeChildrenFiltered(monitor, parentNode, false);
        UIUtils.dispose(searchHighlightColor);
            setCurListObject(object);
import org.jkiss.dbeaver.ui.editors.DatabaseEditorUtils;
                            if (meta.getParent() == metaNode || meta == metaNode) {
        private final DBXTreeNode metaNode;
        );
                    DBNNode selectedNode = NavigatorUtils.getSelectedNode(event.getSelection());
        private final ObjectColumn objectColumn;
    protected void setListData(Collection<DBNNode> items, boolean append, boolean forUpdate) {

    {
                    getListPropertySource().setPropertyValue(null, objectValue, property, UIUtils.normalizePropertyValue(value));
                public void run()
                    children = filteredChildrenList.toArray(new DBNNode[0]);
    }
                    final Object objectValue = getObjectValue(node);
                        if (dbNode.getMeta() != metaNode && !dbNode.getDataSourceContainer().getNavigatorSettings().isHideFolders()) {
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
                }

                            }
            if (property != null && property.isEditable(getObjectValue(object))) {
                    }

        @Nullable DBXTreeNode metaNode)
            } else {
            if (node.isDisposed()) {
        {

        // Object operations
            }
                    if (monitor.isCanceled()) {
                    if (isEnabled != createObjectCommand.isVisible()) {
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ui.navigator.itemlist;
        return LoadingJob.createService(
                if (createObjectCommand != null) {
            if (property != null) {
import org.jkiss.dbeaver.runtime.properties.ObjectPropertyDescriptor;
        }
                // Cache statistics
                NavigatorCommands.CMD_OBJECT_DELETE));
                if (property != null) {
                DBPDataSourceContainer ds = getDataSourceContainer();
                DBeaverIcons.getImageDescriptor(UIIcon.FILTER))
import org.jkiss.dbeaver.ui.actions.ObjectPropertyTester;
            {
        {
                }
                        }
                }
    private static final String COLOR_NEW = "org.jkiss.dbeaver.ui.navigator.node.new.background";
            super(ModelMessages.model_navigator_load_.trim() +
import org.jkiss.dbeaver.runtime.DBWorkbench;
            }
        @Override
            return objectColumn.isNameColumn(object) && DBNUtils.isDefaultElement(element) ?
        if (workbenchSite instanceof MultiPageEditorSite mes) {
            this);
                    boolean isEnabled = ObjectPropertyTester.canCreateObject(selectedNode, true);
                } else if (ObjectPropertyTester.canCreateObject(rootNode, false)) {
                    for (DBNNode child : children) {
            try {
import org.jkiss.dbeaver.ui.navigator.actions.NavigatorHandlerObjectCreateNew;
            try {
                    }
        contributionManager.add(new Separator());
import org.eclipse.jface.viewers.*;

                            // Save change
 * See the License for the specific language governing permissions and
                    Object newValue = getListPropertySource().getPropertyValue(null, objectValue, property, false);
        super.fillCustomActions(contributionManager);
        @Override
    @Override
    }
    }

                            // Wrong meta. It is ok if folders are hidden
import org.jkiss.dbeaver.model.navigator.DBNNode;
        protected Object getValue(Object element)
                    getItemsViewer().update(object, null);
                workbenchSite,
    {
                    }
                }
                    }


                        if (toolbarManager != null) {
                        if (CommonUtils.equalObjects(savedValue, newValue)) {
                    createObjectCommand = ActionUtils.makeCommandContribution(
                    items.add(item);
        }

                        createObjectCommand.setVisible(isEnabled);


    }

                }
        }
            }
            contributionManager.add(ActionUtils.makeCommandContribution(
    private final ISearchExecutor searcher;
                {
    public void disposeControl() {
                    if (!CommonUtils.equalObjects(oldValue, newValue)) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
            final Object object = getObjectValue(node);
import org.jkiss.dbeaver.model.struct.DBSWrapper;

    @Override
            return null;
            this.objectColumn = objectColumn;
        @Override
            return null;
        };
    }
            for (Class<?> childType : childrenTypes) {
        addColumnConfigAction(contributionManager);
                        }
                            setActionDefinitionId(NavigatorCommands.CMD_OBJECT_CREATE);
import java.lang.reflect.InvocationTargetException;
                @Override
        @NotNull DBNNode node,
                ": " + getRootNode().getNodeDisplayName(),
                        NavigatorCommands.CMD_OBJECT_CREATE);
        //this.disabledCellColor = UIStyles.getDefaultTextBackground();//parent.getDisplay().getSystemColor(SWT.COLOR_WIDGET_LIGHT_SHADOW);
        }
import org.jkiss.dbeaver.model.messages.ModelMessages;
        return searcher;

            }
                            }
            Object objectValue = getObjectValue(object);
                DBNNode parentNode = getRootNode();
    {
        if (rootNode instanceof DBNDatabaseNode dbNode && dbNode.getItemsMeta() != null) {
                }
                contributionManager.add(
            }
                DatabaseEditorUtils.contributeStandardEditorActions(workbenchSite, contributionManager);
    }
                    }

public class ItemListControl extends NodeListControl
                return null;
            }
                    parentNode = parentNode.getParentNode();
                    if (value instanceof Boolean) {
            if (!(element instanceof DBNNode node)) {
                setFocusCell(object, objectColumn);
        @Override
 */
                for (DBNNode item : children) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        @NotNull Composite parent,
import org.jkiss.code.NotNull;
                if (ArrayUtils.isEmpty(children)) {
                    if (metaNode != null) {
                        getItemsViewer().getControl().redraw();
    @Override
                    ActionUtils.makeCommandContribution(workbenchSite, IWorkbenchCommandConstants.NAVIGATE_EXPAND_ALL, null, UIIcon.TREE_EXPAND_ALL));
        }
 *
                contributionManager.add(ActionUtils.makeCommandContribution(workbenchSite, NavigatorCommands.CMD_OBJECT_MOVE_UP));
                            super.run();
        BaseThemeSettings.instance.addPropertyListener(
            if (!inlineMetas.isEmpty()) {
            return property != null && property.isEditable(getObjectValue(object));
            }
                    hasReorder = true;
    protected LoadingJob<Collection<DBNNode>> createLoadService(boolean forUpdate)
    {
    private final Map<DBNNode, Map<String, Object>> changedProperties = new HashMap<>();
                    Object oldValue = getListPropertySource().getPropertyValue(null, objectValue, property, false);
                return getListPropertySource().getPropertyValue(null, objectValue, property, true);
    private CommandContributionItem createObjectCommand;
        }
                        }

                            continue;
import org.eclipse.ui.menus.CommandContributionItem;
                UINavigatorMessages.obj_editor_properties_control_action_filter_setting,
            });
import org.eclipse.ui.IWorkbenchPartSite;
        if (!append && !forUpdate) {
 * ItemListControl
            return null;
                contributionManager.add(ActionUtils.makeCommandContribution(workbenchSite, NavigatorCommands.CMD_OBJECT_MOVE_DOWN));
                                for (IContributionItem cc : items) {
    private class ItemColorProvider extends ObjectColumnLabelProvider {
            if (!(element instanceof DBNNode node)) {
    protected ISearchExecutor getSearchRunner()
import org.eclipse.ui.IWorkbenchSite;


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (rootNode instanceof DBNDatabaseFolder) {
                throw new InvocationTargetException(ex);
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
                Map<String, Object> propMap = changedProperties.get(node);
    private class ItemLoadService extends DatabaseLoadService<Collection<DBNNode>> {
        ItemColorProvider(ObjectColumn objectColumn)
                contributionManager.add(new Separator());
                        public void run() {
import org.jkiss.dbeaver.ui.editors.entity.EntityEditor;
            if (editor instanceof EntityEditor) {
                    return UIUtils.getCurrentTheme().getColorRegistry().get(COLOR_NEW);
    }
            }
import org.eclipse.swt.SWT;
import org.jkiss.dbeaver.model.runtime.load.DatabaseLoadService;
import org.jkiss.dbeaver.model.DBPObjectStatisticsCollector;
            }
        }
        if (rootNode instanceof DBNDatabaseNode && rootNode.isPersisted()) {
                            return new MenuCreator(control -> {
        int style,
            contributionManager.add(new Action(
            super(objectColumn);
    private final Color searchHighlightColor;
            }
                while (parentNode instanceof DBNDatabaseFolder) {
    @Override
import org.eclipse.ui.IWorkbenchCommandConstants;
                        return UIUtils.getCurrentTheme().getColorRegistry().get(COLOR_MODIFIED);
            } catch (Throwable ex) {
 * Unless required by applicable law or agreed to in writing, software
        }
                    contributionManager.add(new Action(null, Action.AS_DROP_DOWN_MENU) {
        super.setListData(items, append, forUpdate);
import org.eclipse.swt.graphics.Color;
    private static final String COLOR_MODIFIED = "org.jkiss.dbeaver.ui.navigator.node.modified.background";
                    if (parentObject instanceof DBPObjectStatisticsCollector) {
    protected EditingSupport makeEditingSupport(ObjectColumn objectColumn)
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
                    final ObjectPropertyDescriptor prop = objectColumn.getProperty(objectValue);
            // Expand/collapse

        }
                        }
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeNode;
                        break;
        public Color getForeground(Object element)
        public Font getFont(Object element)
    protected NodeSelectionProvider createSelectionProvider(ISelectionProvider selectionProvider) {
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
        {
                if (parentNode instanceof DBNDatabaseNode) {
import org.jkiss.dbeaver.model.edit.DBEObjectReorderer;
                getRootNode() instanceof DBSWrapper ? (DBSWrapper)getRootNode() : null);
                contributionManager.add(new Separator());
                return items;
                                    menuManager.add(cc);
        this.searcher = new SearcherFilter();

                    NavigatorHandlerFilterConfig.configureFilters(getShell(), dbNode);
                }
            final ObjectPropertyDescriptor property = objectColumn.getProperty(getObjectValue(object));

//        if (workbenchSite != null) {
                        {
            {
import org.eclipse.jface.action.*;
        ItemLoadService(@Nullable DBXTreeNode metaNode) {
        protected CellEditor getCellEditor(Object element)
                contributionManager.add(ActionUtils.makeCommandContribution(workbenchSite, NavigatorCommands.CMD_OBJECT_MOVE_TOP));
    }
            return null;
                contributionManager.add(ActionUtils.makeCommandContribution(workbenchSite, NavigatorCommands.CMD_OBJECT_MOVE_BOTTOM));
                        }
        {
                }


            final ObjectPropertyDescriptor property = objectColumn.getProperty(objectValue);
    protected CellLabelProvider getColumnLabelProvider(ObjectColumn objectColumn)
        {
                        }
import org.eclipse.swt.widgets.Composite;
                contributionManager.add(
        protected void setValue(Object element, Object value)
import org.eclipse.swt.graphics.Font;
                        @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.navigator.DBNUtils;
        @Override
import org.jkiss.dbeaver.ui.navigator.actions.NavigatorHandlerFilterConfig;
    }

        @Override
    }
        }
        {
            }
            new ObjectsLoadVisualizer(forUpdate)
        if (rootNode instanceof DBNDatabaseNode) {
            } catch (Exception e) {
        }
        protected boolean canEdit(Object element)
            if (isNewObject(node)) {
                            });
                        if (child instanceof DBNDatabaseNode) {
                }
//        }

                            toolbarManager.update(true);

                    }

import org.jkiss.code.Nullable;
                if (ds != null && ds.getNavigatorSettings().isHideFolders()) {
                DBWorkbench.getPlatformUI().showError("Error setting property value", "Error setting property '" + property.getId() + "' value", e);
                            // Reset to original value

    private static final Log log = Log.getLog(ItemListControl.class);
}
                                MenuManager menuManager = new MenuManager();
//            contributionManager.add(ActionUtils.makeCommandContribution(workbenchSite, IWorkbenchCommandConstants.FILE_REFRESH));
            boolean hasReorder = false;
        return new CellEditingSupport(objectColumn);

                                ((DBPObjectStatisticsCollector) parentObject).collectObjectStatistics(monitor, false, false);
            }
                                }
                return BaseThemeSettings.instance.treeAndTableFont;
                if (DBWorkbench.getPlatform().getEditorsRegistry().getObjectManager(childType, DBEObjectReorderer.class) != null) {
        public Collection<DBNNode> evaluate(@NotNull DBRProgressMonitor monitor) throws InvocationTargetException {
import org.eclipse.ui.part.MultiPageEditorSite;

