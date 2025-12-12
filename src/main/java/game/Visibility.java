package game;

public class Visibility {
    // Basic implementation: For now, we can just check distance or a static radius
    // More complex "Fog of War" might involve raycasting, but MVP can be simple distance check.

    private static final int VISIBILITY_RADIUS = 3;

    public static boolean isVisible(int viewerX, int viewerY, int targetX, int targetY) {
        int dx = Math.abs(viewerX - targetX);
        int dy = Math.abs(viewerY - targetY);
        // Simple Manhattan or Chebyshev distance, or Euclidean
        // Let's use Chebyshev (square radius) for grid simplicity
        return dx <= VISIBILITY_RADIUS && dy <= VISIBILITY_RADIUS;
    }
}
