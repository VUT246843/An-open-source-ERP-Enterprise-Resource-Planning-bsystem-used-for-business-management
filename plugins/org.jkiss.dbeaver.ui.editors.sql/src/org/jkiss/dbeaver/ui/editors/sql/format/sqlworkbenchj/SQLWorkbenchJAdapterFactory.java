            return adapterType.cast(new SQLWorkbenchJFormatterSettingsPage());
    }
import org.eclipse.core.runtime.IAdapterFactory;

 * You may obtain a copy of the License at
        SQLFormatterConfigurator.class

    public Class<?>[] getAdapterList() {
 * distributed under the License is distributed on an "AS IS" BASIS,
        return null;
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
        return ADAPTER_LIST;
        if (adapterType == SQLFormatterConfigurator.class && adaptableObject instanceof SQLWorkbenchJFormatter) {
/*

 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private static final Class<?>[] ADAPTER_LIST = {
package org.jkiss.dbeaver.ui.editors.sql.format.sqlworkbenchj;
 * limitations under the License.
}
    @Override
 * Unless required by applicable law or agreed to in writing, software
    @Override
import org.jkiss.dbeaver.ui.editors.sql.preferences.format.SQLFormatterConfigurator;
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
    public <T> T getAdapter(Object adaptableObject, Class<T> adapterType) {
 * DBeaver - Universal Database Manager

 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
/**
 *
 *
 * you may not use this file except in compliance with the License.
    }
public class SQLWorkbenchJAdapterFactory implements IAdapterFactory {
    };
 * Adapts objects to their UI configurators
