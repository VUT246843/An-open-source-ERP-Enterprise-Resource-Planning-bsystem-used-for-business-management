 * DBeaver - Universal Database Manager
import org.eclipse.draw2d.geometry.Rectangle;
			graphics.popState();
	 *            true will cause the label to appear selected
		if (selected)

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;

	 */
			graphics.pushState();
			graphics.setBackgroundColor(ERDThemeSettings.instance.attrForeground);
	 */
 * Unless required by applicable law or agreed to in writing, software
	private Rectangle getSelectionRectangle()
	
	{
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	 * @param b
	 * paints figure differently depends on the whether the figure has focus or is selected 
	public void setSelected(boolean b)
/*

 * limitations under the License.
		}
	public EditableLabel(String text)
import org.eclipse.draw2d.Label;
			graphics.setForegroundColor(ERDThemeSettings.instance.diagramBackground);
		translateToParent(bounds);
	}
		return bounds;
 *
	
	{
	{
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDThemeSettings;
		selected = b;
	@Override
/**
 */
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * A customized Label based on the label used in the flow example. 

    public void setText(String s)
	private boolean selected;
 * Primary selection is denoted by highlight and focus rectangle. 
		super.paintFigure(graphics);
}
	
	
		return super.getPreferredSize(wHint, hHint);
 * @author Daniel Lee
package org.jkiss.dbeaver.ui.editors.erd.figures;

 * you may not use this file except in compliance with the License.
	@Override
	/**
	}
		{
 * Created on Jul 13, 2004
/*
 * See the License for the specific language governing permissions and
	 * sets the text of the label
	{
	/**
 *
	public Dimension getPreferredSize(int wHint, int hHint) {
		Rectangle bounds = getTextBounds().getCopy();
	}
			graphics.fillRoundRectangle(getSelectionRectangle(), 3, 3);
public class EditableLabel extends Label
	}
 * Normal selection is denoted by highlight only. Borrowed from the Flow Editor example
	
	 */
 *
    protected void paintFigure(Graphics graphics)
import org.eclipse.draw2d.Graphics;
 */
 * You may obtain a copy of the License at

 */
	@Override
	{
		super(text);
	 * Sets the selection state of this SimpleActivityLabel
	}

		bounds.expand(new Insets(2, 2, 0, 0));
	}
 * Licensed under the Apache License, Version 2.0 (the "License");
	/**
{

		repaint();
		bounds.intersect(getBounds());

		super.setText(s);
	 * 
 * distributed under the License is distributed on an "AS IS" BASIS,
