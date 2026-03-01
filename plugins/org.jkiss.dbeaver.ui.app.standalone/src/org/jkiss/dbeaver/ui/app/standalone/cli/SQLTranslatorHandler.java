            throw new IllegalStateException("Input file not specified");

 * DBeaver - Universal Database Manager
        String inputFile = args[1];
        try {
import org.jkiss.utils.IOUtils;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
            }
        String result = null;
 *
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
import org.jkiss.dbeaver.model.cli.CLIAbstractSubcommand;

import java.io.FileReader;
        String dialect = args[0];
 * You may obtain a copy of the License at
        SQLDialect targetDialect = new BasicSQLDialect() {
        String[] args = value.split(",");

        } catch (IOException e) {
import org.jkiss.dbeaver.model.sql.translate.SQLQueryTranslator;
        }
        SQLDialect srcDialect = new BasicSQLDialect() {
            @Override
    @Override
import org.jkiss.utils.CommonUtils;
            result = SQLQueryTranslator.translateScript(srcDialect, targetDialect, preferenceStore, script);
package org.jkiss.dbeaver.ui.app.standalone.cli;
import picocli.CommandLine;
    @CommandLine.Parameters(index = "0", description = "Parameter in the form dialect=filePath", arity = "1")

    public void run() {
 * limitations under the License.

            script = IOUtils.readToString(fr);
 *
    }
        DBPPreferenceStore preferenceStore = new SimplePreferenceStore() {
        };
        preferenceStore.setValue(SQLModelPreferences.SQL_FORMAT_FORMATTER, "default");
    private String value;

 * Copyright (C) 2010-2026 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,

        try (FileReader fr = new FileReader(inputFile)) {
        if (args.length != 2) {
        System.out.println(result);

}import org.jkiss.dbeaver.model.impl.preferences.SimplePreferenceStore;
import org.jkiss.dbeaver.model.sql.SQLModelPreferences;
        }
/*
            throw new RuntimeException("Error translating file " + inputFile, e);
    private static final Log log = Log.getLog(SQLTranslatorHandler.class);
 */
        };
import org.jkiss.dbeaver.Log;
        } catch (Exception e) {
        String script;
 *     http://www.apache.org/licenses/LICENSE-2.0
        };
            throw new RuntimeException("Error opening input file " + inputFile, e);
 *
import org.jkiss.dbeaver.model.sql.SQLDialect;
            throw new IllegalStateException("Input parameter format: dialect,<input-file-path>");
    description = "Translate SQL script from one dialect to another")
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect;
        if (CommonUtils.isEmpty(inputFile)) {


        }
public class SQLTranslatorHandler extends CLIAbstractSubcommand {

 * Licensed under the Apache License, Version 2.0 (the "License");
            public void save() throws IOException {


@CommandLine.Command(name = "translateSQL", aliases = {"-translateSQL", "-translate-sql-script"},
 * you may not use this file except in compliance with the License.
import java.io.IOException;
