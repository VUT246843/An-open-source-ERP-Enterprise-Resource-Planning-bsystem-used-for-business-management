    }
    @Override
public class GaussDBPackageDeclareViewEditor extends PostgreSourceViewEditor {
 * limitations under the License.
        return "";
            return sourceObject.getObjectDefinitionText();
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
    }

    protected String getSourceText(DBRProgressMonitor monitor) throws DBException {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.DBException;
package org.jkiss.dbeaver.ext.gaussdb.ui.editors;


        PostgreScriptObject object = getSourceObject();
        return false;
 * you may not use this file except in compliance with the License.
        }
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (object instanceof GaussDBPackage) {
import org.jkiss.dbeaver.ext.gaussdb.model.GaussDBPackage;

 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
 *
    protected boolean isReadOnly() {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreScriptObject;
            GaussDBPackage sourceObject = (GaussDBPackage) object;
import org.jkiss.dbeaver.ext.postgresql.ui.editors.PostgreSourceViewEditor;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
/*

}
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
 * Unless required by applicable law or agreed to in writing, software
 */
