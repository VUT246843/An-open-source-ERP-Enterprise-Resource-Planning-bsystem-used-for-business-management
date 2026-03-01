public class DebugActionAdapterFactory implements IAdapterFactory {
}

    @Override
import org.eclipse.debug.ui.actions.IToggleBreakpointsTarget;

    public <T> T getAdapter(Object adaptableObject, Class<T> adapterType) {
    };

 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        return CLASSES;
    private final IToggleBreakpointsTarget toggleBreakpointTarget = new ToggleProcedureBreakpointTarget();
import org.eclipse.core.runtime.IAdapterFactory;

    }
        return null;
            return (T) toggleBreakpointTarget;
        if (adapterType == IToggleBreakpointsTarget.class) {

 *
        }
    public Class<?>[] getAdapterList() {

        if (adapterType == ILaunchable.class) {

 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
            return (T) LAUNCHABLE;
 * DBeaver - Universal Database Manager
        }
    }
 * limitations under the License.
import org.eclipse.debug.ui.actions.ILaunchable;

 * Unless required by applicable law or agreed to in writing, software
 *
 */
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
    @SuppressWarnings("unchecked")
 * You may obtain a copy of the License at
 *
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
    private static final Class<?>[] CLASSES = new Class[] { ILaunchable.class, IToggleBreakpointsTarget.class };
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.debug.ui.actions;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private static final ILaunchable LAUNCHABLE = new ILaunchable() {
