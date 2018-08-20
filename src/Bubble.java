

public class Bubble {
    public static void main(String[] args) {
        int [] a={2,6,5,7,8,10};
        Bubble.bubblesort(a);
        for (int s:a) {
            System.out.print(s);
        }

    }
    public static void bubblesort(int [] a){
        int i,j,temp;
        boolean flag=true;
            for (i=0;i<a.length-1;i++){//控制比较轮数
                for (j=1;j<a.length-i-1;j++){//控制每一轮的比较次数
                    if (a[j]>a[j+1]){
                        temp=a[j+1];
                        a[j+1]=a[j];
                        a[j]=temp;
                    }
                }
            }
    }
}
