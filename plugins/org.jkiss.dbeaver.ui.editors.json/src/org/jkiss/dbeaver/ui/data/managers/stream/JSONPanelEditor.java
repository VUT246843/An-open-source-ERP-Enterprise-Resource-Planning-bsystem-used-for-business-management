/*
package org.jkiss.dbeaver.ui.data.managers.stream;
 * distributed under the License is distributed on an "AS IS" BASIS,
        return true;
import org.jkiss.dbeaver.ui.data.IValueController;
    protected String getFileFolderName() {
                setSite(site);
    @Override
        // Override init function because standard is VEEERY slow
 */
    }
            }
 *
import org.jkiss.dbeaver.ui.editors.json.JSONTextEditor;
    @Override
    }
                try {
    @Override
        JsonElement jsonElement;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public String minify(String value) {
 *
 * DBeaver - Universal Database Manager
    @Override
                } catch (CoreException e) {

 * Unless required by applicable law or agreed to in writing, software
    }
public class JSONPanelEditor extends AbstractTextPanelEditor<JSONTextEditor> {
        } catch (JsonSyntaxException ex) {

        try {
}

                    doSetInput(input);
/**
import org.jkiss.dbeaver.ui.editors.json.JSONFormattingStrategy;
import org.jkiss.dbeaver.ui.data.managers.AbstractTextPanelEditor;
        return "dbeaver-json";
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.core.runtime.CoreException;
    }
    protected String getFileExtension() {
        return new JSONTextEditor() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        }
    }
 *

    @Override
            return value;
    public boolean supportMinify() {
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.IEditorSite;

        return JSONFormattingStrategy.GSON_UNFORMATTED.toJson(jsonElement);
        return ".json";
 * you may not use this file except in compliance with the License.
import org.eclipse.ui.IEditorInput;

                    throw new PartInitException("Error initializing panel JSON editor", e);
 * Copyright (C) 2010-2024 DBeaver Corp and others
*/
                }
* JSONPanelEditor
            public void init(IEditorSite site, IEditorInput input) throws PartInitException {
 * See the License for the specific language governing permissions and

 * You may obtain a copy of the License at
            @Override
        };
 * limitations under the License.
            jsonElement = JsonParser.parseString(value);
import com.google.gson.*;
    protected JSONTextEditor createEditorParty(IValueController valueController) {
