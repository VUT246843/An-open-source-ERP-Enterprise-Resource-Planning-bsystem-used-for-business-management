import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    }
    }

        
    }

    }
    }
    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) throws DBCException {
    // Properties
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public String getOwner() throws DBCException {
        text = "";
    @Property(viewable = true, order = 100)
    @Property(hidden = true, editable = true, updatable = true, order = -1)
    @NotNull
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;


    }
import org.jkiss.dbeaver.model.struct.DBSObjectState;
    @NotNull
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
    @Override
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
    }

package org.jkiss.dbeaver.ext.exasol.model;

 *
    public boolean isView() {
                    this.hasRead = true;
    public ExasolView(DBRProgressMonitor monitor, ExasolSchema schema, ResultSet dbResult) {

 * limitations under the License.
/*
    
    public String getSource() throws DBCException
    }
    

    @Override
        return this.text;
        return this;

    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
                        ExasolUtils.quoteString(this.getName())

                throw new DBCException(e, session.getExecutionContext());

    public ExasolView(ExasolSchema schema)
        super(schema, name, persisted);
import org.jkiss.dbeaver.ext.exasol.editors.ExasolSourceObject;

    @Override
 * you may not use this file except in compliance with the License.
                        this.hasRead = true;
                String sql = String.format("/*snapshot execution*/ SELECT VIEW_OWNER,VIEW_TEXT FROM SYS.EXA_ALL_VIEWS WHERE VIEW_SCHEMA = '%s' and VIEW_NAME = '%s'",
import org.jkiss.dbeaver.model.exec.DBCException;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.DBException;
    }
import org.jkiss.dbeaver.ext.exasol.tools.ExasolUtils;
        return getContainer().getViewCache().getChildren(monitor, getContainer(), this);
    }
            }
import java.sql.SQLException;
    }

                        this.owner = "SYS OBJECT";
            JDBCSession session = DBUtils.openMetaSession(new VoidProgressMonitor(), this, "Read Table Details");
import java.util.Collections;
        return getContainer().getViewCache().getChild(monitor, getSchema(), (ExasolView) this, attributeName);
        return Collections.emptyList();
 */
                    } else {
        super.refreshObject(monitor);

import org.jkiss.dbeaver.model.DBPEvaluationContext;
import java.util.Collection;
    }
    // Business Contract
    public void setObjectDefinitionText(String sourceText) throws DBException
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Property(viewable = true, editable = false, updatable = false, length = PropertyLength.MULTILINE, order = 40)
    }
public class ExasolView extends ExasolTableBase implements ExasolSourceObject, DBSView {
    // Associations (Imposed from DBSTable). In Exasol, Most of objects "derived"
        {
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    // -----------------
                
    // -----------------
        //force reading of attributes
    @Override
                    if (dbResult.next()) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        //return SQLFormatUtils.formatSQL(getDataSource(), this.text);
    @Override
        return Collections.emptyList();

        this.text = sourceText;
    }
        
    }

import org.jkiss.dbeaver.model.meta.PropertyLength;

                        );


    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
                        this.text = JDBCUtils.safeGetString(dbResult, "VIEW_TEXT");
                }
    }
    public DBSObjectState getObjectState() {
        if (!hasRead)
    @Override
        hasRead=false;
    public Collection<? extends DBSEntityAssociation> getReferences(@NotNull DBRProgressMonitor monitor) throws DBException {

import org.jkiss.code.NotNull;
                
        }
import java.util.Map;
    {
 *
    @Override
    private String text;
    {
                        ExasolUtils.quoteString(this.getSchema().getName()),
    private Boolean hasRead = false;
    
import java.sql.ResultSet;
 * You may obtain a copy of the License at
                try (JDBCResultSet dbResult = stmt.executeQuery(sql)) {
import java.util.List;

        read();
    public List<ExasolTableColumn> getAttributes(@NotNull DBRProgressMonitor monitor) throws DBException {
    // -----------------
    @Override
        read();
        return owner;
import org.jkiss.dbeaver.model.struct.DBSEntityAssociation;
            } catch (SQLException e) {
    }
import org.jkiss.dbeaver.model.DBUtils;
            try (JDBCStatement stmt = session.createStatement())
    @Override
    // from Tables don't have those..
        hasRead = true;
    {
        return DBUtils.getFullQualifiedName(getDataSource(), getSchema(), this);
 * DBeaver - Universal Database Manager
    public JDBCStructCache<ExasolSchema, ExasolView, ExasolTableColumn> getCache() {
                    }
        hasRead = false;
    public Collection<ExasolTableForeignKey> getAssociations(@NotNull DBRProgressMonitor monitor) throws DBException {


}


    @NotNull
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return this.text;
    
    @Override
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.struct.DBSObject;
        return super.getDescription();
import org.jkiss.dbeaver.model.meta.Property;
    // -----------------

    
    @Override
    public ExasolTableColumn getAttribute(@NotNull DBRProgressMonitor monitor, @NotNull String attributeName) throws DBException {
    private String owner;
        return true;
    
        return DBSObjectState.NORMAL;
            {
    // -----------------
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCStructCache;
import org.jkiss.dbeaver.model.struct.rdb.DBSView;
    }
        return getContainer().getViewCache();
    private void read() throws DBCException
            

        super(monitor, schema, dbResult);


    @NotNull
    @Override
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;

                        this.owner = JDBCUtils.safeGetString(dbResult, "VIEW_OWNER");
        super(schema,null,false);
    {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        read();
    public String getDescription() {
    public ExasolView(ExasolSchema schema, String name, boolean persisted) {

    // -----------------
    }
                        this.text = "-- No View Text for system objects available";
