    public <T> T getAdapter(Object adaptableObject, Class<T> adapterType) {
        }
            }
import org.jkiss.dbeaver.model.sql.SQLDialect;
 *
    public Class<?>[] getAdapterList() {
    
 * limitations under the License.
import org.eclipse.core.runtime.IAdapterFactory;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.text.parser.TPRuleProvider;

    private static final Class<?>[] CLASSES = new Class[] { TPRuleProvider.class };
/*

    @Override
 * See the License for the specific language governing permissions and
    }
        return CLASSES;
 * DBeaver - Universal Database Manager

 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
 * Unless required by applicable law or agreed to in writing, software
        if (adaptableObject instanceof SQLDialect) {
    }
        return null;
 * distributed under the License is distributed on an "AS IS" BASIS,
                return adapterType.cast(new ExasolDialectRules());
    @Override

 * you may not use this file except in compliance with the License.
}
public class ExasolDialectAdapterFactory implements IAdapterFactory {
 *

 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ext.exasol.editors;
            if (adapterType == TPRuleProvider.class) {

