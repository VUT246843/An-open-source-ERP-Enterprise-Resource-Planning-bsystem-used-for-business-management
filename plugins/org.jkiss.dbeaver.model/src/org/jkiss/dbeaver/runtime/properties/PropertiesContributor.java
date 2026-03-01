            lazyListeners.remove(listener);


    }

    public static final String SECTION_STANDARD = "standard"; //$NON-NLS-1$
 * Copyright (C) 2010-2024 DBeaver Corp and others

}
            lazyListeners.add(listener);
    {

 *
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (!lazyListeners.isEmpty()) {
    public static PropertiesContributor getInstance()
    public void notifyPropertyLoad(Object object, DBPPropertyDescriptor propertyId, Object propertyValue, boolean completed)

    {

    public void addLazyListener(ILazyPropertyLoadListener listener)
 * you may not use this file except in compliance with the License.
 * PropertiesContributor

        return instance;
    public static final String TAB_PROPERTIES = "properties"; //$NON-NLS-1$
                    listener.handlePropertyLoad(object, propertyId, propertyValue, completed);
 * limitations under the License.
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
 *
 * Unless required by applicable law or agreed to in writing, software
 */
    }

import java.util.ArrayList;
    {
 * You may obtain a copy of the License at
 *
    public static final String TAB_STANDARD = "standard"; //$NON-NLS-1$
        }
                for (ILazyPropertyLoadListener listener : lazyListeners) {
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
        synchronized (lazyListeners) {
    }
    private final List<ILazyPropertyLoadListener> lazyListeners = new ArrayList<ILazyPropertyLoadListener>();

        }
    {
package org.jkiss.dbeaver.runtime.properties;
public class PropertiesContributor {
        synchronized (lazyListeners) {
    private static final PropertiesContributor instance = new PropertiesContributor();
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;

 */

 * DBeaver - Universal Database Manager
import java.util.List;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
/**
    public static final String SECTION_ADDITIONAL = "additional"; //$NON-NLS-1$

        synchronized (lazyListeners) {
                }
            }
    public void removeLazyListener(ILazyPropertyLoadListener listener)
