
 * you may not use this file except in compliance with the License.
 */
 *
 * @see DBSSecretController#getGlobalSecretController()
 * mechanism and its usage is discouraged. It is kept for backward compatibility only.
 */
 *
public interface PasswordEncrypter {
    String decrypt(String password) throws EncryptionException;
 *
/**
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.secret.DBSSecretController;
 * @deprecated this interface does not provide a strong encryption
import org.jkiss.dbeaver.model.app.DBPProject;
/*
 * @see DBPProject#getValueEncryptor()
 * limitations under the License.

 * Copyright (C) 2010-2024 DBeaver Corp and others
 * @see DBSSecretController#getProjectSecretController(DBPProject)
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * Password encoder
 * Unless required by applicable law or agreed to in writing, software

 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.runtime.encode;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
}


