                            case PARTIALLY_VALID: // do nothing, proposals will be filtered with validation when supported
            return false;
        for (Template template : editor.getTemplatesPage().getTemplateStore().getTemplates()) {
        public boolean updatePresentation(int documentPosition, TextPresentation presentation)
        }
                // The cursor is positioned before the initial request offset,
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;
    {
    /**


    }

        }
    ) {
import org.eclipse.jface.text.contentassist.*;
    public String getErrorMessage()
        String contentType;
                            case VALID: // do nothing, all proposals are ok
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionProposalBase;
                        SQLEditorQueryCompletionAnalyzer newAnalyzer = new SQLEditorQueryCompletionAnalyzer(

        @NotNull List<Supplier<ProposalsComputationJobHolder>> completionJobSuppliers
            contentType = TextUtilities.getContentType(document, SQLParserPartitions.SQL_PARTITIONING, documentOffset, true);
        protected IStatus run(@NotNull DBRProgressMonitor monitor) {
import org.jkiss.dbeaver.model.sql.registry.SQLCommandHandlerDescriptor;
import java.util.stream.Collectors;
        return useKeystrokes ? ".abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_$".toCharArray() : new char[] {'.', };
            // There were extra insertions at the moment when the job didn't handle them on the fly.
        return lookupTemplates;

            // prepared proposals are not relevant anymore.
                        if (dataSource != null) {
                if (selection instanceof TextSelection) {
    }

import org.jkiss.code.Nullable;
                    }
                ISelection selection = viewer.getSelectionProvider().getSelection();
                            request,



    public ICompletionProposal[] computeCompletionProposals(
        List<ProposalsComputationJobHolder> completionJobs = completionJobSuppliers.stream()
                }
        if (document == null) {
                                    }
        try {
        final String controlCommandPrefix = editor.getSyntaxManager().getControlCommandPrefix();
        final SQLCompletionRequest request = new SQLCompletionRequest(
    private static ProposalsJobResultStatus evaluateJobResult(SQLCompletionRequest request, int jobProposalsOrigin, int currentCursorPosition) {
}
            try {
//            if (IDENTIFIER_PART_PATTERN.matcher(unconsideredInput).matches()) {
                    List<Supplier<ProposalsComputationJobHolder>> completionJobSuppliers = new ArrayList<>();
    private class NewProposalSearchJob extends AbstractJob {
                // all the jobs succeed, validate if the result is applicable
                                        return analyzer.getProposals();
    }
                            completionJobSuppliers.add(() -> {
     */
    private class CompletionListener implements ICompletionListener, ICompletionListenerExtension {
                return ProposalsJobResultStatus.ABORT;
                    if (cp instanceof ICompletionProposal proposal && (
import org.eclipse.jface.text.*;
                        log.debug(e);
        return VALIDATOR;
import org.jkiss.dbeaver.model.sql.registry.SQLCommandsRegistry;
//                return ProposalsJobResultStatus.INVALID;
                            () -> completionRequestPosition.getOffset()
//            try {
    public static void setLookupTemplates(boolean lookupTemplates) {
            }
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorUtils;
            if (currentCursorPosition < request.getDocumentOffset()) {

import org.jkiss.dbeaver.model.runtime.DBRRunnableParametrized;

        public void assistSessionEnded(ContentAssistEvent event) {
    {
        SQLWordPartDetector wordDetector = request.getWordDetector();
    /**
    {
        public void install(IContextInformation info, ITextViewer viewer, int offset)
                case SQLParserPartitions.CONTENT_TYPE_SQL_STRING:
                    editor);
     * demonstrate the action
    }

                    templateContext.setVariable(GlobalTemplateVariables.SELECTION, ((TextSelection) selection).getText());
                String typeAtLine = TextUtilities.getContentType(document, SQLParserPartitions.SQL_PARTITIONING, documentOffset - 1, true);
                            @Override
     *
        String wordPart = request.getWordPart().toLowerCase();
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionActivityTracker;
    @Override
        }
        }
                    SQLAutocompletionMode mode = SQLAutocompletionMode.fromPreferences(store);
            }
                ) {
    @Override
                            case INVALID: // job restart required
    }
import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants;
                default:
    }
            SQLCompletionProcessor.setSimpleMode(event.isAutoActivated);
        }


        @Override
import org.eclipse.core.runtime.IStatus;
 */
        if (contentType == null) {
        }

                    } catch (BadLocationException e) {
                        completionJobSuppliers.add(() -> new ProposalsComputationJobHolder(new NewProposalSearchJob(newAnalyzer)) {
                    }
    public char[] getContextInformationAutoActivationCharacters()
 */
                return monitor.isCanceled() ? Status.CANCEL_STATUS : Status.OK_STATUS;
                        && store.getBoolean(SQLPreferenceConstants.ADVANCED_HIGHLIGHTING_ENABLE)
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
            }
                        return makeTemplateProposals(viewer, request);
            }
        }
import org.jkiss.utils.ArrayUtils;
                && SQLEditorUtils.isTemplateContextFitsEditorContext(template.getContextTypeId(), editor)
 *
        PARTIALLY_VALID,
                        result.add(proposal);
 *     http://www.apache.org/licenses/LICENSE-2.0

        // Proposals were successfully prepared by the job,
            int actualCompletionOffset = completionRequestPosition.getOffset();
        @Override

     * characters around its popup location.
    }
                        ) {
        public final AbstractJob job;
    public IContextInformationValidator getContextInformationValidator()
            return new ICompletionProposal[0];
            log.debug(e);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

                        if (commandPrefix != null && wordDetector.getStartOffset() >= commandPrefix.length() &&
        }
            try {
        return null;
        for (SQLCommandHandlerDescriptor command : SQLCommandsRegistry.getInstance().getCommandHandlers()) {
                    monitor.subTask("Find proposals");
            }

import org.eclipse.jface.text.templates.TemplateProposal;
            }
            .map(Supplier::get).collect(Collectors.toList()); // modifiable list!
            if (actualCompletionOffset != request.getDocumentOffset()) {
        @NotNull
            // There were removals earlier than completion list appeared on the screen, so
    static void setSimpleMode(boolean simpleMode) {
package org.jkiss.dbeaver.ui.editors.sql.syntax;

                for (Object cp : proposals) {
            simpleMode = true;
                log.error(e);
            } else {
                    }
                // The cursor is positioned before the initial request offset.

                            }
                                return newAnalyzer.getActualContextOffset();
        public boolean isContextInformationValid(int offset)

    @Nullable
            }
                for (Object cp : proposals) {
            } catch (Throwable e) {
        public void assistSessionStarted(ContentAssistEvent event) {
            this.analyzer = analyzer;
        }
        ProposalSearchJob(DBRRunnableParametrized<DBRProgressMonitor> analyzer) {
                        String commandPrefix = editor.getSyntaxManager().getControlCommandPrefix();
                        }
                    if (editor.getDataSource() != null) {
    @Nullable
        }
                            public Integer getProposalsOriginOffset() {
    }
            document,
                if (SQLParserPartitions.CONTENT_TYPE_SQL_COMMENT.equals(typeAtLine)
                    break;
        final List<SQLCommandCompletionProposal> commandProposals = new ArrayList<>();
                    }
                    }
 * distributed under the License is distributed on an "AS IS" BASIS,
            prefix = prefix.substring(controlCommandPrefix.length());
            document.removePosition(completionRequestPosition);
        ITextViewer viewer,
        public abstract Integer getProposalsOriginOffset();
        public void selectionChanged(ICompletionProposal proposal, boolean smartToggle) {



                // The inserted text fragment can be considered as part of a certain word or identifier,
                monitor.worked(1);

        private final SQLEditorQueryCompletionAnalyzer analyzer;
//                // The word structure was disrupted by non-identifier characters, so lets restart the job.
        result[0] = new ContextInformation(statementInfo.getText(), statementInfo.getText());
        try {

            } else {
    }
        } finally {
                }
                                        // This is wrong, but old implementation ignores this fact,
    private static boolean simpleMode = false;
 *
import org.jkiss.utils.CommonUtils;
    }
                return Status.CANCEL_STATUS;
                    break;
            simpleMode = false;
                        result.add(proposal);
                monitor.beginTask("Seeking for SQL completion proposals", 1);
            return new ICompletionProposal[0];
                                        // Possible solution: support request object recreation when job restart needed.
                // and previous position belongs to the single-line comment or command

     * some context help relevant to SQL. It just hard codes two strings to
     * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#computeContextInformation(ITextViewer,
        public NewProposalSearchJob(SQLEditorQueryCompletionAnalyzer analyzer) {

                return Collections.emptyList();
    public static boolean isLookupTemplates() {
                            return makeCommandProposals(request, request.getWordPart());
                monitor.beginTask("Seeking for SQL completion proposals", 2);
        @Override
                for (int i = 0; i < completionJobs.size(); i++) {
                                        // Actual origin for old analyzer's proposals is always request.getDocumentOffset(),
        private final DBRRunnableParametrized<DBRProgressMonitor> analyzer;
    }
                    null));
        this.editor = editor;
    }

/**
                    }
            if (template.getName().toLowerCase().startsWith(wordPart)
            LinkedHashSet<ICompletionProposal> result = new LinkedHashSet<>(proposals.size());
    @NotNull
                                SQLCompletionAnalyzer analyzer = new SQLCompletionAnalyzer(request);
        } else if (jobProposalsOrigin < currentCursorPosition) {
                        DBExecUtils.tryExecuteRecover(monitor, editor.getDataSource(), this.analyzer);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.jface.text.templates.Template;
                        ProposalsJobResultStatus jobResultStatus = evaluateJobResult(request, origin, currentOffset);
        }
        {
                return ProposalsJobResultStatus.INVALID;
            return null;
 * Copyright (C) 2010-2025 DBeaver Corp and others
                }
    @Nullable
                        || !(cp instanceof ICompletionProposalExtension2)
                    // so we should be able to recreate the whole job object including all its non-reusable dependencies.
        IDocument document = editor.getDocument();
                        switch (jobResultStatus) {
import org.jkiss.dbeaver.model.sql.parser.SQLWordPartDetector;
        }
            SQLCompletionActivityTracker activityTracker =
    private final SQLEditorBase editor;
        int documentOffset
    }
        // Templates
                    monitor.subTask("Find proposals");
        this.contentAssistant = contentAssistant;
    public SQLCompletionProcessor(SQLEditorBase editor)
                }


//            String unconsideredInput = null;
                // Eclipse drops completions list in this case anyway.
            this.contentAssistant.setLastCompletionOffset(actualCompletionOffset);
                                return Collections.emptyList();
    }
 * limitations under the License.
    @Override
//                unconsideredInput = request.getDocument().get(jobProposalsOrigin, currentCursorPosition - jobProposalsOrigin);
                // but the job handled some insertions, which were then removed.

        if (jobProposalsOrigin > currentCursorPosition) {
            hasRunningJobs = false;
                    Integer origin = completionJobs.get(i).getProposalsOriginOffset();
            }
        VALID,
                    DBExecUtils.tryExecuteRecover(monitor, editor.getDataSource(), analyzer);
                        this.analyzer.run(monitor);
        @Override
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionRequest;
                        && dataSource != null && dataSource.getSQLDialect() instanceof BasicSQLDialect;
            log.debug(e);
                    viewer.getDocument(),

import org.jkiss.dbeaver.Log;
                        (cp instanceof ICompletionProposalExtension2 exp && exp.validate(request.getDocument(), completionRequestPosition.getOffset(), null))
    private static final IContextInformationValidator VALIDATOR = new Validator();
            }
                    // UIUtils.waitJobCompletion(..) uses job.isFinished() which is not dropped on reschedule,
//                log.error("Failed to prepare completion proposals", e);
import org.eclipse.jface.viewers.ISelection;
                    DBPDataSource dataSource = editor.getDataSource();
            return new ICompletionProposal[0];

            super("Search proposals...");
            this.job.schedule();
        List<?> proposals;

 * Licensed under the Apache License, Version 2.0 (the "License");
                // so it's enough to do proposals validation to filter them out.
    private class ProposalSearchJob extends AbstractJob {
                    proposals = Collections.emptyList();
    @Override
                    if (request.getWordPart() != null && mode.useOldAnalyzer || !useNewCompletionEngine) {
    {
        ABORT
                    if (origin != null) {
import org.jkiss.code.NotNull;
        }
        // so we are synchronously creating a position object to track the location of interest, instead of the documentOffset
                        });
        SQLScriptElement statementInfo = editor.extractQueryAtPos(documentOffset);

            fInstallOffset = offset;
        while (hasRunningJobs) {

import org.jkiss.dbeaver.model.runtime.AbstractJob;
        // Accurate proposals preparation requires cursor position of where the user stops editing the text,
        @NotNull


        }
        }
                    monitor.done();
        public abstract List<?> getProposals();
import org.eclipse.core.runtime.Status;
        return result;
        }
                    new Region(request.getDocumentOffset(), 0),
        }
                                break;
import org.jkiss.dbeaver.model.sql.SQLScriptElement;
            IRegion line = document.getLineInformationOfOffset(documentOffset);
/*
 * See the License for the specific language governing permissions and
    {
        }
        {
     * This method is incomplete in that it does not implement logic to produce

 * The SQL content assist processor. This content assist processor proposes text
    public IContextInformation[] computeContextInformation(
                            }
        // asynchronously with the editor's state modifications due to waitJobCompletion(..) usage, which forcibly pumps UI event loop.
                    if (useNewCompletionEngine) {
                                };
     *      int)
            this.job = job;
                                // old analyzer is not reusable, but it doesn't matter because see the next comment below
        if (prefix.startsWith(controlCommandPrefix)) {
                }
        request.setContentType(contentType);
import org.jkiss.dbeaver.ui.editors.sql.templates.SQLContext;
                    template,
    protected static class Validator implements IContextInformationValidator, IContextInformationPresenter
    private abstract static class ProposalsComputationJobHolder {
        @Override
                try {
            }
            simpleMode
 *
            return ArrayUtils.toArray(ICompletionProposal.class, result);
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionAnalyzer;
                                    public Integer getProposalsOriginOffset() {
            setUser(false);
    }
            editor.getCompletionContext(),
        } catch (BadLocationException e) {
        if (statementInfo == null || CommonUtils.isEmpty(statementInfo.getText())) {
                    return new ICompletionProposal[0];
                                break;
//                return ProposalsJobResultStatus.ABORT;
                                    }
                                        return null;
                        && store.getBoolean(SQLPreferenceConstants.READ_METADATA_FOR_SEMANTIC_ANALYSIS)
            return new ICompletionProposal[0];
        public void assistSessionRestarted(ContentAssistEvent event) {
import org.jkiss.dbeaver.model.DBPDataSource;
import org.eclipse.jface.text.templates.GlobalTemplateVariables;
 * Unless required by applicable law or agreed to in writing, software
    {
                            monitor -> this.editor.obtainCompletionContext(monitor, completionRequestPosition),
        return null;
            if (documentOffset <= line.getLength() + line.getOffset() && line.getLength() > 0) { // we are in the nonempty line
                proposal instanceof SQLCompletionProposalBase p ? p.getRequest().getActivityTracker() : null;
    {

        boolean hasRunningJobs = true;
        }
                case IDocument.DEFAULT_CONTENT_TYPE:
                    proposals = this.computeProposalsWithJobs(request, completionRequestPosition, completionJobSuppliers);

import org.jkiss.dbeaver.model.sql.parser.SQLParserPartitions;
                        }
import java.util.*;
                            viewer.getDocument().get(wordDetector.getStartOffset() - commandPrefix.length(), commandPrefix.length()).equals(commandPrefix)

    }
import org.jkiss.dbeaver.model.exec.DBExecUtils;
                            default:
                templateProposals.add(new SQLTemplateCompletionProposal(

        public ProposalsComputationJobHolder(AbstractJob job) {
                SQLContext templateContext = new SQLContext(
    ) {
                    DBPPreferenceStore store = this.editor.getActivePreferenceStore();
    private enum ProposalsJobResultStatus {
    public char[] getCompletionProposalAutoActivationCharacters()

                return ProposalsJobResultStatus.PARTIALLY_VALID;
                            });
            return Math.abs(fInstallOffset - offset) < 5;
                    SQLTemplatesRegistry.getInstance().getTemplateContextRegistry().getContextType(template.getContextTypeId()),
            contentAssistant.setLastCompletionOffset(-1);
public class SQLCompletionProcessor implements IContentAssistProcessor {
                }
//            } catch (BadLocationException e) {
                    } else {
     */

            setSystem(true);
        @Override
    private static boolean lookupTemplates = false;
                case SQLParserPartitions.CONTENT_TYPE_SQL_QUOTED:
                        );
                commandProposals.add(new SQLCommandCompletionProposal(request, command));
                // Let's restart the job.
                activityTracker.selectionChanged();
        final List<SQLTemplateCompletionProposal> templateProposals = new ArrayList<>();
        }
                            public List<?> getProposals() {


                    }
        @NotNull SQLCompletionRequest request,
            editor.extractQueryAtPos(documentOffset),
        @Override
                } finally {
//            } else {
import java.util.function.Supplier;

 * you may not use this file except in compliance with the License.

                    if (cp instanceof ICompletionProposal proposal) {
import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants.SQLAutocompletionMode;
                                        // which may be out of sync with cursor position at the time of analysis being accomplished.
                try {
        // but they still might be a bit out-of-sync with the cursor position.
                                    @Override
import org.jkiss.dbeaver.ui.editors.sql.semantics.SQLEditorQueryCompletionAnalyzer;
//            }
        @NotNull Position completionRequestPosition,
        return completionJobs.stream().flatMap(j -> j.getProposals().stream()).toList();
                    boolean useNewCompletionEngine = mode.useNewAnalyzer
        IContextInformation[] result = new IContextInformation[1];


                                        // so for now we explicitly pretend that it is always in sync with current cursor position.
        int fInstallOffset;
                                return newAnalyzer.getResult();
            return ProposalsJobResultStatus.VALID;
        // (which is where the proposals computation was initially triggered, not where it is really expected to get them).
            if (command.getId().startsWith(prefix)) {
            switch (contentType) {
import org.jkiss.dbeaver.ui.UIUtils;
                            case ABORT:
        );
    private ICompletionProposal[] makeCommandProposals(SQLCompletionRequest request, String prefix) {
                    monitor.done();
    private SQLContentAssistant contentAssistant;
            if (completionJobs.stream().anyMatch(j -> j.job.isCanceled())) {
                return Status.OK_STATUS;
        }
        @Override
        try {


        }
            } catch (Throwable e) {
                    try {
                return Status.CANCEL_STATUS;
                                hasRunningJobs = true;
    @Override

            // wait for jobs to run asynchronously
    private List<?> computeProposalsWithJobs(
            documentOffset,

        Position completionRequestPosition = new Position(documentOffset);
            // if any job was cancelled while running in background, break the whole proposals computation logic
        {
import org.jkiss.dbeaver.model.sql.semantics.completion.SQLQueryCompletionProposal;
                                    public List<?> getProposals() {
        return commandProposals.toArray(new ICompletionProposal[0]);
        protected IStatus run(@NotNull DBRProgressMonitor monitor) {
                int currentOffset = completionRequestPosition.getOffset();
                                    @Override
            // Check that word start position is in default partition (#5994)
        templateProposals.sort(Comparator.comparing(TemplateProposal::getDisplayString));
    public void initAssistant(SQLContentAssistant contentAssistant) {
        SQLCompletionProcessor.lookupTemplates = lookupTemplates;
                } finally {
    @Override
                        // new analyzer is reusable
        return templateProposals.toArray(new ICompletionProposal[0]);
                        document.addPosition(completionRequestPosition);
        } else {
                            @Override
            this.analyzer = analyzer;
    }
            super("Analyzing query for proposals...");
            } else {
    }
            completionJobs.forEach(j -> UIUtils.waitJobCompletion(j.job));
    private static final Log log = Log.getLog(SQLCompletionProcessor.class);

            if (activityTracker != null) {

        boolean useKeystrokes = editor.getActivePreferenceStore().getBoolean(SQLPreferenceConstants.ENABLE_KEYSTROKE_ACTIVATION);
                proposal instanceof SQLQueryCompletionProposal p ? p.getProposalContext().getActivityTracker() :
                    }
    }
        ITextViewer viewer, int documentOffset)
        SQLCompletionProcessor.simpleMode = simpleMode;
//            }
        } catch (BadLocationException e) {
                        }
        INVALID,
        // This method blocks UI thread to prepare proposals, but in our implementation actual analysis performed in background jobs
        contentAssistant.addCompletionListener(new CompletionListener());
 * completions and computes context information for a SQL content type.
    private ICompletionProposal[] makeTemplateProposals(ITextViewer viewer, SQLCompletionRequest request) {
import org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect;
                    || SQLParserPartitions.CONTENT_TYPE_SQL_CONTROL.equals(typeAtLine)
                log.error(e);
                    new Position(request.getWordDetector().getStartOffset(), request.getWordDetector().getLength()),
                    templateContext,
    }
        @Override
import org.jkiss.dbeaver.ui.editors.sql.templates.SQLTemplatesRegistry;
     * Simple content assist tip closer. The tip is valid in a range of 5
                    if (lookupTemplates) {
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
    }
                                completionJobs.set(i, completionJobSuppliers.get(i).get());
import org.jkiss.dbeaver.ui.editors.sql.templates.SQLTemplateCompletionProposal;
                }
        }
                                return new ProposalsComputationJobHolder(new ProposalSearchJob(analyzer)) {
            contentAssistant.assistSessionStarted(event);
                    )) {
            ) { 
