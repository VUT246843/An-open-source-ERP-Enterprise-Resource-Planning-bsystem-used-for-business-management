 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
import org.eclipse.osgi.internal.hookregistry.ClassLoaderHook;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public Enumeration<URL> preFindResources(String name, ModuleClassLoader classLoader) throws FileNotFoundException {
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ui.app.standalone.internal;
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.Enumeration;
 *     http://www.apache.org/licenses/LICENSE-2.0

 */
public class PatchClassLoaderHook extends ClassLoaderHook {
 *
    }
 *
/*
        return null;

 * See the License for the specific language governing permissions and
    public URL preFindResource(String name, ModuleClassLoader classLoader) throws FileNotFoundException {
 * limitations under the License.
 * DBeaver - Universal Database Manager

}

import java.net.URL;
import java.io.FileNotFoundException;
    @Override

 * you may not use this file except in compliance with the License.
    }
import org.eclipse.osgi.internal.loader.ModuleClassLoader;
 * Unless required by applicable law or agreed to in writing, software
    @Override
        return super.preFindResources(name, classLoader);
