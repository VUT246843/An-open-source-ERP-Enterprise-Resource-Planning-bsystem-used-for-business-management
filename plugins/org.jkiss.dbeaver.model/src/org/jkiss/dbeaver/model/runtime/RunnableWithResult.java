}
import org.jkiss.dbeaver.Log;

/*
    }
 * Unless required by applicable law or agreed to in writing, software
        }

    private RESULT_TYPE result;
 *
    private static final Log log = Log.getLog(RunnableWithResult.class);
        } catch (Exception e) {

    {
 *
/**
 * DBeaver - Universal Database Manager
 */
    public final void run() {


        return result;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public abstract RESULT_TYPE runWithResult() throws DBException;

 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
    public final RESULT_TYPE getResult()

 * Licensed under the Apache License, Version 2.0 (the "License");
 */
 * Runnable which stores some result
 * You may obtain a copy of the License at
public abstract class RunnableWithResult<RESULT_TYPE> implements Runnable {
import org.jkiss.dbeaver.DBException;
        try {
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
package org.jkiss.dbeaver.model.runtime;

    @Override
            log.error("Internal error: task " + getClass().getName() + "' failed", e);
            result = runWithResult();
 * See the License for the specific language governing permissions and
