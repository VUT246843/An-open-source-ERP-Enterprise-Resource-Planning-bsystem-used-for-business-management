 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.model.ai.impl;
        if (count(message) <= tokenLimit) {
        return message.length() / TOKEN_TO_CHAR_RATIO;
        return message.substring(0, Math.min(charLimit, message.length()));
        if (message.isEmpty()) {

 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
}
        }
 * limitations under the License.
        int charLimit = tokenLimit * TOKEN_TO_CHAR_RATIO;
 */
 *
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    @Override
        }
    public int count(String message) {
 * Unless required by applicable law or agreed to in writing, software
            return 0;
public class DummyTokenCounter implements TokenCounter {

 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public String truncateToTokenLimit(String message, int tokenLimit) {

 *
 * you may not use this file except in compliance with the License.
            return message;
 * See the License for the specific language governing permissions and
 *

/*
    public static final int TOKEN_TO_CHAR_RATIO = 2;
