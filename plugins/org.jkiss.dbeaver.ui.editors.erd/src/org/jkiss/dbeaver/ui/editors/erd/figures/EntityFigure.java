        Color bgColor = getBackgroundColor();
            if (attributeItemFigure.getAttribute().isInPrimaryKey()) {
            lineBorder.setWidth(2);
    private EditableLabel nameLabel;
            }
        boolean changeBorderColors = ERDUIActivator.getDefault().getPreferenceStore().getBoolean(ERDUIConstants.PREF_DIAGRAM_CHANGE_BORDER_COLORS);
        LineBorder lineBorder = (LineBorder) getBorder();
    {
public class EntityFigure extends Figure {
            lineBorder.setWidth(3);
package org.jkiss.dbeaver.ui.editors.erd.figures;

            }
    public List<AttributeItemFigure> getAttributeFigures() {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

        return attributeFigure;
import org.eclipse.swt.graphics.Color;

import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
import org.jkiss.dbeaver.model.struct.DBSEntityType;
            if (descLabel != null) {
            setBackgroundColor(ERDThemeSettings.instance.entityPrimaryBackground);
            }
        layout.horizontalSpacing = 0;

        refreshColors();
 * DBeaver - Universal Database Manager
        } else {
    protected Color getBorderColor() {
    /**
    private AttributeListFigure keyFigure;

import java.util.List;
            }
        //attrExtra.setBorder(new LineBorder(1));
        add(attributeFigure, new GridData(GridData.FILL_BOTH));
        result.addAll(attributeFigure.getAttributes());
        toolTip.setBorder(getBorder());
        return result;
    private final EntityPart part;
            }
    }

        }
import java.util.ArrayList;

    public void setBackgroundColor(Color bg) {
            entity.getObject().getName();
        setLayoutManager(layout);
        }
    }
            Label dsLabel = new Label(dataSource.getName());
        
    }

 *     http://www.apache.org/licenses/LICENSE-2.0
            }
        if (container != null) {

        return toolTip;
 *
        this.part = part;
        return part;
    @NotNull
        }
            attributeItemFigure.setRightPanel(attrExtra);
        }
        } else if (part.getEntity().getObject().getEntityType() == DBSEntityType.ASSOCIATION) {

    public EditableLabel getNameLabel()
        {
        int dsIndex = getPart().getDiagram().getDataSourceIndex(part.getEntity().getDataSource().getContainer());
                return null;//createToolTip();
            if (changeHeaderColors) {

        nameLabel.setBorder(new MarginBorder(3));


import org.jkiss.dbeaver.model.DBPEvaluationContext;
        ERDEntity entity = part.getEntity();
 *
            super.add(figure, constraint, index);
/*
            }

        }
    }
        }
            } else {
import org.jkiss.utils.CommonUtils;
            setBackgroundColor(ERDThemeSettings.instance.entityRegularBackground);
            DBUtils.getObjectFullName(entity.getObject(), DBPEvaluationContext.DDL) :
    // Workaround: attribute figures aren't direct children of entity figure
        String entityName = useFQN ?

            if (dataSourceContainer != null) {
    }
        } else {
import org.eclipse.draw2d.*;
    private void updateTitleForegroundColor() {
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDThemeSettings;
import org.jkiss.dbeaver.ui.editors.erd.ERDColors;
        descLabel = null;
    public EntityPart getPart() {
            descLabel = new Label(entity.getObject().getDescription());

                } else {
                listFigure = attributeFigure;
                attributeFigure.add(attrExtra, new GridData(GridData.HORIZONTAL_ALIGN_END | GridData.VERTICAL_ALIGN_BEGINNING));
        layout.marginHeight = 0;
import org.jkiss.dbeaver.ui.DBeaverIcons;
    // Workaround: attribute figures aren't direct children of entity figure
        boolean useFQN = part.getDiagram().hasAttributeStyle(ERDViewStyle.ENTITY_FQN);
     */
        return nameLabel;
        //layout.setStretchMinorAxis(true);
                    setBackgroundColor(ERDThemeSettings.instance.entityRegularBackground);
            toolTip.add(dsLabel);
        DBSObjectContainer container = DBUtils.getParentOfType(DBSObjectContainer.class, part.getEntity().getObject());
        LineBorder border = new LineBorder(getBorderColor(), ERDUIConstants.DEFAULT_ENTITY_BORDER_WIDTH);
    public AttributeListFigure getColumnsFigure()
 * Figure used to represent a table in the schema
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDViewStyle;
            } else {
     * @return returns the label used to edit the name
            boolean changeHeaderColors = ERDUIActivator.getDefault().getPreferenceStore().getBoolean(ERDUIConstants.PREF_DIAGRAM_CHANGE_HEADER_COLORS);
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIActivator;
                attributeFigure.add(figure, new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING, GridData.VERTICAL_ALIGN_BEGINNING, true, false));
            listFigure.remove(attrFigure);
        result.addAll(keyFigure.getAttributes());
        label.setTextAlignment(PositionConstants.RIGHT);
 * limitations under the License.


        //layout.setHorizontal(false);
    }
     */
        boolean showComments = part.getDiagram().hasAttributeStyle(ERDViewStyle.COMMENTS);
        if (figure instanceof AttributeItemFigure) {
 * See the License for the specific language governing permissions and
        };
                keyFigure.add(figure, new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING, GridData.VERTICAL_ALIGN_BEGINNING, true, false));
     * @return the figure containing the column labels
    {


        }
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (isSelected) {

        return label;
        toolTip.setOpaque(true);
    public void remove(IFigure figure) {
import org.eclipse.swt.graphics.Image;
*/
        {
    public void setSelected(boolean isSelected)
    private Label descLabel;
        //toolTip.setPreferredSize(300, 200);
 *
 * you may not use this file except in compliance with the License.
            add(descLabel, new GridData(GridData.FILL_HORIZONTAL));
        } else {
        List<AttributeItemFigure> result = new ArrayList<>();
    }
        attributeFigure = new AttributeListFigure(entity, false);
 */
        if (descLabel != null) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        DBPDataSourceContainer dataSource = entity.getDataSource().getContainer();
                if (containerIndex == 0) {
    }

            }
            dsLabel.setIcon(DBeaverIcons.getImage(dataSource.getDriver().getIcon()));
        updateTitleForegroundColor();
    /**

                int containerIndex = part.getDiagram().getContainerIndex(dataSourceContainer, container);
                listFigure.remove(attrFigure.getRightPanel());

            public IFigure getToolTip() {
        if (!CommonUtils.isEmpty(entity.getAlias())) {
        } else {
        Figure toolTip = new Figure();
            if (keyFigure.getAttributes().contains(figure)) {

    protected IFigure createRightPanel() {
            if (attrFigure.getRightPanel() != null) {
    private IFigure createToolTip() {
            } else {
    }
    {
    }
import org.jkiss.dbeaver.ui.UIStyles;
            dsLabel.setBorder(new MarginBorder(2));

        layout.verticalSpacing = 0;
 * Licensed under the Apache License, Version 2.0 (the "License");
        toolTip.setLayoutManager(new GridLayout(1, false));

            IFigure attrExtra = createRightPanel();

    {
            } else {
import org.jkiss.code.NotNull;
    }
    public EntityFigure(EntityPart part)
    @Override
        EditableLabel label = new EditableLabel("");
}        }
            AttributeListFigure listFigure;
        layout.verticalSpacing = 0;
        layout.marginWidth = 0;
                descLabel.setForegroundColor(ERDThemeSettings.instance.entityNameForeground);
        if (part.getEntity().isPrimary()) {
        ERDEntity entity = part.getEntity();

            this.revalidate();
            setBackgroundColor(ERDThemeSettings.instance.entityAssociationBackground);
    public AttributeListFigure getKeyFigure() {
            AttributeItemFigure attrFigure = (AttributeItemFigure) figure;
        setOpaque(true);
        if (figure instanceof AttributeItemFigure attributeItemFigure) {
import org.jkiss.dbeaver.ui.editors.erd.ERDUIConstants;
        if (showComments && !CommonUtils.isEmpty(entity.getObject().getDescription())) {

            return ERDThemeSettings.instance.linesForeground;
        }
            nameLabel.setForegroundColor(ERDThemeSettings.instance.entityNameForeground);
    }
            nameLabel.setForegroundColor(UIStyles.getContrastColor(bgColor));
import org.jkiss.dbeaver.ui.editors.erd.part.EntityPart;
            if (descLabel != null) {
    @Override
        if (bgColor == null) {

import org.jkiss.dbeaver.model.DBUtils;
            figure.setForegroundColor(ERDThemeSettings.instance.attrForeground);
 * You may obtain a copy of the License at
            entityName += " " + entity.getAlias();
            Label entityLabel = new Label(DBUtils.getObjectFullName(entity.getObject(), DBPEvaluationContext.UI));
                    setBackgroundColor(ERDColors.getHeaderColor(containerIndex - 1));
    private void changeHeaderColor() {
                listFigure = keyFigure;
            @Override
            entityLabel.setIcon(DBeaverIcons.getImage(entity.getObject().getEntityType().getIcon()));
        setBorder(border);
import org.jkiss.dbeaver.model.erd.ERDEntity;
        } else {
        GridLayout layout = new GridLayout(1, false);
                descLabel.setForegroundColor(UIStyles.getContrastColor(bgColor));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
        setForegroundColor(ERDThemeSettings.instance.entityNameForeground);
                changeHeaderColor();

            toolTip.add(entityLabel);
    @Override

        nameLabel.setIcon(tableImage);
/**
        }
            DBPDataSourceContainer dataSourceContainer = container.getDataSource().getContainer();
    }

 * Unless required by applicable law or agreed to in writing, software
        super.setBackgroundColor(bg);
                keyFigure.add(attrExtra, new GridData(GridData.HORIZONTAL_ALIGN_END | GridData.VERTICAL_ALIGN_BEGINNING));
        return keyFigure;
    private AttributeListFigure attributeFigure;


 * @author Serge Rider
        return ERDColors.getBorderColor(dsIndex - 1);
        } else {
        layout.marginHeight = 0;
            entityLabel.setBorder(new MarginBorder(2));
        add(keyFigure, new GridData(GridData.FILL_HORIZONTAL));
        keyFigure = new AttributeListFigure(entity, true);
            figure.setBackgroundColor(ERDThemeSettings.instance.attrBackground);

        add(nameLabel, new GridData(GridData.FILL_HORIZONTAL));
    }
    public void add(IFigure figure, Object constraint, int index) {
    }
    public void refreshColors() {
 *
        GridLayout layout = new GridLayout(1, false);
                setBackgroundColor(ERDThemeSettings.instance.entityRegularBackground);
        layout.marginWidth = 0;
        }
        Image tableImage = DBeaverIcons.getImage(entity.getObject().getEntityType().getIcon());
 */

        if (dsIndex == 0 || !changeBorderColors) {
/*
                setBackgroundColor(ERDThemeSettings.instance.entityRegularBackground);
            super.remove(figure);
                }


    }
        nameLabel = new EditableLabel(entityName) {
