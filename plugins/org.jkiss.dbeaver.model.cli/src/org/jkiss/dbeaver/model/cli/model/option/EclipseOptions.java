 * some properties were hidden and exists to avoid unmatched options error
public class EclipseOptions {
 */
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
 * Unless required by applicable law or agreed to in writing, software

    private String data;
 */

 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
 * Eclipse options, we do not process them,
/*
 * You may obtain a copy of the License at
    // Eclipse options do nothing in our code
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
import picocli.CommandLine;
/**
    @CommandLine.Option(names = {"-data"}, arity = "1", description = "Workspace location")
    private String nl;
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    @CommandLine.Option(names = {"-nl"}, arity = "1", description = "Default locale")
package org.jkiss.dbeaver.model.cli.model.option;
 * you may not use this file except in compliance with the License.
}
