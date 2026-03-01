 *
    }
        return entityMapping;
    }
    }
 *
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
    StreamDataImporterSite(StreamProducerSettings settings, StreamEntityMapping entityMapping, Map<String, Object> processorProperties) {
        return settings;
        this.entityMapping = entityMapping;
public class StreamDataImporterSite implements IStreamDataImporterSite {
    @Override
 * limitations under the License.


    @Override
        this.processorProperties = processorProperties;

    public Map<String, Object> getProcessorProperties() {


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return processorProperties;


import java.util.Map;
 *
    public StreamEntityMapping getSourceObject() {

    private StreamProducerSettings settings;
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
        this.settings = settings;
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
}
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    public StreamProducerSettings getSettings() {
 * you may not use this file except in compliance with the License.
 */
    private Map<String, Object> processorProperties;
package org.jkiss.dbeaver.tools.transfer.stream;
/*
    private StreamEntityMapping entityMapping;
