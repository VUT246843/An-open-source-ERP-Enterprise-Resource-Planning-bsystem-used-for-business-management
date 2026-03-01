import org.jkiss.dbeaver.ext.postgresql.model.PostgreProcedure;
    }
    private static final DBGDebugObject DEBUG_OBJECT = new DBGDebugObject() {
public class PostgreDebugObjectAdapterFactory implements IAdapterFactory {
        return null;
            }
 */
}
    public Class<?>[] getAdapterList() {
import org.jkiss.dbeaver.debug.DBGDebugObject;

 *
package org.jkiss.dbeaver.ext.postgresql.debug.ui.internal;
import org.jkiss.dbeaver.ui.editors.IDatabaseEditorInput;
    }
                adaptableObject = editorPart.getEditorInput();
        if (adapterType == DBGDebugObject.class) {
            }
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
                return adapterType.cast(DEBUG_OBJECT);
 * you may not use this file except in compliance with the License.
        }
                return adapterType.cast(DEBUG_OBJECT);

import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
import org.jkiss.dbeaver.ext.postgresql.ui.editors.PostgreSourceViewEditor;
            if (adaptableObject instanceof PostgreSourceViewEditor viewEditor && viewEditor.getSourceObject() instanceof PostgreProcedure) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
/*
 * limitations under the License.
        return CLASSES;
            if (adaptableObject instanceof IEditorPart editorPart) {

    };
 *     http://www.apache.org/licenses/LICENSE-2.0
                return adapterType.cast(DEBUG_OBJECT);
 * distributed under the License is distributed on an "AS IS" BASIS,


 * DBeaver - Universal Database Manager
    @Override

            if (adaptableObject instanceof DBNDatabaseNode databaseNode && databaseNode.getObject() instanceof PostgreProcedure) {

    @Override
 *
 * You may obtain a copy of the License at
            }
    private static final Class<?>[] CLASSES = new Class[] { DBGDebugObject.class };
 * Licensed under the Apache License, Version 2.0 (the "License");
    public <T> T getAdapter(Object adaptableObject, Class<T> adapterType) {
 *
import org.eclipse.core.runtime.IAdapterFactory;
            if (adaptableObject instanceof IDatabaseEditorInput dei && dei.getDatabaseObject() instanceof PostgreProcedure) {
 * See the License for the specific language governing permissions and
import org.eclipse.ui.IEditorPart;
