
 * DBeaver - Universal Database Manager

public interface DBTTaskSettingsInput<T>  extends DBTTaskSettings {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
/**
 */
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
import java.util.Map;
 * limitations under the License.
package org.jkiss.dbeaver.model.task;
 */
import java.util.List;
 * Copyright (C) 2010-2025 DBeaver Corp and others
/*

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *
    void loadSettingsFromInput(@NotNull List<T> inputObjects, @NotNull Map<String, Object> options);
 *

 *
}
import org.jkiss.code.NotNull;
 * Task settings with input
 * You may obtain a copy of the License at
