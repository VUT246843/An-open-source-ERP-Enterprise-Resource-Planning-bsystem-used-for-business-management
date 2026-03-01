}

 * you may not use this file except in compliance with the License.
 * limitations under the License.
    public boolean isValidValue(@NotNull HANATable object, @Nullable Object value) throws IllegalArgumentException {
    @Override
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

public class HANANotPartitionedTable implements IPropertyValueValidator<HANATable, Object> {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;
 * See the License for the specific language governing permissions and

 *
import org.jkiss.code.Nullable;
package org.jkiss.dbeaver.ext.hana.model;
 *
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
        return !(object instanceof HANAPartition);
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.meta.IPropertyValueValidator;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
/*
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
 */
