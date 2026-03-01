import org.eclipse.jface.text.templates.TemplateContext;
    }
import org.eclipse.jface.text.IRegion;
    private static final Log log = Log.getLog(SQLTemplateCompletionProposal.class);
public class SQLTemplateCompletionProposal extends TemplateProposal {
        super(template, context, region, image, relevance);
 * http://www.eclipse.org/legal/epl-v10.html
 *     IBM Corporation - initial API and implementation
 *
 * A template completion proposal.

import org.jkiss.dbeaver.Log;

package org.jkiss.dbeaver.ui.editors.sql.templates;
 *
 * All rights reserved. This program and the accompanying materials
 * which accompanies this distribution, and is available at
/**

}

import org.eclipse.jface.text.templates.Template;
 */
 * Clients may subclass.</p>
import org.eclipse.jface.text.templates.TemplateProposal;
 * are made available under the terms of the Eclipse Public License v1.0
        this(template, context, region, image, 0);
import org.eclipse.swt.graphics.Image;
    }
 * @since 3.0
    public SQLTemplateCompletionProposal(Template template, TemplateContext context, IRegion region, Image image) {

 *******************************************************************************/

    public SQLTemplateCompletionProposal(Template template, TemplateContext context, IRegion region, Image image, int relevance) {
 * Contributors:
 * Copyright (c) 2000, 2008 IBM Corporation and others.
 * <p>
/*******************************************************************************
