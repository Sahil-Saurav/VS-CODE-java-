import java.lang.Math;

public class HelloWorld {

public static void ReverseArray(int arr[]){
    int temp;
    for(int i=0,j=arr.length-1;i<j;i++,j--){
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

public static void Sort(int[] arr){
    int temp;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}

public static void largestInArray(int[] arr){}

public static int LinearSearch(int[] arr,int n){
    for(int i=0;i<arr.length;i++){
        if(arr[i] == n){
            return i;
        }
    }
    return -1;
} 

public static void sumOfDigits(int n){
    int sum = 0;
    while(n>0){
        int LastDigit = n%10;
        sum += LastDigit;
        n = n/10;
    }
    System.out.println("sum of the Digits of the given Number is : "+sum);
}

public static void palindrome(int n){
    int trial = n;
    int count = 0;
    while(trial>0){
        trial = trial/10;
        count++;
    }
    int num = n;
    int pow = count-1;
    int pali = 0;
    while(n>0){
        int LastDigit = n%10;
        pali += LastDigit*(int)Math.pow(10,pow);
        pow--;
        n = n/10;
    }
    System.out.println(pali);
    if(pali == num){
        System.out.println("The Number "+num+" is Palindrome Number!!");
    }
    else{
        System.out.println("The Number "+num+ " is not a Palindrome Number!!");
    }
}

public static void decimal_Binary(int num){
    int Mynum = num;
    int pow = 0;
    int bin = 0;
    while(num>0){
        int rem = num%2;
        bin += rem*(int)Math.pow(10,pow);
        pow++;
        num = num/2;
    }
    System.out.println("Binary form of "+Mynum+" is "+bin);
}

public static void binary_Decimal(int num){
    int Mynum = num;
    int pow = 0;
    int deci = 0;
    while(num>0){
        int LastDigit = num%10;
        deci += LastDigit*(int)Math.pow(2, pow);
        pow++;
        num = num/10;
    }
    System.out.printf("Binary of %d is %d",Mynum,deci);
}

public static void primeInrange(int n){
    System.out.print("Prime Numbers in given Range is: ");
    for(int i=2;i<=n;i++){
        if(checkPrime(i)==true){
            System.out.print(i+" ");
        }
    }
}    
    
    
public static boolean checkPrime(int n){
    boolean isprime = true;    
    if(n!=1){
            for(int i=n-1;i>1;i--){
                if(n%i == 0){
                isprime = false;
                break;
            }
        }
        if(isprime == true){
            return isprime;
        }
            else{
                return isprime;
            }
        }
        else{
            return isprime;
        }
        
    }
    
    public static void sortingNArray(int[] arr){
        for(int i=1;i<=arr.length;i++){
            int temp;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    temp=arr[i-1];
                    arr[i-1]=arr[j];
                    arr[j]=temp;
                    break;
                }
            }
        }
    }

    public static int smallestPositiveMissingNumber(int[] arr){
        int found;
        for(int i=0;i<arr.length;i++){
            found=-1;
            for(int j=0;j<arr.length;j++){
                if(arr[j] == i){
                    found = 1;
                    break;
                }
            }
            if(found==-1){
                return i;
            }
        }
        return -1;
    }
    
    public static void indexSorting(int[] arr){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    break;
                }
            }
        }

        for(int i=1;i<arr.length;i++){
            if(i != arr[i]){
                arr[i] = 1;
            }
        }
    }

    public static void reverse(int[] arr,int start,int end){
        int temp;
        for(int i=0,j=end;i<j;i++,j--){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void rotate(int[] arr,int end){
        reverse(arr,0,end-1 );
        reverse(arr,end,arr.length-1);
        reverse(arr, 0, arr.length-1);
    }
public static void main(String[] args) {
    int[] arr = {1,3,225,5,4,6,3,80,10};
    /*sortingNArray(arr);
    for (int i=0;i<arr.length;i++) {
        System.out.print(arr[i]+" ");
    }
    System.out.println(smallestPositiveMissingNumber(arr));*/ 
    Sort(arr);
    for(int e : arr){
        System.out.print(e+" ");
    }
}


}