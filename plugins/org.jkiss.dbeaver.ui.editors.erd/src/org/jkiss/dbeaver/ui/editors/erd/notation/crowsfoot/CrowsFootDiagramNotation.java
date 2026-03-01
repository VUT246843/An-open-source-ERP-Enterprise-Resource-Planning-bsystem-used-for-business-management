import org.jkiss.dbeaver.model.DBUtils;

 * you may not use this file except in compliance with the License.
            createSourceDecorator(conn, bckColor, frgColor, ERDAssociationType.ZERO_OR_ONE, LABEL_0_TO_1);
                DBSEntity entity = src.getObject();
                }
            try {
import org.jkiss.utils.CommonUtils;
            // source - 1..n
                /* Clean up whatever needs to be handled before interrupting */
                if (ERDUtils.isOptionalAssociation(association)) {
                        .map(ERDEntityAttribute::getObject)
 *
                if (!CommonUtils.isEmpty(indexes)) {
                        createSourceDecorator(conn, bckColor, frgColor, ERDAssociationType.ONE_OR_MANY, LABEL_1_TO_N);
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.model.erd.ERDAssociation;
    ) {
import org.jkiss.code.NotNull;
        final CrowsFootPolylineDecoration targetDecor = new CrowsFootPolylineDecoration(type);
    @Override
import org.jkiss.dbeaver.DBException;
    }
        conn.add(getLabel(label, frgColor), trgEndpointLocator);
 *
import org.eclipse.draw2d.PolylineConnection;
                Collection<? extends DBSTableIndex> indexes = ((DBSTable) entity).getIndexes(monitor);
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
        @NotNull Color bckColor,
                        .toList();
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndex;
            association.getTargetEntity() instanceof ERDEntity trg) {

        srcEndpointLocator.setUDistance(LBL_U_DISTANCE);
        @NotNull ERDAssociation association,

        ConnectionEndpointLocator trgEndpointLocator = new ConnectionEndpointLocator(conn, true);
        @NotNull PolylineConnection conn,
        @NotNull PolylineConnection conn,

        conn.setLineWidth(1);
                        createSourceDecorator(conn, bckColor, frgColor, ERDAssociationType.ONE_ONLY, LABEL_1);
                    // get index for require source attributes
                }
import org.jkiss.dbeaver.model.erd.ERDEntityAttribute;
    }
import org.eclipse.swt.graphics.Color;
        trgEndpointLocator.setVDistance(LBL_V_DISTANCE);
        } else if (constraintType.isAssociation() &&
            } catch (InterruptedException e) {
        return 30;
package org.jkiss.dbeaver.ui.editors.erd.notation.crowsfoot;
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
 * DBeaver - Universal Database Manager
        CrowsFootPolylineDecoration sourceDecor;
    public void applyNotationForArrows(
                Thread.currentThread().interrupt();
        @NotNull ERDAssociation association,
        targetDecor.setBackgroundColor(bckColor);
 * distributed under the License is distributed on an "AS IS" BASIS,
                    // target - 1
                    } else {
        conn.setTargetDecoration(targetDecor);
                    List<DBSEntityAttribute> attributes = erdSourceAttributes.stream()
    @Override
        ConnectionEndpointLocator srcEndpointLocator = new ConnectionEndpointLocator(conn, false);
 * Unless required by applicable law or agreed to in writing, software
public class CrowsFootDiagramNotation extends ERDNotationBase implements ERDNotation {

                    createTargetDecorator(conn, bckColor, frgColor, ERDAssociationType.ONE_ONLY, LABEL_1);
        conn.setSourceDecoration(sourceDecor);
                log.error(e.getMessage(), e);
        sourceDecor = new CrowsFootPolylineDecoration(type);
 * See the License for the specific language governing permissions and
        }
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
        @NotNull Color bckColor,
                } else {
import java.util.Collection;
import org.jkiss.dbeaver.ui.editors.erd.notations.ERDNotation;
import org.jkiss.dbeaver.model.struct.DBSEntity;
                    }
            } catch (DBException e) {
                    createTargetDecorator(conn, bckColor, frgColor, ERDAssociationType.ZERO_OR_ONE, LABEL_0_TO_1);
        DBSEntityConstraintType constraintType = association.getObject().getConstraintType();
/*
            // source 0..1
import org.eclipse.swt.SWT;
import org.jkiss.dbeaver.model.erd.ERDUtils;
 * limitations under the License.
                } else {
        targetDecor.setFill(true);
import java.util.List;
    ) {
                    List<ERDEntityAttribute> erdSourceAttributes = association.getSourceAttributes();
                    // target - 0..1

        @NotNull DBRProgressMonitor monitor,
                    createSourceDecorator(conn, bckColor, frgColor, ERDAssociationType.ONE_OR_MANY, LABEL_1_TO_N);
    public double getIndentation() {
        trgEndpointLocator.setUDistance(LBL_U_DISTANCE);
 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull Color frgColor
        sourceDecor.setFill(true);
                log.error(e.getMessage(), e);
                    if (DBUtils.isUniqueIndexForAttributes(monitor, attributes, entity)) {
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.ui.editors.erd.notations.ERDAssociationType;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (constraintType == DBSEntityConstraintType.PRIMARY_KEY) {
            association.getSourceEntity() instanceof ERDEntity src &&

import org.jkiss.dbeaver.model.erd.ERDEntity;
import org.jkiss.dbeaver.ui.editors.erd.notations.ERDNotationBase;
 */
    }
    private void createSourceDecorator(PolylineConnection conn, Color bckColor, Color frgColor, ERDAssociationType type, String label) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        srcEndpointLocator.setVDistance(LBL_V_DISTANCE);
}
        conn.add(getLabel(label, frgColor), srcEndpointLocator);
        // nothing
import org.eclipse.draw2d.ConnectionEndpointLocator;
    @Override
            }
    private static final Log log = Log.getLog(CrowsFootDiagramNotation.class);
        @NotNull Color frgColor
    }
        sourceDecor.setBackgroundColor(bckColor);
        conn.setLineStyle(SWT.LINE_CUSTOM);

import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
    public void applyNotationForEntities(

    }
    private void createTargetDecorator(PolylineConnection conn, Color bckColor, Color frgColor, ERDAssociationType type, String label) {
