
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.dataManager"; //$NON-NLS-1$


 * ValueManagerDescriptor
        super(config);
        return IValueManager.class;
package org.jkiss.dbeaver.ui.data.registry;
 */
 *
 * You may obtain a copy of the License at
/*
 */

 * DBeaver - Universal Database Manager
 *
    public ValueManagerDescriptor(IConfigurationElement config) {
import org.jkiss.dbeaver.ui.data.IValueManager;


    }
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
import org.eclipse.core.runtime.IConfigurationElement;
} * you may not use this file except in compliance with the License.

public class ValueManagerDescriptor extends AbstractValueBindingDescriptor<IValueManager, Object> {
 *     http://www.apache.org/licenses/LICENSE-2.0
    protected Class<IValueManager> getImplClass() {
import org.jkiss.dbeaver.registry.data.hints.AbstractValueBindingDescriptor;
 *
 * Unless required by applicable law or agreed to in writing, software
/**
    private IValueManager instance;
    @Override
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others

    public static final String TAG_MANAGER = "manager"; //$NON-NLS-1$
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
