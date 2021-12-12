package numeral.roman;

import java.util.HashMap;
import java.util.Map;

public class intToRomanNumeral {
    public static String numerals(int input){
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");
        return map.get(input);
    }

    public static StringBuilder breakDownInt(int input){
        int inputMod;
        StringBuilder finalNumeral = new StringBuilder();
        if(input >= 1000){
            if(input == 1000){
                finalNumeral.append(numerals(1000));
                input -= input;
            } else {
                inputMod = (input % 1000);
                input = (input - (input % 1000))/1000;
                for(int i = 0; i < input; i++){
                    finalNumeral.append(numerals(1000));
                }
                input = inputMod;
            }
        }

        if (input >= 500){
            if(input == 500){
                finalNumeral.append(numerals(500));
                input -= input;
            } else if (input >= 900){
                finalNumeral.append(numerals(100));
                finalNumeral.append(numerals(1000));
                input -= 900;
            } else {
                inputMod = (input % 500);
                input = (input - (input % 500))/500;
                for(int i = 0; i < input; i++) {
                    finalNumeral.append(numerals(500));
                }
                input = inputMod;
            }
        }

        if (input >= 100){
            if(input == 100){
                finalNumeral.append(numerals(100));
                input -= input;
            } else if (input >= 400){
                finalNumeral.append(numerals(100));
                finalNumeral.append(numerals(500));
                input -= 400;
            } else {
                inputMod = (input % 100);
                input = (input - (input % 100))/100;
                for(int i = 0; i < input; i++){
                    finalNumeral.append(numerals(100));
                }
                input = inputMod;
            }
        }

        if (input >= 50){
            if(input == 50){
                finalNumeral.append(numerals(50));
                input -= input;
            } else if (input >= 90){
                finalNumeral.append(numerals(10));
                finalNumeral.append(numerals(100));
                input -= 90;
            } else {
                inputMod = (input % 50);
                input = (input - (input % 50))/50;
                for(int i = 0; i < input; i++){
                    finalNumeral.append(numerals(50));
                }
                input = inputMod;
            }
        }

        if (input >= 10){
            if(input == 10){
                finalNumeral.append(numerals(10));
                input -= input;
            } else if (input >= 40){
                finalNumeral.append(numerals(10));
                finalNumeral.append(numerals(50));
                input -= 40;
            } else {
                inputMod = (input % 10);
                input = (input - (input % 10))/10;
                for(int i = 0; i < input; i++){
                    finalNumeral.append(numerals(10));
                }
                input = inputMod;
            }
        }

        if (input >= 5){
            if(input == 5){
                finalNumeral.append(numerals(5));
                input -= input;
            } else if (input >= 9){
                finalNumeral.append(numerals(1));
                finalNumeral.append(numerals(10));
                input -= 9;
            } else {
                finalNumeral.append(numerals(5));
                input -= 5;
            }
        }

        if (input >= 1){
            if(input == 1){
                finalNumeral.append(numerals(1));
            } else if (input >= 4){
                finalNumeral.append(numerals(1));
                finalNumeral.append(numerals(5));
                input -= 4;
            } else {
                for(int i = 0; i < input; i++){
                    finalNumeral.append(numerals(1));
                }
            }
        }
        System.out.println(finalNumeral);
        return finalNumeral;
    }

    public static void main(String[] args) {
        breakDownInt(6);
    }
}
