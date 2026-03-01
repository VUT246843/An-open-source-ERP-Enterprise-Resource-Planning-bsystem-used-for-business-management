            this.selectionChangedListener = null;
                synchronized (LOCK_OBJECT) {
                        while (startPos > 0 && wordDetector.isWordPart(document.getChar(startPos - 1))) {
class SQLOccurrencesHighlighter {
                        }
                    try {
    private EditorSelectionChangedListener selectionChangedListener;
        private String wordUnderCursor;
import org.eclipse.jface.text.source.IAnnotationModelExtension;

                SQLOccurrencesHighlighter.this.occurrencesFinderJob.doCancel();
                                Map<Annotation, Position> annotationMap = new LinkedHashMap<>(this.positions.size());
                                    }
        private List<OccurrencePosition> positions;
import org.eclipse.core.runtime.jobs.Job;
                    annotationModel.addAnnotation(mapEntry.getKey(), mapEntry.getValue());
        }
            return positions;
                    if (document != null) {

                this.installOccurrencesFinder();


                    int endPos = startPos + selection.getLength();
 * SQL occurrences highlighter
import org.eclipse.core.runtime.IProgressMonitor;
    private void updateAnnotationModelForRemoves(IAnnotationModel annotationModel) {

                        } else {
            if (selectionProvider instanceof IPostSelectionProvider) {
            super("Occurrences Marker");
                            this.occurrencesFinderJob = new OccurrencesFinderJob(positions);
                        this.removeOccurrenceAnnotations();
        String property = event.getProperty();
        private boolean isCanceled() {
                            IAnnotationModel annotationModel = documentProvider.getAnnotationModel(editor.getEditorInput());
                if (textViewer != null) {
        if (this.selectionChangedListener == null) {
 * Unless required by applicable law or agreed to in writing, software
                for (Map.Entry<Annotation, Position> mapEntry : annotationMap.entrySet()) {
        }
                            }
 *
        OccurrencesFinder(IDocument document, String wordUnderCursor, String wordSelected) {
            this.isCanceled = true;
                                                position.forSelection ?
        return markOccurrencesUnderCursor || this.markOccurrencesForSelection;
 * DBeaver - Universal Database Manager
                    this.updateAnnotationModelForRemoves(annotationModel);
                        } catch (BadLocationException e) {


                ITextViewer textViewer = editor.getViewer();
                positions.add(
                                    synchronized (LOCK_OBJECT) {
                }
            }
            if (sourceViewer != null) {
import java.util.LinkedHashMap;
import java.util.List;
            this.occurrencesFinderJobCanceler = new SQLOccurrencesHighlighter.OccurrencesFinderJobCanceler();
import org.eclipse.core.runtime.Status;
                StyledText text = sourceViewer.getTextWidget();

 * See the License for the specific language governing permissions and
            this.cancel();
        void uninstall() {

                ((IPostSelectionProvider) selectionProvider).addPostSelectionChangedListener(this);
            } else if (selectionProvider != null) {
    }
    }
        if (this.occurrencesFinderJobCanceler != null) {

        public IStatus run(IProgressMonitor progressMonitor) {
                                        break;
    public boolean isEnabled() {
        }
                        while (endPos < documentLength && wordDetector.isWordPart(document.getChar(endPos))) {
import org.jkiss.dbeaver.Log;
    }
import org.eclipse.jface.text.source.Annotation;
            }
                SQLOccurrencesHighlighter.this.updateOccurrenceAnnotations((ITextSelection) selection);
        }
    }
                selectionProvider.addSelectionChangedListener(this);
            } else {
        }
                newInput.addDocumentListener(this);
                sourceViewer.removeTextInputListener(this);
    static protected final Log log = Log.getLog(SQLOccurrencesHighlighter.class);
                if (document != null) {
        boolean forSelection;


            if (selection instanceof ITextSelection) {
                                    try {
        void uninstall(ISelectionProvider selectionProvider) {
                offset = region.getOffset() + region.getLength();
                        if (!CommonUtils.isEmpty(positions)) {
import org.eclipse.jface.text.source.IAnnotationModel;
                    findPositions(wordUnderCursor, positions, false);
import org.eclipse.jface.text.*;

    }
                        }
                                wordSelected = null;
            final DBPPreferenceStore prefStore = editor.getActivePreferenceStore();
            if (this.markOccurrencesUnderCursor || this.markOccurrencesForSelection) {
                    } else {
        }
        private void updateAnnotations(IAnnotationModel annotationModel, Map<Annotation, Position> annotationMap) {
/**
                                        //
            this.positions = positions;

        if (SQLEditorUtils.isSQLSyntaxParserEnabled(editor.getEditorInput())
                    if (!CommonUtils.isEmpty(wordSelected)) {
 * distributed under the License is distributed on an "AS IS" BASIS,

        OccurrencePosition(int offset, int length, boolean forSelection) {




            }
    }

            if (!this.isCanceled()) {
    private void setMarkingOccurrences(boolean markUnderCursor, boolean markSelection) {
    class OccurrencesFinderJob extends Job {
            }
            if (annotationModel instanceof IAnnotationModelExtension) {

import org.eclipse.ui.IEditorInput;


        }
            try {
            List<OccurrencePosition> positions = new ArrayList<>();

            this.fDocument = document;
        return false;
        public void inputDocumentAboutToBeChanged(IDocument oldInput, IDocument newInput) {
    private void removeOccurrenceAnnotations() {
                }
        this.removeOccurrenceAnnotations();
        }
            if (annotationModel != null && this.occurrenceAnnotations != null) {
            uninstallOccurrencesFinder();
        }
                            this.removeOccurrenceAnnotations();
                    new OccurrencePosition(region.getOffset(), region.getLength(), forSelection)
import org.eclipse.jface.util.PropertyChangeEvent;
                this.updateOccurrenceAnnotations((ITextSelection) selection);
        public List<OccurrencePosition> perform() {
        private boolean isCanceled = false;
        if (this.occurrencesFinderJob != null) {
            this.selectionChangedListener.uninstall(editor.getSelectionProvider());
    private final Object LOCK_OBJECT = new Object();
                IRegion region = findReplaceDocumentAdapter.find(offset, searchFor, true, false, !forSelection, false);

        this.markOccurrencesForSelection = false;
                selectionProvider.removeSelectionChangedListener(this);
                );
        }
    void installOccurrencesFinder() {
 *     http://www.apache.org/licenses/LICENSE-2.0
    private final SQLEditorBase editor;
            this.markOccurrencesForSelection = markSelection;
        this.markOccurrencesForSelection = prefStore.getBoolean(SQLPreferenceConstants.MARK_OCCURRENCES_FOR_SELECTION);
            }
                if (CommonUtils.equalObjects(wordUnderCursor, wordSelected)) {
        public void selectionChanged(SelectionChangedEvent event) {
        }
                                    if (this.isCanceled()) {
            this.selectionChangedListener.install(editor.getSelectionProvider());
            if (selection instanceof ITextSelection) {
    }
                annotationModel.removeAnnotation(this.occurrenceAnnotations[i]);
                }
            }

            setMarkingOccurrences(
            this.occurrencesFinderJobCanceler.uninstall();
            if (SQLOccurrencesHighlighter.this.occurrencesFinderJob != null) {
                        if (documentProvider != null) {
        if (this.markOccurrencesUnderCursor || this.markOccurrencesForSelection) {
        if (this.occurrencesFinderJob != null) {
    /////////////////////////////////////////////////////////////////
                                    return Status.OK_STATUS;
            }
        if (markUnderCursor != this.markOccurrencesUnderCursor || markSelection != this.markOccurrencesForSelection) {


        }
                        findPositions(wordSelected, positions, true);

                    }
            if (CommonUtils.isEmpty(wordUnderCursor) && CommonUtils.isEmpty(wordSelected)) {
        private IProgressMonitor progressMonitor;
        }
            ISourceViewer sourceViewer = editor.getViewer();
        } else {

            if (newInput != null) {
            for (int length = this.occurrenceAnnotations.length; i < length; ++i) {
    // Occurrences highlight

        }
                        OccurrencesFinder finder = new OccurrencesFinder(document, wordUnderCursor, wordSelected);
    private OccurrencesFinderJobCanceler occurrencesFinderJobCanceler;
package org.jkiss.dbeaver.ui.editors.sql;
    private static class OccurrencesFinder {
                                    }
            ((IAnnotationModelExtension) annotationModel).replaceAnnotations(this.occurrenceAnnotations, null);
        }
    private void updateOccurrenceAnnotations(ITextSelection selection) {
                        IDocumentProvider documentProvider = editor.getDocumentProvider();
                        List<OccurrencePosition> positions = finder.perform();
            this.wordSelected = wordSelected;
                    sourceViewer.addTextInputListener(this);
import java.util.Map;
                if (region == null) {
    }
 *
                                            position);
        if (!SQLEditorUtils.isSQLSyntaxParserApplied(input)) {
                            wordUnderCursor = document.get(startPos, endPos - startPos).trim();
                } else {
                    String wordSelected = null;
    public boolean isMarkingOccurrences() {
            }
                    document.removeDocumentListener(this);

                                        this.updateAnnotations(annotationModel, annotationMap);
            }

    }


        if (annotationModel instanceof IAnnotationModelExtension) {

    }
                                break;
        if (this.occurrencesFinderJobCanceler == null) {

        }
        this.occurrenceAnnotations = null;
                }
                ((IAnnotationModelExtension) annotationModel).replaceAnnotations(SQLOccurrencesHighlighter.this.occurrenceAnnotations, annotationMap);


                    IDocument document = sourceViewer.getDocument();
            this.progressMonitor = progressMonitor;
                prefStore.getBoolean(SQLPreferenceConstants.MARK_OCCURRENCES_FOR_SELECTION));
        private String wordSelected;
        }
    SQLOccurrencesHighlighter(SQLEditorBase editor) {
                return null;
        ) {
                }

                    } catch (BadLocationException e) {
                                                    SQLEditorContributions.OCCURRENCES_UNDER_CURSOR_ANNOTATION_ID,
            this.selectionChangedListener = new EditorSelectionChangedListener();
            || SQLPreferenceConstants.MARK_OCCURRENCES_FOR_SELECTION.equals(property))

                        try {
            IAnnotationModel annotationModel = documentProvider.getAnnotationModel(editor.getEditorInput());
        } else {
            ISelection selection = editor.getSelectionProvider().getSelection();
        this.editor = editor;

                            log.debug("Error detecting word under cursor", e);

            SQLOccurrencesHighlighter.this.occurrenceAnnotations = annotationMap.keySet().toArray(new Annotation[0]);

                                            new Annotation(
                                                false,
            this.markOccurrencesUnderCursor = markUnderCursor;
        }
 * you may not use this file except in compliance with the License.
                this.uninstallOccurrencesFinder();
            }
                IDocument document = editor.getViewer().getDocument();
        }
                SQLOccurrencesHighlighter.this.removeOccurrenceAnnotations();
            updateInput(editor.getEditorInput());
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public void dispose() {
    private boolean markOccurrencesUnderCursor;
            } else {

                                for (OccurrencePosition position : this.positions) {
                IDocument document = documentProvider.getDocument(editor.getEditorInput());
        if (this.selectionChangedListener != null) {
            }

                oldInput.removeDocumentListener(this);
        }
            ISelection selection = event.getSelection();
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                    // Search only selected words

                                }
                }
import org.eclipse.ui.texteditor.IDocumentProvider;
                    }
            this.forSelection = forSelection;

    }
import java.util.ArrayList;
                    if (markOccurrencesForSelection) {

                                                    SQLEditorContributions.OCCURRENCES_FOR_SELECTION_ANNOTATION_ID :
        public void documentAboutToBeChanged(DocumentEvent event) {
                    }
            super(offset, length);
            if (selectionProvider instanceof IPostSelectionProvider) {
/*
                                }
 * limitations under the License.
        public void inputDocumentChanged(IDocument oldInput, IDocument newInput) {
            for (int offset = 0; ; ) {
        OccurrencesFinderJob(List<OccurrencePosition> positions) {
                                        String message = document.get(position.offset, position.length);
                        wordSelected = selection.getText();
        void doCancel() {
            } catch (BadLocationException e) {
                        log.debug("Error detecting current word: " + e.getMessage());
        return this.markOccurrencesUnderCursor;
                                    }
    }
            this.occurrencesFinderJob.cancel();
                                    } catch (BadLocationException ex) {
                                if (!this.isCanceled()) {
                            }
            this.wordUnderCursor = wordUnderCursor;
                            this.occurrencesFinderJob.run(new NullProgressMonitor());
            IDocumentProvider documentProvider = editor.getDocumentProvider();
            if (documentProvider != null) {
                                        annotationMap.put(
            }
                        }
        if (documentProvider != null) {
            ISourceViewer sourceViewer = editor.getViewer();
            if (sourceViewer != null) {
        this.markOccurrencesUnderCursor = prefStore.getBoolean(SQLPreferenceConstants.MARK_OCCURRENCES_UNDER_CURSOR);
 * You may obtain a copy of the License at
                prefStore.getBoolean(SQLPreferenceConstants.MARK_OCCURRENCES_UNDER_CURSOR),
            }
        }
                            if (!wordDetector.isWordPart(wordSelected.charAt(i))) {
    private boolean markOccurrencesForSelection;
        }
                ((IPostSelectionProvider) selectionProvider).removePostSelectionChangedListener(this);
            int i = 0;
            this.occurrencesFinderJob = null;
        private IDocument fDocument;
 * Licensed under the Apache License, Version 2.0 (the "License");
            this.occurrencesFinderJobCanceler = null;

        }
                log.debug("Error finding occurrences: " + e.getMessage());
            && (SQLPreferenceConstants.MARK_OCCURRENCES_UNDER_CURSOR.equals(property)
                if (text != null && !text.isDisposed()) {
                            if (annotationModel != null) {
 *
            return this.isCanceled || this.progressMonitor.isCanceled();
    void updateInput(IEditorInput input) {
            }
        }
            }
            }
            return Status.CANCEL_STATUS;
import org.eclipse.core.runtime.IStatus;
                    break;

        }
            return true;
            if (selection != null) {
                    String wordUnderCursor = null;
    private void uninstallOccurrencesFinder() {
        private void findPositions(String searchFor, List<OccurrencePosition> positions, boolean forSelection) throws BadLocationException {
                if (document != null) {
            }
                            startPos--;
        this.markOccurrencesUnderCursor = false;
                    TPWordDetector wordDetector = new TPWordDetector();
                        int documentLength = document.getLength();

            }

        if (editor.getSelectionProvider() != null) {
        public void install() {
        public void documentChanged(DocumentEvent event) {

        }
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    }
    private class EditorSelectionChangedListener implements ISelectionChangedListener {
    }
                    findPositions(wordUnderCursor, positions, true);
        }
        IDocumentProvider documentProvider = editor.getDocumentProvider();


                    // Get full word
    }
                        for (int i = 0; i < wordSelected.length(); i++) {

    private static class OccurrencePosition extends Position {
                            endPos++;
    private OccurrencesFinderJob occurrencesFinderJob;
                    }
                    }
    private Annotation[] occurrenceAnnotations = null;
                    if (markOccurrencesUnderCursor) {
 */

                        }

                        }

            this.occurrencesFinderJob.cancel();

                    int startPos = selection.getOffset();
        final DBPPreferenceStore prefStore = editor.getActivePreferenceStore();
import org.jkiss.utils.CommonUtils;

import org.eclipse.jface.text.source.ISourceViewer;
            if (oldInput != null) {

import org.eclipse.swt.custom.StyledText;
            FindReplaceDocumentAdapter findReplaceDocumentAdapter = new FindReplaceDocumentAdapter(fDocument);
}
        }
        public void install(ISelectionProvider selectionProvider) {
        }

import org.eclipse.jface.viewers.*;
                }
    }
                        document.addDocumentListener(this);
        }
                    if (document != null) {
                    IDocument document = textViewer.getDocument();
    class OccurrencesFinderJobCanceler implements IDocumentListener, ITextInputListener {

                    }
    boolean handlePreferenceStoreChanged(PropertyChangeEvent event) {
            this.occurrencesFinderJobCanceler.install();
    }
        }
                }
                    if (wordUnderCursor == null && (CommonUtils.isEmpty(wordSelected) || wordSelected.length() < 2)) {
                                                message),

            }
import org.jkiss.dbeaver.model.text.parser.TPWordDetector;
            } else if (selectionProvider != null) {
                        }
 */
import org.eclipse.core.runtime.NullProgressMonitor;
