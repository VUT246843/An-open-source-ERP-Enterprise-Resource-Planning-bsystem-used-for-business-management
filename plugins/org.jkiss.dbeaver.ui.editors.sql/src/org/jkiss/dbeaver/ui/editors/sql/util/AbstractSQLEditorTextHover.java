     * Associates a SQL editor with this hover. Subclass can cache it for later use.

        return parent -> {

 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and
            DefaultInformationControl control = new DefaultInformationControl(parent, true);
            control.setSizeConstraints(60, 10);
    public IRegion getHoverRegion(ITextViewer textViewer, int offset) {
 *
    /**
 */
    public IInformationControlCreator getHoverControlCreator() {
 *
            return control;
 * You may obtain a copy of the License at
    public abstract void setEditor(IEditorPart editor);

 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
    @Override
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
}
        };
     */
package org.jkiss.dbeaver.ui.editors.sql.util;
import org.eclipse.ui.IEditorPart;
    }
    }
public abstract class AbstractSQLEditorTextHover implements ITextHover, ITextHoverExtension {

        return SQLWordFinder.findWord(textViewer.getDocument(), offset);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.

 *
    public AbstractSQLEditorTextHover() {
/*

    }
import org.eclipse.jface.text.*;
