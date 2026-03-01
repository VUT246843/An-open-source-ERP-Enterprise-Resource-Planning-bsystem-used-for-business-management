 *
 *     http://www.apache.org/licenses/LICENSE-2.0

/**
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.
 */
 * You may obtain a copy of the License at
/*

 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
    String getDefaultValueLabel();
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.exec.DBCSession;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
package org.jkiss.dbeaver.model.data;
}
 * Generates default value.
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager

{
 */
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    Object generateDefaultValue(DBCSession session, DBSTypedObject type);

public interface DBDValueDefaultGenerator
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
