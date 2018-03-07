import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashSet;

public class setstuff {
	public static void main(String[] args) {
		
	}
	/**
	 * Return an ArrayList<Integer> that contains 17.
	 * @return 17
	 */
	private ArrayList<Integer> ret17() {
		  ArrayList<Integer> a = new ArrayList<Integer>();
		  a.add(17);
		  return a;
		  
		}
	/**
	 * 
	 * @param al
	 * @return
	 */
	private Integer zerothElement(ArrayList<Integer> al){
		  
		  return al.get(0);
		}
	
	private boolean contains(int a, int[] ar){
		  boolean result = false;
		  for(int i = 0; i < ar.length; i++){
		    if(ar[i] == a){
		      result = true;
		    }
		  }
		  return result;
		  
		}
	
	private boolean anyContains(int[] a, int[] b){
		  boolean result = false;
		  for(int i =0; i<a.length ; i++){
		    for(int inner=0;inner< b.length; inner ++){
		      if (a[i]==b[inner]){

		        result = true;
		      
		      }
		    }
		  }
		  
		  return result;
		}
	
	private int[] union(int[] a, int[] b){
		  int[] union;
		   if(a.length ==0 && b.length ==0){
		    return b;
		  }
		  else if(a.length ==0 && b.length >=1){
		    return b;
		  }
		  else if(a.length >=1 && b.length ==0){
		    return a;
		  }
		  else{
		    union = new int[a.length+b.length];
		    for(int i =0;i<union.length;i++){
		      if(i<a.length){
		      union[i] =a[i];
		      }
		      else{
		        union[i]=b[i-a.length];
		      }
		    }
		    
		    return union;
		  }
		}
	
	private int[] intersect(int[] a, int[] b){
		  int arraysize =0;
				for(int i=0;i<a.length;i++){
					for(int inner=0;inner<b.length;inner++){
						if(a[i] ==b[inner]){
							arraysize++;
						}
					}
				}
				int []c =new int [arraysize];
				for(int k =0;k<arraysize;k++){
					for(int i=0;i<a.length;i++){
						for(int inner=0;inner<b.length;inner++){
							if(a[i] ==b[inner]){
								c[k] =a[i];
								k++;
								
							}
						}
					}
				}
				return c;
		}
	
	private String nearesUnvisitedNode(boolean[] visited, int[] distance, String[] nodeName){
  		String result ="";
		for(int i =0; i< visited.length; i ++){
			if(visited[i] ==false){
				if(i-1>=0){
					if(visited[i-1] ==false){
						if(distance[i] > distance[i-1]){
							result = nodeName[i-1];
							break;
						}
					
						else{
							result = nodeName[i];
							break;
						}
					}
				}
			   if(i-2>=0){
					if(visited[i-2]==false){
						if(distance[i]>distance[i-2]){
							result = nodeName[i-2];
							break;
						}
						else{
							result = nodeName[i];
							break;
						}
					}
				}
			  if(i+1<=distance.length&&i-1>=0){
			    if(visited[distance.length-1] ==false){
			      result = nodeName[distance.length-1];
			    }
			  }
			}
		}
		return result;
}
	
	private ArrayList<Object> listify(int a, int b, int c){
		  ArrayList<Object> d = new ArrayList<Object>();
		  d.add(a);
		  d.add(b);
		  d.add(c);
		  return d;
		}
	
	private ArrayList<ArrayList<Object>> addEdge(ArrayList<ArrayList<Object>> graph, int a, int b, int c){
		  ArrayList<Object> result = new ArrayList<Object> ();
					 result.add(a);
					 result.add(b);
					 result.add(c);
					
					
				graph.add(result);
					
					return graph;
		}
	
	private ArrayList<Integer> setInfinity(int n, int start){
		   ArrayList<Integer> a = new ArrayList<Integer>();
		  for(int i =0; i<n; i++){
		    if(i ==start){
		      a.add(0);
		    }else{
		    a.add(2147483647);
		    }
		      
		    }
		  return a;
		}
	
	private ArrayList<Integer> collectNodes(ArrayList<ArrayList<Integer>> edgelist){
		ArrayList<Integer> result = new ArrayList<Integer>();
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		for(int i = 0; i < edgelist.size(); i++) {
			result.add(edgelist.get(i).get(0));
			result.add(edgelist.get(i).get(1));
		}
		
		 lhs.addAll(result);
		  
	     
	     result.clear();
	 
	     
	     result.addAll(lhs);

		return result;
	}

}
