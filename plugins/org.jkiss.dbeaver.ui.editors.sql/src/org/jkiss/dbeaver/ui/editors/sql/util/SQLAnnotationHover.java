    @Override
        public LinkListInformationControl(@Nullable Shell parentShell) {
    public boolean canHandleMouseCursor() {
            List<AnnotationsInformationView.AnnotationsGroupInfo> annotationsGroups = linkGroupsByMessage.values().stream()
            log.debug(e);
            //replaced by IInformationControlExtension2#setInput(java.lang.Object)
        public IInformationControlCreator getInformationPresenterControlCreator() {
import org.jkiss.dbeaver.Log;
        @Override
                        anchorLine = editor.getDocument().getLineOfOffset(hoverRegion.getOffset());
            StringBuilder sb = new StringBuilder();
                int lastAnnotationOffset = lastAnnotationPos.getOffset() + lastAnnotationPos.getLength();
 * limitations under the License.
import java.util.*;
            }
            super.setVisible(visible);
        @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return new LineRange(lineNumber, 1);

    private SQLEditorBase editor;
        @Override
            return true;
            this.infoView = new AnnotationsInformationView(this, editor);
                        log.debug("Error obtaining anchor line of hover region offset " + hoverRegion.getOffset(), e);
    public Object getHoverInfo2(
        if (!(textViewer instanceof ISourceViewer)) {
        Interval hoverInterval = new Interval(offset, offset);
 * DBeaver - Universal Database Manager
        }
        @NotNull ITextViewer textViewer,
        IAnnotationModel annotationModel = ((ISourceViewer) textViewer).getAnnotationModel();
    public IInformationControlCreator getHoverControlCreator() {
                this.infoView.show();
            for (Iterator<Annotation> ai = annotationModel.getAnnotationIterator(); ai.hasNext(); ) {
        public Point computeSizeHint() {
        @Override
        }
        return true;
    private static final Log log = Log.getLog(SQLAnnotationHover.class);
                .sorted(Comparator.comparing(g -> g.getFirstPosition().getOffset()))
            return null;
        this.editor = (SQLEditorBase) editor;
                        linkGroupsByMessage.computeIfAbsent(anno.getText(), AnnotationsInformationView.AnnotationsGroupInfo::new).add(anno, annoPosition);
import org.eclipse.ui.texteditor.spelling.SpellingAnnotation;
            return LinkListInformationControl::new;
                    Position annoPosition = sourceViewer.getAnnotationModel().getPosition(anno);
                }
        for (Iterator<Annotation> ai = annotationModel.getAnnotationIterator(); ai.hasNext(); ) {
        }
        return this.getAnnotationsHoverInfo(textViewer, hoverRegion, null, false);
 */
        } else {

                        if (annoPosition.overlapsWith(linePosition, lineLength)) {
 *
        Map<String, AnnotationsInformationView.AnnotationsGroupInfo> linkGroupsByMessage = new HashMap<>();
    private class LinkListInformationControl extends AbstractInformationControl implements IInformationControlExtension2 {
        return anno instanceof SpellingAnnotation || anno instanceof SQLProblemAnnotation || anno instanceof SQLSemanticErrorAnnotation;

                    }
import org.antlr.v4.runtime.misc.Interval;
import org.jkiss.dbeaver.ui.editors.sql.syntax.SQLProblemAnnotation;
    @Override

            return this.getAnnotationsHoverInfo(sourceViewer, lineRegion, anchorLine, false);
        @Override
                    }
    }
            if (visible) {
                }
            int linePosition = sourceViewer.getDocument().getLineOffset(lineNumber);
    /**
                            resultInterval = resultInterval == null ? annoInterval : resultInterval.union(annoInterval);
            for (Iterator<Annotation> ai = sourceViewer.getAnnotationModel().getAnnotationIterator(); ai.hasNext(); ) {

public class SQLAnnotationHover extends AbstractSQLEditorTextHover
                        Interval annoInterval = new Interval(annoPosition.getOffset(), annoPosition.getOffset() + annoPosition.getLength());
                    log.debug("Error obtaining anchor line of annotation offset " + lastAnnotationPos, e);
                Position annoPosition = annotationModel.getPosition(anno);
                    }
            this.infoView.createControl(parent);
    public IRegion getHoverRegion(@NotNull ITextViewer textViewer, int offset) {
        private final AnnotationsInformationView infoView;

                        }
                Position lastAnnotationPos = annotationsGroups.stream().max(Comparator.comparing(
        } catch (BadLocationException e) {
        setEditor(editor);
            Integer anchorLine = lineRange.getNumberOfLines() == 1 ? lineRange.getStartLine() : null;

                    g -> g.getLastPosition().getOffset() + g.getLastPosition().getLength()
import org.eclipse.ui.IEditorPart;
        }
        }

    public void setEditor(IEditorPart editor) {
            }
 * Copyright (C) 2010-2024 DBeaver Corp and others

        public boolean hasContents() {

            return new Point(bounds.width, bounds.height);
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ui.editors.sql.util;
        boolean adjustPosition
                if (isSupportedAnnotation(anno)) {
    public AnnotationsInformationView.AnnotationsHoverInfo getAnnotationsHoverInfo(
        @NotNull IRegion hoverRegion,
    }
    }
        }
    @Override
    @Override
        return LinkListInformationControl::new;

            return sb.isEmpty() ? null : sb.toString();
    private boolean isSupportedAnnotation(Annotation anno) {
            return null;
        public void setVisible(boolean visible) {
                if (isSupportedAnnotation(anno)) {
    }
        }
            }
import org.jkiss.code.NotNull;
            return null;
    }
        @Nullable Integer anchorLine,
 *
                    if (annoPosition != null) {
            super(parentShell, false);
        try {
            return null;
            this.setBackgroundColor(new Color(255, 128, 128));
            Annotation anno = ai.next();
            }
    @Nullable
import org.eclipse.swt.graphics.Point;
                        }
     * Show info from annotations on the specified line
        }
import org.jkiss.dbeaver.ui.editors.sql.semantics.SQLSemanticErrorAnnotation;

    public ILineRange getHoverLineRange(ISourceViewer viewer, int lineNumber) {
                    try {
import org.jkiss.code.Nullable;
                    if (annoPosition != null) {
        IAnnotationModel annotationModel = ((ISourceViewer) textViewer).getAnnotationModel();


            }
            int lineLength = sourceViewer.getDocument().getLineLength(lineNumber);
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
 */
        @NotNull ITextViewer textViewer,
/*
                try {
            return new AnnotationsInformationView.AnnotationsHoverInfo(annotationsGroups, adjustPosition ? hoverRegion : null, anchorLine);
        }
        return hoverInfo2 == null ? null : hoverInfo2.toString();
        }
    public String getHoverInfo(ISourceViewer sourceViewer, int lineNumber) {
    ) {
            this.infoView.setLinksInformation((AnnotationsInformationView.AnnotationsHoverInfo) input);
    implements ITextHover, IAnnotationHover, ITextHoverExtension, ITextHoverExtension2, IAnnotationHoverExtension {

import org.eclipse.jface.text.source.*;
        }
        @NotNull
            IRegion lineRegion = sourceViewer.getDocument().getLineInformation(lineRange.getStartLine());
        }
    @Override
                .toList();

import org.eclipse.swt.widgets.Shell;
 * SQLAnnotationHover
                Annotation anno = ai.next();
        if (linkGroupsByMessage.isEmpty()) {
                    anchorLine = editor.getDocument().getLineOfOffset(lastAnnotationOffset);
import org.eclipse.swt.graphics.Color;
        protected void createContent(@NotNull Composite parent) {
        Object hoverInfo2 = getHoverInfo2(textViewer, hoverRegion);
    }
        }
}                Annotation anno = ai.next();
            if (isSupportedAnnotation(anno)) {
                    } catch (BadLocationException ex) {
        return resultInterval == null ? null : new Region(resultInterval.a, resultInterval.length());
    @Override
            log.debug(e);
    public Object getHoverInfo(ISourceViewer sourceViewer, ILineRange lineRange, int visibleNumberOfLines) {
                            sb.append(anno.getText()).append("; ");
    }
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;
    }
        @NotNull IRegion hoverRegion
        Interval resultInterval = null;

import org.eclipse.swt.widgets.Composite;
    @Nullable
        @Override
        }
    public SQLAnnotationHover(SQLEditorBase editor) {
                }
        try {
        @NotNull

        public void setInformation(String information) {
            // Fix problem annotation tooltip disappear on mouse move/hover
 * Unless required by applicable law or agreed to in writing, software
                )).get().getLastPosition();
    @Nullable
 * distributed under the License is distributed on an "AS IS" BASIS,

 * See the License for the specific language governing permissions and
                if (annoPosition != null) {
                        if (annoInterval.properlyContains(hoverInterval)) {
                    }


        public void setInput(@NotNull Object input) {

    }
            return null;
                } catch (BadLocationException e) {
        } catch (BadLocationException e) {
    @Override
     */
                    Position annoPosition = annotationModel.getPosition(anno);
    }
            Rectangle bounds = this.getBounds();


    public String getHoverInfo(ITextViewer textViewer, IRegion hoverRegion) {

 * you may not use this file except in compliance with the License.
            create();
            if (anchorLine == null) {
 * You may obtain a copy of the License at

    ) {
    }
        @Override
    @Override
        if (!(textViewer instanceof ISourceViewer)) {
    }
    }


                        anchorLine = -1;
                    if (annoPosition.overlapsWith(hoverRegion.getOffset(), hoverRegion.getLength())) {
 *
import org.eclipse.jface.text.*;
/**
                }
        if (annotationModel != null) {

import org.eclipse.swt.graphics.Rectangle;
