    @Property(viewable = true, order = 3)
    public String getVersion()


    }
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
    public String getUniqueId()
/*
import org.jkiss.code.NotNull;

        this.lineNumber = JDBCUtils.safeGetInteger(resultSet, "STMTNO");
    }
    public String getText()
}
    public Integer getLineNumber()
    private String uniqueId;
 * You may obtain a copy of the License at
    {
 * DBeaver - Universal Database Manager
 * @author Denis Forveille
        this.text = JDBCUtils.safeGetString(resultSet, "TEXT");
    {
    public String getTextPreview()

import java.sql.ResultSet;
    private static final int MAX_LENGTH_TEXT = 132;
 * Copyright (C) 2010-2024 DBeaver Corp and others

    public DB2PackageStatement(DB2Package db2Package, ResultSet resultSet) throws DBException
        return lineNumber;
        super(db2Package, String.valueOf(JDBCUtils.safeGetInteger(resultSet, "SECTNO")), true);
 * you may not use this file except in compliance with the License.



    // -----------------
import org.jkiss.dbeaver.model.meta.Property;
    // -----------------
 */
    // Properties
public class DB2PackageStatement extends DB2Object<DB2Package> {
    {


    // Constructors

    {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        return text.substring(0, Math.min(MAX_LENGTH_TEXT, text.length()));
    // -----------------------
    @Property(viewable = true, order = 2)
    }
 * DB2 Package Statement
    public String getName()
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ext.db2.model;
 *


    private String version;
        this.version = JDBCUtils.safeGetString(resultSet, "VERSION");

/**
 *
        return version;
 * 
import org.jkiss.dbeaver.DBException;
    private Integer lineNumber;
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
 * See the License for the specific language governing permissions and
    {
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
    private String text;
    {
        return text;
    @Property(viewable = true, order = 1)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
 *
    }
import java.nio.charset.StandardCharsets;
    }
    @Override
        return uniqueId;
    }
    @Property(viewable = true, order = 4)
    // -----------------------
        return super.getName();
        this.uniqueId = new String(JDBCUtils.safeGetBytes(resultSet, "UNIQUE_ID"), StandardCharsets.UTF_8);

    @Property(viewable = false, order = 6)
    @Property(viewable = true, order = 5)
    }
