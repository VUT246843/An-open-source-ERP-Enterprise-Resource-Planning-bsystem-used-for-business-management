import org.jkiss.dbeaver.runtime.DBWorkbench;
            return DBWorkbench.getPlatform().getApplication().getClass() == DBeaverApplication.class;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
    public static final String PROP_IS_COMMUNITY = "isCommunity"; //$NON-NLS-1$
 * Unless required by applicable law or agreed to in writing, software

}
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (PROP_IS_COMMUNITY.equals(property)) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return true;

package org.jkiss.dbeaver.ui.app.standalone.actions;
 * limitations under the License.
        }
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
/*
 *
 */
    public static final String NAMESPACE = "org.jkiss.dbeaver.ui.app.standalone.menu.configuration"; //$NON-NLS-1$
import org.eclipse.core.expressions.PropertyTester;
    }

 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.app.standalone.DBeaverApplication;

 * distributed under the License is distributed on an "AS IS" BASIS,
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
    @Override
 *
public class MenuConfigurationPropertyTester extends PropertyTester {
