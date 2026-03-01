    //private static final int CONNECT_TIMEOUT = 10000;
    public static final String PROP_LOCAL_HOST = "localHost";
    public static final String PROP_IMPLEMENTATION = "implementation";
    public static final String PROP_REMOTE_HOST = "remoteHost";

 * limitations under the License.
 */
 * Licensed under the Apache License, Version 2.0 (the "License");

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    public enum AuthType {
 * Constants for SSH tunnel
 * See the License for the specific language governing permissions and

        PASSWORD,
 * DBeaver - Universal Database Manager
    public static final String PROP_REMOTE_PORT = "remotePort";
    public static final String PROP_ALIVE_INTERVAL = "aliveInterval";
 *
 */
 * You may obtain a copy of the License at
    public static final int DEFAULT_CONNECT_TIMEOUT = 10000;
    public static final String DEFAULT_USER_NAME = System.getProperty(StandardConstants.ENV_USER_NAME);
/*
import org.jkiss.utils.StandardConstants;

    public static final String PROP_CONNECT_TIMEOUT = "sshConnectTimeout";

/**
}
    public static final int MAX_JUMP_SERVERS = 5;
 *
    public static final int DEFAULT_PORT = 22;
public class SSHConstants {
 *
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
        AGENT
    public static final String PROP_AUTH_TYPE = "authType";
    public static final String PROP_ALIVE_COUNT = "aliveCount";
    }
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.model.net.ssh;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public static final String PROP_KEY_VALUE = "keyValue";
    public static final String PROP_BYPASS_HOST_VERIFICATION = "bypassHostVerification";
        PUBLIC_KEY,
    public static final String PROP_SHARE_TUNNELS = "shareTunnels";
    public static final String PROP_LOCAL_PORT = "localPort";
    public static final String PROP_KEY_PATH = "keyPath";
