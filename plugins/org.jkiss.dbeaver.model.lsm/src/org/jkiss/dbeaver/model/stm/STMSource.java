    /**
import org.antlr.v4.runtime.CharStream;

 */
    @NotNull
 * Unless required by applicable law or agreed to in writing, software
    public static STMSource fromString(String string) {
public interface STMSource {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
package org.jkiss.dbeaver.model.stm;
 * You may obtain a copy of the License at
 * Source stream for syntax analysis
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.antlr.v4.runtime.CharStreams;
/**
     * Prepare source based on text string
     */
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager

     * Prepare source based on text reader

 * See the License for the specific language governing permissions and
    /**
     * Get characters stream

import org.jkiss.code.NotNull;
/*
    }
import java.io.IOException;
    }
     */
}
 */
 * limitations under the License.
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
import java.io.Reader;
    public static STMSource fromReader(@NotNull Reader reader) throws IOException {
        return () -> CharStreams.fromString(string);
 *

    /**
 *
    CharStream getStream();

     */
        return new STMSourceImpl(reader);
