package package2;

import package1.A;

class C extends A {
	public void printMembers() {
		System.out.println(pub);
		System.out.println(pro);
//		System.out.println(def);
//		System.out.println(pri);
	}
}
