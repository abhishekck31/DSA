class printknonrepeating{
    public static List<Character> knonrepeating(String s , int k){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char c : s.toCharArray()) map.put(c,map.getOrDefault(c,0) + 1);
        int count = 0;
        List<Character> result = new ArrayList<>();
        for(char c : s.toCharArray()){
            if(map.get(c) == 1) {
                count++;
                if(count == k) result.add(c);
            }
        }
        return result;
    }
    public static void main(String[] args){
        String s = "geeksforgeeks";
        int k = 3;
        System.out.println(knonrepeating(s,k));
    }
}