public interface IMultiStreamDataImporter extends IStreamDataImporter {
     * @return list of entity mappings from the stream
 * distributed under the License is distributed on an "AS IS" BASIS,
     * @param inputStream   stream to read entities from
/**
     * @param entityMapping original entity mapping
import java.io.InputStream;
 * See the License for the specific language governing permissions and
/*
    /**


package org.jkiss.dbeaver.tools.transfer.stream;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
     * Extracts list of entities contained in the given stream.
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
import org.jkiss.dbeaver.DBException;
    @NotNull
     *
 * you may not use this file except in compliance with the License.

 *
        @NotNull StreamEntityMapping entityMapping,
     * @throws DBException on any DB or IO error
 * Licensed under the Apache License, Version 2.0 (the "License");
     */
 * Unless required by applicable law or agreed to in writing, software
    List<StreamEntityMapping> readEntitiesInfo(
 * Represents an importer that can read multiple entities from a single stream.
 *
import java.util.List;
        @NotNull InputStream inputStream) throws DBException;
 */
import org.jkiss.code.NotNull;
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
}
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
