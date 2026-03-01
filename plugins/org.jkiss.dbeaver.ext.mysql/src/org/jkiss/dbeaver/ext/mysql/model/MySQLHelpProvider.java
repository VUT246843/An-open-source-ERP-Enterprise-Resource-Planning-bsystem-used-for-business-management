
import org.jkiss.dbeaver.model.DBPKeywordType;
            loadTopics(monitor);
        } catch (Exception e) {
 */
                "SELECT name, description, example, url FROM mysql.help_topic")) {
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
 * MySQLHelpProvider
        try (final JDBCSession session = DBUtils.openMetaSession(monitor, dataSource, "Read MySQL help topics")) {
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                        helpTopic.setExample(dbResult.getString(3));
    private static final Log log = Log.getLog(MySQLHelpProvider.class);
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
                    }
 *
    }
                                topicCache.put(topicName.toUpperCase(Locale.ENGLISH), helpTopic);
    }
package org.jkiss.dbeaver.ext.mysql.model;
            return null;
 * you may not use this file except in compliance with the License.
}

            log.error("Error reading MySQL help topics", e);
        synchronized (topicCache) {

/**
import org.jkiss.utils.CommonUtils;
            return topicCache.get(topic.toUpperCase(Locale.ENGLISH));
    @Override
                        }
    private final MySQLDataSource dataSource;
                            }
    }


 *
import org.jkiss.dbeaver.Log;

import java.util.Map;
        return selectHelpTopic(monitor, keyword);
    private SQLHelpTopic selectHelpTopic(DBRProgressMonitor monitor, String topic) {
        if (!isLoaded) {
                        helpTopic.setUrl(dbResult.getString(4));
import org.jkiss.dbeaver.model.sql.SQLHelpTopic;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.sql.SQLHelpProvider;
 */
        this.dataSource = dataSource;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
{
        if (CommonUtils.isEmpty(topic)) {

import java.util.Locale;
 * distributed under the License is distributed on an "AS IS" BASIS,
            isLoaded = true;
        }
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
 * Copyright (C) 2010-2024 DBeaver Corp and others
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
                        SQLHelpTopic helpTopic = new SQLHelpTopic();
            }
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
        } finally {
    public MySQLHelpProvider(MySQLDataSource dataSource) {
    public SQLHelpTopic findHelpTopic(DBRProgressMonitor monitor, String keyword, DBPKeywordType keywordType) {
                        String topicName = dbResult.getString(1);
                }
    private final Map<String, SQLHelpTopic> topicCache = new HashMap<>();
    private boolean isLoaded = false;
    private void loadTopics(DBRProgressMonitor monitor) {
                    while (dbResult.next()) {
        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                        helpTopic.setContents("<pre>" + dbResult.getString(2) + "</pre>");
 * DBeaver - Universal Database Manager
                        if (topicName != null) {
                            synchronized (topicCache) {
import java.util.HashMap;

 *
public class MySQLHelpProvider implements SQLHelpProvider

    }
        }
