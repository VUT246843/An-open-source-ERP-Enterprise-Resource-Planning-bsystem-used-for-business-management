public interface IGridScrollBar
 * Copyright (C) 2010-2024 DBeaver Corp and others
     * @param thumb thumb
    
 *     http://www.apache.org/licenses/LICENSE-2.0

     * @param pageIncrement page increment
 * 
    public void setVisible(boolean visible);
    
 * Used by Grid to externalize the scrollbars from the table itself.
    public void setMinimum(int min);
 * limitations under the License.
package org.jkiss.dbeaver.ui.controls.lightgrid;
    public void setPageIncrement(int page);
    public void removeSelectionListener(SelectionListener listener);

    
    public boolean getVisible();

}
 * See the License for the specific language governing permissions and
import org.eclipse.swt.events.SelectionListener;
 *
    public int getSelection();

    
 * DBeaver - Universal Database Manager
    public void setMaximum(int max);
 * @author chris.gross@us.ibm.com
    public void setThumb(int thumb);
    public int getPageIncrement();
/*
import org.eclipse.swt.widgets.Event;
 * you may not use this file except in compliance with the License.
     * @param min minimum
    public void setValues(int selection, int min, int max, int thumb, int increment, int pageIncrement);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
    public int getWidth();
    
     */

     * @param increment increment
    public int getMaximum();
    public void handleMouseWheel(Event e);
    
    /**
    public int getThumb();
     * @param selection selection
/**
 */
{
    public void setSelection(int selection);

     * Sets the receiver's selection, minimum value, maximum value, thumb,

 */
 * @version 1.0.0

    
    
    
    public void setIncrement(int increment);
    public int getMinimum();
    
    
    public int getIncrement();

 * You may obtain a copy of the License at
    public void addSelectionListener(SelectionListener listener);
     * 
     * @param max maximum
    

 *
     * increment and page increment all at once.
