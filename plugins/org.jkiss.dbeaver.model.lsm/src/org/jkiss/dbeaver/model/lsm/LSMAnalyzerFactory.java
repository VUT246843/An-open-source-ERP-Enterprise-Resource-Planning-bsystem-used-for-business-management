    @NotNull

 */
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
     * Creates analyzer instance, parametrized with a given dialect
    LSMAnalyzer createAnalyzer(@NotNull LSMAnalyzerParameters parameters);
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.sql.SQLDialect;
 * limitations under the License.
import org.jkiss.code.NotNull;
 * Factory responsible for creating analyzer instances, parametrized with a given dialect
     */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
public interface LSMAnalyzerFactory {
 *
    /**
 */
/*

 * you may not use this file except in compliance with the License.
}
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.model.lsm;
 * Copyright (C) 2010-2024 DBeaver Corp and others
/**
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
