    public String getName() {
import org.jkiss.dbeaver.model.DBPQualifiedObject;
    public String getDescription() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public GenericStructContainer getParentObject() {
    @NotNull
    }

        );
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return container.getDataSource();
    @Override

/*
        return name;
        return container;

            container.getSchema(),


    @NotNull
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {

        return description;
        this.container = container;
    private final String description;
            this
    @NotNull

    @Override
    private final GenericStructContainer container;
    @Property(viewable = true, length = PropertyLength.MULTILINE, order = 10)
        this.name = name;
    @Override
    @Override
    @Override
        this.name = name;
}

            container.getCatalog(),
    }
        this.description = description;
    }
    @Nullable
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ext.generic.model;
 *
import org.jkiss.dbeaver.model.DBPNamedObject2;
import org.jkiss.code.Nullable;
    }
    public GenericDataSource getDataSource() {
        return true;
import org.jkiss.dbeaver.model.meta.Property;
import org.jkiss.dbeaver.model.struct.DBSObject;
 * There is no synonyms support in JDBC API. Each Generic-based extension must provide its own implementation.
 * you may not use this file except in compliance with the License.
    protected GenericSynonym(GenericStructContainer container, String name, String description) {

            getDataSource(),
    @Nullable
 * You may obtain a copy of the License at
 */
 * DBeaver - Universal Database Manager
 *
    public void setName(@NotNull String name) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Generic synonym (alias).
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.model.struct.DBSAlias;
 * limitations under the License.
        return DBUtils.getFullQualifiedName(

import org.jkiss.dbeaver.model.DBPEvaluationContext;
/**
    }
    }

import org.jkiss.code.NotNull;
    @Property(viewable = true, order = 1)
 * distributed under the License is distributed on an "AS IS" BASIS,
    public boolean isPersisted() {
    private String name;
    }
 *
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.meta.PropertyLength;
    @Override
 */
    @Override
    }
public abstract class GenericSynonym implements DBSAlias, DBSObject, DBPQualifiedObject, DBPNamedObject2 {
