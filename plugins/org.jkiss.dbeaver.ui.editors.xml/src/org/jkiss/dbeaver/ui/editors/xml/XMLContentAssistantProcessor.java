import org.eclipse.jface.text.contentassist.IContextInformation;
    public IContextInformationValidator getContextInformationValidator() {
    public char[] getContextInformationAutoActivationCharacters() {
        return null;
 * distributed under the License is distributed on an "AS IS" BASIS,
    public IContextInformation[] computeContextInformation(ITextViewer viewer,
    }
 * See the License for the specific language governing permissions and
    }
        return new ICompletionProposal[0];
        return null;

 *
        return null;
 * DBeaver - Universal Database Manager
    }

 * Copyright (C) 2010-2024 DBeaver Corp and others
}

        return null;
                                                           int offset) {

 *
    public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer,
                                                            int offset) {
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
package org.jkiss.dbeaver.ui.editors.xml;

public class XMLContentAssistantProcessor implements IContentAssistProcessor {


 */
    public char[] getCompletionProposalAutoActivationCharacters() {
 * you may not use this file except in compliance with the License.
        return new char[]{'a'};
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 * You may obtain a copy of the License at
import org.eclipse.jface.text.ITextViewer;
 *
import org.eclipse.jface.text.contentassist.ICompletionProposal;

 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.


    }
/*
    public String getErrorMessage() {
