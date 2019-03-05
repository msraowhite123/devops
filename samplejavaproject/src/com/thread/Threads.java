package com.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

class A {
	A() {

	}

	A(String s) {
		System.out.println(s);
	}

	public static void method(String str) {
		System.out.println("HELLO" + str);
	}

	public void method2(String str) {
		System.out.println("HELLO" + str);
	}
}

interface B {
	// A me(String str);
	void me(String str);
}

public class Threads {
	

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		B b = A::method;
		b.me("GF");

		List<EmployeeS> employees = new ArrayList<>();
		employees.add(new EmployeeS(6, "Yash", "Chopra", 25));
		employees.add(new EmployeeS(2, "Aman", "Sharma", 28));
		employees.add(new EmployeeS(3, "Aakash", "Yaadav", 52));
		employees.add(new EmployeeS(5, "David", "Kameron", 19));
		employees.add(new EmployeeS(4, "James", "Hedge", 72));
		employees.add(new EmployeeS(8, "Balaji", "Subbu", 88));
		employees.add(new EmployeeS(7, "Karan", "Johar", 59));
		employees.add(new EmployeeS(1, "Lokesh", "Gupta", 32));
		employees.add(new EmployeeS(9, "Vishu", "Bissi", 33));
		employees.add(new EmployeeS(10, "Lokesh", "Ramachandran", 60));
		employees.forEach(System.out::println);

		// employees.sort(Comparator.comparing(e -> e.getFirstName()));

		Comparator<EmployeeS> comparator = Comparator.comparing(EmployeeS::getAge)
				.thenComparing(EmployeeS::getFirstName);
		employees.sort(comparator);
		System.out.println(employees);

		/*
		 * ExecutorService es = Executors.newFixedThreadPool(1);
		 * 
		 * Thread tt = new Thread(new Runnable() {
		 * 
		 * @Override public void run() { // TODO Auto-generated method stub
		 * 
		 * } });
		 * 
		 * Callable<String> r2 = () -> { return "callable"; };
		 * 
		 * Runnable r = () -> { for (int i = 0; i < 10; i++) {
		 * 
		 * System.out.println(Thread.currentThread().getName() + " " + i); }
		 * 
		 * };
		 * 
		 * es.submit(r);
		 * 
		 * Callable<String> c = () -> {
		 * 
		 * return "callable";
		 * 
		 * }; CalculateInterface ci = (a) -> { return a + " Hello"; };
		 * System.out.println(ci.emthod("sai ram"));
		 * 
		 * Future<String> future = es.submit(c); System.out.println(">>>>>" +
		 * future.get()); functionalIterface<Integer> f = (a) -> a + 20;
		 * System.out.println(f.someMethod(20));
		 * 
		 * System.out.println(f.someting("srinivas"));
		 */

		String s = new String("shd");
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");

		list.forEach((item) -> System.out.println(item));
		Map<String, String> map = new HashMap<>();
		map.put("1", "a");
		map.put("2", "b");

		map.forEach((K, V) -> System.out.println(K + ":" + V));

		String token = getjwtTokenJson(JwtInterface::getJwtToken);
		System.out.println(token);

		String subject = getjwtTokenJson(JwtInterface::getSubect);
		System.out.println(subject);

		ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		// java.util.function.Consumer<Integer> action = System.out::println;

		numberList.stream().forEach(System.out::println);

		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");

		List<String> memberNameList = memberNames.stream().sorted().filter(p -> p.startsWith("A"))
				.collect(Collectors.toList());
		System.out.println(memberNameList);

	}

	private static void me() {
		// TODO Auto-generated method stub
		System.out.println("hello thread");
	}

	public static <T> T getjwtTokenJson(Function<JwtInterface, T> claimsResolver) {
		JwtInterface jwtInterface = new JwtInterfaceImpl();
		return claimsResolver.apply(jwtInterface);

	}

}
