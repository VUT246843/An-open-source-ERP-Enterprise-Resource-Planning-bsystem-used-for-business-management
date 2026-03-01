    }
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
    public String toString() {
    }
    }
 *

        return consumerType;
    @Override
    {
    private final String producerType;
        return producerSelector;
        this.consumerSelector = CommonUtils.toBoolean(config.getAttribute("consumerSelector"));
    private final boolean producerSelector;
        }
    public DataTransferPageType getPageType() {
        return id;
/*
    public boolean isConsumerSelector() {
 */
        if (CommonUtils.isEmpty(typeStr)) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        this.producerType = config.getAttribute("producerType");
/**
 * DataTransferProcessorDescriptor

        super(config);
 *
 * limitations under the License.

 */
    public String getId()
    DataTransferPageDescriptor(IConfigurationElement config)
        this.consumerType = config.getAttribute("consumerType");
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.core.runtime.IConfigurationElement;
    public boolean isProducerSelector() {
        return consumerSelector;
        return pageClass;
        return pageType;
        String typeStr = config.getAttribute("type");
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
    private final ObjectType pageClass;
        } else {
}
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
    }
 * DBeaver - Universal Database Manager
    private final String consumerType;
    public String getConsumerType() {

 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
    }
        this.producerSelector = CommonUtils.toBoolean(config.getAttribute("producerSelector"));


    private final boolean consumerSelector;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        return producerType;
import java.util.Locale;

 *
{
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.tools.transfer.ui.registry;
    }



            pageType = DataTransferPageType.NORMAL;
public class DataTransferPageDescriptor extends AbstractDescriptor

    private final String id;
    private final DataTransferPageType pageType;
import org.jkiss.utils.CommonUtils;
        this.pageClass = new ObjectType(config.getAttribute("class"));
    }
            pageType = DataTransferPageType.valueOf(typeStr.toUpperCase(Locale.ENGLISH));
        this.id = config.getAttribute("id");
    public ObjectType getPageClass() {
    public String getProducerType() {
    }
        return id;

