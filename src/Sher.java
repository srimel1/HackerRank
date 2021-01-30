import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sher {

    public static void main(String[] args) {
        String s = "abcdefghhgfedecbaa";
        String s1 = "aabbcd";
        String s2 = "abcdefghhgfedecba";
        String s3 = "aab";
        String s4 = "aabbcd";
        String s5 = "abcdefghhgfedecba";
        String s6 = "a";
        String s7 = "ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd";


        System.out.println(sherlock(s));
        System.out.println(sherlock(s1));
        System.out.println(sherlock(s2));
        System.out.println(sherlock(s3));
        System.out.println(sherlock(s4));
        System.out.println(sherlock(s5));
        System.out.println(sherlock(s6));
        System.out.println(sherlock(s7));


    }

    static String sherlock(String s) {
        System.out.println(s);
        String answer = "";
        int[] alpha = new int[26];
        List<Integer> list = new ArrayList<Integer>();
        int count = 0;

        //count frequency of letters and store in array
        for (int i = 0; i < s.length(); i++) {
            alpha[s.charAt(i) - 'a']++;
        }
        System.out.println(Arrays.toString(alpha));


        //remove all zero's that represent non-present characters in our string
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] != 0)
                list.add(alpha[i]);
        }

//        System.out.println(Arrays.toString(list.toArray()));

        List<Integer> newList = new ArrayList<Integer>();
        for (int i : list) {
            if (!newList.contains(i)) {
                newList.add(i);
            }
        }
//        System.out.println("newList: " + Arrays.toString(newList.toArray()));

        //count frequencies
        if (newList.size() > 2) {
            answer = "NO";
        } else if (newList.size() == 1) {
            answer = "YES";
        } else {

            int i = 0,  f1 = 0, f2 = 0, f1count = 0, f2count = 0;
            f1 = newList.get(0);
            f2 = newList.get(1);



            for (i = 0; i < list.size(); i++) {
                if (list.get(i) == f1) {
                    f1count++;
                }
                if (list.get(i) == f2) {
                    f2count++;
                }
            }

            if ((f1 == 1 && f1count == 1) || (f2 == 1 && f2count == 1)) {
                answer = "YES";
            }else if ((Math.abs(f1 - f2) == 1) && (f1count == 1 || f2count == 1)) {
                answer = "YES";
            } else {
                answer = "NO";
            }
        }
        return answer;

//
//        int diff = 0;
//
//        int sum = Arrays.stream(alpha).sum();
//
//            for (int i = 0; i < list.size() - 1; i++) {
//
//                diff = Math.abs(list.get(i) - list.get(i + 1));
//                if (diff > 0) {
//                    count += diff;
////                    if (i++ <= list.size()) break;
//                }
//                System.out.println(i + ": " + list.get(i) + ", " + list.get(i + 1) + " diff: " + diff + " sum: " + sum + " count: " + count);
//
//            }
//
//
//        if (count > 1)
//            answer = "NO";
//        else if (list.size() == 1) {
//            answer = "YES";
//        } else if (count == 1 && sum % 2 == 1) {
//            answer = "YES";
//        } else {
//            answer = "NO";
//        }
//
//
//        System.out.println(sum);
//        return answer;


    }

}

