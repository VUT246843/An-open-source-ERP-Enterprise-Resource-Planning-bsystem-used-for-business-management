 *
    public String getStatement_id()

 * @author Denis Forveille
    // ------------
        sb.append("   AND EXPLAIN_TIME = ?");
    {
    {

/**

    public DB2PlanInstance(DB2DataSource dataSource,
 *     http://www.apache.org/licenses/LICENSE-2.0
    // -------------
 */
    // -------
        StringBuilder sb = new StringBuilder(1024);
/**
    private String explainRequester;

    // DF : This class is not used yet by the tool
    public String getSourceVersion()
/*
 * @author Denis Forveille
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    // -------------

        sb.append(" WITH UR");
    // Standards Getters

    }
}
    private String sourceName;
    public String getSourceName()
    }
        sb.append("   AND SOURCE_VERSION = ?");
        return explainTime;
 * Licensed under the Apache License, Version 2.0 (the "License");
public class DB2PlanInstance {
 * DB2 EXPLAIN_INSTANCE table
                           ResultSet dbResult,
    static {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return sourceName;
    private String statement_id;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        sb.append(" WHERE EXPLAIN_REQUESTER = ?");
 *
    public String getSourceSchema()
    private Timestamp explainTime;
package org.jkiss.dbeaver.ext.db2.model.plan;
    // ------------
 */
import org.jkiss.dbeaver.ext.db2.model.DB2DataSource;
 * limitations under the License.
import java.sql.SQLException;

import java.sql.ResultSet;
        sb.append(" FROM EXPLAIN_STATEMENT");
    {


        return explainRequester;


    private static String SEL_EXP_STATEMENT;

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 *
        this.explainTime = JDBCUtils.safeGetTimestamp(dbResult, "EXPLAIN_TIME");
 * DB2 EXPLAIN_INSTANCE table

import java.sql.Timestamp;
        this.db2PlanStatement = db2PlanStatement;
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.sourceVersion = JDBCUtils.safeGetStringTrimmed(dbResult, "SOURCE_VERSION");
        return sourceVersion;

 */
    }
    // Queries
 *
        this.sourceName = JDBCUtils.safeGetStringTrimmed(dbResult, "SOURCE_NAME");
        sb.append("   AND SOURCE_NAME = ?");
 * You may obtain a copy of the License at
        return sourceSchema;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }

                           DB2PlanStatement db2PlanStatement) throws SQLException
 * See the License for the specific language governing permissions and
                           JDBCSession session,
        this.explainRequester = JDBCUtils.safeGetStringTrimmed(dbResult, "EXPLAIN_REQUESTER");
    public String getExplainRequester()
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager

    {
    {

    private DB2PlanStatement db2PlanStatement;

    }
    {
    private String sourceSchema;
 * Unless required by applicable law or agreed to in writing, software

        sb.append("   AND SOURCE_SCHEMA = ?");
        return statement_id;
 *
    public Timestamp getExplainTime()
    // Constructors
    {
        SEL_EXP_STATEMENT = sb.toString();


    // -------

        sb.append("SELECT *");
    private String sourceVersion;

    }
    }
 *
        this.sourceSchema = JDBCUtils.safeGetStringTrimmed(dbResult, "SOURCE_SCHEMA");
