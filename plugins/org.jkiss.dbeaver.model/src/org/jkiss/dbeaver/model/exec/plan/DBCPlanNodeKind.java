    UNION("Union", null),
 * limitations under the License.
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.impl.struct.RelationalObjectType;

 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0

    JOIN("Join", null),
    SORT("Sort", null),
    public String getTitle() {

 * You may obtain a copy of the License at
    MERGE("Merge", null),
public enum DBCPlanNodeKind {
    SELECT("Select", null),
        this.objectType = objectType;

package org.jkiss.dbeaver.model.exec.plan;
    private final String title;
    INDEX_SCAN("Index scan", RelationalObjectType.TYPE_INDEX),
 * DBeaver - Universal Database Manager
 *
 * Execution plan node kind
/**

 * See the License for the specific language governing permissions and
    HASH("Hash", null),
/*
    FUNCTION("Function", null),

    }
        return title;

    TABLE_SCAN("Table scan", RelationalObjectType.TYPE_TABLE),
}    SET("Set", null),
    RESULT("Result", null),
        this.title = title;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.struct.DBSObjectType;
 * Licensed under the Apache License, Version 2.0 (the "License");
    AGGREGATE("Aggregate", null),
    DBCPlanNodeKind(String title, DBSObjectType objectType) {
 *
    }
        return objectType;
    GROUP("Group", null),
    public DBSObjectType getObjectType() {
 */
    DEFAULT("Node", null),
    private final DBSObjectType objectType;
    FILTER("Filter", null),

    }
 *
    MATERIALIZE("Materialize", null),
    MODIFY("Modify", null);
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
