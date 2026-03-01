/**
    private final int classId;
 * you may not use this file except in compliance with the License.
 *
public enum SQLServerObjectClass implements DBPObject {
    }

 * See the License for the specific language governing permissions and
        this.className = className;
    TYPE(6, "Type"),
    OBJECT_OR_COLUMN(1, "Object or column"),
    ASSEMBLY(5, "Assembly"),

 * You may obtain a copy of the License at
    ROUTE(19, "Route"),
    }

    DATABASE_FILE(22, "Database file"),
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
    REMOTE_SERVICE_BINDING(18, "Remote service binding"),
import org.jkiss.dbeaver.model.DBPObject;
package org.jkiss.dbeaver.ext.mssql.model;
    public int getClassId() {
 * Unless required by applicable law or agreed to in writing, software

 * DBeaver - Universal Database Manager
    }
        this.classId = classId;
 */

    DATABASE_PRINCIPAL(4, "Database principal"),
/*
 * Object class
    SQLServerObjectClass(int classId, String className) {
    public String getClassName() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.
        return className;

    private final String className;
        return classId;
    PARTITION_FUNCTION(21, "Partition function"),
    XML_SCHEMA_COLLECTION(10, "XML schema collection"),
    SCHEMA(3, "Schema"),
    INDEX(7, "Index"),
 */
    DATABASE(0, "Database"),
    PARAMETER(2, "Parameter"),
    SERVICE(17, "Service"),
    MESSAGE_TYPE(15, "Message type"),
    SERVICE_CONTRACT(16, "Service contract"),
    DATASPACE(20, "Dataspace (filegroup or partition scheme)"),
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    PLAN_GUIDE(27, "Plan guide");
}
