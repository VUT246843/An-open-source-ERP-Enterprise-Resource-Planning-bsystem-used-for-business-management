        start = Math.max(0, start);
            } else if (pat.contains(",")) {
        if (start > end) {
            return true;
     *                        as wildcards
        for (String s : subPatterns) {
     * @throws IllegalArgumentException if {@code pattern == null}
public class TextMatcherExt {
        }
import org.eclipse.core.text.StringMatcher;
     * @throws IllegalArgumentException if {@code text == null}
    @Override
     * @param text  String to match in; must not be {@code null}
        end = Math.min(end, tlen);
    public boolean match(String text) {
            StringMatcher m = new StringMatcher(s, ignoreCase, ignoreWildCards);
    public String toString() {

     * @return {@code true} if the given slice of {@code text} matches the pattern;
        if (parts.isEmpty()) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public TextMatcherExt(String pattern, boolean ignoreCase, boolean ignoreWildCards) {
        }
        }
     *
            }
     * Determines whether the given sub-string of {@code text} from {@code start}
     */
            }

                return true;
            if (s == null || s.isEmpty()) {
 * You may obtain a copy of the License at
            throw new IllegalArgumentException();
     */
import java.util.Collections;
 *
        return matchers;
 * This TextMatcherExt can split pattern string on commas, pipes and spaces and can filter by the list of this separated words

 * Unless required by applicable law or agreed to in writing, software
            matchers.add(m);
 * DBeaver - Universal Database Manager
            s = "*" + s;
    public boolean match(String text, int start, int end) {
 *
        }
        }
        }
        if (text == null) {
            return false;
     * @param end   end index (exclusive) within {@code text} of the sub-string to
        List<StringMatcher> matchers = new ArrayList<>();
 * Cropped and little bit changed copy of org.eclipse.ui.internal.misc.TextMatcher class
 *
 */
        if (full.match(text, start, end)) {
        if (subPatterns.length <= 1) {
        if (subPatterns.length <= 1) {
    private List<StringMatcher> splitPattern(String pattern,
        }
     * @param ignoreCase      whether to do case-insensitive matching
     * @param ignoreWildCards whether to treat '?' and '*' as normal characters, not
    }


            m.usePrefixMatch();
    private final StringMatcher full;
import java.util.ArrayList;
 *
 * you may not use this file except in compliance with the License.
            if (pat.contains("|")) {
/**
        return '[' + full.toString() + ',' + parts + ']';
import java.util.List;
 * See the License for the specific language governing permissions and
        }
                continue;
    /**
                                             boolean ignoreCase, boolean ignoreWildCards) {
        if (text == null) {
     *         {@code false} otherwise

    }
        return match(text, 0, text.length());

    /**
/*
        String pat = pattern.trim();
     *              match
            return Collections.emptyList();
            return Collections.emptyList();
package org.jkiss.dbeaver.ui.navigator.database;
     *              match
            return false;
        }
        for (StringMatcher subMatcher : parts) {
     *         {@code false} otherwise
        return false;
        parts = splitPattern(pattern, ignoreCase, ignoreWildCards);
                subPatterns = pat.split("\\|");
        full = new StringMatcher(pattern.trim(), ignoreCase, ignoreWildCards);
        }
                subPatterns = pat.split(",");
 * limitations under the License.
            if (subMatcher.match(text, start, end)) {
            throw new IllegalArgumentException();
 * distributed under the License is distributed on an "AS IS" BASIS,
    /**

        if (pat.isEmpty()) {

 */

     * @param start start index (inclusive) within {@code text} of the sub-string to
     *
     * @param text String to match; must not be {@code null}
    }
     * @throws IllegalArgumentException if {@code text == null}
     * (inclusive) to {@code end} (exclusive) matches the pattern.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        String[] subPatterns = pat.split("\\s+"); //$NON-NLS-1$
 * Licensed under the Apache License, Version 2.0 (the "License");
        int tlen = text.length();
}
     * @param pattern         to match
     * Determines whether the given {@code text} matches the pattern.
    }
     * @return {@code true} if the whole {@code text} matches the pattern;
     *
     */
    private final List<StringMatcher> parts;
 *
    }
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
