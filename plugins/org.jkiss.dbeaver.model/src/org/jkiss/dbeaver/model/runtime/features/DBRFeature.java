        this.helpURL = helpURL;

 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager


    }
        return id + " (" + name + ")";
    }
    }
    public boolean isAbstract() {
    public static DBRFeature createCategory(@NotNull String name, String description) {
 */
        return name;
        return commandId;
        this.helpURL = null;
    public String getName() {
        this(parentFeature, name, null, null, false, null);
        this.commandId = null;
/*
    public String getDescription() {
    }
    void setId(String id) {
    public String toString() {
package org.jkiss.dbeaver.model.runtime.features;
    private String id;
 * Licensed under the Apache License, Version 2.0 (the "License");

        String description,
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,

        @NotNull String name,
    public DBRFeature getParentFeature() {
    }

        boolean isAbstract,
 * DBeaver feature description
 * Copyright (C) 2010-2024 DBeaver Corp and others
        DBRFeatureRegistry.useFeature(this, parameters);
        this.id = id;
    private DBRFeature(
        @NotNull DBRFeature parentFeature,

import org.jkiss.code.NotNull;
    }
    private DBRFeature(@NotNull DBRFeature parentFeature, @NotNull String name) {
        return new DBRFeature(parentFeature, commandId, null, null, false, commandId);

    private final boolean isAbstract;
        return new DBRFeature(parentFeature, name);
    private final String name;
        String helpURL,
    public String getHelpURL() {
        return helpURL;
    public static DBRFeature createFeature(@NotNull DBRFeature parentFeature, @NotNull String name) {
        this.use(null);
    }
        this.isAbstract = true;
 *
    private final String helpURL;
 *
        return parentFeature;



    }
    }
    }
        return id == null ? name : id;


    public String getId() {
    private DBRFeature(@NotNull String id, @NotNull String name) {
    public static DBRFeature createCommandFeature(@NotNull DBRFeature parentFeature, @NotNull String commandId) {

public final class DBRFeature {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private final DBRFeature parentFeature;
        this.parentFeature = null;
        this.name = name;


 */
    static final DBRFeature ROOT = new DBRFeature("Root", "Root Feature");

    }
    }


import java.util.Map;
    public static DBRFeature createCategory(@NotNull DBRFeature parentFeature, @NotNull String name, @Nullable String description) {
    }
        this.name = name;
    private final String commandId;

    public void use() {
}    public void use(Map<String, Object> parameters) {
 * See the License for the specific language governing permissions and
        return description;
 * Unless required by applicable law or agreed to in writing, software
 *
 * you may not use this file except in compliance with the License.
    }
        this.isAbstract = isAbstract;
        this.parentFeature = parentFeature;
 * limitations under the License.
    }
    }
    {

    }
        return isAbstract;
    @Override
import org.jkiss.code.Nullable;
        return new DBRFeature(parentFeature, name, description, null, true, null);
    }
        this.description = null;
        return createCategory(ROOT, name, description);


    private final String description;
        this.id = id;

        this.commandId = commandId;
        String commandId)
/**
    public String getCommandId() {

        this.description = description;
