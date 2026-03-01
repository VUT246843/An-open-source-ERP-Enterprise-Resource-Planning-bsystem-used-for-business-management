
 *
    private final DBPImage icon;
import org.eclipse.core.runtime.IConfigurationElement;
 * you may not use this file except in compliance with the License.
    
        try {
    public boolean needsPort() {
        supportsCustomConnectionURL = CommonUtils.getBoolean(config.getAttribute("customURL"), false);
        return supportsCustomConnectionURL;
    }
import org.jkiss.utils.CommonUtils;
        id = config.getAttribute("id");
        return supportsClient;
    private final boolean supportsCustomConnectionURL;
 * limitations under the License.

package org.jkiss.dbeaver.ext.postgresql.model.impls;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public DBPImage getIcon() {
    public boolean turnOffPreparedStatements() {
    }
 * You may obtain a copy of the License at
    }

    public boolean supportsClient() {
 * DBeaver - Universal Database Manager
        needsPort = CommonUtils.getBoolean(config.getAttribute("needsPort"), true);

    public boolean isCloudServer() {

import org.jkiss.dbeaver.ext.postgresql.model.PostgreServerExtension;
            return (PostgreServerExtension) type.getImplClass().getConstructor(PostgreDataSource.class).newInstance(dataSource);
        icon = iconToImage(config.getAttribute("logo"));
        return icon;
        turnOffPreparedStatements = CommonUtils.getBoolean(config.getAttribute("turnOffPreparedStatements"), false);
	    return cloudServer;
        super(config);
}

        }
    public boolean supportsCustomConnectionURL() {
    private final boolean needsPort;
        cloudServer = CommonUtils.getBoolean(config.getAttribute("cloudServer"), false);
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
    private final boolean supportsClient;
        return turnOffPreparedStatements;

        return id;
    }

 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    PostgreServerType(IConfigurationElement config) {

public class PostgreServerType extends AbstractDescriptor {
    @NotNull
    private final boolean cloudServer;
    }
    private final String name;
        type = new ObjectType(config.getAttribute("class"));
import org.jkiss.dbeaver.DBException;

import org.jkiss.code.NotNull;
    }

    private final String id;
	return needsPort;
    }

import org.jkiss.dbeaver.model.DBPImage;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
    private final ObjectType type;
        name = config.getAttribute("name");
    private final boolean turnOffPreparedStatements;
/*
    public String getName() {
    }
    public PostgreServerExtension createServerExtension(@NotNull PostgreDataSource dataSource) throws DBException {
    public String getId() {
 * Unless required by applicable law or agreed to in writing, software
            throw new DBException("Error instantiating PG server type", e);
 *
    }
    }
        } catch (Throwable e) {
        supportsClient = CommonUtils.getBoolean(config.getAttribute("supportsClient"), true);
 */
        return name;

import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
 *     http://www.apache.org/licenses/LICENSE-2.0

 * See the License for the specific language governing permissions and
