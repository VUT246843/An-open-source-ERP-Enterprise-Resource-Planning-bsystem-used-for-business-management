 * See the License for the specific language governing permissions and
    @Override
    public IWorkbenchPart getPart() {
 * Unless required by applicable law or agreed to in writing, software
}
 * limitations under the License.
package org.jkiss.dbeaver.ui.editors.content;
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
/**

        super(contentEditor, editor);

 * you may not use this file except in compliance with the License.
        return getMultiPageEditor();

 */
 * You may obtain a copy of the License at
class ContentEditorSite extends MultiPageEditorSite {
import org.eclipse.ui.IEditorPart;

    }
import org.eclipse.ui.IWorkbenchPart;
 *
 * DBeaver - Universal Database Manager
/*
 *
 *
 * Content Editor Site

    public ContentEditorSite(ContentEditor contentEditor, IEditorPart editor)
    }
import org.eclipse.ui.part.MultiPageEditorSite;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
