import static org.junit.Assert.assertEquals;

/**
 * Created by Компаниец on 11.10.2015.
 */
public class SameElementsInArray {
    /**
     * функция проверки элементов строкового массива на совпадение
     */
    static boolean checkElements(String[] elem) {
        boolean isSame = false;
        for (int i = 0; i < elem.length; i++) {
            String testElem = elem[i];
            for(int j = i+1; j < elem.length; j++) {
                if (testElem.equals(elem[j])){
                    isSame = true;
                    break;
                }
            }
        }
        return isSame;
    }
}
