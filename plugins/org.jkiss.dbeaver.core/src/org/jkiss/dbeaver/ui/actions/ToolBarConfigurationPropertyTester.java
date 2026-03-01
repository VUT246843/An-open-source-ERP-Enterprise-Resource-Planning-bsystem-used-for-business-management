 *     http://www.apache.org/licenses/LICENSE-2.0

 * Licensed under the Apache License, Version 2.0 (the "License");
    public static void fireVisibilityPropertyChange() {
     */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.core.expressions.PropertyTester;
    @Override
 * you may not use this file except in compliance with the License.
    public static final String NAMESPACE = "org.jkiss.dbeaver.ui.toolbar.configuration"; //$NON-NLS-1$
 */
import org.jkiss.dbeaver.ui.ActionUtils;
        if (PROP_VISIBLE.equals(property) && args != null && args.length == 2) {
     * Notify eclipse that visibility preferences were changed
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
public class ToolBarConfigurationPropertyTester extends PropertyTester {
 * DBeaver - Universal Database Manager
 *
 * Unless required by applicable law or agreed to in writing, software
/*
 *
}
    }
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ui.actions;

 * Copyright (C) 2010-2024 DBeaver Corp and others

 * See the License for the specific language governing permissions and
            return ToolBarConfigurationRegistry.getInstance().isItemVisible(args[0].toString(), args[1].toString());
        ActionUtils.evaluatePropertyState(NAMESPACE + "." + PROP_VISIBLE);
        }
        return true;

 * You may obtain a copy of the License at
    /**
 *
 * limitations under the License.
    public static final String PROP_VISIBLE = "visible"; //$NON-NLS-1$
