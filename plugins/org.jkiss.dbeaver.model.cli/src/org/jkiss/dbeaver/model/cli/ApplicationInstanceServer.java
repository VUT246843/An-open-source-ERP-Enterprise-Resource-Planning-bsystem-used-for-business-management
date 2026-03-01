        } catch (Exception e) {
        } else {
            props.store(os, "DBeaver instance server properties");
            Properties props = new Properties();
 * Unless required by applicable law or agreed to in writing, software

            return switch (name) {
        this.controllerClass = controllerClass;

    public static class InstanceConnectionParameters implements GeneralUtils.IParameterHandler {
        }
            server.stop();
        boolean makeConnect = true;
                default -> false;
package org.jkiss.dbeaver.model.cli;
                    yield true;
 */
import java.nio.ByteBuffer;
import org.jkiss.dbeaver.model.app.DBPWorkspace;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.cli.rest.BearerRequestHandler;
    @Override


    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2026 DBeaver Corp and others
import org.jkiss.utils.SecurityUtils;
 *
                    openConsole = CommonUtils.toBoolean(value);
    }
    private final FileChannel configFileChannel;
            )
        configFileChannel = FileChannel.open(

    }

            for (StackTraceElement ste : tde.getValue()) {

                    createNewConnection = CommonUtils.toBoolean(value);
            props.setProperty(InstanceServerProperties.PROPERTY_PORT, String.valueOf(serverProperties.port()));
        log.info("Making thread dump");
        public boolean isOpenConsole() {
        public boolean setParameter(String name, String value) {
 * DBeaver - Universal Database Manager
                case "connect" -> {
        }
}        String password = SecurityUtils.generatePassword();
        }
                    yield true;
import org.jkiss.code.NotNull;
    ) throws IOException {
    private final RestServer<T> server;
                }
                    makeConnect = CommonUtils.toBoolean(value);
import java.util.Map;
    protected static Path getConfigPath() {
/*
            };

        return payload;
            .create();
                    cls, object, gson, filter, landingPage, password
                }
            return GeneralUtils.getMetadataFolder().resolve(CONFIG_PROP_FILE);

    public String getVersion() {
import java.nio.file.Files;
        serverProperties = new InstanceServerProperties(

            getConfigPath(),
import java.nio.file.StandardOpenOption;
    }
            configFileChannel.write(ByteBuffer.wrap(os.toByteArray()));

import java.util.Properties;
 *
            .setFilter(address -> address.getAddress().isLoopbackAddress())

 * You may obtain a copy of the License at
 *
        @NotNull InstanceServerProperties serverProperties
                    yield true;
                td.append("\t").append(ste.toString()).append("\n");

            log.debug("Instance server has been stopped");
    @NotNull
    protected ApplicationInstanceServer(Class<T> controllerClass) throws IOException {
            props.setProperty(InstanceServerProperties.PROPERTY_PASSWORD, serverProperties.password());

            StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE


        }
import org.jkiss.dbeaver.utils.GeneralUtils;
                    -> new BearerRequestHandler<>(
            password
        server = RestServer

        log.debug("Starting instance server at http://localhost:" + serverProperties.port());
    public void stopInstanceServer() {
import java.io.IOException;
    public long ping(long payload) {
                )
/**

            return makeConnect;
    ApplicationInstanceController {
            td.append(tde.getKey().getId()).append(" ").append(tde.getKey().getName()).append(":\n");
            return workspacePath.resolve(DBPWorkspace.METADATA_FOLDER).resolve(CONFIG_PROP_FILE);
        boolean openConsole = false;
        try {
        for (Map.Entry<Thread, StackTraceElement[]> tde : Thread.getAllStackTraces().entrySet()) {
        @Override
        if (workspacePath != null) {
    private static final Log log = Log.getLog(ApplicationInstanceServer.class);
            if (configFileChannel != null) {
        );
        }
            log.debug("Stop instance server");
            log.error("Can't stop instance server", e);
 */

        public boolean isCreateNewConnection() {
        return td.toString();

            .builder(controllerClass, controllerClass.cast(this))
            return openConsole;
 * you may not use this file except in compliance with the License.

 *     http://www.apache.org/licenses/LICENSE-2.0
            return createNewConnection;
    public String getThreadDump() {
import org.jkiss.utils.CommonUtils;
import java.nio.channels.FileChannel;
    }
import org.jkiss.code.Nullable;
        serializeProperties(serverProperties);
public abstract class ApplicationInstanceServer<T extends ApplicationInstanceController> implements
                (cls, object, gson, filter, landingPage)
    @Override
                case "openConsole" -> {
    @NotNull
        StringBuilder td = new StringBuilder();
import java.io.ByteArrayOutputStream;
                configFileChannel.close();
import org.jkiss.dbeaver.Log;

import java.nio.file.Path;
                case "create" -> {
    private final Class<T> controllerClass;
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
        public boolean isMakeConnect() {

    }

        return GeneralUtils.getProductVersion().toString();
import org.jkiss.utils.rest.RestServer;
        boolean createNewConnection = true;
                Files.delete(getConfigPath());

    }
        }
            .setHandlerFactory(
            server.getAddress().getPort(),
    private void serializeProperties(

            }
        );
    }
    }
            .setLandingPage(GeneralUtils.getProductTitle())
        }
    @Override
        try (ByteArrayOutputStream os = new ByteArrayOutputStream()) {
 * See the License for the specific language governing permissions and
    private final InstanceServerProperties serverProperties;
 * limitations under the License.
 * DBeaver instance controller.
        }
    protected static Path getConfigPath(@Nullable Path workspacePath) {
                }
        return getConfigPath(null);

