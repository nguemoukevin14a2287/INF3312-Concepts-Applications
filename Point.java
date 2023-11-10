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
}