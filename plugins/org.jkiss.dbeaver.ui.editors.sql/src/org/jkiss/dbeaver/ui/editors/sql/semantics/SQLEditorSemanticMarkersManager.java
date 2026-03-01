 * DBeaver - Universal Database Manager
import java.util.Map;
        if (context != null) {
                Deque<SQLSemanticErrorAnnotation> itemAnnotations = this.annotations.remove(scriptItem);
 *
    private void cleanup() {
                                IMarker.SEVERITY, problemInfo.getSeverity().markerSeverity,
    private static final Log log = Log.getLog(SQLEditorSemanticMarkersManager.class);
    }
                        ) ? annotation : v);
        SQLDocumentSyntaxContext context = this.syntaxContext;
                    queuedOperations.clear();
                scheduleRefreshJob();
            queuedOperations.clear();
            SQLDocumentScriptItemSyntaxContext scriptItem = entry.getKey();
                    } catch (CoreException|BadLocationException e) {
            this.syntaxContext = context;
            if (entry.getValue() && scriptItem.getProblems() != null) {
        Map.Entry<SQLDocumentScriptItemSyntaxContext, Boolean>[] entries;
import org.antlr.v4.runtime.misc.Interval;

                    resource.deleteMarkers(SQLSemanticErrorAnnotation.MARKER_TYPE, false, IResource.DEPTH_ONE);
        }
 * you may not use this file except in compliance with the License.
        }
        }
    }
 *
            synchronized (syncRoot) {
    private volatile SQLDocumentSyntaxContext syntaxContext;
                        itemAnnotations.addLast(annotation);
    @NotNull
import java.util.Deque;
            textViewer.addTextInputListener(this.textInputListener);
import org.jkiss.code.Nullable;
            refresh();
                } catch (CoreException e) {
            resetAnnotations = true;
    /**
                    resetAnnotations = true;
                        // We associate position objects with annotations, but don't introduce this information into the markers, because
        synchronized (syncRoot) {
    @NotNull
                        SQLSemanticErrorAnnotation annotation = new SQLSemanticErrorAnnotation(marker, problemInfo);
        if (resource == null || annotationModel == null) {
        }
                        severestAnnotationsByLine.compute(problemLine, (k, v) -> (v == null ||
    public SQLEditorSemanticMarkersManager(@NotNull SQLEditorBase editor) {
import org.eclipse.core.runtime.CoreException;
                            log.error("Error deleting problem marker", e);
    private final AbstractUIJob refreshJob = new AbstractUIJob("SQL editor error markers refresh") {
import org.jkiss.dbeaver.model.sql.semantics.*;
        for (Map.Entry<SQLDocumentScriptItemSyntaxContext, Boolean> entry : entries) {
                        IMarker marker = annotation.getMarker();
        this.editor = editor;
                }
    private final Map<SQLDocumentScriptItemSyntaxContext, Deque<SQLSemanticErrorAnnotation>> annotations = new HashMap<>();
        @Override
                }
                    scheduleRefreshJob();
                }
    private void setup() {
                scheduleRefreshJob();
 *     http://www.apache.org/licenses/LICENSE-2.0
    };
    };
import java.util.HashMap;
                Map<Integer, SQLSemanticErrorAnnotation> severestAnnotationsByLine = new HashMap<>();
            if (this.resetAnnotations) {
                        int problemLine = this.editor.getDocument().getLineOfOffset(problemOffset);
                if (!clearScheduled) {
        }
        final IResource resource = GeneralUtils.adapt(this.editor.getEditorInput(), IResource.class);
            }
    };
                queuedOperations.put(item, true);
        }
        }
            } else {
        @Override

    @NotNull
                if (context != null) {
                        final IMarker marker = resource.createMarker(SQLSemanticErrorAnnotation.MARKER_TYPE, Map.of(
        }
            }
                this.resetAnnotations = false;
import org.eclipse.core.runtime.IStatus;
        if (textViewer != null) {
    }
import org.eclipse.jface.text.*;
            textViewer.removeTextInputListener(this.textInputListener);
            return;
                        Interval problemInterval = problemInfo.getInterval();
            context.removeListener(this.syntaxContextListener);
import org.eclipse.jface.text.source.IAnnotationModel;
                        try {
}

                        } catch (CoreException e) {
                            marker.delete();
        }
    private final Map<SQLDocumentScriptItemSyntaxContext, Boolean> queuedOperations = new HashMap<>();
        }
    }
        }
                        ));
    @Nullable
            context.addListener(this.syntaxContextListener);
                        }
                for (SQLSemanticErrorAnnotation annotation: severestAnnotationsByLine.values()) {

        public void onAllScriptItemsInvalidated() {
                        } catch (CoreException e) {
        public void onScriptItemIntroduced(@NotNull SQLDocumentScriptItemSyntaxContext item) {
        public void inputDocumentChanged(IDocument oldInput, IDocument newInput) {
                try {
                }
        @Override
    }
                    this.setup();
        final IAnnotationModel annotationModel = this.editor.getAnnotationModel();
                                IMarker.TRANSIENT, true
                for (SQLQueryRecognitionProblemInfo problemInfo : scriptItem.getProblems()) {
    }
import org.eclipse.core.resources.IMarker;

                    for (SQLScriptItemAtOffset itemAtOffset : context.getScriptItems()) {

                    for (SQLSemanticErrorAnnotation annotation : itemAnnotations) {
        TextViewer textViewer = this.editor.getTextViewer();
        @NotNull
    public void dispose() {
                        log.error("Error creating problem marker", e);
        this.cleanup();
 * You may obtain a copy of the License at
                            annotation.getProblemMarkerSeverity() > v.getProblemMarkerSeverity()
            }
        @Override
        TextViewer textViewer = this.editor.getTextViewer();
 * See the License for the specific language governing permissions and
    private void scheduleClearAllProblems() {
                    }
            {
            this.syntaxContext = null;
                    this.cleanup();
        }


        }
        synchronized (syncRoot) {
    private void updateMarkers() {
                        annotationModel.addAnnotation(annotation, position);

                        Position position = new Position(problemOffset, problemInterval.length());
        SQLDocumentSyntaxContext context = this.editor.getSyntaxContext();
            }
            SQLDocumentSyntaxContext currentContext = this.syntaxContext;
                    }
    private final SQLEditorBase editor;
    private final Object syncRoot = new Object();
                    annotation.setMarginMarkerVisible(true);

                }
    }
        }
        @Override

            boolean clearScheduled = false;
            entries = this.queuedOperations.entrySet().toArray(new Map.Entry[0]);
            this.scheduleRefreshJob();

                Deque<SQLSemanticErrorAnnotation> itemAnnotations = this.annotations.computeIfAbsent(scriptItem, c -> new LinkedList<>());
     * Release associated resources
                        queuedOperations.put(itemAtOffset.item, true);
import java.util.LinkedList;
                    log.error("Error deleting problem markers: " + e.getMessage());
        @Override

                        annotationModel.removeAnnotation(annotation);
import org.eclipse.core.resources.IResource;
        protected IStatus runInUIThread(@NotNull DBRProgressMonitor monitor) {
                }

            scheduleRefreshJob();
 * Unless required by applicable law or agreed to in writing, software
     */
 * distributed under the License is distributed on an "AS IS" BASIS,
                        // otherwise eclipse breaks annotation location, margin marker's per-line icon rendering and aggregation.
                if (!clearScheduled) {

    }
        this.setup();
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
    private void scheduleRefreshJob() {
                    try {
                }
    private final SQLDocumentSyntaxContextListener syntaxContextListener = new SQLDocumentSyntaxContextListener() {
public class SQLEditorSemanticMarkersManager {

                if (currentContext != null) {
            synchronized (syncRoot) {
                if (itemAnnotations != null) {
                queuedOperations.put(item, false);
            this.queuedOperations.clear();
                            log.error("Error dissociating problem marker", e);
                SQLDocumentSyntaxContext context = this.syntaxContext;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public void refresh() {
    @NotNull
        public void inputDocumentAboutToBeChanged(IDocument oldInput, IDocument newInput) {
package org.jkiss.dbeaver.ui.editors.sql.semantics;
                int scriptItemPosition = scriptItem.getInitialPosition();
        if (context != null) {

import org.jkiss.code.NotNull;
                                IMarker.MESSAGE, problemInfo.getMessage(),
/*
        if (textViewer != null) {

    private volatile boolean resetAnnotations = false;
    @NotNull


                    clearScheduled = true;

    private final ITextInputListener textInputListener = new ITextInputListener() {

        this.refreshJob.schedule(500);
            }
                    }
                        int problemOffset = scriptItemPosition + problemInterval.a;
import org.jkiss.dbeaver.utils.GeneralUtils;
            if (actualContext != currentContext) {
 */
        synchronized (this.syncRoot) {

                if (actualContext != null) {
                }
import org.eclipse.core.runtime.Status;
        }
            updateMarkers();
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                        marker.setAttribute(SQLSemanticErrorAnnotation.MARKER_ATTRIBUTE_NAME, annotation);
            return Status.OK_STATUS;
                        }
    @NotNull
import org.jkiss.dbeaver.ui.AbstractUIJob;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
            scheduleClearAllProblems();

                }
        public void onScriptItemInvalidated(@NotNull SQLDocumentScriptItemSyntaxContext item) {
 *
                            marker.setAttribute(SQLSemanticErrorAnnotation.MARKER_ATTRIBUTE_NAME, null);
        this.scheduleClearAllProblems();
        SQLDocumentSyntaxContext actualContext = this.editor.getSyntaxContext();
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;
                        try {
