            getControl().setRedraw(true);
    public void dispose()
                public int compare(IPropertySheetEntry entryA, IPropertySheetEntry entryB)
                            cache.propertySource = ((IAdaptable) object).getAdapter(IPropertySource.class);
        getControl().setRedraw(false);
                this.object = object;

 * Unless required by applicable law or agreed to in writing, software
        if (!ArrayUtils.isEmpty(curSelection)) {
                }
        PropertiesContributor.getInstance().addLazyListener(this);
                // Sometimes IPropertySource wrapper (e.g. PropertySourceEditable) may be used instead of real object

        setPropertySourceProvider(this);
 *     http://www.apache.org/licenses/LICENSE-2.0
            // Just for better performance
            if (ss.size() == 1) {
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (object == null || object.getClass().isPrimitive() || object instanceof CharSequence || object instanceof Number || object instanceof Boolean) {
        } finally {
import org.eclipse.jface.viewers.ISelection;
                            cache.propertySource = RuntimeUtils.getObjectAdapter(object, IPropertySource.class);
                    cache.object == object)
 * Copyright (C) 2010-2024 DBeaver Corp and others
                    if (!cache.cached) {
        boolean cached;
            } else {
import java.util.Iterator;
                for (Iterator<?> iter = ss.iterator(); iter.hasNext(); ) {

            } else {
/*
 *
                if ((cache.propertySource != null && cache.propertySource.getEditableValue() == object) ||
    }
public class PropertyPageStandard extends PropertySheetPage implements ILazyPropertyLoadListener, IPropertySourceProvider {
        if (object instanceof Collection) {
                        }
package org.jkiss.dbeaver.ui.controls;
import org.jkiss.dbeaver.ui.properties.PropertySourceDelegate;
        }
                    // No damn sorting
                }


        PropertiesContributor.getInstance().removeLazyListener(this);
            }
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
        return RuntimeUtils.getObjectAdapter(object, IPropertySource.class);
 *
        //System.out.println("HEY: " + object + " | " + propertyId + " | " + propertyValue + " : " + completed);

import org.jkiss.dbeaver.utils.RuntimeUtils;
    }
    @Override
                        cache.cached = true;
 * DBeaver - Universal Database Manager
            super.selectionChanged(part, selection);
                int index = 0;
            return new PropertySourceDelegate(
                    return 0;
            for (PropertySourceCache cache : curSelection) {
 */
        Object object;
            return null;
    public void handlePropertyLoad(Object object, DBPPropertyDescriptor property, Object propertyValue, boolean completed)
        }
                    return;
 * limitations under the License.
        public PropertySourceCache(Object object)
        } else if (object instanceof Map) {

        }
        if (!ArrayUtils.isEmpty(curSelection) && !getControl().isDisposed()) {
        // Without cache we'll fall in infinite recursion when refreshing lazy props
import org.eclipse.core.runtime.IAdaptable;
        // Unregister lazy load listener
    }
        setSorter(
 * See the License for the specific language governing permissions and
                {
        if (selection instanceof IStructuredSelection) {
            curSelection = new PropertySourceCache[ss.size()];
    }
import org.eclipse.jface.viewers.IStructuredSelection;
        {
                        if (cache.propertySource == null) {
import org.jkiss.dbeaver.runtime.properties.ILazyPropertyLoadListener;
                if (cache.object == object) {
        }
 * you may not use this file except in compliance with the License.
        );
    @Override
                curSelection[0] = new PropertySourceCache(ss.getFirstElement());
            IStructuredSelection ss = (IStructuredSelection)selection;
    private static class PropertySourceCache {
            return new PropertySourceDelegate(
    {
import org.jkiss.dbeaver.runtime.properties.PropertiesContributor;
                    curSelection[index++] = new PropertySourceCache(iter.next());
                    refresh();

                    return cache.propertySource;
}
            }
 *
            for (PropertySourceCache cache : curSelection) {
import org.jkiss.dbeaver.runtime.properties.PropertySourceCollection;
        try {
        // (get prop source from adapter, load props, load lazy props -> refresh -> get prop source from adapter, etc).
    {

                this.object = ((IPropertySource)object).getEditableValue();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.Collection;
 * distributed under the License is distributed on an "AS IS" BASIS,

                new PropertySourceMap((Map<String, ?>) object));
            }
    public PropertyPageStandard()
        // Register lazy load listener
            }
        }
import org.eclipse.ui.IWorkbenchPart;
                        if (object instanceof IAdaptable) {
    public void selectionChanged(IWorkbenchPart part, ISelection selection)
 * You may obtain a copy of the License at
import java.util.Map;
        super.dispose();
    {
import org.jkiss.dbeaver.runtime.properties.PropertySourceMap;
                }
                }
        }
    public IPropertySource getPropertySource(Object object)
    @Override
                new PropertySourceCollection((Collection<?>) object));
        // Seek in cached property sources
    private PropertySourceCache[] curSelection = null;
import org.jkiss.utils.ArrayUtils;
                        }
        }
                {
        // Make page refresh if our main object was updated
            new PropertySheetSorter() {
                @Override

    }
                    }
    @Override
        IPropertySource propertySource;
import org.eclipse.ui.views.properties.*;
            if (object instanceof IPropertySource) {
    {
        // Create objects cache
    {
    }
