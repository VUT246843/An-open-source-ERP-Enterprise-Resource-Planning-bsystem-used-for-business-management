    @CommandLine.Option(
 *
 * you may not use this file except in compliance with the License.
 * limitations under the License.
        arity = "1",
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
    public DBFPath getInputFile() {
    )
 * Copyright (C) 2010-2025 DBeaver Corp and others
        names = {"-in", "-input-file"},
import picocli.CommandLine;
        return getPath(inputFile);
/*
 *
public class InputFileOption extends AbstractFileOption {
 *     http://www.apache.org/licenses/LICENSE-2.0
}

package org.jkiss.dbeaver.model.cli.model.option;
import org.jkiss.dbeaver.model.fs.DBFPath;
    private String inputFile;
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
 * See the License for the specific language governing permissions and

    @Nullable

import org.jkiss.code.Nullable;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
        description = "Argument value that can be written in the file."
    @Nullable
 * Unless required by applicable law or agreed to in writing, software
