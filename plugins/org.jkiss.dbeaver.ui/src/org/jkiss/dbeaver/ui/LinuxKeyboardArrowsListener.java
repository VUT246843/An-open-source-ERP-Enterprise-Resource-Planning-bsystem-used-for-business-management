        }
}
        tree.setSelection(parentItem);
import org.eclipse.swt.events.KeyListener;
        if (items.length != 1) {
    private final Tree tree;

    public void keyPressed(KeyEvent e) {
    public static void installOn(Tree tree) {
 */
    private LinuxKeyboardArrowsListener(Tree tree) {
        TreeItem[] items = tree.getSelection();
 *     http://www.apache.org/licenses/LICENSE-2.0

    @Override
 * Unless required by applicable law or agreed to in writing, software
        wasExpanded = item.getExpanded();
    @Override
            return;
    private TreeItem item;

/*
            return;
        this.tree = tree;
import org.eclipse.swt.widgets.Tree;
//See #9872. Seems to be a bug in Eclipse, the other gtk app we tried works as expected.
        }
        if (parentItem == null) {
        if (e.keyCode != SWT.ARROW_LEFT) {
    }
import org.eclipse.swt.widgets.TreeItem;
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
    private boolean wasExpanded;
import org.eclipse.swt.events.KeyEvent;

package org.jkiss.dbeaver.ui;
 * See the License for the specific language governing permissions and
        item = items[0];

        item = null;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 *
    @Nullable
        if (RuntimeUtils.isLinux()) {
        if (e.keyCode != SWT.ARROW_LEFT || wasExpanded || item == null) {
 * DBeaver - Universal Database Manager
        }

    }
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void keyReleased(KeyEvent e) {

    }
            return;
import org.jkiss.code.Nullable;
            return;
            tree.addKeyListener(new LinuxKeyboardArrowsListener(tree));
import org.jkiss.dbeaver.utils.RuntimeUtils;
        }
 *
        TreeItem parentItem = item.getParentItem();
 * limitations under the License.
import org.eclipse.swt.SWT;

 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
public class LinuxKeyboardArrowsListener implements KeyListener {
        }
        tree.showSelection();
