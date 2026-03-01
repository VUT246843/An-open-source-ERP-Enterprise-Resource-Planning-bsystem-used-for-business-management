import org.jkiss.dbeaver.model.edit.prop.DBECommandComposite;
 * limitations under the License.


        return new CubridCommandHandler(object);
    }

    @Override
public enum CubridPrivilageHandler implements DBEPropertyHandler<CubridPrivilage>, DBEPropertyReflector<CubridPrivilage>
    }
    @Override
import org.jkiss.dbeaver.model.edit.prop.DBEPropertyHandler;
{
    public String getId() {
 * You may obtain a copy of the License at

 *
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
        // TODO Auto-generated method stub
    PASSWORD,
 * DBeaver - Universal Database Manager
            object.setName(newValue.toString());
 * Copyright (C) 2010-2024 DBeaver Corp and others
        // TODO Auto-generated method stub
 *
    public DBECommandComposite createCompositeCommand(CubridPrivilage object) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.model.edit.prop.DBEPropertyReflector;
        // TODO Auto-generated method stub
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ext.cubrid.ui.config;
    DESCRIPTION, GROUPS;
 * See the License for the specific language governing permissions and
    @Override
}    public void reflectValueChange(CubridPrivilage object, Object oldValue, Object newValue) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (this == NAME) {
    NAME,
import org.jkiss.dbeaver.ext.cubrid.model.CubridPrivilage;

        }

    }
 */
 *
 * you may not use this file except in compliance with the License.
        return name();
