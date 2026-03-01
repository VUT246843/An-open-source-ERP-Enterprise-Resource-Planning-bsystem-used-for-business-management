package org.jkiss.dbeaver.model.task;
 */

 *     http://www.apache.org/licenses/LICENSE-2.0
/**

 * You may obtain a copy of the License at
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
}
import java.util.List;
import org.jkiss.code.NotNull;
 * See the License for the specific language governing permissions and

    DBTScheduler getInstance() throws DBException;
    String getName();
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.DBException;
 * limitations under the License.
 * Scheduler descriptor

    boolean isEnabled();

    String getDescription();
    List<DBPPropertyDescriptor> getProperties();
/*
 * DBeaver - Universal Database Manager
 *

public interface DBTSchedulerDescriptor {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software


import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;

 */
    @NotNull
 * you may not use this file except in compliance with the License.
