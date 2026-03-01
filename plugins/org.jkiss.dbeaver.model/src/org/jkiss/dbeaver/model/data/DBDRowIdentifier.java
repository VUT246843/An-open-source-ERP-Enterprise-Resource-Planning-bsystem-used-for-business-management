import org.jkiss.dbeaver.model.DBPObject;
import org.jkiss.dbeaver.model.virtual.DBVEntityConstraint;

        return attributes.contains(attributeBinding);
                DBDAttributeBinding binding = DBUtils.findBinding(bindings, cColumn.getAttribute());
    @NotNull
    @Property(viewable = true, order = 1)
        this.attributes.clear();
                    // If at least one attribute is missing - this ID won't work anyway
 * DBeaver - Universal Database Manager
    public boolean hasAttribute(DBDAttributeBinding attributeBinding) {
    public DBSEntity getEntity() {
        this.entityIdentifier = entityIdentifier;

        return attributes.isEmpty();
        } else if (entityIdentifier instanceof DBSEntityReferrer referrer) {
                } else {
package org.jkiss.dbeaver.model.data;
    private final DBSEntity entity;
    public boolean isIncomplete() {
 * You may obtain a copy of the License at
    }
/**
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.meta.Property;
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            for (DBSEntityAttributeRef cColumn : refs) {
                    this.attributes.add(binding);


    @NotNull
    @Property(viewable = true, order = 2)

 * Copyright (C) 2010-2025 DBeaver Corp and others

    }
        }
    public DBSEntityConstraint getUniqueKey() {
import org.jkiss.dbeaver.model.struct.DBSEntityAttributeRef;
    private final List<DBDAttributeBinding> attributes = new ArrayList<>();
                if (binding != null) {
        }
    }
public class DBDRowIdentifier implements DBPObject {
        this.entity = entity;
import org.jkiss.dbeaver.model.struct.DBSEntityReferrer;

 */
        return entityIdentifier;
    public void reloadAttributes(@NotNull DBRProgressMonitor monitor, @NotNull DBDAttributeBinding[] bindings) throws DBException
 * limitations under the License.
    private final DBSEntityConstraint entityIdentifier;
    public void clearAttributes() {
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        attributes.clear();

    @NotNull
        return attributes;
    public String getKeyType()
 * See the License for the specific language governing permissions and


import java.util.List;
    public List<DBDAttributeBinding> getAttributes() {

        return true;
 */
    {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public boolean isValidIdentifier() {
        return entity.getName() + "." + entityIdentifier.getName() + "(" +
 * Row identifier.
    }
        if (entityIdentifier instanceof DBSEntityReferrer && CommonUtils.isEmpty(attributes)) {

            attributes.stream().map(DBDAttributeBinding::getName).collect(Collectors.joining(",")) + ")";
 * Unique identifier of row in certain table.
        return entity;
    @Override
import java.util.Collections;
    public DBDRowIdentifier(@NotNull DBSEntity entity, @NotNull DBSEntityConstraint entityIdentifier)
    {

import org.jkiss.dbeaver.model.DBUtils;
 * Unless required by applicable law or agreed to in writing, software
    }
    }
        return entityIdentifier.getConstraintType().getName();
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
                    this.attributes.clear();
import org.jkiss.dbeaver.model.struct.DBSEntity;
 *
    {
            Collection<? extends DBSEntityAttributeRef> refs = CommonUtils.safeCollection(referrer.getAttributeReferences(monitor));
                    break;


    public String toString() {
import java.util.stream.Collectors;
    }
            Collections.addAll(this.attributes, bindings);
    }
 *
                    // so let's just clean it up
import org.jkiss.dbeaver.model.struct.DBSEntityConstraint;
import org.jkiss.dbeaver.DBException;
    }
    @NotNull
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
            return false;
import java.util.ArrayList;
}
                }
    }
import java.util.Collection;
import org.jkiss.utils.CommonUtils;

        if (entityIdentifier instanceof DBVEntityConstraint && ((DBVEntityConstraint) entityIdentifier).isUseAllColumns()) {
