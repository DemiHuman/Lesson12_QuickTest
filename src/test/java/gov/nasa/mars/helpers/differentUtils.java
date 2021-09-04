package gov.nasa.mars.helpers;

public class differentUtils {
    /**
     * Полуение года у статьи на странице новостей
     *
     * @param text на вход принимает строку вида "December 22, 2020"
     * @return возвращает год в формате "int"
     */
    public static int getYearFromString(String text) {
        String[] someText = text.split(", ");
        return Integer.parseInt(someText[1]);
    }
}
