
        } catch (Exception e) {
     * Start the application with the given appID and args.
     * @param appID the application ID

    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void shutdown() {
                ParameterizedRunnable.class.getName(),

        this.context = context;
public class TestLauncher implements ApplicationLauncher {
     * @param args the arguments
/*
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        try {
import org.eclipse.osgi.service.runnable.ApplicationLauncher;
     */
            if (args.length != 0) {
            ((BundleContextImpl) context).getContainer().getConfiguration().setConfiguration("eclipse.application", appID);
     * @return the result of evaluating the application in the given context
        ServiceReference<?>[] runRefs = null;
        findRunnableService();


        // 3.1)
        String appClass = ParameterizedRunnable.class.getName();
import org.eclipse.osgi.service.runnable.ParameterizedRunnable;
        }
        } catch (InvalidSyntaxException e) {
    public TestLauncher(BundleContext context) {
    @Override

                "(&(objectClass=" + appClass + ")(eclipse.application=*))"
    public Object start(String appID, String[] args) {
    }
        }
    }
    }
        this.runnable = runnable;
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.osgi.internal.framework.BundleContextImpl;
            return runnable.run(context);
    private volatile ParameterizedRunnable runnable = null;
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
        if (runRefs != null && runRefs.length > 0) {
     *
            // ignore this. It should never happen as we have tested the above format.

        // look for a ParameterizedRunnable registered as a service by runtimes (3.0,
                ((BundleContextImpl) context).getContainer().getConfiguration().setAllArgs(args);
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
    private void findRunnableService() {
package org.jkiss.junit.osgi.launcher;

import org.osgi.framework.ServiceReference;
            ); //$NON-NLS-1$//$NON-NLS-2$
 *
} */
import org.osgi.framework.BundleContext;
    }
    private final BundleContext context;
 * Unless required by applicable law or agreed to in writing, software
            runRefs = context.getServiceReferences(
            throw new RuntimeException(e);
    /**
        }
            runnable = (ParameterizedRunnable) context.getService(runRefs[0]);
 * See the License for the specific language governing permissions and
    public void launch(ParameterizedRunnable runnable, Object context) {
 *
 *
        try {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
import org.osgi.framework.InvalidSyntaxException;
