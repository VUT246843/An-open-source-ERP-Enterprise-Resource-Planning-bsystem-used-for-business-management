 * you may not use this file except in compliance with the License.
    RCT("Key Sequence Index", false),

    public String getName()
    CLUS("Clustering Index", true),
 * distributed under the License is distributed on an "AS IS" BASIS,
 * 
 * DB2 Type of Indexes

 *
        this.validForCreation = validForCreation;
    private DB2IndexType(String name, Boolean validForCreation)

    private Boolean      validForCreation;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }

    // -----------------------

 *     http://www.apache.org/licenses/LICENSE-2.0
        return dbsIndexType;
    // ----------------
package org.jkiss.dbeaver.ext.db2.model.dict;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.NotNull;
 * Copyright (C) 2010-2024 DBeaver Corp and others

    }
    @NotNull

    REG("Regular", true),

 */

    // Constructor
 *
 */
    }
    BLOK("Block Index", false),
    // Display @Property Value
    {
} *
 * See the License for the specific language governing permissions and
    }
    private String       name;
    public DBSIndexType getDBSIndexType()
 * DBeaver - Universal Database Manager
    private DBSIndexType dbsIndexType;
    CPMA("Page map index", false),

/*
        this.name = name;

    // ----------------

    // -----------------------
        return name;
    XVIL("Index over XML column (logical)", false),
    // -----------------

    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public String toString()
 * Copyright (C) 2013-2016 Denis Forveille (titou10.titou10@gmail.com)
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
 * limitations under the License.

        return validForCreation;
public enum DB2IndexType implements DBPNamedObject {
import org.jkiss.dbeaver.model.DBPNamedObject;
    XPTH("XML path Index", false),
    // Standard Getters
        return name;
    public Boolean isValidForCreation()
    // -----------------

    XVIP("Index over XML column (physical)", false);

 * You may obtain a copy of the License at
    XRGN("XML region Index", false),
    DIM("Dimension Block Index", false),
    @Override
        this.dbsIndexType = new DBSIndexType(this.name(), name);
    {
    {
 * @author Denis Forveille
    }
    TEXT("Text Index", false),
    {
/**

    {

