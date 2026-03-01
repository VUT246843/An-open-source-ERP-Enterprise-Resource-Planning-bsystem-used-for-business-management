 * Licensed under the Apache License, Version 2.0 (the "License");
        ISelectionProvider cp = getProvider();
    }
            }
        } else {
    {
 * distributed under the License is distributed on an "AS IS" BASIS,
}
    private List<ISelectionChangedListener> listeners = new ArrayList<>();
                }
public class CompositeSelectionProvider implements ISelectionProvider {
                if (this.provider != null){
            @Override
/**
    @Override

                    }
 * Unless required by applicable law or agreed to in writing, software
    {
    {
    }
            	SelectionChangedEvent event = new SelectionChangedEvent(this, selection);
    {
        listeners.remove(listener);
    @Override
        });

            	}
                } else {
    public void addSelectionChangedListener(ISelectionChangedListener listener)
            this.selection = selection;
import org.jkiss.utils.CommonUtils;

 * limitations under the License.
            	for (ISelectionChangedListener listener : listeners) {


                setProvider(selectionProvider);
            if (!CommonUtils.isEmpty(listeners)) {
 * See the License for the specific language governing permissions and
    }
    private ISelectionProvider provider;
 * Composite selection provider
        if (cp != null) {
        	ISelection newSelection = null;
 */
    }
            this.provider = newProvider;
        }
                	newSelection = this.selection;
 * DBeaver - Universal Database Manager

            	//force a selection change event propagation
    {
package org.jkiss.dbeaver.ui;
 *
        ISelectionProvider cp = getProvider();
    public void setProvider(ISelectionProvider newProvider)
 */
    }
            public void focusGained(FocusEvent e)
    }
                    for (ISelectionChangedListener listener : listeners) {

    public ISelection getSelection()
        } else {
        if (this.provider != newProvider){
        return provider;
                }
            return selection;
                         newProvider.addSelectionChangedListener(listener);
                         this.provider.removeSelectionChangedListener(listener);
            }
        if (cp != null) {
        }
    @Override

 * Copyright (C) 2010-2024 DBeaver Corp and others

    public ISelectionProvider getProvider()
                    for (ISelectionChangedListener listener : listeners) {
            	setSelection(newSelection);
        listeners.add(listener);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void setSelection(ISelection selection)
    private ISelection selection = StructuredSelection.EMPTY;
    {
 *     http://www.apache.org/licenses/LICENSE-2.0
                if (newProvider != null) {

import java.util.ArrayList;
            if (newSelection != null){

import org.eclipse.swt.events.FocusAdapter;
import java.util.List;
            }
            }
 *
            return cp.getSelection();
 * You may obtain a copy of the License at
 *

                    }
        control.addFocusListener(new FocusAdapter() {
            cp.setSelection(selection);
            		 listener.selectionChanged(event);
import org.eclipse.swt.widgets.Control;
    public void trackProvider(final Control control, final ISelectionProvider selectionProvider)
	                newSelection = newProvider.getSelection();
import org.eclipse.swt.events.FocusEvent;
            if (!CommonUtils.isEmpty(listeners)) {
    }
    {
import org.eclipse.jface.viewers.*;

/*

    @Override
        }
    public void removeSelectionChangedListener(ISelectionChangedListener listener)
            {
 * you may not use this file except in compliance with the License.
