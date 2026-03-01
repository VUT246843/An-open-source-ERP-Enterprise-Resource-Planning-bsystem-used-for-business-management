 *
	@NotNull


 * Copyright (C) 2010-2025 DBeaver Corp and others
	int getLength();
	TPTextRegion getLineInformation(int line);
	char getChar(int offset);
/**
 *
public interface TPTextDocument {

	@NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
	TPTextRegion getLineInformationOfOffset(int offset);
	@NotNull
	void set(@NotNull String text);
	int getNumberOfLines();

}
	@NotNull
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
	String get(int offset, int length);
	/* ------------------ line delimiter conversion --------------------------- */
 */
	void replace(int offset, int length, @NotNull String text);
 * Licensed under the Apache License, Version 2.0 (the "License");



	int getLineOffset(int line);
	String getLineDelimiter(int line);
	String[] getLegalLineDelimiters();
 * DBeaver - Universal Database Manager

	@NotNull
	String get();
 * See the License for the specific language governing permissions and

 * Document
 *     http://www.apache.org/licenses/LICENSE-2.0

	int getLineOfOffset(int offset);


import org.jkiss.code.NotNull;
	@NotNull

/*



 * you may not use this file except in compliance with the License.

package org.jkiss.dbeaver.model.text;
 *


 */
