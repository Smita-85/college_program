import java.util.*;
class Complex
{
	float real, imaginary;
	float freal, fimag;
	Complex(float r, float im)
	{
		real = r;
		imaginary = im;
	}
	void add(Complex c1, Complex c2)
	{
		freal = c1.real + c2.real;
		fimag = c1.imaginary + c2.imaginary;
	}
	void show()
	{
		System.out.println(" FINAL RESULT - " + freal + " + " + fimag +"x");
	}
	public static void main(String args[])
	{
		Complex c1 = new Complex(2, 9);
		Complex c2 = new Complex(7, 3);
		c1.add(c1, c2);
		c1.show();
	}
}