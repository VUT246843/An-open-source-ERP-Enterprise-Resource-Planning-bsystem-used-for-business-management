    }
        super("Databend SQL", "databend");
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ext.databend.model;
    public DatabendSQLDialect() {
 * distributed under the License is distributed on an "AS IS" BASIS,

 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.impl.jdbc.JDBCSQLDialect;
 *
 * limitations under the License.
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 */
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
 *

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
 * See the License for the specific language governing permissions and
/**
 * Unless required by applicable law or agreed to in writing, software
public class DatabendSQLDialect extends JDBCSQLDialect {

    public boolean isCatalogAtStart() {

/*
 *
}
 * Databend SQL dialect
        return true;
