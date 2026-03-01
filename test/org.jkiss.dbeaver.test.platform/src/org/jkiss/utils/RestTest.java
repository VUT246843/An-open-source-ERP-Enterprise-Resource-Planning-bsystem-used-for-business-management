        @NotNull
        Object getSetting(@RequestParameter("key") @NotNull String key);

import org.jkiss.utils.rest.RestServer;
            return getSettings().getOrDefault(key, def);
        @NotNull
    }
        @Nullable
    private interface Controller {
    }
        Assert.assertEquals("cool", client.getSetting("something", "cool"));
        Map<String, Object> getSettings();
        @RequestMapping("setting")
        @Override
            .create();
        @NotNull
        @Override
        Assert.assertEquals("dbeaver", client.getSetting("name"));
import org.junit.Test;
        @RequestMapping("version")
import org.jkiss.utils.rest.RequestMapping;


        @Nullable
        @Nullable
        }
        public Object getSetting(@NotNull String key, @Nullable Object def) {

/*
    @Test
        public String getVersion() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
            return getSettings().get(key);
        @Override




        @RequestMapping("settings")

        @NotNull
public class RestTest extends DBeaverUnitTest {
 * you may not use this file except in compliance with the License.


import org.jkiss.code.NotNull;
        }
import java.util.Map;
 * You may obtain a copy of the License at
            .builder(URI.create("http://localhost:" + server.getAddress().getPort()), Controller.class)
 *
        Assert.assertEquals(Map.of("version", "1.0", "name", "dbeaver"), client.getSettings());
 * See the License for the specific language governing permissions and
            .builder(Controller.class, new ControllerImpl())
        public Map<String, Object> getSettings() {
            .create();

}
        @RequestMapping("setting/default")
    }
        }

import org.jkiss.utils.rest.RestClient;
 *
import org.jkiss.utils.rest.RequestParameter;
import java.net.URI;
    public void restClientServerTest() {
 *

import org.jkiss.junit.DBeaverUnitTest;
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.utils;
        server.stop();
        Assert.assertEquals("1.0", client.getVersion());
        public Object getSetting(@NotNull String key) {
        String getVersion();
            return "1.0";
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
        @Override
import org.jkiss.code.Nullable;
        final RestServer<Controller> server = RestServer
        Object getSetting(@RequestParameter("key") @NotNull String key, @RequestParameter("default") @Nullable Object def);
            .setFilter(address -> address.getAddress().isLoopbackAddress())
        }
        Assert.assertEquals("1.0", client.getSetting("version"));
import org.junit.Assert;
            return Map.of("version", "1.0", "name", "dbeaver");
    private static class ControllerImpl implements Controller {
        Assert.assertNull(client.getSetting("something"));
        final Controller client = RestClient
        @Nullable
