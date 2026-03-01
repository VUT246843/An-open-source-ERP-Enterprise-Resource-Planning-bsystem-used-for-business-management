    public StringBuilder getNestedDeclaration(
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
package org.jkiss.dbeaver.ext.hana.edit;
import org.jkiss.dbeaver.ext.generic.edit.GenericTableColumnManager;
        @NotNull DBRProgressMonitor monitor,
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull DBECommandAbstract<GenericTableColumn> command,

    ) {
        StringBuilder decl = super.getNestedDeclaration(monitor, owner, command, options);
        @NotNull Map<String, Object> options
import java.util.Map;
 * See the License for the specific language governing permissions and
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
}
        return decl;

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
public class HANATableColumnManager extends GenericTableColumnManager {
        if (owner.isPersisted()) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 * HANATableColumnManager
import org.jkiss.dbeaver.model.impl.edit.DBECommandAbstract;
 */
/*
 * Unless required by applicable law or agreed to in writing, software

    }
import org.jkiss.dbeaver.ext.generic.model.GenericTableColumn;
            decl.append(")");
 *

 * You may obtain a copy of the License at
/**
 */
        @NotNull GenericTableBase owner,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
            decl.insert(0, "(");
 * limitations under the License.
 *
import org.jkiss.code.NotNull;
