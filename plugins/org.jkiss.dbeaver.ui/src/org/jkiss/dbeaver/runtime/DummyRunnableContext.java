
    }
 *
import org.eclipse.jface.operation.IRunnableWithProgress;
 * You may obtain a copy of the License at

 * Progress monitor default implementation
import java.lang.reflect.InvocationTargetException;
import org.eclipse.core.runtime.NullProgressMonitor;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *

}
public class DummyRunnableContext implements IRunnableContext {
 * Unless required by applicable law or agreed to in writing, software
    public static final IRunnableContext INSTANCE = new DummyRunnableContext();
 *
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void run(boolean fork, boolean cancelable, IRunnableWithProgress runnable) throws InvocationTargetException, InterruptedException {
package org.jkiss.dbeaver.runtime;
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
 */
 * Licensed under the Apache License, Version 2.0 (the "License");

 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
import org.eclipse.jface.operation.IRunnableContext;
/**

 * limitations under the License.
 * DBeaver - Universal Database Manager
        runnable.run(new NullProgressMonitor());

