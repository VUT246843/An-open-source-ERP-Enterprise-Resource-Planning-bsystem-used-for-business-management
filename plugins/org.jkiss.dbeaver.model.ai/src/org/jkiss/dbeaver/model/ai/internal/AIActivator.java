 * you may not use this file except in compliance with the License.
 */
    public AIActivator() {

}
    public static AIActivator getInstance() {

package org.jkiss.dbeaver.model.ai.internal;
    public BundlePreferenceStore getPreferences() {

        
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
import org.jkiss.dbeaver.model.ai.AIBaseFeatures;
        return instance;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.impl.preferences.BundlePreferenceStore;
    }
    public void stop(BundleContext context) throws Exception {
        return preferences;
        instance = this;
 * Unless required by applicable law or agreed to in writing, software
        
        super.start(context);
        super.stop(context);
    
 * limitations under the License.
    private BundlePreferenceStore preferences;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
        DBRFeatureRegistry.getInstance().registerFeatures(AIBaseFeatures.class);
 *

 *

    private static AIActivator instance;
        preferences = new BundlePreferenceStore(getBundle());

    }
/*
    }
 * See the License for the specific language governing permissions and

 * DBeaver - Universal Database Manager
        
    @Override
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        instance = null;
    public void start(BundleContext context) throws Exception {
 * distributed under the License is distributed on an "AS IS" BASIS,
public class AIActivator extends Plugin {
import org.jkiss.dbeaver.model.runtime.features.DBRFeatureRegistry;
        preferences = null;
 *
import org.osgi.framework.BundleContext;
    
import org.eclipse.core.runtime.Plugin;
