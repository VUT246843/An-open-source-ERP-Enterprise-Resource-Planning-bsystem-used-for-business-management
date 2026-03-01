import org.eclipse.swt.graphics.Font;
        }
                    part.getDiagramPart().getViewer().getEditDomain().getCommandStack().execute(
            }
    }
import org.jkiss.dbeaver.model.DBPImage;
import org.jkiss.dbeaver.ui.editors.erd.model.EntityDiagram;
/**
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.graphics.Color;
        return part.getAttribute();


 * @author Serge Rider
        Font columnFont = diagramPart.getNormalFont();
 *

 *
        }
import org.eclipse.draw2d.GridLayout;
                }
            return super.getBounds().getCopy()
import org.jkiss.code.Nullable;
 *

        if (decorator.supportsAttributeStyle(ERDViewStyle.ICONS) && diagram.hasAttributeStyle(ERDViewStyle.ICONS)) {

{
                .setWidth(bounds.width - insets.left - insets.right);
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDViewStyle;


        }
    }
                rightText = part.getAttribute().getObject().getFullTypeName();
	}
        return rightPanel;
 * you may not use this file except in compliance with the License.
        layout.verticalSpacing = 0;

        return (CustomCheckBoxFigure) getChildren().get(0);
        if (diagram.hasAttributeStyle(ERDViewStyle.ICONS)) {
        if (showCheckboxes) {
import org.eclipse.draw2d.geometry.Insets;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    public IFigure getRightPanel() {
            DBPImage labelImage = part.getAttribute().getLabelImage();
        if (rightPanel instanceof Label) {
        return (EditableLabel) children.get(children.size() == 1 ? 0 : 1);
    public EditableLabel getLabel() {
}

        }
    private IFigure rightPanel;
            // descending direction between them would be 'east', not 'south', since that's what .gef thinks.


            CustomCheckBoxFigure attrCheckbox = new CustomCheckBoxFigure();
            final Insets insets = parent.getBorder().getInsets(this);
                attrNameLabel.setIcon(DBeaverIcons.getImage(labelImage));
        ERDEntityAttribute attribute = part.getAttribute();
import org.jkiss.dbeaver.ui.editors.erd.part.DiagramPart;
    public void updateLabels() {
        }
        if (part.getAttribute().isInPrimaryKey()) {
import org.jkiss.code.NotNull;
            attrCheckbox.addChangeListener(changeEvent -> {
        layout.horizontalSpacing = 3;
import org.jkiss.dbeaver.ui.DBeaverIcons;
        EntityDiagram diagram = part.getDiagramPart().getDiagram();
	    if (getChildren().size() < 2) {
        GridLayout layout = new GridLayout(3, false);

        if (parent != null && parent.getBorder() != null) {
	{
            add(attrCheckbox);


        this.rightPanel = attrExtra;
        getLabel().setText(part.getAttributeLabel());
        layout.marginWidth = 5;
    }
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.IFigure;
                boolean newChecked = attrCheckbox.isSelected();
        }
                }
            if (labelImage != null) {
    public CustomCheckBoxFigure getCheckBox() {
        EditableLabel attrNameLabel = new EditableLabel(part.getAttributeLabel());

                .setX(bounds.x + insets.left)
    @Override
import org.eclipse.draw2d.Figure;
package org.jkiss.dbeaver.ui.editors.erd.figures;
    protected final AttributePart part;
                            part.createAttributeCheckCommand(newChecked)
    public AttributeItemFigure(AttributePart part)
                    rightText += " NOT NULL";

            columnFont = diagramPart.getBoldFont();
    public ERDEntityAttribute getAttribute() {
    }
            }
    }
/*
        return super.getBounds();
        setLayoutManager(layout);
        boolean showCheckboxes = diagram.getDecorator().showCheckboxes();
        List children = getChildren();
                if (oldChecked != newChecked) {
import org.jkiss.dbeaver.model.erd.ERDEntityAttribute;
    void setRightPanel(IFigure attrExtra) {
        attrNameLabel.setForegroundColor(columnColor);
        final IFigure parent = getParent();
        super();
            }
        add(attrNameLabel);
            if (decorator.supportsAttributeStyle(ERDViewStyle.TYPES) && diagram.hasAttributeStyle(ERDViewStyle.TYPES)) {
            // If there's two attributes whose names have different length (e.g. 'id' and 'description'),
                boolean oldChecked = attribute.isChecked();
    @Nullable
            }
                if (part.getAttribute().getObject().isRequired()) {
 * You may obtain a copy of the License at
	        return null;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * See the License for the specific language governing permissions and
        DiagramPart diagramPart = part.getDiagramPart();
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDThemeSettings;
        //return part.getDiagramPart().getContentPane().getForegroundColor();
 */
        Color columnColor = getColumnForegroundColor();
            // See org.eclipse.gef.ui.parts.GraphicalViewerKeyHandler.getNavigationPoint
            rightPanel.setFont(columnFont);
            DBPImage labelImage = attribute.getLabelImage();
        final EntityDiagram diagram = part.getDiagram();
        this.part = part;
 */
                getLabel().setIcon(DBeaverIcons.getImage(labelImage));
        attrNameLabel.setFont(columnFont);


 * limitations under the License.
    }
    @NotNull
            attrCheckbox.setSelected(attribute.isChecked());
 *     http://www.apache.org/licenses/LICENSE-2.0
            });
import org.eclipse.draw2d.geometry.Rectangle;
                    );
        }
 * DBeaver - Universal Database Manager
    }
        return ERDThemeSettings.instance.attrForeground;

            // Extend bounds to the parent's width. This is required for navigation to work correctly:
        layout.marginHeight = 2;
public class AttributeItemFigure extends Figure
 * distributed under the License is distributed on an "AS IS" BASIS,

    }
            ((Label)rightPanel).setText(rightText);
import java.util.List;
            final Rectangle bounds = parent.getBounds();
 * Figure used to hold the column labels
        final ERDDecorator decorator = diagram.getDecorator();
    protected Color getColumnForegroundColor() {
            if (labelImage != null) {
            if (decorator.supportsAttributeStyle(ERDViewStyle.NULLABILITY) && diagram.hasAttributeStyle(ERDViewStyle.NULLABILITY)) {
    public Rectangle getBounds() {
import org.jkiss.dbeaver.ui.editors.erd.part.AttributePart;
            String rightText = "";
        if (rightPanel != null) {

            rightPanel.setForegroundColor(columnColor);
import org.jkiss.dbeaver.ui.editors.erd.model.ERDDecorator;
