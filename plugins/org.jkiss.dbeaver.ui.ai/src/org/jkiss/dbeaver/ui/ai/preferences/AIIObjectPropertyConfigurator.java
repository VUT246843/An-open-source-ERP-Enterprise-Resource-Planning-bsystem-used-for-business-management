 *
package org.jkiss.dbeaver.ui.ai.preferences;
}
/*
 *

 * Copyright (C) 2010-2025 DBeaver Corp and others
 * You may obtain a copy of the License at
 */
public interface AIIObjectPropertyConfigurator<ENGINE extends AIEngineDescriptor, PROPERTIES extends AIEngineProperties> extends
 *
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.ai.engine.AIEngineProperties;
    default Optional<AIEngineProperties> getCurrentProperties() {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
 */
 * you may not use this file except in compliance with the License.
/**
import org.jkiss.dbeaver.model.ai.registry.AIEngineDescriptor;

        return Optional.empty();
 * See the License for the specific language governing permissions and
import java.util.Optional;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 * DBeaver - Universal Database Manager
    IObjectPropertyConfigurator<ENGINE, PROPERTIES> {

import org.jkiss.dbeaver.ui.IObjectPropertyConfigurator;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * AIIObjectPropertyConfigurator used to get a copy of current AIEngineProperties if present

 * distributed under the License is distributed on an "AS IS" BASIS,
