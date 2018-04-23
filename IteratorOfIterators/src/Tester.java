import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		ArrayList<String> il = new ArrayList<>();
		ArrayList<String> jl = new ArrayList<>();
		il.add("ia");
		il.add("ib");
		il.add("ic");
		il.add("id");
		il.add("ie");
		jl.add("ja");
		jl.add("jb");
		jl.add("jc");
		jl.add("jd");
		jl.add("je");
		jl.add("jf");
		
		IteratorOfIterators<String> ii = new IteratorOfIterators<>(il.iterator(), jl.iterator());
		while (ii.hasNext()){
			System.out.println(ii.next());
		}
		
		System.out.println("-----------");
		
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> bl = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		bl.add(10);
		bl.add(11);
		bl.add(12);
		bl.add(13);
		bl.add(14);
		bl.add(15);
		IteratorOfIterators<Integer> i = new IteratorOfIterators<>(al.iterator(), bl.iterator());
		while (i.hasNext()){
			System.out.println(i.next());
		}
		//System.out.println(i.next());//gets java.util.NoSuchElementException error

	}

}
