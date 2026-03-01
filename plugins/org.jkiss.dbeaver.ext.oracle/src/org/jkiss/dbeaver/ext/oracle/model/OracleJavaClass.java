    public DBSObjectState getObjectState() {
}
        sourceCode = OracleUtils.getSource(monitor, this, false, false);

 * See the License for the specific language governing permissions and
    @Override
    }
        return OracleSourceType.JAVA_SOURCE;
    private String sourceCode;

        return this;
 *
            return "-- Source unavailable for " + getName();
import org.jkiss.code.NotNull;
    @Property(viewable = true, order = 3)
        this.isAbstract = JDBCUtils.safeGetBoolean(dbResult, "IS_ABSTRACT", OracleConstants.YES);
    @Override
import org.jkiss.dbeaver.model.struct.DBSObject;
        this.sourceCode = source;
    }
        return isAbstract;
    private final boolean isStatic;
 *
 */
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
import org.jkiss.code.Nullable;
            sourceCode = "-- No source code found for Java class " + getName();
    @Override
        return sourceCode;
        }
 * DBeaver - Universal Database Manager
        if (CommonUtils.isEmpty(sourceName)) {

    {
    public OracleSourceType getSourceType() {
    }
    public Accessibility getAccessibility()
import org.jkiss.dbeaver.model.meta.Property;
        super(schema, JDBCUtils.safeGetString(dbResult, "NAME"), true);
        return isInterface;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }


    }


            return sourceCode;
    public boolean isFinal() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            )};
    public boolean isStatic() {
    @Property(viewable = true, order = 11)
import java.util.Map;
import org.jkiss.dbeaver.model.exec.DBCException;
    @NotNull
import java.sql.ResultSet;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;


import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.DBException;
        if (sourceCode != null) {
    {
import org.jkiss.dbeaver.model.struct.DBSObjectState;

        this.isStatic = JDBCUtils.safeGetBoolean(dbResult, "IS_STATIC", OracleConstants.YES);

        return sourceName;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Property(viewable = true, order = 2)
    private final boolean isInner;
    }
    private Accessibility accessibility;
 */
                "ALTER JAVA CLASS " + getFullyQualifiedName(DBPEvaluationContext.DDL) + " COMPILE"
        return DBSObjectState.NORMAL;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public boolean isInner() {
    }
        this.isDebug = JDBCUtils.safeGetBoolean(dbResult, "IS_DEBUG", OracleConstants.YES);
 *
        return isStatic;

        PROTECTED
    public String getSuperClass() {
    private final String sourceName;
 * Java class

    @Override
    }
    private final boolean isFinal;
        return isFinal;
        this.isInterface = "INTERFACE".equals(JDBCUtils.safeGetString(dbResult, "KIND"));
    @Override
    }
    @Nullable
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        sourceCode = null;
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
        return superClass;
    @Property(viewable = true, order = 15)
        return isDebug;
    private final boolean isDebug;
        return isInner;
/*
    }
    @Property(viewable = true, order = 13)

    @Property(viewable = false, order = 14)
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        PUBLIC,
    }
    public enum Accessibility {

        this.accessibility = CommonUtils.valueOf(Accessibility.class, JDBCUtils.safeGetString(dbResult, "ACCESSIBILITY"));
        this.sourceName = JDBCUtils.safeGetString(dbResult, "NAME");
import org.jkiss.dbeaver.model.DBPRefreshableObject;
 * You may obtain a copy of the License at
    @Property(viewable = false, order = 10)
 * limitations under the License.


    }

    }
    private final String superClass;
    public boolean isAbstract() {
 * you may not use this file except in compliance with the License.
        this.superClass = JDBCUtils.safeGetString(dbResult, "SUPER");
        }
    @Property(viewable = true, order = 12)
        this.isInner = JDBCUtils.safeGetBoolean(dbResult, "IS_INNER", OracleConstants.YES);
 * Unless required by applicable law or agreed to in writing, software
        }
    }
    public DBEPersistAction[] getCompileActions(DBRProgressMonitor monitor) {

    }
        if (CommonUtils.isEmpty(sourceCode)) {
import org.jkiss.dbeaver.ext.oracle.model.source.OracleSourceObject;
    public void setObjectDefinitionText(String source) {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    private final boolean isAbstract;
public class OracleJavaClass extends OracleSchemaObject implements OracleSourceObject, DBPRefreshableObject {

    public String getSourceName() {
        this.isFinal = JDBCUtils.safeGetBoolean(dbResult, "IS_FINAL", OracleConstants.YES);
    public boolean isInterface()
    @Override
/**
    public boolean isDebug() {
    @Override
        return new DBEPersistAction[] {
package org.jkiss.dbeaver.ext.oracle.model;


                OracleObjectType.JAVA_CLASS,


    private boolean isInterface;

    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) throws DBCException {
    {
        return accessibility;
    }
            new OracleObjectPersistAction(
    @NotNull


                "Compile Java class",
        PRIVATE,
    protected OracleJavaClass(OracleSchema schema, ResultSet dbResult)
    }
