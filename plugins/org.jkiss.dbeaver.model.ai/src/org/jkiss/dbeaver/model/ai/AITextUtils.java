        }
                chunks.add(new MessageChunk.Text(buffer.toString(), List.of()));
            text
    @NotNull
        allMatches.sort(Comparator.comparingInt(a -> a.start));
        );
            context.getExecutionContext().getDataSource(),
                    }
        final int end;
import org.jkiss.dbeaver.Log;
            }
        final boolean isMarkdown;
        }
                continue;
    private static class MatchInfo {
            ));
                true
 * Licensed under the Apache License, Version 2.0 (the "License");

 *
        return convertToSQL(
        @NotNull DBPDataSource dataSource,
            monitor,
    ) {
            builder.append(SQLUtils.generateCommentLine(dataSource, prompt.getContent()));
    private static final Pattern MARKDOWN_LINK_PARSER = Pattern.compile("\\[([^]]+)]\\(([^)]+)\\)");
        if (lastEnd < text.length()) {

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        // prevents instantiation
        );
 * limitations under the License.
            if (match.start > lastEnd) {

    @NotNull

 * DBeaver - Universal Database Manager
    }


    ) {
        return output;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            } else if (chunk instanceof MessageChunk.Text text) {
        @NotNull AIMessage prompt,
import org.jkiss.dbeaver.model.sql.SQLConstants;
import org.jkiss.dbeaver.model.sql.SQLUtils;
        @NotNull AIMessage userMessage,
                urlMatcher.end(),
                code = code.substring(0, code.length() - 1);


            buffer.append(match.displayText);

     * @param markdown the full Markdown string
        StringBuilder buffer = new StringBuilder();
        }
        try {
import org.jkiss.dbeaver.model.DBUtils;
        for (MatchInfo match : allMatches) {
import org.jkiss.dbeaver.model.app.DBPProject;
        for (String line : text.lines().toArray(String[]::new)) {
                }

        }
        return chunks.toArray(MessageChunk[]::new);
        }
 */
                    codeBlockTag = line.substring(markIndex + 3);
     *
 * See the License for the specific language governing permissions and
        List<LinkPosition> links = new ArrayList<>();
    private static List<DBSObject> loadCheckedEntitiesById(
    private static final Pattern URL_PARSER = Pattern.compile("\\b(https?://|ftp://)[^\\s<>\"{}|\\\\^`\\[\\]]+");
                addTextWithLinks(chunks, buffer.toString());
// All these ideally should be a part of a given AI engine
        } catch (Exception e) {
    }
        String codeBlockTag = null;
            allMatches.add(new MatchInfo(
    public static MessageChunk[] processAndSplitCompletion(
        }


                buffer.append('\n');
                    output.add(object);



                markdownMatcher.group(2),
        while (urlMatcher.find()) {
import java.util.Comparator;
                String firstKeyword = SQLUtils.getFirstKeyword(dialect, line);
        Pattern.compile("```[\\w+]*\\R([\\s\\S]*?)\\R```");

 *     http://www.apache.org/licenses/LICENSE-2.0
    private static final Log log = Log.getLog(AITextUtils.class);
            return loadCheckedEntitiesById(monitor, dataSource.getContainer().getProject(), ids);
                markdownMatcher.start(),
 * Copyright (C) 2010-2026 DBeaver Corp and others
        if (DBWorkbench.getPlatform().getPreferenceStore().getBoolean(AIConstants.AI_INCLUDE_SOURCE_TEXT_IN_QUERY_COMMENT)) {
    public static final String CODE_BLOCK_MARK = "```";
                log.debug("Error loading object '" + id + "': " + e.getMessage());
            String code = matcher.group(1).trim();
        String processedCompletion = sqlFormatter.formatGeneratedQuery(
    private static final Pattern CODE_BLOCK_PATTERN =

    public static MessageChunk[] splitIntoChunks(@NotNull String text, boolean parseLinks) {
     * Extracts the contents of the first Markdown code block in the input.
                }
import java.util.regex.Matcher;
    public static String extractGeneratedSqlQuery(
            allMatches.add(new MatchInfo(
        if (matcher.find()) {
            this.start = start;
                buffer.append(text, lastEnd, match.start);
        @NotNull Set<String> ids
 * you may not use this file except in compliance with the License.
    }
        @NotNull DBRProgressMonitor monitor,
        StringBuilder buffer = new StringBuilder();
        return splitIntoChunks(BasicSQLDialect.INSTANCE, text, parseLinks);
    }
import org.jkiss.dbeaver.model.ai.impl.MessageChunk;
            buffer.append(text, lastEnd, text.length());
            } else if (codeBlockTag == null && !SQLUtils.isCommentLine(dialect, line)) {
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
        final List<DBSObject> output = new ArrayList<>();
            dbContext.getExecutionContext().getDataSource()
        Matcher markdownMatcher = MARKDOWN_LINK_PARSER.matcher(text);
            int markIndex = line.indexOf(CODE_BLOCK_MARK);
                markdownMatcher.group(1),
                    if (codeBlockTag != null) {
import org.jkiss.dbeaver.model.DBPDataSource;
    public static String convertToSQL(
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
                false
        @Nullable DBPDataSource dataSource
    /**
                        chunks.add(new MessageChunk.Code(buffer.toString(), codeBlockTag));
        @NotNull String result
                markdownMatcher.end(),
        @NotNull AISqlFormatter sqlFormatter,
            userMessage,
                builder.append(SQLUtils.generateCommentLine(dataSource, text.text()));
        if (links.isEmpty()) {
        final String displayText;
import org.jkiss.dbeaver.model.ai.registry.AIAssistantRegistry;
        while (markdownMatcher.find()) {
            if (chunk instanceof MessageChunk.Code code) {
            }
            lastEnd = match.end;
    public static String extractCode(String markdown) {
    }
        }
                    codeBlockTag = null;
        @NotNull DBRProgressMonitor monitor,
                urlMatcher.group(),
    @NotNull
package org.jkiss.dbeaver.model.ai;
                DBSObject object = DBUtils.findObjectById(monitor, project, id);
        }

        if (!buffer.isEmpty()) {
        @NotNull DBPProject project,
        @NotNull Set<String> ids

        final int start;
        AISqlFormatter sqlFormatter = AIAssistantRegistry.getInstance().getDescriptor().createSqlFormatter();

        @NotNull String text
    public static MessageChunk[] splitIntoChunks(@NotNull SQLDialect dialect, @NotNull String text, boolean parseLinks) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.code.Nullable;
            true
    @NotNull
            dbContext,


                }
                if (!buffer.isEmpty()) {
    public static final String SQL_LANGUAGE_ID = "sql";
        @NotNull AIDatabaseContext dbContext,
                    codeBlockTag = SQL_LANGUAGE_ID;
        }
                urlMatcher.start(),
        @NotNull List<MessageChunk> chunks,
        return splitIntoChunks(

            if (!buffer.isEmpty()) {
            result

    ) throws DBException {

import org.jkiss.dbeaver.model.sql.SQLDialect;
            if (markIndex >= 0) {
                builder.append(code.text()).append(System.lineSeparator());

    private AITextUtils() {
            ));
        @NotNull String text
                    buffer.setLength(0);
        final StringBuilder builder = new StringBuilder();
    }

        int lastEnd = 0;

        return builder.toString().trim();
     * If the code ends with a semicolon, it's removed.
            }
        List<MatchInfo> allMatches = new ArrayList<>();
    ) {
        monitor.beginTask("Load custom entities", ids.size());
    ) {
            monitor.done();
                    buffer.append(tail.trim());
    private static void addTextWithLinks(
    }
        final List<MessageChunk> chunks = new ArrayList<>();
            sqlFormatter,
        final String url;
        Matcher urlMatcher = URL_PARSER.matcher(text);

                continue;
import java.util.List;
            buffer.append(line);
        for (String id : ids) {
 * You may obtain a copy of the License at
    }
        }
            chunks.add(new MessageChunk.Text(buffer.toString(), links));
            monitor.worked(1);
                if (codeBlockTag != null) {
            SQLUtils.getDialectFromDataSource(context.getExecutionContext().getDataSource()),
        MatchInfo(int start, int end, String displayText, String url, boolean isMarkdown) {
 *
                    } else if (parseLinks){
        }
            this.url = url;
    ) throws DBException {
            this.displayText = displayText;
        MessageChunk[] messageChunks = processAndSplitCompletion(
            }
                if (markIndex > 0) {
            if (codeBlockTag != null) {
            return code;

import org.jkiss.dbeaver.model.ai.engine.AIDatabaseContext;
        } finally {
            processedCompletion,
            monitor,
                chunks.add(new MessageChunk.Code(buffer.toString(), codeBlockTag));
     */

    @NotNull
 * Unless required by applicable law or agreed to in writing, software
                        addTextWithLinks(chunks, buffer.toString());
                if (object != null) {

        @NotNull AIDatabaseContext context,
        );
            if (match.start < lastEnd) {
     * @return the inner code without trailing semicolon, or an empty string if none found
        @NotNull DBRProgressMonitor monitor,
            chunks.add(new MessageChunk.Text(text, List.of()));
            log.debug(e);
                }

            if (code.endsWith(";")) {
            messageChunks,
            try {
        return markdown;
        } else {
            } else if (parseLinks) {

        @NotNull DBRProgressMonitor monitor,


import org.jkiss.dbeaver.DBException;
            } else {
    }


        );

                        chunks.add(new MessageChunk.Text(buffer.toString(), List.of()));
    }
            }
 *
            this.isMarkdown = isMarkdown;
            } catch (DBException e) {
}

            links.add(new LinkPosition(buffer.length(), match.displayText.length(), match.url));

        for (MessageChunk chunk : response) {
        Matcher matcher = CODE_BLOCK_PATTERN.matcher(markdown);

                    String tail = line.substring(0, markIndex);

            // Remove trailing semicolon if present
            }
            this.end = end;
                } else {
import org.jkiss.code.NotNull;
            }
import java.util.ArrayList;
        @NotNull MessageChunk[] response,
import org.jkiss.utils.ArrayUtils;
        }
                // Add pending chunk
import java.util.regex.Pattern;

public class AITextUtils {
                urlMatcher.group(),
        }
    @NotNull
import org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect;
        // Add last chunk
/*
    // Matches ```<optional language>\n ... \n```
                if (firstKeyword != null && ArrayUtils.contains(SQLConstants.QUERY_KEYWORDS, firstKeyword)) {

import java.util.Set;
    public static List<DBSObject> loadCustomEntities(
                }
import org.jkiss.dbeaver.model.ai.impl.LinkPosition;
            return List.of();
                    } else {
