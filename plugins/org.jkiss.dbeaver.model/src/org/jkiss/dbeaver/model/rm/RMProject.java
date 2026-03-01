    @Property(viewable = true, order = 11)
        @NotNull String id,
                return value;
    public RMProject(@NotNull String name) {
    }
        return type;
    public boolean hasProjectPermission(String permission) {
            CommonUtils.equalObjects(id, ((RMProject) obj).id) &&
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        public Object transform(@NotNull RMProject object, @Nullable Object value) throws IllegalArgumentException {

            case GLOBAL -> ModelMessages.project_shared_display_name;

    private RMProjectType type;
import org.jkiss.utils.CommonUtils;
    }

    }
        super(name);
    private String description;
    @Property(viewable = true, valueRenderer = TimeRenderer.class, order = 10)
    }
import org.jkiss.utils.ArrayUtils;
        this.id = id;
    }

    public String getDisplayName() {
    }
    }
        this.createTime = createTime;
        this.creator = creator;

 * limitations under the License.
    }

import java.text.SimpleDateFormat;

    }
    @Property(viewable = true, order = 3)
    private Long createTime;
        return ArrayUtils.contains(SHARED_PROJECTS, getType());
    public int hashCode() {
import org.jkiss.dbeaver.model.DBPObjectWithDescription;
    @Override
    @Override
        }

        return ArrayUtils.contains(projectPermissions, permission);

        this.projectPermissions = projectPermissions;
    public Long getCreateTime() {
    public String toString() {
 */
        return creator;
    public RMProject() {
        this.id = id;
 *

        this.description = description;
    private RMResourceType[] resourceTypes;
            default -> getName();
        return projectPermissions;
    }
    public void setCreateTime(Long createTime) {
    }

    public void setProjectPermissions(String[] projectPermissions) {
    }
            CommonUtils.equalObjects(description, ((RMProject) obj).description);
 * You may obtain a copy of the License at
        this.type = type;
    public String[] getProjectPermissions() {

        @Nullable String[] projectPermissions
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return switch (type) {
    public boolean isGlobal() {
    private String[] projectPermissions;
    public void setResourceTypes(RMResourceType[] resourceTypes) {
    }
    public String getDescription() {
 * DBeaver - Universal Database Manager
        @NotNull String name,

        return description;
    public static class TimeRenderer implements IPropertyValueTransformer<RMProject, Object> {
    }
        @Nullable
    private static final RMProjectType[] SHARED_PROJECTS = {RMProjectType.GLOBAL, RMProjectType.SHARED};
        return resourceTypes;
    }
 * you may not use this file except in compliance with the License.
public class RMProject extends RMObject implements DBPObjectWithDescription {
            if (!(value instanceof Long lv)) {
            }

    }
    public void setType(RMProjectType type) {
import java.util.Date;
        this.id = name;
/*
    @Override
 */
    @Property(viewable = true, order = 2)
            return new SimpleDateFormat(DBConstants.DEFAULT_TIMESTAMP_FORMAT).format(new Date(lv));
        return id == null ? 0 : id.hashCode();
        };
import org.jkiss.dbeaver.model.DBConstants;
    }
    public boolean equals(@NotNull Object obj) {
    ) {
    }
import org.jkiss.dbeaver.model.meta.Property;
        this.creator = creator;

        this.projectPermissions = projectPermissions;

    public RMProject(
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.model.rm;
        this.description = description;

        this.createTime = createTime;

        super(name);

    public void setCreator(String creator) {
        return createTime;
        @NotNull Long createTime,
    public RMProjectType getType() {
        this.resourceTypes = resourceTypes;
    public void setDescription(String description) {

    public boolean isFolder() {
}
/**
    @NotNull
import org.jkiss.dbeaver.model.messages.ModelMessages;

import org.jkiss.code.NotNull;
        @NotNull RMProjectType type,


 * Copyright (C) 2010-2025 DBeaver Corp and others


    public String getCreator() {
 *
            CommonUtils.equalObjects(getName(), ((RMProject) obj).getName()) &&
 * Resource manager API
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.type = type;


        return id;

    public void setId(@NotNull String id) {
    }
    @Override
        return id;
        @Override
    }
    }
        @NotNull String creator,
    }
    }
        return true;
 * See the License for the specific language governing permissions and
import org.jkiss.code.Nullable;
    public RMResourceType[] getResourceTypes() {
 * Unless required by applicable law or agreed to in writing, software


import org.jkiss.dbeaver.model.meta.IPropertyValueTransformer;
            case USER -> ModelMessages.project_private_display_name;
    private String id;
        @Nullable String description,
        return getType() == RMProjectType.GLOBAL;
    @Property(viewable = true, order = 1)
    public boolean isShared() {

    private String creator;
        return obj instanceof RMProject &&
    }
    public String getId() {
