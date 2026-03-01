        default -> false;

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
 */



 *     http://www.apache.org/licenses/LICENSE-2.0
/**
import org.jkiss.dbeaver.ext.generic.model.GenericCatalog;
        return switch (getName().toLowerCase()) {
    @Override
 * You may obtain a copy of the License at
    public GBase8sCatalog(GenericDataSource dataSource, String catalogName) {
}
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
public class GBase8sCatalog extends GenericCatalog implements DBPSystemObject {

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.DBPSystemObject;
        super(dataSource, catalogName);
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ext.gbase8s.model;
    }
    public boolean isSystem() {
 *
 *
        case "sys", "sysadmin", "sysmaster", "sysuser", "sysutils" -> true;
        };
/*
    }
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * @author Chao Tian

 */
