        String packageName,
    @Override
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {

    }
    @Override
    @Override
    public String getDescription() {
        return super.refreshObject(monitor);
 * DBeaver - Universal Database Manager
        return this;
package org.jkiss.dbeaver.ext.generic.model;
    }
    }
    @Property(viewable = true, order = 4)
    @Override

import org.jkiss.dbeaver.model.meta.Property;
    @Override

    @Property(viewable = true, order = 3, labelProvider = GenericCatalog.CatalogNameTermProvider.class)
import java.util.Collection;
    @NotNull
    @Override
    }
        this.nameFromCatalog = nameFromCatalog;
        return procedures;

        DBUtils.orderObjects(procedures);
    public DBSObject getParentObject() {
    }
public class GenericPackage extends GenericObjectContainer implements DBPQualifiedObject, GenericScriptObject, DBSPackage {
        return null;
    private final boolean nameFromCatalog;
}

 *

            getDataSource(),
            getSchema(),
    }
 */

    @Nullable
        return procedures;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @NotNull
/**
 * Unless required by applicable law or agreed to in writing, software
    @NotNull

    public GenericSchema getSchema() {
        return container.getCatalog();
            this
 * GenericPackage
    @Override
import org.jkiss.code.NotNull;


 * you may not use this file except in compliance with the License.
    }
    private final GenericStructContainer container;
    public Class<? extends DBSObject> getPrimaryChildType(@Nullable DBRProgressMonitor monitor) throws DBException {
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
    public List<GenericProcedure> getProcedures(@NotNull DBRProgressMonitor monitor)
    private final String packageName;
 *
            getCatalog(),
    public DBSObject getChild(@NotNull DBRProgressMonitor monitor, @NotNull String childName) throws DBException {
    }
        return nameFromCatalog;
    }


 *
        return GenericProcedure.class;
        return container;
    public Collection<? extends DBSObject> getChildren(@NotNull DBRProgressMonitor monitor) throws DBException {
import java.util.ArrayList;
    public void addProcedure(GenericProcedure procedure) {
        this.procedures = new ArrayList<>();
import org.jkiss.code.Nullable;
    }
    public boolean isNameFromCatalog() {
    @Override
    }
    ) {
    public GenericPackage(
    }


        );
    @Property(viewable = true, order = 1)
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
        return DBUtils.getFullQualifiedName(
import org.jkiss.dbeaver.model.DBUtils;

        procedures.clear();
        procedures.add(procedure);
    throws DBException {
    @NotNull
 * You may obtain a copy of the License at
    }
    public GenericCatalog getCatalog() {
 * See the License for the specific language governing permissions and
    public void orderProcedures() {
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0

    }
import org.jkiss.dbeaver.model.struct.rdb.DBSPackage;
    }
import org.jkiss.dbeaver.model.DBPQualifiedObject;

 * Copyright (C) 2010-2025 DBeaver Corp and others

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

        this.container = container;
 * distributed under the License is distributed on an "AS IS" BASIS,

    @Override
    @Override
    @NotNull
    @Override
        return null;
 * limitations under the License.
import org.jkiss.dbeaver.DBException;
        return container.getSchema();
 */

    @Override
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
    @Override
        return packageName;
        this.packageName = packageName;
        return DBUtils.findObject(procedures, childName);
/*
    @Override
    public void cacheStructure(@NotNull DBRProgressMonitor monitor, int scope) throws DBException {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    public GenericStructContainer getObject() {
import java.util.Map;
        boolean nameFromCatalog
        GenericStructContainer container,
        super(container.getDataSource());
import java.util.List;
    public String getName() {

    }
