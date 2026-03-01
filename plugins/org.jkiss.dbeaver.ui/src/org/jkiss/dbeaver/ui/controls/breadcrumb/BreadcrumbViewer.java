        container.addListener(SWT.Resize, e -> refresh());
        return List.of(selectedItem.getData());
                BreadcrumbItem item = breadcrumbItems.get(index);
    void fireDoubleClick() {
 * limitations under the License.
    protected void internalRefresh(Object element) {
            }


    void selectItem(@Nullable BreadcrumbItem item) {

    }
                BreadcrumbItem item = breadcrumbItems.remove(breadcrumbItems.size() - 1);

        } else {
        boolean requiresLayout = false;
    }
package org.jkiss.dbeaver.ui.controls.breadcrumb;
        }
import org.eclipse.swt.layout.GridLayout;
        for (BreadcrumbItem item : breadcrumbItems) {
        if (style != SWT.TOP && style != SWT.BOTTOM) {
        container.setLayout(GridLayoutFactory.fillDefaults().spacing(0, 0).create());
            throw new IllegalArgumentException("Invalid style bits");

/*
 * distributed under the License is distributed on an "AS IS" BASIS,
    }

    protected Widget doFindItem(Object element) {
     *
                        index = 0;
    @Override
    @Override

    private ITreeContentProvider dropDownContentProvider;


public class BreadcrumbViewer extends StructuredViewer {

    public void setToolTipLabelProvider(@Nullable ILabelProvider toolTipLabelProvider) {
            int index = breadcrumbItems.size() - 1;
        item.setContentProvider((ITreeContentProvider) getContentProvider());
            if (item != null) {
        setSelectionToWidget(getSelection(), false);
        if (toolTipLabelProvider != null) {
     * @param style  the style bits
 * DBeaver - Universal Database Manager
        var parent = provider.getParent(element);
                for (BreadcrumbItem item1 : breadcrumbItems) {
                breadcrumbItems.get(breadcrumbItems.size() - 1).setTrailing(false);
    }
            if (COLLAPSE_ELEMENTS && lastIndex > 0) {


        }

                selectedItem = item;
            return;
            while (currentWidth < containerWidth && index >= 0) {
        return index + 1;
            return null;
    protected void assertContentProviderType(IContentProvider provider) {

    @Override

    @Nullable
        }

                if (item.isShowText()) {
    public ITreeContentProvider getDropDownContentProvider() {
     * Creates a breadcrumb viewer.
        if (container.isDisposed()) {
}
            item.dispose();
        return breadcrumbItems.get(0);
                    item.setShowText(false);
            breadcrumbItems.add(item);
            item.setToolTipLabelProvider((ILabelProvider) getLabelProvider());
        }
 * See the License for the specific language governing permissions and
        if (!COLLAPSE_ELEMENTS) {


    }
    protected void inputChanged(Object input, Object oldInput) {
    }
    }

            item.setToolTipLabelProvider(toolTipLabelProvider);
            item.setData(element);
        }

    protected Object getRoot() {

            return null;
                }
        Assert.isTrue(provider instanceof ITreeContentProvider);
    }
        for (BreadcrumbItem item : breadcrumbItems) {
                container.layout(true, true);

                    }
    private int buildItemChain(@Nullable Object element) {
    }
    void fireMenuSelection(@NotNull Object element) {
    }
    private int computeWidth() {
            }
        }
            int index = 0;
    @NotNull
    }
import org.jkiss.code.NotNull;
     * @see SWT#BOTTOM

            updateSize();
        }
        this.dropDownContentProvider = dropDownContentProvider;
                }
                breadcrumbItems.get(lastIndex - 1).setTrailing(true);
        setDropDownContentProvider((ITreeContentProvider) provider);

    protected void setSelectionToWidget(List l, boolean reveal) {
    }
            BreadcrumbItem item = (BreadcrumbItem) doFindItem(element);
            if (Objects.equals(element, item.getData())) {
        }


 *
    private final int style;

 *
        }
                unmapElement(item.getData());
    }
import org.eclipse.swt.SWT;
        } else {
            } else {
        this.style = style;
    @Override
            while (currentWidth > containerWidth && index < breadcrumbItems.size()) {
    public ILabelProvider getToolTipLabelProvider() {
        int index = buildItemChain(parent);
        if (l == null) {
            }
        selectedItem = item;

        container = new Composite(parent, SWT.NONE);
                    requiresLayout = true;
        }
        return requiresLayout;

            }
        }
import java.util.List;
        int currentWidth = computeWidth();

        if (!(widget instanceof BreadcrumbItem item)) {
    @Override
                return item;
                index++;
        if (element == null) {
import org.eclipse.swt.widgets.Widget;

import org.eclipse.jface.layout.GridDataFactory;
        return toolTipLabelProvider;
    public void setDropDownContentProvider(@NotNull ITreeContentProvider dropDownContentProvider) {
            int lastIndex = buildItemChain(input);
    public void reveal(Object element) {
            if (item == null) {
        item.refresh();
        }
        }
import org.jkiss.dbeaver.ui.UIUtils;
            }
                    item1.refresh();
        }
        if (element == null) {
            return doFindItem(element);
    private BreadcrumbItem selectedItem;

 *     http://www.apache.org/licenses/LICENSE-2.0

        }
        BreadcrumbItem item;
        for (BreadcrumbItem item : breadcrumbItems) {
    }
        }

            BreadcrumbItem item = (BreadcrumbItem) doFindInputItem(element);
 *
        if (equals(element, item.getData())) {


                    currentWidth = computeWidth();
    protected void doUpdateItem(Widget widget, Object element, boolean fullMap) {
        } else if (currentWidth < containerWidth) {
import org.eclipse.jface.viewers.*;

    private boolean updateSize() {
    private static final boolean COLLAPSE_ELEMENTS = false;
            unmapElement(item.getData());

                ((GridLayout) container.getLayout()).numColumns--;
            item.setData(element);
     * @see SWT#TOP
        }
 * you may not use this file except in compliance with the License.
            associate(element, item);
                    currentWidth = computeWidth();
    private final List<BreadcrumbItem> breadcrumbItems = new ArrayList<>();
            item.refresh();
    }
            return 0;

                BreadcrumbItem item = breadcrumbItems.get(index);
    private final Composite container;

        return result;

        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        super.setContentProvider(provider);
    @Override
        if (index < breadcrumbItems.size()) {
        item.setLabelProvider((ILabelProvider) getLabelProvider());


                }
            result += item.computeWidth();
     */

    @Override
        int result = 0;
        if (fullMap) {
    }
    }

    public BreadcrumbViewer(@NotNull Composite parent, int style) {
            if (updateSize()) {
        return null;
        fireDoubleClick(new DoubleClickEvent(this, getSelection()));
        return container;
    protected List<?> getSelectionFromWidget() {
            unmapElement(item.getData());
        }
    }
    protected Widget doFindInputItem(Object element) {
                    } else {
            item = breadcrumbItems.get(index);
            }
    @NotNull
    @Override
 * You may obtain a copy of the License at
import org.eclipse.swt.events.DisposeEvent;
            mapElement(element, item);
import org.eclipse.core.runtime.Assert;
        if (Objects.equals(element, getInput())) {
    public Control getControl() {
    public int getStyle() {
            }
 * Unless required by applicable law or agreed to in writing, software
    @Override
            return;
import org.eclipse.swt.widgets.Control;
    /**
    }
    @Override
    }
 */
        return dropDownContentProvider;
        return item;
            if (COLLAPSE_ELEMENTS && !breadcrumbItems.isEmpty()) {
    }
    public void setContentProvider(IContentProvider provider) {
import java.util.Objects;


                        requiresLayout = true;
            update(element, null);
    @Override
    private ILabelProvider toolTipLabelProvider;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return null;
                index--;
        container.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
        } else {
            }
        int containerWidth = container.getClientArea().width;
    // Makes breadcrumb items collapse by hiding their text if there is not enough space
    }
    private BreadcrumbItem createItem() {
    }
     * @param parent the parent composite

            return currentWidth < containerWidth;


                        item.setShowText(false);
        this.toolTipLabelProvider = toolTipLabelProvider;
        var provider = (ITreeContentProvider) getContentProvider();
        } else {

import java.util.ArrayList;
        }
        }
    @Override
        return style;
    }

import org.eclipse.jface.layout.GridLayoutFactory;
                item.refresh();
        try (var ignored = UIUtils.disableRedraw(container)) {
            container.layout(true, true);
        if (selectedItem == null || selectedItem.getData() == null) {
        if (breadcrumbItems.isEmpty()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.widgets.Composite;
    protected void handleDispose(DisposeEvent event) {
        try (var ignored = UIUtils.disableRedraw(container)) {
        for (Object element : l) {
            item = createItem();
                    item.setShowText(true);
                    if (currentWidth > containerWidth) {
    @Override
            while (lastIndex < breadcrumbItems.size()) {
        if (currentWidth > containerWidth) {
        fireOpen(new OpenEvent(this, new StructuredSelection(element)));
import org.jkiss.code.Nullable;
            }

    }
        mapElement(element, item);
            return;
                if (!item.isShowText()) {
        BreadcrumbItem item = new BreadcrumbItem(this, container);
        // all elements are always visible
            return List.of();
            ((GridLayout) container.getLayout()).numColumns++;
    }
        super.handleDispose(event);
                item.dispose();
