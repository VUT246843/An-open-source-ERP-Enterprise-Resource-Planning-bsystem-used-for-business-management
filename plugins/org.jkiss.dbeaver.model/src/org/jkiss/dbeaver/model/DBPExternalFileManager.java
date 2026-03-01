import java.util.Map;

 * you may not use this file except in compliance with the License.
    @Nullable
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and

 */

import org.jkiss.code.NotNull;
import org.jkiss.code.Nullable;
 *
 * External file manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public interface DBPExternalFileManager
    void setFileProperty(File file, String property, Object value);
package org.jkiss.dbeaver.model;
/**
import java.io.File;
{
 * distributed under the License is distributed on an "AS IS" BASIS,
}
    @NotNull
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager

 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.

    Object getFileProperty(File file, String property);


 *
    @NotNull
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
    Map<String, Object> getFileProperties(File file);
/*
    Map<String, Map<String, Object>> getAllFiles();
