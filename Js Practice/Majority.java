public class Majority{
    public int majority(int[] nums){
        int n=nums.length;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }

            }
            if(count>n/2){
                return nums[i];
            }

           
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums={3,2,2,2,3};
        Majority obj= new Majority();
        int result=obj.majority(nums);
        System.out.println("majority element is:"+result);

    }
}