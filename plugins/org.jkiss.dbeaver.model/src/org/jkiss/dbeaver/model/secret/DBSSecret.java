 * DBeaver - Universal Database Manager
/**
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    public void setName(@NotNull String name) {
    public String getName() {
    private String description;
    private String id;
package org.jkiss.dbeaver.model.secret;
        this.name = name;
    public void setId(@NotNull String id) {
 */
    }


    public String getId() {
    }

import org.jkiss.code.NotNull;

    public DBSSecret(String id, String name) {
    private String name;
import org.jkiss.dbeaver.model.DBPObjectWithDescription;
        return getName();
 * You may obtain a copy of the License at
        return description;
    @Override
    }
    }
 * See the License for the specific language governing permissions and
        return name;
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.


    @Nullable
    }
 *
public class DBSSecret implements DBPNamedObject, DBPObjectWithDescription {
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
        this.id = id;
        this.name = name;

    @NotNull
        this.description = description;
    public String getDescription() {
        this.id = id;
}
    public DBSSecret() {

 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    public void setDescription(String description) {
    public String toString() {
    @Override
 * Secret info

        return id;
    @NotNull
 *

import org.jkiss.dbeaver.model.DBPNamedObject;
 *     http://www.apache.org/licenses/LICENSE-2.0

    }

 *
    }
import org.jkiss.code.Nullable;

