
    public void testRunStarted(Description description) throws Exception {
    }
import org.junit.runner.Result;

        super.testFailure(failure);
    public void testSuiteStarted(Description description) throws Exception {
 */

    @Override
 * This class is used to delegate test run events to dynamic listener
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
    public void testIgnored(Description description) throws Exception {


    @Override
    }
 * you may not use this file except in compliance with the License.
    }
    public void testFinished(Description description) throws Exception {
/*
import org.jkiss.junit.osgi.delegate.RunListenerDelegate;
    public void testSuiteFinished(Description description) throws Exception {
}
    public void testAssumptionFailure(Failure failure) {
    }
    @Override
 * limitations under the License.
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager

 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
public class OSGITestRunListener extends RunListenerDelegate {
    public void testRunFinished(Result result) throws Exception {
import org.junit.runner.Description;
        super.testAssumptionFailure(failure);


        super.testSuiteStarted(description);
 *
        super.testSuiteStarted(description);

    @Override
    @Override
    public void testStarted(Description description) throws Exception {
 *
    public void testFailure(Failure failure) throws Exception {
        super.testRunFinished(result);
    }

        super.testIgnored(description);

        super.testStarted(description);
    @Override
 * See the License for the specific language governing permissions and
 * OSGI test run listener delegate

    }
package org.jkiss.junit.osgi;
        super(dynamicListener);
/**
        super.testFinished(description);
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
        super.testSuiteFinished(description);
    }
import org.junit.runner.notification.Failure;
    @Override
    }
    }
    public OSGITestRunListener(Object dynamicListener) {
    @Override
