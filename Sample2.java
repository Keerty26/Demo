class Sample2{
  public static void main(String[] args){
    String str="Java File";
    String rev="";
    String[] arr=str.split(" ");
    for(int i=arr.length-1; i>=0; i--){
      String word=arr[i];
      rev+=word+" ";
    }
    System.out.println("Ans:"+rev);
  }
}
