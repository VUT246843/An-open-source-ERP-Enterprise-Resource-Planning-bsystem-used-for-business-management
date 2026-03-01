import org.jkiss.dbeaver.model.struct.DBSEntityAssociation;
    public String getName() {
    // -----------------
    }
    public Collection<ExasolTableForeignKey> getAssociations(@NotNull DBRProgressMonitor monitor) throws DBException {
    @Override
    @Override
    
import org.jkiss.dbeaver.model.meta.PropertyLength;
        this.objectId =JDBCUtils.safeGetBigDecimal(dbResult, "OBJECT_ID");
    // Properties
    }
    // from Tables don't have those..
 *
    }
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndex;

    }
        return Collections.emptyList();
    @Override

 */
 *
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;


import org.jkiss.dbeaver.model.struct.DBSObject;
    public Collection<? extends DBSEntityAssociation> getReferences(@NotNull DBRProgressMonitor monitor) throws DBException {
        super(schema, name, persisted);

package org.jkiss.dbeaver.ext.exasol.model;
    private String remarks;
import org.jkiss.dbeaver.ext.exasol.editors.ExasolStatefulObject;


    @Override

    
    public abstract ExasolTableColumn getAttribute(@NotNull DBRProgressMonitor monitor, @NotNull String attributeName) throws DBException;
        // No Indexes in Exasol

    @Nullable
 * You may obtain a copy of the License at

            return true;
    @NotNull
    // -----------------



import java.util.Collections;
    @Override
 */
import org.jkiss.dbeaver.model.DBUtils;
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        super(schema, true);
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
}
        return Collections.emptyList();
    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) throws DBCException {
import org.jkiss.dbeaver.DBException;
    @Property(viewable = false, order = 99, editable = true, updatable = true, length = PropertyLength.MULTILINE)
    public void setDescription(String description)
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
        this.remarks = description;
        return Collections.emptyList();
import org.jkiss.code.NotNull;
    // -----------------
    private String objectType;
    @Override

    {
    public String getDescription()

        return super.getContainer();

    // -----------------
import java.util.Collection;

        this.objectType = JDBCUtils.safeGetString(dbResult, "TABLE_TYPE");
 *
    }
 * @author Karl Griesser
import org.jkiss.dbeaver.model.exec.DBCException;
    public ExasolSchema getSchema() {
/**

 *     http://www.apache.org/licenses/LICENSE-2.0
        setName(JDBCUtils.safeGetString(dbResult, "COLUMN_TABLE"));
    }

    // -----------------
    @Override
 * DBeaver - Universal Database Manager

        return DBUtils.getFullQualifiedName(getDataSource(), getSchema(), this);
    // Business Contract
    public BigDecimal getObjectId()

        return super.getName();

    @Override
        return remarks;
    public Collection<? extends DBSTableIndex> getIndexes(@NotNull DBRProgressMonitor monitor) throws DBException {
    }
    public Collection<ExasolTableUniqueKey> getConstraints(@NotNull DBRProgressMonitor monitor) throws DBException {

    }
    public boolean isView() {
            return false;
import org.jkiss.code.Nullable;

 * Unless required by applicable law or agreed to in writing, software
    }
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTable;
        return this;
    	return this.objectId;
public abstract class ExasolTableBase extends JDBCTable<ExasolDataSource, ExasolSchema> implements DBPNamedObject2, DBPRefreshableObject, ExasolStatefulObject {
import org.jkiss.dbeaver.model.DBPNamedObject2;
        this.remarks = JDBCUtils.safeGetString(dbResult, "REMARKS");
 * limitations under the License.
    @Override
/*
    @Override
    // -----------------
 * See the License for the specific language governing permissions and

        return Collections.emptyList();
import java.sql.ResultSet;
    }
import java.math.BigDecimal;
    // Associations (Imposed from DBSTable). In Exasol, Most of objects "derived"
        if (objectType.equals("VIEW"))
    @Property(viewable = true, editable = false, order = 2)
        else
    }
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    {
    public ExasolTableBase(ExasolSchema schema, String name, boolean persisted) {


import org.jkiss.dbeaver.model.DBPRefreshableObject;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @NotNull
    {
    }

    @Nullable
import org.jkiss.dbeaver.model.meta.Property;
    private BigDecimal objectId;

    public ExasolTableBase(DBRProgressMonitor monitor, ExasolSchema schema, ResultSet dbResult) {
    }
    @Property(viewable = true, editable = false, valueTransformer = DBObjectNameCaseTransformer.class, order = 1)
