    boolean supportsDistributedMode();
 * Unless required by applicable law or agreed to in writing, software
    Class<?>[] getInputTypes();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Nullable
    @NotNull


public interface DBTTaskType {

 * distributed under the License is distributed on an "AS IS" BASIS,
    @Nullable
    boolean isDriverApplicable(DBPDriver driver);
    String getDescription();
    @Nullable

    boolean isStandalone();
    String getName();
    boolean supportsVariables();
    @NotNull

    boolean isObjectApplicable(Object object);
 * DBeaver - Universal Database Manager
    DBTTaskHandler createHandler() throws DBException;


    @NotNull
/**

    @NotNull
import org.jkiss.dbeaver.DBException;
    /**
import org.jkiss.code.Nullable;
    String confirmationMessageIfNeeded();

     * Checks whether this task is standalone (means that it can work without database connection) or not.
    @NotNull
package org.jkiss.dbeaver.model.task;
 *
 *
}
    DBPPropertyDescriptor[] getConfigurationProperties();
 */
 * you may not use this file except in compliance with the License.
    DBPImage getIcon();
 * Licensed under the Apache License, Version 2.0 (the "License");


import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;

 * Copyright (C) 2010-2025 DBeaver Corp and others
    DBTTaskCategory getCategory();
     */
import org.jkiss.dbeaver.model.connection.DBPDriver;
    String getId();
 * limitations under the License.


import org.jkiss.code.NotNull;
 */
    @Nullable
 * You may obtain a copy of the License at
    @NotNull
import org.jkiss.dbeaver.model.DBPImage;
    Class<? extends DBTTaskHandler> getHandlerClass();
/*
 *

 * Task handler
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and


