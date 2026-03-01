        //when
        //then
        //when
 *     http://www.apache.org/licenses/LICENSE-2.0
        //when
import static org.junit.Assert.assertEquals;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and

        //given
 *
public class OpenAIModelsTest extends DBeaverUnitTest {
 */
 * you may not use this file except in compliance with the License.
        var inputModelName = expectedModelName.toUpperCase();
        //given
        //then
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
        assertEquals(inputModelName, result);
        var result = getEffectiveModelName(inputModelName);

import org.junit.Test;
    public void effectiveModelNameKnownUppercaseShouldReturnKnownModelLowercase() {
    public void effectiveModelNameNullShouldReturnDefaultModelName() {
import static org.junit.Assume.assumeFalse;
        //then
    }


package org.jkiss.dbeaver.model.ai.engine.openai;
 * limitations under the License.
    }
import static org.jkiss.dbeaver.model.ai.engine.openai.OpenAIModels.*;
/*
        var result = getEffectiveModelName(inputModelName);

    @Test
        assertEquals(expectedModelName, result);

    }
import org.jkiss.junit.DBeaverUnitTest;
        var expectedModelName = KNOWN_MODELS.keySet().stream().findFirst().orElseThrow();
}
    @Test
 * Copyright (C) 2010-2025 DBeaver Corp and others

 * DBeaver - Universal Database Manager
        assumeFalse(KNOWN_MODELS.containsKey(inputModelName.toLowerCase()));
        assertEquals(DEFAULT_MODEL, result);
 *
    @Test

    public void effectiveModelNameUnknownUppercaseShouldReturnKnownModelUppercase() {
        var inputModelName = "some-UNKNOWN-MODEL";
 * You may obtain a copy of the License at
 *
        var result = getEffectiveModelName(null);
