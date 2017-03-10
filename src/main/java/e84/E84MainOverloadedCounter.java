package e84;

/**
 * @author nurulatiqahali
 *
 */
public class E84MainOverloadedCounter {
	public static void main(String[] args) {
		E84OverloadedCounter a = new E84OverloadedCounter(10,true);
		E84OverloadedCounter b = new E84OverloadedCounter(10);
//		E84OverloadedCounter c = new E84OverloadedCounter(true);
//		E84OverloadedCounter d = new E84OverloadedCounter();
		//a.value();
		a.decrease();
		System.out.println(a.value());
		a.increase();
		System.out.println(a.value());
	}
}
