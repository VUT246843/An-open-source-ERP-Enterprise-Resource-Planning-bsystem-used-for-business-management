import org.jkiss.dbeaver.model.struct.DBSTypedObject;
import org.jkiss.code.Nullable;
     *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
/**

 * Renders value into human readable form
     * @param format string format
 * distributed under the License is distributed on an "AS IS" BASIS,
     * @return formatted string
package org.jkiss.dbeaver.model.data;

     * Converts value to human readable format
 * Unless required by applicable law or agreed to in writing, software
    String getValueDisplayString(@NotNull DBSTypedObject column, @Nullable Object value, @NotNull DBDDisplayFormat format);
    @NotNull
{
 * limitations under the License.
}
 * See the License for the specific language governing permissions and

 * You may obtain a copy of the License at
    /**
 * Copyright (C) 2010-2024 DBeaver Corp and others
     * @param column column
 * DBeaver - Universal Database Manager
import org.jkiss.code.NotNull;
 */
     * @param value value
 * DBD Value renderer.
 *     http://www.apache.org/licenses/LICENSE-2.0
public interface DBDValueRenderer

     */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 *
 */
/*
