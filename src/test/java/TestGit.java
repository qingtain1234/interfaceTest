import org.junit.jupiter.api.Test;

public class TestGit {
    @Test
    void test(){
        System.out.println("aaaa");
        System.out.println("bbb");
    }

    @Test
    void test123(){
        System.out.println(removeElement(new int[]{1, 2}, 2));
    }
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int left=0;
        for(int right=0;right<n;right++){
            if(nums[right]!=val){
                nums[left]=nums[right];
                left++;
            }
        }
        return left;
    }
}
