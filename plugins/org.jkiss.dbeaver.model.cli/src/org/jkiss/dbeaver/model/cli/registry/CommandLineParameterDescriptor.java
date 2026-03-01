        this.forceNewInstance = CommonUtils.toBoolean(config.getAttribute("forceNewInstance"));
        this.implClass = cBundle.loadClass(config.getAttribute("handler"));
        Bundle cBundle = Platform.getBundle(config.getContributor().getName());

        this.exitAfterExecute = CommonUtils.toBoolean(config.getAttribute("exitAfterExecute"));
    public Class<?> getImplClass() {
        return forceNewInstance;
/*
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
    public boolean isExclusiveMode() {
import org.osgi.framework.Bundle;
    }
 * You may obtain a copy of the License at
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    private final boolean exclusiveMode;


package org.jkiss.dbeaver.model.cli.registry;

 * you may not use this file except in compliance with the License.
    }
        return implClass;
    private final Class<?> implClass;
    }
 * See the License for the specific language governing permissions and
import org.eclipse.core.runtime.Platform;
    public boolean isForceNewInstance() {


    private final boolean forceNewInstance;
}

 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
public class CommandLineParameterDescriptor {
 *
    public boolean isExitAfterExecute() {
    private final boolean exitAfterExecute;
    }
 * DBeaver - Universal Database Manager


 * Copyright (C) 2010-2025 DBeaver Corp and others
        return exitAfterExecute;
import org.eclipse.core.runtime.IConfigurationElement;

        this.exclusiveMode = CommonUtils.toBoolean(config.getAttribute("exclusiveMode"));
        return exclusiveMode;
    }
 * limitations under the License.
    public CommandLineParameterDescriptor(IConfigurationElement config) throws Exception {
import org.jkiss.utils.CommonUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
