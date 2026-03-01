 * ListContentProvider

package org.jkiss.dbeaver.ui.controls;
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
}

 *
            } else {
        } else if (inputElement.getClass().isArray()) {
 *
import java.util.Collection;
 *
        }
                return (Object[])inputElement;
        if (inputElement == null) {
                return null;
    public Object[] getElements(Object inputElement)
        }
 * Unless required by applicable law or agreed to in writing, software
            return ((Collection<?>)inputElement).toArray();
import org.eclipse.jface.viewers.IStructuredContentProvider;
/*
    }

    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void dispose()
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
    {

        if (inputElement instanceof Collection) {
/**
public class ListContentProvider implements IStructuredContentProvider {
    @Override
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
    }
            return new Object[0];
            if (inputElement.getClass().getComponentType().isPrimitive()) {
 * See the License for the specific language governing permissions and
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput)
    @Override

    {

 * DBeaver - Universal Database Manager
import org.eclipse.jface.viewers.Viewer;
    {
        return null;
    }
