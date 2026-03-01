            }
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
                throw new DBException("Cannot load H2GIS functions", e);
 *
 * limitations under the License.
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
        super(monitor, container);
        super.initialize(monitor);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * You may obtain a copy of the License at
    public void initialize(@NotNull DBRProgressMonitor monitor) throws DBException {
 * @author Serge Rider (serge@dbeaver.com)
 * For more information, please consult: <http://www.h2gis.org/>
            } catch (SQLException e) {
public class H2GISDataSource extends H2DataSource {
import java.sql.SQLException;
 * @author Erwan Bocher, CNRS
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public H2GISDataSource(@NotNull DBRProgressMonitor monitor, @NotNull DBPDataSourceContainer container) throws DBException {
 * limitations under the License.
    }
package org.jkiss.dbeaver.ext.h2gis.model;
        }
 *
 * H2GIS eclipse plugin to register a H2GIS spatial database to


import org.jkiss.dbeaver.ext.h2.model.H2DataSource;

 *
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver, the  Universal Database Manager
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
 *
 */
import org.jkiss.dbeaver.DBException;

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
import org.jkiss.code.NotNull;

    @Override
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 * You may obtain a copy of the License at
 * or contact directly: info_at_h2gis.org
 * you may not use this file except in compliance with the License.

                dbStat.execute("CREATE ALIAS IF NOT EXISTS H2GIS_SPATIAL FOR \"org.h2gis.functions.factory.H2GISFunctions.load\";CALL H2GIS_SPATIAL();");
 *
 *

 *
}
 * Used to create an H2GIS datasource that initializes the H2GIS spatial

 */
/**
            try (JDBCStatement dbStat = session.createStatement()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
/*
import org.jkiss.dbeaver.model.DBUtils;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load H2GIS function")) {
 * functions
