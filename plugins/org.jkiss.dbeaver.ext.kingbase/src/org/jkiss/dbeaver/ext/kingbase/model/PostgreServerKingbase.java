    public boolean supportsStoredProcedures() {
        return false;
 *
        super(dataSource);

        this.supportJobs = false;
    @Override
        return "Kingbase";
 * You may obtain a copy of the License at
    }
import org.jkiss.dbeaver.ext.postgresql.model.impls.PostgreServerExtensionBase;
    }


    @Override
    public boolean supportsNativeClient() {
import org.jkiss.dbeaver.ext.kingbase.KingbaseConstants;
 * Licensed under the Apache License, Version 2.0 (the "License");
            || className.equals(KingbaseConstants.KB_INTERVAL_CLASS);
    public PostgreDatabase.SchemaCache createSchemaCache(PostgreDatabase database) {
    public boolean isSupportJobs() {
    public boolean supportsExtensions() {
/*



    protected PostgreServerKingbase(PostgreDataSource dataSource) {
    }
        return supportJobs;
 * distributed under the License is distributed on an "AS IS" BASIS,
public class PostgreServerKingbase extends PostgreServerExtensionBase {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDatabase;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
    public boolean isPGObject(@NotNull Object object) {
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ext.kingbase.model;
}
    }
        return new KingbaseSchemaCache();
 */
 *
    @Override

        this.supportJobs = supportJobs;


    @Override
    public void setSupportJobs(boolean supportJobs) {
    @Override
    }
 * See the License for the specific language governing permissions and
    }
 * limitations under the License.
        return true;
import org.jkiss.code.NotNull;
    private boolean supportJobs;
 *
    public String getServerTypeName() {
        String className = object.getClass().getName();
        return false;
 * you may not use this file except in compliance with the License.
        return className.equals(KingbaseConstants.KB_OBJECT_CLASS)

    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }

    }
