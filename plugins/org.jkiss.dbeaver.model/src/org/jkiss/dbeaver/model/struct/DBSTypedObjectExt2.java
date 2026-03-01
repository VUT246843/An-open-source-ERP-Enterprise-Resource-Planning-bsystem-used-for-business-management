import org.jkiss.dbeaver.model.DBPObject;

 *
package org.jkiss.dbeaver.model.struct;
/**
import org.jkiss.dbeaver.DBException;
import org.jkiss.code.NotNull;

public interface DBSTypedObjectExt2 extends DBPObject {
import org.jkiss.code.Nullable;
    void setMaxLength(long maxLength);
    /**
    void setTypeName(@NotNull String typeName) throws DBException;
     * @throws DBException on any DB error or if the type could not be resolved

 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    void setRequired(boolean required);
 * You may obtain a copy of the License at
     *
 * See the License for the specific language governing permissions and
     */
    void setPrecision(@Nullable Integer precision);
 * DBeaver - Universal Database Manager
    void setScale(@Nullable Integer scale);
 * Copyright (C) 2010-2024 DBeaver Corp and others
}
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
/*
     * Sets database-specific type name (without modifiers). E.g. {@code varchar}, {@code number}

 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
 * DBSTypedObjectExt2
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 */

 *


