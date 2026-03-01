
			selectWord(pos);
}
	protected ITextViewer fText;
				++pos;
 *

			return true;
					pos -= 2;
					break;
			char c;
import org.jkiss.dbeaver.Log;
			}
				if (c == Character.LINE_SEPARATOR || c == '\"')
		}
				c = doc.getChar(pos);
				++pos;
import org.eclipse.jface.text.BadLocationException;
		fText.setSelectedRange(offset, length);

import org.eclipse.jface.text.ITextViewer;
			while (pos >= 0) {
 *
			pos = caretPos;
			c = ' ';
				c = doc.getChar(pos);
			int length = doc.getLength();
 * DBeaver - Universal Database Manager
				if (!Character.isJavaIdentifierPart(c))
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
					break;
			return true;
	protected boolean selectComment(int caretPos) {
			while (pos < length) {
				--pos;
	protected boolean selectWord(int caretPos) {
	@Override

		}

			fText.setSelectedRange(offset, len);
		IDocument doc = fText.getDocument();
				c = doc.getChar(pos);
import org.eclipse.jface.text.IDocument;
			while (pos >= 0) {
		int pos = part.getSelectedRange().x;
 *
	}
			startPos = pos;
			int pos = caretPos;
			if (c != '\"')
		int startPos, endPos;
	private void selectRange(int startPos, int stopPos) {


	}

			char c = ' ';
 * See the License for the specific language governing permissions and
		try {
				if (!Character.isJavaIdentifierPart(c))
		return false;
					continue;
				c = doc.getChar(pos);
		} catch (BadLocationException e) {

 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
			int offset = startPos + 1;

			}
		}
		int length = stopPos - offset;
	}
    public void doubleClicked(ITextViewer part) {

            log.debug(e);
			if (c != '\"')
			int pos = caretPos;
/*
			endPos = pos;
			pos = caretPos;

			endPos = pos;
		fText = part;

    private static final Log log = Log.getLog(XMLDoubleClickStrategy.class);
		return false;
			startPos = pos;
		try {
		} catch (BadLocationException e) {
				--pos;
package org.jkiss.dbeaver.ui.editors.xml;

			}
 */
		if (!selectComment(pos)) {
			int length = doc.getLength();

 *     http://www.apache.org/licenses/LICENSE-2.0
public class XMLDoubleClickStrategy implements ITextDoubleClickStrategy {
			while (pos < length) {
 * limitations under the License.
		int startPos, endPos;
				return false;


				if (c == Character.LINE_SEPARATOR || c == '\"')
		if (pos < 0)
import org.eclipse.jface.text.ITextDoubleClickStrategy;
            log.debug(e);
				if (c == '\\') {
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");

		IDocument doc = fText.getDocument();
			int len = endPos - offset;


			selectRange(startPos, endPos);

			}
			return;
					break;

 * distributed under the License is distributed on an "AS IS" BASIS,


		int offset = startPos + 1;

 * You may obtain a copy of the License at

	}
				}

				return false;
					break;
