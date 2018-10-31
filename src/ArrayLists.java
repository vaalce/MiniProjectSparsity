import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

    public class ArrayLists {
        public static void main(String[] args) {

            String s = "2 1 1 0 0 1 1 1 0 0 0 1 0 0 0 1 0 0 1 0 0 1 1 1 1 1 0 1 0 2";
            System.out.println(string2int(s));
            System.out.print(int2string(string2int(s)));
            //int[] result = string2int(s);
        }

        public static ArrayList<Integer> string2int(String s) {

            ArrayList<Integer> result = new ArrayList<Integer>();
            // Splits each spaced integer into a String array.
            String[] integerStrings = s.split(" ");
            for (int i = 0; i < integerStrings.length; i++) {
                result.add(Integer.parseInt(integerStrings[i]));
            }
            return result;

        }

        public static String int2string (ArrayList<Integer> inp){

            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < inp.size(); i++) {
                sb.append(inp.get(i)) ;

                if(inp.size()==i-1){
                    break;
                }
                sb.append(" ");
            }
            return sb.toString();
        }

    }


