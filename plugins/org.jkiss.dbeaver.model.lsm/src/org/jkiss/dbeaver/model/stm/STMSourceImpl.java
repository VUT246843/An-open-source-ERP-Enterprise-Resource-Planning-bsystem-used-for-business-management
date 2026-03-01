    
 *
 * See the License for the specific language governing permissions and
/*

        this.stream = CharStreams.fromReader(reader);
    @NotNull
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
    public STMSourceImpl(@NotNull Reader reader) throws IOException {
 */
 *
 *
    public CharStream getStream() {
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.antlr.v4.runtime.CharStreams;
}
 * You may obtain a copy of the License at
public class STMSourceImpl implements STMSource {

package org.jkiss.dbeaver.model.stm;
 * Unless required by applicable law or agreed to in writing, software
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.io.IOException;
    private final CharStream stream;
    

import org.jkiss.code.NotNull;
import java.io.Reader;
 * limitations under the License.
 * DBeaver - Universal Database Manager

        return this.stream;
import org.antlr.v4.runtime.CharStream;
    }    

