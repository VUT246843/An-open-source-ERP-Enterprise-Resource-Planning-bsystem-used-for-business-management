    }
    @Override

        return scrollBar.getIncrement();
 */
    public void addSelectionListener(SelectionListener listener)
 * Adapts a normal scrollbar to the IScrollBar proxy.
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
    @Override
 * You may obtain a copy of the License at
    private ScrollBar scrollBar;
 *



class ScrollBarAdapter implements IGridScrollBar
    public void setThumb(int value)
        scrollBar.removeSelectionListener(listener);
        scrollBar.setMinimum(value);

        scrollBar.addSelectionListener(listener);
 * limitations under the License.
    public void setPageIncrement(int value)
    @Override
    {
{
 */
                          int pageIncrement)
    public int getPageIncrement()

package org.jkiss.dbeaver.ui.controls.lightgrid;
        scrollBar.setVisible(visible);

    public ScrollBarAdapter(ScrollBar scrollBar, boolean vertical)

    }

        scrollBar.setValues(selection, minimum, maximum, thumb, increment, pageIncrement);
    {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    {
    @Override
    public int getWidth()
/*
    public int getIncrement()
    public void setSelection(int selection)
    @Override
 *
    @Override
    }
        scrollBar.setThumb(value);
    {
    }
    }
    @Override
    {
    public int getThumb()
 * @author chris.gross@us.ibm.com
     * @param scrollBar delegate
import org.eclipse.swt.events.SelectionListener;

    public int getSelection()
        scrollBar.setMaximum(value);
    {
    }
    public void setIncrement(int value)
    @Override
        return scrollBar.getSelection();
        this.vertical = vertical;
import org.eclipse.swt.widgets.Event;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    {

    @Override
    {
    public boolean getVisible()

    public void removeSelectionListener(SelectionListener listener)
    {
        this.scrollBar = scrollBar;


import org.eclipse.swt.widgets.ScrollBar;

    @Override

 * Unless required by applicable law or agreed to in writing, software

 * See the License for the specific language governing permissions and
    {
    @Override
    public int getMinimum()

    @Override
    {
    public void setValues(int selection, int minimum, int maximum, int thumb, int increment,
    {
    }
    }
 * @since 2.0.0
}
    {
     * 
     */
/**
    }
    {
        scrollBar.setSelection(selection);
        return scrollBar.getPageIncrement();

    @Override
    public void setVisible(boolean visible)
 *
    }
    }
    @Override
    {
        return scrollBar.getMaximum();
    }
 * you may not use this file except in compliance with the License.
     * Delegates to this scrollbar.

    private boolean vertical;
     * Constructs this adapter by delegating to the given scroll bar.
    {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        super();
    public void handleMouseWheel(Event e)
    public int getMaximum()


    /**
    @Override
    }
    @Override
    {
     */
    {

    }
    @Override

        return scrollBar.getVisible();
        return scrollBar.getMinimum();
    public void setMinimum(int value)
        return scrollBar.getThumb();
        return scrollBar.getSize().x;
    }
        scrollBar.setPageIncrement(value);
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
    }
    }
    {
 *
    {
    @Override
    /**
        scrollBar.setIncrement(value);
    public void setMaximum(int value)
