	@Property(hidden = true)
        this.dataType = tableBase.getDataSource().getDataTypeId(JDBCUtils.safeGetLong(dbResult, "COLUMN_TYPE_ID"));
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return getTable();
        this.remarks=null;
					if (key.hasColumn(this))
        this.formatType = JDBCUtils.safeGetString(dbResult, "COLUMN_TYPE");
    public ExasolTableColumn(ExasolTableBase tableBase) throws DBException {
    }
        return super.getMaxLength();
	{
				for (ExasolTableUniqueKey key : uniqueKeysCache)
        setRequired(false);
    private Boolean changed = false;
			final Collection<ExasolTableUniqueKey> uniqueKeysCache = table.getConstraints(new VoidProgressMonitor());
    // -----------------
            this.changed = true;
import org.jkiss.dbeaver.DBException;
    }
    }
    @Property(viewable = true, editable = true, updatable = true, order = 21, listProvider = ExasolColumnDataTypeListProvider.class)
                    scale = 0;
    @NotNull
    }
    }
    // Constructors
    @Override

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    




    public void setDataType(@NotNull ExasolDataType dataType) {
    public void setIdentity(Boolean identity) {
import org.jkiss.dbeaver.model.meta.PropertyLength;
    @Override
 * You may obtain a copy of the License at
        this.remarks = JDBCUtils.safeGetString(dbResult, "COLUMN_COMMENT");
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        return super.getDefaultValue();
import org.jkiss.dbeaver.model.DBPDataKind;
		return false;
    public String getFormatType() {
            }
        if (!this.dataType.getTypeName().equals(dataType.getTypeName()))

    private String remarks;
        return false;
            this.identityValue = JDBCUtils.safeGetBigDecimal(dbResult, "COLUMN_IDENTITY");
                case ExasolConstants.TYPE_CHAR:
            this.changed = true;
    @Property(viewable = true, editable = true, updatable = true, order = 38)
		
    }
                    if (maxLength < 0 || maxLength > 36) {
        return this.formatType;
import org.jkiss.dbeaver.model.struct.DBSTypedObjectExt4;
 * See the License for the specific language governing permissions and
    @Override

    }
    @Override
    {
		{
	{
    	return this.identity;
    }
    @Property(viewable = true, order = 999, editable = true, updatable = true, length = PropertyLength.MULTILINE)

        
    @Property(viewable = false, order = 40)
		ExasolTableBase table = (ExasolTable) getTable();
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTableColumn;
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
        super.setRequired(required);
import org.jkiss.dbeaver.model.meta.Property;
        super.setMaxLength(maxLength);
        this.identity = JDBCUtils.safeGetInteger(dbResult, "COLUMN_IDENTITY") == null ? false : true;
                case ExasolConstants.TYPE_DECIMAL:
    		oriRequired = super.isRequired();

        if (this.maxLength != maxLength)
        }
/*
    // -----------------
    public void setDistKey(Boolean distKey)
                default:
import org.jkiss.dbeaver.model.DBPHiddenObject;
    }
	public boolean isInReferenceKey()
    public void setDefaultValue(String defaultValue) {
    public ExasolTableColumn(DBRProgressMonitor monitor, ExasolTableBase tableBase, ResultSet dbResult)
				}

import org.jkiss.dbeaver.model.struct.DBSTypedObjectEx;
        throws DBException {
		try {
    }
    	if (changed && oriRequired == null)
    }
			if (!CommonUtils.isEmpty(uniqueKeysCache))
    // -----------------
        if (!CommonUtils.equalObjects(this.scale, scale))
        this.partitionKey = JDBCUtils.safeGetInteger(dbResult, "COLUMN_PARTITION_KEY_ORDINAL_POSITION");
    @Override
    public Integer getScale() {

    // -----------------

import org.jkiss.dbeaver.model.impl.DBPositiveNumberTransformer;

        this.identity = identity;
import org.jkiss.dbeaver.model.struct.rdb.DBSTableColumn;
			{
    public String getDefaultValue() {

    @Property(viewable = true, order = 43, editable = true, updatable = true)
import org.jkiss.dbeaver.ext.exasol.editors.ExasolColumnDataTypeListProvider;
        setName(JDBCUtils.safeGetString(dbResult, "COLUMN_NAME"));
 *

	}
	public boolean isInUniqueKey() 
			return false;
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCColumnKeyType;
    @Nullable
    public void setScale(@Nullable Integer scale) {
    @Nullable
    @NotNull
    public DBSDataType getDataType() {
            this.changed = true;
    {
		return partitionKey;
    }
    @Property(viewable = true, editable = true, updatable = true, valueRenderer = DBPositiveNumberTransformer.class, order = 39)
 * Copyright (C) 2016-2016 Karl Griesser (fullref@gmail.com)
			}
    public int getTypeID()

        return dataType.getDataKind();

        setDefaultValue(JDBCUtils.safeGetString(dbResult, "COLUMN_DEFAULT"));
	}
    private Integer partitionKey;
                case ExasolConstants.TYPE_VARCHAR:

        setOrdinalPosition(JDBCUtils.safeGetInt(dbResult, "COLUMN_ORDINAL_POSITION"));
                        setMaxLength(36);
        setMaxLength(50L);
        if (this.precision != CommonUtils.toInt(precision))
 */
        return super.isRequired();
    @Override
    public String getStringLength() {
    @Override
                    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    	return oriRequired;

                    return dataType.getTypeName() + "(" + maxLength + ")";


                	return dataType.getTypeName() + "(" + maxLength + " byte)";
				{
    public BigDecimal getIdentityValue() {
    }
    }
    
    	this.isInDistKey = distKey;

import java.sql.ResultSet;
        super(tableBase, true);
    public boolean isHidden() {
import org.jkiss.dbeaver.model.DBPNamedObject2;
    }
            return false;
    
    }
    public void setDescription(String remarks) {
    // no hidden columns supported in exasol
        return remarks;
        this.changed = true;
    }
        this.identityValue = identityValue;
        if (identity)

 * Copyright (C) 2010-2024 DBeaver Corp and others
            this.changed = true;
    @Override

    private ExasolDataType dataType;

						return true;
    @Nullable
        return getTable().getDataSource();

    }

import org.jkiss.dbeaver.ext.exasol.ExasolConstants;
                    return dataType.getTypeName();
	}
public class ExasolTableColumn extends JDBCTableColumn<ExasolTableBase>

    @Property(viewable = false, editable = true, updatable = true, valueRenderer = DBPositiveNumberTransformer.class, order = 42)
import java.util.Collection;
	}
        setRequired(! JDBCUtils.safeGetBoolean(dbResult, "COLUMN_IS_NULLABLE"));
    public String getDescription() {
    public void setIdentityValue(BigDecimal identityValue) {
 *
    @Override
        super.setScale(scale);
    }

        return super.getScale();

	{
 * distributed under the License is distributed on an "AS IS" BASIS,
}
import java.math.BigDecimal;

import org.jkiss.dbeaver.model.struct.DBSDataType;

        return dataType;
    }
    }
    @Property(viewable = true, order = 44, editable = true, updatable = true)
    @NotNull
import org.jkiss.utils.CommonUtils;
		}
        
        super.setPrecision(precision);
		} catch ( DBException e)

    @Property(viewable = true, editable = true, updatable = true, order = 45)
        if (getTable().getClass() == ExasolView.class)
        setScale(JDBCUtils.safeGetInteger(dbResult, "COLUMN_NUM_SCALE"));
    public boolean isRequired() {
    @Override
        setOrdinalPosition(-1);
        if (changed) {
package org.jkiss.dbeaver.ext.exasol.model;
	public void setPartitionKeyOrdinalPosition(Integer position)
    private Boolean oriRequired;
        return this.identityValue;
        
    private Boolean isInDistKey;
    @Property(viewable = true, order = 80)
        setTypeName(dataType.getFullyQualifiedName(DBPEvaluationContext.DML));
    // -----------------
    private BigDecimal identityValue;
    
import org.jkiss.code.Nullable;
        this.remarks = remarks;
		return false;
    private Boolean identity;

    }
    	return this.dataType.getTypeID();
    {
        setMaxLength(50);
        {
        this.dataType = dataType;
        this.isInDistKey = JDBCUtils.safeGetBoolean(dbResult, "COLUMN_IS_DISTRIBUTION_KEY");

 *
                    return dataType.getTypeName() + "(" + maxLength + "," + scale + ")";
    public String getTypeName() {

	{
    private String formatType;
    @Nullable
    public DBPDataKind getDataKind() {
    @Override
    public long getMaxLength() {
    public void setRequired(boolean required) {
 * DBeaver - Universal Database Manager
    }
    }
    public void setAutoGenerated(Boolean identity)
    implements DBSTableColumn, DBSTypedObjectEx, DBPHiddenObject, DBPNamedObject2, JDBCColumnKeyType, DBSTypedObjectExt4<ExasolDataType> {
                case ExasolConstants.TYPE_HASHTYPE:

import org.jkiss.code.NotNull;
    }
    @Override
                    
    public Integer getPrecision() {
    public ExasolTableBase getOwner() {
    }

    {
        setAutoGenerated(false);
    // -----------------
    @Nullable

	
    @Property(viewable = true, editable = true, updatable = true, order = 121)
    
        this.isInDistKey=false;
    public void setPrecision(@Nullable Integer precision) {
    // Properties
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void setMaxLength(long maxLength) {
    public Boolean isDistKey() {
    public Boolean isOriRequired()
		// don't need this one
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
	
    @Property(viewable = true, editable = false, order = 19)
        return "";

        onChangeDataType(this.dataType, dataType);
    public boolean isAutoGenerated()
        setMaxLength(JDBCUtils.safeGetInt(dbResult, "COLUMN_MAXSIZE"));
	public Integer getPartitionKeyOrdinalPosition()
    }
        
    @Override
    	this.identity = identity;
 * Unless required by applicable law or agreed to in writing, software

    }
    }
        
        return this.dataType.getName();
        super(tableBase, false);
    public ExasolDataSource getDataSource() {


        }
            switch (this.dataType.getTypeName()) {
    {
        return super.getPrecision();
 * you may not use this file except in compliance with the License.
        this.identity=false;
        this.dataType = tableBase.getDataSource().getDataTypeCache().getCachedObject(ExasolConstants.TYPE_VARCHAR);
    @Property(viewable = true, editable = true, updatable = true, order = 46)

        return isInDistKey;
	@Override
 * limitations under the License.
    @Override
        super.setDefaultValue(defaultValue);
    }
    // Business Contract
