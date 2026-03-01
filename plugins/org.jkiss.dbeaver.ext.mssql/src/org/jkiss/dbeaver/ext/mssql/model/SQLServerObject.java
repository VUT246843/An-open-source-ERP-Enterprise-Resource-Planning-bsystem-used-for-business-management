 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBPNamedObject;
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and
 *

 *     http://www.apache.org/licenses/LICENSE-2.0

    SQLServerDataSource getDataSource();
}

 * distributed under the License is distributed on an "AS IS" BASIS,
public interface SQLServerObject extends DBPNamedObject, DBSObject, DBPObjectWithLongId
    @Nullable
import org.jkiss.dbeaver.model.DBPObjectWithLongId;
import org.jkiss.code.NotNull;
 */
package org.jkiss.dbeaver.ext.mssql.model;
{
 * SQLServerObject.
 *
    @NotNull
import org.jkiss.code.Nullable;
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.struct.DBSObject;
 * Represented in sys.objects
/**
 * limitations under the License.
 * you may not use this file except in compliance with the License.
    SQLServerDatabase getDatabase();
/*
 * You may obtain a copy of the License at
 */
