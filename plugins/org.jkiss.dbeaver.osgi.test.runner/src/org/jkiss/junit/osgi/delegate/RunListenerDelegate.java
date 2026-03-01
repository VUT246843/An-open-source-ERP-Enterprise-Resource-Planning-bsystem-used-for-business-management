/**
        } catch (Exception e) {
    public void testRunStarted(Description description) throws Exception {
 * Unless required by applicable law or agreed to in writing, software
    public void testIgnored(Description description) throws Exception {
    }
        invokeMethod("fireTestRunFinished", ClassTransferHandler.transfer(result, delegate.getClass().getClassLoader()));

import org.junit.runner.Result;
            Method method;
 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;
    private void invokeMethod(@NotNull String methodName, @Nullable Object argument) {

    }
import org.junit.runner.notification.RunListener;
                method = delegate.getClass().getDeclaredMethod(methodName, argument.getClass());
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 * limitations under the License.
            if (argument != null) {
    }
import org.junit.runner.notification.Failure;
            throw new RuntimeException("Error invoking method: " + methodName, e);
import org.jkiss.code.Nullable;
    }
    @Override

 *
        invokeMethod("fireTestStarted", ClassTransferHandler.transfer(description, delegate.getClass().getClassLoader()));
    }
            } else {
    }
    @Override

        try {

        }
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
public class RunListenerDelegate extends RunListener {
    private final Object delegate;
    @Override

        invokeMethod("fireTestFinished", ClassTransferHandler.transfer(description, delegate.getClass().getClassLoader()));

            method.invoke(delegate);
                invokeMethod(methodName);
    public void testRunFinished(Result result) throws Exception {
            Method method;
        }
        invokeMethod("fireTestFailure", ClassTransferHandler.transfer(failure, delegate.getClass().getClassLoader()));
        invokeMethod("fireTestSuiteFinished", ClassTransferHandler.transfer(description, delegate.getClass().getClassLoader()));
    }

        invokeMethod("fireTestIgnored", ClassTransferHandler.transfer(description, delegate.getClass().getClassLoader()));
import java.lang.reflect.Method;


 * DBeaver - Universal Database Manager
    public void testStarted(Description description) throws Exception {
import org.junit.runner.Description;
        invokeMethod("fireTestAssumptionFailure", ClassTransferHandler.transfer(failure, delegate.getClass().getClassLoader()));
            method = delegate.getClass().getDeclaredMethod(methodName);
    }
        } catch (Exception e) {

}
            throw new RuntimeException("Error invoking method: " + methodName, e);
                method.invoke(delegate, argument);
        try {
            }

 * See the License for the specific language governing permissions and
    @Override
        invokeMethod("fireTestRunStarted", ClassTransferHandler.transfer(description, delegate.getClass().getClassLoader()));
    public void testSuiteStarted(Description description) throws Exception {
 * Licensed under the Apache License, Version 2.0 (the "License");

/*

 * You may obtain a copy of the License at
    public void testFinished(Description description) throws Exception {
    }

        this.delegate = delegate;
    public void testFailure(Failure failure) throws Exception {
 */
package org.jkiss.junit.osgi.delegate;
    public void testSuiteFinished(Description description) throws Exception {
    }
    @Override
 * Serializes and transfers object to another classloaders
        invokeMethod("fireTestSuiteStarted", ClassTransferHandler.transfer(description, delegate.getClass().getClassLoader()));
    public void testAssumptionFailure(Failure failure) {
    @Override
    private void invokeMethod(String methodName) {
    public RunListenerDelegate(Object delegate) {
 *
    }
 * distributed under the License is distributed on an "AS IS" BASIS,

    @Override
