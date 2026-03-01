 * You may obtain a copy of the License at
public class AltibaseSynonym extends GenericSynonym implements DBPScriptObject {
    }
        isPublicSynonym = (ownerId < 0);
 *
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.DBException;
        
        
        
        }
                        + " for " + refObjectSchema + "." + refObjectName + ": "
        // Try to get from DBMS_METADATA
    @Override
    }
import org.jkiss.dbeaver.Log;
    protected DBSObject refObj = null;
    }
            name = getFullyQualifiedName(DBPEvaluationContext.DDL);
    
            try {
 * Licensed under the Apache License, Version 2.0 (the "License");
        } else {
     *    -> Resolve: Set Show system object as true
    protected String refObjectName;
 *
import org.jkiss.dbeaver.model.DBUtils;
            ddl = null;
            }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        if (isPublicSynonym) {
        if (CommonUtils.isEmpty(ddl)) {

        }

                refObjFullName = DBUtils.getFullQualifiedName(getDataSource(), refObject);
        DBSObject refObject = getTargetObject(monitor);
        if (CommonUtils.isEmpty(ddl)) {
        }
    public DBSObject getTargetObject(DBRProgressMonitor monitor) {
                refObjFullName = DBUtils.getFullQualifiedName(getDataSource(), refObject.getParentObject(), refObject);
    public void setPublicSynonym() {
        StringBuilder ddl = new StringBuilder();

}
    public DBSObject getObject(DBRProgressMonitor monitor) throws DBException {
        String refObjFullName = "";
                        + getFullyQualifiedName(DBPEvaluationContext.DDL)
import org.jkiss.dbeaver.ext.altibase.AltibaseConstants;
    public boolean isPublicSynonym() {
    }
    /**
        return new StringBuilder("CREATE ").append(getSynonymBody()).append(" FOR ").append(refObjFullName).toString();
    
        
    public String getBuiltDdlLocaly(DBRProgressMonitor monitor) {
            refObj = getTargetObject(monitor);
 *
            String name, String description, String refObjectSchema, String refObjectName) {
    }
        this.refObjectName = refObjectName;
package org.jkiss.dbeaver.ext.altibase.model;

        super(container, name, description);
    public String getSynonymBody() {
            }
    /**
 * Copyright (C) 2010-2025 DBeaver Corp and others
    
    
        
    @NotNull

 *     http://www.apache.org/licenses/LICENSE-2.0
            } catch (DBException e) {
            // Public synonym doesn't need schema name
            ddl = ((AltibaseMetaModel) getDataSource().getMetaModel()).getSynonymDDL(monitor, this, options);
import java.util.Map;
     */
        return refObj;
            } else {
        }
    }
    private static final Log log = Log.getLog(AltibaseSynonym.class);
     * 1. Show system object set as false and PUBLIC SYNONYM pointing to a SystemObject. e.g. SYSTEM_'s objects
/*
        this.refObjectSchema = refObjectSchema;

import org.jkiss.code.NotNull;
 * distributed under the License is distributed on an "AS IS" BASIS,
        return ddl.toString();
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
 */
        isPublicSynonym = true;

        if (CommonUtils.getOption(options, DBPScriptObject.OPTION_REFRESH)) {
    }
import org.jkiss.dbeaver.model.meta.Property;
        if (refObj == null) {
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
        
        return refObj;
import org.jkiss.dbeaver.model.struct.DBSObject;
        String name;
        ddl.append("SYNONYM ").append(name);
     * 2. Altibase SYSTEM_.SYS_SYNONYMS_ meta table says 
        if (refObject != null) {
        }
    // BODY = "[PUBLIC] SYNONYM synonym_name"
     * There are three cases unable to access reference object.
    
        return isPublicSynonym;
        }
    protected AltibaseSynonym(GenericStructContainer container, int ownerId, 
            ddl.append("PUBLIC ");
    
    protected String refObjectSchema;
    protected boolean isPublicSynonym;
                log.warn("Failed to get a synonym's target object: " 
    
        
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Property(viewable = true, linkPossible = true, order = 4)
        if (refObj == null) {
                        + e.getMessage());
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.ext.generic.model.GenericSynonym;
    
        
            ddl = AltibaseConstants.NO_DBMS_METADATA + getBuiltDdlLocaly(monitor);
     * Create Synonym DDL in case of unable to use DBMS_METADATA.
import org.jkiss.dbeaver.model.DBPScriptObject;
            if ((refObject instanceof AltibaseSynonym) && ((AltibaseSynonym) refObject).isPublicSynonym()) {
    @Override
        return (CommonUtils.isEmpty(ddl)) ? "" : ddl + ";";
import org.jkiss.dbeaver.model.DBPEvaluationContext;

 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
            // Otherwise, schema name required. 
    }

 * DBeaver - Universal Database Manager
                refObj = ((AltibaseDataSource) getDataSource()).findSynonymTargetObject(monitor, refObjectSchema, refObjectName);
            name = getName();
     */
    protected String ddl;
        }
