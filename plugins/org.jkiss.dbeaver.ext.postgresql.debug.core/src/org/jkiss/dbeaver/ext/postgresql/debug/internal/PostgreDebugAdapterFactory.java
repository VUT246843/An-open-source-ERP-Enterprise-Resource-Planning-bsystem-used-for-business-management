
        if (adapterType == DBGControllerFactory.class) {
    public <T> T getAdapter(Object adaptableObject, Class<T> adapterType) {
            if (adaptableObject instanceof DBPDataSourceContainer) {

/*
 * See the License for the specific language governing permissions and
    @Override
                    return adapterType.cast(new PostgreResolver(ds));
 * you may not use this file except in compliance with the License.
}
                }
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.debug.DBGController;
        return CLASSES;
import org.jkiss.dbeaver.debug.DBGResolver;
 * Unless required by applicable law or agreed to in writing, software
        return null;
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
        } else if (adapterType == DBGResolver.class) {
 *
 * limitations under the License.
    private static final Class<?>[] CLASSES = new Class[] { DBGController.class, DBGResolver.class };
public class PostgreDebugAdapterFactory implements IAdapterFactory {
 */
import org.eclipse.core.runtime.IAdapterFactory;
                }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                    return adapterType.cast(new PostgreDebugControllerFactory());
package org.jkiss.dbeaver.ext.postgresql.debug.internal;
 * DBeaver - Universal Database Manager


                if (ds.getDriver().getProviderId().equals("postgresql")) {
                DBPDataSourceContainer ds = (DBPDataSourceContainer) adaptableObject;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.debug.DBGControllerFactory;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
    @Override


            }
import org.jkiss.dbeaver.ext.postgresql.debug.internal.impl.PostgreDebugControllerFactory;
            if (adaptableObject instanceof DBPDataSourceContainer) {
            }
    }
                DBPDataSourceContainer ds = (DBPDataSourceContainer) adaptableObject;
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                if (ds.getDriver().getDataSourceProvider() instanceof PostgreDataSourceProvider) {
import org.jkiss.dbeaver.ext.postgresql.PostgreDataSourceProvider;
    }
    public Class<?>[] getAdapterList() {
 * distributed under the License is distributed on an "AS IS" BASIS,
