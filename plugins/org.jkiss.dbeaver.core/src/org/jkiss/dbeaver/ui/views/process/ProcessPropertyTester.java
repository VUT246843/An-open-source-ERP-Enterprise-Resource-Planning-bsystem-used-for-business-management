    public static final String NAMESPACE = "org.jkiss.dbeaver.runtime.process";
 * you may not use this file except in compliance with the License.
 * ProcessPropertyTester

        if (!(receiver instanceof DBRProcessController controller)) {
 */

            return controller.getProcessDescriptor() != null && controller.getProcessDescriptor().isRunning();
import org.jkiss.dbeaver.ui.ActionUtils;
    }
 * Unless required by applicable law or agreed to in writing, software
}public class ProcessPropertyTester extends PropertyTester {
        if (property.equals(PROP_RUNNING)) {
 * You may obtain a copy of the License at
        return false;
 *
 *
            return false;
package org.jkiss.dbeaver.ui.views.process;
        }

    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
    {
    public static final String PROP_RUNNING = "running";
import org.eclipse.core.expressions.PropertyTester;
 *
    }
 */
        super();
import org.jkiss.dbeaver.model.runtime.DBRProcessController;
        }
        ActionUtils.evaluatePropertyState(NAMESPACE + "." + propName);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,

    public static void firePropertyChange(String propName)
 * Copyright (C) 2010-2025 DBeaver Corp and others
/**

 *     http://www.apache.org/licenses/LICENSE-2.0
    public ProcessPropertyTester() {

/*
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    @Override


