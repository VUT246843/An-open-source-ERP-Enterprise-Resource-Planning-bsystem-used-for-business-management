 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.

 * you may not use this file except in compliance with the License.
import org.jkiss.code.Nullable;

}
 * Task execution listener
 */
 *
 *
    void subTaskFinished(@Nullable DBTTask task, @Nullable Throwable error, @Nullable Object settings);
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager


public interface DBTTaskExecutionListener {
    void taskStarted(@Nullable DBTTask task);

 *
package org.jkiss.dbeaver.model.task;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
    void taskFinished(@Nullable DBTTask task, @Nullable Object result, @Nullable Throwable error, @Nullable Object settings);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/**
 * Unless required by applicable law or agreed to in writing, software
/*
