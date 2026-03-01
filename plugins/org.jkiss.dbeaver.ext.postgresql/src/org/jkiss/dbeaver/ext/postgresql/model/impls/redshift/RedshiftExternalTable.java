    {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
{
    }
import org.jkiss.dbeaver.model.meta.Property;
    }
 *
        ////////////////////////////////////////////
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        this.inputFormat = JDBCUtils.safeGetString(dbResult, "input_format");
        return compressed;
        this.outputFormat = source.outputFormat;
    protected RedshiftExternalTable(RedshiftExternalSchema catalog)
    @Override
}
        this.location = source.location;
        return location;

    private static final Log log = Log.getLog(RedshiftExternalTable.class);
 * Unless required by applicable law or agreed to in writing, software
    }
    }
    private int compressed;
    public RedshiftExternalTable(DBRProgressMonitor monitor, RedshiftExternalSchema container, RedshiftExternalTable source, boolean persisted) throws DBException {
    @Property(viewable = false, order = 13)
    public PostgreRole getOwner(DBRProgressMonitor monitor) throws DBException {
        this.outputFormat = JDBCUtils.safeGetString(dbResult, "output_format");
        }
    {
        this.location = JDBCUtils.safeGetString(dbResult, "location");
    public RedshiftExternalTableColumn getAttribute(@NotNull DBRProgressMonitor monitor, @NotNull String attributeName)
        return null;
import java.util.List;
    @Override
    @Association
        return null;
    public String getSerializationLib() {
    @Override
        this.serializationLib = JDBCUtils.safeGetString(dbResult, "serialization_lib");
    public RedshiftExternalSchema getContainer() {
        this.compressed = source.compressed;
import org.jkiss.dbeaver.model.DBPRefreshableObject;
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException
    public String getSerdeParameters() {
        this.parameters = JDBCUtils.safeGetString(dbResult, "parameters");
        return null;

    @Override
        throws DBException

    protected void readTableStatistics(@NotNull JDBCSession session) throws SQLException {
/*
    public List<RedshiftExternalTableColumn> getCachedAttributes()
        return null;
    @Override
        return serializationLib;
    }
    {
    public List<RedshiftExternalTableColumn> getAttributes(@NotNull DBRProgressMonitor monitor)
    }

    // Copy constructor
        throws DBException
    @Override
import org.jkiss.dbeaver.Log;
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2026 DBeaver Corp and others
        this.serializationLib = source.serializationLib;
     * Table columns


            getContainer(),
        super(catalog);
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context)
 * distributed under the License is distributed on an "AS IS" BASIS,
        setName(JDBCUtils.safeGetString(dbResult, "tablename"));
        return inputFormat;
        super(catalog);
        throws DBException
    }
    }

import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
    @Nullable
    private String parameters;
        if (childrenCache != null) {
        return null;
    @Property(viewable = false, order = 16)
        return DBUtils.getFullQualifiedName(getDataSource(),
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
    @Property(viewable = false, order = 15)
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
import org.jkiss.dbeaver.model.struct.DBSObject;
    public synchronized Collection<? extends DBSEntityAssociation> getAssociations(@NotNull DBRProgressMonitor monitor)

    @Override
        return false;
import java.sql.ResultSet;
    public String getLocation() {
        // Not supported
import org.jkiss.code.NotNull;
    public RedshiftExternalSchema getSchema() {
     */
    @Override


    }
    @NotNull
    protected RedshiftExternalTable(
    @Property(viewable = false, order = 14)
    {

 */
    }
        return Collections.emptyList();
    private String outputFormat;
    }
        this.compressed = JDBCUtils.safeGetInt(dbResult, "compressed");


    public void setObjectDefinitionText(String sourceText) throws DBException {
    public String getParameters() {
    }
    // Remove standard PG table properties
    }

    {
    @NotNull
    {
    private String inputFormat;
    @Property(viewable = true, order = 12)
    private String location;

    }
    @Override
    public int getCompressed() {

import java.util.Collections;
    public boolean isView() {
        throws DBException
    }
    @Property(viewable = true, order = 11)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        super(monitor, container, source, persisted);
            this);
    /**
        return serdeParameters;
    public String getInputFormat() {
    }
    public Collection<PostgreTableConstraint> getConstraints(@NotNull DBRProgressMonitor monitor) throws DBException {

     * @param monitor progress monitor

    }
    public Collection<PostgreIndex> getIndexes(@NotNull DBRProgressMonitor monitor) throws DBException {
 * DBeaver - Universal Database Manager
        this.parameters = source.parameters;
    private String serializationLib;
    ////////////////////////////////////////////
    @Override
/**
        return (RedshiftExternalSchema)super.getContainer();
    public long getObjectId() {
    public PostgreTableConstraintBase getConstraint(@NotNull DBRProgressMonitor monitor, String ukName)
        final DBSObjectCache<RedshiftExternalTable, RedshiftExternalTableColumn> childrenCache = getContainer().getExternalTableCache().getChildrenCache(this);

    }
    private String serdeParameters;

        return null;
 *
    {

    // Redshift table properties
import java.util.Collection;
    @Override

    }

        ResultSet dbResult)
    {
    }
    {
    public Collection<? extends DBSEntityAssociation> getReferences(@NotNull DBRProgressMonitor monitor)
    }
        this.serdeParameters = source.serdeParameters;

 * See the License for the specific language governing permissions and
    @Association
    public String getOutputFormat() {
public class RedshiftExternalTable extends PostgreTable implements DBPRefreshableObject
        RedshiftExternalSchema catalog,
 *
import java.sql.SQLException;
        return 0;
        return outputFormat;
    }
    public String getDescription()
import java.util.Map;

    @Nullable
    @NotNull
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import org.jkiss.dbeaver.DBException;
    }
    @Override
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.model.meta.Association;

        this.serdeParameters = JDBCUtils.safeGetString(dbResult, "serde_parameters");

import org.jkiss.dbeaver.ext.postgresql.model.*;
        return getContainer().getExternalTableCache().getChildren(monitor, getContainer(), this);
        setPersisted(true);

    @Property(viewable = true, order = 10)
    public String[] getRelOptions() {

 * limitations under the License.
        this.inputFormat = source.inputFormat;
 * PostgreTable base

    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    }
    }
        return null;
    }
            return childrenCache.getCachedObjects();
        return getContainer().getExternalTableCache().refreshObject(monitor, getContainer(), this);
import org.jkiss.dbeaver.model.DBUtils;
        return parameters;
    @Override
        return null;

        throws DBException
    }

    @Override
 * You may obtain a copy of the License at
        return (RedshiftExternalSchema) super.getContainer();
import org.jkiss.dbeaver.model.struct.DBSEntityAssociation;
        return getContainer().getExternalTableCache().getChild(monitor, getContainer(), this, attributeName);
    @Override
    }
    }
import org.jkiss.code.Nullable;


    {


    {
        return null;
package org.jkiss.dbeaver.ext.postgresql.model.impls.redshift;
