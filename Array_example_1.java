class Array_example_1{
    public static void main(String[] args) {
        String st_name[]=new String[5];
        // st_name[]=["A","B","C","D","E"];
        st_name[0]="A";
        st_name[1]="B";
        st_name[2]="C";
        st_name[3]="D";
        st_name[4]="E";
        int a[] ={20,25,25,25,25,30};
        // System.out.println(st_name[5]);
        for(int i=0;i<st_name.length;i++){
            System.out.println(st_name[i]);
        }
    }
}