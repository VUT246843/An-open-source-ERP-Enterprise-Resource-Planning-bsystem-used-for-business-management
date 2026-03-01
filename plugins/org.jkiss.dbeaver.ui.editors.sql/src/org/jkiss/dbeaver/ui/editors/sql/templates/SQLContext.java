                    result.append(indentation);
                        int[] tmp = aVarOffset[i];

        IDocument document = this.getDocument();
            //how many places
        return variable;
 * DBeaver - Universal Database Manager
            int lineIndent = start - region.getOffset();
    private void formatTemplate(TemplateBuffer buffer) {
            return String.valueOf(buf);
            if (name.equals(VAR_ORDER[i])) {
            }
                result.append(c);
        }
    private String getIndentation() {
            {
                }
                    aVarOffset[nCountPlace][2] = aOffset;
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;
 * distributed under the License is distributed on an "AS IS" BASIS,
                for (int j = 0; j < nCountPlace; j++) {
            @Override
                }
        SQLVariable variable = variables.get(name);
    public DBCExecutionContext getExecutionContext() {
                    aVarOffset[nCountPlace][0] = aOffset;

                    }
    @Override
            getContextType().resolve(variable, this);
            }
        if (!indentation.isEmpty() && content.indexOf('\n') != -1) {
                return variableOrder(o1.getName()) - variableOrder(o2.getName());
                        aVarOffset[i] = aVarOffset[j];
                if (c == '\n') {
        TemplateVariable[] bufferVariables = buffer.getVariables();
            for (int i = 0; i < content.length(); i++) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                for (int j = i + 1; j < nCountPlace; j++) {
                    for (int j = iPlace; j < nCountPlace; j++) aVarOffset[j][2] = aVarOffset[j][2] + iSpaceLen;
            protected TemplateVariable createVariable(TemplateVariableType type, String name, int[] offsets) {

            }
        if (!canEvaluate(template))
                int iInd = 0;
    Collection<SQLVariable> getVariables() {
        return editor;
    }
        "table",
            for (int i = 0; i < variables.length; i++) {
 * SQL context
*/
*/
                    if (aVarOffset[j][1] == i) {
    }
 *


 * See the License for the specific language governing permissions and
        TemplateBuffer buffer = translator.translate(template);

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                int[] aOffsets = variables[i].getOffsets();
        try {
                variables.put(name, variable);

            public int compare(TemplateVariable o1, TemplateVariable o2)
import org.eclipse.jface.text.IDocument;

        };
    @Nullable
                        aOffsets[iInd] = aVarOffset[j][2];
                buf[i] = ' ';
import org.eclipse.jface.text.templates.*;
 * you may not use this file except in compliance with the License.


                }
        return buffer;
            //collect back
    }
                SQLVariable variable = new SQLVariable(SQLContext.this, type, name, offsets);
                int[] aOffsets = variables[i].getOffsets();
    public SQLEditorBase getEditor() {
            return null;
        TemplateVariable[] variables = buffer.getVariables();
    }
                    if (aVarOffset[i][0] > aVarOffset[j][0]) {
        this.editor = editor;
}
        return variables.values();
import java.util.HashMap;
 *
            int nCountPlace = 0;
                nCountPlace = nCountPlace + variable.getOffsets().length;
            char[] buf = new char[lineIndent];
        TemplateTranslator translator = new TemplateTranslator() {

        });
                    //skip
    SQLVariable getTemplateVariable(String name) {
            for (TemplateVariable variable : variables) {
        final String indentation = getIndentation();
/**
        for (int i = 0; i < VAR_ORDER.length; i++) {
        "value"
 * You may obtain a copy of the License at
                    aVarOffset[nCountPlace][1] = i;
 * limitations under the License.
    public TemplateBuffer evaluate(Template template) throws BadLocationException, TemplateException {
    };
            }
                        iInd++;
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
        "column",

            }
        String content = buffer.getString();
                    nCountPlace = nCountPlace + 1;
        if (variable != null && !variable.isResolved())
 */
 * Copyright (C) 2010-2025 DBeaver Corp and others

            }
            }
            if (lineIndent <= 0) {
            //sort
                    }

        formatTemplate(buffer);
            for (int i = 0; i < variables.length; i++) {
            //fill array
        getContextType().resolve(buffer, this);
 *     http://www.apache.org/licenses/LICENSE-2.0
    private Map<String, SQLVariable> variables = new HashMap<>();
                char c = content.charAt(i);
            }
import org.eclipse.jface.text.Position;
                    while (iPlace < nCountPlace && i > aVarOffset[iPlace][0]) iPlace++;
    public SQLContext(TemplateContextType type, IDocument document, Position position, SQLEditorBase editor) {
            nCountPlace = 0;
            }

public class SQLContext extends DocumentTemplateContext implements DBPContextProvider {
                        aVarOffset[j] = tmp;
/*
 *
    @Override

import org.jkiss.dbeaver.model.DBPContextProvider;
        return editor.getExecutionContext();
import java.util.Map;
        return VAR_ORDER.length + 1;
            int[][] aVarOffset = new int[nCountPlace][3];
        }

    }
        } catch (Exception var6) {
    private SQLEditorBase editor;
/*

            return "";
import org.eclipse.jface.text.IRegion;
    }
import java.util.Collection;
            buffer.setContent(result.toString(), variables);
            for (int i = 0; i < lineIndent; i++) {
        // Reorder variables
 * Unless required by applicable law or agreed to in writing, software
    }
            for (int i = 0; i < nCountPlace - 1; i++) {


                return "";
    private static final String[] VAR_ORDER = {
        buffer = new TemplateBuffer(buffer.getString(), bufferVariables);
            int iPlace = 0;
 */

package org.jkiss.dbeaver.ui.editors.sql.templates;
        }
import org.jkiss.code.Nullable;
        int start = this.getStart();
            IRegion region = document.getLineInformationOfOffset(start);
            }
                return variable;
    }
/*


    }
            @Override
        Arrays.sort(bufferVariables, new Comparator<TemplateVariable>() {
                return i;
            StringBuilder result = new StringBuilder();
        super(type, document, position);
                    //move
            int iSpaceLen = indentation.length();
                }

import org.eclipse.jface.text.BadLocationException;
    private static int variableOrder(String name)
                for (int aOffset : aOffsets) {


