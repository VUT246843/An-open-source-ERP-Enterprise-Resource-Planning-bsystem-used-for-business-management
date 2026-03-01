 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * limitations under the License.
import java.util.regex.Pattern;
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
public interface CommandLineConstants {
 * See the License for the specific language governing permissions and

 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * You may obtain a copy of the License at
package org.jkiss.dbeaver.launcher;
 *
    Pattern ACTION_PATTERN = Pattern.compile("\"postAction\"\s*:\s*\"([^,]*)\",");
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
    Pattern OUTPUT_PATTERN = Pattern.compile("\"output\" *: *\\[\"(.*?)\"]}");
}
    Pattern EXIT_CODE_PATTERN = Pattern.compile("\"exitCode\"\s*:\s*(\\d+),");
