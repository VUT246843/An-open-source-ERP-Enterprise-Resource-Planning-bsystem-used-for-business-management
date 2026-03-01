        return offset;
                lineIndex++;
            }
        int indexOfLastLineSeparator = -1;
            } else {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull

        for (int i = 0; i < text.length(); i++) {
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
                offset += line.length() + 1;
import org.jkiss.code.NotNull;
    }
        String[] lines = text.split("\n");
                indexOfLastLineSeparator = i;
        }
                offset += position.getCharacter();
            }
        int offset = 0;
        int numberOfLines = 0;
package org.jkiss.dbeaver.model.lsp.utils;

            char c = text.charAt(i);
                if (line.length() < position.getCharacter()) {
 *
 *

            if (lineIndex < position.getLine()) {
}
 *
        if (startOfTheLastLine == text.length()) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public static int positionToOffset(@NotNull String text, @NotNull Position position) {
        for (String line : lines) {
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
public class LSPUtils {
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
            throw new IllegalArgumentException("Invalid line number " + position.getLine());
        return new Position(numberOfLines, text.substring(startOfTheLastLine).length());
        }
            return new Position(numberOfLines, 0);
 * limitations under the License.

    }
            if (c == '\n') {

/*
 * See the License for the specific language governing permissions and
                }
        int lineIndex = 0;
import org.eclipse.lsp4j.Position;
        if (lines.length <= position.getLine()) {
        }
                numberOfLines++;
        int startOfTheLastLine = indexOfLastLineSeparator + 1;
        }

                    throw new IllegalArgumentException("Invalid char number " + position.getCharacter());
    public static Position lastTextPosition(@NotNull String text) {
