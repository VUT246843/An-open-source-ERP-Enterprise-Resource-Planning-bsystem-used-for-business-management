/*
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
}
package org.jkiss.dbeaver.model.logical;
public class DBSLogicalSchema extends DBSLogicalObject<DBSObjectContainer> {
 * you may not use this file except in compliance with the License.
    }
 *


        return entities;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import java.util.List;
 *
        this.entities = entities;
 * DBeaver - Universal Database Manager
 *

    private List<DBSLogicalEntity> entities;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
    }
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
/**
 * See the License for the specific language governing permissions and
 */


 */
 * Logical schema


 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
    public List<DBSLogicalEntity> getEntities() {
    public void setEntities(List<DBSLogicalEntity> entities) {
