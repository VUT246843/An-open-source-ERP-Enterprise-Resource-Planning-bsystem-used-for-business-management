            return -1;
 */
/*
        owner.getController().getModel().updateCellValue(attr, row, newValue);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
    public void setSelection(int offset, int length)
        selection.y = selection.y - selection.x;
    public void setScope(IRegion scope)
        final ResultSetRow row = (ResultSetRow)(recordMode ? cell.col : cell.row);
        Pattern findPattern;
    }
    private Pattern searchPattern;
 *
    @Override
    }
import org.eclipse.jface.text.IRegion;
    public void replaceSelection(String str, boolean regExReplace)
 * Find/Replace target for StyledText

    @Override
                return -1;
            text.setSelection(matcher.start(), matcher.end());
        this.replaceAll = replaceAll;
    }
    @Override
    @Override
        return selection;
    private boolean replaceAll;

 * you may not use this file except in compliance with the License.
    @Override
            findPattern = Pattern.compile(Pattern.quote(findString), caseSensitive ? 0 : Pattern.CASE_INSENSITIVE);
            }
        final DBDAttributeBinding attr = (DBDAttributeBinding)(recordMode ? cell.row : cell.col);
        if (searchPattern != null) {
    }
    public String getSelectionText()
 * DBeaver - Universal Database Manager
            newValue = searchPattern.matcher(oldValue).replaceAll(newValue);

        searchPattern = null;
        owner.getController().updatePanelsContent();
    public void replaceSelection(String text)

    {

    {
        return true;


    @Override
    }
        String searchIn = text.getText();
    @Override
 * Unless required by applicable law or agreed to in writing, software
    public Point getLineSelection()
    }
 *
        int textLength = text.getCharCount();
    public void setReplaceAllMode(boolean replaceAll)
        }
import java.util.regex.Matcher;
            try {

            return matcher.start();
    public int findAndSelect(int offset, String findString, boolean searchForward, boolean caseSensitive, boolean wholeWord, boolean regExSearch)
        }
    private Color scopeHighlightColor;
    public boolean isEditable()
 * Licensed under the Apache License, Version 2.0 (the "License");
        text.setSelection(offset, length);
        return findAndSelect(widgetOffset, findString, searchForward, caseSensitive, wholeWord, false);
        } else {
        }
    @Override
                log.warn("Bad regex pattern: " + findString);
    public void endSession()

    @Override
    @Override
public class StyledTextFindReplaceTarget implements IFindReplaceTarget, IFindReplaceTargetExtension, IFindReplaceTargetExtension3 {
    @Override

    {
    {
import org.eclipse.swt.custom.StyledText;
        }
        }
            offset = 0;
import org.eclipse.jface.text.IFindReplaceTargetExtension3;

    }
        return null;
            return;
        this.scopeHighlightColor = color;
    }

import org.eclipse.swt.graphics.Point;
    }
    {
                findPattern = Pattern.compile(findString, caseSensitive ? 0 : Pattern.CASE_INSENSITIVE);
    @Override
    {
        if (regExSearch) {
/*
    @Override
    {
    private final StyledText text;

import org.jkiss.dbeaver.Log;
import org.eclipse.jface.text.IFindReplaceTargetExtension;
    }
    {

        GridPos selection = (GridPos) owner.getSelection().getFirstElement();
        String newValue = str;
    @Override
    public boolean canPerformFind()
 *     http://www.apache.org/licenses/LICENSE-2.0

package org.jkiss.dbeaver.ui.controls;
    {
    {
        replaceSelection(text, false);
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void beginSession()
 * limitations under the License.
    }
        // fix selection
 * See the License for the specific language governing permissions and
    public StyledTextFindReplaceTarget(StyledText text) {
    {

    {
        return text.getEditable();
    }
        GridCell cell = owner.getSpreadsheet().posToCell(selection);
        if (matcher.find(searchForward ? offset : 0)) {
    }
        if (cell == null) {
        String oldValue = owner.getSpreadsheet().getContentProvider().getCellText(cell.col, cell.row);
    }
*/
 */
    }

 * You may obtain a copy of the License at
        return text.getSelectionText();
        }
    {
            return;

 * Copyright (C) 2010-2025 DBeaver Corp and others
        Point selection = text.getSelection();

        return getSelection();
        if (offset == -1) {
    }
import java.util.regex.Pattern;

}
    @Override
    }
    {
    public int findAndSelect(int widgetOffset, String findString, boolean searchForward, boolean caseSensitive, boolean wholeWord)
    private static final Log log = Log.getLog(StyledTextFindReplaceTarget.class);
        boolean recordMode = owner.getController().isRecordMode();

            } catch (PatternSyntaxException e) {
    @Override
/**
        this.text = text;
import org.eclipse.jface.text.IFindReplaceTarget;
import org.eclipse.swt.graphics.Color;
import java.util.regex.PatternSyntaxException;
 *
        return -1;
    {
    public void setScopeHighlightColor(Color color)

    public Point getSelection()
        if (textLength <= 0 || offset >= textLength) {

    public IRegion getScope()
        if (selection == null) {
        Matcher matcher = findPattern.matcher(searchIn);
    {


