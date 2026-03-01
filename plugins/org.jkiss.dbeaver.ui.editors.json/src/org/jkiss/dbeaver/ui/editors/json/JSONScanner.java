        }

        super();
 */
            return Character.isJavaIdentifierPart(character);

 *
        public boolean isWhitespace(char character) {

    public static class WordDetector implements IWordDetector {
//        rules.add(new MultiLineRule(":\"", "\"", value, '\\'));  //$NON-NLS-1$//$NON-NLS-2$
        //IToken nullValue = new Token(new TextAttribute(colorKey));
    }
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,


        initScanner();
import org.eclipse.jface.text.rules.*;

    public static class WhitespaceDetector implements IWhitespaceDetector {
package org.jkiss.dbeaver.ui.editors.json;

        IToken string = new Token(new TextAttribute(SQLEditorThemeSettings.instance.editorKeywordColor));
    }
import java.util.List;
        public boolean isWordStart(char character) {
        wordRule.addWord("null", value);
 * You may obtain a copy of the License at

        IToken defaultText = new Token(new TextAttribute(SQLEditorThemeSettings.instance.editorStringColor));
        @Override
        @Override
            return Character.isWhitespace(character);
        setRules(rules.toArray(new IRule[0]));
import org.jkiss.dbeaver.ui.controls.SQLEditorThemeSettings;
 * limitations under the License.
        WordRule wordRule = new WordRule(new WordDetector(), defaultText);
public class JSONScanner extends RuleBasedScanner {

        IToken value = new Token(new TextAttribute(SQLEditorThemeSettings.instance.editorNumberColor));
 *     http://www.apache.org/licenses/LICENSE-2.0
    public JSONScanner() {

 */
        wordRule.addWord("true", value);
}
        rules.add(wordRule);
        }

//        rules.add(new MultiLineRule(": \"", "\"", value, '\\'));  //$NON-NLS-1$//$NON-NLS-2$
        List<IRule> rules = new LinkedList<>();
 * Copyright (C) 2010-2025 DBeaver Corp and others
            return Character.isJavaIdentifierPart(character);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");

        rules.add(new WhitespaceRule(new WhitespaceDetector()));
    public void reinitScanner() {
        rules.add(new MultiLineRule("\"", "\"", string, '\\')); //$NON-NLS-2$ //$NON-NLS-1$
        initScanner();
    }
/**
 * Unless required by applicable law or agreed to in writing, software
 * JSONScanner

    }
        rules.add(new NumberRule(value));
/*
        @Override
        wordRule.addWord("false", value);
    }
import org.eclipse.jface.text.TextAttribute;

    private void initScanner() {
 * you may not use this file except in compliance with the License.
        }
        public boolean isWordPart(char character) {

 * See the License for the specific language governing permissions and
 *
import java.util.LinkedList;

