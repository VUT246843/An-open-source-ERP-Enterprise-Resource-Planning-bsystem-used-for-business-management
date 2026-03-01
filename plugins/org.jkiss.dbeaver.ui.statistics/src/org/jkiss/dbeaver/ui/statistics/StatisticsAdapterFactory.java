 * Licensed under the Apache License, Version 2.0 (the "License");
        if (adaptableObject instanceof DBRFeatureRegistry) {
 *
package org.jkiss.dbeaver.ui.statistics;
 * Copyright (C) 2010-2024 DBeaver Corp and others
}
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.core.runtime.IAdapterFactory;
        }
    public Class<?>[] getAdapterList() {
public class StatisticsAdapterFactory implements IAdapterFactory {

 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager

 */

    @Override

        return null;
 * You may obtain a copy of the License at
    }
    public <T> T getAdapter(Object adaptableObject, Class<T> adapterType) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override

 * limitations under the License.
 *
    
    private static final Class<?>[] CLASSES = new Class[] { DBRFeatureTracker.class };
            return adapterType.cast(new FeatureStatisticsCollector());

        return CLASSES;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.runtime.features.DBRFeatureTracker;
import org.jkiss.dbeaver.model.runtime.features.DBRFeatureRegistry;
 * Unless required by applicable law or agreed to in writing, software
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
/*
