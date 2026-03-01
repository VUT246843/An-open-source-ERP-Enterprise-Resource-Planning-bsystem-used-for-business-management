        if (exclusions != null) {
        List<MavenArtifactReference> exclusions = source.getExclusions();
        this.source = source;
    protected boolean isDependencyExcluded(DBRProgressMonitor monitor, MavenArtifactDependency dependency) {
import org.jkiss.dbeaver.registry.maven.MavenArtifactDependency;
    public DriverLibraryMavenDependency(DriverLibraryMavenArtifact parent, MavenArtifactVersion localVersion, MavenArtifactDependency source) {
                if (exReference.getGroupId().equals(dependency.getGroupId()) && exReference.getArtifactId().equals(dependency.getArtifactId())) {
 */
{
        super(parent.getDriver(), FileType.jar, PATH_PREFIX + localVersion.toString(), null);

 *
    private DriverLibraryMavenArtifact parent;
import org.jkiss.dbeaver.registry.maven.MavenArtifactReference;
public class DriverLibraryMavenDependency extends DriverLibraryMavenArtifact

 * DBeaver - Universal Database Manager

    }
 *
 * DriverLibraryDescriptor


 * distributed under the License is distributed on an "AS IS" BASIS,
/*
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.registry.maven.MavenArtifactVersion;
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }

 * You may obtain a copy of the License at
        this.localVersion = localVersion;
            for (MavenArtifactReference exReference : exclusions) {
 */
            }
 * See the License for the specific language governing permissions and
        this.parent = parent;
        return parent.isDependencyExcluded(monitor, dependency);
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.List;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    private MavenArtifactDependency source;
/**
                    return true;
                }
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.registry.driver;
}
 *

