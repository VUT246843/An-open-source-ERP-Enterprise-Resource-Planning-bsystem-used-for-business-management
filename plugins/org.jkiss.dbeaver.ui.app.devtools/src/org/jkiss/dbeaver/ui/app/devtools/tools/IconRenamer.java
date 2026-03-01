

					targetName = fileName.substring(0, divPos) + "@2x.png";
 */
public class IconRenamer {
	}
				//icon.renameTo(new File(icon.getParent(), targetName));
 * See the License for the specific language governing permissions and
		}
			for (File icon : icons) {
				}
				} else {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	}
				String fileName = icon.getName();
}
 *
 * you may not use this file except in compliance with the License.

		File[] icons = new File("C:\\devel\\my\\ext\\new-icons\\Icons_set1\\").listFiles(new FilenameFilter() {
				fileName = fileName.substring(0, divPos) + fileName.substring(divPos + 6);
					dir);

					continue;
				process.waitFor();
		}
			for (File icon : icons) {
		File dir = new File("C:\\devel\\my\\dbeaver-packaging\\docs\\branding3\\Icons\\tree\\");
					new String[]{"git", "mv", fileName, targetName},
		});
	public static void main(String[] args) throws Exception {
 *
				final String fileName = icon.getName().toLowerCase();
	private static void fixIconSet2() throws Exception {
				}
package org.jkiss.dbeaver.ui.app.devtools.tools;
					targetName = fileName;
				Process process = Runtime.getRuntime().exec(
	private static void fixIconSet1() {
				return name.endsWith(".png");
				if (fileName.lastIndexOf('@') != -1) {
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
			}
 * Copyright (C) 2010-2025 DBeaver Corp and others
				int divPos = fileName.lastIndexOf('_');
import java.io.File;
				fileName = fileName.substring(6);
				int divPos = fileName.lastIndexOf('.');
			}
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
			public boolean accept(File dir, String name) {
		//fixIconSet1();
				icon.renameTo(new File(icon.getParent(), fileName));

					null,
 * Unless required by applicable law or agreed to in writing, software
		fixIconSet2();
				String targetName;
 *     http://www.apache.org/licenses/LICENSE-2.0
	}
				System.out.println(fileName);
/*
			@Override
			}
import java.io.FilenameFilter;
				if (divPos != -1) {
		if (icons != null) {

				fileName = fileName.toLowerCase();

		if (icons != null) {
 *
				System.out.println(fileName + "->" + targetName);
 * Licensed under the Apache License, Version 2.0 (the "License");
		File[] icons = dir.listFiles((d, name) -> name.endsWith(".png"));
