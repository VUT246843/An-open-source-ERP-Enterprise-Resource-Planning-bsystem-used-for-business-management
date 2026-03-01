 * You may obtain a copy of the License at
        parameters.startTimestamp = new Date();
    public DataTransferPipe(IDataTransferProducer<?> producer, IDataTransferConsumer consumer) {
            processorDescriptor != null && processorDescriptor.isBinaryFormat(),

 *

}
        }
        parameters.orderNumber = pipeIndex;
 * Unless required by applicable law or agreed to in writing, software
            producer == null ? null : producer.getProject()

    private IDataTransferProducer<?> producer;

        parameters.totalConsumers = totalPipes;
        IDataTransferConsumer.TransferParameters parameters = new IDataTransferConsumer.TransferParameters(

 *     http://www.apache.org/licenses/LICENSE-2.0
        );
                settings.getProcessorProperties(),
        IDataTransferProcessor processor = processorDescriptor == null ? null : processorDescriptor.getInstance();
        consumer.initTransfer(

        DataTransferProcessorDescriptor processorDescriptor = settings.getProcessor();
    }
        );
    }
        return producer;
            throw new DBException("Empty pipe");
            processor,

                null :
    }
        if (consumer == null || producer == null) {
 * DBeaver - Universal Database Manager
    public void setProducer(IDataTransferProducer<?> producer) {
    private IDataTransferConsumer consumer;
            processorDescriptor != null && processorDescriptor.isHTMLFormat()
public class DataTransferPipe {
package org.jkiss.dbeaver.tools.transfer;
 * you may not use this file except in compliance with the License.
        this.consumer = consumer;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void initPipe(DataTransferSettings settings, int pipeIndex, int totalPipes) throws DBException {
    }

 */
 * limitations under the License.
        this.producer = producer;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2025 DBeaver Corp and others
import java.util.Date;
    public IDataTransferConsumer<?, ?> getConsumer() {
 *

 * See the License for the specific language governing permissions and
/*
            producer.getDatabaseObject(),
 * Licensed under the Apache License, Version 2.0 (the "License");
 *

        return consumer;

import org.jkiss.dbeaver.DBException;
        IDataTransferSettings consumerSettings = settings.getNodeSettings(settings.getConsumer());
        this.consumer = consumer;
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferProcessorDescriptor;
 */
    }
    public void setConsumer(IDataTransferConsumer<?, ?> consumer) {
/**
    public IDataTransferProducer<?> getProducer() {
        this.producer = producer;

            parameters,
            consumerSettings,
    }
            processor == null ?
 * Data transfer pipe is tuple of produces and consumer
