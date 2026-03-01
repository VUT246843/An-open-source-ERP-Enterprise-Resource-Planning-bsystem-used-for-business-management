package org.jkiss.dbeaver.model.sql.completion;
 * See the License for the specific language governing permissions and
    }
    public void setContentType(String contentType) {
    private String wordPart;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        return this.stateTracker;
        TABLE,
 * Licensed under the Apache License, Version 2.0 (the "License");
    public enum QueryType {
        this.queryType = queryType;
    }
import org.jkiss.dbeaver.model.sql.SQLScriptElement;
    public QueryType getQueryType() {
    private String contentType;
        return wordPart;
    }
    private final SQLCompletionActivityTracker stateTracker;
 * you may not use this file except in compliance with the License.
        this.document = document;
 * DBeaver - Universal Database Manager

    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
    public SQLCompletionRequest(SQLCompletionContext context, IDocument document, int documentOffset, SQLScriptElement activeQuery, boolean simpleMode) {

    public SQLCompletionContext getContext() {
    public IDocument getDocument() {
        this.wordDetector = new SQLWordPartDetector(document, context.getSyntaxManager(), documentOffset);
        this.wordPart = wordPart;
    private final SQLScriptElement activeQuery;
}
        COLUMN,

    }


        return documentOffset;
    }
    }
    private final int documentOffset;


    private final IDocument document;
    }
        return contentType;
 *

        return activeQuery;
 *
    public SQLScriptElement getActiveQuery() {
    }
import org.jkiss.dbeaver.model.sql.parser.SQLWordPartDetector;
    public boolean isSimpleMode() {

        this.stateTracker = new SQLCompletionActivityTracker(simpleMode);
    private final boolean simpleMode;
        return queryType;
 *
/*
    }


    }
    public String getContentType() {
    public SQLCompletionActivityTracker getActivityTracker() {
        this.documentOffset = documentOffset;
        return simpleMode;
        return document;
    }
    public int getDocumentOffset() {
        this.wordPart = wordDetector.getWordPart();
        this.context = context;
    }
    public void setWordPart(String wordPart) {


 * Unless required by applicable law or agreed to in writing, software
    }
    public SQLWordPartDetector getWordDetector() {

    private final SQLWordPartDetector wordDetector;

        this.simpleMode = simpleMode;
    private QueryType queryType;
 *     http://www.apache.org/licenses/LICENSE-2.0


 * Copyright (C) 2010-2024 DBeaver Corp and others
        return wordDetector;

        this.activeQuery = activeQuery;
    public String getWordPart() {
public class SQLCompletionRequest {


    }
import org.eclipse.jface.text.IDocument;
 */
    public void setQueryType(QueryType queryType) {

        JOIN,

        return context;
        this.contentType = contentType;
 * You may obtain a copy of the License at
    private final SQLCompletionContext context;
        EXEC
