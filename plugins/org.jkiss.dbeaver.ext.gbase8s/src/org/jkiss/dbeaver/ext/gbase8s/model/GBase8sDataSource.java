 * You may obtain a copy of the License at
public class GBase8sDataSource extends GenericDataSource {
}
import org.jkiss.dbeaver.ext.gbase8s.GBase8sUtils;
    void replaceConnector4GetActiveDB(DBPDataSourceContainer container) {

            field = this.getClass().getSuperclass().getDeclaredField("queryGetActiveDB");
            field.setAccessible(true);
    public GBase8sDataSource(DBRProgressMonitor monitor, DBPDataSourceContainer container, GenericMetaModel metaModel)
        // replace the connector of the database/table in queryGetActiveDB
 */
import org.jkiss.dbeaver.ext.generic.GenericConstants;
import org.jkiss.dbeaver.ext.generic.model.GenericExecutionContext;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCRemoteInstance;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
    protected JDBCExecutionContext createExecutionContext(JDBCRemoteInstance instance, String type) {
        super(monitor, container, metaModel, new GenericSQLDialect());
        return new GenericExecutionContext(instance, type);
        Field field;
 *
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

        } else {
                .toString(driver.getDriverParameter(GenericConstants.PARAM_QUERY_GET_ACTIVE_DB));
        replaceConnector4GetActiveDB(container);
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
 *
            getActiveDBQuery = getActiveDBQuery.replaceFirst("\\?", ":");
        final DBPDriver driver = container.getDriver();
import org.jkiss.dbeaver.ext.generic.model.GenericSQLDialect;
 *
/*
    }


import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
        }
            field.set(this, getActiveDBQuery);
/**
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (GBase8sUtils.isOracleSqlMode(container)) {
 * limitations under the License.
            log.error("Failed to replace the connector of the database/table in queryGetActiveDB", e);
import org.jkiss.dbeaver.Log;
 * Copyright (C) 2010-2024 DBeaver Corp and others

package org.jkiss.dbeaver.ext.gbase8s.model;
    }

 * you may not use this file except in compliance with the License.
 */


        String getActiveDBQuery = CommonUtils
import org.jkiss.dbeaver.DBException;
        try {
import org.jkiss.dbeaver.model.connection.DBPDriver;
 * @author Chao Tian
        } catch (Exception e) {
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
    private static final Log log = Log.getLog(GBase8sDataType.class);
            throws DBException {
            getActiveDBQuery = getActiveDBQuery.replaceFirst("\\?", ".");
import org.jkiss.utils.CommonUtils;
 * See the License for the specific language governing permissions and
        }
import java.lang.reflect.Field;
 * Licensed under the Apache License, Version 2.0 (the "License");
