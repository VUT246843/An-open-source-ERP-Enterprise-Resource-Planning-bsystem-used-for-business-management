            .map(ResultSetErrorActionDescriptor::new)
 *
    @NotNull

 * distributed under the License is distributed on an "AS IS" BASIS,

    }
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
import java.util.List;
 * limitations under the License.
        return instance;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
/*
    private final List<ResultSetErrorActionDescriptor> actions;
        actions = Arrays.stream(registry.getConfigurationElementsFor(ResultSetErrorActionDescriptor.EXTENSION_ID))
    private static final String TAG_ACTION = "action"; //$NON-NLS-1$

 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.

        return actions;

    public static synchronized ResultSetErrorActionRegistry getInstance() {

    public List<ResultSetErrorActionDescriptor> getActions() {
package org.jkiss.dbeaver.ui.controls.resultset;
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
 */
        if (instance == null) {

    private static ResultSetErrorActionRegistry instance;
import java.util.Arrays;
 *
public final class ResultSetErrorActionRegistry {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            .filter(element -> TAG_ACTION.equals(element.getName()))
    @NotNull
            .toList();
}
            .sorted(Comparator.comparing(ResultSetErrorActionDescriptor::getOrder))
import java.util.Comparator;
            instance = new ResultSetErrorActionRegistry(Platform.getExtensionRegistry());
    private ResultSetErrorActionRegistry(@NotNull IExtensionRegistry registry) {
