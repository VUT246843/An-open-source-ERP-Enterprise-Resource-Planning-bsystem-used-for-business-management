
        names = {"-out", "-output-file"},
    private String outputFile;
        return getPath(outputFile);

    //stdin file name
 *

 *
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.model.cli.model.option;
import org.jkiss.dbeaver.model.fs.DBFPath;
 * See the License for the specific language governing permissions and
public class OutputFileOption extends AbstractFileOption {
        arity = "1",

    @Nullable
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
}
        description = "Write the execution result to a file."
 * Copyright (C) 2010-2025 DBeaver Corp and others
 */
    public DBFPath getOutputFile() {
    @Nullable
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
import picocli.CommandLine;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @CommandLine.Option(
 * Unless required by applicable law or agreed to in writing, software
 *
    )
import org.jkiss.code.Nullable;
