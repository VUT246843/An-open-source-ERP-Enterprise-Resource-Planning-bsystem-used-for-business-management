import org.jkiss.dbeaver.model.DBPEvaluationContext;

 *
    protected void addDatabaseBreakpointAttributes(Map<String, Object> attributes, DBSObject databaseObject, DBNNode node, DBGBreakpointDescriptor breakpointDescriptor) {
 * limitations under the License.
        return ensureMarker().getAttribute(DBGConstants.BREAKPOINT_ATTRIBUTE_OBJECT_NAME, null);
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.debug.core.model.Breakpoint;
        attributes.put(DBGConstants.BREAKPOINT_ATTRIBUTE_DATASOURCE_ID, databaseObject.getDataSource().getContainer().getId());

 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
 * DBeaver - Universal Database Manager
            setRegistered(false);
        attributes.putAll(breakpointDescriptor.toMap());
    }
        } else {

 */
        if (register) {
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
    }
                plugin.getBreakpointManager().addBreakpoint(this);
        return ensureMarker().getAttribute(DBGConstants.BREAKPOINT_ATTRIBUTE_NODE_PATH, null);


 * distributed under the License is distributed on an "AS IS" BASIS,
        return DBGConstants.MODEL_IDENTIFIER_DATABASE;
/*
    public String getDatasourceId() throws CoreException {
    @Override
public class DatabaseBreakpoint extends Breakpoint implements IDatabaseBreakpoint {
 * Unless required by applicable law or agreed to in writing, software
    }
    public String getObjectName() throws CoreException {
    }
    public String getNodePath() throws CoreException {

import org.jkiss.dbeaver.debug.DBGBreakpointDescriptor;
    @Override
    protected void register(boolean register) throws CoreException {
 * See the License for the specific language governing permissions and
}
import org.jkiss.dbeaver.model.struct.DBSObject;

import org.eclipse.core.runtime.CoreException;
import org.jkiss.dbeaver.debug.DBGConstants;
 * You may obtain a copy of the License at


            }
import org.jkiss.dbeaver.model.navigator.DBNNode;
 *
    public String getModelIdentifier() {
import org.jkiss.dbeaver.model.DBUtils;
    }
        attributes.put(DBGConstants.BREAKPOINT_ATTRIBUTE_OBJECT_NAME, DBUtils.getObjectFullName(databaseObject, DBPEvaluationContext.UI));
 * you may not use this file except in compliance with the License.
        return ensureMarker().getAttribute(DBGConstants.BREAKPOINT_ATTRIBUTE_DATASOURCE_ID, null);
            DebugPlugin plugin = DebugPlugin.getDefault();
 *
    @Override

        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.debug.core.DebugPlugin;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
            if (plugin != null) {
package org.jkiss.dbeaver.debug.core.breakpoints;
import java.util.Map;
        attributes.put(DBGConstants.BREAKPOINT_ATTRIBUTE_NODE_PATH, node.getNodeUri());
