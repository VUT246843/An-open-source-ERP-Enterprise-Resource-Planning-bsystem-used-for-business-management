    void deleteCertificate(
 * You may obtain a copy of the License at

        @NotNull String keyStorePath,
    Path getStorageFolder();
package org.jkiss.dbeaver.model.app;
import java.security.KeyStore;
        @NotNull String certType,
        @NotNull String certDN) throws DBException;

        @NotNull char[] keyStorePassword) throws DBException;

        @Nullable byte[] clientCertStream,
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
        @NotNull DBPDataSourceContainer dataSource,
    @NotNull
 * Copyright (C) 2010-2025 DBeaver Corp and others
        @NotNull char[] keyStorePassword) throws DBException;

 * See the License for the specific language governing permissions and
    @NotNull
    String getKeyStoreType(@NotNull DBPDataSourceContainer dataSource);
        @NotNull DBPDataSourceContainer dataSource,
        @NotNull String certType,
import org.jkiss.code.Nullable;
 *
{
import java.nio.file.Path;
/**
/*
import org.jkiss.dbeaver.DBException;
    char[] getKeyStorePassword(@NotNull DBPDataSourceContainer dataSource, @NotNull String certType);
    @NotNull


        @NotNull String certType,
    @NotNull
        @Nullable byte[] keyStream) throws DBException;
        @NotNull DBPDataSourceContainer dataSource,
    void addCertificate(

 */

 * limitations under the License.
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 */
        @NotNull DBPDataSourceContainer dataSource,
public interface DBACertificateStorage
import org.jkiss.code.NotNull;
 *
}
    void addCertificate(
        @NotNull byte[] keyStoreData,
 * Certificate storage
    Path getKeyStorePath(@NotNull DBPDataSourceContainer dataSource, @NotNull String certType);
    @NotNull

        @NotNull String certType,
        @NotNull DBPDataSourceContainer dataSource,
 *     http://www.apache.org/licenses/LICENSE-2.0
    void addCertificate(
        @NotNull String certType) throws DBException;
 * DBeaver - Universal Database Manager


        @Nullable byte[] caCertStream,
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    void addSelfSignedCertificate(
 * Licensed under the Apache License, Version 2.0 (the "License");

    KeyStore getKeyStore(@NotNull DBPDataSourceContainer container, @NotNull String certType) throws DBException;
 * Unless required by applicable law or agreed to in writing, software
