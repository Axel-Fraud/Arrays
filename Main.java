class Main {
  public static void main(String[] args) {
    /*
 int x = 5;
 int[] arr = new int[10];
 arr[0] = 10;
 for(int i = 1; i < arr.length; i++){
   arr[i] = (int)(Math.random()*51);
 }
 System.out.println(arr);
  for (int i = 0; i < arr.length; i++){
    System.out.print(arr[i] + " ");
  }
  System.out.println();
  for(int num: arr){
    System.out.print(num + " ");
  }
  int[] arr2 = {1,2,3,4,5,6,12,19,21};*/


int[] arr = new int[10];
for(int i = 1; i <= arr.length; i++){
  arr[i-1] = i*i;
}
for(int i = 0; i<arr.length; i++){
  System.out.print(arr[i] + " ");
}


  }

 public static boolean aRray(int[] arr ){



 }


}


  // Write a method that takes in an array of integers and returns true if the first and last elements in the array are the same, otherwise return false. 
