    }
import org.jkiss.dbeaver.ui.editors.erd.ERDUIConstants;
 * @author Serge Rider

        Dimension currentSize = getSize();
        textFlow.setPreferredSize(size);
 * Figure used to represent a note
        if (currentSize.width >= textPrefSize.width && currentSize.height >= textPrefSize.height) {
        textFlow.setSize(size);
    }
        return textFlow.getText();
    @Override

 * Copyright (C) 2010-2025 DBeaver Corp and others
}    @Override
    public void setPreferredSize(Dimension size) {
            new MarginBorder(5)
 *
            new LineBorder(ERDThemeSettings.instance.linesForeground, ERDUIConstants.DEFAULT_NOTE_BORDER_WIDTH),
        Dimension textPrefSize = textFlow.getPreferredSize(width, h);
 * Licensed under the Apache License, Version 2.0 (the "License");
/**
        //super(note.getObject());
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.erd.ERDNote;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
        super.setPreferredSize(size);

import org.eclipse.draw2d.text.FlowPage;
    }
public class NoteFigure extends FlowPage {
    public NoteFigure(ERDNote note) {

        ));
 */
 */
import org.eclipse.draw2d.text.TextFlow;
import org.eclipse.draw2d.geometry.Dimension;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    public Dimension getPreferredSize(int width, int h) {
 * You may obtain a copy of the License at
/*

/*
 * limitations under the License.
 * you may not use this file except in compliance with the License.


        }
        add(textFlow);
 * Created on Jul 13, 2004
    public TextFlow getTextFlow() {

import org.eclipse.draw2d.CompoundBorder;
import org.eclipse.draw2d.MarginBorder;
    public String getText() {
        return textFlow;
package org.jkiss.dbeaver.ui.editors.erd.figures;
 *
        setBorder(new CompoundBorder(
        setBackgroundColor(ERDThemeSettings.instance.noteBackground);
        // Return current size if it is bigger than text (means it was changed manually)
        setOpaque(true);

        setForegroundColor(ERDThemeSettings.instance.noteForeground);

 * Unless required by applicable law or agreed to in writing, software
 *
    public void setText(String text) {

        return textPrefSize;
        textFlow = new TextFlow(note.getObject());
    }
import org.eclipse.draw2d.LineBorder;

            return currentSize;
 * DBeaver - Universal Database Manager
 */
        textFlow.setText(text);
    private final TextFlow textFlow;
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDThemeSettings;
 * See the License for the specific language governing permissions and
