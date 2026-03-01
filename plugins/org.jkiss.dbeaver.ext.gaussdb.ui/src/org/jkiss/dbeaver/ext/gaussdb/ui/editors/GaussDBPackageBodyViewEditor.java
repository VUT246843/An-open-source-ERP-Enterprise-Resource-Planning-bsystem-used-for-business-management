 * See the License for the specific language governing permissions and

        }
 * you may not use this file except in compliance with the License.
    }
}
        getInputPropertySource().setPropertyValue(monitor, "extendedDefinitionText", sourceText);
        PostgreScriptObject object = getSourceObject();
        if (object instanceof GaussDBPackage) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    protected void setSourceText(DBRProgressMonitor monitor, String sourceText) {
 *
    @Override
/*
    protected boolean isReadOnly() {
        return false;
    protected String getSourceText(DBRProgressMonitor monitor) throws DBException {

 * distributed under the License is distributed on an "AS IS" BASIS,

 *
import org.jkiss.dbeaver.ext.postgresql.ui.editors.PostgreSourceViewEditor;
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ext.postgresql.model.PostgreScriptObject;
 *
    @Override
package org.jkiss.dbeaver.ext.gaussdb.ui.editors;
import org.jkiss.dbeaver.ext.gaussdb.model.GaussDBPackage;

    }

    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
            return sourceObject.getExtendedDefinitionText();
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
public class GaussDBPackageBodyViewEditor extends PostgreSourceViewEditor {
 * DBeaver - Universal Database Manager
        return "";
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            GaussDBPackage sourceObject = (GaussDBPackage) object;

import org.jkiss.dbeaver.DBException;
