    }
        return new DBSEntityConstraintInfo(type, implClass);
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.model.struct;
    }
public class DBSEntityConstraintInfo {
    }

 * you may not use this file except in compliance with the License.
        this.implClass = implClass;
    @NotNull
 *
    public Class<? extends DBSEntityConstraint> getImplClass() {
        return implClass;
 */
    private final DBSEntityConstraintType type;
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
} *
 *     http://www.apache.org/licenses/LICENSE-2.0
/**
 * You may obtain a copy of the License at
/*
 * DBSEntityConstraintInfo
    public DBSEntityConstraintType getType() {
        return type;
 * limitations under the License.

 * Unless required by applicable law or agreed to in writing, software
    private final Class<? extends DBSEntityConstraint> implClass;
    @NotNull

 * Licensed under the Apache License, Version 2.0 (the "License");
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.jkiss.code.NotNull;
    }



    public static DBSEntityConstraintInfo of(@NotNull DBSEntityConstraintType type, @NotNull Class<? extends DBSEntityConstraint> implClass) {
    @NotNull
 * DBeaver - Universal Database Manager
    private DBSEntityConstraintInfo(DBSEntityConstraintType type, Class<? extends DBSEntityConstraint> implClass) {
        this.type = type;
