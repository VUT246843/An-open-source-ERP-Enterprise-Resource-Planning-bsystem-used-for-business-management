 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.meta.IPropertyValueValidator;

package org.jkiss.dbeaver.ext.oracle.model;
 */
 *
import org.jkiss.code.NotNull;


 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
 * See the License for the specific language governing permissions and
    public boolean isValidValue(@NotNull OracleTableBase object, @Nullable Object value) throws IllegalArgumentException {
}
        return !(object instanceof OracleTablePartition);
public class OracleTableNotPartitionPropertyValidator implements IPropertyValueValidator<OracleTableBase, Object> {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * limitations under the License.
import org.jkiss.code.Nullable;
    }
