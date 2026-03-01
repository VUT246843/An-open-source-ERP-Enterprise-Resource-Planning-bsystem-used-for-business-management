
 * Copyright (C) 2010-2024 DBeaver Corp and others

/**
import org.jkiss.code.Nullable;
    DATA_SOURCE getDataSource();
import org.jkiss.dbeaver.model.DBPDataSource;

 * Unless required by applicable law or agreed to in writing, software
 * Lazy object
 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;
    @Override
}
package org.jkiss.dbeaver.model.struct;
 *
    @NotNull
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Nullable
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
 */
 * limitations under the License.

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
public interface DBSObjectLazy<DATA_SOURCE extends DBPDataSource> extends DBSObject {
    Object getLazyReference(Object propertyId);
/*
 * DBeaver - Universal Database Manager
