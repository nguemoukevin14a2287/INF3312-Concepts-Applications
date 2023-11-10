public class App2
{
	public static void main(String[] args) {
		Point p1 = new Point(), p2 = new Point(23, 87);
		p1.display();
		p2.display();
		p1.move(-2,8);
		p1.display();
		Point p3 = new Point(p1);
		p3.move(Math.random() * 5 + 2, Math.random() * 6 + 3);
		p3.display();
		System.out.println("\nThe distance between p1 and and p3 is : " + p1.distance(p3));
	}
}