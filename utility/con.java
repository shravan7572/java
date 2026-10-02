package utility;

public class con {
    
    String str1;
    String str2;

    public con(String str1,String str2){
        this.str1=str1;
        this.str2=str2;
    }

    public void conn(){
        String concatenate=str1+str2;

        System.out.println("the concatenate string :"+concatenate);
    }
}
