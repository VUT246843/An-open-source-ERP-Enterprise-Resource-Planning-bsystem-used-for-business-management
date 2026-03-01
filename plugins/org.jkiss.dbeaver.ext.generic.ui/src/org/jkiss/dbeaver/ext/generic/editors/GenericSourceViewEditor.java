
import org.jkiss.dbeaver.ui.editors.sql.SQLSourceViewer;
/**

 * limitations under the License.
 * GenericSourceViewEditor

 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,

 *
import org.jkiss.dbeaver.model.struct.DBSObject;
public class GenericSourceViewEditor<T extends DBPScriptObject & DBSObject> extends SQLSourceViewer<T> {
    protected boolean isReadOnly() {
    public GenericSourceViewEditor() {
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
/*
 */
 * you may not use this file except in compliance with the License.
    }
        boolean supportsDelimitersInViews = true;
    }
 * Unless required by applicable law or agreed to in writing, software
        if (getSQLDialect() instanceof GenericSQLDialect) {
    protected void setSourceText(DBRProgressMonitor monitor, String sourceText) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
import org.jkiss.dbeaver.model.DBPScriptObject;

import org.jkiss.dbeaver.ext.generic.model.GenericSQLDialect;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");

    }
}
    @Override
import org.jkiss.dbeaver.model.sql.SQLUtils;
 *     http://www.apache.org/licenses/LICENSE-2.0

            supportsDelimitersInViews ? sourceText : SQLUtils.removeQueryDelimiter(getSQLDialect(), sourceText));
        getInputPropertySource().setPropertyValue(monitor, "objectDefinitionText",
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.struct.DBSObjectWithScript;
package org.jkiss.dbeaver.ext.generic.editors;
        return !(getSourceObject() instanceof DBSObjectWithScript);
 * See the License for the specific language governing permissions and
        }
            supportsDelimitersInViews = ((GenericSQLDialect) getSQLDialect()).supportsDelimiterAfterViews();
 * DBeaver - Universal Database Manager
