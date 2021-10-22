package wrapperclasses;

public class Test8 {
	public static void main(String[] args) {
		// valueof() method within range e.g.
		Integer i1 = Integer.valueOf(127);
		Integer i2 = Integer.valueOf(127);
		System.out.println(i1 == i2);
		System.out.println();
		System.out.println(i1.equals(i2));
		System.out.println();

		// valueOf() method outer range e.g.
		Integer i3 = Integer.valueOf(128);
		Integer i4 = Integer.valueOf(128);
		System.out.println(i3 == i4);
		System.out.println();
		System.out.println(i3.equals(i4));
		System.out.println();

		// constructor outof range e.g.
		Integer i5 = new Integer(128);
		Integer i6 = new Integer(128);
		System.out.println(i5 == i6);
		System.out.println();
		System.out.println(i5.equals(i6));
		System.out.println();

		// constructor within range value e.g.
		Integer i7 = new Integer(125);
		Integer i8 = new Integer(125);
		System.out.println(i7 == i8);
		System.out.println();
		System.out.println(i7.equals(i8));
		System.out.println();

		// valueof() method within range with negative value
		Integer i9 = Integer.valueOf(-128);
		Integer i10 = Integer.valueOf(-128);
		System.out.println(i9 == i10);
		System.out.println();
		System.out.println(i9.equals(i10));
		System.out.println();

		// valueof() method within range with negative different value
		Integer i11 = Integer.valueOf(-128);
		Integer i12 = Integer.valueOf(127);
		System.out.println(i11 == i12);
		System.out.println();
		System.out.println(i11.equals(i12));

	}

}
