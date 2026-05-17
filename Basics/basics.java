public class basics{
    public String helloworld(){
        String str1 = "Hello";
        char arr[] = {'W','o','r','l','d'};
        String str2 = new String(arr);
        System.out.println(str1 + " " + str2);
        return str1 + " " + str2;
    }
    public static void main(String[] args){
        basics obj = new basics();
        obj.helloworld();
    }
}

