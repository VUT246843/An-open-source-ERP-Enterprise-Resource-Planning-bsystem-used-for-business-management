        return isDistributed;
        this.order = CommonUtils.toInt(config.getAttribute(RegistryConstants.ATTR_ORDER), 1);
    }
import org.jkiss.dbeaver.model.net.DBWHandlerType;
        return label;
    private final boolean secured;
    private final boolean isDistributed; // see getter
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;

    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
    }
import org.jkiss.code.NotNull;
    private final String label;
    private static final Log log = Log.getLog(NetworkHandlerDescriptor.class);

    public DBPPropertyDescriptor[] getHandlerProperties() {
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.networkHandler"; //$NON-NLS-1$
 * You may obtain a copy of the License at
    public String toString() {
    }
    @Override
    private final String description;
}
        return properties;
    private final boolean isDesktop;
import java.util.List;
import org.jkiss.dbeaver.Log;
public class NetworkHandlerDescriptor extends AbstractContextDescriptor implements DBWHandlerDescriptor {
 * DBeaver - Universal Database Manager
            return appliesTo(driver.getDataSourceProvider(), driver);
import org.jkiss.dbeaver.DBException;

        return replacedBy;
    }
        return getHandlerType().getImplName();
        this.isDesktop = CommonUtils.getBoolean(config.getAttribute("desktop"), true);
import org.jkiss.utils.CommonUtils;

    NetworkHandlerDescriptor getReplacedBy() {
    @Override
    public boolean replaces(NetworkHandlerDescriptor otherDesc) {
        this.id = config.getAttribute(RegistryConstants.ATTR_ID);
    }
        throws DBException {

        } catch (Exception e) {
        this.prefix = config.getAttribute("prefix") == null ? this.id : config.getAttribute("prefix");
 */
        this.type = DBWHandlerType.valueOf(config.getAttribute(RegistryConstants.ATTR_TYPE).toUpperCase(Locale.ENGLISH));
    public int getOrder() {
        this.isDistributed = CommonUtils.getBoolean(config.getAttribute("distributed"), false);
    }
 *
    }
            return false;
    public ObjectType getHandlerType() {
    }
    private final String prefix;
    public <T extends DBWNetworkHandler> T createHandler(Class<T> impl)
        return id;
import org.eclipse.core.runtime.IConfigurationElement;

        this.codeName = config.getAttribute("codeName") == null ? this.id : config.getAttribute("codeName");
    @NotNull
    @NotNull
    }

        this.replacedBy = replacedBy;
import org.jkiss.dbeaver.registry.RegistryConstants;
    private final ObjectType handlerType;
            log.debug(e);
    public boolean matches(DBPDriver driver) {
    private final DBPPropertyDescriptor[] properties;

        return prefix;
import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;

 * limitations under the License.
    void setReplacedBy(NetworkHandlerDescriptor replacedBy) {
    }
 * Copyright (C) 2010-2026 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
            .collect(Collectors.toList());

        IConfigurationElement config) {
import org.jkiss.dbeaver.model.net.DBWHandlerDescriptor;
 * NetworkHandlerDescriptor
        super(config);
        return type;
    }

            .map(PropertyDescriptor::extractProperties)

    @Override
    private final List<String> replacesIDs;
    private final DBWHandlerType type;
import org.jkiss.dbeaver.model.impl.PropertyDescriptor;
import java.util.stream.Collectors;
    public boolean isDesktopHandler() {
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    public String getId() {
    }

            .toArray(DBPPropertyDescriptor[]::new);
        this.handlerType = new ObjectType(config.getAttribute(RegistryConstants.ATTR_HANDLER_CLASS));

        return replacesIDs.contains(otherDesc.id);
    @Override
    // Handler works in desktop application only
/*
        this.replacesIDs = Arrays.stream(config.getChildren("replace"))

    }
    public boolean isDistributed() {
        return order;

    private NetworkHandlerDescriptor replacedBy;

    public boolean isSecured() {
        this.label = config.getAttribute(RegistryConstants.ATTR_LABEL);

import java.util.Locale;
            .flatMap(List<DBPPropertyDescriptor>::stream)
    public String getPrefix() {
        return id;
 * See the License for the specific language governing permissions and
    }
    @Override
        return description;
    @NotNull
/**
            .map(re -> re.getAttribute("id"))




    }
    @NotNull
    @Override
    private final String codeName;
    private final String id;
 *
import java.util.Arrays;
        this.properties = Arrays.stream(config.getChildren(PropertyDescriptor.TAG_PROPERTY_GROUP))
    @Override
 * you may not use this file except in compliance with the License.
        return handlerType.createInstance(impl);
    }
    public String getImplClassName() {
        return secured;
import org.jkiss.dbeaver.model.connection.DBPDriver;
 * Unless required by applicable law or agreed to in writing, software
    public String getCodeName() {
    private final int order;
        return isDesktop;
    NetworkHandlerDescriptor(
 */
    public String getLabel() {
    @NotNull
    }
    public String getDescription() {


    public DBWHandlerType getType() {
 *
        return codeName;
    }
    @Override

import org.jkiss.dbeaver.model.net.DBWNetworkHandler;
        this.secured = CommonUtils.getBoolean(config.getAttribute(RegistryConstants.ATTR_SECURED), false);
    @Override
package org.jkiss.dbeaver.registry.network;
        this.description = config.getAttribute(RegistryConstants.ATTR_DESCRIPTION);
        return handlerType;
        try {


    @Override
