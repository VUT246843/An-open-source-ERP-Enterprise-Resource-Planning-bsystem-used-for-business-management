import org.jkiss.utils.CommonUtils;
import org.jkiss.code.NotNull;
        return command != null ? command.getImplClass() : null;
        } catch (DBException e) {
 * you may not use this file except in compliance with the License.
public class CLITransformerDescriptor extends AbstractDescriptor {
            this.command = null;

 *     http://www.apache.org/licenses/LICENSE-2.0
 *

    public CLITransformerDescriptor(IConfigurationElement config) throws Exception {
    }

 *
 * You may obtain a copy of the License at
        super(config);

 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Nullable
 * limitations under the License.
import org.jkiss.code.Nullable;
}
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
            return transformer.createInstance(CommandLine.IModelTransformer.class);
import picocli.CommandLine;
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            throw new IllegalStateException("Can not create transformer '" + transformer.getImplName() + "'", e);
 * Copyright (C) 2010-2026 DBeaver Corp and others
            this.command = new ObjectType(config, "command");
        this.transformer = new ObjectType(config, "transformer");
    }
        }
    public CommandLine.IModelTransformer getTransformer() {
 * distributed under the License is distributed on an "AS IS" BASIS,

        } else {
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.DBException;

    private final ObjectType command;
        try {
import org.eclipse.core.runtime.IConfigurationElement;
 */
    @Nullable
    private final ObjectType transformer;
    }
package org.jkiss.dbeaver.model.cli.registry;
        }
 *
    @NotNull
        if (CommonUtils.isNotEmpty(config.getAttribute("command"))) {
/*
    public Class<?> getCommandClass() {
