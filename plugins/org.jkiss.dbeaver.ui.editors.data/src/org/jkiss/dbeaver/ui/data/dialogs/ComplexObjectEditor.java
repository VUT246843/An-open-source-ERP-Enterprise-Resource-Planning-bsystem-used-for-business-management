        }
        @NotNull
        public void run() {
            public void controlResized(ControlEvent e)
        }
import org.jkiss.dbeaver.model.data.*;
            super(DataEditorsMessages.complex_object_editor_dialog_menu_set_element_to_null);
        public CollectionRootElement(@NotNull Collection<?> source) {
        if (object instanceof ComplexElement) {
            final boolean child = !(collection instanceof CollectionRootElement);
                e.doit = false;
        private final ComplexElementItem item;

                    DBDDisplayFormat.NATIVE);

        @Override
    private static class CompositeElement implements ComplexElement {
                    ComplexObjectEditor.this.setModel(executionContext, populatedCollection);
            }
                    return SimpleTypedObject.DEFAULT_TYPE;

import org.eclipse.jface.action.MenuManager;
            || object instanceof CompositeElement
        AddElementAction() {
    }
    private final Action removeElementAction;
        private CollectionElement getElement() {
        if (object instanceof ComplexElementItem) {
        public ComplexElementItem[] getChildren(Object parent) {
            return new ComplexElementItem[0];
            }
            disposeOldEditor();
            this.isName = isName;
            element.items.add(new CollectionElement.Item(element, object));
            autoUpdateComplexValue();
                advanced ? IValueController.EditType.EDITOR : IValueController.EditType.INLINE);

        @NotNull

    private Image getColumnImage(@NotNull ComplexElementItem item, int columnIndex) {
        }
        this.copyValueAction = new CopyAction(false);

            }
                swap(collection, index, index + 1);
        ColumnViewerToolTipSupport.enableFor(this, ToolTip.NO_RECREATE);
                }
        }
            }
import org.jkiss.code.Nullable;
        public Object extract(@NotNull DBRProgressMonitor monitor) {
        @NotNull
        treeControl.addMouseListener(new MouseAdapter() {
            || object instanceof ReferenceElement;
        }
                cell.setBackground(null);
/**

            }
            updateValue(value, true);

        }

            addElementAction.setEnabled(extendable && (!isFixedSize | collection.source.isEmpty()));
        this.backgroundModified = ResultSetThemeSettings.instance.backgroundModified;
        copyValueAction.setEnabled(object != null);
        manager.add(moveElementUpAction);

import java.util.stream.Stream;

        public abstract ComplexElement getParent();
                this.type = item.getDataType();
            return parent;
            }

        public Object getParent() {
            } catch (DBCException e) {
                refresh();

    private String getColumnText(ComplexElementItem item, int columnIndex, DBDDisplayFormat format) {
                this.name = type.getTypeName() + "[" + item.getName() + "]";
    }

        public Object getParent() {
    private DBCExecutionContext executionContext;
        @Override
                    (ComplexElementItem) selection.getFirstElement(),
        }
                cell.setBackground(backgroundAdded);
            return getTree();
            super(dir == SWT.UP
import org.eclipse.swt.graphics.Color;
            TreeViewerColumn column = new TreeViewerColumn(this, SWT.NONE);
            }
        treeControl.addTraverseListener(e -> {

package org.jkiss.dbeaver.ui.data.dialogs;
            }
                manager.add(new Separator());
        curCellEditor = null;
                if (text != null) {
            disposeOldEditor();

            final CollectionElement element = (CollectionElement) value;
            } catch (DBCException e) {

                }
                this.name = item.attribute.getName();
        }
        }
        protected Object value;

                disposeOldEditor();
    private static boolean isComplexType(@NotNull Object object) {
                        treeControl.getColumn(0).setWidth(100);
        @NotNull
        updateActions();
        public boolean isReadOnly()
            @Override
                throw new DBCException("Unsupported complex object element: " + this.item);
        {
                }
        @Override
        public abstract DBDValueHandler getValueHandler();
            return isReadOnlyType(((ComplexElement) object).getParent());
import org.eclipse.swt.widgets.*;
                    }
    private class AddElementAction extends Action {
        }
    private class StructContentProvider extends TreeContentProvider {
        public IDataController getDataController() {
            public ComplexElement getParent() {
        private final Object parent;


                }
    private class SetToNullAction extends Action {

        public <T> T getAdapter(Class<T> adapter) {
            return parent;
            DBDComposite composite = source;
    {
                cell.setForeground(foregroundReadOnly);
        }
        }
        private static class Item extends ComplexElementItem {
        createContextMenu();
            {
    private final Color backgroundAdded;
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetPreferences;
    private class ComplexValueController implements IValueController, IMultiController {
    private static class CollectionRootElement extends CollectionElement {
                manager.add(copyValueAction);
                if (treeEditor.getEditor() != null && !treeEditor.getEditor().isDisposed()) {

            this.parent = parent;
 *     http://www.apache.org/licenses/LICENSE-2.0
                      : DataEditorsMessages.complex_object_editor_dialog_menu_move_down_element,

        @Override
/*

                }
 *
        @NotNull

                    packing = true;
            }
        } else {
        return object;

            public String getName() {
                    return DefaultValueHandler.INSTANCE;
    {
        {


            }
            if (!title && isComplexType(element)) {
        }
        }
        if (parent == null) {
        return false;
        }

                manager.add(copyNameAction);

        public void updateValue(Object value, boolean updatePresentation)

import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        });
    private interface ComplexElementReferrer {
    }
import org.jkiss.dbeaver.ui.DBeaverIcons;
        @Override
        }
                cell.setBackground(backgroundModified);

        @Override
                if (collection.source instanceof DBDCollection) {
        this.backgroundDeleted = ResultSetThemeSettings.instance.backgroundDeleted;
        treeControl.setHeaderVisible(true);
            if (parent instanceof ComplexElementReferrer) {
 */
        if (object instanceof ReferenceElement) {
                return;
        @Nullable
import org.jkiss.dbeaver.model.DBUtils;
                final CollectionElement.Item item = new CollectionElement.Item(collection, null);
        }
        {
            final CollectionElement collection = item.collection;
            super(DataEditorsMessages.complex_object_editor_dialog_menu_remove_element, DBeaverIcons.getImageDescriptor(UIIcon.ROW_DELETE));
        private final Object value;
        {
        }
            return isComplexType(parent);
        CopyAction(boolean isName) {

            private final DBSAttributeBase attribute;
        public Object[] getElements(Object parent) {
            autoUpdateComplexValue();
        public Composite getEditPlaceholder()

                item.created = true;
    }
        this.editor = editor;


        final boolean editable = !parentController.isReadOnly() && !isReadOnlyType(object);


        if (cache.containsKey(object)) {
        public Object getParent() {
                    return;
                }
            if (newCellEditor != null) {
                    }
        @NotNull
                return composite;
            } else if (direction == SWT.DOWN) {

            return value;
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
        super.setContentProvider(new StructContentProvider());

            return null;
            if (adapter.isInstance(value)) {
                }
            }
                    return;
                return collection;
                    return ((DBDCollection) collection.source).getComponentType();
            return parentController.isReadOnly() || ComplexObjectEditor.isReadOnlyType(item.getParent());
        treeControl.addControlListener(new ControlAdapter() {
        public ReferenceElement(@Nullable Object parent, @NotNull DBDReference reference) {
                    composite.setAttributeValue(item.attribute, unwrap(item.value));
            cache.put(object, element);
                if (index == collection.items.size() - 1) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        treeEditor.verticalAlignment = SWT.CENTER;
        public SetToNullAction() {
                        treeEditor.minimumHeight = editorSize.y;
            this.cache.clear();
        public ComplexElementItem[] getChildren() {
            private final CompositeElement composite;
        public void nextInlineEditor(boolean next) {
                getExecutionContext().getDataSource(),
        } else {
            return collection;
            return type;
import org.eclipse.osgi.util.NLS;
                return getChildren(wrap(parent, ((ComplexElementReferrer) parent).getReferencedValue()));
                return attribute;
            if (collection instanceof DBDCollection) {
    private static final Log log = Log.getLog(ComplexObjectEditor.class);
            if (direction == SWT.UP) {
            return items.toArray(ComplexElementItem[]::new);
        protected boolean created;
import org.jkiss.dbeaver.utils.GeneralUtils;
            if (parent instanceof ComplexElementItem) {
        public abstract DBSTypedObject getDataType();
                    if (treeControl.getColumn(0).getWidth() < 100) {
        public void updateSelectionValue(Object value) {
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetThemeSettings;
            final CollectionElement collection = item.collection;
            public DBSTypedObject getDataType() {
    private IValueEditor curCellEditor;
    public void setModel(DBCExecutionContext executionContext, final Object value)
    }
                if (treeItem != null) {
                return adapter.cast(value);
        if (columnIndex == 0) {
                e.detail = SWT.TRAVERSE_NONE;

        public void showMessage(String message, DBPMessageType messageType)
        final boolean extendable = GeneralUtils.adapt(object, CollectionElement.class) != null;
                } catch (DBException e) {
                    if (editorControl != null) {

        public Object getReferencedValue() {
        }
            return editType;
        }
            column.getColumn().setText(UIMessages.ui_properties_name);
        }
        getTree().setRedraw(false);
            final CollectionElement collection = getElement();
        }
    private static class CollectionElement implements ComplexElement {
                swap(collection, index, index - 1);
                curCellEditor = newCellEditor;

            };
        treeEditor.grabHorizontal = true;
            this.value = runnable.getResult();
                newCellEditor.createControl();
            public void mouseDoubleClick(MouseEvent e)
    // Model object -> intermediate wrapper object
            }

            return composite;
            super(null, source);

        {
    private final Action addElementAction;
 * DBeaver - Universal Database Manager
            cache.put(object, element);
    public static Object unwrap(@NotNull Object object) {
        manager.add(moveElementDownAction);
                    log.error("Error setting composite attribute value", e);
 * you may not use this file except in compliance with the License.
        }
                refresh();

        final Object object = getStructuredSelection().getFirstElement();
        @Override
                collection.items.add(item);

            public String getName() {
    }
                setSelection(new StructuredSelection(collection.items.get(index - 1)));
                element = new CollectionElement(parent, collection);
        }
    }
                this.valueHandler = item.getValueHandler();
                this.value = item.value;
            @NotNull
        this.backgroundAdded = ResultSetThemeSettings.instance.backgroundAdded;
        public PropsLabelProvider(boolean isTitle) {

                try {
            this.items = new ArrayList<>();
            IValueEditor newCellEditor = valueController.getValueManager().createEditor(valueController);
            @NotNull
        private void swap(@NotNull CollectionElement collection, int firstIndex, int secondIndex) {

            } else {
        {
                    Control editorControl = newCellEditor.getControl();
        public void update(ViewerCell cell)
        @Override
            cell.setText(getColumnText(element, cell.getColumnIndex(), DBDDisplayFormat.UI));
            final CompositeElement element = new CompositeElement(parent, composite);


        @Override
        @Override
    }
    private final CopyAction copyNameAction;
        private final Object parent;
                final TreeItem[] selection = treeControl.getSelection();
            column.setLabelProvider(new PropsLabelProvider(false));
    }

            final ComplexElementItem element = (ComplexElementItem) getStructuredSelection().getFirstElement();
        });
    }
import org.jkiss.code.NotNull;
            final IStructuredSelection selection = getStructuredSelection();
        private final String name;
            this.reference = reference;

        public CollectionElement(@Nullable Object parent, @NotNull Collection<?> source) {
                final IValueController valueController = new ComplexValueController(
            if (element.created) {
import org.eclipse.swt.events.ControlEvent;
 * Copyright (C) 2010-2024 DBeaver Corp and others
            if (selection.isEmpty()) {
            final int index = collection.items.indexOf(item);

                this.value = item.value;
            this.direction = dir;

                log.error(e);
        }
        @Override
import org.jkiss.dbeaver.model.impl.data.DefaultValueHandler;
            final ReferenceElement element = new ReferenceElement(parent, reference);
                DBeaverIcons.getImageDescriptor(dir == SWT.UP ? UIIcon.ARROW_UP : UIIcon.ARROW_DOWN));
        this.removeElementAction = new RemoveElementAction();
        Control oldEditor = treeEditor.getEditor();
    }
        @Override

        @Nullable
            @NotNull

        copyNameAction.setEnabled(object != null);
                } catch (DBCException e) {

                } else {
            // No editor for complex types themselves (only leaves can be edited)
        protected boolean modified;
        public String getValueName()
            if (!getSelection().isEmpty()) {
            final CollectionElement.Item item = (CollectionElement.Item) getStructuredSelection().getFirstElement();
import org.eclipse.jface.viewers.*;

        }
                    element.items.add(new CompositeElement.Item(element, attribute, wrap(element, composite.getAttributeValue(attribute))));
            final ITreeSelection selection = getStructuredSelection();
        @Override
            }
        public Object extract(@NotNull DBRProgressMonitor monitor) {
        }
    }
            } else if (collection instanceof Set) {
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithResult;
            return "--> [" + ((ReferenceElement) value).reference.getReferencedType().getName() + "]";
    private final Action moveElementUpAction;
    public void contributeActions(IContributionManager manager) {

 * See the License for the specific language governing permissions and
                return DefaultValueManager.INSTANCE;
    }
        @Override
        }
                    BaseValueManager.makeNullValue(valueController),
    }


            refresh();
            if (collection != null && collection.source instanceof DBDFixedSizeCollection) {
                setToNullAction.setEnabled(setToNullAction.isEnabled() && ((DBDFixedSizeCollection) collection.source).canSetElementsToNull());
            if (!selection.isEmpty()) {
            }
        public Object extract(@NotNull DBRProgressMonitor monitor) {
import org.jkiss.dbeaver.Log;
        protected final List<Item> items;
            return "[" + ((CompositeElement) value).type.getName() + "]";
            }
                if (index == 0) {
                    return;
                    try (DBCSession session = executionContext.openSession(monitor, DBCExecutionPurpose.UTIL, "Read reference value")) {
        }
                    UIUtils.packColumns(treeControl, true, new float[]{0.2f, 0.8f});
                try {
    }
    public ComplexObjectEditor(IValueController parentController, IValueEditor editor, int style)
            final CollectionElement.Item item = (CollectionElement.Item) object;
        @Override
                this.composite = composite;
        }

        if (object instanceof DBDReference) {
            }
        private final List<Item> items;
            this.source = source;
            return getChildren(parent);
        this.setToNullAction = new SetToNullAction();
            for (Item item : items) {
    }
            return element;
            } else if (e.detail == SWT.TRAVERSE_ESCAPE) {
                    return;
            } else {
import org.jkiss.dbeaver.model.DBValueFormatting;
            removeElementAction.setEnabled(false);
            autoUpdateComplexValue();
            this.title = isTitle;
            }
                return getChildren(((ComplexElementItem) parent).value);
                public void run(DBRProgressMonitor monitor) throws InvocationTargetException {
import org.jkiss.utils.CommonUtils;
        @Override
            private final CollectionElement collection;
    private final Color backgroundModified;
            this.editType = editType;
        @Override
                try {
                super(collection, value);
    @NotNull
            public String getName() {
        this.moveElementDownAction = new MoveElementAction(SWT.DOWN);
        }
        this.copyNameAction = new CopyAction(true);

        }
            return cache.get(object);
    {

        Menu menu = menuMgr.createContextMenu(control);

        }
            @NotNull
        @Override
        if (editable && object instanceof CollectionElement.Item) {
    private final IValueEditor editor;
        @Override

            collection.items.set(firstIndex, collection.items.get(secondIndex));
            disposeOldEditor();
        public abstract String getName();


            return valueHandler;
            return element;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                    // Give a chance to catch it in editor handler
import org.jkiss.dbeaver.ui.UIIcon;

            @Override
        }
import org.jkiss.dbeaver.model.impl.SimpleTypedObject;

                    treeControl.removeControlListener(this);
            autoUpdateComplexValue();
                parentController.getValueManager().contributeActions(manager, parentController, editor);

import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.events.ControlAdapter;
                }
        }
                } else {
                final TreeItem treeItem = (TreeItem) findItem(item);
                return "[" + element.items.size() + "]";
                if (!packing) {
        public ComplexElementItem[] getChildren() {
            return element;
        }
                this.value = value;
            updateActions();
            @Override
                return null;
        return object;
            @Override
        @Override

import java.util.*;
            return valueHandler.getValueDisplayString(type, value, format);
        public void run()
        if (item == null) {
        if (isComplexType(item.getData())) {
                    showEditor(item, false);
                        monitor.done();

        return unwrap(getInput());
import org.eclipse.jface.window.ToolTip;
        ComplexElementItem[] getChildren();

            if (obj instanceof CompositeElement.Item) {
        }
                valueType,
        if (object instanceof ComplexElement) {
            final DBDReference reference = (DBDReference) object;
        } finally {
                    }


 *
                this.valueHandler = item.getValueHandler();
            @Override
    private class PropsLabelProvider extends CellLabelProvider {
        private final DBSTypedObject type;
 * Structure object editor
        @Override
            @Override
        {
            if (parent == null) {
            return value;
            parentController.refreshEditor();

                return DBUtils.findValueHandler(composite.type.getDataSource(), attribute);
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.core.runtime.IAdaptable;
    }

        }
            }
            return parent;
            cache.put(object, element);
            @NotNull

                return ((CompositeElement.Item) obj).attribute.getName() + " " + ((CompositeElement.Item) obj).attribute.getTypeName();

        menuMgr.addMenuListener(manager -> {
        {
    private void disposeOldEditor()
    }
        private final boolean title;
            return ValueManagerRegistry.findValueManager(
            cache.put(object, element);
            return;
            getTree().setRedraw(true);
        }
        public DBSTypedObject getValueType()
    }
            refresh(this.item);
    private void showEditor(final TreeItem item, boolean advanced) {
        Object getReferencedValue();
            return parentController.getValueSite();
        @Override
        return object instanceof CollectionElement
        }
    }
        if (object instanceof ComplexElementItem) {
    @NotNull
                final CompositeElement.Item item = (CompositeElement.Item) obj;
    private interface ComplexElement {

            } else {
                    Object populatedCollection = ((DBDFixedSizeCollection) collection.source).populateCollection();
                return;
        }
        }
            private boolean packing = false;
            moveElementDownAction.setEnabled(false);
        ComplexValueController(ComplexElementItem obj, EditType editType) throws DBCException {
        }
                    UIUtils.setClipboardContents(getTree().getDisplay(), TextTransfer.getInstance(), text);
            UIUtils.runInUI(runnable);

        private final int direction;
            final CollectionElement collection = item.collection;
                TreeItem item = treeControl.getItem(new Point(e.x, e.y));
            boolean isFixedSize = collection.source instanceof DBDFixedSizeCollection;

    private class CopyAction extends Action {
            super(DataEditorsMessages.complex_object_editor_dialog_menu_add_element, DBeaverIcons.getImageDescriptor(UIIcon.ROW_ADD));
        control.addDisposeListener(e -> menuMgr.dispose());
        @Nullable
    private class MoveElementAction extends Action {
        private final Object parent;
            column.getColumn().setText(UIMessages.ui_properties_value);
        @Override
                    log.error("Error cloning composite value", e);
        @Override
            return name;
            this.source = source;
                if (selection.length == 0) {
                return "[" + ((DBDCollection) element.source).getComponentType().getName() + " - " + element.items.size() + "]";
            final CollectionElement element;
                    } catch (DBCException e) {

                return values.collect(Collectors.toList());
        @Override
            return element;
                String text = getColumnText(

        {
                }
                    log.error("Failed to populate the collection");
 *
                } catch (DBCException e) {
    private final SetToNullAction setToNullAction;
            moveElementUpAction.setEnabled(child && index > 0 && !isFixedSize);
    public Object extractValue() {
        @NotNull

        {
            }

 * distributed under the License is distributed on an "AS IS" BASIS,
    @Nullable
        }
import org.eclipse.jface.action.IContributionManager;
            try {

        @NotNull
        }
            this.item = obj;

 * You may obtain a copy of the License at
        if (value instanceof CollectionElement) {
                    ((IValueEditorStandalone) newCellEditor).showValueEditor();
        MenuManager menuMgr = new MenuManager();
            DBWorkbench.getPlatformUI().showError("Cell editor", "Can't open cell editor", e);
import org.jkiss.dbeaver.ui.data.registry.ValueManagerRegistry;
            }


        }
        manager.add(addElementAction);
        Object getParent();
            }
                    IValueController.EditType.NONE
    private String getValueText(@NotNull DBDValueHandler valueHandler, @NotNull DBSTypedObject type, @Nullable Object value, @NotNull DBDDisplayFormat format)
            return DBeaverIcons.getImage(DBValueFormatting.getTypeImage(item.getDataType()));

        }
        private final DBDValueHandler valueHandler;
            DBSTypedObject valueType = getValueType();
            refresh();
                setSelection(new StructuredSelection(collection.items.get(index + 1)));
        }
        }
                return ((ComplexElement) parent).getChildren();
    private final IValueController parentController;

        public EditType getEditType()

        @Nullable
                      ? DataEditorsMessages.complex_object_editor_dialog_menu_move_up_element
                @Override
        public DBDValueHandler getValueHandler()
import org.eclipse.swt.custom.TreeEditor;
        }
            @Override
            public Item(@NotNull CompositeElement composite, @NotNull DBSAttributeBase attribute, @Nullable Object value) {

                ((DBDCollection) collection).setContents(values.toArray());

        public void run() {
        }
        private final EditType editType;
                }
        if (columnIndex == 0) {

            this.item.modified = true;
    }
            } else {

            return items.toArray(ComplexElementItem[]::new);

                element = new CollectionRootElement(collection);

        {
            if (obj instanceof CollectionElement.Item) {
        try {
        }
            return null;
            return parentController.getDataController();
import org.jkiss.dbeaver.ui.internal.UIMessages;
            final Stream<Object> values = items.stream().map(ComplexObjectEditor::unwrap);
                    (ComplexElementItem) selection.getFirstElement(),
        if (object instanceof DBDComposite) {
        RemoveElementAction() {
        public void run() {
                (ComplexElementItem) item.getData(),
            }
        Object extract(@NotNull DBRProgressMonitor monitor);


            return item.getName();
            if (parent instanceof ComplexElement) {
            parentController.updateValue(extractValue(), false);
            } catch (DBCException e) {
            collection.items.remove(index);
        @Override
            }
            final int index = collection.items.indexOf(item);
        @Override
            }

        @Override
        public DBCExecutionContext getExecutionContext()
import java.util.stream.Collectors;
    {

import org.eclipse.swt.dnd.TextTransfer;
        }
            } else {
import org.eclipse.swt.events.MouseAdapter;
            final CollectionElement.Item temp = collection.items.get(firstIndex);
        menuMgr.setRemoveAllWhenShown(true);
import java.lang.reflect.InvocationTargetException;


import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
            return GeneralUtils.adapt(element, CollectionElement.class);
            @Override
            moveElementUpAction.setEnabled(false);
        }

        }
            if (!collection.items.isEmpty()) {
            }
                }
        public CompositeElement(@Nullable Object parent, @NotNull DBDComposite source) {
                }
            }
    }
import java.util.List;
                    collection = (DBDCollection) ((DBDValueCloneable) collection).cloneValue(monitor);
            }
            this.parent = parent;
            @NotNull
        try {
        public void closeInlineEditor() {
            @NotNull
                    element.items.add(new CollectionElement.Item(element, wrap(element, item)));
            this.parent = parent;
        {

        }
                    monitor.beginTask("Read object reference", 1);
        public ComplexElementItem[] getChildren() {
        @NotNull
        }
            return getValueText(item.getValueHandler(), item.getDataType(), item.value, format);
            column.getColumn().setWidth(120);
            TreeViewerColumn column = new TreeViewerColumn(this, SWT.NONE);
    private final Map<Object, Object> cache = new IdentityHashMap<>();
import org.jkiss.dbeaver.model.struct.DBSDataType;
        private static class Item extends ComplexElementItem {
        }
    private class ReferenceElement implements ComplexElement, ComplexElementReferrer {
        @Override
                valueController.updateValue(
            Collection<?> collection = source;
                this.collection = collection;
    private final TreeEditor treeEditor;

                        throw new InvocationTargetException(e);
            return isReadOnlyType(((ComplexElementItem) object).getParent());
            }
            column.getColumn().setMoveable(true);
                        Point editorSize = editorControl.computeSize(SWT.DEFAULT, SWT.DEFAULT);
                for (DBSAttributeBase attribute : composite.getAttributes()) {

                element.items.add(new CollectionRootElement.Item(element, wrap(element, object)));
        private final boolean isName;
        } else {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                getValueHandler().getValueObjectType(valueType));
    }

        }
        if (object instanceof Collection<?> collection) {
            final int index = collection.items.indexOf(item);
                log.error("Error setting value attribute to NULL", e);
    private void updateActions() {
 * limitations under the License.
            public DBDValueHandler getValueHandler() {

                    showEditor(treeItem, false);
        final Tree treeControl = super.getTree();
            }
        });
            column.getColumn().setMoveable(true);
        this.parentController = parentController;
        private static class Item extends CollectionElement.Item {
            }
            return unwrap(((ComplexElementItem) object).value);
        control.setMenu(menu);

import org.eclipse.ui.IWorkbenchPartSite;
                return attribute.getName();
            final CollectionElement.Item item = (CollectionElement.Item) getStructuredSelection().getFirstElement();

        }
        public boolean hasChildren(Object parent) {
import org.jkiss.dbeaver.model.exec.DBCSession;
        treeEditor = new TreeEditor(treeControl);
                }
        } else if (value instanceof ReferenceElement) {
        treeEditor.horizontalAlignment = SWT.RIGHT;
        }

        // Clean up any previous editor control
        @Override
            }

        {
import org.jkiss.dbeaver.ui.data.managers.BaseValueManager;

            setInput(wrap(null, value));
        public Object extract(@NotNull DBRProgressMonitor monitor) {
            || object instanceof CollectionElement.Item && isComplexType(((CollectionElement.Item) object).value)

}

            try {
            } else {
    private final Color foregroundReadOnly;
        public Object getValue()
            }
    }
                setSelection(new StructuredSelection(collection.items.get(CommonUtils.clamp(index, 0, collection.items.size() - 1))));
        manager.add(new Separator());
                    true
        });
    }
        }
        {
                }
            try {
        if (oldEditor != null) oldEditor.dispose();
        private final DBDComposite source;
            return reference;
    private class RemoveElementAction extends Action {
            } else {
                        //treeEditor.minimumWidth = editorSize.y;
            column.getColumn().setWidth(200);
        disposeOldEditor();
        }
        manager.add(removeElementAction);
            @Override
        @NotNull
        @Nullable

        }

                    composite = (DBDComposite) ((DBDValueCloneable) composite).cloneValue(monitor);
        }
                return values.collect(Collectors.toSet());
            }
            public DBSTypedObject getDataType() {
            }
        addSelectionChangedListener(event -> updateActions());
            }
        MoveElementAction(int dir) {
                    isName ? 0 : 1,
        private final Collection<?> source;

        Control control = getControl();
            return new ComplexElementItem[0];
            @NotNull
                        treeEditor.setEditor(editorControl, item, 1);
                }
import org.eclipse.jface.action.Action;
        @NotNull
        @Nullable
        }
 */
        @Nullable


                if (collection.source instanceof DBDCollection) {
        @NotNull

            @Override
            if (element.source instanceof DBDCollection) {

public class ComplexObjectEditor extends TreeViewer {
    {
                }
    }

            public Item(@NotNull CollectionElement collection, @Nullable Object value) {
        }
                );
                    } finally {
                log.error("Error getting structure meta data", e);
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
            if (collection instanceof DBDValueCloneable) {
        private final Object value;
                        editorControl.setFocus();
    }
    private final Action moveElementDownAction;
                showEditor(selection[0], (e.stateMask & SWT.SHIFT) == SWT.SHIFT);


                );
            ComplexElementItem element = (ComplexElementItem) cell.getElement();
            @Override

            this.item.value = value;
        }
                manager.add(setToNullAction);
            CollectionElement element = new CollectionRootElement(new ArrayList<>());
            disposeOldEditor();
                }

    }
            removeElementAction.setEnabled(child && !isFixedSize);
    private final CopyAction copyValueAction;

            if (e.detail == SWT.TRAVERSE_RETURN) {

        setToNullAction.setEnabled(editable);

            return ((ComplexElement) object).extract(new VoidProgressMonitor());
                    e.doit = true;
                this.value = value;
            final DBDComposite composite = (DBDComposite) object;
        private final DBSDataType type;
    }
        {
    private void createContextMenu()
        }
                if (item != null && UIUtils.getColumnAtPos(item, e.x, e.y) == 1) {
        this.foregroundReadOnly = ResultSetThemeSettings.instance.foregroundNull;
        private final DBDReference reference;
    private static boolean isReadOnlyType(@Nullable Object object) {
        @Override
            }
    private void autoUpdateComplexValue() {
            }

            if (isFixedSize) {
        if (DBWorkbench.getPlatform().getPreferenceStore().getBoolean(ResultSetPreferences.RS_EDIT_AUTO_UPDATE_VALUE)) {
            if (composite instanceof DBDValueCloneable) {
            addElementAction.setEnabled(editable && extendable);
        public IWorkbenchPartSite getValueSite()
            } else if (element.modified) {
            this.executionContext = executionContext;
        public IValueManager getValueManager() {
            public Item(@NotNull CollectionElement collection, @Nullable Object value) {
        }
        @Nullable

        @Override
            return ((ComplexElement) items.get(0).value).extract(monitor);
                return String.valueOf(collection.items.indexOf(this) + 1);
            collection.items.set(secondIndex, temp);
        @NotNull
                    log.error("Error cloning collection value", e);


                this.attribute = attribute;
        public void refreshEditor() {
            }
            }
            cell.setImage(getColumnImage(element, cell.getColumnIndex()));
        }
    private abstract static class ComplexElementItem implements IAdaptable {
import org.jkiss.dbeaver.model.exec.DBCException;
        treeEditor.minimumWidth = 50;
                return DataEditorsMessages.complex_object_editor_root_element_name;
                if (!advanced) {
        } catch (DBException e) {
        this.moveElementUpAction = new MoveElementAction(SWT.UP);
    @Nullable
            @NotNull
            moveElementDownAction.setEnabled(child && index < collection.items.size() - 1 && !isFixedSize);
            {
        @NotNull
import org.jkiss.dbeaver.ui.UIUtils;
        treeControl.setLinesVisible(true);


            } else if (obj instanceof CompositeElement.Item) {
import org.eclipse.swt.events.MouseEvent;

        }

                }
        @Override
                        result = reference.getReferencedObject(session);

        @Override
                if (newCellEditor instanceof IValueEditorStandalone) {
                    newCellEditor.primeEditorValue(valueController.getValue());
    private final Color backgroundDeleted;

import org.jkiss.dbeaver.model.DBPMessageType;
            expandAll();
        @Override
            super(NLS.bind(DataEditorsMessages.complex_object_editor_dialog_menu_copy_element, getTree().getColumn(isName ? 0 : 1).getText()));

        this.addElementAction = new AddElementAction();


                    return ((DBDCollection) collection.source).getComponentValueHandler();
            return executionContext;
    }

        }
            if (CommonUtils.equalObjects(this.item.value, value)) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.eclipse.swt.graphics.Image;
    private Object wrap(@Nullable Object parent, @Nullable Object object) {
        @Override

import org.eclipse.jface.action.Separator;

                for (Object item : collection) {
        @NotNull

        @Override
            public DBDValueHandler getValueHandler() {
            IValueController valueController = new ComplexValueController(
            return;

            if (valueType == null) {
import org.jkiss.dbeaver.ui.data.managers.DefaultValueManager;
        @Override
            }
            public ComplexElement getParent() {
import org.eclipse.swt.SWT;
        } else if (value instanceof CompositeElement) {

import org.jkiss.dbeaver.DBException;
        }
    }
        public void run() {
            || object instanceof CompositeElement.Item && isComplexType(((CompositeElement.Item) object).value)
                } catch (DBException e) {
            }
            return true;
                try {
        }
            this.type = source.getDataType();

        }
                final CollectionElement.Item item = (CollectionElement.Item) obj;
import org.jkiss.dbeaver.ui.editors.data.internal.DataEditorsMessages;
        @Override

        public String getToolTipText(Object obj) {
                e.doit = false;
            disposeOldEditor();

            final DBRRunnableWithResult<Object> runnable = new DBRRunnableWithResult<>() {
            this.items = new ArrayList<>();
            column.setLabelProvider(new PropsLabelProvider(true));

                }

import org.jkiss.dbeaver.ui.controls.TreeContentProvider;
import org.jkiss.dbeaver.ui.data.*;
        } else {
                } else {
                this.type = item.getDataType();

        super(parentController.getEditPlaceholder(), style | SWT.SINGLE | SWT.FULL_SELECTION);
