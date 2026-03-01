import org.jkiss.dbeaver.model.secret.DBSSecretValue;
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.secret.DBSSecretObject;
import org.jkiss.utils.CommonUtils;
import org.jkiss.code.Nullable;
    private final DBPPreferenceStore preferences = ModelPreferences.getPreferences();
    }


 * Licensed under the Apache License, Version 2.0 (the "License");
    public void setPrivateSecretValue(@NotNull String secretId, @Nullable String secretValue) throws DBException {
    public String getPrivateSecretValue(@NotNull String secretId) {
    }
 *
 */
        try {
import org.jkiss.dbeaver.model.secret.DBSSecretController;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;

 * DBeaver - Universal Database Manager
        }
import java.util.List;
    public void flushChanges() throws DBException {
            throw new DBException("Error flushing secure preferences", e);
        }
import org.jkiss.dbeaver.model.exec.DBCFeatureNotSupportedException;
 * Default local secret controller.

            preferences.setToDefault(key);
    @NotNull
    }
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            preferences.save();
public class LocalSecretController implements DBSSecretController {
        }
 *
 */
/**

    private static String makeKey(@NotNull String secretId) {
 * See the License for the specific language governing permissions and
 *
 * You may obtain a copy of the License at
    @Override
        if (CommonUtils.isEmpty(value)) {
            preferences.setValue(key, secretValue);
 * Uses Eclipse preferences to read/write secrets. Doesn't encrypt values.

import org.jkiss.dbeaver.ModelPreferences;
}    }
            return null;

    @Override
    }
        String key = makeKey(secretId);
        String value = preferences.getString(makeKey(secretId));
    @Nullable
        return "secrets/" + secretId;
 * limitations under the License.
    public static final LocalSecretController INSTANCE = new LocalSecretController();
        throw new DBCFeatureNotSupportedException("Secrets discovery not supported");
package org.jkiss.dbeaver.model.impl.app;
        if (secretValue != null) {
    public List<DBSSecretValue> discoverCurrentUserSecrets(@NotNull DBSSecretObject secretObject) throws DBException {
    @Override
    @Override
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
        } catch (IOException e) {
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.io.IOException;
        } else {

import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software

        return value;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * <p>
