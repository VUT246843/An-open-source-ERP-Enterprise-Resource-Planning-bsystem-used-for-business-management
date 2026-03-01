 */
 * Licensed under the Apache License, Version 2.0 (the "License");
        @Nullable DBECommandContext commandContext,
 *
 */
        @NotNull OBJECT_TYPE object,

 *
        @NotNull Map<String, Object> options);
 * See the License for the specific language governing permissions and
        @Nullable Object container,


import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.DBPObject;
 * DBeaver - Universal Database Manager
 * May perform UI interactions.
    OBJECT_TYPE configureObject(
import org.jkiss.code.Nullable;
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.Map;
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.model.edit;
/*

        @NotNull DBRProgressMonitor monitor,
public interface DBEObjectConfigurator<OBJECT_TYPE extends DBPObject> {
/**
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
} * Object configurator.

 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others

