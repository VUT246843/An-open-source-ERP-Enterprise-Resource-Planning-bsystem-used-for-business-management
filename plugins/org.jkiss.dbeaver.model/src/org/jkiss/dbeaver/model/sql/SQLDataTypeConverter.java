import org.jkiss.dbeaver.model.struct.DBSTypedObject;
/**

 *
        @NotNull DBSTypedObject sourceTypedObject,
 * SQL data type converter.
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
 * limitations under the License.
package org.jkiss.dbeaver.model.sql;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.DBPDataTypeProvider;
public interface SQLDataTypeConverter {

 * Licensed under the Apache License, Version 2.0 (the "License");
        @Nullable DBPDataTypeProvider targetTypeProvider);
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.

    String convertExternalDataType(

/*
 * Unless required by applicable law or agreed to in writing, software
}
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
 *
 * May be implemented by SQL dialect
import org.jkiss.code.NotNull;
 */
        @NotNull SQLDialect sourceDialect,
 * Copyright (C) 2010-2024 DBeaver Corp and others
