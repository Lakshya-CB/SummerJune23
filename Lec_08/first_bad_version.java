package Lec_08;

public class first_bad_version {
	 public int firstBadVersion(int n) {
	        int s =1;
	        int e = n;
	        int ans = n;
	        while(s<=e){
	            // int mid =(int)((0l+s+e)/2);
	            int mid =s/2+e/2;
	            
	            mid = Math.max(mid,s);

	            if(isBadVersion(mid)){
	                e = mid-1;
	                ans = mid;
	            }else{
	                s=mid+1;
	            }
	        }
	        return ans;
	    }
}
