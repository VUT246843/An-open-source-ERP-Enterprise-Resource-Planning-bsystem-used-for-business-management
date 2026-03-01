        return request.getContext().getDataSource();
public class SQLCompletionProposalBase extends CompletionProposalBase {
                        }
    /**
     * The replacement offset.
        return displayString;
            {
            if (startOffset == -1) {
            }
        this.proposalScore = proposalScore;
        SQLCompletionRequest request,
        DBPKeywordType proposalType,
        return image;
 * You may obtain a copy of the License at
 */
                            }
    public DBPKeywordType getProposalType() {
        setPosition(request.getWordDetector());
        this.displayString = displayString;
    }

 */
            return this.additionalProposalInfo instanceof String s ? s : null;
            replacementOffset = wordDetector.getStartOffset();
            int endOffset = fullWord.indexOf(structSeparator, curOffset);
            }
            if (startOffset != -1) {
                endOffset = fullWord.length() - endOffset;
    }
    public String getReplacementString() {
    }
                    return "(" + params.toString() + ")";
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
            } else {
        this.object = object;
        }
                boolean isExec = CommonUtils.toBoolean(params.get(PARAM_EXEC));
 * DBeaver - Universal Database Manager
                additionalProposalInfo = SQLCompletionHelper.readAdditionalProposalInfo(monitor, request.getContext(), object, new String[]{displayString}, proposalType);
            return null;
            // End offset - number of character which to the right from replacement which we don't touch (e.g. in complex identifiers like xxx.zzz.yyy)
                continue;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        return replacementOffset;
                                params.append(param.getParameterType().getFullTypeName());
import org.jkiss.dbeaver.model.*;
    public int getReplacementOffset() {
    private static boolean containsQuotedIdentifier(@NotNull DBPDataSource dataSource, @NotNull String string) {
    public SQLCompletionRequest getRequest() {

    }
    public int getProposalTypeSorterScore() {
                startOffset = fullWord.lastIndexOf(structSeparator, curOffset);
                } else {
 * limitations under the License.
            // If we are at the begin of word (curOffset == 0) then do not replace the word to the right.
    }
        try {
}
        } else {
    public String toString() {
    private Map<String, Object> params;

            } else {
import java.util.Map;

                }
            } else */
        for (String[] pair : quotes) {
            }
    protected String replacementString;
     */

    /**
            } else if (startOffset > curOffset) {
        @Nullable DBPImage image,
                            if (isExec) {
        if (quotes == null) {
/**
     */
        }
    protected void setPosition(SQLWordPartDetector wordDetector) {

 * Unless required by applicable law or agreed to in writing, software
    protected String replacementFull;

            }
            } else {
                // Ad parameter marks
     */
        ) {
            if (endOffset == startOffset) {
            log.error("Error resolving procedure parameters", e);
        if (additionalProposalInfo == null && object == null) {
        this.replacementString = replacementString;

import org.jkiss.dbeaver.model.struct.DBSObjectReference;
                startOffset = -1;
import org.jkiss.utils.CommonUtils;
                                params.append(":").append(param.getName());
            boolean replaceWord = dataSource != null && request.getContext().isReplaceWords();
            }
        return proposalScore;
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
    private DBPImage image;
            if (replaceWord) {
        this.request = request;
    public void setReplacementAfter(String replacementAfter) {
        }
    }
    }
            }
                if (DBSProcedure.class.isAssignableFrom(((DBSObjectReference) object).getObjectType().getTypeClass())) {
 *
        }
        final int curOffset = wordDetector.getCursorOffset() - wordDetector.getStartOffset();
            || dataSource != null && containsQuotedIdentifier(dataSource, replacementString)
    public DBPDataSource getDataSource() {
            replacementString :
            }


    /**

            return ((DBSObjectReference) object).getContainer();
    public String getExtraString() {

                startOffset++;
    public DBSObject getObjectContainer() {
    public DBPImage getObjectImage() {

 *     http://www.apache.org/licenses/LICENSE-2.0
            }
import org.jkiss.dbeaver.Log;
 * See the License for the specific language governing permissions and
    public static final String PARAM_EXEC = "exec";

        } else if ((!proposalContainsStructSeparator && !fullWord.equals(replacementString))
                            if (params.length() > 0) params.append(", ");
 * SQL Completion proposal
    private static final Log log = Log.getLog(SQLCompletionProposalBase.class);
                replacementLength = wordDetector.getEndOffset() - replacementOffset - endOffset;
import org.jkiss.code.NotNull;
    }
            }
    protected String replacementAfter;
    private DBPKeywordType proposalType;
                } else {

    }
            if (endOffset != -1) {
    public Object getAdditionalInfo(DBRProgressMonitor monitor) {
    }
            if (last > 0 && DBUtils.isQuotedIdentifier(dataSource, string.substring(0, last + 1))) {
        }
        if (DBUtils.isQuotedIdentifier(dataSource, string)) {
            if (!string.startsWith(pair[0])) {
        } else {
 * you may not use this file except in compliance with the License.
    }
     * The cursor position after this proposal has been applied.
            if (object instanceof DBSProcedure) {
        }
import java.util.Locale;
            return null;
    protected int replacementLength;
    }
            final int last = string.lastIndexOf(pair[1]);
                startOffset = wordDetector.getStartOffset();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            // Replace only last part
            return ((DBSObject) object).getParentObject();
    }
            }


    public DBPNamedObject getObject() {
        if (!this.request.getActivityTracker().isAdditionalInfoExpected()) {
        } else if (object instanceof DBSObjectReference) {
                    // Replace from identifier start to the end of current identifier
            VoidProgressMonitor monitor = new VoidProgressMonitor();
    private DBPNamedObject object;
import org.jkiss.dbeaver.DBException;
    protected int cursorPosition;
            replacementOffset = startOffset;
                    return "()";
            if (dataSource != null && DBUtils.isQuotedIdentifier(dataSource, fullWord)) {

        this.params = params;
                if (!CommonUtils.isEmpty(parameters)) {
        return object != null ? object : additionalProposalInfo;
            int startOffset = fullWord.lastIndexOf(structSeparator, curOffset - 1);
    }
                // Replace from identifier start till next struct separator

        }
            if (endOffset != -1) {
        final char structSeparator = request.getContext().getSyntaxManager().getStructSeparator();
import org.jkiss.code.Nullable;
     * The replacement string.
    public String getDisplayString() {
                endOffset += wordDetector.getStartOffset();
     * The replacement length.
import org.jkiss.dbeaver.model.sql.parser.SQLWordPartDetector;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
    protected int replacementOffset;
                    StringBuilder params = new StringBuilder();
    public static final String PARAM_NO_SPACE = "no-space";
                }

                startOffset += wordDetector.getStartOffset() + 1;
                Collection<? extends DBSProcedureParameter> parameters = ((DBSProcedure) object).getParameters(monitor);
        String replacementString,


                    startOffset = curOffset;
        return displayString;
            }
        } catch (DBException e) {
import java.util.Collection;

        }
    private Object additionalProposalInfo;
    // Tail
     */
    }
            replacementOffset = wordDetector.getStartOffset() + startOffset;

import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;
    }
 *

                startOffset = 0;
            return false;
        return object;
            DBUtils.getUnQuotedIdentifier(dataSource, replacementString.toLowerCase(Locale.ENGLISH)); // Convert to lower to compare IN VALIDATE FUNCTION
/*
        final boolean proposalContainsStructSeparator = replacementString.indexOf(structSeparator) >= 0;
            int endOffset = fullWord.indexOf(structSeparator, curOffset);
 *
    }

     */
    private int proposalScore;
                // Do not replace full word if we are in the middle of word
                    }
            } else {
                }
        return replacementLength;
    @Override
                endOffset = 0;
        Map<String, Object> params
                        if (param.getParameterKind().isInput()) {

        if (useFQName) {
        if (object instanceof DBSObject) {
                replacementLength = curOffset - startOffset;
    private final SQLCompletionRequest request;
        return replacementString;
            /*if (curOffset < fullWord.length() && Character.isLetterOrDigit(fullWord.charAt(curOffset)) && false) {
        this.cursorPosition = cursorPosition;
                    endOffset = wordDetector.getCursorOffset();
            }

    public SQLCompletionProposalBase(
    private String displayString;
    public boolean hasStructObject() {

        this.image = image;
        this.proposalType = proposalType;
        final String fullWord = wordDetector.getFullWord();
        return proposalType;
    /**


        final String[][] quotes = dataSource.getSQLDialect().getIdentifierQuoteStrings();

        return getProposalType().sortOrder;
package org.jkiss.dbeaver.model.sql.completion;
            int startOffset = fullWord.indexOf(structSeparator);
    ) {
    }
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameter;
        DBPDataSource dataSource = request.getContext().getDataSource();
                if (wordDetector.getWordPart().isEmpty()) {
        this.additionalProposalInfo = object != null ? object : description;
        return false;
        return object instanceof DBSObject || object instanceof DBSObjectReference;
    public int getProposalScore() {
            if (object instanceof DBSObjectReference) {
                            } else {
    public int getReplacementLength() {
            } else {

                // Replace from identifier start to the end of current identifier
            return null;
        DBPNamedObject object,

                replacementLength = curOffset;
                }
        int cursorPosition,
        String description,
                    endOffset = wordDetector.getEndOffset();
                replacementLength = endOffset - startOffset;
        return this.request;
    /**
     * The string to be displayed in the completion proposal popup.
                    object = ((DBSObjectReference) object).resolveObject(monitor);

    public void setProposalScore(int proposalScore) {
    // The proposal may contain identifier containing alias. Let's handle it using this ugly hack for now
        boolean useFQName = dataSource != null && request.getContext().isUseFQNames() && proposalContainsStructSeparator;

                    for (DBSProcedureParameter param : parameters) {

                } else {
                    startOffset++;
            replacementLength = wordDetector.getLength();
            return true;
                if (startOffset == -1) {
        DBPDataSource dataSource = request.getContext().getDataSource();
        String displayString,
                replacementLength++;
        this.replacementAfter = replacementAfter;
    }
        this.replacementFull = dataSource == null ?
                // Replace closing quote (#6244)
 * Copyright (C) 2010-2025 DBeaver Corp and others
                return true;
