 *
    @Override
 * DBeaver - Universal Database Manager
            } else if (adaptableObject instanceof IResultSetProvider) {
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
        return ADAPTER_LIST;
                return adapterType.cast(((IResultSetProvider) adaptableObject).getResultSetController());
            if (adapterType.isInstance(adaptableObject)) {
 * ResultSetAdapterFactory
            if (adaptableObject instanceof IPageChangeProvider) {
 * limitations under the License.
public class ResultSetAdapterFactory implements IAdapterFactory {
 * Unless required by applicable law or agreed to in writing, software
/**
    private static final Class<?>[] ADAPTER_LIST = {IResultSetController.class, ResultSetViewer.class};
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.core.runtime.IAdapterFactory;
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
import org.eclipse.jface.dialogs.IPageChangeProvider;

    }
 */
/*
                return adapterType.cast(adaptableObject);
 */

    @Override
            }
    public <T> T getAdapter(Object adaptableObject, Class<T> adapterType) {
 * You may obtain a copy of the License at
 *
        if (adapterType == IResultSetController.class || adapterType == ResultSetViewer.class) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                return getAdapter(((IPageChangeProvider) adaptableObject).getSelectedPage(), adapterType);
 * Copyright (C) 2010-2024 DBeaver Corp and others


    public Class<?>[] getAdapterList() {
}        }

 *
package org.jkiss.dbeaver.ui.controls.resultset;
 * distributed under the License is distributed on an "AS IS" BASIS,
        return null;
    }
