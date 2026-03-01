                onFocusLost(editor);
    }
        }
        closeEditor();
import org.eclipse.swt.SWT;
                    } else {
                        }
 * limitations under the License.
    public CustomTableEditor(@NotNull Table table) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                        if (item == null && table.getItemCount() > 0) {
        } else if ((e.detail == SWT.TRAVERSE_TAB_NEXT || e.detail == SWT.TRAVERSE_TAB_PREVIOUS) && editor != null) {
    @Override
    }
                        item = UIUtils.getPreviousTableItem(table, tableEditor.getItem());
 * Copyright (C) 2010-2025 DBeaver Corp and others
                showEditor(item);
                int lastColumn = lastTraverseIndex > 0 ? lastTraverseIndex : table.getColumnCount() - 1;
 * DBeaver - Universal Database Manager
                if (columnIndex < lastColumn) {
                } else {
                saveEditorValue(editor, columnIndex, item);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.widgets.TableItem;
 * Unless required by applicable law or agreed to in writing, software
        table.addMouseListener(this);
                        }
        editor.setFocus();
        if (editor.isDisposed()) {
            }

                if (!isProposalPopupActive()) {
 * Table editor
 *
public abstract class CustomTableEditor implements MouseListener, TraverseListener {
                saveEditorValue(editor, columnIndex, tableEditor.getItem());

import org.eclipse.swt.graphics.Point;
    public void setProposalAdapter(ContentProposalAdapter proposalAdapter) {
    {

 */
                    if (item != null) {

        } else if (e.detail == SWT.TRAVERSE_ESCAPE && editor != null) {

                }
            public void focusLost(FocusEvent e) {

            e.detail = SWT.TRAVERSE_NONE;
    private ContentProposalAdapter proposalAdapter;
                            item = table.getItem(0);
                        item = UIUtils.getNextTableItem(table, tableEditor.getItem());
    public void keyTraversed(TraverseEvent e)
    }
    private void onFocusLost(Control editor) {

import org.jkiss.code.NotNull;

import org.eclipse.jface.fieldassist.ContentProposalAdapter;
        tableEditor.minimumWidth = 50;


        if (editor != null && !editor.isDisposed()) {

    }
                    this.closeEditor();
            } else if (editOnEnter) {
        this(table, null);
            if (!isProposalPopupActive()) {
            if (item != null) {

        this.proposalAdapter = proposalAdapter;
        if (item != null) {
        }
import org.eclipse.swt.widgets.Table;
 * you may not use this file except in compliance with the License.
        tableEditor.verticalAlignment = SWT.TOP;
import org.eclipse.swt.widgets.Control;
    @Override
        Control editor = tableEditor.getEditor();
    public void showEditor(TableItem item, int index) {
                    this.closeEditor();
            return;
                        return;
    }
            // Only on left click
                        columnIndex = Math.max(firstTraverseIndex, 0);
    public void showEditor(TableItem item) {
                }
    }
        table.showItem(item);
        this.table = table;
 * distributed under the License is distributed on an "AS IS" BASIS,
                e.doit = false;
                e.detail = SWT.TRAVERSE_NONE;
                    showEditor(selection[0]);
        editor.addFocusListener(new FocusAdapter() {
                    }
                if (!isProposalPopupActive()) {
    protected int firstTraverseIndex = -1, lastTraverseIndex = -1;
    protected boolean editOnEnter = true;
    private final Table table;
    private boolean isProposalPopupActive() {
                table.setSelection(item);

        tableEditor.grabHorizontal = true;
        tableEditor.horizontalAlignment = SWT.CENTER;
 *
    protected abstract Control createEditor(Table table, int index, TableItem item);

        }
 * See the License for the specific language governing permissions and
        if (e.detail == SWT.TRAVERSE_RETURN) {
            }
import org.eclipse.swt.events.*;
}
            TableItem item = tableEditor.getItem();
    }
                e.detail = SWT.TRAVERSE_NONE;
 */
        tableEditor = new TableEditor(table);
        saveEditorValue(editor, columnIndex, tableEditor.getItem());
            return;

        final Control editor = createEditor(table, columnIndex, item);
        tableEditor.setEditor(editor, item, columnIndex);
                        columnIndex--;

        showEditor(item);

        }
    }
    public void mouseDoubleClick(MouseEvent e) {
        final TableItem item = table.getItem(new Point(e.x, e.y));
            UIUtils.asyncExec(() -> showEditor(item));
                    if (e.detail == SWT.TRAVERSE_TAB_NEXT) {
    @Override

            e.doit = false;
        this.columnIndex = index;
            }
        table.addTraverseListener(this);
            editor = null;
            if (editor != null) {
                this.closeEditor();
/**
        Control editor = tableEditor.getEditor();
    public void mouseUp(MouseEvent e) {
            @Override
            closeEditor();
                }
    }
        editor.addTraverseListener(this);
            return;
        return proposalAdapter != null && proposalAdapter.isProposalPopupOpen();
                TableItem[] selection = table.getSelection();
/*
            editor.dispose();
    public void closeEditor() {
import org.jkiss.dbeaver.ui.UIUtils;
        if (editor != null && editor.isDisposed()) {
                    if (e.detail == SWT.TRAVERSE_TAB_NEXT) {
        if (!isProposalPopupActive()) {

        });
    private int columnIndex;
        }
                        columnIndex++;
    private final TableEditor tableEditor;
        UIUtils.installMacOSFocusLostSubstitution(editor, () -> onFocusLost(editor));
        }
        this.proposalAdapter = proposalAdapter;
import org.eclipse.swt.custom.TableEditor;
        }
package org.jkiss.dbeaver.ui.controls;
                    } else {
    public void mouseDown(MouseEvent e) {

                        if (item == null && table.getItemCount() > 0) {
                if (selection != null && selection.length >= 1) {
        tableEditor.minimumHeight = editor.computeSize(SWT.DEFAULT, SWT.DEFAULT).y;
    @Override
    protected abstract void saveEditorValue(Control control, int index, TableItem item);
    }
        if (editor == null) {

            }
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (e.button != 1) {
 * You may obtain a copy of the License at
                }
    }
            }
                    }
 *

    }
                            item = table.getItem(table.getItemCount() - 1);

    public CustomTableEditor(@NotNull Table table, @Nullable ContentProposalAdapter proposalAdapter) {
            columnIndex = UIUtils.getColumnAtPos(item, e.x, e.y);
        }
                e.doit = false;
import org.jkiss.code.Nullable;
            if (editOnEnter) {
                    } else {
                    }
        UIUtils.applyMainFont(editor);
