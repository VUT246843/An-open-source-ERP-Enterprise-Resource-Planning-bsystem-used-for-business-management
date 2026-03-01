

public class TextWithDropDown extends Composite {
            menu.setVisible(true);
    }
            item.setImage(DBeaverIcons.getImage(image));
    }
 * limitations under the License.
    }
        setLayout(GridLayoutFactory.fillDefaults().numColumns(2).spacing(0, 0).create());
import java.util.function.Consumer;
            menu.setLocation(pt.x, pt.y + rect.height);
        item.setData(data);
package org.jkiss.dbeaver.ui.controls;
        return text;

import org.jkiss.dbeaver.ui.DBeaverIcons;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.graphics.Point;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.text.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

import org.eclipse.swt.widgets.*;
        return menu;

            final Point pt = item.getParent().toDisplay(new Point(rect.x, rect.y));
    public Text getTextComponent() {
import org.eclipse.swt.layout.GridData;
        this.menuListener = menuListener;
    public MenuItem addMenuItem(@NotNull String text) {
        menuArrow.setImage(DBeaverIcons.getImage(UIIcon.TREE_COLLAPSE));
        menuContributor.accept(menu);
    }
            final Rectangle rect = item.getBounds();
import org.eclipse.jface.layout.GridLayoutFactory;

        addDisposeListener(event -> menu.dispose());
 *
 * Licensed under the Apache License, Version 2.0 (the "License");

    @NotNull

    private final Text text;
import org.eclipse.swt.events.MouseListener;
    public Menu getMenuComponent() {
        final MenuItem item = new MenuItem(menu, style);
 *     http://www.apache.org/licenses/LICENSE-2.0
    public MenuItem addMenuItem(@NotNull Menu menu, @NotNull String text, @Nullable DBIcon image, @Nullable Object data, int style) {
        if (menuListener != null) {
        this.menu = new Menu(parent.getShell());
        if (image != null) {

    }
/*
        item.setText(text);
    public void addMenuSeparator() {
        new MenuItem(menu, SWT.SEPARATOR);
        }
        Label menuArrow = new Label(this, SWT.NONE);
 */
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2025 DBeaver Corp and others

        return menuItem;
        return addMenuItem(menu, text, null, null, SWT.NONE);
    }
            final Control item = (Control) e.widget;
        }));
import org.eclipse.swt.SWT;
        setLayoutData(new GridData(SWT.BEGINNING, SWT.BEGINNING, false, false));
    public MenuItem addMenuItemWithMenu(@NotNull Menu parentMenu, @NotNull String text, @Nullable DBIcon image, @NotNull Consumer<Menu> menuContributor) {

 * See the License for the specific language governing permissions and
    @NotNull
        final Menu menu = new Menu(parentMenu);
    public MenuItem addMenuItemWithMenu(@NotNull String text, @Nullable DBIcon image, @NotNull Consumer<Menu> contributor) {
    }

import org.jkiss.dbeaver.ui.UIIcon;
 * You may obtain a copy of the License at
    }
        menuItem.setMenu(menu);
            item.addSelectionListener(menuListener);
    private final Menu menu;
        return addMenuItemWithMenu(menu, text, image, contributor);
        final MenuItem menuItem = addMenuItem(parentMenu, text, image, null, SWT.CASCADE);
        return item;

        }
    public TextWithDropDown(@NotNull Composite parent, int style, int textStyle, @Nullable SelectionListener menuListener) {
 * you may not use this file except in compliance with the License.

}
import org.eclipse.swt.events.SelectionListener;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
        super(parent, style);
        this.text = new Text(this, textStyle);
    private final SelectionListener menuListener;
    @NotNull
import org.jkiss.code.NotNull;
import org.jkiss.code.Nullable;
    @NotNull
 *
 *
        menuArrow.addMouseListener(MouseListener.mouseDownAdapter(e -> {
    @NotNull
import org.jkiss.dbeaver.model.DBIcon;
    @NotNull

