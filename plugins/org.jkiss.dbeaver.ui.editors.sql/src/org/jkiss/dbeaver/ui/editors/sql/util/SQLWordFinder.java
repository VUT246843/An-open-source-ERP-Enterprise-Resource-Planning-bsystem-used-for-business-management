 * distributed under the License is distributed on an "AS IS" BASIS,
        while (pos < length)


{
                return new Region(start, end - start);

            if (start == offset && end == offset)
    public static int getWordStartOffset(String text, int startIndex)
/*
        return Character.isWhitespace(c) || c == '(' || c == ')' || c == ',' || c == ';' || c == '\n' || c == '\r'
    public static IRegion findWord(IDocument document, int offset)
        return -1;
        start = getWordStartOffset(document.get(), offset);
        int pos = startIndex;
        int length = text.length();
 */
        char c;
            else
        end = getWordEndOffset(document.get(), offset);
            return -1;
    {

 * Copyright (C) 2010-2024 DBeaver Corp and others
                return new Region(start + 1, end - start - 1);
}            if (isWhiteSpace(c))
        }

        {
        }
        int end;
                return offset;
        {
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
            }

            {
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
    }

        }
            }
 * Unless required by applicable law or agreed to in writing, software
            {
                break;
            char c = text.charAt(offset);
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (text == null || startIndex >= text.length())
            {
        int start;
 * You may obtain a copy of the License at
    public static boolean isWhiteSpace(char c)
import org.eclipse.jface.text.IRegion;
            c = text.charAt(pos);
package org.jkiss.dbeaver.ui.editors.sql.util;
            }

import org.eclipse.jface.text.IDocument;
            else if (start == offset)
        return pos;
            }
public class SQLWordFinder
        for (int offset = startIndex; offset >= 0; offset--)
 *
                return new Region(offset, 0);



    {
            ++pos;
            {
            }
 * DBeaver - Universal Database Manager
                || c == '=' || c == '>' || c == '<' || c == '+' || c == '-' || c == '*' || c == '/';
 * limitations under the License.
            {
        {
        if (start > -1 && end > -1)
 *
    public static int getWordEndOffset(String text, int startIndex)
import org.eclipse.jface.text.Region;

        return null;
    }

    }
            if (isWhiteSpace(c))
    {
        {
 *
        }

 * Licensed under the Apache License, Version 2.0 (the "License");
