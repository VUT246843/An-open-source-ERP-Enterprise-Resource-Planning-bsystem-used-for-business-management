        return Character.isUnicodeIdentifierStart(c);
 *
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Determines whether a given character is valid as part of an SQL keyword in

 */
 * the current context.
    }
        return Character.isUnicodeIdentifierPart(c) || c == '$';
 *
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
public class TPWordDetector
    public boolean isWordPart(char c) {
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.model.text.parser;
} * limitations under the License.

 * Copyright (C) 2010-2024 DBeaver Corp and others
{
 *

/*
/**
    }
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager

 *     http://www.apache.org/licenses/LICENSE-2.0
    public boolean isWordStart(char c) {
