        if (cursorPosition < contents.length()) {
                    text.setSelection(i, selection.x);
    public SmartTextContentAdapter() {
public class SmartTextContentAdapter extends TextContentAdapter {

/*
        // is not what we wanted, reset the selection.
        if (selection.x == selection.y) {
 *
import org.eclipse.swt.widgets.Text;
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");

                char ch = curValue.charAt(i);
 */
                    break;
                if (!Character.isLetterOrDigit(ch) && contentsUC.indexOf(ch) == -1) {
        }
}
            String contentsUC = contents.toUpperCase();
import org.jkiss.dbeaver.Log;
    }
 * you may not use this file except in compliance with the License.
import org.eclipse.swt.widgets.Control;

 * Unless required by applicable law or agreed to in writing, software
                }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2024 DBeaver Corp and others
        text.insert(contents);
import org.eclipse.swt.graphics.Point;
        Text text = (Text) control;
    @Override

 * See the License for the specific language governing permissions and
                String prefix = curValue.substring(i, selection.x);
    }
                if (contentsUC.startsWith(prefix) && selection.x >= i && selection.x < i + contents.length()) {

 *
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.UIUtils;

            }
 *
    private static final Log log = Log.getLog(UIUtils.class);
        }
        // Insert will leave the cursor at the end of the inserted text. If this
package org.jkiss.dbeaver.ui.contentassist;
            for (int i = selection.x - 1; i >= 0; i--) {
                selection.x + cursorPosition);
    public void insertControlContents(Control control, String contents, int cursorPosition) {
            // Try to replace text under cursor contents starts with
 * You may obtain a copy of the License at

                    // Work break
            text.setSelection(selection.x + cursorPosition,
        Point selection = text.getSelection();
import org.eclipse.jface.fieldassist.TextContentAdapter;
                    break;
        String curValue = text.getText().toUpperCase();

 * DBeaver - Universal Database Manager
                }
