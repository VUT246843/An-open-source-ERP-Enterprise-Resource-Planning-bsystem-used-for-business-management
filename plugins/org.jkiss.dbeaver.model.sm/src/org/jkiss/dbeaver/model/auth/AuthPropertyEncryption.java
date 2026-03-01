    // Secure property, value passed to provided as-is
    },
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
        public String encrypt(String salt, String value) {
 *
 */
        @Override
 * See the License for the specific language governing permissions and

 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
 * limitations under the License.
import org.jkiss.utils.SecurityUtils;
        }
    // Secure property, value passed as MD5 hash
 * DBeaver - Universal Database Manager
/**
 */
        }
            return value;
        public String encrypt(String salt, String value) {
/*
 *
            return SecurityUtils.makeDigest(salt, value);
}

        public String encrypt(String salt, String value) {
    public abstract String encrypt(String salt, String value);
 * you may not use this file except in compliance with the License.
    };
    plain {
    // Non-secure property
            return value;
        @Override
 * Auth provider property encryption
    none {

public enum AuthPropertyEncryption {
    hash {
        @Override
 * Unless required by applicable law or agreed to in writing, software
    },
        }
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.model.auth;
