 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
        throw new IOException("Reading is not supported");
import org.jkiss.dbeaver.model.data.DBDContent;
    }

 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Contributors:
    public void write(JsonWriter writer, DBDContent content) throws IOException {
    public DBDContent read(JsonReader reader) throws IOException {
 * You may obtain a copy of the License at
 *

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            return;
 * you may not use this file except in compliance with the License.
    @Override
    @Override
 */
import com.google.gson.stream.JsonReader;
 *    Stefan Uhrig - initial implementation
            writer.nullValue();
import java.io.IOException;
        if (content == null) {
        String value = content.getDisplayString(DBDDisplayFormat.UI);

public class DBDContentAdapter extends TypeAdapter<DBDContent> {

        writer.value(value);
 * DBeaver - Universal Database Manager
 *
import com.google.gson.stream.JsonWriter;
 *
package org.jkiss.dbeaver.ui.gis.panel;
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
/*
import com.google.gson.TypeAdapter;
 * limitations under the License.

        }
}
    }
