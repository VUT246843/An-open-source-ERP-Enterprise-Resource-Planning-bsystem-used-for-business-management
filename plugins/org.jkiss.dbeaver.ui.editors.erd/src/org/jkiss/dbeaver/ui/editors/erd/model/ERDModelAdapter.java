 * limitations under the License.
import org.eclipse.gef.EditPart;
 * ERD model adapter
/**

    void handleContentChange(ERDEditorPart editorPart);
 * you may not use this file except in compliance with the License.
import java.beans.PropertyChangeEvent;
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ui.editors.erd.model;
    void handlePropertyChange(ERDEditorPart editorPart, PropertyChangeEvent event);
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorPart;
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
public interface ERDModelAdapter {
}
 * See the License for the specific language governing permissions and

    void installPartEditPolicies(EditPart editPart);
 * DBeaver - Universal Database Manager
/*

 */
 *
import org.eclipse.gef.Request;
 *




 * Licensed under the Apache License, Version 2.0 (the "License");
    void performPartRequest(EditPart editPart, Request request);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *

    boolean supportsModelEdit();
