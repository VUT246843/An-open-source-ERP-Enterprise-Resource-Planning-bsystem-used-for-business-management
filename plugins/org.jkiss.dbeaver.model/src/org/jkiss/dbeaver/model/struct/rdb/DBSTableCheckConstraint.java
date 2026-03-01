/*
 *

}
import org.jkiss.dbeaver.model.struct.DBSEntityReferrer;
 * limitations under the License.


 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
    String getCheckConstraintDefinition();
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.model.struct.rdb;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public interface DBSTableCheckConstraint extends DBSEntityReferrer {
 * This interface is to designate separate from Unique and Primary check constraints

 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBSTableCheckConstraint
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and


 * You may obtain a copy of the License at
/**
 *
 */
    void setCheckConstraintDefinition(String expression);
 * you may not use this file except in compliance with the License.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
