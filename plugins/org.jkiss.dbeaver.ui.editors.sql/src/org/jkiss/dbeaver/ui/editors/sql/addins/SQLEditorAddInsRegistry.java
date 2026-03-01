    }
                SQLEditorAddInDescriptor descriptor = new SQLEditorAddInDescriptor(ext);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    
        if (instance == null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
        }
/*
        return addInDescriptors;
import java.util.Comparator;
    public static synchronized SQLEditorAddInsRegistry getInstance() {
 *
    private static SQLEditorAddInsRegistry instance;
 *
 * See the License for the specific language governing permissions and
    /**
        for (IConfigurationElement ext : addInElements) {
    }
import org.eclipse.core.runtime.Platform;
        List<SQLEditorAddInDescriptor> addInDescriptors = new ArrayList<>();
            if (TAG_VIEW.equals(ext.getName())) {
public class SQLEditorAddInsRegistry {
     */
        return instance;
    private static final String TAG_VIEW = "addIn"; //$NON-NLS-1$
     * A list of editor add-ins in the order of initialization according to their priorities
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.sql.editorAddIns"; //$NON-NLS-1$
import java.util.ArrayList;
 * distributed under the License is distributed on an "AS IS" BASIS,
/**
 * You may obtain a copy of the License at

}
                addInDescriptors.add(descriptor);
        
            instance = new SQLEditorAddInsRegistry(Platform.getExtensionRegistry());
            }
    /**

    private final List<SQLEditorAddInDescriptor> addInDescriptors;
 * you may not use this file except in compliance with the License.
     */

package org.jkiss.dbeaver.ui.editors.sql.addins;
 * Unless required by applicable law or agreed to in writing, software
    private SQLEditorAddInsRegistry(IExtensionRegistry registry) {
import org.eclipse.core.runtime.IExtensionRegistry;

        }
 * DBeaver - Universal Database Manager
     * Returns instance of SQLEditorAddInsRegistry
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
        this.addInDescriptors = List.copyOf(addInDescriptors);
 *


    }
    public List<SQLEditorAddInDescriptor> getAddIns() {

 * limitations under the License.


        IConfigurationElement[] addInElements = registry.getConfigurationElementsFor(EXTENSION_ID);
        addInDescriptors.sort(Comparator.comparingInt(SQLEditorAddInDescriptor::getPriority));
    
import org.eclipse.core.runtime.IConfigurationElement;
import java.util.List;
 * Configuration registry of the SQL Editor Add-ins

