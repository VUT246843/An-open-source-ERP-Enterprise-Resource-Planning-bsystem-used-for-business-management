
    @Override
    {
    @Override
 * DBeaver - Universal Database Manager

 * Composite selection provider
            listener.selectionChanged(new SelectionChangedEvent(this, selection));
    private List<ISelectionChangedListener> listeners = new ArrayList<>();
import java.util.ArrayList;

        this.selection = selection;
public class CustomSelectionProvider implements ISelectionProvider {
        return selection;
    public void addSelectionChangedListener(ISelectionChangedListener listener)
 *
 * See the License for the specific language governing permissions and
    {
/*

package org.jkiss.dbeaver.ui;
        listeners.remove(listener);
import java.util.List;
    @Override

    public ISelection getSelection()
 * Unless required by applicable law or agreed to in writing, software
    {
 *
    }
}
    }
        }
    public void removeSelectionChangedListener(ISelectionChangedListener listener)

    {
 */
    }

 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
/**
    public CustomSelectionProvider()
 *     http://www.apache.org/licenses/LICENSE-2.0

        listeners.add(listener);
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
 * you may not use this file except in compliance with the License.
    private ISelection selection;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    }

        for (ISelectionChangedListener listener : listeners) {
        selection = new StructuredSelection();
    {
 *
 */
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.eclipse.jface.viewers.*;
    public void setSelection(ISelection selection)
