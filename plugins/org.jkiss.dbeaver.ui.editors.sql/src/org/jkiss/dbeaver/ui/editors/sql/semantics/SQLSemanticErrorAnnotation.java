    public int getProblemMarkerSeverity() {
    }
import org.eclipse.swt.SWT;
    @NotNull
import org.eclipse.swt.graphics.Rectangle;
import org.jkiss.dbeaver.model.sql.semantics.SQLQueryRecognitionProblemInfo;
import org.eclipse.swt.graphics.Image;
 * limitations under the License.
    }

 *

 * Copyright (C) 2010-2024 DBeaver Corp and others
    private boolean isMarginMarkerVisible = false;
import org.jkiss.dbeaver.ui.editors.sql.syntax.SQLProblemAnnotation;
    );
    }
    public SQLSemanticErrorAnnotation(@NotNull IMarker marker, @NotNull SQLQueryRecognitionProblemInfo problemInfo) {

        this.problemInfo = problemInfo;

 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.Map;
    public void paint(GC gc, Canvas canvas, Rectangle r) {
    public static final String MARKER_ATTRIBUTE_NAME = "org.jkiss.dbeaver.ui.editors.sql.semantics.semanticProblemAnnotation";
        super(SQLProblemAnnotation.TYPE, marker);

    @SuppressWarnings("deprecation")
    }
        this.image = imageByProblemSeverity.get(problemInfo.getSeverity());
/*
 *
 * You may obtain a copy of the License at

import org.eclipse.jface.text.source.ImageUtilities;
import org.jkiss.utils.CommonUtils;
        if (this.underlyingErrorMessage == null) {
import org.jkiss.dbeaver.ui.DBeaverIcons;
    public static final String MARKER_TYPE = "org.jkiss.dbeaver.ui.editors.sql.semanticProblemMarker";
    }

 * Unless required by applicable law or agreed to in writing, software
        }
import org.jkiss.code.NotNull;
    private static final Map<SQLQueryRecognitionProblemInfo.Severity, Image> imageByProblemSeverity = Map.of(
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Canvas;

import org.jkiss.dbeaver.model.DBIcon;
public class SQLSemanticErrorAnnotation extends MarkerAnnotation implements IAnnotationPresentation {
    }
        }
import org.eclipse.ui.texteditor.MarkerAnnotation;


    @NotNull
        if (this.isMarginMarkerVisible) {
        return this.problemInfo;
import org.eclipse.core.resources.IMarker;

            this.underlyingErrorMessage = CommonUtils.notNull(this.problemInfo.getExceptionMessage(), "");
    private final Image image;


        return this.getProblemInfo().getSeverity().markerSeverity;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.jface.text.source.IAnnotationPresentation;
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.isMarginMarkerVisible = rendered;
 *
    private final SQLQueryRecognitionProblemInfo problemInfo;
        SQLQueryRecognitionProblemInfo.Severity.WARNING, DBeaverIcons.getImage(DBIcon.TINY_WARNING)
    private String underlyingErrorMessage = null;
        return this.underlyingErrorMessage;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public SQLQueryRecognitionProblemInfo getProblemInfo() {
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ui.editors.sql.semantics;
            ImageUtilities.drawImage(this.image, gc, canvas, r, SWT.CENTER, SWT.TOP);

}
 * See the License for the specific language governing permissions and
    public String getUnderlyingErrorMessage() {
 */
 * DBeaver - Universal Database Manager
    @NotNull
        SQLQueryRecognitionProblemInfo.Severity.ERROR, DBeaverIcons.getImage(DBIcon.TINY_ERROR),
    @Override
    @NotNull
    public void setMarginMarkerVisible(boolean rendered) {
