 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (!CommonUtils.isEmpty(oracleDDLOptions)) {

    }
import org.jkiss.dbeaver.ui.editors.sql.SQLSourceViewer;
 */
 * See the License for the specific language governing permissions and
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software

    {

 * you may not use this file except in compliance with the License.
    }
import org.eclipse.jface.action.IContributionManager;
        if (getSourceObject() instanceof OracleTable) {
        }
    }
 * limitations under the License.

}package org.jkiss.dbeaver.ext.oracle.ui.editors;
 * You may obtain a copy of the License at


 * distributed under the License is distributed on an "AS IS" BASIS,
    public void putDDLOptions(String name, Object value) {

    }
/**
    @Override
 *

        oracleDDLOptions.put(name, value);
import java.util.HashMap;
 *
/*
            OracleEditorUtils.addDDLControl(contributionManager, getSourceObject(), this);
public class OracleObjectDDLEditor extends SQLSourceViewer<OracleTable> implements OracleDDLOptions{
    protected Map<String, Object> getSourceOptions() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public OracleObjectDDLEditor()
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
 *
    @Override
import java.util.Map;
    {
import org.jkiss.utils.CommonUtils;
        Map<String, Object> options = super.getSourceOptions();
        }
    protected void contributeEditorCommands(IContributionManager contributionManager)
    private Map<String, Object> oracleDDLOptions = new HashMap<>();
        return options;
            options.putAll(oracleDDLOptions);
        super.contributeEditorCommands(contributionManager);
import org.jkiss.dbeaver.ext.oracle.model.OracleTable;
 * OracleObjectDDLEditor
