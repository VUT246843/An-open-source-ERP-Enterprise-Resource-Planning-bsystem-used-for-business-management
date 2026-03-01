    String getText(Object element, boolean forUI);
 *
public interface ILabelProviderEx

 * See the License for the specific language governing permissions and
 * Extended label provider
}package org.jkiss.dbeaver.ui;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
 *
 */

 *     http://www.apache.org/licenses/LICENSE-2.0
{
     */
 *
    /**
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
 * limitations under the License.
     * @param forUI text value was requested by UI to represent value on screen. In some cases real value has to be masked - e.g. when custom value renderer is used.
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
/**
     * The same as ILabelProvider.getText but with extra flag.
