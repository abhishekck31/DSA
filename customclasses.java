public class customclasses {
    static class Data{
        public Integer  num;
        public String  name;
        Data(int _num , String _name){
            this.num = _num;
            this.name = _name;
        }
    }
    public static void main(String[] args){
         Data dataobject1 = new Data(9, "Abhi");
         System.out.print(dataobject1.name);
    }
}
