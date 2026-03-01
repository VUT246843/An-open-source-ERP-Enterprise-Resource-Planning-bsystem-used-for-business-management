        this.isSuperProjection = JDBCUtils.safeGetBoolean(dbResult, "is_super_projection");
    public Collection<? extends DBSTableConstraint> getConstraints(@NotNull DBRProgressMonitor monitor) throws DBException {
    private final boolean isPreJoin;
    @Property(order = 57)
            return null;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

        } else {
    public String getCreateType() {
    private final String createType;
    @Property(order = 55)
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ext.vertica.VerticaUtils;
    private final String aggregateType;
        this.description = JDBCUtils.safeGetString(dbResult, "comment");
    }
        this.aggregateType = JDBCUtils.safeGetString(dbResult, "aggregate_type");
 */


import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTable;
    public String getAnchorTableName() {
/**
        return getContainer().projectionCache.getChildren(monitor, getContainer(), this);
/*


        return hasExpressions;
    }
    private final String segmentRange;
        return null;
    private final String segmentExpression;
    public Collection<? extends DBSTableIndex> getIndexes(@NotNull DBRProgressMonitor monitor) throws DBException {
import org.jkiss.dbeaver.Log;
    @Override
        return isSuperProjection;
    public boolean isSuperProjection() {
            this);
 *
    public boolean isView() {
        this.ownerName = JDBCUtils.safeGetString(dbResult, "owner_name");
    }
        return createType;
    @Override
    }

    private final String anchorTableName;
        return null;

 */
 * You may obtain a copy of the License at
    }
public class VerticaProjection extends JDBCTable<VerticaDataSource, VerticaSchema> implements GenericScriptObject

    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return false;
    public boolean isPreJoin() {
        if (isPersisted()) {
    public String getDescription() {
    public String getNodeName() {
    }
    @Property(order = 54)
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
import java.util.Map;
        this.isAggregateProjection = JDBCUtils.safeGetBoolean(dbResult, "is_aggregate_projection");
        this.segmentExpression = JDBCUtils.safeGetString(dbResult, "segment_expression");
        this.createType = JDBCUtils.safeGetString(dbResult, "create_type");
    }
    public List<? extends DBSEntityAttribute> getAttributes(@NotNull DBRProgressMonitor monitor) throws DBException {
    @Override
{
    public boolean isHasExpressions() {
    @Override
import org.jkiss.dbeaver.model.struct.rdb.DBSTableConstraint;
    @Property(order = 58)
    @Property(order = 50)
            return VerticaUtils.getObjectDDL(monitor, getDataSource(), this);
    @Property(viewable = true, order = 11)
        this.segmentRange = JDBCUtils.safeGetString(dbResult, "segment_range");
    private final long objectId;
    }
    @Override
        return isPreJoin;
    public long getObjectId() {
    }



    @NotNull
        return DBUtils.getFullQualifiedName(
        this.isKeyConstraintProjection = JDBCUtils.safeGetBoolean(dbResult, "is_key_constraint_projection");
 * distributed under the License is distributed on an "AS IS" BASIS,
        return isKeyConstraintProjection;


    private final boolean isSuperProjection;
        this.nodeName = JDBCUtils.safeGetString(dbResult, "node_name");
    }
        super(schema, JDBCUtils.safeGetString(dbResult, "projection_name"), true);
    @Override
import org.jkiss.dbeaver.model.struct.DBSEntity;

import org.jkiss.dbeaver.model.struct.DBSEntityAssociation;
    }
        return anchorTableName;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.meta.Property;
        this.anchorTableName = JDBCUtils.safeGetString(dbResult, "anchor_table_name");
    @Property(order = 52)
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        this.hasExpressions = JDBCUtils.safeGetBoolean(dbResult, "has_expressions");
 *
    @Property(order = 56)
    public String getSegmentRange() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public boolean isKeyConstraintProjection() {
 * See the License for the specific language governing permissions and
    }
    @Override

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

    public boolean isIsAggregateProjection() {
    @Property(viewable = true, order = 13)
    private final String baseName;
    public JDBCStructCache<VerticaSchema, ? extends DBSEntity, ? extends DBSEntityAttribute> getCache() {
    }
        return ownerName;
}
    @Override
    @Property(order = 53)
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
        return segmentRange;
            getContainer(),

    }
        return baseName;
    private final boolean hasExpressions;
import java.util.Collection;
        this.baseName = JDBCUtils.safeGetString(dbResult, "projection_basename");
    }
        this.objectId = JDBCUtils.safeGetLong(dbResult, "projection_id");
        }
        return isAggregateProjection;

        return segmentExpression;
    public Collection<? extends DBSEntityAssociation> getReferences(@NotNull DBRProgressMonitor monitor) throws DBException {
    }
        return null;
    }
    }
    }
    public String getBaseName() {
    public VerticaProjection(VerticaSchema schema, JDBCResultSet dbResult) {
    @Override
 * limitations under the License.
    }
import org.jkiss.dbeaver.ext.generic.model.GenericScriptObject;
    public String getSegmentExpression() {
import org.jkiss.code.NotNull;
    }
 * VerticaMetaModel
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndex;

    @Property(order = 51)
    public DBSEntityAttribute getAttribute(@NotNull DBRProgressMonitor monitor, @NotNull String attributeName) throws DBException {
    private final boolean isAggregateProjection;
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCStructCache;

    }




    private final boolean isKeyConstraintProjection;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBUtils;
    @Override
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.DBException;
package org.jkiss.dbeaver.ext.vertica.model;
    public Collection<? extends DBSEntityAssociation> getAssociations(@NotNull DBRProgressMonitor monitor) throws DBException {
    @Property(viewable = true, order = 12)

    @Override
    @Property(viewable = true, order = 100)
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    private final String nodeName;
        return aggregateType;
 *
        return null;

        return description;
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
        return getContainer().projectionCache;
        return nodeName;
    }
    public String getAggregateType() {
    public String getOwnerName() {
        this.isPreJoin = JDBCUtils.safeGetBoolean(dbResult, "is_prejoin");

    private static final Log log = Log.getLog(VerticaProjection.class);

        return getContainer().projectionCache.getChild(monitor, getContainer(), this, attributeName);


    private final String description;
    }

    @NotNull
    private final String ownerName;
import java.util.List;
    }

            getDataSource(),
    @Property(viewable = true, order = 10)
 * Licensed under the Apache License, Version 2.0 (the "License");
        return objectId;
