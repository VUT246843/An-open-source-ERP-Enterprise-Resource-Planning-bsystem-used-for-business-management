		return variable.getProposals(this, getLength());
 * are made available under the terms of the Eclipse Public License v1.0
 * Contributors:
package org.jkiss.dbeaver.ui.editors.sql.templates;
 * All rights reserved. This program and the accompanying materials
	}
public class SQLProposalPosition extends ProposalPosition {
import org.eclipse.jface.text.link.ProposalPosition;
	}
	public ICompletionProposal[] getChoices() {

import org.eclipse.jface.text.IDocument;
		super(document, offset, length, new ICompletionProposal[0]);
 * which accompanies this distribution, and is available at
	public SQLProposalPosition(IDocument document, int offset, int length, SQLVariable variable) {
 * http://www.eclipse.org/legal/epl-v10.html
}
 *     IBM Corporation - initial API and implementation

 *******************************************************************************/
        this.variable = variable;

/*******************************************************************************

	private SQLVariable variable;
import org.eclipse.jface.text.contentassist.ICompletionProposal;


 * Copyright (c) 2000, 2005 IBM Corporation and others.
 *
