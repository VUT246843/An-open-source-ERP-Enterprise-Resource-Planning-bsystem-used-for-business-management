        return prop.propertySource.isPropertySet(prop.property.getId());
                        }
                }
            root = categories.values();
import org.eclipse.ui.views.properties.IPropertySource2;

            }
        TreeColumn prevColumn = null;
                    if (e.detail == SWT.TRAVERSE_ESCAPE) {
                        final String stringValue = CommonUtils.toString(getPropertyValue(prop));
        super.refresh(prop.parent);
                final TreeNode node = (TreeNode) element;
                            result = n1.category.compareTo(n2.category);
            public void widgetSelected(final SelectionEvent e)
                        prop.propertySource.setPropertyValue(
            return GeneralUtils.makeDisplayString(propertyValue);
            final Tree treeControl = super.getTree();
            gd.grabExcessHorizontalSpace = true;
                            for (DBPPropertyDescriptor pd : psc.getProperties()) {
    }
                            } else {
            public boolean isHyperlink(Object element, Object cellValue) {
        {
        public void applyEditorValue()
    {
                }


        }
                treeEditor.setEditor(editorControl, item, columnIndex);
                }
            Object element = ((IStructuredSelection) selection).getFirstElement();
import org.eclipse.swt.events.MouseAdapter;
    }
            this(parent, propertySource, property, null);
        ISelection selection = getSelection();
    }
                toolTip = toolTip.replace("\\n", "\n");
                        }
                categories.put(categoryName, category);
            }
                focusLost.setAccessible(true);
                return null;
                            if (lastItem.getData() instanceof TreeNode lastNode) {
        public void handleEvent(Event e)
            public void mouseDown(MouseEvent e)
        }
        /*
    {

                            }
            if (selectedColumn < 0) {

        if (node instanceof TreeNode treeNode) {
        synchronized (propertyListeners) {
        super(parent, style | SWT.SINGLE | SWT.FULL_SELECTION);
    }
        final Tree treeControl = super.getTree();

    }
                    return node.category != null ?
                        if (propertyValue != null) {

                    for (Control child : ((Composite) editorControl).getChildren()) {
        for (DBPPropertyDescriptor prop : props) {
        column.getColumn().setText(UIMessages.properties_name);

        @Override
        }
                cellEditor.setValue(UIUtils.normalizePropertyValue(propertyValue));
            } else if (changed) {
                        manager.add(new Action(UIMessages.ui_properties_tree_viewer_action_copy_name) {
            for (String category : customCategories) {
                    return true;
        public Color getForeground(Object obj, int columnIndex) {
    {
            }
        }
    {
                if (!((ObjectPropertyDescriptor) prop).isPropertyVisible(propertySource.getEditableValue(), propertyValue)) {
    }
                        } else {
                return props.toArray();
                TreeItem[] selection = treeControl.getSelection();
    public enum ExpandMode {

        @Override

        }
        @Override
                getTree().setRedraw(true);
            }
                        Object propertyValue = propertySource.getPropertyValue(monitor, prop.getId());
     * Change size of columns if their width are smaller
    {
import org.jkiss.dbeaver.ui.*;
                        !treeEditor.getEditor().isDisposed() && treeEditor.getEditor().isVisible()) {
                return getPropertyValue(node);
                changed = node.isEditable() && isPropertyChanged(node);
 * See the License for the specific language governing permissions and
                    if (treeEditor != null && treeEditor.getItem() == event.item && treeEditor.getEditor() != null &&
                getPropertyValue(prop));
            }
    protected boolean isHidePropertyValue(DBPPropertyDescriptor property) {
                    category :
            if (node.category != null) {

                Method focusLost = CellEditor.class.getDeclaredMethod("focusLost");
                            if (spaceToWrapAt >= 0) {
                                collection = Arrays.asList((Object[]) propertyValue);
            String categoryName = prop.getCategory();
                }
                TreeColumn column = (TreeColumn) e.widget;
        }
        NONE,
            public void widgetDefaultSelected(SelectionEvent e)
            this.searchString = searchString.toUpperCase(Locale.ENGLISH);

            return getChildren(parent).length > 0;
                return UIElementAlignment.LEFT;
        @Override
    class PaintListener implements Listener {
    {
                }
                    public int compare(DBPProperty o1, DBPProperty o2)
            curCellEditor = null;
            }
        if (!listenersCopy.isEmpty()) {
                Collator collator = Collator.getInstance(Locale.getDefault());
        column.getColumn().setText(UIMessages.properties_value);
            @Override
import org.eclipse.swt.layout.GridData;
            StringBuilder buffer = new StringBuilder ();
        Event event = new Event();
    }
    }
                            break;
                if (node.property != null) {
                                wrappedLine.append(str.substring(offset));
    }
                                if (!isCustomProperty(prop.property)) {
    public DBPPropertyDescriptor getSelectedProperty() {

        if (tree != null && !tree.isDisposed()) {
                buffer.append (delim);
            this.property = property;
            if (node.property != null) {
            if (propertyValue != null) {
                    return;
        private final boolean toDefault;
            s -> {
            }
                        }
                        e.doit = false;
        ISelection selection = getSelection();
        @Override
                    /*if (e.detail == SWT.TRAVERSE_RETURN) {
    private boolean namesEditable = false;
        {
            },
    public boolean isNewPropertiesAllowed() {
    private CellEditor curCellEditor;
        }



        TreeViewerColumn column = new TreeViewerColumn(this, SWT.NONE);
        {
            } else if (parent instanceof TreeNode) {
                    } else {
import org.jkiss.dbeaver.model.DBPNamedObject2;
        @Override


            } catch (Exception e) {
                        if (root instanceof Collection<?> rootItems) {
                if (node == null) {
        //column.getColumn().setWidth(200);
            this.category = category;
                        prop.category != null ?
                // https://github.com/dbeaver/dbeaver/issues/10366
        });
                    showEditor(item, isMouseEventOnMacos);
                            public void run()
        final DBPPropertyDescriptor[] props = filterProperties(propertySource.getEditableValue(), propertySource.getProperties());
                                        stringValue);
        {
        }
        return CommonUtils.isEmpty(CommonUtils.toString(propertyValue)) ? "" : "**********";
                            propertyValue = CommonUtils.toBoolean(propertyValue);
                if (RuntimeUtils.isMacOS()) { // [#10279] [#10366] [#10361]
        return null;
                        StringBuilder str = new StringBuilder();
                //showEditor((TreeItem) e.item, true);
        private TreeNode(TreeNode parent, DBPPropertySource propertySource, String category)
                });
            GridData gd = new GridData(GridData.FILL_BOTH);

                        break;
            {
                            manager.add(new Action(UIMessages.ui_properties_tree_viewer_action_copy_value) {
        PropsLabelProvider(boolean isName)
                }
                        e.detail = SWT.TRAVERSE_NONE;
            TreeNode category = (parent != null ? parent : categories.get(categoryName));
                                Object first = rootItems.iterator().next();
                    return;
                    }
                            }
            this.columnIndex = columnIndex;
    {
                        if (propertyValue instanceof Collection) {
                parent.children.add(this);
                editStyle |= SWT.PASSWORD;
                final IStructuredSelection selection = PropertyTreeViewer.this.getStructuredSelection();
        public void handleEvent(Event event)
                    }
                }
        column.setLabelProvider(new PropsLabelProvider(false));
 *
                            propertyValue = CommonUtils.toBoolean(propertyValue);
        treeControl.addSelectionListener(new SelectionListener() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            }
        @Override
        {
        final TreeNode parent;
            if (cellEditor == null) {
                cell.setFont(((IFontProvider) extraLabelProvider).getFont(node.property));
                    }
            }
                ((BooleanStyleDecorator) cellEditor).setBooleanAlignment(UIElementAlignment.LEFT);
                    if (selection.length == 0) {
            final int columnIndex;
            boolean changed = false;
        public String toString() {

            PropertyChangeEvent event = new PropertyChangeEvent(
            } else {
                            for (int i = 0; i < size; i++) {
            return getChildren(parent);
                    }
            }
                return prop.property;

                // https://github.com/dbeaver/dbeaver/issues/10361
                    DBPPropertyDescriptor property = ((TreeNode) element).property;
                        e.detail = SWT.TRAVERSE_NONE;

    public static final String LINE_SEPARATOR = GeneralUtils.getDefaultLineSeparator();
        public Object getParent(Object child)
            if (element instanceof TreeNode) {
                                }
                            prop.propertySource.setPropertyValue(null, prop.property.getId(), oldPropValue);
                if (columnIndex == 0) {

        {
import org.eclipse.swt.graphics.Color;

        private final boolean isName;
        }
            if (toolTip.contains("\\n")) {
                            }
        {
        // Identify the selected row

                            PropertySourceMap psc = new PropertySourceMap(propertyValue);
    }
            public void mouseDoubleClick(MouseEvent e) {
                        renderer.paintCell(event, node, cellValue, event.item, node.property.getDataType(), event.index, node.isEditable(), (event.detail & SWT.SELECTED) == SWT.SELECTED);
                            CommonUtils.equalObjects(property.getId(), node.property.getId()));
    }
                if (node.category != null) {
 */
                            }

        final DBPPropertySource propertySource;
    }
                    property.getId() + " (" + property.getDisplayName() + ")";
        Map<String, TreeNode> categories = new LinkedHashMap<>();
                treeEditor.verticalAlignment = cellEditor.getLayoutData().verticalAlignment;

                        } else {
                        if (spaceToWrapAt >= offset) {
                toolTip = isName ? node.property.getDescription() : getText(obj, 1);
                return wrappedLine.toString();
        @Override
                // https://github.com/dbeaver/dbeaver/issues/3553
                                        TextTransfer.getInstance(),
            @Override
                            }
/*
    public static class NodeFilter extends ViewerFilter {
            }
    public Object getCategoryNode(String category) {
    {

                if (newLineStr == null) {
            if (child instanceof TreeNode) {
import java.util.*;
                        } else {
    private String maskHiddenPropertyValue(Object propertyValue) {
                            traverseControl = child;
            if (prop instanceof ObjectPropertyDescriptor) {
                    sortDirection = (sortDirection == SWT.UP ? SWT.DOWN : SWT.UP);
            if (nextIndex < 0) nextIndex = items.length - 1;
    private void registerContextMenu()
                        Object root = getInput();
        }
                            int size = Array.getLength(propertyValue);
        @Override
            for (String line: s.trim ().split ("\n"))
        public void cancelEditor()
        if (customCategories != null) {
                        str.append("[");

 */
            Object element = ((IStructuredSelection) selection).getFirstElement();
    private void showNextEditor(TreeItem item, boolean next) {
            }
        return newPropertiesAllowed;
        }
                Collections.sort(props, new Comparator<DBPProperty>() {

        });
        {
                            PropertyCollector nestedCollector = new PropertyCollector(propertyValue, true);
        disposeOldEditor();
                    if (itemData instanceof TreeNode) {
    private static final String CATEGORY_GENERAL = UIMessages.ui_properties_tree_viewer_category_general;
            }
        ALL,
                                    manager.add(new ActionResetProperty(prop, true));
    static class PropsContentProvider implements IStructuredContentProvider, ITreeContentProvider {
 * Driver properties control
                    @Override
    private Object getPropertyValue(TreeNode prop)
    }
            if (e.detail == SWT.TRAVERSE_RETURN) {
                                if (!CommonUtils.isEmpty(lastNode.children)) {
                                public void run()
            disposeOldEditor();
                                collection = (Collection<?>) propertyValue;

 * distributed under the License is distributed on an "AS IS" BASIS,
                return;
                property == null ?
            protected UIElementAlignment getBooleanAlignment(@Nullable Boolean value) {
                        return;
        }
    }
                tree.setRedraw(true);
    private void registerEditor()
            if (treeNode.propertySource != null) {
 * You may obtain a copy of the License at
                if (editorControl instanceof Composite) {
        if (categories.size() == 1 && expandSingleRoot) {
        handlePropertyChange(prop);
        }
    }
                handlePropertyCreate(newNode);
        }
                        }
                        Object oldPropValue = prop.propertySource.getPropertyValue(null, prop.property.getId());
            return prop.category;
        repackColumns();
        Tree tree = getTree();
            if (event.type == SWT.PaintItem) {
            }
                            }
        getTree().showItem(nextItem);
import org.eclipse.swt.dnd.TextTransfer;
            }
            this.isName = isName;
                        }
        applyEditorValue();
        super.reveal(prop);
                return ""; //$NON-NLS-1$
    }
    public PropertyTreeViewer(Composite parent, int style)
                return ((TreeNode) child).parent;
                        disposeOldEditor();
        return false;
                }
                showEditor(item, true);
                                PropertyTreeViewer.this.expandToLevel(first, ALL_LEVELS);
 *
                            int i = 0;
                return new Object[0];
        final DBPPropertyDescriptor property;
    public void setNamesEditable(boolean namesEditable) {
                        Object propertyValue = getPropertyValue((TreeNode) itemData);
                        return true;

                        } else if (columns[i].getWidth() < VALUE_COLUMN_WIDTH) {
        private TreeNode(TreeNode parent, DBPPropertySource propertySource, DBPPropertyDescriptor property)
    }
                if (category.equals(property.getCategory())) {
            }
        }
import org.eclipse.swt.widgets.*;
                refresh();
        @Override
    protected void addProperty(Object node, DBPPropertyDescriptor property, boolean update)
                // This is a hack. On MacOS buttons don't get focus so when user closes dialog
    private String[] customCategories;
    }
                            for (DBPPropertyDescriptor pd : psc.getProperties()) {
        // Clean up any previous editor control
 *
        }
                treeNode = treeNode.parent;

    protected DBPPropertyDescriptor[] filterProperties(Object object, DBPPropertyDescriptor[] properties) {
            Menu menu = menuMgr.createContextMenu(getTree());
            }
    private static final int VALUE_COLUMN_WIDTH = 300;
                TreeItem item = (TreeItem) e.item;
        // Make an editor
                e.detail = SWT.TRAVERSE_NONE;
    public void saveEditorValues() {

        });
            }
    }
            }
        */
import org.jkiss.code.NotNull;
        }
        }
            String toolTip;
                TreeNode node = categories.get(customCategory);
                    return;
        {
                Object propertyValue = propertySource.getPropertyValue(monitor, prop.getId());
                if (property != null) {
                            }
    {
            this.parent = parent;
                        cellEditorListener.applyEditorValue();
    private static final int NAME_COLUMN_WIDTH = 100;
                } else {
                } else {
                cellEditor.activate();
                return cellValue instanceof DBSObject;
                // See:
            cell.setForeground(getForeground(element, cell.getColumnIndex()));
        {
import org.eclipse.jface.action.MenuManager;
        //treeControl.setLinesVisible(true);
                    return node.category;
        public void update(ViewerCell cell)
        if (customCategories != null) {
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.eclipse.swt.custom.StyledText;
                        }
                cell.setFont(BaseThemeSettings.instance.treeAndTableFontBold);
        @Override
            disposeOldEditor();
        {
    private final List<IPropertyChangeListener> propertyListeners = new ArrayList<>();
            tree.setRedraw(false);
        if (parent.getLayout() instanceof GridLayout) {
            if (obj instanceof TreeNode node) {
            if (CommonUtils.isEmpty(categoryName)) {
                                if (allItems.length > 0) {

            menuMgr.setRemoveAllWhenShown(true);
                            result = n1.property.getDisplayName().compareTo(n2.property.getDisplayName());
                        }
                                @Override
                if (node.property != null) {
                if (toDefault) {
        TreeItem nextItem = items[nextIndex];
        {
            }
        this.namesEditable = namesEditable;
        treeControl.addTraverseListener(e -> {
            }
            }
            } finally {
        }

        }
                } else {
            final CellEditor cellEditor = PropertyEditorUtils.createPropertyEditor(UIUtils.getActiveWorkbenchWindow(), treeControl, prop.propertySource, prop.property, editStyle);
                        str.append("]");
import org.jkiss.code.Nullable;
            disposeOldEditor();
                            TreeItem lastItem = allItems[allItems.length - 1];
                    for (int i = 0; i < columns.length; i++) {
    }
        private final TreeNode prop;
import org.eclipse.jface.util.PropertyChangeEvent;
                        int result;
        BaseThemeSettings.instance.addPropertyListener(
            return toolTip;
                if (wrapLength < 1) {
            if (prop.propertySource != null) {
            } catch (Throwable throwable) {
            }
            public Object getCellValue(Object element, int columnIndex) {
    }
                    }
        @Override

        }
                }
        private String wrap (String s)
                                //addProperty(lastNode, new PropertyDescriptor(lastNode.category, "prop" + lastNode.children.size(), "", "", false, String.class, "", null), true);
        registerEditor();
            nextIndex++;
                if (prevColumn == column) {
                TreeColumn[] columns = tree.getColumns();
                PropertyTreeViewer.this.expandAll();
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (curCellEditor != null) {
        public boolean select(Viewer viewer, Object parentElement, Object element) {
                        prop.property);
                    // The same empty string
            return;
 * DBeaver - Universal Database Manager
        super.setContentProvider(new PropsContentProvider());
                    return true;
                List<? extends DBPProperty> props = ((DBPPropertyGroup) parent).getProperties();
                    return element;
    public void setExpandMode(ExpandMode expandMode) {

    {
            @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
            } else {
    }
        return null;
            if (update) {
import java.lang.reflect.Method;
                        if (propertyValue != null) {
                if (RuntimeUtils.isMacOS()) { // [#10279] [#10366] [#10361]
            @NotNull
            @Override
                                {
                    if (columnIndex == 0) {
                    }


        @Nullable
                            } else {

                        } else if (wrapLongWords) {
            }


                        UIUtils.openWebBrowser(url);
                        e.doit = false;
            root = values.iterator().next();
                            wrappedLine.append(newLineStr);
            nextIndex--;
                        }
            this(parent, propertySource, null, category);
                TreeItem item = treeControl.getItem(new Point(e.x, e.y));
                categoryName = CATEGORY_GENERAL;
import org.jkiss.dbeaver.ui.controls.ObjectViewerRenderer;
                return;
                    } else if (propertyValue == null || renderer.isHyperlink(node, propertyValue)) {
                            }
import org.eclipse.swt.events.MouseEvent;
    }
        synchronized (propertyListeners) {
            }
        }
            super(UIMessages.ui_properties_tree_viewer_action_reset_value + (!toDefault ? "" : UIMessages.ui_properties_tree_viewer__to_default)); //$NON-NLS-2$
        Object input = getInput();
        final String category;
                            value);
        super.refresh();
        } else {
    protected void removeProperty(Object node)
        // Send modify event
                    isMouseEventOnMacos = true;
                        ((DBPNamedObject2) prop.property).setName(newName);
                if (event.index == 1) {
                int offset = 0;
                                offset = inputLineLength;
            }


    }
            }
    private ExpandMode expandMode = ExpandMode.ALL;
                }
        if (element instanceof TreeNode) {
                CommonUtils.toString(prop.property.getId()),
                focusLost.invoke(curCellEditor);
    {
            {


        }
                                    lastNode = lastNode.children.get(lastNode.children.size() - 1);
                columnIndex = 1;
        new DefaultViewerToolTipSupport(this);
                            }
        boolean isEditable() {
            if (tree.isDisposed()) {
            treeNode.parent.children.remove(treeNode);
        }

        });
            @Override
                if (curCellEditor != null) {
        TreeItem parentItem = item.getParentItem();
                            });
                if (selection.isEmpty()) {
    {
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.model.DBUtils;
                        if (isPropertyChanged(prop) && prop.isEditable()) {
        final List<TreeNode> children = new ArrayList<>();
        showEditor(nextItem, true);
                        String newName = CommonUtils.toString(value);
    protected void contributeContextMenu(IMenuManager manager, Object node, String category, DBPPropertyDescriptor property)
            if (columnIndex == 0) {
            if (category == null) {
                    if (node != null && node.property != null) {
                        Object propertyValue = propertySource.getPropertyValue(monitor, prop.getId());
    {
        {
                return

    }
            curCellEditor.deactivate();
                lastCategory = category = new TreeNode(null, propertySource, categoryName);
                        }
            UIFonts.Eclipse.TREE_AND_TABLE_FONT_FOR_VIEWS,
                if (item != null) {
        ActionResetProperty(TreeNode prop, boolean toDefault)
                    handlePropertyChange(prop);
                }
        int nextIndex = index;
                        return result * mul;
    }

                        if (propertyValue != null) {
                                if (i > 0) str.append(",");
                    selectedColumn = -1;
                            offset += wrapLength;
                    if (url.contains("://")) {
        return false;
                listener.propertyChange(event);
    }
                return;
                                    treeControl.setSelection(newItem);
                    return ObjectViewerRenderer.getCellString(propertyValue, isName);
                        return;


                            for (Object item : (Collection<?>) propertyValue) {
import org.jkiss.dbeaver.model.DBPNamedObject;
    private boolean newPropertiesAllowed = false;
            if (getTree().isDisposed()) {
            }
                            return renderer.getBooleanStyles().getStyle((Boolean) propertyValue).getText();
        }
package org.jkiss.dbeaver.ui.properties;

            curCellEditor.dispose();
    }
            getTree().setRedraw(false);
        if (next) {
                    prop.propertySource.resetPropertyValueToDefault(prop.property.getId());
                    } else if (BeanUtils.isCollectionType(propType)) {
    private class PropsLabelProvider extends CellLabelProvider {
            propertyListeners.remove(listener);
    }
            }
                        break;
            } else {
                    } else if (BeanUtils.isCollectionType(propertyValue.getClass())) {


        }


                }
import org.jkiss.dbeaver.model.preferences.DBPPropertySource;
                        TreeNode n1 = (TreeNode) e1, n2 = (TreeNode) e2;

import org.jkiss.utils.CommonUtils;
                        if (oldPropValue != null) {
                            if (prop.propertySource instanceof IPropertySource2 && !prop.propertySource.isPropertyResettable(prop.property.getId())) {
 * limitations under the License.

                    }

                                offset = spaceToWrapAt + 1;
            if (parent != null) {
                            result = 0;
                }
public class PropertyTreeViewer extends TreeViewer {
        {
        private final CellEditor cellEditor;
                            } else {
                cellEditor.setFocus();
                            columns[i].setWidth(VALUE_COLUMN_WIDTH);
        getTree().notifyListeners(SWT.Modify, event);
                treeNode.propertySource.resetPropertyValueToDefault(treeNode.property.getId());
                        int spaceToWrapAt = str.lastIndexOf(32, wrapLength + offset);
                                if (lastNode.property != null && CommonUtils.isEmpty(lastNode.property.getDisplayName())) {
                    if (Boolean.class == propDataType || Boolean.TYPE == propDataType) {
        treeEditor.horizontalAlignment = SWT.CENTER;
                e.doit = false;
        if (item.getData() instanceof TreeNode prop) {
            for (IPropertyChangeListener listener : listenersCopy) {
                    }
                //editorValueChanged(true, true);
                    Object propertyValue = getPropertyValue(node);
    protected void loadProperties(@Nullable DBRProgressMonitor monitor, TreeNode parent, DBPPropertySource propertySource)
                                    return;
            treeControl

                    (category != null ? CommonUtils.equalObjects(category, node.category) :
import org.eclipse.jface.action.Separator;

            }
                                if (i > 0) str.append(",");
    }
                prevColumn = column;
            this.prop = prop;
                toolTip = wrap(toolTip);
        }
                // Add all available property groups

                        }
            }
                                PropertyTreeViewer.this.collapseAll();
                } else {

    protected String[] getCustomCategories()

        super.refresh(prop.parent);
            gd.grabExcessVerticalSpace = true;
     * First column will be smaller then others because usually it's just a name
            @Override
                    } else */
        } else {
                switch (expandMode) {
                }
            }
            }
        public boolean equals(Object obj) {
        this.extraLabelProvider = extraLabelProvider;
                        }
            getTree().addDisposeListener(e -> menuMgr.dispose());
        treeEditor.minimumWidth = 50;
                this,
        public Object[] getElements(Object parent)
            String delim = "";
            }
                } else {
                } else {
            }
                        if (child instanceof Text || child instanceof StyledText) {
        super.setInput(null);
    private class CellEditorListener implements ICellEditorListener {
    private TreeEditor treeEditor;


                    // Set reverse order
        if (node instanceof TreeNode treeNode) {
        UIUtils.asyncExec(() -> {
            if (isDef) {
    public void removePropertyChangeListener(IPropertyChangeListener listener) {
        if (oldEditor != null) oldEditor.dispose();
                        property != null && node.property != null &&
import org.jkiss.dbeaver.model.struct.DBSObject;
            });
import org.jkiss.dbeaver.model.DBPObject;
        List<IPropertyChangeListener> listenersCopy;

            // Load nested object's properties
        };
                }


    private class SortListener implements Listener {
                    if (newPropertiesAllowed) {
            }
        public CellEditorListener(CellEditor cellEditor, int columnIndex, TreeNode prop) {
        }
        {

                        if (renderer.getBooleanStyles().getMode() == BooleanMode.TEXT) {
            final Control editorControl = cellEditor.getControl();
        {
            try {
                            prop.category :
        this.expandMode = expandMode;
                        }
import org.eclipse.swt.graphics.Point;


                    manager.add(new Separator());
                            }
            this.cellEditor = cellEditor;
                                }
                return ((TreeNode) parent).children.toArray();
            final Object propertyValue = columnIndex == 0 ? prop.property.getDisplayName() : prop.propertySource.getPropertyValue(null, prop.property.getId());

    }
        } else {
            }
                        }
        event.data = prop.property;

                });
            if (!(propertySource instanceof IPropertySourceEditable)) {
            }
import java.util.List;
        treeControl.setHeaderVisible(true);
        Map<String, TreeNode> categories = loadTreeNodes(monitor, parent, propertySource);
            if (!(obj instanceof TreeNode node)) {
        }
            cellEditor.addListener(new CellEditorListener(cellEditor, columnIndex, prop));
            }
            } else {
                                }
        {
            final Collection<TreeNode> values = categories.values();
                }
                        if (i == 0) {
    public boolean isNamesEditable() {
                        node.category :
        }
                                i++;
                            prop.propertySource.resetPropertyValueToDefault(oldPropId);
                        return o1.getName().compareTo(o2.getName());
                DBPPropertyDescriptor property = ((TreeNode) element).property;
                        ++offset;
    public void setExtraLabelProvider(IBaseLabelProvider extraLabelProvider)

                Tree tree = getTree();
                return prop.parent != null ? prop.parent.category : prop.category;
    private void handlePropertyChange(TreeNode prop)
                // Ignore
                        TreeItem[] allItems = treeControl.getItems();
                    prop.propertySource.resetPropertyValue(null, prop.property.getId());
 * Copyright (C) 2010-2024 DBeaver Corp and others
                        Map<String,?> propertyValue = (Map<String, ?>) propertySource.getPropertyValue(monitor, prop.getId());
                            renderer.navigateHyperlink(propertyValue);
import org.eclipse.swt.events.SelectionEvent;
            }
import org.jkiss.utils.ArrayUtils;
                return;
    }
                        } else {
            if (nextIndex >= items.length) nextIndex = 0;
                    return property.getDisplayName().toUpperCase(Locale.ENGLISH).contains(searchString);
                    }

                            new ActionResetProperty(prop, false).run();
                                    selectedColumn = UIUtils.getColumnAtPos(newItem, e.x, e.y);
            } else {
                                wrappedLine.append(newLineStr);
                            return "";
                treeEditor.minimumWidth = cellEditor.getLayoutData().minimumWidth;
    }
            handlePropertyRemove(treeNode);
                                wrappedLine.append(str, offset, spaceToWrapAt);
                UIUtils.packColumns(tree, true, new float[]{0.1f, 0.9f});

                        } else {
                if (value instanceof String && ((String) value).isEmpty() && oldValue == null) {
        TreeNode lastCategory = null;
    }
    }
            try {
        private TreeNode(TreeNode parent, DBPPropertySource propertySource, DBPPropertyDescriptor property, String category)
                    }

        }
    }
            PropertyTreeViewer.this.update(prop, null);
        if (selection instanceof IStructuredSelection) {
    }

                treeEditor.grabHorizontal = cellEditor.getLayoutData().grabHorizontal;
                } else if (((TreeNode) element).category != null) {
                cell.setFont(null);
                traverseControl.addTraverseListener(e -> {
            }


        if (index < 0) {
            for (String customCategory : customCategories) {
                getControl().setFont(BaseThemeSettings.instance.treeAndTableFont);

                        }
        return null;

                    isMouseEventOnMacos = false;
    {


                return ((Collection<?>) parent).toArray();
        private final String searchString;
        super.setSelection(new StructuredSelection(prop));

        public void run()

                            PropertyTreeViewer.this.expandAll();
    {

        column.setLabelProvider(new PropsLabelProvider(true));
                        if (n1.property != null && n2.property != null) {
                return;
                        showNextEditor(item, e.detail == SWT.TRAVERSE_TAB_NEXT);

            } finally {
                                allItems = treeControl.getItems();
    public void clearProperties()
    private boolean isPropertyChanged(TreeNode prop)
import org.jkiss.dbeaver.runtime.properties.*;
                    case FIRST:
                    if (DBPObject.class.isAssignableFrom(propType)) {
                        node.property.getDisplayName();
                            offset = spaceToWrapAt + 1;
            while (treeNode.property != null) {
import org.jkiss.utils.BeanUtils;

import org.eclipse.swt.layout.GridLayout;
        {
    public String getSelectedCategory() {
        {
                        if (renderer.getBooleanStyles().getMode() == BooleanMode.TEXT) {
    }
import org.eclipse.jface.util.IPropertyChangeListener;
        TreeItem[] items = parentItem == null ? super.getTree().getItems() : parentItem.getItems();
                    DBWorkbench.getPlatformUI().openEntityEditor((DBSObject) cellValue);
        handlePropertyChange(prop);
    public void setNewPropertiesAllowed(boolean newPropertiesAllowed) {
                            prop.property.getId(),
            }
                        e.doit = false;
    }
            int editStyle = SWT.LEFT;
                    curCellEditor.setFocus();
        public boolean hasChildren(Object parent)
                        if (allItems.length > 0) {
                        if (renderer.isHyperlink(itemData, propertyValue)) {
                    }
     */
                disposeOldEditor();
        treeEditor.verticalAlignment = SWT.CENTER;
            propertyListeners.add(listener);
                                str.append(GeneralUtils.makeDisplayString(item));
        column.getColumn().setMoveable(true);
                                }

                        });
import org.jkiss.dbeaver.ui.controls.bool.BooleanMode;
    }
                buffer.append (wrap (line, 100, "\n", true));
                wrappedLine.append(str.substring(offset));
    public void refresh()
                if (element instanceof TreeNode && category.equals(((TreeNode) element).category)) {
                    if (property instanceof ObjectPropertyDescriptor && ((ObjectPropertyDescriptor) property).isHref()) {
        }
            } else {
import org.eclipse.jface.action.Action;
import java.text.Collator;
            cell.setText(getText(element, cell.getColumnIndex()));
            try {
            gd.minimumHeight = 120;
        });
    private IBaseLabelProvider extraLabelProvider;
                }
            return false;
                }
            Object element = cell.getElement();
                    if (prop.property != null) {

            try {
                        }
            this.propertySource = propertySource;

                }
                }
                    String url = CommonUtils.toString(cellValue);
    }
import org.eclipse.jface.action.IMenuManager;
                tree.setRedraw(false);
        }
                }
                        applyEditorValue();
                        // Mask value
                                    UIUtils.setClipboardContents(
                        if (prop.isEditable()) {
                        } else if (n1.category != null && n2.category != null) {

                    }
                                        Display.getDefault(),
import org.jkiss.dbeaver.utils.GeneralUtils;

                            {
                    }
        );

            menuMgr.addMenuListener(manager -> {
    }
            if (!(element instanceof TreeNode node)) {
                return null;
        private final TreeNode prop;
    public void loadProperties(DBPPropertySource propertySource)
            Tree tree = getTree();
                    final TreeNode node = (TreeNode) event.item.getData();
                    if (str.charAt(offset) == ' ') {
            {
        disposeOldEditor();
                    Object itemData = item.getData();
                    } else if (Map.class.isAssignableFrom(propType)) {
        column.getColumn().addListener(SWT.Selection, new SortListener());
                        if (propertyValue != null && !(propertyValue instanceof Boolean)) {
    public void changeColumnsWidth() {
        // is got from https://blog.pdark.de/2009/12/26/swt-tree-and-tooltips/
        }
                // Selected by mouse
        }
        this.newPropertiesAllowed = newPropertiesAllowed;
                            return null;
            this.prop = prop;
                });
            final Object propertyValue = prop.propertySource.getPropertyValue(null, prop.property.getId());

            for (Object element : (Collection<?>)input) {
                // Set focus on editor
                }
                                UIUtils.setClipboardContents(Display.getDefault(), TextTransfer.getInstance(), prop.property.getDisplayName());
                        }
            if (cellEditor instanceof BooleanStyleDecorator) {
                    }
                if (propType != null) {

    }
            }
                    TreeItem item = selection[0];
        int index = ArrayUtils.indexOf(items, item);

            return
    private boolean isCustomProperty(DBPPropertyDescriptor property)
                    node = new TreeNode(parent, propertySource, customCategory);
                    categories.put(customCategory, node);
            }
        treeControl.addMouseListener(new MouseAdapter() {
                Class<?> propType = prop.getDataType();
            } else {
            listenersCopy = new ArrayList<>(propertyListeners);
        synchronized (propertyListeners) {
        int sortDirection = SWT.DOWN;
    @Override

                tree.setRedraw(true);
                                }
                // by clicking on Ok button CellEditor doesn't get FocusLost event and thus doesn't save its value.
    private boolean expandSingleRoot = true;
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
                // This is workaround. Calling protected method focusLost in okPressed saves the value.
                    {
        }
        //disposeOldEditor();
        {
                    contributeContextMenu(
                    newLineStr = LINE_SEPARATOR;
        public String getText(Object obj, int columnIndex)
                                new TreeNode(propNode, psc, pd);

                return null; //$NON-NLS-1$
        }
                    if ((Boolean.class == propertyDataType || Boolean.TYPE == propertyDataType)) {
                    {
                            if (nestedCollector.collectProperties()) {

            return ((TreeNode) element).property;
                    } else if (e.detail == SWT.TRAVERSE_TAB_NEXT || e.detail == SWT.TRAVERSE_TAB_PREVIOUS) {
            }
    private int selectedColumn = -1;
                toolTip = node.category;
            public void navigateHyperlink(Object cellValue) {
                    final TreeItem[] selection = treeControl.getSelection();
                if (!ArrayUtils.isEmpty(columns) && columns.length > 1) {
                    }
            if (obj instanceof TreeNode node && columnIndex > 0) {

            if (selectedColumn == 0 && (!namesEditable || !(prop.property instanceof DBPNamedObject))) {
            if (extraLabelProvider instanceof IFontProvider) {
        }
                    continue;
        }
                    wrapLength = 1;
    /**
                    Object propertyValue = getPropertyValue(node);
    private static class TreeNode {
    private void disposeOldEditor()

        if (item == null) {
        column = new TreeViewerColumn(this, SWT.NONE);
    }
            @Override

                    public int compare(Viewer viewer, Object e1, Object e2)
                                    TreeItem newItem = allItems[allItems.length - 1];
                                str.append(GeneralUtils.makeDisplayString(Array.get(propertyValue, i)));
                return null;
            return property != null && property.isEditable(propertySource.getEditableValue());
        public NodeFilter(String searchString) {
                                categories.putAll(loadTreeNodes(monitor, propNode, nestedCollector));


                        }
            }
                                if (lastNode.parent != null) lastNode = lastNode.parent;
            if (element instanceof TreeNode prop) {
            }
        }
                null,
        public void editorValueChanged(boolean oldValidState, boolean newValidState)
    }

        if (prop.category != null) {

                columnIndex = this.selectedColumn;
        return categories;
                            if (!rootItems.isEmpty()) {
                            if (BeanUtils.isArrayType(propType)) {
        }

        public Object[] getChildren(Object parent)
import org.eclipse.swt.custom.TreeEditor;
                    }
        return null;
            }
        if (RuntimeUtils.isMacOS() && curCellEditor != null && curCellEditor.isActivated()) {
            return;
        return null;

    }
        @Override
        registerContextMenu();
    private boolean isMouseEventOnMacos = false; // [#10279] [#10366] [#10361]
                        if (!CommonUtils.isEmpty(stringValue)) {
    private class ActionResetProperty extends Action {

    public void repackColumns() {
                        manager,
        //column.getColumn().setWidth(120);
            if (str == null) {
}
                    Class<?> propertyDataType = node.property.getDataType();

                    } else if (isHidePropertyValue(node.property)) {
                    // Skip non-visible properties
            curCellEditor = cellEditor;
        }
                            PropertySourceCollection psc = new PropertySourceCollection(collection);
                        if (propertyValue != null && !(propertyValue instanceof Boolean)) {
                    }
            @Override
                if (object instanceof TreeNode prop) {
import org.eclipse.swt.SWT;
        }
            if (isHidePropertyValue(prop.property)) {
                        return ""; //$NON-NLS-1$

                        disposeOldEditor();
 * you may not use this file except in compliance with the License.
                        // Do not paint over active editor
        loadProperties(monitor, null, propertySource);
    {
                while(inputLineLength - offset > wrapLength) {
        this.expandSingleRoot = expandSingleRoot;
        }
                        object,
        treeEditor = new TreeEditor(treeControl);
        super.setInput(root);
        Control oldEditor = treeEditor.getEditor();

                        String oldPropId = prop.property.getId();
            return super.equals(obj);
    {
import java.lang.reflect.Array;
            treeControl.setLayoutData(gd);
                }
                            if (columns[0].getWidth() < NAME_COLUMN_WIDTH) {
            MenuManager menuMgr = new MenuManager();
                if (DBUtils.compareDataValues(oldValue, value) != 0) {
                    propertySource.getEditableValue() == node.propertySource.getEditableValue() &&
    public void setExpandSingleRoot(boolean expandSingleRoot) {
    private void handlePropertyRemove(TreeNode prop)
            }
                            @Override
                PropertyTreeViewer.this.setComparator(new ViewerComparator(collator) {
    public DBPPropertyDescriptor getPropertyFromElement(Object element) {
                StringBuilder wrappedLine = new StringBuilder(inputLineLength + 32);
            return null;
    }
                    Class<?> propDataType = node.property.getDataType();

        treeControl.addMouseListener(new MouseAdapter() {
                }
        FIRST,
                    selectedColumn = UIUtils.getColumnAtPos(item, e.x, e.y);

                }
import org.jkiss.dbeaver.utils.RuntimeUtils;
    public void loadProperties(DBRProgressMonitor monitor, DBPPropertySource propertySource)
    public void addPropertyChangeListener(IPropertyChangeListener listener) {
            return new Point(5, 5);
                    case ALL:
        {
                            return UIUtils.getSharedColor(renderer.getBooleanStyles().getStyle((Boolean) propertyValue).getColor());
            getTree().setMenu(menu);
        renderer = new ObjectViewerRenderer(this) {
        // Make tree model
                    showEditor(selection[0], true);
        }
            if (!(obj instanceof TreeNode node)) {
        final Tree treeControl = super.getTree();

        column.getColumn().setMoveable(true);
                            Collection<?> collection;
            }

            }

                int inputLineLength = str.length();
            TreeNode propNode = new TreeNode(category, propertySource, prop);
        customCategories = getCustomCategories();
    private final ObjectViewerRenderer renderer;
            gd.minimumWidth = 120;
    {
        super.update(prop, null);
    {
                if (cellValue instanceof DBSObject) {

                final Object value = cellEditor.getValue();
        loadProperties(null, null, propertySource);
        }
                                new TreeNode(propNode, psc, pd);
        if (selection instanceof IStructuredSelection) {
                if (selection.length > 0) {

            if (parent instanceof Collection) {
                delim = "\n";
                }
    }
            }
        }
                final Object oldValue = columnIndex == 0 ? prop.property.getDisplayName() : prop.propertySource.getPropertyValue(null, prop.property.getId());
    }
                }
                final Object object = selection.getFirstElement();
        if (input instanceof Collection) {
                            wrappedLine.append(str, offset, spaceToWrapAt);
        disposeOldEditor();

                                manager.add(new ActionResetProperty(prop, false));
            {
    private void showEditor(final TreeItem item, boolean isDef) {
/**
        }
            });
                        }
                    return node.property.getDisplayName();
                            wrappedLine.append(str, offset, wrapLength + offset);
        }

                            wrappedLine.append(newLineStr);
            }
            }
                if (this == node) return true;
            handlePropertyChange(prop);
        public Point getToolTipShift(Object object)
                if (element instanceof TreeNode) {

    private void handlePropertyCreate(TreeNode prop)
                    return ""; //$NON-NLS-1$
                                columns[0].setWidth(NAME_COLUMN_WIDTH);
                        return maskHiddenPropertyValue(propertyValue);
                }
                                // it is not resettable
            UIUtils.asyncExec(() -> {
            if (CommonUtils.isEmpty(toolTip)) {
            this.toDefault = toDefault;
        Object root;
        super.expandToLevel(prop.parent, 1);
                        }
        @Override
            }
                            null,
                    } else {
    {
                            }
        public String wrap(String str, int wrapLength, String newLineStr, boolean wrapLongWords) {
import org.eclipse.jface.viewers.*;
        }

import org.jkiss.dbeaver.ui.controls.bool.BooleanStyleDecorator;
                selectedColumn = 0;
        @Override
                tree.setSortDirection(sortDirection);
                        Object cellValue = renderer.getCellValue(node, event.index);
                treeEditor.horizontalAlignment = cellEditor.getLayoutData().horizontalAlignment;
            if (isDef) {
 * Unless required by applicable law or agreed to in writing, software
            if (prop.property == null || !prop.isEditable()) {

                        } else {
                    }
import org.eclipse.swt.events.SelectionListener;
                        int mul = (sortDirection == SWT.UP ? 1 : -1);
            if (editorControl != null) {
        private final int columnIndex;
                Control traverseControl = editorControl;
        return namesEditable;
        treeControl.addListener(SWT.PaintItem, new PaintListener());
                        return str.toString();
            final TreeNode newNode = new TreeNode(treeNode, treeNode.propertySource, property);
        }
        }
                }
                }
        @Override

import org.jkiss.dbeaver.ui.internal.UIMessages;
    }
                            }
    private Map<String, TreeNode> loadTreeNodes(@Nullable DBRProgressMonitor monitor, TreeNode parent, DBPPropertySource propertySource)
        public String getToolTipText(Object obj)
        return properties;
                tree.setSortColumn(column);
    {
                            spaceToWrapAt = str.indexOf(32, wrapLength + offset);
        // Register context menu
            if (element instanceof TreeNode prop) {
                DBWorkbench.getPlatformUI().showError("Error setting property value", "Error setting property '" + prop.property.getDisplayName() + "' value", e);
            return buffer.toString ();
                            (prop.property == null ? null : prop.property.getCategory()),
            }
