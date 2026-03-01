 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0

    @Override
 * limitations under the License.
 *
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;

    public DamengDataType(GenericStructContainer owner, int valueType, String name, String remarks, boolean unsigned, boolean searchable, int precision, int minScale, int maxScale) {
    public DBPDataKind getDataKind() {
 */
import org.jkiss.dbeaver.model.DBPDataKind;
}
 * You may obtain a copy of the License at
public class DamengDataType extends GenericDataType {
        super(owner, valueType, name, remarks, unsigned, searchable, precision, minScale, maxScale);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
/**
 * @author Shengkai Bai
 */
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @NotNull
        return DamengDataSource.getDataKind(getName(), getTypeID());
import org.jkiss.code.NotNull;
 *

 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
/*
 *
import org.jkiss.dbeaver.ext.generic.model.GenericDataType;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }

package org.jkiss.dbeaver.ext.dameng.model;
