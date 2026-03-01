}
    }

import org.jkiss.dbeaver.ext.generic.model.GenericSchema;
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
    public DBSObject getTargetObject(DBRProgressMonitor monitor) throws DBException {
 * You may obtain a copy of the License at
        case "PROCEDURE":
        return targetObjectType;
    
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Property(viewable = true, order = 21)
        this.targetObjectType = targetObjectType;
        GenericSchema schema = getDataSource().getSchema(targetObjectSchema);

        super(container, name, null);
/*
import org.jkiss.dbeaver.model.DBPQualifiedObject;
    }
        this.targetObjectName = targetObjectName;
   
	@Override
import org.jkiss.dbeaver.model.meta.Property;

            return schema.getChild(monitor, targetObjectName);
 *
public class HANASynonym extends GenericSynonym implements DBPQualifiedObject {
    private String targetObjectType, targetObjectSchema, targetObjectName;
    public String getTargetObjectType(DBRProgressMonitor monitor) throws DBException {

 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
        this.targetObjectSchema = targetObjectSchema;
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
import org.jkiss.dbeaver.model.struct.DBSObject;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            return schema.getProcedure(monitor, targetObjectName); 

        }
 * Unless required by applicable law or agreed to in writing, software
        default:
    public DBSObject getTargetObjectSchema(DBRProgressMonitor monitor) throws DBException {
 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.DBException;
 *
    }
    }
    @Property(viewable = true, order = 22)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ext.generic.model.GenericSynonym;
 * limitations under the License.
        switch(targetObjectType) {
 *
        return getDataSource().getSchema(targetObjectSchema);
    @Property(viewable = true, order = 20)
    public HANASynonym(GenericStructContainer container, String name, String targetObjectType, String targetObjectSchema, String targetObjectName) {
package org.jkiss.dbeaver.ext.hana.model;
