
 * distributed under the License is distributed on an "AS IS" BASIS,


    String getServiceName();
 */
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
/*

package org.jkiss.dbeaver.model.runtime.load;
 * Licensed under the Apache License, Version 2.0 (the "License");
    Object getFamily();
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
     * Force cancel will kill database service/job if there are no other active blocks
 *
 * You may obtain a copy of the License at
}


 *
 * Lazy loading service
 * limitations under the License.
    /**
    }

 * Unless required by applicable law or agreed to in writing, software
    RESULT evaluate(@NotNull DBRProgressMonitor monitor) throws InvocationTargetException, InterruptedException;
     */
public interface ILoadService<RESULT> {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.code.NotNull;
 * DBeaver - Universal Database Manager
        return true;



/**
import java.lang.reflect.InvocationTargetException;
    boolean cancel() throws InvocationTargetException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    default boolean isForceCancel() {
 */
 * @param <RESULT> result type
 * See the License for the specific language governing permissions and
