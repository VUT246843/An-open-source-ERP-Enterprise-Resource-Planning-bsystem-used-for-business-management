    {
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
 * you may not use this file except in compliance with the License.
    public String getPredicateText()

 * DB2 EXPLAIN_PREDICATE table
 * Unless required by applicable law or agreed to in writing, software
    {
        return whenEvaluated;
    public String getWhenEvaluated()
        }
        displayName = sb.toString();
 *


            sb.append(" - ");
        return predicateId;
    private Integer predicateId;

    // Standard Getters
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
    public String toString()
    private String howApplied;
    }
    @NotNull
        return predicateText;
    public String getName()
 * You may obtain a copy of the License at

 *     http://www.apache.org/licenses/LICENSE-2.0


        return displayName;
        this.howApplied = JDBCUtils.safeGetString(dbResult, "HOW_APPLIED");
        if (whenEvaluated != null) {
    {

    }
    @Override
    private String predicateText;
import org.jkiss.code.NotNull;
 * 
    // -----------------

    // Business contract

    {
        this.whenEvaluated = JDBCUtils.safeGetString(dbResult, "WHEN_EVALUATED");
    public Integer getPredicateId()
        return howApplied;
 *
    // ------------
            sb.append(whenEvaluated);
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * @author Denis Forveille
    {
 * See the License for the specific language governing permissions and
        return predicateText;
 * limitations under the License.
        this.db2Operator = db2Operator;
 * distributed under the License is distributed on an "AS IS" BASIS,

    {
    // ----------------
    public DB2PlanOperatorPredicate(JDBCResultSet dbResult, DB2PlanOperator db2Operator)
    private String whenEvaluated;
    }
    public String getHowApplied()
    }
    {
 * DBeaver - Universal Database Manager
    public DB2PlanOperator getDb2Operator()
    private DB2PlanOperator db2Operator;
    }
    // Constructors
package org.jkiss.dbeaver.ext.db2.model.plan;

        return db2Operator;

        this.predicateId = JDBCUtils.safeGetInteger(dbResult, "PREDICATE_ID");
 *
import org.jkiss.dbeaver.model.DBPNamedValueObject;
/**
    // -----------------
    {
}
    {
    // ------------
    }

    private String displayName;
    public Object getObjectValue()
        StringBuilder sb = new StringBuilder(32);
 * Licensed under the Apache License, Version 2.0 (the "License");

    }
        return predicateText;

    @Override
    @NotNull
    @Override

    // ----------------
/*

 */
        this.predicateText = JDBCUtils.safeGetString(dbResult, "PREDICATE_TEXT");
    }
public class DB2PlanOperatorPredicate implements DBPNamedValueObject {
        sb.append(predicateId);
        sb.append(howApplied);
    }

        sb.append(" ");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

