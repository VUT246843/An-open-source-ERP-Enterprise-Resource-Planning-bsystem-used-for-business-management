    public Class<?>[] getAdapterList() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (DBSObject.class.isAssignableFrom(adapterType)) {
            if (adaptableObject instanceof DBNDatabaseNode) {
                dbObject = ((DBNDatabaseNode) adaptableObject).getObject();
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.core.runtime.IAdapterFactory;
 * Unless required by applicable law or agreed to in writing, software
        return new Class<?>[] { OracleSourceObject.class, OracleProcedurePackaged.class, DBPScriptObjectExt.class, OracleSchedulerJob.class };
public class OracleObjectAdapter implements IAdapterFactory {
/**
        }

            }
                return adapterType.cast(dbObject);
        return null;
 *
    public OracleObjectAdapter() {

    @Override
 */
 * See the License for the specific language governing permissions and
            if (dbObject != null && adapterType.isAssignableFrom(dbObject.getClass())) {
    public <T> T getAdapter(Object adaptableObject, Class<T> adapterType) {
 * limitations under the License.

    }
    }
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
            }
import org.jkiss.dbeaver.model.struct.DBSObject;
}

 */
    @Override
 *
package org.jkiss.dbeaver.ext.oracle.model;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.DBPScriptObjectExt;
import org.jkiss.dbeaver.ext.oracle.model.source.OracleSourceObject;
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
 * DBeaver - Universal Database Manager
    }
 * You may obtain a copy of the License at
            DBSObject dbObject = null;
 * Oracle object adapter
