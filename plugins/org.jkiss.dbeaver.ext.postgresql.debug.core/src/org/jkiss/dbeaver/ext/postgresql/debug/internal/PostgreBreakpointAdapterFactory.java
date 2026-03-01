    public <T> T getAdapter(Object adaptableObject, Class<T> adapterType) {
public class PostgreBreakpointAdapterFactory implements IAdapterFactory {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)

                    ((PostgreProcedure) adaptableObject).getObjectId(), -1
 * Licensed under the Apache License, Version 2.0 (the "License");

 */
/*
 * Unless required by applicable law or agreed to in writing, software
 *
    }
 * limitations under the License.
        return null;

import org.jkiss.dbeaver.ext.postgresql.debug.internal.impl.PostgreDebugBreakpointDescriptor;
}
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ext.postgresql.model.PostgreProcedure;
 * you may not use this file except in compliance with the License.
 *
import org.eclipse.core.runtime.IAdapterFactory;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
        }
    @Override
                ));
    private static final Class<?>[] CLASSES = new Class[] { DBGBreakpointDescriptor.class };


    public Class<?>[] getAdapterList() {
        return CLASSES;
import org.jkiss.dbeaver.debug.DBGBreakpointDescriptor;
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
            }
 * See the License for the specific language governing permissions and
 *
        if (adapterType == DBGBreakpointDescriptor.class) {
            if (adaptableObject instanceof PostgreProcedure) {

                return adapterType.cast(new PostgreDebugBreakpointDescriptor(
    }
package org.jkiss.dbeaver.ext.postgresql.debug.internal;
 * distributed under the License is distributed on an "AS IS" BASIS,
