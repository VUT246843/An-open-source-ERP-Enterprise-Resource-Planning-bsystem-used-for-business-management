
public class SQLStandardAnalyzerFactory implements LSMAnalyzerFactory {
 * Unless required by applicable law or agreed to in writing, software
    @Override
 * DBeaver - Universal Database Manager
 */

    public LSMAnalyzer createAnalyzer(@NotNull LSMAnalyzerParameters parameters) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
    }
 *
        // do nothing
    @NotNull
import org.jkiss.dbeaver.model.lsm.LSMAnalyzerFactory;
        return new SQLStandardAnalyzer(parameters);
import org.jkiss.dbeaver.model.sql.SQLDialect;
    }
 * limitations under the License.
    public SQLStandardAnalyzerFactory() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
/*
 * you may not use this file except in compliance with the License.
 *
import org.jkiss.dbeaver.model.lsm.LSMAnalyzerParameters;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.lsm.LSMAnalyzer;
 * distributed under the License is distributed on an "AS IS" BASIS,
}
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and

package org.jkiss.dbeaver.model.lsm.sql.dialect;
