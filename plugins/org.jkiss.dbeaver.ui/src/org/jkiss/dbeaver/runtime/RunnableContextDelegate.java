 *

package org.jkiss.dbeaver.runtime;
/**
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
    public RunnableContextDelegate(IRunnableContext delegate) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;

 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    @Override

 * You may obtain a copy of the License at

 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.delegate = delegate;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.utils.RuntimeUtils;
    }
    public void run(boolean fork, boolean cancelable, final DBRRunnableWithProgress runnable) throws InvocationTargetException, InterruptedException {

/*
 */
 *
public class RunnableContextDelegate implements DBRRunnableContext {
import java.lang.reflect.InvocationTargetException;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.jface.operation.IRunnableContext;
 * Progress monitor default implementation
    private final IRunnableContext delegate;
        delegate.run(fork, cancelable, monitor -> runnable.run(RuntimeUtils.makeMonitor(monitor)));
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager

}
 * limitations under the License.
 *
 */
