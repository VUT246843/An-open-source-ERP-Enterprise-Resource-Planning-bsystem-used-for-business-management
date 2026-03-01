}
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.


 * you may not use this file except in compliance with the License.
 */
import org.jkiss.dbeaver.DBException;
/**
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.model.secret;
public interface DBPSecretHolder {
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
    void persistSecrets(DBSSecretController secretController) throws DBException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software


 *
 * You may obtain a copy of the License at

 *
 * DBPSecretHolder
    void resolveSecrets(DBSSecretController secretController) throws DBException;
 *
