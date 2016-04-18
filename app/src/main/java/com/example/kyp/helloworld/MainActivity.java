class Practice{
    public static void main(String [] args){
        String[] A={"A","B","C"};
        String[] B=new String[3];
        System.arraycopy(A,0,B,1,A.length-1);
        for (int i=0;i<B.length;i++)
        System.out.println(B[i]+" ");
    }
}