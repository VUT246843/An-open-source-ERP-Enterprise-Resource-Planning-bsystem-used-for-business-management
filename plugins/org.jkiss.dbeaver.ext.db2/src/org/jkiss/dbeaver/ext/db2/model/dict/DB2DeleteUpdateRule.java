    C("Cascade", DBSForeignKeyModifyRule.CASCADE),
    @NotNull

    public DBSForeignKeyModifyRule getRule()
 * DB2 Foreign Key Delete/Update Rule
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.

    }

    }
}    private String name;
    N("Set Null", DBSForeignKeyModifyRule.SET_NULL),
    // -----------------------
        this.rule = rule;
    // ----------------
    @Override

 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
    // Display @Property Value
 */
        this.name = name;
    R("Restrict", DBSForeignKeyModifyRule.RESTRICT);
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;
 * distributed under the License is distributed on an "AS IS" BASIS,
    // ------------
    // ------------
        }
 *     http://www.apache.org/licenses/LICENSE-2.0

    {
/*
    @Override
    public String getName()
 *
 * you may not use this file except in compliance with the License.
    // Standard Getters
    {
 * DBeaver - Universal Database Manager
 * 

 *
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * @author Denis Forveille
                return db2Rule;
    // -----------------------
public enum DB2DeleteUpdateRule implements DBPNamedObject {
    }
/**
 */
    private DBSForeignKeyModifyRule rule;
    }
package org.jkiss.dbeaver.ext.db2.model.dict;
    // Helper
    A("No Action", DBSForeignKeyModifyRule.NO_ACTION),
    }
import org.jkiss.code.NotNull;
    {
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)

    {
    // ----------------
    public static DB2DeleteUpdateRule getDB2RuleFromDBSRule(DBSForeignKeyModifyRule dbsRule)
            }
        return rule;
    {
    // ----------------
        return null;
 * See the License for the specific language governing permissions and
        return name;
    // ----------------

    // Constructors

        return name;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            if (db2Rule.getRule().equals(dbsRule)) {
 *

    private DB2DeleteUpdateRule(String name, DBSForeignKeyModifyRule rule)
        for (DB2DeleteUpdateRule db2Rule : DB2DeleteUpdateRule.values()) {


import org.jkiss.dbeaver.model.DBPNamedObject;
    public String toString()
