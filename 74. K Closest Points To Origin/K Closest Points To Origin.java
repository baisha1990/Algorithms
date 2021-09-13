/* Given an array of points in a 2D2D plane, find ‘K’ closest points to the origin. */

class Point {
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int distFromOrigin() {
    // ignoring sqrt
		return (x * x) + (y * y);
	}
}

public static List<Point> findClosestPoints(Point[] points, int k) {
    ArrayList<Point> result = new ArrayList<>();
    PriorityQueue<Point> minHeap = new PriorityQueue<>((a,b) -> a.distFromOrigin()-b.distFromOrigin());
    for(Point p : points) {
        minHeap.add(p);
    }
    while(k > 0) {
        result.add(minHeap.poll());
        k--;
    }
    return result;
}