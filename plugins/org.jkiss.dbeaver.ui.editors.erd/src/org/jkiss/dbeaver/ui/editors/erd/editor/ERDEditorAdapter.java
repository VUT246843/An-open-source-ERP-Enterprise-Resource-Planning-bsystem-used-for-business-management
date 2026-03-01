        return null;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
        }


 * ERDEditorAdapter
/*
 *
    }
 */
        editorsMap.put(control, editor);
 */
import org.eclipse.swt.widgets.Control;
        return new Class[] { ERDEditorPart.class };
            }
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ui.editors.erd.editor;
    public Class<?>[] getAdapterList() {
    {

import org.eclipse.ui.IEditorPart;



 *
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
        if (adapterType == ERDEditorPart.class) {
                IEditorPart activeEditor = ((MultiPageAbstractEditor) adaptableObject).getActiveEditor();
 * limitations under the License.
                }
    static synchronized void mapControl(Control control, ERDEditorPart editor)
    @Override
    }
        editorsMap.remove(control);
 * Copyright (C) 2010-2025 DBeaver Corp and others
                return adapterType.cast(getEditor((Control) adaptableObject));
    }
        return editorsMap.get(control);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class ERDEditorAdapter implements IAdapterFactory {

    }

import java.util.IdentityHashMap;
 * Licensed under the Apache License, Version 2.0 (the "License");

    @Override
 *
import org.eclipse.core.runtime.IAdapterFactory;
    private static final Map<Control, ERDEditorPart> editorsMap = new IdentityHashMap<>();
}
    static synchronized void unmapControl(Control control)
 * you may not use this file except in compliance with the License.
    {
/**
    {
    }
            } else if (adaptableObject instanceof MultiPageAbstractEditor) {
import java.util.Map;
    public static synchronized ERDEditorPart getEditor(Control control)
            if (adaptableObject instanceof Control) {
                if (activeEditor instanceof ERDEditorPart) {
import org.jkiss.dbeaver.ui.editors.MultiPageAbstractEditor;
 * distributed under the License is distributed on an "AS IS" BASIS,
                    return adapterType.cast(activeEditor);
    public <T> T getAdapter(Object adaptableObject, Class<T> adapterType) {
