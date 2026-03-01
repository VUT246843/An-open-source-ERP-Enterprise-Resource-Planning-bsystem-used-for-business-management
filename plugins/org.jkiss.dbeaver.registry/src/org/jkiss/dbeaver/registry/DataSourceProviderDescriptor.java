                while (driver.getReplacedBy() != null) {
import org.eclipse.core.runtime.IConfigurationElement;
                        perform = DBXTreeNodeHandler.Perform.valueOf(performName);
                // Load provider properties
            .findFirst()
        return null;

    }
    public DriverDescriptor createDriver(String id) {


import java.util.HashMap;
        return id;
}
    }
                String expr = iconElement.getAttribute(RegistryConstants.ATTR_IF);
    public static final DataSourceProviderDescriptor NULL_PROVIDER = new DataSourceProviderDescriptor(null, "NULL");
        return driverProperties;
                        config.getAttribute(RegistryConstants.ATTR_DESCRIPTION),
            null,
                    break;
                // Use parent's tree
    public DBPDataSourceProvider getInstance(DriverDescriptor driver) {
    }

                for (IConfigurationElement clientElement : nativeClientsElement.getChildren("client")) {
    }
        // Load supplied drivers
    private boolean inheritAuthModels = true;
 * Licensed under the Apache License, Version 2.0 (the "License");
            // Load tree injections
import org.jkiss.dbeaver.model.navigator.meta.*;
    @Override

                if (child instanceof DBXTreeFolder treeFolder) {
                    }
        if (!CommonUtils.isEmpty(refId)) {
    public String toString() {

                        parentNode = siblingItem.getParent();
    private static final String ATTRIBUTE_CHANGE_FOLDER_TYPE = "changeFolderType"; //$NON-NLS-1$
import org.jkiss.dbeaver.model.sql.SQLDialectMetadata;
                }
        }
                        node.addIcon(new DBXTreeIcon(expr, iconImage));

    public DBXTreeDescriptor getTreeDescriptor() {
            String driversSpec = propInfo.driverIds();
 * Unless required by applicable law or agreed to in writing, software
                    }
            this.drivers.stream()
                        recursive);
    }
    @NotNull
            // Inject nodes into tree item
                    folder.setInjectedConfig(config);
        }
                        config.getAttribute(RegistryConstants.ATTR_PATH),
                    }
                // locate class
            .map(this::removeDriver)
            if (afterPath != null) {

                case RegistryConstants.TAG_ITEMS: {
            if (baseItem == null) {
            if (parentProvider != null) {

        }
    }

            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (!ArrayUtils.isEmpty(trees)) {
import org.jkiss.dbeaver.model.DBIcon;
                }
                        }
                }
            if (treeDescriptor == null && parentProvider != null) {

            for (IConfigurationElement nativeClientsElement : config.getChildren("nativeClients")) {
    @Override


                    child = new DBXTreeFolder(
 *
package org.jkiss.dbeaver.registry;
    public boolean removeDriver(@NotNull String driverId) {
                            appDrivers = drivers.stream()
/*
                    if (firstItem == null && CommonUtils.isEmpty(treeFolder.getId())) {
    }
        String defaultIcon = config.getAttribute(RegistryConstants.ATTR_ICON);
                } catch (Exception e) {
                    }
                log.warn("Bad node reference: " + refId);
        final String refId = config.getAttribute(RegistryConstants.ATTR_REF);
    // Drivers
                        .filter(folderChild -> folderChild instanceof DBXTreeItem)
                .forEach(d -> d.addProviderPropertyDescriptors(propInfo.providerProperties()));
            .filter(d -> d.getId().equals(driverId))
        }

    private void loadTreeIcon(DBXTreeNode node, IConfigurationElement config) {
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.impl.PropertyDescriptor;
    private void injectTreeNodes(IConfigurationElement config) {
                    this.injectTreeNodes(treeInject);
            null,
                {
                    node.addActionHandler(action, perform, command);
    public boolean removeDriver(DriverDescriptor driver) {
        // Load native clients
    private static final String ATTRIBUTE_REMOVE = "remove"; //$NON-NLS-1$
    }
        DBXTreeDescriptor treeRoot = new DBXTreeDescriptor(
    private final String id;
    }
import org.jkiss.dbeaver.registry.driver.MissingDataSourceProvider;
    public List<DriverDescriptor> getEnabledDrivers() {

                    } catch (Exception e) {
        return createDriver(SecurityUtils.generateGUID(false));
import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
        }
                    } else if (!CommonUtils.isEmpty(command)) {
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
        return getPluginId() + '/' + id;
                case RegistryConstants.TAG_OBJECT: {
        return id;
            for (IConfigurationElement iconElement : handlerElements) {
    @NotNull
        } else {
        if (path.length <= 0) {
        loadTreeChildren(config, treeRoot, null);
                false); // Will be "true" if we can use native clients list from the parent
        return drivers;

        super("org.jkiss.dbeaver.registry");
            log.debug("No SQL dialect specified for data source provider '" + this.id + "'. Use default.");
import org.jkiss.code.Nullable;
            true, false, false, false,
            }
            baseItem.clearChildren();
                        this.providerProperties.addAll(parentProvider.providerProperties);
        this.treeDescriptor = new DBXTreeDescriptor(this, null, null, id, id, false, true, false, false, true, null, null);
        this.temporary = true;
    private DBXTreeDescriptor treeDescriptor;
    public List<NativeClientDescriptor> getNativeClients() {
                return driver;
                } else {
 */
        this.inheritAuthModels = CommonUtils.getBoolean(config.getAttribute("inheritAuthModels"), true);
        if (!ArrayUtils.isEmpty(iconElements)) {
        return null;
        }

                        CommonUtils.getBoolean(config.getAttribute(RegistryConstants.ATTR_OPTIONAL)),
    void linkParentProvider(IConfigurationElement config) {
                    defaultIcon = icon;
                    if (iconImage != null) {
        this.scriptDialect = DBWorkbench.getPlatform().getSQLDialectRegistry().getDialect(BasicSQLDialect.ID);
    }
            inheritClients = CommonUtils.getBoolean(config.getAttribute("inheritClients"),
                    break;
            if (defaultImage != null) {
        if (!CommonUtils.isEmpty(parentId)) {
                        this.providerProperties.add(new ProviderPropertiesInto(driversSpec, providerProperties));
                }
                        CommonUtils.getBoolean(config.getAttribute(RegistryConstants.ATTR_OPTIONAL)));
                return prop;
        this.implType = new ObjectType(MissingDataSourceProvider.class.getName());
                        config,
        this.drivers.add(driver);
import org.jkiss.utils.CommonUtils;
                        parent,
    }

        {
    }
import org.jkiss.dbeaver.model.DBPImage;
        String injectPath = config.getAttribute(RegistryConstants.ATTR_PATH);
            } else {
            log.debug("Script dialect '" + dialectId + "' not found in registry (for data source provider " + id + "). Use default.");
                afterItem = baseItem.findChildItemByPath(afterPath);
                throw new IllegalStateException("Can't initialize data source provider '" + implType.getImplName() + "'",
        return instance;
    private boolean driversManageable;
            if (!driver.isDisabled() && driver.getReplacedBy() == null && driver.isSupportedByLocalSystem()) {
            driver.setModified(true);

        if (this.icon == null) {
    private boolean inheritClients;
    }
                        String driversSpec = propsElement.getAttribute("drivers");
                log.error("Can't update folder type to " + changeFolderType);

import java.util.stream.Collectors;
    }
    private final Map<String, DBXTreeNode> treeNodeMap = new HashMap<>();
        this.icon = iconToImage(config.getAttribute(RegistryConstants.ATTR_ICON));
        return eDrivers;
        this.description = config.getAttribute(RegistryConstants.ATTR_DESCRIPTION);
        }
    //////////////////////////////////////
    void loadExtraConfig(IConfigurationElement config) {
                    try {

                case RegistryConstants.TAG_TREE_CONTRIBUTION: {
        }
    private DataSourceProviderRegistry registry;
                default:
        if (changeFolderType != null) {
import org.jkiss.dbeaver.model.sql.SQLDialectMetadataRegistry;
            for (IConfigurationElement driversElement : config.getChildren(RegistryConstants.TAG_DRIVERS)) {
        drivers.clear();
                if (sibling != null) {
            }
        if (defaultIcon != null) {
        if (id.equals(this.id)) return true;
        return false;
            List<NativeClientDescriptor> clients = new ArrayList<>(nativeClients);
        if (CommonUtils.getBoolean(config.getAttribute(ATTRIBUTE_REMOVE))) {
                }
 * limitations under the License.
        }
            } catch (Throwable ex) {
        }

import org.eclipse.core.runtime.IContributor;
                String sibling = config.getAttribute("sibling");
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.dataSourceProvider"; //$NON-NLS-1$
                    } else {
    private boolean inheritProviderProperties;
                        .findFirst()
    @Override
            }
                        log.error("Error loading driver", e);
    private final String description;
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
            if (folderNode instanceof DBXTreeFolder folder) {
    private final List<DBPPropertyDescriptor> driverProperties = new ArrayList<>();
    public void setDriverProviderProperties() {
        this.id = id;
            false,
        }
 * See the License for the specific language governing permissions and
    }

            null);
            } else {
        List<DriverDescriptor> eDrivers = new ArrayList<>();
            category = null;
                (CommonUtils.isEmpty(driversSpec) || driversSpec.equals("*"))
    }

            for (IConfigurationElement treeInject : injections) {
                        parent,
            if (folderNode != null) {
        }

     * @return driver or {@code null} if no driver was found
        this.scriptDialect = dialectRegistry.getDialect(dialectId);
    void patchConfigurationFrom(IConfigurationElement config) {
                        .stream()
                        this,


        } else {

        }
    @NotNull
                driverProperties.addAll(parentProvider.driverProperties);
            }
    public List<DBPDataSourceProviderDescriptor> getChildrenProviders() {
    public DriverDescriptor createDriver(DriverDescriptor copyFrom) {
        // Load tree injections
        String[] path = injectPath.split("/");
    @Override
                    driver = driver.getReplacedBy();
    @NotNull
        childrenProviders.add(descriptor);
            return;
            DBPImage defaultImage = iconToImage(defaultIcon);
    @Override
                {
            if (child != null) {
 * You may obtain a copy of the License at
    public DataSourceProviderRegistry getRegistry() {
import org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect;
                            mainProperties.addAll(ProviderPropertyDescriptor.extractProviderProperties(prop));
            IConfigurationElement[] injections = config.getChildren(RegistryConstants.TAG_TREE_INJECTION);
                }
    private static final String ATTRIBUTE_REPLACE_CHILDREN = "replaceChildren"; //$NON-NLS-1$
                    var firstItem = treeFolder.getChildren(null)
                        this,
            DBXTreeNode afterItem = null;
        this.name = id;


 * DBeaver - Universal Database Manager
    public DBPImage getIcon() {
                        parent,
                eDrivers.add(driver);

    public boolean isDriversManageable() {
    }
        return null;
     * @param id identifier of the driver to retrieve
    @Nullable
import org.jkiss.utils.ArrayUtils;
            this.scriptDialect = dialectRegistry.getDialect(BasicSQLDialect.ID);
                    folder.setDescription(changeFolderLabel);
    private void loadTreeNode(DBXTreeNode parent, IConfigurationElement config, DBXTreeNode afterItem) {
            parent.moveChildAfter(child, afterItem);
    private void initProviderBundle(DriverDescriptor driver) {
            }
            }
    private SQLDialectMetadata scriptDialect;
        return supportsDriverMigration;
            return;
            }
        if (!ArrayUtils.isEmpty(handlerElements)) {
            }
                // Load main properties
        for (DBPDataSourceProviderDescriptor dspd = providerDescriptor; dspd != null; dspd = dspd.getParentProvider()) {
    void replaceImplClass(IContributor contributor, String providerClass) {
                        config.getAttribute(RegistryConstants.ATTR_EDITOR));

                    if (siblingItem == null) {
                    if (inheritProviderProperties && parentProvider != null) {
            try {
                return true;

    public void addDriver(DriverDescriptor driver) {

            }

    private DBXTreeDescriptor loadTreeInfo(@NotNull IConfigurationElement config) {
                    for (IConfigurationElement propsElement : driversElement.getChildren(RegistryConstants.TAG_MAIN_PROPERTIES)) {
        return new DriverDescriptor(this, id);
                    folder.setLabel(changeFolderLabel);
        });
                this.injectTreeNodes(treeInject);
            config,
            clients.addAll(parentProvider.getNativeClients());
        return scriptDialect;
            for (IConfigurationElement propsElement : config.getChildren(RegistryConstants.TAG_DRIVER_PROPERTIES)) {
                            String[] driverIds = driversSpec.split(",");
            }
    }
                    inheritProviderProperties = CommonUtils.getBoolean(config.getAttribute("inheritProviderProperties"), false);
        this.replaceContributor(contributor);

        this.temporary = false;
        this.name = config.getAttribute(RegistryConstants.ATTR_LABEL);

            return;
        if (category != null && category.isEmpty()) {
            : treeDescriptor;
                this.treeDescriptor = new DBXTreeDescriptor(this, parentProvider.getTreeDescriptor());
                String changeFolderLabel = config.getAttribute(ATTRIBUTE_CHANGE_FOLDER_LABEL);
                        config.getAttribute(RegistryConstants.ATTR_TYPE),
        return null;
    public boolean matchesId(String id) {
            // Load tree structure
    }

    public List<DBPPropertyDescriptor> getDriverProperties() {
    /**
            DBXTreeNode folderNode = baseItem.getParent();
            this,
            for (IConfigurationElement child : children) {
    public DriverDescriptor createDriver() {
    public String getId() {
            String nodeType = config.getName();
        String parentId = config.getAttribute(RegistryConstants.ATTR_PARENT);
            config.getAttribute(RegistryConstants.ATTR_VISIBLE_IF),
        for (DBPPropertyDescriptor prop : driverProperties) {
            }
            }
    }

        this.description = "Missing datasource provider " + id;
    @Override
    private final List<ProviderPropertiesInto> providerProperties = new ArrayList<>();
public class DataSourceProviderDescriptor extends AbstractDescriptor implements DBPDataSourceProviderDescriptor {
                }
        }
            dialectId = BasicSQLDialect.ID;
                loadTreeHandlers(child, config);
                    String recursive = config.getAttribute(RegistryConstants.ATTR_RECURSIVE);
            if (prop.getId().equals(name)) {
    private void addChildrenProvider(@NotNull DataSourceProviderDescriptor descriptor) {
        }
        this.implType = new ObjectType(providerClass);

                    }
    }
        String dialectId = config.getAttribute(RegistryConstants.ATTR_DIALECT);
        }
            this.treeDescriptor = this.loadTreeInfo(trees[0]);
    // Native clients
                        config.getAttribute(RegistryConstants.ATTR_VISIBLE_IF),
            switch (nodeType) {
        }
        providerProperties.forEach(propInfo -> {
        return registry;
 *
    public void dispose() {
                this.driversManageable = driversElement.getAttribute(RegistryConstants.ATTR_MANAGEABLE) == null ||
     * @param id identifier of the driver to retrieve
                        .orElse(null);
     */


        }


        drivers.removeIf(driver -> driver.isCustom() || driver.isDisabled());
                folder.setType(changeFolderType);
        return new DriverDescriptor(this, SecurityUtils.generateGUID(false), copyFrom);
            Predicate<DriverDescriptor> predicate =
 * distributed under the License is distributed on an "AS IS" BASIS,

                    }

            this.icon = DBIcon.DATABASE_DEFAULT;
                log.error("Provider '" + parentId + "' not found");

                    if (parent instanceof DBXTreeFolder) {
    }


        // Load driver properties

                    //log.warn("Unknown node type: " + nodeType);
 * DataSourceProviderDescriptor
                for (IConfigurationElement prop : propsElement.getChildren(PropertyDescriptor.TAG_PROPERTY_GROUP)) {
        return parentProvider != null && parentProvider.matchesId(id);
        DBXTreeNode parentNode = baseItem;
     *
import org.jkiss.utils.SecurityUtils;
                        log.warn(config + " folder has no child items and unique id is not specified " + treeFolder.getIdOrType() + " " + config.getAttribute(
                }
                }
import org.jkiss.dbeaver.model.impl.ProviderPropertyDescriptor;
    }
    private final String name;
        }
                        perform = DBXTreeNodeHandler.Perform.none;
        if (CommonUtils.getBoolean(config.getAttribute(ATTRIBUTE_REPLACE_CHILDREN))) {
 */
        if (!ArrayUtils.isEmpty(injections)) {
                    : d -> ArrayUtils.contains(driversSpec.split(","), d.getId());
        }
        super(config);
                    ex);
    public DriverDescriptor getDriverByName(String category, String name) {

                loadTreeNode(parent, child, afterItem);
        return driversManageable;
        }
        }
    public String getDescription() {

import org.jkiss.dbeaver.model.DBPDataSourceProvider;
        for (int i = 1; i < path.length; i++) {
            if (CommonUtils.equalObjects(category, driver.getCategory()) && CommonUtils.equalObjects(name,

                    String command = iconElement.getAttribute("command");
    @Nullable
        return childrenProviders;
            config.getAttribute(RegistryConstants.ATTR_PATH),
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
                node.setDefaultIcon(defaultImage);
                    treeNodeMap.put(child.getId(), child);
import java.util.ArrayList;
        return treeRoot;
        }
    }
            }
            }
            for (IConfigurationElement iconElement : iconElements) {
    }
    private final boolean temporary;

        if (!ArrayUtils.isEmpty(children)) {
                parent.addChild(child);
    //////////////////////////////////////
        {
    public DataSourceProviderDescriptor getParentProvider() {
    }
/**
    public DBPPropertyDescriptor getDriverProperty(String name) {
                }
                        appDrivers.forEach(d -> d.addMainPropertyDescriptors(mainProperties));
import java.util.Map;
    public record ProviderPropertiesInto(@Nullable String driverIds, @NotNull List<ProviderPropertyDescriptor> providerProperties) {
                            "icon"));
    }
    public boolean supportsDriverMigration() {
    }


                    this.nativeClients.add(new NativeClientDescriptor(clientElement));

            return true;
            if (driver.getId().equals(id)) {
                    DBXTreeNodeHandler.Action action = DBXTreeNodeHandler.Action.valueOf(iconElement.getAttribute(
        String changeFolderType = config.getAttribute(ATTRIBUTE_CHANGE_FOLDER_TYPE);
        this.supportsDriverMigration = CommonUtils.toBoolean(config.getAttribute("supports-migration"));

    }
            initProviderBundle(driver);
    private ObjectType implType;
        // Load tree structure
            child = treeNodeMap.get(refId);
                loadTreeChildren(config, child, null);
    }
        loadTreeIcon(treeRoot, config);
    public List<DriverDescriptor> getDrivers() {
        return temporary;
                        List<DriverDescriptor> appDrivers;
                    if (!CommonUtils.isEmpty(performName)) {
    @Override
        {
                for (IConfigurationElement driverElement : driversElement.getChildren(RegistryConstants.TAG_DRIVER)) {
            return false;
                        List<ProviderPropertyDescriptor> mainProperties = new ArrayList<>();
        if (CommonUtils.isEmpty(injectPath)) {
                    DBPImage iconImage = iconToImage(icon);
        SQLDialectMetadataRegistry dialectRegistry = DBWorkbench.getPlatform().getSQLDialectRegistry();
        DBXTreeItem baseItem = treeDescriptor;
                String icon = iconElement.getAttribute(RegistryConstants.ATTR_ICON);
                        this,
     * Retrieves a driver by the given {@code id}.
                        CommonUtils.getBoolean(config.getAttribute(RegistryConstants.ATTR_NAVIGABLE), true),
    @NotNull
                    break;
            }
    }
                }
                        for (IConfigurationElement prop : propsElement.getChildren(PropertyDescriptor.TAG_PROPERTY_GROUP)) {

                    for (IConfigurationElement propsElement : driversElement.getChildren(RegistryConstants.TAG_PROVIDER_PROPERTIES)) {
                this.instance = null;
        if (!driver.isCustom()) {
            }
        }
        if (!inheritAuthModels) {
                        CommonUtils.getBoolean(config.getAttribute(RegistryConstants.ATTR_VIRTUAL)),
                case RegistryConstants.TAG_FOLDER: {
     * @return driver or {@code null} if no driver was found
                    CommonUtils.getBoolean(driversElement.getAttribute(RegistryConstants.ATTR_MANAGEABLE));
                    String performName = iconElement.getAttribute("perform");
            String afterPath = config.getAttribute(RegistryConstants.ATTR_AFTER);
        }
    private DriverDescriptor loadDriver(IConfigurationElement config) {
import java.util.List;
        }
                        config.getAttribute(RegistryConstants.ATTR_VISIBLE_IF),
                    }
    private final List<DBPDataSourceProviderDescriptor> childrenProviders = new ArrayList<>();
    public DataSourceProviderDescriptor(DataSourceProviderRegistry registry, IConfigurationElement config) {
            }
        for (DriverDescriptor driver : drivers) {
                        config,
                loadTreeIcon(child, config);
                        CommonUtils.getBoolean(config.getAttribute(RegistryConstants.ATTR_STANDALONE)),
    public SQLDialectMetadata getScriptDialect() {
    }
        for (DriverDescriptor driver : drivers) {
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
                }
            if (id.equals(dspd.getId())) {
        return icon;
        }
    private final List<NativeClientDescriptor> nativeClients = new ArrayList<>();
                if (isDefault && CommonUtils.isEmpty(expr)) {
                    DBXTreeItem siblingItem = baseItem.findChildItemByPath(sibling);
    public DriverDescriptor getDriver(@NotNull String id) {
        return description;
                                .filter(d -> ArrayUtils.contains(driverIds, d.getId())).collect(Collectors.toList());
        IConfigurationElement[] injections = config.getChildren(RegistryConstants.TAG_TREE_INJECTION);
    public DriverDescriptor getOriginalDriver(@NotNull String id) {

        {
import java.util.function.Predicate;
    }
        }

        return nativeClients;
                return driver;

                    } else {
                    child = new DBXTreeItem(
    DataSourceProviderDescriptor(DataSourceProviderRegistry registry, String id) {
     *
    }
            baseItem = baseItem.findChildItemByPath(path[i]);
    private final List<DriverDescriptor> drivers = new ArrayList<>();

        for (DriverDescriptor driver : drivers) {
        if (instance == null) {
        if (this.scriptDialect == null) {
    }
                }
            } else {
        this.registry = registry;
    @Override
                        config.getAttribute(RegistryConstants.ATTR_VISIBLE_IF),
    private static final Log log = Log.getLog(DataSourceProviderDescriptor.class);
        this.registry = registry;
    public void removeCustomAndDisabledDrivers() {
                    }
    }

    }
        if (child != null && afterItem != null) {
                        for (IConfigurationElement prop : propsElement.getChildren(PropertyDescriptor.TAG_PROPERTY_GROUP)) {
    private DBPDataSourceProvider instance;
                        } else {
                        CommonUtils.getBoolean(config.getAttribute(RegistryConstants.ATTR_NAVIGABLE), true),
            }
                        }
     */
            }
    }

                driver.getName())) {
        IConfigurationElement[] children = config.getChildren();
                if (!CommonUtils.isEmpty(child.getId())) {
    }
    }
    /**
        IConfigurationElement[] trees = config.getChildren(RegistryConstants.TAG_TREE);
                        String driversSpec = propsElement.getAttribute("drivers");


        }
    }
    }
                        config,
    public static boolean matchesId(DBPDataSourceProviderDescriptor providerDescriptor, String id) {
            this.parentProvider = registry.getDataSourceProvider(parentId);
                try {
                        config.getAttribute(RegistryConstants.ATTR_LABEL),
            driver.setDisabled(true);
                        }
                            appDrivers = drivers;
    }
    private static final String ATTRIBUTE_CHANGE_FOLDER_LABEL = "changeFolderLabel"; //$NON-NLS-1$
                this.instance.init(DBWorkbench.getPlatform());
                    // Unknown node type
    private DBPImage icon;
                boolean isDefault = CommonUtils.getBoolean(iconElement.getAttribute(RegistryConstants.ATTR_DEFAULT));
                        List<ProviderPropertyDescriptor> providerProperties = new ArrayList<>();
            loadTreeChildren(config, parentNode, afterItem);
                        ((DBXTreeFolder) parent).addContribution(contrCategory);
            .orElse(false);
    }
            }
                    ? d -> true
    public boolean isTemporary() {
                if (CommonUtils.isNotEmpty(changeFolderLabel)) {
                    } else {
                    String contrCategory = config.getAttribute(RegistryConstants.ATTR_CATEGORY);
            }
        if (CommonUtils.isEmpty(dialectId)) {
            if (this.parentProvider == null) {
                    driverProperties.addAll(PropertyDescriptor.extractProperties(prop));
        }
    }
                }
            if (!ArrayUtils.isEmpty(injections)) {
            return this.drivers.remove(driver);
        if (inheritClients && parentProvider != null) {
                folderNode.removeChild(baseItem);
        return drivers.stream()

     * Retrieves an original or, if another one replaced it, substituted driver by the given {@code id}.
                    break;

 * you may not use this file except in compliance with the License.
        }
import org.jkiss.dbeaver.model.connection.DBPDataSourceProviderDescriptor;
    @Override

        instance = null;
                for (IConfigurationElement treeInject : injections) {
        return new DriverDescriptor(this, config);
import org.jkiss.dbeaver.runtime.DBWorkbench;
    private DataSourceProviderDescriptor parentProvider;
                }
            }
    public String getFullIdentifier() {
        this.implType = new ObjectType(config.getAttribute(RegistryConstants.ATTR_CLASS));
    }

        }
        return treeDescriptor == null ? (parentProvider == null ? null : parentProvider.getTreeDescriptor())
                        CommonUtils.getBoolean(config.getAttribute(RegistryConstants.ATTR_INLINE)),
            DBXTreeNode folderNode = baseItem.getParent();

                    break;
        for (DriverDescriptor driver : drivers) {
            if (driver.getId().equals(id)) {
                .filter(predicate)
    private void loadTreeChildren(IConfigurationElement config, DBXTreeNode parent, DBXTreeNode afterItem) {
        } else {

                        "action"));
    private void loadTreeHandlers(DBXTreeNode node, IConfigurationElement config) {
    private boolean supportsDriverMigration;
        return parentProvider;
        return CommonUtils.toString(name, id);
import org.jkiss.dbeaver.Log;
    }
    // Internal


                this.parentProvider.addChildrenProvider(this);
                            providerProperties.addAll(ProviderPropertyDescriptor.extractProviderProperties(prop));
                }
            if (child != null) {
 *
        DBXTreeNode child = null;
        IConfigurationElement[] handlerElements = config.getChildren("handler");
                    DBXTreeNodeHandler.Perform perform;
                    }
            }
    //////////////////////////////////////
            baseItem.clearChildren();
        IConfigurationElement[] iconElements = config.getChildren(RegistryConstants.ATTR_ICON);
                        if (CommonUtils.isEmpty(driversSpec) || driversSpec.equals("*")) {
        this.id = config.getAttribute(RegistryConstants.ATTR_ID);
    }
                // Initialize it
    }
    @Override
                        config.getAttribute(RegistryConstants.ATTR_PROPERTY),
                    child = new DBXTreeObject(
                }
                return;


    @Override
            } else {
            return clients;
                return driver;
                        log.error("Sibling item '" + sibling + "' not found");
                    log.error("Error adding node handler", e);
                        this.drivers.add(loadDriver(driverElement));
        if (!path[0].equals(treeDescriptor.getPath())) {
                this.instance = implType.createInstance(DBPDataSourceProvider.class);
            }
        }

                        perform = DBXTreeNodeHandler.Perform.command;
                        CommonUtils.getBoolean(config.getAttribute(RegistryConstants.ATTR_VIRTUAL)),
    }
                        log.warn(RegistryConstants.TAG_TREE_CONTRIBUTION + " allowed only inside folders");
            }
    public String getName() {

