    }
    public static final String PROP_HAS_TOOLS = "hasTools";
            return false;
import org.jkiss.dbeaver.model.rm.RMConstants;

        IStructuredSelection structuredSelection = NavigatorUtils.getSelectionFromPart((IWorkbenchPart)receiver);
            }
        if (!(receiver instanceof IWorkbenchPart)) {
    }
import org.eclipse.jface.viewers.IStructuredSelection;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
                item = dbObject;
                    }
}
/*
        for (Object item : selection.toArray()) {
                    if (descriptor.appliesTo((DBPObject) item)) {
 * you may not use this file except in compliance with the License.
 */
 *
            case PROP_HAS_TOOLS: {
        return false;
                    && hasAvailableTools(structuredSelection);

    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.tools.registry.ToolDescriptor;
 */
        }
import org.jkiss.dbeaver.tools.registry.ToolsRegistry;
 *
 * ToolsPropertyTester

            }
            DBSObject dbObject = DBUtils.getFromObject(item);

 *
    public static final String NAMESPACE = "org.jkiss.dbeaver.core.tools";
                        return true;
            if (dbObject != null) {
import org.jkiss.dbeaver.model.DBPObject;
{
import org.eclipse.ui.IWorkbenchPart;
                for (ToolDescriptor descriptor : ToolsRegistry.getInstance().getTools()) {
    }
 * You may obtain a copy of the License at
            if (item instanceof DBPObject) {
public class ToolsPropertyTester extends PropertyTester
        switch (property) {
import org.eclipse.core.expressions.PropertyTester;
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
        super();
    private boolean hasAvailableTools(IStructuredSelection selection) {
        }
        return false;

import org.jkiss.dbeaver.model.DBUtils;
    @Override
 * See the License for the specific language governing permissions and
        if (structuredSelection == null || structuredSelection.isEmpty()) {
                return DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_DATABASE_DEVELOPER)
import org.jkiss.dbeaver.runtime.DBWorkbench;

package org.jkiss.dbeaver.tasks.ui;
                        continue;
        boolean singleObject = selection.size() == 1;
                }

 * Unless required by applicable law or agreed to in writing, software
                    }
            return false;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.

import org.jkiss.dbeaver.model.struct.DBSObject;
                    if (descriptor.isSingleton() && !singleObject) {
    public ToolsPropertyTester() {
        }
            }
    @SuppressWarnings("unchecked")
 * Copyright (C) 2010-2024 DBeaver Corp and others
/**
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
