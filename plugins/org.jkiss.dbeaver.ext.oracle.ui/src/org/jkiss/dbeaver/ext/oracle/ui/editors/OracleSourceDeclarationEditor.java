    }
        }
import org.jkiss.dbeaver.ext.oracle.model.OracleJob;
        if (getSourceObject() instanceof OracleTableBase) {
 * limitations under the License.
 * you may not use this file except in compliance with the License.

    @Override

    @Override
        return options;
            sourceText);
import org.jkiss.dbeaver.model.struct.DBSObjectWithScript;
public class OracleSourceDeclarationEditor extends SQLSourceViewer<OracleSourceObject> implements OracleDDLOptions {
 * Oracle source declaration editor
    @Override
import org.jkiss.dbeaver.ext.oracle.model.source.OracleSourceObject;
    protected void setSourceText(DBRProgressMonitor monitor, String sourceText) {
/**
 * Unless required by applicable law or agreed to in writing, software
        oracleDDLOptions.put(name, value);
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ext.oracle.ui.editors;

    protected void contributeEditorCommands(IContributionManager toolBarManager) {
        getInputPropertySource().setPropertyValue(
        super.contributeEditorCommands(toolBarManager);
        if (!CommonUtils.isEmpty(oracleDDLOptions)) {
import org.eclipse.jface.action.IContributionManager;
}
 *
 * See the License for the specific language governing permissions and
    }
import org.jkiss.utils.CommonUtils;
            options.putAll(oracleDDLOptions);
        }


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
            return sourceObject.supportsCompile() ? OracleConstants.CMD_COMPILE : null;
    }
            OracleTableBase sourceObject = (OracleTableBase) getSourceObject();
import org.jkiss.dbeaver.ext.oracle.model.OracleTableBase;
    }
        return sourceObject instanceof OracleJob;
    @Override
    }
/*

    private Map<String, Object> oracleDDLOptions = new HashMap<>();
    @Override
    protected Map<String, Object> getSourceOptions() {

    public void putDDLOptions(String name, Object value) {

    @Override
 */
 * distributed under the License is distributed on an "AS IS" BASIS,

            monitor,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            OracleConstants.PROP_OBJECT_DEFINITION,
 * You may obtain a copy of the License at
        }
    protected String getCompileCommandId() {
        Map<String, Object> options = super.getSourceOptions();
    protected boolean isReadOnly() {
        var sourceObject = getSourceObject();
 * Copyright (C) 2010-2025 DBeaver Corp and others
import java.util.HashMap;
import java.util.Map;
 *
            OracleEditorUtils.addDDLControl(toolBarManager, sourceObject, this);
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
    }
        return null;
 */
import org.jkiss.dbeaver.ui.editors.sql.SQLSourceViewer;
import org.jkiss.dbeaver.ext.oracle.model.OracleConstants;
        if (sourceObject != null) {


        DBSObjectWithScript sourceObject = getSourceObject();
