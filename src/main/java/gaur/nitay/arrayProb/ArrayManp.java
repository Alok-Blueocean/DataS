package gaur.nitay.arrayProb;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Arrays;

public class ArrayManp {
	
	public int[] findPairs(int[] array,int sum){
		int beg=0;
		int end = array.length -1;
		int i=beg;
		int j = end;
		while(i<j){
			if(array[i]+array[j]==sum){
				System.out.println(array[i]+"--"+array[j]);
				i++;j--;
				}
			else if(array[i]+array[j]<sum){
				i++;
				}
			else{
				j--;
			}
		}
		return null;
	}
	public void findDup(int[] array,int sum){
		int i=0;
		Map<Integer,Integer> map  = new HashMap();
		while(i<array.length){
			if(map.containsKey(array[i])){
				map.put(array[i], map.get(array[i])+1);//[array[i]] = map[array[i]]+1;
			}
			else{
				map.put(array[i], 1);
			}
			i++;
		}
		map.forEach((x,y)->System.out.print(x+"-->"+y));
	}
	public static void main(String[] args){
		
		int[] array = {8,7,2,5,3,1,9,3,5};
		int sum=10;
		Arrays.sort(array);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+"->");
		}
		System.out.print("\n");
//		new ArrayManp().findPairs(array, sum);
		new ArrayManp().findDup(array, sum);
		
	}
}
