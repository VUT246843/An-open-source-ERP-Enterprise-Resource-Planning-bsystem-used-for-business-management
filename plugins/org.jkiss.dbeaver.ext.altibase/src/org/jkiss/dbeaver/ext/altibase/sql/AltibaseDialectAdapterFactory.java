    public <T> T getAdapter(Object adaptableObject, Class<T> adapterType) {
    }


    @Override
 *
    @Override
import org.jkiss.dbeaver.model.text.parser.TPRuleProvider;
import org.eclipse.core.runtime.IAdapterFactory;
 * distributed under the License is distributed on an "AS IS" BASIS,
public class AltibaseDialectAdapterFactory implements IAdapterFactory {
            return adapterType.cast(new AltibaseDialectRules());
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
import org.jkiss.dbeaver.model.sql.SQLDialect;
 * See the License for the specific language governing permissions and
    public Class<?>[] getAdapterList() {
package org.jkiss.dbeaver.ext.altibase.sql;
    }
/*
 * Unless required by applicable law or agreed to in writing, software
        }
        return CLASSES;
 */

}        if ((adaptableObject instanceof SQLDialect) && (adapterType == TPRuleProvider.class)) {
 * You may obtain a copy of the License at
    
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
        return null;
 * limitations under the License.

 *
    private static final Class<?>[] CLASSES = new Class[] { TPRuleProvider.class };
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0

