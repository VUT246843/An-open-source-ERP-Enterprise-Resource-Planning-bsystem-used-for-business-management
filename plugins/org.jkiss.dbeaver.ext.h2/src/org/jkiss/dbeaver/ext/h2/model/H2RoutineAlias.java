    private String source;
        return super.getDescription();
public class H2RoutineAlias extends GenericProcedure {
            sourceDDL.append(" AS $$\n").append(source).append("$$");
        return super.getFunctionResultType();
    @Property(viewable = true, order = 8)
    }
            this.javaMethod = JDBCUtils.safeGetString(dbResult, "JAVA_METHOD");
    // Not supported

 */
 * You may obtain a copy of the License at
        if (!getDataSource().isServerVersionAtLeast(2, 0)) {
    public String getDescription() {
        StringBuilder sourceDDL = new StringBuilder(128);
    private String javaMethod;
 * distributed under the License is distributed on an "AS IS" BASIS,
        sourceDDL.append("CREATE ALIAS ").append(getFullyQualifiedName(DBPEvaluationContext.DDL));
    public H2RoutineAlias(@NotNull GenericStructContainer container, @NotNull String procedureName, String description, DBSProcedureType procedureType,
            sourceDDL.append(" FOR \"").append(javaClassAndMethod).append("\";");
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) {
    public GenericPackage getPackage() {

        return sourceDDL.toString();
 * Unless required by applicable law or agreed to in writing, software
    }
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
        return javaClass;
                          @Nullable GenericFunctionResultType functionResultType, @NotNull JDBCResultSet dbResult) {
import org.jkiss.dbeaver.ext.generic.model.*;
 * DBeaver - Universal Database Manager
    }
    public GenericCatalog getCatalog() {
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
            this.source = JDBCUtils.safeGetString(dbResult, "ROUTINE_DEFINITION");
 * See the License for the specific language governing permissions and
    public String getJavaMethod() {

        }
    public String getJavaClass() {
 *
    }
        }
    @Property(viewable = true, order = 7)
import java.util.Map;

import org.jkiss.dbeaver.model.meta.PropertyLength;
        return super.getPackage();
import org.jkiss.utils.CommonUtils;

import org.jkiss.code.Nullable;
        super(container, procedureName, procedureName, description, procedureType, functionResultType);
    }
 *
import org.jkiss.dbeaver.model.meta.Property;
    @NotNull
        } else if (CommonUtils.isNotEmpty(javaClassAndMethod) && !"null.null".equals(javaClassAndMethod)) { // Some bug in the H2 database version 2. EXTERNAL_NAME returns "null.null" instead of NULL


    @Override
        } else if (CommonUtils.isNotEmpty(javaClass) && CommonUtils.isNotEmpty(javaMethod)) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    // Not supported
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            // H2 Version 2 has another columns for routines
    }
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
            sourceDDL.append(" FOR \"").append(javaClass).append(".").append(javaMethod).append("\";");
        } else {
            this.javaClass = JDBCUtils.safeGetString(dbResult, "JAVA_CLASS");
    }


 * limitations under the License.

    @Nullable
        return super.getCatalog();
    private String javaClass;
}
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ext.h2.model;
    @Property(viewable = true, editable = true, updatable = true, length = PropertyLength.MULTILINE, order = 100)
 * you may not use this file except in compliance with the License.
    @Override
        return javaMethod;

    @Override
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
    // Not supported
    public GenericFunctionResultType getFunctionResultType() {
    private String javaClassAndMethod;
            this.javaClassAndMethod = JDBCUtils.safeGetString(dbResult, "EXTERNAL_NAME");

        if (CommonUtils.isNotEmpty(source)) {
            this.source = JDBCUtils.safeGetString(dbResult, "SOURCE");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
