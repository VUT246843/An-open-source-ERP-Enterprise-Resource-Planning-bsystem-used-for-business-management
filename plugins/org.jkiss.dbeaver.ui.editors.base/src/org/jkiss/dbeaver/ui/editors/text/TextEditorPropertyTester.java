 * you may not use this file except in compliance with the License.
        super();

            case PROP_CAN_COMMENT:
    public static final String PROP_CAN_LOAD = "canLoad";
        switch (property) {
                    editor.getSelectionProvider() == null ||
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
                    editor.getSelectionProvider().getSelection() == null ||
                    return commentsSupport.getMultiLineComments() != null;
                    return false;
                }
    public static final String PROP_CAN_COMMENT = "canComment";
 * DBeaver - Universal Database Manager
        return false;
 * See the License for the specific language governing permissions and
import org.jkiss.utils.ArrayUtils;
 *
 * Unless required by applicable law or agreed to in writing, software
        if (editor == null) {
                if ("single".equals(expectedValue)) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                    return false;
{
        ActionUtils.evaluatePropertyState(NAMESPACE + "." + propName);
                }
            case PROP_CAN_LOAD:
public class TextEditorPropertyTester extends PropertyTester
/*
                return true;

 */
 * limitations under the License.

package org.jkiss.dbeaver.ui.editors.text;
    public static final String PROP_AVAILABLE = "available";
import org.eclipse.core.expressions.PropertyTester;
                    editor.getSelectionProvider().getSelection().isEmpty()) {
 * You may obtain a copy of the License at
        BaseTextEditor editor = BaseTextEditor.getTextEditor((IEditorPart) receiver);
            return false;

        }
/**
                break;
            case PROP_AVAILABLE:
    }
    public static final String NAMESPACE = "org.jkiss.dbeaver.ui.editors.text";
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
                if (editor.isReadOnly() ||
 * Licensed under the Apache License, Version 2.0 (the "License");
    public static final String PROP_CAN_SAVE = "canSave";
    public static void firePropertyChange(String propName)
import org.jkiss.dbeaver.ui.ICommentsSupport;
    @Override
                if (commentsSupport == null) {
                return !editor.isReadOnly();

    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
    }
                } else if ("multi".equals(expectedValue)) {
    }
import org.eclipse.ui.IEditorPart;
                }
}    public TextEditorPropertyTester() {

 *
 *
                ICommentsSupport commentsSupport = editor.getCommentsSupport();
import org.jkiss.dbeaver.ui.ActionUtils;
                    return !ArrayUtils.isEmpty(commentsSupport.getSingleLineComments());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DatabaseEditorPropertyTester
            case PROP_CAN_SAVE:
        }
