 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBPObject;
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
    void setHoldBy(DBAServerLock lock);

package org.jkiss.dbeaver.model.admin.locks;
    Object getId();
    String getTitle();
 * Server lock interface
 * DBeaver - Universal Database Manager

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and

 *
 * You may obtain a copy of the License at

 * Licensed under the Apache License, Version 2.0 (the "License");
/**
 *

 * Copyright (C) 2017 Andrew Khitrin (ahitrin@gmail.com) 

public interface DBAServerLock extends DBPObject {


    Object getHoldID();
 *
 */

}

    DBAServerLock getHoldBy();
import java.util.List;
 * you may not use this file except in compliance with the License.
    List<DBAServerLock> waitThis();

 * limitations under the License.
 */
 * Unless required by applicable law or agreed to in writing, software
