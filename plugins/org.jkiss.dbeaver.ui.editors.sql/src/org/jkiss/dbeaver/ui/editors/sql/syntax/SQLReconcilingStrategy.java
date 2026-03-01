 */
            synchronized (lockObject) {
            return false;
        private final int regionOffset;
        String value;
        }
            int regionOffset,
        if (leftBound == null) {
import org.eclipse.jface.text.reconciler.DirtyRegion;
            return getOffset() == offset && getLength() == length;
            cachedQueries = Collections.unmodifiableNavigableSet(cache.headSet(rightBound, true));
                    }

            }
            this.regionLength = regionLength;
            }
        Collection<SQLScriptElementImpl> deletedPositions = cachedQueries.stream()
            .map(SQLScriptElementImpl::getAnnotation)
 * you may not use this file except in compliance with the License.
        cache.removeAll(deletedPositions);
            return null;
            return document.getChar(index);
            int diff = getOffset() - o.getOffset();
        }
    @Nullable
        return EditorUtils.getFileFromInput(editor.getEditorInput());
        ProjectionAnnotationModel annotationModel = editor.getProjectionAnnotationModel();
        return editor.getAnnotationModel();
        Collection<SQLScriptElementImpl> parsedElements = parsedQueries.stream()
            if (c == '\n') {
        return collapsedPositionsOffsets;

                    annotation.markCollapsed();
        if (stringJoiner.length() == 0) {
import org.eclipse.ui.editors.text.EditorsUI;
import org.eclipse.jface.text.reconciler.IReconcilingStrategy;

    }

            return "";
    private IDocument document;
        public int compareTo(@NotNull SQLScriptElementImpl o) {
    }
        @Override
        }
        Collection<SQLScriptElementImpl> cachedQueries;
    private static class SpellingProblemCollector implements ISpellingProblemCollector {
        }
        } else if (rightBound == null) {
            return;
            value = null;
            if (o instanceof Position p) {
import org.eclipse.core.runtime.CoreException;
        if (parsedQueries == null) {
            value = stringJoiner.toString();
                Object amLock = ((ISynchronizable) this.annotationModel).getLockObject();
        public String getText() {
            cache.clear(); // underlying annotation model being cleared, so reset the cache too
    public SQLReconcilingStrategy(SQLEditorBase editor) {

            }
        }
        SQLScriptElementImpl leftBound = cache.lower(new SQLScriptElementImpl(damagedRegionOffset, damagedRegionLength));

            if (annotation != null && annotation.isCollapsed()) {
        @Override

import org.eclipse.jface.text.reconciler.IReconcilingStrategyExtension;

    /**
        public void endCollecting() {
        }
import org.eclipse.ui.texteditor.spelling.SpellingAnnotation;
        String data;
            damagedRegionOffset = 0;

import org.jkiss.dbeaver.Log;
                element.setAnnotation(annotation);
    private int getNumberOfLines(SQLScriptElement element) {
        }
    }
        if (!editor.isFoldingEnabled()) {
    }
    private SQLSpellingContext spellingContext;

        }
    }
        public void setAnnotation(@Nullable ProjectionAnnotation annotation) {
            }
                }
        }
            if (!rightBound.equals(getExpandedScriptElement(rightmostParsedQuery))) {
                Iterator<Annotation> iter = annotationModel.getAnnotationIterator();
            return annotation;
        }
        }
        }
                Annotation[] annotationsToRemove = toRemove.toArray(new Annotation[0]);
        @Override
        this.document = document;
                        if (problemOffset >= regionOffset && problemOffset < regionOffset + regionLength) {
        @Nullable
        @Override
        int numberOfLines = getNumberOfLines(element);
        private final int regionLength;
                    addedAnnotations = null;
        cache.addAll(additions.values());
            if (o instanceof SQLScriptElement e) {
            return Objects.hash(getOffset(), getLength());
                return;
            this.regionOffset = regionOffset;
            } else {
        public void reset() {
            .filter(this::deservesFolding)
        reconcile(0, document.getLength(), false);
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.*;
            }
        if (isSpellingEnabled() && spellingContext != null) {
    protected IAnnotationModel getAnnotationModel() {
 * distributed under the License is distributed on an "AS IS" BASIS,
                ProjectionAnnotation annotation = new ProjectionAnnotation();
            int offsetValue = CommonUtils.toInt(offset, -1);
        }
        public void accept(SpellingProblem problem) {

                new Position(problem.getOffset(), problem.getLength()));

            if (offsetValue == -1) {

            addedAnnotations.put(
        try {
                new SpellingAnnotation(problem),
                } else {

 * Copyright (C) 2010-2024 DBeaver Corp and others
        }

                    Annotation annotation = iter.next();
            super(cause);
        } catch (CoreException e) {
        }
            leftBound = cache.lower(leftBound);

        }
import java.util.stream.Collectors;
    @Override
        this.editor = editor;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void initialReconcile() {
            ProjectionAnnotation annotation = position.getAnnotation();
                }
    @Nullable
    @Override

            cachedQueries = Collections.unmodifiableNavigableSet(cache.tailSet(leftBound, false));
public class SQLReconcilingStrategy implements IReconcilingStrategy, IReconcilingStrategyExtension {
        } else {
        for (SQLScriptElementImpl position : cache) {
    private List<SQLScriptElement> extractQueries(int offset, int length) {
 * limitations under the License.

    //expands query to the end of the line if there are only whitespaces after it. Returns desired length.
        }
import org.eclipse.ui.texteditor.spelling.SpellingProblem;
        } catch (BadLocationException e) {
        @Override
        } else if (leftBound == null) {
    public void setDocument(IDocument document) {
    }
    private final NavigableSet<SQLScriptElementImpl> cache = new TreeSet<>();
            int regionLength
        if (document == null) {
        if (resource == null) {
        try {
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
        SQLScriptElementImpl rightBound = cache.ceiling(new SQLScriptElementImpl(damagedRegionOffset + damagedRegionLength, 0));
        }


                    break;
                            toRemove.add(annotation);
 * DBeaver - Universal Database Manager

    private int expandQueryLength(SQLScriptElement element) { //todo simplify
            }
        Set<Integer> collapsedPositionsOffsets = new HashSet<>();
            return;
                continue;
        }
            }
            throw new SQLReconcilingStrategyException(e);
        @Override

                return element.getLength();
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;

                log.warn("Illegal offset parsed while reading saved collapsed annotation offsets. offset=" + offset);
    public void saveState() {
    }

        @Override
            resource.setPersistentProperty(COLLAPSED_ANNOTATIONS, value);
 *
        Map<Annotation, SQLScriptElementImpl> additions = new HashMap<>();
            }
        this.cache.clear();
        }
                position++;
            //do nothing
    }
            } else {
                    ((IAnnotationModelExtension) annotationModel).replaceAnnotations(annotationsToRemove, addedAnnotations);
        }

            return getLength() - o.getLength();
            return false;
        public void beginCollecting() {
    public void setProgressMonitor(IProgressMonitor monitor) {
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.sql.SQLScriptElement;

            return;
    private static final Log log = Log.getLog(SQLReconcilingStrategy.class);
            this.spellingContext.setContentType(SQLEditorUtils.getSQLContentType());
            List<Annotation> toRemove = new ArrayList<>();
    }
    }
        } else {
            addedAnnotations = null;
    private boolean deservesFolding(SQLScriptElement element) {

            damagedRegionLength = document.getLength();
    // Spelling
            @Nullable IAnnotationModel annotationModel,
 * You may obtain a copy of the License at
        private SQLReconcilingStrategyException(Throwable cause) {
        }
        }
            };
            damagedRegionOffset = leftBound.getOffset() + leftBound.getLength();
            initialized = true;
    }

    private boolean isSpellingEnabled() {
        @Override
            }
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorActivator;
        public SpellingProblemCollector(
            }
     * Spelling
        }
import org.eclipse.jface.text.source.IAnnotationModelExtension;
            damagedRegionLength = rightBound.getOffset() + rightBound.getLength() - damagedRegionOffset;
        public DBPDataSource getDataSource() {
    @Override
        public boolean equals(Object o) {
            char c = unsafeGetChar(position);
        Annotation[] deletions = deletedPositions.stream()
        } catch (BadLocationException e) {
            initialReconcile();
        @NotNull
        String[] offsets = data.split(";");
import org.eclipse.jface.text.source.projection.ProjectionAnnotationModel;

 * See the License for the specific language governing permissions and

    @NotNull
        if (rightBound == null) {

        } else {
    public void reconcile(DirtyRegion dirtyRegion, IRegion subRegion) {
        return editor.extractScriptQueries(offset, length, false, true, false);


            reconcile(0, document.getLength(), true);
        }
    private SQLScriptElementImpl getExpandedScriptElement(@NotNull SQLScriptElement element) {
        ) {
                rightBound = null;

                if (parsedQueries == null) {
                stringJoiner.add(Integer.toString(position.getOffset()));
        Set<Integer> savedCollapsedAnnotationsOffsets = restoreCollapsedAnnotations ? getSavedCollapsedAnnotationsOffsets() : Collections.emptySet();
            }
import org.eclipse.ui.texteditor.spelling.ISpellingProblemCollector;
            .filter(element -> !parsedElements.contains(element))
                parsedQueries = extractQueries(damagedRegionOffset, document.getLength());
        }
        }
                    return;
                return equals(p.getOffset(), p.getLength());

                new Region(damagedRegionOffset, damagedRegionLength)
        private Map<Annotation, Position> addedAnnotations;
    @Override
        @Override


        public Object getData() {
import org.eclipse.jface.text.source.projection.ProjectionAnnotation;
        if (!initialized) {

                if (annotationModel instanceof IAnnotationModelExtension) {
        if (leftBound != null) {
            return "";
import org.eclipse.core.runtime.IProgressMonitor;

                        SpellingProblem spellingProblem = ((SpellingAnnotation) annotation).getSpellingProblem();
                    }
import org.eclipse.core.runtime.QualifiedName;
            return numberOfLines > 2;
    private static final QualifiedName COLLAPSED_ANNOTATIONS =
        }
 *
            .map(this::getExpandedScriptElement)
        if (model == null) {
            return Collections.emptySet();
        } else {
        }
import org.eclipse.ui.texteditor.spelling.SpellingService;
        }
            return document.getLineOfOffset(element.getOffset() + element.getLength()) - document.getLineOfOffset(element.getOffset()) + 1;
        @Override

                }
        return new SQLScriptElementImpl(element.getOffset(), expandQueryLength(element));
            reconcile(subRegion.getOffset(), subRegion.getLength(), false);
    private void reconcile(int damagedRegionOffset, int damagedRegionLength, boolean restoreCollapsedAnnotations) {

        spellingService = EditorsUI.getSpellingService();
                    }
            }
                        annotationModel.removeAnnotation(element);
        if (numberOfLines == 1) {
                if (savedCollapsedAnnotationsOffsets.contains(element.getOffset())) {

import org.jkiss.dbeaver.ui.editors.sql.SQLEditorUtils;
            spellingService.check(document, regions, spellingContext, spellingProblemCollector, monitor);
    private IProgressMonitor monitor;
import org.jkiss.dbeaver.ui.editors.EditorUtils;
import org.eclipse.jface.text.*;
            reconcile(subRegion.getOffset(), 0, false);
                    if (annotation instanceof SpellingAnnotation) {
        private boolean equals(int offset, int length) {
            collapsedPositionsOffsets.add(offsetValue);
        new QualifiedName(SQLEditorActivator.PLUGIN_ID, SQLReconcilingStrategy.class.getName() + ".collapsedFoldingAnnotations");
            this.annotation = annotation;
        return position - element.getOffset();
        IResource resource = getResource();
        private final IAnnotationModel annotationModel;
        } else {
        if (spellingService.getActiveSpellingEngineDescriptor(editor.getViewerConfiguration().getPreferenceStore()) != null) {

        IResource resource = getResource();

    }
import org.jkiss.utils.CommonUtils;
                    for (Annotation element : annotationsToRemove) {
        List<SQLScriptElement> parsedQueries = extractQueries(damagedRegionOffset, damagedRegionLength);
            throw new SQLReconcilingStrategyException(e);
        private ProjectionAnnotation annotation;
            SQLScriptElement rightmostParsedQuery = parsedQueries.get(parsedQueries.size() - 1);
        @Nullable

    }
            .toList();
        @Override
        }
        } catch (CoreException e) {
        public void setData(Object data) {
                return diff;
    private static class SQLScriptElementImpl extends Position implements SQLScriptElement, Comparable<SQLScriptElementImpl> {

            return "";
    }
    private char unsafeGetChar(int index) {
        for (String offset : offsets) {
import org.eclipse.core.resources.IResource;

        }
        }
            IRegion[] regions = new IRegion[]{

        if (rightBound != null && !parsedQueries.isEmpty()) {
                getAnnotationModel(), damagedRegionOffset, damagedRegionLength);

                        }
                if (annotationModel == null) {
        if (data == null) {
import org.jkiss.dbeaver.model.DBPDataSource;
}
        }
                while (iter.hasNext()) {
                }
            .collect(Collectors.toSet());
        }
        @Nullable

                    return;
            //do nothing
    private Set<Integer> getSavedCollapsedAnnotationsOffsets() {
        return EditorsUI.getPreferenceStore().getBoolean("spellingEnabled");
                lockObject = Objects.requireNonNullElse(amLock, this.annotationModel);
            this.annotationModel = annotationModel;
        if (resource == null || annotationModel == null) {
                return equals(e.getOffset(), e.getLength());
import org.eclipse.jface.text.source.Annotation;
    private boolean initialized;
            super(offset, length);
        if (leftBound == null && rightBound == null) {
            if (Character.isWhitespace(c)) {
        }
            if (!cachedQueries.contains(element)) {
    }
        SQLScriptElementImpl(int offset, int length) {
        }
        }
    }
/*
        if (DirtyRegion.INSERT.equals(dirtyRegion.getType())) {
    private final SQLEditorBase editor;
    public void onDataSourceChange() {
            cachedQueries = Collections.unmodifiableNavigableSet(cache);
        public int hashCode() {
    }
import org.eclipse.jface.text.source.IAnnotationModel;

            .toArray(Annotation[]::new);
    @Override
            addedAnnotations = new HashMap<>();

                }
    private static class SQLReconcilingStrategyException extends RuntimeException {
    }
     */
            ISpellingProblemCollector spellingProblemCollector = new SpellingProblemCollector(
        }
                }
                additions.put(annotation, element);
            if (annotationModel == null) {
            data = resource.getPersistentProperty(COLLAPSED_ANNOTATIONS);
    }
                        annotationModel.addAnnotation(entry.getKey(), entry.getValue());
            return;
        }
    public void reconcile(IRegion partition) {
                    position++;
        }
        @Nullable
        while (position < document.getLength()) {
        if (element.getOffset() + element.getLength() != document.getLength() && expandQueryLength(element) == element.getLength()) {
            log.warn("Core Exception caught while persisting saved collapsed folding positions", e);
            return Collections.emptySet();

        if (!initialized) {

package org.jkiss.dbeaver.ui.editors.sql.syntax;
        return true;
                        int problemOffset = spellingProblem.getOffset();
        StringJoiner stringJoiner = new StringJoiner(";");
            reconcile(0, document.getLength(), true);
    }
    }
        }
        public String getOriginalText() {
        ProjectionAnnotationModel model = editor.getProjectionAnnotationModel();
            return;
                if (position + 1 < document.getLength()) {
            return Collections.emptySet();
            cachedQueries = Collections.unmodifiableNavigableSet(cache.subSet(leftBound, false, rightBound, true));
        for (SQLScriptElementImpl element : parsedElements) {

            if (this.annotationModel instanceof ISynchronizable) {
        @Override


        try {


    private IResource getResource() {
        } else {
        }
        model.modifyAnnotations(deletions, additions, null);

 *
        try {
        @NotNull
            log.warn("Core Exception caught while reading saved collapsed folding positions: " + e.getMessage());
        int position = element.getOffset() + element.getLength();
            this.spellingContext = new SQLSpellingContext(editor);
                lockObject = Objects.requireNonNullElse(this.annotationModel, this);
        this.monitor = monitor;
import org.jkiss.code.Nullable;
        public ProjectionAnnotation getAnnotation() {
    }
 * Unless required by applicable law or agreed to in writing, software
    private SpellingService spellingService;


    //format: "offset_1;offset_2;...offset_n"
                    for (Map.Entry<Annotation, Position> entry : addedAnnotations.entrySet()) {
        }
        }
        private final Object lockObject;
            if (diff != 0) {
