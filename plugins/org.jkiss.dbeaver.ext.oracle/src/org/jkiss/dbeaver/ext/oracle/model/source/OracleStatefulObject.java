import org.jkiss.dbeaver.model.DBPStatefulObject;

 * Unless required by applicable law or agreed to in writing, software
    OracleDataSource getDataSource();
    @Override
/*
 */
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
public interface OracleStatefulObject extends DBSObject, DBPStatefulObject
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
}
import org.jkiss.code.Nullable;
    @Nullable
 * limitations under the License.
 * OracleStatefulObject
    @NotNull

 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
    OracleSchema getSchema();
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
{

 *
 *
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ext.oracle.model.OracleSchema;
import org.jkiss.dbeaver.ext.oracle.model.OracleDataSource;
/**
package org.jkiss.dbeaver.ext.oracle.model.source;
import org.jkiss.dbeaver.model.struct.DBSObject;
