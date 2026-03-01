 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.

    public boolean matches(OSDescriptor os) {

package org.jkiss.dbeaver.model.runtime;
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
    private final boolean exclude;
 * DBeaver - Universal Database Manager
 * Operating system match descriptor

 * you may not use this file except in compliance with the License.
    @Override
    }
/*
        if (exclude) {
 * Copyright (C) 2010-2024 DBeaver Corp and others

            matches = !matches;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public OSDescriptorMatch(String family, String arch, boolean exclude) {
 *
        return matches;
 *
 * See the License for the specific language governing permissions and
 */
 *
    }
        super(family, arch);
        boolean matches = super.matches(os);
/**
public class OSDescriptorMatch extends OSDescriptor {
        }
}
        this.exclude = exclude;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
 */

