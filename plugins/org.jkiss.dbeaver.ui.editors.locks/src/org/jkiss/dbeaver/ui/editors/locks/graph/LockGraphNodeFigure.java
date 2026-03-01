 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	}
	}
 * Licensed under the Apache License, Version 2.0 (the "License");

 * Unless required by applicable law or agreed to in writing, software


		return this.label;
		this.label.setText(title); //$NON-NLS-1$		
		Rectangle r = getBounds().getCopy();
		getLabel().invalidate();
		setConstraint(getRectangleFigure(), new Rectangle(0, 0, r.width,r.height));
		setLayoutManager(new XYLayout());
		add(this.rectangleFigure);
		this.rectangleFigure = new RectangleFigure();
public class LockGraphNodeFigure extends Figure {
		return this.rectangleFigure;
	public LockGraphNodeFigure(String  title,boolean selected) {
}
 * limitations under the License.
		setConstraint(getLabel(), new Rectangle(0, 0, r.width, r.height));
	private Label label;
		this.rectangleFigure.setBackgroundColor(selected ? ColorConstants.orange : ColorConstants.lightGray);

 *
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.eclipse.draw2d.geometry.Rectangle;

package org.jkiss.dbeaver.ui.editors.locks.graph;
 *
/*
	public void paintFigure(Graphics g) {
 * distributed under the License is distributed on an "AS IS" BASIS,
		getRectangleFigure().invalidate();
	private RectangleFigure rectangleFigure;
 */
import org.eclipse.draw2d.*;
	public RectangleFigure getRectangleFigure() {
	public Label getLabel() {
 * you may not use this file except in compliance with the License.
	@Override
		add(this.label);



	}
		this.label = new Label();
 *
 * You may obtain a copy of the License at
	}
