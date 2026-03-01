public class PostgreServerGaussDB extends PostgreServerExtensionBase {
    }
    }

        return supportJobs;

import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
}
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.supportJobs = false;
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    }
 *

    @Override
    @Override

    public String getServerTypeName() {
    @Override
    protected PostgreServerGaussDB(PostgreDataSource dataSource) {
    public PostgreDatabase.SchemaCache createSchemaCache(PostgreDatabase database) {
        this.supportJobs = supportJobs;
    private boolean supportJobs;
 * DBeaver - Universal Database Manager
        super(dataSource);
    public boolean isSupportJobs() {
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
    public boolean supportsExtensions() {
    }
        return false;
    public boolean supportsNativeClient() {
package org.jkiss.dbeaver.ext.gaussdb.model;
        return new GaussDBSchemaCache();

        return true;
    public boolean supportsStoredProcedures() {
 *

    }


 *
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ext.postgresql.model.impls.PostgreServerExtensionBase;


 */
    @Override
    }
    @Override
        return false;
    public void setSupportJobs(boolean supportJobs) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
    }
        return "GaussDB";
/*
 *     http://www.apache.org/licenses/LICENSE-2.0

