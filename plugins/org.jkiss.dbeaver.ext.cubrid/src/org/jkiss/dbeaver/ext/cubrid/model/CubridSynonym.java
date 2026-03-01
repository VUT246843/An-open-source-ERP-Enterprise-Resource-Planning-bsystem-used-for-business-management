    }
    }
 * Unless required by applicable law or agreed to in writing, software
    @NotNull
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 */

    public String getDescription() {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.model.meta.Property;
    }
        this.description = description;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 * distributed under the License is distributed on an "AS IS" BASIS,

        super(container, name, description);
        return targetName;
    private String targetName;
    @Override
 *
 * you may not use this file except in compliance with the License.
    public void setDescription(String description) {

{
    }
public class CubridSynonym extends GenericSynonym
        this.targetName = JDBCUtils.safeGetString(dbResult, "target_name");
import org.jkiss.dbeaver.model.DBUtils;
    public CubridUser getOwner() {
        return DBUtils.getQuotedIdentifier(this.getOwner()) + "." + DBUtils.getFullQualifiedName(getDataSource(), this);
        this.targetOwner = JDBCUtils.safeGetString(dbResult, "target_owner_name");
    public void setTargetObject(String targetObject) {

            @NotNull GenericStructContainer container,
 * limitations under the License.
    }
            @Nullable String description,
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.struct.DBSObject;
 * See the License for the specific language governing permissions and
    public String getTargetObject() {
    @Property(viewable = true, order = 2)
        return description;
 *
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
        this.description = description;

    public CubridSynonym(
    public DBSObject getTargetObject(@NotNull DBRProgressMonitor monitor) throws DBException {
    @NotNull
            @NotNull String name,
    }
    @Override
}

    @Property(viewable = true, editable = true, updatable = true, length = PropertyLength.MULTILINE, order = 10)
            @NotNull String name) {
    @Nullable

        this.targetName = targetObject;
import org.jkiss.dbeaver.ext.generic.model.GenericSynonym;
    @Override

 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    private String description;
    public CubridSynonym(
            @NotNull JDBCResultSet dbResult) {

    @Property(viewable = true, editable = true, updatable = true, order = 4)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private String targetOwner;
            @NotNull GenericStructContainer container,
import org.jkiss.dbeaver.model.meta.PropertyLength;
import org.jkiss.code.Nullable;
        return getDataSource().findTable(monitor, null, targetOwner, targetName);
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;

 *
 * DBeaver - Universal Database Manager
import org.jkiss.code.NotNull;
/*
package org.jkiss.dbeaver.ext.cubrid.model;
        this.owner = JDBCUtils.safeGetString(dbResult, "synonym_owner_name");
 * You may obtain a copy of the License at
    }
    }
        this.owner = container.getName();
        super(container, name, null);

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 *     http://www.apache.org/licenses/LICENSE-2.0

        return new CubridUser(getDataSource(), owner, null);
    private String owner;
