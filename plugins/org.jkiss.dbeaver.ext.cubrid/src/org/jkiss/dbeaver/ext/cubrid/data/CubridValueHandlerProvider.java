 *
            } catch (Throwable e) {

            Object originalValue = resultSet.getAttributeValue(index);
 * limitations under the License.
import org.jkiss.dbeaver.model.exec.DBCResultSet;
import org.jkiss.dbeaver.model.exec.DBCSession;
            }

}
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return oidValue;
 *     http://www.apache.org/licenses/LICENSE-2.0
                e.printStackTrace();
            if (isEnableOID && CubridConstants.CLASS.equals(typeName) && columnName.equals(tableName)) {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.data.DBDValueHandler;

        @Override
public class CubridValueHandlerProvider implements DBDValueHandlerProvider {
import org.jkiss.dbeaver.model.impl.jdbc.exec.JDBCColumnMetaData;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
            String columnName = columnMeta.getName();
 * You may obtain a copy of the License at
        if (typedObject instanceof JDBCColumnMetaData columnMeta) {
        boolean isEnableOID = DBWorkbench.getPlatform().getPreferenceStore().getBoolean(CubridConstants.OID_NAVIGATOR);
import org.jkiss.dbeaver.runtime.DBWorkbench;
            String oidValue = null;
import org.jkiss.utils.BeanUtils;
/*
import org.jkiss.dbeaver.model.exec.DBCException;
    }
                return new CubridOIDValueHandler();
import org.jkiss.dbeaver.model.DBPDataSource;
        public Object fetchValueObject(DBCSession session, DBCResultSet resultSet, DBSTypedObject type, int index) throws DBCException {
import org.jkiss.dbeaver.model.impl.data.DefaultValueHandler;

 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
            }
    }
        }
            String typeName = typedObject.getTypeName();
        }
            try {
import org.jkiss.dbeaver.model.data.DBDFormatSettings;
 *
    class CubridOIDValueHandler extends DefaultValueHandler {
    public DBDValueHandler getValueHandler(DBPDataSource dataSource, DBDFormatSettings preferences, DBSTypedObject typedObject) {
    @Override
import org.jkiss.dbeaver.model.data.DBDValueHandlerProvider;
 * See the License for the specific language governing permissions and
 */
package org.jkiss.dbeaver.ext.cubrid.data;
            String tableName = columnMeta.getEntityName();
                oidValue = (String) BeanUtils.invokeObjectMethod(originalValue, "getOidString");
        return null;
import org.jkiss.dbeaver.ext.cubrid.CubridConstants;
