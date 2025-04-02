public class TrappingRainwater {
    public static int water(int height[]){
        int n=height.length;
        int leftMax[]= new int[n];
        int rightMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1], height[i]);
        }
        int trappedWater=0;
        for (int i = 0; i <n; i++) {
            int waterLvl=Math.min(leftMax[i], rightMax[i]);
            trappedWater+=waterLvl-height[i];
        }
        return trappedWater;
        }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        int totalWater= water(height);
        System.out.println("total trapped water= "+totalWater);
        
    }
}
