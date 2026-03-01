        
     * editor.
            public void widgetSelected(SelectionEvent e)
            {
        {
import org.eclipse.swt.graphics.Rectangle;
    }
        if (row == -1)
     * editor.
import org.eclipse.swt.widgets.Listener;
        }
        }
    {
        {
     */
    public void dispose()
        if (columnCount > 0 && (column < 0 || column >= columnCount))
/*
        setEditor(editor);
        else if (horizontalAlignment == SWT.LEFT)
        Rectangle cell = grid.getCellBounds(column, row);
        if (grabHorizontal)
        if (verticalAlignment == SWT.BOTTOM)
            }        

}
     * <p>
    public void setColumn(int column)
        
        }
        layout();
    }
    /**
            return;

            return;
        }
        if (!grid.isDisposed())
     */
            getEditor().setFocus();
            }
import org.eclipse.swt.events.ControlListener;
     * Note: The Control provided as the editor <b>must</b> be created with its
     * @param row the row of the cell being tracked by this editor
        {
        if (getEditor() == null || getEditor().isDisposed())
    {
            
        {
    public void setEditor(Control editor, int column, int row)
 * DBeaver - Universal Database Manager
     * this editor
    }
        

            return;
        {
        this.column = column;
     * Returns the bounds of the editor.
    public int getRow()
    {
                layout();
        grabVertical = true;
            public void controlResized(ControlEvent e)

            if (cell.x + cell.width > area.x + area.width)
        else if (verticalAlignment == SWT.TOP)
        grid = null;
     * Specify the Control that is to be displayed and the cell in the table
 *
        // resizing the column takes the focus away
        if (cell.x < area.x + area.width)
    /**

            if (grid.getHorizontalScrollBarProxy() != null)
     * @return the zero based index of the column of the cell being tracked by
            return;
            }
                grid.getHorizontalScrollBarProxy().removeSelectionListener(scrollListener);
     * @return the TableItem for the row of the cell being tracked by this
    private ControlListener columnListener;
            return;
    private int row = -1;
        };
        }
    private Listener resizeListener;
            return new Rectangle(0, 0, 0, 0);

import org.eclipse.swt.custom.ControlEditor;
     */
 *
        else
            hadFocus = getEditor().isFocusControl();
        { // default is CENTER
    private LightGrid grid;
        Rectangle editorRect = new Rectangle(cell.x, cell.y, minimumWidth, minimumHeight);
        columnListener = new ControlListener()
     */
        if (column < 0 || column >= grid.getColumnCount())
        {
import org.eclipse.swt.events.SelectionEvent;
        // Separately handle the case where the grid has no TableColumns.
     * Sets the zero based index of the column of the cell being tracked by this
 * Spreadsheet cell editor
        columnListener = null;

    public void layout()
            return;
        {

     * @param grid the Table Control above which this editor will be displayed

            editorRect.y += cell.height - editorRect.height;
        }
        layout();
        if (grid.getVerticalScrollBarProxy() != null)
        row = -1;
     * editor
            this.column = (column == 0) ? 0 : -1;
        resizeListener = null;
     * 
        // The following three listeners are workarounds for
        }
        // https://bugs.eclipse.org/bugs/show_bug.cgi?id=105764
    private int column = -1;
        }
        
            editorRect.width = Math.max(cell.width, minimumWidth);
        Rectangle area = grid.getClientArea();
    }
        column = -1;        
    public int getColumn()
            grid.getVerticalScrollBarProxy().addSelectionListener(scrollListener);
 *
            this.column = -1;
        setColumn(column);
            }
 */
        if (row == -1 || column == -1)
 *     http://www.apache.org/licenses/LICENSE-2.0
     * tracked by this editor
            editorRect.y += (cell.height - editorRect.height) / 2;

 * Unless required by applicable law or agreed to in writing, software
            public void controlMoved(ControlEvent e)
        if (columnCount == 0 && column != 0)

        } // this doesn't work because
    @Override
        }
     * parent being the Table control specified in the TableEditor constructor.
     * @param editor the Control that is displayed above the cell being edited
        scrollListener = new SelectionListener()
        {
        }
    /**
     * Creates a TableEditor for the specified Table.
    public SpreadsheetCellEditor(final LightGrid grid)
import org.eclipse.swt.widgets.Control;
            editorRect.height = Math.max(cell.height, minimumHeight);
    /**
            editorRect.x += cell.width - editorRect.width;
        }
            // do nothing - cell.y is the right answer
                layout();
     */
            return;
        // true
        getEditor().setBounds(computeEditorBounds());
            // do nothing - cell.x is the right answer
     * Returns the zero based index of the column of the cell being tracked by
public class SpreadsheetCellEditor extends ControlEditor
import org.jkiss.dbeaver.ui.controls.lightgrid.LightGrid;
 * limitations under the License.
        this.row = row;
        this.grid = grid;
/**


 */
        int columnCount = grid.getColumnCount();
package org.jkiss.dbeaver.ui.controls.resultset.spreadsheet;
        int columnCount = grid.getColumnCount();

            grid.getHorizontalScrollBarProxy().addSelectionListener(scrollListener);
            grid.removeListener(SWT.Resize, resizeListener);
                cell.width = area.x + area.width - cell.x;
     * 
        {
 * Copyright (C) 2010-2024 DBeaver Corp and others
            {
        {
     * Returns the TableItem for the row of the cell being tracked by this

        resizeListener = event -> layout();

    }
     * 
    @Override
        if (horizontalAlignment == SWT.RIGHT)
     * that it is to be positioned above.
    {

        {
            if (grid.getVerticalScrollBarProxy() != null)
        if (grid.getHorizontalScrollBarProxy() != null)
     * 
        // To be consistent with older versions of SWT, grabVertical defaults to
    }
        }
                layout();
        {
 * Licensed under the Apache License, Version 2.0 (the "License");
        // Eclipse bug 105764
 * You may obtain a copy of the License at
        grid.addListener(SWT.Resize, resizeListener);
                grid.getVerticalScrollBarProxy().removeSelectionListener(scrollListener);
        if (grid.isDisposed())
            {
        if (grabVertical)
        setRow(row);

    }
{
    {
 *
        
        return column;
    /**
        if (hadFocus)
        else
    }
        };
     * table. The Table and the editor Control are <b>not</b> disposed.
    public void setRow(int row) {
        super(grid);

        // before we get here
     * this editor.
            @Override
        return editorRect;
        boolean hadFocus = false;

        
    {
 * you may not use this file except in compliance with the License.
            }
    /**
        }
    {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                return;
import org.eclipse.swt.events.ControlEvent;
        {
    private Rectangle computeEditorBounds()
        {
            
            layout();
        {
     */

        
     * @return bounds of the editor.
     */
 * @author serge@dbeaver.com

     * @param column the zero based index of the column of the cell being
            public void widgetDefaultSelected(SelectionEvent e)
     * Removes all associations between the TableEditor and the cell in the
        layout();
        // In this situation, there is a single default column.
            @Override
        { // default is CENTER

     * 
        {
    }

            @Override

import org.eclipse.swt.events.SelectionListener;
    {
     * tracked by this editor
            @Override
        }
import org.eclipse.swt.SWT;
        if (getEditor().getVisible())
        }
            {
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (columnCount == 0)
     * @param column the zero based index of the column of the cell being
        return row;
            {

 * See the License for the specific language governing permissions and
     * 
        if (this.column > -1 && this.column < columnCount)
    private SelectionListener scrollListener;
        super.dispose();
    /**
            if (getEditor() == null || getEditor().isDisposed())
            editorRect.x += (cell.width - editorRect.width) / 2;
