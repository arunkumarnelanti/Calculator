import java.util.Scanner;

public class Maths_calculator {
	void mCalculator() {
		int select;
		double r, base,height,length, bredth, side,d,d1,d2,h1,h2,s1,s2,s3,s4, area, perimeter, csa, tsa, v;
		
		//Create an object of Scanner class
				Scanner s=new Scanner(System.in);
				
				System.out.println("******************************");
				System.out.println("2-D Shapes");
				System.out.println("******************************");
				System.out.println("A.Rectangle");
				System.out.println("B.Square");
				System.out.println("C.Quadrilatral");
				System.out.println("D.Triangle");
				System.out.println("E.Parllelogram");
				System.out.println("F.Thombus");
				System.out.println("G.Trapezium");
				System.out.println("H.Circle");
				
				System.out.println("******************************");
				System.out.println("3-D Shapes");
				System.out.println("******************************");
				System.out.println("I.Cuboid");
				System.out.println("J.Cube");
				System.out.println("K.Circular Cylinder");
				System.out.println("L.Circular Cone");
				System.out.println("M.Sphere");
				System.out.println("N.Hemi-Sphere");
				System.out.println("******************************");
				
				
				select=s.next().charAt(0);
				
				switch(select) {
				
					//Rectangle
					case 'A':
						System.out.println("Enter Length : ");
						length=s.nextDouble();
						System.out.println("Enter Bredth : ");
						bredth=s.nextDouble();
						
						area= length*bredth;
						System.out.println("Area of Rectangle is "+ area);
						perimeter=2*(length+bredth);
						System.out.println("Perimeter of Rectangle is "+ perimeter);
						break;
						
						
					//Square
					case 'B':
						System.out.println("Enter Side : ");
						side=s.nextDouble();
						
						area=side*side;
						System.out.println("Area of Square is "+area);
						perimeter=4*side;
						System.out.println("Area of Square is "+perimeter);
						break;
						
						
					//Quadrilatral
					case 'C':
						System.out.println("Enter Diameter : ");
						d=s.nextDouble();
						System.out.println("Enter height 1 : ");
						h1=s.nextDouble();
						System.out.println("Enter height 2 : ");
						h2=s.nextDouble();
						System.out.println("Enter 1st side : ");
						s1=s.nextDouble();
						System.out.println("Enter 2nd side : ");
						s2=s.nextDouble();
						System.out.println("Enter 3rd side : ");
						s3=s.nextDouble();
						System.out.println("Enter 4th side : ");
						s4=s.nextDouble();
						
						area=0.5*(d*(h1*h2));
						System.out.println("Area of Quadrilatral is "+area);
						perimeter=s1+s2+s3+s4;
						System.out.println("Perimeter of Quadrilatral is "+perimeter);
						break;
						
						
					//Triangle
					case 'D':
						System.out.println("Enter Base : ");
						base=s.nextDouble();
						System.out.println("Enter height : ");
						height=s.nextDouble();
						System.out.println("Enter 1st side : ");
						s1=s.nextDouble();
						System.out.println("Enter 2nd side : ");
						s2=s.nextDouble();
						System.out.println("Enter 3rd side : ");
						s3=s.nextDouble();
						
						area=0.5*(base*height);
						System.out.println("Area of Triangle is "+area);
						perimeter=s1+s2+s3;
						System.out.println("Perimeter of Triangle is "+perimeter);
						break;
						
						
					//parllelogram
					case 'E':
						System.out.println("Enter Base : ");
						base=s.nextDouble();
						System.out.println("Enter height : ");
						height=s.nextDouble();
						System.out.println("Enter 1st side : ");
						s1=s.nextDouble();
						System.out.println("Enter 2nd side : ");
						s2=s.nextDouble();
						
						area=base*height;
						System.out.println("Area of Parllelogram is "+area);
						perimeter=2*(s1+s2);
						System.out.println("Perimeter of Parllelogram is "+perimeter);
						break;
						
						
					//Rhombus
					case 'F':
						System.out.println("Enter Diameter 1 : ");
						d1=s.nextDouble();
						System.out.println("Enter Diameter 2 : ");
						d2=s.nextDouble();
						System.out.println("Enter side : ");
						side=s.nextDouble();
						
						area=0.5*(d1*d2);
						System.out.println("Area of Rhombus is "+area);
						perimeter=4*side;
						System.out.println("Perimeter of Rhombus is "+perimeter);
						break;
						
						
					//Trepezium
					case 'G':
						System.out.println("Enter height : ");
						height=s.nextDouble();
						System.out.println("Enter 1st side : ");
						s1=s.nextDouble();
						System.out.println("Enter 2nd side : ");
						s2=s.nextDouble();
						System.out.println("Enter 3rd side : ");
						s3=s.nextDouble();
						System.out.println("Enter 4th side : ");
						s4=s.nextDouble();
						
						area=0.5*(s1+s2)*height;
						System.out.println("Area of Trepezium is "+area);
						perimeter=s1+s2+s3+s4;
						System.out.println("Perimeter of Trepezium is "+perimeter);
						break;
						
						
					//circle
					case 'H':
						System.out.println("Enter Radius : ");
						r=s.nextDouble();
						
						area=3.14*(r*r*r);
						System.out.println("Area of Circle is "+area);
						perimeter=2*3.14*r;
						System.out.println("Circumference of Circle is "+perimeter);
						break;
						
						
					//Cuboid
					case 'I':
						System.out.println("Enter Length : ");
						length=s.nextDouble();
						System.out.println("Enter Bredth : ");
						bredth=s.nextDouble();
						System.out.println("Enter Height : ");
						height=s.nextDouble();
						
						csa=2*height*(length+bredth);
						System.out.println("Lateral Surface area of Cuboid is "+csa);
						tsa=2*((length*bredth)+(bredth*height)+(height*length));
						System.out.println("Total Surface area of Cuboid is "+tsa);
						v=length*bredth*height;
						System.out.println("Volume of Cuboid is "+v);
						break;
						
						
					//Cube
					case 'J':
						System.out.println("Enter Side : ");
						side=s.nextDouble();
						
						csa=4*side*side;
						System.out.println("Lateral Surface area of Cube is "+csa);
						tsa=6*side*side;
						System.out.println("Total Surface area of Cube is "+tsa);
						v=side*side*side;
						System.out.println("Volume of Cube is "+v);
						break;
						
						
					//Circular Cylinder
					case 'K':
						System.out.println("Enter radius : ");
						r=s.nextDouble();
						System.out.println("Enter height : ");
						height=s.nextDouble();
						
						csa=2*3.14*r*height;
						System.out.println("Curved Surface area of Cylinder is "+csa);
						tsa=2*3.14*r*(r+height);
						System.out.println("Total Surface area of Cylinder is "+tsa);
						v=3.14*r*r*height;
						System.out.println("Volume of Cylinder is "+v);
						break;
						
						
					//cone
					case 'L':
						System.out.println("Enter radius : ");
						r=s.nextDouble();
						System.out.println("Enter Length : ");
						length=s.nextDouble();
						System.out.println("Enter height : ");
						height=s.nextDouble();
						
						csa=3.14*r*length;
						System.out.println("Curved Surface area of Cone is "+csa);
						tsa=3.14*r*(length+r);
						System.out.println("Total Surface area of Cone is "+tsa);
						v=0.33*3.14*r*r*height;
						System.out.println("Volume of Cone is "+v);
						break;
						
						
					//Sphere
					case 'M':
						System.out.println("Enter radius : ");
						r=s.nextDouble();
						
						csa=4*3.14*r*r;
						System.out.println("Curved Surface area of Sphere is "+csa);
						tsa=4*3.14*r*r;
						System.out.println("Total Surface area of Sphere is "+tsa);
						v=1.33*3.14*r*r*r;
						System.out.println("Volume of Sphere is "+v);
						break;
						
						
						//Hemi-Sphere
					case 'N':
						System.out.println("Enter radius : ");
						r=s.nextDouble();
						
						csa=2*3.14*r*r;
						System.out.println("Curved Surface area of Hemi-Sphere is "+csa);
						tsa=3*3.14*r*r;
						System.out.println("Total Surface area of Hemi-Sphere is "+tsa);
						v=0.66*3.14*r*r*r;
						System.out.println("Volume of Hemi-Sphere is "+v);
						break;
				}
				s.close();
	}
}
