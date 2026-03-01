 *

@RunnerProxy(MockitoJUnitRunner.class)
import org.jkiss.junit.osgi.annotation.RunnerProxy;
 * distributed under the License is distributed on an "AS IS" BASIS,
public abstract class ApplicationUnitTest {
 *
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
@RunWith(OSGITestRunner.class)
 *
import org.jkiss.junit.osgi.OSGITestRunner;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.junit.osgi.annotation.RunWithApplication;
 * Licensed under the Apache License, Version 2.0 (the "License");
@RunWithApplication(bundleName = "org.jkiss.dbeaver.headless", registryName = "org.jkiss.dbeaver.headless.application")
 * you may not use this file except in compliance with the License.
/*
 * You may obtain a copy of the License at

import org.junit.runner.RunWith;
 *     http://www.apache.org/licenses/LICENSE-2.0

package org.jkiss.junit;
import org.mockito.junit.MockitoJUnitRunner;
}

 */
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
