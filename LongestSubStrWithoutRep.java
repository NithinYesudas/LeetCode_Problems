public class LongestSubStrWithoutRep {
    public int lengthOfLongestSubstring(String s) {
        String result = "";
        int large = 0;
        
        for (int i = 0; i < s.length(); i++) {
            String temp = Character.toString(s.charAt(i));
            if(result.contains(temp)){
             result = result.concat(temp);
             result = result.replaceFirst(temp, "");
             i = s.indexOf(temp);
             
             result = "";
            }
            else{
                result = result.concat(temp);

            }
            if(i == s.length()-1){
                if(result.length()>large){
                    large = result.length();
                }
            }
       

        }
        System.out.println(result);
        return large;

    }

    public static void main(String[] args) {
        LongestSubStrWithoutRep obj = new LongestSubStrWithoutRep();

        System.out.println(obj.lengthOfLongestSubstring("dvdff"));

    }

}
