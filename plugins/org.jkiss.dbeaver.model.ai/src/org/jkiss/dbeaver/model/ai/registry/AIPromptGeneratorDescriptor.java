
import org.jkiss.dbeaver.DBException;

}
    public DBPImage getIcon() {
            throw new DBException("Object class " + objectType.getImplName() + " not found");
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
 * limitations under the License.
        this.id = Objects.requireNonNull(config.getAttribute(RegistryConstants.ATTR_ID));
    private final List<Uses> uses;
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
 */
    private final String id;
    private final String description;
import org.jkiss.dbeaver.model.DBPImage;
        return id;
    }
    private final String label;
import org.jkiss.dbeaver.registry.RegistryConstants;
import java.util.Objects;
import java.util.List;
 *
    }
import org.jkiss.dbeaver.model.ai.AIPromptGenerator;
    @NotNull
package org.jkiss.dbeaver.model.ai.registry;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


        return label != null ? label : id;
        } catch (Exception e) {

            .map(Uses::new)
    public String getDescription() {
    }
import org.eclipse.core.runtime.IConfigurationElement;
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.objectType = new ObjectType(config, RegistryConstants.ATTR_CLASS);
 * you may not use this file except in compliance with the License.
    @NotNull

        return uses;
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
        try {
    public String getLabel() {
    public record Uses(@NotNull String function, @NotNull String instructions) {
        }
 *

        this.label = Objects.requireNonNull(config.getAttribute(RegistryConstants.ATTR_LABEL));
import org.jkiss.code.Nullable;
        Class<? extends AIPromptGenerator> objectClass = objectType.getObjectClass(AIPromptGenerator.class);
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
    private final ObjectType objectType;
        if (objectClass == null) {
    @Nullable
    public AIPromptGenerator createGenerator() throws DBException {
        this.icon = iconToImage(config.getAttribute(RegistryConstants.ATTR_ICON));


    @Nullable
            return objectClass.getConstructor().newInstance();
    public static final String EXTENSION_ID = "com.dbeaver.ai.prompt";
    @NotNull

        }
 * distributed under the License is distributed on an "AS IS" BASIS,

        return description;
    }
    }
        super(config);
        this.description = config.getAttribute(RegistryConstants.ATTR_DESCRIPTION);
import java.util.stream.Stream;
        Uses(@NotNull IConfigurationElement config) {
    @NotNull
    }
    protected AIPromptGeneratorDescriptor(@NotNull IConfigurationElement config) {
        }
    public String getId() {

    public List<Uses> getUses() {
public class AIPromptGeneratorDescriptor extends AbstractDescriptor {
import org.jkiss.code.NotNull;

            this(config.getAttribute("function"), config.getAttribute("instructions"));
 * See the License for the specific language governing permissions and
    }
        this.uses = Stream.of(config.getChildren("uses"))

            throw new DBException("Error creating prompt generator " + getId(), e);
    }
 *
    private final DBPImage icon;
            .toList();
        return icon;
