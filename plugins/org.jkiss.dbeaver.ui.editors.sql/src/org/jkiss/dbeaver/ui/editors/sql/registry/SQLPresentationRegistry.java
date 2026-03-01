


    }
    private SQLPresentationRegistry()
import org.jkiss.code.Nullable;
        for (IConfigurationElement ext : extConfigs) {
    public SQLPresentationDescriptor getPresentation(@NotNull String id) {

import org.eclipse.core.runtime.IExtensionRegistry;
    }
            .comparingInt(SQLPresentationDescriptor::getOrder)
        return instance;
            }


        return new ArrayList<>(presentations);

import java.util.ArrayList;
    static final String TAG_PRESENTATION = "presentation"; //$NON-NLS-1$
    @Nullable
        }
}
                SQLPresentationDescriptor presentationDescriptor = new SQLPresentationDescriptor(ext);

    }
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.
import java.util.List;
    }

                return presentation;
            if (TAG_PRESENTATION.equals(ext.getName())) {
            if (presentation.getId().equals(id)) {
        for (SQLPresentationDescriptor presentation : presentations) {
    private void loadExtensions(IExtensionRegistry registry)
            instance = new SQLPresentationRegistry();
import org.eclipse.core.runtime.Platform;
    {
        if (instance == null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
            instance.loadExtensions(Platform.getExtensionRegistry());
 * See the License for the specific language governing permissions and
            }
package org.jkiss.dbeaver.ui.editors.sql.registry;
 * DBeaver - Universal Database Manager
    private final List<SQLPresentationDescriptor> presentations = new ArrayList<>();

import org.eclipse.core.runtime.IConfigurationElement;
    {
    private static SQLPresentationRegistry instance = null;
    {

    public synchronized static SQLPresentationRegistry getInstance()
            .thenComparing(SQLPresentationDescriptor::getLabel));
 * You may obtain a copy of the License at

    }
 * Unless required by applicable law or agreed to in writing, software
import java.util.Comparator;
    }
        return null;

        }
            // Load functions
import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0
public class SQLPresentationRegistry
    {
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void dispose()
 * you may not use this file except in compliance with the License.
        IConfigurationElement[] extConfigs = registry.getConfigurationElementsFor(SQLPresentationDescriptor.EXTENSION_ID);
 *

        presentations.sort(Comparator
 *
        presentations.clear();
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
{
/*
                this.presentations.add(presentationDescriptor);
    public List<SQLPresentationDescriptor> getPresentations() {
 */
