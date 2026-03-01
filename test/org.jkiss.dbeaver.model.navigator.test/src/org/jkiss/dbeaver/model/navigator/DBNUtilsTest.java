 * You may obtain a copy of the License at
public class DBNUtilsTest extends DBeaverUnitTest {

    private void assertRemainUnsorted() {

    private final List<String> changedProperties = new ArrayList<>();
        assertEquals(expectedNames, Arrays.stream(result).map(DBNNode::getNodeDisplayName).toList());
        assertCorrectSortingIgnoreCase(List.of("a", "A", "b", "C"), List.of("b", "a", "A", "C"));
        // given
    public void shouldNotSortByNameIfAlphabeticallyIfAlphabeticallyFalse() {
    @After
    @Test
    }

    }

    private void addProperty(String key, boolean value) {

    }
    public void shouldSortWithCaseWhenIgnoreCaseFalse(){
    private void assertCorrectSortingIgnoreCase(List<String> expectedNames, List<String> givenNames) {

    }
        addProperty(ModelPreferences.NAVIGATOR_SORT_IGNORE_CASE, true);
        var result = DBNUtils.filterNavigableChildren(getNamedNodes(givenNames), true);
        if (!prefStore.contains(key)) {

        addProperty(ModelPreferences.NAVIGATOR_SORT_IGNORE_CASE, false);
import org.jkiss.dbeaver.ModelPreferences;
        //then
        addProperty(ModelPreferences.NAVIGATOR_SORT_FOLDERS_FIRST, isFoldersFirst);
        assertCorrectSortingIgnoreCase(List.of("s1123456789123456789", "s2123456789123456789"), List.of("s2123456789123456789", "s1123456789123456789"));
 * you may not use this file except in compliance with the License.
            List.of("s1123456789123456789", "s2123456789123456789"),


    }
import org.junit.Test;
import java.util.ArrayList;
        var prefStore = DBWorkbench.getPlatform().getPreferenceStore();
    private void assertCorrectSortingIgnoreCase(boolean isFoldersFirst) {
        assertCorrectSortingWithCase(true);
package org.jkiss.dbeaver.model.navigator;
/*
        assertCorrectSortingIgnoreCase(false);
        //then
            throw new IllegalArgumentException("No such property: " + key);
        assertEquals(expectedNames, Arrays.stream(result).map(DBNNode::getNodeDisplayName).toList());
        return names
    @Test
    public void shouldNotSortByNameIfAlphabeticallyFalseAndByFolderTrue() {

        assertCorrectSortingIgnoreCase(List.of("A", "C", "a", "b"), List.of("b", "a", "A", "C"));
 * limitations under the License.

        prefStore.setValue(key, value);
    private DBNNode[] getNamedNodes(List<String> names) {
        );
        // given
    public void tearDown() {
        var result = DBNUtils.filterNavigableChildren(getNamedNodes(givenNames), true);
        assertRemainUnsorted();
        addProperty(ModelPreferences.NAVIGATOR_SORT_FOLDERS_FIRST, false);
 *
        List<String> givenNames = List.of("b", "a", "A", "C");
        addProperty(ModelPreferences.NAVIGATOR_SORT_ALPHABETICALLY, true);
        var prefStore = DBWorkbench.getPlatform().getPreferenceStore();
}
    }
    private void assertCorrectSortingWithCase(boolean isFoldersFirst) {
        assertCorrectSortingWithCase(false);

        assertRemainUnsorted();
    }
            .map(this::createMockNamedNode)
    @Test
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        //then
        when(node.getNodeDisplayName()).thenReturn(name);
    }
        // given

    public void shouldSortIgnoreCaseWhenIgnoreCaseTrue(){

    }
import org.jkiss.junit.DBeaverUnitTest;
    }
import java.util.List;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            .toArray(DBNNode[]::new);
        List<String> expectedNames = List.of("b", "a", "A", "C");
        assertCorrectSortingIgnoreCase(true);
        addProperty(ModelPreferences.NAVIGATOR_SORT_ALPHABETICALLY, false);
        return node;
        assertCorrectSortingIgnoreCase(List.of("s1", "s2", "s03", "s10"), List.of("s2", "s1", "s10", "s03"));
import org.junit.After;
            .stream()
 *
        addProperty(ModelPreferences.NAVIGATOR_SORT_FOLDERS_FIRST, isFoldersFirst);
        //then
        // then

        // then
        assertCorrectSortingIgnoreCase(
        assertCorrectSortingIgnoreCase(List.of("s1", "s2", "s03", "s10"), List.of("s2", "s1", "s10", "s03"));


 *

 * DBeaver - Universal Database Manager
import java.util.Arrays;
        changedProperties.forEach(prefStore::setToDefault);
        addProperty(ModelPreferences.NAVIGATOR_SORT_ALPHABETICALLY,  true);

        // when
        addProperty(ModelPreferences.NAVIGATOR_SORT_FOLDERS_FIRST, true);
        changedProperties.clear();
        changedProperties.add(key);

        // given
        }
            List.of("s2123456789123456789", "s1123456789123456789")
import org.jkiss.dbeaver.runtime.DBWorkbench;
        DBNNode node = mock(DBNNode.class, RETURNS_DEEP_STUBS);

 * Copyright (C) 2010-2025 DBeaver Corp and others
        addProperty(ModelPreferences.NAVIGATOR_SORT_ALPHABETICALLY, false);
 */
    private DBNNode createMockNamedNode(String name) {
    @Test
import static org.mockito.Mockito.*;
import static junit.framework.TestCase.assertEquals;
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
