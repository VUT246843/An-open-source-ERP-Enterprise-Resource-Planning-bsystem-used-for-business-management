    @Property(viewable = true, order = 1)


    public static Collection<OracleDependencyGroup> of(@NotNull DBSObject owner) {
 */

            ? OracleMessages.edit_oracle_dependencies_dependent_name
 * you may not use this file except in compliance with the License.
            new OracleDependencyGroup(owner, false),
import org.jkiss.code.Nullable;
            : OracleMessages.edit_oracle_dependencies_dependency_name;
    }
    public DBSObject getParentObject() {
import org.jkiss.dbeaver.ext.oracle.internal.OracleMessages;
    @Association
    }
    }
    @Override
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    public OracleDependencyGroup(DBSObject owner, boolean dependents) {

import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.DBPDataSource;
import java.util.Arrays;
 * Unless required by applicable law or agreed to in writing, software
 *
        ));
    @NotNull
            : OracleMessages.edit_oracle_dependencies_dependency_description;
/*

        return Collections.unmodifiableCollection(Arrays.asList(
import java.util.Collection;
import org.jkiss.code.NotNull;


    @Nullable
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at

            ? OracleMessages.edit_oracle_dependencies_dependent_description
 *     http://www.apache.org/licenses/LICENSE-2.0
            new OracleDependencyGroup(owner, true)
import org.jkiss.dbeaver.model.struct.DBSObject;
        return OracleDependency.readDependencies(monitor, owner, dependents);
    @Nullable
        this.dependents = dependents;
    @NotNull
        return dependents
public class OracleDependencyGroup implements DBSObject {
    private final DBSObject owner;
    }
        return owner;
import org.jkiss.dbeaver.model.meta.Association;
    public boolean isPersisted() {
        return owner.getDataSource();
    @Override
        return owner.isPersisted();
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
    }
 *
import org.jkiss.dbeaver.model.meta.Property;
    }
    }
    public String getName() {
    @Override
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return dependents
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
    @NotNull
    public Collection<OracleDependency> getEntries(DBRProgressMonitor monitor) throws DBException {
    public String getDescription() {

    @Override
package org.jkiss.dbeaver.ext.oracle.model;
 * limitations under the License.


    public DBPDataSource getDataSource() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        this.owner = owner;
}
    private final boolean dependents;
import java.util.Collections;
