package L12;

/**
 * L12: URL
 * <p>
 * Написать функцию, которая вычленяет из URL адреса имя
 * сервера. Имеется в виду следующее. Для строки вида
 * http://SomeServerName/abcd/dfdf.htm?dfdf=dfdf
 * вычленить SomeServerName
 * • Строка может начинаться не обязательно с http, но и с https
 * или чего-то другого. Но :// есть всегда
 * • Учесть случай, когда после :// больше нет слэша:
 * • http://SomeServerName
 * • Использовать indexOf и substring
 */
public class URL {
    public static String getServerName(String url) {
        String startSubstring = "://";
        int startIndex = url.indexOf(startSubstring) + startSubstring.length();

        String endSubstring = "/";
        int endIndex = url.indexOf(endSubstring, startIndex);
        if (endIndex > -1) {
            return url.substring(startIndex, endIndex);

        }

        return url.substring(startIndex);
    }

    public static void main(String[] args) {
        System.out.println("Определение адреса сервера");
        String url1 = "http://SomeServerName/abcd/dfdf.htm?dfdf=dfdf";
        String url2 = "http://SomeServerName";

        System.out.println(getServerName(url1));
        System.out.println(getServerName(url2));
    }
}
