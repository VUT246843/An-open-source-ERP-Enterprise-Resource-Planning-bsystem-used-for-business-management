 *
 * limitations under the License.
    
import org.jkiss.dbeaver.model.text.parser.TPRuleProvider;


    public <T> T getAdapter(Object adaptableObject, Class<T> adapterType) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
import org.jkiss.dbeaver.model.sql.SQLDialect;

            if (adapterType == TPRuleProvider.class) {
    }
    @Override

package org.jkiss.dbeaver.ext.oracle.sql;
/*
                return adapterType.cast(new OracleDialectRules());
            }
 * DBeaver - Universal Database Manager
    private static final Class<?>[] CLASSES = new Class[] { TPRuleProvider.class };
    public Class<?>[] getAdapterList() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
    }
        return null;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.core.runtime.IAdapterFactory;
        return CLASSES;
 * you may not use this file except in compliance with the License.
    @Override
 * Unless required by applicable law or agreed to in writing, software
        if (adaptableObject instanceof SQLDialect) {

        }
 * Licensed under the Apache License, Version 2.0 (the "License");
}
 * See the License for the specific language governing permissions and

 *
public class OracleDialectAdapterFactory implements IAdapterFactory {
 * You may obtain a copy of the License at
