 *
 */
        if (adaptableObject instanceof SQLDialect) {
 * Unless required by applicable law or agreed to in writing, software
/*
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ext.mysql.sql;

 * Copyright (C) 2010-2024 DBeaver Corp and others

 * DBeaver - Universal Database Manager
public class MySQLDialectAdapterFactory implements IAdapterFactory {
        }
import org.jkiss.dbeaver.model.sql.SQLDialect;
import org.jkiss.dbeaver.model.text.parser.TPRuleProvider;
}
        return null;
                return adapterType.cast(new MySQLDialectRules());
    @Override
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
    private static final Class<?>[] CLASSES = new Class[] { TPRuleProvider.class };
import org.eclipse.core.runtime.IAdapterFactory;

    public Class<?>[] getAdapterList() {
    @Override
    public <T> T getAdapter(Object adaptableObject, Class<T> adapterType) {
    }
 *
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0

        return CLASSES;
    }


 * You may obtain a copy of the License at
            if (adapterType == TPRuleProvider.class) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    
 *
