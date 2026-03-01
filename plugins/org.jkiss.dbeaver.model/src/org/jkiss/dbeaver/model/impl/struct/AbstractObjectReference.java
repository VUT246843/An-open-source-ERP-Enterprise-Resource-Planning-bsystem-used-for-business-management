        this.description = description;
        if (container == dataSource) {
import org.jkiss.dbeaver.model.struct.DBSObjectReference;
    public CONTAINER getContainer() {

        this(name, container, description, objectClass, type, null);
    }
            fqName = DBUtils.getFullQualifiedName(dataSource, container, this);
    }

        } else {
    public DBSObjectType getObjectType()
        this.objectClass = objectClass;
        }
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context)
    @NotNull
        return container;

    private final Class<?> objectClass;
        if (container == null) {
        return fqName;

 */
    {
    private final DBSObjectType type;
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
}

            // In case if there are no schemas/catalogs supported
    @Override
 * Abstract object reference
        DBPDataSource dataSource = container.getDataSource();
    private final String description;
            return name;
        this.extraInfo = extraInfo;



            return extraInfo;
public abstract class AbstractObjectReference<CONTAINER extends DBSObject> implements DBSObjectReference {
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBUtils;
/**
    public Class<?> getObjectClass() {
 * DBeaver - Universal Database Manager
            return name;
    {
import org.jkiss.dbeaver.model.struct.DBSObject;
        return name;

    {
        String fqName;
        }
 *
    }
        if (dataSource == null) {
    @Override
    }
        }
    public String getObjectDescription()
 * Copyright (C) 2010-2025 DBeaver Corp and others

    @Override
        if (extraInfo != null) {
 * Unless required by applicable law or agreed to in writing, software
        this.type = type;

    {
    @Override
    private final String extraInfo;
 * limitations under the License.
import org.jkiss.code.NotNull;
    protected AbstractObjectReference(String name, CONTAINER container, String description, Class<?> objectClass, DBSObjectType type) {
    private final CONTAINER container;
    protected AbstractObjectReference(String name, CONTAINER container, String description,
        }
 *
            fqName = DBUtils.getQuotedIdentifier(dataSource, name);
    @Override
    }
        return objectClass;

                                      Class<?> objectClass, DBSObjectType type, String extraInfo) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
package org.jkiss.dbeaver.model.impl.struct;
            // and data source is a root container
import org.jkiss.dbeaver.model.struct.DBSObjectType;
        this.container = container;
        return type;
    public String toString() {
    @NotNull
    }
 * You may obtain a copy of the License at
    }
        return description;
/*
import org.jkiss.dbeaver.model.DBPDataSource;
    public String getName()
    @Override
        this.name = name;
        return getFullyQualifiedName(DBPEvaluationContext.UI);
 *
    private final String name;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
