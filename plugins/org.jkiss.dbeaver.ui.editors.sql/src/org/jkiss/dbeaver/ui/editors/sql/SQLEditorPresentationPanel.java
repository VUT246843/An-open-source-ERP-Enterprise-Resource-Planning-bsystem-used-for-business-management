 * distributed under the License is distributed on an "AS IS" BASIS,



    void deactivatePanel();
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.widgets.Composite;
public interface SQLEditorPresentationPanel {
/*
 */
 * Unless required by applicable law or agreed to in writing, software
 *
 * Presentation panel. Displayed in the same tab folder as SQL results and other panels
import org.eclipse.swt.widgets.Control;

 *
 * You may obtain a copy of the License at
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * Licensed under the Apache License, Version 2.0 (the "License");
/**
package org.jkiss.dbeaver.ui.editors.sql;
 * See the License for the specific language governing permissions and
 *
    Control createPanel(Composite parent, SQLEditor editor, SQLEditorPresentation presentation);

    void activatePanel();
}
 */
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
