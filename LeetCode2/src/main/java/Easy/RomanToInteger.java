package Easy;

public class RomanToInteger {
    public static void main(String[] args) {
        String m = "MCMXCIV";
        System.out.println(romanToInt(m));


    }
    static int romanToInt(String s) {
        int year = 0;
        for(int i = 0; i < s.length(); i ++){
            switch (s.charAt(i)){
                case 'M': year += 1000;break;
                case 'D': year += 500;break;
                case 'C': {
                    if(i == s.length() - 1){
                        year += 100;
                        break;
                    }
                    if(s.charAt(i + 1) == 'D'){
                        year += 400;
                        i = i + 1;
                    }else if(s.charAt(i + 1) == 'M'){
                        year += 900;
                        i = i + 1;
                    }else{
                        year += 100;
                    }
                    break;
                }
                case 'X':{
                    if(i == s.length() - 1){
                        year += 10;
                        break;
                    }
                    if(s.charAt(i + 1) == 'C'){
                        year += 90;
                        i = i + 1;
                    }else if(s.charAt(i + 1) == 'L'){
                        year += 40;
                        i = i + 1;
                    }else{
                        year += 10;
                    }
                    break;
                }
                case 'L': year += 50;break;
                case 'V': year += 5;break;
                case 'I':{
                    if(i == s.length() - 1){
                        year += 1;
                        break;
                    }
                    if(s.charAt(i + 1) == 'V'){
                        year += 4;
                        i = i + 1;
                    }else if(s.charAt(i + 1) == 'X'){
                        year += 9;
                        i = i + 1;
                    }else{
                        year += 1;
                    }
                    break;
                }
            }

        }
        return year;
    }
}
