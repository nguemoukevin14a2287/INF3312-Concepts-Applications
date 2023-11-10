public class Point {
	protected double abscisse;
	protected double ordonnee;

	public Point(double x, double y) 
	{
		abscisse = x;
		ordonnee = y;
	}
	public Point()
	{
		abscisse = 0;
		ordonnee = 0;
	}
	public Point(Point p)
	{
		abscisse = p.x();
		ordonnee = p.y();
	}

	public double x()
	{
		return abscisse;
	}
	public double y()
	{
		return ordonnee;
	}

	public void display()
	{
		System.out.println("(" + abscisse + "," + ordonnee + ")");
	}

	public void move(double dx, double dy)
	{
		abscisse += dx;
		ordonnee += dy;
	}

	public double distance(Point p)
	{
		double length = Math.abs(abscisse - p.x()), height = Math.abs(ordonnee - p.y());
		return Math.sqrt(Math.pow(length, 2) + Math.pow(height, 2));
	}
}