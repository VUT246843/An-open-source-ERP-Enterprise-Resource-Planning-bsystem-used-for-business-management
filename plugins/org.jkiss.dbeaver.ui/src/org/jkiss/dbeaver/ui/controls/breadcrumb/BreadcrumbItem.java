    public Composite getContainer() {
        } else {
import org.eclipse.jface.action.MenuManager;
            location.y += detailComposite.getSize().y;
        }
    public void setTrailing(boolean trailing) {

                manager.add(new Action(name, ImageDescriptor.createFromImage(image)) {
import org.eclipse.osgi.util.NLS;
                    public void run() {
    }
    public void setShowText(boolean showText) {
        }
                        openElement(element);
 *
    public void setText(@Nullable String text) {
 */
        UIUtils.setControlVisible(elementArrow, visible);
    }
        this.viewer = viewer;
    }

import org.jkiss.code.NotNull;
    @NotNull

        return container;

        elementArrow = new Label(container, SWT.NONE);
    private final MenuManager menuManager;



import org.eclipse.swt.graphics.Point;

    private final Composite imageComposite;

 * Unless required by applicable law or agreed to in writing, software

import org.eclipse.swt.layout.GridData;
        control.addMouseListener(new DoubleClickMouseAdapter() {
        if (this.showText == showText) {
        elementImage = new Label(imageComposite, SWT.NONE);
import org.jkiss.dbeaver.ui.DBeaverIcons;

    }
            }

        return container.computeSize(SWT.DEFAULT, SWT.DEFAULT).x;
import org.eclipse.swt.events.MouseEvent;
import org.jkiss.code.Nullable;
        addElementListener(elementImage);
 *

    @NotNull
    private void showMenu() {

        }
        }
    public BreadcrumbItem(@NotNull BreadcrumbViewer viewer, @NotNull Composite parent) {
 * limitations under the License.
import org.eclipse.swt.graphics.Image;
        if (CommonUtils.isBitSet(viewer.getStyle(), SWT.TOP)) {
 * distributed under the License is distributed on an "AS IS" BASIS,

        this.toolTipLabelProvider = toolTipLabelProvider;
        this.showText = showText;

    }
        elementText.setToolTipText(toolTipText);
    }
    }
        control.addMenuDetectListener(e -> showMenu());
    @Override
import org.jkiss.dbeaver.ui.controls.DoubleClickMouseAdapter;
    public void setToolTipText(@Nullable String toolTipText) {

            detailComposite.setTabList(new Control[]{imageComposite});
        menu.setVisible(true);

        }

            }
        elementArrow.setImage(DBeaverIcons.getImage(UIIcon.TREE_EXPAND));
            }
        this.labelProvider = labelProvider;
 * DBeaver - Universal Database Manager
            public void onMouseSingleClick(@NotNull MouseEvent e) {
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.widgets.*;

            }
 * Licensed under the Apache License, Version 2.0 (the "License");
        detailComposite.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
import org.eclipse.swt.SWT;
            detailComposite.setTabList(new Control[]{textComposite});
        setToolTipText(toolTipLabelProvider.getText(input));


        container = new Composite(parent, SWT.NONE);
import org.eclipse.jface.action.Action;
    }
        }
        addElementListener(imageComposite);
        addElementListener(detailComposite);
import org.jkiss.dbeaver.ui.UIUtils;

        if (image != elementImage.getImage()) {
    private final Composite detailComposite;
                var labelProvider = (ILabelProvider) viewer.getLabelProvider();
                });
    private void openElement(@NotNull Object element) {
        });
        setImage(labelProvider.getImage(input));

            // Adjust the location so the menu won't cover the viewer

 *     http://www.apache.org/licenses/LICENSE-2.0
    private final Label elementImage;
        container.dispose();
import org.jkiss.dbeaver.ui.UIIcon;
import org.eclipse.jface.resource.ImageDescriptor;
        Object input = getData();
            return;
    }
                BreadcrumbViewer viewer = getViewer();
    }
        UIUtils.setControlVisible(textComposite, showText);
import org.jkiss.utils.CommonUtils;
 * you may not use this file except in compliance with the License.
    private final BreadcrumbViewer viewer;
        elementImage.setToolTipText(toolTipText);
        if (showText) {

package org.jkiss.dbeaver.ui.controls.breadcrumb;
    }
    public boolean isShowText() {
        this.contentProvider = contentProvider;
                var element = elements[i];
import org.jkiss.dbeaver.ui.EmptyAction;


        detailComposite.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).spacing(0, 0).create());
 * You may obtain a copy of the License at
    }
        setText(labelProvider.getText(input));
        detailComposite = new Composite(container, SWT.NONE);
        super.dispose();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
        imageComposite.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
import org.eclipse.jface.viewers.ITreeContentProvider;
            @Override

    }
            if (elements.length > DROP_DOWN_MAX_ITEMS) {
import org.eclipse.swt.graphics.Rectangle;
        if (!text.equals(elementText.getText())) {
    }
        elementImage.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
    public void dispose() {
    public void setImage(@Nullable Image image) {
    public void setContentProvider(@NotNull ITreeContentProvider contentProvider) {
    public void setLabelProvider(@NotNull ILabelProvider labelProvider) {
 * See the License for the specific language governing permissions and
                    }
        menuManager = new MenuManager();
                var name = labelProvider.getText(element);
                    @Override
        if (text == null) {
        super(parent, SWT.NONE);
    }

    }
    @NotNull

    private final Composite textComposite;
                manager.add(new EmptyAction(NLS.bind("... {0} more", elements.length - DROP_DOWN_MAX_ITEMS)));
    private boolean showText = true;
    private ILabelProvider labelProvider;


        return container.getBounds();
    private ITreeContentProvider contentProvider;

 * Copyright (C) 2010-2025 DBeaver Corp and others
        elementText = new Label(textComposite, SWT.NONE);
        addElementListener(elementText);
        });

    public void setToolTipLabelProvider(@NotNull ILabelProvider toolTipLabelProvider) {
        Menu menu = menuManager.createContextMenu(container);
    private void setArrowVisible(boolean visible) {
    }
                viewer.fireDoubleClick();
 *

            @Override
        textComposite = new Composite(detailComposite, SWT.NONE);
        addElementListener(textComposite);
    public int computeWidth() {
                viewer.selectItem(BreadcrumbItem.this);
            public void onMouseDoubleClick(@NotNull MouseEvent e) {
        textComposite.setToolTipText(toolTipText);
    }
        textComposite.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
            var contentProvider = viewer.getDropDownContentProvider();
        viewer.fireMenuSelection(element);
        setArrowVisible(contentProvider.getParent(getData()) != null);
        textComposite.setLayout(GridLayoutFactory.fillDefaults().margins(2, 2).create());
    }
        menu.setLocation(location);
                showMenu();
    private final Composite container;
        Point location = detailComposite.toDisplay(0, 0);
            var elements = contentProvider.getElements(getData());
    private final Label elementText;

final class BreadcrumbItem extends Item {
    private ILabelProvider toolTipLabelProvider;
    public Rectangle getBounds() {
}


    public void refresh() {
    private static final int DROP_DOWN_MAX_ITEMS = 30;
    private final Label elementArrow;
        imageComposite.setLayout(GridLayoutFactory.fillDefaults().margins(2, 1).create());
        container.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, true));
            elementText.setText(text);
        return viewer;
        imageComposite = new Composite(detailComposite, SWT.NONE);
        menuManager.setRemoveAllWhenShown(true);
            for (int i = 0; i < Math.min(elements.length, DROP_DOWN_MAX_ITEMS); i++) {
    }
            text = "";
        menuManager.addMenuListener(manager -> {
import org.eclipse.jface.viewers.ILabelProvider;
    public BreadcrumbViewer getViewer() {
        elementArrow.setLayoutData(new GridData(SWT.END, SWT.CENTER, false, false));

        container.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).spacing(0, 0).create());
            elementImage.setImage(image);

        ((GridData) container.getLayoutData()).grabExcessHorizontalSpace = trailing;
        return showText;
        menuManager.dispose();
    private void addElementListener(@NotNull Control control) {
        elementText.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
                var image = labelProvider.getImage(element);

