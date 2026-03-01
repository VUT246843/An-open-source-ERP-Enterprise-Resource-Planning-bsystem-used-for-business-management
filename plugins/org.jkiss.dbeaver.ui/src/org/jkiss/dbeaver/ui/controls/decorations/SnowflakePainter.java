 * DBeaver - Universal Database Manager
        var clip = atlas.getClip(particle.type, particle.mip);

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.widgets.Display;
        );
                    // Sorry little fella, you have to die
                SnowflakeIcons.FLAKE_8,
            Particle particle = it.next();
                    particle.origin.setLocation(origin, particle.origin.y);
        }
    private final Random random;
 * distributed under the License is distributed on an "AS IS" BASIS,

                SnowflakeIcons.FLAKE_12
import java.util.Random;
        );
import java.util.ArrayList;
        for (int i = particles.size(); i < limit; i++) {
import org.eclipse.swt.graphics.GC;
            this.origin = origin;
        private final int type;
 *
    public void dispose() {
    private static final Point2D.Double AMPLITUDE = new Point2D.Double(25.0, 50.0);
            clip.width,
                SnowflakeIcons.FLAKE_1,
        for (var it = particles.iterator(); it.hasNext(); ) {
/*
            clip.height
            clip.width,
        private double swing;
import java.util.List;

            this.amplitude = amplitude;
    @Override
    private final SnowflakeAtlas atlas;
}
                new Point2D.Double(random.nextDouble(width), -random.nextDouble(height)),
                SnowflakeIcons.FLAKE_6,
import org.jkiss.code.NotNull;
    }

import org.eclipse.swt.graphics.RGB;
            paint(gc, particle);
            particle.update(dt);
    }
        gc.drawImage(


                }
        atlas.dispose();
        for (Particle particle : particles) {
            (int) particle.position.y,
    }
        private final Point2D.Double position;

        this.random = new Random();
                random.nextInt(0, atlas.mips()),
            this.position = (Point2D.Double) origin.clone();
                SnowflakeIcons.FLAKE_2,
        }

    private static class Particle {
            (int) particle.position.x,
    private static int computeMaxSnowflakes(int width, int height) {
        private final int mip;
            this.swing = swing;
                    particle.swing = random.nextDouble(100);
            display,
    }
        particles.clear();
package org.jkiss.dbeaver.ui.controls.decorations;
    public void paint(@NotNull GC gc) {
        private final double amplitude;
            int size = atlas.getSize(particle.mip);
final class SnowflakePainter implements Painter {
            4
        this.particles = new ArrayList<>();
            ),
            particles.add(new Particle(
    public SnowflakePainter(@NotNull Display display) {
            40,
                random.nextInt(0, atlas.count()),
        }
                random.nextDouble(100)
            position.setLocation(origin.x + amplitude * Math.sin(swing), position.y + velocity.y * deltaTime);
    private static final Point2D.Double SPEED = new Point2D.Double(40.0, 100.0);
 * Unless required by applicable law or agreed to in writing, software
                } else {
import java.awt.geom.Point2D;
            }
 * You may obtain a copy of the License at
    private final List<Particle> particles;
        private final Point2D.Double origin;
    public void reset(int width, int height) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
        return (int) Math.max(1, width * height * DENSITY);
                SnowflakeIcons.FLAKE_5,
            new RGB(204, 0.70f, 0.80f),
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public void update(int width, int height, double dt) {

    @Override
        }
            clip.height,
 */

                    it.remove();
    private void paint(@NotNull GC gc, @NotNull Particle particle) {
    @Override
                SnowflakeIcons.FLAKE_4,
                SnowflakeIcons.FLAKE_9,
    private static final double DENSITY = 0.0001;
        int limit = computeMaxSnowflakes(width, height);
                    var origin = random.nextDouble(width);
        private final Point2D.Double velocity;
    @Override
            this.type = type;
            if (particle.position.y - size > height) {

            clip.x,
 *
            clip.y,
                SnowflakeIcons.FLAKE_11,

    }
 *
                new Point2D.Double(random.nextDouble(SWING.x, SWING.y), random.nextDouble(SPEED.x, SPEED.y)),

                SnowflakeIcons.FLAKE_10,
                    particle.position.setLocation(origin, -size);
 * you may not use this file except in compliance with the License.
            this.mip = mip;
            swing += velocity.x * deltaTime;
                SnowflakeIcons.FLAKE_3,
                random.nextDouble(AMPLITUDE.x, AMPLITUDE.y),
    }
            8,
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            atlas.image(),
    }
                if (particles.size() <= limit) {
 * See the License for the specific language governing permissions and
        void update(double deltaTime) {
            List.of(
                SnowflakeIcons.FLAKE_7,
        Particle(@NotNull Point2D.Double origin, @NotNull Point2D.Double velocity, int type, int mip, double amplitude, double swing) {
            ));
        int limit = computeMaxSnowflakes(width, height);

    private static final Point2D.Double SWING = new Point2D.Double(0.1, 1.0);
    }
            this.velocity = velocity;

        this.atlas = SnowflakeAtlas.generate(
