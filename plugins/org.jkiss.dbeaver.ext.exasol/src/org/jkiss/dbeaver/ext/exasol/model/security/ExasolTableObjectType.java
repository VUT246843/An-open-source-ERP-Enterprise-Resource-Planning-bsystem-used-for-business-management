package org.jkiss.dbeaver.ext.exasol.model.security;
	}
	
	TABLE("TABLE"),
 * See the License for the specific language governing permissions and
	SCHEMA("TABLE"),
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
	
		return this.value;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
 *
 *
 * Copyright (C) 2016-2016 Karl Griesser (fullref@gmail.com)
public enum ExasolTableObjectType {
 */
	public String getDescription()
	VIEW("VIEW"),
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
	
 *     http://www.apache.org/licenses/LICENSE-2.0
	SCRIPT("SCRIPT");

}
	{
 * You may obtain a copy of the License at
	{
/*
 * limitations under the License.
 * DBeaver - Universal Database Manager
	}
	private String value;
	ExasolTableObjectType(String value)
		this.value = value;
