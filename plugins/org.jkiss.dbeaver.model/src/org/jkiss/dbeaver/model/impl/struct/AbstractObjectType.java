    }
    public String getTypeName()
 *     http://www.apache.org/licenses/LICENSE-2.0
 *


 *
 * limitations under the License.
 * DBeaver - Universal Database Manager
    public AbstractObjectType(String typeName, String description, DBPImage image, Class<? extends DBSObject> objectClass)
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.struct.DBSObjectType;
    private final Class<? extends DBSObject> objectClass;
    @Override
        this.image = image;
 * Used by structure assistants
    private final DBPImage image;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private final String description;

    @Override
    }
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others

package org.jkiss.dbeaver.model.impl.struct;
 *
 * Unless required by applicable law or agreed to in writing, software

 * Abstract database object type.
    public DBPImage getImage()
    public String toString() {
}

    @Override
    private final String typeName;
    public String getDescription()
    {

 * you may not use this file except in compliance with the License.
        return description;
        this.objectClass = objectClass;
import org.jkiss.dbeaver.model.struct.DBSObject;

        this.typeName = typeName;
    {
        return objectClass;
        this.description = description;
/*


 * distributed under the License is distributed on an "AS IS" BASIS,
/**
    @Override
    public Class<? extends DBSObject> getTypeClass()
 * You may obtain a copy of the License at
    }
    {
        return "Type(" + typeName + ")";
    }
    {
        return typeName;
public class AbstractObjectType implements DBSObjectType {
import org.jkiss.dbeaver.model.DBPImage;
    {
 */
 * See the License for the specific language governing permissions and
    @Override
        return image;
    }
