 *     http://www.apache.org/licenses/LICENSE-2.0
 *
import org.jkiss.code.Nullable;
/**
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.code.NotNull;
    Collection<? extends DBSParameter> getParameters(@NotNull DBRProgressMonitor monitor) throws DBException;
 */
 * See the License for the specific language governing permissions and

public interface DBSParametrizedObject extends DBSObject

 * It is some object which can be fully qualified only with it's parameters.
 */
    @Nullable
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}import java.util.Collection;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
package org.jkiss.dbeaver.model.struct;
import org.jkiss.dbeaver.DBException;
 * Copyright (C) 2010-2024 DBeaver Corp and others

/*
{

 * Unless required by applicable law or agreed to in writing, software
 *
 * Parametrized object.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
