 * Unless required by applicable law or agreed to in writing, software
        super(dataSource);
 * See https://github.com/GoogleCloudPlatform/cloud-sql-jdbc-socket-factory#postgresql-1
 *

package org.jkiss.dbeaver.ext.postgresql.model.impls;
    @Override
 * Google Cloud SQL - PostgreSQL.
 * process, as it means that no client certificates and IP whitelisting is needed in

    }
}
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * for more information.
 * you may not use this file except in compliance with the License.
    public static final String TYPE_ID = "gcloudpg";
    @Override
 * limitations under the License.
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 * DBeaver - Universal Database Manager

    }
        return false;

        return "Google Cloud SQL PostgreSQL";
    public boolean supportsNativeClient() {

    public String getServerTypeName() {
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
/*
/**
 * This driver will connect a Google Cloud SQL PostgreSQL instance using the

 * cloud-sql-jdbc-socket-factory provided by Google. This simplifies the connection
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * order to connect.
    public PostgreServerGCloud(PostgreDataSource dataSource) {
 */
 * 
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
public class PostgreServerGCloud extends PostgreServerPostgreSQL {
