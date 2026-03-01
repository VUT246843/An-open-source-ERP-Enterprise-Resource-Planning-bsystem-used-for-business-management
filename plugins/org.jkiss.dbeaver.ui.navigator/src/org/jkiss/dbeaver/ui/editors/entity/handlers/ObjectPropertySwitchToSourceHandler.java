
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2025 DBeaver Corp and others
                }
import org.jkiss.dbeaver.ui.editors.entity.properties.ObjectPropertiesEditor;
import org.jkiss.code.NotNull;
            }
    }
    }
        if (editor.getPageEditor(EntityEditorDescriptor.DEFAULT_OBJECT_EDITOR_ID) instanceof ObjectPropertiesEditor part) {
 * limitations under the License.
    @Override
import org.eclipse.ui.IEditorPart;
import org.jkiss.dbeaver.ui.editors.entity.EntityEditorDescriptor;
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.core.commands.ExecutionException;
package org.jkiss.dbeaver.ui.editors.entity.handlers;
import org.eclipse.ui.handlers.HandlerUtil;
    public static String findSourceTextEditorId(@NotNull EntityEditor editor) {
            for (EntityEditorDescriptor descr : descrs) {
public class ObjectPropertySwitchToSourceHandler extends AbstractHandler {
        return null;
}


        }
 *
    public Object execute(@NotNull ExecutionEvent event) throws ExecutionException {
                editor.getDatabaseObject(), part, null);
    
            if (sourceEditorId != null) {
import org.jkiss.dbeaver.ui.editors.entity.EntityEditorsRegistry;
import java.util.List;
import org.jkiss.dbeaver.ui.editors.text.BaseTextEditor;
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Nullable
 *
 * See the License for the specific language governing permissions and
                if (descr.getEditorType().matchesType(BaseTextEditor.class)) {
            List<EntityEditorDescriptor> descrs = EntityEditorsRegistry.getInstance().getEntityEditors(
    @Nullable
        } 
 */
        if (editorPart instanceof EntityEditor editor) {
        IEditorPart editorPart = HandlerUtil.getActiveEditor(event);
                editor.switchFolder(sourceEditorId);
import org.eclipse.core.commands.AbstractHandler;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.editors.entity.EntityEditor;
 *
    

            }
import org.eclipse.core.commands.ExecutionEvent;
 * DBeaver - Universal Database Manager
        return null;
                    return descr.getId();
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.Nullable;
            String sourceEditorId = findSourceTextEditorId(editor);
 * you may not use this file except in compliance with the License.
