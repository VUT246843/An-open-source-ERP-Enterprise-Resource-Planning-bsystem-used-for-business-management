    public boolean isMatchedChar(char ch) {
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;
        return super.isMatchedChar(ch);
            return false;
        super(chars, partitioning);
    }
    }
    private final SQLEditorBase editor;


 * you may not use this file except in compliance with the License.
public class SQLCharacterPairMatcher extends DefaultCharacterPairMatcher {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        super(chars, partitioning, caretEitherSideOfBracket);
 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (editor.isBlockSelectionModeEnabled()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
/*

    public SQLCharacterPairMatcher(SQLEditorBase editor, char[] chars, String partitioning) {
import org.eclipse.jface.text.source.DefaultCharacterPairMatcher;

        }
 *
    @Override
}
 */
    }
package org.jkiss.dbeaver.ui.editors.sql.syntax;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
    public SQLCharacterPairMatcher(SQLEditorBase editor, char[] chars, String partitioning, boolean caretEitherSideOfBracket) {
        this.editor = editor;
 *
 *
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at


        this.editor = editor;
