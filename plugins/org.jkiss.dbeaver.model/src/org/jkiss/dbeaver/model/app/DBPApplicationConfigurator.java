     */
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
 *
import org.jkiss.dbeaver.model.DBFileController;
import org.jkiss.code.Nullable;
    DBConfigurationController createConfigurationController(@Nullable String pluginId);
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.DBConfigurationController;
 */
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
public interface DBPApplicationConfigurator {
}

 */
 * DB desktop application.
    /**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
     * Returns task controller. Task controller helps to work with task: load and save configuration file for different type of projects
 * See the License for the specific language governing permissions and
    DBTTaskController createTaskController();
     */

     * Creates configuration controller by plug-in id.
    @NotNull
package org.jkiss.dbeaver.model.app;
    DBFileController createFileController();
    @NotNull


    /**
    @NotNull
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.task.DBTTaskController;


 * distributed under the License is distributed on an "AS IS" BASIS,
/*
/**
     * Keeps configuration which can be shared with other users.
