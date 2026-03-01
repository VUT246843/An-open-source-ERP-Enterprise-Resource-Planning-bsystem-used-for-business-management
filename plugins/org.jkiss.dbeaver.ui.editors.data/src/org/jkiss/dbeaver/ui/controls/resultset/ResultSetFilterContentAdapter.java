 * Copyright (C) 2010-2024 DBeaver Corp and others

 *
        }
}
 * limitations under the License.
import org.eclipse.swt.custom.StyledText;
        int wordStartingPosition = -1;
            text.setSelection(text.getSelection().x + contents.length());
 * See the License for the specific language governing permissions and
 *
            String contentsUC = contents.toUpperCase().trim();
 * you may not use this file except in compliance with the License.
    }
import org.jkiss.dbeaver.model.DBUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
 */
        text.insert(contents);
                    break;
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ui.controls.resultset;
        this.viewer = viewer;
                if (!Character.isLetterOrDigit(ch) && contentsUC.indexOf(ch) == -1) {
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
            for (int i = selection.x - 1; i >= 0; i--) {
                }
            if (dataSource != null) {
 * You may obtain a copy of the License at
public class ResultSetFilterContentAdapter extends StyledTextContentAdapter {


import org.jkiss.dbeaver.model.DBPDataSource;
                if (contentsUC.startsWith(prefix)) {
                    // Work break
                contentsUC = DBUtils.getUnQuotedIdentifier(dataSource, contentsUC);
        if (selection.x == selection.y) {
        if (wordStartingPosition != -1) {
                        wordStartingPosition = i;
            text.setSelection(wordStartingPosition + contents.length(), wordStartingPosition + contents.length());
    }
    private final ResultSetViewer viewer;
            }
                    }

 * DBeaver - Universal Database Manager
            }
                char ch = Character.toUpperCase(curValue.charAt(i));
                }
        String curValue = text.getText().toUpperCase();
                String prefix = curValue.substring(i, selection.x);

                    if (i == 0 || !Character.isJavaIdentifierPart(curValue.charAt(i - 1))) {
    @Override

 *     http://www.apache.org/licenses/LICENSE-2.0

            // Try to replace text under cursor contents starts with
        } else {
        // Always insert the cursor at the end of inserted text
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Control;
            DBPDataSource dataSource = viewer.getDataSource();
        StyledText text = (StyledText) control;
 *
        Point selection = text.getSelection();
                        text.setSelection(i, selection.x);
    public ResultSetFilterContentAdapter(ResultSetViewer viewer) {
import org.jkiss.dbeaver.ui.contentassist.StyledTextContentAdapter;
    public void insertControlContents(Control control, String contents, int cursorPosition) {

                        break;
        }
