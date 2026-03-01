
    public boolean shouldRun(Description description) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return method.invoke(filter);
 * limitations under the License.
            throw new RuntimeException("Error invoking method: " + methodName, e);
import org.junit.runner.manipulation.Filter;
                method.setAccessible(true);
        }
        } catch (Exception e) {

 * You may obtain a copy of the License at

/**
 *     http://www.apache.org/licenses/LICENSE-2.0
            Method method;
 * to load it in the same classloader as the test class.
    @Override
    }
        return (String) invokeMethod("describe", null);
    public ProxyFilter(@NotNull Object filter) {
 * Proxy filter for transferring {@link Filter} to another classloader
        try {
    }
            throw new RuntimeException("Error invoking method: " + methodName, e);
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
 * Unless required by applicable law or agreed to in writing, software
    Object filter;
 *

    public String describe() {
        this.filter = filter;
    private Object invokeMethod(@NotNull String methodName) {
            method = filter.getClass().getDeclaredMethod(methodName);
 * you may not use this file except in compliance with the License.
 *
    @Override
public class ProxyFilter extends Filter {
    }

                method = filter.getClass().getDeclaredMethod(methodName, argument.getClass());
import org.junit.runner.Description;
import java.lang.reflect.Method;
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
        } catch (Exception e) {
            method.setAccessible(true);
package org.jkiss.junit.osgi.delegate;
}

 *
            Method method;
            if (argument != null) {
            } else {
        try {
 */
 */
        return (boolean) invokeMethod("shouldRun", ClassTransferHandler.transfer(description, filter.getClass().getClassLoader()));
    private Object invokeMethod(@NotNull String methodName, @Nullable Object argument) {
    }
import org.jkiss.code.NotNull;
import org.jkiss.code.Nullable;
                return method.invoke(filter, argument);
/*
                return invokeMethod(methodName);
    }


