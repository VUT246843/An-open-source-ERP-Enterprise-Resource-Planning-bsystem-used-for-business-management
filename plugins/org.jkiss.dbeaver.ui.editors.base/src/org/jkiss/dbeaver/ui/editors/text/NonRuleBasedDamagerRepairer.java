		fDocument = document;
			return info.getOffset() + info.getLength();
	 */
					attr.getStyle()));
					Math.min(
	 * @param presentation the text presentation to be extended
			region.getOffset(),
		}
		boolean documentPartitioningChanged) {
	 * @see IPresentationDamager#getDamageRegion(ITypedRegion, DocumentEvent, boolean)

 *
/*

 */
	 * if the offset is inside a line delimiter, the end offset of the next line.
						partition.getOffset() + partition.getLength(),
public class NonRuleBasedDamagerRepairer implements IPresentationDamager, IPresentationRepairer {
			return info.getOffset() + info.getLength();
 * you may not use this file except in compliance with the License.
		}
 * You may obtain a copy of the License at
		TextPresentation presentation,
							? event.getLength()
			presentation,
					fDocument.getLineInformationOfOffset(event.getOffset());
				int end =
	 */
package org.jkiss.dbeaver.ui.editors.text;
	 *
	protected int endOfLineOf(int offset) throws BadLocationException {
	}
					event.getOffset()
import org.eclipse.jface.text.presentation.IPresentationRepairer;
	 */
		ITypedRegion region) {

		int offset,
	 * @return the line end offset for the given offset
						+ (event.getText() == null
	 */
	 * Returns the end offset of the line that contains the specified offset or
 *

 * See the License for the specific language governing permissions and
					// optimize the case of the same line
import org.eclipse.swt.custom.StyleRange;
				int start = Math.max(partition.getOffset(), info.getOffset());
					length,
					&& end <= info.getOffset() + info.getLength()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
	@Override
	/** The default text attribute if non is returned as data by the current token */

			return fDocument.getLength();

			}
import org.eclipse.jface.text.*;
		TextAttribute attr) {
	public NonRuleBasedDamagerRepairer(TextAttribute defaultTextAttribute) {
import org.jkiss.dbeaver.Log;
				new StyleRange(
				IRegion info =

		int length,

	}


	/**
		} catch (BadLocationException x) {
		ITypedRegion partition,
}				end =
		return partition;
		if (attr != null)
	
    private static final Log log = Log.getLog(NonRuleBasedDamagerRepairer.class);

	/**

			fDefaultTextAttribute);
	 * @param attr the attribute describing the style of the range to be styled
			try {
    public IRegion getDamageRegion(
 * DBeaver - Universal Database Manager
	 * Adds style information to the given text presentation.
 * Unless required by applicable law or agreed to in writing, software
	 * @see IPresentationRepairer#createPresentation(TextPresentation, ITypedRegion)

	}
			presentation.addStyleRange(
	protected void addRange(
	 * @see IPresentationRepairer#setDocument(IDocument)
	protected IDocument fDocument;
		DocumentEvent event,
					offset,
				} else
		int line = fDocument.getLineOfOffset(offset);
                log.debug(e);
		if (!documentPartitioningChanged) {
					end = endOfLineOf(end);
	}
					attr.getBackground(),
		addRange(
 * Copyright (C) 2010-2024 DBeaver Corp and others
				if (info.getOffset() <= end
 * limitations under the License.
	 * @param offset the offset of the range to be styled
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void setDocument(IDocument document) {
	 */
					end = info.getOffset() + info.getLength();
			region.getLength(),
		TextPresentation presentation,
	/** The document this object works on */
						end);
	}

	protected TextAttribute fDefaultTextAttribute;
	 * @param offset the offset whose line end offset must be computed
import org.eclipse.jface.text.presentation.IPresentationDamager;
							: event.getText().length());

		IRegion info = fDocument.getLineInformationOfOffset(offset);
		try {
			info = fDocument.getLineInformation(line + 1);
	 * @param length the length of the range to be styled
	 * @exception BadLocationException if offset is invalid in the current document
 *
					attr.getForeground(),
	/**
	/**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
		fDefaultTextAttribute = defaultTextAttribute;
		if (offset <= info.getOffset() + info.getLength())

	/**
	}
 * Licensed under the Apache License, Version 2.0 (the "License");
			} catch (BadLocationException e) {

    public void createPresentation(
	@Override
	@Override
	 *
				return new Region(start, end - start);
