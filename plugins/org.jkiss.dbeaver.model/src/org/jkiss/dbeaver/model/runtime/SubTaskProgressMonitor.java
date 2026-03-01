    public SubTaskProgressMonitor(DBRProgressMonitor original) {
 */
 */
 * See the License for the specific language governing permissions and


 * Copyright (C) 2010-2025 DBeaver Corp and others
 *

 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
}
package org.jkiss.dbeaver.model.runtime;
 * limitations under the License.
        super(original);
public class SubTaskProgressMonitor extends ProxyProgressMonitor {
 *     http://www.apache.org/licenses/LICENSE-2.0
    public void done() {
    }
    @Override
/*
        // show as syb task
    @Override
 * DBeaver - Universal Database Manager
 * Progress monitor default implementation
 *
/**
 * distributed under the License is distributed on an "AS IS" BASIS,
        original.subTask(name);
 *


 * You may obtain a copy of the License at
import org.jkiss.code.NotNull;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        // ignore
 * Unless required by applicable law or agreed to in writing, software
    }
    public void beginTask(@NotNull String name, int totalWork) {
