 * Licensed under the Apache License, Version 2.0 (the "License");

 * limitations under the License.
 * DBeaver - Universal Database Manager
 *
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
 * Information provider
import org.jkiss.code.NotNull;
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others


 *     http://www.apache.org/licenses/LICENSE-2.0
public interface DBPInformationProvider {
 */

    String getObjectInformation(@NotNull DBPObject object, @NotNull String infoType);
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.model;
    // Connection target address
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.Nullable;


 * See the License for the specific language governing permissions and
    String INFO_TARGET_ADDRESS = "targetAddress";
/*
 * you may not use this file except in compliance with the License.
}
    @Nullable
/**
 *
