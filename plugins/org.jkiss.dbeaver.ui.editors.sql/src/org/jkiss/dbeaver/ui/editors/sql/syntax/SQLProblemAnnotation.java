import org.eclipse.swt.widgets.Canvas;
/*
 */
import org.jkiss.dbeaver.model.DBIcon;
    @Override
import org.jkiss.dbeaver.ui.DBeaverIcons;
import org.eclipse.jface.text.source.IAnnotationPresentation;
import org.eclipse.jface.text.source.ImageUtilities;

    }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.SWT;
import org.jkiss.code.NotNull;
 * Copyright (C) 2010-2024 DBeaver Corp and others

public class SQLProblemAnnotation extends MarkerAnnotation implements IAnnotationPresentation {
import org.eclipse.core.resources.IMarker;
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
}
 * DBeaver - Universal Database Manager
 *
 *
 *
        super(TYPE, marker);
 * Unless required by applicable law or agreed to in writing, software

    public static final String MARKER_TYPE = "org.jkiss.dbeaver.ui.editors.sql.databaseScriptProblemMarker";
    public SQLProblemAnnotation(@NotNull IMarker marker) {
 * limitations under the License.
import org.eclipse.ui.texteditor.MarkerAnnotation;

        ImageUtilities.drawImage(DBeaverIcons.getImage(DBIcon.TINY_ERROR), gc, canvas, r, SWT.CENTER, SWT.TOP);

import org.eclipse.swt.graphics.Rectangle;
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ui.editors.sql.syntax;
import org.eclipse.swt.graphics.GC;
    @SuppressWarnings("deprecation")
    public void paint(GC gc, Canvas canvas, Rectangle r) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    public static final String TYPE = "org.eclipse.ui.workbench.texteditor.error";
 * You may obtain a copy of the License at
