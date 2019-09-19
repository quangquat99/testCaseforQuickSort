package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTest {
	
	@Test
	void test1() {
		Sort sort = new Sort();
		int[] a = {0, 1, 2, 3, 4, 5};
		int[] b = {1, 4, 0, 3, 2, 5};
		
		int low = 0;
		int high = 5;
		sort.qSort(b, low, high);
		assertArrayEquals(a, b);
	}
	
	@Test
	void test2() {
		Sort sort = new Sort();
		int[] a = {0, 1, 2, 3, 4, 5};
		int[] b = {1, 4, 0, 3, 5, 2};
		
		int low = 0;
		int high = 5;
		sort.qSort(b, low, high - 1);
		assertArrayEquals(a, b);
	}
	
	@Test
	void test3() {
		Sort sort = new Sort();
		int[] a = {0, 1, 2, 3, 4, 5};
		int[] b = {1, 4, 0, 3, 2, 5};
		
		int low = 0;
		int high = 5;
		sort.qSort(b, low, high + 1);
		assertArrayEquals(a, b);
	}
	
	@Test
	void test4() {
		Sort sort = new Sort();
		int[] a = {0, 1, 2, 3, 4, 5};
		int[] b = {1, 4, 0, 3, 2, 5};
		
		int low = 0;
		int high = 5;
		sort.qSort(b, low -1, high);
		assertArrayEquals(a, b);
	}
	
	@Test
	void test5() {
		Sort sort = new Sort();
		int[] a = {0, 1, 2, 3, 4, 5};
		int[] b = {1, 4, 0, 3, 2, 5};
		
		int low = 0;
		int high = 5;
		sort.qSort(b, low -1, high -1);
		assertArrayEquals(a, b);
	}
	
	@Test
	void test6() {
		Sort sort = new Sort();
		int[] a = {0, 1, 2, 3, 4, 5};
		int[] b = {1, 4, 0, 3, 2, 5};
		
		int low = 0;
		int high = 5;
		sort.qSort(b, low -1, high +1);
		assertArrayEquals(a, b);
	}
	
	@Test
	void test7() {
		Sort sort = new Sort();
		int[] a = {0, 1, 2, 3, 4, 5};
		int[] b = {1, 4, 0, 3, 2, 5};
		
		int low = 0;
		int high = 5;
		sort.qSort(b, low +1, high);
		assertArrayEquals(a, b);
	}
	
	@Test
	void test8() {
		Sort sort = new Sort();
		int[] a = {0, 1, 2, 3, 4, 5};
		int[] b = {1, 4, 0, 3, 2, 5};
		
		int low = 0;
		int high = 5;
		sort.qSort(b, low +1, high -1);
		assertArrayEquals(a, b);
	}
	
	@Test
	void test9() {
		Sort sort = new Sort();
		int[] a = {0, 1, 2, 3, 4, 5};
		int[] b = {1, 4, 0, 3, 2, 5};
		
		int low = 0;
		int high = 5;
		sort.qSort(b, low +1, high +1);
		assertArrayEquals(a, b);
	}

}
