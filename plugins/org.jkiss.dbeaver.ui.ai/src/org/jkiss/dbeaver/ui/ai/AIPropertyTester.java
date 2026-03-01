 * You may obtain a copy of the License at
        if (property.equals(PROP_IS_DISABLED)) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
import org.jkiss.dbeaver.ui.UIUtils;
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
 *
        return false;
 *
    }
    @Override
import org.jkiss.dbeaver.model.ai.registry.AISettingsManager;
            return AISettingsManager.getInstance().getSettings().isAiDisabled();
    public static final String PROP_IS_DISABLED = "isDisabled";
    public AIPropertyTester() {
    public static final String NAMESPACE = "org.jkiss.dbeaver.ui.ai";
 * distributed under the License is distributed on an "AS IS" BASIS,
public class AIPropertyTester extends PropertyTester {
import org.eclipse.core.expressions.PropertyTester;
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
/*
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
    public static void firePropertyChange(String propName) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ui.ai;

import org.jkiss.dbeaver.ui.ActionUtils;
        AISettingsManager.getInstance().addChangedListener(s -> UIUtils.asyncExec(() -> firePropertyChange(PROP_IS_DISABLED)));
 * Licensed under the Apache License, Version 2.0 (the "License");

    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
 * limitations under the License.


        ActionUtils.evaluatePropertyState(NAMESPACE + "." + propName);
}

    }
    }

