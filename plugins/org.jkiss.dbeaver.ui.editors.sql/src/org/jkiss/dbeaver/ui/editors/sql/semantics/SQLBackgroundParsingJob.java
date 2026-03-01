
                return Status.CANCEL_STATUS;
                unknownRange = visibleRange;
                                "Too many errors found in one query of " + this.editor.getTitle() + "!" +
                ListNode<Integer> keyOffsetsToRemove = null;
import java.util.concurrent.*;
        synchronized (this.syncRoot) {
                }
    private volatile int knownRegionStart = 0;
            long delay;

            TextViewer textViewer = this.editor.getTextViewer();
            if (event != null && SQLConstants.DOT.equals(event.getText())) {
            this.signalAccomplished();

                    if (!positionIsQueued) {
        protected IStatus run(@NotNull DBRProgressMonitor monitor) {
                        followingElement.getOffset() < workOffset + workLength &&
        SQLScriptItemAtOffset scriptItem = null;
    private final SQLEditorBase editor;
                }

                        if (DEBUG) {
                }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                if (this.document != null) {
                                if (DEBUG) {
     * Dispose job - cancel schedule and remove listeners.
            }
            this.schedule(null);
                delay = schedulingTimeoutMilliseconds * (this.isRunning ? 2 : 1);
        if (DEBUG) {
            SQLDialect dialect = this.obtainCurrentSqlDialect(executionContext);
    private static final Log log = Log.getLog(SQLBackgroundParsingJob.class);
                    log.debug("actual region is " + actualFragment.a + "-" + actualFragment.b);
        synchronized (this.syncRoot) {

                    int visibleLinesCount = viewer.getTextWidget().getSize().y / viewer.getTextWidget().getLineHeight();

        return context;
            if (newDocument != null && SQLEditorUtils.isSQLSyntaxParserApplied(editor.getEditorInput())) {
                }
            this.knownRegionEnd = Math.max(this.knownRegionEnd, parsedOffset + parsedLength);
import org.jkiss.dbeaver.model.sql.parser.SQLParserContext;
                }
    }
                expectedParsingSessionFinishStamp = this.lastParsingFinishStamp;
            }
                int startOffset = viewer.getTopIndexStartOffset();
                this.queuedForReparse.applyOffset(event.getOffset(), delta);
                    elements.set(0, element);
                this.reset();
            this.signalAccomplished();
                }

                            }
                log.debug("reset background parsing job");
            if (this.lastParsingFinishStamp.isDone()) {
        throw new CancellationException();
 *
                        itemContext.setProblems(problems);
                int docTailDelta = this.document.getLength() - saturatedSum(workOffset, workLength);
            );
    }
                }
            if (oldInput != null) {
    @NotNull
    public void dispose() {
        int r = a + b;
                }
                this.accomplishWork(workOffset, workLength);
                return future.get(1, TimeUnit.SECONDS);
                        NodesIterator<QueuedRegionInfo> it = this.queuedForReparse.nodesIteratorAt(Integer.MAX_VALUE);
    }
        }
            if (this.job.getState() != Job.RUNNING) {
                    workLength -= workOffset;
}
                // job.join() cannot be used here because completion request is being submitted at before-change event,
                        itemContext.clear();
    
                if (element != null && element.getOffset() < elements.get(0).getOffset()) {
            try {
                    }
                Interval preservedRegion = this.context.dropInvisibleScriptItems(actualFragment);
            }
            } else {
    private static final boolean DEBUG = false;
    }
                this.queuedForReparse.clear();
                for (ListNode<Integer> kn = keyOffsetsToRemove; kn != null; kn = kn.next) {
            if (DEBUG) {
                Interval workInterval = new Interval(workOffset, saturatedSum(workOffset, workLength));
        
                log.debug("discovering " + workOffset + "+" + workLength);
                
                            log.debug("\t@" + it.getCurrOffset() + "+" + it.getCurrValue().length);
                delay = this.isRunning ? schedulingTimeoutMilliseconds / 2 : 0;
        }
                    if (DEBUG) {
                if (DEBUG) {
        synchronized (this.syncRoot) {
            if (this.editor.getRuleManager() == null || !this.editor.isAdvancedHighlightingEnabled() ||
    
    }
        int parsedLength = workLength;
                        if (problems.size() >= SQLQueryRecognitionProblemInfo.PER_QUERY_LIMIT && queryModel.getQueryModel() != null) {
                    if (firstAffectedReparseOffset < reparseStart &&
import org.jkiss.dbeaver.Log;
                        return; // modified region is a subrange of already queued for reparse 
            } else {

        }
                    NodesIterator<QueuedRegionInfo> it = this.queuedForReparse.nodesIteratorAt(Integer.MAX_VALUE);
    private boolean isValidateFunctionsEnabled() {
                SQLBackgroundParsingJob.this.cancel();
                this.queuedForReparse.put(toParseStart, new QueuedRegionInfo(toParseLength));
    }
                    log.debug("No script elements to parse in range " + workOffset + "+" + workLength);

                int stepsToKeep = 2;
            }
    private final SQLDocumentSyntaxContext context = new SQLDocumentSyntaxContext();
                    if (followingElement != null &&
        return SQLQueryCompletionContext.prepareEmpty(0, completionRequestPosition.getOffset());
        try {
                this.enqueueToReparse(reparseStart, Integer.MAX_VALUE);

import org.eclipse.core.runtime.Status;
        }
    }

            }
        public void inputDocumentAboutToBeChanged(IDocument oldInput, IDocument newInput) {
        int insertedLength = event.getText() == null ? 0 : event.getText().length();
            } else {
                    firstAffectedReparseOffset = it.getCurrOffset();
        UIUtils.asyncExec(() -> {
            if (unknownRange == null) {
            } else {
                                log.debug("fallback to offquery context");
public class SQLBackgroundParsingJob {
                if (DEBUG) {
                {
                            problems.add(new SQLQueryRecognitionProblemInfo(
    @NotNull
            log.debug(ex);
            log.debug("reparse region @" + reparseStart + "+" + reparseLength);
import org.jkiss.dbeaver.model.sql.semantics.completion.SQLQueryCompletionContext;
        @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ui.editors.sql.semantics;
                    int rangeEnd = doc.getLineOffset(Math.min(doc.getNumberOfLines(), firstVisibleLine + visibleLinesCount * (stepsToKeep + 1)));
        @Override
                if (DEBUG) {

import org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect;
        public int length;
        int endOffset = viewer.getBottomIndexEndOffset();
        }
            int i = 1;
                // job.schedule() performed only after the series of keypresses at after-change event
                    return;
        while (!monitor.isCanceled()) {
    }
                                queryModel.getSyntaxNode(),
        return this.context;
                                // awaiting reparse, so proceed to release lock and wait for the job to finish, then retry
                                }
                            } else {
            if (region == null && it.prev()) {
            }
        int reparseStart = regionToReparse.getOffset();
                    int endOffset = viewer.getBottomIndexEndOffset();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                if (DEBUG) {
                    log.debug("enqueueToReparse: queuedForReparse count is " + queuedForReparse.size());
    private void cancel() {
                                }
            this.ensureVisibleRangeIsParsed();
            return;
            ) {
                : dsContainer != null ? dsContainer.getScriptDialect().createInstance() : BasicSQLDialect.INSTANCE;
        }
                    return SQLQueryCompletionContext.prepareEmpty(0, completionRequestPosition.getOffset());
                }
                        }
                        }
            );
                    ) {
            if (DEBUG) {
                log.debug("}");
                    NodesIterator<QueuedRegionInfo> it = this.queuedForReparse.nodesIteratorAt(0);
    
                                    executionContext,
        synchronized (this.syncRoot) {
                    recognitionContext.reset();
    }
    @NotNull
            NodesIterator<QueuedRegionInfo> it = this.queuedForReparse.nodesIteratorAt(toParseStart);
        synchronized (this.syncRoot) {


        }
                editor.getDataSource(), editor.getSyntaxManager(), editor.getRuleManager(), document
        TextViewer viewer = this.editor.getTextViewer();
                int lastElementIndex = elements.size() - 1;

                if (viewer.getDocument() == null) {
            if (delta > 0) { // just expand the region to reparse
                this.editor.getTextViewer().addViewportListener(this.documentListener);
                if (monitor.isCanceled()) {
    private SQLDialect obtainCurrentSqlDialect(@Nullable DBCExecutionContext executionContext) {
        } else {
                    NodesIterator<QueuedRegionInfo> qit = this.queuedForReparse.nodesIteratorAt(requestOffset);
                for (var e : elements) {
            for (SQLScriptElement element : elements) {
            
            return;
            }
                    this.accomplishWork(workOffset, workLength);
        }
            }
            {
                regionOffset = it.getCurrOffset();
                }
        synchronized (this.syncRoot) {
        if (viewer == null || viewer.getDocument() == null) {

            }
 * DBeaver - Universal Database Manager
                        log.debug("beforeDocumentModification, delta <= 0: queuedForReparse count is " + queuedForReparse.size());
                {
                    log.debug("parsing " + workOffset + "+" + workLength);
            }
                            element.getText(),
        try {
                        elements.set(lastElementIndex, element);
                    }
            }
    };
    private void signalAccomplished() {
    @NotNull
                break;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                if (!actualFragment.properlyContains(workInterval)) {
            log.debug("ensureVisibleRangeIsParsed: knownRange is " + knownRange);
    @NotNull
                int firstAffectedReparseOffset;
    private SQLDocumentSyntaxContext getContext() {
        } finally {
                    workLength += docTailDelta;
                    }
        }
 * You may obtain a copy of the License at
    @NotNull
                                null
        } catch (Throwable ex) {
        }
    private void resetLastParsingFinishTime() {
    private volatile boolean isRunning = false;
                NodesIterator<QueuedRegionInfo> it = this.queuedForReparse.nodesIteratorAt(reparseStart);
                    this.document.removeDocumentListener(this.documentListener);

        }
                    return new Interval(startOffset, endOffset);
                }
        }
                                return SQLQueryCompletionContext.prepareCompletionContext(
                            element.getOriginalText(),
            }
                }
                this.knownRegionEnd = preservedRegion.b; 
                // for now removing the whole tail as its offsets are being invalidated
    public SQLQueryCompletionContext obtainCompletionContext(DBRProgressMonitor monitor, @NotNull Position completionRequestPosition) {
        @Override
            SQLDialect dialect = executionContext != null && executionContext.getDataSource() != null
        });

                    }
        do {
                        }
                reparseLength = this.editor.getTextViewer().getBottomIndexEndOffset() - reparseStart;
                        for (SQLQuerySymbolEntry entry : queryModel.getAllSymbols()) {
        // TODO if these further actions are heavy, maybe use background thread for them too
                }
import org.jkiss.dbeaver.ui.editors.EditorUtils;
                log.debug("{");

                                SQLDialect dialect = this.obtainCurrentSqlDialect(executionContext);
                                SQLQueryRecognitionProblemInfo.Severity.WARNING,
            }

            int delta = insertedLength - event.getLength();
 * Copyright (C) 2010-2025 DBeaver Corp and others
                monitor.subTask("Background query analysis: subtask #" + i + " of " + elements.size());
                            element instanceof SQLQuery queryElement && Boolean.TRUE.equals(queryElement.isEndsWithDelimiter())
                                );
        DBPPreferenceStore prefStore = this.editor.getActivePreferenceStore();
                    workLength = (it.getCurrValue() != null || it.prev())
                return Status.OK_STATUS;
                    IDocument document = this.editor.getTextViewer().getDocument();
                if (elements.size() > 1) {
        } catch (Throwable ex) {

            }
    }
    }

                    SQLScriptElement followingElement = SQLScriptParser.extractNextQuery(parserContext, lastElement, true);
            SQLQueryRecognitionContext recognitionContext = new SQLQueryRecognitionContext(
                }
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
            boolean useRealMetadata = this.isReadMetadataEnabled();
                        while (it.prev()) {
     */
                monitor, executionContext, useRealMetadata, validateFunctions, syntaxManager, dialect
                    log.debug("preserved is " + knownRegionStart + "-" + knownRegionEnd);
            this.lastParsingFinishStamp.complete(System.currentTimeMillis());
            this.context.clear();
            }
            } catch (InterruptedException | ExecutionException e) {
                            log.debug("registering script item @" + element.getOffset() + "+" + element.getLength());
    @NotNull
                this.lastParsingFinishStamp = new CompletableFuture<>();
 */
                } catch (BadLocationException e) {
                SQLScriptElement lastElement = elements.get(lastElementIndex);
                this.isRunning = true;
                region.length = Math.max(region.length, toParseStart + toParseLength - regionOffset);
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                textViewer.removeViewportListener(this.documentListener);
                    workLength = workInterval.length();
                    int requestOffset = completionRequestPosition.getOffset();
            this.resetLastParsingFinishTime();
        TextViewer viewer = this.editor.getTextViewer();
                if (scriptItem == null || this.queuedForReparse.size() == 0) {
                        lastElement = element;
    }
                while (it.next()) {
            this.job.schedule(delay);
            {
            this.job.cancel();
     */
                // TODO remove just the affected fragment and enqueue regionToReparse
        }
            SQLBackgroundParsingJob.this.beforeDocumentModification(event);
            this.length = length;
        if (actualFragment == null) {
                    }
                if (DEBUG) {
                this.knownRegionStart = preservedRegion.a;
        } while (!completionRequestPosition.isDeleted());
    private void doWork(DBRProgressMonitor monitor) throws BadLocationException {
        synchronized (this.syncRoot) {
                if (docTailDelta < 0) {
            monitor.beginTask("Background query analysis for " + editor.getTitle(), 1 + elements.size());
                }
                this.cancel();
        }
                    boolean positionIsQueued = region != null && (qit.getCurrOffset() + region.length >= requestOffset || region.length == Integer.MAX_VALUE);
import org.jkiss.dbeaver.model.sql.semantics.*;
    
            }
                }
                }
    private static int saturatedSum(int a, int b) {
    }
import org.jkiss.dbeaver.utils.ListNode;
            this.context.resetLastAccessCache();
            if (region != null && regionOffset <= toParseStart && regionOffset + region.length > toParseStart) {
                }
                this.job.cancel();
            if (event.getOffset() + insertedLength > this.editor.getTextViewer().getBottomIndexEndOffset()) {

            if (DEBUG) {
                        }
            synchronized (this.syncRoot) {
        @Override
                                    dialect
        @Override
                        ? SQLCommandModelRecognizer.recognizeCommand(
    private class DocumentLifecycleListener implements IDocumentListener, ITextInputListener, IViewportListener {
        }
    private final AbstractJob job = new AbstractJob("Background parsing job") {
            monitor.done();
    private void enqueueToReparse(int toParseStart, int toParseLength) {
        this.accomplishWork(parsedOffset, parsedLength);
                try {
    @NotNull
            if (this.editor.getTextViewer() != null) {
    }
        int reparseLength = 0;
                parserContext, workOffset, workLength, false, false, false
        synchronized (this.syncRoot) {
                this.signalAccomplished();
                                    " Displaying first " + SQLQueryRecognitionProblemInfo.PER_QUERY_LIMIT + " of them.",
            }
            if (textViewer != null) {
        @NotNull
                this.enqueueToReparse(reparseStart, reparseLength);
            }
            this.knownRegionStart = Math.min(this.knownRegionStart, parsedOffset);
            }
        synchronized (this.syncRoot) {

                }
/*
                    }
            }
        }
                        firstAffectedReparseOffset + it.getCurrValue().length > reparseStart + insertedLength
            viewer.invalidateTextPresentation(parsedOffset, parsedLength);

                    workLength = Math.max(workOffset + workLength, firstElement.getOffset() + firstElement.getLength());
                                DBCExecutionContext executionContext = this.editor.getExecutionContext();
    }
            this.knownRegionEnd = 0;
                            if (DEBUG) {
    private final Object syncRoot = new Object();
            && !prefStore.getBoolean(ModelPreferences.META_DISABLE_EXTRA_READ);
                }
            
        this.cancel();
                
        }
                
                    workOffset = workInterval.a;
                }
                        followingElement.getOffset() > lastElement.getOffset() + lastElement.getLength()) {
import org.jkiss.dbeaver.model.runtime.AbstractJob;
        int workOffset;
    
    private void setDocument(@Nullable IDocument newDocument) {
        public void documentAboutToBeChanged(DocumentEvent event) {
    private void reset() {
        if (DEBUG) {
        int startOffset = viewer.getTopIndexStartOffset();
                        ? (it.getCurrOffset() + it.getCurrValue().length - workOffset) : 0;
        } catch (DBException ex) {
                SQLBackgroundParsingJob.this.doWork(monitor);
                        this.document = document;
        try {
            );
                    firstVisibleLine = doc.getLineOfOffset(startOffset);
        int workLength;
                }
        IRegion regionToReparse = this.context.applyDelta(event.getOffset(), event.getLength(), insertedLength);
 *
                // TODO reparse only changed elements
                        SQLDocumentScriptItemSyntaxContext itemContext = this.context.registerScriptItemContext(
        }
            QueuedRegionInfo region = it.getCurrValue();
            if (newInput != null) {

                            }
    // TODO consider moving to utility class (see ImportProjectToTEHandler)
                        itemContext.refreshCompleted();
            final long requestStamp = System.currentTimeMillis();

            this.signalAccomplished();
                        if (scriptItem != null) { // TODO consider statements separation which is ignored for now
                    log.debug("doWork: queuedForReparse count is " + queuedForReparse.size());
        
    public void setup() {
                i++;
                // when the job is not scheduled yet (so join returns immediately)

            this.isRunning = false;
                this.reset();
import org.jkiss.dbeaver.ui.UIUtils;
        if (!knownRange.properlyContains(visibleRange)) {
                        elements.add(followingElement);

                    log.debug("    @" + e.getOffset() + "+" + e.getLength() + " " + (e instanceof SQLQuery q && q.isEndsWithDelimiter()));
    }
            CompletableFuture<Long> expectedParsingSessionFinishStamp;
import org.eclipse.jface.text.*;
                            ));
                        scriptItem = this.context.findScriptItem(requestOffset - 1);
        Interval visibleRange = new Interval(startOffset, endOffset);
                log.debug("known is " + knownRegionStart + "-" + knownRegionEnd);
    @Nullable
                        } else if (this.queuedForReparse.size() <= 0) {
        }
                                    log.debug("obtained model for " + scriptItem.item.getOriginalText());
            if (elements.isEmpty()) {
        public QueuedRegionInfo(int length) {
                reparseLength = event.getOffset() + insertedLength;
                this.document = newDocument;
                if (DEBUG) {
    public SQLDocumentSyntaxContext getCurrentContext() {
            return;
                }
    }
                SQLBackgroundParsingJob.this.setDocument(newInput);

                    this.queuedForReparse.removeAt(kn.data);
import org.jkiss.dbeaver.model.sql.*;
                log.debug("ensureVisibleRangeIsParsed: unknownRange is " + unknownRange);
        
            SQLSyntaxManager syntaxManager = this.editor.getSyntaxManager();
                    }
                    workOffset = (it.getCurrValue() != null || it.next()) ? it.getCurrOffset() : 0;
    }
                return;
            DBPDataSourceContainer dsContainer = EditorUtils.getInputDataSource(this.editor.getEditorInput());
        }

            List<SQLScriptElement> elements = SQLScriptParser.extractScriptQueries(
                this.resetLastParsingFinishTime();


    private IDocument document = null;
                }
        Interval actualFragment = UIUtils.syncExec(new RunnableWithResult<>() {
            }
                                    completionRequestPosition.getOffset(),
            this.signalAccomplished();
    }
            SQLParserContext parserContext = new SQLParserContext(
                !SQLEditorUtils.isSQLSyntaxParserApplied(this.editor.getEditorInput())
        } else {
            if (this.document != null) {

            if (workLength == 0) {
            reparseLength = regionToReparse.getLength();
            log.debug("ensureVisibleRangeIsParsed: visibleRange is " + visibleRange);
                            return SQLQueryCompletionContext.prepareOffquery(0, completionRequestPosition.getOffset());
                            queryModel,
                monitor.worked(1);
    @NotNull
import org.jkiss.dbeaver.ModelPreferences;
                IDocument doc = viewer.getDocument();
     * Setup job - add listeners, schedule
                {
            return Integer.MAX_VALUE;
 * See the License for the specific language governing permissions and
    private volatile int knownRegionEnd = 0;
            SQLBackgroundParsingJob.this.schedule(event);
                SQLScriptElement firstElement = SQLScriptParser.extractQueryAtPos(parserContext, workOffset, false);
                workOffset = elements.get(0).getOffset();
                    log.debug("Error while analyzing query text: " + element.getOriginalText(), ex);
            return BasicSQLDialect.INSTANCE;
            boolean validateFunctions = this.isValidateFunctionsEnabled();
        public void documentChanged(DocumentEvent event) {
            log.error(ex);
     */
                                if (DEBUG) {
        }
                // for now just cover the region of interest
            this.queuedForReparse.clear();

                newInput.addDocumentListener(this);
                            recognitionContext,
                                    scriptItem,

            } catch (BadLocationException e) {
                if (DEBUG) {
 *
    public SQLBackgroundParsingJob(@NotNull SQLEditorBase editor) {
            Interval unknownRange = visibleRange.differenceNotProperlyContained(knownRange);
                oldInput.removeDocumentListener(this);
    private static final long schedulingTimeoutMilliseconds = 500;
                    QueuedRegionInfo region = qit.getCurrValue() != null ? qit.getCurrValue() : (qit.prev() ? qit.getCurrValue() : null);
                    element = SQLScriptParser.extractQueryAtPos(parserContext, lastElement.getOffset(), false);
                if (workOffset == this.document.getLength() && workOffset > 0) {
            }

                        )
                    keyOffsetsToRemove = ListNode.push(keyOffsetsToRemove, firstAffectedReparseOffset);
                            if (scriptItem.item.isDirty()) {
                    log.debug("lastElement@" + elements.get(elements.size() - 1).getOffset() + ":" + elements.get(elements.size() - 1).getText());
            this.knownRegionStart = 0;
                this.editor.getTextViewer().addTextInputListener(this.documentListener);
            if (DEBUG) {
                    log.debug("beforeDocumentModification, delta > 0: queuedForReparse count is " + queuedForReparse);
            try {
                    log.debug("queued ranges total: " + this.queuedForReparse.size());
import org.jkiss.dbeaver.model.runtime.RunnableWithResult;
                    int rangeStart = doc.getLineOffset(Math.max(0, firstVisibleLine - visibleLinesCount * stepsToKeep));
        return prefStore.getBoolean(SQLModelPreferences.VALIDATE_FUNCTIONS) && this.isReadMetadataEnabled();
                SQLScriptElement element = SQLScriptParser.extractQueryAtPos(parserContext, elements.get(0).getOffset(), false);
        int parsedOffset = workOffset;
                            element.getLength(),
        }
                }
            int regionOffset = it.getCurrOffset();
                } catch (Throwable ex) {
                    break;
                if (firstElement != null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        return prefStore.getBoolean(SQLModelPreferences.READ_METADATA_FOR_SEMANTIC_ANALYSIS)
    private void ensureVisibleRangeIsParsed() {
                    return new Interval(rangeStart, rangeEnd);
            public Interval runWithResult() {
                // proceed with job cancellation check
                // as we've dropped what is outside already, so not point to parse outside of it
                        log.debug("requested " + workOffset + "+" + workLength);
                    workOffset--;
                    {
import org.jkiss.dbeaver.DBException;
            SQLBackgroundParsingJob.this.ensureVisibleRangeIsParsed();
    }
                            // no script items here, so fallback to offquery context
                    workOffset = Math.min(workOffset, firstElement.getOffset());
                        );
                if (it.getCurrValue() != null || it.prev()) {
            if (DEBUG) {
import java.util.List;
import org.jkiss.code.NotNull;
    /**
    }
    private final DocumentLifecycleListener documentListener = new DocumentLifecycleListener();
            } else {
            }
import org.jkiss.dbeaver.model.sql.parser.SQLScriptParser;
            return dialect;
        }
        Interval knownRange = new Interval(this.knownRegionStart, this.knownRegionEnd);
                }
        }

                if (lastElement == null) {
    }
                SQLScriptElement lastElement = elements.get(elements.size() - 1);
                    keyOffsetsToRemove = ListNode.push(keyOffsetsToRemove, it.getCurrOffset());

        }
        }
            }
                    if (element != null) {
    }
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorUtils;
                try {

            // enlarge existing or add enqueue new one
                // drop unnecessary items

import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;
                return;
            return r;
            }
                            element.getOffset(),
    private void schedule(@Nullable DocumentEvent event) {
                    if (document != null) {
                region = it.getCurrValue();
                    return null;
                                null,
                    SQLQueryModel queryModel = element instanceof SQLControlCommand
            this.cancel();
                // truncate work region to fit within actualFragment,


        }
    private static <T> T getFutureOrCancel(Future<T> future, IProgressMonitor monitor) throws ExecutionException, InterruptedException {
 * Unless required by applicable law or agreed to in writing, software
            try {
                
                if (DEBUG) {
    }
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryModel;
    private static class QueuedRegionInfo {
                        this.document.addDocumentListener(this.documentListener);
    /**
                    if (DEBUG) {
        this.editor = editor;
    private final OffsetKeyedTreeMap<QueuedRegionInfo> queuedForReparse = new OffsetKeyedTreeMap<>();
                }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.antlr.v4.runtime.misc.Interval;

                            this.editor instanceof SQLEditor e ? e.getGlobalScriptContext() : null
            } catch (TimeoutException e) {
        DBPPreferenceStore prefStore = this.editor.getActivePreferenceStore();
                int firstVisibleLine = 0;
    private boolean isReadMetadataEnabled() {
    // TODO consider if we don't need such a detailed collection for reparse regions, and one expandable input region is enough
        @Override
            }

                    if (queryModel != null) {
                        log.debug("remove " + kn.data + "+" + this.queuedForReparse.find(kn.data).length);
        public void inputDocumentChanged(IDocument oldInput, IDocument newInput) {
                workLength = lastElement.getOffset() + lastElement.getLength() - workOffset;
            }
                textViewer.removeTextInputListener(this.documentListener);
                    workInterval = actualFragment.intersection(workInterval);
                                    log.debug("awaiting reparse");
                if (this.document == null) {
        });
                }
import org.jkiss.dbeaver.model.sql.semantics.OffsetKeyedTreeMap.NodesIterator;
    private void accomplishWork(int parsedOffset, int parsedLength) {

                    log.debug("firstElement@" + elements.get(0).getOffset() + ":" + elements.get(0).getText());
        if (viewer == null || this.editor.getRuleManager() == null) {
        public void viewportChanged(int verticalOffset) {
                        List<SQLQueryRecognitionProblemInfo> problems = recognitionContext.getProblems();
    @NotNull
                }
            monitor.worked(1);
        synchronized (this.syncRoot) {
            }
        synchronized (this.syncRoot) {
            }
                ? executionContext.getDataSource().getSQLDialect()
 * distributed under the License is distributed on an "AS IS" BASIS,
            synchronized (this.syncRoot) {

            return;
                        : SQLQueryModelRecognizer.recognizeQuery(recognitionContext, element.getOriginalText());
                            itemContext.registerToken(entry.getInterval().a, entry);
                if (getFutureOrCancel(expectedParsingSessionFinishStamp, monitor.getNestedMonitor()) < requestStamp) {
                        }
import org.eclipse.core.runtime.IStatus;
                
        }
        }
import org.eclipse.core.runtime.jobs.Job;
                    }
    private void beforeDocumentModification(DocumentEvent event) {

 * limitations under the License.
                log.debug(e);
                return;
            this.enqueueToReparse(unknownRange.a, unknownRange.length());
import org.jkiss.code.Nullable;
                    workLength++;
import org.eclipse.core.runtime.IProgressMonitor;

                    }
                    // the offset may be covered by adjacent scriptItem but still queued due to actual scriptItem being temporarily dropped
     * Prepare completion context for the specified position in the text
            DBCExecutionContext executionContext = this.editor.getExecutionContext();
        }
        if (regionToReparse.getLength() < Integer.MAX_VALUE) {
            }
            }
 * you may not use this file except in compliance with the License.

    /**
                }
    private volatile CompletableFuture<Long> lastParsingFinishStamp = new CompletableFuture<>() { { this.complete(0L); } };
        if (r < a || r < b) {
