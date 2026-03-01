					fPreviousSelection= selection;
	}
				return false;
			fPairPosition.isDeleted= false;
				handleDrawRequest(null);
	/**
 *
	 *
	/**

			if (text == null)
					pair.getLength() != fPairPosition.getLength() ||

	 */
 * @since 2.1
			return;


			Rectangle bounds= fTextWidget.getTextBounds(offset, offset + length - 1);
				// redraw current highlighting
				deactivate(true);
		fMatcher= matcher;
		} else {
			fTextWidget.removePaintListener(this);
 *******************************************************************************/
	}
			//gc.drawRectangle(bounds.x, bounds.y + bounds.height - height, bounds.width - 1, height - 1);
		if (install) {


			}
	}
		installUninstallTextListener(highlightEnclosingPeerCharcters);
import org.eclipse.swt.graphics.Color;
	 */
				return;
		 * @see ITextListener#textChanged(TextEvent)
		Point selection= text.getSelectionRange();
				installUninstallTextListener(false);
				fAnchor= fMatcher.getAnchor();
 * which accompanies this distribution, and is available at
	 * @since 3.8
	 * @param sourceViewer the source viewer
			} else if (pair.getOffset() != fPairPosition.getOffset() ||
	 * @return a region denoting the current signed selection, for a resulting RtoL selections
 * SPDX-License-Identifier: EPL-2.0
			return;
	 * Installs or uninstalls the text listener depending on the boolean parameter.
		/**
			handleDrawRequest(null);
	 * <p>
	 * @param gc the GC to draw into or <code>null</code> to send a redraw request if necessary
	 *

	 *
	public void setPositionManager(IPaintPositionManager manager) {
		}
	 */
		int offset= fPairPosition.getOffset();
	}
	 * is right-to-left.
		if (fMatcher != null) {
package org.jkiss.dbeaver.ui.editors.sql;

			fPairPosition.offset= pair.getOffset();
		if (gc != null) {
						return;


	 */
	 *
				// update position
	 */
	private StyledText fTextWidget;
	}
	public SQLMatchingCharacterPainter(ISourceViewer sourceViewer, ICharacterPairMatcher matcher) {
				if (extension.modelLine2WidgetLine(startLine) == -1 || extension.modelLine2WidgetLine(endLine) == -1)

		} else {

					fMatcher.getAnchor() != fAnchor ||
		}
				return;
	private IRegion fPreviousSelection;


		 */
	 * @param color the color
		 * @return <code>true</code> if a matched character is found, <code>false</code> otherwise
	 */
				}
			IRegion widgetRange= extension.modelRange2WidgetRange(new Region(offset, length));
				// apply new highlighting
		}
	 */
		int length= fPairPosition.getLength();

import org.eclipse.swt.graphics.Point;
 * Contributors:
				return;
				int endLine= doc.getLineOfOffset(offset + length);
				fSourceViewer.removeTextListener(fTextListener);
				return;
	 * Sets whether to highlight the character at caret location or not.
			pair= matcher.match(document, selection.getOffset(), selection.getLength());
	 */

		if (document == null) {
	/** The strategy for finding matching characters */
		}
	 *
		}
	 * The text viewer change listener.
			handleDrawRequest(event.gc);
		 * @param text the string to search
			if (IPainter.CONFIGURATION == reason) {
import org.eclipse.jface.text.source.ICharacterPairMatcher;
		if (fMatcher instanceof ICharacterPairMatcherExtension) {
		fTextWidget= sourceViewer.getTextWidget();

			if (fPaintPositionManager != null)
	}
	private boolean fIsActive= false;
	 * @since 3.8
			viewerSelection.x= viewerSelection.x + viewerSelection.y;
			if (!fHighlightEnclosingPeerCharacters || !(fMatcher instanceof ICharacterPairMatcherExtension))
			offset -= region.getOffset();
	}
				if (matcher.isMatchedChar(text.charAt(i))) {
			characterPresentAtCaretLocation= (pair != null);
	/**
	}
	private boolean fHighlightCharacterAtCaretLocation;
			deactivate(true);
	/** The anchor indicating whether the character is left or right of the caret */

		public void textChanged(TextEvent event) {
		} else {
				// don't draw if the pair position is really hidden and widgetRange just
	 * @since 3.8

	}

public final class SQLMatchingCharacterPainter implements IPainter, PaintListener {
				handleDrawRequest(null);
 *
 *     IBM Corporation - initial API and implementation
	 * @param sourceViewer the source viewer
	private boolean fHighlightEnclosingPeerCharacters;
import org.eclipse.swt.events.PaintListener;
}
	@Override
			fMatcher.clear();


	 * Previous length of the document this painter is associated with.

		IRegion pair;
	/**
import org.eclipse.jface.text.source.ISourceViewer;
	 * Sets whether to highlight enclosing peer characters or not.
				if (reason == IPainter.TEXT_CHANGE) {
	private int fPreviousLengthOfDocument;
	 * @param highlightEnclosingPeerCharcters whether to highlight enclosing peer characters or not
 * {@link ICharacterPairMatcher} or an
			if (!event.getViewerRedrawState())
	 *
			if (searchForCharacters(text, matcher) || searchForCharacters(replacedText, matcher))
					return;
		if (pair == null) {
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.events.PaintEvent;
	 *            or not
			String text= event.getText();
	 * @param offset the offset of the widget region
 * <p>

			String theText = fTextWidget.getText(offset, offset + length - 1);
 * Highlights the peer character matching the character near the caret position, or a pair of peer
		int length = 1;
			return;
	/**
			if (region.getOffset() > offset || region.getOffset() + region.getLength() < offset + length)
	 * The selection offset is model based.
			gc.setBackground(fColor);
			length= widgetRange.getLength();
							handleDrawRequest(null);
	public void dispose() {


	 * @since 3.8
	private Position fPairPosition= new Position(0, 0);
			draw(gc, offset + length - 1);
		if (fSourceViewer instanceof ITextViewerExtension5) {
			if (Math.abs(selection.getLength()) > 0) {
			fIsActive= true;
	 */
			gc.drawText(theText, bounds.x, bounds.y);
 * Clients instantiate and configure an object of this class.
					return;
	 * Whether a character is present at caret location or not.
	 *

				draw(gc, offset);
	 * @since 3.8
	/**
		StyledText text= sourceViewer.getTextWidget();
	 *
	 * Whether to highlight the character at caret location or not.
		}
		/**
		}

		}
					if (!matcher.isRecomputationOfEnclosingPairRequired(document, selection, fPreviousSelection)) {
 * {@link ICharacterPairMatcherExtension}.
			if (fTextListener != null) {

		if (text.getCaretOffset() == selection.x) {
		Point viewerSelection= sourceViewer.getSelectedRange();
				fCharacterPresentAtCaretLocation= characterPresentAtCaretLocation;
				pair= matcher.findEnclosingPeerCharacters(document, selection.getOffset(), selection.getLength());
	 * @param install <code>true</code> to install the text listener, <code>false</code> to uninstall
	@Override


						fPreviousSelection= selection;
	private void installUninstallTextListener(boolean install) {
				fPairPosition.offset= pair.getOffset();

			fTextListener= new TextListener();
				handleDrawRequest(null);
	 *
	 * @since 3.8
		}

			}
	/**
			fMatcher= null;
		if (fIsActive) {
			fCharacterPresentAtCaretLocation= characterPresentAtCaretLocation;
import org.eclipse.swt.graphics.GC;
				int startLine= doc.getLineOfOffset(offset);
	public void setHighlightEnclosingPeerCharacters(boolean highlightEnclosingPeerCharcters) {
	 * Highlights the given widget region.
	@Override
			return;
	public void paint(int reason) {
 * This program and the accompanying materials
		fPaintPositionManager= manager;
					return true;
	public void setColor(Color color) {
	 */
			IRegion region= fSourceViewer.getVisibleRegion();
			ICharacterPairMatcherExtension matcher= (ICharacterPairMatcherExtension)fMatcher;
			try {
		IRegion selection= getSignedSelection(fSourceViewer);

				}
/*******************************************************************************
			// draw box around line segment ?
	 * @param highlightCharacterAtCaretLocation whether to highlight the character at caret location
				if (reason != IPainter.CONFIGURATION && !lengthChanged && fPreviousSelection != null && reason != IPainter.INTERNAL) {
				fPaintPositionManager.unmanagePosition(fPairPosition);
		 * Searches for matched characters in the given string.
	 * The previous selection, used to determine the need for computing enclosing brackets.
			if (redraw)
	/** The color in which to highlight the peer character */
				return;
	private static final IRegion getSignedSelection(ISourceViewer sourceViewer) {
						}
				return;
 *
		fHighlightEnclosingPeerCharacters= highlightEnclosingPeerCharcters;
			String replacedText= event.getReplacedText();
			deactivate(false);
		fPreviousSelection= selection;
		}
	/** The position tracking the matching characters */
	 *

			for (int i= 0; i < text.length(); i++) {
				fPairPosition.isDeleted= false;
	 * @since 3.8
					return;
	/**

	 * @since 3.8
	 *

						if (fCharacterPresentAtCaretLocation && !fHighlightCharacterAtCaretLocation) {
	public void deactivate(boolean redraw) {
import org.eclipse.jface.text.source.ICharacterPairMatcherExtension;
				// otherwise only do something if position is different
	 * </p>
					characterPresentAtCaretLocation != fCharacterPresentAtCaretLocation) {
import org.eclipse.jface.text.*;
	private void draw(GC gc, int offset) {
	/**

	 * @since 3.8
	/** The source viewer this painter is associated with */
			} catch (BadLocationException e) {
				IDocument doc= fSourceViewer.getDocument();
		fColor= null;


			return;
			fTextWidget.addPaintListener(this);

		if (fTextWidget != null)
		 * @param matcher the pair matcher
				int length= document.getLength();
		} else {
	 *
 * https://www.eclipse.org/legal/epl-2.0/

			offset= widgetRange.getOffset();
	private class TextListener implements ITextListener {
	}
			viewerSelection.y= -viewerSelection.y;
	/** The viewer's widget */
				// marks the coverage around it.
		IDocument document= fSourceViewer.getDocument();
	 * Handles a redraw request.
	 * @param matcher the character pair matcher
	 *         length is < 0
import org.eclipse.swt.SWT;
			}
			draw(gc, offset);
	private boolean fCharacterPresentAtCaretLocation;

		}
	/**
	 * Sets the color in which to highlight the match character.
	 * Returns the signed current selection. The length will be negative if the resulting selection
	public void setHighlightCharacterAtCaretLocation(boolean highlightCharacterAtCaretLocation) {
	/** Indicates whether this painter is active */
			fTextWidget.redrawRange(offset, length, true);
		fPreviousSelection= null;
			}
 */




			else
				paint(IPainter.INTERNAL);
			ICharacterPairMatcherExtension matcher= (ICharacterPairMatcherExtension)fMatcher;
	@Override
			int height= fTextWidget.getCaret().getSize().y;
	 * @param gc the GC to draw into or <code>null</code> to send a redraw request
		handleDrawRequest(null); // see https://bugs.eclipse.org/372515
		fTextWidget= null;
			if (widgetRange == null)
	 *
	/**
		fHighlightCharacterAtCaretLocation= highlightCharacterAtCaretLocation;
	 *
	 */
			fAnchor= fMatcher.getAnchor();

 * </p>
				draw(gc, offset + length - 1);
					}
	/**

			return false;
	 *

			fSourceViewer.addTextListener(fTextListener);
			fPairPosition.length= pair.getLength();
 *
	 * pair matcher. The character matcher is not adopted by this painter. Thus, it is not disposed.
	/**
		}
		if (!(fMatcher instanceof ICharacterPairMatcherExtension))
	 * Whether to highlight enclosing peer characters or not.
	}
	@Override
		} else {
	}
		if (fHighlightCharacterAtCaretLocation || (fHighlightEnclosingPeerCharacters && !fCharacterPresentAtCaretLocation)) {
	private void handleDrawRequest(GC gc) {
	 * Listens to document changes and if required by those document changes causes a re-computation
	private TextListener fTextListener;
	 * However, this painter requires exclusive access to the given pair matcher.
			}
		fColor= color;
	private Color fColor;
			}
		boolean characterPresentAtCaretLocation;
			if (pair == null && fHighlightEnclosingPeerCharacters) {
		@Override
	/**

			}
	 * @since 3.8


		} else {
			fIsActive= false;

	private ICharacterPairMatcher fMatcher;
	}
				fTextListener= null;
		}
			if (ICharacterPairMatcher.RIGHT == fAnchor)
	public void paintControl(PaintEvent event) {
		if (fPairPosition.isDeleted)
	private IPaintPositionManager fPaintPositionManager;
				if (reason != IPainter.CONFIGURATION && fSourceViewer.getDocument() == document && !lengthChanged && (selection.equals(fPreviousSelection) || fPreviousSelection == null)) {
	 *
				fPairPosition.length= pair.getLength();
							fCharacterPresentAtCaretLocation= false;
	/**
	 */
				handleDrawRequest(null);
	}
/**
				boolean lengthChanged= length != fPreviousLengthOfDocument;

	 */
				}
	private ISourceViewer fSourceViewer;
			gc.fillRectangle(bounds.x, bounds.y + bounds.height - height, bounds.width - 1, height - 1);
			// Draw background
 * characters enclosing the caret position. This painter can be configured with an
			characterPresentAtCaretLocation= (pair != null);
	 * Creates a new MatchingCharacterPainter for the given source viewer using the given character

		 *
	 */
	 * of matching characters.
				// remove old highlighting
			pair= fMatcher.match(document, selection.getOffset());
				fPreviousLengthOfDocument= length;
		fSourceViewer= sourceViewer;
			if (fMatcher instanceof ICharacterPairMatcherExtension && fTextListener != null) {
	private int fAnchor;
		return new Region(viewerSelection.x, viewerSelection.y);



 * Copyright (c) 2000, 2016 IBM Corporation and others.

		if (length < 1)
import org.eclipse.swt.custom.StyledText;
				}
			fPaintPositionManager.managePosition(fPairPosition);
	 * @since 3.8
			ITextViewerExtension5 extension= (ITextViewerExtension5) fSourceViewer;
	 */
		private boolean searchForCharacters(String text, ICharacterPairMatcherExtension matcher) {
		 */
		if (fIsActive) {
	/** The paint position manager */
 * are made available under the terms of the Eclipse Public License 2.0
