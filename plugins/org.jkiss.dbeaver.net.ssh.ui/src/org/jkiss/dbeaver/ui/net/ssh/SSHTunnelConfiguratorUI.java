            case CREDENTIALS_ONLY -> new SSHTunnelCredsOnlyConfiguratorUI();
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
 *

package org.jkiss.dbeaver.ui.net.ssh;


/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * SSH tunnel configuration
 *
 * limitations under the License.
public class SSHTunnelConfiguratorUI extends ObjectPropertyConfiguratorWrapper<Object, DBWHandlerConfiguration> {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
        };
    @Override
}
import org.jkiss.dbeaver.ui.IObjectPropertyConfigurator;
 * DBeaver - Universal Database Manager
 */
 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.ui.ObjectPropertyConfiguratorWrapper;
/**
 *
 * You may obtain a copy of the License at
        return switch (this.getEditIntention()) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    protected IObjectPropertyConfigurator<Object, DBWHandlerConfiguration> createConfigurator() {
 * Unless required by applicable law or agreed to in writing, software
            case DEFAULT -> new SSHTunnelDefaultConfiguratorUI();
    }
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
