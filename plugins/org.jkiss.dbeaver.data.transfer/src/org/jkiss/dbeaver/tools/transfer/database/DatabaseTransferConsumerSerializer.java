 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
import java.util.Map;
    }


    public void serializeObject(@NotNull DBRRunnableContext runnableContext, @NotNull DBTTask context, @NotNull DatabaseTransferConsumer object, @NotNull Map<String, Object> state) {
 * Data transfer job initializes all pipe nodes with their settings and passed input (producer) object.
        return new DatabaseTransferConsumer();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
}
 * Licensed under the Apache License, Version 2.0 (the "License");


 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
 * This serialized does nothing. All settings are stored in DatabaseConsumerSettings.
/**
import org.jkiss.dbeaver.model.task.DBTTask;
    private static final Log log = Log.getLog(DatabaseTransferConsumerSerializer.class);
    public DatabaseTransferConsumer deserializeObject(@NotNull DBRRunnableContext runnableContext, @NotNull SerializerContext serializeContext, @NotNull DBTTask objectContext, @NotNull Map<String, Object> state) throws DBException {
import org.jkiss.dbeaver.tools.transfer.serialize.DTObjectSerializer;
    @Override
import org.jkiss.dbeaver.DBException;
 *
 * Thus consumer can find its settings (by searching in ConsumerSettings by producer object).
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
    }
 */
package org.jkiss.dbeaver.tools.transfer.database;
import org.jkiss.code.NotNull;

/*

import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
import org.jkiss.dbeaver.tools.transfer.serialize.SerializerContext;
 * you may not use this file except in compliance with the License.
 * limitations under the License.
 *
import org.jkiss.dbeaver.Log;
    @Override

public class DatabaseTransferConsumerSerializer implements DTObjectSerializer<DBTTask, DatabaseTransferConsumer> {
