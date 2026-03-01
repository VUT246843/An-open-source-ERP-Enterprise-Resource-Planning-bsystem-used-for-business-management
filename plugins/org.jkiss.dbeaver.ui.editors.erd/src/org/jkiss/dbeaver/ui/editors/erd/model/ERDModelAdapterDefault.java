 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
    }
 * See the License for the specific language governing permissions and
    }
public class ERDModelAdapterDefault implements ERDModelAdapter {
import org.eclipse.gef.Request;
    }


    @Override

import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorPart;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 */

    public void installPartEditPolicies(EditPart editPart) {
 * You may obtain a copy of the License at

 *     http://www.apache.org/licenses/LICENSE-2.0
}
    public void handleContentChange(ERDEditorPart editorPart) {

    public void handlePropertyChange(ERDEditorPart editorPart, PropertyChangeEvent event) {
 *
    @Override

    public void performPartRequest(EditPart editPart, Request request) {

 * DBeaver - Universal Database Manager
 * limitations under the License.
    }
    @Override
    public boolean supportsModelEdit() {
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ui.editors.erd.model;
 */
 *
        return false;

/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Empty model adapter
    }

import java.beans.PropertyChangeEvent;
 * you may not use this file except in compliance with the License.

    @Override

 *
import org.eclipse.gef.EditPart;
 * Unless required by applicable law or agreed to in writing, software
/**
