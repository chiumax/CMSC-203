
public class Plot {
	private int x;
	private int y;
	private int width;
	private int depth;

	public Plot() {
		x = 0;
		y = 0;
		width = 1;
		depth = 1;
	}

	public Plot(Plot p) {
		x = p.x;
		y = p.y;
		width = p.width;
		depth = p.depth;
	}

	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}

	public boolean overlaps(Plot plot) {
		// java doc never specified that two plots overlap if their edges overlap so I won't include it
		// the diagonal corners of the first rectangle
		int ax1 = x;
		int ax2 = x+width;
		int ay1 = y;
		int ay2 = y+width;
		
		// the diagonal corners of the second rectangle
		int bx1 = plot.x;
		int bx2 = plot.x + plot.width;
		int by1 = plot.y;
		int by2 = plot.y + plot.depth;
		
		// all 4 of these statements must be true at the same time in order to intersect
		if(ax1 < bx2 && ax2 > bx1 && ay1 < by2 && ay2 > by1) {
			return true;
		}
		return false;
	}

	public boolean encompasses(Plot plot) {
		//  takes a Plot instance and determines if the **current** plot contains it.
		// 	the determination should be inclusive, in other words, if an edge lies on the edge of the current plot, this is acceptable.
		
		// the diagonal corners of the first rectangle
		int ax1 = x;
		int ax2 = x+width;
		int ay1 = y;
		int ay2 = y+width;
		
		// the diagonal corners of the second rectangle
		int bx1 = plot.x;
		int bx2 = plot.x + plot.width;
		int by1 = plot.y;
		int by2 = plot.y + plot.depth;
		
		if(bx1 >= ax1 && bx2 <= ax2 && by1 <= ay2 && by2 >= ay1) {
			return true;
		}
		return false;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getDepth() {
		return depth;
	}

	public String toString() {
		return "Upper left: (" + x + "," + y + "); Width: " + width + " Depth: " + depth;
	}
}
