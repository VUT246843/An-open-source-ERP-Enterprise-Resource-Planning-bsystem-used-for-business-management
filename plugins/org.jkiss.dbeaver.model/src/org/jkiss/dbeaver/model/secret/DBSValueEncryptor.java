package org.jkiss.dbeaver.model.secret;
/**
    @NotNull
 * limitations under the License.
 *
 * You may obtain a copy of the License at
 */
        return Base64.getEncoder().encodeToString(encryptValue(value.getBytes(StandardCharsets.UTF_8)));
 * you may not use this file except in compliance with the License.

 */
import org.jkiss.code.NotNull;
    @NotNull
    @NotNull
 * Unless required by applicable law or agreed to in writing, software

 * distributed under the License is distributed on an "AS IS" BASIS,

    @NotNull
    default String encryptString(@NotNull String value) throws DBException {

import org.jkiss.dbeaver.DBException;

 * See the License for the specific language governing permissions and
    byte[] encryptValue(@NotNull byte[] value) throws DBException;
    default String decryptString(@NotNull String value) throws DBException {
/*
import java.nio.charset.StandardCharsets;
        return new String(decryptValue(Base64.getDecoder().decode(value)), StandardCharsets.UTF_8);

 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
    }
    }

 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.Base64;
    byte[] decryptValue(@NotNull byte[] value) throws DBException;
public interface DBSValueEncryptor {
}

 * Value encryptor
