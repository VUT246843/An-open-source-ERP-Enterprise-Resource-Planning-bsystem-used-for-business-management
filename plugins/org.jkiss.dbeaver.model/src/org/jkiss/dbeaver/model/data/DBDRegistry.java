
 */
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
}    DBDValueHandlerProvider getValueHandlerProvider(DBPDataSource dataSource, DBSTypedObject typedObject);
 *
import org.jkiss.code.Nullable;

/*
 * DBDValueHandlerRegistry
    List<? extends DBDAttributeTransformerDescriptor> findTransformers(DBPDataSource dataSource, DBSTypedObject typedObject, Boolean custom);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


package org.jkiss.dbeaver.model.data;
 *
 *
public interface DBDRegistry
import org.jkiss.dbeaver.model.DBPDataSource;
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * Licensed under the Apache License, Version 2.0 (the "License");
    @Nullable
import java.util.List;
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
{
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
/**
    @Nullable

 * See the License for the specific language governing permissions and

 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.

    DBDAttributeTransformerDescriptor getTransformer(String id);
 * You may obtain a copy of the License at
