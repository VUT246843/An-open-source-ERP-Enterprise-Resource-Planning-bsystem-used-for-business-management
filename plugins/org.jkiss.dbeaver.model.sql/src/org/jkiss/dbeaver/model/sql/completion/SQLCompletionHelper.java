            } else {
import org.jkiss.dbeaver.model.sql.SQLHelpProvider;
                RuntimeUtils.runTask(helpReader, "Read help topic", ADDITIONAL_INFO_WAIT_TIMEOUT);
        @Nullable DBRProgressMonitor monitor,
            HelpReader helpReader = new HelpReader(context.getDataSource(), keywordType, keywords);

        String[] keywords,
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
                helpReader.run(monitor);
 * See the License for the specific language governing permissions and
                        monitor1,
        private final String[] keywords;

    }
        final SQLHelpProvider helpProvider = DBUtils.getAdapter(SQLHelpProvider.class, dataSource);
}
            this.keywords = keywords;
            }
            return null;
import org.jkiss.code.Nullable;
    }
        @Override
        final SQLHelpTopic helpTopic = helpProvider.findHelpTopic(monitor, keyword, keywordType);

        public void run(DBRProgressMonitor monitor) {

                if (info != null) {
 */
                return DBInfoUtils.makeObjectDescription(monitor, object, true);

        if (helpTopic == null) {
     * @return Information about the object
 * SQL Completion proposal
     */
            this.keywordType = keywordType;
    public static String readAdditionalProposalInfo(
        }
import org.jkiss.dbeaver.model.sql.SQLHelpTopic;

        } else {
    public static final int ADDITIONAL_INFO_WAIT_TIMEOUT = 3000;
 * DBeaver - Universal Database Manager
            }
        @Nullable DBPNamedObject object,
            } else {
    private static class HelpReader implements DBRRunnableWithProgress {
     * @param context completion context
        }

                RuntimeUtils.runTask(monitor1 ->
        private String info;

 *
    }
        } else if (!CommonUtils.isEmpty(helpTopic.getUrl())) {
                }
package org.jkiss.dbeaver.model.sql.completion;
public class SQLCompletionHelper {
                    "Extract object properties info",
        public HelpReader(DBPDataSource dataSource, DBPKeywordType keywordType, String[] keywords) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * @param monitor monitor
import org.jkiss.dbeaver.utils.RuntimeUtils;
        } else {
    ) {
        private final DBPDataSource dataSource;
import org.jkiss.utils.CommonUtils;
    private static String readDataSourceHelp(DBRProgressMonitor monitor, DBPDataSource dataSource, DBPKeywordType keywordType, String keyword) {
    @Nullable
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    /**
     * @param keywords list of keywords
     * @param keywordType type of keyword
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (CommonUtils.isEmpty(info)) {
        private final DBPKeywordType keywordType;
        if (!CommonUtils.isEmpty(helpTopic.getContents())) {

        }
            if (monitor == null) {
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.Log;
 *

            return helpTopic.getContents();

                String[] desc = new String[1];
                return desc[0];
 *
        }
        @NotNull SQLCompletionContext context,
 * Licensed under the Apache License, Version 2.0 (the "License");
                    ADDITIONAL_INFO_WAIT_TIMEOUT);
            return keywords.length == 0 ? null : keywords[0];
            }
            }
            for (String keyword : keywords) {
            return helpReader.info;
        if (helpProvider == null) {
            this.dataSource = dataSource;
 */
        @Nullable DBPKeywordType keywordType
                        object, true),
/**
 * limitations under the License.
 * you may not use this file except in compliance with the License.
        }
            return "<a href=\"" + helpTopic.getUrl() + "\">" + keyword + "</a>";
        if (object != null) {
                    break;
     * @param object object to get information from
 * Unless required by applicable law or agreed to in writing, software
            return null;
import org.jkiss.dbeaver.model.*;
/*
 * You may obtain a copy of the License at
    private static final Log log = Log.getLog(SQLCompletionHelper.class);
 * Copyright (C) 2010-2024 DBeaver Corp and others
            if (monitor == null) {
        } else if (keywordType != null && context.getDataSource() != null && context.isShowServerHelp()) {
                    desc[0] = DBInfoUtils.makeObjectDescription(
     *

            return null;
                info = readDataSourceHelp(monitor, dataSource, keywordType, keyword);
        }
                info = "<b>" + keywords[0] + "</b> (" + keywordType.name() + ")";
