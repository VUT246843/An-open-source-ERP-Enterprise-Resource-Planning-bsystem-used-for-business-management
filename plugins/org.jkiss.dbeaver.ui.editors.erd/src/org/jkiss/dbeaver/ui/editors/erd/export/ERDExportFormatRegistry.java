
}

        private final ObjectType type;
    {
        }
        for (IConfigurationElement ext : extElements) {
        if (instance == null) {
import org.eclipse.core.runtime.Platform;
import java.util.List;
            FormatDescriptor formatDescriptor = new FormatDescriptor(ext);
            return type.createInstance(ERDExportFormatHandler.class);
/*
import org.jkiss.dbeaver.DBException;

    private final List<FormatDescriptor> formats = new ArrayList<>();


import org.jkiss.dbeaver.Log;
        }
public class ERDExportFormatRegistry


    }
    {
    }
        public String getLabel() {
            type = new ObjectType(config.getAttribute("class"));
 *
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.ui.editors.erd.export.format"; //$NON-NLS-1$
    private ERDExportFormatRegistry(IExtensionRegistry registry)
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at

package org.jkiss.dbeaver.ui.editors.erd.export;
{
import java.util.ArrayList;
 */
    public synchronized static ERDExportFormatRegistry getInstance()
 * you may not use this file except in compliance with the License.
 * limitations under the License.
    public List<FormatDescriptor> getFormats() {
            formats.add(formatDescriptor);
        private final String label;
        IConfigurationElement[] extElements = registry.getConfigurationElementsFor(EXTENSION_ID);
        return formats;
        }
    public class FormatDescriptor extends AbstractDescriptor {
        public ERDExportFormatHandler getInstance() throws DBException {
        protected FormatDescriptor(IConfigurationElement config) {
 *
 * DBeaver - Universal Database Manager
import org.eclipse.core.runtime.IExtensionRegistry;
            label = config.getAttribute("label");
            return label;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * See the License for the specific language governing permissions and


        return instance;
        }
    }
    private static final Log log = Log.getLog(ERDExportFormatRegistry.class);
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
            extension = config.getAttribute("ext");
            instance = new ERDExportFormatRegistry(Platform.getExtensionRegistry());

 * Unless required by applicable law or agreed to in writing, software

            super(config);
    private static ERDExportFormatRegistry instance = null;
import org.eclipse.core.runtime.IConfigurationElement;
        private final String extension;
            return extension;
        }


    }
        public String getExtension() {
