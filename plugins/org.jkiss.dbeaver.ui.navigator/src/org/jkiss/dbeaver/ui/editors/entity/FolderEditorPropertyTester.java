import org.jkiss.dbeaver.ui.ActionUtils;
 * distributed under the License is distributed on an "AS IS" BASIS,
                } else {
    }

    }
                    return editor.getHistoryPosition() > 0;
    public static final String PROP_CAN_NAVIGATE = "canNavigate";
 * Copyright (C) 2010-2024 DBeaver Corp and others

            return false;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/**
                    return editor.getHistoryPosition() < editor.getHistorySize() - 1;
        switch (property) {
            case PROP_CAN_NAVIGATE:
    }
    public static final String NAMESPACE = "org.jkiss.dbeaver.ui.editors.folder";
 * FolderEditorPropertyTester
    public FolderEditorPropertyTester() {
        ActionUtils.evaluatePropertyState(NAMESPACE + "." + propName);
        super();
 *


                }
    public static void firePropertyChange(String propName)
 *
 * you may not use this file except in compliance with the License.
 */
    private static final Log log = Log.getLog(FolderEditorPropertyTester.class);
 *
    @Override
import org.eclipse.core.expressions.PropertyTester;

 * Licensed under the Apache License, Version 2.0 (the "License");

 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ui.editors.entity;
}        if (!(receiver instanceof FolderEditor)) {
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
        FolderEditor editor = (FolderEditor)receiver;
public class FolderEditorPropertyTester extends PropertyTester
    {
{
 * limitations under the License.
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
        }
 * You may obtain a copy of the License at
 */
                if (expectedValue instanceof Number && ((Number)expectedValue).intValue() == 1 || "1".equals(expectedValue)) {
import org.jkiss.dbeaver.Log;
/*

        return false;
