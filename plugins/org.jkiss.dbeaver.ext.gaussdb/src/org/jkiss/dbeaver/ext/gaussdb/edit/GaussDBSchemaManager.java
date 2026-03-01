 * limitations under the License.
        GaussDBDatabase database = (GaussDBDatabase) container;
                                                 Object copyFrom, @NotNull Map<String, Object> options) {

 * Unless required by applicable law or agreed to in writing, software
/**
 * GaussDBSchemaManager
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ext.gaussdb.edit;
 * See the License for the specific language governing permissions and
    protected GaussDBSchema createDatabaseObject(@NotNull DBRProgressMonitor monitor, @NotNull DBECommandContext context, final Object container,
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.ext.postgresql.edit.PostgreSchemaManager;
import java.util.Map;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ext.postgresql.model.PostgreRole;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
import org.jkiss.code.NotNull;
/*
        return database.createSchemaImpl(database, "NewSchema", (PostgreRole) null);
 */

import org.jkiss.dbeaver.ext.gaussdb.model.GaussDBSchema;

 *
 * DBeaver - Universal Database Manager

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *     http://www.apache.org/licenses/LICENSE-2.0
}
    }
public class GaussDBSchemaManager extends PostgreSchemaManager {
 *
import org.jkiss.dbeaver.ext.gaussdb.model.GaussDBDatabase;
 * You may obtain a copy of the License at
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.edit.DBECommandContext;
