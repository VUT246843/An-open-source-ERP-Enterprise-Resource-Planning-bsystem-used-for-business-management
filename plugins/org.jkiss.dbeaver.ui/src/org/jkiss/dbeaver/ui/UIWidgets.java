 *
                UIUtils.setClipboardContents(tree.getDisplay(), TextTransfer.getInstance(), text.toString());
                    } else {
                        text.append(item.getText());
    }

    public static void setControlContextMenu(Control control, IMenuListener menuListener) {
        table.setMenu(menuMgr.createContextMenu(table));
                String delim = CommonUtils.unescapeDisplayString(items[i]);
 */
        });
        menu.add(new Action(UIMessages.utils_actions_copy_all_label) {
                public void run() {
                            if (i > 0) text.append("\t");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                }
                    StringBuilder text = new StringBuilder();
            fillDefaultTableContextMenu(manager, table);
                        if (!text.isEmpty()) text.append("\n");
            public void run() {
                    return;
            }
            menu.add(new Action("Copy " + tree.getColumn(0).getText()) {
                    if (!text.isEmpty()) text.append("\n");
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * distributed under the License is distributed on an "AS IS" BASIS,
                    }
                @Override
 * You may obtain a copy of the License at
    public static Combo createDelimiterCombo(Composite group, String label, String[] options, String defDelimiter, boolean multiDelims) {
        }
                            text.append(item.getText(i));
                    if (text.isEmpty()) {
                }
                combo.add(CommonUtils.escapeDisplayString(defDelimiter));
                        text.append(item.getText(0));
        MenuManager menuMgr = new MenuManager();
        MenuManager menuMgr = new MenuManager();
                        text.append(item.getText());
import org.jkiss.dbeaver.model.runtime.DBRCreator;
                    for (TableItem item : table.getSelection()) {
    }
import org.eclipse.swt.SWT;
        } else {
                int columnCount = table.getColumnCount();
import org.jkiss.dbeaver.Log;
            });
        control.addDisposeListener(e -> menuMgr.dispose());
        }
                public void run() {
/*
        menuMgr.addMenuListener(menuListener);
        table.addDisposeListener(e -> menuMgr.dispose());
 * you may not use this file except in compliance with the License.
import org.eclipse.swt.widgets.*;
                    UIUtils.setClipboardContents(table.getDisplay(), TextTransfer.getInstance(), text.toString());
            for (int i = 0, itemsLength = items.length; i < itemsLength; i++) {
        }
        });
                        for (int i = 0; i < columnCount; i++) {
                if (!menuCreator.createObject(menuMgr)) {
        return combo;
                for (TreeItem item : tree.getSelection()) {
            combo.add(CommonUtils.escapeDisplayString(option));
            });
                    return;
                        }
import org.eclipse.jface.action.IMenuListener;
                    for (TreeItem item : tree.getSelection()) {
                }
public class UIWidgets {
        if (table.getColumnCount() > 1) {
        control.setMenu(menuMgr.createContextMenu(control));
 * limitations under the License.
            combo.setText(CommonUtils.escapeDisplayString(defDelimiter));
 * UI Utils
 */
        menuMgr.addMenuListener(manager -> {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.utils.ArrayUtils;
                for (TableItem item : table.getSelection()) {
                        return;
                    StringBuilder text = new StringBuilder();
                    if (columnCount > 0) {

import org.eclipse.jface.action.MenuManager;
        combo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                    }
    public static void fillDefaultTreeContextMenu(IContributionManager menu, final Tree tree) {
                if (delim.equals(defDelimiter)) {
            menu.add(new Action(NLS.bind(UIMessages.utils_actions_copy_label, table.getColumn(0).getText())) {
 * See the License for the specific language governing permissions and
                    }
        if (!multiDelims) {
        if (tree.getColumnCount() > 1) {
                }
}
                    } else {
                    if (!text.isEmpty()) text.append("\n");
                }
                        if (!text.isEmpty()) text.append("\n");
                StringBuilder text = new StringBuilder();
                    }
import org.eclipse.osgi.util.NLS;
import org.eclipse.jface.action.IContributionManager;
            @Override
    private static final Log log = Log.getLog(UIWidgets.class);


                    if (text.isEmpty()) {
                    }
        menuMgr.setRemoveAllWhenShown(true);
    public static void fillDefaultTableContextMenu(IContributionManager menu, final Table table) {
                    return;
                            text.append(item.getText(i));
import org.jkiss.code.NotNull;
import org.jkiss.code.Nullable;
    }
                        }
            if (menuCreator != null) {
                    UIUtils.setClipboardContents(tree.getDisplay(), TextTransfer.getInstance(), text.toString());
import org.jkiss.utils.CommonUtils;
                if (text.isEmpty()) {
                StringBuilder text = new StringBuilder();
package org.jkiss.dbeaver.ui;
                if (text.isEmpty()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                }
            }
                int columnCount = tree.getColumnCount();
import org.eclipse.swt.layout.GridData;
    }
 * DBeaver - Universal Database Manager
        UIUtils.createControlLabel(group, label);
            }
        }
                        return;
        menu.add(new Action(UIMessages.utils_actions_copy_all_label) {
                    if (columnCount > 0) {
        Combo combo = new Combo(group, SWT.BORDER | SWT.DROP_DOWN);
import org.jkiss.dbeaver.ui.internal.UIMessages;
            }
        //menu.add(ActionFactory.SELECT_ALL.create(UIUtils.getActiveWorkbenchWindow()));
        menuMgr.setRemoveAllWhenShown(true);
                @Override
import org.eclipse.swt.dnd.TextTransfer;
 * Unless required by applicable law or agreed to in writing, software
            public void run() {
                    break;
                UIUtils.setClipboardContents(table.getDisplay(), TextTransfer.getInstance(), text.toString());
import org.eclipse.jface.action.Action;
                        text.append(item.getText(0));
        });
                    }
            @Override
            String[] items = combo.getItems();

/**
    public static void createTableContextMenu(@NotNull final Table table, @Nullable DBRCreator<Boolean, IContributionManager> menuCreator) {
                        for (int i = 0; i < columnCount; i++) {
                            if (i > 0) text.append("\t");
                    combo.select(i);
                }
                }

            }
            if (!ArrayUtils.contains(options, defDelimiter)) {
    }
        for (String option : options) {
 *
