
/*
/**
 * @author Chao Tian
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
        return switch (getName().toLowerCase()) {
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
    public GBase8sSchema(GenericDataSource dataSource, GenericCatalog catalog, String schemaName) {

 * See the License for the specific language governing permissions and
}
        super(dataSource, catalog, schemaName);
 */
    @Override
    }
 *
 *
public class GBase8sSchema extends GenericSchema {
 */
        case "sys", "sysadmin", "sysmaster", "sysuser", "sysutils" -> true;
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at


        default -> false;
        };
package org.jkiss.dbeaver.ext.gbase8s.model;
import org.jkiss.dbeaver.ext.generic.model.GenericSchema;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public boolean isSystem() {
 * Copyright (C) 2010-2024 DBeaver Corp and others

 *
import org.jkiss.dbeaver.ext.generic.model.GenericCatalog;
 * limitations under the License.
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
