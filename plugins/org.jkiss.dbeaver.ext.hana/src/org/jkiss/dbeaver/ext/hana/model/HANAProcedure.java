    
            stmt = "SELECT PARAMETER_NAME, DATA_TYPE_NAME, DATA_TYPE_ID, LENGTH, SCALE, POSITION,"+
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                        int scale = JDBCUtils.safeGetInt(dbResult, "SCALE");
                dbStat.setString(2, getName());
import java.sql.SQLException;
    private static final String PARAMETER_TYPE_IN = "IN";
                        " WHERE SCHEMA_NAME=? AND FUNCTION_NAME=?"+
                stmt += " FROM SYS.FUNCTION_PARAMETERS"+
                    }
                        int position = JDBCUtils.safeGetInt(dbResult, "POSITION");
                        switch(parameterTypeStr) {
        }
            if (DBSProcedureType.PROCEDURE == getProcedureType()) {
	                    	case PARAMETER_TYPE_RETURN: parameterType = DBSProcedureParameterKind.RETURN; break; 
                            }
                        boolean hasInplaceTableType = JDBCUtils.safeGetBoolean(dbResult, "IS_INPLACE_TYPE", HANAConstants.SYS_BOOLEAN_TRUE);
 * distributed under the License is distributed on an "AS IS" BASIS,
            } else {
                        int columnSize = JDBCUtils.safeGetInt(dbResult, "LENGTH");
/*
        try (JDBCSession session = DBUtils.openMetaSession(monitor, getDataSource(), "Read procedure parameter")) {
            String description, DBSProcedureType procedureType, GenericFunctionResultType functionResultType) {
            }
                stmt += " FROM SYS.FUNCTION_PARAMETER_COLUMNS"+
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
                        String typeName = JDBCUtils.safeGetString(dbResult, "DATA_TYPE_NAME");
                        " WHERE SCHEMA_NAME=? AND PROCEDURE_NAME=?"+
                        int typeId = JDBCUtils.safeGetInt(dbResult, "DATA_TYPE_ID");
                            } else {
	                    	case PARAMETER_TYPE_IN:     parameterType = DBSProcedureParameterKind.IN; break; 
                        " ORDER BY PARAMETER_NAME, POSITION";
 * You may obtain a copy of the License at

 * limitations under the License.
                        addColumn(new HANAProcedureParameter(

                        List<HANAInplaceTableTypeColumn> inplaceTableType = null;
                        " ORDER BY POSITION";
                        " WHERE SCHEMA_NAME=? AND PROCEDURE_NAME=?"+
                    while (dbResult.next()) {
import org.jkiss.dbeaver.model.meta.Association;
 * See the License for the specific language governing permissions and
                dbStat.setString(1, getParentObject().getName());

            if (DBSProcedureType.PROCEDURE == getProcedureType()) {
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameterKind;
    }
        super(container, procedureName, specificName, description, procedureType, functionResultType);
                        boolean hasDefaultValue = JDBCUtils.safeGetBoolean(dbResult, "HAS_DEFAULT_VALUE", HANAConstants.SYS_BOOLEAN_TRUE);
                        
                        DBSProcedureParameterKind parameterType;
            try (JDBCPreparedStatement dbStat = session.prepareStatement(stmt)) {
                stmt += " FROM SYS.PROCEDURE_PARAMETERS"+
            throw new DBDatabaseException(e, getDataSource());
                        }
import java.util.LinkedList;
    public HANAProcedure(GenericStructContainer container, String procedureName, String specificName,

    private static final String PARAMETER_TYPE_RETURN = "RETURN";
public class HANAProcedure extends GenericProcedure {
    }
            String stmt = "SELECT PARAMETER_NAME, COLUMN_NAME, DATA_TYPE_NAME, LENGTH, SCALE";
                        DBSObject tableType = null;
                        " ORDER BY POSITION";
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
                    while (dbResult.next()) {
                        

                            if (hasInplaceTableType) {
    public GenericFunctionResultType getFunctionResultType() { return super.getFunctionResultType(); }
                        List<HANAInplaceTableTypeColumn> inplaceTableType = inplaceTableTypes.get(parameterName);
            } else {
import java.util.Map;
                                this, columnName, typeName, typeId, position, columnSize, scale, parameterType,
            try (JDBCPreparedStatement dbStat = session.prepareStatement(stmt)) {
    private static final String PARAMETER_TYPE_INOUT = "INOUT";
	                    	default:                    parameterType = DBSProcedureParameterKind.UNKNOWN; break; 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    
    }
                }
                   " TABLE_TYPE_SCHEMA, TABLE_TYPE_NAME, IS_INPLACE_TYPE,"+
                    }
 *
                                String tableTypeName = dbResult.getString("TABLE_TYPE_NAME");
import org.jkiss.dbeaver.model.struct.DBSObject;

                        String columnName = JDBCUtils.safeGetString(dbResult, 2);
import org.jkiss.dbeaver.model.DBUtils;
                                if (inplaceTableTypes == null) {
        return HANADependency.readDependencies(monitor, this);
                stmt += " FROM SYS.PROCEDURE_PARAMETER_COLUMNS"+
                            inplaceTableTypes.put(parameterName, inplaceTableType);
                dbStat.setString(2, getName());
import java.util.HashMap;

    @Association
    public GenericCatalog getCatalog() { return super.getCatalog(); }
                                if (schema != null) {
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                        int length = JDBCUtils.safeGetInt(dbResult, 4);
                                }
                        " WHERE SCHEMA_NAME=? AND FUNCTION_NAME=?"+
                                }

                                String tableTypeSchema = dbResult.getString("TABLE_TYPE_SCHEMA");
        inplaceTableTypes = new HashMap<>();
 *
                                    loadInplaceTableTypes(monitor);
                        String parameterName = JDBCUtils.safeGetString(dbResult, 1);
    }
    public GenericPackage getPackage() { return super.getPackage(); }
                        String parameterTypeStr = JDBCUtils.safeGetString(dbResult, "PARAMETER_TYPE");
 * Licensed under the Apache License, Version 2.0 (the "License");
	                    	case PARAMETER_TYPE_OUT:    parameterType = DBSProcedureParameterKind.OUT; break; 
                                GenericSchema schema = getDataSource().getSchema(tableTypeSchema);
    @Property(hidden = true, labelProvider = GenericCatalog.CatalogNameTermProvider.class)
    Map<String, List<HANAInplaceTableTypeColumn> > inplaceTableTypes;
            }
            }
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, getDataSource(), "Read procedure parameter columns")) {
            throw new DBDatabaseException(e, getDataSource());
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                        if(DATA_TYPE_NAME_TABLE_TYPE.equals(typeName)) {
                        if (inplaceTableType == null) {
 * you may not use this file except in compliance with the License.
            }
import org.jkiss.dbeaver.ext.generic.model.*;
                        }
                                tableType, inplaceTableType, hasDefaultValue));
    @Property(hidden = true)
                dbStat.setString(1, getParentObject().getName());
            String stmt;
import org.jkiss.dbeaver.model.meta.Property;
        } catch (SQLException e) {
	                    	case PARAMETER_TYPE_INOUT:  parameterType = DBSProcedureParameterKind.INOUT; break; 
    private static final String PARAMETER_TYPE_OUT = "OUT";
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    
    static final String DATA_TYPE_NAME_TABLE_TYPE = "TABLE_TYPE";
                                    tableType = schema.getTable(monitor, tableTypeName);

    @Property(hidden = true)
    @Override
 * Unless required by applicable law or agreed to in writing, software
 *
                }
import java.util.List;
                        }
                        String typeName = JDBCUtils.safeGetString(dbResult, 3);
                        String columnName = JDBCUtils.safeGetString(dbResult, "PARAMETER_NAME");
 * DBeaver - Universal Database Manager
                        inplaceTableType.add(new HANAInplaceTableTypeColumn(this, columnName, typeName, inplaceTableType.size() + 1, length, scale));
                        int scale = JDBCUtils.safeGetInt(dbResult, 5);
                                inplaceTableType = inplaceTableTypes.get(columnName);
        }
    // hide, as not properly filled by driver. type is anyway obvious from RETURN parameter
                            inplaceTableType = new LinkedList<HANAInplaceTableTypeColumn>();
    public void loadProcedureColumns(DBRProgressMonitor monitor) throws DBException {
    static final String DATA_TYPE_NAME_ANY_TABLE_TYPE = "ANY_TABLE_TYPE";
        } catch (SQLException e) {
import org.jkiss.dbeaver.DBException;
package org.jkiss.dbeaver.ext.hana.model;
 */
                        " ORDER BY PARAMETER_NAME, POSITION";
import org.jkiss.dbeaver.DBDatabaseException;
}
                   " PARAMETER_TYPE, HAS_DEFAULT_VALUE";
 *     http://www.apache.org/licenses/LICENSE-2.0
    public List<HANADependency> getDependencies(DBRProgressMonitor monitor) throws DBException {
    private void loadInplaceTableTypes(DBRProgressMonitor monitor) throws DBException {

