 */
import org.jkiss.dbeaver.model.DBPNamedObject;

{
 *     http://www.apache.org/licenses/LICENSE-2.0
public interface DBSTableForeignKeyColumn extends DBSEntityAttributeRef, DBPNamedObject
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
 *
package org.jkiss.dbeaver.model.struct.rdb;
 * Unless required by applicable law or agreed to in writing, software
}
 * DBSTableForeignKeyColumn
    DBSEntityAttribute getReferencedColumn();
/**
 * Licensed under the Apache License, Version 2.0 (the "License");

 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.struct.DBSEntityAttributeRef;
 * You may obtain a copy of the License at
 * limitations under the License.
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
 *
/*
 */
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
