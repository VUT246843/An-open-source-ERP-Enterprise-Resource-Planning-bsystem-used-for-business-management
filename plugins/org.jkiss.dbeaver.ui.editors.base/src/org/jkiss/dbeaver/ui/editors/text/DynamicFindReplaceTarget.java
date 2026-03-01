        IFindReplaceTarget t = getTarget();
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (t instanceof IFindReplaceTargetExtension) {

            return ((IFindReplaceTargetExtension) t).getScope();
            ((IFindReplaceTargetExtension) t).setScopeHighlightColor(color);
            return ((IFindReplaceTargetExtension) t).getLineSelection();
        IFindReplaceTarget t = getTarget();
 * Unless required by applicable law or agreed to in writing, software
        }
import org.eclipse.swt.graphics.Color;
    public int findAndSelect(int offset, String findString, boolean searchForward, boolean caseSensitive, boolean wholeWord, boolean regExSearch)
        if (t instanceof IFindReplaceTargetExtension3) {
        IFindReplaceTarget t = getTarget();
    public void setReplaceAllMode(boolean replaceAll)
    @Override
    {
    {
    }
import org.eclipse.swt.graphics.Point;
    public boolean canPerformFind()

 *

    }
        return t == null ? -1 : t.findAndSelect(widgetOffset, findString, searchForward, caseSensitive, wholeWord);
 *
    public int findAndSelect(int widgetOffset, String findString, boolean searchForward, boolean caseSensitive, boolean wholeWord)
        return findAndSelect(offset, findString, searchForward, caseSensitive, wholeWord);

    {
        IFindReplaceTarget t = getTarget();
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
    }
    {
        IFindReplaceTarget t = getTarget();
    public String getSelectionText()
public class DynamicFindReplaceTarget implements IFindReplaceTarget, IFindReplaceTargetExtension, IFindReplaceTargetExtension3 {

    }
        IFindReplaceTarget t = getTarget();
        if (t instanceof IFindReplaceTargetExtension) {
    public IFindReplaceTarget getTarget()
    public void replaceSelection(String text)
    public void setScope(IRegion scope)
            ((IFindReplaceTargetExtension) t).beginSession();
 * limitations under the License.
import org.eclipse.jface.text.IRegion;
        if (t instanceof IFindReplaceTargetExtension) {
    @Override

    @Override
    public void replaceSelection(String text, boolean regExReplace)
        if (t instanceof IFindReplaceTargetExtension) {

        return t == null ? "" : t.getSelectionText();
    public IRegion getScope()
 * DBeaver - Universal Database Manager

        if (t != null) {
    }
        }
    @Override
    @Override


    {
    @Override
            ((IFindReplaceTargetExtension) t).endSession();
    {


    }
import org.eclipse.jface.text.IFindReplaceTarget;
import org.eclipse.jface.text.IFindReplaceTargetExtension3;
    {
    }
    @Override
    {
    }
 */
        IFindReplaceTarget t = getTarget();
        }
    {
    }
/**
    public void beginSession()
    }
        IFindReplaceTarget t = getTarget();
        return t != null && t.canPerformFind();
    public boolean isEditable()
    {
            t.replaceSelection(text);

    {
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
package org.jkiss.dbeaver.ui.editors.text;
 */
        if (t instanceof IFindReplaceTargetExtension3) {
            ((IFindReplaceTargetExtension3) t).replaceSelection(text, regExReplace);
        if (t instanceof IFindReplaceTargetExtension) {
        this.target = target;
    @Override

    {
    {
 * you may not use this file except in compliance with the License.
    @Override
    @Override
    }
/*
        }
    public void setTarget(IFindReplaceTarget target)
        }
    @Override
    public Point getSelection()
        }
    }
    }
        IFindReplaceTarget t = getTarget();
        IFindReplaceTarget t = getTarget();
        return t == null ? new Point(0, 0) : t.getSelection();
        }
        return t != null && t.isEditable();
    @Override
        IFindReplaceTarget t = getTarget();
 * Composite find/replace target
    {


        IFindReplaceTarget t = getTarget();
    {
        }
        IFindReplaceTarget t = getTarget();
    private IFindReplaceTarget target;
    }

            ((IFindReplaceTargetExtension) t).setSelection(offset, length);

        if (t instanceof IFindReplaceTargetExtension) {
}
        return null;
    }
        if (t instanceof IFindReplaceTargetExtension) {

    public DynamicFindReplaceTarget()
    @Override
        return target;
    {
        IFindReplaceTarget t = getTarget();
    public void setSelection(int offset, int length)
 * Copyright (C) 2010-2026 DBeaver Corp and others

            ((IFindReplaceTargetExtension) t).setReplaceAllMode(replaceAll);
    }
    public Point getLineSelection()
        }

    }
        return getSelection();
    {
    @Override
    @Override
        }
            return ((IFindReplaceTargetExtension3) t).findAndSelect(offset, findString, searchForward, caseSensitive, wholeWord, regExSearch);
 *
    {
        IFindReplaceTarget t = getTarget();
    public void endSession()
    }
import org.eclipse.jface.text.IFindReplaceTargetExtension;
    public void setScopeHighlightColor(Color color)
 *     http://www.apache.org/licenses/LICENSE-2.0
        IFindReplaceTarget t = getTarget();

            ((IFindReplaceTargetExtension) t).setScope(scope);
    {
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        if (t instanceof IFindReplaceTargetExtension) {
