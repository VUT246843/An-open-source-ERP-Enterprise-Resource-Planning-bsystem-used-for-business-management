 * Licensed under the Apache License, Version 2.0 (the "License");
    String registryName();
    /**
 * Run with product used for @{@link OSGITestRunner}
public @interface RunWithApplication {
        String name();
     * Application parameters
/*
 */
 * you may not use this file except in compliance with the License.
    String[] args() default {};
     */
    /**

 * See {@link org.jkiss.junit.osgi.OSGITestRunner}


    Property[] properties() default {};
 *     http://www.apache.org/licenses/LICENSE-2.0
     */
     * Bundle name with application

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    /**
 * limitations under the License.

     */
 * Annotation to provide an application parameters for OSGI tests
 *
     * Force include bundles
}

 *
/**
    String bundleName();
import org.jkiss.junit.osgi.OSGITestRunner;

        String value();
     */
 * See the License for the specific language governing permissions and

@Inherited

 * Copyright (C) 2010-2026 DBeaver Corp and others
 *
    String[] forceDependencies() default {};
    @interface Property {
 * DBeaver - Universal Database Manager
@Target(ElementType.TYPE)
    String [] vmArgs() default {};
 * Unless required by applicable law or agreed to in writing, software
     Application classname
@Retention(RetentionPolicy.RUNTIME)

package org.jkiss.junit.osgi.annotation;
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.lang.annotation.*;
 */
    /**
 * You may obtain a copy of the License at
    }
