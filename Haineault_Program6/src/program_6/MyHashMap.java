package program_6;
/*
 * Jeff Haineault
 * CS3410
 * Fall 2015
 * Program 6
 */
public class MyHashMap {

		private final float loadFactor;
		private MapEntry [] table;
		private int capacity;
		private int size;
		private boolean rehashing = false;
		
		public MyHashMap(int capacity,float loadFactor)
		{
			this.capacity = capacity;
			this.table = new MapEntry [capacity];
			this.loadFactor = loadFactor;
		}
		
		public int[] insert(int key, int value)throws Exception
		{
			int start = 0,
				probe = hash(key + (int)Math.pow(start, 2)),
				counter = 0;
			int [] result = new int [2];//index 1 contains index, index 2 contains #of cells accessed. 
		
			if(!this.rehashing)
			{
				this.size++;
			}
			if(this.size > this.capacity * loadFactor)
			{
				this.reHash();
			}
			do	
			{
				if(counter > 20) 
				{
					throw new Exception("Probe limit reached. Insert failed.");
				}
				probe = hash(key + (int)Math.pow(start, 2));
				counter++;
				start++;
			}while(table[probe] != null);
			table[probe] = new MapEntry(value, key);
			result[0] = probe;
			result[1] = counter;
			return result;
		}
		public void arrayPrint()
		{
			String s = "";
			for(int i = 0; i < table.length; i++)
			{
				if(table[i] != null)
				{
					s += "Index: " + i + ", " + "Key: " + table[i].key + ", " + "Value: " + table[i].value + "\n";
				}
			}
			System.out.println(s);
		}
		
		private void reHash()
		{
			this.rehashing = true;
			this.capacity *= 2;
			MapEntry [] temp = this.table; 
			this.table = new MapEntry[this.capacity];
			
			for(int i = 0; i < temp.length; i++)
			{
				if(temp[i] != null)
				{
					try{
						this.insert(temp[i].key, temp[i].value);
						
					}catch(Exception e){
						
						System.out.println(e.toString());
					}
				}
			}
			this.rehashing = false;
		}
		public int[] search(int key)
		{
			int start = 0,
				probe = hash(key + (int)Math.pow(start, 2)),
				counter = 1;
			boolean found = false;
			int [] result = new int [2];
			while(counter < this.capacity)
			{
				if(table[probe] != null)
				{
					
					if(key == table[probe].key)
					{
						found = true;
						break;
					}
				}
				start++;
				counter++;
				probe = hash(key + (int)Math.pow(start, 2));
			
			}
			result[0] = (found)? probe : -1;
			result[1] = counter;
			return result;
		}
		
		private int hash(int key)
		{
			return key % this.table.length;
		}
		
}
