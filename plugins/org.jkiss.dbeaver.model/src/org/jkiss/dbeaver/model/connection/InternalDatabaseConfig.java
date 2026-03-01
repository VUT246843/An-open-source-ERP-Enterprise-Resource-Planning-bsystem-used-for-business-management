
    boolean isBackupEnabled();
        }
            return minIdleConnections;
 *     http://www.apache.org/licenses/LICENSE-2.0

    default String getResolvedUrl() {
        public int getMaxConnections() {
        private int maxIdleConnections = 10;
 *
 * See the License for the specific language governing permissions and
            this.maxIdleConnections = maxIdleConnections;
    }
        private String validationQuery = "SELECT 1";

 * you may not use this file except in compliance with the License.
            return validationQuery;
 * distributed under the License is distributed on an "AS IS" BASIS,
            this.minIdleConnections = minIdleConnections;
 * Licensed under the Apache License, Version 2.0 (the "License");


        }
            this.validationQuery = validationQuery;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *


    }
        private int maxConnections = 100;
 * You may obtain a copy of the License at

import org.jkiss.code.NotNull;
    void setSchema(String schema);
 * Unless required by applicable law or agreed to in writing, software
            return maxIdleConnections;
    String getSchema();
            int maxConnections,

 */
        }
        public int getMinIdleConnections() {

            return maxConnections;

        public Pool() {
public interface InternalDatabaseConfig {
            this.maxConnections = maxConnections;
    String getUrl();
        public Pool(
        public String getValidationQuery() {
    String getUser();
        public int getMaxIdleConnections() {
        }
 * limitations under the License.
import org.jkiss.dbeaver.utils.SystemVariablesResolver;
import org.jkiss.dbeaver.utils.GeneralUtils;


    class Pool {
package org.jkiss.dbeaver.model.connection;
 * Copyright (C) 2010-2025 DBeaver Corp and others

        ) {
            String validationQuery

    void setDriver(String driver);
    String getDriver();


 * DBeaver - Universal Database Manager
    void setUrl(String url);
    String getPassword();
        }
            int maxIdleConnections,

 *
}
        return GeneralUtils.replaceVariables(getUrl(), SystemVariablesResolver.INSTANCE);


    @NotNull
/*
        private int minIdleConnections = 4;
            int minIdleConnections,
    Pool getPool();
        }
