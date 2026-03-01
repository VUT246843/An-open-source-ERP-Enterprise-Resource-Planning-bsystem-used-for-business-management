        this.objectId = JDBCUtils.safeGetLong(dbResult, "SCHEMA_OBJECT_ID");
	public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options)
    

 *
    }
        this(

        this.scriptCache = new ExasolJDBCObjectSimpleCacheLiterals<>(
	@Association
        return scriptCache.getAllObjects(monitor, this).stream()
    public ExasolSchema(ExasolDataSource exasolDataSource, ResultSet dbResult) throws DBException {


    private ExasolViewCache viewCache = new ExasolViewCache();
	
    }

    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
 * Licensed under the Apache License, Version 2.0 (the "License");
    public Timestamp getCreateTime(DBRProgressMonitor monitor) throws DBCException {
import java.sql.Timestamp;
import org.jkiss.dbeaver.ext.exasol.tools.ExasolUtils;
    }

 *     http://www.apache.org/licenses/LICENSE-2.0
        return this.name;
            monitor.subTask("Cache Indexes");
            );
    }
    private long objectId;
    public Collection<ExasolTableBase> getChildren(@NotNull DBRProgressMonitor monitor) throws DBException {
        this.remarks = JDBCUtils.safeGetString(dbResult, "OBJECT_COMMENT");
	
        return this;
		}
	}
    public ExasolTableCache getTableCache() {

        return scriptCache.getObject(monitor, this, uniqueName);
    

        // TODO Auto-generated method stub
        		+ "from SYS." + tablePrefix + "_SCRIPTS a inner join SYS." + tablePrefix + "_OBJECTS b "
import org.jkiss.dbeaver.ext.exasol.model.cache.*;
import java.sql.SQLException;
    @Override
        functionCache.clearCache();
    public ExasolFunction getFunction(DBRProgressMonitor monitor,String name) throws DBException {
	    		throw new DBCException(e, session.getExecutionContext());
    }
        return scriptCache.getObject(monitor, this, name);
    private BigDecimal memObjectSize;
                JDBCUtils.safeGetString(dbResult, "OWNER")
    private Boolean refreshed = false; 
	    	{
        return createTime;
	    	JDBCSession session = DBUtils.openMetaSession(monitor, this, ExasolMessages.read_schema_details );
import org.jkiss.dbeaver.ext.exasol.ExasolSysTablePrefix;
    }
        return owner;
                "/*snapshot execution*/ SELECT\n" + 
            tableCache.loadChildren(monitor, this, null);
        return viewCache;
 */
    	return ExasolTable.class;

    private static final List<String> SYSTEM_SCHEMA = Arrays.asList("SYS","EXA_STATISTICS");
 * limitations under the License.
	}
            allGrantee.addAll(dataSource.getRoleCache().getCachedObjects());
        

	
    @Override
    public Collection<ExasolTable> getTables(DBRProgressMonitor monitor) throws DBException {
        
    public void setRawObjectSizeLimit(BigDecimal limit) {
    public Collection<ExasolScript> getProcedures(DBRProgressMonitor monitor) throws DBException {
 *
    }
        return tableCache.getTypedObjects(monitor, this, ExasolTable.class);
			throws DBException
	public long getMemObjectSize() {
}
    }
        return scriptCache.getObject(monitor, this, name);
import org.jkiss.dbeaver.ext.exasol.model.security.ExasolGrantee;
    }
	public Collection<ExasolTableIndex> getIndexes(DBRProgressMonitor monitor) throws DBException {
    
    }
	}
            monitor.subTask("Cache tables");
    @NotNull

/*


    }
                exasolDataSource, 
    	return scriptCache.getAllObjects(monitor, this).stream()

            viewCache.loadChildren(monitor, this, null);
    @Override
    }
        		ExasolScript.class,
    	if (memObjectSize == null)
        return associationCache;
    // -----------------
	}
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
    public boolean isSystem() {
            return allGrantee.toArray(new Object[0]);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    }
                "    FUNCTION_NAME\n", 
    }
        		+ "on a.SCRIPT_OBJECT_ID  = b.object_id and b.object_type = 'SCRIPT' where a.script_schema = '%s' "
    public ExasolScript getAdapter(DBRProgressMonitor monitor, String name) throws DBException {
                        this.memObjectSize = JDBCUtils.safeGetBigDecimal(dbResult, "MEM_OBJECT_SIZE");
    private String name;

    private final ExasolTableUniqueKeyCache constraintCache = new ExasolTableUniqueKeyCache(tableCache);
    public ExasolSchema(ExasolDataSource exasolDataSource, String name, String owner) {
        this.tablePrefix = exasolDataSource.getTablePrefix(ExasolSysTablePrefix.ALL);
		
    private Timestamp createTime;
    {
    public Class<ExasolTable> getPrimaryChildType(@Nullable DBRProgressMonitor monitor) throws DBException {
        allChildren.addAll(viewCache.getAllObjects(monitor, this));
    // ExasolTable's children
    private synchronized void refresh(DBRProgressMonitor monitor) throws DBCException
        return child;
		@Override
    }
    		return -1;
    public ExasolScript getProcedure(DBRProgressMonitor monitor, String uniqueName) throws DBException {
        List<ExasolTableBase> allChildren = new ArrayList<>();
    @Property(viewable = true, editable = true, updatable = true,  order = 7)
		return indexCache;
		return ExasolUtils.generateDDLforSchema(monitor, this);

            monitor.subTask("Cache table foreign keys");
	public void setOwner(String owner)
            associationCache.getObjects(monitor, this, null);
    private BigDecimal rawObjectSizeLimit;
        return viewCache.getTypedObjects(monitor, this, ExasolView.class);
                        this.rawObjectSizeLimit = JDBCUtils.safeGetBigDecimal(dbResult, "RAW_OBJECT_SIZE_LIMIT");
		public boolean allowCustomValue() {
        this.name = name;
	{
    public synchronized void cacheStructure(@NotNull DBRProgressMonitor monitor, int scope) throws DBException {
import org.jkiss.dbeaver.model.struct.DBSObject;


	
    public ExasolScript getUdf(DBRProgressMonitor monitor, String name) throws DBException {
			ExasolDataSource dataSource = object.getDataSource();
    public long getRawObjectSize() {
        allChildren.addAll(tableCache.getAllObjects(monitor, this));
    public ExasolView getView(DBRProgressMonitor monitor, String name) throws DBException {
	}

    }
        this.owner = owner;
    {
        if (((scope & STRUCT_ENTITIES) != 0)) {
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
import org.jkiss.dbeaver.model.meta.PropertyLength;
                JDBCUtils.safeGetStringTrimmed(dbResult, "OBJECT_NAME"), 
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
    private static final Log log = Log.getLog(ExasolSchema.class);    
    	if (!refreshed && this.objectId != 0) {
    @Property(viewable = true, editable = false, updatable =  false,  order = 6, formatter = ByteNumberFormat.class)
    

            monitor.subTask("Cache table columns");
        public Object[] getPossibleValues(ExasolSchema object)
    	remarks = newRemarks;
    			.collect(Collectors.toCollection(ArrayList::new));
    @Property(viewable = true, editable = true, updatable = true, length = PropertyLength.MULTILINE, order = 3)
        return allChildren;
            child = viewCache.getObject(monitor, this, childName);
	    		try (JDBCResultSet dbResult = stmt.executeQuery()) 
	    return true;
        constraintCache.clearCache();
		
        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        this.name = name;
    public String getOwner() {
        if ((scope & STRUCT_ASSOCIATIONS) != 0) {

    }
    			.collect(Collectors.toCollection(ArrayList::new));
    }
        ((ExasolDataSource) getDataSource()).refreshObject(monitor);
        		+ "script_name,script_owner,script_language,script_type,script_result_type,script_text,script_comment,b.created "
                        this.rawObjectSize = JDBCUtils.safeGetBigDecimal(dbResult, "RAW_OBJECT_SIZE");
	public ExasolTableIndexCache getIndexCache() {


                "    F.*,\n" + 
import org.jkiss.dbeaver.model.*;
import org.jkiss.code.NotNull;
package org.jkiss.dbeaver.ext.exasol.model;
    @Property(viewable = true, editable = false, updatable = true,  order = 4)
    }
    }
	    			if (dbResult.next()) {

    			.filter(o -> o.getType().equals("UDF"))
            tableCache.getAllObjects(monitor, this);
	}
                "ORDER BY\n" + 
		return indexCache.getObjects(monitor, this, null);
    public ExasolTableForeignKeyCache getAssociationCache() {
    		return -1;
            indexCache.getObjects(monitor, this, null);
        return SYSTEM_SCHEMA.contains(name);
    public final DBSObjectCache<ExasolSchema, ExasolScript> scriptCache;
    @Association
    }
		}
        		+ "order by script_name",
public class ExasolSchema extends ExasolGlobalObject implements DBSSchema, DBPNamedObject2,  DBPRefreshableObject, DBPSystemObject, DBSProcedureContainer, DBPScriptObject {

        refreshed=false;
        }
		return rawObjectSizeLimit;

    @Association
		

        this.functionCache = new ExasolJDBCObjectSimpleCacheLiterals<>(ExasolFunction.class,

    @Override

                    }
                "    O.CREATED\n" + 
    }
    
                "    F.FUNCTION_SCHEMA = '%s' and O.OBJECT_TYPE = 'FUNCTION' AND o.ROOT_NAME = '%s'\n" + 
    @Override
	
    }
	public Boolean isPhysicalSchema()
    private final ExasolTableIndexCache indexCache = new ExasolTableIndexCache(tableCache);
        return tableCache.getObject(monitor, this, name, ExasolTable.class);

        }
    public Collection<ExasolFunction> getFunctions(DBRProgressMonitor monitor) throws DBException {

    public ExasolTableBase getChild(@NotNull DBRProgressMonitor monitor, @NotNull String childName) throws DBException {
    }
	}
        
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public String getDescription() {
    
    }
	    		stmt.setLong(1, this.objectId);
                name,name);
        if (child == null) {
    
    public ExasolTableUniqueKeyCache getConstraintCache() {
                "    F.FUNCTION_OBJECT_ID = O.OBJECT_ID\n" + 
 *
            List<ExasolGrantee> allGrantee = new ArrayList<>();
    
    private final ExasolTableForeignKeyCache associationCache = new ExasolTableForeignKeyCache(tableCache);
	    		refreshed = true;
    
    	if (rawObjectSize == null)

			}


import org.jkiss.utils.ByteNumberFormat;
			return false;
    private String remarks;
        return functionCache.getAllObjects(monitor, this);
        this.owner = owner;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

                "INNER JOIN SYS." + tablePrefix + "_OBJECTS O ON\n" + 
    // Associations
        return constraintCache;
	public static class OwnerListProvider implements IPropertyValueListProvider<ExasolSchema> {
	public BigDecimal getRawObjectSizeLimit() {

    @Property(viewable = true, editable = false, order = 2)
            monitor.subTask("Cache Views");




    // ExasolSchema's children
    @Override
    
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;


    @Property(viewable = true, editable = false, updatable =  false,  order = 5, formatter = ByteNumberFormat.class)
 * you may not use this file except in compliance with the License.

        
    	}
        return remarks;
        return "Schema " + name;
import org.jkiss.dbeaver.DBException;
    @Property(viewable = true, editable = false, order = 1)

    			.collect(Collectors.toCollection(ArrayList::new));
    private BigDecimal rawObjectSize;
import java.sql.ResultSet;
import org.jkiss.dbeaver.ext.exasol.tools.ExasolJDBCObjectSimpleCacheLiterals;
            constraintCache.getObjects(monitor, this, null);
        viewCache.clearCache();
    
import org.jkiss.dbeaver.model.meta.Property;
        return tableCache;
    public void setName(@NotNull String name) {
	
        return viewCache.getObject(monitor, this, name, ExasolView.class);
        ExasolTableBase child = tableCache.getObject(monitor, this, childName);
    public final DBSObjectCache<ExasolSchema, ExasolFunction> functionCache;
import java.util.stream.Collectors;
                "FROM\n" + 
	}
    @NotNull
                "WHERE\n" + 
    
    @Override
        return scriptCache.getAllObjects(monitor, this).stream()
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureContainer;
    public String getName() {
    	refresh(monitor);
    			.filter(o -> o.getType().equals("ADAPTER"))
    public Collection<ExasolScript> getUdfs(DBRProgressMonitor monitor) throws DBException {
	    		}
    {
        		name);


            monitor.subTask("Cache Views");
 * See the License for the specific language governing permissions and

    public Collection<ExasolScript> getAdapter(DBRProgressMonitor monitor) throws DBException {
	    		{
import java.math.BigDecimal;
            viewCache.getAllObjects(monitor, this);
	@NotNull
    @Override
    }
    @Override
import org.jkiss.code.Nullable;
	    	} catch (SQLException e) {
        tableCache.clearCache();
        super(exasolDataSource, true);
		@Nullable
    	


                        this.createTime = JDBCUtils.safeGetTimestamp(dbResult, "CREATED");

    
        indexCache.clearCache();
import org.jkiss.dbeaver.model.meta.Association;
    @Override
            allGrantee.addAll(dataSource.getUserCache().getCachedObjects());
    @Override
    // -----------------

    public ExasolViewCache getViewCache() {

	{
        this.name = JDBCUtils.safeGetString(dbResult, "OBJECT_NAME");
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        		"/*snapshot execution*/ select "
    	
import org.jkiss.dbeaver.Log;
    }
    private String owner;
    }
    }
		{

    }
        }
    	this.rawObjectSizeLimit = limit;

import org.jkiss.dbeaver.model.exec.DBCException;
    public Collection<ExasolView> getViews(DBRProgressMonitor monitor) throws DBException {
    			.filter(o -> o.getType().equals("SCRIPTING"))

    }
	}
    
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
    
    private ExasolTableCache tableCache = new ExasolTableCache();

	
import java.util.*;
	    	try (JDBCPreparedStatement stmt = session.prepareStatement("/*snapshot execution*/ SELECT * FROM SYS."+getDataSource().getTablePrefix(ExasolSysTablePrefix.ALL)+"_OBJECT_SIZES WHERE OBJECT_ID = ?"))
 * You may obtain a copy of the License at
		
    private String tablePrefix;
import org.jkiss.dbeaver.ext.exasol.ExasolMessages;
		return memObjectSize.longValue();
    @Override

        associationCache.clearCache();
	


    public void setDescription(String newRemarks)
    public ExasolTable getTable(DBRProgressMonitor monitor, String name) throws DBException {

        this.createTime = JDBCUtils.safeGetTimestamp(dbResult, "CREATED");
    public String toString() {
        scriptCache.clearCache();
		return rawObjectSize.longValue();
    }

        if (((scope & STRUCT_ATTRIBUTES) != 0)) {
            monitor.subTask("Cache table unique keys");
        return functionCache.getObject(monitor, this, name);
                "    SYS." +  tablePrefix + "_FUNCTIONS F\n" + 
