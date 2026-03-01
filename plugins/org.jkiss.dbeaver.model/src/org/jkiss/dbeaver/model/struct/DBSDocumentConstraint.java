        return Collections.singletonList(() -> attribute);
import org.jkiss.code.Nullable;
        return entity.getDataSource();
 *

    }
    @Override

    @Override
    @Override
package org.jkiss.dbeaver.model.struct;
    @NotNull
/**
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.Collections;
        return entity;
    @Override
 */
 * See the License for the specific language governing permissions and
    @NotNull
    public DBSDocumentContainer getParentObject() {
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    }
 * DBeaver - Universal Database Manager
    }
 * You may obtain a copy of the License at
 *
 */
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public boolean isPersisted() {

    @Nullable
 * DBSDocumentConstraint
    @Override

    @NotNull
        DBSEntityAttribute attribute = entity.getDocumentAttribute(monitor);
        return null;
        return DBSEntityConstraintType.PRIMARY_KEY;
        return "DocumentKey";
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public String getName() {
 * Unless required by applicable law or agreed to in writing, software

    }
    private final DBSDocumentContainer entity;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public DBSEntityConstraintType getConstraintType() {
import org.jkiss.dbeaver.DBException;
    public String getDescription() {


}
    public List<? extends DBSEntityAttributeRef> getAttributeReferences(@Nullable DBRProgressMonitor monitor) throws DBException {
    }
public class DBSDocumentConstraint implements DBSEntityConstraint, DBSEntityReferrer {
 * limitations under the License.
    @NotNull
    public DBSDocumentConstraint(DBSDocumentContainer entity) {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
/*
    }

import org.jkiss.dbeaver.model.DBPDataSource;

    }
    public DBPDataSource getDataSource() {
import java.util.List;

    }
    @Override
        return false;


        this.entity = entity;
    @Nullable
    @Override
