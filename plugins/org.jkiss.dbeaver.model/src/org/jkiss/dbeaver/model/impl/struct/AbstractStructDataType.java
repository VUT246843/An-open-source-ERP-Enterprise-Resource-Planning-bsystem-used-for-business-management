    @Nullable
 * Copyright (C) 2010-2024 DBeaver Corp and others
     */
    @Nullable
    }
                }
    }
        return null;
 */
package org.jkiss.dbeaver.model.impl.struct;
import org.jkiss.dbeaver.model.struct.DBSEntityAssociation;
 * you may not use this file except in compliance with the License.
            for (DBSEntityAttribute attr : attributes) {
        Collection<? extends DBSEntityAttribute> attributes = getAttributes(monitor);
 * You may obtain a copy of the License at
            }
import org.jkiss.dbeaver.model.DBPDataSource;
     * Doesn't make sense here
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;

public abstract class AbstractStructDataType<DS extends DBPDataSource> extends AbstractDataType<DS> implements DBSEntity
import org.jkiss.dbeaver.model.struct.DBSEntity;
                    return attr;
    }
    public Collection<? extends DBSEntityConstraint> getConstraints(@NotNull DBRProgressMonitor monitor) throws DBException {
        return null;
 *     http://www.apache.org/licenses/LICENSE-2.0
    /**
    public DBSEntityAttribute getAttribute(@NotNull DBRProgressMonitor monitor, @NotNull String attributeName) throws DBException {
 *
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.struct.DBSEntityConstraint;
import org.jkiss.code.Nullable;
    @Override
        return null;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
 * Unless required by applicable law or agreed to in writing, software
{
 * DBeaver - Universal Database Manager


        super(dataSource);
 * distributed under the License is distributed on an "AS IS" BASIS,
 * AbstractStructDataType
    public Collection<? extends DBSEntityAssociation> getAssociations(@NotNull DBRProgressMonitor monitor) throws DBException {
                if (attr.getName().equals(attributeName)) {

    }

 *
    @Nullable
 */
}
    public AbstractStructDataType(DS dataSource) {
    /**
import org.jkiss.code.NotNull;
    @Override
/**
        return null;
/*
    }
 *
    public Collection<? extends DBSEntityAssociation> getReferences(@NotNull DBRProgressMonitor monitor) throws DBException {
 * limitations under the License.
import java.util.Collection;
        }
     */
        if (attributes != null && !attributes.isEmpty()) {
    @Override
     * Doesn't make sense here
     */
import org.jkiss.dbeaver.DBException;
    /**
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;


    @Nullable
 * Licensed under the Apache License, Version 2.0 (the "License");
     * Doesn't make sense here
