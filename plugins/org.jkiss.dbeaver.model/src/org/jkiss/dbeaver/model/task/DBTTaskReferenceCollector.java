/**
 * you may not use this file except in compliance with the License.
import java.util.List;
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.model.task;
    void collectTaskReferences(@NotNull DBTTask task, @NotNull List<DBTTaskReference> references);
 * See the License for the specific language governing permissions and

 * May be implemented by {@link DBTTaskHandler}
 * limitations under the License.
 * You may obtain a copy of the License at
 *
import org.jkiss.code.NotNull;
 * <p>

 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
/*
 * Task reference collector.
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}

public interface DBTTaskReferenceCollector extends DBTTaskHandler {
 * DBeaver - Universal Database Manager
 *

 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
 */
