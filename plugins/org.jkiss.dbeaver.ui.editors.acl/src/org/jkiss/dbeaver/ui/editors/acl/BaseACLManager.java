 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.access.DBAPrivilege;
import org.jkiss.dbeaver.model.struct.DBSObject;
 *
 */
        return DBUtils.getObjectFullName(object, DBPEvaluationContext.DDL);
}package org.jkiss.dbeaver.ui.editors.acl;
 * Licensed under the Apache License, Version 2.0 (the "License");
public abstract class BaseACLManager<PRIVILEGE extends DBAPrivilege, PRIVILEGE_TYPE extends DBAPrivilegeType> implements ObjectACLManager<PRIVILEGE, PRIVILEGE_TYPE> {
 */
 * Unless required by applicable law or agreed to in writing, software
    }
 * PostgresRolePrivilegesEditor
/**
 *     http://www.apache.org/licenses/LICENSE-2.0
 *

 *
    public String getObjectUniqueName(DBSObject object) {

/*
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.model.DBPEvaluationContext;
 * limitations under the License.
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.model.access.DBAPrivilegeType;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBUtils;
