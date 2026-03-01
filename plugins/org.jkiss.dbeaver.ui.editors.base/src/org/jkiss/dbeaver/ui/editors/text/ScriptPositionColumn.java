    @Override
    public ScriptPositionColumn()
}
 * Script position ruler contribution.
import org.eclipse.swt.graphics.GC;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.ui.progress.UIJob;

    public void setEditor(ITextEditor editor)
            int lineHeight= textWidget.getLineHeight(textWidget.getOffsetAtLine(line));

    }
/*
    private ITextEditor editor;
            gc.fillRectangle(0, linePixel, getWidth(), lineHeight);
    public static final String ID = "org.jkiss.dbeaver.ui.editors.columns.script.position"; //$NON-NLS-1$
    public RulerColumnDescriptor getDescriptor()
    {
    {
    {
    {

        StyledText textWidget = textViewer.getTextWidget();
        gc.setBackground(computeBackground(modelLine));
    }
        this.descriptor = descriptor;
import org.eclipse.jface.text.source.AbstractRulerColumn;
        return descriptor;
                    schedule(200);
        for (int line= firstLine; line < lastLine; line++) {
 * Unless required by applicable law or agreed to in writing, software
*/
    private RulerColumnDescriptor descriptor;
import org.jkiss.utils.ArrayUtils;
    }
import org.eclipse.ui.texteditor.rulers.IContributedRulerColumn;

 * distributed under the License is distributed on an "AS IS" BASIS,
    private volatile boolean visible = false;
                        redraw();
        visible = true;
                    return Status.CANCEL_STATUS;
    }
 *
    {
    }



            {
        final int lastLine= firstLine + lines.getNumberOfLines();
        ITextViewer textViewer = getParentRuler().getTextViewer();
 * You may obtain a copy of the License at
                if (editor == null || editor.getTextViewer() == null) return Status.CANCEL_STATUS;
        if (ArrayUtils.contains(currentLines, modelLine)) {

    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
                }
import org.eclipse.ui.texteditor.ITextEditor;
import org.jkiss.dbeaver.runtime.DBWorkbench;
/**

    }
                    if (!Arrays.equals(newCurrentLines, currentLines)) {
                    }
                        currentLines = newCurrentLines;
                if (visible) {
package org.jkiss.dbeaver.ui.editors.text;
 * you may not use this file except in compliance with the License.

import org.eclipse.ui.texteditor.rulers.RulerColumnDescriptor;
    private int[] currentLines;
        visible = false;
            public IStatus runInUIThread(IProgressMonitor monitor)
 *
 *
 * See the License for the specific language governing permissions and
        final int firstLine= lines.getStartLine();
 * limitations under the License.
import org.jkiss.dbeaver.ui.UIIcon;
            gc.drawImage(DBeaverIcons.getImage(UIIcon.RULER_POSITION), 0, linePixel);
public class ScriptPositionColumn extends AbstractRulerColumn implements IContributedRulerColumn {
import org.eclipse.swt.custom.StyledText;
    @Override
import org.eclipse.core.runtime.Status;
//        setHover(new SQLAnnotationHover());
                StyledText textWidget = editor.getTextViewer().getTextWidget();

import org.eclipse.core.runtime.IProgressMonitor;
            }
    }
                    int[] newCurrentLines = editor.getCurrentLines();
            int modelLine= JFaceTextUtil.widgetLine2ModelLine(textViewer, line);

        return editor;
    protected void paintLine(GC gc, int modelLine, int widgetLine, int linePixel, int lineHeight) {
                }
        }
    protected void paint(GC gc, ILineRange lines)
                setSystem(true);
    {
                if (textWidget.isVisible()) {
                if (textWidget == null || textWidget.isDisposed()) return Status.CANCEL_STATUS;
    public ITextEditor getEditor()
 */

            @Override

 * DBeaver - Universal Database Manager
                return Status.OK_STATUS;
        new UIJob("Update script ruler") {
            {

import org.eclipse.core.runtime.IStatus;
                if (DBWorkbench.getPlatform().isShuttingDown()) {
    @Override
            if (modelLine == -1)
        }.schedule(200);
                BaseTextEditor editor = (BaseTextEditor)getEditor();
    {
 */

    public void setDescriptor(RulerColumnDescriptor descriptor)
            gc.setBackground(computeBackground(modelLine));
import java.util.Arrays;
            }

            }
                continue;
            int linePixel= textWidget.getLinePixel(line);
    public void columnCreated()
            if (ArrayUtils.contains(currentLines, modelLine)) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                }
        this.editor = editor;
                gc.drawImage(DBeaverIcons.getImage(UIIcon.RULER_POSITION), 0, linePixel);
    @Override
import org.jkiss.dbeaver.ui.DBeaverIcons;
    @Override
    }
    }
        gc.fillRectangle(0, linePixel, getWidth(), lineHeight);
    @Override
    public void columnRemoved()
        }
