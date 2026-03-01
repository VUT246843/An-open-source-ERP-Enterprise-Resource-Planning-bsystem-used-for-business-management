/*

 * ERD object container (diagram)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
}
 * you may not use this file except in compliance with the License.
import java.util.List;
 * Unless required by applicable law or agreed to in writing, software
 */
    Map<DBSEntity, ERDEntity> getEntityMap();

package org.jkiss.dbeaver.model.erd;
public interface ERDContainer {
    List<ERDEntity> getEntities();
 * DBeaver - Universal Database Manager

 *
import org.jkiss.dbeaver.model.struct.DBSEntity;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *

import java.util.Map;
 * See the License for the specific language governing permissions and
/**
 * You may obtain a copy of the License at
 */
    ERDContentProvider getContentProvider();
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");



 *
