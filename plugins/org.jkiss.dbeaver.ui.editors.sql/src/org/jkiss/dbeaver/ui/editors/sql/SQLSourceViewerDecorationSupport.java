            SpellingAnnotation.TYPE,
import org.eclipse.jface.preference.IPreferenceStore;
    private AnnotationPainter annotationPainter;
import org.eclipse.swt.widgets.Display;
        setSpellingAnnotationsStyle();
        // Set spelling annotation color to shadow
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.dbeaver.ui.UIStyles;
    public void install(IPreferenceStore store) {

        super.install(store);
 * Copyright (C) 2010-2024 DBeaver Corp and others
/*

 */
}
        annotationPainter.setAnnotationTypeColor(
import org.eclipse.ui.texteditor.SourceViewerDecorationSupport;
    protected AnnotationPainter createAnnotationPainter() {
        ISharedTextColors sharedTextColors
 *
    }

        setSpellingAnnotationsStyle();
    ) {
        return annotationPainter;
        IAnnotationAccess annotationAccess,
    }
        super(sourceViewer, overviewRuler, annotationAccess, sharedTextColors);
            Display.getDefault().getSystemColor(UIStyles.isDarkTheme() ?
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
    @Override
    private void setSpellingAnnotationsStyle() {
        ISourceViewer sourceViewer,

        IOverviewRuler overviewRuler,
    public SQLSourceViewerDecorationSupport(
 * distributed under the License is distributed on an "AS IS" BASIS,
    }


                SWT.COLOR_WIDGET_NORMAL_SHADOW));
import org.eclipse.swt.SWT;
 *
package org.jkiss.dbeaver.ui.editors.sql;

                SWT.COLOR_WIDGET_LIGHT_SHADOW :

    }
import org.eclipse.jface.text.source.*;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class SQLSourceViewerDecorationSupport extends SourceViewerDecorationSupport {
import org.eclipse.ui.texteditor.spelling.SpellingAnnotation;
 *
        annotationPainter = super.createAnnotationPainter();
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
