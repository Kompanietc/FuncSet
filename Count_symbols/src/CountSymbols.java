/**
 *  возвращает количество заданных символов в строке;
 */
public class CountSymbols {
    public static boolean isNull(String str){
        boolean flag = false;
        if(str != null)
            flag = true;
        return  flag;
    }
    /**
     *  функция, отвечающая за подсчет символов;
     */
    public  static int count(String str, char symbol) {
        int count = 0;
        if ((isNull(str))) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == symbol) {
                    count++;
                }
            }
        }
        return count;
    }
}