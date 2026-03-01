
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
        return arch == null || (os.arch != null && arch.equals(os.arch));
    public OSDescriptor(String family, String arch) {
    }
/**
    private final String arch;
        if (!family.equals(os.family)) {
    }



 *
        this.family = family;
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
        return family + " " + arch;
public class OSDescriptor {
}
            return false;
    public String toString() {
 * distributed under the License is distributed on an "AS IS" BASIS,

 *
    public boolean matches(OSDescriptor os) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
    @Override
    private final String family;
 * Unless required by applicable law or agreed to in writing, software
/*
 */
        this.arch = arch;
 *
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.model.runtime;
    }
 * Operating system descriptor
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
