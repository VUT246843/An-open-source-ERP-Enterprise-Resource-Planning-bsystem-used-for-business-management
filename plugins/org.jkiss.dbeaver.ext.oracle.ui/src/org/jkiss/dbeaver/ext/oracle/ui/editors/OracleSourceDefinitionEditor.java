    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ext.oracle.model.source.OracleSourceObject;
            monitor,
    }
}
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * See the License for the specific language governing permissions and
 *
            sourceText);
    protected String getCompileCommandId()

 */
    protected boolean isReadOnly() {


 * limitations under the License.
import org.jkiss.dbeaver.DBException;
            OracleConstants.PROP_OBJECT_BODY_DEFINITION,
 * you may not use this file except in compliance with the License.
    @Override
 * Oracle source definition editor
    {
    protected void setSourceText(DBRProgressMonitor monitor, String sourceText) {
        getInputPropertySource().setPropertyValue(
package org.jkiss.dbeaver.ext.oracle.ui.editors;
/*
public class OracleSourceDefinitionEditor extends SQLSourceViewer<OracleSourceObject> {
 * DBeaver - Universal Database Manager
        return false;
 *
    @Override
import org.jkiss.dbeaver.ui.editors.sql.SQLSourceViewer;
import org.jkiss.dbeaver.ext.oracle.model.OracleConstants;
 *
 */
    }
 *     http://www.apache.org/licenses/LICENSE-2.0

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * Unless required by applicable law or agreed to in writing, software
        return OracleConstants.CMD_COMPILE;
/**
    }
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
 * You may obtain a copy of the License at

        return ((DBPScriptObjectExt)getSourceObject()).getExtendedDefinitionText(monitor);
import org.jkiss.dbeaver.model.DBPScriptObjectExt;

    protected String getSourceText(DBRProgressMonitor monitor) throws DBException {
