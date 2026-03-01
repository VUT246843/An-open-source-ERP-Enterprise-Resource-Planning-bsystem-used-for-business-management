            p -> (p.descriptor == null || p.descriptor.handlesAnnotation(annotation)) && p.processor.canFix(annotation)

import java.util.ArrayList;
            }
        @NotNull
 */
}
    public String getErrorMessage() {
        } else {
import java.util.stream.Collectors;
    public boolean canAssist(@NotNull IQuickAssistInvocationContext invocationContext) {
        ICompletionProposal[] proposals = processors.stream()
import org.jkiss.utils.CommonUtils;
 *
import org.eclipse.jface.text.quickassist.IQuickAssistInvocationContext;

import org.jkiss.dbeaver.Log;
    }
        for (SQLEditorQuickFixProcessorDescriptor d : quickFixProcessorDescriptors) {
            p -> (p.descriptor == null || p.descriptor.isEnabled(editor.getEditorSite())) && p.processor.canAssist(invocationContext)
        new NoCompletionsProposal()

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.DBException;
    };
    }
            try {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;
        SQLEditorQuickFixProcessorDescriptor descriptor,
    private static final ICompletionProposal[] noSuggestionsProposal =  new ICompletionProposal[] {
    }
                log.error("Can't load quick fix handler '" + d.getId() + "'", e);
import org.jkiss.utils.ArrayUtils;

        return processors.stream().anyMatch(
        );
        );
import org.eclipse.jface.text.contentassist.ICompletionProposal;
        processors.add(new QuickFixHandler(null, quickAssistProcessor));
        }
import java.util.List;
        IQuickAssistProcessor processor
    }
    public SQLEditorQuickAssistProcessor(@NotNull SQLEditorBase editor) {
    private final List<QuickFixHandler> processors = new ArrayList<>();

                processors.add(new QuickFixHandler(d, d.createInstance()));
    public ICompletionProposal[] computeQuickAssistProposals(@NotNull IQuickAssistInvocationContext invocationContext) {

    @Override
    @Override
            return errorMessages.stream().filter(CommonUtils::isNotEmpty).distinct().collect(Collectors.joining("\n"));
        return processors.stream().anyMatch(
package org.jkiss.dbeaver.ui.editors.sql.addins;
import org.jkiss.code.Nullable;
    private final SQLEditorBase editor;
 * Unless required by applicable law or agreed to in writing, software
        List<String> errorMessages = processors.stream().map(p -> p.processor.getErrorMessage()).toList();
        @Nullable

        }
            .filter(p -> !(p instanceof NoCompletionsProposal))
            return null;
    @NotNull
 * See the License for the specific language governing permissions and
    }
    public void appendProcessor(@NotNull IQuickAssistProcessor quickAssistProcessor) {
import org.eclipse.jface.text.source.Annotation;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
        this.editor = editor;
    public void appendProcessors(@NotNull Collection<SQLEditorQuickFixProcessorDescriptor> quickFixProcessorDescriptors) {
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,

    @Nullable
 * limitations under the License.
import java.util.Arrays;

    public boolean canFix(@NotNull Annotation annotation) {
        return ArrayUtils.isEmpty(proposals) ? noSuggestionsProposal : proposals;
            .flatMap(p -> Arrays.stream(p.processor.computeQuickAssistProposals(invocationContext)))
public class SQLEditorQuickAssistProcessor implements IQuickAssistProcessor {
    private record QuickFixHandler(
import org.eclipse.jface.text.quickassist.IQuickAssistProcessor;
import java.util.Collection;

 * you may not use this file except in compliance with the License.

    @NotNull
    }
        if (errorMessages.stream().anyMatch(CommonUtils::isEmpty)) {
 *
    }

 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
import org.eclipse.ui.internal.texteditor.spelling.NoCompletionsProposal;
            .toArray(ICompletionProposal[]::new);

import org.jkiss.code.NotNull;
    @NotNull

            } catch (DBException e) {
/*
    @Override
    @Override
    }
    ) {
    private static final Log log = Log.getLog(SQLEditorQuickAssistProcessor.class);
