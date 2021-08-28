package com.baeldung.mockito;

import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

public class DSAbstractExt {
	
	static class YList extends AbstractList{

		@Override
		public Object get(int index) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}
		  
	}
	static class Ymap extends AbstractMap{

		@Override
		public Set entrySet() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	static class Yset extends AbstractSet{

		@Override
		public Iterator iterator() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		
	}

}
