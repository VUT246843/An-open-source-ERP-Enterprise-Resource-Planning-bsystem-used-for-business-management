 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull DBTTask task,
 * See the License for the specific language governing permissions and
 *
 * you may not use this file except in compliance with the License.
/*
 */
 */
import java.util.Map;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/**
import java.util.function.Predicate;
 * Unless required by applicable law or agreed to in writing, software


 * You may obtain a copy of the License at
}
 * limitations under the License.
        @NotNull Predicate<DBTTask> predicate,
    ) throws DBException;
 * <p>
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.DBException;
 *
 * May be implemented by {@link DBTTaskHandler}
public interface DBTTaskVariableCollector extends DBTTaskHandler {

 * DBeaver - Universal Database Manager
 * Task variable collector.
package org.jkiss.dbeaver.model.task;
        @NotNull Map<DBTTask, Map<String, Object>> variables
    void collectTaskVariables(
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2024 DBeaver Corp and others
