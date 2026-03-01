    }

        this.attributes = attributes;
import org.jkiss.dbeaver.model.exec.DBCAttributeMetaData;
    }
 */

    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0

package org.jkiss.dbeaver.model.impl.local;
 * limitations under the License.
    public List<? extends DBCAttributeMetaData> getAttributes() {

 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,

}
 * You may obtain a copy of the License at
    public LocalResultSetMeta(List<? extends DBCAttributeMetaData> attributes) {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.exec.DBCResultSetMetaData;
 * LocalResultSetMeta

/*
 * Unless required by applicable law or agreed to in writing, software
 *

 */
public class LocalResultSetMeta implements DBCResultSetMetaData {
/**
        return attributes;
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.List;
 *
 *
    private final List<? extends DBCAttributeMetaData> attributes;
 * Copyright (C) 2010-2024 DBeaver Corp and others
