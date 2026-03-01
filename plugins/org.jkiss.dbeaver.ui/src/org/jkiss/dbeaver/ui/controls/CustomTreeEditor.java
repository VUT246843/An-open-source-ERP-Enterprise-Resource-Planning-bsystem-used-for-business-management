    }
import org.eclipse.swt.custom.TreeEditor;
        }
        treeEditor.verticalAlignment = SWT.TOP;
            e.doit = false;
                }
        if (e.detail == SWT.TRAVERSE_RETURN) {


 *
        this.tree = tree;


 */
    @Override
        treeEditor.minimumHeight = editor.computeSize(SWT.DEFAULT, SWT.DEFAULT).y;
        }
    }
    }
    public void mouseDoubleClick(MouseEvent e) {
        }

 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
            // Only on left click
    public void mouseDown(MouseEvent e) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                        return;

    }
        }
/*
        });

    private int columnIndex;
                    if (item == null && tree.getItemCount() > 0) {
            return;

            if (editor != null) {
                e.detail = SWT.TRAVERSE_NONE;
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void mouseUp(MouseEvent e) {
        treeEditor.horizontalAlignment = SWT.CENTER;
}
                    }
package org.jkiss.dbeaver.ui.controls;
import org.eclipse.swt.widgets.TreeItem;
 * you may not use this file except in compliance with the License.

        editor.addTraverseListener(this);
            e.detail = SWT.TRAVERSE_NONE;
    }
            if (item != null) {
        tree.showItem(item);

        closeEditor();
                public void run() {
                e.doit = false;
    {
        final TreeItem item = tree.getItem(new Point(e.x, e.y));
import org.eclipse.swt.SWT;
            return;
        treeEditor.grabHorizontal = true;
        treeEditor = new TreeEditor(tree);
    @Override
                    showEditor(item);
            UIUtils.asyncExec(new Runnable() {
                showEditor(item);
                if (selection != null && selection.length >= 1) {
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
            @Override
                if (columnIndex < lastColumn) {
                TreeItem[] selection = tree.getSelection();
                    columnIndex++;
                }
    public void showEditor(TreeItem item) {

            }
            TreeItem item = treeEditor.getItem();
 * limitations under the License.
                    item = UIUtils.getNextTreeItem(tree, treeEditor.getItem());
                    if (item != null) {
            e.doit = false;
        tree.addTraverseListener(this);
            editor = null;
                    }

    public CustomTreeEditor(Tree tree) {
 *
    protected abstract void saveEditorValue(Control control, int index, TreeItem item);

        editor.setFocus();
            }
        } else if (e.detail == SWT.TRAVERSE_ESCAPE && editor != null) {
                closeEditor();
        if (editor == null) {
                closeEditor();

            });
 * See the License for the specific language governing permissions and
        Control editor = treeEditor.getEditor();
            e.detail = SWT.TRAVERSE_NONE;
    protected int firstTraverseIndex = -1, lastTraverseIndex = -1;
 * Tree editor


 *
            columnIndex = UIUtils.getColumnAtPos(item, e.x, e.y);
        if (oldEditor != null) oldEditor.dispose();
        if (editor != null && editor.isDisposed()) {
    public void keyTraversed(TraverseEvent e)
    }
        if (item != null) {
import org.eclipse.swt.widgets.Tree;
            public void focusLost(FocusEvent e) {
        Control oldEditor = this.treeEditor.getEditor();
    @Override
                    showEditor(selection[0]);
public abstract class CustomTreeEditor implements MouseListener, TraverseListener {
 */
                saveEditorValue(editor, columnIndex, treeEditor.getItem());
 * You may obtain a copy of the License at
        editor.addFocusListener(new FocusAdapter() {
            }
    public void closeEditor() {
        } else if (e.detail == SWT.TRAVERSE_TAB_NEXT && editor != null) {
import org.eclipse.swt.widgets.Control;
                closeEditor();
                }
                tree.setSelection(item);
            closeEditor();
    }
        treeEditor.minimumWidth = 50;
                int lastColumn = lastTraverseIndex > 0 ? lastTraverseIndex : tree.getColumnCount() - 1;
import org.eclipse.swt.events.*;
    protected abstract Control createEditor(Tree tree, int index, TreeItem item);
    private final TreeEditor treeEditor;
                        columnIndex = firstTraverseIndex > 0 ? firstTraverseIndex : 0;
                        item = tree.getItem(0);
import org.eclipse.swt.graphics.Point;
                @Override
import org.jkiss.dbeaver.ui.UIUtils;
        if (e.button != 1) {
                    } else {
/**
 * Unless required by applicable law or agreed to in writing, software
            } else {
                } else {
                saveEditorValue(editor, columnIndex, item);
        treeEditor.setEditor(editor, item, columnIndex);
        tree.addMouseListener(this);

    private final Tree tree;
 * distributed under the License is distributed on an "AS IS" BASIS,
                saveEditorValue(editor, columnIndex, treeEditor.getItem());

        final Control editor = createEditor(tree, columnIndex, item);
