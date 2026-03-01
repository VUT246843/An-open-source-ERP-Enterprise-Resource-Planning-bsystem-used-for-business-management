
		try {
	}
            if (!replacementString.equals(sqlVariable.getCurrentChoice())) {

	}
        // Reset variable settings
*/
 * http://www.eclipse.org/legal/epl-v10.html

 * @since 3.0
    public SQLVariableCompletionProposal(TemplateVariable variable, String replacementString, Position replacementPosition, int cursorPosition) {
/*******************************************************************************
	public void apply(IDocument document) {
		}
 * which accompanies this distribution, and is available at
	/** The string to be displayed in the completion proposal popup */

            SQLVariable sqlVariable = (SQLVariable) variable;
		apply(viewer.getDocument());
	public Point getSelection(IDocument document) {
		this.additionalProposalInfo = additionalProposalInfo;

 * Contributors:
import org.eclipse.jface.text.*;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
	}
/**

	}
 *******************************************************************************/
			String content= document.get(replacementPosition.getOffset(), offset - replacementPosition.getOffset());
			if (replacementString.startsWith(content))
	private IContextInformation contextInformation;

	public boolean validate(IDocument document, int offset, DocumentEvent event) {
 */
	}
		this.cursorPosition = cursorPosition;
	private int cursorPosition;
import org.eclipse.jface.text.contentassist.ICompletionProposalExtension2;

 * All rights reserved. This program and the accompanying materials
			return displayString;

import org.eclipse.jface.text.templates.TemplateVariable;
            }
		this.contextInformation = contextInformation;
		this.image = image;
import org.eclipse.core.runtime.Assert;
                            resolver.resolve(var, sqlVariable.getContext());
	private String replacementString;
                }
		return image;

/*
	/** The context information of this proposal */
        if (variable instanceof SQLVariable) {
	public void unselected(ITextViewer viewer) {
	}
		} catch (BadLocationException x) {
	}
	 * @see ICompletionProposal#apply(IDocument)

	/** The replacement position. */
 * A position based completion proposal.
		return replacementString;
			// ignore
	private String displayString;
	}
import org.eclipse.jface.text.contentassist.IContextInformation;
	public String getAdditionalProposalInfo() {
		this.replacementString = replacementString;
        }
	/** The image to be displayed in the completion proposal popup */
	public String getDisplayString() {
	}
                sqlVariable.setCurrentChoice(replacementString);
                for (SQLVariable var : sqlVariable.getContext().getVariables()) {

import org.eclipse.swt.graphics.Point;
	public void selected(ITextViewer viewer, boolean smartToggle) {
		this.replacementPosition = replacementPosition;
		return additionalProposalInfo;

	}
	private String additionalProposalInfo;
		}
	public void apply(ITextViewer viewer, char trigger, int stateMask, int offset) {
	/** The additional info of this proposal */
 *
                    if (var != sqlVariable) {
    }
 *     IBM Corporation - initial API and implementation
	/*
}
	 */
		return contextInformation;
	private Position replacementPosition;

	}
package org.jkiss.dbeaver.ui.editors.sql.templates;
	private Image image;
	public SQLVariableCompletionProposal(TemplateVariable variable, String replacementString, Position replacementPosition, int cursorPosition, Image image, String displayString, IContextInformation contextInformation, String additionalProposalInfo) {
				return true;
	public IContextInformation getContextInformation() {
        this.variable = variable;
		if (displayString != null)
		this.displayString = displayString;
		this(variable, replacementString, replacementPosition, cursorPosition, null, null, null, null);

 *
		} catch (BadLocationException e) {
    private TemplateVariable variable;
	/** The replacement string */
			document.replace(replacementPosition.getOffset(), replacementPosition.getLength(), replacementString);
	/** The cursor position after this proposal has been applied */
 * Copyright (c) 2000, 2008 IBM Corporation and others.
		return new Point(replacementPosition.getOffset() + cursorPosition, 0);
                    }
		Assert.isNotNull(replacementString);
		try {
	public Image getImage() {


                        if (resolver != null) {
                        TemplateVariableResolver resolver = var.getResolver();

final class SQLVariableCompletionProposal implements ICompletionProposal, ICompletionProposalExtension2 {
 * are made available under the terms of the Eclipse Public License v1.0
		Assert.isTrue(replacementPosition != null);
                        }

import org.eclipse.swt.graphics.Image;
		return false;
			// ignore concurrently modified document
