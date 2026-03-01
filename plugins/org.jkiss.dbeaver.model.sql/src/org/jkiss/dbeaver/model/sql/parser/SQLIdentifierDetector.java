                Region r = tokens.get(tokenIndex).getSecond();
        }
 * DBeaver - Universal Database Manager
import org.jkiss.code.Nullable;
                String maybeSepText = document.get(maybeSepRegion.getOffset(), maybeSepRegion.getLength());
 *
            // Explore identifier to the right
                }
                String word = document.get(r.getOffset(), r.getLength());
        }
                return id;
            {
            }
import org.jkiss.dbeaver.model.text.parser.TPRuleBasedScanner;
            while (id.identEnd < docLength) {
        return false;
        }
        try {
                    break;
                id.identEnd++;

    public static class WordRegion {
            scanner.setRange(document, line.getOffset(), line.getLength());
            for (int i = tokenIndex; i + 2 < tokens.size();) {
    private WordRegion detectIdentifier(@NotNull IDocument document, @NotNull IRegion region) {
            
    public SQLIdentifierDetector(SQLDialect dialect, char structSeparator, @Nullable String[][] quoteStrings) {
 * See the License for the specific language governing permissions and
            if (quoteString[0].indexOf(c) != -1 || quoteString[1].indexOf(c) != -1) {


package org.jkiss.dbeaver.model.sql.parser;
    protected boolean isQuote(char c) {
 */
import org.jkiss.dbeaver.model.sql.analyzer.TableReferencesAnalyzer;
            return id;
        }
import org.jkiss.code.NotNull;
                }
        public int identStart;

                parts.addFirst(maybeSepText);
            identEnd = offset;
                }
        final WordRegion id = new WordRegion(region.getOffset());
    public char getStructSeparator() {
        public int wordStart = -1, wordEnd = -1;
                token = scanner.nextToken();
        for (String[] stringQuoteString : stringQuoteStrings) {
                if (!isPlainWordPart(ch)) {
                i--;
            identifier = document.get(identStart, identEnd - identStart);
import org.eclipse.jface.text.BadLocationException;
    /**
                if (id.wordStart < 0 && !isPlainWordPart(ch)) {
                String prefixWord = document.get(prefixWordRegion.getOffset(), prefixWordRegion.getLength());
                    tokens.add(new Pair<>(token, new Region(scanner.getTokenOffset(), scanner.getTokenLength())));

    }
import org.jkiss.dbeaver.model.text.parser.TPTokenAbstract;
    }
            }
                id.identStart = prefixWordRegion.getOffset();
        }
    }
    protected boolean isStringQuote(char c) {
        this.quoteStrings = quoteStrings != null ? quoteStrings : new String[0][];
                name = name.substring(quoteString[0].length());
        }
            }
            id.extract(document);


                id.wordEnd = r.getOffset() + r.getLength();
                        if (!TableReferencesAnalyzer.isNamePartToken(token)) {
 * You may obtain a copy of the License at
                if (!TableReferencesAnalyzer.isNamePartToken(tokens.get(i).getFirst())) {
            scanner.setRules(ruleManager.getAllRules());
        return false;


 * Unless required by applicable law or agreed to in writing, software

            }

                    }
import org.eclipse.jface.text.IRegion;
    }
            return word.isEmpty();
            }
                i--;
        return SQLUtils.splitFullIdentifier(identifier, String.valueOf(structSeparator), quoteStrings, true);
                    id.wordEnd = id.identEnd;
            
            IRegion line = document.getLineInformationOfOffset(region.getOffset());
    private final String[][] stringQuoteStrings;
    public SQLIdentifierDetector(SQLDialect dialect) {
                    break;
 * limitations under the License.
     * Returns identifier under cursor position or empty word region
                }
                return true;
        return structSeparator;
            if (wordStart < 0) wordStart = identStart;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
            if (tokenIndex == -1) {
        public int identEnd;
                id.identEnd = suffixWordRegion.getOffset() + suffixWordRegion.getLength();
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
                id.word = word;

            if (quoteString[0] != null && token.startsWith(quoteString[0])) {
    }

            }
            if (stringQuoteString[0].indexOf(c) != -1 || stringQuoteString[1].indexOf(c) != -1) {

                i++;
        this(dialect, dialect.getStructSeparator(), dialect.getIdentifierQuoteStrings());
                }
    }
            if (name.endsWith(quoteString[1])) {
        
                char ch = document.getChar(id.identEnd);
    public boolean isWordStart(char c) {
                }
    @NotNull

            return detectIdentifier(document, region);
    protected SQLDialect dialect;
        
            final TPRuleBasedScanner scanner = new TPRuleBasedScanner();
    public boolean isQuoted(String token) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    }

            word = document.get(wordStart, wordEnd - wordStart);
/**
    public WordRegion extractIdentifier(@NotNull IDocument document, @NotNull IRegion region, @Nullable SQLRuleManager ruleManager) {
        this.dialect = dialect;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public boolean isWordPart(char c) {
                    break;
        for (String[] quoteString : quoteStrings) {
        // Remove leading (and trailing) quotes if any
 */
                            return id; // there is no identifier at the given position
                }
        public boolean isEmpty() {
    }
        }
import java.util.LinkedList;
        for (String[] quoteString : quoteStrings) {

        void extract(IDocument document) throws BadLocationException {
                id.identEnd = id.wordEnd;
    public String[] splitIdentifier(String identifier) {
                    if (scanner.getTokenOffset() <= region.getOffset() && scanner.getTokenEndOffset() > region.getOffset()) {
/*
                parts.addLast(maybeSepText);
                parts.addFirst(prefixWord);
import java.util.List;
public class SQLIdentifierDetector extends TPWordDetector {
                if (!isWordPart(ch)) {
            }
    }
            }
    }
    private final char structSeparator;
    public String removeQuotes(String name) {
            }
        } catch (BadLocationException e) {
import org.jkiss.dbeaver.model.sql.SQLDialect;
                id.identStart = id.wordStart;
    @Override
            }
            if (name.startsWith(quoteString[0])) {
import org.eclipse.jface.text.Region;
        this.structSeparator = structSeparator;
        for (String[] quoteString : quoteStrings) {
                String suffixWord = document.get(suffixWordRegion.getOffset(), suffixWordRegion.getLength());
        }
        final WordRegion id = new WordRegion(region.getOffset());
        }
            // Explore identifier to the left
                char ch = document.getChar(id.identStart);
import org.jkiss.utils.Pair;
            while (!token.isEOF()) {
    @Override
            id.identifier = String.join("", parts);
    private final String[][] quoteStrings;
            List<Pair<TPToken, Region>> tokens = new ArrayList<>();
        return identifier.indexOf(structSeparator) != -1;
        }

            if (!isPlainWordPart(document.getChar(region.getOffset()))) {
 *
                if (!isWordPart(ch)) {
 * Determines whether a given character is valid as part of an SQL identifier.
            while (id.identStart >= 0) {
                parts.add(word);
     */
                    id.wordStart = id.identStart + 1;

        try {
        return id;
                Region prefixWordRegion = tokens.get(i).getSecond();
                if (maybeSepText.indexOf(structSeparator) < 0) {
                Region maybeSepRegion = tokens.get(i).getSecond();
        return super.isWordStart(c) || dialect.validIdentifierStart(c);
                id.wordStart = r.getOffset();
import java.util.ArrayList;
import org.eclipse.jface.text.IDocument;
            id.identStart++;
                id.identStart--;
            identStart = offset;
                }

                    break;
                i++;

            for (int i = tokenIndex; i - 2 >= 0;) {
    }
    }

import org.jkiss.dbeaver.model.sql.SQLUtils;
        public String identifier = "";
                String maybeSepText = document.get(maybeSepRegion.getOffset(), maybeSepRegion.getLength());

 * Copyright (C) 2010-2025 DBeaver Corp and others
                    break;
                return true;
        WordRegion(int offset) {
                    break;
            }
        } catch (BadLocationException e) {

            int tokenIndex = -1;
                        }
}import org.jkiss.dbeaver.model.text.parser.TPToken;
            // ignore
            return id;
            }
                }
            LinkedList<String> parts = new LinkedList<>();
                name = name.substring(0, name.length() - quoteString[0].length());
                if (!TableReferencesAnalyzer.isNamePartToken(tokens.get(i).getFirst())) {
    
            if (wordEnd < 0) wordEnd = identEnd;
                Region maybeSepRegion = tokens.get(i).getSecond();
                if (token instanceof TPTokenAbstract && !token.isWhitespace()) {
                parts.addLast(suffixWord);
                Region suffixWordRegion = tokens.get(i).getSecond();
    }
        return false;
    public boolean isPlainWordPart(char c) {
                        tokenIndex = tokens.size();
    @NotNull
        this.stringQuoteStrings = dialect == null ? new String[][] {{ "'", "'"}} : dialect.getStringQuoteStrings();
    @NotNull
    public boolean containsSeparator(String identifier) {
                return id;
        public String word = "";
            TPToken token = scanner.nextToken();
        if (ruleManager == null) {
import org.jkiss.dbeaver.model.text.parser.TPWordDetector;
                return true;
 *
    }
    }
                if (maybeSepText.indexOf(structSeparator) < 0) {
        return super.isWordPart(c) || dialect.validIdentifierPart(c, false);

        int docLength = document.getLength();
        return name;
        return super.isWordPart(c) || isQuote(c) || structSeparator == c || dialect.validIdentifierPart(c, true);

