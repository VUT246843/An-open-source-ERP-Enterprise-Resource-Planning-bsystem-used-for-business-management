 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Responsible for environment-specific path transformation during file browse discovery
 */
    @NotNull
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
    /**
package org.jkiss.dbeaver.runtime;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
     */

 * Licensed under the Apache License, Version 2.0 (the "License");
    /**
public interface IEnvironmentPathMapper {
 * Copyright (C) 2010-2024 DBeaver Corp and others
   
}
 * Unless required by applicable law or agreed to in writing, software
/**

    
 * DBeaver - Universal Database Manager
    boolean isApplicable(@NotNull String localEnvPath);
     * Applies environment-specific path transformation
 *     http://www.apache.org/licenses/LICENSE-2.0
    String map(@NotNull String localEnvPath);
     */
/*
 * you may not use this file except in compliance with the License.
 * See NavigatorHandlerShowInExplorer 
 *
 * limitations under the License.
     * Checks if path transformation should be applied
 */
