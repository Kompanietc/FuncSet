import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *  возвращает количество заданных символов в строке;
 */
public class CountSymbols {
    
    /**
     *  функция, отвечающая за подсчет символов;
     */
    public  static int count(String str, char symbol) {
        int count = 0;
        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == symbol) {
                    count++;
                }
            }
        }

        return count;
    }
}
