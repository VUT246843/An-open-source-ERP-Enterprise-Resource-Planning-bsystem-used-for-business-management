 * limitations under the License.
    @Override

    }
import org.jkiss.dbeaver.ui.editors.erd.part.AssociationPart.CircleDecoration;
            } else {
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.SWT;
 * Unless required by applicable law or agreed to in writing, software
            conn.setSourceDecoration(sourceDecor);
    ) {
 * you may not use this file except in compliance with the License.
        }

        @NotNull Color frgColor
            final CircleDecoration sourceDecor = new CircleDecoration();
import org.jkiss.code.NotNull;
            association.getSourceEntity() instanceof ERDEntity &&
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
            if (defConnectionRouter.supportedAttributeAssociation()) {
 * See the License for the specific language governing permissions and
        if (constraintType == DBSEntityConstraintType.INHERITANCE) {
    }
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
        return 20;
 *
        boolean identifying = ERDUtils.isIdentifyingAssociation(association);
        @NotNull Color bckColor,
import org.jkiss.dbeaver.ui.editors.erd.notations.ERDNotation;
        @NotNull ERDAssociation association,
    public void applyNotationForArrows(
        @NotNull PolylineConnection conn,
        @NotNull ERDAssociation association,
                conn.setLineStyle(SWT.LINE_DOT);
                final RhombusDecoration targetDecor = new RhombusDecoration();
        @NotNull Color frgColor
                conn.setLineStyle(SWT.LINE_CUSTOM);
            srcDec.setBackgroundColor(bckColor);
import org.jkiss.dbeaver.ui.editors.erd.router.ERDConnectionRouterRegistry;
            sourceDecor.setBackgroundColor(frgColor);
import org.jkiss.dbeaver.model.erd.ERDUtils;
                conn.setTargetDecoration(targetDecor);
        conn.setLineWidth(1);

        // nothing
import org.jkiss.dbeaver.ui.editors.erd.part.AssociationPart.RhombusDecoration;
 * You may obtain a copy of the License at
            srcDec.setFill(true);
            final PolygonDecoration srcDec = new PolygonDecoration();
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
            ERDConnectionRouterDescriptor defConnectionRouter = ERDConnectionRouterRegistry.getInstance().getActiveRouter();
        @NotNull DBRProgressMonitor monitor,
    @Override
    public double getIndentation() {
 */
 * Copyright (C) 2010-2025 DBeaver Corp and others
            conn.setLineDash(constraintType.isLogical() ? new float[] { 4 } : new float[] { 5 });
                targetDecor.setBackgroundColor(bckColor);
import org.jkiss.dbeaver.model.erd.ERDEntity;
/*
    ) {

package org.jkiss.dbeaver.ui.editors.erd.notation.idef1x;
    }
 *
        DBSEntityConstraintType constraintType = association.getObject().getConstraintType();

            srcDec.setTemplate(PolygonDecoration.TRIANGLE_TIP);
 *
        @NotNull Color bckColor,
public class IDEF1XDiagramNotation extends ERDNotationBase implements ERDNotation {
            }
    public void applyNotationForEntities(
 * DBeaver - Universal Database Manager
            sourceDecor.setRadius(CIRCLE_RADIUS);
            sourceDecor.setFill(true);
        if (!identifying || constraintType.isLogical()) {
import org.eclipse.draw2d.PolygonDecoration;
    @Override
            if (ERDUtils.isOptionalAssociation(association)) {
import org.jkiss.dbeaver.ui.editors.erd.notations.ERDNotationBase;
        @NotNull PolylineConnection conn,
            association.getTargetEntity() instanceof ERDEntity) {
import org.eclipse.draw2d.PolylineConnection;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            conn.setTargetDecoration(srcDec);
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
        } else if (constraintType.isAssociation() &&
import org.jkiss.dbeaver.model.erd.ERDAssociation;
import org.jkiss.dbeaver.ui.editors.erd.router.ERDConnectionRouterDescriptor;
