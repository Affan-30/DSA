class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        HashSet<Character> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();        
        for(char ch : row1.toCharArray()){
            set.add(ch);
        }

        for(int i=0 ; i<words.length; i++){
            String str = words[i].toLowerCase();
            boolean add = true;
            for(char ch : str.toCharArray()){
                if(!set.contains(ch)){
                    add = false;
                    break;
                }
            }
            if(add == true){
                list.add(words[i]);
            }
        }

        set.clear();
        for(char ch : row2.toCharArray()){
            set.add(ch);
        }

        for(int i=0 ; i<words.length; i++){
            String str = words[i].toLowerCase();
            boolean add = true;
            for(char ch : str.toCharArray()){
                if(!set.contains(ch)){
                    add = false;
                    break;
                }
            }
            if(add == true){
                list.add(words[i]);
            }
        }

        set.clear();

        for(char ch : row3.toCharArray()){
            set.add(ch);
        }

        for(int i=0 ; i<words.length; i++){
            String str = words[i].toLowerCase();
            boolean add = true;
            for(char ch : str.toCharArray()){
                if(!set.contains(ch)){
                    add = false;
                    break;
                }
            }
            if(add == true){
                list.add(words[i]);
            }
        }

        String[] array = list.toArray(new String[0]);
        return array;
    }
}
