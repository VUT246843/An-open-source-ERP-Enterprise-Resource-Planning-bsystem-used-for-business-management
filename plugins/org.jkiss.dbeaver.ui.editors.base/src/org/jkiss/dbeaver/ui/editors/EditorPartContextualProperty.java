    
                        log.debug(e.getMessage(), e);
        @NotNull String partPropName,
        this.partPropName = partPropName;
    public boolean setPropertyValue(@NotNull EditorPart editor, @Nullable String value) {
                }
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
            this.isInitial = isInitial;
 *
        String value = editor.getPartProperty(partPropName);
            isInitial = true;
public class EditorPartContextualProperty {
                String value = activeFile.getPersistentProperty(filePropName);

 * See the License for the specific language governing permissions and

                    }
        this.defaultValue = defaultValue;
    
    public PartCustomPropertyValueInfo getPropertyValue(@NotNull EditorPart editor) {
    }
    }
                IFile activeFile = EditorUtils.getFileFromInput(editor.getEditorInput());
import org.eclipse.core.runtime.QualifiedName;
import org.jkiss.dbeaver.Log;
            changed = true;
        }
        final DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
    ) {
                    try {
            this.value = value;
    public final String defaultValue;
    public final String globalPrefName;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                        activeFile.setPersistentProperty(filePropName, value);

                    return value;
                editor.setPartProperty(partPropName, value);
        @NotNull String partPropName,
    }
        @NotNull QualifiedName filePropName,
 *
}
    public final QualifiedName filePropName;
    }
        @NotNull String defaultValue
import org.jkiss.utils.CommonUtils;
        );
    }
        if (value == null) {
            partPropName,

        this.filePropName = filePropName;
        } else {
    public final String partPropName;
        boolean isInitial;
    private static final Map<String, EditorPartContextualProperty> knownProps = Collections.synchronizedMap(new HashMap<>());
            try {
 * DBeaver - Universal Database Manager
    ) {
        return store.contains(globalPrefName) ? store.getString(globalPrefName) : defaultValue;
        }
            DBWorkbench.getPlatform().getPreferenceStore().firePropertyChangeEvent(globalPrefName, oldValue, value);
    @NotNull
        if (activeFile != null && activeFile.exists()) {
                if (activeFile != null) {
    /**
            if (CommonUtils.equalObjects(oldValue, value)) {
 *
package org.jkiss.dbeaver.ui.editors;
 * Unless required by applicable law or agreed to in writing, software
     * Get SQL Editor property value
                changed = false;
    
import java.util.HashMap;
            } catch (CoreException e) {
import org.eclipse.ui.part.EditorPart;
import org.eclipse.core.runtime.CoreException;
     * Set SQL Editor property value
                if (value != null) {

        @NotNull String defaultValue
    private String getPropertyValueInitial(@NotNull EditorPart editor) {

        if (changed) {
        public final String value;
 * limitations under the License.
    private EditorPartContextualProperty(
        }
/*
        public PartCustomPropertyValueInfo(@NotNull String value, boolean isInitial) {
    
 * You may obtain a copy of the License at
import org.eclipse.core.resources.IFile;
        IFile activeFile = EditorUtils.getFileFromInput(editor.getEditorInput());
        return knownProps.computeIfAbsent(
import org.jkiss.code.Nullable;
     */
 * Copyright (C) 2010-2024 DBeaver Corp and others
            value = getPropertyValueInitial(editor);
            editor.setPartProperty(partPropName, defaultValue);
        this.globalPrefName = globalPrefName;
    }
                changed = true;

        @NotNull QualifiedName filePropName,
            isInitial = false;
 *     http://www.apache.org/licenses/LICENSE-2.0
     */
import java.util.Collections;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.Map;
import org.jkiss.dbeaver.runtime.DBWorkbench;
    public static EditorPartContextualProperty setup(
    
                log.debug(e.getMessage(), e);
    @NotNull
        String oldValue = editor.getPartProperty(partPropName);
        boolean changed;
            }
        public final boolean isInitial;
        return changed;
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
        } else {
            } else {
    private static final Log log = Log.getLog(EditorPartContextualProperty.class);
    /**
                }
        }
        @NotNull String globalPrefName,
 * you may not use this file except in compliance with the License.
    

        if (value == null) {
        @NotNull String globalPrefName,
    public static class PartCustomPropertyValueInfo {
import org.jkiss.code.NotNull;
                    } catch (CoreException e) {
            partPropName2 -> new EditorPartContextualProperty(partPropName2, filePropName, globalPrefName, defaultValue)
            }

        return new PartCustomPropertyValueInfo(value, isInitial);
