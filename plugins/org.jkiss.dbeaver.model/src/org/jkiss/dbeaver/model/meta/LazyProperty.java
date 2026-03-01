
 */
import java.lang.annotation.RetentionPolicy;
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
import java.lang.annotation.Target;
 * Unless required by applicable law or agreed to in writing, software
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
/**
 */
public @interface LazyProperty {

 * Lazy property annotation
package org.jkiss.dbeaver.model.meta;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.lang.annotation.ElementType;
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
@Target(value = {ElementType.METHOD})
 *
import java.lang.annotation.Retention;
    Class<? extends IPropertyCacheValidator> cacheValidator();
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
@Retention(RetentionPolicy.RUNTIME)
/*

}

 *
