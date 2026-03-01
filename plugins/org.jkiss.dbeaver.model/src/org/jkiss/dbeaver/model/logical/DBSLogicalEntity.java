
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
public class DBSLogicalEntity extends DBSLogicalObject<DBSEntity> {

 * distributed under the License is distributed on an "AS IS" BASIS,

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
    public List<String> getAssociationPatterns() {

    public List<String> getAttributePatterns() {
        this.attributePatterns = attributePatterns;
    public void setAssociationPatterns(List<String> associationPatterns) {
    }
 * DBeaver - Universal Database Manager
    private List<String> attributePatterns;
 * Logical entity
import java.util.List;
 * you may not use this file except in compliance with the License.
        return attributePatterns;
}
 */
/**
package org.jkiss.dbeaver.model.logical;
 * limitations under the License.

 *
    private List<String> associationPatterns;

 *     http://www.apache.org/licenses/LICENSE-2.0
    public void setAttributePatterns(List<String> attributePatterns) {
import org.jkiss.dbeaver.model.struct.DBSEntity;



 *
 */
        this.associationPatterns = associationPatterns;
 *
    }
        return associationPatterns;
    }
    }
