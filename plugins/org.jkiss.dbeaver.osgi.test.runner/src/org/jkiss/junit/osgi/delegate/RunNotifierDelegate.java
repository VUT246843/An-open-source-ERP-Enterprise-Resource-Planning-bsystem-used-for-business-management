 *
    public void fireTestIgnored(Description description) {
    private void invokeMethod(String methodName) {
import org.junit.runner.notification.RunListener;
import org.jkiss.code.Nullable;


    }
    public void fireTestRunFinished(Result result) {
        try {
    @Override
    }
 *
    public void fireTestAssumptionFailed(Failure failure) {
        invokeMethod("fireTestRunFinished", ClassTransferHandler.transfer(result, delegate.getClass().getClassLoader()));
    }
    @Override
        invokeMethod("fireTestIgnored", ClassTransferHandler.transfer(description, delegate.getClass().getClassLoader()));
    private void invokeMethod(String methodName, @Nullable Object argument) {
        invokeMethod("fireTestRunStarted", ClassTransferHandler.transfer(description, delegate.getClass().getClassLoader()));
import java.lang.reflect.Method;
            throw new RuntimeException("Error invoking method: " + methodName, e);
        }
    }
            }
    }
                Class<?> clazz = argument.getClass();
        try {
                    clazz = clazz.getSuperclass();
 * you may not use this file except in compliance with the License.
    }

        this.delegate = delegate;
            method = delegate.getClass().getMethod(methodName);
    @Override
import org.junit.runner.Result;
    public RunNotifierDelegate(Object delegate) {
    @Override public void addFirstListener(RunListener listener) {
 * limitations under the License.
import org.junit.runner.notification.RunNotifier;
 * DBeaver - Universal Database Manager
    private final Object delegate;
    public void fireTestStarted(Description description) throws org.junit.runner.notification.StoppedByUserException {
        invokeMethod("fireTestFinished", ClassTransferHandler.transfer(description, delegate.getClass().getClassLoader()));
    @Override
            Method method;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            } else {
        } catch (Exception e) {

    @Override public void fireTestSuiteFinished(Description description) {
    @Override public void fireTestSuiteStarted(Description description) {
    @Override
    }
                method = delegate.getClass().getMethod(methodName, clazz);
                invokeMethod(methodName);
/*
        invokeMethod("addFirstListener", ClassTransferHandler.transfer(listener, delegate.getClass().getClassLoader()));

    }

        invokeMethod("addListener", ClassTransferHandler.transfer(listener, delegate.getClass().getClassLoader()));

public class RunNotifierDelegate extends RunNotifier {
        } catch (Exception e) {
    @Override public void removeListener(RunListener listener) {

 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
        invokeMethod("fireTestStarted", ClassTransferHandler.transfer(description, delegate.getClass().getClassLoader()));
    @Override public void pleaseStop() {
 * See the License for the specific language governing permissions and
        invokeMethod("fireTestSuiteStarted", ClassTransferHandler.transfer(description, delegate.getClass().getClassLoader()));
    }
        invokeMethod("fireTestSuiteFinished", ClassTransferHandler.transfer(description, delegate.getClass().getClassLoader()));

 *
    }

    @Override public void addListener(RunListener listener) {
 * You may obtain a copy of the License at


            if (argument != null) {
 * Copyright (C) 2010-2024 DBeaver Corp and others


                method.invoke(delegate, argument);
            throw new RuntimeException("Error invoking method: " + methodName, e);
    }
    }
 */
    public void fireTestRunStarted(Description description) {

    }
import org.junit.runner.Description;
                if (clazz.getName().contains("RunListenerDelegate")) {
 *     http://www.apache.org/licenses/LICENSE-2.0

                }


 * Unless required by applicable law or agreed to in writing, software
            method.invoke(delegate);
        invokeMethod("fireTestFailure", ClassTransferHandler.transfer(failure, delegate.getClass().getClassLoader()));
    }
        invokeMethod("removeListener", ClassTransferHandler.transfer(listener, delegate.getClass().getClassLoader()));
        }
        invokeMethod("fireTestAssumptionFailed", ClassTransferHandler.transfer(failure, delegate.getClass().getClassLoader()));

}import org.junit.runner.notification.Failure;
    }
        invokeMethod("pleaseStop");
    @Override
package org.jkiss.junit.osgi.delegate;

            Method method;
    @Override
    public void fireTestFailure(Failure failure) {
    public void fireTestFinished(Description description) {
    }

